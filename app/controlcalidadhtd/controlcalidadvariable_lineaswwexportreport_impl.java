package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_lineaswwexportreport_impl extends GXWebReport
{
   public controlcalidadvariable_lineaswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV46Title = httpContext.getMessage( "Lista de Control Calidad Variable (lineas)", "") ;
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
         hAB70( true, 0) ;
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
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFEmprCod_Sel)==0) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprCod_Sel, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFEmprCod)==0) )
         {
            hAB70( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFEmprCod, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFEmprNom_Sel)==0) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFEmprNom_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFEmprNom)==0) )
         {
            hAB70( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFEmprNom, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV21TFCCTCod) && (0==AV22TFCCTCod_To) ) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCCTCod), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV33TFCCTCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Código", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFCCTCod_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCCTCod_To), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFCCTDsc_Sel)==0) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción del Test", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCCTDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFCCTDsc)==0) )
         {
            hAB70( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción del Test", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCCTDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV25TFCCTLin) && (0==AV26TFCCTLin_To) ) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "# Lín", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFCCTLin), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFCCTLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "# Lín", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFCCTLin_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFCCTLin_To), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV27TFCCTValLin) && (0==AV28TFCCTValLin_To) ) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "# Lín", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFCCTValLin), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFCCTValLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "# Lín", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFCCTValLin_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFCCTValLin_To), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFCCTValDsc_Sel)==0) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFCCTValDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFCCTValDsc)==0) )
         {
            hAB70( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFCCTValDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFCCTVal_Sel)==0) )
      {
         hAB70( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFCCTVal_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFCCTVal)==0) )
         {
            hAB70( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFCCTVal, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hAB70( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hAB70( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 90, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 94, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código", ""), 218, Gx_line+10, 279, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción del Test", ""), 283, Gx_line+10, 405, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Lín", ""), 409, Gx_line+10, 470, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Lín", ""), 474, Gx_line+10, 535, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 539, Gx_line+10, 661, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 665, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV12FilterFullText ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV17TFEmprCod ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV18TFEmprCod_Sel ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV19TFEmprNom ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV20TFEmprNom_Sel ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV21TFCCTCod ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV22TFCCTCod_To ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV23TFCCTDsc ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV24TFCCTDsc_Sel ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV25TFCCTLin ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV26TFCCTLin_To ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV27TFCCTValLin ;
      AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV28TFCCTValLin_To ;
      AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV29TFCCTValDsc ;
      AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV30TFCCTValDsc_Sel ;
      AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV31TFCCTVal ;
      AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV32TFCCTVal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB72 */
      pr_default.execute(0, new Object[] {lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4051CCTVal = P0AB72_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB72_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB72_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB72_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB72_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB72_A4031CCTCod[0] ;
         A407EmprNom = P0AB72_A407EmprNom[0] ;
         n407EmprNom = P0AB72_n407EmprNom[0] ;
         A396EmprCod = P0AB72_A396EmprCod[0] ;
         A407EmprNom = P0AB72_A407EmprNom[0] ;
         n407EmprNom = P0AB72_n407EmprNom[0] ;
         A4036CCTDsc = P0AB72_A4036CCTDsc[0] ;
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
         hAB70( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 90, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 94, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), 218, Gx_line+10, 279, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 283, Gx_line+10, 405, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")), 409, Gx_line+10, 470, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9")), 474, Gx_line+10, 535, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4050CCTValDsc, "")), 539, Gx_line+10, 661, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4051CCTVal, "")), 665, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV17TFEmprCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV18TFEmprCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV19TFEmprNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV20TFEmprNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV21TFCCTCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFCCTCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV23TFCCTDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV24TFCCTDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV25TFCCTLin = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFCCTLin_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALLIN") == 0 )
         {
            AV27TFCCTValLin = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFCCTValLin_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC") == 0 )
         {
            AV29TFCCTValDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC_SEL") == 0 )
         {
            AV30TFCCTValDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL") == 0 )
         {
            AV31TFCCTVal = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL_SEL") == 0 )
         {
            AV32TFCCTVal_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
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

   public void hAB70( boolean bFoot ,
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
            AV46Title = AV50Pgmdesc ;
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
      AV18TFEmprCod_Sel = "" ;
      AV17TFEmprCod = "" ;
      AV20TFEmprNom_Sel = "" ;
      AV19TFEmprNom = "" ;
      AV33TFCCTCod_To_Description = "" ;
      AV24TFCCTDsc_Sel = "" ;
      AV23TFCCTDsc = "" ;
      AV34TFCCTLin_To_Description = "" ;
      AV35TFCCTValLin_To_Description = "" ;
      AV30TFCCTValDsc_Sel = "" ;
      AV29TFCCTValDsc = "" ;
      AV32TFCCTVal_Sel = "" ;
      AV31TFCCTVal = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = "" ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = "" ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = "" ;
      AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = "" ;
      AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = "" ;
      scmdbuf = "" ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      lV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      lV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      lV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      lV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      P0AB72_A4051CCTVal = new String[] {""} ;
      P0AB72_A4050CCTValDsc = new String[] {""} ;
      P0AB72_A4049CCTValLin = new byte[1] ;
      P0AB72_A4034CCTLin = new short[1] ;
      P0AB72_A4036CCTDsc = new String[] {""} ;
      P0AB72_A4031CCTCod = new int[1] ;
      P0AB72_A407EmprNom = new String[] {""} ;
      P0AB72_n407EmprNom = new boolean[] {false} ;
      P0AB72_A396EmprCod = new String[] {""} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44PageInfo = "" ;
      AV41DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV50Pgmdesc = "" ;
      AV39AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineaswwexportreport__default(),
         new Object[] {
             new Object[] {
            P0AB72_A4051CCTVal, P0AB72_A4050CCTValDsc, P0AB72_A4049CCTValLin, P0AB72_A4034CCTLin, P0AB72_A4036CCTDsc, P0AB72_A4031CCTCod, P0AB72_A407EmprNom, P0AB72_n407EmprNom, P0AB72_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Control Calidad Variable_lineas WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV50Pgmdesc = httpContext.getMessage( "Control Calidad Variable_lineas WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV27TFCCTValLin ;
   private byte AV28TFCCTValLin_To ;
   private byte A4049CCTValLin ;
   private byte AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ;
   private byte AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ;
   private short gxcookieaux ;
   private short AV25TFCCTLin ;
   private short AV26TFCCTLin_To ;
   private short A4034CCTLin ;
   private short AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ;
   private short AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV21TFCCTCod ;
   private int AV22TFCCTCod_To ;
   private int A4031CCTCod ;
   private int AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ;
   private int AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ;
   private int AV71GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFEmprCod_Sel ;
   private String AV17TFEmprCod ;
   private String AV20TFEmprNom_Sel ;
   private String AV19TFEmprNom ;
   private String AV24TFCCTDsc_Sel ;
   private String AV23TFCCTDsc ;
   private String AV30TFCCTValDsc_Sel ;
   private String AV29TFCCTValDsc ;
   private String AV32TFCCTVal_Sel ;
   private String AV31TFCCTVal ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ;
   private String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ;
   private String AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ;
   private String AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ;
   private String AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ;
   private String scmdbuf ;
   private String lV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String lV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String lV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String lV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String lV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String AV50Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n407EmprNom ;
   private String AV46Title ;
   private String AV12FilterFullText ;
   private String AV33TFCCTCod_To_Description ;
   private String AV34TFCCTLin_To_Description ;
   private String AV35TFCCTValLin_To_Description ;
   private String AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String AV44PageInfo ;
   private String AV41DateInfo ;
   private String AV39AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0AB72_A4051CCTVal ;
   private String[] P0AB72_A4050CCTValDsc ;
   private byte[] P0AB72_A4049CCTValLin ;
   private short[] P0AB72_A4034CCTLin ;
   private String[] P0AB72_A4036CCTDsc ;
   private int[] P0AB72_A4031CCTCod ;
   private String[] P0AB72_A407EmprNom ;
   private boolean[] P0AB72_n407EmprNom ;
   private String[] P0AB72_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class controlcalidadvariable_lineaswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AB72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTValDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTValDsc DESC" ;
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
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CCTDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CCTDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTValLin" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTValLin DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTVal" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTVal DESC" ;
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
                  return conditional_P0AB72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AB72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
      }
   }

}

