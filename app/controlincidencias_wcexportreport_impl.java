package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlincidencias_wcexportreport_impl extends GXWebReport
{
   public controlincidencias_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
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
      M_bot = 6 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S151 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV46Title = httpContext.getMessage( "Lista de Tabla CRTIN1", "") ;
         /* Execute user subroutine: 'PRINTFILTERS' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTCOLUMNTITLES' */
         S121 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTDATA' */
         S131 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTFOOTER' */
         S171 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h94A0( true, 0) ;
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
      /* 'PRINTFILTERS' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17TFInc_Dia)) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV17TFInc_Dia, "99/99/99"), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV19TFInc_Linea) && (0==AV20TFInc_Linea_To) ) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFInc_Linea), "ZZZZZZZZZ9")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFInc_Linea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Linea", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFInc_Linea_To_Description, "")), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFInc_Linea_To), "ZZZZZZZZZ9")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV21TFInc_Hora) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV21TFInc_Hora, "99:99:99"), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFInc_Usuario_Sel)==0) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFInc_Usuario_Sel, "@!")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFInc_Usuario)==0) )
         {
            h94A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFInc_Usuario, "@!")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFInc_Terminal_Sel)==0) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFInc_Terminal_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFInc_Terminal)==0) )
         {
            h94A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFInc_Terminal, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFInc_Prog_Sel)==0) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Programa", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFInc_Prog_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFInc_Prog)==0) )
         {
            h94A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Programa", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFInc_Prog, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFInc_Hdr_Sel)==0) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº documento", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFInc_Hdr_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFInc_Hdr)==0) )
         {
            h94A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº documento", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFInc_Hdr, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFInc_obsTxt_Sel)==0) )
      {
         h94A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFInc_obsTxt_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFInc_obsTxt)==0) )
         {
            h94A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFInc_obsTxt, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h94A0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h94A0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 30, Gx_line+10, 111, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 115, Gx_line+10, 196, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 200, Gx_line+10, 281, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 285, Gx_line+10, 366, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 370, Gx_line+10, 451, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Programa", ""), 455, Gx_line+10, 536, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº documento", ""), 540, Gx_line+10, 621, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 625, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV57Controlincidencias_wcds_1_filterfulltext = AV12FilterFullText ;
      AV58Controlincidencias_wcds_2_tfinc_dia = AV17TFInc_Dia ;
      AV59Controlincidencias_wcds_3_tfinc_linea = AV19TFInc_Linea ;
      AV60Controlincidencias_wcds_4_tfinc_linea_to = AV20TFInc_Linea_To ;
      AV61Controlincidencias_wcds_5_tfinc_hora = AV21TFInc_Hora ;
      AV62Controlincidencias_wcds_6_tfinc_usuario = AV23TFInc_Usuario ;
      AV63Controlincidencias_wcds_7_tfinc_usuario_sel = AV24TFInc_Usuario_Sel ;
      AV64Controlincidencias_wcds_8_tfinc_terminal = AV25TFInc_Terminal ;
      AV65Controlincidencias_wcds_9_tfinc_terminal_sel = AV26TFInc_Terminal_Sel ;
      AV66Controlincidencias_wcds_10_tfinc_prog = AV27TFInc_Prog ;
      AV67Controlincidencias_wcds_11_tfinc_prog_sel = AV28TFInc_Prog_Sel ;
      AV68Controlincidencias_wcds_12_tfinc_hdr = AV29TFInc_Hdr ;
      AV69Controlincidencias_wcds_13_tfinc_hdr_sel = AV30TFInc_Hdr_Sel ;
      AV70Controlincidencias_wcds_14_tfinc_obstxt = AV31TFInc_obsTxt ;
      AV71Controlincidencias_wcds_15_tfinc_obstxt_sel = AV32TFInc_obsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Controlincidencias_wcds_1_filterfulltext ,
                                           AV58Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV59Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV60Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV61Controlincidencias_wcds_5_tfinc_hora ,
                                           AV63Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV62Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV65Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV64Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV67Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV66Controlincidencias_wcds_10_tfinc_prog ,
                                           AV69Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV68Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV71Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV70Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV48Emprcod ,
                                           AV49Inc_dia ,
                                           A396EmprCod ,
                                           AV50Inc_dia_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV57Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV62Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV62Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV64Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV64Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV66Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV66Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV68Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV68Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV70Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV70Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P094A2 */
      pr_default.execute(0, new Object[] {AV48Emprcod, AV49Inc_dia, AV50Inc_dia_to, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, lV57Controlincidencias_wcds_1_filterfulltext, AV58Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV59Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV60Controlincidencias_wcds_4_tfinc_linea_to), AV61Controlincidencias_wcds_5_tfinc_hora, lV62Controlincidencias_wcds_6_tfinc_usuario, AV63Controlincidencias_wcds_7_tfinc_usuario_sel, lV64Controlincidencias_wcds_8_tfinc_terminal, AV65Controlincidencias_wcds_9_tfinc_terminal_sel, lV66Controlincidencias_wcds_10_tfinc_prog, AV67Controlincidencias_wcds_11_tfinc_prog_sel, lV68Controlincidencias_wcds_12_tfinc_hdr, AV69Controlincidencias_wcds_13_tfinc_hdr_sel, lV70Controlincidencias_wcds_14_tfinc_obstxt, AV71Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P094A2_A396EmprCod[0] ;
         A4935Inc_Prog = P094A2_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P094A2_A4934Inc_Termin[0] ;
         A4933Inc_Usuari = P094A2_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P094A2_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P094A2_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P094A2_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P094A2_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P094A2_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P094A2_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P094A2_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h94A0( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A4929Inc_Dia, "99/99/99"), 30, Gx_line+10, 111, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9")), 115, Gx_line+10, 196, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A4932Inc_Hora, "99:99:99"), 200, Gx_line+10, 281, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!")), 285, Gx_line+10, 366, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4934Inc_Termin, "")), 370, Gx_line+10, 451, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4935Inc_Prog, "")), 455, Gx_line+10, 536, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13713Inc_Hdr, "")), 540, Gx_line+10, 621, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13712Inc_obsTxt, "")), 625, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+66) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue("ControlIncidencias_WCGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlIncidencias_WCGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("ControlIncidencias_WCGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV17TFInc_Dia = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV19TFInc_Linea = GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV20TFInc_Linea_To = GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV21TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV23TFInc_Usuario = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV24TFInc_Usuario_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV25TFInc_Terminal = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV26TFInc_Terminal_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV27TFInc_Prog = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV28TFInc_Prog_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV29TFInc_Hdr = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV30TFInc_Hdr_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT") == 0 )
         {
            AV31TFInc_obsTxt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT_SEL") == 0 )
         {
            AV32TFInc_obsTxt_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA") == 0 )
         {
            AV49Inc_dia = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA_TO") == 0 )
         {
            AV50Inc_dia_to = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void h94A0( boolean bFoot ,
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
               AV44PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV41DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
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
            AV46Title = AV53Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV46Title = "" ;
      AV12FilterFullText = "" ;
      AV17TFInc_Dia = GXutil.nullDate() ;
      AV34TFInc_Linea_To_Description = "" ;
      AV21TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV24TFInc_Usuario_Sel = "" ;
      AV23TFInc_Usuario = "" ;
      AV26TFInc_Terminal_Sel = "" ;
      AV25TFInc_Terminal = "" ;
      AV28TFInc_Prog_Sel = "" ;
      AV27TFInc_Prog = "" ;
      AV30TFInc_Hdr_Sel = "" ;
      AV29TFInc_Hdr = "" ;
      AV32TFInc_obsTxt_Sel = "" ;
      AV31TFInc_obsTxt = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A13713Inc_Hdr = "" ;
      A13712Inc_obsTxt = "" ;
      AV57Controlincidencias_wcds_1_filterfulltext = "" ;
      AV58Controlincidencias_wcds_2_tfinc_dia = GXutil.nullDate() ;
      AV61Controlincidencias_wcds_5_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV62Controlincidencias_wcds_6_tfinc_usuario = "" ;
      AV63Controlincidencias_wcds_7_tfinc_usuario_sel = "" ;
      AV64Controlincidencias_wcds_8_tfinc_terminal = "" ;
      AV65Controlincidencias_wcds_9_tfinc_terminal_sel = "" ;
      AV66Controlincidencias_wcds_10_tfinc_prog = "" ;
      AV67Controlincidencias_wcds_11_tfinc_prog_sel = "" ;
      AV68Controlincidencias_wcds_12_tfinc_hdr = "" ;
      AV69Controlincidencias_wcds_13_tfinc_hdr_sel = "" ;
      AV70Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      AV71Controlincidencias_wcds_15_tfinc_obstxt_sel = "" ;
      scmdbuf = "" ;
      lV57Controlincidencias_wcds_1_filterfulltext = "" ;
      lV62Controlincidencias_wcds_6_tfinc_usuario = "" ;
      lV64Controlincidencias_wcds_8_tfinc_terminal = "" ;
      lV66Controlincidencias_wcds_10_tfinc_prog = "" ;
      lV68Controlincidencias_wcds_12_tfinc_hdr = "" ;
      lV70Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      A5301Inc_BarPar = "" ;
      A4936Inc_Obs = "" ;
      AV48Emprcod = "" ;
      AV49Inc_dia = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV50Inc_dia_to = GXutil.nullDate() ;
      P094A2_A396EmprCod = new String[] {""} ;
      P094A2_A4935Inc_Prog = new String[] {""} ;
      P094A2_A4934Inc_Termin = new String[] {""} ;
      P094A2_A4933Inc_Usuari = new String[] {""} ;
      P094A2_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P094A2_A4931Inc_Linea = new long[1] ;
      P094A2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094A2_A5301Inc_BarPar = new String[] {""} ;
      P094A2_A5300Inc_BarReo = new byte[1] ;
      P094A2_A5299Inc_Barcod = new int[1] ;
      P094A2_A4936Inc_Obs = new String[] {""} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44PageInfo = "" ;
      AV41DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV53Pgmdesc = "" ;
      AV39AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlincidencias_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P094A2_A396EmprCod, P094A2_A4935Inc_Prog, P094A2_A4934Inc_Termin, P094A2_A4933Inc_Usuari, P094A2_A4932Inc_Hora, P094A2_A4931Inc_Linea, P094A2_A4929Inc_Dia, P094A2_A5301Inc_BarPar, P094A2_A5300Inc_BarReo, P094A2_A5299Inc_Barcod,
            P094A2_A4936Inc_Obs
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Control Incidencias_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Control Incidencias_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A5300Inc_BarReo ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A5299Inc_Barcod ;
   private int AV72GXV1 ;
   private long AV19TFInc_Linea ;
   private long AV20TFInc_Linea_To ;
   private long A4931Inc_Linea ;
   private long AV59Controlincidencias_wcds_3_tfinc_linea ;
   private long AV60Controlincidencias_wcds_4_tfinc_linea_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24TFInc_Usuario_Sel ;
   private String AV23TFInc_Usuario ;
   private String AV26TFInc_Terminal_Sel ;
   private String AV25TFInc_Terminal ;
   private String AV28TFInc_Prog_Sel ;
   private String AV27TFInc_Prog ;
   private String AV30TFInc_Hdr_Sel ;
   private String AV29TFInc_Hdr ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A13713Inc_Hdr ;
   private String AV62Controlincidencias_wcds_6_tfinc_usuario ;
   private String AV63Controlincidencias_wcds_7_tfinc_usuario_sel ;
   private String AV64Controlincidencias_wcds_8_tfinc_terminal ;
   private String AV65Controlincidencias_wcds_9_tfinc_terminal_sel ;
   private String AV66Controlincidencias_wcds_10_tfinc_prog ;
   private String AV67Controlincidencias_wcds_11_tfinc_prog_sel ;
   private String AV68Controlincidencias_wcds_12_tfinc_hdr ;
   private String AV69Controlincidencias_wcds_13_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String lV62Controlincidencias_wcds_6_tfinc_usuario ;
   private String lV64Controlincidencias_wcds_8_tfinc_terminal ;
   private String lV66Controlincidencias_wcds_10_tfinc_prog ;
   private String lV68Controlincidencias_wcds_12_tfinc_hdr ;
   private String A5301Inc_BarPar ;
   private String AV48Emprcod ;
   private String A396EmprCod ;
   private String AV53Pgmdesc ;
   private java.util.Date AV21TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV61Controlincidencias_wcds_5_tfinc_hora ;
   private java.util.Date AV17TFInc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV58Controlincidencias_wcds_2_tfinc_dia ;
   private java.util.Date AV49Inc_dia ;
   private java.util.Date AV50Inc_dia_to ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV46Title ;
   private String AV12FilterFullText ;
   private String AV34TFInc_Linea_To_Description ;
   private String AV32TFInc_obsTxt_Sel ;
   private String AV31TFInc_obsTxt ;
   private String A13712Inc_obsTxt ;
   private String AV57Controlincidencias_wcds_1_filterfulltext ;
   private String AV70Controlincidencias_wcds_14_tfinc_obstxt ;
   private String AV71Controlincidencias_wcds_15_tfinc_obstxt_sel ;
   private String lV57Controlincidencias_wcds_1_filterfulltext ;
   private String lV70Controlincidencias_wcds_14_tfinc_obstxt ;
   private String A4936Inc_Obs ;
   private String AV44PageInfo ;
   private String AV41DateInfo ;
   private String AV39AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P094A2_A396EmprCod ;
   private String[] P094A2_A4935Inc_Prog ;
   private String[] P094A2_A4934Inc_Termin ;
   private String[] P094A2_A4933Inc_Usuari ;
   private java.util.Date[] P094A2_A4932Inc_Hora ;
   private long[] P094A2_A4931Inc_Linea ;
   private java.util.Date[] P094A2_A4929Inc_Dia ;
   private String[] P094A2_A5301Inc_BarPar ;
   private byte[] P094A2_A5300Inc_BarReo ;
   private int[] P094A2_A5299Inc_Barcod ;
   private String[] P094A2_A4936Inc_Obs ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class controlincidencias_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV58Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV59Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV60Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV61Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV63Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV62Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV65Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV64Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV67Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV66Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV69Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV68Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV71Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV70Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV48Emprcod ,
                                          java.util.Date AV49Inc_dia ,
                                          String A396EmprCod ,
                                          java.util.Date AV50Inc_dia_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Prog, Inc_Termin, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(EmprCod = ? and Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      if ( ! (GXutil.strcmp("", AV57Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV61Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Dia" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Linea" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Linea DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Hora" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Hora DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Usuari" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Usuari DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Termin" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Termin DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Prog" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Prog DESC" ;
      }
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P094A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
      }
   }

}

