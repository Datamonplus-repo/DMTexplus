package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rdevcrumoda21_impl extends GXWebReport
{
   public rdevcrumoda21_impl( com.genexus.internet.HttpContext context )
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
            A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            AV42TextoCopia = httpContext.GetPar( "TextoCopia") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
      M_bot = 7 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*7)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV32ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVMOD", ""), GXv_char1) ;
         rdevcrumoda21_impl.this.AV32ContDsc = GXv_char1[0] ;
         GXt_char2 = AV39Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         rdevcrumoda21_impl.this.A396EmprCod = GXv_char1[0] ;
         rdevcrumoda21_impl.this.GXt_char2 = GXv_char4[0] ;
         AV39Firmad = GXt_char2 ;
         /* Using cursor P07RJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P07RJ2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P07RJ2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P07RJ2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P07RJ2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P07RJ2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P07RJ2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P07RJ2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P07RJ2_n8336EmpItm3[0] ;
            AV37Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV38Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07RJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A395EmprCif = P07RJ3_A395EmprCif[0] ;
            n395EmprCif = P07RJ3_n395EmprCif[0] ;
            AV33EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr4 = true ;
         /* Using cursor P07RJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13983DevCruATCU = P07RJ4_A13983DevCruATCU[0] ;
            A11673DevCruSal = P07RJ4_A11673DevCruSal[0] ;
            A11674DevCruHash = P07RJ4_A11674DevCruHash[0] ;
            A11680DevCruAtId = P07RJ4_A11680DevCruAtId[0] ;
            A11682DevCruObs = P07RJ4_A11682DevCruObs[0] ;
            A11672DevCruMat = P07RJ4_A11672DevCruMat[0] ;
            A278CliNif = P07RJ4_A278CliNif[0] ;
            A11670DevCruFec = P07RJ4_A11670DevCruFec[0] ;
            A252CliCod = P07RJ4_A252CliCod[0] ;
            A295CliPob = P07RJ4_A295CliPob[0] ;
            A260CliDom = P07RJ4_A260CliDom[0] ;
            A279CliNom = P07RJ4_A279CliNom[0] ;
            A278CliNif = P07RJ4_A278CliNif[0] ;
            A295CliPob = P07RJ4_A295CliPob[0] ;
            A260CliDom = P07RJ4_A260CliDom[0] ;
            A279CliNom = P07RJ4_A279CliNom[0] ;
            AV49codValidacaoSerie = A13983DevCruATCU ;
            AV50atcud = ((GXutil.strcmp("", AV49codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV49codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A11669DevCruId, 8, 0))) ;
            AV45DiaHora = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV44DiaCarga = localUtil.ctod( GXutil.substring( AV45DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV43HoraCarga = GXutil.substring( AV45DiaHora, 12, 8) ;
            AV34DevMatric = A11672DevCruMat ;
            AV35DevHorSal = A11673DevCruSal ;
            AV36Texto_fd = " " ;
            if ( GXutil.strcmp(A11674DevCruHash, " ") != 0 )
            {
               AV40Firma4dig = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
               AV36Texto_fd = AV40Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV39Firmad) ;
            }
            else
            {
               AV36Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV40Firma4dig = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
            AV54TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV33EmprCif) + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A278CliNif) + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "D:", "") + httpContext.getMessage( "GT", "") + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV51anyo = (short)(GXutil.year( A11670DevCruFec)) ;
            AV53mes = (short)(GXutil.month( A11670DevCruFec)) ;
            AV52dia = (short)(GXutil.day( A11670DevCruFec)) ;
            AV54TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV51anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV53mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV52dia, 2, 0)), (short)(2), "0") + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "G:", "") + httpContext.getMessage( "GT 6/", "") + GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)) + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "Q:", "") + AV40Firma4dig + "*" ;
            AV54TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV39Firmad) + "*" ;
            GXt_char2 = AV56Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV54TextoGenerar, (short)(120), (short)(120), GXv_char4) ;
            rdevcrumoda21_impl.this.GXt_char2 = GXv_char4[0] ;
            AV56Url = GXt_char2 ;
            AV55Imagen = AV56Url ;
            AV63Imagen_GXI = GXDbFile.pathToUrl( AV56Url, context.getHttpContext()) ;
            AV41AtId = " " ;
            if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
            {
               AV41AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A11680DevCruAtId, 1, 12)) ;
            }
            AV18FechaAlb = GXutil.str( GXutil.day( A11670DevCruFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A11670DevCruFec, httpContext.getMessage( "por", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A11670DevCruFec), 4, 0) ;
            /* Using cursor P07RJ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A11683DevCruUnd = P07RJ5_A11683DevCruUnd[0] ;
               A11684DevCruPzs = P07RJ5_A11684DevCruPzs[0] ;
               A46AlbREnt = P07RJ5_A46AlbREnt[0] ;
               A3613AlbRefDsc = P07RJ5_A3613AlbRefDsc[0] ;
               A44AlbRecCod = P07RJ5_A44AlbRecCod[0] ;
               A46AlbREnt = P07RJ5_A46AlbREnt[0] ;
               A3613AlbRefDsc = P07RJ5_A3613AlbRefDsc[0] ;
               h7RJ0( false, 18) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 91, Gx_line+1, 227, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 294, Gx_line+0, 387, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")), 585, Gx_line+0, 630, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11683DevCruUnd, "ZZZZZ9.99")), 453, Gx_line+0, 520, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV46Nlin = (short)(GXutil.gxmlines( A11682DevCruObs, (short)(57))) ;
            AV47i = (short)(1) ;
            while ( AV47i <= AV46Nlin )
            {
               if ( AV47i == 1 )
               {
                  h7RJ0( false, 27) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 70, Gx_line+11, 150, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               AV48Obstxt = GXutil.gxgetmli( A11682DevCruObs, AV47i, (short)(57)) ;
               h7RJ0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Obstxt, "")), 70, Gx_line+1, 487, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV47i = (short)(AV47i+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7RJ0( true, 0) ;
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

   public void h7RJ0( boolean bFoot ,
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
               getPrinter().GxDrawLine(540, Gx_line+31, 789, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(44, Gx_line+56, 774, Gx_line+56, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32ContDsc, "")), 690, Gx_line+38, 774, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Texto_fd, "")), 44, Gx_line+38, 358, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Texto_1, "")), 76, Gx_line+58, 744, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Texto_2, "")), 97, Gx_line+76, 723, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AtId, "")), 383, Gx_line+38, 509, Gx_line+51, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
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
            if ( GxHdr4 )
            {
               getPrinter().GxDrawRect(50, Gx_line+500, 714, Gx_line+531, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(409, Gx_line+245, 781, Gx_line+370, 1, 182, 182, 182, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 429, Gx_line+277, 618, Gx_line+295, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 429, Gx_line+297, 643, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 429, Gx_line+329, 618, Gx_line+347, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), 678, Gx_line+183, 771, Gx_line+207, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia de Devoluçao (ML) Nº.", ""), 454, Gx_line+184, 671, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pág.", ""), 598, Gx_line+391, 625, Gx_line+407, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 635, Gx_line+392, 680, Gx_line+409, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 91, Gx_line+510, 152, Gx_line+526, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Doc. Cliente", ""), 294, Gx_line+513, 365, Gx_line+529, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 451, Gx_line+510, 520, Gx_line+526, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 592, Gx_line+510, 631, Gx_line+526, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 38, Gx_line+10, 795, Gx_line+96) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TextoCopia, "")), 678, Gx_line+214, 773, Gx_line+232, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(31, Gx_line+406, 806, Gx_line+486, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 56, Gx_line+416, 117, Gx_line+432, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 56, Gx_line+433, 148, Gx_line+449, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 56, Gx_line+451, 157, Gx_line+467, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 56, Gx_line+468, 126, Gx_line+484, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 524, Gx_line+416, 610, Gx_line+432, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 524, Gx_line+433, 636, Gx_line+449, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 524, Gx_line+468, 579, Gx_line+484, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 156, Gx_line+416, 201, Gx_line+433, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A11670DevCruFec, "99/99/99"), 156, Gx_line+451, 207, Gx_line+468, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 156, Gx_line+433, 239, Gx_line+449, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 652, Gx_line+416, 757, Gx_line+433, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 652, Gx_line+433, 733, Gx_line+449, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), 594, Gx_line+468, 699, Gx_line+485, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43HoraCarga, "")), 254, Gx_line+468, 347, Gx_line+485, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV44DiaCarga, "99/99/99"), 156, Gx_line+468, 207, Gx_line+485, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 219, Gx_line+468, 251, Gx_line+484, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50atcud, "")), 42, Gx_line+167, 199, Gx_line+184, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV55Imagen)==0) ? AV63Imagen_GXI : AV55Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 50, Gx_line+200, 170, Gx_line+320) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+538) ;
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
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV42TextoCopia = "" ;
      AV32ContDsc = "" ;
      AV39Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P07RJ2_A396EmprCod = new String[] {""} ;
      P07RJ2_A8335EmpItm2 = new String[] {""} ;
      P07RJ2_n8335EmpItm2 = new boolean[] {false} ;
      P07RJ2_A8334EmpItm1 = new String[] {""} ;
      P07RJ2_n8334EmpItm1 = new boolean[] {false} ;
      P07RJ2_A8337EmpItm4 = new String[] {""} ;
      P07RJ2_n8337EmpItm4 = new boolean[] {false} ;
      P07RJ2_A8336EmpItm3 = new String[] {""} ;
      P07RJ2_n8336EmpItm3 = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV37Texto_1 = "" ;
      AV38Texto_2 = "" ;
      P07RJ3_A396EmprCod = new String[] {""} ;
      P07RJ3_A395EmprCif = new String[] {""} ;
      P07RJ3_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV33EmprCif = "" ;
      P07RJ4_A396EmprCod = new String[] {""} ;
      P07RJ4_A11669DevCruId = new int[1] ;
      P07RJ4_A13983DevCruATCU = new String[] {""} ;
      P07RJ4_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P07RJ4_A11674DevCruHash = new String[] {""} ;
      P07RJ4_A11680DevCruAtId = new String[] {""} ;
      P07RJ4_A11682DevCruObs = new String[] {""} ;
      P07RJ4_A11672DevCruMat = new String[] {""} ;
      P07RJ4_A278CliNif = new String[] {""} ;
      P07RJ4_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07RJ4_A252CliCod = new int[1] ;
      P07RJ4_A295CliPob = new String[] {""} ;
      P07RJ4_A260CliDom = new String[] {""} ;
      P07RJ4_A279CliNom = new String[] {""} ;
      A13983DevCruATCU = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11674DevCruHash = "" ;
      A11680DevCruAtId = "" ;
      A11682DevCruObs = "" ;
      A11672DevCruMat = "" ;
      A278CliNif = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV49codValidacaoSerie = "" ;
      AV50atcud = "" ;
      AV45DiaHora = "" ;
      AV44DiaCarga = GXutil.nullDate() ;
      AV43HoraCarga = "" ;
      AV34DevMatric = "" ;
      AV35DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV36Texto_fd = "" ;
      AV40Firma4dig = "" ;
      AV54TextoGenerar = "" ;
      AV56Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV55Imagen = "" ;
      AV63Imagen_GXI = "" ;
      AV41AtId = "" ;
      AV18FechaAlb = "" ;
      P07RJ5_A396EmprCod = new String[] {""} ;
      P07RJ5_A11669DevCruId = new int[1] ;
      P07RJ5_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07RJ5_A11684DevCruPzs = new int[1] ;
      P07RJ5_A46AlbREnt = new String[] {""} ;
      P07RJ5_A3613AlbRefDsc = new String[] {""} ;
      P07RJ5_A44AlbRecCod = new int[1] ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
      AV48Obstxt = "" ;
      AV55Imagen = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevcrumoda21__default(),
         new Object[] {
             new Object[] {
            P07RJ2_A396EmprCod, P07RJ2_A8335EmpItm2, P07RJ2_n8335EmpItm2, P07RJ2_A8334EmpItm1, P07RJ2_n8334EmpItm1, P07RJ2_A8337EmpItm4, P07RJ2_n8337EmpItm4, P07RJ2_A8336EmpItm3, P07RJ2_n8336EmpItm3
            }
            , new Object[] {
            P07RJ3_A396EmprCod, P07RJ3_A395EmprCif, P07RJ3_n395EmprCif
            }
            , new Object[] {
            P07RJ4_A396EmprCod, P07RJ4_A11669DevCruId, P07RJ4_A13983DevCruATCU, P07RJ4_A11673DevCruSal, P07RJ4_A11674DevCruHash, P07RJ4_A11680DevCruAtId, P07RJ4_A11682DevCruObs, P07RJ4_A11672DevCruMat, P07RJ4_A278CliNif, P07RJ4_A11670DevCruFec,
            P07RJ4_A252CliCod, P07RJ4_A295CliPob, P07RJ4_A260CliDom, P07RJ4_A279CliNom
            }
            , new Object[] {
            P07RJ5_A396EmprCod, P07RJ5_A11669DevCruId, P07RJ5_A11683DevCruUnd, P07RJ5_A11684DevCruPzs, P07RJ5_A46AlbREnt, P07RJ5_A3613AlbRefDsc, P07RJ5_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV51anyo ;
   private short AV53mes ;
   private short AV52dia ;
   private short AV46Nlin ;
   private short AV47i ;
   private short Gx_err ;
   private int A11669DevCruId ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A11684DevCruPzs ;
   private int A44AlbRecCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV42TextoCopia ;
   private String AV32ContDsc ;
   private String AV39Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV37Texto_1 ;
   private String AV38Texto_2 ;
   private String A395EmprCif ;
   private String AV33EmprCif ;
   private String A13983DevCruATCU ;
   private String A11674DevCruHash ;
   private String A11680DevCruAtId ;
   private String A11672DevCruMat ;
   private String A278CliNif ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV49codValidacaoSerie ;
   private String AV50atcud ;
   private String AV45DiaHora ;
   private String AV43HoraCarga ;
   private String AV34DevMatric ;
   private String AV36Texto_fd ;
   private String AV40Firma4dig ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV41AtId ;
   private String AV18FechaAlb ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String AV48Obstxt ;
   private String sImgUrl ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV35DevHorSal ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV44DiaCarga ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr4 ;
   private String A11682DevCruObs ;
   private String AV54TextoGenerar ;
   private String AV56Url ;
   private String AV63Imagen_GXI ;
   private String AV55Imagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P07RJ2_A396EmprCod ;
   private String[] P07RJ2_A8335EmpItm2 ;
   private boolean[] P07RJ2_n8335EmpItm2 ;
   private String[] P07RJ2_A8334EmpItm1 ;
   private boolean[] P07RJ2_n8334EmpItm1 ;
   private String[] P07RJ2_A8337EmpItm4 ;
   private boolean[] P07RJ2_n8337EmpItm4 ;
   private String[] P07RJ2_A8336EmpItm3 ;
   private boolean[] P07RJ2_n8336EmpItm3 ;
   private String[] P07RJ3_A396EmprCod ;
   private String[] P07RJ3_A395EmprCif ;
   private boolean[] P07RJ3_n395EmprCif ;
   private String[] P07RJ4_A396EmprCod ;
   private int[] P07RJ4_A11669DevCruId ;
   private String[] P07RJ4_A13983DevCruATCU ;
   private java.util.Date[] P07RJ4_A11673DevCruSal ;
   private String[] P07RJ4_A11674DevCruHash ;
   private String[] P07RJ4_A11680DevCruAtId ;
   private String[] P07RJ4_A11682DevCruObs ;
   private String[] P07RJ4_A11672DevCruMat ;
   private String[] P07RJ4_A278CliNif ;
   private java.util.Date[] P07RJ4_A11670DevCruFec ;
   private int[] P07RJ4_A252CliCod ;
   private String[] P07RJ4_A295CliPob ;
   private String[] P07RJ4_A260CliDom ;
   private String[] P07RJ4_A279CliNom ;
   private String[] P07RJ5_A396EmprCod ;
   private int[] P07RJ5_A11669DevCruId ;
   private java.math.BigDecimal[] P07RJ5_A11683DevCruUnd ;
   private int[] P07RJ5_A11684DevCruPzs ;
   private String[] P07RJ5_A46AlbREnt ;
   private String[] P07RJ5_A3613AlbRefDsc ;
   private int[] P07RJ5_A44AlbRecCod ;
}

final  class rdevcrumoda21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07RJ2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RJ3", "SELECT EmprCod, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RJ4", "SELECT T1.EmprCod, T1.DevCruId, T1.DevCruATCU, T1.DevCruSal, T1.DevCruHash, T1.DevCruAtId, T1.DevCruObs, T1.DevCruMat, T2.CliNif, T1.DevCruFec, T1.CliCod, T2.CliPob, T2.CliDom, T2.CliNom FROM (TXPDEVCRU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07RJ5", "SELECT T1.EmprCod, T1.DevCruId, T1.DevCruUnd, T1.DevCruPzs, T2.AlbREnt, T2.AlbRefDsc, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((String[]) buf[12])[0] = rslt.getString(13, 34);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

