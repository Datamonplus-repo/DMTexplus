package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkire02 extends GXProcedure
{
   public pkire02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkire02.class ), "" );
   }

   public pkire02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            java.util.Date[] aP2 )
   {
      pkire02.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 ,
                             short[] aP3 )
   {
      pkire02.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pkire02.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pkire02.this.AV17RpExPdFe = aP2[0];
      this.aP2 = aP2;
      pkire02.this.AV18RpExPdLi = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00DX2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17RpExPdFe, Short.valueOf(AV18RpExPdLi)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2368RpExPdCli = P00DX2_A2368RpExPdCli[0] ;
         n2368RpExPdCli = P00DX2_n2368RpExPdCli[0] ;
         A2367RpExPdCo = P00DX2_A2367RpExPdCo[0] ;
         n2367RpExPdCo = P00DX2_n2367RpExPdCo[0] ;
         A2374RpExPdLoc = P00DX2_A2374RpExPdLoc[0] ;
         n2374RpExPdLoc = P00DX2_n2374RpExPdLoc[0] ;
         A2373RpExPdAlb = P00DX2_A2373RpExPdAlb[0] ;
         n2373RpExPdAlb = P00DX2_n2373RpExPdAlb[0] ;
         A2372RpExPdRes = P00DX2_A2372RpExPdRes[0] ;
         n2372RpExPdRes = P00DX2_n2372RpExPdRes[0] ;
         A2369RpExPdKgs = P00DX2_A2369RpExPdKgs[0] ;
         n2369RpExPdKgs = P00DX2_n2369RpExPdKgs[0] ;
         A2370RpExPdCns = P00DX2_A2370RpExPdCns[0] ;
         n2370RpExPdCns = P00DX2_n2370RpExPdCns[0] ;
         A2366RpExPdLi = P00DX2_A2366RpExPdLi[0] ;
         A2364RpExPdFe = P00DX2_A2364RpExPdFe[0] ;
         A2248ManCod = P00DX2_A2248ManCod[0] ;
         A396EmprCod = P00DX2_A396EmprCod[0] ;
         AV20FasCod = "" ;
         /* Using cursor P00DX3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Boolean.valueOf(n2367RpExPdCo), A2367RpExPdCo, Boolean.valueOf(n2368RpExPdCli), Integer.valueOf(A2368RpExPdCli), Boolean.valueOf(n2373RpExPdAlb), Integer.valueOf(A2373RpExPdAlb), Boolean.valueOf(n2374RpExPdLoc), A2374RpExPdLoc});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2333ExtPdoAlb = P00DX3_A2333ExtPdoAlb[0] ;
            A2360ExtPdoLoc = P00DX3_A2360ExtPdoLoc[0] ;
            n2360ExtPdoLoc = P00DX3_n2360ExtPdoLoc[0] ;
            A966PartCod = P00DX3_A966PartCod[0] ;
            n966PartCod = P00DX3_n966PartCod[0] ;
            A252CliCod = P00DX3_A252CliCod[0] ;
            n252CliCod = P00DX3_n252CliCod[0] ;
            A396EmprCod = P00DX3_A396EmprCod[0] ;
            A457FasCod = P00DX3_A457FasCod[0] ;
            n457FasCod = P00DX3_n457FasCod[0] ;
            A2342ExtPdoKTR = P00DX3_A2342ExtPdoKTR[0] ;
            n2342ExtPdoKTR = P00DX3_n2342ExtPdoKTR[0] ;
            A2343ExtPdoCTR = P00DX3_A2343ExtPdoCTR[0] ;
            n2343ExtPdoCTR = P00DX3_n2343ExtPdoCTR[0] ;
            A2340ExtPdoKgR = P00DX3_A2340ExtPdoKgR[0] ;
            n2340ExtPdoKgR = P00DX3_n2340ExtPdoKgR[0] ;
            A2341ExtPdoCnR = P00DX3_A2341ExtPdoCnR[0] ;
            n2341ExtPdoCnR = P00DX3_n2341ExtPdoCnR[0] ;
            A2335ExtPdoEst = P00DX3_A2335ExtPdoEst[0] ;
            n2335ExtPdoEst = P00DX3_n2335ExtPdoEst[0] ;
            A2790ExtPdoLin = P00DX3_A2790ExtPdoLin[0] ;
            AV20FasCod = A457FasCod ;
            if ( GXutil.strcmp(A2372RpExPdRes, httpContext.getMessage( "S", "")) == 0 )
            {
               A2342ExtPdoKTR = A2342ExtPdoKTR.subtract(A2369RpExPdKgs) ;
               n2342ExtPdoKTR = false ;
               A2343ExtPdoCTR = (int)(A2343ExtPdoCTR-A2370RpExPdCns) ;
               n2343ExtPdoCTR = false ;
            }
            else
            {
               A2340ExtPdoKgR = A2340ExtPdoKgR.subtract(A2369RpExPdKgs) ;
               n2340ExtPdoKgR = false ;
               A2341ExtPdoCnR = (int)(A2341ExtPdoCnR-A2370RpExPdCns) ;
               n2341ExtPdoCnR = false ;
            }
            if ( (0==A2341ExtPdoCnR) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A2340ExtPdoKgR)==0) )
            {
               A2335ExtPdoEst = (byte)(1) ;
               n2335ExtPdoEst = false ;
            }
            /* Using cursor P00DX4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n2342ExtPdoKTR), A2342ExtPdoKTR, Boolean.valueOf(n2343ExtPdoCTR), Integer.valueOf(A2343ExtPdoCTR), Boolean.valueOf(n2340ExtPdoKgR), A2340ExtPdoKgR, Boolean.valueOf(n2341ExtPdoCnR), Integer.valueOf(A2341ExtPdoCnR), Boolean.valueOf(n2335ExtPdoEst), Byte.valueOf(A2335ExtPdoEst), A396EmprCod, Integer.valueOf(A2333ExtPdoAlb), Short.valueOf(A2790ExtPdoLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTPD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00DX5 */
         pr_default.execute(3, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV20FasCod, Short.valueOf(AV18RpExPdLi)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2379ExMvpExL = P00DX5_A2379ExMvpExL[0] ;
            n2379ExMvpExL = P00DX5_n2379ExMvpExL[0] ;
            A2348ExMvpTip = P00DX5_A2348ExMvpTip[0] ;
            n2348ExMvpTip = P00DX5_n2348ExMvpTip[0] ;
            A2358ExMvpFas = P00DX5_A2358ExMvpFas[0] ;
            A2248ManCod = P00DX5_A2248ManCod[0] ;
            A396EmprCod = P00DX5_A396EmprCod[0] ;
            A2347ExMvpLin = P00DX5_A2347ExMvpLin[0] ;
            if ( GXutil.strcmp(A2348ExMvpTip, httpContext.getMessage( "R", "")) == 0 )
            {
               /* Using cursor P00DX6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Short.valueOf(A2347ExMvpLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P00DX7 */
         pr_default.execute(5, new Object[] {AV15EmprCod, Boolean.valueOf(n2367RpExPdCo), A2367RpExPdCo, Boolean.valueOf(n2368RpExPdCli), Integer.valueOf(A2368RpExPdCli), Boolean.valueOf(n2374RpExPdLoc), A2374RpExPdLoc, Short.valueOf(AV18RpExPdLi)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A966PartCod = P00DX7_A966PartCod[0] ;
            n966PartCod = P00DX7_n966PartCod[0] ;
            A252CliCod = P00DX7_A252CliCod[0] ;
            n252CliCod = P00DX7_n252CliCod[0] ;
            A1877PartLoc = P00DX7_A1877PartLoc[0] ;
            n1877PartLoc = P00DX7_n1877PartLoc[0] ;
            A982PartSitDis = P00DX7_A982PartSitDis[0] ;
            n982PartSitDis = P00DX7_n982PartSitDis[0] ;
            A2377ParExtLin = P00DX7_A2377ParExtLin[0] ;
            n2377ParExtLin = P00DX7_n2377ParExtLin[0] ;
            A980PartLinTip = P00DX7_A980PartLinTip[0] ;
            n980PartLinTip = P00DX7_n980PartLinTip[0] ;
            A396EmprCod = P00DX7_A396EmprCod[0] ;
            A979PartLin = P00DX7_A979PartLin[0] ;
            if ( ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "R", "")) == 0 ) )
            {
               if ( GXutil.strcmp(A982PartSitDis, httpContext.getMessage( "RECEPCION EXTERIOR", "")) == 0 )
               {
                  /* Using cursor P00DX8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
               }
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P00DX9 */
         pr_default.execute(7, new Object[] {AV15EmprCod, Boolean.valueOf(n2367RpExPdCo), A2367RpExPdCo, Boolean.valueOf(n2368RpExPdCli), Integer.valueOf(A2368RpExPdCli), Boolean.valueOf(n2374RpExPdLoc), A2374RpExPdLoc, Short.valueOf(AV18RpExPdLi)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A2268MovParCod = P00DX9_A2268MovParCod[0] ;
            A252CliCod = P00DX9_A252CliCod[0] ;
            n252CliCod = P00DX9_n252CliCod[0] ;
            A2285MovParLoc = P00DX9_A2285MovParLoc[0] ;
            n2285MovParLoc = P00DX9_n2285MovParLoc[0] ;
            A2378MovParExL = P00DX9_A2378MovParExL[0] ;
            n2378MovParExL = P00DX9_n2378MovParExL[0] ;
            A2279MovParSit = P00DX9_A2279MovParSit[0] ;
            n2279MovParSit = P00DX9_n2279MovParSit[0] ;
            A2277MovParLiT = P00DX9_A2277MovParLiT[0] ;
            n2277MovParLiT = P00DX9_n2277MovParLiT[0] ;
            A396EmprCod = P00DX9_A396EmprCod[0] ;
            A2276MovParLin = P00DX9_A2276MovParLin[0] ;
            if ( GXutil.strcmp(A2277MovParLiT, httpContext.getMessage( "E", "")) == 0 )
            {
               if ( GXutil.strcmp(A2279MovParSit, httpContext.getMessage( "RECEPCION EXTERIOR", "")) == 0 )
               {
                  /* Using cursor P00DX10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, A2268MovParCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
               }
            }
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P00DX11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2364RpExPdFe, Short.valueOf(A2366RpExPdLi)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRPEXP");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV19Flag = (byte)(0) ;
      /* Using cursor P00DX12 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17RpExPdFe});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A2364RpExPdFe = P00DX12_A2364RpExPdFe[0] ;
         A2248ManCod = P00DX12_A2248ManCod[0] ;
         A396EmprCod = P00DX12_A396EmprCod[0] ;
         A2365RpExPdUl = P00DX12_A2365RpExPdUl[0] ;
         n2365RpExPdUl = P00DX12_n2365RpExPdUl[0] ;
         /* Using cursor P00DX13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2364RpExPdFe});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A2368RpExPdCli = P00DX13_A2368RpExPdCli[0] ;
            n2368RpExPdCli = P00DX13_n2368RpExPdCli[0] ;
            A2366RpExPdLi = P00DX13_A2366RpExPdLi[0] ;
            AV19Flag = (byte)(1) ;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( AV19Flag == 0 )
         {
            /* Using cursor P00DX14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2364RpExPdFe});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRPEXP");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkire02.this.AV15EmprCod;
      this.aP1[0] = pkire02.this.AV16ManCod;
      this.aP2[0] = pkire02.this.AV17RpExPdFe;
      this.aP3[0] = pkire02.this.AV18RpExPdLi;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkire02");
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
      P00DX2_A2368RpExPdCli = new int[1] ;
      P00DX2_n2368RpExPdCli = new boolean[] {false} ;
      P00DX2_A2367RpExPdCo = new String[] {""} ;
      P00DX2_n2367RpExPdCo = new boolean[] {false} ;
      P00DX2_A2374RpExPdLoc = new String[] {""} ;
      P00DX2_n2374RpExPdLoc = new boolean[] {false} ;
      P00DX2_A2373RpExPdAlb = new int[1] ;
      P00DX2_n2373RpExPdAlb = new boolean[] {false} ;
      P00DX2_A2372RpExPdRes = new String[] {""} ;
      P00DX2_n2372RpExPdRes = new boolean[] {false} ;
      P00DX2_A2369RpExPdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DX2_n2369RpExPdKgs = new boolean[] {false} ;
      P00DX2_A2370RpExPdCns = new short[1] ;
      P00DX2_n2370RpExPdCns = new boolean[] {false} ;
      P00DX2_A2366RpExPdLi = new short[1] ;
      P00DX2_A2364RpExPdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00DX2_A2248ManCod = new short[1] ;
      P00DX2_A396EmprCod = new String[] {""} ;
      A2367RpExPdCo = "" ;
      A2374RpExPdLoc = "" ;
      A2372RpExPdRes = "" ;
      A2369RpExPdKgs = DecimalUtil.ZERO ;
      A2364RpExPdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV20FasCod = "" ;
      P00DX3_A2333ExtPdoAlb = new int[1] ;
      P00DX3_A2360ExtPdoLoc = new String[] {""} ;
      P00DX3_n2360ExtPdoLoc = new boolean[] {false} ;
      P00DX3_A966PartCod = new String[] {""} ;
      P00DX3_n966PartCod = new boolean[] {false} ;
      P00DX3_A252CliCod = new int[1] ;
      P00DX3_n252CliCod = new boolean[] {false} ;
      P00DX3_A396EmprCod = new String[] {""} ;
      P00DX3_A457FasCod = new String[] {""} ;
      P00DX3_n457FasCod = new boolean[] {false} ;
      P00DX3_A2342ExtPdoKTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DX3_n2342ExtPdoKTR = new boolean[] {false} ;
      P00DX3_A2343ExtPdoCTR = new int[1] ;
      P00DX3_n2343ExtPdoCTR = new boolean[] {false} ;
      P00DX3_A2340ExtPdoKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DX3_n2340ExtPdoKgR = new boolean[] {false} ;
      P00DX3_A2341ExtPdoCnR = new int[1] ;
      P00DX3_n2341ExtPdoCnR = new boolean[] {false} ;
      P00DX3_A2335ExtPdoEst = new byte[1] ;
      P00DX3_n2335ExtPdoEst = new boolean[] {false} ;
      P00DX3_A2790ExtPdoLin = new short[1] ;
      A2360ExtPdoLoc = "" ;
      A966PartCod = "" ;
      A457FasCod = "" ;
      A2342ExtPdoKTR = DecimalUtil.ZERO ;
      A2340ExtPdoKgR = DecimalUtil.ZERO ;
      P00DX5_A2379ExMvpExL = new short[1] ;
      P00DX5_n2379ExMvpExL = new boolean[] {false} ;
      P00DX5_A2348ExMvpTip = new String[] {""} ;
      P00DX5_n2348ExMvpTip = new boolean[] {false} ;
      P00DX5_A2358ExMvpFas = new String[] {""} ;
      P00DX5_A2248ManCod = new short[1] ;
      P00DX5_A396EmprCod = new String[] {""} ;
      P00DX5_A2347ExMvpLin = new short[1] ;
      A2348ExMvpTip = "" ;
      A2358ExMvpFas = "" ;
      P00DX7_A966PartCod = new String[] {""} ;
      P00DX7_n966PartCod = new boolean[] {false} ;
      P00DX7_A252CliCod = new int[1] ;
      P00DX7_n252CliCod = new boolean[] {false} ;
      P00DX7_A1877PartLoc = new String[] {""} ;
      P00DX7_n1877PartLoc = new boolean[] {false} ;
      P00DX7_A982PartSitDis = new String[] {""} ;
      P00DX7_n982PartSitDis = new boolean[] {false} ;
      P00DX7_A2377ParExtLin = new short[1] ;
      P00DX7_n2377ParExtLin = new boolean[] {false} ;
      P00DX7_A980PartLinTip = new String[] {""} ;
      P00DX7_n980PartLinTip = new boolean[] {false} ;
      P00DX7_A396EmprCod = new String[] {""} ;
      P00DX7_A979PartLin = new int[1] ;
      A1877PartLoc = "" ;
      A982PartSitDis = "" ;
      A980PartLinTip = "" ;
      P00DX9_A2268MovParCod = new String[] {""} ;
      P00DX9_A252CliCod = new int[1] ;
      P00DX9_n252CliCod = new boolean[] {false} ;
      P00DX9_A2285MovParLoc = new String[] {""} ;
      P00DX9_n2285MovParLoc = new boolean[] {false} ;
      P00DX9_A2378MovParExL = new short[1] ;
      P00DX9_n2378MovParExL = new boolean[] {false} ;
      P00DX9_A2279MovParSit = new String[] {""} ;
      P00DX9_n2279MovParSit = new boolean[] {false} ;
      P00DX9_A2277MovParLiT = new String[] {""} ;
      P00DX9_n2277MovParLiT = new boolean[] {false} ;
      P00DX9_A396EmprCod = new String[] {""} ;
      P00DX9_A2276MovParLin = new short[1] ;
      A2268MovParCod = "" ;
      A2285MovParLoc = "" ;
      A2279MovParSit = "" ;
      A2277MovParLiT = "" ;
      P00DX12_A2364RpExPdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00DX12_A2248ManCod = new short[1] ;
      P00DX12_A396EmprCod = new String[] {""} ;
      P00DX12_A2365RpExPdUl = new short[1] ;
      P00DX12_n2365RpExPdUl = new boolean[] {false} ;
      P00DX13_A396EmprCod = new String[] {""} ;
      P00DX13_A2248ManCod = new short[1] ;
      P00DX13_A2364RpExPdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00DX13_A2368RpExPdCli = new int[1] ;
      P00DX13_n2368RpExPdCli = new boolean[] {false} ;
      P00DX13_A2366RpExPdLi = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkire02__default(),
         new Object[] {
             new Object[] {
            P00DX2_A2368RpExPdCli, P00DX2_n2368RpExPdCli, P00DX2_A2367RpExPdCo, P00DX2_n2367RpExPdCo, P00DX2_A2374RpExPdLoc, P00DX2_n2374RpExPdLoc, P00DX2_A2373RpExPdAlb, P00DX2_n2373RpExPdAlb, P00DX2_A2372RpExPdRes, P00DX2_n2372RpExPdRes,
            P00DX2_A2369RpExPdKgs, P00DX2_n2369RpExPdKgs, P00DX2_A2370RpExPdCns, P00DX2_n2370RpExPdCns, P00DX2_A2366RpExPdLi, P00DX2_A2364RpExPdFe, P00DX2_A2248ManCod, P00DX2_A396EmprCod
            }
            , new Object[] {
            P00DX3_A2333ExtPdoAlb, P00DX3_A2360ExtPdoLoc, P00DX3_n2360ExtPdoLoc, P00DX3_A966PartCod, P00DX3_n966PartCod, P00DX3_A252CliCod, P00DX3_n252CliCod, P00DX3_A396EmprCod, P00DX3_A457FasCod, P00DX3_n457FasCod,
            P00DX3_A2342ExtPdoKTR, P00DX3_n2342ExtPdoKTR, P00DX3_A2343ExtPdoCTR, P00DX3_n2343ExtPdoCTR, P00DX3_A2340ExtPdoKgR, P00DX3_n2340ExtPdoKgR, P00DX3_A2341ExtPdoCnR, P00DX3_n2341ExtPdoCnR, P00DX3_A2335ExtPdoEst, P00DX3_n2335ExtPdoEst,
            P00DX3_A2790ExtPdoLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DX5_A2379ExMvpExL, P00DX5_n2379ExMvpExL, P00DX5_A2348ExMvpTip, P00DX5_n2348ExMvpTip, P00DX5_A2358ExMvpFas, P00DX5_A2248ManCod, P00DX5_A396EmprCod, P00DX5_A2347ExMvpLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DX7_A966PartCod, P00DX7_A252CliCod, P00DX7_A1877PartLoc, P00DX7_n1877PartLoc, P00DX7_A982PartSitDis, P00DX7_n982PartSitDis, P00DX7_A2377ParExtLin, P00DX7_n2377ParExtLin, P00DX7_A980PartLinTip, P00DX7_n980PartLinTip,
            P00DX7_A396EmprCod, P00DX7_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DX9_A2268MovParCod, P00DX9_A252CliCod, P00DX9_A2285MovParLoc, P00DX9_n2285MovParLoc, P00DX9_A2378MovParExL, P00DX9_n2378MovParExL, P00DX9_A2279MovParSit, P00DX9_n2279MovParSit, P00DX9_A2277MovParLiT, P00DX9_n2277MovParLiT,
            P00DX9_A396EmprCod, P00DX9_A2276MovParLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00DX12_A2364RpExPdFe, P00DX12_A2248ManCod, P00DX12_A396EmprCod, P00DX12_A2365RpExPdUl, P00DX12_n2365RpExPdUl
            }
            , new Object[] {
            P00DX13_A396EmprCod, P00DX13_A2248ManCod, P00DX13_A2364RpExPdFe, P00DX13_A2368RpExPdCli, P00DX13_n2368RpExPdCli, P00DX13_A2366RpExPdLi
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2335ExtPdoEst ;
   private byte AV19Flag ;
   private short AV16ManCod ;
   private short AV18RpExPdLi ;
   private short A2370RpExPdCns ;
   private short A2366RpExPdLi ;
   private short A2248ManCod ;
   private short A2790ExtPdoLin ;
   private short A2379ExMvpExL ;
   private short A2347ExMvpLin ;
   private short A2377ParExtLin ;
   private short A2378MovParExL ;
   private short A2276MovParLin ;
   private short A2365RpExPdUl ;
   private short Gx_err ;
   private int A2368RpExPdCli ;
   private int A2373RpExPdAlb ;
   private int A2333ExtPdoAlb ;
   private int A252CliCod ;
   private int A2343ExtPdoCTR ;
   private int A2341ExtPdoCnR ;
   private int A979PartLin ;
   private java.math.BigDecimal A2369RpExPdKgs ;
   private java.math.BigDecimal A2342ExtPdoKTR ;
   private java.math.BigDecimal A2340ExtPdoKgR ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A2367RpExPdCo ;
   private String A2374RpExPdLoc ;
   private String A2372RpExPdRes ;
   private String A396EmprCod ;
   private String AV20FasCod ;
   private String A2360ExtPdoLoc ;
   private String A966PartCod ;
   private String A457FasCod ;
   private String A2348ExMvpTip ;
   private String A2358ExMvpFas ;
   private String A1877PartLoc ;
   private String A982PartSitDis ;
   private String A980PartLinTip ;
   private String A2268MovParCod ;
   private String A2285MovParLoc ;
   private String A2279MovParSit ;
   private String A2277MovParLiT ;
   private java.util.Date AV17RpExPdFe ;
   private java.util.Date A2364RpExPdFe ;
   private boolean n2368RpExPdCli ;
   private boolean n2367RpExPdCo ;
   private boolean n2374RpExPdLoc ;
   private boolean n2373RpExPdAlb ;
   private boolean n2372RpExPdRes ;
   private boolean n2369RpExPdKgs ;
   private boolean n2370RpExPdCns ;
   private boolean n2360ExtPdoLoc ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n457FasCod ;
   private boolean n2342ExtPdoKTR ;
   private boolean n2343ExtPdoCTR ;
   private boolean n2340ExtPdoKgR ;
   private boolean n2341ExtPdoCnR ;
   private boolean n2335ExtPdoEst ;
   private boolean n2379ExMvpExL ;
   private boolean n2348ExMvpTip ;
   private boolean n1877PartLoc ;
   private boolean n982PartSitDis ;
   private boolean n2377ParExtLin ;
   private boolean n980PartLinTip ;
   private boolean n2285MovParLoc ;
   private boolean n2378MovParExL ;
   private boolean n2279MovParSit ;
   private boolean n2277MovParLiT ;
   private boolean n2365RpExPdUl ;
   private short[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P00DX2_A2368RpExPdCli ;
   private boolean[] P00DX2_n2368RpExPdCli ;
   private String[] P00DX2_A2367RpExPdCo ;
   private boolean[] P00DX2_n2367RpExPdCo ;
   private String[] P00DX2_A2374RpExPdLoc ;
   private boolean[] P00DX2_n2374RpExPdLoc ;
   private int[] P00DX2_A2373RpExPdAlb ;
   private boolean[] P00DX2_n2373RpExPdAlb ;
   private String[] P00DX2_A2372RpExPdRes ;
   private boolean[] P00DX2_n2372RpExPdRes ;
   private java.math.BigDecimal[] P00DX2_A2369RpExPdKgs ;
   private boolean[] P00DX2_n2369RpExPdKgs ;
   private short[] P00DX2_A2370RpExPdCns ;
   private boolean[] P00DX2_n2370RpExPdCns ;
   private short[] P00DX2_A2366RpExPdLi ;
   private java.util.Date[] P00DX2_A2364RpExPdFe ;
   private short[] P00DX2_A2248ManCod ;
   private String[] P00DX2_A396EmprCod ;
   private int[] P00DX3_A2333ExtPdoAlb ;
   private String[] P00DX3_A2360ExtPdoLoc ;
   private boolean[] P00DX3_n2360ExtPdoLoc ;
   private String[] P00DX3_A966PartCod ;
   private boolean[] P00DX3_n966PartCod ;
   private int[] P00DX3_A252CliCod ;
   private boolean[] P00DX3_n252CliCod ;
   private String[] P00DX3_A396EmprCod ;
   private String[] P00DX3_A457FasCod ;
   private boolean[] P00DX3_n457FasCod ;
   private java.math.BigDecimal[] P00DX3_A2342ExtPdoKTR ;
   private boolean[] P00DX3_n2342ExtPdoKTR ;
   private int[] P00DX3_A2343ExtPdoCTR ;
   private boolean[] P00DX3_n2343ExtPdoCTR ;
   private java.math.BigDecimal[] P00DX3_A2340ExtPdoKgR ;
   private boolean[] P00DX3_n2340ExtPdoKgR ;
   private int[] P00DX3_A2341ExtPdoCnR ;
   private boolean[] P00DX3_n2341ExtPdoCnR ;
   private byte[] P00DX3_A2335ExtPdoEst ;
   private boolean[] P00DX3_n2335ExtPdoEst ;
   private short[] P00DX3_A2790ExtPdoLin ;
   private short[] P00DX5_A2379ExMvpExL ;
   private boolean[] P00DX5_n2379ExMvpExL ;
   private String[] P00DX5_A2348ExMvpTip ;
   private boolean[] P00DX5_n2348ExMvpTip ;
   private String[] P00DX5_A2358ExMvpFas ;
   private short[] P00DX5_A2248ManCod ;
   private String[] P00DX5_A396EmprCod ;
   private short[] P00DX5_A2347ExMvpLin ;
   private String[] P00DX7_A966PartCod ;
   private boolean[] P00DX7_n966PartCod ;
   private int[] P00DX7_A252CliCod ;
   private boolean[] P00DX7_n252CliCod ;
   private String[] P00DX7_A1877PartLoc ;
   private boolean[] P00DX7_n1877PartLoc ;
   private String[] P00DX7_A982PartSitDis ;
   private boolean[] P00DX7_n982PartSitDis ;
   private short[] P00DX7_A2377ParExtLin ;
   private boolean[] P00DX7_n2377ParExtLin ;
   private String[] P00DX7_A980PartLinTip ;
   private boolean[] P00DX7_n980PartLinTip ;
   private String[] P00DX7_A396EmprCod ;
   private int[] P00DX7_A979PartLin ;
   private String[] P00DX9_A2268MovParCod ;
   private int[] P00DX9_A252CliCod ;
   private boolean[] P00DX9_n252CliCod ;
   private String[] P00DX9_A2285MovParLoc ;
   private boolean[] P00DX9_n2285MovParLoc ;
   private short[] P00DX9_A2378MovParExL ;
   private boolean[] P00DX9_n2378MovParExL ;
   private String[] P00DX9_A2279MovParSit ;
   private boolean[] P00DX9_n2279MovParSit ;
   private String[] P00DX9_A2277MovParLiT ;
   private boolean[] P00DX9_n2277MovParLiT ;
   private String[] P00DX9_A396EmprCod ;
   private short[] P00DX9_A2276MovParLin ;
   private java.util.Date[] P00DX12_A2364RpExPdFe ;
   private short[] P00DX12_A2248ManCod ;
   private String[] P00DX12_A396EmprCod ;
   private short[] P00DX12_A2365RpExPdUl ;
   private boolean[] P00DX12_n2365RpExPdUl ;
   private String[] P00DX13_A396EmprCod ;
   private short[] P00DX13_A2248ManCod ;
   private java.util.Date[] P00DX13_A2364RpExPdFe ;
   private int[] P00DX13_A2368RpExPdCli ;
   private boolean[] P00DX13_n2368RpExPdCli ;
   private short[] P00DX13_A2366RpExPdLi ;
}

final  class pkire02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DX2", "SELECT RpExPdCli, RpExPdCo, RpExPdLoc, RpExPdAlb, RpExPdRes, RpExPdKgs, RpExPdCns, RpExPdLi, RpExPdFe, ManCod, EmprCod FROM TXPLRPEXP WHERE EmprCod = ? and ManCod = ? and RpExPdFe = ? and RpExPdLi = ? ORDER BY EmprCod, ManCod, RpExPdFe, RpExPdLi ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DX3", "SELECT ExtPdoAlb, ExtPdoLoc, PartCod, CliCod, EmprCod, FasCod, ExtPdoKTR, ExtPdoCTR, ExtPdoKgR, ExtPdoCnR, ExtPdoEst, ExtPdoLin FROM TXPLEXTPD WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (ExtPdoAlb = ?) AND (ExtPdoLoc = ?) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DX4", "UPDATE TXPLEXTPD SET ExtPdoKTR=?, ExtPdoCTR=?, ExtPdoKgR=?, ExtPdoCnR=?, ExtPdoEst=?  WHERE EmprCod = ? AND ExtPdoAlb = ? AND ExtPdoLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTPD")
         ,new ForEachCursor("P00DX5", "SELECT ExMvpExL, ExMvpTip, ExMvpFas, ManCod, EmprCod, ExMvpLin FROM TXPLEXMVP WHERE (EmprCod = ? and ManCod = ? and ExMvpFas = ?) AND (ExMvpExL = ?) ORDER BY EmprCod, ManCod, ExMvpFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DX6", "DELETE FROM TXPLEXMVP  WHERE EmprCod = ? AND ManCod = ? AND ExMvpFas = ? AND ExMvpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
         ,new ForEachCursor("P00DX7", "SELECT PartCod, CliCod, PartLoc, PartSitDis, ParExtLin, PartLinTip, EmprCod, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ? and PartLoc = ?) AND (ParExtLin = ?) ORDER BY EmprCod, PartCod, CliCod, PartLoc ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DX8", "DELETE FROM TXPLPARTI  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P00DX9", "SELECT MovParCod, CliCod, MovParLoc, MovParExL, MovParSit, MovParLiT, EmprCod, MovParLin FROM TXPLMOVPD WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (MovParLoc = ?) AND (MovParExL = ?) ORDER BY EmprCod, MovParCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DX10", "DELETE FROM TXPLMOVPD  WHERE EmprCod = ? AND MovParCod = ? AND CliCod = ? AND MovParLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
         ,new UpdateCursor("P00DX11", "DELETE FROM TXPLRPEXP  WHERE EmprCod = ? AND ManCod = ? AND RpExPdFe = ? AND RpExPdLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRPEXP")
         ,new ForEachCursor("P00DX12", "SELECT RpExPdFe, ManCod, EmprCod, RpExPdUl FROM TXPCRPEXP WHERE EmprCod = ? and ManCod = ? and RpExPdFe = ? ORDER BY EmprCod, ManCod, RpExPdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DX13", "SELECT EmprCod, ManCod, RpExPdFe, RpExPdCli, RpExPdLi FROM TXPLRPEXP WHERE EmprCod = ? and ManCod = ? and RpExPdFe = ? ORDER BY EmprCod, ManCod, RpExPdFe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DX14", "DELETE FROM TXPCRPEXP  WHERE EmprCod = ? AND ManCod = ? AND RpExPdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRPEXP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((String[]) buf[17])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((short[]) buf[11])[0] = rslt.getShort(8);
               return;
            case 10 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               return;
            case 2 :
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

