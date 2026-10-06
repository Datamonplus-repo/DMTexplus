package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupmvpd extends GXProcedure
{
   public pupmvpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupmvpd.class ), "" );
   }

   public pupmvpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             java.util.Date[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pupmvpd.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        java.util.Date[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             java.util.Date[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      pupmvpd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pupmvpd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pupmvpd.this.AV17RpExPdTip = aP2[0];
      this.aP2 = aP2;
      pupmvpd.this.AV18RpExPdAlb = aP3[0];
      this.aP3 = aP3;
      pupmvpd.this.AV19RpExPdLi = aP4[0];
      this.aP4 = aP4;
      pupmvpd.this.AV20KgsOld = aP5[0];
      this.aP5 = aP5;
      pupmvpd.this.AV21ConosOld = aP6[0];
      this.aP6 = aP6;
      pupmvpd.this.AV22Kgs = aP7[0];
      this.aP7 = aP7;
      pupmvpd.this.AV23Conos = aP8[0];
      this.aP8 = aP8;
      pupmvpd.this.AV24RpExPdFe = aP9[0];
      this.aP9 = aP9;
      pupmvpd.this.AV25RpExPdCo = aP10[0];
      this.aP10 = aP10;
      pupmvpd.this.AV26RpExPdCli = aP11[0];
      this.aP11 = aP11;
      pupmvpd.this.AV27RpExPdLoc = aP12[0];
      this.aP12 = aP12;
      pupmvpd.this.AV17RpExPdTip = aP13[0];
      this.aP13 = aP13;
      pupmvpd.this.AV28RpExPdRes = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00E02 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV25RpExPdCo, Integer.valueOf(AV26RpExPdCli), Integer.valueOf(AV18RpExPdAlb), AV27RpExPdLoc});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2360ExtPdoLoc = P00E02_A2360ExtPdoLoc[0] ;
         n2360ExtPdoLoc = P00E02_n2360ExtPdoLoc[0] ;
         A252CliCod = P00E02_A252CliCod[0] ;
         n252CliCod = P00E02_n252CliCod[0] ;
         A966PartCod = P00E02_A966PartCod[0] ;
         n966PartCod = P00E02_n966PartCod[0] ;
         A2333ExtPdoAlb = P00E02_A2333ExtPdoAlb[0] ;
         A396EmprCod = P00E02_A396EmprCod[0] ;
         A457FasCod = P00E02_A457FasCod[0] ;
         n457FasCod = P00E02_n457FasCod[0] ;
         A2340ExtPdoKgR = P00E02_A2340ExtPdoKgR[0] ;
         n2340ExtPdoKgR = P00E02_n2340ExtPdoKgR[0] ;
         A2341ExtPdoCnR = P00E02_A2341ExtPdoCnR[0] ;
         n2341ExtPdoCnR = P00E02_n2341ExtPdoCnR[0] ;
         A2342ExtPdoKTR = P00E02_A2342ExtPdoKTR[0] ;
         n2342ExtPdoKTR = P00E02_n2342ExtPdoKTR[0] ;
         A2343ExtPdoCTR = P00E02_A2343ExtPdoCTR[0] ;
         n2343ExtPdoCTR = P00E02_n2343ExtPdoCTR[0] ;
         A2344ExtPdoFeR = P00E02_A2344ExtPdoFeR[0] ;
         n2344ExtPdoFeR = P00E02_n2344ExtPdoFeR[0] ;
         A2335ExtPdoEst = P00E02_A2335ExtPdoEst[0] ;
         n2335ExtPdoEst = P00E02_n2335ExtPdoEst[0] ;
         A2363ExtPdoEnt = P00E02_A2363ExtPdoEnt[0] ;
         n2363ExtPdoEnt = P00E02_n2363ExtPdoEnt[0] ;
         A2362ExtPdoRes = P00E02_A2362ExtPdoRes[0] ;
         n2362ExtPdoRes = P00E02_n2362ExtPdoRes[0] ;
         A2790ExtPdoLin = P00E02_A2790ExtPdoLin[0] ;
         AV31FasCod = A457FasCod ;
         if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "N", "")) == 0 ) )
         {
            A2340ExtPdoKgR = A2340ExtPdoKgR.subtract(AV20KgsOld).add(AV22Kgs) ;
            n2340ExtPdoKgR = false ;
            A2341ExtPdoCnR = (int)(A2341ExtPdoCnR-AV21ConosOld+AV23Conos) ;
            n2341ExtPdoCnR = false ;
         }
         if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "S", "")) == 0 ) )
         {
            A2340ExtPdoKgR = A2340ExtPdoKgR.subtract(AV20KgsOld) ;
            n2340ExtPdoKgR = false ;
            A2341ExtPdoCnR = (int)(A2341ExtPdoCnR-AV21ConosOld) ;
            n2341ExtPdoCnR = false ;
            A2342ExtPdoKTR = A2342ExtPdoKTR.add(AV22Kgs) ;
            n2342ExtPdoKTR = false ;
            A2343ExtPdoCTR = (int)(A2343ExtPdoCTR+AV23Conos) ;
            n2343ExtPdoCTR = false ;
         }
         if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "S", "")) == 0 ) )
         {
            A2342ExtPdoKTR = A2342ExtPdoKTR.subtract(AV20KgsOld).add(AV22Kgs) ;
            n2342ExtPdoKTR = false ;
            A2343ExtPdoCTR = (int)(A2343ExtPdoCTR-AV21ConosOld+AV23Conos) ;
            n2343ExtPdoCTR = false ;
         }
         if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "N", "")) == 0 ) )
         {
            A2342ExtPdoKTR = A2342ExtPdoKTR.subtract(AV20KgsOld) ;
            n2342ExtPdoKTR = false ;
            A2343ExtPdoCTR = (int)(A2343ExtPdoCTR-AV21ConosOld) ;
            n2343ExtPdoCTR = false ;
            A2340ExtPdoKgR = A2340ExtPdoKgR.add(AV22Kgs) ;
            n2340ExtPdoKgR = false ;
            A2341ExtPdoCnR = (int)(A2341ExtPdoCnR+AV23Conos) ;
            n2341ExtPdoCnR = false ;
         }
         A2344ExtPdoFeR = AV24RpExPdFe ;
         n2344ExtPdoFeR = false ;
         if ( GXutil.strcmp(AV17RpExPdTip, httpContext.getMessage( "P", "")) == 0 )
         {
            A2335ExtPdoEst = (byte)(2) ;
            n2335ExtPdoEst = false ;
         }
         if ( GXutil.strcmp(AV17RpExPdTip, httpContext.getMessage( "T", "")) == 0 )
         {
            A2335ExtPdoEst = (byte)(3) ;
            n2335ExtPdoEst = false ;
         }
         A2363ExtPdoEnt = AV17RpExPdTip ;
         n2363ExtPdoEnt = false ;
         A2362ExtPdoRes = AV28RpExPdRes ;
         n2362ExtPdoRes = false ;
         /* Using cursor P00E03 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2340ExtPdoKgR), A2340ExtPdoKgR, Boolean.valueOf(n2341ExtPdoCnR), Integer.valueOf(A2341ExtPdoCnR), Boolean.valueOf(n2342ExtPdoKTR), A2342ExtPdoKTR, Boolean.valueOf(n2343ExtPdoCTR), Integer.valueOf(A2343ExtPdoCTR), Boolean.valueOf(n2344ExtPdoFeR), A2344ExtPdoFeR, Boolean.valueOf(n2335ExtPdoEst), Byte.valueOf(A2335ExtPdoEst), Boolean.valueOf(n2363ExtPdoEnt), A2363ExtPdoEnt, Boolean.valueOf(n2362ExtPdoRes), A2362ExtPdoRes, A396EmprCod, Integer.valueOf(A2333ExtPdoAlb), Short.valueOf(A2790ExtPdoLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTPD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00E04 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV31FasCod, Short.valueOf(AV19RpExPdLi)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2348ExMvpTip = P00E04_A2348ExMvpTip[0] ;
         n2348ExMvpTip = P00E04_n2348ExMvpTip[0] ;
         A2379ExMvpExL = P00E04_A2379ExMvpExL[0] ;
         n2379ExMvpExL = P00E04_n2379ExMvpExL[0] ;
         A2358ExMvpFas = P00E04_A2358ExMvpFas[0] ;
         A2248ManCod = P00E04_A2248ManCod[0] ;
         A396EmprCod = P00E04_A396EmprCod[0] ;
         A2353ExMvpKgR = P00E04_A2353ExMvpKgR[0] ;
         n2353ExMvpKgR = P00E04_n2353ExMvpKgR[0] ;
         A2354ExMvpCnR = P00E04_A2354ExMvpCnR[0] ;
         n2354ExMvpCnR = P00E04_n2354ExMvpCnR[0] ;
         A2356ExMvpKRe = P00E04_A2356ExMvpKRe[0] ;
         n2356ExMvpKRe = P00E04_n2356ExMvpKRe[0] ;
         A2357ExMvpCRe = P00E04_A2357ExMvpCRe[0] ;
         n2357ExMvpCRe = P00E04_n2357ExMvpCRe[0] ;
         A2361ExMvpLoc = P00E04_A2361ExMvpLoc[0] ;
         n2361ExMvpLoc = P00E04_n2361ExMvpLoc[0] ;
         A2355ExMvpFeR = P00E04_A2355ExMvpFeR[0] ;
         n2355ExMvpFeR = P00E04_n2355ExMvpFeR[0] ;
         A2347ExMvpLin = P00E04_A2347ExMvpLin[0] ;
         if ( GXutil.strcmp(A2348ExMvpTip, httpContext.getMessage( "R", "")) == 0 )
         {
            if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "N", "")) == 0 ) )
            {
               A2353ExMvpKgR = A2353ExMvpKgR.subtract(AV20KgsOld).add(AV22Kgs) ;
               n2353ExMvpKgR = false ;
               A2354ExMvpCnR = (short)(A2354ExMvpCnR-AV21ConosOld+AV23Conos) ;
               n2354ExMvpCnR = false ;
            }
            if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "S", "")) == 0 ) )
            {
               A2353ExMvpKgR = A2353ExMvpKgR.subtract(AV20KgsOld) ;
               n2353ExMvpKgR = false ;
               A2354ExMvpCnR = (short)(A2354ExMvpCnR-AV21ConosOld) ;
               n2354ExMvpCnR = false ;
               A2356ExMvpKRe = A2356ExMvpKRe.add(AV22Kgs) ;
               n2356ExMvpKRe = false ;
               A2357ExMvpCRe = (short)(A2357ExMvpCRe+AV23Conos) ;
               n2357ExMvpCRe = false ;
            }
            if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "N", "")) == 0 ) )
            {
               A2356ExMvpKRe = A2356ExMvpKRe.subtract(AV20KgsOld) ;
               n2356ExMvpKRe = false ;
               A2357ExMvpCRe = (short)(A2357ExMvpCRe-AV21ConosOld) ;
               n2357ExMvpCRe = false ;
               A2353ExMvpKgR = A2353ExMvpKgR.add(AV22Kgs) ;
               n2353ExMvpKgR = false ;
               A2354ExMvpCnR = (short)(A2354ExMvpCnR+AV23Conos) ;
               n2354ExMvpCnR = false ;
            }
            if ( ( GXutil.strcmp(AV30OldRes, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV28RpExPdRes, httpContext.getMessage( "S", "")) == 0 ) )
            {
               A2356ExMvpKRe = A2356ExMvpKRe.subtract(AV20KgsOld).add(AV22Kgs) ;
               n2356ExMvpKRe = false ;
               A2357ExMvpCRe = (short)(A2357ExMvpCRe-AV21ConosOld+AV23Conos) ;
               n2357ExMvpCRe = false ;
            }
            A2361ExMvpLoc = AV27RpExPdLoc ;
            n2361ExMvpLoc = false ;
            A2355ExMvpFeR = AV24RpExPdFe ;
            n2355ExMvpFeR = false ;
            /* Using cursor P00E05 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n2353ExMvpKgR), A2353ExMvpKgR, Boolean.valueOf(n2354ExMvpCnR), Short.valueOf(A2354ExMvpCnR), Boolean.valueOf(n2356ExMvpKRe), A2356ExMvpKRe, Boolean.valueOf(n2357ExMvpCRe), Short.valueOf(A2357ExMvpCRe), Boolean.valueOf(n2361ExMvpLoc), A2361ExMvpLoc, Boolean.valueOf(n2355ExMvpFeR), A2355ExMvpFeR, A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Short.valueOf(A2347ExMvpLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      n983PartFecMov = false ;
      n987ConUti = false ;
      n986KilUti = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00E06 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n983PartFecMov), AV24RpExPdFe, Short.valueOf(AV21ConosOld), Short.valueOf(AV23Conos), AV20KgsOld, AV22Kgs, AV15EmprCod, AV25RpExPdCo, Integer.valueOf(AV26RpExPdCli), Short.valueOf(AV19RpExPdLi)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
      /* End optimized UPDATE. */
      n2280MovParFec = false ;
      n2282MovParCE = false ;
      n2281MovParKE = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00E07 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n2280MovParFec), AV24RpExPdFe, Short.valueOf(AV21ConosOld), Short.valueOf(AV23Conos), AV20KgsOld, AV22Kgs, AV15EmprCod, AV25RpExPdCo, Integer.valueOf(AV26RpExPdCli), Integer.valueOf(AV26RpExPdCli)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupmvpd.this.AV15EmprCod;
      this.aP1[0] = pupmvpd.this.AV16ManCod;
      this.aP2[0] = pupmvpd.this.AV17RpExPdTip;
      this.aP3[0] = pupmvpd.this.AV18RpExPdAlb;
      this.aP4[0] = pupmvpd.this.AV19RpExPdLi;
      this.aP5[0] = pupmvpd.this.AV20KgsOld;
      this.aP6[0] = pupmvpd.this.AV21ConosOld;
      this.aP7[0] = pupmvpd.this.AV22Kgs;
      this.aP8[0] = pupmvpd.this.AV23Conos;
      this.aP9[0] = pupmvpd.this.AV24RpExPdFe;
      this.aP10[0] = pupmvpd.this.AV25RpExPdCo;
      this.aP11[0] = pupmvpd.this.AV26RpExPdCli;
      this.aP12[0] = pupmvpd.this.AV27RpExPdLoc;
      this.aP13[0] = pupmvpd.this.AV17RpExPdTip;
      this.aP14[0] = pupmvpd.this.AV28RpExPdRes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupmvpd");
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
      P00E02_A2360ExtPdoLoc = new String[] {""} ;
      P00E02_n2360ExtPdoLoc = new boolean[] {false} ;
      P00E02_A252CliCod = new int[1] ;
      P00E02_n252CliCod = new boolean[] {false} ;
      P00E02_A966PartCod = new String[] {""} ;
      P00E02_n966PartCod = new boolean[] {false} ;
      P00E02_A2333ExtPdoAlb = new int[1] ;
      P00E02_A396EmprCod = new String[] {""} ;
      P00E02_A457FasCod = new String[] {""} ;
      P00E02_n457FasCod = new boolean[] {false} ;
      P00E02_A2340ExtPdoKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00E02_n2340ExtPdoKgR = new boolean[] {false} ;
      P00E02_A2341ExtPdoCnR = new int[1] ;
      P00E02_n2341ExtPdoCnR = new boolean[] {false} ;
      P00E02_A2342ExtPdoKTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00E02_n2342ExtPdoKTR = new boolean[] {false} ;
      P00E02_A2343ExtPdoCTR = new int[1] ;
      P00E02_n2343ExtPdoCTR = new boolean[] {false} ;
      P00E02_A2344ExtPdoFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P00E02_n2344ExtPdoFeR = new boolean[] {false} ;
      P00E02_A2335ExtPdoEst = new byte[1] ;
      P00E02_n2335ExtPdoEst = new boolean[] {false} ;
      P00E02_A2363ExtPdoEnt = new String[] {""} ;
      P00E02_n2363ExtPdoEnt = new boolean[] {false} ;
      P00E02_A2362ExtPdoRes = new String[] {""} ;
      P00E02_n2362ExtPdoRes = new boolean[] {false} ;
      P00E02_A2790ExtPdoLin = new short[1] ;
      A2360ExtPdoLoc = "" ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A2340ExtPdoKgR = DecimalUtil.ZERO ;
      A2342ExtPdoKTR = DecimalUtil.ZERO ;
      A2344ExtPdoFeR = GXutil.nullDate() ;
      A2363ExtPdoEnt = "" ;
      A2362ExtPdoRes = "" ;
      AV31FasCod = "" ;
      AV30OldRes = "" ;
      P00E04_A2348ExMvpTip = new String[] {""} ;
      P00E04_n2348ExMvpTip = new boolean[] {false} ;
      P00E04_A2379ExMvpExL = new short[1] ;
      P00E04_n2379ExMvpExL = new boolean[] {false} ;
      P00E04_A2358ExMvpFas = new String[] {""} ;
      P00E04_A2248ManCod = new short[1] ;
      P00E04_A396EmprCod = new String[] {""} ;
      P00E04_A2353ExMvpKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00E04_n2353ExMvpKgR = new boolean[] {false} ;
      P00E04_A2354ExMvpCnR = new short[1] ;
      P00E04_n2354ExMvpCnR = new boolean[] {false} ;
      P00E04_A2356ExMvpKRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00E04_n2356ExMvpKRe = new boolean[] {false} ;
      P00E04_A2357ExMvpCRe = new short[1] ;
      P00E04_n2357ExMvpCRe = new boolean[] {false} ;
      P00E04_A2361ExMvpLoc = new String[] {""} ;
      P00E04_n2361ExMvpLoc = new boolean[] {false} ;
      P00E04_A2355ExMvpFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P00E04_n2355ExMvpFeR = new boolean[] {false} ;
      P00E04_A2347ExMvpLin = new short[1] ;
      A2348ExMvpTip = "" ;
      A2358ExMvpFas = "" ;
      A2353ExMvpKgR = DecimalUtil.ZERO ;
      A2356ExMvpKRe = DecimalUtil.ZERO ;
      A2361ExMvpLoc = "" ;
      A2355ExMvpFeR = GXutil.nullDate() ;
      A983PartFecMov = GXutil.nullDate() ;
      A2280MovParFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupmvpd__default(),
         new Object[] {
             new Object[] {
            P00E02_A2360ExtPdoLoc, P00E02_n2360ExtPdoLoc, P00E02_A252CliCod, P00E02_n252CliCod, P00E02_A966PartCod, P00E02_n966PartCod, P00E02_A2333ExtPdoAlb, P00E02_A396EmprCod, P00E02_A457FasCod, P00E02_n457FasCod,
            P00E02_A2340ExtPdoKgR, P00E02_n2340ExtPdoKgR, P00E02_A2341ExtPdoCnR, P00E02_n2341ExtPdoCnR, P00E02_A2342ExtPdoKTR, P00E02_n2342ExtPdoKTR, P00E02_A2343ExtPdoCTR, P00E02_n2343ExtPdoCTR, P00E02_A2344ExtPdoFeR, P00E02_n2344ExtPdoFeR,
            P00E02_A2335ExtPdoEst, P00E02_n2335ExtPdoEst, P00E02_A2363ExtPdoEnt, P00E02_n2363ExtPdoEnt, P00E02_A2362ExtPdoRes, P00E02_n2362ExtPdoRes, P00E02_A2790ExtPdoLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00E04_A2348ExMvpTip, P00E04_n2348ExMvpTip, P00E04_A2379ExMvpExL, P00E04_n2379ExMvpExL, P00E04_A2358ExMvpFas, P00E04_A2248ManCod, P00E04_A396EmprCod, P00E04_A2353ExMvpKgR, P00E04_n2353ExMvpKgR, P00E04_A2354ExMvpCnR,
            P00E04_n2354ExMvpCnR, P00E04_A2356ExMvpKRe, P00E04_n2356ExMvpKRe, P00E04_A2357ExMvpCRe, P00E04_n2357ExMvpCRe, P00E04_A2361ExMvpLoc, P00E04_n2361ExMvpLoc, P00E04_A2355ExMvpFeR, P00E04_n2355ExMvpFeR, P00E04_A2347ExMvpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2335ExtPdoEst ;
   private short AV16ManCod ;
   private short AV19RpExPdLi ;
   private short AV21ConosOld ;
   private short AV23Conos ;
   private short A2790ExtPdoLin ;
   private short A2379ExMvpExL ;
   private short A2248ManCod ;
   private short A2354ExMvpCnR ;
   private short A2357ExMvpCRe ;
   private short A2347ExMvpLin ;
   private short Gx_err ;
   private int AV18RpExPdAlb ;
   private int AV26RpExPdCli ;
   private int A252CliCod ;
   private int A2333ExtPdoAlb ;
   private int A2341ExtPdoCnR ;
   private int A2343ExtPdoCTR ;
   private java.math.BigDecimal AV20KgsOld ;
   private java.math.BigDecimal AV22Kgs ;
   private java.math.BigDecimal A2340ExtPdoKgR ;
   private java.math.BigDecimal A2342ExtPdoKTR ;
   private java.math.BigDecimal A2353ExMvpKgR ;
   private java.math.BigDecimal A2356ExMvpKRe ;
   private String AV15EmprCod ;
   private String AV17RpExPdTip ;
   private String AV25RpExPdCo ;
   private String AV27RpExPdLoc ;
   private String AV28RpExPdRes ;
   private String scmdbuf ;
   private String A2360ExtPdoLoc ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A2363ExtPdoEnt ;
   private String A2362ExtPdoRes ;
   private String AV31FasCod ;
   private String AV30OldRes ;
   private String A2348ExMvpTip ;
   private String A2358ExMvpFas ;
   private String A2361ExMvpLoc ;
   private java.util.Date AV24RpExPdFe ;
   private java.util.Date A2344ExtPdoFeR ;
   private java.util.Date A2355ExMvpFeR ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A2280MovParFec ;
   private boolean n2360ExtPdoLoc ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n457FasCod ;
   private boolean n2340ExtPdoKgR ;
   private boolean n2341ExtPdoCnR ;
   private boolean n2342ExtPdoKTR ;
   private boolean n2343ExtPdoCTR ;
   private boolean n2344ExtPdoFeR ;
   private boolean n2335ExtPdoEst ;
   private boolean n2363ExtPdoEnt ;
   private boolean n2362ExtPdoRes ;
   private boolean n2348ExMvpTip ;
   private boolean n2379ExMvpExL ;
   private boolean n2353ExMvpKgR ;
   private boolean n2354ExMvpCnR ;
   private boolean n2356ExMvpKRe ;
   private boolean n2357ExMvpCRe ;
   private boolean n2361ExMvpLoc ;
   private boolean n2355ExMvpFeR ;
   private boolean n983PartFecMov ;
   private boolean n987ConUti ;
   private boolean n986KilUti ;
   private boolean n2280MovParFec ;
   private boolean n2282MovParCE ;
   private boolean n2281MovParKE ;
   private String[] aP14 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private java.util.Date[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P00E02_A2360ExtPdoLoc ;
   private boolean[] P00E02_n2360ExtPdoLoc ;
   private int[] P00E02_A252CliCod ;
   private boolean[] P00E02_n252CliCod ;
   private String[] P00E02_A966PartCod ;
   private boolean[] P00E02_n966PartCod ;
   private int[] P00E02_A2333ExtPdoAlb ;
   private String[] P00E02_A396EmprCod ;
   private String[] P00E02_A457FasCod ;
   private boolean[] P00E02_n457FasCod ;
   private java.math.BigDecimal[] P00E02_A2340ExtPdoKgR ;
   private boolean[] P00E02_n2340ExtPdoKgR ;
   private int[] P00E02_A2341ExtPdoCnR ;
   private boolean[] P00E02_n2341ExtPdoCnR ;
   private java.math.BigDecimal[] P00E02_A2342ExtPdoKTR ;
   private boolean[] P00E02_n2342ExtPdoKTR ;
   private int[] P00E02_A2343ExtPdoCTR ;
   private boolean[] P00E02_n2343ExtPdoCTR ;
   private java.util.Date[] P00E02_A2344ExtPdoFeR ;
   private boolean[] P00E02_n2344ExtPdoFeR ;
   private byte[] P00E02_A2335ExtPdoEst ;
   private boolean[] P00E02_n2335ExtPdoEst ;
   private String[] P00E02_A2363ExtPdoEnt ;
   private boolean[] P00E02_n2363ExtPdoEnt ;
   private String[] P00E02_A2362ExtPdoRes ;
   private boolean[] P00E02_n2362ExtPdoRes ;
   private short[] P00E02_A2790ExtPdoLin ;
   private String[] P00E04_A2348ExMvpTip ;
   private boolean[] P00E04_n2348ExMvpTip ;
   private short[] P00E04_A2379ExMvpExL ;
   private boolean[] P00E04_n2379ExMvpExL ;
   private String[] P00E04_A2358ExMvpFas ;
   private short[] P00E04_A2248ManCod ;
   private String[] P00E04_A396EmprCod ;
   private java.math.BigDecimal[] P00E04_A2353ExMvpKgR ;
   private boolean[] P00E04_n2353ExMvpKgR ;
   private short[] P00E04_A2354ExMvpCnR ;
   private boolean[] P00E04_n2354ExMvpCnR ;
   private java.math.BigDecimal[] P00E04_A2356ExMvpKRe ;
   private boolean[] P00E04_n2356ExMvpKRe ;
   private short[] P00E04_A2357ExMvpCRe ;
   private boolean[] P00E04_n2357ExMvpCRe ;
   private String[] P00E04_A2361ExMvpLoc ;
   private boolean[] P00E04_n2361ExMvpLoc ;
   private java.util.Date[] P00E04_A2355ExMvpFeR ;
   private boolean[] P00E04_n2355ExMvpFeR ;
   private short[] P00E04_A2347ExMvpLin ;
}

final  class pupmvpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00E02", "SELECT ExtPdoLoc, CliCod, PartCod, ExtPdoAlb, EmprCod, FasCod, ExtPdoKgR, ExtPdoCnR, ExtPdoKTR, ExtPdoCTR, ExtPdoFeR, ExtPdoEst, ExtPdoEnt, ExtPdoRes, ExtPdoLin FROM TXPLEXTPD WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (ExtPdoAlb = ?) AND (ExtPdoLoc = ?) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00E03", "UPDATE TXPLEXTPD SET ExtPdoKgR=?, ExtPdoCnR=?, ExtPdoKTR=?, ExtPdoCTR=?, ExtPdoFeR=?, ExtPdoEst=?, ExtPdoEnt=?, ExtPdoRes=?  WHERE EmprCod = ? AND ExtPdoAlb = ? AND ExtPdoLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTPD")
         ,new ForEachCursor("P00E04", "SELECT ExMvpTip, ExMvpExL, ExMvpFas, ManCod, EmprCod, ExMvpKgR, ExMvpCnR, ExMvpKRe, ExMvpCRe, ExMvpLoc, ExMvpFeR, ExMvpLin FROM TXPLEXMVP WHERE (EmprCod = ? and ManCod = ? and ExMvpFas = ?) AND (ExMvpExL = ?) ORDER BY EmprCod, ManCod, ExMvpFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00E05", "UPDATE TXPLEXMVP SET ExMvpKgR=?, ExMvpCnR=?, ExMvpKRe=?, ExMvpCRe=?, ExMvpLoc=?, ExMvpFeR=?  WHERE EmprCod = ? AND ManCod = ? AND ExMvpFas = ? AND ExMvpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
         ,new UpdateCursor("P00E06", "UPDATE TXPLPARTI SET PartFecMov=?, ConUti=ConUti + ? - ?, KilUti=KilUti + ? - ?  WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (ParExtLin = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P00E07", "UPDATE TXPLMOVPD SET MovParFec=?, MovParCE=MovParCE - ? + ?, MovParKE=MovParKE - ? + ?  WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (MovParExL = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setShort(8, ((Number) parms[13]).shortValue());
               stmt.setString(9, (String)parms[14], 8);
               stmt.setShort(10, ((Number) parms[15]).shortValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(6, (String)parms[6], 3);
               stmt.setString(7, (String)parms[7], 16);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(6, (String)parms[6], 3);
               stmt.setString(7, (String)parms[7], 16);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setInt(9, ((Number) parms[9]).intValue());
               return;
      }
   }

}

