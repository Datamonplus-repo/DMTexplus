package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pteoftixfi extends GXProcedure
{
   public pteoftixfi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pteoftixfi.class ), "" );
   }

   public pteoftixfi( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 )
   {
      pteoftixfi.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 )
   {
      pteoftixfi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pteoftixfi.this.AV8ForNumCol = aP1[0];
      this.aP1 = aP1;
      pteoftixfi.this.AV12GrdTipArt = aP2[0];
      this.aP2 = aP2;
      pteoftixfi.this.AV10TIFI_T = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ForCan = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P05SN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8ForNumCol)});
      c481ForCan = P05SN2_A481ForCan[0] ;
      pr_default.close(0);
      AV9ForCan = AV9ForCan.add(c481ForCan) ;
      /* End optimized group. */
      AV10TIFI_T = (short)(0) ;
      AV11TIFI_F = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05SN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV12GrdTipArt)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4364GrdTipArt = P05SN3_A4364GrdTipArt[0] ;
         A5659Tifi_vf = P05SN3_A5659Tifi_vf[0] ;
         n5659Tifi_vf = P05SN3_n5659Tifi_vf[0] ;
         A5658Tifi_vi = P05SN3_A5658Tifi_vi[0] ;
         n5658Tifi_vi = P05SN3_n5658Tifi_vi[0] ;
         A5660Tifi_t = P05SN3_A5660Tifi_t[0] ;
         n5660Tifi_t = P05SN3_n5660Tifi_t[0] ;
         A5661Tifi_f = P05SN3_A5661Tifi_f[0] ;
         n5661Tifi_f = P05SN3_n5661Tifi_f[0] ;
         A5657Tifi_l = P05SN3_A5657Tifi_l[0] ;
         if ( ( DecimalUtil.compareTo(AV9ForCan, A5658Tifi_vi) >= 0 ) && ( DecimalUtil.compareTo(AV9ForCan, A5659Tifi_vf) <= 0 ) )
         {
            AV10TIFI_T = A5660Tifi_t ;
            AV11TIFI_F = A5661Tifi_f ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pteoftixfi.this.A396EmprCod;
      this.aP1[0] = pteoftixfi.this.AV8ForNumCol;
      this.aP2[0] = pteoftixfi.this.AV12GrdTipArt;
      this.aP3[0] = pteoftixfi.this.AV10TIFI_T;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ForCan = DecimalUtil.ZERO ;
      c481ForCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05SN2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV11TIFI_F = DecimalUtil.ZERO ;
      P05SN3_A396EmprCod = new String[] {""} ;
      P05SN3_A4364GrdTipArt = new short[1] ;
      P05SN3_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SN3_n5659Tifi_vf = new boolean[] {false} ;
      P05SN3_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SN3_n5658Tifi_vi = new boolean[] {false} ;
      P05SN3_A5660Tifi_t = new short[1] ;
      P05SN3_n5660Tifi_t = new boolean[] {false} ;
      P05SN3_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SN3_n5661Tifi_f = new boolean[] {false} ;
      P05SN3_A5657Tifi_l = new short[1] ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      A5658Tifi_vi = DecimalUtil.ZERO ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pteoftixfi__default(),
         new Object[] {
             new Object[] {
            P05SN2_A481ForCan
            }
            , new Object[] {
            P05SN3_A396EmprCod, P05SN3_A4364GrdTipArt, P05SN3_A5659Tifi_vf, P05SN3_n5659Tifi_vf, P05SN3_A5658Tifi_vi, P05SN3_n5658Tifi_vi, P05SN3_A5660Tifi_t, P05SN3_n5660Tifi_t, P05SN3_A5661Tifi_f, P05SN3_n5661Tifi_f,
            P05SN3_A5657Tifi_l
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12GrdTipArt ;
   private short AV10TIFI_T ;
   private short A4364GrdTipArt ;
   private short A5660Tifi_t ;
   private short A5657Tifi_l ;
   private short Gx_err ;
   private int AV8ForNumCol ;
   private java.math.BigDecimal AV9ForCan ;
   private java.math.BigDecimal c481ForCan ;
   private java.math.BigDecimal AV11TIFI_F ;
   private java.math.BigDecimal A5659Tifi_vf ;
   private java.math.BigDecimal A5658Tifi_vi ;
   private java.math.BigDecimal A5661Tifi_f ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5659Tifi_vf ;
   private boolean n5658Tifi_vi ;
   private boolean n5660Tifi_t ;
   private boolean n5661Tifi_f ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P05SN2_A481ForCan ;
   private String[] P05SN3_A396EmprCod ;
   private short[] P05SN3_A4364GrdTipArt ;
   private java.math.BigDecimal[] P05SN3_A5659Tifi_vf ;
   private boolean[] P05SN3_n5659Tifi_vf ;
   private java.math.BigDecimal[] P05SN3_A5658Tifi_vi ;
   private boolean[] P05SN3_n5658Tifi_vi ;
   private short[] P05SN3_A5660Tifi_t ;
   private boolean[] P05SN3_n5660Tifi_t ;
   private java.math.BigDecimal[] P05SN3_A5661Tifi_f ;
   private boolean[] P05SN3_n5661Tifi_f ;
   private short[] P05SN3_A5657Tifi_l ;
}

final  class pteoftixfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SN2", "SELECT SUM(ForCan) FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SN3", "SELECT EmprCod, GrdTipArt, Tifi_vf, Tifi_vi, Tifi_t, Tifi_f, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, Tifi_l ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

