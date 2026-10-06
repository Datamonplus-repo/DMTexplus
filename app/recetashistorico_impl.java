package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetashistorico_impl extends GXWebReport
{
   public recetashistorico_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV8Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV9Prdnum = httpContext.GetPar( "Prdnum") ;
            AV15Prdnom = httpContext.GetPar( "Prdnom") ;
            AV10Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
            AV11Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P0AT52 */
         pr_default.execute(0, new Object[] {AV8Emprcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0AT52_A396EmprCod[0] ;
            A407EmprNom = P0AT52_A407EmprNom[0] ;
            n407EmprNom = P0AT52_n407EmprNom[0] ;
            AV21Emprnom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV26Totcant = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0AT53 */
         pr_default.execute(1, new Object[] {AV8Emprcod, AV9Prdnum, AV10Fec1, AV11Fec2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkAT54 = false ;
            A4495HreNumCie = P0AT53_A4495HreNumCie[0] ;
            A4545HreLinMaq = P0AT53_A4545HreLinMaq[0] ;
            A396EmprCod = P0AT53_A396EmprCod[0] ;
            A719PrdNum = P0AT53_A719PrdNum[0] ;
            n719PrdNum = P0AT53_n719PrdNum[0] ;
            A4558HrePrdNum = P0AT53_A4558HrePrdNum[0] ;
            n4558HrePrdNum = P0AT53_n4558HrePrdNum[0] ;
            A4517HreBarSer = P0AT53_A4517HreBarSer[0] ;
            n4517HreBarSer = P0AT53_n4517HreBarSer[0] ;
            A4518HreBarDsc = P0AT53_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P0AT53_n4518HreBarDsc[0] ;
            A4521HreColNom = P0AT53_A4521HreColNom[0] ;
            n4521HreColNom = P0AT53_n4521HreColNom[0] ;
            A4523HreColNomC = P0AT53_A4523HreColNomC[0] ;
            n4523HreColNomC = P0AT53_n4523HreColNomC[0] ;
            A4563HrePrdCant = P0AT53_A4563HrePrdCant[0] ;
            n4563HrePrdCant = P0AT53_n4563HrePrdCant[0] ;
            A4560HrePrdUMe = P0AT53_A4560HrePrdUMe[0] ;
            n4560HrePrdUMe = P0AT53_n4560HrePrdUMe[0] ;
            A4525HreTipCol = P0AT53_A4525HreTipCol[0] ;
            n4525HreTipCol = P0AT53_n4525HreTipCol[0] ;
            A4494HreBarPar = P0AT53_A4494HreBarPar[0] ;
            A4493HreBarReo = P0AT53_A4493HreBarReo[0] ;
            A4492HreBarCod = P0AT53_A4492HreBarCod[0] ;
            A12453HreFecAct = P0AT53_A12453HreFecAct[0] ;
            n12453HreFecAct = P0AT53_n12453HreFecAct[0] ;
            A4546HreMaqCod = P0AT53_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P0AT53_n4546HreMaqCod[0] ;
            A4550HreLinPro = P0AT53_A4550HreLinPro[0] ;
            A4557HreRecLin = P0AT53_A4557HreRecLin[0] ;
            A4517HreBarSer = P0AT53_A4517HreBarSer[0] ;
            n4517HreBarSer = P0AT53_n4517HreBarSer[0] ;
            A4518HreBarDsc = P0AT53_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P0AT53_n4518HreBarDsc[0] ;
            A4521HreColNom = P0AT53_A4521HreColNom[0] ;
            n4521HreColNom = P0AT53_n4521HreColNom[0] ;
            A4523HreColNomC = P0AT53_A4523HreColNomC[0] ;
            n4523HreColNomC = P0AT53_n4523HreColNomC[0] ;
            A4525HreTipCol = P0AT53_A4525HreTipCol[0] ;
            n4525HreTipCol = P0AT53_n4525HreTipCol[0] ;
            A4546HreMaqCod = P0AT53_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P0AT53_n4546HreMaqCod[0] ;
            AV22HreMaqCod = A4546HreMaqCod ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AT53_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AT53_A719PrdNum[0], A719PrdNum) == 0 ) && ( P0AT53_A4492HreBarCod[0] == A4492HreBarCod ) && ( P0AT53_A4493HreBarReo[0] == A4493HreBarReo ) )
            {
               if ( ! ( ( GXutil.strcmp(P0AT53_A4494HreBarPar[0], A4494HreBarPar) == 0 ) ) )
               {
                  if (true) break;
               }
               brkAT54 = false ;
               A4495HreNumCie = P0AT53_A4495HreNumCie[0] ;
               A4545HreLinMaq = P0AT53_A4545HreLinMaq[0] ;
               A4558HrePrdNum = P0AT53_A4558HrePrdNum[0] ;
               n4558HrePrdNum = P0AT53_n4558HrePrdNum[0] ;
               A4517HreBarSer = P0AT53_A4517HreBarSer[0] ;
               n4517HreBarSer = P0AT53_n4517HreBarSer[0] ;
               A4518HreBarDsc = P0AT53_A4518HreBarDsc[0] ;
               n4518HreBarDsc = P0AT53_n4518HreBarDsc[0] ;
               A4521HreColNom = P0AT53_A4521HreColNom[0] ;
               n4521HreColNom = P0AT53_n4521HreColNom[0] ;
               A4523HreColNomC = P0AT53_A4523HreColNomC[0] ;
               n4523HreColNomC = P0AT53_n4523HreColNomC[0] ;
               A4563HrePrdCant = P0AT53_A4563HrePrdCant[0] ;
               n4563HrePrdCant = P0AT53_n4563HrePrdCant[0] ;
               A4560HrePrdUMe = P0AT53_A4560HrePrdUMe[0] ;
               n4560HrePrdUMe = P0AT53_n4560HrePrdUMe[0] ;
               A4525HreTipCol = P0AT53_A4525HreTipCol[0] ;
               n4525HreTipCol = P0AT53_n4525HreTipCol[0] ;
               A4550HreLinPro = P0AT53_A4550HreLinPro[0] ;
               A4557HreRecLin = P0AT53_A4557HreRecLin[0] ;
               A4517HreBarSer = P0AT53_A4517HreBarSer[0] ;
               n4517HreBarSer = P0AT53_n4517HreBarSer[0] ;
               A4518HreBarDsc = P0AT53_A4518HreBarDsc[0] ;
               n4518HreBarDsc = P0AT53_n4518HreBarDsc[0] ;
               A4521HreColNom = P0AT53_A4521HreColNom[0] ;
               n4521HreColNom = P0AT53_n4521HreColNom[0] ;
               A4523HreColNomC = P0AT53_A4523HreColNomC[0] ;
               n4523HreColNomC = P0AT53_n4523HreColNomC[0] ;
               A4525HreTipCol = P0AT53_A4525HreTipCol[0] ;
               n4525HreTipCol = P0AT53_n4525HreTipCol[0] ;
               AV12hreBarcod = A4492HreBarCod ;
               AV13hrebarreo = A4493HreBarReo ;
               AV14Hrebarpar = A4494HreBarPar ;
               AV16Hrebarser = A4517HreBarSer ;
               AV17HreBarDsc = A4518HreBarDsc ;
               AV18Hrecolnom = A4521HreColNom ;
               AV19HreColNomC = A4523HreColNomC ;
               AV23HrePrdCant = A4563HrePrdCant ;
               AV24HrePrdUDs = ((A4560HrePrdUMe==1) ? httpContext.getMessage( "gr", "") : ((A4560HrePrdUMe==2) ? httpContext.getMessage( "cc", "") : httpContext.getMessage( "gr", ""))) ;
               AV25HreTipCol = A4525HreTipCol ;
               brkAT54 = true ;
               pr_default.readNext(1);
            }
            hAT50( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12hreBarcod), "ZZZZZZZ9")), 41, Gx_line+0, 100, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Hrebarpar, "")), 122, Gx_line+0, 130, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13hrebarreo), "9")), 108, Gx_line+0, 116, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Hrebarser, "")), 145, Gx_line+0, 266, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Hrecolnom, "")), 286, Gx_line+0, 382, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20Hrecolnum), "ZZZZZ9")), 394, Gx_line+0, 439, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23HrePrdCant, "ZZZZZZ9.999")), 482, Gx_line+0, 563, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24HrePrdUDs, "")), 574, Gx_line+0, 611, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22HreMaqCod, "")), 629, Gx_line+0, 674, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25HreTipCol), "Z9")), 447, Gx_line+0, 463, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV26Totcant = AV26Totcant.add(AV23HrePrdCant) ;
            if ( ! brkAT54 )
            {
               brkAT54 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         hAT50( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Totcant, "ZZZZZZ9.999")), 482, Gx_line+13, 563, Gx_line+31, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAT50( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void hAT50( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Prdnum, "")), 55, Gx_line+74, 100, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Prdnom, "")), 109, Gx_line+74, 300, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV10Fec1, "99/99/99"), 501, Gx_line+74, 560, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV11Fec2, "99/99/99"), 569, Gx_line+74, 628, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Emprnom, "")), 27, Gx_line+14, 247, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 664, Gx_line+14, 723, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 596, Gx_line+14, 655, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 596, Gx_line+41, 641, Gx_line+58, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Pgmdesc, "")), 27, Gx_line+41, 247, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+68, 772, Gx_line+68, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "dia-hora", ""), 528, Gx_line+14, 587, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 542, Gx_line+41, 587, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 664, Gx_line+41, 731, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 648, Gx_line+41, 656, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Periodo", ""), 433, Gx_line+74, 485, Gx_line+91, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+95) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 41, Gx_line+14, 64, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(41, Gx_line+33, 99, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 145, Gx_line+14, 204, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(145, Gx_line+33, 262, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(286, Gx_line+33, 436, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 286, Gx_line+14, 323, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 108, Gx_line+14, 116, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 122, Gx_line+14, 130, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(108, Gx_line+33, 115, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(122, Gx_line+33, 129, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cant.", ""), 482, Gx_line+13, 519, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(482, Gx_line+33, 609, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 629, Gx_line+13, 681, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(629, Gx_line+33, 683, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 447, Gx_line+14, 463, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(447, Gx_line+33, 463, Gx_line+33, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+41) ;
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV8Emprcod = "" ;
      AV9Prdnum = "" ;
      AV15Prdnom = "" ;
      AV10Fec1 = GXutil.nullDate() ;
      AV11Fec2 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AT52_A396EmprCod = new String[] {""} ;
      P0AT52_A407EmprNom = new String[] {""} ;
      P0AT52_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV21Emprnom = "" ;
      AV26Totcant = DecimalUtil.ZERO ;
      P0AT53_A4495HreNumCie = new byte[1] ;
      P0AT53_A4545HreLinMaq = new short[1] ;
      P0AT53_A396EmprCod = new String[] {""} ;
      P0AT53_A719PrdNum = new String[] {""} ;
      P0AT53_n719PrdNum = new boolean[] {false} ;
      P0AT53_A4558HrePrdNum = new String[] {""} ;
      P0AT53_n4558HrePrdNum = new boolean[] {false} ;
      P0AT53_A4517HreBarSer = new String[] {""} ;
      P0AT53_n4517HreBarSer = new boolean[] {false} ;
      P0AT53_A4518HreBarDsc = new String[] {""} ;
      P0AT53_n4518HreBarDsc = new boolean[] {false} ;
      P0AT53_A4521HreColNom = new String[] {""} ;
      P0AT53_n4521HreColNom = new boolean[] {false} ;
      P0AT53_A4523HreColNomC = new String[] {""} ;
      P0AT53_n4523HreColNomC = new boolean[] {false} ;
      P0AT53_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT53_n4563HrePrdCant = new boolean[] {false} ;
      P0AT53_A4560HrePrdUMe = new byte[1] ;
      P0AT53_n4560HrePrdUMe = new boolean[] {false} ;
      P0AT53_A4525HreTipCol = new byte[1] ;
      P0AT53_n4525HreTipCol = new boolean[] {false} ;
      P0AT53_A4494HreBarPar = new String[] {""} ;
      P0AT53_A4493HreBarReo = new byte[1] ;
      P0AT53_A4492HreBarCod = new int[1] ;
      P0AT53_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT53_n12453HreFecAct = new boolean[] {false} ;
      P0AT53_A4546HreMaqCod = new String[] {""} ;
      P0AT53_n4546HreMaqCod = new boolean[] {false} ;
      P0AT53_A4550HreLinPro = new byte[1] ;
      P0AT53_A4557HreRecLin = new short[1] ;
      A719PrdNum = "" ;
      A4558HrePrdNum = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4521HreColNom = "" ;
      A4523HreColNomC = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4494HreBarPar = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      A4546HreMaqCod = "" ;
      AV22HreMaqCod = "" ;
      AV14Hrebarpar = "" ;
      AV16Hrebarser = "" ;
      AV17HreBarDsc = "" ;
      AV18Hrecolnom = "" ;
      AV19HreColNomC = "" ;
      AV23HrePrdCant = DecimalUtil.ZERO ;
      AV24HrePrdUDs = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV33Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetashistorico__default(),
         new Object[] {
             new Object[] {
            P0AT52_A396EmprCod, P0AT52_A407EmprNom, P0AT52_n407EmprNom
            }
            , new Object[] {
            P0AT53_A4495HreNumCie, P0AT53_A4545HreLinMaq, P0AT53_A396EmprCod, P0AT53_A719PrdNum, P0AT53_n719PrdNum, P0AT53_A4558HrePrdNum, P0AT53_n4558HrePrdNum, P0AT53_A4517HreBarSer, P0AT53_n4517HreBarSer, P0AT53_A4518HreBarDsc,
            P0AT53_n4518HreBarDsc, P0AT53_A4521HreColNom, P0AT53_n4521HreColNom, P0AT53_A4523HreColNomC, P0AT53_n4523HreColNomC, P0AT53_A4563HrePrdCant, P0AT53_n4563HrePrdCant, P0AT53_A4560HrePrdUMe, P0AT53_n4560HrePrdUMe, P0AT53_A4525HreTipCol,
            P0AT53_n4525HreTipCol, P0AT53_A4494HreBarPar, P0AT53_A4493HreBarReo, P0AT53_A4492HreBarCod, P0AT53_A12453HreFecAct, P0AT53_n12453HreFecAct, P0AT53_A4546HreMaqCod, P0AT53_n4546HreMaqCod, P0AT53_A4550HreLinPro, P0AT53_A4557HreRecLin
            }
         }
      );
      AV33Pgmdesc = httpContext.getMessage( "Recetas Historico", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV33Pgmdesc = httpContext.getMessage( "Recetas Historico", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A4495HreNumCie ;
   private byte A4560HrePrdUMe ;
   private byte A4525HreTipCol ;
   private byte A4493HreBarReo ;
   private byte A4550HreLinPro ;
   private byte AV13hrebarreo ;
   private byte AV25HreTipCol ;
   private short gxcookieaux ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4492HreBarCod ;
   private int AV12hreBarcod ;
   private int AV20Hrecolnum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV26Totcant ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal AV23HrePrdCant ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV8Emprcod ;
   private String AV9Prdnum ;
   private String AV15Prdnom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV21Emprnom ;
   private String A719PrdNum ;
   private String A4558HrePrdNum ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4521HreColNom ;
   private String A4523HreColNomC ;
   private String A4494HreBarPar ;
   private String A4546HreMaqCod ;
   private String AV22HreMaqCod ;
   private String AV14Hrebarpar ;
   private String AV16Hrebarser ;
   private String AV17HreBarDsc ;
   private String AV18Hrecolnom ;
   private String AV19HreColNomC ;
   private String AV24HrePrdUDs ;
   private String Gx_time ;
   private String AV33Pgmdesc ;
   private java.util.Date AV10Fec1 ;
   private java.util.Date AV11Fec2 ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brkAT54 ;
   private boolean n719PrdNum ;
   private boolean n4558HrePrdNum ;
   private boolean n4517HreBarSer ;
   private boolean n4518HreBarDsc ;
   private boolean n4521HreColNom ;
   private boolean n4523HreColNomC ;
   private boolean n4563HrePrdCant ;
   private boolean n4560HrePrdUMe ;
   private boolean n4525HreTipCol ;
   private boolean n12453HreFecAct ;
   private boolean n4546HreMaqCod ;
   private IDataStoreProvider pr_default ;
   private String[] P0AT52_A396EmprCod ;
   private String[] P0AT52_A407EmprNom ;
   private boolean[] P0AT52_n407EmprNom ;
   private byte[] P0AT53_A4495HreNumCie ;
   private short[] P0AT53_A4545HreLinMaq ;
   private String[] P0AT53_A396EmprCod ;
   private String[] P0AT53_A719PrdNum ;
   private boolean[] P0AT53_n719PrdNum ;
   private String[] P0AT53_A4558HrePrdNum ;
   private boolean[] P0AT53_n4558HrePrdNum ;
   private String[] P0AT53_A4517HreBarSer ;
   private boolean[] P0AT53_n4517HreBarSer ;
   private String[] P0AT53_A4518HreBarDsc ;
   private boolean[] P0AT53_n4518HreBarDsc ;
   private String[] P0AT53_A4521HreColNom ;
   private boolean[] P0AT53_n4521HreColNom ;
   private String[] P0AT53_A4523HreColNomC ;
   private boolean[] P0AT53_n4523HreColNomC ;
   private java.math.BigDecimal[] P0AT53_A4563HrePrdCant ;
   private boolean[] P0AT53_n4563HrePrdCant ;
   private byte[] P0AT53_A4560HrePrdUMe ;
   private boolean[] P0AT53_n4560HrePrdUMe ;
   private byte[] P0AT53_A4525HreTipCol ;
   private boolean[] P0AT53_n4525HreTipCol ;
   private String[] P0AT53_A4494HreBarPar ;
   private byte[] P0AT53_A4493HreBarReo ;
   private int[] P0AT53_A4492HreBarCod ;
   private java.util.Date[] P0AT53_A12453HreFecAct ;
   private boolean[] P0AT53_n12453HreFecAct ;
   private String[] P0AT53_A4546HreMaqCod ;
   private boolean[] P0AT53_n4546HreMaqCod ;
   private byte[] P0AT53_A4550HreLinPro ;
   private short[] P0AT53_A4557HreRecLin ;
}

final  class recetashistorico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT52", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AT53", "SELECT T1.HreNumCie, T1.HreLinMaq, T1.EmprCod, T1.PrdNum, T1.HrePrdNum, T2.HreBarSer, T2.HreBarDsc, T2.HreColNom, T2.HreColNomC, T1.HrePrdCant, T1.HrePrdUMe, T2.HreTipCol, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreFecAct, T3.HreMaqCod, T1.HreLinPro, T1.HreRecLin FROM ((TXPHISLRE T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) INNER JOIN TXPHISREM T3 ON T3.EmprCod = T1.EmprCod AND T3.HreBarCod = T1.HreBarCod AND T3.HreBarReo = T1.HreBarReo AND T3.HreBarPar = T1.HreBarPar AND T3.HreNumCie = T1.HreNumCie AND T3.HreLinMaq = T1.HreLinMaq) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T1.HreFecAct >= ?) AND (T1.HreFecAct <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((int[]) buf[23])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(18);
               ((short[]) buf[29])[0] = rslt.getShort(19);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

