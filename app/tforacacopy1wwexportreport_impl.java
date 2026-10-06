package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tforacacopy1wwexportreport_impl extends GXWebReport
{
   public tforacacopy1wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV64Title = httpContext.getMessage( "Lista de Tratamientos Quimicos", "") ;
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
         h8GH0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV70FilterFullText)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70FilterFullText, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV30TFCliCod) && (0==AV31TFCliCod_To) ) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFCliCod), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV52TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFCliCod_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFCliCod_To), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliNom_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFCliNom_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFCliNom)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFCliNom, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFArtCod_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód. Art.", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFArtCod_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFArtCod)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód. Art.", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFArtCod, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFArtDsc_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFArtDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFArtDsc)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFArtDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV39TFProCod_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód. Proc.", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFProCod_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFProCod)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód. Proc.", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFProCod, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV41TFProDsc_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFProDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFProDsc)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFProDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFFasCod_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFFasCod_Sel, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFFasCod)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFFasCod, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV45TFFasDsc_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFFasDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFFasDsc)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFFasDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV47TFFasForMul_Sel)==0) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Formula?", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFFasForMul_Sel, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFFasForMul)==0) )
         {
            h8GH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Formula?", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFFasForMul, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV48TFArtProULin) && (0==AV49TFArtProULin_To) ) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ultima Línea", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFArtProULin), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV53TFArtProULin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultima Línea", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFArtProULin_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFArtProULin_To), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFArtProFac)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFArtProFac_To)==0) ) )
      {
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50TFArtProFac, "ZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV54TFArtProFac_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Factor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8GH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFArtProFac_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51TFArtProFac_To, "ZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8GH0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8GH0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 95, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 99, Gx_line+10, 164, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód. Art.", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 237, Gx_line+10, 302, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód. Proc.", ""), 306, Gx_line+10, 371, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 375, Gx_line+10, 440, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 444, Gx_line+10, 509, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 513, Gx_line+10, 578, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Formula?", ""), 582, Gx_line+10, 647, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ultima Línea", ""), 651, Gx_line+10, 717, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 721, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV82Tforacacopy1wwds_1_filterfulltext = AV70FilterFullText ;
      AV83Tforacacopy1wwds_2_tfclicod = AV30TFCliCod ;
      AV84Tforacacopy1wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV85Tforacacopy1wwds_4_tfclinom = AV32TFCliNom ;
      AV86Tforacacopy1wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV87Tforacacopy1wwds_6_tfartcod = AV34TFArtCod ;
      AV88Tforacacopy1wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV89Tforacacopy1wwds_8_tfartdsc = AV36TFArtDsc ;
      AV90Tforacacopy1wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV91Tforacacopy1wwds_10_tfprocod = AV38TFProCod ;
      AV92Tforacacopy1wwds_11_tfprocod_sel = AV39TFProCod_Sel ;
      AV93Tforacacopy1wwds_12_tfprodsc = AV40TFProDsc ;
      AV94Tforacacopy1wwds_13_tfprodsc_sel = AV41TFProDsc_Sel ;
      AV95Tforacacopy1wwds_14_tffascod = AV42TFFasCod ;
      AV96Tforacacopy1wwds_15_tffascod_sel = AV43TFFasCod_Sel ;
      AV97Tforacacopy1wwds_16_tffasdsc = AV44TFFasDsc ;
      AV98Tforacacopy1wwds_17_tffasdsc_sel = AV45TFFasDsc_Sel ;
      AV99Tforacacopy1wwds_18_tffasformul = AV46TFFasForMul ;
      AV100Tforacacopy1wwds_19_tffasformul_sel = AV47TFFasForMul_Sel ;
      AV101Tforacacopy1wwds_20_tfartproulin = AV48TFArtProULin ;
      AV102Tforacacopy1wwds_21_tfartproulin_to = AV49TFArtProULin_To ;
      AV103Tforacacopy1wwds_22_tfartprofac = AV50TFArtProFac ;
      AV104Tforacacopy1wwds_23_tfartprofac_to = AV51TFArtProFac_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV82Tforacacopy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV83Tforacacopy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV84Tforacacopy1wwds_3_tfclicod_to) ,
                                           AV86Tforacacopy1wwds_5_tfclinom_sel ,
                                           AV85Tforacacopy1wwds_4_tfclinom ,
                                           AV88Tforacacopy1wwds_7_tfartcod_sel ,
                                           AV87Tforacacopy1wwds_6_tfartcod ,
                                           AV90Tforacacopy1wwds_9_tfartdsc_sel ,
                                           AV89Tforacacopy1wwds_8_tfartdsc ,
                                           AV92Tforacacopy1wwds_11_tfprocod_sel ,
                                           AV91Tforacacopy1wwds_10_tfprocod ,
                                           AV94Tforacacopy1wwds_13_tfprodsc_sel ,
                                           AV93Tforacacopy1wwds_12_tfprodsc ,
                                           AV96Tforacacopy1wwds_15_tffascod_sel ,
                                           AV95Tforacacopy1wwds_14_tffascod ,
                                           AV98Tforacacopy1wwds_17_tffasdsc_sel ,
                                           AV97Tforacacopy1wwds_16_tffasdsc ,
                                           AV100Tforacacopy1wwds_19_tffasformul_sel ,
                                           AV99Tforacacopy1wwds_18_tffasformul ,
                                           Short.valueOf(AV101Tforacacopy1wwds_20_tfartproulin) ,
                                           Short.valueOf(AV102Tforacacopy1wwds_21_tfartproulin_to) ,
                                           AV103Tforacacopy1wwds_22_tfartprofac ,
                                           AV104Tforacacopy1wwds_23_tfartprofac_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4286FasForMul ,
                                           Short.valueOf(A4894ArtProULin) ,
                                           A4896ArtProFac ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV82Tforacacopy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV82Tforacacopy1wwds_1_filterfulltext), "%", "") ;
      lV85Tforacacopy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV85Tforacacopy1wwds_4_tfclinom), 30, "%") ;
      lV87Tforacacopy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV87Tforacacopy1wwds_6_tfartcod), 16, "%") ;
      lV89Tforacacopy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV89Tforacacopy1wwds_8_tfartdsc), 26, "%") ;
      lV91Tforacacopy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV91Tforacacopy1wwds_10_tfprocod), 8, "%") ;
      lV93Tforacacopy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV93Tforacacopy1wwds_12_tfprodsc), 40, "%") ;
      lV95Tforacacopy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV95Tforacacopy1wwds_14_tffascod), 8, "%") ;
      lV97Tforacacopy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV97Tforacacopy1wwds_16_tffasdsc), 28, "%") ;
      lV99Tforacacopy1wwds_18_tffasformul = GXutil.padr( GXutil.rtrim( AV99Tforacacopy1wwds_18_tffasformul), 1, "%") ;
      /* Using cursor P08GH2 */
      pr_default.execute(0, new Object[] {lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, lV82Tforacacopy1wwds_1_filterfulltext, Integer.valueOf(AV83Tforacacopy1wwds_2_tfclicod), Integer.valueOf(AV84Tforacacopy1wwds_3_tfclicod_to), lV85Tforacacopy1wwds_4_tfclinom, AV86Tforacacopy1wwds_5_tfclinom_sel, lV87Tforacacopy1wwds_6_tfartcod, AV88Tforacacopy1wwds_7_tfartcod_sel, lV89Tforacacopy1wwds_8_tfartdsc, AV90Tforacacopy1wwds_9_tfartdsc_sel, lV91Tforacacopy1wwds_10_tfprocod, AV92Tforacacopy1wwds_11_tfprocod_sel, lV93Tforacacopy1wwds_12_tfprodsc, AV94Tforacacopy1wwds_13_tfprodsc_sel, lV95Tforacacopy1wwds_14_tffascod, AV96Tforacacopy1wwds_15_tffascod_sel, lV97Tforacacopy1wwds_16_tffasdsc, AV98Tforacacopy1wwds_17_tffasdsc_sel, lV99Tforacacopy1wwds_18_tffasformul, AV100Tforacacopy1wwds_19_tffasformul_sel, Short.valueOf(AV101Tforacacopy1wwds_20_tfartproulin), Short.valueOf(AV102Tforacacopy1wwds_21_tfartproulin_to), AV103Tforacacopy1wwds_22_tfartprofac, AV104Tforacacopy1wwds_23_tfartprofac_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08GH2_A396EmprCod[0] ;
         A4896ArtProFac = P08GH2_A4896ArtProFac[0] ;
         n4896ArtProFac = P08GH2_n4896ArtProFac[0] ;
         A4894ArtProULin = P08GH2_A4894ArtProULin[0] ;
         n4894ArtProULin = P08GH2_n4894ArtProULin[0] ;
         A4286FasForMul = P08GH2_A4286FasForMul[0] ;
         n4286FasForMul = P08GH2_n4286FasForMul[0] ;
         A460FasDsc = P08GH2_A460FasDsc[0] ;
         A457FasCod = P08GH2_A457FasCod[0] ;
         A759ProDsc = P08GH2_A759ProDsc[0] ;
         A758ProCod = P08GH2_A758ProCod[0] ;
         A69ArtDsc = P08GH2_A69ArtDsc[0] ;
         n69ArtDsc = P08GH2_n69ArtDsc[0] ;
         A65ArtCod = P08GH2_A65ArtCod[0] ;
         A279CliNom = P08GH2_A279CliNom[0] ;
         A252CliCod = P08GH2_A252CliCod[0] ;
         A4286FasForMul = P08GH2_A4286FasForMul[0] ;
         n4286FasForMul = P08GH2_n4286FasForMul[0] ;
         A460FasDsc = P08GH2_A460FasDsc[0] ;
         A759ProDsc = P08GH2_A759ProDsc[0] ;
         A279CliNom = P08GH2_A279CliNom[0] ;
         A69ArtDsc = P08GH2_A69ArtDsc[0] ;
         n69ArtDsc = P08GH2_n69ArtDsc[0] ;
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
         h8GH0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 95, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 99, Gx_line+10, 164, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 237, Gx_line+10, 302, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 306, Gx_line+10, 371, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 375, Gx_line+10, 440, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 444, Gx_line+10, 509, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 513, Gx_line+10, 578, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")), 582, Gx_line+10, 647, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4894ArtProULin), "ZZZ9")), 651, Gx_line+10, 717, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4896ArtProFac, "ZZZZ9.99")), 721, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue("TFORACACopy1WWGridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFORACACopy1WWGridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV26Session.getValue("TFORACACopy1WWGridState"), null, null);
      }
      AV10OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV70FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFCliCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV32TFCliNom = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV33TFCliNom_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV34TFArtCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV35TFArtCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV36TFArtDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV37TFArtDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV38TFProCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV39TFProCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV40TFProDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV41TFProDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV42TFFasCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV43TFFasCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV44TFFasDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV45TFFasDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL") == 0 )
         {
            AV46TFFasForMul = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASFORMUL_SEL") == 0 )
         {
            AV47TFFasForMul_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPROULIN") == 0 )
         {
            AV48TFArtProULin = (short)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFArtProULin_To = (short)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPROFAC") == 0 )
         {
            AV50TFArtProFac = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFArtProFac_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
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

   public void h8GH0( boolean bFoot ,
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
               AV61PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV57DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV64Title = AV78Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV64Title = "" ;
      AV70FilterFullText = "" ;
      AV52TFCliCod_To_Description = "" ;
      AV33TFCliNom_Sel = "" ;
      AV32TFCliNom = "" ;
      AV35TFArtCod_Sel = "" ;
      AV34TFArtCod = "" ;
      AV37TFArtDsc_Sel = "" ;
      AV36TFArtDsc = "" ;
      AV39TFProCod_Sel = "" ;
      AV38TFProCod = "" ;
      AV41TFProDsc_Sel = "" ;
      AV40TFProDsc = "" ;
      AV43TFFasCod_Sel = "" ;
      AV42TFFasCod = "" ;
      AV45TFFasDsc_Sel = "" ;
      AV44TFFasDsc = "" ;
      AV47TFFasForMul_Sel = "" ;
      AV46TFFasForMul = "" ;
      AV53TFArtProULin_To_Description = "" ;
      AV50TFArtProFac = DecimalUtil.ZERO ;
      AV51TFArtProFac_To = DecimalUtil.ZERO ;
      AV54TFArtProFac_To_Description = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4286FasForMul = "" ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      AV82Tforacacopy1wwds_1_filterfulltext = "" ;
      AV85Tforacacopy1wwds_4_tfclinom = "" ;
      AV86Tforacacopy1wwds_5_tfclinom_sel = "" ;
      AV87Tforacacopy1wwds_6_tfartcod = "" ;
      AV88Tforacacopy1wwds_7_tfartcod_sel = "" ;
      AV89Tforacacopy1wwds_8_tfartdsc = "" ;
      AV90Tforacacopy1wwds_9_tfartdsc_sel = "" ;
      AV91Tforacacopy1wwds_10_tfprocod = "" ;
      AV92Tforacacopy1wwds_11_tfprocod_sel = "" ;
      AV93Tforacacopy1wwds_12_tfprodsc = "" ;
      AV94Tforacacopy1wwds_13_tfprodsc_sel = "" ;
      AV95Tforacacopy1wwds_14_tffascod = "" ;
      AV96Tforacacopy1wwds_15_tffascod_sel = "" ;
      AV97Tforacacopy1wwds_16_tffasdsc = "" ;
      AV98Tforacacopy1wwds_17_tffasdsc_sel = "" ;
      AV99Tforacacopy1wwds_18_tffasformul = "" ;
      AV100Tforacacopy1wwds_19_tffasformul_sel = "" ;
      AV103Tforacacopy1wwds_22_tfartprofac = DecimalUtil.ZERO ;
      AV104Tforacacopy1wwds_23_tfartprofac_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV82Tforacacopy1wwds_1_filterfulltext = "" ;
      lV85Tforacacopy1wwds_4_tfclinom = "" ;
      lV87Tforacacopy1wwds_6_tfartcod = "" ;
      lV89Tforacacopy1wwds_8_tfartdsc = "" ;
      lV91Tforacacopy1wwds_10_tfprocod = "" ;
      lV93Tforacacopy1wwds_12_tfprodsc = "" ;
      lV95Tforacacopy1wwds_14_tffascod = "" ;
      lV97Tforacacopy1wwds_16_tffasdsc = "" ;
      lV99Tforacacopy1wwds_18_tffasformul = "" ;
      P08GH2_A396EmprCod = new String[] {""} ;
      P08GH2_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08GH2_n4896ArtProFac = new boolean[] {false} ;
      P08GH2_A4894ArtProULin = new short[1] ;
      P08GH2_n4894ArtProULin = new boolean[] {false} ;
      P08GH2_A4286FasForMul = new String[] {""} ;
      P08GH2_n4286FasForMul = new boolean[] {false} ;
      P08GH2_A460FasDsc = new String[] {""} ;
      P08GH2_A457FasCod = new String[] {""} ;
      P08GH2_A759ProDsc = new String[] {""} ;
      P08GH2_A758ProCod = new String[] {""} ;
      P08GH2_A69ArtDsc = new String[] {""} ;
      P08GH2_n69ArtDsc = new boolean[] {false} ;
      P08GH2_A65ArtCod = new String[] {""} ;
      P08GH2_A279CliNom = new String[] {""} ;
      P08GH2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV26Session = httpContext.getWebSession();
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61PageInfo = "" ;
      AV57DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV78Pgmdesc = "" ;
      AV72AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tforacacopy1wwexportreport__default(),
         new Object[] {
             new Object[] {
            P08GH2_A396EmprCod, P08GH2_A4896ArtProFac, P08GH2_n4896ArtProFac, P08GH2_A4894ArtProULin, P08GH2_n4894ArtProULin, P08GH2_A4286FasForMul, P08GH2_n4286FasForMul, P08GH2_A460FasDsc, P08GH2_A457FasCod, P08GH2_A759ProDsc,
            P08GH2_A758ProCod, P08GH2_A69ArtDsc, P08GH2_n69ArtDsc, P08GH2_A65ArtCod, P08GH2_A279CliNom, P08GH2_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV78Pgmdesc = httpContext.getMessage( "TFORACACopy1 WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV78Pgmdesc = httpContext.getMessage( "TFORACACopy1 WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV48TFArtProULin ;
   private short AV49TFArtProULin_To ;
   private short A4894ArtProULin ;
   private short AV101Tforacacopy1wwds_20_tfartproulin ;
   private short AV102Tforacacopy1wwds_21_tfartproulin_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV30TFCliCod ;
   private int AV31TFCliCod_To ;
   private int A252CliCod ;
   private int AV83Tforacacopy1wwds_2_tfclicod ;
   private int AV84Tforacacopy1wwds_3_tfclicod_to ;
   private int AV105GXV1 ;
   private java.math.BigDecimal AV50TFArtProFac ;
   private java.math.BigDecimal AV51TFArtProFac_To ;
   private java.math.BigDecimal A4896ArtProFac ;
   private java.math.BigDecimal AV103Tforacacopy1wwds_22_tfartprofac ;
   private java.math.BigDecimal AV104Tforacacopy1wwds_23_tfartprofac_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV33TFCliNom_Sel ;
   private String AV32TFCliNom ;
   private String AV35TFArtCod_Sel ;
   private String AV34TFArtCod ;
   private String AV37TFArtDsc_Sel ;
   private String AV36TFArtDsc ;
   private String AV39TFProCod_Sel ;
   private String AV38TFProCod ;
   private String AV41TFProDsc_Sel ;
   private String AV40TFProDsc ;
   private String AV43TFFasCod_Sel ;
   private String AV42TFFasCod ;
   private String AV45TFFasDsc_Sel ;
   private String AV44TFFasDsc ;
   private String AV47TFFasForMul_Sel ;
   private String AV46TFFasForMul ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4286FasForMul ;
   private String AV85Tforacacopy1wwds_4_tfclinom ;
   private String AV86Tforacacopy1wwds_5_tfclinom_sel ;
   private String AV87Tforacacopy1wwds_6_tfartcod ;
   private String AV88Tforacacopy1wwds_7_tfartcod_sel ;
   private String AV89Tforacacopy1wwds_8_tfartdsc ;
   private String AV90Tforacacopy1wwds_9_tfartdsc_sel ;
   private String AV91Tforacacopy1wwds_10_tfprocod ;
   private String AV92Tforacacopy1wwds_11_tfprocod_sel ;
   private String AV93Tforacacopy1wwds_12_tfprodsc ;
   private String AV94Tforacacopy1wwds_13_tfprodsc_sel ;
   private String AV95Tforacacopy1wwds_14_tffascod ;
   private String AV96Tforacacopy1wwds_15_tffascod_sel ;
   private String AV97Tforacacopy1wwds_16_tffasdsc ;
   private String AV98Tforacacopy1wwds_17_tffasdsc_sel ;
   private String AV99Tforacacopy1wwds_18_tffasformul ;
   private String AV100Tforacacopy1wwds_19_tffasformul_sel ;
   private String scmdbuf ;
   private String lV85Tforacacopy1wwds_4_tfclinom ;
   private String lV87Tforacacopy1wwds_6_tfartcod ;
   private String lV89Tforacacopy1wwds_8_tfartdsc ;
   private String lV91Tforacacopy1wwds_10_tfprocod ;
   private String lV93Tforacacopy1wwds_12_tfprodsc ;
   private String lV95Tforacacopy1wwds_14_tffascod ;
   private String lV97Tforacacopy1wwds_16_tffasdsc ;
   private String lV99Tforacacopy1wwds_18_tffasformul ;
   private String A396EmprCod ;
   private String AV78Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n4896ArtProFac ;
   private boolean n4894ArtProULin ;
   private boolean n4286FasForMul ;
   private boolean n69ArtDsc ;
   private String AV64Title ;
   private String AV70FilterFullText ;
   private String AV52TFCliCod_To_Description ;
   private String AV53TFArtProULin_To_Description ;
   private String AV54TFArtProFac_To_Description ;
   private String AV82Tforacacopy1wwds_1_filterfulltext ;
   private String lV82Tforacacopy1wwds_1_filterfulltext ;
   private String AV61PageInfo ;
   private String AV57DateInfo ;
   private String AV72AppName ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08GH2_A396EmprCod ;
   private java.math.BigDecimal[] P08GH2_A4896ArtProFac ;
   private boolean[] P08GH2_n4896ArtProFac ;
   private short[] P08GH2_A4894ArtProULin ;
   private boolean[] P08GH2_n4894ArtProULin ;
   private String[] P08GH2_A4286FasForMul ;
   private boolean[] P08GH2_n4286FasForMul ;
   private String[] P08GH2_A460FasDsc ;
   private String[] P08GH2_A457FasCod ;
   private String[] P08GH2_A759ProDsc ;
   private String[] P08GH2_A758ProCod ;
   private String[] P08GH2_A69ArtDsc ;
   private boolean[] P08GH2_n69ArtDsc ;
   private String[] P08GH2_A65ArtCod ;
   private String[] P08GH2_A279CliNom ;
   private int[] P08GH2_A252CliCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
}

final  class tforacacopy1wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Tforacacopy1wwds_1_filterfulltext ,
                                          int AV83Tforacacopy1wwds_2_tfclicod ,
                                          int AV84Tforacacopy1wwds_3_tfclicod_to ,
                                          String AV86Tforacacopy1wwds_5_tfclinom_sel ,
                                          String AV85Tforacacopy1wwds_4_tfclinom ,
                                          String AV88Tforacacopy1wwds_7_tfartcod_sel ,
                                          String AV87Tforacacopy1wwds_6_tfartcod ,
                                          String AV90Tforacacopy1wwds_9_tfartdsc_sel ,
                                          String AV89Tforacacopy1wwds_8_tfartdsc ,
                                          String AV92Tforacacopy1wwds_11_tfprocod_sel ,
                                          String AV91Tforacacopy1wwds_10_tfprocod ,
                                          String AV94Tforacacopy1wwds_13_tfprodsc_sel ,
                                          String AV93Tforacacopy1wwds_12_tfprodsc ,
                                          String AV96Tforacacopy1wwds_15_tffascod_sel ,
                                          String AV95Tforacacopy1wwds_14_tffascod ,
                                          String AV98Tforacacopy1wwds_17_tffasdsc_sel ,
                                          String AV97Tforacacopy1wwds_16_tffasdsc ,
                                          String AV100Tforacacopy1wwds_19_tffasformul_sel ,
                                          String AV99Tforacacopy1wwds_18_tffasformul ,
                                          short AV101Tforacacopy1wwds_20_tfartproulin ,
                                          short AV102Tforacacopy1wwds_21_tfartproulin_to ,
                                          java.math.BigDecimal AV103Tforacacopy1wwds_22_tfartprofac ,
                                          java.math.BigDecimal AV104Tforacacopy1wwds_23_tfartprofac_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4286FasForMul ,
                                          short A4894ArtProULin ,
                                          java.math.BigDecimal A4896ArtProFac ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtProFac, T1.ArtProULin, T2.FasForMul, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU" ;
      scmdbuf += " T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod" ;
      scmdbuf += " = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV82Tforacacopy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T2.FasForMul) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtProULin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtProFac,'99990.99'), 2) like '%' || ?))");
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
      if ( ! (0==AV83Tforacacopy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV84Tforacacopy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tforacacopy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tforacacopy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tforacacopy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tforacacopy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Tforacacopy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tforacacopy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tforacacopy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Tforacacopy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tforacacopy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tforacacopy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV91Tforacacopy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tforacacopy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tforacacopy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV93Tforacacopy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tforacacopy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tforacacopy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV95Tforacacopy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tforacacopy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tforacacopy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Tforacacopy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tforacacopy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tforacacopy1wwds_19_tffasformul_sel)==0) && ( ! (GXutil.strcmp("", AV99Tforacacopy1wwds_18_tffasformul)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasForMul) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tforacacopy1wwds_19_tffasformul_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasForMul = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV101Tforacacopy1wwds_20_tfartproulin) )
      {
         addWhere(sWhereString, "(T1.ArtProULin >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV102Tforacacopy1wwds_21_tfartproulin_to) )
      {
         addWhere(sWhereString, "(T1.ArtProULin <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Tforacacopy1wwds_22_tfartprofac)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tforacacopy1wwds_23_tfartprofac_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtProFac <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtProULin" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtProULin DESC" ;
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
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
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
         scmdbuf += " ORDER BY T5.ArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ProDsc" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ProDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasForMul" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasForMul DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtProFac" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtProFac DESC" ;
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
                  return conditional_P08GH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Boolean) dynConstraints[35]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 28);
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((int[]) buf[15])[0] = rslt.getInt(12);
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
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 28);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               return;
      }
   }

}

