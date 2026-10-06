package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwhdrpziexportreport_impl extends GXWebReport
{
   public webwhdrpziexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV55Title = httpContext.getMessage( "Lista de Tabla BARPIE", "") ;
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
         h9C20( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV26FilterFullText)==0) )
      {
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26FilterFullText, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFBarPieCod_Sel)==0) )
      {
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Pieza", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFBarPieCod_Sel, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFBarPieCod)==0) )
         {
            h9C20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Pieza", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFBarPieCod, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarPieKil)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarPieKil_To)==0) ) )
      {
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFBarPieKil, "ZZZZZ9.99")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFBarPieKil_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kilos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFBarPieKil_To_Description, "")), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFBarPieKil_To, "ZZZZZ9.99")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarPieMet)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarPieMet_To)==0) ) )
      {
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFBarPieMet, "ZZZZZ9.99")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFBarPieMet_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Metros", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFBarPieMet_To_Description, "")), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFBarPieMet_To, "ZZZZZ9.99")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV37TFBarPieAnc) && (0==AV38TFBarPieAnc_To) ) )
      {
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ancho Acabado Pieza", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFBarPieAnc), "ZZZ9")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFBarPieAnc_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ancho Acabado Pieza", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFBarPieAnc_To_Description, "")), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFBarPieAnc_To), "ZZZ9")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV39TFBarPieEst) && (0==AV40TFBarPieEst_To) ) )
      {
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFBarPieEst), "9")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV44TFBarPieEst_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Estado", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9C20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFBarPieEst_To_Description, "")), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFBarPieEst_To), "9")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9C20( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9C20( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Pieza", ""), 30, Gx_line+10, 152, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 156, Gx_line+10, 279, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 283, Gx_line+10, 406, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho Acabado Pieza", ""), 410, Gx_line+10, 533, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Impresa?", ""), 537, Gx_line+10, 660, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 664, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV10EmprCod ;
      AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV26FilterFullText ;
      AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV31TFBarPieCod ;
      AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV32TFBarPieCod_Sel ;
      AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV33TFBarPieKil ;
      AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV34TFBarPieKil_To ;
      AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV35TFBarPieMet ;
      AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV36TFBarPieMet_To ;
      AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV37TFBarPieAnc ;
      AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV38TFBarPieAnc_To ;
      AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV39TFBarPieEst ;
      AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV40TFBarPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                           AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                           AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                           AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                           AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                           AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                           AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                           Short.valueOf(AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) ,
                                           Short.valueOf(AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) ,
                                           Byte.valueOf(AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) ,
                                           Byte.valueOf(AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) ,
                                           A200BarPieCod ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Short.valueOf(A1691BarPieAnc) ,
                                           A6116BarPieImp ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           Short.valueOf(AV24OrderedBy) ,
                                           Boolean.valueOf(AV25OrderedDsc) ,
                                           A396EmprCod ,
                                           AV10EmprCod ,
                                           AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                           Integer.valueOf(AV17BarCod) ,
                                           Byte.valueOf(AV18BarCodReo) ,
                                           AV19BarCodPar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod), 9, "%") ;
      /* Using cursor P09C22 */
      pr_default.execute(0, new Object[] {AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar, AV10EmprCod, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod, AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel, AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil, AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to, AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet, AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to, Short.valueOf(AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc), Short.valueOf(AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to), Byte.valueOf(AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest), Byte.valueOf(AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09C22_A130BarCodPar[0] ;
         A132BarCodReo = P09C22_A132BarCodReo[0] ;
         A129BarCod = P09C22_A129BarCod[0] ;
         A6116BarPieImp = P09C22_A6116BarPieImp[0] ;
         n6116BarPieImp = P09C22_n6116BarPieImp[0] ;
         A201BarPieEst = P09C22_A201BarPieEst[0] ;
         A1691BarPieAnc = P09C22_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P09C22_n1691BarPieAnc[0] ;
         A205BarPieMet = P09C22_A205BarPieMet[0] ;
         A203BarPieKil = P09C22_A203BarPieKil[0] ;
         A200BarPieCod = P09C22_A200BarPieCod[0] ;
         A396EmprCod = P09C22_A396EmprCod[0] ;
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
         h9C20( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A200BarPieCod, "")), 30, Gx_line+10, 152, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 156, Gx_line+10, 279, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 283, Gx_line+10, 406, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1691BarPieAnc), "ZZZ9")), 410, Gx_line+10, 533, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6116BarPieImp, "")), 537, Gx_line+10, 660, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9")), 664, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV27Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      AV24OrderedBy = AV29GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV25OrderedDsc = AV29GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV26FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV31TFBarPieCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV32TFBarPieCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV33TFBarPieKil = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFBarPieKil_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV35TFBarPieMet = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFBarPieMet_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEANC") == 0 )
         {
            AV37TFBarPieAnc = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFBarPieAnc_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV39TFBarPieEst = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFBarPieEst_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV11OpeCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPENOM") == 0 )
         {
            AV12OpeNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV13MaqCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQNOM") == 0 )
         {
            AV14MaqNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV15FasCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASDSC") == 0 )
         {
            AV16FasDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV17BarCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV18BarCodReo = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV19BarCodPar = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARORDLIN") == 0 )
         {
            AV20BarOrdlin = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARANCACA1") == 0 )
         {
            AV21BarAncAca1 = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MSG_I") == 0 )
         {
            AV22Msg_i = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LECFEC") == 0 )
         {
            AV23Lecfec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
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

   public void h9C20( boolean bFoot ,
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
               AV53PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV50DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV55Title = AV59Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV55Title = "" ;
      AV26FilterFullText = "" ;
      AV32TFBarPieCod_Sel = "" ;
      AV31TFBarPieCod = "" ;
      AV33TFBarPieKil = DecimalUtil.ZERO ;
      AV34TFBarPieKil_To = DecimalUtil.ZERO ;
      AV41TFBarPieKil_To_Description = "" ;
      AV35TFBarPieMet = DecimalUtil.ZERO ;
      AV36TFBarPieMet_To = DecimalUtil.ZERO ;
      AV42TFBarPieMet_To_Description = "" ;
      AV43TFBarPieAnc_To_Description = "" ;
      AV44TFBarPieEst_To_Description = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = "" ;
      AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      A396EmprCod = "" ;
      AV19BarCodPar = "" ;
      A130BarCodPar = "" ;
      P09C22_A130BarCodPar = new String[] {""} ;
      P09C22_A132BarCodReo = new byte[1] ;
      P09C22_A129BarCod = new int[1] ;
      P09C22_A6116BarPieImp = new String[] {""} ;
      P09C22_n6116BarPieImp = new boolean[] {false} ;
      P09C22_A201BarPieEst = new byte[1] ;
      P09C22_A1691BarPieAnc = new short[1] ;
      P09C22_n1691BarPieAnc = new boolean[] {false} ;
      P09C22_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C22_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C22_A200BarPieCod = new String[] {""} ;
      P09C22_A396EmprCod = new String[] {""} ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12OpeNom = "" ;
      AV13MaqCod = "" ;
      AV14MaqNom = "" ;
      AV15FasCod = "" ;
      AV16FasDsc = "" ;
      AV22Msg_i = "" ;
      AV23Lecfec = GXutil.nullDate() ;
      AV53PageInfo = "" ;
      AV50DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV59Pgmdesc = "" ;
      AV48AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwhdrpziexportreport__default(),
         new Object[] {
             new Object[] {
            P09C22_A130BarCodPar, P09C22_A132BarCodReo, P09C22_A129BarCod, P09C22_A6116BarPieImp, P09C22_n6116BarPieImp, P09C22_A201BarPieEst, P09C22_A1691BarPieAnc, P09C22_n1691BarPieAnc, P09C22_A205BarPieMet, P09C22_A203BarPieKil,
            P09C22_A200BarPieCod, P09C22_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "Web WHDRPZIExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "Web WHDRPZIExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV39TFBarPieEst ;
   private byte AV40TFBarPieEst_To ;
   private byte A201BarPieEst ;
   private byte AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ;
   private byte AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ;
   private byte AV18BarCodReo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV37TFBarPieAnc ;
   private short AV38TFBarPieAnc_To ;
   private short A1691BarPieAnc ;
   private short AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ;
   private short AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ;
   private short AV24OrderedBy ;
   private short AV20BarOrdlin ;
   private short AV21BarAncAca1 ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV17BarCod ;
   private int A129BarCod ;
   private int AV75GXV1 ;
   private int AV11OpeCod ;
   private java.math.BigDecimal AV33TFBarPieKil ;
   private java.math.BigDecimal AV34TFBarPieKil_To ;
   private java.math.BigDecimal AV35TFBarPieMet ;
   private java.math.BigDecimal AV36TFBarPieMet_To ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ;
   private java.math.BigDecimal AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ;
   private java.math.BigDecimal AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV32TFBarPieCod_Sel ;
   private String AV31TFBarPieCod ;
   private String A200BarPieCod ;
   private String A6116BarPieImp ;
   private String AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod ;
   private String AV10EmprCod ;
   private String AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ;
   private String scmdbuf ;
   private String lV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String A396EmprCod ;
   private String AV19BarCodPar ;
   private String A130BarCodPar ;
   private String AV12OpeNom ;
   private String AV13MaqCod ;
   private String AV14MaqNom ;
   private String AV15FasCod ;
   private String AV16FasDsc ;
   private String AV22Msg_i ;
   private String AV59Pgmdesc ;
   private java.util.Date AV23Lecfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV25OrderedDsc ;
   private boolean n6116BarPieImp ;
   private boolean n1691BarPieAnc ;
   private String AV55Title ;
   private String AV26FilterFullText ;
   private String AV41TFBarPieKil_To_Description ;
   private String AV42TFBarPieMet_To_Description ;
   private String AV43TFBarPieAnc_To_Description ;
   private String AV44TFBarPieEst_To_Description ;
   private String AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String lV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String AV53PageInfo ;
   private String AV50DateInfo ;
   private String AV48AppName ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09C22_A130BarCodPar ;
   private byte[] P09C22_A132BarCodReo ;
   private int[] P09C22_A129BarCod ;
   private String[] P09C22_A6116BarPieImp ;
   private boolean[] P09C22_n6116BarPieImp ;
   private byte[] P09C22_A201BarPieEst ;
   private short[] P09C22_A1691BarPieAnc ;
   private boolean[] P09C22_n1691BarPieAnc ;
   private java.math.BigDecimal[] P09C22_A205BarPieMet ;
   private java.math.BigDecimal[] P09C22_A203BarPieKil ;
   private String[] P09C22_A200BarPieCod ;
   private String[] P09C22_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwhdrpziexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09C22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                          String AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                          String AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                          java.math.BigDecimal AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                          short AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ,
                                          short AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ,
                                          byte AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ,
                                          byte AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ,
                                          String A200BarPieCod ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          short A1691BarPieAnc ,
                                          String A6116BarPieImp ,
                                          byte A201BarPieEst ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          String AV63Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                          int AV17BarCod ,
                                          byte AV18BarCodReo ,
                                          String AV19BarCodPar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, BarPieImp, BarPieEst, BarPieAnc, BarPieMet, BarPieKil, BarPieCod, EmprCod FROM TXPBARPIE" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(BarPieKil > 0)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieAnc,'9990'), 2) like '%' || ?) or ( UPPER(BarPieImp) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV65Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(BarPieCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(BarPieKil >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(BarPieKil <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(BarPieMet >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(BarPieMet <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) )
      {
         addWhere(sWhereString, "(BarPieAnc >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) )
      {
         addWhere(sWhereString, "(BarPieAnc <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV73Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) )
      {
         addWhere(sWhereString, "(BarPieEst >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV74Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(BarPieEst <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV24OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieCod" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieCod DESC" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieKil" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieKil DESC" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieMet" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieMet DESC" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieAnc" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieAnc DESC" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieEst" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieEst DESC" ;
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
                  return conditional_P09C22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09C22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 9);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 9);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

