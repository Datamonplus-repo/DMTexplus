package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class capfm_pwwexportreport_impl extends GXWebReport
{
   public capfm_pwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV55Title = httpContext.getMessage( "Lista de Parámetros Fases-Máquinas", "") ;
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
         h9RK0( true, 0) ;
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
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV21TFCliCod) && (0==AV22TFCliCod_To) ) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCliCod), "ZZZZZ9")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFCliCod_To_Description, "")), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod_To), "ZZZZZ9")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFCliNom_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFCliNom)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCliNom, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFArtCod_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód. Art.", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFArtCod_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFArtCod)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód. Art.", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFArtCod, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFArtDsc_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFArtDsc_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFArtDsc)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFArtDsc, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFProCod_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód. Proc.", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFProCod_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFProCod)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód. Proc.", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFProCod, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFProDsc_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFProDsc_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFProDsc)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFProDsc, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV34TFFasCodM_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód. Fase", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFFasCodM_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFFasCodM)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód. Fase", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFFasCodM, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV38TFMaqCodC_Sel)==0) )
      {
         h9RK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód Maq.", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFMaqCodC_Sel, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV37TFMaqCodC)==0) )
         {
            h9RK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód Maq.", ""), 25, Gx_line+0, 107, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFMaqCodC, "")), 107, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9RK0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9RK0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 94, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód. Art.", ""), 218, Gx_line+10, 340, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 344, Gx_line+10, 466, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód. Proc.", ""), 470, Gx_line+10, 531, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 535, Gx_line+10, 657, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód. Fase", ""), 661, Gx_line+10, 722, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód Maq.", ""), 726, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV63Ingenieria_capfm_pwwds_1_filterfulltext = AV12FilterFullText ;
      AV64Ingenieria_capfm_pwwds_2_tfclicod = AV21TFCliCod ;
      AV65Ingenieria_capfm_pwwds_3_tfclicod_to = AV22TFCliCod_To ;
      AV66Ingenieria_capfm_pwwds_4_tfclinom = AV23TFCliNom ;
      AV67Ingenieria_capfm_pwwds_5_tfclinom_sel = AV24TFCliNom_Sel ;
      AV68Ingenieria_capfm_pwwds_6_tfartcod = AV25TFArtCod ;
      AV69Ingenieria_capfm_pwwds_7_tfartcod_sel = AV26TFArtCod_Sel ;
      AV70Ingenieria_capfm_pwwds_8_tfartdsc = AV27TFArtDsc ;
      AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV28TFArtDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_10_tfprocod = AV29TFProCod ;
      AV73Ingenieria_capfm_pwwds_11_tfprocod_sel = AV30TFProCod_Sel ;
      AV74Ingenieria_capfm_pwwds_12_tfprodsc = AV31TFProDsc ;
      AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV32TFProDsc_Sel ;
      AV76Ingenieria_capfm_pwwds_14_tffascodm = AV33TFFasCodM ;
      AV77Ingenieria_capfm_pwwds_15_tffascodm_sel = AV34TFFasCodM_Sel ;
      AV78Ingenieria_capfm_pwwds_16_tfmaqcodc = AV37TFMaqCodC ;
      AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV38TFMaqCodC_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV64Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV65Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV67Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV66Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV69Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV68Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV73Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV72Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV74Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV77Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV76Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV78Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV66Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV68Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV70Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV72Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV76Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV76Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV78Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV78Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RK2 */
      pr_default.execute(0, new Object[] {lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, lV63Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV64Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV65Ingenieria_capfm_pwwds_3_tfclicod_to), lV66Ingenieria_capfm_pwwds_4_tfclinom, AV67Ingenieria_capfm_pwwds_5_tfclinom_sel, lV68Ingenieria_capfm_pwwds_6_tfartcod, AV69Ingenieria_capfm_pwwds_7_tfartcod_sel, lV70Ingenieria_capfm_pwwds_8_tfartdsc, AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV72Ingenieria_capfm_pwwds_10_tfprocod, AV73Ingenieria_capfm_pwwds_11_tfprocod_sel, lV74Ingenieria_capfm_pwwds_12_tfprodsc, AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV76Ingenieria_capfm_pwwds_14_tffascodm, AV77Ingenieria_capfm_pwwds_15_tffascodm_sel, lV78Ingenieria_capfm_pwwds_16_tfmaqcodc, AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09RK2_A396EmprCod[0] ;
         A9830MaqCodC = P09RK2_A9830MaqCodC[0] ;
         A9836FasCodM = P09RK2_A9836FasCodM[0] ;
         A759ProDsc = P09RK2_A759ProDsc[0] ;
         A758ProCod = P09RK2_A758ProCod[0] ;
         A69ArtDsc = P09RK2_A69ArtDsc[0] ;
         n69ArtDsc = P09RK2_n69ArtDsc[0] ;
         A65ArtCod = P09RK2_A65ArtCod[0] ;
         A279CliNom = P09RK2_A279CliNom[0] ;
         A252CliCod = P09RK2_A252CliCod[0] ;
         A759ProDsc = P09RK2_A759ProDsc[0] ;
         A279CliNom = P09RK2_A279CliNom[0] ;
         A69ArtDsc = P09RK2_A69ArtDsc[0] ;
         n69ArtDsc = P09RK2_n69ArtDsc[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
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
            if (true) return;
         }
         h9RK0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 94, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 218, Gx_line+10, 340, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 344, Gx_line+10, 466, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 470, Gx_line+10, 531, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 535, Gx_line+10, 657, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9836FasCodM, "")), 661, Gx_line+10, 722, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9830MaqCodC, "")), 726, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
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
      if ( GXutil.strcmp(AV13Session.getValue("Ingenieria.CAPFM_PWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.CAPFM_PWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("Ingenieria.CAPFM_PWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV21TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV23TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV24TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV25TFArtCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV26TFArtCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV27TFArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV28TFArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV29TFProCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV30TFProCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV31TFProDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV32TFProDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODM") == 0 )
         {
            AV33TFFasCodM = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODM_SEL") == 0 )
         {
            AV34TFFasCodM_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODC") == 0 )
         {
            AV37TFMaqCodC = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODC_SEL") == 0 )
         {
            AV38TFMaqCodC_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
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

   public void h9RK0( boolean bFoot ,
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
               AV53PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV50DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV55Title = AV59Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV55Title = "" ;
      AV12FilterFullText = "" ;
      AV43TFCliCod_To_Description = "" ;
      AV24TFCliNom_Sel = "" ;
      AV23TFCliNom = "" ;
      AV26TFArtCod_Sel = "" ;
      AV25TFArtCod = "" ;
      AV28TFArtDsc_Sel = "" ;
      AV27TFArtDsc = "" ;
      AV30TFProCod_Sel = "" ;
      AV29TFProCod = "" ;
      AV32TFProDsc_Sel = "" ;
      AV31TFProDsc = "" ;
      AV34TFFasCodM_Sel = "" ;
      AV33TFFasCodM = "" ;
      AV38TFMaqCodC_Sel = "" ;
      AV37TFMaqCodC = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      AV63Ingenieria_capfm_pwwds_1_filterfulltext = "" ;
      AV66Ingenieria_capfm_pwwds_4_tfclinom = "" ;
      AV67Ingenieria_capfm_pwwds_5_tfclinom_sel = "" ;
      AV68Ingenieria_capfm_pwwds_6_tfartcod = "" ;
      AV69Ingenieria_capfm_pwwds_7_tfartcod_sel = "" ;
      AV70Ingenieria_capfm_pwwds_8_tfartdsc = "" ;
      AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel = "" ;
      AV72Ingenieria_capfm_pwwds_10_tfprocod = "" ;
      AV73Ingenieria_capfm_pwwds_11_tfprocod_sel = "" ;
      AV74Ingenieria_capfm_pwwds_12_tfprodsc = "" ;
      AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel = "" ;
      AV76Ingenieria_capfm_pwwds_14_tffascodm = "" ;
      AV77Ingenieria_capfm_pwwds_15_tffascodm_sel = "" ;
      AV78Ingenieria_capfm_pwwds_16_tfmaqcodc = "" ;
      AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = "" ;
      scmdbuf = "" ;
      lV63Ingenieria_capfm_pwwds_1_filterfulltext = "" ;
      lV66Ingenieria_capfm_pwwds_4_tfclinom = "" ;
      lV68Ingenieria_capfm_pwwds_6_tfartcod = "" ;
      lV70Ingenieria_capfm_pwwds_8_tfartdsc = "" ;
      lV72Ingenieria_capfm_pwwds_10_tfprocod = "" ;
      lV74Ingenieria_capfm_pwwds_12_tfprodsc = "" ;
      lV76Ingenieria_capfm_pwwds_14_tffascodm = "" ;
      lV78Ingenieria_capfm_pwwds_16_tfmaqcodc = "" ;
      P09RK2_A396EmprCod = new String[] {""} ;
      P09RK2_A9830MaqCodC = new String[] {""} ;
      P09RK2_A9836FasCodM = new String[] {""} ;
      P09RK2_A759ProDsc = new String[] {""} ;
      P09RK2_A758ProCod = new String[] {""} ;
      P09RK2_A69ArtDsc = new String[] {""} ;
      P09RK2_n69ArtDsc = new boolean[] {false} ;
      P09RK2_A65ArtCod = new String[] {""} ;
      P09RK2_A279CliNom = new String[] {""} ;
      P09RK2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53PageInfo = "" ;
      AV50DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV59Pgmdesc = "" ;
      AV48AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_pwwexportreport__default(),
         new Object[] {
             new Object[] {
            P09RK2_A396EmprCod, P09RK2_A9830MaqCodC, P09RK2_A9836FasCodM, P09RK2_A759ProDsc, P09RK2_A758ProCod, P09RK2_A69ArtDsc, P09RK2_n69ArtDsc, P09RK2_A65ArtCod, P09RK2_A279CliNom, P09RK2_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "CAPFM_PWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "CAPFM_PWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV21TFCliCod ;
   private int AV22TFCliCod_To ;
   private int A252CliCod ;
   private int AV64Ingenieria_capfm_pwwds_2_tfclicod ;
   private int AV65Ingenieria_capfm_pwwds_3_tfclicod_to ;
   private int AV80GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24TFCliNom_Sel ;
   private String AV23TFCliNom ;
   private String AV26TFArtCod_Sel ;
   private String AV25TFArtCod ;
   private String AV28TFArtDsc_Sel ;
   private String AV27TFArtDsc ;
   private String AV30TFProCod_Sel ;
   private String AV29TFProCod ;
   private String AV32TFProDsc_Sel ;
   private String AV31TFProDsc ;
   private String AV34TFFasCodM_Sel ;
   private String AV33TFFasCodM ;
   private String AV38TFMaqCodC_Sel ;
   private String AV37TFMaqCodC ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String AV66Ingenieria_capfm_pwwds_4_tfclinom ;
   private String AV67Ingenieria_capfm_pwwds_5_tfclinom_sel ;
   private String AV68Ingenieria_capfm_pwwds_6_tfartcod ;
   private String AV69Ingenieria_capfm_pwwds_7_tfartcod_sel ;
   private String AV70Ingenieria_capfm_pwwds_8_tfartdsc ;
   private String AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel ;
   private String AV72Ingenieria_capfm_pwwds_10_tfprocod ;
   private String AV73Ingenieria_capfm_pwwds_11_tfprocod_sel ;
   private String AV74Ingenieria_capfm_pwwds_12_tfprodsc ;
   private String AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel ;
   private String AV76Ingenieria_capfm_pwwds_14_tffascodm ;
   private String AV77Ingenieria_capfm_pwwds_15_tffascodm_sel ;
   private String AV78Ingenieria_capfm_pwwds_16_tfmaqcodc ;
   private String AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ;
   private String scmdbuf ;
   private String lV66Ingenieria_capfm_pwwds_4_tfclinom ;
   private String lV68Ingenieria_capfm_pwwds_6_tfartcod ;
   private String lV70Ingenieria_capfm_pwwds_8_tfartdsc ;
   private String lV72Ingenieria_capfm_pwwds_10_tfprocod ;
   private String lV74Ingenieria_capfm_pwwds_12_tfprodsc ;
   private String lV76Ingenieria_capfm_pwwds_14_tffascodm ;
   private String lV78Ingenieria_capfm_pwwds_16_tfmaqcodc ;
   private String A396EmprCod ;
   private String AV59Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n69ArtDsc ;
   private String AV55Title ;
   private String AV12FilterFullText ;
   private String AV43TFCliCod_To_Description ;
   private String AV63Ingenieria_capfm_pwwds_1_filterfulltext ;
   private String lV63Ingenieria_capfm_pwwds_1_filterfulltext ;
   private String AV53PageInfo ;
   private String AV50DateInfo ;
   private String AV48AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09RK2_A396EmprCod ;
   private String[] P09RK2_A9830MaqCodC ;
   private String[] P09RK2_A9836FasCodM ;
   private String[] P09RK2_A759ProDsc ;
   private String[] P09RK2_A758ProCod ;
   private String[] P09RK2_A69ArtDsc ;
   private boolean[] P09RK2_n69ArtDsc ;
   private String[] P09RK2_A65ArtCod ;
   private String[] P09RK2_A279CliNom ;
   private int[] P09RK2_A252CliCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class capfm_pwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV64Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV65Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV67Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV66Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV69Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV73Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV72Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV77Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV76Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV78Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T1.ProCod, T4.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV64Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV76Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV78Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ProDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ProDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCodM" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCodM DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodC DESC" ;
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
                  return conditional_P09RK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
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
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               return;
      }
   }

}

