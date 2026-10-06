package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_datostixfi extends GXProcedure
{
   public get_datostixfi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_datostixfi.class ), "" );
   }

   public get_datostixfi( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           short aP1 ,
                                           short aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           short[] aP5 )
   {
      get_datostixfi.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      get_datostixfi.this.A396EmprCod = aP0;
      get_datostixfi.this.A4364GrdTipArt = aP1;
      get_datostixfi.this.AV8Tifi_l = aP2;
      get_datostixfi.this.aP3 = aP3;
      get_datostixfi.this.aP4 = aP4;
      get_datostixfi.this.aP5 = aP5;
      get_datostixfi.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Tifi_f = DecimalUtil.ZERO ;
      AV11Tifi_t = (short)(0) ;
      AV10Tifi_vf = DecimalUtil.ZERO ;
      AV9Tifi_vi = DecimalUtil.ZERO ;
      /* Using cursor P0AM72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(AV8Tifi_l)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5657Tifi_l = P0AM72_A5657Tifi_l[0] ;
         A5661Tifi_f = P0AM72_A5661Tifi_f[0] ;
         n5661Tifi_f = P0AM72_n5661Tifi_f[0] ;
         A5660Tifi_t = P0AM72_A5660Tifi_t[0] ;
         n5660Tifi_t = P0AM72_n5660Tifi_t[0] ;
         A5659Tifi_vf = P0AM72_A5659Tifi_vf[0] ;
         n5659Tifi_vf = P0AM72_n5659Tifi_vf[0] ;
         A5658Tifi_vi = P0AM72_A5658Tifi_vi[0] ;
         n5658Tifi_vi = P0AM72_n5658Tifi_vi[0] ;
         AV12Tifi_f = A5661Tifi_f ;
         AV11Tifi_t = A5660Tifi_t ;
         AV10Tifi_vf = A5659Tifi_vf ;
         AV9Tifi_vi = A5658Tifi_vi ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = get_datostixfi.this.AV9Tifi_vi;
      this.aP4[0] = get_datostixfi.this.AV10Tifi_vf;
      this.aP5[0] = get_datostixfi.this.AV11Tifi_t;
      this.aP6[0] = get_datostixfi.this.AV12Tifi_f;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Tifi_vi = DecimalUtil.ZERO ;
      AV10Tifi_vf = DecimalUtil.ZERO ;
      AV12Tifi_f = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AM72_A396EmprCod = new String[] {""} ;
      P0AM72_A4364GrdTipArt = new short[1] ;
      P0AM72_A5657Tifi_l = new short[1] ;
      P0AM72_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM72_n5661Tifi_f = new boolean[] {false} ;
      P0AM72_A5660Tifi_t = new short[1] ;
      P0AM72_n5660Tifi_t = new boolean[] {false} ;
      P0AM72_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM72_n5659Tifi_vf = new boolean[] {false} ;
      P0AM72_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM72_n5658Tifi_vi = new boolean[] {false} ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      A5658Tifi_vi = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.get_datostixfi__default(),
         new Object[] {
             new Object[] {
            P0AM72_A396EmprCod, P0AM72_A4364GrdTipArt, P0AM72_A5657Tifi_l, P0AM72_A5661Tifi_f, P0AM72_n5661Tifi_f, P0AM72_A5660Tifi_t, P0AM72_n5660Tifi_t, P0AM72_A5659Tifi_vf, P0AM72_n5659Tifi_vf, P0AM72_A5658Tifi_vi,
            P0AM72_n5658Tifi_vi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short AV8Tifi_l ;
   private short AV11Tifi_t ;
   private short A5657Tifi_l ;
   private short A5660Tifi_t ;
   private short Gx_err ;
   private java.math.BigDecimal AV9Tifi_vi ;
   private java.math.BigDecimal AV10Tifi_vf ;
   private java.math.BigDecimal AV12Tifi_f ;
   private java.math.BigDecimal A5661Tifi_f ;
   private java.math.BigDecimal A5659Tifi_vf ;
   private java.math.BigDecimal A5658Tifi_vi ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5661Tifi_f ;
   private boolean n5660Tifi_t ;
   private boolean n5659Tifi_vf ;
   private boolean n5658Tifi_vi ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AM72_A396EmprCod ;
   private short[] P0AM72_A4364GrdTipArt ;
   private short[] P0AM72_A5657Tifi_l ;
   private java.math.BigDecimal[] P0AM72_A5661Tifi_f ;
   private boolean[] P0AM72_n5661Tifi_f ;
   private short[] P0AM72_A5660Tifi_t ;
   private boolean[] P0AM72_n5660Tifi_t ;
   private java.math.BigDecimal[] P0AM72_A5659Tifi_vf ;
   private boolean[] P0AM72_n5659Tifi_vf ;
   private java.math.BigDecimal[] P0AM72_A5658Tifi_vi ;
   private boolean[] P0AM72_n5658Tifi_vi ;
}

final  class get_datostixfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AM72", "SELECT EmprCod, GrdTipArt, Tifi_l, Tifi_f, Tifi_t, Tifi_vf, Tifi_vi FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? and Tifi_l = ? ORDER BY EmprCod, GrdTipArt, Tifi_l ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

