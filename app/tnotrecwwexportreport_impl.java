package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnotrecwwexportreport_impl extends GXWebReport
{
   public tnotrecwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV100Title = httpContext.getMessage( "Lista de NOTAS DE RECLAMACIONES", "") ;
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
         h8490( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV108FilterFullText)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108FilterFullText, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV35TFNr_codigo) && (0==AV36TFNr_codigo_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reclacacion ID", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFNr_codigo), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV79TFNr_codigo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Reclacacion ID", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFNr_codigo_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFNr_codigo_To), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV37TFNr_albreccod) && (0==AV38TFNr_albreccod_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Recepcion Id", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFNr_albreccod), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFNr_albreccod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Recepcion Id", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFNr_albreccod_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFNr_albreccod_To), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV39TFNr_CliCod) && (0==AV40TFNr_CliCod_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFNr_CliCod), "ZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV81TFNr_CliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81TFNr_CliCod_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFNr_CliCod_To), "ZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFNr_CliNom_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFNr_CliNom_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV41TFNr_CliNom)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFNr_CliNom, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV44TFNr_albent_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran Cliente", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFNr_albent_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV43TFNr_albent)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran Cliente", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFNr_albent, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV46TFNr_refcli_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Referencia Albaran entrega cli", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFNr_refcli_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV45TFNr_refcli)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia Albaran entrega cli", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFNr_refcli, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV48TFNr_artcod_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFNr_artcod_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV47TFNr_artcod)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFNr_artcod, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV50TFNr_artdsc_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFNr_artdsc_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV49TFNr_artdsc)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFNr_artdsc, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV52TFNr_colnom_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFNr_colnom_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFNr_colnom)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFNr_colnom, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV53TFNr_colnum) && (0==AV54TFNr_colnum_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFNr_colnum), "ZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV82TFNr_colnum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFNr_colnum_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TFNr_colnum_To), "ZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV55TFNr_piezas) && (0==AV56TFNr_piezas_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas Entrada", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFNr_piezas), "ZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV83TFNr_piezas_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas Entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFNr_piezas_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFNr_piezas_To), "ZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFNr_unidades)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFNr_unidades_To)==0) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Entrada", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57TFNr_unidades, "ZZZZZ9.99")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV84TFNr_unidades_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades Entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFNr_unidades_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58TFNr_unidades_To, "ZZZZZ9.99")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFNr_unidad_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad (K,M)", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFNr_unidad_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV59TFNr_unidad)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidad (K,M)", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFNr_unidad, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV61TFNr_barcoda) && (0==AV62TFNr_barcoda_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr Anterior", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61TFNr_barcoda), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV85TFNr_barcoda_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Hdr Anterior", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFNr_barcoda_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV62TFNr_barcoda_To), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV63TFNr_barreoa) && (0==AV64TFNr_barreoa_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reopeado Anterior", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV63TFNr_barreoa), "9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV86TFNr_barreoa_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Reopeado Anterior", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86TFNr_barreoa_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64TFNr_barreoa_To), "9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFNr_barpara_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Particion Anterior", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFNr_barpara_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV65TFNr_barpara)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Particion Anterior", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFNr_barpara, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV67TFNr_NAlb) && (0==AV68TFNr_NAlb_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero Albaran Salida", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFNr_NAlb), "ZZZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV87TFNr_NAlb_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero Albaran Salida", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87TFNr_NAlb_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68TFNr_NAlb_To), "ZZZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFNr_local_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFNr_local_Sel, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFNr_local)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFNr_local, "")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV72TFNr_user_Sel)==0) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario creacion", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFNr_user_Sel, "@!")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFNr_user)==0) )
         {
            h8490( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario creacion", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFNr_user, "@!")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73TFNr_fecreg) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora entrada", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV73TFNr_fecreg, "99/99/99 99:99:99"), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75TFNr_fecent)) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha entrega", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV75TFNr_fecent, "99/99/99"), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV77TFNr_barcod) && (0==AV78TFNr_barcod_To) ) )
      {
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TFNr_barcod), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV90TFNr_barcod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Hdr", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8490( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90TFNr_barcod_To_Description, "")), 25, Gx_line+0, 183, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TFNr_barcod_To), "ZZZZZZZ9")), 183, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8490( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8490( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reclacacion ID", ""), 30, Gx_line+10, 60, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Recepcion Id", ""), 64, Gx_line+10, 94, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 98, Gx_line+10, 128, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 132, Gx_line+10, 162, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran Cliente", ""), 166, Gx_line+10, 196, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Referencia Albaran entrega cli", ""), 200, Gx_line+10, 230, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 234, Gx_line+10, 264, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 268, Gx_line+10, 298, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 302, Gx_line+10, 332, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 336, Gx_line+10, 367, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas Entrada", ""), 371, Gx_line+10, 402, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Entrada", ""), 406, Gx_line+10, 437, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad (K,M)", ""), 441, Gx_line+10, 472, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr Anterior", ""), 476, Gx_line+10, 507, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reopeado Anterior", ""), 511, Gx_line+10, 542, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Particion Anterior", ""), 546, Gx_line+10, 577, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero Albaran Salida", ""), 581, Gx_line+10, 612, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 616, Gx_line+10, 647, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario creacion", ""), 651, Gx_line+10, 682, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora entrada", ""), 686, Gx_line+10, 717, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha entrega", ""), 721, Gx_line+10, 752, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 756, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV120Tnotrecwwds_1_filterfulltext = AV108FilterFullText ;
      AV121Tnotrecwwds_2_tfnr_codigo = AV35TFNr_codigo ;
      AV122Tnotrecwwds_3_tfnr_codigo_to = AV36TFNr_codigo_To ;
      AV123Tnotrecwwds_4_tfnr_albreccod = AV37TFNr_albreccod ;
      AV124Tnotrecwwds_5_tfnr_albreccod_to = AV38TFNr_albreccod_To ;
      AV125Tnotrecwwds_6_tfnr_clicod = AV39TFNr_CliCod ;
      AV126Tnotrecwwds_7_tfnr_clicod_to = AV40TFNr_CliCod_To ;
      AV127Tnotrecwwds_8_tfnr_clinom = AV41TFNr_CliNom ;
      AV128Tnotrecwwds_9_tfnr_clinom_sel = AV42TFNr_CliNom_Sel ;
      AV129Tnotrecwwds_10_tfnr_albent = AV43TFNr_albent ;
      AV130Tnotrecwwds_11_tfnr_albent_sel = AV44TFNr_albent_Sel ;
      AV131Tnotrecwwds_12_tfnr_refcli = AV45TFNr_refcli ;
      AV132Tnotrecwwds_13_tfnr_refcli_sel = AV46TFNr_refcli_Sel ;
      AV133Tnotrecwwds_14_tfnr_artcod = AV47TFNr_artcod ;
      AV134Tnotrecwwds_15_tfnr_artcod_sel = AV48TFNr_artcod_Sel ;
      AV135Tnotrecwwds_16_tfnr_artdsc = AV49TFNr_artdsc ;
      AV136Tnotrecwwds_17_tfnr_artdsc_sel = AV50TFNr_artdsc_Sel ;
      AV137Tnotrecwwds_18_tfnr_colnom = AV51TFNr_colnom ;
      AV138Tnotrecwwds_19_tfnr_colnom_sel = AV52TFNr_colnom_Sel ;
      AV139Tnotrecwwds_20_tfnr_colnum = AV53TFNr_colnum ;
      AV140Tnotrecwwds_21_tfnr_colnum_to = AV54TFNr_colnum_To ;
      AV141Tnotrecwwds_22_tfnr_piezas = AV55TFNr_piezas ;
      AV142Tnotrecwwds_23_tfnr_piezas_to = AV56TFNr_piezas_To ;
      AV143Tnotrecwwds_24_tfnr_unidades = AV57TFNr_unidades ;
      AV144Tnotrecwwds_25_tfnr_unidades_to = AV58TFNr_unidades_To ;
      AV145Tnotrecwwds_26_tfnr_unidad = AV59TFNr_unidad ;
      AV146Tnotrecwwds_27_tfnr_unidad_sel = AV60TFNr_unidad_Sel ;
      AV147Tnotrecwwds_28_tfnr_barcoda = AV61TFNr_barcoda ;
      AV148Tnotrecwwds_29_tfnr_barcoda_to = AV62TFNr_barcoda_To ;
      AV149Tnotrecwwds_30_tfnr_barreoa = AV63TFNr_barreoa ;
      AV150Tnotrecwwds_31_tfnr_barreoa_to = AV64TFNr_barreoa_To ;
      AV151Tnotrecwwds_32_tfnr_barpara = AV65TFNr_barpara ;
      AV152Tnotrecwwds_33_tfnr_barpara_sel = AV66TFNr_barpara_Sel ;
      AV153Tnotrecwwds_34_tfnr_nalb = AV67TFNr_NAlb ;
      AV154Tnotrecwwds_35_tfnr_nalb_to = AV68TFNr_NAlb_To ;
      AV155Tnotrecwwds_36_tfnr_local = AV69TFNr_local ;
      AV156Tnotrecwwds_37_tfnr_local_sel = AV70TFNr_local_Sel ;
      AV157Tnotrecwwds_38_tfnr_user = AV71TFNr_user ;
      AV158Tnotrecwwds_39_tfnr_user_sel = AV72TFNr_user_Sel ;
      AV159Tnotrecwwds_40_tfnr_fecreg = AV73TFNr_fecreg ;
      AV160Tnotrecwwds_41_tfnr_fecent = AV75TFNr_fecent ;
      AV161Tnotrecwwds_42_tfnr_barcod = AV77TFNr_barcod ;
      AV162Tnotrecwwds_43_tfnr_barcod_to = AV78TFNr_barcod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV120Tnotrecwwds_1_filterfulltext ,
                                           Integer.valueOf(AV121Tnotrecwwds_2_tfnr_codigo) ,
                                           Integer.valueOf(AV122Tnotrecwwds_3_tfnr_codigo_to) ,
                                           Integer.valueOf(AV123Tnotrecwwds_4_tfnr_albreccod) ,
                                           Integer.valueOf(AV124Tnotrecwwds_5_tfnr_albreccod_to) ,
                                           Integer.valueOf(AV125Tnotrecwwds_6_tfnr_clicod) ,
                                           Integer.valueOf(AV126Tnotrecwwds_7_tfnr_clicod_to) ,
                                           AV128Tnotrecwwds_9_tfnr_clinom_sel ,
                                           AV127Tnotrecwwds_8_tfnr_clinom ,
                                           AV130Tnotrecwwds_11_tfnr_albent_sel ,
                                           AV129Tnotrecwwds_10_tfnr_albent ,
                                           AV132Tnotrecwwds_13_tfnr_refcli_sel ,
                                           AV131Tnotrecwwds_12_tfnr_refcli ,
                                           AV134Tnotrecwwds_15_tfnr_artcod_sel ,
                                           AV133Tnotrecwwds_14_tfnr_artcod ,
                                           AV136Tnotrecwwds_17_tfnr_artdsc_sel ,
                                           AV135Tnotrecwwds_16_tfnr_artdsc ,
                                           AV138Tnotrecwwds_19_tfnr_colnom_sel ,
                                           AV137Tnotrecwwds_18_tfnr_colnom ,
                                           Integer.valueOf(AV139Tnotrecwwds_20_tfnr_colnum) ,
                                           Integer.valueOf(AV140Tnotrecwwds_21_tfnr_colnum_to) ,
                                           Integer.valueOf(AV141Tnotrecwwds_22_tfnr_piezas) ,
                                           Integer.valueOf(AV142Tnotrecwwds_23_tfnr_piezas_to) ,
                                           AV143Tnotrecwwds_24_tfnr_unidades ,
                                           AV144Tnotrecwwds_25_tfnr_unidades_to ,
                                           AV146Tnotrecwwds_27_tfnr_unidad_sel ,
                                           AV145Tnotrecwwds_26_tfnr_unidad ,
                                           Integer.valueOf(AV147Tnotrecwwds_28_tfnr_barcoda) ,
                                           Integer.valueOf(AV148Tnotrecwwds_29_tfnr_barcoda_to) ,
                                           Byte.valueOf(AV149Tnotrecwwds_30_tfnr_barreoa) ,
                                           Byte.valueOf(AV150Tnotrecwwds_31_tfnr_barreoa_to) ,
                                           AV152Tnotrecwwds_33_tfnr_barpara_sel ,
                                           AV151Tnotrecwwds_32_tfnr_barpara ,
                                           Long.valueOf(AV153Tnotrecwwds_34_tfnr_nalb) ,
                                           Long.valueOf(AV154Tnotrecwwds_35_tfnr_nalb_to) ,
                                           AV156Tnotrecwwds_37_tfnr_local_sel ,
                                           AV155Tnotrecwwds_36_tfnr_local ,
                                           AV158Tnotrecwwds_39_tfnr_user_sel ,
                                           AV157Tnotrecwwds_38_tfnr_user ,
                                           AV159Tnotrecwwds_40_tfnr_fecreg ,
                                           AV160Tnotrecwwds_41_tfnr_fecent ,
                                           Integer.valueOf(AV161Tnotrecwwds_42_tfnr_barcod) ,
                                           Integer.valueOf(AV162Tnotrecwwds_43_tfnr_barcod_to) ,
                                           Integer.valueOf(A5198Nr_codigo) ,
                                           Integer.valueOf(A5206Nr_albrecc) ,
                                           Integer.valueOf(A5340Nr_CliCod) ,
                                           A5341Nr_CliNom ,
                                           A5199Nr_albent ,
                                           A5200Nr_refcli ,
                                           A5201Nr_artcod ,
                                           A5202Nr_artdsc ,
                                           A5203Nr_colnom ,
                                           Integer.valueOf(A5204Nr_colnum) ,
                                           Integer.valueOf(A5207Nr_piezas) ,
                                           A5208Nr_unidade ,
                                           A5209Nr_unidad ,
                                           Integer.valueOf(A5222Nr_barcoda) ,
                                           Byte.valueOf(A5223Nr_barreoa) ,
                                           A5224Nr_barpara ,
                                           Long.valueOf(A12235Nr_NAlb) ,
                                           A5214Nr_local ,
                                           A5215Nr_user ,
                                           Integer.valueOf(A5210Nr_barcod) ,
                                           A5216Nr_fecreg ,
                                           A5217Nr_fecent ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV120Tnotrecwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV120Tnotrecwwds_1_filterfulltext), "%", "") ;
      lV127Tnotrecwwds_8_tfnr_clinom = GXutil.padr( GXutil.rtrim( AV127Tnotrecwwds_8_tfnr_clinom), 30, "%") ;
      lV129Tnotrecwwds_10_tfnr_albent = GXutil.padr( GXutil.rtrim( AV129Tnotrecwwds_10_tfnr_albent), 8, "%") ;
      lV131Tnotrecwwds_12_tfnr_refcli = GXutil.padr( GXutil.rtrim( AV131Tnotrecwwds_12_tfnr_refcli), 8, "%") ;
      lV133Tnotrecwwds_14_tfnr_artcod = GXutil.padr( GXutil.rtrim( AV133Tnotrecwwds_14_tfnr_artcod), 16, "%") ;
      lV135Tnotrecwwds_16_tfnr_artdsc = GXutil.padr( GXutil.rtrim( AV135Tnotrecwwds_16_tfnr_artdsc), 26, "%") ;
      lV137Tnotrecwwds_18_tfnr_colnom = GXutil.padr( GXutil.rtrim( AV137Tnotrecwwds_18_tfnr_colnom), 13, "%") ;
      lV145Tnotrecwwds_26_tfnr_unidad = GXutil.padr( GXutil.rtrim( AV145Tnotrecwwds_26_tfnr_unidad), 1, "%") ;
      lV151Tnotrecwwds_32_tfnr_barpara = GXutil.padr( GXutil.rtrim( AV151Tnotrecwwds_32_tfnr_barpara), 1, "%") ;
      lV155Tnotrecwwds_36_tfnr_local = GXutil.padr( GXutil.rtrim( AV155Tnotrecwwds_36_tfnr_local), 10, "%") ;
      lV157Tnotrecwwds_38_tfnr_user = GXutil.padr( GXutil.rtrim( AV157Tnotrecwwds_38_tfnr_user), 8, "%") ;
      /* Using cursor P08492 */
      pr_default.execute(0, new Object[] {lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, lV120Tnotrecwwds_1_filterfulltext, Integer.valueOf(AV121Tnotrecwwds_2_tfnr_codigo), Integer.valueOf(AV122Tnotrecwwds_3_tfnr_codigo_to), Integer.valueOf(AV123Tnotrecwwds_4_tfnr_albreccod), Integer.valueOf(AV124Tnotrecwwds_5_tfnr_albreccod_to), Integer.valueOf(AV125Tnotrecwwds_6_tfnr_clicod), Integer.valueOf(AV126Tnotrecwwds_7_tfnr_clicod_to), lV127Tnotrecwwds_8_tfnr_clinom, AV128Tnotrecwwds_9_tfnr_clinom_sel, lV129Tnotrecwwds_10_tfnr_albent, AV130Tnotrecwwds_11_tfnr_albent_sel, lV131Tnotrecwwds_12_tfnr_refcli, AV132Tnotrecwwds_13_tfnr_refcli_sel, lV133Tnotrecwwds_14_tfnr_artcod, AV134Tnotrecwwds_15_tfnr_artcod_sel, lV135Tnotrecwwds_16_tfnr_artdsc, AV136Tnotrecwwds_17_tfnr_artdsc_sel, lV137Tnotrecwwds_18_tfnr_colnom, AV138Tnotrecwwds_19_tfnr_colnom_sel, Integer.valueOf(AV139Tnotrecwwds_20_tfnr_colnum), Integer.valueOf(AV140Tnotrecwwds_21_tfnr_colnum_to), Integer.valueOf(AV141Tnotrecwwds_22_tfnr_piezas), Integer.valueOf(AV142Tnotrecwwds_23_tfnr_piezas_to), AV143Tnotrecwwds_24_tfnr_unidades, AV144Tnotrecwwds_25_tfnr_unidades_to, lV145Tnotrecwwds_26_tfnr_unidad, AV146Tnotrecwwds_27_tfnr_unidad_sel, Integer.valueOf(AV147Tnotrecwwds_28_tfnr_barcoda), Integer.valueOf(AV148Tnotrecwwds_29_tfnr_barcoda_to), Byte.valueOf(AV149Tnotrecwwds_30_tfnr_barreoa), Byte.valueOf(AV150Tnotrecwwds_31_tfnr_barreoa_to), lV151Tnotrecwwds_32_tfnr_barpara, AV152Tnotrecwwds_33_tfnr_barpara_sel, Long.valueOf(AV153Tnotrecwwds_34_tfnr_nalb), Long.valueOf(AV154Tnotrecwwds_35_tfnr_nalb_to), lV155Tnotrecwwds_36_tfnr_local, AV156Tnotrecwwds_37_tfnr_local_sel, lV157Tnotrecwwds_38_tfnr_user, AV158Tnotrecwwds_39_tfnr_user_sel, AV159Tnotrecwwds_40_tfnr_fecreg, AV160Tnotrecwwds_41_tfnr_fecent, Integer.valueOf(AV161Tnotrecwwds_42_tfnr_barcod), Integer.valueOf(AV162Tnotrecwwds_43_tfnr_barcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5210Nr_barcod = P08492_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P08492_n5210Nr_barcod[0] ;
         A5217Nr_fecent = P08492_A5217Nr_fecent[0] ;
         n5217Nr_fecent = P08492_n5217Nr_fecent[0] ;
         A5216Nr_fecreg = P08492_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P08492_n5216Nr_fecreg[0] ;
         A5215Nr_user = P08492_A5215Nr_user[0] ;
         n5215Nr_user = P08492_n5215Nr_user[0] ;
         A5214Nr_local = P08492_A5214Nr_local[0] ;
         n5214Nr_local = P08492_n5214Nr_local[0] ;
         A12235Nr_NAlb = P08492_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P08492_n12235Nr_NAlb[0] ;
         A5224Nr_barpara = P08492_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P08492_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P08492_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P08492_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P08492_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P08492_n5222Nr_barcoda[0] ;
         A5209Nr_unidad = P08492_A5209Nr_unidad[0] ;
         n5209Nr_unidad = P08492_n5209Nr_unidad[0] ;
         A5208Nr_unidade = P08492_A5208Nr_unidade[0] ;
         n5208Nr_unidade = P08492_n5208Nr_unidade[0] ;
         A5207Nr_piezas = P08492_A5207Nr_piezas[0] ;
         n5207Nr_piezas = P08492_n5207Nr_piezas[0] ;
         A5204Nr_colnum = P08492_A5204Nr_colnum[0] ;
         n5204Nr_colnum = P08492_n5204Nr_colnum[0] ;
         A5203Nr_colnom = P08492_A5203Nr_colnom[0] ;
         n5203Nr_colnom = P08492_n5203Nr_colnom[0] ;
         A5202Nr_artdsc = P08492_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = P08492_n5202Nr_artdsc[0] ;
         A5201Nr_artcod = P08492_A5201Nr_artcod[0] ;
         n5201Nr_artcod = P08492_n5201Nr_artcod[0] ;
         A5200Nr_refcli = P08492_A5200Nr_refcli[0] ;
         n5200Nr_refcli = P08492_n5200Nr_refcli[0] ;
         A5199Nr_albent = P08492_A5199Nr_albent[0] ;
         n5199Nr_albent = P08492_n5199Nr_albent[0] ;
         A5341Nr_CliNom = P08492_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = P08492_n5341Nr_CliNom[0] ;
         A5340Nr_CliCod = P08492_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P08492_n5340Nr_CliCod[0] ;
         A5206Nr_albrecc = P08492_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P08492_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P08492_A5198Nr_codigo[0] ;
         A396EmprCod = P08492_A396EmprCod[0] ;
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
         h8490( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9")), 30, Gx_line+10, 60, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5206Nr_albrecc), "ZZZZZZZ9")), 64, Gx_line+10, 94, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5340Nr_CliCod), "ZZZZZ9")), 98, Gx_line+10, 128, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5341Nr_CliNom, "")), 132, Gx_line+10, 162, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5199Nr_albent, "")), 166, Gx_line+10, 196, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5200Nr_refcli, "")), 200, Gx_line+10, 230, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5201Nr_artcod, "")), 234, Gx_line+10, 264, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5202Nr_artdsc, "")), 268, Gx_line+10, 298, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5203Nr_colnom, "")), 302, Gx_line+10, 332, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5204Nr_colnum), "ZZZZZ9")), 336, Gx_line+10, 367, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5207Nr_piezas), "ZZZ9")), 371, Gx_line+10, 402, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5208Nr_unidade, "ZZZZZ9.99")), 406, Gx_line+10, 437, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5209Nr_unidad, "")), 441, Gx_line+10, 472, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9")), 476, Gx_line+10, 507, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9")), 511, Gx_line+10, 542, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), 546, Gx_line+10, 577, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12235Nr_NAlb), "ZZZZZZZZZ9")), 581, Gx_line+10, 612, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5214Nr_local, "")), 616, Gx_line+10, 647, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5215Nr_user, "@!")), 651, Gx_line+10, 682, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"), 686, Gx_line+10, 717, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A5217Nr_fecent, "99/99/99"), 721, Gx_line+10, 752, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9")), 756, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
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
      if ( GXutil.strcmp(AV31Session.getValue("TNOTRECWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TNOTRECWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TNOTRECWWGridState"), null, null);
      }
      AV10OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV163GXV1 = 1 ;
      while ( AV163GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV163GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV108FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CODIGO") == 0 )
         {
            AV35TFNr_codigo = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFNr_codigo_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBRECCOD") == 0 )
         {
            AV37TFNr_albreccod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFNr_albreccod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLICOD") == 0 )
         {
            AV39TFNr_CliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFNr_CliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM") == 0 )
         {
            AV41TFNr_CliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_CLINOM_SEL") == 0 )
         {
            AV42TFNr_CliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT") == 0 )
         {
            AV43TFNr_albent = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ALBENT_SEL") == 0 )
         {
            AV44TFNr_albent_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI") == 0 )
         {
            AV45TFNr_refcli = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_REFCLI_SEL") == 0 )
         {
            AV46TFNr_refcli_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD") == 0 )
         {
            AV47TFNr_artcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTCOD_SEL") == 0 )
         {
            AV48TFNr_artcod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC") == 0 )
         {
            AV49TFNr_artdsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_ARTDSC_SEL") == 0 )
         {
            AV50TFNr_artdsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM") == 0 )
         {
            AV51TFNr_colnom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNOM_SEL") == 0 )
         {
            AV52TFNr_colnom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_COLNUM") == 0 )
         {
            AV53TFNr_colnum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFNr_colnum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_PIEZAS") == 0 )
         {
            AV55TFNr_piezas = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFNr_piezas_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDADES") == 0 )
         {
            AV57TFNr_unidades = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFNr_unidades_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD") == 0 )
         {
            AV59TFNr_unidad = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_UNIDAD_SEL") == 0 )
         {
            AV60TFNr_unidad_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCODA") == 0 )
         {
            AV61TFNr_barcoda = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFNr_barcoda_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARREOA") == 0 )
         {
            AV63TFNr_barreoa = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFNr_barreoa_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA") == 0 )
         {
            AV65TFNr_barpara = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARPARA_SEL") == 0 )
         {
            AV66TFNr_barpara_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_NALB") == 0 )
         {
            AV67TFNr_NAlb = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV68TFNr_NAlb_To = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL") == 0 )
         {
            AV69TFNr_local = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_LOCAL_SEL") == 0 )
         {
            AV70TFNr_local_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER") == 0 )
         {
            AV71TFNr_user = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_USER_SEL") == 0 )
         {
            AV72TFNr_user_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECREG") == 0 )
         {
            AV73TFNr_fecreg = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_FECENT") == 0 )
         {
            AV75TFNr_fecent = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNR_BARCOD") == 0 )
         {
            AV77TFNr_barcod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFNr_barcod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV163GXV1 = (int)(AV163GXV1+1) ;
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

   public void h8490( boolean bFoot ,
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
               AV97PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV93DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV100Title = AV116Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV100Title = "" ;
      AV108FilterFullText = "" ;
      AV79TFNr_codigo_To_Description = "" ;
      AV80TFNr_albreccod_To_Description = "" ;
      AV81TFNr_CliCod_To_Description = "" ;
      AV42TFNr_CliNom_Sel = "" ;
      AV41TFNr_CliNom = "" ;
      AV44TFNr_albent_Sel = "" ;
      AV43TFNr_albent = "" ;
      AV46TFNr_refcli_Sel = "" ;
      AV45TFNr_refcli = "" ;
      AV48TFNr_artcod_Sel = "" ;
      AV47TFNr_artcod = "" ;
      AV50TFNr_artdsc_Sel = "" ;
      AV49TFNr_artdsc = "" ;
      AV52TFNr_colnom_Sel = "" ;
      AV51TFNr_colnom = "" ;
      AV82TFNr_colnum_To_Description = "" ;
      AV83TFNr_piezas_To_Description = "" ;
      AV57TFNr_unidades = DecimalUtil.ZERO ;
      AV58TFNr_unidades_To = DecimalUtil.ZERO ;
      AV84TFNr_unidades_To_Description = "" ;
      AV60TFNr_unidad_Sel = "" ;
      AV59TFNr_unidad = "" ;
      AV85TFNr_barcoda_To_Description = "" ;
      AV86TFNr_barreoa_To_Description = "" ;
      AV66TFNr_barpara_Sel = "" ;
      AV65TFNr_barpara = "" ;
      AV87TFNr_NAlb_To_Description = "" ;
      AV70TFNr_local_Sel = "" ;
      AV69TFNr_local = "" ;
      AV72TFNr_user_Sel = "" ;
      AV71TFNr_user = "" ;
      AV73TFNr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV75TFNr_fecent = GXutil.nullDate() ;
      AV90TFNr_barcod_To_Description = "" ;
      A5341Nr_CliNom = "" ;
      A5199Nr_albent = "" ;
      A5200Nr_refcli = "" ;
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5203Nr_colnom = "" ;
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5215Nr_user = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5217Nr_fecent = GXutil.nullDate() ;
      AV120Tnotrecwwds_1_filterfulltext = "" ;
      AV127Tnotrecwwds_8_tfnr_clinom = "" ;
      AV128Tnotrecwwds_9_tfnr_clinom_sel = "" ;
      AV129Tnotrecwwds_10_tfnr_albent = "" ;
      AV130Tnotrecwwds_11_tfnr_albent_sel = "" ;
      AV131Tnotrecwwds_12_tfnr_refcli = "" ;
      AV132Tnotrecwwds_13_tfnr_refcli_sel = "" ;
      AV133Tnotrecwwds_14_tfnr_artcod = "" ;
      AV134Tnotrecwwds_15_tfnr_artcod_sel = "" ;
      AV135Tnotrecwwds_16_tfnr_artdsc = "" ;
      AV136Tnotrecwwds_17_tfnr_artdsc_sel = "" ;
      AV137Tnotrecwwds_18_tfnr_colnom = "" ;
      AV138Tnotrecwwds_19_tfnr_colnom_sel = "" ;
      AV143Tnotrecwwds_24_tfnr_unidades = DecimalUtil.ZERO ;
      AV144Tnotrecwwds_25_tfnr_unidades_to = DecimalUtil.ZERO ;
      AV145Tnotrecwwds_26_tfnr_unidad = "" ;
      AV146Tnotrecwwds_27_tfnr_unidad_sel = "" ;
      AV151Tnotrecwwds_32_tfnr_barpara = "" ;
      AV152Tnotrecwwds_33_tfnr_barpara_sel = "" ;
      AV155Tnotrecwwds_36_tfnr_local = "" ;
      AV156Tnotrecwwds_37_tfnr_local_sel = "" ;
      AV157Tnotrecwwds_38_tfnr_user = "" ;
      AV158Tnotrecwwds_39_tfnr_user_sel = "" ;
      AV159Tnotrecwwds_40_tfnr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV160Tnotrecwwds_41_tfnr_fecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV120Tnotrecwwds_1_filterfulltext = "" ;
      lV127Tnotrecwwds_8_tfnr_clinom = "" ;
      lV129Tnotrecwwds_10_tfnr_albent = "" ;
      lV131Tnotrecwwds_12_tfnr_refcli = "" ;
      lV133Tnotrecwwds_14_tfnr_artcod = "" ;
      lV135Tnotrecwwds_16_tfnr_artdsc = "" ;
      lV137Tnotrecwwds_18_tfnr_colnom = "" ;
      lV145Tnotrecwwds_26_tfnr_unidad = "" ;
      lV151Tnotrecwwds_32_tfnr_barpara = "" ;
      lV155Tnotrecwwds_36_tfnr_local = "" ;
      lV157Tnotrecwwds_38_tfnr_user = "" ;
      P08492_A5210Nr_barcod = new int[1] ;
      P08492_n5210Nr_barcod = new boolean[] {false} ;
      P08492_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      P08492_n5217Nr_fecent = new boolean[] {false} ;
      P08492_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P08492_n5216Nr_fecreg = new boolean[] {false} ;
      P08492_A5215Nr_user = new String[] {""} ;
      P08492_n5215Nr_user = new boolean[] {false} ;
      P08492_A5214Nr_local = new String[] {""} ;
      P08492_n5214Nr_local = new boolean[] {false} ;
      P08492_A12235Nr_NAlb = new long[1] ;
      P08492_n12235Nr_NAlb = new boolean[] {false} ;
      P08492_A5224Nr_barpara = new String[] {""} ;
      P08492_n5224Nr_barpara = new boolean[] {false} ;
      P08492_A5223Nr_barreoa = new byte[1] ;
      P08492_n5223Nr_barreoa = new boolean[] {false} ;
      P08492_A5222Nr_barcoda = new int[1] ;
      P08492_n5222Nr_barcoda = new boolean[] {false} ;
      P08492_A5209Nr_unidad = new String[] {""} ;
      P08492_n5209Nr_unidad = new boolean[] {false} ;
      P08492_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08492_n5208Nr_unidade = new boolean[] {false} ;
      P08492_A5207Nr_piezas = new int[1] ;
      P08492_n5207Nr_piezas = new boolean[] {false} ;
      P08492_A5204Nr_colnum = new int[1] ;
      P08492_n5204Nr_colnum = new boolean[] {false} ;
      P08492_A5203Nr_colnom = new String[] {""} ;
      P08492_n5203Nr_colnom = new boolean[] {false} ;
      P08492_A5202Nr_artdsc = new String[] {""} ;
      P08492_n5202Nr_artdsc = new boolean[] {false} ;
      P08492_A5201Nr_artcod = new String[] {""} ;
      P08492_n5201Nr_artcod = new boolean[] {false} ;
      P08492_A5200Nr_refcli = new String[] {""} ;
      P08492_n5200Nr_refcli = new boolean[] {false} ;
      P08492_A5199Nr_albent = new String[] {""} ;
      P08492_n5199Nr_albent = new boolean[] {false} ;
      P08492_A5341Nr_CliNom = new String[] {""} ;
      P08492_n5341Nr_CliNom = new boolean[] {false} ;
      P08492_A5340Nr_CliCod = new int[1] ;
      P08492_n5340Nr_CliCod = new boolean[] {false} ;
      P08492_A5206Nr_albrecc = new int[1] ;
      P08492_n5206Nr_albrecc = new boolean[] {false} ;
      P08492_A5198Nr_codigo = new int[1] ;
      P08492_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV97PageInfo = "" ;
      AV93DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV116Pgmdesc = "" ;
      AV110AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrecwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08492_A5210Nr_barcod, P08492_n5210Nr_barcod, P08492_A5217Nr_fecent, P08492_n5217Nr_fecent, P08492_A5216Nr_fecreg, P08492_n5216Nr_fecreg, P08492_A5215Nr_user, P08492_n5215Nr_user, P08492_A5214Nr_local, P08492_n5214Nr_local,
            P08492_A12235Nr_NAlb, P08492_n12235Nr_NAlb, P08492_A5224Nr_barpara, P08492_n5224Nr_barpara, P08492_A5223Nr_barreoa, P08492_n5223Nr_barreoa, P08492_A5222Nr_barcoda, P08492_n5222Nr_barcoda, P08492_A5209Nr_unidad, P08492_n5209Nr_unidad,
            P08492_A5208Nr_unidade, P08492_n5208Nr_unidade, P08492_A5207Nr_piezas, P08492_n5207Nr_piezas, P08492_A5204Nr_colnum, P08492_n5204Nr_colnum, P08492_A5203Nr_colnom, P08492_n5203Nr_colnom, P08492_A5202Nr_artdsc, P08492_n5202Nr_artdsc,
            P08492_A5201Nr_artcod, P08492_n5201Nr_artcod, P08492_A5200Nr_refcli, P08492_n5200Nr_refcli, P08492_A5199Nr_albent, P08492_n5199Nr_albent, P08492_A5341Nr_CliNom, P08492_n5341Nr_CliNom, P08492_A5340Nr_CliCod, P08492_n5340Nr_CliCod,
            P08492_A5206Nr_albrecc, P08492_n5206Nr_albrecc, P08492_A5198Nr_codigo, P08492_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV116Pgmdesc = httpContext.getMessage( "TNOTRECWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV116Pgmdesc = httpContext.getMessage( "TNOTRECWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV63TFNr_barreoa ;
   private byte AV64TFNr_barreoa_To ;
   private byte A5223Nr_barreoa ;
   private byte AV149Tnotrecwwds_30_tfnr_barreoa ;
   private byte AV150Tnotrecwwds_31_tfnr_barreoa_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV35TFNr_codigo ;
   private int AV36TFNr_codigo_To ;
   private int AV37TFNr_albreccod ;
   private int AV38TFNr_albreccod_To ;
   private int AV39TFNr_CliCod ;
   private int AV40TFNr_CliCod_To ;
   private int AV53TFNr_colnum ;
   private int AV54TFNr_colnum_To ;
   private int AV55TFNr_piezas ;
   private int AV56TFNr_piezas_To ;
   private int AV61TFNr_barcoda ;
   private int AV62TFNr_barcoda_To ;
   private int AV77TFNr_barcod ;
   private int AV78TFNr_barcod_To ;
   private int A5198Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5204Nr_colnum ;
   private int A5207Nr_piezas ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private int AV121Tnotrecwwds_2_tfnr_codigo ;
   private int AV122Tnotrecwwds_3_tfnr_codigo_to ;
   private int AV123Tnotrecwwds_4_tfnr_albreccod ;
   private int AV124Tnotrecwwds_5_tfnr_albreccod_to ;
   private int AV125Tnotrecwwds_6_tfnr_clicod ;
   private int AV126Tnotrecwwds_7_tfnr_clicod_to ;
   private int AV139Tnotrecwwds_20_tfnr_colnum ;
   private int AV140Tnotrecwwds_21_tfnr_colnum_to ;
   private int AV141Tnotrecwwds_22_tfnr_piezas ;
   private int AV142Tnotrecwwds_23_tfnr_piezas_to ;
   private int AV147Tnotrecwwds_28_tfnr_barcoda ;
   private int AV148Tnotrecwwds_29_tfnr_barcoda_to ;
   private int AV161Tnotrecwwds_42_tfnr_barcod ;
   private int AV162Tnotrecwwds_43_tfnr_barcod_to ;
   private int AV163GXV1 ;
   private long AV67TFNr_NAlb ;
   private long AV68TFNr_NAlb_To ;
   private long A12235Nr_NAlb ;
   private long AV153Tnotrecwwds_34_tfnr_nalb ;
   private long AV154Tnotrecwwds_35_tfnr_nalb_to ;
   private java.math.BigDecimal AV57TFNr_unidades ;
   private java.math.BigDecimal AV58TFNr_unidades_To ;
   private java.math.BigDecimal A5208Nr_unidade ;
   private java.math.BigDecimal AV143Tnotrecwwds_24_tfnr_unidades ;
   private java.math.BigDecimal AV144Tnotrecwwds_25_tfnr_unidades_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV42TFNr_CliNom_Sel ;
   private String AV41TFNr_CliNom ;
   private String AV44TFNr_albent_Sel ;
   private String AV43TFNr_albent ;
   private String AV46TFNr_refcli_Sel ;
   private String AV45TFNr_refcli ;
   private String AV48TFNr_artcod_Sel ;
   private String AV47TFNr_artcod ;
   private String AV50TFNr_artdsc_Sel ;
   private String AV49TFNr_artdsc ;
   private String AV52TFNr_colnom_Sel ;
   private String AV51TFNr_colnom ;
   private String AV60TFNr_unidad_Sel ;
   private String AV59TFNr_unidad ;
   private String AV66TFNr_barpara_Sel ;
   private String AV65TFNr_barpara ;
   private String AV70TFNr_local_Sel ;
   private String AV69TFNr_local ;
   private String AV72TFNr_user_Sel ;
   private String AV71TFNr_user ;
   private String A5341Nr_CliNom ;
   private String A5199Nr_albent ;
   private String A5200Nr_refcli ;
   private String A5201Nr_artcod ;
   private String A5202Nr_artdsc ;
   private String A5203Nr_colnom ;
   private String A5209Nr_unidad ;
   private String A5224Nr_barpara ;
   private String A5214Nr_local ;
   private String A5215Nr_user ;
   private String AV127Tnotrecwwds_8_tfnr_clinom ;
   private String AV128Tnotrecwwds_9_tfnr_clinom_sel ;
   private String AV129Tnotrecwwds_10_tfnr_albent ;
   private String AV130Tnotrecwwds_11_tfnr_albent_sel ;
   private String AV131Tnotrecwwds_12_tfnr_refcli ;
   private String AV132Tnotrecwwds_13_tfnr_refcli_sel ;
   private String AV133Tnotrecwwds_14_tfnr_artcod ;
   private String AV134Tnotrecwwds_15_tfnr_artcod_sel ;
   private String AV135Tnotrecwwds_16_tfnr_artdsc ;
   private String AV136Tnotrecwwds_17_tfnr_artdsc_sel ;
   private String AV137Tnotrecwwds_18_tfnr_colnom ;
   private String AV138Tnotrecwwds_19_tfnr_colnom_sel ;
   private String AV145Tnotrecwwds_26_tfnr_unidad ;
   private String AV146Tnotrecwwds_27_tfnr_unidad_sel ;
   private String AV151Tnotrecwwds_32_tfnr_barpara ;
   private String AV152Tnotrecwwds_33_tfnr_barpara_sel ;
   private String AV155Tnotrecwwds_36_tfnr_local ;
   private String AV156Tnotrecwwds_37_tfnr_local_sel ;
   private String AV157Tnotrecwwds_38_tfnr_user ;
   private String AV158Tnotrecwwds_39_tfnr_user_sel ;
   private String scmdbuf ;
   private String lV127Tnotrecwwds_8_tfnr_clinom ;
   private String lV129Tnotrecwwds_10_tfnr_albent ;
   private String lV131Tnotrecwwds_12_tfnr_refcli ;
   private String lV133Tnotrecwwds_14_tfnr_artcod ;
   private String lV135Tnotrecwwds_16_tfnr_artdsc ;
   private String lV137Tnotrecwwds_18_tfnr_colnom ;
   private String lV145Tnotrecwwds_26_tfnr_unidad ;
   private String lV151Tnotrecwwds_32_tfnr_barpara ;
   private String lV155Tnotrecwwds_36_tfnr_local ;
   private String lV157Tnotrecwwds_38_tfnr_user ;
   private String A396EmprCod ;
   private String AV116Pgmdesc ;
   private java.util.Date AV73TFNr_fecreg ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date AV159Tnotrecwwds_40_tfnr_fecreg ;
   private java.util.Date AV75TFNr_fecent ;
   private java.util.Date A5217Nr_fecent ;
   private java.util.Date AV160Tnotrecwwds_41_tfnr_fecent ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n5210Nr_barcod ;
   private boolean n5217Nr_fecent ;
   private boolean n5216Nr_fecreg ;
   private boolean n5215Nr_user ;
   private boolean n5214Nr_local ;
   private boolean n12235Nr_NAlb ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n5209Nr_unidad ;
   private boolean n5208Nr_unidade ;
   private boolean n5207Nr_piezas ;
   private boolean n5204Nr_colnum ;
   private boolean n5203Nr_colnom ;
   private boolean n5202Nr_artdsc ;
   private boolean n5201Nr_artcod ;
   private boolean n5200Nr_refcli ;
   private boolean n5199Nr_albent ;
   private boolean n5341Nr_CliNom ;
   private boolean n5340Nr_CliCod ;
   private boolean n5206Nr_albrecc ;
   private String AV100Title ;
   private String AV108FilterFullText ;
   private String AV79TFNr_codigo_To_Description ;
   private String AV80TFNr_albreccod_To_Description ;
   private String AV81TFNr_CliCod_To_Description ;
   private String AV82TFNr_colnum_To_Description ;
   private String AV83TFNr_piezas_To_Description ;
   private String AV84TFNr_unidades_To_Description ;
   private String AV85TFNr_barcoda_To_Description ;
   private String AV86TFNr_barreoa_To_Description ;
   private String AV87TFNr_NAlb_To_Description ;
   private String AV90TFNr_barcod_To_Description ;
   private String AV120Tnotrecwwds_1_filterfulltext ;
   private String lV120Tnotrecwwds_1_filterfulltext ;
   private String AV97PageInfo ;
   private String AV93DateInfo ;
   private String AV110AppName ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private IDataStoreProvider pr_default ;
   private int[] P08492_A5210Nr_barcod ;
   private boolean[] P08492_n5210Nr_barcod ;
   private java.util.Date[] P08492_A5217Nr_fecent ;
   private boolean[] P08492_n5217Nr_fecent ;
   private java.util.Date[] P08492_A5216Nr_fecreg ;
   private boolean[] P08492_n5216Nr_fecreg ;
   private String[] P08492_A5215Nr_user ;
   private boolean[] P08492_n5215Nr_user ;
   private String[] P08492_A5214Nr_local ;
   private boolean[] P08492_n5214Nr_local ;
   private long[] P08492_A12235Nr_NAlb ;
   private boolean[] P08492_n12235Nr_NAlb ;
   private String[] P08492_A5224Nr_barpara ;
   private boolean[] P08492_n5224Nr_barpara ;
   private byte[] P08492_A5223Nr_barreoa ;
   private boolean[] P08492_n5223Nr_barreoa ;
   private int[] P08492_A5222Nr_barcoda ;
   private boolean[] P08492_n5222Nr_barcoda ;
   private String[] P08492_A5209Nr_unidad ;
   private boolean[] P08492_n5209Nr_unidad ;
   private java.math.BigDecimal[] P08492_A5208Nr_unidade ;
   private boolean[] P08492_n5208Nr_unidade ;
   private int[] P08492_A5207Nr_piezas ;
   private boolean[] P08492_n5207Nr_piezas ;
   private int[] P08492_A5204Nr_colnum ;
   private boolean[] P08492_n5204Nr_colnum ;
   private String[] P08492_A5203Nr_colnom ;
   private boolean[] P08492_n5203Nr_colnom ;
   private String[] P08492_A5202Nr_artdsc ;
   private boolean[] P08492_n5202Nr_artdsc ;
   private String[] P08492_A5201Nr_artcod ;
   private boolean[] P08492_n5201Nr_artcod ;
   private String[] P08492_A5200Nr_refcli ;
   private boolean[] P08492_n5200Nr_refcli ;
   private String[] P08492_A5199Nr_albent ;
   private boolean[] P08492_n5199Nr_albent ;
   private String[] P08492_A5341Nr_CliNom ;
   private boolean[] P08492_n5341Nr_CliNom ;
   private int[] P08492_A5340Nr_CliCod ;
   private boolean[] P08492_n5340Nr_CliCod ;
   private int[] P08492_A5206Nr_albrecc ;
   private boolean[] P08492_n5206Nr_albrecc ;
   private int[] P08492_A5198Nr_codigo ;
   private String[] P08492_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tnotrecwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08492( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV120Tnotrecwwds_1_filterfulltext ,
                                          int AV121Tnotrecwwds_2_tfnr_codigo ,
                                          int AV122Tnotrecwwds_3_tfnr_codigo_to ,
                                          int AV123Tnotrecwwds_4_tfnr_albreccod ,
                                          int AV124Tnotrecwwds_5_tfnr_albreccod_to ,
                                          int AV125Tnotrecwwds_6_tfnr_clicod ,
                                          int AV126Tnotrecwwds_7_tfnr_clicod_to ,
                                          String AV128Tnotrecwwds_9_tfnr_clinom_sel ,
                                          String AV127Tnotrecwwds_8_tfnr_clinom ,
                                          String AV130Tnotrecwwds_11_tfnr_albent_sel ,
                                          String AV129Tnotrecwwds_10_tfnr_albent ,
                                          String AV132Tnotrecwwds_13_tfnr_refcli_sel ,
                                          String AV131Tnotrecwwds_12_tfnr_refcli ,
                                          String AV134Tnotrecwwds_15_tfnr_artcod_sel ,
                                          String AV133Tnotrecwwds_14_tfnr_artcod ,
                                          String AV136Tnotrecwwds_17_tfnr_artdsc_sel ,
                                          String AV135Tnotrecwwds_16_tfnr_artdsc ,
                                          String AV138Tnotrecwwds_19_tfnr_colnom_sel ,
                                          String AV137Tnotrecwwds_18_tfnr_colnom ,
                                          int AV139Tnotrecwwds_20_tfnr_colnum ,
                                          int AV140Tnotrecwwds_21_tfnr_colnum_to ,
                                          int AV141Tnotrecwwds_22_tfnr_piezas ,
                                          int AV142Tnotrecwwds_23_tfnr_piezas_to ,
                                          java.math.BigDecimal AV143Tnotrecwwds_24_tfnr_unidades ,
                                          java.math.BigDecimal AV144Tnotrecwwds_25_tfnr_unidades_to ,
                                          String AV146Tnotrecwwds_27_tfnr_unidad_sel ,
                                          String AV145Tnotrecwwds_26_tfnr_unidad ,
                                          int AV147Tnotrecwwds_28_tfnr_barcoda ,
                                          int AV148Tnotrecwwds_29_tfnr_barcoda_to ,
                                          byte AV149Tnotrecwwds_30_tfnr_barreoa ,
                                          byte AV150Tnotrecwwds_31_tfnr_barreoa_to ,
                                          String AV152Tnotrecwwds_33_tfnr_barpara_sel ,
                                          String AV151Tnotrecwwds_32_tfnr_barpara ,
                                          long AV153Tnotrecwwds_34_tfnr_nalb ,
                                          long AV154Tnotrecwwds_35_tfnr_nalb_to ,
                                          String AV156Tnotrecwwds_37_tfnr_local_sel ,
                                          String AV155Tnotrecwwds_36_tfnr_local ,
                                          String AV158Tnotrecwwds_39_tfnr_user_sel ,
                                          String AV157Tnotrecwwds_38_tfnr_user ,
                                          java.util.Date AV159Tnotrecwwds_40_tfnr_fecreg ,
                                          java.util.Date AV160Tnotrecwwds_41_tfnr_fecent ,
                                          int AV161Tnotrecwwds_42_tfnr_barcod ,
                                          int AV162Tnotrecwwds_43_tfnr_barcod_to ,
                                          int A5198Nr_codigo ,
                                          int A5206Nr_albrecc ,
                                          int A5340Nr_CliCod ,
                                          String A5341Nr_CliNom ,
                                          String A5199Nr_albent ,
                                          String A5200Nr_refcli ,
                                          String A5201Nr_artcod ,
                                          String A5202Nr_artdsc ,
                                          String A5203Nr_colnom ,
                                          int A5204Nr_colnum ,
                                          int A5207Nr_piezas ,
                                          java.math.BigDecimal A5208Nr_unidade ,
                                          String A5209Nr_unidad ,
                                          int A5222Nr_barcoda ,
                                          byte A5223Nr_barreoa ,
                                          String A5224Nr_barpara ,
                                          long A12235Nr_NAlb ,
                                          String A5214Nr_local ,
                                          String A5215Nr_user ,
                                          int A5210Nr_barcod ,
                                          java.util.Date A5216Nr_fecreg ,
                                          java.util.Date A5217Nr_fecent ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[62];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Nr_barcod, Nr_fecent, Nr_fecreg, Nr_user, Nr_local, Nr_NAlb, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_unidad, Nr_unidade, Nr_piezas, Nr_colnum, Nr_colnom, Nr_artdsc," ;
      scmdbuf += " Nr_artcod, Nr_refcli, Nr_albent, Nr_CliNom, Nr_CliCod, Nr_albrecc, Nr_codigo, EmprCod FROM TXPNOTREC" ;
      if ( ! (GXutil.strcmp("", AV120Tnotrecwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Nr_codigo,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_albrecc,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_CliCod,'999990'), 2) like '%' || ?) or ( UPPER(Nr_CliNom) like '%' || UPPER(?)) or ( UPPER(Nr_albent) like '%' || UPPER(?)) or ( UPPER(Nr_refcli) like '%' || UPPER(?)) or ( UPPER(Nr_artcod) like '%' || UPPER(?)) or ( UPPER(Nr_artdsc) like '%' || UPPER(?)) or ( UPPER(Nr_colnom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_colnum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_piezas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_unidade,'999990.99'), 2) like '%' || ?) or ( UPPER(Nr_unidad) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcoda,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Nr_barreoa,'90'), 2) like '%' || ?) or ( UPPER(Nr_barpara) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_NAlb,'9999999990'), 2) like '%' || ?) or ( UPPER(Nr_local) like '%' || UPPER(?)) or ( UPPER(Nr_user) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Nr_barcod,'99999990'), 2) like '%' || ?))");
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
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV121Tnotrecwwds_2_tfnr_codigo) )
      {
         addWhere(sWhereString, "(Nr_codigo >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV122Tnotrecwwds_3_tfnr_codigo_to) )
      {
         addWhere(sWhereString, "(Nr_codigo <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV123Tnotrecwwds_4_tfnr_albreccod) )
      {
         addWhere(sWhereString, "(Nr_albrecc >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV124Tnotrecwwds_5_tfnr_albreccod_to) )
      {
         addWhere(sWhereString, "(Nr_albrecc <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV125Tnotrecwwds_6_tfnr_clicod) )
      {
         addWhere(sWhereString, "(Nr_CliCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV126Tnotrecwwds_7_tfnr_clicod_to) )
      {
         addWhere(sWhereString, "(Nr_CliCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Tnotrecwwds_9_tfnr_clinom_sel)==0) && ( ! (GXutil.strcmp("", AV127Tnotrecwwds_8_tfnr_clinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Tnotrecwwds_9_tfnr_clinom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_CliNom = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tnotrecwwds_11_tfnr_albent_sel)==0) && ( ! (GXutil.strcmp("", AV129Tnotrecwwds_10_tfnr_albent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_albent) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tnotrecwwds_11_tfnr_albent_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_albent = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Tnotrecwwds_13_tfnr_refcli_sel)==0) && ( ! (GXutil.strcmp("", AV131Tnotrecwwds_12_tfnr_refcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_refcli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Tnotrecwwds_13_tfnr_refcli_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_refcli = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Tnotrecwwds_15_tfnr_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV133Tnotrecwwds_14_tfnr_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artcod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tnotrecwwds_15_tfnr_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artcod = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tnotrecwwds_17_tfnr_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV135Tnotrecwwds_16_tfnr_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_artdsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tnotrecwwds_17_tfnr_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_artdsc = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tnotrecwwds_19_tfnr_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Tnotrecwwds_18_tfnr_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_colnom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tnotrecwwds_19_tfnr_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_colnom = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV139Tnotrecwwds_20_tfnr_colnum) )
      {
         addWhere(sWhereString, "(Nr_colnum >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV140Tnotrecwwds_21_tfnr_colnum_to) )
      {
         addWhere(sWhereString, "(Nr_colnum <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV141Tnotrecwwds_22_tfnr_piezas) )
      {
         addWhere(sWhereString, "(Nr_piezas >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV142Tnotrecwwds_23_tfnr_piezas_to) )
      {
         addWhere(sWhereString, "(Nr_piezas <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Tnotrecwwds_24_tfnr_unidades)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Tnotrecwwds_25_tfnr_unidades_to)==0) )
      {
         addWhere(sWhereString, "(Nr_unidade <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Tnotrecwwds_27_tfnr_unidad_sel)==0) && ( ! (GXutil.strcmp("", AV145Tnotrecwwds_26_tfnr_unidad)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_unidad) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Tnotrecwwds_27_tfnr_unidad_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_unidad = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV147Tnotrecwwds_28_tfnr_barcoda) )
      {
         addWhere(sWhereString, "(Nr_barcoda >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (0==AV148Tnotrecwwds_29_tfnr_barcoda_to) )
      {
         addWhere(sWhereString, "(Nr_barcoda <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (0==AV149Tnotrecwwds_30_tfnr_barreoa) )
      {
         addWhere(sWhereString, "(Nr_barreoa >= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV150Tnotrecwwds_31_tfnr_barreoa_to) )
      {
         addWhere(sWhereString, "(Nr_barreoa <= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tnotrecwwds_33_tfnr_barpara_sel)==0) && ( ! (GXutil.strcmp("", AV151Tnotrecwwds_32_tfnr_barpara)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_barpara) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tnotrecwwds_33_tfnr_barpara_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_barpara = ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV153Tnotrecwwds_34_tfnr_nalb) )
      {
         addWhere(sWhereString, "(Nr_NAlb >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV154Tnotrecwwds_35_tfnr_nalb_to) )
      {
         addWhere(sWhereString, "(Nr_NAlb <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tnotrecwwds_37_tfnr_local_sel)==0) && ( ! (GXutil.strcmp("", AV155Tnotrecwwds_36_tfnr_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tnotrecwwds_37_tfnr_local_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_local = ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tnotrecwwds_39_tfnr_user_sel)==0) && ( ! (GXutil.strcmp("", AV157Tnotrecwwds_38_tfnr_user)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Nr_user) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tnotrecwwds_39_tfnr_user_sel)==0) )
      {
         addWhere(sWhereString, "(Nr_user = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV159Tnotrecwwds_40_tfnr_fecreg) )
      {
         addWhere(sWhereString, "(Nr_fecreg >= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV160Tnotrecwwds_41_tfnr_fecent)) )
      {
         addWhere(sWhereString, "(Nr_fecent >= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (0==AV161Tnotrecwwds_42_tfnr_barcod) )
      {
         addWhere(sWhereString, "(Nr_barcod >= ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (0==AV162Tnotrecwwds_43_tfnr_barcod_to) )
      {
         addWhere(sWhereString, "(Nr_barcod <= ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_albrecc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_albrecc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_codigo" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_codigo DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_CliCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_CliNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_albent" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_albent DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_refcli" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_refcli DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_artcod" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_artcod DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_artdsc" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_artdsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_colnom" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_colnom DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_colnum" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_colnum DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_piezas" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_piezas DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_unidade" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_unidade DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_unidad" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_unidad DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barcoda" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barcoda DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barreoa" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barreoa DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barpara" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barpara DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_NAlb" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_NAlb DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_local" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_local DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_user" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_user DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_fecreg" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_fecreg DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_fecent" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_fecent DESC" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Nr_barcod" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Nr_barcod DESC" ;
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
                  return conditional_P08492(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , ((Number) dynConstraints[34]).longValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).intValue() , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Boolean) dynConstraints[66]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08492", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[110]).byteValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[111]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 1);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[114]).longValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 10);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 10);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 8);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 8);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[120], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[123]).intValue());
               }
               return;
      }
   }

}

