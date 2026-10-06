package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tempreswwexportreport_impl extends GXWebReport
{
   public tempreswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV99Title = httpContext.getMessage( "Lista de EMPRESAS", "") ;
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
         h8OY0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV106FilterFullText)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106FilterFullText, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFEmprCod_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Empresa", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFEmprCod_Sel, "@!")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFEmprCod)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Empresa", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFEmprCod, "@!")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV38TFEmprNom_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFEmprNom_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV37TFEmprNom)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFEmprNom, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV40TFEmprDir_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dirección", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFEmprDir_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV39TFEmprDir)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dirección", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFEmprDir, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV42TFEmprCpo_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Postal", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFEmprCpo_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV41TFEmprCpo)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Postal", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFEmprCpo, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV44TFEmprPob_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Población", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFEmprPob_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV43TFEmprPob)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Población", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFEmprPob, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV46TFEmprCif_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "CIF", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFEmprCif_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV45TFEmprCif)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CIF", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFEmprCif, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV48TFEmprTel_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFEmprTel_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV47TFEmprTel)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFEmprTel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV50TFEmprFax_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFEmprFax_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV49TFEmprFax)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFEmprFax, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV52TFIvaCod_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo IVA", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFIvaCod_Sel, "@!")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFIvaCod)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo IVA", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFIvaCod, "@!")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV54TFIvaDsc_Sel)==0) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion IVA", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFIvaDsc_Sel, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV53TFIvaDsc)==0) )
         {
            h8OY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion IVA", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFIvaDsc, "")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV55TFIvaPor) && (0==AV56TFIvaPor_To) ) )
      {
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "IVA General", ""), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFIvaPor), "Z9")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV85TFIvaPor_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "IVA General", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8OY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFIvaPor_To_Description, "")), 25, Gx_line+0, 130, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFIvaPor_To), "Z9")), 130, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8OY0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8OY0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Empresa", ""), 30, Gx_line+10, 95, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 99, Gx_line+10, 164, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dirección", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Postal", ""), 237, Gx_line+10, 302, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Población", ""), 306, Gx_line+10, 371, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "CIF", ""), 375, Gx_line+10, 440, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 444, Gx_line+10, 509, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 513, Gx_line+10, 578, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo IVA", ""), 582, Gx_line+10, 647, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion IVA", ""), 651, Gx_line+10, 717, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "IVA General", ""), 721, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV118Tempreswwds_1_filterfulltext = AV106FilterFullText ;
      AV119Tempreswwds_2_tfemprcod = AV35TFEmprCod ;
      AV120Tempreswwds_3_tfemprcod_sel = AV36TFEmprCod_Sel ;
      AV121Tempreswwds_4_tfemprnom = AV37TFEmprNom ;
      AV122Tempreswwds_5_tfemprnom_sel = AV38TFEmprNom_Sel ;
      AV123Tempreswwds_6_tfemprdir = AV39TFEmprDir ;
      AV124Tempreswwds_7_tfemprdir_sel = AV40TFEmprDir_Sel ;
      AV125Tempreswwds_8_tfemprcpo = AV41TFEmprCpo ;
      AV126Tempreswwds_9_tfemprcpo_sel = AV42TFEmprCpo_Sel ;
      AV127Tempreswwds_10_tfemprpob = AV43TFEmprPob ;
      AV128Tempreswwds_11_tfemprpob_sel = AV44TFEmprPob_Sel ;
      AV129Tempreswwds_12_tfemprcif = AV45TFEmprCif ;
      AV130Tempreswwds_13_tfemprcif_sel = AV46TFEmprCif_Sel ;
      AV131Tempreswwds_14_tfemprtel = AV47TFEmprTel ;
      AV132Tempreswwds_15_tfemprtel_sel = AV48TFEmprTel_Sel ;
      AV133Tempreswwds_16_tfemprfax = AV49TFEmprFax ;
      AV134Tempreswwds_17_tfemprfax_sel = AV50TFEmprFax_Sel ;
      AV135Tempreswwds_18_tfivacod = AV51TFIvaCod ;
      AV136Tempreswwds_19_tfivacod_sel = AV52TFIvaCod_Sel ;
      AV137Tempreswwds_20_tfivadsc = AV53TFIvaDsc ;
      AV138Tempreswwds_21_tfivadsc_sel = AV54TFIvaDsc_Sel ;
      AV139Tempreswwds_22_tfivapor = AV55TFIvaPor ;
      AV140Tempreswwds_23_tfivapor_to = AV56TFIvaPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV118Tempreswwds_1_filterfulltext ,
                                           AV120Tempreswwds_3_tfemprcod_sel ,
                                           AV119Tempreswwds_2_tfemprcod ,
                                           AV122Tempreswwds_5_tfemprnom_sel ,
                                           AV121Tempreswwds_4_tfemprnom ,
                                           AV124Tempreswwds_7_tfemprdir_sel ,
                                           AV123Tempreswwds_6_tfemprdir ,
                                           AV126Tempreswwds_9_tfemprcpo_sel ,
                                           AV125Tempreswwds_8_tfemprcpo ,
                                           AV128Tempreswwds_11_tfemprpob_sel ,
                                           AV127Tempreswwds_10_tfemprpob ,
                                           AV130Tempreswwds_13_tfemprcif_sel ,
                                           AV129Tempreswwds_12_tfemprcif ,
                                           AV132Tempreswwds_15_tfemprtel_sel ,
                                           AV131Tempreswwds_14_tfemprtel ,
                                           AV134Tempreswwds_17_tfemprfax_sel ,
                                           AV133Tempreswwds_16_tfemprfax ,
                                           AV136Tempreswwds_19_tfivacod_sel ,
                                           AV135Tempreswwds_18_tfivacod ,
                                           AV138Tempreswwds_21_tfivadsc_sel ,
                                           AV137Tempreswwds_20_tfivadsc ,
                                           Byte.valueOf(AV139Tempreswwds_22_tfivapor) ,
                                           Byte.valueOf(AV140Tempreswwds_23_tfivapor_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           A404EmprDir ,
                                           A403EmprCpo ,
                                           A408EmprPob ,
                                           A395EmprCif ,
                                           A409EmprTel ,
                                           A405EmprFax ,
                                           A953IvaCod ,
                                           A954IvaDsc ,
                                           Byte.valueOf(A588IvaPor) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV118Tempreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV118Tempreswwds_1_filterfulltext), "%", "") ;
      lV119Tempreswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV119Tempreswwds_2_tfemprcod), 3, "%") ;
      lV121Tempreswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV121Tempreswwds_4_tfemprnom), 30, "%") ;
      lV123Tempreswwds_6_tfemprdir = GXutil.padr( GXutil.rtrim( AV123Tempreswwds_6_tfemprdir), 35, "%") ;
      lV125Tempreswwds_8_tfemprcpo = GXutil.padr( GXutil.rtrim( AV125Tempreswwds_8_tfemprcpo), 7, "%") ;
      lV127Tempreswwds_10_tfemprpob = GXutil.padr( GXutil.rtrim( AV127Tempreswwds_10_tfemprpob), 35, "%") ;
      lV129Tempreswwds_12_tfemprcif = GXutil.padr( GXutil.rtrim( AV129Tempreswwds_12_tfemprcif), 15, "%") ;
      lV131Tempreswwds_14_tfemprtel = GXutil.padr( GXutil.rtrim( AV131Tempreswwds_14_tfemprtel), 15, "%") ;
      lV133Tempreswwds_16_tfemprfax = GXutil.padr( GXutil.rtrim( AV133Tempreswwds_16_tfemprfax), 15, "%") ;
      lV135Tempreswwds_18_tfivacod = GXutil.padr( GXutil.rtrim( AV135Tempreswwds_18_tfivacod), 3, "%") ;
      lV137Tempreswwds_20_tfivadsc = GXutil.padr( GXutil.rtrim( AV137Tempreswwds_20_tfivadsc), 25, "%") ;
      /* Using cursor P08OY2 */
      pr_default.execute(0, new Object[] {lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV118Tempreswwds_1_filterfulltext, lV119Tempreswwds_2_tfemprcod, AV120Tempreswwds_3_tfemprcod_sel, lV121Tempreswwds_4_tfemprnom, AV122Tempreswwds_5_tfemprnom_sel, lV123Tempreswwds_6_tfemprdir, AV124Tempreswwds_7_tfemprdir_sel, lV125Tempreswwds_8_tfemprcpo, AV126Tempreswwds_9_tfemprcpo_sel, lV127Tempreswwds_10_tfemprpob, AV128Tempreswwds_11_tfemprpob_sel, lV129Tempreswwds_12_tfemprcif, AV130Tempreswwds_13_tfemprcif_sel, lV131Tempreswwds_14_tfemprtel, AV132Tempreswwds_15_tfemprtel_sel, lV133Tempreswwds_16_tfemprfax, AV134Tempreswwds_17_tfemprfax_sel, lV135Tempreswwds_18_tfivacod, AV136Tempreswwds_19_tfivacod_sel, lV137Tempreswwds_20_tfivadsc, AV138Tempreswwds_21_tfivadsc_sel, Byte.valueOf(AV139Tempreswwds_22_tfivapor), Byte.valueOf(AV140Tempreswwds_23_tfivapor_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A588IvaPor = P08OY2_A588IvaPor[0] ;
         n588IvaPor = P08OY2_n588IvaPor[0] ;
         A954IvaDsc = P08OY2_A954IvaDsc[0] ;
         n954IvaDsc = P08OY2_n954IvaDsc[0] ;
         A953IvaCod = P08OY2_A953IvaCod[0] ;
         n953IvaCod = P08OY2_n953IvaCod[0] ;
         A405EmprFax = P08OY2_A405EmprFax[0] ;
         n405EmprFax = P08OY2_n405EmprFax[0] ;
         A409EmprTel = P08OY2_A409EmprTel[0] ;
         n409EmprTel = P08OY2_n409EmprTel[0] ;
         A395EmprCif = P08OY2_A395EmprCif[0] ;
         n395EmprCif = P08OY2_n395EmprCif[0] ;
         A408EmprPob = P08OY2_A408EmprPob[0] ;
         n408EmprPob = P08OY2_n408EmprPob[0] ;
         A403EmprCpo = P08OY2_A403EmprCpo[0] ;
         n403EmprCpo = P08OY2_n403EmprCpo[0] ;
         A404EmprDir = P08OY2_A404EmprDir[0] ;
         n404EmprDir = P08OY2_n404EmprDir[0] ;
         A407EmprNom = P08OY2_A407EmprNom[0] ;
         n407EmprNom = P08OY2_n407EmprNom[0] ;
         A396EmprCod = P08OY2_A396EmprCod[0] ;
         A588IvaPor = P08OY2_A588IvaPor[0] ;
         n588IvaPor = P08OY2_n588IvaPor[0] ;
         A954IvaDsc = P08OY2_A954IvaDsc[0] ;
         n954IvaDsc = P08OY2_n954IvaDsc[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8OY0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 95, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 99, Gx_line+10, 164, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A404EmprDir, "")), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A403EmprCpo, "")), 237, Gx_line+10, 302, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A408EmprPob, "")), 306, Gx_line+10, 371, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A395EmprCif, "")), 375, Gx_line+10, 440, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A409EmprTel, "")), 444, Gx_line+10, 509, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A405EmprFax, "")), 513, Gx_line+10, 578, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A953IvaCod, "@!")), 582, Gx_line+10, 647, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A954IvaDsc, "")), 651, Gx_line+10, 717, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A588IvaPor), "Z9")), 721, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV31Session.getValue("TEMPRESWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEMPRESWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TEMPRESWWGridState"), null, null);
      }
      AV10OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV141GXV1 = 1 ;
      while ( AV141GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV141GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV106FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV35TFEmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV36TFEmprCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV37TFEmprNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV38TFEmprNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR") == 0 )
         {
            AV39TFEmprDir = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRDIR_SEL") == 0 )
         {
            AV40TFEmprDir_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO") == 0 )
         {
            AV41TFEmprCpo = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCPO_SEL") == 0 )
         {
            AV42TFEmprCpo_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB") == 0 )
         {
            AV43TFEmprPob = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRPOB_SEL") == 0 )
         {
            AV44TFEmprPob_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF") == 0 )
         {
            AV45TFEmprCif = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCIF_SEL") == 0 )
         {
            AV46TFEmprCif_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL") == 0 )
         {
            AV47TFEmprTel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTEL_SEL") == 0 )
         {
            AV48TFEmprTel_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX") == 0 )
         {
            AV49TFEmprFax = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRFAX_SEL") == 0 )
         {
            AV50TFEmprFax_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD") == 0 )
         {
            AV51TFIvaCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVACOD_SEL") == 0 )
         {
            AV52TFIvaCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC") == 0 )
         {
            AV53TFIvaDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVADSC_SEL") == 0 )
         {
            AV54TFIvaDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIVAPOR") == 0 )
         {
            AV55TFIvaPor = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFIvaPor_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV141GXV1 = (int)(AV141GXV1+1) ;
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

   public void h8OY0( boolean bFoot ,
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
               AV96PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV92DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV99Title = AV114Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV99Title = "" ;
      AV106FilterFullText = "" ;
      AV36TFEmprCod_Sel = "" ;
      AV35TFEmprCod = "" ;
      AV38TFEmprNom_Sel = "" ;
      AV37TFEmprNom = "" ;
      AV40TFEmprDir_Sel = "" ;
      AV39TFEmprDir = "" ;
      AV42TFEmprCpo_Sel = "" ;
      AV41TFEmprCpo = "" ;
      AV44TFEmprPob_Sel = "" ;
      AV43TFEmprPob = "" ;
      AV46TFEmprCif_Sel = "" ;
      AV45TFEmprCif = "" ;
      AV48TFEmprTel_Sel = "" ;
      AV47TFEmprTel = "" ;
      AV50TFEmprFax_Sel = "" ;
      AV49TFEmprFax = "" ;
      AV52TFIvaCod_Sel = "" ;
      AV51TFIvaCod = "" ;
      AV54TFIvaDsc_Sel = "" ;
      AV53TFIvaDsc = "" ;
      AV85TFIvaPor_To_Description = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A408EmprPob = "" ;
      A395EmprCif = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A953IvaCod = "" ;
      A954IvaDsc = "" ;
      AV118Tempreswwds_1_filterfulltext = "" ;
      AV119Tempreswwds_2_tfemprcod = "" ;
      AV120Tempreswwds_3_tfemprcod_sel = "" ;
      AV121Tempreswwds_4_tfemprnom = "" ;
      AV122Tempreswwds_5_tfemprnom_sel = "" ;
      AV123Tempreswwds_6_tfemprdir = "" ;
      AV124Tempreswwds_7_tfemprdir_sel = "" ;
      AV125Tempreswwds_8_tfemprcpo = "" ;
      AV126Tempreswwds_9_tfemprcpo_sel = "" ;
      AV127Tempreswwds_10_tfemprpob = "" ;
      AV128Tempreswwds_11_tfemprpob_sel = "" ;
      AV129Tempreswwds_12_tfemprcif = "" ;
      AV130Tempreswwds_13_tfemprcif_sel = "" ;
      AV131Tempreswwds_14_tfemprtel = "" ;
      AV132Tempreswwds_15_tfemprtel_sel = "" ;
      AV133Tempreswwds_16_tfemprfax = "" ;
      AV134Tempreswwds_17_tfemprfax_sel = "" ;
      AV135Tempreswwds_18_tfivacod = "" ;
      AV136Tempreswwds_19_tfivacod_sel = "" ;
      AV137Tempreswwds_20_tfivadsc = "" ;
      AV138Tempreswwds_21_tfivadsc_sel = "" ;
      scmdbuf = "" ;
      lV118Tempreswwds_1_filterfulltext = "" ;
      lV119Tempreswwds_2_tfemprcod = "" ;
      lV121Tempreswwds_4_tfemprnom = "" ;
      lV123Tempreswwds_6_tfemprdir = "" ;
      lV125Tempreswwds_8_tfemprcpo = "" ;
      lV127Tempreswwds_10_tfemprpob = "" ;
      lV129Tempreswwds_12_tfemprcif = "" ;
      lV131Tempreswwds_14_tfemprtel = "" ;
      lV133Tempreswwds_16_tfemprfax = "" ;
      lV135Tempreswwds_18_tfivacod = "" ;
      lV137Tempreswwds_20_tfivadsc = "" ;
      P08OY2_A588IvaPor = new byte[1] ;
      P08OY2_n588IvaPor = new boolean[] {false} ;
      P08OY2_A954IvaDsc = new String[] {""} ;
      P08OY2_n954IvaDsc = new boolean[] {false} ;
      P08OY2_A953IvaCod = new String[] {""} ;
      P08OY2_n953IvaCod = new boolean[] {false} ;
      P08OY2_A405EmprFax = new String[] {""} ;
      P08OY2_n405EmprFax = new boolean[] {false} ;
      P08OY2_A409EmprTel = new String[] {""} ;
      P08OY2_n409EmprTel = new boolean[] {false} ;
      P08OY2_A395EmprCif = new String[] {""} ;
      P08OY2_n395EmprCif = new boolean[] {false} ;
      P08OY2_A408EmprPob = new String[] {""} ;
      P08OY2_n408EmprPob = new boolean[] {false} ;
      P08OY2_A403EmprCpo = new String[] {""} ;
      P08OY2_n403EmprCpo = new boolean[] {false} ;
      P08OY2_A404EmprDir = new String[] {""} ;
      P08OY2_n404EmprDir = new boolean[] {false} ;
      P08OY2_A407EmprNom = new String[] {""} ;
      P08OY2_n407EmprNom = new boolean[] {false} ;
      P08OY2_A396EmprCod = new String[] {""} ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV96PageInfo = "" ;
      AV92DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV114Pgmdesc = "" ;
      AV108AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempreswwexportreport__default(),
         new Object[] {
             new Object[] {
            P08OY2_A588IvaPor, P08OY2_n588IvaPor, P08OY2_A954IvaDsc, P08OY2_n954IvaDsc, P08OY2_A953IvaCod, P08OY2_n953IvaCod, P08OY2_A405EmprFax, P08OY2_n405EmprFax, P08OY2_A409EmprTel, P08OY2_n409EmprTel,
            P08OY2_A395EmprCif, P08OY2_n395EmprCif, P08OY2_A408EmprPob, P08OY2_n408EmprPob, P08OY2_A403EmprCpo, P08OY2_n403EmprCpo, P08OY2_A404EmprDir, P08OY2_n404EmprDir, P08OY2_A407EmprNom, P08OY2_n407EmprNom,
            P08OY2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV114Pgmdesc = httpContext.getMessage( "TEMPRESWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV114Pgmdesc = httpContext.getMessage( "TEMPRESWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV55TFIvaPor ;
   private byte AV56TFIvaPor_To ;
   private byte A588IvaPor ;
   private byte AV139Tempreswwds_22_tfivapor ;
   private byte AV140Tempreswwds_23_tfivapor_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV141GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV36TFEmprCod_Sel ;
   private String AV35TFEmprCod ;
   private String AV38TFEmprNom_Sel ;
   private String AV37TFEmprNom ;
   private String AV40TFEmprDir_Sel ;
   private String AV39TFEmprDir ;
   private String AV42TFEmprCpo_Sel ;
   private String AV41TFEmprCpo ;
   private String AV44TFEmprPob_Sel ;
   private String AV43TFEmprPob ;
   private String AV46TFEmprCif_Sel ;
   private String AV45TFEmprCif ;
   private String AV48TFEmprTel_Sel ;
   private String AV47TFEmprTel ;
   private String AV50TFEmprFax_Sel ;
   private String AV49TFEmprFax ;
   private String AV52TFIvaCod_Sel ;
   private String AV51TFIvaCod ;
   private String AV54TFIvaDsc_Sel ;
   private String AV53TFIvaDsc ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A403EmprCpo ;
   private String A408EmprPob ;
   private String A395EmprCif ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A953IvaCod ;
   private String A954IvaDsc ;
   private String AV119Tempreswwds_2_tfemprcod ;
   private String AV120Tempreswwds_3_tfemprcod_sel ;
   private String AV121Tempreswwds_4_tfemprnom ;
   private String AV122Tempreswwds_5_tfemprnom_sel ;
   private String AV123Tempreswwds_6_tfemprdir ;
   private String AV124Tempreswwds_7_tfemprdir_sel ;
   private String AV125Tempreswwds_8_tfemprcpo ;
   private String AV126Tempreswwds_9_tfemprcpo_sel ;
   private String AV127Tempreswwds_10_tfemprpob ;
   private String AV128Tempreswwds_11_tfemprpob_sel ;
   private String AV129Tempreswwds_12_tfemprcif ;
   private String AV130Tempreswwds_13_tfemprcif_sel ;
   private String AV131Tempreswwds_14_tfemprtel ;
   private String AV132Tempreswwds_15_tfemprtel_sel ;
   private String AV133Tempreswwds_16_tfemprfax ;
   private String AV134Tempreswwds_17_tfemprfax_sel ;
   private String AV135Tempreswwds_18_tfivacod ;
   private String AV136Tempreswwds_19_tfivacod_sel ;
   private String AV137Tempreswwds_20_tfivadsc ;
   private String AV138Tempreswwds_21_tfivadsc_sel ;
   private String scmdbuf ;
   private String lV119Tempreswwds_2_tfemprcod ;
   private String lV121Tempreswwds_4_tfemprnom ;
   private String lV123Tempreswwds_6_tfemprdir ;
   private String lV125Tempreswwds_8_tfemprcpo ;
   private String lV127Tempreswwds_10_tfemprpob ;
   private String lV129Tempreswwds_12_tfemprcif ;
   private String lV131Tempreswwds_14_tfemprtel ;
   private String lV133Tempreswwds_16_tfemprfax ;
   private String lV135Tempreswwds_18_tfivacod ;
   private String lV137Tempreswwds_20_tfivadsc ;
   private String AV114Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n588IvaPor ;
   private boolean n954IvaDsc ;
   private boolean n953IvaCod ;
   private boolean n405EmprFax ;
   private boolean n409EmprTel ;
   private boolean n395EmprCif ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private String AV99Title ;
   private String AV106FilterFullText ;
   private String AV85TFIvaPor_To_Description ;
   private String AV118Tempreswwds_1_filterfulltext ;
   private String lV118Tempreswwds_1_filterfulltext ;
   private String AV96PageInfo ;
   private String AV92DateInfo ;
   private String AV108AppName ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P08OY2_A588IvaPor ;
   private boolean[] P08OY2_n588IvaPor ;
   private String[] P08OY2_A954IvaDsc ;
   private boolean[] P08OY2_n954IvaDsc ;
   private String[] P08OY2_A953IvaCod ;
   private boolean[] P08OY2_n953IvaCod ;
   private String[] P08OY2_A405EmprFax ;
   private boolean[] P08OY2_n405EmprFax ;
   private String[] P08OY2_A409EmprTel ;
   private boolean[] P08OY2_n409EmprTel ;
   private String[] P08OY2_A395EmprCif ;
   private boolean[] P08OY2_n395EmprCif ;
   private String[] P08OY2_A408EmprPob ;
   private boolean[] P08OY2_n408EmprPob ;
   private String[] P08OY2_A403EmprCpo ;
   private boolean[] P08OY2_n403EmprCpo ;
   private String[] P08OY2_A404EmprDir ;
   private boolean[] P08OY2_n404EmprDir ;
   private String[] P08OY2_A407EmprNom ;
   private boolean[] P08OY2_n407EmprNom ;
   private String[] P08OY2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tempreswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV118Tempreswwds_1_filterfulltext ,
                                          String AV120Tempreswwds_3_tfemprcod_sel ,
                                          String AV119Tempreswwds_2_tfemprcod ,
                                          String AV122Tempreswwds_5_tfemprnom_sel ,
                                          String AV121Tempreswwds_4_tfemprnom ,
                                          String AV124Tempreswwds_7_tfemprdir_sel ,
                                          String AV123Tempreswwds_6_tfemprdir ,
                                          String AV126Tempreswwds_9_tfemprcpo_sel ,
                                          String AV125Tempreswwds_8_tfemprcpo ,
                                          String AV128Tempreswwds_11_tfemprpob_sel ,
                                          String AV127Tempreswwds_10_tfemprpob ,
                                          String AV130Tempreswwds_13_tfemprcif_sel ,
                                          String AV129Tempreswwds_12_tfemprcif ,
                                          String AV132Tempreswwds_15_tfemprtel_sel ,
                                          String AV131Tempreswwds_14_tfemprtel ,
                                          String AV134Tempreswwds_17_tfemprfax_sel ,
                                          String AV133Tempreswwds_16_tfemprfax ,
                                          String AV136Tempreswwds_19_tfivacod_sel ,
                                          String AV135Tempreswwds_18_tfivacod ,
                                          String AV138Tempreswwds_21_tfivadsc_sel ,
                                          String AV137Tempreswwds_20_tfivadsc ,
                                          byte AV139Tempreswwds_22_tfivapor ,
                                          byte AV140Tempreswwds_23_tfivapor_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          String A404EmprDir ,
                                          String A403EmprCpo ,
                                          String A408EmprPob ,
                                          String A395EmprCif ,
                                          String A409EmprTel ,
                                          String A405EmprFax ,
                                          String A953IvaCod ,
                                          String A954IvaDsc ,
                                          byte A588IvaPor ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T2.IvaPor, T2.IvaDsc, T1.IvaCod, T1.EmprFax, T1.EmprTel, T1.EmprCif, T1.EmprPob, T1.EmprCpo, T1.EmprDir, T1.EmprNom, T1.EmprCod FROM (TXPEMPRES T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod)" ;
      if ( ! (GXutil.strcmp("", AV118Tempreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.EmprNom) like '%' || UPPER(?)) or ( UPPER(T1.EmprDir) like '%' || UPPER(?)) or ( UPPER(T1.EmprCpo) like '%' || UPPER(?)) or ( UPPER(T1.EmprPob) like '%' || UPPER(?)) or ( UPPER(T1.EmprCif) like '%' || UPPER(?)) or ( UPPER(T1.EmprTel) like '%' || UPPER(?)) or ( UPPER(T1.EmprFax) like '%' || UPPER(?)) or ( UPPER(T1.IvaCod) like '%' || UPPER(?)) or ( UPPER(T2.IvaDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.IvaPor,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV120Tempreswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Tempreswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Tempreswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Tempreswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Tempreswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Tempreswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tempreswwds_7_tfemprdir_sel)==0) && ( ! (GXutil.strcmp("", AV123Tempreswwds_6_tfemprdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tempreswwds_7_tfemprdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprDir = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Tempreswwds_9_tfemprcpo_sel)==0) && ( ! (GXutil.strcmp("", AV125Tempreswwds_8_tfemprcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Tempreswwds_9_tfemprcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCpo = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Tempreswwds_11_tfemprpob_sel)==0) && ( ! (GXutil.strcmp("", AV127Tempreswwds_10_tfemprpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Tempreswwds_11_tfemprpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprPob = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tempreswwds_13_tfemprcif_sel)==0) && ( ! (GXutil.strcmp("", AV129Tempreswwds_12_tfemprcif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tempreswwds_13_tfemprcif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCif = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Tempreswwds_15_tfemprtel_sel)==0) && ( ! (GXutil.strcmp("", AV131Tempreswwds_14_tfemprtel)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTel) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Tempreswwds_15_tfemprtel_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTel = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Tempreswwds_17_tfemprfax_sel)==0) && ( ! (GXutil.strcmp("", AV133Tempreswwds_16_tfemprfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tempreswwds_17_tfemprfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprFax = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tempreswwds_19_tfivacod_sel)==0) && ( ! (GXutil.strcmp("", AV135Tempreswwds_18_tfivacod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.IvaCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tempreswwds_19_tfivacod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.IvaCod = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tempreswwds_21_tfivadsc_sel)==0) && ( ! (GXutil.strcmp("", AV137Tempreswwds_20_tfivadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IvaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tempreswwds_21_tfivadsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IvaDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV139Tempreswwds_22_tfivapor) )
      {
         addWhere(sWhereString, "(T2.IvaPor >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV140Tempreswwds_23_tfivapor_to) )
      {
         addWhere(sWhereString, "(T2.IvaPor <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprDir" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprDir DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCpo" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprPob" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprPob DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCif" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCif DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprTel" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprTel DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprFax" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprFax DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IvaCod" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IvaCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IvaDsc" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IvaDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IvaPor" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IvaPor DESC" ;
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
                  return conditional_P08OY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 7);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 35);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
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
                  stmt.setString(sIdx, (String)parms[48], 35);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 35);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 7);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 7);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 35);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 35);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 15);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 15);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 15);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 15);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 15);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 15);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 25);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 25);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

