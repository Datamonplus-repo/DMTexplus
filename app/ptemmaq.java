package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptemmaq extends GXProcedure
{
   public ptemmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptemmaq.class ), "" );
   }

   public ptemmaq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           short[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           byte[] aP8 )
   {
      ptemmaq.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      ptemmaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptemmaq.this.A9611Lb_Hdr = aP1[0];
      this.aP1 = aP1;
      ptemmaq.this.A9612Lb_Hdrr = aP2[0];
      this.aP2 = aP2;
      ptemmaq.this.A9613Lb_Hdrp = aP3[0];
      this.aP3 = aP3;
      ptemmaq.this.AV17Sedo1 = aP4[0];
      this.aP4 = aP4;
      ptemmaq.this.AV18Sedo2 = aP5[0];
      this.aP5 = aP5;
      ptemmaq.this.AV19Sedo3 = aP6[0];
      this.aP6 = aP6;
      ptemmaq.this.AV20Sedo4 = aP7[0];
      this.aP7 = aP7;
      ptemmaq.this.AV21Sedo5 = aP8[0];
      this.aP8 = aP8;
      ptemmaq.this.AV22Sedo6 = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n10110Sedo6 = false ;
      n10109Sedo5 = false ;
      n10108Sedo4 = false ;
      n10107Sedo3 = false ;
      n10106Sedo2 = false ;
      n10105Sedo1 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00512 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n10110Sedo6), Byte.valueOf(AV22Sedo6), Boolean.valueOf(n10109Sedo5), Byte.valueOf(AV21Sedo5), Boolean.valueOf(n10108Sedo4), AV20Sedo4, Boolean.valueOf(n10107Sedo3), Short.valueOf(AV19Sedo3), Boolean.valueOf(n10106Sedo2), AV18Sedo2, Boolean.valueOf(n10105Sedo1), AV17Sedo1, A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptemmaq.this.A396EmprCod;
      this.aP1[0] = ptemmaq.this.A9611Lb_Hdr;
      this.aP2[0] = ptemmaq.this.A9612Lb_Hdrr;
      this.aP3[0] = ptemmaq.this.A9613Lb_Hdrp;
      this.aP4[0] = ptemmaq.this.AV17Sedo1;
      this.aP5[0] = ptemmaq.this.AV18Sedo2;
      this.aP6[0] = ptemmaq.this.AV19Sedo3;
      this.aP7[0] = ptemmaq.this.AV20Sedo4;
      this.aP8[0] = ptemmaq.this.AV21Sedo5;
      this.aP9[0] = ptemmaq.this.AV22Sedo6;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptemmaq");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A10108Sedo4 = DecimalUtil.ZERO ;
      A10106Sedo2 = DecimalUtil.ZERO ;
      A10105Sedo1 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptemmaq__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A9612Lb_Hdrr ;
   private byte AV21Sedo5 ;
   private byte AV22Sedo6 ;
   private byte A10110Sedo6 ;
   private byte A10109Sedo5 ;
   private short AV19Sedo3 ;
   private short A10107Sedo3 ;
   private short Gx_err ;
   private int A9611Lb_Hdr ;
   private java.math.BigDecimal AV17Sedo1 ;
   private java.math.BigDecimal AV18Sedo2 ;
   private java.math.BigDecimal AV20Sedo4 ;
   private java.math.BigDecimal A10108Sedo4 ;
   private java.math.BigDecimal A10106Sedo2 ;
   private java.math.BigDecimal A10105Sedo1 ;
   private String A396EmprCod ;
   private String A9613Lb_Hdrp ;
   private boolean n10110Sedo6 ;
   private boolean n10109Sedo5 ;
   private boolean n10108Sedo4 ;
   private boolean n10107Sedo3 ;
   private boolean n10106Sedo2 ;
   private boolean n10105Sedo1 ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
}

final  class ptemmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00512", "UPDATE TXPHDRINO SET Sedo6=?, Sedo5=?, Sedo4=?, Sedo3=?, Sedo2=?, Sedo1=?  WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRINO")
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 1);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setByte(9, ((Number) parms[14]).byteValue());
               stmt.setString(10, (String)parms[15], 1);
               return;
      }
   }

}

