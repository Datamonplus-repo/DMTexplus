package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelpie extends GXProcedure
{
   public pdelpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelpie.class ), "" );
   }

   public pdelpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      pdelpie.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pdelpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelpie.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdelpie.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdelpie.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdelpie.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pdelpie.this.AV15Kilos = aP5[0];
      this.aP5 = aP5;
      pdelpie.this.AV16Metros = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P005Q2 */
      pr_default.execute(0, new Object[] {AV16Metros, AV15Kilos, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelpie.this.A396EmprCod;
      this.aP1[0] = pdelpie.this.A129BarCod;
      this.aP2[0] = pdelpie.this.A132BarCodReo;
      this.aP3[0] = pdelpie.this.A130BarCodPar;
      this.aP4[0] = pdelpie.this.A200BarPieCod;
      this.aP5[0] = pdelpie.this.AV15Kilos;
      this.aP6[0] = pdelpie.this.AV16Metros;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelpie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelpie__default(),
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
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pdelpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P005Q2", "UPDATE TXPBARPIE SET BarPieMet=BarPieMet + ?, BarPieKil=BarPieKil + ?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

