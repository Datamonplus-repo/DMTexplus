package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_defectos_wcexportreport_impl extends GXWebReport
{
   public webcontador_metrajepiezas_defectos_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV49Title = httpContext.getMessage( "Lista de METPID", "") ;
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
         h9AS0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV18FilterFullText)==0) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFMetPieDfLin) && (0==AV24TFMetPieDfLin_To) ) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFMetPieDfLin), "ZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFMetPieDfLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Linea", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFMetPieDfLin_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFMetPieDfLin_To), "ZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV25TFMetPieDfID) && (0==AV26TFMetPieDfID_To) ) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Defecto", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFMetPieDfID), "ZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFMetPieDfID_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Defecto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFMetPieDfID_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFMetPieDfID_To), "ZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFMetPieDfDc_Sel)==0) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFMetPieDfDc_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFMetPieDfDc)==0) )
         {
            h9AS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFMetPieDfDc, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFMetPieDfMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFMetPieDfMin_To)==0) ) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros Iniciales", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFMetPieDfMin, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFMetPieDfMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Metros Iniciales", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFMetPieDfMin_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFMetPieDfMin_To, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFMetPieDfMax)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFMetPieDfMax_To)==0) ) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros Finales", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFMetPieDfMax, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFMetPieDfMax_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Metros Finales", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFMetPieDfMax_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFMetPieDfMax_To, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV34TFMetPieDfFase_Sel)==0) )
      {
         h9AS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFMetPieDfFase_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFMetPieDfFase)==0) )
         {
            h9AS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFMetPieDfFase, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9AS0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9AS0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 30, Gx_line+10, 135, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Defecto", ""), 139, Gx_line+10, 244, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 248, Gx_line+10, 458, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros Iniciales", ""), 462, Gx_line+10, 567, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros Finales", ""), 571, Gx_line+10, 677, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 681, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV10EmprCod ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV11MetTerCod ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV12BarCod ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV13BarCodReo ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV14BarCodPar ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV15MetPieCod ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV18FilterFullText ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV23TFMetPieDfLin ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV24TFMetPieDfLin_To ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV25TFMetPieDfID ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV26TFMetPieDfID_To ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV27TFMetPieDfDc ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV28TFMetPieDfDc_Sel ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV29TFMetPieDfMin ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV30TFMetPieDfMin_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV31TFMetPieDfMax ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV32TFMetPieDfMax_To ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV33TFMetPieDfFase ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV34TFMetPieDfFase_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                           Short.valueOf(AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                           Short.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                           Short.valueOf(AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                           Short.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                           AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                           AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                           AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                           AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                           Short.valueOf(A12995MetPieDfLi) ,
                                           Short.valueOf(A12996MetPieDfID) ,
                                           A12997MetPieDfDc ,
                                           A12998MetPieDfMi ,
                                           A12999MetPieDfMa ,
                                           A13000MetPieDfFa ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A396EmprCod ,
                                           AV10EmprCod ,
                                           A2809MetTerCod ,
                                           AV11MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV12BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV13BarCodReo) ,
                                           A130BarCodPar ,
                                           AV14BarCodPar ,
                                           A2813MetPieCod ,
                                           AV15MetPieCod ,
                                           AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                           AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                           Integer.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                           Byte.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                           AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                           AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
      lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
      /* Using cursor P09AS2 */
      pr_default.execute(0, new Object[] {AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV10EmprCod, AV11MetTerCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV13BarCodReo), AV14BarCodPar, AV15MetPieCod, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13000MetPieDfFa = P09AS2_A13000MetPieDfFa[0] ;
         A12999MetPieDfMa = P09AS2_A12999MetPieDfMa[0] ;
         A12998MetPieDfMi = P09AS2_A12998MetPieDfMi[0] ;
         A12997MetPieDfDc = P09AS2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AS2_n12997MetPieDfDc[0] ;
         A12996MetPieDfID = P09AS2_A12996MetPieDfID[0] ;
         A12995MetPieDfLi = P09AS2_A12995MetPieDfLi[0] ;
         A2813MetPieCod = P09AS2_A2813MetPieCod[0] ;
         A130BarCodPar = P09AS2_A130BarCodPar[0] ;
         A132BarCodReo = P09AS2_A132BarCodReo[0] ;
         A129BarCod = P09AS2_A129BarCod[0] ;
         A2809MetTerCod = P09AS2_A2809MetTerCod[0] ;
         A396EmprCod = P09AS2_A396EmprCod[0] ;
         A12997MetPieDfDc = P09AS2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AS2_n12997MetPieDfDc[0] ;
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
         h9AS0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12995MetPieDfLi), "ZZZ9")), 30, Gx_line+10, 135, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12996MetPieDfID), "ZZZ9")), 139, Gx_line+10, 244, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12997MetPieDfDc, "")), 248, Gx_line+10, 458, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12998MetPieDfMi, "ZZZZZ9.99")), 462, Gx_line+10, 567, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12999MetPieDfMa, "ZZZZZ9.99")), 571, Gx_line+10, 677, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13000MetPieDfFa, "")), 681, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFLIN") == 0 )
         {
            AV23TFMetPieDfLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFMetPieDfLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFID") == 0 )
         {
            AV25TFMetPieDfID = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFMetPieDfID_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC") == 0 )
         {
            AV27TFMetPieDfDc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC_SEL") == 0 )
         {
            AV28TFMetPieDfDc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMIN") == 0 )
         {
            AV29TFMetPieDfMin = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV30TFMetPieDfMin_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMAX") == 0 )
         {
            AV31TFMetPieDfMax = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV32TFMetPieDfMax_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE") == 0 )
         {
            AV33TFMetPieDfFase = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE_SEL") == 0 )
         {
            AV34TFMetPieDfFase_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METTERCOD") == 0 )
         {
            AV11MetTerCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV12BarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV13BarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV14BarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METPIECOD") == 0 )
         {
            AV15MetPieCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
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

   public void h9AS0( boolean bFoot ,
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
               AV47PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV44DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV49Title = AV53Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV49Title = "" ;
      AV18FilterFullText = "" ;
      AV35TFMetPieDfLin_To_Description = "" ;
      AV36TFMetPieDfID_To_Description = "" ;
      AV28TFMetPieDfDc_Sel = "" ;
      AV27TFMetPieDfDc = "" ;
      AV29TFMetPieDfMin = DecimalUtil.ZERO ;
      AV30TFMetPieDfMin_To = DecimalUtil.ZERO ;
      AV37TFMetPieDfMin_To_Description = "" ;
      AV31TFMetPieDfMax = DecimalUtil.ZERO ;
      AV32TFMetPieDfMax_To = DecimalUtil.ZERO ;
      AV38TFMetPieDfMax_To_Description = "" ;
      AV34TFMetPieDfFase_Sel = "" ;
      AV33TFMetPieDfFase = "" ;
      A12997MetPieDfDc = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = "" ;
      AV11MetTerCod = "" ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = "" ;
      AV14BarCodPar = "" ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = "" ;
      AV15MetPieCod = "" ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = "" ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = DecimalUtil.ZERO ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = DecimalUtil.ZERO ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = DecimalUtil.ZERO ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = DecimalUtil.ZERO ;
      AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = "" ;
      scmdbuf = "" ;
      lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      P09AS2_A13000MetPieDfFa = new String[] {""} ;
      P09AS2_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AS2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AS2_A12997MetPieDfDc = new String[] {""} ;
      P09AS2_n12997MetPieDfDc = new boolean[] {false} ;
      P09AS2_A12996MetPieDfID = new short[1] ;
      P09AS2_A12995MetPieDfLi = new short[1] ;
      P09AS2_A2813MetPieCod = new String[] {""} ;
      P09AS2_A130BarCodPar = new String[] {""} ;
      P09AS2_A132BarCodReo = new byte[1] ;
      P09AS2_A129BarCod = new int[1] ;
      P09AS2_A2809MetTerCod = new String[] {""} ;
      P09AS2_A396EmprCod = new String[] {""} ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47PageInfo = "" ;
      AV44DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV53Pgmdesc = "" ;
      AV42AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09AS2_A13000MetPieDfFa, P09AS2_A12999MetPieDfMa, P09AS2_A12998MetPieDfMi, P09AS2_A12997MetPieDfDc, P09AS2_n12997MetPieDfDc, P09AS2_A12996MetPieDfID, P09AS2_A12995MetPieDfLi, P09AS2_A2813MetPieCod, P09AS2_A130BarCodPar, P09AS2_A132BarCodReo,
            P09AS2_A129BarCod, P09AS2_A2809MetTerCod, P09AS2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Web Contador_Metraje Piezas_Defectos_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV53Pgmdesc = httpContext.getMessage( "Web Contador_Metraje Piezas_Defectos_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ;
   private byte AV13BarCodReo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV23TFMetPieDfLin ;
   private short AV24TFMetPieDfLin_To ;
   private short AV25TFMetPieDfID ;
   private short AV26TFMetPieDfID_To ;
   private short A12995MetPieDfLi ;
   private short A12996MetPieDfID ;
   private short AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ;
   private short AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ;
   private short AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ;
   private short AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ;
   private int AV12BarCod ;
   private int A129BarCod ;
   private int AV76GXV1 ;
   private java.math.BigDecimal AV29TFMetPieDfMin ;
   private java.math.BigDecimal AV30TFMetPieDfMin_To ;
   private java.math.BigDecimal AV31TFMetPieDfMax ;
   private java.math.BigDecimal AV32TFMetPieDfMax_To ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal A12999MetPieDfMa ;
   private java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ;
   private java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ;
   private java.math.BigDecimal AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ;
   private java.math.BigDecimal AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV28TFMetPieDfDc_Sel ;
   private String AV27TFMetPieDfDc ;
   private String AV34TFMetPieDfFase_Sel ;
   private String AV33TFMetPieDfFase ;
   private String A12997MetPieDfDc ;
   private String A13000MetPieDfFa ;
   private String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ;
   private String AV11MetTerCod ;
   private String AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ;
   private String AV14BarCodPar ;
   private String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod ;
   private String AV15MetPieCod ;
   private String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ;
   private String AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ;
   private String scmdbuf ;
   private String lV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String lV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String AV53Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n12997MetPieDfDc ;
   private String AV49Title ;
   private String AV18FilterFullText ;
   private String AV35TFMetPieDfLin_To_Description ;
   private String AV36TFMetPieDfID_To_Description ;
   private String AV37TFMetPieDfMin_To_Description ;
   private String AV38TFMetPieDfMax_To_Description ;
   private String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String lV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String AV47PageInfo ;
   private String AV44DateInfo ;
   private String AV42AppName ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09AS2_A13000MetPieDfFa ;
   private java.math.BigDecimal[] P09AS2_A12999MetPieDfMa ;
   private java.math.BigDecimal[] P09AS2_A12998MetPieDfMi ;
   private String[] P09AS2_A12997MetPieDfDc ;
   private boolean[] P09AS2_n12997MetPieDfDc ;
   private short[] P09AS2_A12996MetPieDfID ;
   private short[] P09AS2_A12995MetPieDfLi ;
   private String[] P09AS2_A2813MetPieCod ;
   private String[] P09AS2_A130BarCodPar ;
   private byte[] P09AS2_A132BarCodReo ;
   private int[] P09AS2_A129BarCod ;
   private String[] P09AS2_A2809MetTerCod ;
   private String[] P09AS2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class webcontador_metrajepiezas_defectos_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV11MetTerCod ,
                                          int A129BarCod ,
                                          int AV12BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV13BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV14BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV15MetPieCod ,
                                          String AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MetPieDfFa, T1.MetPieDfMa, T1.MetPieDfMi, T2.TipDefDsc AS MetPieDfDc, T1.MetPieDfID AS MetPieDfID, T1.MetPieDfLi, T1.MetPieCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.MetTerCod, T1.EmprCod FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV74Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfFa" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfFa DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfLi DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfID" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfID DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T2.TipDefDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T2.TipDefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMi" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMi DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMa" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMa DESC" ;
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
                  return conditional_P09AS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

