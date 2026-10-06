package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp028 extends GXProcedure
{
   public pdyrp028( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp028.class ), "" );
   }

   public pdyrp028( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 )
   {
      pdyrp028.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pdyrp028.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp028.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp028.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp028.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp028.this.AV9MacProCod = aP4[0];
      this.aP4 = aP4;
      pdyrp028.this.AV21Barfacabs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n5057BarFacAbs = false ;
      /* Optimized UPDATE. */
      /* Using cursor P099L2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5057BarFacAbs), AV21Barfacabs, AV9MacProCod, A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp028.this.A396EmprCod;
      this.aP1[0] = pdyrp028.this.AV15BarCod;
      this.aP2[0] = pdyrp028.this.AV16BarCodReo;
      this.aP3[0] = pdyrp028.this.AV17BarCodPar;
      this.aP4[0] = pdyrp028.this.AV9MacProCod;
      this.aP5[0] = pdyrp028.this.AV21Barfacabs;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp028");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5057BarFacAbs = DecimalUtil.ZERO ;
      A4908BarMacPro = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp028__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private short Gx_err ;
   private int AV15BarCod ;
   private java.math.BigDecimal AV21Barfacabs ;
   private java.math.BigDecimal A5057BarFacAbs ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV9MacProCod ;
   private String A4908BarMacPro ;
   private boolean n5057BarFacAbs ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pdyrp028__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P099L2", "UPDATE TXPBARCAD SET BarFacAbs=?, BarMacPro=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
      }
   }

}

