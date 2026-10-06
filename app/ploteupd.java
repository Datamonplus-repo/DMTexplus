package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ploteupd extends GXProcedure
{
   public ploteupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ploteupd.class ), "" );
   }

   public ploteupd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      ploteupd.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      ploteupd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ploteupd.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ploteupd.this.A597LinEnt = aP2[0];
      this.aP2 = aP2;
      ploteupd.this.AV12EntLotN = aP3[0];
      this.aP3 = aP3;
      ploteupd.this.AV13Albaran = aP4[0];
      this.aP4 = aP4;
      ploteupd.this.AV15usurcod = aP5[0];
      this.aP5 = aP5;
      ploteupd.this.AV16station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05M22 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P05M22_A718PrdNom[0] ;
         A11Albaran = P05M22_A11Albaran[0] ;
         A12857EntNAlbar = P05M22_A12857EntNAlbar[0] ;
         A5686EntLotN = P05M22_A5686EntLotN[0] ;
         A417EntPre = P05M22_A417EntPre[0] ;
         A415EntFecEnt = P05M22_A415EntFecEnt[0] ;
         A718PrdNom = P05M22_A718PrdNom[0] ;
         AV17Inc_obs = httpContext.getMessage( "ENTALM.UPD.Producto ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
         AV17Inc_obs += ((GXutil.strcmp(A12857EntNAlbar, "")!=0) ? httpContext.getMessage( "Documento ", "")+GXutil.trim( A12857EntNAlbar)+httpContext.getMessage( " por ", "")+AV13Albaran+GXutil.newLine( ) : httpContext.getMessage( "Documento ", "")+GXutil.trim( A11Albaran)+httpContext.getMessage( " por ", "")+AV13Albaran+GXutil.newLine( )) ;
         AV17Inc_obs += httpContext.getMessage( "Lote ", "") + GXutil.trim( A5686EntLotN) + httpContext.getMessage( " por ", "") + AV12EntLotN + GXutil.newLine( ) ;
         A5686EntLotN = AV12EntLotN ;
         A11Albaran = GXutil.substring( AV13Albaran, 1, 10) ;
         A12857EntNAlbar = AV13Albaran ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int3[0] = A597LinEnt ;
         GXv_decimal4[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int8[0] = (byte)(0) ;
         GXv_char9[0] = GXutil.substring( AV13Albaran, 1, 10) ;
         GXv_decimal10[0] = A417EntPre ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_char12[0] = AV13Albaran ;
         GXv_char13[0] = AV12EntLotN ;
         new app.pccstk21(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_char9, GXv_decimal10, GXv_date11, GXv_char12, GXv_char13) ;
         ploteupd.this.A396EmprCod = GXv_char1[0] ;
         ploteupd.this.A719PrdNum = GXv_char2[0] ;
         ploteupd.this.A597LinEnt = GXv_int3[0] ;
         ploteupd.this.A417EntPre = GXv_decimal10[0] ;
         ploteupd.this.A415EntFecEnt = GXv_date11[0] ;
         ploteupd.this.AV13Albaran = GXv_char12[0] ;
         ploteupd.this.AV12EntLotN = GXv_char13[0] ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV21Pgmname, AV15usurcod, AV16station, AV17Inc_obs, 99999999, (byte)(0), "") ;
         /* Using cursor P05M23 */
         pr_default.execute(1, new Object[] {A11Albaran, A12857EntNAlbar, A5686EntLotN, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ploteupd.this.A396EmprCod;
      this.aP1[0] = ploteupd.this.A719PrdNum;
      this.aP2[0] = ploteupd.this.A597LinEnt;
      this.aP3[0] = ploteupd.this.AV12EntLotN;
      this.aP4[0] = ploteupd.this.AV13Albaran;
      this.aP5[0] = ploteupd.this.AV15usurcod;
      this.aP6[0] = ploteupd.this.AV16station;
      Application.commitDataStores(context, remoteHandle, pr_default, "ploteupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05M22_A396EmprCod = new String[] {""} ;
      P05M22_A719PrdNum = new String[] {""} ;
      P05M22_A597LinEnt = new short[1] ;
      P05M22_A718PrdNom = new String[] {""} ;
      P05M22_A11Albaran = new String[] {""} ;
      P05M22_A12857EntNAlbar = new String[] {""} ;
      P05M22_A5686EntLotN = new String[] {""} ;
      P05M22_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M22_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A718PrdNom = "" ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A5686EntLotN = "" ;
      A417EntPre = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      AV17Inc_obs = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      AV21Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ploteupd__default(),
         new Object[] {
             new Object[] {
            P05M22_A396EmprCod, P05M22_A719PrdNum, P05M22_A597LinEnt, P05M22_A718PrdNom, P05M22_A11Albaran, P05M22_A12857EntNAlbar, P05M22_A5686EntLotN, P05M22_A417EntPre, P05M22_A415EntFecEnt
            }
            , new Object[] {
            }
         }
      );
      AV21Pgmname = "PLoteUPD" ;
      /* GeneXus formulas. */
      AV21Pgmname = "PLoteUPD" ;
      Gx_err = (short)(0) ;
   }

   private byte GXv_int8[] ;
   private short A597LinEnt ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV12EntLotN ;
   private String AV13Albaran ;
   private String AV15usurcod ;
   private String AV16station ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A11Albaran ;
   private String A12857EntNAlbar ;
   private String A5686EntLotN ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String AV21Pgmname ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date GXv_date11[] ;
   private String AV17Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05M22_A396EmprCod ;
   private String[] P05M22_A719PrdNum ;
   private short[] P05M22_A597LinEnt ;
   private String[] P05M22_A718PrdNom ;
   private String[] P05M22_A11Albaran ;
   private String[] P05M22_A12857EntNAlbar ;
   private String[] P05M22_A5686EntLotN ;
   private java.math.BigDecimal[] P05M22_A417EntPre ;
   private java.util.Date[] P05M22_A415EntFecEnt ;
}

final  class ploteupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05M22", "SELECT T1.EmprCod, T1.PrdNum, T1.LinEnt, T2.PrdNom, T1.Albaran, T1.EntNAlbar, T1.EntLotN, T1.EntPre, T1.EntFecEnt FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.LinEnt = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.LinEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05M23", "UPDATE TXPENTALM SET Albaran=?, EntNAlbar=?, EntLotN=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

