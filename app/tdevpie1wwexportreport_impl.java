package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie1wwexportreport_impl extends GXWebReport
{
   public tdevpie1wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV72Title = httpContext.getMessage( "Lista de Devolucion Piezas (Header)", "") ;
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
         h86J0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV78FilterFullText)==0) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78FilterFullText, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV40TFDevGenCod) && (0==AV41TFDevGenCod_To) ) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Devolucion", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFDevGenCod), "ZZZZZZZ9")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV58TFDevGenCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Devolucion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFDevGenCod_To_Description, "")), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFDevGenCod_To), "ZZZZZZZ9")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFDevGenFec)) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV42TFDevGenFec, "99/99/99"), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV44TFAlbRecCod) && (0==AV45TFAlbRecCod_To) ) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFAlbRecCod), "ZZZZZZZ9")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV60TFAlbRecCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Recepcion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFAlbRecCod_To_Description, "")), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFAlbRecCod_To), "ZZZZZZZ9")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFCliNom_Sel)==0) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFCliNom_Sel, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFCliNom)==0) )
         {
            h86J0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFCliNom, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV49TFAlbRef_Sel)==0) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cdg.Ref.", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFAlbRef_Sel, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFAlbRef)==0) )
         {
            h86J0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cdg.Ref.", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFAlbRef, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV51TFDevTrnNom_Sel)==0) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFDevTrnNom_Sel, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFDevTrnNom)==0) )
         {
            h86J0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFDevTrnNom, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFDevGenUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFDevGenUni_To)==0) ) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52TFDevGenUni, "ZZZZZ9.99")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV61TFDevGenUni_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFDevGenUni_To_Description, "")), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53TFDevGenUni_To, "ZZZZZ9.99")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV82TFAlbRUni_Sels.fromJSonString(AV80TFAlbRUni_SelsJson, null);
      if ( ! ( AV82TFAlbRUni_Sels.size() == 0 ) )
      {
         AV86i = 1 ;
         AV97GXV1 = 1 ;
         while ( AV97GXV1 <= AV82TFAlbRUni_Sels.size() )
         {
            AV55TFAlbRUni_Sel = (String)AV82TFAlbRUni_Sels.elementAt(-1+AV97GXV1) ;
            if ( AV86i == 1 )
            {
               AV81TFAlbRUni_SelDscs = "" ;
            }
            else
            {
               AV81TFAlbRUni_SelDscs += ", " ;
            }
            AV85FilterTFAlbRUni_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV55TFAlbRUni_Sel), "K") == 0 )
            {
               AV85FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV55TFAlbRUni_Sel), "M") == 0 )
            {
               AV85FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "M", "") ;
            }
            AV81TFAlbRUni_SelDscs += AV85FilterTFAlbRUni_SelValueDescription ;
            AV86i = (long)(AV86i+1) ;
            AV97GXV1 = (int)(AV97GXV1+1) ;
         }
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81TFAlbRUni_SelDscs, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV56TFDevGenPie) && (0==AV57TFDevGenPie_To) ) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFDevGenPie), "ZZZ9")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFDevGenPie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFDevGenPie_To_Description, "")), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFDevGenPie_To), "ZZZ9")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV84TFEmprTrn_Sel)==0) )
      {
         h86J0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "EmprTrn", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFEmprTrn_Sel, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV83TFEmprTrn)==0) )
         {
            h86J0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "EmprTrn", ""), 25, Gx_line+0, 138, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFEmprTrn, "")), 138, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h86J0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h86J0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Devolucion", ""), 30, Gx_line+10, 81, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 85, Gx_line+10, 136, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 140, Gx_line+10, 191, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 195, Gx_line+10, 297, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cdg.Ref.", ""), 301, Gx_line+10, 403, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 407, Gx_line+10, 511, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 515, Gx_line+10, 567, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 571, Gx_line+10, 675, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 679, Gx_line+10, 731, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "EmprTrn", ""), 735, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV99Tdevpie1wwds_1_filterfulltext = AV78FilterFullText ;
      AV100Tdevpie1wwds_2_tfdevgencod = AV40TFDevGenCod ;
      AV101Tdevpie1wwds_3_tfdevgencod_to = AV41TFDevGenCod_To ;
      AV102Tdevpie1wwds_4_tfdevgenfec = AV42TFDevGenFec ;
      AV103Tdevpie1wwds_5_tfalbreccod = AV44TFAlbRecCod ;
      AV104Tdevpie1wwds_6_tfalbreccod_to = AV45TFAlbRecCod_To ;
      AV105Tdevpie1wwds_7_tfclinom = AV46TFCliNom ;
      AV106Tdevpie1wwds_8_tfclinom_sel = AV47TFCliNom_Sel ;
      AV107Tdevpie1wwds_9_tfalbref = AV48TFAlbRef ;
      AV108Tdevpie1wwds_10_tfalbref_sel = AV49TFAlbRef_Sel ;
      AV109Tdevpie1wwds_11_tfdevtrnnom = AV50TFDevTrnNom ;
      AV110Tdevpie1wwds_12_tfdevtrnnom_sel = AV51TFDevTrnNom_Sel ;
      AV111Tdevpie1wwds_13_tfdevgenuni = AV52TFDevGenUni ;
      AV112Tdevpie1wwds_14_tfdevgenuni_to = AV53TFDevGenUni_To ;
      AV113Tdevpie1wwds_15_tfalbruni_sels = AV82TFAlbRUni_Sels ;
      AV114Tdevpie1wwds_16_tfdevgenpie = AV56TFDevGenPie ;
      AV115Tdevpie1wwds_17_tfdevgenpie_to = AV57TFDevGenPie_To ;
      AV116Tdevpie1wwds_18_tfemprtrn = AV83TFEmprTrn ;
      AV117Tdevpie1wwds_19_tfemprtrn_sel = AV84TFEmprTrn_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV113Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV100Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV101Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV102Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV103Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV104Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV106Tdevpie1wwds_8_tfclinom_sel ,
                                           AV105Tdevpie1wwds_7_tfclinom ,
                                           AV108Tdevpie1wwds_10_tfalbref_sel ,
                                           AV107Tdevpie1wwds_9_tfalbref ,
                                           AV110Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV109Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV111Tdevpie1wwds_13_tfdevgenuni ,
                                           AV112Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV113Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV114Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV115Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV117Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV116Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV99Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV105Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV105Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV107Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV107Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV109Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV109Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV116Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV116Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086J2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV100Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV101Tdevpie1wwds_3_tfdevgencod_to), AV102Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV103Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV104Tdevpie1wwds_6_tfalbreccod_to), lV105Tdevpie1wwds_7_tfclinom, AV106Tdevpie1wwds_8_tfclinom_sel, lV107Tdevpie1wwds_9_tfalbref, AV108Tdevpie1wwds_10_tfalbref_sel, lV109Tdevpie1wwds_11_tfdevtrnnom, AV110Tdevpie1wwds_12_tfdevtrnnom_sel, AV111Tdevpie1wwds_13_tfdevgenuni, AV112Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV114Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV115Tdevpie1wwds_17_tfdevgenpie_to), lV116Tdevpie1wwds_18_tfemprtrn, AV117Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086J2_A396EmprCod[0] ;
         A252CliCod = P086J2_A252CliCod[0] ;
         n252CliCod = P086J2_n252CliCod[0] ;
         A327DevGenTrn = P086J2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086J2_n327DevGenTrn[0] ;
         A410EmprTrn = P086J2_A410EmprTrn[0] ;
         n410EmprTrn = P086J2_n410EmprTrn[0] ;
         A326DevGenPie = P086J2_A326DevGenPie[0] ;
         n326DevGenPie = P086J2_n326DevGenPie[0] ;
         A328DevGenUni = P086J2_A328DevGenUni[0] ;
         n328DevGenUni = P086J2_n328DevGenUni[0] ;
         A329DevTrnNom = P086J2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086J2_n329DevTrnNom[0] ;
         A45AlbRef = P086J2_A45AlbRef[0] ;
         A279CliNom = P086J2_A279CliNom[0] ;
         A44AlbRecCod = P086J2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086J2_n44AlbRecCod[0] ;
         A325DevGenFec = P086J2_A325DevGenFec[0] ;
         n325DevGenFec = P086J2_n325DevGenFec[0] ;
         A323DevGenCod = P086J2_A323DevGenCod[0] ;
         A56AlbRUni = P086J2_A56AlbRUni[0] ;
         A279CliNom = P086J2_A279CliNom[0] ;
         A329DevTrnNom = P086J2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086J2_n329DevTrnNom[0] ;
         A45AlbRef = P086J2_A45AlbRef[0] ;
         A56AlbRUni = P086J2_A56AlbRUni[0] ;
         if ( (GXutil.strcmp("", AV99Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV99Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV99Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV99Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV99Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV99Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV99Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV99Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV99Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV79AlbRUniDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
            {
               AV79AlbRUniDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
            {
               AV79AlbRUniDescription = httpContext.getMessage( "M", "") ;
            }
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
            h86J0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")), 30, Gx_line+10, 81, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A325DevGenFec, "99/99/99"), 85, Gx_line+10, 136, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 140, Gx_line+10, 191, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 195, Gx_line+10, 297, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 301, Gx_line+10, 403, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A329DevTrnNom, "")), 407, Gx_line+10, 511, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A328DevGenUni, "ZZZZZ9.99")), 515, Gx_line+10, 567, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79AlbRUniDescription, "")), 571, Gx_line+10, 675, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9")), 679, Gx_line+10, 731, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A410EmprTrn, "")), 735, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("TDevPie1WWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie1WWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("TDevPie1WWGridState"), null, null);
      }
      AV10OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV118GXV2 = 1 ;
      while ( AV118GXV2 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV118GXV2));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV40TFDevGenCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFDevGenCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV42TFDevGenFec = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV44TFAlbRecCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFAlbRecCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV46TFCliNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV47TFCliNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV48TFAlbRef = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV49TFAlbRef_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV50TFDevTrnNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV51TFDevTrnNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV52TFDevGenUni = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFDevGenUni_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV80TFAlbRUni_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV82TFAlbRUni_Sels.fromJSonString(AV80TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV56TFDevGenPie = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFDevGenPie_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN") == 0 )
         {
            AV83TFEmprTrn = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN_SEL") == 0 )
         {
            AV84TFEmprTrn_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV118GXV2 = (int)(AV118GXV2+1) ;
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

   public void h86J0( boolean bFoot ,
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
               AV69PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV65DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV72Title = AV94Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV72Title = "" ;
      AV78FilterFullText = "" ;
      AV58TFDevGenCod_To_Description = "" ;
      AV42TFDevGenFec = GXutil.nullDate() ;
      AV60TFAlbRecCod_To_Description = "" ;
      AV47TFCliNom_Sel = "" ;
      AV46TFCliNom = "" ;
      AV49TFAlbRef_Sel = "" ;
      AV48TFAlbRef = "" ;
      AV51TFDevTrnNom_Sel = "" ;
      AV50TFDevTrnNom = "" ;
      AV52TFDevGenUni = DecimalUtil.ZERO ;
      AV53TFDevGenUni_To = DecimalUtil.ZERO ;
      AV61TFDevGenUni_To_Description = "" ;
      AV82TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80TFAlbRUni_SelsJson = "" ;
      AV55TFAlbRUni_Sel = "" ;
      AV81TFAlbRUni_SelDscs = "" ;
      AV85FilterTFAlbRUni_SelValueDescription = "" ;
      AV62TFDevGenPie_To_Description = "" ;
      AV84TFEmprTrn_Sel = "" ;
      AV83TFEmprTrn = "" ;
      A56AlbRUni = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A410EmprTrn = "" ;
      AV99Tdevpie1wwds_1_filterfulltext = "" ;
      AV102Tdevpie1wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV105Tdevpie1wwds_7_tfclinom = "" ;
      AV106Tdevpie1wwds_8_tfclinom_sel = "" ;
      AV107Tdevpie1wwds_9_tfalbref = "" ;
      AV108Tdevpie1wwds_10_tfalbref_sel = "" ;
      AV109Tdevpie1wwds_11_tfdevtrnnom = "" ;
      AV110Tdevpie1wwds_12_tfdevtrnnom_sel = "" ;
      AV111Tdevpie1wwds_13_tfdevgenuni = DecimalUtil.ZERO ;
      AV112Tdevpie1wwds_14_tfdevgenuni_to = DecimalUtil.ZERO ;
      AV113Tdevpie1wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV116Tdevpie1wwds_18_tfemprtrn = "" ;
      AV117Tdevpie1wwds_19_tfemprtrn_sel = "" ;
      lV99Tdevpie1wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV105Tdevpie1wwds_7_tfclinom = "" ;
      lV107Tdevpie1wwds_9_tfalbref = "" ;
      lV109Tdevpie1wwds_11_tfdevtrnnom = "" ;
      lV116Tdevpie1wwds_18_tfemprtrn = "" ;
      P086J2_A396EmprCod = new String[] {""} ;
      P086J2_A252CliCod = new int[1] ;
      P086J2_n252CliCod = new boolean[] {false} ;
      P086J2_A327DevGenTrn = new short[1] ;
      P086J2_n327DevGenTrn = new boolean[] {false} ;
      P086J2_A410EmprTrn = new String[] {""} ;
      P086J2_n410EmprTrn = new boolean[] {false} ;
      P086J2_A326DevGenPie = new short[1] ;
      P086J2_n326DevGenPie = new boolean[] {false} ;
      P086J2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086J2_n328DevGenUni = new boolean[] {false} ;
      P086J2_A329DevTrnNom = new String[] {""} ;
      P086J2_n329DevTrnNom = new boolean[] {false} ;
      P086J2_A45AlbRef = new String[] {""} ;
      P086J2_A279CliNom = new String[] {""} ;
      P086J2_A44AlbRecCod = new int[1] ;
      P086J2_n44AlbRecCod = new boolean[] {false} ;
      P086J2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086J2_n325DevGenFec = new boolean[] {false} ;
      P086J2_A323DevGenCod = new int[1] ;
      P086J2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV79AlbRUniDescription = "" ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV69PageInfo = "" ;
      AV65DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV94Pgmdesc = "" ;
      AV88AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie1wwexportreport__default(),
         new Object[] {
             new Object[] {
            P086J2_A396EmprCod, P086J2_A252CliCod, P086J2_n252CliCod, P086J2_A327DevGenTrn, P086J2_n327DevGenTrn, P086J2_A410EmprTrn, P086J2_n410EmprTrn, P086J2_A326DevGenPie, P086J2_n326DevGenPie, P086J2_A328DevGenUni,
            P086J2_n328DevGenUni, P086J2_A329DevTrnNom, P086J2_n329DevTrnNom, P086J2_A45AlbRef, P086J2_A279CliNom, P086J2_A44AlbRecCod, P086J2_n44AlbRecCod, P086J2_A325DevGenFec, P086J2_n325DevGenFec, P086J2_A323DevGenCod,
            P086J2_A56AlbRUni
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV94Pgmdesc = httpContext.getMessage( "TDev Pie1 WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV94Pgmdesc = httpContext.getMessage( "TDev Pie1 WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV56TFDevGenPie ;
   private short AV57TFDevGenPie_To ;
   private short A326DevGenPie ;
   private short AV114Tdevpie1wwds_16_tfdevgenpie ;
   private short AV115Tdevpie1wwds_17_tfdevgenpie_to ;
   private short AV10OrderedBy ;
   private short A327DevGenTrn ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV40TFDevGenCod ;
   private int AV41TFDevGenCod_To ;
   private int AV44TFAlbRecCod ;
   private int AV45TFAlbRecCod_To ;
   private int AV97GXV1 ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int AV100Tdevpie1wwds_2_tfdevgencod ;
   private int AV101Tdevpie1wwds_3_tfdevgencod_to ;
   private int AV103Tdevpie1wwds_5_tfalbreccod ;
   private int AV104Tdevpie1wwds_6_tfalbreccod_to ;
   private int AV113Tdevpie1wwds_15_tfalbruni_sels_size ;
   private int A252CliCod ;
   private int AV118GXV2 ;
   private long AV86i ;
   private java.math.BigDecimal AV52TFDevGenUni ;
   private java.math.BigDecimal AV53TFDevGenUni_To ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal AV111Tdevpie1wwds_13_tfdevgenuni ;
   private java.math.BigDecimal AV112Tdevpie1wwds_14_tfdevgenuni_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV47TFCliNom_Sel ;
   private String AV46TFCliNom ;
   private String AV49TFAlbRef_Sel ;
   private String AV48TFAlbRef ;
   private String AV51TFDevTrnNom_Sel ;
   private String AV50TFDevTrnNom ;
   private String AV55TFAlbRUni_Sel ;
   private String AV84TFEmprTrn_Sel ;
   private String AV83TFEmprTrn ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A410EmprTrn ;
   private String AV105Tdevpie1wwds_7_tfclinom ;
   private String AV106Tdevpie1wwds_8_tfclinom_sel ;
   private String AV107Tdevpie1wwds_9_tfalbref ;
   private String AV108Tdevpie1wwds_10_tfalbref_sel ;
   private String AV109Tdevpie1wwds_11_tfdevtrnnom ;
   private String AV110Tdevpie1wwds_12_tfdevtrnnom_sel ;
   private String AV116Tdevpie1wwds_18_tfemprtrn ;
   private String AV117Tdevpie1wwds_19_tfemprtrn_sel ;
   private String scmdbuf ;
   private String lV105Tdevpie1wwds_7_tfclinom ;
   private String lV107Tdevpie1wwds_9_tfalbref ;
   private String lV109Tdevpie1wwds_11_tfdevtrnnom ;
   private String lV116Tdevpie1wwds_18_tfemprtrn ;
   private String A396EmprCod ;
   private String AV94Pgmdesc ;
   private java.util.Date AV42TFDevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV102Tdevpie1wwds_4_tfdevgenfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean n410EmprTrn ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private String AV80TFAlbRUni_SelsJson ;
   private String AV72Title ;
   private String AV78FilterFullText ;
   private String AV58TFDevGenCod_To_Description ;
   private String AV60TFAlbRecCod_To_Description ;
   private String AV61TFDevGenUni_To_Description ;
   private String AV81TFAlbRUni_SelDscs ;
   private String AV85FilterTFAlbRUni_SelValueDescription ;
   private String AV62TFDevGenPie_To_Description ;
   private String AV99Tdevpie1wwds_1_filterfulltext ;
   private String lV99Tdevpie1wwds_1_filterfulltext ;
   private String AV79AlbRUniDescription ;
   private String AV69PageInfo ;
   private String AV65DateInfo ;
   private String AV88AppName ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private IDataStoreProvider pr_default ;
   private String[] P086J2_A396EmprCod ;
   private int[] P086J2_A252CliCod ;
   private boolean[] P086J2_n252CliCod ;
   private short[] P086J2_A327DevGenTrn ;
   private boolean[] P086J2_n327DevGenTrn ;
   private String[] P086J2_A410EmprTrn ;
   private boolean[] P086J2_n410EmprTrn ;
   private short[] P086J2_A326DevGenPie ;
   private boolean[] P086J2_n326DevGenPie ;
   private java.math.BigDecimal[] P086J2_A328DevGenUni ;
   private boolean[] P086J2_n328DevGenUni ;
   private String[] P086J2_A329DevTrnNom ;
   private boolean[] P086J2_n329DevTrnNom ;
   private String[] P086J2_A45AlbRef ;
   private String[] P086J2_A279CliNom ;
   private int[] P086J2_A44AlbRecCod ;
   private boolean[] P086J2_n44AlbRecCod ;
   private java.util.Date[] P086J2_A325DevGenFec ;
   private boolean[] P086J2_n325DevGenFec ;
   private int[] P086J2_A323DevGenCod ;
   private String[] P086J2_A56AlbRUni ;
   private GXSimpleCollection<String> AV82TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV113Tdevpie1wwds_15_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class tdevpie1wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV113Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV100Tdevpie1wwds_2_tfdevgencod ,
                                          int AV101Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV102Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV103Tdevpie1wwds_5_tfalbreccod ,
                                          int AV104Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV106Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV105Tdevpie1wwds_7_tfclinom ,
                                          String AV108Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV107Tdevpie1wwds_9_tfalbref ,
                                          String AV110Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV109Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV111Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV112Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV113Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV114Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV115Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV117Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV116Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV99Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.DevGenTrn AS DevGenTrn, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T3.TrnNom AS DevTrnNom, T4.AlbRef, T2.CliNom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV100Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV101Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV103Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV104Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV107Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV109Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( AV113Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Tdevpie1wwds_15_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV114Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV115Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV116Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRef" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRef DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRUni" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprTrn" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprTrn DESC" ;
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
                  return conditional_P086J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 16);
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
      }
   }

}

