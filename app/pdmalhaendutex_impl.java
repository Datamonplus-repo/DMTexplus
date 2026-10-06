package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pdmalhaendutex_impl extends GXWebReport
{
   public pdmalhaendutex_impl( com.genexus.internet.HttpContext context )
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
            AV100TCopia = httpContext.GetPar( "TCopia") ;
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
         super.Gx_out = this.Gx_out ;
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
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVMOD", ""), GXv_char1) ;
         pdmalhaendutex_impl.this.AV60ContDsc = GXv_char1[0] ;
         GXt_char2 = AV109Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pdmalhaendutex_impl.this.A396EmprCod = GXv_char1[0] ;
         pdmalhaendutex_impl.this.GXt_char2 = GXv_char4[0] ;
         AV109Firmad = GXt_char2 ;
         GxHdr2 = true ;
         /* Using cursor P05ZA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A953IvaCod = P05ZA2_A953IvaCod[0] ;
            n953IvaCod = P05ZA2_n953IvaCod[0] ;
            A840TrnCod = P05ZA2_A840TrnCod[0] ;
            n840TrnCod = P05ZA2_n840TrnCod[0] ;
            A252CliCod = P05ZA2_A252CliCod[0] ;
            A11674DevCruHash = P05ZA2_A11674DevCruHash[0] ;
            A11680DevCruAtId = P05ZA2_A11680DevCruAtId[0] ;
            A11670DevCruFec = P05ZA2_A11670DevCruFec[0] ;
            A588IvaPor = P05ZA2_A588IvaPor[0] ;
            n588IvaPor = P05ZA2_n588IvaPor[0] ;
            A11672DevCruMat = P05ZA2_A11672DevCruMat[0] ;
            A11673DevCruSal = P05ZA2_A11673DevCruSal[0] ;
            A407EmprNom = P05ZA2_A407EmprNom[0] ;
            n407EmprNom = P05ZA2_n407EmprNom[0] ;
            A11682DevCruObs = P05ZA2_A11682DevCruObs[0] ;
            A11678DevCruStt = P05ZA2_A11678DevCruStt[0] ;
            A841TrnNom = P05ZA2_A841TrnNom[0] ;
            n841TrnNom = P05ZA2_n841TrnNom[0] ;
            A953IvaCod = P05ZA2_A953IvaCod[0] ;
            n953IvaCod = P05ZA2_n953IvaCod[0] ;
            A407EmprNom = P05ZA2_A407EmprNom[0] ;
            n407EmprNom = P05ZA2_n407EmprNom[0] ;
            A588IvaPor = P05ZA2_A588IvaPor[0] ;
            n588IvaPor = P05ZA2_n588IvaPor[0] ;
            A841TrnNom = P05ZA2_A841TrnNom[0] ;
            n841TrnNom = P05ZA2_n841TrnNom[0] ;
            AV16CliCod = A252CliCod ;
            /* Execute user subroutine: 'CLIAS4' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'CLIENTE' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV69Cp_1_2 = GXutil.trim( AV19Clicp) ;
            AV107Texto_fd = " " ;
            if ( GXutil.strcmp(A11674DevCruHash, " ") != 0 )
            {
               AV108Firma4dig = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
               AV107Texto_fd = AV108Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV109Firmad) ;
            }
            else
            {
               AV107Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV112AtId = " " ;
            if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
            {
               AV112AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A11680DevCruAtId, 1, 12)) ;
            }
            AV80DiaF = (byte)(GXutil.day( A11670DevCruFec)) ;
            AV83MesF = (byte)(GXutil.month( A11670DevCruFec)) ;
            AV81DiaA = GXutil.padl( GXutil.trim( GXutil.str( AV80DiaF, 2, 0)), (short)(2), "0") ;
            AV84MesA = GXutil.padl( GXutil.trim( GXutil.str( AV83MesF, 2, 0)), (short)(2), "0") ;
            AV85AnyF = (short)(GXutil.year( A11670DevCruFec)) ;
            AV88NumAlb = GXutil.padl( GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)), (short)(8), "0") ;
            AV122Documento = "20-" + GXutil.padl( GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)), (short)(8), "0") ;
            AV86Fecha_a = GXutil.str( AV85AnyF, 4, 0) + "/" + AV84MesA + "/" + AV81DiaA ;
            AV64IvaPor = A588IvaPor ;
            AV65AlbMat = A11672DevCruMat ;
            AV75AlbProFch = A11670DevCruFec ;
            AV120DiaHora = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV119DiaCarga = localUtil.ctod( GXutil.substring( AV120DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV121HoraCarga = GXutil.substring( AV120DiaHora, 12, 8) ;
            AV111Albfecsal = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( A11673DevCruSal, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            AV66AlbHorSal = localUtil.ttoc( A11673DevCruSal, 0, 10, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV21EmprNom = A407EmprNom ;
            AV57VDoc = httpContext.getMessage( "Guia de Devoluçao", "") ;
            AV46vCopia = ((AV49Copias==1) ? httpContext.getMessage( "DUPLICADO", "") : AV46vCopia) ;
            AV115Nlin = (short)(GXutil.gxmlines( A11682DevCruObs, (short)(50))) ;
            AV58i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV59vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            while ( AV58i <= AV115Nlin )
            {
               if ( AV58i > 2 )
               {
                  if (true) break;
               }
               AV59vObs[AV58i-1] = GXutil.gxgetmli( A11682DevCruObs, AV58i, (short)(50)) ;
               AV58i = (byte)(AV58i+1) ;
            }
            /* Using cursor P05ZA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A6263AlbRTartC = P05ZA3_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P05ZA3_n6263AlbRTartC[0] ;
               A58AlbRUniEnt = P05ZA3_A58AlbRUniEnt[0] ;
               A4921AlbRAnc = P05ZA3_A4921AlbRAnc[0] ;
               A4920AlbRGrm2 = P05ZA3_A4920AlbRGrm2[0] ;
               A11683DevCruUnd = P05ZA3_A11683DevCruUnd[0] ;
               A11684DevCruPzs = P05ZA3_A11684DevCruPzs[0] ;
               A56AlbRUni = P05ZA3_A56AlbRUni[0] ;
               A6264AlbRTartD = P05ZA3_A6264AlbRTartD[0] ;
               n6264AlbRTartD = P05ZA3_n6264AlbRTartD[0] ;
               A3613AlbRefDsc = P05ZA3_A3613AlbRefDsc[0] ;
               A44AlbRecCod = P05ZA3_A44AlbRecCod[0] ;
               A6263AlbRTartC = P05ZA3_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P05ZA3_n6263AlbRTartC[0] ;
               A58AlbRUniEnt = P05ZA3_A58AlbRUniEnt[0] ;
               A4921AlbRAnc = P05ZA3_A4921AlbRAnc[0] ;
               A4920AlbRGrm2 = P05ZA3_A4920AlbRGrm2[0] ;
               A56AlbRUni = P05ZA3_A56AlbRUni[0] ;
               A3613AlbRefDsc = P05ZA3_A3613AlbRefDsc[0] ;
               A6264AlbRTartD = P05ZA3_A6264AlbRTartD[0] ;
               n6264AlbRTartD = P05ZA3_n6264AlbRTartD[0] ;
               if ( AV48ContLine >= 20 )
               {
                  /* Execute user subroutine: 'PIE' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV123Metros = (((A4920AlbRGrm2*(A4921AlbRAnc/ (double) (100)))>0) ? (A58AlbRUniEnt.divide(DecimalUtil.doubleToDec((A4920AlbRGrm2*(A4921AlbRAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
               AV116Tot = GXutil.roundDecimal( DecimalUtil.doubleToDec(1).multiply(A11683DevCruUnd), 2) ;
               h5ZA0( false, 15) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 22, Gx_line+0, 186, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6264AlbRTartD, "")), 186, Gx_line+0, 375, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11683DevCruUnd, "ZZZZZ9.99")), 422, Gx_line+0, 479, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 482, Gx_line+0, 493, Gx_line+15, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")), 511, Gx_line+0, 550, Gx_line+15, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9")), 590, Gx_line+1, 616, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9")), 654, Gx_line+0, 680, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123Metros, "ZZZZZ9.99")), 709, Gx_line+0, 766, Gx_line+15, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
               AV48ContLine = (byte)(AV48ContLine+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Execute user subroutine: 'PIE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5ZA0( true, 0) ;
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

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PIE' Routine */
      returnInSub = false ;
      while ( AV48ContLine <= 22 )
      {
         h5ZA0( false, 15) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         AV48ContLine = (byte)(AV48ContLine+1) ;
      }
      AV48ContLine = (byte)(0) ;
      if ( AV102N_copia <= 3 )
      {
         AV101vLey = " " ;
      }
      else
      {
         AV101vLey = httpContext.getMessage( "Copia de documento nao valida para os fins previstos no Regime Tributario Complementar dos Bens em Circulacao", "") ;
      }
      if ( (GXutil.strcmp("", A11678DevCruStt)==0) )
      {
         h5ZA0( false, 321) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 29, Gx_line+115, 94, Gx_line+129, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 124, Gx_line+115, 438, Gx_line+130, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 124, Gx_line+131, 438, Gx_line+146, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60ContDsc, "")), 24, Gx_line+267, 150, Gx_line+282, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 28, Gx_line+153, 100, Gx_line+167, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "VILAR", ""), 145, Gx_line+153, 175, Gx_line+167, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "S. JOAO DAS CALDAS", ""), 145, Gx_line+170, 245, Gx_line+184, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Partida:", ""), 517, Gx_line+153, 554, Gx_line+167, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121HoraCarga, "")), 679, Gx_line+151, 763, Gx_line+166, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 715, Gx_line+195, 742, Gx_line+209, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matricula:", ""), 517, Gx_line+170, 568, Gx_line+184, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65AlbMat, "")), 590, Gx_line+170, 716, Gx_line+185, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 29, Gx_line+195, 118, Gx_line+209, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24CliEDom, "")), 146, Gx_line+195, 360, Gx_line+210, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26CliEPob, "")), 146, Gx_line+211, 335, Gx_line+226, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25CliEcp, "")), 146, Gx_line+228, 210, Gx_line+243, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Chegada:     /     /", ""), 518, Gx_line+195, 594, Gx_line+209, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 635, Gx_line+151, 662, Gx_line+165, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "RECEBIDO POR", ""), 583, Gx_line+211, 653, Gx_line+225, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(532, Gx_line+245, 737, Gx_line+245, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70PrvDsc, "@!")), 211, Gx_line+228, 400, Gx_line+243, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101vLey, "")), 24, Gx_line+250, 775, Gx_line+265, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Texto_fd, "")), 164, Gx_line+268, 540, Gx_line+283, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV119DiaCarga, "99/99/99"), 575, Gx_line+153, 622, Gx_line+168, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112AtId, "")), 553, Gx_line+269, 742, Gx_line+284, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(13, Gx_line+101, 789, Gx_line+321, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+321) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CLIAS4' Routine */
      returnInSub = false ;
      AV89CliAlfa = GXutil.space( (short)(6)) ;
      AV129GXLvl123 = (byte)(0) ;
      /* Using cursor P05ZA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P05ZA4_A252CliCod[0] ;
         A257CliCue = P05ZA4_A257CliCue[0] ;
         AV129GXLvl123 = (byte)(1) ;
         AV89CliAlfa = GXutil.substring( A257CliCue, 1, 6) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV129GXLvl123 == 0 )
      {
         AV89CliAlfa = GXutil.str( A252CliCod, 6, 0) ;
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      /* Using cursor P05ZA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A781PrvCod = P05ZA5_A781PrvCod[0] ;
         A252CliCod = P05ZA5_A252CliCod[0] ;
         A279CliNom = P05ZA5_A279CliNom[0] ;
         A3644CliNom1 = P05ZA5_A3644CliNom1[0] ;
         A260CliDom = P05ZA5_A260CliDom[0] ;
         A4828CliCp2 = P05ZA5_A4828CliCp2[0] ;
         A256CliCp = P05ZA5_A256CliCp[0] ;
         A295CliPob = P05ZA5_A295CliPob[0] ;
         A278CliNif = P05ZA5_A278CliNif[0] ;
         A787PrvDsc = P05ZA5_A787PrvDsc[0] ;
         n787PrvDsc = P05ZA5_n787PrvDsc[0] ;
         A787PrvDsc = P05ZA5_A787PrvDsc[0] ;
         n787PrvDsc = P05ZA5_n787PrvDsc[0] ;
         AV17CliNom = A279CliNom ;
         AV97CliNom12 = GXutil.trim( A279CliNom) + " " + GXutil.trim( A3644CliNom1) ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         AV23CliENom = A279CliNom ;
         AV24CliEDom = A260CliDom ;
         AV25CliEcp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV26CliEPob = A295CliPob ;
         AV110Prvdsc1 = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P05ZA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A266CliEnvLin = P05ZA6_A266CliEnvLin[0] ;
         A252CliCod = P05ZA6_A252CliCod[0] ;
         A267CliEnvNom = P05ZA6_A267CliEnvNom[0] ;
         A265CliEnvDom = P05ZA6_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P05ZA6_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P05ZA6_A264CliEnvCp[0] ;
         A268CliEnvPob = P05ZA6_A268CliEnvPob[0] ;
         A270CliEnvPrv = P05ZA6_A270CliEnvPrv[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( A10775CliEnvCp2) ;
         AV26CliEPob = A268CliEnvPob ;
         AV71CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S157 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S157( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P05ZA7 */
      pr_default.execute(5, new Object[] {Short.valueOf(AV71CodPrv)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A781PrvCod = P05ZA7_A781PrvCod[0] ;
         A787PrvDsc = P05ZA7_A787PrvDsc[0] ;
         n787PrvDsc = P05ZA7_n787PrvDsc[0] ;
         AV70PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h5ZA0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               if ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) != 0 )
               {
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97CliNom12, "")), 413, Gx_line+203, 789, Gx_line+218, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliDom, "")), 413, Gx_line+220, 627, Gx_line+235, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 413, Gx_line+236, 602, Gx_line+251, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE NR", ""), 23, Gx_line+267, 109, Gx_line+281, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliAlfa, "")), 176, Gx_line+250, 240, Gx_line+265, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Fecha_a, "")), 681, Gx_line+30, 745, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 176, Gx_line+267, 302, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "NUM:", ""), 648, Gx_line+47, 677, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 648, Gx_line+30, 674, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VIA EXPEDICAO", ""), 23, Gx_line+300, 98, Gx_line+314, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VENDEDOR", ""), 23, Gx_line+317, 77, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa IVA -", ""), 688, Gx_line+366, 733, Gx_line+380, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64IvaPor), "Z9")), 740, Gx_line+366, 754, Gx_line+381, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Cp_1_2, "")), 413, Gx_line+253, 483, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Prvdsc1, "@!")), 507, Gx_line+253, 696, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 176, Gx_line+300, 365, Gx_line+315, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TAM - MERC.INTERNO", ""), 176, Gx_line+317, 279, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 761, Gx_line+366, 770, Gx_line+380, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TCopia, "")), 644, Gx_line+80, 739, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 648, Gx_line+14, 774, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 23, Gx_line+250, 62, Gx_line+264, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Documento, "")), 681, Gx_line+47, 751, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "969bc018-2e69-44a8-9a51-2bdb92ccce51", "", context.getHttpContext().getTheme( )), 22, Gx_line+13, 229, Gx_line+181) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3d88a1e5-db8d-4ccb-ac97-daf19afc12cf", "", context.getHttpContext().getTheme( )), 314, Gx_line+15, 457, Gx_line+90) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "ee7f8233-fb56-4a66-a0c7-5f5540cb294f", "", context.getHttpContext().getTheme( )), 464, Gx_line+15, 607, Gx_line+90) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "974ddd4b-3538-4bab-bef4-14b0c4134dba", "", context.getHttpContext().getTheme( )), 239, Gx_line+22, 308, Gx_line+89) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "fc2c1d60-082e-420a-bad3-0d4e101c83dc", "", context.getHttpContext().getTheme( )), 238, Gx_line+103, 373, Gx_line+181) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54fd2961-d848-4c83-9bb8-3008dba60df6", "", context.getHttpContext().getTheme( )), 396, Gx_line+103, 462, Gx_line+183) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "4524f958-2522-4fc5-bdf8-941692cffd3c", "", context.getHttpContext().getTheme( )), 484, Gx_line+103, 583, Gx_line+170) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+384) ;
                  getPrinter().GxDrawRect(3, Gx_line+0, 791, Gx_line+31, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TIPO DE MALHA", ""), 23, Gx_line+9, 100, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "QUANTIDADE", ""), 413, Gx_line+9, 480, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "UN", ""), 485, Gx_line+9, 501, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "COMPOSIÇÃO", ""), 186, Gx_line+9, 254, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº PEÇAS", ""), 507, Gx_line+9, 553, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "GRAMAGEM", ""), 571, Gx_line+9, 633, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LARGURA", ""), 643, Gx_line+9, 691, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 718, Gx_line+9, 759, Gx_line+23, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+39) ;
               }
               else
               {
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97CliNom12, "")), 425, Gx_line+203, 801, Gx_line+218, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliDom, "")), 425, Gx_line+220, 639, Gx_line+235, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 425, Gx_line+236, 614, Gx_line+251, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE NR", ""), 29, Gx_line+267, 115, Gx_line+281, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliAlfa, "")), 190, Gx_line+250, 254, Gx_line+265, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 190, Gx_line+267, 316, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VIA EXPEDICAO", ""), 29, Gx_line+300, 104, Gx_line+314, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VENDEDOR", ""), 29, Gx_line+317, 83, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Cp_1_2, "")), 425, Gx_line+253, 495, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Prvdsc1, "@!")), 527, Gx_line+253, 716, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 190, Gx_line+300, 379, Gx_line+315, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TAM - MERC.INTERNO", ""), 190, Gx_line+317, 293, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "**   G U I A   A N U L A D A   **", ""), 357, Gx_line+404, 490, Gx_line+418, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Texto_fd, "")), 29, Gx_line+367, 405, Gx_line+382, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Fecha_a, "")), 681, Gx_line+30, 745, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "NUM:", ""), 648, Gx_line+47, 677, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 648, Gx_line+30, 674, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 648, Gx_line+14, 774, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112AtId, "")), 481, Gx_line+367, 670, Gx_line+382, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(2, Gx_line+396, 790, Gx_line+429, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 29, Gx_line+250, 68, Gx_line+264, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Documento, "")), 681, Gx_line+47, 751, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "969bc018-2e69-44a8-9a51-2bdb92ccce51", "", context.getHttpContext().getTheme( )), 34, Gx_line+19, 241, Gx_line+187) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3d88a1e5-db8d-4ccb-ac97-daf19afc12cf", "", context.getHttpContext().getTheme( )), 326, Gx_line+21, 469, Gx_line+96) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "ee7f8233-fb56-4a66-a0c7-5f5540cb294f", "", context.getHttpContext().getTheme( )), 476, Gx_line+21, 619, Gx_line+96) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "974ddd4b-3538-4bab-bef4-14b0c4134dba", "", context.getHttpContext().getTheme( )), 251, Gx_line+28, 320, Gx_line+95) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "fc2c1d60-082e-420a-bad3-0d4e101c83dc", "", context.getHttpContext().getTheme( )), 250, Gx_line+109, 385, Gx_line+187) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54fd2961-d848-4c83-9bb8-3008dba60df6", "", context.getHttpContext().getTheme( )), 408, Gx_line+109, 474, Gx_line+189) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "4524f958-2522-4fc5-bdf8-941692cffd3c", "", context.getHttpContext().getTheme( )), 497, Gx_line+109, 596, Gx_line+176) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+433) ;
               }
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
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV100TCopia = "" ;
      AV60ContDsc = "" ;
      AV109Firmad = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P05ZA2_A953IvaCod = new String[] {""} ;
      P05ZA2_n953IvaCod = new boolean[] {false} ;
      P05ZA2_A840TrnCod = new short[1] ;
      P05ZA2_n840TrnCod = new boolean[] {false} ;
      P05ZA2_A396EmprCod = new String[] {""} ;
      P05ZA2_A11669DevCruId = new int[1] ;
      P05ZA2_A252CliCod = new int[1] ;
      P05ZA2_A11674DevCruHash = new String[] {""} ;
      P05ZA2_A11680DevCruAtId = new String[] {""} ;
      P05ZA2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05ZA2_A588IvaPor = new byte[1] ;
      P05ZA2_n588IvaPor = new boolean[] {false} ;
      P05ZA2_A11672DevCruMat = new String[] {""} ;
      P05ZA2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P05ZA2_A407EmprNom = new String[] {""} ;
      P05ZA2_n407EmprNom = new boolean[] {false} ;
      P05ZA2_A11682DevCruObs = new String[] {""} ;
      P05ZA2_A11678DevCruStt = new String[] {""} ;
      P05ZA2_A841TrnNom = new String[] {""} ;
      P05ZA2_n841TrnNom = new boolean[] {false} ;
      A953IvaCod = "" ;
      A11674DevCruHash = "" ;
      A11680DevCruAtId = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11672DevCruMat = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A407EmprNom = "" ;
      A11682DevCruObs = "" ;
      A11678DevCruStt = "" ;
      A841TrnNom = "" ;
      AV69Cp_1_2 = "" ;
      AV19Clicp = "" ;
      AV107Texto_fd = "" ;
      AV108Firma4dig = "" ;
      AV112AtId = "" ;
      AV81DiaA = "" ;
      AV84MesA = "" ;
      AV88NumAlb = "" ;
      AV122Documento = "" ;
      AV86Fecha_a = "" ;
      AV65AlbMat = "" ;
      AV75AlbProFch = GXutil.nullDate() ;
      AV120DiaHora = "" ;
      AV119DiaCarga = GXutil.nullDate() ;
      AV121HoraCarga = "" ;
      AV111Albfecsal = GXutil.nullDate() ;
      AV66AlbHorSal = "" ;
      AV21EmprNom = "" ;
      AV57VDoc = "" ;
      AV46vCopia = "" ;
      AV59vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05ZA3_A6263AlbRTartC = new short[1] ;
      P05ZA3_n6263AlbRTartC = new boolean[] {false} ;
      P05ZA3_A396EmprCod = new String[] {""} ;
      P05ZA3_A11669DevCruId = new int[1] ;
      P05ZA3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZA3_A4921AlbRAnc = new short[1] ;
      P05ZA3_A4920AlbRGrm2 = new short[1] ;
      P05ZA3_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05ZA3_A11684DevCruPzs = new int[1] ;
      P05ZA3_A56AlbRUni = new String[] {""} ;
      P05ZA3_A6264AlbRTartD = new String[] {""} ;
      P05ZA3_n6264AlbRTartD = new boolean[] {false} ;
      P05ZA3_A3613AlbRefDsc = new String[] {""} ;
      P05ZA3_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A6264AlbRTartD = "" ;
      A3613AlbRefDsc = "" ;
      AV123Metros = DecimalUtil.ZERO ;
      AV116Tot = DecimalUtil.ZERO ;
      AV101vLey = "" ;
      AV24CliEDom = "" ;
      AV26CliEPob = "" ;
      AV25CliEcp = "" ;
      AV70PrvDsc = "" ;
      A257CliCue = "" ;
      AV89CliAlfa = "" ;
      P05ZA4_A396EmprCod = new String[] {""} ;
      P05ZA4_A252CliCod = new int[1] ;
      P05ZA4_A257CliCue = new String[] {""} ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      P05ZA5_A781PrvCod = new short[1] ;
      P05ZA5_A396EmprCod = new String[] {""} ;
      P05ZA5_A252CliCod = new int[1] ;
      P05ZA5_A279CliNom = new String[] {""} ;
      P05ZA5_A3644CliNom1 = new String[] {""} ;
      P05ZA5_A260CliDom = new String[] {""} ;
      P05ZA5_A4828CliCp2 = new String[] {""} ;
      P05ZA5_A256CliCp = new String[] {""} ;
      P05ZA5_A295CliPob = new String[] {""} ;
      P05ZA5_A278CliNif = new String[] {""} ;
      P05ZA5_A787PrvDsc = new String[] {""} ;
      P05ZA5_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A260CliDom = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A787PrvDsc = "" ;
      AV97CliNom12 = "" ;
      AV110Prvdsc1 = "" ;
      P05ZA6_A396EmprCod = new String[] {""} ;
      P05ZA6_A266CliEnvLin = new byte[1] ;
      P05ZA6_A252CliCod = new int[1] ;
      P05ZA6_A267CliEnvNom = new String[] {""} ;
      P05ZA6_A265CliEnvDom = new String[] {""} ;
      P05ZA6_A10775CliEnvCp2 = new String[] {""} ;
      P05ZA6_A264CliEnvCp = new String[] {""} ;
      P05ZA6_A268CliEnvPob = new String[] {""} ;
      P05ZA6_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P05ZA7_A781PrvCod = new short[1] ;
      P05ZA7_A787PrvDsc = new String[] {""} ;
      P05ZA7_n787PrvDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdmalhaendutex__default(),
         new Object[] {
             new Object[] {
            P05ZA2_A953IvaCod, P05ZA2_n953IvaCod, P05ZA2_A840TrnCod, P05ZA2_n840TrnCod, P05ZA2_A396EmprCod, P05ZA2_A11669DevCruId, P05ZA2_A252CliCod, P05ZA2_A11674DevCruHash, P05ZA2_A11680DevCruAtId, P05ZA2_A11670DevCruFec,
            P05ZA2_A588IvaPor, P05ZA2_n588IvaPor, P05ZA2_A11672DevCruMat, P05ZA2_A11673DevCruSal, P05ZA2_A407EmprNom, P05ZA2_n407EmprNom, P05ZA2_A11682DevCruObs, P05ZA2_A11678DevCruStt, P05ZA2_A841TrnNom, P05ZA2_n841TrnNom
            }
            , new Object[] {
            P05ZA3_A6263AlbRTartC, P05ZA3_n6263AlbRTartC, P05ZA3_A396EmprCod, P05ZA3_A11669DevCruId, P05ZA3_A58AlbRUniEnt, P05ZA3_A4921AlbRAnc, P05ZA3_A4920AlbRGrm2, P05ZA3_A11683DevCruUnd, P05ZA3_A11684DevCruPzs, P05ZA3_A56AlbRUni,
            P05ZA3_A6264AlbRTartD, P05ZA3_n6264AlbRTartD, P05ZA3_A3613AlbRefDsc, P05ZA3_A44AlbRecCod
            }
            , new Object[] {
            P05ZA4_A396EmprCod, P05ZA4_A252CliCod, P05ZA4_A257CliCue
            }
            , new Object[] {
            P05ZA5_A781PrvCod, P05ZA5_A396EmprCod, P05ZA5_A252CliCod, P05ZA5_A279CliNom, P05ZA5_A3644CliNom1, P05ZA5_A260CliDom, P05ZA5_A4828CliCp2, P05ZA5_A256CliCp, P05ZA5_A295CliPob, P05ZA5_A278CliNif,
            P05ZA5_A787PrvDsc, P05ZA5_n787PrvDsc
            }
            , new Object[] {
            P05ZA6_A396EmprCod, P05ZA6_A266CliEnvLin, P05ZA6_A252CliCod, P05ZA6_A267CliEnvNom, P05ZA6_A265CliEnvDom, P05ZA6_A10775CliEnvCp2, P05ZA6_A264CliEnvCp, P05ZA6_A268CliEnvPob, P05ZA6_A270CliEnvPrv
            }
            , new Object[] {
            P05ZA7_A781PrvCod, P05ZA7_A787PrvDsc, P05ZA7_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A588IvaPor ;
   private byte AV80DiaF ;
   private byte AV83MesF ;
   private byte AV64IvaPor ;
   private byte AV49Copias ;
   private byte AV58i ;
   private byte AV48ContLine ;
   private byte AV129GXLvl123 ;
   private byte AV22CliEnvDom ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short A840TrnCod ;
   private short AV85AnyF ;
   private short AV115Nlin ;
   private short A6263AlbRTartC ;
   private short A4921AlbRAnc ;
   private short A4920AlbRGrm2 ;
   private short AV102N_copia ;
   private short A781PrvCod ;
   private short A270CliEnvPrv ;
   private short AV71CodPrv ;
   private short Gx_err ;
   private int A11669DevCruId ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private int GX_I ;
   private int A11684DevCruPzs ;
   private int A44AlbRecCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV123Metros ;
   private java.math.BigDecimal AV116Tot ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV100TCopia ;
   private String AV60ContDsc ;
   private String AV109Firmad ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A11674DevCruHash ;
   private String A11680DevCruAtId ;
   private String A11672DevCruMat ;
   private String A407EmprNom ;
   private String A11678DevCruStt ;
   private String A841TrnNom ;
   private String AV69Cp_1_2 ;
   private String AV19Clicp ;
   private String AV107Texto_fd ;
   private String AV108Firma4dig ;
   private String AV112AtId ;
   private String AV81DiaA ;
   private String AV84MesA ;
   private String AV88NumAlb ;
   private String AV122Documento ;
   private String AV86Fecha_a ;
   private String AV65AlbMat ;
   private String AV120DiaHora ;
   private String AV121HoraCarga ;
   private String AV66AlbHorSal ;
   private String AV21EmprNom ;
   private String AV57VDoc ;
   private String AV46vCopia ;
   private String AV59vObs[] ;
   private String A56AlbRUni ;
   private String A6264AlbRTartD ;
   private String A3613AlbRefDsc ;
   private String AV101vLey ;
   private String AV24CliEDom ;
   private String AV26CliEPob ;
   private String AV25CliEcp ;
   private String AV70PrvDsc ;
   private String A257CliCue ;
   private String AV89CliAlfa ;
   private String AV17CliNom ;
   private String AV18CliDom ;
   private String AV20CliPob ;
   private String AV47CliNif ;
   private String AV23CliENom ;
   private String A279CliNom ;
   private String A3644CliNom1 ;
   private String A260CliDom ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV97CliNom12 ;
   private String AV110Prvdsc1 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A10775CliEnvCp2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV75AlbProFch ;
   private java.util.Date AV119DiaCarga ;
   private java.util.Date AV111Albfecsal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n953IvaCod ;
   private boolean n840TrnCod ;
   private boolean n588IvaPor ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n6263AlbRTartC ;
   private boolean n6264AlbRTartD ;
   private boolean n787PrvDsc ;
   private String A11682DevCruObs ;
   private IDataStoreProvider pr_default ;
   private String[] P05ZA2_A953IvaCod ;
   private boolean[] P05ZA2_n953IvaCod ;
   private short[] P05ZA2_A840TrnCod ;
   private boolean[] P05ZA2_n840TrnCod ;
   private String[] P05ZA2_A396EmprCod ;
   private int[] P05ZA2_A11669DevCruId ;
   private int[] P05ZA2_A252CliCod ;
   private String[] P05ZA2_A11674DevCruHash ;
   private String[] P05ZA2_A11680DevCruAtId ;
   private java.util.Date[] P05ZA2_A11670DevCruFec ;
   private byte[] P05ZA2_A588IvaPor ;
   private boolean[] P05ZA2_n588IvaPor ;
   private String[] P05ZA2_A11672DevCruMat ;
   private java.util.Date[] P05ZA2_A11673DevCruSal ;
   private String[] P05ZA2_A407EmprNom ;
   private boolean[] P05ZA2_n407EmprNom ;
   private String[] P05ZA2_A11682DevCruObs ;
   private String[] P05ZA2_A11678DevCruStt ;
   private String[] P05ZA2_A841TrnNom ;
   private boolean[] P05ZA2_n841TrnNom ;
   private short[] P05ZA3_A6263AlbRTartC ;
   private boolean[] P05ZA3_n6263AlbRTartC ;
   private String[] P05ZA3_A396EmprCod ;
   private int[] P05ZA3_A11669DevCruId ;
   private java.math.BigDecimal[] P05ZA3_A58AlbRUniEnt ;
   private short[] P05ZA3_A4921AlbRAnc ;
   private short[] P05ZA3_A4920AlbRGrm2 ;
   private java.math.BigDecimal[] P05ZA3_A11683DevCruUnd ;
   private int[] P05ZA3_A11684DevCruPzs ;
   private String[] P05ZA3_A56AlbRUni ;
   private String[] P05ZA3_A6264AlbRTartD ;
   private boolean[] P05ZA3_n6264AlbRTartD ;
   private String[] P05ZA3_A3613AlbRefDsc ;
   private int[] P05ZA3_A44AlbRecCod ;
   private String[] P05ZA4_A396EmprCod ;
   private int[] P05ZA4_A252CliCod ;
   private String[] P05ZA4_A257CliCue ;
   private short[] P05ZA5_A781PrvCod ;
   private String[] P05ZA5_A396EmprCod ;
   private int[] P05ZA5_A252CliCod ;
   private String[] P05ZA5_A279CliNom ;
   private String[] P05ZA5_A3644CliNom1 ;
   private String[] P05ZA5_A260CliDom ;
   private String[] P05ZA5_A4828CliCp2 ;
   private String[] P05ZA5_A256CliCp ;
   private String[] P05ZA5_A295CliPob ;
   private String[] P05ZA5_A278CliNif ;
   private String[] P05ZA5_A787PrvDsc ;
   private boolean[] P05ZA5_n787PrvDsc ;
   private String[] P05ZA6_A396EmprCod ;
   private byte[] P05ZA6_A266CliEnvLin ;
   private int[] P05ZA6_A252CliCod ;
   private String[] P05ZA6_A267CliEnvNom ;
   private String[] P05ZA6_A265CliEnvDom ;
   private String[] P05ZA6_A10775CliEnvCp2 ;
   private String[] P05ZA6_A264CliEnvCp ;
   private String[] P05ZA6_A268CliEnvPob ;
   private short[] P05ZA6_A270CliEnvPrv ;
   private short[] P05ZA7_A781PrvCod ;
   private String[] P05ZA7_A787PrvDsc ;
   private boolean[] P05ZA7_n787PrvDsc ;
}

final  class pdmalhaendutex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05ZA2", "SELECT T2.IvaCod, T1.TrnCod, T1.EmprCod, T1.DevCruId, T1.CliCod, T1.DevCruHash, T1.DevCruAtId, T1.DevCruFec, T3.IvaPor, T1.DevCruMat, T1.DevCruSal, T2.EmprNom, T1.DevCruObs, T1.DevCruStt, T4.TrnNom FROM (((TXPDEVCRU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPTIPIVA T3 ON T3.IvaCod = T2.IvaCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05ZA3", "SELECT T2.AlbRTartC AS AlbRTartC, T1.EmprCod, T1.DevCruId, T2.AlbRUniEnt, T2.AlbRAnc, T2.AlbRGrm2, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRUni, T3.TipArtDsc AS AlbRTartD, T2.AlbRefDsc, T1.AlbRecCod FROM ((TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T2.AlbRTartC) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05ZA4", "SELECT EmprCod, CliCod, CliCue FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05ZA5", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T1.CliNom, T1.CliNom1, T1.CliDom, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliNif, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05ZA6", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05ZA7", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 200);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

