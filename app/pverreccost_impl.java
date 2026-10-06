package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pverreccost_impl extends GXWebReport
{
   public pverreccost_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8Station = httpContext.GetPar( "Station") ;
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            A494ForSer = httpContext.GetPar( "ForSer") ;
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            AV18valor = CommonUtil.decimalVal( httpContext.GetPar( "valor"), ".") ;
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
         Gx_out = "SCR" ;
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
         /* Using cursor P061Q2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P061Q2_A407EmprNom[0] ;
            n407EmprNom = P061Q2_n407EmprNom[0] ;
            AV17Emprnom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P061Q3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2838ForRelBan = P061Q3_A2838ForRelBan[0] ;
            n2838ForRelBan = P061Q3_n2838ForRelBan[0] ;
            A3558ForFecApr = P061Q3_A3558ForFecApr[0] ;
            n3558ForFecApr = P061Q3_n3558ForFecApr[0] ;
            A7537ForOpNum = P061Q3_A7537ForOpNum[0] ;
            n7537ForOpNum = P061Q3_n7537ForOpNum[0] ;
            A3315ForNumArc = P061Q3_A3315ForNumArc[0] ;
            n3315ForNumArc = P061Q3_n3315ForNumArc[0] ;
            A1515MacProDsc = P061Q3_A1515MacProDsc[0] ;
            A1514MacProCod = P061Q3_A1514MacProCod[0] ;
            n1514MacProCod = P061Q3_n1514MacProCod[0] ;
            A1191ForNomCli = P061Q3_A1191ForNomCli[0] ;
            n1191ForNomCli = P061Q3_n1191ForNomCli[0] ;
            A5742ForSerDsc = P061Q3_A5742ForSerDsc[0] ;
            n5742ForSerDsc = P061Q3_n5742ForSerDsc[0] ;
            A279CliNom = P061Q3_A279CliNom[0] ;
            A1515MacProDsc = P061Q3_A1515MacProDsc[0] ;
            A279CliNom = P061Q3_A279CliNom[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         AV15Last_proc = " " ;
         /* Using cursor P061Q4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV8Station});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A490ForPrdUMe = P061Q4_A490ForPrdUMe[0] ;
            A910Workstat = P061Q4_A910Workstat[0] ;
            A764ProForCod = P061Q4_A764ProForCod[0] ;
            A897EscMDsc = P061Q4_A897EscMDsc[0] ;
            A4712EscMFacCon = P061Q4_A4712EscMFacCon[0] ;
            A488ForPrdDsc = P061Q4_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P061Q4_n488ForPrdDsc[0] ;
            A891EscMCos = P061Q4_A891EscMCos[0] ;
            A10881PrdLote = P061Q4_A10881PrdLote[0] ;
            A13301PrdZDHC = P061Q4_A13301PrdZDHC[0] ;
            A5888PrdOkotex = P061Q4_A5888PrdOkotex[0] ;
            A11363PrdGots = P061Q4_A11363PrdGots[0] ;
            A13302PrdTHELIST = P061Q4_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = P061Q4_n13302PrdTHELIST[0] ;
            A718PrdNom = P061Q4_A718PrdNom[0] ;
            A719PrdNum = P061Q4_A719PrdNum[0] ;
            A887EscMLin = P061Q4_A887EscMLin[0] ;
            A10881PrdLote = P061Q4_A10881PrdLote[0] ;
            A13301PrdZDHC = P061Q4_A13301PrdZDHC[0] ;
            A5888PrdOkotex = P061Q4_A5888PrdOkotex[0] ;
            A11363PrdGots = P061Q4_A11363PrdGots[0] ;
            A13302PrdTHELIST = P061Q4_A13302PrdTHELIST[0] ;
            n13302PrdTHELIST = P061Q4_n13302PrdTHELIST[0] ;
            A718PrdNom = P061Q4_A718PrdNom[0] ;
            A488ForPrdDsc = P061Q4_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P061Q4_n488ForPrdDsc[0] ;
            if ( ( GXutil.strcmp(AV15Last_proc, A764ProForCod) != 0 ) && ( GXutil.strcmp(AV15Last_proc, " ") != 0 ) )
            {
               h61Q0( false, 18) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            AV14Factor = ((A4712EscMFacCon.doubleValue()!=0) ? GXutil.trim( GXutil.str( A4712EscMFacCon, 12, 5)) : GXutil.trim( A897EscMDsc)) ;
            AV19Und = A488ForPrdDsc ;
            AV20Costl = A891EscMCos ;
            h61Q0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 335, Gx_line+0, 380, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 393, Gx_line+0, 584, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Factor, "")), 591, Gx_line+0, 665, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Und, "")), 669, Gx_line+0, 699, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")), 33, Gx_line+2, 63, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11363PrdGots, "")), 91, Gx_line+2, 99, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5888PrdOkotex, "")), 134, Gx_line+0, 142, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13301PrdZDHC, "@!")), 179, Gx_line+0, 187, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10881PrdLote, "")), 211, Gx_line+0, 328, Gx_line+16, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20Costl, "ZZZ9.99999")), 703, Gx_line+1, 777, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV15Last_proc = A764ProForCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         h61Q0( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18valor, "ZZZZ9.99999")), 696, Gx_line+5, 777, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 641, Gx_line+5, 678, Gx_line+22, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h61Q0( true, 0) ;
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

   public void h61Q0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Emprnom, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 649, Gx_line+17, 708, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 583, Gx_line+17, 642, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora:", ""), 510, Gx_line+17, 577, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 642, Gx_line+50, 709, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 583, Gx_line+50, 628, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina:", ""), 525, Gx_line+50, 577, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 631, Gx_line+50, 639, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+83, 776, Gx_line+83, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Pgmdesc, "")), 15, Gx_line+50, 235, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 22, Gx_line+100, 74, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 101, Gx_line+100, 146, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 157, Gx_line+100, 377, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 22, Gx_line+117, 67, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 101, Gx_line+117, 219, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 225, Gx_line+117, 416, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 22, Gx_line+133, 45, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 102, Gx_line+133, 198, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 22, Gx_line+150, 96, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 102, Gx_line+150, 198, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Programa", ""), 22, Gx_line+183, 96, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1514MacProCod, "")), 102, Gx_line+183, 147, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), 153, Gx_line+183, 300, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Lab", ""), 510, Gx_line+100, 547, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3315ForNumArc), "ZZZZZZZ9")), 554, Gx_line+100, 613, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Opçao", ""), 510, Gx_line+117, 547, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7537ForOpNum), "Z9")), 554, Gx_line+117, 570, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A3558ForFecApr, "99/99/99"), 656, Gx_line+117, 715, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Aprov", ""), 576, Gx_line+117, 650, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 510, Gx_line+133, 526, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2838ForRelBan, "ZZZ9.99")), 554, Gx_line+133, 606, Gx_line+150, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+207, 776, Gx_line+207, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+217) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 335, Gx_line+18, 387, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(338, Gx_line+33, 583, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 620, Gx_line+16, 665, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(591, Gx_line+34, 664, Gx_line+34, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 22, Gx_line+17, 74, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 80, Gx_line+17, 110, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OKOTEX", ""), 117, Gx_line+17, 162, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ZDHC", ""), 168, Gx_line+17, 198, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(22, Gx_line+33, 73, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+33, 109, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(117, Gx_line+33, 161, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(168, Gx_line+33, 204, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 211, Gx_line+17, 241, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(211, Gx_line+33, 328, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Coste", ""), 724, Gx_line+16, 761, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(703, Gx_line+33, 776, Gx_line+33, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+39) ;
            }
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
      A396EmprCod = "" ;
      AV8Station = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      AV18valor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P061Q2_A396EmprCod = new String[] {""} ;
      P061Q2_A407EmprNom = new String[] {""} ;
      P061Q2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17Emprnom = "" ;
      P061Q3_A396EmprCod = new String[] {""} ;
      P061Q3_A252CliCod = new int[1] ;
      P061Q3_A494ForSer = new String[] {""} ;
      P061Q3_A482ForColNom = new String[] {""} ;
      P061Q3_A483ForColNum = new int[1] ;
      P061Q3_A831TipColCod = new byte[1] ;
      P061Q3_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P061Q3_n2838ForRelBan = new boolean[] {false} ;
      P061Q3_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P061Q3_n3558ForFecApr = new boolean[] {false} ;
      P061Q3_A7537ForOpNum = new byte[1] ;
      P061Q3_n7537ForOpNum = new boolean[] {false} ;
      P061Q3_A3315ForNumArc = new int[1] ;
      P061Q3_n3315ForNumArc = new boolean[] {false} ;
      P061Q3_A1515MacProDsc = new String[] {""} ;
      P061Q3_A1514MacProCod = new String[] {""} ;
      P061Q3_n1514MacProCod = new boolean[] {false} ;
      P061Q3_A1191ForNomCli = new String[] {""} ;
      P061Q3_n1191ForNomCli = new boolean[] {false} ;
      P061Q3_A5742ForSerDsc = new String[] {""} ;
      P061Q3_n5742ForSerDsc = new boolean[] {false} ;
      P061Q3_A279CliNom = new String[] {""} ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A3558ForFecApr = GXutil.nullDate() ;
      A1515MacProDsc = "" ;
      A1514MacProCod = "" ;
      A1191ForNomCli = "" ;
      A5742ForSerDsc = "" ;
      A279CliNom = "" ;
      AV15Last_proc = "" ;
      P061Q4_A490ForPrdUMe = new byte[1] ;
      P061Q4_A396EmprCod = new String[] {""} ;
      P061Q4_A910Workstat = new String[] {""} ;
      P061Q4_A764ProForCod = new String[] {""} ;
      P061Q4_A897EscMDsc = new String[] {""} ;
      P061Q4_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P061Q4_A488ForPrdDsc = new String[] {""} ;
      P061Q4_n488ForPrdDsc = new boolean[] {false} ;
      P061Q4_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P061Q4_A10881PrdLote = new String[] {""} ;
      P061Q4_A13301PrdZDHC = new String[] {""} ;
      P061Q4_A5888PrdOkotex = new String[] {""} ;
      P061Q4_A11363PrdGots = new String[] {""} ;
      P061Q4_A13302PrdTHELIST = new String[] {""} ;
      P061Q4_n13302PrdTHELIST = new boolean[] {false} ;
      P061Q4_A718PrdNom = new String[] {""} ;
      P061Q4_A719PrdNum = new String[] {""} ;
      P061Q4_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A764ProForCod = "" ;
      A897EscMDsc = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A891EscMCos = DecimalUtil.ZERO ;
      A10881PrdLote = "" ;
      A13301PrdZDHC = "" ;
      A5888PrdOkotex = "" ;
      A11363PrdGots = "" ;
      A13302PrdTHELIST = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV14Factor = "" ;
      AV19Und = "" ;
      AV20Costl = DecimalUtil.ZERO ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV28Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pverreccost__default(),
         new Object[] {
             new Object[] {
            P061Q2_A396EmprCod, P061Q2_A407EmprNom, P061Q2_n407EmprNom
            }
            , new Object[] {
            P061Q3_A396EmprCod, P061Q3_A252CliCod, P061Q3_A494ForSer, P061Q3_A482ForColNom, P061Q3_A483ForColNum, P061Q3_A831TipColCod, P061Q3_A2838ForRelBan, P061Q3_n2838ForRelBan, P061Q3_A3558ForFecApr, P061Q3_n3558ForFecApr,
            P061Q3_A7537ForOpNum, P061Q3_n7537ForOpNum, P061Q3_A3315ForNumArc, P061Q3_n3315ForNumArc, P061Q3_A1515MacProDsc, P061Q3_A1514MacProCod, P061Q3_n1514MacProCod, P061Q3_A1191ForNomCli, P061Q3_n1191ForNomCli, P061Q3_A5742ForSerDsc,
            P061Q3_n5742ForSerDsc, P061Q3_A279CliNom
            }
            , new Object[] {
            P061Q4_A490ForPrdUMe, P061Q4_A396EmprCod, P061Q4_A910Workstat, P061Q4_A764ProForCod, P061Q4_A897EscMDsc, P061Q4_A4712EscMFacCon, P061Q4_A488ForPrdDsc, P061Q4_n488ForPrdDsc, P061Q4_A891EscMCos, P061Q4_A10881PrdLote,
            P061Q4_A13301PrdZDHC, P061Q4_A5888PrdOkotex, P061Q4_A11363PrdGots, P061Q4_A13302PrdTHELIST, P061Q4_n13302PrdTHELIST, P061Q4_A718PrdNom, P061Q4_A719PrdNum, P061Q4_A887EscMLin
            }
         }
      );
      AV28Pgmdesc = httpContext.getMessage( "Receta con Costes", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV28Pgmdesc = httpContext.getMessage( "Receta con Costes", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A7537ForOpNum ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A3315ForNumArc ;
   private int A887EscMLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV18valor ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal AV20Costl ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8Station ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17Emprnom ;
   private String A1515MacProDsc ;
   private String A1514MacProCod ;
   private String A1191ForNomCli ;
   private String A5742ForSerDsc ;
   private String A279CliNom ;
   private String AV15Last_proc ;
   private String A910Workstat ;
   private String A764ProForCod ;
   private String A897EscMDsc ;
   private String A488ForPrdDsc ;
   private String A10881PrdLote ;
   private String A13301PrdZDHC ;
   private String A5888PrdOkotex ;
   private String A11363PrdGots ;
   private String A13302PrdTHELIST ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV14Factor ;
   private String AV19Und ;
   private String Gx_time ;
   private String AV28Pgmdesc ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n2838ForRelBan ;
   private boolean n3558ForFecApr ;
   private boolean n7537ForOpNum ;
   private boolean n3315ForNumArc ;
   private boolean n1514MacProCod ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n488ForPrdDsc ;
   private boolean n13302PrdTHELIST ;
   private IDataStoreProvider pr_default ;
   private String[] P061Q2_A396EmprCod ;
   private String[] P061Q2_A407EmprNom ;
   private boolean[] P061Q2_n407EmprNom ;
   private String[] P061Q3_A396EmprCod ;
   private int[] P061Q3_A252CliCod ;
   private String[] P061Q3_A494ForSer ;
   private String[] P061Q3_A482ForColNom ;
   private int[] P061Q3_A483ForColNum ;
   private byte[] P061Q3_A831TipColCod ;
   private java.math.BigDecimal[] P061Q3_A2838ForRelBan ;
   private boolean[] P061Q3_n2838ForRelBan ;
   private java.util.Date[] P061Q3_A3558ForFecApr ;
   private boolean[] P061Q3_n3558ForFecApr ;
   private byte[] P061Q3_A7537ForOpNum ;
   private boolean[] P061Q3_n7537ForOpNum ;
   private int[] P061Q3_A3315ForNumArc ;
   private boolean[] P061Q3_n3315ForNumArc ;
   private String[] P061Q3_A1515MacProDsc ;
   private String[] P061Q3_A1514MacProCod ;
   private boolean[] P061Q3_n1514MacProCod ;
   private String[] P061Q3_A1191ForNomCli ;
   private boolean[] P061Q3_n1191ForNomCli ;
   private String[] P061Q3_A5742ForSerDsc ;
   private boolean[] P061Q3_n5742ForSerDsc ;
   private String[] P061Q3_A279CliNom ;
   private byte[] P061Q4_A490ForPrdUMe ;
   private String[] P061Q4_A396EmprCod ;
   private String[] P061Q4_A910Workstat ;
   private String[] P061Q4_A764ProForCod ;
   private String[] P061Q4_A897EscMDsc ;
   private java.math.BigDecimal[] P061Q4_A4712EscMFacCon ;
   private String[] P061Q4_A488ForPrdDsc ;
   private boolean[] P061Q4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P061Q4_A891EscMCos ;
   private String[] P061Q4_A10881PrdLote ;
   private String[] P061Q4_A13301PrdZDHC ;
   private String[] P061Q4_A5888PrdOkotex ;
   private String[] P061Q4_A11363PrdGots ;
   private String[] P061Q4_A13302PrdTHELIST ;
   private boolean[] P061Q4_n13302PrdTHELIST ;
   private String[] P061Q4_A718PrdNom ;
   private String[] P061Q4_A719PrdNum ;
   private int[] P061Q4_A887EscMLin ;
}

final  class pverreccost__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P061Q2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P061Q3", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForRelBan, T1.ForFecApr, T1.ForOpNum, T1.ForNumArc, T2.MacProDsc, T1.MacProCod, T1.ForNomCli, T1.ForSerDsc, T3.CliNom FROM ((TXPCFORMU T1 LEFT JOIN TXPCMACPR T2 ON T2.EmprCod = T1.EmprCod AND T2.MacProCod = T1.MacProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P061Q4", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Workstat, T1.ProForCod, T1.EscMDsc, T1.EscMFacCon, T3.ForPrdDsc, T1.EscMCos, T2.PrdLote, T2.PrdZDHC, T2.PrdOkotex, T2.PrdGots, T2.PrdTHELIST, T2.PrdNom, T1.PrdNum, T1.EscMLin FROM ((TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 30);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((int[]) buf[17])[0] = rslt.getInt(16);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

