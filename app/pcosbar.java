package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcosbar extends GXProcedure
{
   public pcosbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcosbar.class ), "" );
   }

   public pcosbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pcosbar.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pcosbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcosbar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcosbar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcosbar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcosbar.this.AV15BarCosPro = aP4[0];
      this.aP4 = aP4;
      pcosbar.this.AV16BarCosAny = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P009H2 */
      pr_default.execute(0, new Object[] {AV16BarCosAny, AV15BarCosPro, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcosbar.this.A396EmprCod;
      this.aP1[0] = pcosbar.this.A129BarCod;
      this.aP2[0] = pcosbar.this.A132BarCodReo;
      this.aP3[0] = pcosbar.this.A130BarCodPar;
      this.aP4[0] = pcosbar.this.AV15BarCosPro;
      this.aP5[0] = pcosbar.this.AV16BarCosAny;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcosbar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcosbar__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15BarCosPro ;
   private java.math.BigDecimal AV16BarCosAny ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pcosbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P009H2", "UPDATE TXPBARCAD SET BarCosAny=?, BarCosPro=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

