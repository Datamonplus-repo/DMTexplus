package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wc_tminvstexportreport_impl extends GXWebReport
{
   public wc_tminvstexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV52Title = httpContext.getMessage( "Lista de Tabla MInv St (Inventarios de Stocks)", "") ;
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
         h8WQ0( true, 0) ;
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
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV56TFMISRCod) && (0==AV57TFMISRCod_To) ) )
      {
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFMISRCod), "ZZZZZZZ9")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV68TFMISRCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Repuesto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFMISRCod_To_Description, "")), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFMISRCod_To), "ZZZZZZZ9")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFMISRNom_Sel)==0) )
      {
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFMISRNom_Sel, "")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFMISRNom)==0) )
         {
            h8WQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFMISRNom, "")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFMISRStkAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFMISRStkAct_To)==0) ) )
      {
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Actual", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60TFMISRStkAct, "Z,ZZZ,ZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV69TFMISRStkAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFMISRStkAct_To_Description, "")), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61TFMISRStkAct_To, "Z,ZZZ,ZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFMISRStkTeo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFMISRStkTeo_To)==0) ) )
      {
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Teorico", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62TFMISRStkTeo, "ZZZZZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV70TFMISRStkTeo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Teorico", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFMISRStkTeo_To_Description, "")), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63TFMISRStkTeo_To, "ZZZZZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMISRStkRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMISRStkRea_To)==0) ) )
      {
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Real", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TFMISRStkRea, "ZZZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV71TFMISRStkRea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Real", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFMISRStkRea_To_Description, "")), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TFMISRStkRea_To, "ZZZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFMISRStkDif)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFMISRStkDif_To)==0) ) )
      {
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Diferencia de Stock", ""), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66TFMISRStkDif, "ZZZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV72TFMISRStkDif_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Diferencia de Stock", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8WQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFMISRStkDif_To_Description, "")), 25, Gx_line+0, 168, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TFMISRStkDif_To, "ZZZZZ9.999")), 168, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8WQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8WQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 30, Gx_line+10, 135, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 139, Gx_line+10, 349, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Actual", ""), 353, Gx_line+10, 458, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Teorico", ""), 462, Gx_line+10, 567, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Real", ""), 571, Gx_line+10, 677, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Diferencia de Stock", ""), 681, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV79Mantenimientomaquina_wc_tminvstds_1_emprcod = AV54EmprCod ;
      AV80Mantenimientomaquina_wc_tminvstds_2_miscod = AV55MISCod ;
      AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = AV12FilterFullText ;
      AV82Mantenimientomaquina_wc_tminvstds_4_tfmisrcod = AV56TFMISRCod ;
      AV83Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to = AV57TFMISRCod_To ;
      AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = AV58TFMISRNom ;
      AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel = AV59TFMISRNom_Sel ;
      AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact = AV60TFMISRStkAct ;
      AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to = AV61TFMISRStkAct_To ;
      AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo = AV62TFMISRStkTeo ;
      AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to = AV63TFMISRStkTeo_To ;
      AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea = AV64TFMISRStkRea ;
      AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to = AV65TFMISRStkRea_To ;
      AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif = AV66TFMISRStkDif ;
      AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to = AV67TFMISRStkDif_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext ,
                                           Integer.valueOf(AV82Mantenimientomaquina_wc_tminvstds_4_tfmisrcod) ,
                                           Integer.valueOf(AV83Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to) ,
                                           AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ,
                                           AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ,
                                           AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ,
                                           AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ,
                                           AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ,
                                           AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ,
                                           AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ,
                                           AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ,
                                           AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ,
                                           AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ,
                                           Integer.valueOf(A9403MISRCod) ,
                                           A9404MISRNom ,
                                           A9405MISRStkAct ,
                                           A9406MISRStkTeo ,
                                           A9407MISRStkRea ,
                                           A9408MISRStkDif ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV79Mantenimientomaquina_wc_tminvstds_1_emprcod ,
                                           Integer.valueOf(AV80Mantenimientomaquina_wc_tminvstds_2_miscod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A9398MISCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext), "%", "") ;
      lV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = GXutil.padr( GXutil.rtrim( AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom), 100, "%") ;
      /* Using cursor P08WQ2 */
      pr_default.execute(0, new Object[] {AV79Mantenimientomaquina_wc_tminvstds_1_emprcod, Integer.valueOf(AV80Mantenimientomaquina_wc_tminvstds_2_miscod), lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext, lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext, Integer.valueOf(AV82Mantenimientomaquina_wc_tminvstds_4_tfmisrcod), Integer.valueOf(AV83Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to), lV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom, AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel, AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact, AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to, AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo, AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to, AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea, AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to, AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif, AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9408MISRStkDif = P08WQ2_A9408MISRStkDif[0] ;
         A9407MISRStkRea = P08WQ2_A9407MISRStkRea[0] ;
         A9406MISRStkTeo = P08WQ2_A9406MISRStkTeo[0] ;
         A9405MISRStkAct = P08WQ2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WQ2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WQ2_A9404MISRNom[0] ;
         n9404MISRNom = P08WQ2_n9404MISRNom[0] ;
         A9403MISRCod = P08WQ2_A9403MISRCod[0] ;
         A9398MISCod = P08WQ2_A9398MISCod[0] ;
         A396EmprCod = P08WQ2_A396EmprCod[0] ;
         A9399MISFch = P08WQ2_A9399MISFch[0] ;
         n9399MISFch = P08WQ2_n9399MISFch[0] ;
         A9399MISFch = P08WQ2_A9399MISFch[0] ;
         n9399MISFch = P08WQ2_n9399MISFch[0] ;
         A9405MISRStkAct = P08WQ2_A9405MISRStkAct[0] ;
         n9405MISRStkAct = P08WQ2_n9405MISRStkAct[0] ;
         A9404MISRNom = P08WQ2_A9404MISRNom[0] ;
         n9404MISRNom = P08WQ2_n9404MISRNom[0] ;
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
         h8WQ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9403MISRCod), "ZZZZZZZ9")), 30, Gx_line+10, 135, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9404MISRNom, "")), 139, Gx_line+10, 349, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9405MISRStkAct, "Z,ZZZ,ZZZ9.999")), 353, Gx_line+10, 458, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999")), 462, Gx_line+10, 567, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9407MISRStkRea, "ZZZZZ9.999")), 571, Gx_line+10, 677, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9408MISRStkDif, "ZZZZZ9.999")), 681, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("MantenimientoMaquina.WC_TMInvStGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WC_TMInvStGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("MantenimientoMaquina.WC_TMInvStGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRCOD") == 0 )
         {
            AV56TFMISRCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFMISRCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM") == 0 )
         {
            AV58TFMISRNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRNOM_SEL") == 0 )
         {
            AV59TFMISRNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKACT") == 0 )
         {
            AV60TFMISRStkAct = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFMISRStkAct_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKTEO") == 0 )
         {
            AV62TFMISRStkTeo = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFMISRStkTeo_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKREA") == 0 )
         {
            AV64TFMISRStkRea = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFMISRStkRea_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISRSTKDIF") == 0 )
         {
            AV66TFMISRStkDif = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFMISRStkDif_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV54EmprCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MISCOD") == 0 )
         {
            AV55MISCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
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

   public void h8WQ0( boolean bFoot ,
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
               AV50PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV47DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV52Title = AV75Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV52Title = "" ;
      AV12FilterFullText = "" ;
      AV68TFMISRCod_To_Description = "" ;
      AV59TFMISRNom_Sel = "" ;
      AV58TFMISRNom = "" ;
      AV60TFMISRStkAct = DecimalUtil.ZERO ;
      AV61TFMISRStkAct_To = DecimalUtil.ZERO ;
      AV69TFMISRStkAct_To_Description = "" ;
      AV62TFMISRStkTeo = DecimalUtil.ZERO ;
      AV63TFMISRStkTeo_To = DecimalUtil.ZERO ;
      AV70TFMISRStkTeo_To_Description = "" ;
      AV64TFMISRStkRea = DecimalUtil.ZERO ;
      AV65TFMISRStkRea_To = DecimalUtil.ZERO ;
      AV71TFMISRStkRea_To_Description = "" ;
      AV66TFMISRStkDif = DecimalUtil.ZERO ;
      AV67TFMISRStkDif_To = DecimalUtil.ZERO ;
      AV72TFMISRStkDif_To_Description = "" ;
      A9404MISRNom = "" ;
      A9405MISRStkAct = DecimalUtil.ZERO ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      AV79Mantenimientomaquina_wc_tminvstds_1_emprcod = "" ;
      AV54EmprCod = "" ;
      AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = "" ;
      AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = "" ;
      AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel = "" ;
      AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact = DecimalUtil.ZERO ;
      AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to = DecimalUtil.ZERO ;
      AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo = DecimalUtil.ZERO ;
      AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to = DecimalUtil.ZERO ;
      AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea = DecimalUtil.ZERO ;
      AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to = DecimalUtil.ZERO ;
      AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif = DecimalUtil.ZERO ;
      AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext = "" ;
      lV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom = "" ;
      A396EmprCod = "" ;
      P08WQ2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WQ2_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WQ2_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WQ2_A9405MISRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08WQ2_n9405MISRStkAct = new boolean[] {false} ;
      P08WQ2_A9404MISRNom = new String[] {""} ;
      P08WQ2_n9404MISRNom = new boolean[] {false} ;
      P08WQ2_A9403MISRCod = new int[1] ;
      P08WQ2_A9398MISCod = new int[1] ;
      P08WQ2_A396EmprCod = new String[] {""} ;
      P08WQ2_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08WQ2_n9399MISFch = new boolean[] {false} ;
      A9399MISFch = GXutil.nullDate() ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50PageInfo = "" ;
      AV47DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV75Pgmdesc = "" ;
      AV45AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wc_tminvstexportreport__default(),
         new Object[] {
             new Object[] {
            P08WQ2_A9408MISRStkDif, P08WQ2_A9407MISRStkRea, P08WQ2_A9406MISRStkTeo, P08WQ2_A9405MISRStkAct, P08WQ2_n9405MISRStkAct, P08WQ2_A9404MISRNom, P08WQ2_n9404MISRNom, P08WQ2_A9403MISRCod, P08WQ2_A9398MISCod, P08WQ2_A396EmprCod,
            P08WQ2_A9399MISFch, P08WQ2_n9399MISFch
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV75Pgmdesc = httpContext.getMessage( "Lista de Movimientos Inventario de Stock", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV75Pgmdesc = httpContext.getMessage( "Lista de Movimientos Inventario de Stock", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV56TFMISRCod ;
   private int AV57TFMISRCod_To ;
   private int A9403MISRCod ;
   private int AV80Mantenimientomaquina_wc_tminvstds_2_miscod ;
   private int AV55MISCod ;
   private int AV82Mantenimientomaquina_wc_tminvstds_4_tfmisrcod ;
   private int AV83Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to ;
   private int A9398MISCod ;
   private int AV94GXV1 ;
   private java.math.BigDecimal AV60TFMISRStkAct ;
   private java.math.BigDecimal AV61TFMISRStkAct_To ;
   private java.math.BigDecimal AV62TFMISRStkTeo ;
   private java.math.BigDecimal AV63TFMISRStkTeo_To ;
   private java.math.BigDecimal AV64TFMISRStkRea ;
   private java.math.BigDecimal AV65TFMISRStkRea_To ;
   private java.math.BigDecimal AV66TFMISRStkDif ;
   private java.math.BigDecimal AV67TFMISRStkDif_To ;
   private java.math.BigDecimal A9405MISRStkAct ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ;
   private java.math.BigDecimal AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ;
   private java.math.BigDecimal AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ;
   private java.math.BigDecimal AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ;
   private java.math.BigDecimal AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ;
   private java.math.BigDecimal AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ;
   private java.math.BigDecimal AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ;
   private java.math.BigDecimal AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV59TFMISRNom_Sel ;
   private String AV58TFMISRNom ;
   private String A9404MISRNom ;
   private String AV79Mantenimientomaquina_wc_tminvstds_1_emprcod ;
   private String AV54EmprCod ;
   private String AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ;
   private String AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ;
   private String scmdbuf ;
   private String lV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ;
   private String A396EmprCod ;
   private String AV75Pgmdesc ;
   private java.util.Date A9399MISFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9405MISRStkAct ;
   private boolean n9404MISRNom ;
   private boolean n9399MISFch ;
   private String AV52Title ;
   private String AV12FilterFullText ;
   private String AV68TFMISRCod_To_Description ;
   private String AV69TFMISRStkAct_To_Description ;
   private String AV70TFMISRStkTeo_To_Description ;
   private String AV71TFMISRStkRea_To_Description ;
   private String AV72TFMISRStkDif_To_Description ;
   private String AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext ;
   private String lV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext ;
   private String AV50PageInfo ;
   private String AV47DateInfo ;
   private String AV45AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08WQ2_A9408MISRStkDif ;
   private java.math.BigDecimal[] P08WQ2_A9407MISRStkRea ;
   private java.math.BigDecimal[] P08WQ2_A9406MISRStkTeo ;
   private java.math.BigDecimal[] P08WQ2_A9405MISRStkAct ;
   private boolean[] P08WQ2_n9405MISRStkAct ;
   private String[] P08WQ2_A9404MISRNom ;
   private boolean[] P08WQ2_n9404MISRNom ;
   private int[] P08WQ2_A9403MISRCod ;
   private int[] P08WQ2_A9398MISCod ;
   private String[] P08WQ2_A396EmprCod ;
   private java.util.Date[] P08WQ2_A9399MISFch ;
   private boolean[] P08WQ2_n9399MISFch ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class wc_tminvstexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext ,
                                          int AV82Mantenimientomaquina_wc_tminvstds_4_tfmisrcod ,
                                          int AV83Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to ,
                                          String AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel ,
                                          String AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom ,
                                          java.math.BigDecimal AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact ,
                                          java.math.BigDecimal AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to ,
                                          java.math.BigDecimal AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo ,
                                          java.math.BigDecimal AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to ,
                                          java.math.BigDecimal AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea ,
                                          java.math.BigDecimal AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to ,
                                          java.math.BigDecimal AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif ,
                                          java.math.BigDecimal AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to ,
                                          int A9403MISRCod ,
                                          String A9404MISRNom ,
                                          java.math.BigDecimal A9405MISRStkAct ,
                                          java.math.BigDecimal A9406MISRStkTeo ,
                                          java.math.BigDecimal A9407MISRStkRea ,
                                          java.math.BigDecimal A9408MISRStkDif ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV79Mantenimientomaquina_wc_tminvstds_1_emprcod ,
                                          int AV80Mantenimientomaquina_wc_tminvstds_2_miscod ,
                                          String A396EmprCod ,
                                          int A9398MISCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MISRStkDif, T1.MISRStkRea, T1.MISRStkTeo, T3.MRStkAct AS MISRStkAct, T3.MRNom AS MISRNom, T1.MISRCod AS MISRCod, T1.MISCod, T1.EmprCod, T2.MISFch FROM" ;
      scmdbuf += " ((TXPMInSRe T1 INNER JOIN TXPMINVST T2 ON T2.EmprCod = T1.EmprCod AND T2.MISCod = T1.MISCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = T1.EmprCod AND T3.MRCod = T1.MISRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MISCod = ?)");
      if ( ! (GXutil.strcmp("", AV81Mantenimientomaquina_wc_tminvstds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MISRCod,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkTeo,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkRea,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MISRStkDif,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV82Mantenimientomaquina_wc_tminvstds_4_tfmisrcod) )
      {
         addWhere(sWhereString, "(T1.MISRCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientomaquina_wc_tminvstds_5_tfmisrcod_to) )
      {
         addWhere(sWhereString, "(T1.MISRCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Mantenimientomaquina_wc_tminvstds_6_tfmisrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_wc_tminvstds_7_tfmisrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MRNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Mantenimientomaquina_wc_tminvstds_8_tfmisrstkact)==0) )
      {
         addWhere(sWhereString, "(T3.MRStkAct >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Mantenimientomaquina_wc_tminvstds_9_tfmisrstkact_to)==0) )
      {
         addWhere(sWhereString, "(T3.MRStkAct <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Mantenimientomaquina_wc_tminvstds_10_tfmisrstkteo)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Mantenimientomaquina_wc_tminvstds_11_tfmisrstkteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkTeo <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Mantenimientomaquina_wc_tminvstds_12_tfmisrstkrea)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Mantenimientomaquina_wc_tminvstds_13_tfmisrstkrea_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkRea <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Mantenimientomaquina_wc_tminvstds_14_tfmisrstkdif)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Mantenimientomaquina_wc_tminvstds_15_tfmisrstkdif_to)==0) )
      {
         addWhere(sWhereString, "(T1.MISRStkDif <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T2.MISFch" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T3.MRNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T3.MRNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T3.MRStkAct" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T3.MRStkAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkTeo" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkTeo DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkRea" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkRea DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MISCod, T1.MISRStkDif" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MISCod DESC, T1.MISRStkDif DESC" ;
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
                  return conditional_P08WQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

