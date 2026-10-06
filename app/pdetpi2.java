package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdetpi2 extends GXProcedure
{
   public pdetpi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdetpi2.class ), "" );
   }

   public pdetpi2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           String[] aP7 )
   {
      pdetpi2.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pdetpi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdetpi2.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pdetpi2.this.AV20AlbRecPie = aP2[0];
      this.aP2 = aP2;
      pdetpi2.this.AV15DisPieKgm = aP3[0];
      this.aP3 = aP3;
      pdetpi2.this.AV16DisPieMtr = aP4[0];
      this.aP4 = aP4;
      pdetpi2.this.AV17DisKgmOld = aP5[0];
      this.aP5 = aP5;
      pdetpi2.this.AV18DisMtrOld = aP6[0];
      this.aP6 = aP6;
      pdetpi2.this.Gx_mode = aP7[0];
      this.aP7 = aP7;
      pdetpi2.this.AV21OK = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21OK = (byte)(0) ;
      /* Using cursor P01FI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV20AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2159AlbRecPie = P01FI2_A2159AlbRecPie[0] ;
         A2156AlbRecKgmU = P01FI2_A2156AlbRecKgmU[0] ;
         A2158AlbRecMtrU = P01FI2_A2158AlbRecMtrU[0] ;
         A56AlbRUni = P01FI2_A56AlbRUni[0] ;
         A2155AlbRecKgm = P01FI2_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = P01FI2_A2157AlbRecMtr[0] ;
         A56AlbRUni = P01FI2_A56AlbRUni[0] ;
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
         {
            A2156AlbRecKgmU = A2156AlbRecKgmU.subtract(AV15DisPieKgm) ;
            A2158AlbRecMtrU = A2158AlbRecMtrU.subtract(AV16DisPieMtr) ;
            if ( A2156AlbRecKgmU.doubleValue() < 0 )
            {
               A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
            }
            if ( A2158AlbRecMtrU.doubleValue() < 0 )
            {
               A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
            }
         }
         else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( (A2155AlbRecKgm.subtract(A2156AlbRecKgmU).add(AV17DisKgmOld).subtract(AV15DisPieKgm)).doubleValue() < 0 )
               {
                  AV21OK = (byte)(1) ;
               }
            }
            else
            {
               if ( (A2157AlbRecMtr.subtract(A2158AlbRecMtrU).add(AV18DisMtrOld).subtract(AV16DisPieMtr)).doubleValue() < 0 )
               {
                  AV21OK = (byte)(1) ;
               }
            }
            if ( AV21OK == 0 )
            {
               A2156AlbRecKgmU = A2156AlbRecKgmU.add(AV15DisPieKgm).subtract(AV17DisKgmOld) ;
               A2158AlbRecMtrU = A2158AlbRecMtrU.add(AV16DisPieMtr).subtract(AV18DisMtrOld) ;
            }
         }
         else if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
         {
            AV21OK = (byte)(0) ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( (A2155AlbRecKgm.subtract(A2156AlbRecKgmU).add(AV17DisKgmOld).subtract(AV15DisPieKgm)).doubleValue() < 0 )
               {
                  AV21OK = (byte)(1) ;
               }
            }
            else
            {
               if ( (A2157AlbRecMtr.subtract(A2158AlbRecMtrU).add(AV18DisMtrOld).subtract(AV16DisPieMtr)).doubleValue() < 0 )
               {
                  AV21OK = (byte)(1) ;
               }
            }
            if ( AV21OK == 0 )
            {
               A2156AlbRecKgmU = A2156AlbRecKgmU.add(AV15DisPieKgm) ;
               A2158AlbRecMtrU = A2158AlbRecMtrU.add(AV16DisPieMtr) ;
            }
         }
         /* Using cursor P01FI3 */
         pr_default.execute(1, new Object[] {A2156AlbRecKgmU, A2158AlbRecMtrU, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01FI5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A52AlbRPieEnt = P01FI5_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P01FI5_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P01FI5_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P01FI5_A60AlbRUniUti[0] ;
         A47AlbREst = P01FI5_A47AlbREst[0] ;
         A48AlbRFecUlt = P01FI5_A48AlbRFecUlt[0] ;
         A2152AlbDetPie = P01FI5_A2152AlbDetPie[0] ;
         A2148AlbDetKgmU = P01FI5_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P01FI5_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P01FI5_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P01FI5_A2149AlbDetMtr[0] ;
         A56AlbRUni = P01FI5_A56AlbRUni[0] ;
         A2152AlbDetPie = P01FI5_A2152AlbDetPie[0] ;
         A2148AlbDetKgmU = P01FI5_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P01FI5_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P01FI5_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P01FI5_A2149AlbDetMtr[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
            }
         }
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         A52AlbRPieEnt = A2152AlbDetPie ;
         A54AlbRPieUti = A2153AlbDetPieU ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A58AlbRUniEnt = A2149AlbDetMtr ;
            A60AlbRUniUti = A2151AlbDetMtrU ;
            if ( A2150AlbDetMtrD.doubleValue() == 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
            else
            {
               A47AlbREst = (byte)(0) ;
            }
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            A60AlbRUniUti = A2148AlbDetKgmU ;
            if ( A2147AlbDetKgmD.doubleValue() == 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
            else
            {
               A47AlbREst = (byte)(0) ;
            }
         }
         A48AlbRFecUlt = GXutil.today( ) ;
         /* Using cursor P01FI6 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A58AlbRUniEnt, A60AlbRUniUti, Byte.valueOf(A47AlbREst), A48AlbRFecUlt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdetpi2.this.A396EmprCod;
      this.aP1[0] = pdetpi2.this.A44AlbRecCod;
      this.aP2[0] = pdetpi2.this.AV20AlbRecPie;
      this.aP3[0] = pdetpi2.this.AV15DisPieKgm;
      this.aP4[0] = pdetpi2.this.AV16DisPieMtr;
      this.aP5[0] = pdetpi2.this.AV17DisKgmOld;
      this.aP6[0] = pdetpi2.this.AV18DisMtrOld;
      this.aP7[0] = pdetpi2.this.Gx_mode;
      this.aP8[0] = pdetpi2.this.AV21OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor P01FI7 */
      pr_default.execute(4, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         Gx_cnt = P01FI7_Gx_cnt[0] ;
      }
      pr_default.close(4);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor P01FI8 */
      pr_default.execute(5, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         Gx_cnt = P01FI8_Gx_cnt[0] ;
      }
      pr_default.close(5);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P01FI2_A396EmprCod = new String[] {""} ;
      P01FI2_A44AlbRecCod = new int[1] ;
      P01FI2_A2159AlbRecPie = new String[] {""} ;
      P01FI2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI2_A56AlbRUni = new String[] {""} ;
      P01FI2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      P01FI5_A396EmprCod = new String[] {""} ;
      P01FI5_A44AlbRecCod = new int[1] ;
      P01FI5_A52AlbRPieEnt = new int[1] ;
      P01FI5_A54AlbRPieUti = new int[1] ;
      P01FI5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI5_A47AlbREst = new byte[1] ;
      P01FI5_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P01FI5_A2152AlbDetPie = new short[1] ;
      P01FI5_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI5_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI5_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI5_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FI5_A56AlbRUni = new String[] {""} ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      P01FI7_Gx_cnt = new int[1] ;
      P01FI8_Gx_cnt = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdetpi2__default(),
         new Object[] {
             new Object[] {
            P01FI2_A396EmprCod, P01FI2_A44AlbRecCod, P01FI2_A2159AlbRecPie, P01FI2_A2156AlbRecKgmU, P01FI2_A2158AlbRecMtrU, P01FI2_A56AlbRUni, P01FI2_A2155AlbRecKgm, P01FI2_A2157AlbRecMtr
            }
            , new Object[] {
            }
            , new Object[] {
            P01FI5_A396EmprCod, P01FI5_A44AlbRecCod, P01FI5_A52AlbRPieEnt, P01FI5_A54AlbRPieUti, P01FI5_A58AlbRUniEnt, P01FI5_A60AlbRUniUti, P01FI5_A47AlbREst, P01FI5_A48AlbRFecUlt, P01FI5_A2152AlbDetPie, P01FI5_A2148AlbDetKgmU,
            P01FI5_A2146AlbDetKgm, P01FI5_A2151AlbDetMtrU, P01FI5_A2149AlbDetMtr, P01FI5_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            P01FI7_Gx_cnt
            }
            , new Object[] {
            P01FI8_Gx_cnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21OK ;
   private byte A47AlbREst ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private java.math.BigDecimal AV15DisPieKgm ;
   private java.math.BigDecimal AV16DisPieMtr ;
   private java.math.BigDecimal AV17DisKgmOld ;
   private java.math.BigDecimal AV18DisMtrOld ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private String A396EmprCod ;
   private String AV20AlbRecPie ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A56AlbRUni ;
   private String E396EmprCod ;
   private java.util.Date A48AlbRFecUlt ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FI2_A396EmprCod ;
   private int[] P01FI2_A44AlbRecCod ;
   private String[] P01FI2_A2159AlbRecPie ;
   private java.math.BigDecimal[] P01FI2_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P01FI2_A2158AlbRecMtrU ;
   private String[] P01FI2_A56AlbRUni ;
   private java.math.BigDecimal[] P01FI2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P01FI2_A2157AlbRecMtr ;
   private String[] P01FI5_A396EmprCod ;
   private int[] P01FI5_A44AlbRecCod ;
   private int[] P01FI5_A52AlbRPieEnt ;
   private int[] P01FI5_A54AlbRPieUti ;
   private java.math.BigDecimal[] P01FI5_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P01FI5_A60AlbRUniUti ;
   private byte[] P01FI5_A47AlbREst ;
   private java.util.Date[] P01FI5_A48AlbRFecUlt ;
   private short[] P01FI5_A2152AlbDetPie ;
   private java.math.BigDecimal[] P01FI5_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P01FI5_A2146AlbDetKgm ;
   private java.math.BigDecimal[] P01FI5_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P01FI5_A2149AlbDetMtr ;
   private String[] P01FI5_A56AlbRUni ;
   private int[] P01FI7_Gx_cnt ;
   private int[] P01FI8_Gx_cnt ;
}

final  class pdetpi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FI2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlbRecKgmU, T1.AlbRecMtrU, T2.AlbRUni, T1.AlbRecKgm, T1.AlbRecMtr FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01FI3", "UPDATE TXPALBDET SET AlbRecKgmU=?, AlbRecMtrU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new ForEachCursor("P01FI5", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbREst, T1.AlbRFecUlt, COALESCE( T2.AlbDetPie, 0) AS AlbDetPie, COALESCE( T2.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T2.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T2.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T2.AlbDetMtr, 0) AS AlbDetMtr, T1.AlbRUni FROM (TXPALBREC T1 LEFT JOIN (SELECT COUNT(*) AS AlbDetPie, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01FI6", "UPDATE TXPALBREC SET AlbRPieEnt=?, AlbRPieUti=?, AlbRUniEnt=?, AlbRUniUti=?, AlbREst=?, AlbRFecUlt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P01FI7", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01FI8", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

