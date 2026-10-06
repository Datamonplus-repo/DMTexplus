package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdetpie extends GXProcedure
{
   public pdetpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdetpie.class ), "" );
   }

   public pdetpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pdetpie.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pdetpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdetpie.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pdetpie.this.AV20AlbRecPie = aP2[0];
      this.aP2 = aP2;
      pdetpie.this.AV15DisPieKgm = aP3[0];
      this.aP3 = aP3;
      pdetpie.this.AV16DisPieMtr = aP4[0];
      this.aP4 = aP4;
      pdetpie.this.AV17DisKgmOld = aP5[0];
      this.aP5 = aP5;
      pdetpie.this.AV18DisMtrOld = aP6[0];
      this.aP6 = aP6;
      pdetpie.this.Gx_mode = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00CL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV20AlbRecPie, A396EmprCod, Integer.valueOf(A44AlbRecCod), AV20AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2159AlbRecPie = P00CL2_A2159AlbRecPie[0] ;
         A2156AlbRecKgmU = P00CL2_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = P00CL2_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = P00CL2_A2158AlbRecMtrU[0] ;
         A2157AlbRecMtr = P00CL2_A2157AlbRecMtr[0] ;
         /* Using cursor P00CL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A56AlbRUni = P00CL3_A56AlbRUni[0] ;
         A54AlbRPieUti = P00CL3_A54AlbRPieUti[0] ;
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( DecimalUtil.compareTo(A2155AlbRecKgm, (A2156AlbRecKgmU.subtract(AV15DisPieKgm))) == 0 )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti-1) ;
               }
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A2155AlbRecKgm, (A2156AlbRecKgmU.subtract(AV15DisPieKgm))) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, (A2158AlbRecMtrU.subtract(AV16DisPieMtr))) == 0 ) )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti-1) ;
               }
            }
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
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( DecimalUtil.compareTo(A2155AlbRecKgm.add(AV15DisPieKgm).subtract(AV17DisKgmOld), A2156AlbRecKgmU) == 0 )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti+1) ;
               }
               if ( ( DecimalUtil.compareTo(A2155AlbRecKgm.add(AV15DisPieKgm).subtract(AV17DisKgmOld), A2156AlbRecKgmU) > 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2156AlbRecKgmU)==0) )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti-1) ;
               }
            }
            else
            {
               if ( ( DecimalUtil.compareTo(A2155AlbRecKgm.add(AV15DisPieKgm).subtract(AV17DisKgmOld), A2156AlbRecKgmU) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr.add(AV16DisPieMtr).subtract(AV18DisMtrOld), A2158AlbRecMtrU) == 0 ) )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti+1) ;
               }
               if ( ( DecimalUtil.compareTo(A2155AlbRecKgm.add(AV15DisPieKgm).subtract(AV17DisKgmOld), A2156AlbRecKgmU) > 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr.add(AV16DisPieMtr).subtract(AV18DisMtrOld), A2158AlbRecMtrU) > 0 ) )
               {
                  A54AlbRPieUti = (int)(A54AlbRPieUti-1) ;
               }
            }
            A2156AlbRecKgmU = A2156AlbRecKgmU.add(AV15DisPieKgm).subtract(AV17DisKgmOld) ;
            A2158AlbRecMtrU = A2158AlbRecMtrU.add(AV16DisPieMtr).subtract(AV18DisMtrOld) ;
            if ( A2156AlbRecKgmU.doubleValue() < 0 )
            {
               A2156AlbRecKgmU = DecimalUtil.doubleToDec(0) ;
            }
            if ( A2158AlbRecMtrU.doubleValue() < 0 )
            {
               A2158AlbRecMtrU = DecimalUtil.doubleToDec(0) ;
            }
         }
         /* Using cursor P00CL4 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A54AlbRPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Using cursor P00CL5 */
         pr_default.execute(3, new Object[] {A2156AlbRecKgmU, A2158AlbRecMtrU, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      /* Using cursor P00CL7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A58AlbRUniEnt = P00CL7_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P00CL7_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P00CL7_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P00CL7_A54AlbRPieUti[0] ;
         A2149AlbDetMtr = P00CL7_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = P00CL7_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P00CL7_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = P00CL7_A2148AlbDetKgmU[0] ;
         A2152AlbDetPie = P00CL7_A2152AlbDetPie[0] ;
         A56AlbRUni = P00CL7_A56AlbRUni[0] ;
         A2149AlbDetMtr = P00CL7_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = P00CL7_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P00CL7_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = P00CL7_A2148AlbDetKgmU[0] ;
         A2152AlbDetPie = P00CL7_A2152AlbDetPie[0] ;
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
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A58AlbRUniEnt = A2149AlbDetMtr ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A60AlbRUniUti = A2151AlbDetMtrU ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
         }
         A52AlbRPieEnt = A2152AlbDetPie ;
         A54AlbRPieUti = A2153AlbDetPieU ;
         /* Using cursor P00CL8 */
         pr_default.execute(5, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Using cursor P00CL10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A56AlbRUni = P00CL10_A56AlbRUni[0] ;
         A47AlbREst = P00CL10_A47AlbREst[0] ;
         A2151AlbDetMtrU = P00CL10_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P00CL10_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P00CL10_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P00CL10_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = P00CL10_A2151AlbDetMtrU[0] ;
         A2149AlbDetMtr = P00CL10_A2149AlbDetMtr[0] ;
         A2148AlbDetKgmU = P00CL10_A2148AlbDetKgmU[0] ;
         A2146AlbDetKgm = P00CL10_A2146AlbDetKgm[0] ;
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
         if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
         /* Using cursor P00CL11 */
         pr_default.execute(7, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdetpie.this.A396EmprCod;
      this.aP1[0] = pdetpie.this.A44AlbRecCod;
      this.aP2[0] = pdetpie.this.AV20AlbRecPie;
      this.aP3[0] = pdetpie.this.AV15DisPieKgm;
      this.aP4[0] = pdetpie.this.AV16DisPieMtr;
      this.aP5[0] = pdetpie.this.AV17DisKgmOld;
      this.aP6[0] = pdetpie.this.AV18DisMtrOld;
      this.aP7[0] = pdetpie.this.Gx_mode;
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
      /* Using cursor P00CL12 */
      pr_default.execute(8, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         Gx_cnt = P00CL12_Gx_cnt[0] ;
      }
      pr_default.close(8);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor P00CL13 */
      pr_default.execute(9, new Object[] {E396EmprCod, Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         Gx_cnt = P00CL13_Gx_cnt[0] ;
      }
      pr_default.close(9);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P00CL2_A396EmprCod = new String[] {""} ;
      P00CL2_A44AlbRecCod = new int[1] ;
      P00CL2_A2159AlbRecPie = new String[] {""} ;
      P00CL2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      P00CL3_A56AlbRUni = new String[] {""} ;
      P00CL3_A54AlbRPieUti = new int[1] ;
      A56AlbRUni = "" ;
      P00CL7_A396EmprCod = new String[] {""} ;
      P00CL7_A44AlbRecCod = new int[1] ;
      P00CL7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL7_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL7_A52AlbRPieEnt = new int[1] ;
      P00CL7_A54AlbRPieUti = new int[1] ;
      P00CL7_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL7_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL7_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL7_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL7_A2152AlbDetPie = new short[1] ;
      P00CL7_A56AlbRUni = new String[] {""} ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      P00CL10_A396EmprCod = new String[] {""} ;
      P00CL10_A44AlbRecCod = new int[1] ;
      P00CL10_A56AlbRUni = new String[] {""} ;
      P00CL10_A47AlbREst = new byte[1] ;
      P00CL10_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL10_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL10_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CL10_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      P00CL12_Gx_cnt = new int[1] ;
      P00CL13_Gx_cnt = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdetpie__default(),
         new Object[] {
             new Object[] {
            P00CL2_A396EmprCod, P00CL2_A44AlbRecCod, P00CL2_A2159AlbRecPie, P00CL2_A2156AlbRecKgmU, P00CL2_A2155AlbRecKgm, P00CL2_A2158AlbRecMtrU, P00CL2_A2157AlbRecMtr
            }
            , new Object[] {
            P00CL3_A56AlbRUni, P00CL3_A54AlbRPieUti
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00CL7_A396EmprCod, P00CL7_A44AlbRecCod, P00CL7_A58AlbRUniEnt, P00CL7_A60AlbRUniUti, P00CL7_A52AlbRPieEnt, P00CL7_A54AlbRPieUti, P00CL7_A2149AlbDetMtr, P00CL7_A2146AlbDetKgm, P00CL7_A2151AlbDetMtrU, P00CL7_A2148AlbDetKgmU,
            P00CL7_A2152AlbDetPie, P00CL7_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            P00CL10_A396EmprCod, P00CL10_A44AlbRecCod, P00CL10_A56AlbRUni, P00CL10_A47AlbREst, P00CL10_A2151AlbDetMtrU, P00CL10_A2149AlbDetMtr, P00CL10_A2148AlbDetKgmU, P00CL10_A2146AlbDetKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P00CL12_Gx_cnt
            }
            , new Object[] {
            P00CL13_Gx_cnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private java.math.BigDecimal AV15DisPieKgm ;
   private java.math.BigDecimal AV16DisPieMtr ;
   private java.math.BigDecimal AV17DisKgmOld ;
   private java.math.BigDecimal AV18DisMtrOld ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private String A396EmprCod ;
   private String AV20AlbRecPie ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A56AlbRUni ;
   private String E396EmprCod ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CL2_A396EmprCod ;
   private int[] P00CL2_A44AlbRecCod ;
   private String[] P00CL2_A2159AlbRecPie ;
   private java.math.BigDecimal[] P00CL2_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P00CL2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P00CL2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P00CL2_A2157AlbRecMtr ;
   private String[] P00CL3_A56AlbRUni ;
   private int[] P00CL3_A54AlbRPieUti ;
   private String[] P00CL7_A396EmprCod ;
   private int[] P00CL7_A44AlbRecCod ;
   private java.math.BigDecimal[] P00CL7_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P00CL7_A60AlbRUniUti ;
   private int[] P00CL7_A52AlbRPieEnt ;
   private int[] P00CL7_A54AlbRPieUti ;
   private java.math.BigDecimal[] P00CL7_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P00CL7_A2146AlbDetKgm ;
   private java.math.BigDecimal[] P00CL7_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P00CL7_A2148AlbDetKgmU ;
   private short[] P00CL7_A2152AlbDetPie ;
   private String[] P00CL7_A56AlbRUni ;
   private String[] P00CL10_A396EmprCod ;
   private int[] P00CL10_A44AlbRecCod ;
   private String[] P00CL10_A56AlbRUni ;
   private byte[] P00CL10_A47AlbREst ;
   private java.math.BigDecimal[] P00CL10_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P00CL10_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P00CL10_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P00CL10_A2146AlbDetKgm ;
   private int[] P00CL12_Gx_cnt ;
   private int[] P00CL13_Gx_cnt ;
}

final  class pdetpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CL2", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgmU, AlbRecKgm, AlbRecMtrU, AlbRecMtr FROM TXPALBDET WHERE (EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) AND (EmprCod = ? and AlbRecCod = ? and AlbRecPie = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CL3", "SELECT AlbRUni, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CL4", "UPDATE TXPALBREC SET AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P00CL5", "UPDATE TXPALBDET SET AlbRecKgmU=?, AlbRecMtrU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new ForEachCursor("P00CL7", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt, T1.AlbRPieUti, COALESCE( T2.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T2.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T2.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T2.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T2.AlbDetPie, 0) AS AlbDetPie, T1.AlbRUni FROM (TXPALBREC T1 LEFT JOIN (SELECT SUM(AlbRecMtr) AS AlbDetMtr, EmprCod, AlbRecCod, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, COUNT(*) AS AlbDetPie FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CL8", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P00CL10", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRUni, T1.AlbREst, COALESCE( T2.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T2.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T2.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T2.AlbDetKgm, 0) AS AlbDetKgm FROM (TXPALBREC T1 LEFT JOIN (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00CL11", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P00CL12", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CL13", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 9 :
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
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

