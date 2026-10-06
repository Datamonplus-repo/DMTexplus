package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdesfac extends GXProcedure
{
   public pdesfac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdesfac.class ), "" );
   }

   public pdesfac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      pdesfac.this.A396EmprCod = aP0;
      pdesfac.this.AV15NumFac = aP1;
      pdesfac.this.AV16PRIO = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV29FlagRieClF ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RIECLF", ""), GXv_int1) ;
      pdesfac.this.AV29FlagRieClF = GXv_int1[0] ;
      GXv_int1[0] = AV31Itram ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int1) ;
      pdesfac.this.AV31Itram = GXv_int1[0] ;
      GXv_int1[0] = AV32Moda21 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pdesfac.this.AV32Moda21 = GXv_int1[0] ;
      AV20Flag = (byte)(0) ;
      /* Using cursor P00352 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15NumFac), A396EmprCod, Integer.valueOf(AV15NumFac)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A430FacCod = P00352_A430FacCod[0] ;
         A252CliCod = P00352_A252CliCod[0] ;
         A11513FacRecIca = P00352_A11513FacRecIca[0] ;
         A8346FacRecI = P00352_A8346FacRecI[0] ;
         n8346FacRecI = P00352_n8346FacRecI[0] ;
         A7212FacRect = P00352_A7212FacRect[0] ;
         A453FacRECPor = P00352_A453FacRECPor[0] ;
         A443FacIVAPor = P00352_A443FacIVAPor[0] ;
         A14224FacCostFac = P00352_A14224FacCostFac[0] ;
         A14223FacCostKgs = P00352_A14223FacCostKgs[0] ;
         A14222FacCostMts = P00352_A14222FacCostMts[0] ;
         A434FacDtoPP = P00352_A434FacDtoPP[0] ;
         A433FacDtoGen = P00352_A433FacDtoGen[0] ;
         A14219FacEnergia = P00352_A14219FacEnergia[0] ;
         /* Using cursor P00353 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         A7209Colombia = P00353_A7209Colombia[0] ;
         n7209Colombia = P00353_n7209Colombia[0] ;
         pr_default.close(1);
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         /* Using cursor P00355 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A3918FacImpTot1 = P00355_A3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         }
         pr_default.close(2);
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         AV30SaveFacTot = A455FacTot ;
         /* Optimized DELETE. */
         /* Using cursor P00356 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
         /* End optimized DELETE. */
         /* Using cursor P00357 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A427FacAlbCod = P00357_A427FacAlbCod[0] ;
            A428FacAlbTip = P00357_A428FacAlbTip[0] ;
            A446FacLin = P00357_A446FacLin[0] ;
            AV28FacAlbCod = A427FacAlbCod ;
            if ( A428FacAlbTip == 1 )
            {
               /* Execute user subroutine: 'CALPRD' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            if ( A428FacAlbTip == 2 )
            {
               /* Execute user subroutine: 'CALCOM' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Using cursor P00358 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P00359 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         AV20Flag = (byte)(1) ;
         if ( AV29FlagRieClF == 1 )
         {
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_int4[0] = A430FacCod ;
            GXv_char5[0] = httpContext.getMessage( "B", "") ;
            GXv_decimal6[0] = AV30SaveFacTot ;
            new app.prieclup(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_decimal6) ;
            pdesfac.this.A396EmprCod = GXv_char2[0] ;
            pdesfac.this.A252CliCod = GXv_int3[0] ;
            pdesfac.this.A430FacCod = GXv_int4[0] ;
            pdesfac.this.AV30SaveFacTot = GXv_decimal6[0] ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      if ( AV20Flag == 1 )
      {
         if ( GXutil.strcmp(AV16PRIO, "1") == 0 )
         {
            AV18ContCod = "040200" ;
         }
         else
         {
            AV18ContCod = "040100" ;
         }
         /* Optimized UPDATE. */
         /* Using cursor P003510 */
         pr_default.execute(7, new Object[] {A396EmprCod, AV18ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALPRD' Routine */
      returnInSub = false ;
      /* Using cursor P003511 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(AV28FacAlbCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A30AlbProCod = P003511_A30AlbProCod[0] ;
         A33AlbProEst = P003511_A33AlbProEst[0] ;
         A1782AlbProEso = P003511_A1782AlbProEso[0] ;
         A2242AlbSec = P003511_A2242AlbSec[0] ;
         A33AlbProEst = (byte)(1) ;
         A1782AlbProEso = (byte)(1) ;
         AV24AlbSec = A2242AlbSec ;
         if ( AV32Moda21 == 1 )
         {
            /* Using cursor P003512 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A130BarCodPar = P003512_A130BarCodPar[0] ;
               A132BarCodReo = P003512_A132BarCodReo[0] ;
               A129BarCod = P003512_A129BarCod[0] ;
               A2395BarAlbExt = P003512_A2395BarAlbExt[0] ;
               n2395BarAlbExt = P003512_n2395BarAlbExt[0] ;
               A2243BarKgsCli = P003512_A2243BarKgsCli[0] ;
               n2243BarKgsCli = P003512_n2243BarKgsCli[0] ;
               A1261BarAlbKgmE = P003512_A1261BarAlbKgmE[0] ;
               A1461BarAlbPN = P003512_A1461BarAlbPN[0] ;
               A1263BarAlbMtrE = P003512_A1263BarAlbMtrE[0] ;
               A2395BarAlbExt = 0 ;
               n2395BarAlbExt = false ;
               if ( A2243BarKgsCli.doubleValue() != 0 )
               {
                  A1261BarAlbKgmE = A2243BarKgsCli ;
                  A2243BarKgsCli = DecimalUtil.doubleToDec(0) ;
                  n2243BarKgsCli = false ;
               }
               if ( A1461BarAlbPN.doubleValue() != 0 )
               {
                  A1263BarAlbMtrE = A1461BarAlbPN ;
                  A1461BarAlbPN = DecimalUtil.doubleToDec(0) ;
               }
               /* Using cursor P003513 */
               pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A457FasCod = P003513_A457FasCod[0] ;
                  A8194GuiFasPBK = P003513_A8194GuiFasPBK[0] ;
                  n8194GuiFasPBK = P003513_n8194GuiFasPBK[0] ;
                  A1275FasKgm = P003513_A1275FasKgm[0] ;
                  A8195GuiFasPBM = P003513_A8195GuiFasPBM[0] ;
                  n8195GuiFasPBM = P003513_n8195GuiFasPBM[0] ;
                  A1276FasMtr = P003513_A1276FasMtr[0] ;
                  A1240GuiFasLin = P003513_A1240GuiFasLin[0] ;
                  if ( GXutil.strcmp(A457FasCod, "618     ") != 0 )
                  {
                     if ( A8194GuiFasPBK.doubleValue() != 0 )
                     {
                        A1275FasKgm = A8194GuiFasPBK ;
                        A8194GuiFasPBK = DecimalUtil.doubleToDec(0) ;
                        n8194GuiFasPBK = false ;
                     }
                     if ( A8195GuiFasPBM.doubleValue() != 0 )
                     {
                        A1276FasMtr = A8195GuiFasPBM ;
                        A8195GuiFasPBM = DecimalUtil.doubleToDec(0) ;
                        n8195GuiFasPBM = false ;
                     }
                  }
                  /* Using cursor P003514 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, A1275FasKgm, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, A1276FasMtr, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               /* Using cursor P003515 */
               pr_default.execute(12, new Object[] {Boolean.valueOf(n2395BarAlbExt), Integer.valueOf(A2395BarAlbExt), Boolean.valueOf(n2243BarKgsCli), A2243BarKgsCli, A1261BarAlbKgmE, A1461BarAlbPN, A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
               pr_default.readNext(9);
            }
            pr_default.close(9);
         }
         /* Using cursor P003516 */
         pr_default.execute(13, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S121( )
   {
      /* 'CALCOM' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P003517 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(AV28FacAlbCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
      /* End optimized UPDATE. */
      if ( AV31Itram == 1 )
      {
         /* Using cursor P003518 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(AV28FacAlbCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A14AlbComCod = P003518_A14AlbComCod[0] ;
            A3094AlbCSec = P003518_A3094AlbCSec[0] ;
            if ( GXutil.strcmp(A3094AlbCSec, "A") == 0 )
            {
               /* Optimized DELETE. */
               /* Using cursor P003519 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
               /* End optimized DELETE. */
               /* Using cursor P003520 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pdesfac");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00352_A396EmprCod = new String[] {""} ;
      P00352_A430FacCod = new int[1] ;
      P00352_A252CliCod = new int[1] ;
      P00352_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_n8346FacRecI = new boolean[] {false} ;
      P00352_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A443FacIVAPor = new byte[1] ;
      P00352_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00352_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P00353_A7209Colombia = new byte[1] ;
      P00353_n7209Colombia = new boolean[] {false} ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      P00355_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV30SaveFacTot = DecimalUtil.ZERO ;
      P00357_A396EmprCod = new String[] {""} ;
      P00357_A430FacCod = new int[1] ;
      P00357_A427FacAlbCod = new long[1] ;
      P00357_A428FacAlbTip = new byte[1] ;
      P00357_A446FacLin = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV18ContCod = "" ;
      P003511_A396EmprCod = new String[] {""} ;
      P003511_A30AlbProCod = new long[1] ;
      P003511_A33AlbProEst = new byte[1] ;
      P003511_A1782AlbProEso = new byte[1] ;
      P003511_A2242AlbSec = new String[] {""} ;
      A2242AlbSec = "" ;
      AV24AlbSec = "" ;
      P003512_A396EmprCod = new String[] {""} ;
      P003512_A30AlbProCod = new long[1] ;
      P003512_A130BarCodPar = new String[] {""} ;
      P003512_A132BarCodReo = new byte[1] ;
      P003512_A129BarCod = new int[1] ;
      P003512_A2395BarAlbExt = new int[1] ;
      P003512_n2395BarAlbExt = new boolean[] {false} ;
      P003512_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003512_n2243BarKgsCli = new boolean[] {false} ;
      P003512_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003512_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003512_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P003513_A396EmprCod = new String[] {""} ;
      P003513_A30AlbProCod = new long[1] ;
      P003513_A129BarCod = new int[1] ;
      P003513_A132BarCodReo = new byte[1] ;
      P003513_A130BarCodPar = new String[] {""} ;
      P003513_A457FasCod = new String[] {""} ;
      P003513_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003513_n8194GuiFasPBK = new boolean[] {false} ;
      P003513_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003513_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003513_n8195GuiFasPBM = new boolean[] {false} ;
      P003513_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003513_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      P003518_A396EmprCod = new String[] {""} ;
      P003518_A14AlbComCod = new int[1] ;
      P003518_A3094AlbCSec = new String[] {""} ;
      A3094AlbCSec = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pdesfac__default(),
         new Object[] {
             new Object[] {
            P00352_A396EmprCod, P00352_A430FacCod, P00352_A252CliCod, P00352_A11513FacRecIca, P00352_A8346FacRecI, P00352_n8346FacRecI, P00352_A7212FacRect, P00352_A453FacRECPor, P00352_A443FacIVAPor, P00352_A14224FacCostFac,
            P00352_A14223FacCostKgs, P00352_A14222FacCostMts, P00352_A434FacDtoPP, P00352_A433FacDtoGen, P00352_A14219FacEnergia
            }
            , new Object[] {
            P00353_A7209Colombia, P00353_n7209Colombia
            }
            , new Object[] {
            P00355_A3918FacImpTot1
            }
            , new Object[] {
            }
            , new Object[] {
            P00357_A396EmprCod, P00357_A430FacCod, P00357_A427FacAlbCod, P00357_A428FacAlbTip, P00357_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003511_A396EmprCod, P003511_A30AlbProCod, P003511_A33AlbProEst, P003511_A1782AlbProEso, P003511_A2242AlbSec
            }
            , new Object[] {
            P003512_A396EmprCod, P003512_A30AlbProCod, P003512_A130BarCodPar, P003512_A132BarCodReo, P003512_A129BarCod, P003512_A2395BarAlbExt, P003512_n2395BarAlbExt, P003512_A2243BarKgsCli, P003512_n2243BarKgsCli, P003512_A1261BarAlbKgmE,
            P003512_A1461BarAlbPN, P003512_A1263BarAlbMtrE
            }
            , new Object[] {
            P003513_A396EmprCod, P003513_A30AlbProCod, P003513_A129BarCod, P003513_A132BarCodReo, P003513_A130BarCodPar, P003513_A457FasCod, P003513_A8194GuiFasPBK, P003513_n8194GuiFasPBK, P003513_A1275FasKgm, P003513_A8195GuiFasPBM,
            P003513_n8195GuiFasPBM, P003513_A1276FasMtr, P003513_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003518_A396EmprCod, P003518_A14AlbComCod, P003518_A3094AlbCSec
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

   private byte AV29FlagRieClF ;
   private byte AV31Itram ;
   private byte AV32Moda21 ;
   private byte GXv_int1[] ;
   private byte AV20Flag ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte A428FacAlbTip ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV15NumFac ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int A446FacLin ;
   private int GXv_int3[] ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private int A2395BarAlbExt ;
   private int A14AlbComCod ;
   private long A427FacAlbCod ;
   private long AV28FacAlbCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV30SaveFacTot ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1276FasMtr ;
   private String A396EmprCod ;
   private String AV16PRIO ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV18ContCod ;
   private String A2242AlbSec ;
   private String AV24AlbSec ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A3094AlbCSec ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean n2395BarAlbExt ;
   private boolean n2243BarKgsCli ;
   private boolean n8194GuiFasPBK ;
   private boolean n8195GuiFasPBM ;
   private IDataStoreProvider pr_default ;
   private String[] P00352_A396EmprCod ;
   private int[] P00352_A430FacCod ;
   private int[] P00352_A252CliCod ;
   private java.math.BigDecimal[] P00352_A11513FacRecIca ;
   private java.math.BigDecimal[] P00352_A8346FacRecI ;
   private boolean[] P00352_n8346FacRecI ;
   private java.math.BigDecimal[] P00352_A7212FacRect ;
   private java.math.BigDecimal[] P00352_A453FacRECPor ;
   private byte[] P00352_A443FacIVAPor ;
   private java.math.BigDecimal[] P00352_A14224FacCostFac ;
   private java.math.BigDecimal[] P00352_A14223FacCostKgs ;
   private java.math.BigDecimal[] P00352_A14222FacCostMts ;
   private java.math.BigDecimal[] P00352_A434FacDtoPP ;
   private java.math.BigDecimal[] P00352_A433FacDtoGen ;
   private java.math.BigDecimal[] P00352_A14219FacEnergia ;
   private byte[] P00353_A7209Colombia ;
   private boolean[] P00353_n7209Colombia ;
   private java.math.BigDecimal[] P00355_A3918FacImpTot1 ;
   private String[] P00357_A396EmprCod ;
   private int[] P00357_A430FacCod ;
   private long[] P00357_A427FacAlbCod ;
   private byte[] P00357_A428FacAlbTip ;
   private int[] P00357_A446FacLin ;
   private String[] P003511_A396EmprCod ;
   private long[] P003511_A30AlbProCod ;
   private byte[] P003511_A33AlbProEst ;
   private byte[] P003511_A1782AlbProEso ;
   private String[] P003511_A2242AlbSec ;
   private String[] P003512_A396EmprCod ;
   private long[] P003512_A30AlbProCod ;
   private String[] P003512_A130BarCodPar ;
   private byte[] P003512_A132BarCodReo ;
   private int[] P003512_A129BarCod ;
   private int[] P003512_A2395BarAlbExt ;
   private boolean[] P003512_n2395BarAlbExt ;
   private java.math.BigDecimal[] P003512_A2243BarKgsCli ;
   private boolean[] P003512_n2243BarKgsCli ;
   private java.math.BigDecimal[] P003512_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P003512_A1461BarAlbPN ;
   private java.math.BigDecimal[] P003512_A1263BarAlbMtrE ;
   private String[] P003513_A396EmprCod ;
   private long[] P003513_A30AlbProCod ;
   private int[] P003513_A129BarCod ;
   private byte[] P003513_A132BarCodReo ;
   private String[] P003513_A130BarCodPar ;
   private String[] P003513_A457FasCod ;
   private java.math.BigDecimal[] P003513_A8194GuiFasPBK ;
   private boolean[] P003513_n8194GuiFasPBK ;
   private java.math.BigDecimal[] P003513_A1275FasKgm ;
   private java.math.BigDecimal[] P003513_A8195GuiFasPBM ;
   private boolean[] P003513_n8195GuiFasPBM ;
   private java.math.BigDecimal[] P003513_A1276FasMtr ;
   private short[] P003513_A1240GuiFasLin ;
   private String[] P003518_A396EmprCod ;
   private int[] P003518_A14AlbComCod ;
   private String[] P003518_A3094AlbCSec ;
}

final  class pdesfac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00352", "SELECT EmprCod, FacCod, CliCod, FacRecIca, FacRecI, FacRect, FacRECPor, FacIVAPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoPP, FacDtoGen, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00353", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00355", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00356", "DELETE FROM TXPFACVTO  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFACVTO")
         ,new ForEachCursor("P00357", "SELECT EmprCod, FacCod, FacAlbCod, FacAlbTip, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod  FOR UPDATE OF FacAlbCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00358", "DELETE FROM TXPLFAVEN  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P00359", "DELETE FROM TXPCFAVEN  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new UpdateCursor("P003510", "UPDATE TXPEMPLIN SET ContVal=ContVal - 1  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P003511", "SELECT EmprCod, AlbProCod, AlbProEst, AlbProEso, AlbSec FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003512", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbExt, BarKgsCli, BarAlbKgmE, BarAlbPN, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF BarAlbExt, BarKgsCli, BarAlbKgmE, BarAlbPN, BarAlbMtrE NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003513", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasPBK, FasKgm, GuiFasPBM, FasMtr, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF GuiFasPBK, FasKgm, GuiFasPBM, FasMtr NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003514", "UPDATE TXPALBFAS SET GuiFasPBK=?, FasKgm=?, GuiFasPBM=?, FasMtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P003515", "UPDATE TXPALBBAR SET BarAlbExt=?, BarKgsCli=?, BarAlbKgmE=?, BarAlbPN=?, BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P003516", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P003517", "UPDATE TXPCALCOM SET AlbComEso=1, AlbComEst=1  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P003518", "SELECT EmprCod, AlbComCod, AlbCSec FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod  FOR UPDATE OF AlbCSec NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003519", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
         ,new UpdateCursor("P003520", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(5, (String)parms[6], 3);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               return;
            case 12 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(6, (String)parms[7], 3);
               stmt.setLong(7, ((Number) parms[8]).longValue());
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setString(10, (String)parms[11], 1);
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

