package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webconalbexportreport_impl extends GXWebReport
{
   public webconalbexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV131Title = httpContext.getMessage( "Lista de Entrada Tejido Crudo Almacen", "") ;
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
         h84D0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV184FilterFullText)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV184FilterFullText, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV42TFAlbRecCod) && (0==AV43TFAlbRecCod_To) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFAlbRecCod), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV104TFAlbRecCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Recepcion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104TFAlbRecCod_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43TFAlbRecCod_To), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFCliNom_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFCliNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFCliNom)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFCliNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFAlbRFen)) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV48TFAlbRFen, "99/99/99"), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV52TFAlbRReo_Sels.fromJSonString(AV50TFAlbRReo_SelsJson, null);
      if ( ! ( AV52TFAlbRReo_Sels.size() == 0 ) )
      {
         AV121i = 1 ;
         AV195GXV1 = 1 ;
         while ( AV195GXV1 <= AV52TFAlbRReo_Sels.size() )
         {
            AV53TFAlbRReo_Sel = (String)AV52TFAlbRReo_Sels.elementAt(-1+AV195GXV1) ;
            if ( AV121i == 1 )
            {
               AV51TFAlbRReo_SelDscs = "" ;
            }
            else
            {
               AV51TFAlbRReo_SelDscs += ", " ;
            }
            AV107FilterTFAlbRReo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV53TFAlbRReo_Sel), "NO") == 0 )
            {
               AV107FilterTFAlbRReo_SelValueDescription = httpContext.getMessage( "NO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV53TFAlbRReo_Sel), "SI") == 0 )
            {
               AV107FilterTFAlbRReo_SelValueDescription = httpContext.getMessage( "SI", "") ;
            }
            AV51TFAlbRReo_SelDscs += AV107FilterTFAlbRReo_SelValueDescription ;
            AV121i = (long)(AV121i+1) ;
            AV195GXV1 = (int)(AV195GXV1+1) ;
         }
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reclamacion?", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFAlbRReo_SelDscs, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFAlbRef_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFAlbRef_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV54TFAlbRef)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFAlbRef, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV57TFAlbRefDsc_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFAlbRefDsc_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV56TFAlbRefDsc)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFAlbRefDsc, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV59TFAlbRTartD_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "T Articulo", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFAlbRTartD_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFAlbRTartD)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "T Articulo", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFAlbRTartD, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV61TFTrnNom_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFTrnNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV60TFTrnNom)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFTrnNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV63TFProceNom_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFProceNom_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFProceNom)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFProceNom, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbRUniEnt_To)==0) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unds Ent", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TFAlbRUniEnt, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV108TFAlbRUniEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unds Ent", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108TFAlbRUniEnt_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TFAlbRUniEnt_To, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV180TFAlbRUni_Sels.fromJSonString(AV178TFAlbRUni_SelsJson, null);
      if ( ! ( AV180TFAlbRUni_Sels.size() == 0 ) )
      {
         AV121i = 1 ;
         AV196GXV2 = 1 ;
         while ( AV196GXV2 <= AV180TFAlbRUni_Sels.size() )
         {
            AV67TFAlbRUni_Sel = (String)AV180TFAlbRUni_Sels.elementAt(-1+AV196GXV2) ;
            if ( AV121i == 1 )
            {
               AV179TFAlbRUni_SelDscs = "" ;
            }
            else
            {
               AV179TFAlbRUni_SelDscs += ", " ;
            }
            AV181FilterTFAlbRUni_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV67TFAlbRUni_Sel), "K") == 0 )
            {
               AV181FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV67TFAlbRUni_Sel), "M") == 0 )
            {
               AV181FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "M", "") ;
            }
            AV179TFAlbRUni_SelDscs += AV181FilterTFAlbRUni_SelValueDescription ;
            AV121i = (long)(AV121i+1) ;
            AV196GXV2 = (int)(AV196GXV2+1) ;
         }
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Und", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV179TFAlbRUni_SelDscs, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniUti_To)==0) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unds Uti", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68TFAlbRUniUti, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV109TFAlbRUniUti_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unds Uti", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109TFAlbRUniUti_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TFAlbRUniUti_To, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFAlbRUniDis_To)==0) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unds Disp", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70TFAlbRUniDis, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV110TFAlbRUniDis_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unds Disp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110TFAlbRUniDis_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71TFAlbRUniDis_To, "ZZZZZ9.99")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV72TFAlbRPieEnt) && (0==AV73TFAlbRPieEnt_To) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pzs Ent", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72TFAlbRPieEnt), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV111TFAlbRPieEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pzs Ent", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111TFAlbRPieEnt_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73TFAlbRPieEnt_To), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV74TFAlbRPieUti) && (0==AV75TFAlbRPieUti_To) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pzs Uti", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV74TFAlbRPieUti), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV112TFAlbRPieUti_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pzs Uti", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112TFAlbRPieUti_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75TFAlbRPieUti_To), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV76TFAlbRPieDis) && (0==AV77TFAlbRPieDis_To) ) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pzs Disp", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76TFAlbRPieDis), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV113TFAlbRPieDis_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pzs Disp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113TFAlbRPieDis_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TFAlbRPieDis_To), "ZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV80TFAlbREst_Sels.fromJSonString(AV78TFAlbREst_SelsJson, null);
      if ( ! ( AV80TFAlbREst_Sels.size() == 0 ) )
      {
         AV121i = 1 ;
         AV197GXV3 = 1 ;
         while ( AV197GXV3 <= AV80TFAlbREst_Sels.size() )
         {
            AV81TFAlbREst_Sel = ((Number) AV80TFAlbREst_Sels.elementAt(-1+AV197GXV3)).byteValue() ;
            if ( AV121i == 1 )
            {
               AV79TFAlbREst_SelDscs = "" ;
            }
            else
            {
               AV79TFAlbREst_SelDscs += ", " ;
            }
            AV114FilterTFAlbREst_SelValueDescription = "" ;
            if ( AV81TFAlbREst_Sel == 0 )
            {
               AV114FilterTFAlbREst_SelValueDescription = httpContext.getMessage( "Abierta", "") ;
            }
            else if ( AV81TFAlbREst_Sel == 1 )
            {
               AV114FilterTFAlbREst_SelValueDescription = httpContext.getMessage( "Cerrada", "") ;
            }
            AV79TFAlbREst_SelDscs += AV114FilterTFAlbREst_SelValueDescription ;
            AV121i = (long)(AV121i+1) ;
            AV197GXV3 = (int)(AV197GXV3+1) ;
         }
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFAlbREst_SelDscs, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV89TFAlbrUsu_Sel)==0) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89TFAlbrUsu_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV88TFAlbrUsu)==0) )
         {
            h84D0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88TFAlbrUsu, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV90TFAlbrHor) )
      {
         h84D0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV90TFAlbrHor, "99:99:99"), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h84D0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h84D0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 30, Gx_line+10, 66, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 70, Gx_line+10, 106, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 110, Gx_line+10, 146, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reclamacion?", ""), 150, Gx_line+10, 186, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 190, Gx_line+10, 226, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 230, Gx_line+10, 266, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "T Articulo", ""), 270, Gx_line+10, 306, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 310, Gx_line+10, 346, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Procedencia", ""), 350, Gx_line+10, 386, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unds Ent", ""), 390, Gx_line+10, 426, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Und", ""), 430, Gx_line+10, 466, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unds Uti", ""), 470, Gx_line+10, 506, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unds Disp", ""), 510, Gx_line+10, 546, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pzs Ent", ""), 550, Gx_line+10, 586, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pzs Uti", ""), 590, Gx_line+10, 626, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pzs Disp", ""), 630, Gx_line+10, 666, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 670, Gx_line+10, 706, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 710, Gx_line+10, 746, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 750, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV199Webconalbds_1_filterfulltext = AV184FilterFullText ;
      AV200Webconalbds_2_tfalbreccod = AV42TFAlbRecCod ;
      AV201Webconalbds_3_tfalbreccod_to = AV43TFAlbRecCod_To ;
      AV202Webconalbds_4_tfclinom = AV46TFCliNom ;
      AV203Webconalbds_5_tfclinom_sel = AV47TFCliNom_Sel ;
      AV204Webconalbds_6_tfalbrfen = AV48TFAlbRFen ;
      AV205Webconalbds_7_tfalbrreo_sels = AV52TFAlbRReo_Sels ;
      AV206Webconalbds_8_tfalbref = AV54TFAlbRef ;
      AV207Webconalbds_9_tfalbref_sel = AV55TFAlbRef_Sel ;
      AV208Webconalbds_10_tfalbrefdsc = AV56TFAlbRefDsc ;
      AV209Webconalbds_11_tfalbrefdsc_sel = AV57TFAlbRefDsc_Sel ;
      AV210Webconalbds_12_tfalbrtartd = AV58TFAlbRTartD ;
      AV211Webconalbds_13_tfalbrtartd_sel = AV59TFAlbRTartD_Sel ;
      AV212Webconalbds_14_tftrnnom = AV60TFTrnNom ;
      AV213Webconalbds_15_tftrnnom_sel = AV61TFTrnNom_Sel ;
      AV214Webconalbds_16_tfprocenom = AV62TFProceNom ;
      AV215Webconalbds_17_tfprocenom_sel = AV63TFProceNom_Sel ;
      AV216Webconalbds_18_tfalbrunient = AV64TFAlbRUniEnt ;
      AV217Webconalbds_19_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV218Webconalbds_20_tfalbruni_sels = AV180TFAlbRUni_Sels ;
      AV219Webconalbds_21_tfalbruniuti = AV68TFAlbRUniUti ;
      AV220Webconalbds_22_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV221Webconalbds_23_tfalbrunidis = AV70TFAlbRUniDis ;
      AV222Webconalbds_24_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
      AV223Webconalbds_25_tfalbrpieent = AV72TFAlbRPieEnt ;
      AV224Webconalbds_26_tfalbrpieent_to = AV73TFAlbRPieEnt_To ;
      AV225Webconalbds_27_tfalbrpieuti = AV74TFAlbRPieUti ;
      AV226Webconalbds_28_tfalbrpieuti_to = AV75TFAlbRPieUti_To ;
      AV227Webconalbds_29_tfalbrpiedis = AV76TFAlbRPieDis ;
      AV228Webconalbds_30_tfalbrpiedis_to = AV77TFAlbRPieDis_To ;
      AV229Webconalbds_31_tfalbrest_sels = AV80TFAlbREst_Sels ;
      AV230Webconalbds_32_tfalbrusu = AV88TFAlbrUsu ;
      AV231Webconalbds_33_tfalbrusu_sel = AV89TFAlbrUsu_Sel ;
      AV232Webconalbds_34_tfalbrhor = AV90TFAlbrHor ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV205Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV218Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV229Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV200Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV201Webconalbds_3_tfalbreccod_to) ,
                                           AV203Webconalbds_5_tfclinom_sel ,
                                           AV202Webconalbds_4_tfclinom ,
                                           AV204Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV205Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV207Webconalbds_9_tfalbref_sel ,
                                           AV206Webconalbds_8_tfalbref ,
                                           AV209Webconalbds_11_tfalbrefdsc_sel ,
                                           AV208Webconalbds_10_tfalbrefdsc ,
                                           AV211Webconalbds_13_tfalbrtartd_sel ,
                                           AV210Webconalbds_12_tfalbrtartd ,
                                           AV213Webconalbds_15_tftrnnom_sel ,
                                           AV212Webconalbds_14_tftrnnom ,
                                           AV215Webconalbds_17_tfprocenom_sel ,
                                           AV214Webconalbds_16_tfprocenom ,
                                           AV216Webconalbds_18_tfalbrunient ,
                                           AV217Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV218Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV219Webconalbds_21_tfalbruniuti ,
                                           AV220Webconalbds_22_tfalbruniuti_to ,
                                           AV221Webconalbds_23_tfalbrunidis ,
                                           AV222Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV223Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV224Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV225Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV226Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV227Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV228Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV229Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV231Webconalbds_33_tfalbrusu_sel ,
                                           AV230Webconalbds_32_tfalbrusu ,
                                           AV232Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV199Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV202Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV202Webconalbds_4_tfclinom), 30, "%") ;
      lV206Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV206Webconalbds_8_tfalbref), 16, "%") ;
      lV208Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV208Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV210Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV210Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV212Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV212Webconalbds_14_tftrnnom), 30, "%") ;
      lV214Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV214Webconalbds_16_tfprocenom), 30, "%") ;
      lV230Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV230Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084D2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV200Webconalbds_2_tfalbreccod), Integer.valueOf(AV201Webconalbds_3_tfalbreccod_to), lV202Webconalbds_4_tfclinom, AV203Webconalbds_5_tfclinom_sel, AV204Webconalbds_6_tfalbrfen, lV206Webconalbds_8_tfalbref, AV207Webconalbds_9_tfalbref_sel, lV208Webconalbds_10_tfalbrefdsc, AV209Webconalbds_11_tfalbrefdsc_sel, lV210Webconalbds_12_tfalbrtartd, AV211Webconalbds_13_tfalbrtartd_sel, lV212Webconalbds_14_tftrnnom, AV213Webconalbds_15_tftrnnom_sel, lV214Webconalbds_16_tfprocenom, AV215Webconalbds_17_tfprocenom_sel, AV216Webconalbds_18_tfalbrunient, AV217Webconalbds_19_tfalbrunient_to, AV219Webconalbds_21_tfalbruniuti, AV220Webconalbds_22_tfalbruniuti_to, AV221Webconalbds_23_tfalbrunidis, AV222Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV223Webconalbds_25_tfalbrpieent), Integer.valueOf(AV224Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV225Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV226Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV227Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV228Webconalbds_30_tfalbrpiedis_to), lV230Webconalbds_32_tfalbrusu, AV231Webconalbds_33_tfalbrusu_sel, AV232Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P084D2_A396EmprCod[0] ;
         A252CliCod = P084D2_A252CliCod[0] ;
         A6263AlbRTartC = P084D2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084D2_n6263AlbRTartC[0] ;
         A840TrnCod = P084D2_A840TrnCod[0] ;
         n840TrnCod = P084D2_n840TrnCod[0] ;
         A970ProceCod = P084D2_A970ProceCod[0] ;
         n970ProceCod = P084D2_n970ProceCod[0] ;
         A6179AlbrHor = P084D2_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084D2_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084D2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084D2_A57AlbRUniDis[0] ;
         A971ProceNom = P084D2_A971ProceNom[0] ;
         n971ProceNom = P084D2_n971ProceNom[0] ;
         A841TrnNom = P084D2_A841TrnNom[0] ;
         n841TrnNom = P084D2_n841TrnNom[0] ;
         A6264AlbRTartD = P084D2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084D2_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084D2_A3613AlbRefDsc[0] ;
         A45AlbRef = P084D2_A45AlbRef[0] ;
         A49AlbRFen = P084D2_A49AlbRFen[0] ;
         A279CliNom = P084D2_A279CliNom[0] ;
         A44AlbRecCod = P084D2_A44AlbRecCod[0] ;
         A47AlbREst = P084D2_A47AlbREst[0] ;
         A56AlbRUni = P084D2_A56AlbRUni[0] ;
         A55AlbRReo = P084D2_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084D2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084D2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084D2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084D2_A60AlbRUniUti[0] ;
         A279CliNom = P084D2_A279CliNom[0] ;
         A6264AlbRTartD = P084D2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084D2_n6264AlbRTartD[0] ;
         A841TrnNom = P084D2_A841TrnNom[0] ;
         n841TrnNom = P084D2_n841TrnNom[0] ;
         A971ProceNom = P084D2_A971ProceNom[0] ;
         n971ProceNom = P084D2_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV199Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV199Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV199Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV12AlbRReoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
            {
               AV12AlbRReoDescription = httpContext.getMessage( "NO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
            {
               AV12AlbRReoDescription = httpContext.getMessage( "SI", "") ;
            }
            AV172AlbRUniDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
            {
               AV172AlbRUniDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
            {
               AV172AlbRUniDescription = httpContext.getMessage( "M", "") ;
            }
            AV13AlbREstDescription = "" ;
            if ( A47AlbREst == 0 )
            {
               AV13AlbREstDescription = httpContext.getMessage( "Abierta", "") ;
            }
            else if ( A47AlbREst == 1 )
            {
               AV13AlbREstDescription = httpContext.getMessage( "Cerrada", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
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
            h84D0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 30, Gx_line+10, 66, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 70, Gx_line+10, 106, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 110, Gx_line+10, 146, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AlbRReoDescription, "")), 150, Gx_line+10, 186, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 190, Gx_line+10, 226, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 230, Gx_line+10, 266, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6264AlbRTartD, "")), 270, Gx_line+10, 306, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 310, Gx_line+10, 346, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 350, Gx_line+10, 386, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 390, Gx_line+10, 426, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172AlbRUniDescription, "")), 430, Gx_line+10, 466, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 470, Gx_line+10, 506, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")), 510, Gx_line+10, 546, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 550, Gx_line+10, 586, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 590, Gx_line+10, 626, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")), 630, Gx_line+10, 666, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13AlbREstDescription, "")), 670, Gx_line+10, 706, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")), 710, Gx_line+10, 746, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A6179AlbrHor, "99:99:99"), 750, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV38Session.getValue("WebCONALBGridState"), "") == 0 )
      {
         AV40GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebCONALBGridState"), null, null);
      }
      else
      {
         AV40GridState.fromxml(AV38Session.getValue("WebCONALBGridState"), null, null);
      }
      AV10OrderedBy = AV40GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV40GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV233GXV4 = 1 ;
      while ( AV233GXV4 <= AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV41GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV233GXV4));
         if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV184FilterFullText = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV42TFAlbRecCod = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFAlbRecCod_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV46TFCliNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV47TFCliNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV48TFAlbRFen = localUtil.ctod( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV50TFAlbRReo_SelsJson = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFAlbRReo_Sels.fromJSonString(AV50TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV54TFAlbRef = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV55TFAlbRef_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV56TFAlbRefDsc = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV57TFAlbRefDsc_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV58TFAlbRTartD = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV59TFAlbRTartD_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV60TFTrnNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV61TFTrnNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV62TFProceNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV63TFProceNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV64TFAlbRUniEnt = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFAlbRUniEnt_To = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV178TFAlbRUni_SelsJson = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV180TFAlbRUni_Sels.fromJSonString(AV178TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV68TFAlbRUniUti = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFAlbRUniUti_To = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV70TFAlbRUniDis = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFAlbRUniDis_To = CommonUtil.decimalVal( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV72TFAlbRPieEnt = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFAlbRPieEnt_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV74TFAlbRPieUti = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFAlbRPieUti_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV76TFAlbRPieDis = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFAlbRPieDis_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV78TFAlbREst_SelsJson = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV80TFAlbREst_Sels.fromJSonString(AV78TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU") == 0 )
         {
            AV88TFAlbrUsu = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU_SEL") == 0 )
         {
            AV89TFAlbrUsu_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV90TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         AV233GXV4 = (int)(AV233GXV4+1) ;
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

   public void h84D0( boolean bFoot ,
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
               AV128PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV124DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV131Title = AV192Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV186AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV131Title = "" ;
      AV184FilterFullText = "" ;
      AV104TFAlbRecCod_To_Description = "" ;
      AV47TFCliNom_Sel = "" ;
      AV46TFCliNom = "" ;
      AV48TFAlbRFen = GXutil.nullDate() ;
      AV52TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50TFAlbRReo_SelsJson = "" ;
      AV53TFAlbRReo_Sel = "" ;
      AV51TFAlbRReo_SelDscs = "" ;
      AV107FilterTFAlbRReo_SelValueDescription = "" ;
      AV55TFAlbRef_Sel = "" ;
      AV54TFAlbRef = "" ;
      AV57TFAlbRefDsc_Sel = "" ;
      AV56TFAlbRefDsc = "" ;
      AV59TFAlbRTartD_Sel = "" ;
      AV58TFAlbRTartD = "" ;
      AV61TFTrnNom_Sel = "" ;
      AV60TFTrnNom = "" ;
      AV63TFProceNom_Sel = "" ;
      AV62TFProceNom = "" ;
      AV64TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV65TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV108TFAlbRUniEnt_To_Description = "" ;
      AV180TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV178TFAlbRUni_SelsJson = "" ;
      AV67TFAlbRUni_Sel = "" ;
      AV179TFAlbRUni_SelDscs = "" ;
      AV181FilterTFAlbRUni_SelValueDescription = "" ;
      AV68TFAlbRUniUti = DecimalUtil.ZERO ;
      AV69TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV109TFAlbRUniUti_To_Description = "" ;
      AV70TFAlbRUniDis = DecimalUtil.ZERO ;
      AV71TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV110TFAlbRUniDis_To_Description = "" ;
      AV111TFAlbRPieEnt_To_Description = "" ;
      AV112TFAlbRPieUti_To_Description = "" ;
      AV113TFAlbRPieDis_To_Description = "" ;
      AV80TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV78TFAlbREst_SelsJson = "" ;
      AV79TFAlbREst_SelDscs = "" ;
      AV114FilterTFAlbREst_SelValueDescription = "" ;
      AV89TFAlbrUsu_Sel = "" ;
      AV88TFAlbrUsu = "" ;
      AV90TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A55AlbRReo = "" ;
      A56AlbRUni = "" ;
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A6178AlbrUsu = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV199Webconalbds_1_filterfulltext = "" ;
      AV202Webconalbds_4_tfclinom = "" ;
      AV203Webconalbds_5_tfclinom_sel = "" ;
      AV204Webconalbds_6_tfalbrfen = GXutil.nullDate() ;
      AV205Webconalbds_7_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV206Webconalbds_8_tfalbref = "" ;
      AV207Webconalbds_9_tfalbref_sel = "" ;
      AV208Webconalbds_10_tfalbrefdsc = "" ;
      AV209Webconalbds_11_tfalbrefdsc_sel = "" ;
      AV210Webconalbds_12_tfalbrtartd = "" ;
      AV211Webconalbds_13_tfalbrtartd_sel = "" ;
      AV212Webconalbds_14_tftrnnom = "" ;
      AV213Webconalbds_15_tftrnnom_sel = "" ;
      AV214Webconalbds_16_tfprocenom = "" ;
      AV215Webconalbds_17_tfprocenom_sel = "" ;
      AV216Webconalbds_18_tfalbrunient = DecimalUtil.ZERO ;
      AV217Webconalbds_19_tfalbrunient_to = DecimalUtil.ZERO ;
      AV218Webconalbds_20_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV219Webconalbds_21_tfalbruniuti = DecimalUtil.ZERO ;
      AV220Webconalbds_22_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV221Webconalbds_23_tfalbrunidis = DecimalUtil.ZERO ;
      AV222Webconalbds_24_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV229Webconalbds_31_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV230Webconalbds_32_tfalbrusu = "" ;
      AV231Webconalbds_33_tfalbrusu_sel = "" ;
      AV232Webconalbds_34_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      lV199Webconalbds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV202Webconalbds_4_tfclinom = "" ;
      lV206Webconalbds_8_tfalbref = "" ;
      lV208Webconalbds_10_tfalbrefdsc = "" ;
      lV210Webconalbds_12_tfalbrtartd = "" ;
      lV212Webconalbds_14_tftrnnom = "" ;
      lV214Webconalbds_16_tfprocenom = "" ;
      lV230Webconalbds_32_tfalbrusu = "" ;
      P084D2_A396EmprCod = new String[] {""} ;
      P084D2_A252CliCod = new int[1] ;
      P084D2_A6263AlbRTartC = new short[1] ;
      P084D2_n6263AlbRTartC = new boolean[] {false} ;
      P084D2_A840TrnCod = new short[1] ;
      P084D2_n840TrnCod = new boolean[] {false} ;
      P084D2_A970ProceCod = new short[1] ;
      P084D2_n970ProceCod = new boolean[] {false} ;
      P084D2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084D2_A6178AlbrUsu = new String[] {""} ;
      P084D2_A51AlbRPieDis = new int[1] ;
      P084D2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084D2_A971ProceNom = new String[] {""} ;
      P084D2_n971ProceNom = new boolean[] {false} ;
      P084D2_A841TrnNom = new String[] {""} ;
      P084D2_n841TrnNom = new boolean[] {false} ;
      P084D2_A6264AlbRTartD = new String[] {""} ;
      P084D2_n6264AlbRTartD = new boolean[] {false} ;
      P084D2_A3613AlbRefDsc = new String[] {""} ;
      P084D2_A45AlbRef = new String[] {""} ;
      P084D2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084D2_A279CliNom = new String[] {""} ;
      P084D2_A44AlbRecCod = new int[1] ;
      P084D2_A47AlbREst = new byte[1] ;
      P084D2_A56AlbRUni = new String[] {""} ;
      P084D2_A55AlbRReo = new String[] {""} ;
      P084D2_A52AlbRPieEnt = new int[1] ;
      P084D2_A54AlbRPieUti = new int[1] ;
      P084D2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084D2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV12AlbRReoDescription = "" ;
      AV172AlbRUniDescription = "" ;
      AV13AlbREstDescription = "" ;
      AV38Session = httpContext.getWebSession();
      AV40GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV41GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV128PageInfo = "" ;
      AV124DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV192Pgmdesc = "" ;
      AV186AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webconalbexportreport__default(),
         new Object[] {
             new Object[] {
            P084D2_A396EmprCod, P084D2_A252CliCod, P084D2_A6263AlbRTartC, P084D2_n6263AlbRTartC, P084D2_A840TrnCod, P084D2_n840TrnCod, P084D2_A970ProceCod, P084D2_n970ProceCod, P084D2_A6179AlbrHor, P084D2_A6178AlbrUsu,
            P084D2_A51AlbRPieDis, P084D2_A57AlbRUniDis, P084D2_A971ProceNom, P084D2_n971ProceNom, P084D2_A841TrnNom, P084D2_n841TrnNom, P084D2_A6264AlbRTartD, P084D2_n6264AlbRTartD, P084D2_A3613AlbRefDsc, P084D2_A45AlbRef,
            P084D2_A49AlbRFen, P084D2_A279CliNom, P084D2_A44AlbRecCod, P084D2_A47AlbREst, P084D2_A56AlbRUni, P084D2_A55AlbRReo, P084D2_A52AlbRPieEnt, P084D2_A54AlbRPieUti, P084D2_A58AlbRUniEnt, P084D2_A60AlbRUniUti
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV192Pgmdesc = httpContext.getMessage( "Web CONALBExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV192Pgmdesc = httpContext.getMessage( "Web CONALBExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV81TFAlbREst_Sel ;
   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV42TFAlbRecCod ;
   private int AV43TFAlbRecCod_To ;
   private int AV195GXV1 ;
   private int AV196GXV2 ;
   private int AV72TFAlbRPieEnt ;
   private int AV73TFAlbRPieEnt_To ;
   private int AV74TFAlbRPieUti ;
   private int AV75TFAlbRPieUti_To ;
   private int AV76TFAlbRPieDis ;
   private int AV77TFAlbRPieDis_To ;
   private int AV197GXV3 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV200Webconalbds_2_tfalbreccod ;
   private int AV201Webconalbds_3_tfalbreccod_to ;
   private int AV223Webconalbds_25_tfalbrpieent ;
   private int AV224Webconalbds_26_tfalbrpieent_to ;
   private int AV225Webconalbds_27_tfalbrpieuti ;
   private int AV226Webconalbds_28_tfalbrpieuti_to ;
   private int AV227Webconalbds_29_tfalbrpiedis ;
   private int AV228Webconalbds_30_tfalbrpiedis_to ;
   private int AV205Webconalbds_7_tfalbrreo_sels_size ;
   private int AV218Webconalbds_20_tfalbruni_sels_size ;
   private int AV229Webconalbds_31_tfalbrest_sels_size ;
   private int A252CliCod ;
   private int AV233GXV4 ;
   private long AV121i ;
   private java.math.BigDecimal AV64TFAlbRUniEnt ;
   private java.math.BigDecimal AV65TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV68TFAlbRUniUti ;
   private java.math.BigDecimal AV69TFAlbRUniUti_To ;
   private java.math.BigDecimal AV70TFAlbRUniDis ;
   private java.math.BigDecimal AV71TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV216Webconalbds_18_tfalbrunient ;
   private java.math.BigDecimal AV217Webconalbds_19_tfalbrunient_to ;
   private java.math.BigDecimal AV219Webconalbds_21_tfalbruniuti ;
   private java.math.BigDecimal AV220Webconalbds_22_tfalbruniuti_to ;
   private java.math.BigDecimal AV221Webconalbds_23_tfalbrunidis ;
   private java.math.BigDecimal AV222Webconalbds_24_tfalbrunidis_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV47TFCliNom_Sel ;
   private String AV46TFCliNom ;
   private String AV53TFAlbRReo_Sel ;
   private String AV55TFAlbRef_Sel ;
   private String AV54TFAlbRef ;
   private String AV57TFAlbRefDsc_Sel ;
   private String AV56TFAlbRefDsc ;
   private String AV59TFAlbRTartD_Sel ;
   private String AV58TFAlbRTartD ;
   private String AV61TFTrnNom_Sel ;
   private String AV60TFTrnNom ;
   private String AV63TFProceNom_Sel ;
   private String AV62TFProceNom ;
   private String AV67TFAlbRUni_Sel ;
   private String AV89TFAlbrUsu_Sel ;
   private String AV88TFAlbrUsu ;
   private String A55AlbRReo ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A6264AlbRTartD ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A6178AlbrUsu ;
   private String AV202Webconalbds_4_tfclinom ;
   private String AV203Webconalbds_5_tfclinom_sel ;
   private String AV206Webconalbds_8_tfalbref ;
   private String AV207Webconalbds_9_tfalbref_sel ;
   private String AV208Webconalbds_10_tfalbrefdsc ;
   private String AV209Webconalbds_11_tfalbrefdsc_sel ;
   private String AV210Webconalbds_12_tfalbrtartd ;
   private String AV211Webconalbds_13_tfalbrtartd_sel ;
   private String AV212Webconalbds_14_tftrnnom ;
   private String AV213Webconalbds_15_tftrnnom_sel ;
   private String AV214Webconalbds_16_tfprocenom ;
   private String AV215Webconalbds_17_tfprocenom_sel ;
   private String AV230Webconalbds_32_tfalbrusu ;
   private String AV231Webconalbds_33_tfalbrusu_sel ;
   private String scmdbuf ;
   private String lV202Webconalbds_4_tfclinom ;
   private String lV206Webconalbds_8_tfalbref ;
   private String lV208Webconalbds_10_tfalbrefdsc ;
   private String lV210Webconalbds_12_tfalbrtartd ;
   private String lV212Webconalbds_14_tftrnnom ;
   private String lV214Webconalbds_16_tfprocenom ;
   private String lV230Webconalbds_32_tfalbrusu ;
   private String A396EmprCod ;
   private String AV192Pgmdesc ;
   private java.util.Date AV90TFAlbrHor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV232Webconalbds_34_tfalbrhor ;
   private java.util.Date AV48TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV204Webconalbds_6_tfalbrfen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n6264AlbRTartD ;
   private String AV50TFAlbRReo_SelsJson ;
   private String AV178TFAlbRUni_SelsJson ;
   private String AV78TFAlbREst_SelsJson ;
   private String AV131Title ;
   private String AV184FilterFullText ;
   private String AV104TFAlbRecCod_To_Description ;
   private String AV51TFAlbRReo_SelDscs ;
   private String AV107FilterTFAlbRReo_SelValueDescription ;
   private String AV108TFAlbRUniEnt_To_Description ;
   private String AV179TFAlbRUni_SelDscs ;
   private String AV181FilterTFAlbRUni_SelValueDescription ;
   private String AV109TFAlbRUniUti_To_Description ;
   private String AV110TFAlbRUniDis_To_Description ;
   private String AV111TFAlbRPieEnt_To_Description ;
   private String AV112TFAlbRPieUti_To_Description ;
   private String AV113TFAlbRPieDis_To_Description ;
   private String AV79TFAlbREst_SelDscs ;
   private String AV114FilterTFAlbREst_SelValueDescription ;
   private String AV199Webconalbds_1_filterfulltext ;
   private String lV199Webconalbds_1_filterfulltext ;
   private String AV12AlbRReoDescription ;
   private String AV172AlbRUniDescription ;
   private String AV13AlbREstDescription ;
   private String AV128PageInfo ;
   private String AV124DateInfo ;
   private String AV186AppName ;
   private GXSimpleCollection<Byte> AV80TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV229Webconalbds_31_tfalbrest_sels ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private IDataStoreProvider pr_default ;
   private String[] P084D2_A396EmprCod ;
   private int[] P084D2_A252CliCod ;
   private short[] P084D2_A6263AlbRTartC ;
   private boolean[] P084D2_n6263AlbRTartC ;
   private short[] P084D2_A840TrnCod ;
   private boolean[] P084D2_n840TrnCod ;
   private short[] P084D2_A970ProceCod ;
   private boolean[] P084D2_n970ProceCod ;
   private java.util.Date[] P084D2_A6179AlbrHor ;
   private String[] P084D2_A6178AlbrUsu ;
   private int[] P084D2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084D2_A57AlbRUniDis ;
   private String[] P084D2_A971ProceNom ;
   private boolean[] P084D2_n971ProceNom ;
   private String[] P084D2_A841TrnNom ;
   private boolean[] P084D2_n841TrnNom ;
   private String[] P084D2_A6264AlbRTartD ;
   private boolean[] P084D2_n6264AlbRTartD ;
   private String[] P084D2_A3613AlbRefDsc ;
   private String[] P084D2_A45AlbRef ;
   private java.util.Date[] P084D2_A49AlbRFen ;
   private String[] P084D2_A279CliNom ;
   private int[] P084D2_A44AlbRecCod ;
   private byte[] P084D2_A47AlbREst ;
   private String[] P084D2_A56AlbRUni ;
   private String[] P084D2_A55AlbRReo ;
   private int[] P084D2_A52AlbRPieEnt ;
   private int[] P084D2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084D2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084D2_A60AlbRUniUti ;
   private GXSimpleCollection<String> AV52TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV180TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV205Webconalbds_7_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV218Webconalbds_20_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV40GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV41GridStateFilterValue ;
}

final  class webconalbexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV205Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV218Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV229Webconalbds_31_tfalbrest_sels ,
                                          int AV200Webconalbds_2_tfalbreccod ,
                                          int AV201Webconalbds_3_tfalbreccod_to ,
                                          String AV203Webconalbds_5_tfclinom_sel ,
                                          String AV202Webconalbds_4_tfclinom ,
                                          java.util.Date AV204Webconalbds_6_tfalbrfen ,
                                          int AV205Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV207Webconalbds_9_tfalbref_sel ,
                                          String AV206Webconalbds_8_tfalbref ,
                                          String AV209Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV208Webconalbds_10_tfalbrefdsc ,
                                          String AV211Webconalbds_13_tfalbrtartd_sel ,
                                          String AV210Webconalbds_12_tfalbrtartd ,
                                          String AV213Webconalbds_15_tftrnnom_sel ,
                                          String AV212Webconalbds_14_tftrnnom ,
                                          String AV215Webconalbds_17_tfprocenom_sel ,
                                          String AV214Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV216Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV217Webconalbds_19_tfalbrunient_to ,
                                          int AV218Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV219Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV220Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV221Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV222Webconalbds_24_tfalbrunidis_to ,
                                          int AV223Webconalbds_25_tfalbrpieent ,
                                          int AV224Webconalbds_26_tfalbrpieent_to ,
                                          int AV225Webconalbds_27_tfalbrpieuti ,
                                          int AV226Webconalbds_28_tfalbrpieuti_to ,
                                          int AV227Webconalbds_29_tfalbrpiedis ,
                                          int AV228Webconalbds_30_tfalbrpiedis_to ,
                                          int AV229Webconalbds_31_tfalbrest_sels_size ,
                                          String AV231Webconalbds_33_tfalbrusu_sel ,
                                          String AV230Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV232Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV199Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV200Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV201Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV202Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV204Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV205Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV205Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV207Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV206Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV207Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV209Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV208Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV209Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV211Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV210Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV211Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV213Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV212Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV213Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV215Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV214Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV215Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV216Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV217Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV218Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV218Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV219Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV220Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV221Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV222Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV223Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV224Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV225Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV226Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV227Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV228Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV229Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV229Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV231Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV230Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV231Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV232Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
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
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
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
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ProceNom" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ProceNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrUsu" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrUsu DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrHor" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrHor DESC" ;
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
                  return conditional_P084D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
      }
   }

}

