package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticuwwexportreport_impl extends GXWebReport
{
   public tarticuwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV124Title = httpContext.getMessage( "Lista de Ficha Tecnica (Articulo)", "") ;
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
         h8360( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV136FilterFullText)==0) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV136FilterFullText, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV60TFCliCod) && (0==AV61TFCliCod_To) ) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60TFCliCod), "ZZZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV106TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106TFCliCod_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61TFCliCod_To), "ZZZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFCliNom_Sel)==0) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFCliNom_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV66TFCliNom)==0) )
         {
            h8360( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFCliNom, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV63TFArtCod_Sel)==0) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFArtCod_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFArtCod)==0) )
         {
            h8360( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFArtCod, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV75TFArtDsc_Sel)==0) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFArtDsc_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV74TFArtDsc)==0) )
         {
            h8360( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFArtDsc, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV70TFTipArtCod) && (0==AV71TFTipArtCod_To) ) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Artículo", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV70TFTipArtCod), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV107TFTipArtCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo Artículo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107TFTipArtCod_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71TFTipArtCod_To), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFTipArtDsc_Sel)==0) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFTipArtDsc_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV72TFTipArtDsc)==0) )
         {
            h8360( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFTipArtDsc, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV76TFArtPml) && (0==AV77TFArtPml_To) ) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pml", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76TFArtPml), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV108TFArtPml_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pml", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108TFArtPml_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TFArtPml_To), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV144TFArtGraAca) && (0==AV145TFArtGraAca_To) ) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Grm2", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV144TFArtGraAca), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV146TFArtGraAca_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Grm2", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146TFArtGraAca_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV145TFArtGraAca_To), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFArtRen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFArtRen_To)==0) ) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Rdto", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88TFArtRen, "ZZ9.99")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV114TFArtRen_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Rdto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114TFArtRen_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV89TFArtRen_To, "ZZ9.99")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV84TFArtAcaMin) && (0==AV85TFArtAcaMin_To) ) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ancho Ac", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84TFArtAcaMin), "ZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV112TFArtAcaMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ancho Ac", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112TFArtAcaMin_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85TFArtAcaMin_To), "ZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV150TFArtComer_Sel)==0) )
      {
         h8360( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo Comercial", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150TFArtComer_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV149TFArtComer)==0) )
         {
            h8360( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo Comercial", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV149TFArtComer, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8360( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8360( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 95, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 99, Gx_line+10, 164, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 237, Gx_line+10, 302, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Artículo", ""), 306, Gx_line+10, 371, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 375, Gx_line+10, 440, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pml", ""), 444, Gx_line+10, 509, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Grm2", ""), 513, Gx_line+10, 578, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Rdto", ""), 582, Gx_line+10, 647, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho Ac", ""), 651, Gx_line+10, 716, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo Comercial", ""), 720, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV157Tarticuwwds_1_filterfulltext = AV136FilterFullText ;
      AV158Tarticuwwds_2_tfclicod = AV60TFCliCod ;
      AV159Tarticuwwds_3_tfclicod_to = AV61TFCliCod_To ;
      AV160Tarticuwwds_4_tfclinom = AV66TFCliNom ;
      AV161Tarticuwwds_5_tfclinom_sel = AV67TFCliNom_Sel ;
      AV162Tarticuwwds_6_tfartcod = AV62TFArtCod ;
      AV163Tarticuwwds_7_tfartcod_sel = AV63TFArtCod_Sel ;
      AV164Tarticuwwds_8_tfartdsc = AV74TFArtDsc ;
      AV165Tarticuwwds_9_tfartdsc_sel = AV75TFArtDsc_Sel ;
      AV166Tarticuwwds_10_tftipartcod = AV70TFTipArtCod ;
      AV167Tarticuwwds_11_tftipartcod_to = AV71TFTipArtCod_To ;
      AV168Tarticuwwds_12_tftipartdsc = AV72TFTipArtDsc ;
      AV169Tarticuwwds_13_tftipartdsc_sel = AV73TFTipArtDsc_Sel ;
      AV170Tarticuwwds_14_tfartpml = AV76TFArtPml ;
      AV171Tarticuwwds_15_tfartpml_to = AV77TFArtPml_To ;
      AV172Tarticuwwds_16_tfartgraaca = AV144TFArtGraAca ;
      AV173Tarticuwwds_17_tfartgraaca_to = AV145TFArtGraAca_To ;
      AV174Tarticuwwds_18_tfartren = AV88TFArtRen ;
      AV175Tarticuwwds_19_tfartren_to = AV89TFArtRen_To ;
      AV176Tarticuwwds_20_tfartacamin = AV84TFArtAcaMin ;
      AV177Tarticuwwds_21_tfartacamin_to = AV85TFArtAcaMin_To ;
      AV178Tarticuwwds_22_tfartcomer = AV149TFArtComer ;
      AV179Tarticuwwds_23_tfartcomer_sel = AV150TFArtComer_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV157Tarticuwwds_1_filterfulltext ,
                                           Integer.valueOf(AV158Tarticuwwds_2_tfclicod) ,
                                           Integer.valueOf(AV159Tarticuwwds_3_tfclicod_to) ,
                                           AV161Tarticuwwds_5_tfclinom_sel ,
                                           AV160Tarticuwwds_4_tfclinom ,
                                           AV163Tarticuwwds_7_tfartcod_sel ,
                                           AV162Tarticuwwds_6_tfartcod ,
                                           AV165Tarticuwwds_9_tfartdsc_sel ,
                                           AV164Tarticuwwds_8_tfartdsc ,
                                           Short.valueOf(AV166Tarticuwwds_10_tftipartcod) ,
                                           Short.valueOf(AV167Tarticuwwds_11_tftipartcod_to) ,
                                           AV169Tarticuwwds_13_tftipartdsc_sel ,
                                           AV168Tarticuwwds_12_tftipartdsc ,
                                           Short.valueOf(AV170Tarticuwwds_14_tfartpml) ,
                                           Short.valueOf(AV171Tarticuwwds_15_tfartpml_to) ,
                                           Short.valueOf(AV172Tarticuwwds_16_tfartgraaca) ,
                                           Short.valueOf(AV173Tarticuwwds_17_tfartgraaca_to) ,
                                           AV174Tarticuwwds_18_tfartren ,
                                           AV175Tarticuwwds_19_tfartren_to ,
                                           Short.valueOf(AV176Tarticuwwds_20_tfartacamin) ,
                                           Short.valueOf(AV177Tarticuwwds_21_tfartacamin_to) ,
                                           AV179Tarticuwwds_23_tfartcomer_sel ,
                                           AV178Tarticuwwds_22_tfartcomer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV157Tarticuwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV157Tarticuwwds_1_filterfulltext), "%", "") ;
      lV160Tarticuwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV160Tarticuwwds_4_tfclinom), 30, "%") ;
      lV162Tarticuwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV162Tarticuwwds_6_tfartcod), 16, "%") ;
      lV164Tarticuwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV164Tarticuwwds_8_tfartdsc), 26, "%") ;
      lV168Tarticuwwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV168Tarticuwwds_12_tftipartdsc), 30, "%") ;
      lV178Tarticuwwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV178Tarticuwwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P08362 */
      pr_default.execute(0, new Object[] {lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, lV157Tarticuwwds_1_filterfulltext, Integer.valueOf(AV158Tarticuwwds_2_tfclicod), Integer.valueOf(AV159Tarticuwwds_3_tfclicod_to), lV160Tarticuwwds_4_tfclinom, AV161Tarticuwwds_5_tfclinom_sel, lV162Tarticuwwds_6_tfartcod, AV163Tarticuwwds_7_tfartcod_sel, lV164Tarticuwwds_8_tfartdsc, AV165Tarticuwwds_9_tfartdsc_sel, Short.valueOf(AV166Tarticuwwds_10_tftipartcod), Short.valueOf(AV167Tarticuwwds_11_tftipartcod_to), lV168Tarticuwwds_12_tftipartdsc, AV169Tarticuwwds_13_tftipartdsc_sel, Short.valueOf(AV170Tarticuwwds_14_tfartpml), Short.valueOf(AV171Tarticuwwds_15_tfartpml_to), Short.valueOf(AV172Tarticuwwds_16_tfartgraaca), Short.valueOf(AV173Tarticuwwds_17_tfartgraaca_to), AV174Tarticuwwds_18_tfartren, AV175Tarticuwwds_19_tfartren_to, Short.valueOf(AV176Tarticuwwds_20_tfartacamin), Short.valueOf(AV177Tarticuwwds_21_tfartacamin_to), lV178Tarticuwwds_22_tfartcomer, AV179Tarticuwwds_23_tfartcomer_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08362_A396EmprCod[0] ;
         A10045CliAct = P08362_A10045CliAct[0] ;
         A5741ArtComer = P08362_A5741ArtComer[0] ;
         n5741ArtComer = P08362_n5741ArtComer[0] ;
         A63ArtAcaMin = P08362_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P08362_n63ArtAcaMin[0] ;
         A95ArtRen = P08362_A95ArtRen[0] ;
         n95ArtRen = P08362_n95ArtRen[0] ;
         A1903ArtGraAca = P08362_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P08362_n1903ArtGraAca[0] ;
         A1148ArtPml = P08362_A1148ArtPml[0] ;
         n1148ArtPml = P08362_n1148ArtPml[0] ;
         A830TipArtDsc = P08362_A830TipArtDsc[0] ;
         n830TipArtDsc = P08362_n830TipArtDsc[0] ;
         A829TipArtCod = P08362_A829TipArtCod[0] ;
         A69ArtDsc = P08362_A69ArtDsc[0] ;
         n69ArtDsc = P08362_n69ArtDsc[0] ;
         A65ArtCod = P08362_A65ArtCod[0] ;
         A279CliNom = P08362_A279CliNom[0] ;
         A252CliCod = P08362_A252CliCod[0] ;
         A830TipArtDsc = P08362_A830TipArtDsc[0] ;
         n830TipArtDsc = P08362_n830TipArtDsc[0] ;
         A10045CliAct = P08362_A10045CliAct[0] ;
         A279CliNom = P08362_A279CliNom[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
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
         h8360( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 95, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 99, Gx_line+10, 164, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 237, Gx_line+10, 302, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9")), 306, Gx_line+10, 371, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), 375, Gx_line+10, 440, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9")), 444, Gx_line+10, 509, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9")), 513, Gx_line+10, 578, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A95ArtRen, "ZZ9.99")), 582, Gx_line+10, 647, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9")), 651, Gx_line+10, 716, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5741ArtComer, "")), 720, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV56Session.getValue("TARTICUWWGridState"), "") == 0 )
      {
         AV58GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TARTICUWWGridState"), null, null);
      }
      else
      {
         AV58GridState.fromxml(AV56Session.getValue("TARTICUWWGridState"), null, null);
      }
      AV10OrderedBy = AV58GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV58GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV180GXV1 = 1 ;
      while ( AV180GXV1 <= AV58GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV59GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV58GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV180GXV1));
         if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV136FilterFullText = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV60TFCliCod = (int)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFCliCod_To = (int)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV66TFCliNom = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV67TFCliNom_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV62TFArtCod = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV63TFArtCod_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV74TFArtDsc = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV75TFArtDsc_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV70TFTipArtCod = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFTipArtCod_To = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV72TFTipArtDsc = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV73TFTipArtDsc_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV76TFArtPml = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFArtPml_To = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV144TFArtGraAca = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV145TFArtGraAca_To = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV88TFArtRen = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV89TFArtRen_To = CommonUtil.decimalVal( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV84TFArtAcaMin = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV85TFArtAcaMin_To = (short)(GXutil.lval( AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV149TFArtComer = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV150TFArtComer_Sel = AV59GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV180GXV1 = (int)(AV180GXV1+1) ;
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

   public void h8360( boolean bFoot ,
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
               AV121PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV117DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV124Title = AV153Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV140AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV124Title = "" ;
      AV136FilterFullText = "" ;
      AV106TFCliCod_To_Description = "" ;
      AV67TFCliNom_Sel = "" ;
      AV66TFCliNom = "" ;
      AV63TFArtCod_Sel = "" ;
      AV62TFArtCod = "" ;
      AV75TFArtDsc_Sel = "" ;
      AV74TFArtDsc = "" ;
      AV107TFTipArtCod_To_Description = "" ;
      AV73TFTipArtDsc_Sel = "" ;
      AV72TFTipArtDsc = "" ;
      AV108TFArtPml_To_Description = "" ;
      AV146TFArtGraAca_To_Description = "" ;
      AV88TFArtRen = DecimalUtil.ZERO ;
      AV89TFArtRen_To = DecimalUtil.ZERO ;
      AV114TFArtRen_To_Description = "" ;
      AV112TFArtAcaMin_To_Description = "" ;
      AV150TFArtComer_Sel = "" ;
      AV149TFArtComer = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      AV157Tarticuwwds_1_filterfulltext = "" ;
      AV160Tarticuwwds_4_tfclinom = "" ;
      AV161Tarticuwwds_5_tfclinom_sel = "" ;
      AV162Tarticuwwds_6_tfartcod = "" ;
      AV163Tarticuwwds_7_tfartcod_sel = "" ;
      AV164Tarticuwwds_8_tfartdsc = "" ;
      AV165Tarticuwwds_9_tfartdsc_sel = "" ;
      AV168Tarticuwwds_12_tftipartdsc = "" ;
      AV169Tarticuwwds_13_tftipartdsc_sel = "" ;
      AV174Tarticuwwds_18_tfartren = DecimalUtil.ZERO ;
      AV175Tarticuwwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV178Tarticuwwds_22_tfartcomer = "" ;
      AV179Tarticuwwds_23_tfartcomer_sel = "" ;
      scmdbuf = "" ;
      lV157Tarticuwwds_1_filterfulltext = "" ;
      lV160Tarticuwwds_4_tfclinom = "" ;
      lV162Tarticuwwds_6_tfartcod = "" ;
      lV164Tarticuwwds_8_tfartdsc = "" ;
      lV168Tarticuwwds_12_tftipartdsc = "" ;
      lV178Tarticuwwds_22_tfartcomer = "" ;
      A10045CliAct = "" ;
      P08362_A396EmprCod = new String[] {""} ;
      P08362_A10045CliAct = new String[] {""} ;
      P08362_A5741ArtComer = new String[] {""} ;
      P08362_n5741ArtComer = new boolean[] {false} ;
      P08362_A63ArtAcaMin = new short[1] ;
      P08362_n63ArtAcaMin = new boolean[] {false} ;
      P08362_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08362_n95ArtRen = new boolean[] {false} ;
      P08362_A1903ArtGraAca = new short[1] ;
      P08362_n1903ArtGraAca = new boolean[] {false} ;
      P08362_A1148ArtPml = new short[1] ;
      P08362_n1148ArtPml = new boolean[] {false} ;
      P08362_A830TipArtDsc = new String[] {""} ;
      P08362_n830TipArtDsc = new boolean[] {false} ;
      P08362_A829TipArtCod = new short[1] ;
      P08362_A69ArtDsc = new String[] {""} ;
      P08362_n69ArtDsc = new boolean[] {false} ;
      P08362_A65ArtCod = new String[] {""} ;
      P08362_A279CliNom = new String[] {""} ;
      P08362_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV56Session = httpContext.getWebSession();
      AV58GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV59GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV121PageInfo = "" ;
      AV117DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV153Pgmdesc = "" ;
      AV140AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticuwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08362_A396EmprCod, P08362_A10045CliAct, P08362_A5741ArtComer, P08362_n5741ArtComer, P08362_A63ArtAcaMin, P08362_n63ArtAcaMin, P08362_A95ArtRen, P08362_n95ArtRen, P08362_A1903ArtGraAca, P08362_n1903ArtGraAca,
            P08362_A1148ArtPml, P08362_n1148ArtPml, P08362_A830TipArtDsc, P08362_n830TipArtDsc, P08362_A829TipArtCod, P08362_A69ArtDsc, P08362_n69ArtDsc, P08362_A65ArtCod, P08362_A279CliNom, P08362_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV153Pgmdesc = httpContext.getMessage( "Lista de Ficha Técnica (Artículo)", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV153Pgmdesc = httpContext.getMessage( "Lista de Ficha Técnica (Artículo)", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV70TFTipArtCod ;
   private short AV71TFTipArtCod_To ;
   private short AV76TFArtPml ;
   private short AV77TFArtPml_To ;
   private short AV144TFArtGraAca ;
   private short AV145TFArtGraAca_To ;
   private short AV84TFArtAcaMin ;
   private short AV85TFArtAcaMin_To ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV166Tarticuwwds_10_tftipartcod ;
   private short AV167Tarticuwwds_11_tftipartcod_to ;
   private short AV170Tarticuwwds_14_tfartpml ;
   private short AV171Tarticuwwds_15_tfartpml_to ;
   private short AV172Tarticuwwds_16_tfartgraaca ;
   private short AV173Tarticuwwds_17_tfartgraaca_to ;
   private short AV176Tarticuwwds_20_tfartacamin ;
   private short AV177Tarticuwwds_21_tfartacamin_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV60TFCliCod ;
   private int AV61TFCliCod_To ;
   private int A252CliCod ;
   private int AV158Tarticuwwds_2_tfclicod ;
   private int AV159Tarticuwwds_3_tfclicod_to ;
   private int AV180GXV1 ;
   private java.math.BigDecimal AV88TFArtRen ;
   private java.math.BigDecimal AV89TFArtRen_To ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV174Tarticuwwds_18_tfartren ;
   private java.math.BigDecimal AV175Tarticuwwds_19_tfartren_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV67TFCliNom_Sel ;
   private String AV66TFCliNom ;
   private String AV63TFArtCod_Sel ;
   private String AV62TFArtCod ;
   private String AV75TFArtDsc_Sel ;
   private String AV74TFArtDsc ;
   private String AV73TFTipArtDsc_Sel ;
   private String AV72TFTipArtDsc ;
   private String AV150TFArtComer_Sel ;
   private String AV149TFArtComer ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String AV160Tarticuwwds_4_tfclinom ;
   private String AV161Tarticuwwds_5_tfclinom_sel ;
   private String AV162Tarticuwwds_6_tfartcod ;
   private String AV163Tarticuwwds_7_tfartcod_sel ;
   private String AV164Tarticuwwds_8_tfartdsc ;
   private String AV165Tarticuwwds_9_tfartdsc_sel ;
   private String AV168Tarticuwwds_12_tftipartdsc ;
   private String AV169Tarticuwwds_13_tftipartdsc_sel ;
   private String AV178Tarticuwwds_22_tfartcomer ;
   private String AV179Tarticuwwds_23_tfartcomer_sel ;
   private String scmdbuf ;
   private String lV160Tarticuwwds_4_tfclinom ;
   private String lV162Tarticuwwds_6_tfartcod ;
   private String lV164Tarticuwwds_8_tfartdsc ;
   private String lV168Tarticuwwds_12_tftipartdsc ;
   private String lV178Tarticuwwds_22_tfartcomer ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String AV153Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n5741ArtComer ;
   private boolean n63ArtAcaMin ;
   private boolean n95ArtRen ;
   private boolean n1903ArtGraAca ;
   private boolean n1148ArtPml ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private String AV124Title ;
   private String AV136FilterFullText ;
   private String AV106TFCliCod_To_Description ;
   private String AV107TFTipArtCod_To_Description ;
   private String AV108TFArtPml_To_Description ;
   private String AV146TFArtGraAca_To_Description ;
   private String AV114TFArtRen_To_Description ;
   private String AV112TFArtAcaMin_To_Description ;
   private String AV157Tarticuwwds_1_filterfulltext ;
   private String lV157Tarticuwwds_1_filterfulltext ;
   private String AV121PageInfo ;
   private String AV117DateInfo ;
   private String AV140AppName ;
   private com.genexus.webpanels.WebSession AV56Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08362_A396EmprCod ;
   private String[] P08362_A10045CliAct ;
   private String[] P08362_A5741ArtComer ;
   private boolean[] P08362_n5741ArtComer ;
   private short[] P08362_A63ArtAcaMin ;
   private boolean[] P08362_n63ArtAcaMin ;
   private java.math.BigDecimal[] P08362_A95ArtRen ;
   private boolean[] P08362_n95ArtRen ;
   private short[] P08362_A1903ArtGraAca ;
   private boolean[] P08362_n1903ArtGraAca ;
   private short[] P08362_A1148ArtPml ;
   private boolean[] P08362_n1148ArtPml ;
   private String[] P08362_A830TipArtDsc ;
   private boolean[] P08362_n830TipArtDsc ;
   private short[] P08362_A829TipArtCod ;
   private String[] P08362_A69ArtDsc ;
   private boolean[] P08362_n69ArtDsc ;
   private String[] P08362_A65ArtCod ;
   private String[] P08362_A279CliNom ;
   private int[] P08362_A252CliCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV58GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV59GridStateFilterValue ;
}

final  class tarticuwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08362( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV157Tarticuwwds_1_filterfulltext ,
                                          int AV158Tarticuwwds_2_tfclicod ,
                                          int AV159Tarticuwwds_3_tfclicod_to ,
                                          String AV161Tarticuwwds_5_tfclinom_sel ,
                                          String AV160Tarticuwwds_4_tfclinom ,
                                          String AV163Tarticuwwds_7_tfartcod_sel ,
                                          String AV162Tarticuwwds_6_tfartcod ,
                                          String AV165Tarticuwwds_9_tfartdsc_sel ,
                                          String AV164Tarticuwwds_8_tfartdsc ,
                                          short AV166Tarticuwwds_10_tftipartcod ,
                                          short AV167Tarticuwwds_11_tftipartcod_to ,
                                          String AV169Tarticuwwds_13_tftipartdsc_sel ,
                                          String AV168Tarticuwwds_12_tftipartdsc ,
                                          short AV170Tarticuwwds_14_tfartpml ,
                                          short AV171Tarticuwwds_15_tfartpml_to ,
                                          short AV172Tarticuwwds_16_tfartgraaca ,
                                          short AV173Tarticuwwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV174Tarticuwwds_18_tfartren ,
                                          java.math.BigDecimal AV175Tarticuwwds_19_tfartren_to ,
                                          short AV176Tarticuwwds_20_tfartacamin ,
                                          short AV177Tarticuwwds_21_tfartacamin_to ,
                                          String AV179Tarticuwwds_23_tfartcomer_sel ,
                                          String AV178Tarticuwwds_22_tfartcomer ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliAct, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T2.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod" ;
      scmdbuf += " FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T3.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV157Tarticuwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV158Tarticuwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV159Tarticuwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Tarticuwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV160Tarticuwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Tarticuwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Tarticuwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV162Tarticuwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Tarticuwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Tarticuwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV164Tarticuwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Tarticuwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV166Tarticuwwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV167Tarticuwwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Tarticuwwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV168Tarticuwwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Tarticuwwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV170Tarticuwwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV171Tarticuwwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV172Tarticuwwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV173Tarticuwwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Tarticuwwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Tarticuwwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV176Tarticuwwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV177Tarticuwwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV179Tarticuwwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV178Tarticuwwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV179Tarticuwwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtComer DESC" ;
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
                  return conditional_P08362(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08362", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((int[]) buf[19])[0] = rslt.getInt(13);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               return;
      }
   }

}

