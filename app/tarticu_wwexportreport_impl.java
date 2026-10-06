package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticu_wwexportreport_impl extends GXWebReport
{
   public tarticu_wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV61Pgmdesc = httpContext.getMessage( "Lista de Ficha Tecnica (Articulo)", "") ;
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
         AV57Title = httpContext.getMessage( "Lista de Ficha Tecnica (Articulo)", "") ;
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
         hA9S0( true, 0) ;
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
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFCliCod) && (0==AV19TFCliCod_To) ) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFCliCod), "ZZZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFCliCod_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFCliCod_To), "ZZZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliNom_Sel)==0) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFCliNom_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFCliNom)==0) )
         {
            hA9S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFCliNom, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFArtCod_Sel)==0) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFArtCod_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFArtCod)==0) )
         {
            hA9S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFArtCod, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFArtDsc_Sel)==0) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFArtDsc_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFArtDsc)==0) )
         {
            hA9S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFArtDsc, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV26TFTipArtCod) && (0==AV27TFTipArtCod_To) ) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Artículo", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFTipArtCod), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFTipArtCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo Artículo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFTipArtCod_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFTipArtCod_To), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFTipArtDsc_Sel)==0) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFTipArtDsc_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFTipArtDsc)==0) )
         {
            hA9S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFTipArtDsc, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV30TFArtPml) && (0==AV31TFArtPml_To) ) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pml", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFArtPml), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFArtPml_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pml", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFArtPml_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFArtPml_To), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV32TFArtGraAca) && (0==AV33TFArtGraAca_To) ) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Grm2", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFArtGraAca), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV44TFArtGraAca_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Grm2", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFArtGraAca_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFArtGraAca_To), "ZZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFArtRen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFArtRen_To)==0) ) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Rdto", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFArtRen, "ZZ9.99")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFArtRen_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Rdto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFArtRen_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFArtRen_To, "ZZ9.99")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV36TFArtAcaMin) && (0==AV37TFArtAcaMin_To) ) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ancho Ac", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFArtAcaMin), "ZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV46TFArtAcaMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ancho Ac", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFArtAcaMin_To_Description, "")), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFArtAcaMin_To), "ZZ9")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFArtComer_Sel)==0) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo Comercial", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFArtComer_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFArtComer)==0) )
         {
            hA9S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo Comercial", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFArtComer, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV40TFArtActivo_Sel)==0) )
      {
         hA9S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Activo?", ""), 25, Gx_line+0, 134, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFArtActivo_Sel, "")), 134, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA9S0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA9S0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Artículo", ""), 262, Gx_line+10, 316, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 320, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pml", ""), 378, Gx_line+10, 432, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Grm2", ""), 436, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Rdto", ""), 495, Gx_line+10, 550, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho Ac", ""), 554, Gx_line+10, 609, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText("#", 613, Gx_line+10, 668, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo Comercial", ""), 672, Gx_line+10, 728, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Activo?", ""), 732, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV65Tarticu_wwds_1_filterfulltext = AV12FilterFullText ;
      AV66Tarticu_wwds_2_tfclicod = AV18TFCliCod ;
      AV67Tarticu_wwds_3_tfclicod_to = AV19TFCliCod_To ;
      AV68Tarticu_wwds_4_tfclinom = AV20TFCliNom ;
      AV69Tarticu_wwds_5_tfclinom_sel = AV21TFCliNom_Sel ;
      AV70Tarticu_wwds_6_tfartcod = AV22TFArtCod ;
      AV71Tarticu_wwds_7_tfartcod_sel = AV23TFArtCod_Sel ;
      AV72Tarticu_wwds_8_tfartdsc = AV24TFArtDsc ;
      AV73Tarticu_wwds_9_tfartdsc_sel = AV25TFArtDsc_Sel ;
      AV74Tarticu_wwds_10_tftipartcod = AV26TFTipArtCod ;
      AV75Tarticu_wwds_11_tftipartcod_to = AV27TFTipArtCod_To ;
      AV76Tarticu_wwds_12_tftipartdsc = AV28TFTipArtDsc ;
      AV77Tarticu_wwds_13_tftipartdsc_sel = AV29TFTipArtDsc_Sel ;
      AV78Tarticu_wwds_14_tfartpml = AV30TFArtPml ;
      AV79Tarticu_wwds_15_tfartpml_to = AV31TFArtPml_To ;
      AV80Tarticu_wwds_16_tfartgraaca = AV32TFArtGraAca ;
      AV81Tarticu_wwds_17_tfartgraaca_to = AV33TFArtGraAca_To ;
      AV82Tarticu_wwds_18_tfartren = AV34TFArtRen ;
      AV83Tarticu_wwds_19_tfartren_to = AV35TFArtRen_To ;
      AV84Tarticu_wwds_20_tfartacamin = AV36TFArtAcaMin ;
      AV85Tarticu_wwds_21_tfartacamin_to = AV37TFArtAcaMin_To ;
      AV86Tarticu_wwds_22_tfartcomer = AV38TFArtComer ;
      AV87Tarticu_wwds_23_tfartcomer_sel = AV39TFArtComer_Sel ;
      AV88Tarticu_wwds_24_tfartactivo_sel = AV40TFArtActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV66Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV67Tarticu_wwds_3_tfclicod_to) ,
                                           AV69Tarticu_wwds_5_tfclinom_sel ,
                                           AV68Tarticu_wwds_4_tfclinom ,
                                           AV71Tarticu_wwds_7_tfartcod_sel ,
                                           AV70Tarticu_wwds_6_tfartcod ,
                                           AV73Tarticu_wwds_9_tfartdsc_sel ,
                                           AV72Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV74Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV75Tarticu_wwds_11_tftipartcod_to) ,
                                           AV77Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV76Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV78Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV79Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV80Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV81Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV82Tarticu_wwds_18_tfartren ,
                                           AV83Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV84Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV85Tarticu_wwds_21_tfartacamin_to) ,
                                           AV87Tarticu_wwds_23_tfartcomer_sel ,
                                           AV86Tarticu_wwds_22_tfartcomer ,
                                           AV88Tarticu_wwds_24_tfartactivo_sel ,
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
                                           A14295ArtActivo ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV65Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV68Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV68Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV70Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV70Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV72Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV72Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV76Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV76Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV86Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV86Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor P0A9S2 */
      pr_default.execute(0, new Object[] {lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, lV65Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV66Tarticu_wwds_2_tfclicod), Integer.valueOf(AV67Tarticu_wwds_3_tfclicod_to), lV68Tarticu_wwds_4_tfclinom, AV69Tarticu_wwds_5_tfclinom_sel, lV70Tarticu_wwds_6_tfartcod, AV71Tarticu_wwds_7_tfartcod_sel, lV72Tarticu_wwds_8_tfartdsc, AV73Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV74Tarticu_wwds_10_tftipartcod), Short.valueOf(AV75Tarticu_wwds_11_tftipartcod_to), lV76Tarticu_wwds_12_tftipartdsc, AV77Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV78Tarticu_wwds_14_tfartpml), Short.valueOf(AV79Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV80Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV81Tarticu_wwds_17_tfartgraaca_to), AV82Tarticu_wwds_18_tfartren, AV83Tarticu_wwds_19_tfartren_to, Short.valueOf(AV84Tarticu_wwds_20_tfartacamin), Short.valueOf(AV85Tarticu_wwds_21_tfartacamin_to), lV86Tarticu_wwds_22_tfartcomer, AV87Tarticu_wwds_23_tfartcomer_sel, AV88Tarticu_wwds_24_tfartactivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P0A9S2_A10045CliAct[0] ;
         A14295ArtActivo = P0A9S2_A14295ArtActivo[0] ;
         A5741ArtComer = P0A9S2_A5741ArtComer[0] ;
         n5741ArtComer = P0A9S2_n5741ArtComer[0] ;
         A63ArtAcaMin = P0A9S2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P0A9S2_n63ArtAcaMin[0] ;
         A95ArtRen = P0A9S2_A95ArtRen[0] ;
         n95ArtRen = P0A9S2_n95ArtRen[0] ;
         A1903ArtGraAca = P0A9S2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P0A9S2_n1903ArtGraAca[0] ;
         A1148ArtPml = P0A9S2_A1148ArtPml[0] ;
         n1148ArtPml = P0A9S2_n1148ArtPml[0] ;
         A830TipArtDsc = P0A9S2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9S2_n830TipArtDsc[0] ;
         A829TipArtCod = P0A9S2_A829TipArtCod[0] ;
         A69ArtDsc = P0A9S2_A69ArtDsc[0] ;
         n69ArtDsc = P0A9S2_n69ArtDsc[0] ;
         A65ArtCod = P0A9S2_A65ArtCod[0] ;
         A279CliNom = P0A9S2_A279CliNom[0] ;
         A252CliCod = P0A9S2_A252CliCod[0] ;
         A396EmprCod = P0A9S2_A396EmprCod[0] ;
         A10045CliAct = P0A9S2_A10045CliAct[0] ;
         A279CliNom = P0A9S2_A279CliNom[0] ;
         A830TipArtDsc = P0A9S2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9S2_n830TipArtDsc[0] ;
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
         hA9S0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9")), 262, Gx_line+10, 316, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9")), 378, Gx_line+10, 432, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9")), 436, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A95ArtRen, "ZZ9.99")), 495, Gx_line+10, 550, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9")), 554, Gx_line+10, 609, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13NProc), "ZZZ9")), 613, Gx_line+10, 668, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5741ArtComer, "")), 672, Gx_line+10, 728, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14295ArtActivo, "")), 732, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("Tarticu_WWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Tarticu_WWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("Tarticu_WWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV22TFArtCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV23TFArtCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV24TFArtDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV25TFArtDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV26TFTipArtCod = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFTipArtCod_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV28TFTipArtDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV29TFTipArtDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV30TFArtPml = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFArtPml_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV32TFArtGraAca = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFArtGraAca_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV34TFArtRen = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFArtRen_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV36TFArtAcaMin = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFArtAcaMin_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV38TFArtComer = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV39TFArtComer_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACTIVO_SEL") == 0 )
         {
            AV40TFArtActivo_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
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

   public void hA9S0( boolean bFoot ,
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
               AV55PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV52DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV57Title = AV61Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV61Pgmdesc = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57Title = "" ;
      AV12FilterFullText = "" ;
      AV41TFCliCod_To_Description = "" ;
      AV21TFCliNom_Sel = "" ;
      AV20TFCliNom = "" ;
      AV23TFArtCod_Sel = "" ;
      AV22TFArtCod = "" ;
      AV25TFArtDsc_Sel = "" ;
      AV24TFArtDsc = "" ;
      AV42TFTipArtCod_To_Description = "" ;
      AV29TFTipArtDsc_Sel = "" ;
      AV28TFTipArtDsc = "" ;
      AV43TFArtPml_To_Description = "" ;
      AV44TFArtGraAca_To_Description = "" ;
      AV34TFArtRen = DecimalUtil.ZERO ;
      AV35TFArtRen_To = DecimalUtil.ZERO ;
      AV45TFArtRen_To_Description = "" ;
      AV46TFArtAcaMin_To_Description = "" ;
      AV39TFArtComer_Sel = "" ;
      AV38TFArtComer = "" ;
      AV40TFArtActivo_Sel = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      A14295ArtActivo = "" ;
      AV65Tarticu_wwds_1_filterfulltext = "" ;
      AV68Tarticu_wwds_4_tfclinom = "" ;
      AV69Tarticu_wwds_5_tfclinom_sel = "" ;
      AV70Tarticu_wwds_6_tfartcod = "" ;
      AV71Tarticu_wwds_7_tfartcod_sel = "" ;
      AV72Tarticu_wwds_8_tfartdsc = "" ;
      AV73Tarticu_wwds_9_tfartdsc_sel = "" ;
      AV76Tarticu_wwds_12_tftipartdsc = "" ;
      AV77Tarticu_wwds_13_tftipartdsc_sel = "" ;
      AV82Tarticu_wwds_18_tfartren = DecimalUtil.ZERO ;
      AV83Tarticu_wwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV86Tarticu_wwds_22_tfartcomer = "" ;
      AV87Tarticu_wwds_23_tfartcomer_sel = "" ;
      AV88Tarticu_wwds_24_tfartactivo_sel = "" ;
      scmdbuf = "" ;
      lV65Tarticu_wwds_1_filterfulltext = "" ;
      lV68Tarticu_wwds_4_tfclinom = "" ;
      lV70Tarticu_wwds_6_tfartcod = "" ;
      lV72Tarticu_wwds_8_tfartdsc = "" ;
      lV76Tarticu_wwds_12_tftipartdsc = "" ;
      lV86Tarticu_wwds_22_tfartcomer = "" ;
      A10045CliAct = "" ;
      P0A9S2_A10045CliAct = new String[] {""} ;
      P0A9S2_A14295ArtActivo = new String[] {""} ;
      P0A9S2_A5741ArtComer = new String[] {""} ;
      P0A9S2_n5741ArtComer = new boolean[] {false} ;
      P0A9S2_A63ArtAcaMin = new short[1] ;
      P0A9S2_n63ArtAcaMin = new boolean[] {false} ;
      P0A9S2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9S2_n95ArtRen = new boolean[] {false} ;
      P0A9S2_A1903ArtGraAca = new short[1] ;
      P0A9S2_n1903ArtGraAca = new boolean[] {false} ;
      P0A9S2_A1148ArtPml = new short[1] ;
      P0A9S2_n1148ArtPml = new boolean[] {false} ;
      P0A9S2_A830TipArtDsc = new String[] {""} ;
      P0A9S2_n830TipArtDsc = new boolean[] {false} ;
      P0A9S2_A829TipArtCod = new short[1] ;
      P0A9S2_A69ArtDsc = new String[] {""} ;
      P0A9S2_n69ArtDsc = new boolean[] {false} ;
      P0A9S2_A65ArtCod = new String[] {""} ;
      P0A9S2_A279CliNom = new String[] {""} ;
      P0A9S2_A252CliCod = new int[1] ;
      P0A9S2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55PageInfo = "" ;
      AV52DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV50AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_wwexportreport__default(),
         new Object[] {
             new Object[] {
            P0A9S2_A10045CliAct, P0A9S2_A14295ArtActivo, P0A9S2_A5741ArtComer, P0A9S2_n5741ArtComer, P0A9S2_A63ArtAcaMin, P0A9S2_n63ArtAcaMin, P0A9S2_A95ArtRen, P0A9S2_n95ArtRen, P0A9S2_A1903ArtGraAca, P0A9S2_n1903ArtGraAca,
            P0A9S2_A1148ArtPml, P0A9S2_n1148ArtPml, P0A9S2_A830TipArtDsc, P0A9S2_n830TipArtDsc, P0A9S2_A829TipArtCod, P0A9S2_A69ArtDsc, P0A9S2_n69ArtDsc, P0A9S2_A65ArtCod, P0A9S2_A279CliNom, P0A9S2_A252CliCod,
            P0A9S2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV61Pgmdesc = httpContext.getMessage( "Tarticu_WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV61Pgmdesc = httpContext.getMessage( "Tarticu_WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV26TFTipArtCod ;
   private short AV27TFTipArtCod_To ;
   private short AV30TFArtPml ;
   private short AV31TFArtPml_To ;
   private short AV32TFArtGraAca ;
   private short AV33TFArtGraAca_To ;
   private short AV36TFArtAcaMin ;
   private short AV37TFArtAcaMin_To ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV74Tarticu_wwds_10_tftipartcod ;
   private short AV75Tarticu_wwds_11_tftipartcod_to ;
   private short AV78Tarticu_wwds_14_tfartpml ;
   private short AV79Tarticu_wwds_15_tfartpml_to ;
   private short AV80Tarticu_wwds_16_tfartgraaca ;
   private short AV81Tarticu_wwds_17_tfartgraaca_to ;
   private short AV84Tarticu_wwds_20_tfartacamin ;
   private short AV85Tarticu_wwds_21_tfartacamin_to ;
   private short AV10OrderedBy ;
   private short AV13NProc ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int A252CliCod ;
   private int AV66Tarticu_wwds_2_tfclicod ;
   private int AV67Tarticu_wwds_3_tfclicod_to ;
   private int AV89GXV1 ;
   private java.math.BigDecimal AV34TFArtRen ;
   private java.math.BigDecimal AV35TFArtRen_To ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV82Tarticu_wwds_18_tfartren ;
   private java.math.BigDecimal AV83Tarticu_wwds_19_tfartren_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV61Pgmdesc ;
   private String AV21TFCliNom_Sel ;
   private String AV20TFCliNom ;
   private String AV23TFArtCod_Sel ;
   private String AV22TFArtCod ;
   private String AV25TFArtDsc_Sel ;
   private String AV24TFArtDsc ;
   private String AV29TFTipArtDsc_Sel ;
   private String AV28TFTipArtDsc ;
   private String AV39TFArtComer_Sel ;
   private String AV38TFArtComer ;
   private String AV40TFArtActivo_Sel ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A5741ArtComer ;
   private String A14295ArtActivo ;
   private String AV68Tarticu_wwds_4_tfclinom ;
   private String AV69Tarticu_wwds_5_tfclinom_sel ;
   private String AV70Tarticu_wwds_6_tfartcod ;
   private String AV71Tarticu_wwds_7_tfartcod_sel ;
   private String AV72Tarticu_wwds_8_tfartdsc ;
   private String AV73Tarticu_wwds_9_tfartdsc_sel ;
   private String AV76Tarticu_wwds_12_tftipartdsc ;
   private String AV77Tarticu_wwds_13_tftipartdsc_sel ;
   private String AV86Tarticu_wwds_22_tfartcomer ;
   private String AV87Tarticu_wwds_23_tfartcomer_sel ;
   private String AV88Tarticu_wwds_24_tfartactivo_sel ;
   private String scmdbuf ;
   private String lV68Tarticu_wwds_4_tfclinom ;
   private String lV70Tarticu_wwds_6_tfartcod ;
   private String lV72Tarticu_wwds_8_tfartdsc ;
   private String lV76Tarticu_wwds_12_tftipartdsc ;
   private String lV86Tarticu_wwds_22_tfartcomer ;
   private String A10045CliAct ;
   private String A396EmprCod ;
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
   private String AV57Title ;
   private String AV12FilterFullText ;
   private String AV41TFCliCod_To_Description ;
   private String AV42TFTipArtCod_To_Description ;
   private String AV43TFArtPml_To_Description ;
   private String AV44TFArtGraAca_To_Description ;
   private String AV45TFArtRen_To_Description ;
   private String AV46TFArtAcaMin_To_Description ;
   private String AV65Tarticu_wwds_1_filterfulltext ;
   private String lV65Tarticu_wwds_1_filterfulltext ;
   private String AV55PageInfo ;
   private String AV52DateInfo ;
   private String AV50AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9S2_A10045CliAct ;
   private String[] P0A9S2_A14295ArtActivo ;
   private String[] P0A9S2_A5741ArtComer ;
   private boolean[] P0A9S2_n5741ArtComer ;
   private short[] P0A9S2_A63ArtAcaMin ;
   private boolean[] P0A9S2_n63ArtAcaMin ;
   private java.math.BigDecimal[] P0A9S2_A95ArtRen ;
   private boolean[] P0A9S2_n95ArtRen ;
   private short[] P0A9S2_A1903ArtGraAca ;
   private boolean[] P0A9S2_n1903ArtGraAca ;
   private short[] P0A9S2_A1148ArtPml ;
   private boolean[] P0A9S2_n1148ArtPml ;
   private String[] P0A9S2_A830TipArtDsc ;
   private boolean[] P0A9S2_n830TipArtDsc ;
   private short[] P0A9S2_A829TipArtCod ;
   private String[] P0A9S2_A69ArtDsc ;
   private boolean[] P0A9S2_n69ArtDsc ;
   private String[] P0A9S2_A65ArtCod ;
   private String[] P0A9S2_A279CliNom ;
   private int[] P0A9S2_A252CliCod ;
   private String[] P0A9S2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tarticu_wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Tarticu_wwds_1_filterfulltext ,
                                          int AV66Tarticu_wwds_2_tfclicod ,
                                          int AV67Tarticu_wwds_3_tfclicod_to ,
                                          String AV69Tarticu_wwds_5_tfclinom_sel ,
                                          String AV68Tarticu_wwds_4_tfclinom ,
                                          String AV71Tarticu_wwds_7_tfartcod_sel ,
                                          String AV70Tarticu_wwds_6_tfartcod ,
                                          String AV73Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV72Tarticu_wwds_8_tfartdsc ,
                                          short AV74Tarticu_wwds_10_tftipartcod ,
                                          short AV75Tarticu_wwds_11_tftipartcod_to ,
                                          String AV77Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV76Tarticu_wwds_12_tftipartdsc ,
                                          short AV78Tarticu_wwds_14_tfartpml ,
                                          short AV79Tarticu_wwds_15_tfartpml_to ,
                                          short AV80Tarticu_wwds_16_tfartgraaca ,
                                          short AV81Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV82Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV83Tarticu_wwds_19_tfartren_to ,
                                          short AV84Tarticu_wwds_20_tfartacamin ,
                                          short AV85Tarticu_wwds_21_tfartacamin_to ,
                                          String AV87Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV86Tarticu_wwds_22_tfartcomer ,
                                          String AV88Tarticu_wwds_24_tfartactivo_sel ,
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
                                          String A14295ArtActivo ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T2.CliAct, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T3.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.EmprCod FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.CliCod > 0)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV65Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
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
      if ( ! (0==AV66Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV68Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV74Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV75Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV78Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV79Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV80Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV81Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV84Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV85Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV86Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
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
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
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
         scmdbuf += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtComer DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtActivo" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtActivo DESC" ;
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
                  return conditional_P0A9S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
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
               ((String[]) buf[20])[0] = rslt.getString(14, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
      }
   }

}

