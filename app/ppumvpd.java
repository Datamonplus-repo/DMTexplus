package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppumvpd extends GXProcedure
{
   public ppumvpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppumvpd.class ), "" );
   }

   public ppumvpd( int remoteHandle ,
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
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      ppumvpd.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.util.Date[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      ppumvpd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ppumvpd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      ppumvpd.this.AV17ExMvpTip = aP2[0];
      this.aP2 = aP2;
      ppumvpd.this.AV18ExMvpAlb = aP3[0];
      this.aP3 = aP3;
      ppumvpd.this.AV19RpExPdLi = aP4[0];
      this.aP4 = aP4;
      ppumvpd.this.AV20Kgs = aP5[0];
      this.aP5 = aP5;
      ppumvpd.this.AV21Conos = aP6[0];
      this.aP6 = aP6;
      ppumvpd.this.AV22FecMov = aP7[0];
      this.aP7 = aP7;
      ppumvpd.this.AV23PartCod = aP8[0];
      this.aP8 = aP8;
      ppumvpd.this.AV24CliCod = aP9[0];
      this.aP9 = aP9;
      ppumvpd.this.AV25Loca = aP10[0];
      this.aP10 = aP10;
      ppumvpd.this.AV26TipE = aP11[0];
      this.aP11 = aP11;
      ppumvpd.this.AV27Resto = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00DV2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV23PartCod, Integer.valueOf(AV24CliCod), Integer.valueOf(AV18ExMvpAlb), AV25Loca});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2360ExtPdoLoc = P00DV2_A2360ExtPdoLoc[0] ;
         n2360ExtPdoLoc = P00DV2_n2360ExtPdoLoc[0] ;
         A252CliCod = P00DV2_A252CliCod[0] ;
         n252CliCod = P00DV2_n252CliCod[0] ;
         A966PartCod = P00DV2_A966PartCod[0] ;
         n966PartCod = P00DV2_n966PartCod[0] ;
         A2333ExtPdoAlb = P00DV2_A2333ExtPdoAlb[0] ;
         A396EmprCod = P00DV2_A396EmprCod[0] ;
         A457FasCod = P00DV2_A457FasCod[0] ;
         n457FasCod = P00DV2_n457FasCod[0] ;
         A2340ExtPdoKgR = P00DV2_A2340ExtPdoKgR[0] ;
         n2340ExtPdoKgR = P00DV2_n2340ExtPdoKgR[0] ;
         A2341ExtPdoCnR = P00DV2_A2341ExtPdoCnR[0] ;
         n2341ExtPdoCnR = P00DV2_n2341ExtPdoCnR[0] ;
         A2342ExtPdoKTR = P00DV2_A2342ExtPdoKTR[0] ;
         n2342ExtPdoKTR = P00DV2_n2342ExtPdoKTR[0] ;
         A2343ExtPdoCTR = P00DV2_A2343ExtPdoCTR[0] ;
         n2343ExtPdoCTR = P00DV2_n2343ExtPdoCTR[0] ;
         A2335ExtPdoEst = P00DV2_A2335ExtPdoEst[0] ;
         n2335ExtPdoEst = P00DV2_n2335ExtPdoEst[0] ;
         A2363ExtPdoEnt = P00DV2_A2363ExtPdoEnt[0] ;
         n2363ExtPdoEnt = P00DV2_n2363ExtPdoEnt[0] ;
         A2362ExtPdoRes = P00DV2_A2362ExtPdoRes[0] ;
         n2362ExtPdoRes = P00DV2_n2362ExtPdoRes[0] ;
         A2790ExtPdoLin = P00DV2_A2790ExtPdoLin[0] ;
         AV28ExMvpFas = A457FasCod ;
         if ( GXutil.strcmp(AV27Resto, httpContext.getMessage( "N", "")) == 0 )
         {
            A2340ExtPdoKgR = A2340ExtPdoKgR.add(AV20Kgs) ;
            n2340ExtPdoKgR = false ;
            A2341ExtPdoCnR = (int)(A2341ExtPdoCnR+AV21Conos) ;
            n2341ExtPdoCnR = false ;
         }
         else
         {
            A2342ExtPdoKTR = A2342ExtPdoKTR.add(AV20Kgs) ;
            n2342ExtPdoKTR = false ;
            A2343ExtPdoCTR = (int)(A2343ExtPdoCTR+AV21Conos) ;
            n2343ExtPdoCTR = false ;
         }
         if ( GXutil.strcmp(AV26TipE, httpContext.getMessage( "P", "")) == 0 )
         {
            A2335ExtPdoEst = (byte)(2) ;
            n2335ExtPdoEst = false ;
         }
         if ( GXutil.strcmp(AV26TipE, httpContext.getMessage( "T", "")) == 0 )
         {
            A2335ExtPdoEst = (byte)(3) ;
            n2335ExtPdoEst = false ;
         }
         A2363ExtPdoEnt = AV26TipE ;
         n2363ExtPdoEnt = false ;
         A2362ExtPdoRes = AV27Resto ;
         n2362ExtPdoRes = false ;
         /* Using cursor P00DV3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2340ExtPdoKgR), A2340ExtPdoKgR, Boolean.valueOf(n2341ExtPdoCnR), Integer.valueOf(A2341ExtPdoCnR), Boolean.valueOf(n2342ExtPdoKTR), A2342ExtPdoKTR, Boolean.valueOf(n2343ExtPdoCTR), Integer.valueOf(A2343ExtPdoCTR), Boolean.valueOf(n2335ExtPdoEst), Byte.valueOf(A2335ExtPdoEst), Boolean.valueOf(n2363ExtPdoEnt), A2363ExtPdoEnt, Boolean.valueOf(n2362ExtPdoRes), A2362ExtPdoRes, A396EmprCod, Integer.valueOf(A2333ExtPdoAlb), Short.valueOf(A2790ExtPdoLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTPD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00DV4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, AV28ExMvpFas});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P00DV4_A457FasCod[0] ;
         n457FasCod = P00DV4_n457FasCod[0] ;
         A396EmprCod = P00DV4_A396EmprCod[0] ;
         A460FasDsc = P00DV4_A460FasDsc[0] ;
         AV30ExMvpFdc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P00DV5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV28ExMvpFas});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2346ExMvpUln = P00DV5_A2346ExMvpUln[0] ;
         n2346ExMvpUln = P00DV5_n2346ExMvpUln[0] ;
         A2358ExMvpFas = P00DV5_A2358ExMvpFas[0] ;
         A2248ManCod = P00DV5_A2248ManCod[0] ;
         A396EmprCod = P00DV5_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2358ExMvpFas = A2358ExMvpFas ;
         /*
            INSERT RECORD ON TABLE TXPLEXMVP

         */
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2358ExMvpFas = A2358ExMvpFas ;
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2358ExMvpFas = AV28ExMvpFas ;
         A2347ExMvpLin = (short)(A2346ExMvpUln+1) ;
         A966PartCod = AV23PartCod ;
         n966PartCod = false ;
         A252CliCod = AV24CliCod ;
         n252CliCod = false ;
         A2348ExMvpTip = AV17ExMvpTip ;
         n2348ExMvpTip = false ;
         A2349ExMvpAlb = AV18ExMvpAlb ;
         n2349ExMvpAlb = false ;
         A2355ExMvpFeR = AV22FecMov ;
         n2355ExMvpFeR = false ;
         A2361ExMvpLoc = AV25Loca ;
         n2361ExMvpLoc = false ;
         A2379ExMvpExL = AV19RpExPdLi ;
         n2379ExMvpExL = false ;
         if ( GXutil.strcmp(AV27Resto, httpContext.getMessage( "N", "")) == 0 )
         {
            A2353ExMvpKgR = AV20Kgs ;
            n2353ExMvpKgR = false ;
            A2354ExMvpCnR = AV21Conos ;
            n2354ExMvpCnR = false ;
         }
         else
         {
            A2356ExMvpKRe = AV20Kgs ;
            n2356ExMvpKRe = false ;
            A2357ExMvpCRe = AV21Conos ;
            n2357ExMvpCRe = false ;
         }
         /* Using cursor P00DV6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Short.valueOf(A2347ExMvpLin), Boolean.valueOf(n2348ExMvpTip), A2348ExMvpTip, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n2349ExMvpAlb), Integer.valueOf(A2349ExMvpAlb), Boolean.valueOf(n2353ExMvpKgR), A2353ExMvpKgR, Boolean.valueOf(n2354ExMvpCnR), Short.valueOf(A2354ExMvpCnR), Boolean.valueOf(n2355ExMvpFeR), A2355ExMvpFeR, Boolean.valueOf(n2356ExMvpKRe), A2356ExMvpKRe, Boolean.valueOf(n2357ExMvpCRe), Short.valueOf(A2357ExMvpCRe), Boolean.valueOf(n2361ExMvpLoc), A2361ExMvpLoc, Boolean.valueOf(n2379ExMvpExL), Short.valueOf(A2379ExMvpExL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A2248ManCod = W2248ManCod ;
         A2358ExMvpFas = W2358ExMvpFas ;
         /* End Insert */
         A2346ExMvpUln = (short)(A2346ExMvpUln+1) ;
         n2346ExMvpUln = false ;
         /* Using cursor P00DV7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2346ExMvpUln), Short.valueOf(A2346ExMvpUln), A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVP");
         A396EmprCod = W396EmprCod ;
         A2248ManCod = W2248ManCod ;
         A2358ExMvpFas = W2358ExMvpFas ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P00DV8 */
      pr_default.execute(6, new Object[] {AV15EmprCod, AV23PartCod, Integer.valueOf(AV24CliCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A972PartULin = P00DV8_A972PartULin[0] ;
         n972PartULin = P00DV8_n972PartULin[0] ;
         A252CliCod = P00DV8_A252CliCod[0] ;
         n252CliCod = P00DV8_n252CliCod[0] ;
         A966PartCod = P00DV8_A966PartCod[0] ;
         n966PartCod = P00DV8_n966PartCod[0] ;
         A396EmprCod = P00DV8_A396EmprCod[0] ;
         A1456ParArtCod = P00DV8_A1456ParArtCod[0] ;
         n1456ParArtCod = P00DV8_n1456ParArtCod[0] ;
         A2376PartExt = P00DV8_A2376PartExt[0] ;
         n2376PartExt = P00DV8_n2376PartExt[0] ;
         W396EmprCod = A396EmprCod ;
         W966PartCod = A966PartCod ;
         n966PartCod = false ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         /*
            INSERT RECORD ON TABLE TXPLPARTI

         */
         W396EmprCod = A396EmprCod ;
         W966PartCod = A966PartCod ;
         n966PartCod = false ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         A396EmprCod = AV15EmprCod ;
         A966PartCod = AV23PartCod ;
         n966PartCod = false ;
         A252CliCod = AV24CliCod ;
         n252CliCod = false ;
         A979PartLin = (int)(A972PartULin+1) ;
         A980PartLinTip = httpContext.getMessage( "R", "") ;
         n980PartLinTip = false ;
         A981PartAlbDis = AV18ExMvpAlb ;
         n981PartAlbDis = false ;
         A982PartSitDis = httpContext.getMessage( "RECEPCION EXTERIOR", "") ;
         n982PartSitDis = false ;
         A986KilUti = AV20Kgs.multiply(DecimalUtil.doubleToDec((-1))) ;
         n986KilUti = false ;
         A987ConUti = (short)(AV21Conos*(-1)) ;
         n987ConUti = false ;
         A983PartFecMov = AV22FecMov ;
         n983PartFecMov = false ;
         A1877PartLoc = AV25Loca ;
         n1877PartLoc = false ;
         A2377ParExtLin = AV19RpExPdLi ;
         n2377ParExtLin = false ;
         /* Using cursor P00DV9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1877PartLoc), A1877PartLoc, Boolean.valueOf(n2377ParExtLin), Short.valueOf(A2377ParExtLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         if ( (pr_default.getStatus(7) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A966PartCod = W966PartCod ;
         n966PartCod = false ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         /* End Insert */
         A972PartULin = (int)(A972PartULin+1) ;
         n972PartULin = false ;
         if ( GXutil.strcmp(AV26TipE, httpContext.getMessage( "P", "")) == 0 )
         {
            A2376PartExt = (byte)(2) ;
            n2376PartExt = false ;
         }
         if ( GXutil.strcmp(AV26TipE, httpContext.getMessage( "T", "")) == 0 )
         {
            A2376PartExt = (byte)(3) ;
            n2376PartExt = false ;
         }
         /* Using cursor P00DV10 */
         pr_default.execute(8, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), Boolean.valueOf(n2376PartExt), Byte.valueOf(A2376PartExt), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         A396EmprCod = W396EmprCod ;
         A966PartCod = W966PartCod ;
         n966PartCod = false ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /* Using cursor P00DV11 */
      pr_default.execute(9, new Object[] {AV15EmprCod, AV23PartCod, Integer.valueOf(AV24CliCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A2272MovParULi = P00DV11_A2272MovParULi[0] ;
         n2272MovParULi = P00DV11_n2272MovParULi[0] ;
         A396EmprCod = P00DV11_A396EmprCod[0] ;
         A252CliCod = P00DV11_A252CliCod[0] ;
         n252CliCod = P00DV11_n252CliCod[0] ;
         A2268MovParCod = P00DV11_A2268MovParCod[0] ;
         A2269MovParArt = P00DV11_A2269MovParArt[0] ;
         n2269MovParArt = P00DV11_n2269MovParArt[0] ;
         W2268MovParCod = A2268MovParCod ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         /*
            INSERT RECORD ON TABLE TXPLMOVPD

         */
         W2268MovParCod = A2268MovParCod ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         A2268MovParCod = AV23PartCod ;
         A252CliCod = AV24CliCod ;
         n252CliCod = false ;
         A2276MovParLin = (short)(A2272MovParULi+1) ;
         A2277MovParLiT = httpContext.getMessage( "E", "") ;
         n2277MovParLiT = false ;
         A2278MovParAlb = AV18ExMvpAlb ;
         n2278MovParAlb = false ;
         A2280MovParFec = AV22FecMov ;
         n2280MovParFec = false ;
         A2281MovParKE = AV20Kgs ;
         n2281MovParKE = false ;
         A2282MovParCE = AV21Conos ;
         n2282MovParCE = false ;
         A2279MovParSit = httpContext.getMessage( "RECEPCION EXTERIOR", "") ;
         n2279MovParSit = false ;
         A2285MovParLoc = AV25Loca ;
         n2285MovParLoc = false ;
         A2378MovParExL = AV19RpExPdLi ;
         n2378MovParExL = false ;
         /* Using cursor P00DV12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A2268MovParCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin), Boolean.valueOf(n2277MovParLiT), A2277MovParLiT, Boolean.valueOf(n2278MovParAlb), Integer.valueOf(A2278MovParAlb), Boolean.valueOf(n2279MovParSit), A2279MovParSit, Boolean.valueOf(n2280MovParFec), A2280MovParFec, Boolean.valueOf(n2281MovParKE), A2281MovParKE, Boolean.valueOf(n2282MovParCE), Short.valueOf(A2282MovParCE), Boolean.valueOf(n2285MovParLoc), A2285MovParLoc, Boolean.valueOf(n2378MovParExL), Short.valueOf(A2378MovParExL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
         if ( (pr_default.getStatus(10) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A2268MovParCod = W2268MovParCod ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         /* End Insert */
         A2272MovParULi = (short)(A2272MovParULi+1) ;
         n2272MovParULi = false ;
         /* Using cursor P00DV13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n2272MovParULi), Short.valueOf(A2272MovParULi), A396EmprCod, A2268MovParCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMOVPD");
         A2268MovParCod = W2268MovParCod ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppumvpd.this.AV15EmprCod;
      this.aP1[0] = ppumvpd.this.AV16ManCod;
      this.aP2[0] = ppumvpd.this.AV17ExMvpTip;
      this.aP3[0] = ppumvpd.this.AV18ExMvpAlb;
      this.aP4[0] = ppumvpd.this.AV19RpExPdLi;
      this.aP5[0] = ppumvpd.this.AV20Kgs;
      this.aP6[0] = ppumvpd.this.AV21Conos;
      this.aP7[0] = ppumvpd.this.AV22FecMov;
      this.aP8[0] = ppumvpd.this.AV23PartCod;
      this.aP9[0] = ppumvpd.this.AV24CliCod;
      this.aP10[0] = ppumvpd.this.AV25Loca;
      this.aP11[0] = ppumvpd.this.AV26TipE;
      this.aP12[0] = ppumvpd.this.AV27Resto;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppumvpd");
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
      P00DV2_A2360ExtPdoLoc = new String[] {""} ;
      P00DV2_n2360ExtPdoLoc = new boolean[] {false} ;
      P00DV2_A252CliCod = new int[1] ;
      P00DV2_n252CliCod = new boolean[] {false} ;
      P00DV2_A966PartCod = new String[] {""} ;
      P00DV2_n966PartCod = new boolean[] {false} ;
      P00DV2_A2333ExtPdoAlb = new int[1] ;
      P00DV2_A396EmprCod = new String[] {""} ;
      P00DV2_A457FasCod = new String[] {""} ;
      P00DV2_n457FasCod = new boolean[] {false} ;
      P00DV2_A2340ExtPdoKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DV2_n2340ExtPdoKgR = new boolean[] {false} ;
      P00DV2_A2341ExtPdoCnR = new int[1] ;
      P00DV2_n2341ExtPdoCnR = new boolean[] {false} ;
      P00DV2_A2342ExtPdoKTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DV2_n2342ExtPdoKTR = new boolean[] {false} ;
      P00DV2_A2343ExtPdoCTR = new int[1] ;
      P00DV2_n2343ExtPdoCTR = new boolean[] {false} ;
      P00DV2_A2335ExtPdoEst = new byte[1] ;
      P00DV2_n2335ExtPdoEst = new boolean[] {false} ;
      P00DV2_A2363ExtPdoEnt = new String[] {""} ;
      P00DV2_n2363ExtPdoEnt = new boolean[] {false} ;
      P00DV2_A2362ExtPdoRes = new String[] {""} ;
      P00DV2_n2362ExtPdoRes = new boolean[] {false} ;
      P00DV2_A2790ExtPdoLin = new short[1] ;
      A2360ExtPdoLoc = "" ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A2340ExtPdoKgR = DecimalUtil.ZERO ;
      A2342ExtPdoKTR = DecimalUtil.ZERO ;
      A2363ExtPdoEnt = "" ;
      A2362ExtPdoRes = "" ;
      AV28ExMvpFas = "" ;
      P00DV4_A457FasCod = new String[] {""} ;
      P00DV4_n457FasCod = new boolean[] {false} ;
      P00DV4_A396EmprCod = new String[] {""} ;
      P00DV4_A460FasDsc = new String[] {""} ;
      A460FasDsc = "" ;
      AV30ExMvpFdc = "" ;
      P00DV5_A2346ExMvpUln = new short[1] ;
      P00DV5_n2346ExMvpUln = new boolean[] {false} ;
      P00DV5_A2358ExMvpFas = new String[] {""} ;
      P00DV5_A2248ManCod = new short[1] ;
      P00DV5_A396EmprCod = new String[] {""} ;
      A2358ExMvpFas = "" ;
      W396EmprCod = "" ;
      W2358ExMvpFas = "" ;
      A2348ExMvpTip = "" ;
      A2355ExMvpFeR = GXutil.nullDate() ;
      A2361ExMvpLoc = "" ;
      A2353ExMvpKgR = DecimalUtil.ZERO ;
      A2356ExMvpKRe = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P00DV8_A972PartULin = new int[1] ;
      P00DV8_n972PartULin = new boolean[] {false} ;
      P00DV8_A252CliCod = new int[1] ;
      P00DV8_n252CliCod = new boolean[] {false} ;
      P00DV8_A966PartCod = new String[] {""} ;
      P00DV8_n966PartCod = new boolean[] {false} ;
      P00DV8_A396EmprCod = new String[] {""} ;
      P00DV8_A1456ParArtCod = new String[] {""} ;
      P00DV8_n1456ParArtCod = new boolean[] {false} ;
      P00DV8_A2376PartExt = new byte[1] ;
      P00DV8_n2376PartExt = new boolean[] {false} ;
      A1456ParArtCod = "" ;
      W966PartCod = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      A1877PartLoc = "" ;
      P00DV11_A2272MovParULi = new short[1] ;
      P00DV11_n2272MovParULi = new boolean[] {false} ;
      P00DV11_A396EmprCod = new String[] {""} ;
      P00DV11_A252CliCod = new int[1] ;
      P00DV11_n252CliCod = new boolean[] {false} ;
      P00DV11_A2268MovParCod = new String[] {""} ;
      P00DV11_A2269MovParArt = new String[] {""} ;
      P00DV11_n2269MovParArt = new boolean[] {false} ;
      A2268MovParCod = "" ;
      A2269MovParArt = "" ;
      W2268MovParCod = "" ;
      A2277MovParLiT = "" ;
      A2280MovParFec = GXutil.nullDate() ;
      A2281MovParKE = DecimalUtil.ZERO ;
      A2279MovParSit = "" ;
      A2285MovParLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppumvpd__default(),
         new Object[] {
             new Object[] {
            P00DV2_A2360ExtPdoLoc, P00DV2_n2360ExtPdoLoc, P00DV2_A252CliCod, P00DV2_n252CliCod, P00DV2_A966PartCod, P00DV2_n966PartCod, P00DV2_A2333ExtPdoAlb, P00DV2_A396EmprCod, P00DV2_A457FasCod, P00DV2_n457FasCod,
            P00DV2_A2340ExtPdoKgR, P00DV2_n2340ExtPdoKgR, P00DV2_A2341ExtPdoCnR, P00DV2_n2341ExtPdoCnR, P00DV2_A2342ExtPdoKTR, P00DV2_n2342ExtPdoKTR, P00DV2_A2343ExtPdoCTR, P00DV2_n2343ExtPdoCTR, P00DV2_A2335ExtPdoEst, P00DV2_n2335ExtPdoEst,
            P00DV2_A2363ExtPdoEnt, P00DV2_n2363ExtPdoEnt, P00DV2_A2362ExtPdoRes, P00DV2_n2362ExtPdoRes, P00DV2_A2790ExtPdoLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00DV4_A457FasCod, P00DV4_A396EmprCod, P00DV4_A460FasDsc
            }
            , new Object[] {
            P00DV5_A2346ExMvpUln, P00DV5_n2346ExMvpUln, P00DV5_A2358ExMvpFas, P00DV5_A2248ManCod, P00DV5_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00DV8_A972PartULin, P00DV8_n972PartULin, P00DV8_A252CliCod, P00DV8_A966PartCod, P00DV8_A396EmprCod, P00DV8_A1456ParArtCod, P00DV8_n1456ParArtCod, P00DV8_A2376PartExt, P00DV8_n2376PartExt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00DV11_A2272MovParULi, P00DV11_n2272MovParULi, P00DV11_A396EmprCod, P00DV11_A252CliCod, P00DV11_A2268MovParCod, P00DV11_A2269MovParArt, P00DV11_n2269MovParArt
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
   private byte A2376PartExt ;
   private short AV16ManCod ;
   private short AV19RpExPdLi ;
   private short AV21Conos ;
   private short A2790ExtPdoLin ;
   private short A2346ExMvpUln ;
   private short A2248ManCod ;
   private short W2248ManCod ;
   private short A2347ExMvpLin ;
   private short A2379ExMvpExL ;
   private short A2354ExMvpCnR ;
   private short A2357ExMvpCRe ;
   private short Gx_err ;
   private short A987ConUti ;
   private short A2377ParExtLin ;
   private short A2272MovParULi ;
   private short A2276MovParLin ;
   private short A2282MovParCE ;
   private short A2378MovParExL ;
   private int AV18ExMvpAlb ;
   private int AV24CliCod ;
   private int A252CliCod ;
   private int A2333ExtPdoAlb ;
   private int A2341ExtPdoCnR ;
   private int A2343ExtPdoCTR ;
   private int GX_INS320 ;
   private int A2349ExMvpAlb ;
   private int A972PartULin ;
   private int W252CliCod ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private int GX_INS308 ;
   private int A2278MovParAlb ;
   private java.math.BigDecimal AV20Kgs ;
   private java.math.BigDecimal A2340ExtPdoKgR ;
   private java.math.BigDecimal A2342ExtPdoKTR ;
   private java.math.BigDecimal A2353ExMvpKgR ;
   private java.math.BigDecimal A2356ExMvpKRe ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A2281MovParKE ;
   private String AV15EmprCod ;
   private String AV17ExMvpTip ;
   private String AV23PartCod ;
   private String AV25Loca ;
   private String AV26TipE ;
   private String AV27Resto ;
   private String scmdbuf ;
   private String A2360ExtPdoLoc ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A2363ExtPdoEnt ;
   private String A2362ExtPdoRes ;
   private String AV28ExMvpFas ;
   private String A460FasDsc ;
   private String AV30ExMvpFdc ;
   private String A2358ExMvpFas ;
   private String W396EmprCod ;
   private String W2358ExMvpFas ;
   private String A2348ExMvpTip ;
   private String A2361ExMvpLoc ;
   private String Gx_emsg ;
   private String A1456ParArtCod ;
   private String W966PartCod ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String A1877PartLoc ;
   private String A2268MovParCod ;
   private String A2269MovParArt ;
   private String W2268MovParCod ;
   private String A2277MovParLiT ;
   private String A2279MovParSit ;
   private String A2285MovParLoc ;
   private java.util.Date AV22FecMov ;
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
   private boolean n2335ExtPdoEst ;
   private boolean n2363ExtPdoEnt ;
   private boolean n2362ExtPdoRes ;
   private boolean n2346ExMvpUln ;
   private boolean n2348ExMvpTip ;
   private boolean n2349ExMvpAlb ;
   private boolean n2355ExMvpFeR ;
   private boolean n2361ExMvpLoc ;
   private boolean n2379ExMvpExL ;
   private boolean n2353ExMvpKgR ;
   private boolean n2354ExMvpCnR ;
   private boolean n2356ExMvpKRe ;
   private boolean n2357ExMvpCRe ;
   private boolean n972PartULin ;
   private boolean n1456ParArtCod ;
   private boolean n2376PartExt ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n983PartFecMov ;
   private boolean n1877PartLoc ;
   private boolean n2377ParExtLin ;
   private boolean n2272MovParULi ;
   private boolean n2269MovParArt ;
   private boolean n2277MovParLiT ;
   private boolean n2278MovParAlb ;
   private boolean n2280MovParFec ;
   private boolean n2281MovParKE ;
   private boolean n2282MovParCE ;
   private boolean n2279MovParSit ;
   private boolean n2285MovParLoc ;
   private boolean n2378MovParExL ;
   private String[] aP12 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.util.Date[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DV2_A2360ExtPdoLoc ;
   private boolean[] P00DV2_n2360ExtPdoLoc ;
   private int[] P00DV2_A252CliCod ;
   private boolean[] P00DV2_n252CliCod ;
   private String[] P00DV2_A966PartCod ;
   private boolean[] P00DV2_n966PartCod ;
   private int[] P00DV2_A2333ExtPdoAlb ;
   private String[] P00DV2_A396EmprCod ;
   private String[] P00DV2_A457FasCod ;
   private boolean[] P00DV2_n457FasCod ;
   private java.math.BigDecimal[] P00DV2_A2340ExtPdoKgR ;
   private boolean[] P00DV2_n2340ExtPdoKgR ;
   private int[] P00DV2_A2341ExtPdoCnR ;
   private boolean[] P00DV2_n2341ExtPdoCnR ;
   private java.math.BigDecimal[] P00DV2_A2342ExtPdoKTR ;
   private boolean[] P00DV2_n2342ExtPdoKTR ;
   private int[] P00DV2_A2343ExtPdoCTR ;
   private boolean[] P00DV2_n2343ExtPdoCTR ;
   private byte[] P00DV2_A2335ExtPdoEst ;
   private boolean[] P00DV2_n2335ExtPdoEst ;
   private String[] P00DV2_A2363ExtPdoEnt ;
   private boolean[] P00DV2_n2363ExtPdoEnt ;
   private String[] P00DV2_A2362ExtPdoRes ;
   private boolean[] P00DV2_n2362ExtPdoRes ;
   private short[] P00DV2_A2790ExtPdoLin ;
   private String[] P00DV4_A457FasCod ;
   private boolean[] P00DV4_n457FasCod ;
   private String[] P00DV4_A396EmprCod ;
   private String[] P00DV4_A460FasDsc ;
   private short[] P00DV5_A2346ExMvpUln ;
   private boolean[] P00DV5_n2346ExMvpUln ;
   private String[] P00DV5_A2358ExMvpFas ;
   private short[] P00DV5_A2248ManCod ;
   private String[] P00DV5_A396EmprCod ;
   private int[] P00DV8_A972PartULin ;
   private boolean[] P00DV8_n972PartULin ;
   private int[] P00DV8_A252CliCod ;
   private boolean[] P00DV8_n252CliCod ;
   private String[] P00DV8_A966PartCod ;
   private boolean[] P00DV8_n966PartCod ;
   private String[] P00DV8_A396EmprCod ;
   private String[] P00DV8_A1456ParArtCod ;
   private boolean[] P00DV8_n1456ParArtCod ;
   private byte[] P00DV8_A2376PartExt ;
   private boolean[] P00DV8_n2376PartExt ;
   private short[] P00DV11_A2272MovParULi ;
   private boolean[] P00DV11_n2272MovParULi ;
   private String[] P00DV11_A396EmprCod ;
   private int[] P00DV11_A252CliCod ;
   private boolean[] P00DV11_n252CliCod ;
   private String[] P00DV11_A2268MovParCod ;
   private String[] P00DV11_A2269MovParArt ;
   private boolean[] P00DV11_n2269MovParArt ;
}

final  class ppumvpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DV2", "SELECT ExtPdoLoc, CliCod, PartCod, ExtPdoAlb, EmprCod, FasCod, ExtPdoKgR, ExtPdoCnR, ExtPdoKTR, ExtPdoCTR, ExtPdoEst, ExtPdoEnt, ExtPdoRes, ExtPdoLin FROM TXPLEXTPD WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (ExtPdoAlb = ?) AND (ExtPdoLoc = ?) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DV3", "UPDATE TXPLEXTPD SET ExtPdoKgR=?, ExtPdoCnR=?, ExtPdoKTR=?, ExtPdoCTR=?, ExtPdoEst=?, ExtPdoEnt=?, ExtPdoRes=?  WHERE EmprCod = ? AND ExtPdoAlb = ? AND ExtPdoLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTPD")
         ,new ForEachCursor("P00DV4", "SELECT FasCod, EmprCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DV5", "SELECT ExMvpUln, ExMvpFas, ManCod, EmprCod FROM TXPCEXMVP WHERE EmprCod = ? and ManCod = ? and ExMvpFas = ? ORDER BY EmprCod, ManCod, ExMvpFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DV6", "INSERT INTO TXPLEXMVP(EmprCod, ManCod, ExMvpFas, ExMvpLin, ExMvpTip, PartCod, CliCod, ExMvpAlb, ExMvpKgR, ExMvpCnR, ExMvpFeR, ExMvpKRe, ExMvpCRe, ExMvpLoc, ExMvpExL, ExMvpKgE, ExMvpCnE, ExMvpFeE) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
         ,new UpdateCursor("P00DV7", "UPDATE TXPCEXMVP SET ExMvpUln=?  WHERE EmprCod = ? AND ManCod = ? AND ExMvpFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVP")
         ,new ForEachCursor("P00DV8", "SELECT PartULin, CliCod, PartCod, EmprCod, ParArtCod, PartExt FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DV9", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, PartLoc, ParExtLin, TrnCod, KilEnt, ConEnt, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P00DV10", "UPDATE TXPCPARTI SET PartULin=?, PartExt=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P00DV11", "SELECT MovParULi, EmprCod, CliCod, MovParCod, MovParArt FROM TXPCMOVPD WHERE EmprCod = ? and MovParCod = ? and CliCod = ? ORDER BY EmprCod, MovParCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DV12", "INSERT INTO TXPLMOVPD(EmprCod, MovParCod, CliCod, MovParLin, MovParLiT, MovParAlb, MovParSit, MovParFec, MovParKE, MovParCE, MovParLoc, MovParExL, MovParKU, MovParCU) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
         ,new UpdateCursor("P00DV13", "UPDATE TXPCMOVPD SET MovParULi=?  WHERE EmprCod = ? AND MovParCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMOVPD")
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
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setShort(10, ((Number) parms[16]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[25]).shortValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[21]).shortValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
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
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
      }
   }

}

