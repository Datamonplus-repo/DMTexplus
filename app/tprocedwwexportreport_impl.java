package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprocedwwexportreport_impl extends GXWebReport
{
   public tprocedwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV72Title = httpContext.getMessage( "Lista de PROCEDENCIAS", "") ;
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
         h84I0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV85FilterFullText)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85FilterFullText, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFProceNom_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFProceNom_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV78TFProceNom)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFProceNom, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV37TFProceCod) && (0==AV38TFProceCod_To) ) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFProceCod), "ZZZ9")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV61TFProceCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFProceCod_To_Description, "")), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFProceCod_To), "ZZZ9")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFProceDom_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Domicilio", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFProceDom_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV41TFProceDom)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Domicilio", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFProceDom, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV44TFProcePob_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Población", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFProcePob_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV43TFProcePob)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Población", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFProcePob, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV45TFPrvCod) && (0==AV46TFPrvCod_To) ) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFPrvCod), "ZZ9")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFPrvCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFPrvCod_To_Description, "")), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFPrvCod_To), "ZZ9")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFPrvDsc_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFPrvDsc_Sel, "@!")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV47TFPrvDsc)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrvDsc, "@!")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV50TFPoceCp_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Postal", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFPoceCp_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV49TFPoceCp)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Postal", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFPoceCp, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV52TFProceTel1_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFProceTel1_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFProceTel1)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFProceTel1, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV54TFProceTel2_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFProceTel2_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV53TFProceTel2)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFProceTel2, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV56TFProceTelex_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFProceTelex_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV55TFProceTelex)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFProceTelex, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV58TFProPers_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Persona Contacto", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFProPers_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV57TFProPers)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Persona Contacto", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFProPers, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV60TFProEmail_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Email", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFProEmail_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV59TFProEmail)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Email", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFProEmail, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV40TFProceNif_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFProceNif_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV39TFProceNif)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFProceNif, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV94TFPoceCp2_Sel)==0) )
      {
         h84I0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Postal (PT)", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94TFPoceCp2_Sel, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV93TFPoceCp2)==0) )
         {
            h84I0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Postal (PT)", ""), 25, Gx_line+0, 121, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TFPoceCp2, "")), 121, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h84I0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h84I0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 30, Gx_line+10, 80, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 84, Gx_line+10, 134, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Domicilio", ""), 138, Gx_line+10, 188, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Población", ""), 192, Gx_line+10, 242, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 246, Gx_line+10, 296, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Provincia", ""), 300, Gx_line+10, 350, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Postal", ""), 354, Gx_line+10, 404, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 408, Gx_line+10, 458, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Teléfono", ""), 462, Gx_line+10, 512, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Telex", ""), 516, Gx_line+10, 566, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Persona Contacto", ""), 570, Gx_line+10, 620, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Email", ""), 624, Gx_line+10, 676, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nif", ""), 680, Gx_line+10, 732, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Postal (PT)", ""), 736, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV101Tprocedwwds_1_filterfulltext = AV85FilterFullText ;
      AV102Tprocedwwds_2_tfprocenom = AV78TFProceNom ;
      AV103Tprocedwwds_3_tfprocenom_sel = AV79TFProceNom_Sel ;
      AV104Tprocedwwds_4_tfprocecod = AV37TFProceCod ;
      AV105Tprocedwwds_5_tfprocecod_to = AV38TFProceCod_To ;
      AV106Tprocedwwds_6_tfprocedom = AV41TFProceDom ;
      AV107Tprocedwwds_7_tfprocedom_sel = AV42TFProceDom_Sel ;
      AV108Tprocedwwds_8_tfprocepob = AV43TFProcePob ;
      AV109Tprocedwwds_9_tfprocepob_sel = AV44TFProcePob_Sel ;
      AV110Tprocedwwds_10_tfprvcod = AV45TFPrvCod ;
      AV111Tprocedwwds_11_tfprvcod_to = AV46TFPrvCod_To ;
      AV112Tprocedwwds_12_tfprvdsc = AV47TFPrvDsc ;
      AV113Tprocedwwds_13_tfprvdsc_sel = AV48TFPrvDsc_Sel ;
      AV114Tprocedwwds_14_tfpocecp = AV49TFPoceCp ;
      AV115Tprocedwwds_15_tfpocecp_sel = AV50TFPoceCp_Sel ;
      AV116Tprocedwwds_16_tfprocetel1 = AV51TFProceTel1 ;
      AV117Tprocedwwds_17_tfprocetel1_sel = AV52TFProceTel1_Sel ;
      AV118Tprocedwwds_18_tfprocetel2 = AV53TFProceTel2 ;
      AV119Tprocedwwds_19_tfprocetel2_sel = AV54TFProceTel2_Sel ;
      AV120Tprocedwwds_20_tfprocetelex = AV55TFProceTelex ;
      AV121Tprocedwwds_21_tfprocetelex_sel = AV56TFProceTelex_Sel ;
      AV122Tprocedwwds_22_tfpropers = AV57TFProPers ;
      AV123Tprocedwwds_23_tfpropers_sel = AV58TFProPers_Sel ;
      AV124Tprocedwwds_24_tfproemail = AV59TFProEmail ;
      AV125Tprocedwwds_25_tfproemail_sel = AV60TFProEmail_Sel ;
      AV126Tprocedwwds_26_tfprocenif = AV39TFProceNif ;
      AV127Tprocedwwds_27_tfprocenif_sel = AV40TFProceNif_Sel ;
      AV128Tprocedwwds_28_tfpocecp2 = AV93TFPoceCp2 ;
      AV129Tprocedwwds_29_tfpocecp2_sel = AV94TFPoceCp2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV101Tprocedwwds_1_filterfulltext ,
                                           AV103Tprocedwwds_3_tfprocenom_sel ,
                                           AV102Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV104Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV105Tprocedwwds_5_tfprocecod_to) ,
                                           AV107Tprocedwwds_7_tfprocedom_sel ,
                                           AV106Tprocedwwds_6_tfprocedom ,
                                           AV109Tprocedwwds_9_tfprocepob_sel ,
                                           AV108Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV110Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV111Tprocedwwds_11_tfprvcod_to) ,
                                           AV113Tprocedwwds_13_tfprvdsc_sel ,
                                           AV112Tprocedwwds_12_tfprvdsc ,
                                           AV115Tprocedwwds_15_tfpocecp_sel ,
                                           AV114Tprocedwwds_14_tfpocecp ,
                                           AV117Tprocedwwds_17_tfprocetel1_sel ,
                                           AV116Tprocedwwds_16_tfprocetel1 ,
                                           AV119Tprocedwwds_19_tfprocetel2_sel ,
                                           AV118Tprocedwwds_18_tfprocetel2 ,
                                           AV121Tprocedwwds_21_tfprocetelex_sel ,
                                           AV120Tprocedwwds_20_tfprocetelex ,
                                           AV123Tprocedwwds_23_tfpropers_sel ,
                                           AV122Tprocedwwds_22_tfpropers ,
                                           AV125Tprocedwwds_25_tfproemail_sel ,
                                           AV124Tprocedwwds_24_tfproemail ,
                                           AV127Tprocedwwds_27_tfprocenif_sel ,
                                           AV126Tprocedwwds_26_tfprocenif ,
                                           AV129Tprocedwwds_29_tfpocecp2_sel ,
                                           AV128Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV101Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Tprocedwwds_1_filterfulltext), "%", "") ;
      lV102Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV102Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV106Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV106Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV108Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV108Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV112Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV112Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV114Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV114Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV116Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV116Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV118Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV118Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV120Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV120Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV122Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV122Tprocedwwds_22_tfpropers), 40, "%") ;
      lV124Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV124Tprocedwwds_24_tfproemail), 40, "%") ;
      lV126Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV126Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV128Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV128Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084I2 */
      pr_default.execute(0, new Object[] {lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV101Tprocedwwds_1_filterfulltext, lV102Tprocedwwds_2_tfprocenom, AV103Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV104Tprocedwwds_4_tfprocecod), Short.valueOf(AV105Tprocedwwds_5_tfprocecod_to), lV106Tprocedwwds_6_tfprocedom, AV107Tprocedwwds_7_tfprocedom_sel, lV108Tprocedwwds_8_tfprocepob, AV109Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV110Tprocedwwds_10_tfprvcod), Short.valueOf(AV111Tprocedwwds_11_tfprvcod_to), lV112Tprocedwwds_12_tfprvdsc, AV113Tprocedwwds_13_tfprvdsc_sel, lV114Tprocedwwds_14_tfpocecp, AV115Tprocedwwds_15_tfpocecp_sel, lV116Tprocedwwds_16_tfprocetel1, AV117Tprocedwwds_17_tfprocetel1_sel, lV118Tprocedwwds_18_tfprocetel2, AV119Tprocedwwds_19_tfprocetel2_sel, lV120Tprocedwwds_20_tfprocetelex, AV121Tprocedwwds_21_tfprocetelex_sel, lV122Tprocedwwds_22_tfpropers, AV123Tprocedwwds_23_tfpropers_sel, lV124Tprocedwwds_24_tfproemail, AV125Tprocedwwds_25_tfproemail_sel, lV126Tprocedwwds_26_tfprocenif, AV127Tprocedwwds_27_tfprocenif_sel, lV128Tprocedwwds_28_tfpocecp2, AV129Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14029PoceCp2 = P084I2_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084I2_n14029PoceCp2[0] ;
         A993ProceNif = P084I2_A993ProceNif[0] ;
         n993ProceNif = P084I2_n993ProceNif[0] ;
         A10391ProEmail = P084I2_A10391ProEmail[0] ;
         n10391ProEmail = P084I2_n10391ProEmail[0] ;
         A10390ProPers = P084I2_A10390ProPers[0] ;
         n10390ProPers = P084I2_n10390ProPers[0] ;
         A992ProceTelex = P084I2_A992ProceTelex[0] ;
         n992ProceTelex = P084I2_n992ProceTelex[0] ;
         A991ProceTel2 = P084I2_A991ProceTel2[0] ;
         n991ProceTel2 = P084I2_n991ProceTel2[0] ;
         A990ProceTel1 = P084I2_A990ProceTel1[0] ;
         n990ProceTel1 = P084I2_n990ProceTel1[0] ;
         A989PoceCp = P084I2_A989PoceCp[0] ;
         n989PoceCp = P084I2_n989PoceCp[0] ;
         A787PrvDsc = P084I2_A787PrvDsc[0] ;
         n787PrvDsc = P084I2_n787PrvDsc[0] ;
         A781PrvCod = P084I2_A781PrvCod[0] ;
         n781PrvCod = P084I2_n781PrvCod[0] ;
         A988ProcePob = P084I2_A988ProcePob[0] ;
         n988ProcePob = P084I2_n988ProcePob[0] ;
         A994ProceDom = P084I2_A994ProceDom[0] ;
         n994ProceDom = P084I2_n994ProceDom[0] ;
         A970ProceCod = P084I2_A970ProceCod[0] ;
         A971ProceNom = P084I2_A971ProceNom[0] ;
         n971ProceNom = P084I2_n971ProceNom[0] ;
         A396EmprCod = P084I2_A396EmprCod[0] ;
         A787PrvDsc = P084I2_A787PrvDsc[0] ;
         n787PrvDsc = P084I2_n787PrvDsc[0] ;
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
         h84I0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 30, Gx_line+10, 80, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 84, Gx_line+10, 134, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A994ProceDom, "")), 138, Gx_line+10, 188, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A988ProcePob, "")), 192, Gx_line+10, 242, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9")), 246, Gx_line+10, 296, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 300, Gx_line+10, 350, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A989PoceCp, "")), 354, Gx_line+10, 404, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A990ProceTel1, "")), 408, Gx_line+10, 458, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A991ProceTel2, "")), 462, Gx_line+10, 512, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A992ProceTelex, "")), 516, Gx_line+10, 566, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10390ProPers, "")), 570, Gx_line+10, 620, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10391ProEmail, "")), 624, Gx_line+10, 676, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A993ProceNif, "")), 680, Gx_line+10, 732, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14029PoceCp2, "")), 736, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV31Session.getValue("TPROCEDWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPROCEDWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TPROCEDWWGridState"), null, null);
      }
      AV10OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV130GXV1 = 1 ;
      while ( AV130GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV130GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV85FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV78TFProceNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV79TFProceNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV37TFProceCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFProceCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV41TFProceDom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV42TFProceDom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV43TFProcePob = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV44TFProcePob_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV45TFPrvCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFPrvCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV47TFPrvDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV48TFPrvDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV49TFPoceCp = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV50TFPoceCp_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV51TFProceTel1 = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV52TFProceTel1_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV53TFProceTel2 = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV54TFProceTel2_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV55TFProceTelex = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV56TFProceTelex_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV57TFProPers = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV58TFProPers_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV59TFProEmail = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV60TFProEmail_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV39TFProceNif = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV40TFProceNif_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV93TFPoceCp2 = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV94TFPoceCp2_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV130GXV1 = (int)(AV130GXV1+1) ;
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

   public void h84I0( boolean bFoot ,
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
            AV72Title = AV97Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
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
      AV85FilterFullText = "" ;
      AV79TFProceNom_Sel = "" ;
      AV78TFProceNom = "" ;
      AV61TFProceCod_To_Description = "" ;
      AV42TFProceDom_Sel = "" ;
      AV41TFProceDom = "" ;
      AV44TFProcePob_Sel = "" ;
      AV43TFProcePob = "" ;
      AV62TFPrvCod_To_Description = "" ;
      AV48TFPrvDsc_Sel = "" ;
      AV47TFPrvDsc = "" ;
      AV50TFPoceCp_Sel = "" ;
      AV49TFPoceCp = "" ;
      AV52TFProceTel1_Sel = "" ;
      AV51TFProceTel1 = "" ;
      AV54TFProceTel2_Sel = "" ;
      AV53TFProceTel2 = "" ;
      AV56TFProceTelex_Sel = "" ;
      AV55TFProceTelex = "" ;
      AV58TFProPers_Sel = "" ;
      AV57TFProPers = "" ;
      AV60TFProEmail_Sel = "" ;
      AV59TFProEmail = "" ;
      AV40TFProceNif_Sel = "" ;
      AV39TFProceNif = "" ;
      AV94TFPoceCp2_Sel = "" ;
      AV93TFPoceCp2 = "" ;
      A971ProceNom = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      A993ProceNif = "" ;
      A14029PoceCp2 = "" ;
      AV101Tprocedwwds_1_filterfulltext = "" ;
      AV102Tprocedwwds_2_tfprocenom = "" ;
      AV103Tprocedwwds_3_tfprocenom_sel = "" ;
      AV106Tprocedwwds_6_tfprocedom = "" ;
      AV107Tprocedwwds_7_tfprocedom_sel = "" ;
      AV108Tprocedwwds_8_tfprocepob = "" ;
      AV109Tprocedwwds_9_tfprocepob_sel = "" ;
      AV112Tprocedwwds_12_tfprvdsc = "" ;
      AV113Tprocedwwds_13_tfprvdsc_sel = "" ;
      AV114Tprocedwwds_14_tfpocecp = "" ;
      AV115Tprocedwwds_15_tfpocecp_sel = "" ;
      AV116Tprocedwwds_16_tfprocetel1 = "" ;
      AV117Tprocedwwds_17_tfprocetel1_sel = "" ;
      AV118Tprocedwwds_18_tfprocetel2 = "" ;
      AV119Tprocedwwds_19_tfprocetel2_sel = "" ;
      AV120Tprocedwwds_20_tfprocetelex = "" ;
      AV121Tprocedwwds_21_tfprocetelex_sel = "" ;
      AV122Tprocedwwds_22_tfpropers = "" ;
      AV123Tprocedwwds_23_tfpropers_sel = "" ;
      AV124Tprocedwwds_24_tfproemail = "" ;
      AV125Tprocedwwds_25_tfproemail_sel = "" ;
      AV126Tprocedwwds_26_tfprocenif = "" ;
      AV127Tprocedwwds_27_tfprocenif_sel = "" ;
      AV128Tprocedwwds_28_tfpocecp2 = "" ;
      AV129Tprocedwwds_29_tfpocecp2_sel = "" ;
      scmdbuf = "" ;
      lV101Tprocedwwds_1_filterfulltext = "" ;
      lV102Tprocedwwds_2_tfprocenom = "" ;
      lV106Tprocedwwds_6_tfprocedom = "" ;
      lV108Tprocedwwds_8_tfprocepob = "" ;
      lV112Tprocedwwds_12_tfprvdsc = "" ;
      lV114Tprocedwwds_14_tfpocecp = "" ;
      lV116Tprocedwwds_16_tfprocetel1 = "" ;
      lV118Tprocedwwds_18_tfprocetel2 = "" ;
      lV120Tprocedwwds_20_tfprocetelex = "" ;
      lV122Tprocedwwds_22_tfpropers = "" ;
      lV124Tprocedwwds_24_tfproemail = "" ;
      lV126Tprocedwwds_26_tfprocenif = "" ;
      lV128Tprocedwwds_28_tfpocecp2 = "" ;
      P084I2_A14029PoceCp2 = new String[] {""} ;
      P084I2_n14029PoceCp2 = new boolean[] {false} ;
      P084I2_A993ProceNif = new String[] {""} ;
      P084I2_n993ProceNif = new boolean[] {false} ;
      P084I2_A10391ProEmail = new String[] {""} ;
      P084I2_n10391ProEmail = new boolean[] {false} ;
      P084I2_A10390ProPers = new String[] {""} ;
      P084I2_n10390ProPers = new boolean[] {false} ;
      P084I2_A992ProceTelex = new String[] {""} ;
      P084I2_n992ProceTelex = new boolean[] {false} ;
      P084I2_A991ProceTel2 = new String[] {""} ;
      P084I2_n991ProceTel2 = new boolean[] {false} ;
      P084I2_A990ProceTel1 = new String[] {""} ;
      P084I2_n990ProceTel1 = new boolean[] {false} ;
      P084I2_A989PoceCp = new String[] {""} ;
      P084I2_n989PoceCp = new boolean[] {false} ;
      P084I2_A787PrvDsc = new String[] {""} ;
      P084I2_n787PrvDsc = new boolean[] {false} ;
      P084I2_A781PrvCod = new short[1] ;
      P084I2_n781PrvCod = new boolean[] {false} ;
      P084I2_A988ProcePob = new String[] {""} ;
      P084I2_n988ProcePob = new boolean[] {false} ;
      P084I2_A994ProceDom = new String[] {""} ;
      P084I2_n994ProceDom = new boolean[] {false} ;
      P084I2_A970ProceCod = new short[1] ;
      P084I2_A971ProceNom = new String[] {""} ;
      P084I2_n971ProceNom = new boolean[] {false} ;
      P084I2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV69PageInfo = "" ;
      AV65DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV97Pgmdesc = "" ;
      AV89AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprocedwwexportreport__default(),
         new Object[] {
             new Object[] {
            P084I2_A14029PoceCp2, P084I2_n14029PoceCp2, P084I2_A993ProceNif, P084I2_n993ProceNif, P084I2_A10391ProEmail, P084I2_n10391ProEmail, P084I2_A10390ProPers, P084I2_n10390ProPers, P084I2_A992ProceTelex, P084I2_n992ProceTelex,
            P084I2_A991ProceTel2, P084I2_n991ProceTel2, P084I2_A990ProceTel1, P084I2_n990ProceTel1, P084I2_A989PoceCp, P084I2_n989PoceCp, P084I2_A787PrvDsc, P084I2_n787PrvDsc, P084I2_A781PrvCod, P084I2_n781PrvCod,
            P084I2_A988ProcePob, P084I2_n988ProcePob, P084I2_A994ProceDom, P084I2_n994ProceDom, P084I2_A970ProceCod, P084I2_A971ProceNom, P084I2_n971ProceNom, P084I2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV97Pgmdesc = httpContext.getMessage( "TPROCEDWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV97Pgmdesc = httpContext.getMessage( "TPROCEDWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV37TFProceCod ;
   private short AV38TFProceCod_To ;
   private short AV45TFPrvCod ;
   private short AV46TFPrvCod_To ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short AV104Tprocedwwds_4_tfprocecod ;
   private short AV105Tprocedwwds_5_tfprocecod_to ;
   private short AV110Tprocedwwds_10_tfprvcod ;
   private short AV111Tprocedwwds_11_tfprvcod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV130GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV79TFProceNom_Sel ;
   private String AV78TFProceNom ;
   private String AV42TFProceDom_Sel ;
   private String AV41TFProceDom ;
   private String AV44TFProcePob_Sel ;
   private String AV43TFProcePob ;
   private String AV48TFPrvDsc_Sel ;
   private String AV47TFPrvDsc ;
   private String AV50TFPoceCp_Sel ;
   private String AV49TFPoceCp ;
   private String AV52TFProceTel1_Sel ;
   private String AV51TFProceTel1 ;
   private String AV54TFProceTel2_Sel ;
   private String AV53TFProceTel2 ;
   private String AV56TFProceTelex_Sel ;
   private String AV55TFProceTelex ;
   private String AV58TFProPers_Sel ;
   private String AV57TFProPers ;
   private String AV60TFProEmail_Sel ;
   private String AV59TFProEmail ;
   private String AV40TFProceNif_Sel ;
   private String AV39TFProceNif ;
   private String AV94TFPoceCp2_Sel ;
   private String AV93TFPoceCp2 ;
   private String A971ProceNom ;
   private String A994ProceDom ;
   private String A988ProcePob ;
   private String A787PrvDsc ;
   private String A989PoceCp ;
   private String A990ProceTel1 ;
   private String A991ProceTel2 ;
   private String A992ProceTelex ;
   private String A10390ProPers ;
   private String A10391ProEmail ;
   private String A993ProceNif ;
   private String A14029PoceCp2 ;
   private String AV102Tprocedwwds_2_tfprocenom ;
   private String AV103Tprocedwwds_3_tfprocenom_sel ;
   private String AV106Tprocedwwds_6_tfprocedom ;
   private String AV107Tprocedwwds_7_tfprocedom_sel ;
   private String AV108Tprocedwwds_8_tfprocepob ;
   private String AV109Tprocedwwds_9_tfprocepob_sel ;
   private String AV112Tprocedwwds_12_tfprvdsc ;
   private String AV113Tprocedwwds_13_tfprvdsc_sel ;
   private String AV114Tprocedwwds_14_tfpocecp ;
   private String AV115Tprocedwwds_15_tfpocecp_sel ;
   private String AV116Tprocedwwds_16_tfprocetel1 ;
   private String AV117Tprocedwwds_17_tfprocetel1_sel ;
   private String AV118Tprocedwwds_18_tfprocetel2 ;
   private String AV119Tprocedwwds_19_tfprocetel2_sel ;
   private String AV120Tprocedwwds_20_tfprocetelex ;
   private String AV121Tprocedwwds_21_tfprocetelex_sel ;
   private String AV122Tprocedwwds_22_tfpropers ;
   private String AV123Tprocedwwds_23_tfpropers_sel ;
   private String AV124Tprocedwwds_24_tfproemail ;
   private String AV125Tprocedwwds_25_tfproemail_sel ;
   private String AV126Tprocedwwds_26_tfprocenif ;
   private String AV127Tprocedwwds_27_tfprocenif_sel ;
   private String AV128Tprocedwwds_28_tfpocecp2 ;
   private String AV129Tprocedwwds_29_tfpocecp2_sel ;
   private String scmdbuf ;
   private String lV102Tprocedwwds_2_tfprocenom ;
   private String lV106Tprocedwwds_6_tfprocedom ;
   private String lV108Tprocedwwds_8_tfprocepob ;
   private String lV112Tprocedwwds_12_tfprvdsc ;
   private String lV114Tprocedwwds_14_tfpocecp ;
   private String lV116Tprocedwwds_16_tfprocetel1 ;
   private String lV118Tprocedwwds_18_tfprocetel2 ;
   private String lV120Tprocedwwds_20_tfprocetelex ;
   private String lV122Tprocedwwds_22_tfpropers ;
   private String lV124Tprocedwwds_24_tfproemail ;
   private String lV126Tprocedwwds_26_tfprocenif ;
   private String lV128Tprocedwwds_28_tfpocecp2 ;
   private String A396EmprCod ;
   private String AV97Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n14029PoceCp2 ;
   private boolean n993ProceNif ;
   private boolean n10391ProEmail ;
   private boolean n10390ProPers ;
   private boolean n992ProceTelex ;
   private boolean n991ProceTel2 ;
   private boolean n990ProceTel1 ;
   private boolean n989PoceCp ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n988ProcePob ;
   private boolean n994ProceDom ;
   private boolean n971ProceNom ;
   private String AV72Title ;
   private String AV85FilterFullText ;
   private String AV61TFProceCod_To_Description ;
   private String AV62TFPrvCod_To_Description ;
   private String AV101Tprocedwwds_1_filterfulltext ;
   private String lV101Tprocedwwds_1_filterfulltext ;
   private String AV69PageInfo ;
   private String AV65DateInfo ;
   private String AV89AppName ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private IDataStoreProvider pr_default ;
   private String[] P084I2_A14029PoceCp2 ;
   private boolean[] P084I2_n14029PoceCp2 ;
   private String[] P084I2_A993ProceNif ;
   private boolean[] P084I2_n993ProceNif ;
   private String[] P084I2_A10391ProEmail ;
   private boolean[] P084I2_n10391ProEmail ;
   private String[] P084I2_A10390ProPers ;
   private boolean[] P084I2_n10390ProPers ;
   private String[] P084I2_A992ProceTelex ;
   private boolean[] P084I2_n992ProceTelex ;
   private String[] P084I2_A991ProceTel2 ;
   private boolean[] P084I2_n991ProceTel2 ;
   private String[] P084I2_A990ProceTel1 ;
   private boolean[] P084I2_n990ProceTel1 ;
   private String[] P084I2_A989PoceCp ;
   private boolean[] P084I2_n989PoceCp ;
   private String[] P084I2_A787PrvDsc ;
   private boolean[] P084I2_n787PrvDsc ;
   private short[] P084I2_A781PrvCod ;
   private boolean[] P084I2_n781PrvCod ;
   private String[] P084I2_A988ProcePob ;
   private boolean[] P084I2_n988ProcePob ;
   private String[] P084I2_A994ProceDom ;
   private boolean[] P084I2_n994ProceDom ;
   private short[] P084I2_A970ProceCod ;
   private String[] P084I2_A971ProceNom ;
   private boolean[] P084I2_n971ProceNom ;
   private String[] P084I2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tprocedwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Tprocedwwds_1_filterfulltext ,
                                          String AV103Tprocedwwds_3_tfprocenom_sel ,
                                          String AV102Tprocedwwds_2_tfprocenom ,
                                          short AV104Tprocedwwds_4_tfprocecod ,
                                          short AV105Tprocedwwds_5_tfprocecod_to ,
                                          String AV107Tprocedwwds_7_tfprocedom_sel ,
                                          String AV106Tprocedwwds_6_tfprocedom ,
                                          String AV109Tprocedwwds_9_tfprocepob_sel ,
                                          String AV108Tprocedwwds_8_tfprocepob ,
                                          short AV110Tprocedwwds_10_tfprvcod ,
                                          short AV111Tprocedwwds_11_tfprvcod_to ,
                                          String AV113Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV112Tprocedwwds_12_tfprvdsc ,
                                          String AV115Tprocedwwds_15_tfpocecp_sel ,
                                          String AV114Tprocedwwds_14_tfpocecp ,
                                          String AV117Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV116Tprocedwwds_16_tfprocetel1 ,
                                          String AV119Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV118Tprocedwwds_18_tfprocetel2 ,
                                          String AV121Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV120Tprocedwwds_20_tfprocetelex ,
                                          String AV123Tprocedwwds_23_tfpropers_sel ,
                                          String AV122Tprocedwwds_22_tfpropers ,
                                          String AV125Tprocedwwds_25_tfproemail_sel ,
                                          String AV124Tprocedwwds_24_tfproemail ,
                                          String AV127Tprocedwwds_27_tfprocenif_sel ,
                                          String AV126Tprocedwwds_26_tfprocenif ,
                                          String AV129Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV128Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[42];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV101Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV103Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV104Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV105Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV108Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV110Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV111Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV114Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV116Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV118Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV122Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV124Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV126Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV128Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceDom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceDom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProcePob" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProcePob DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PoceCp" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PoceCp DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceTel1" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceTel1 DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceTel2" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceTel2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceTelex" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceTelex DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProPers" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProPers DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProEmail" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProEmail DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceNif" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceNif DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PoceCp2" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PoceCp2 DESC" ;
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
                  return conditional_P084I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
      }
   }

}

