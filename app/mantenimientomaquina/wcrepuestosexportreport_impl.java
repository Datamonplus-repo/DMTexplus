package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestosexportreport_impl extends GXWebReport
{
   public wcrepuestosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV39Title = httpContext.getMessage( "Lista de Tabla MMOSTR", "") ;
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
         h8VP0( true, 0) ;
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
      if ( ! ( (0==AV41TFMMSCod) && (0==AV42TFMMSCod_To) ) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod de Mov de Stock de Mantto", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFMMSCod), "ZZZZZZZ9")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFMMSCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod de Mov de Stock de Mantto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFMMSCod_To_Description, "")), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFMMSCod_To), "ZZZZZZZ9")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFMMSRNom_Sel)==0) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFMMSRNom_Sel, "")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFMMSRNom)==0) )
         {
            h8VP0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMMSRNom, "")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV18TFMMSRCod) && (0==AV19TFMMSRCod_To) ) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod.", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFMMSRCod), "ZZZZZZZ9")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV26TFMMSRCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFMMSRCod_To_Description, "")), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFMMSRCod_To), "ZZZZZZZ9")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22TFMMSRCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFMMSRCnt_To)==0) ) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TFMMSRCnt, "ZZZZZ9.999")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV27TFMMSRCnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFMMSRCnt_To_Description, "")), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TFMMSRCnt_To, "ZZZZZ9.999")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMMSRTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMMSRTot_To)==0) ) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Total", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFMMSRTot, "ZZZZZZZ9.999")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFMMSRTot_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Total", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFMMSRTot_To_Description, "")), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TFMMSRTot_To, "ZZZZZZZ9.999")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMMSRDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFMMSRDto_To)==0) ) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "% Dto", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TFMMSRDto, "ZZ9.99%")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFMMSRDto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "% Dto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFMMSRDto_To_Description, "")), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TFMMSRDto_To, "ZZ9.99%")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFMMSRPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFMMSRPre_To)==0) ) )
      {
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TFMMSRPre, "ZZZZZZZ9.999")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV28TFMMSRPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VP0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFMMSRPre_To_Description, "")), 25, Gx_line+0, 232, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFMMSRPre_To, "ZZZZZZZ9.999")), 232, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8VP0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8VP0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod de Mov de Stock de Mantto", ""), 30, Gx_line+10, 121, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 125, Gx_line+10, 307, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod.", ""), 311, Gx_line+10, 403, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 407, Gx_line+10, 499, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Total", ""), 503, Gx_line+10, 595, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "% Dto", ""), 599, Gx_line+10, 691, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 695, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV56Mantenimientomaquina_wcrepuestosds_1_emprcod = AV10EmprCod ;
      AV57Mantenimientomaquina_wcrepuestosds_2_mmscod = AV11MMSCod ;
      AV58Mantenimientomaquina_wcrepuestosds_3_tfmmscod = AV41TFMMSCod ;
      AV59Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to = AV42TFMMSCod_To ;
      AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = AV20TFMMSRNom ;
      AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel = AV21TFMMSRNom_Sel ;
      AV62Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod = AV18TFMMSRCod ;
      AV63Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to = AV19TFMMSRCod_To ;
      AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt = AV22TFMMSRCnt ;
      AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to = AV23TFMMSRCnt_To ;
      AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot = AV44TFMMSRTot ;
      AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to = AV45TFMMSRTot_To ;
      AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto = AV46TFMMSRDto ;
      AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to = AV47TFMMSRDto_To ;
      AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre = AV24TFMMSRPre ;
      AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to = AV25TFMMSRPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV58Mantenimientomaquina_wcrepuestosds_3_tfmmscod) ,
                                           Integer.valueOf(AV59Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to) ,
                                           AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel ,
                                           AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ,
                                           Integer.valueOf(AV62Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod) ,
                                           Integer.valueOf(AV63Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to) ,
                                           AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt ,
                                           AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to ,
                                           AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot ,
                                           AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to ,
                                           AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto ,
                                           AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to ,
                                           AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre ,
                                           AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9422MMSRNom ,
                                           Integer.valueOf(A9421MMSRCod) ,
                                           A9409MMSRCnt ,
                                           A11511MMSRTot ,
                                           A11512MMSRDto ,
                                           A9424MMSRPre ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV56Mantenimientomaquina_wcrepuestosds_1_emprcod ,
                                           Integer.valueOf(AV57Mantenimientomaquina_wcrepuestosds_2_mmscod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = GXutil.padr( GXutil.rtrim( AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom), 100, "%") ;
      /* Using cursor P08VP2 */
      pr_default.execute(0, new Object[] {AV56Mantenimientomaquina_wcrepuestosds_1_emprcod, Integer.valueOf(AV57Mantenimientomaquina_wcrepuestosds_2_mmscod), Integer.valueOf(AV58Mantenimientomaquina_wcrepuestosds_3_tfmmscod), Integer.valueOf(AV59Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to), lV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom, AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel, Integer.valueOf(AV62Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod), Integer.valueOf(AV63Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to), AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt, AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to, AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot, AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to, AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto, AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to, AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre, AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9424MMSRPre = P08VP2_A9424MMSRPre[0] ;
         A11512MMSRDto = P08VP2_A11512MMSRDto[0] ;
         A11511MMSRTot = P08VP2_A11511MMSRTot[0] ;
         A9409MMSRCnt = P08VP2_A9409MMSRCnt[0] ;
         A9421MMSRCod = P08VP2_A9421MMSRCod[0] ;
         A9422MMSRNom = P08VP2_A9422MMSRNom[0] ;
         n9422MMSRNom = P08VP2_n9422MMSRNom[0] ;
         A9412MMSCod = P08VP2_A9412MMSCod[0] ;
         A396EmprCod = P08VP2_A396EmprCod[0] ;
         A9422MMSRNom = P08VP2_A9422MMSRNom[0] ;
         n9422MMSRNom = P08VP2_n9422MMSRNom[0] ;
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
         h8VP0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9")), 30, Gx_line+10, 121, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9422MMSRNom, "")), 125, Gx_line+10, 307, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9421MMSRCod), "ZZZZZZZ9")), 311, Gx_line+10, 403, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9409MMSRCnt, "ZZZZZ9.999")), 407, Gx_line+10, 499, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11511MMSRTot, "ZZZZZZZ9.999")), 503, Gx_line+10, 595, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11512MMSRDto, "ZZ9.99%")), 599, Gx_line+10, 691, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9424MMSRPre, "ZZZZZZZ9.999")), 695, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("MantenimientoMaquina.WCRepuestosGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WCRepuestosGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("MantenimientoMaquina.WCRepuestosGridState"), null, null);
      }
      AV12OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV13OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV41TFMMSCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFMMSCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRNOM") == 0 )
         {
            AV20TFMMSRNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRNOM_SEL") == 0 )
         {
            AV21TFMMSRNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRCOD") == 0 )
         {
            AV18TFMMSRCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMMSRCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRCNT") == 0 )
         {
            AV22TFMMSRCnt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFMMSRCnt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRTOT") == 0 )
         {
            AV44TFMMSRTot = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFMMSRTot_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRDTO") == 0 )
         {
            AV46TFMMSRDto = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFMMSRDto_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRPRE") == 0 )
         {
            AV24TFMMSRPre = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFMMSRPre_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MMSCOD") == 0 )
         {
            AV11MMSCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
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

   public void h8VP0( boolean bFoot ,
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
               AV37PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV34DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV39Title = AV52Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV39Title = "" ;
      AV43TFMMSCod_To_Description = "" ;
      AV21TFMMSRNom_Sel = "" ;
      AV20TFMMSRNom = "" ;
      AV26TFMMSRCod_To_Description = "" ;
      AV22TFMMSRCnt = DecimalUtil.ZERO ;
      AV23TFMMSRCnt_To = DecimalUtil.ZERO ;
      AV27TFMMSRCnt_To_Description = "" ;
      AV44TFMMSRTot = DecimalUtil.ZERO ;
      AV45TFMMSRTot_To = DecimalUtil.ZERO ;
      AV48TFMMSRTot_To_Description = "" ;
      AV46TFMMSRDto = DecimalUtil.ZERO ;
      AV47TFMMSRDto_To = DecimalUtil.ZERO ;
      AV49TFMMSRDto_To_Description = "" ;
      AV24TFMMSRPre = DecimalUtil.ZERO ;
      AV25TFMMSRPre_To = DecimalUtil.ZERO ;
      AV28TFMMSRPre_To_Description = "" ;
      A9422MMSRNom = "" ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A11511MMSRTot = DecimalUtil.ZERO ;
      A11512MMSRDto = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      AV56Mantenimientomaquina_wcrepuestosds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = "" ;
      AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel = "" ;
      AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt = DecimalUtil.ZERO ;
      AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to = DecimalUtil.ZERO ;
      AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot = DecimalUtil.ZERO ;
      AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to = DecimalUtil.ZERO ;
      AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto = DecimalUtil.ZERO ;
      AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to = DecimalUtil.ZERO ;
      AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre = DecimalUtil.ZERO ;
      AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom = "" ;
      A396EmprCod = "" ;
      P08VP2_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VP2_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VP2_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VP2_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VP2_A9421MMSRCod = new int[1] ;
      P08VP2_A9422MMSRNom = new String[] {""} ;
      P08VP2_n9422MMSRNom = new boolean[] {false} ;
      P08VP2_A9412MMSCod = new int[1] ;
      P08VP2_A396EmprCod = new String[] {""} ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37PageInfo = "" ;
      AV34DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV52Pgmdesc = "" ;
      AV32AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcrepuestosexportreport__default(),
         new Object[] {
             new Object[] {
            P08VP2_A9424MMSRPre, P08VP2_A11512MMSRDto, P08VP2_A11511MMSRTot, P08VP2_A9409MMSRCnt, P08VP2_A9421MMSRCod, P08VP2_A9422MMSRNom, P08VP2_n9422MMSRNom, P08VP2_A9412MMSCod, P08VP2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV52Pgmdesc = httpContext.getMessage( "Lista de Repuestos en Mov. de Stock", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV52Pgmdesc = httpContext.getMessage( "Lista de Repuestos en Mov. de Stock", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV12OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV41TFMMSCod ;
   private int AV42TFMMSCod_To ;
   private int Gx_OldLine ;
   private int AV18TFMMSRCod ;
   private int AV19TFMMSRCod_To ;
   private int A9412MMSCod ;
   private int A9421MMSRCod ;
   private int AV57Mantenimientomaquina_wcrepuestosds_2_mmscod ;
   private int AV11MMSCod ;
   private int AV58Mantenimientomaquina_wcrepuestosds_3_tfmmscod ;
   private int AV59Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to ;
   private int AV62Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod ;
   private int AV63Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to ;
   private int AV72GXV1 ;
   private java.math.BigDecimal AV22TFMMSRCnt ;
   private java.math.BigDecimal AV23TFMMSRCnt_To ;
   private java.math.BigDecimal AV44TFMMSRTot ;
   private java.math.BigDecimal AV45TFMMSRTot_To ;
   private java.math.BigDecimal AV46TFMMSRDto ;
   private java.math.BigDecimal AV47TFMMSRDto_To ;
   private java.math.BigDecimal AV24TFMMSRPre ;
   private java.math.BigDecimal AV25TFMMSRPre_To ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal A11511MMSRTot ;
   private java.math.BigDecimal A11512MMSRDto ;
   private java.math.BigDecimal A9424MMSRPre ;
   private java.math.BigDecimal AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt ;
   private java.math.BigDecimal AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to ;
   private java.math.BigDecimal AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot ;
   private java.math.BigDecimal AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to ;
   private java.math.BigDecimal AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto ;
   private java.math.BigDecimal AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to ;
   private java.math.BigDecimal AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre ;
   private java.math.BigDecimal AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFMMSRNom_Sel ;
   private String AV20TFMMSRNom ;
   private String A9422MMSRNom ;
   private String AV56Mantenimientomaquina_wcrepuestosds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ;
   private String AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel ;
   private String scmdbuf ;
   private String lV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ;
   private String A396EmprCod ;
   private String AV52Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13OrderedDsc ;
   private boolean n9422MMSRNom ;
   private String AV39Title ;
   private String AV43TFMMSCod_To_Description ;
   private String AV26TFMMSRCod_To_Description ;
   private String AV27TFMMSRCnt_To_Description ;
   private String AV48TFMMSRTot_To_Description ;
   private String AV49TFMMSRDto_To_Description ;
   private String AV28TFMMSRPre_To_Description ;
   private String AV37PageInfo ;
   private String AV34DateInfo ;
   private String AV32AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VP2_A9424MMSRPre ;
   private java.math.BigDecimal[] P08VP2_A11512MMSRDto ;
   private java.math.BigDecimal[] P08VP2_A11511MMSRTot ;
   private java.math.BigDecimal[] P08VP2_A9409MMSRCnt ;
   private int[] P08VP2_A9421MMSRCod ;
   private String[] P08VP2_A9422MMSRNom ;
   private boolean[] P08VP2_n9422MMSRNom ;
   private int[] P08VP2_A9412MMSCod ;
   private String[] P08VP2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class wcrepuestosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV58Mantenimientomaquina_wcrepuestosds_3_tfmmscod ,
                                          int AV59Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to ,
                                          String AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel ,
                                          String AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom ,
                                          int AV62Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod ,
                                          int AV63Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to ,
                                          java.math.BigDecimal AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt ,
                                          java.math.BigDecimal AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to ,
                                          java.math.BigDecimal AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot ,
                                          java.math.BigDecimal AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to ,
                                          java.math.BigDecimal AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto ,
                                          java.math.BigDecimal AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to ,
                                          java.math.BigDecimal AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre ,
                                          java.math.BigDecimal AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to ,
                                          int A9412MMSCod ,
                                          String A9422MMSRNom ,
                                          int A9421MMSRCod ,
                                          java.math.BigDecimal A9409MMSRCnt ,
                                          java.math.BigDecimal A11511MMSRTot ,
                                          java.math.BigDecimal A11512MMSRDto ,
                                          java.math.BigDecimal A9424MMSRPre ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV56Mantenimientomaquina_wcrepuestosds_1_emprcod ,
                                          int AV57Mantenimientomaquina_wcrepuestosds_2_mmscod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MMSRPre, T1.MMSRDto, T1.MMSRTot, T1.MMSRCnt, T1.MMSRCod AS MMSRCod, T2.MRNom AS MMSRNom, T1.MMSCod, T1.EmprCod FROM (TXPMMoStR T1 INNER JOIN TXPMREPUE" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MMSRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MMSCod = ?)");
      if ( ! (0==AV58Mantenimientomaquina_wcrepuestosds_3_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV59Mantenimientomaquina_wcrepuestosds_4_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Mantenimientomaquina_wcrepuestosds_5_tfmmsrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Mantenimientomaquina_wcrepuestosds_6_tfmmsrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV62Mantenimientomaquina_wcrepuestosds_7_tfmmsrcod) )
      {
         addWhere(sWhereString, "(T1.MMSRCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV63Mantenimientomaquina_wcrepuestosds_8_tfmmsrcod_to) )
      {
         addWhere(sWhereString, "(T1.MMSRCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Mantenimientomaquina_wcrepuestosds_9_tfmmsrcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRCnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Mantenimientomaquina_wcrepuestosds_10_tfmmsrcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRCnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Mantenimientomaquina_wcrepuestosds_11_tfmmsrtot)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRTot >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Mantenimientomaquina_wcrepuestosds_12_tfmmsrtot_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRTot <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Mantenimientomaquina_wcrepuestosds_13_tfmmsrdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRDto >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Mantenimientomaquina_wcrepuestosds_14_tfmmsrdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRDto <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Mantenimientomaquina_wcrepuestosds_15_tfmmsrpre)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRPre >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Mantenimientomaquina_wcrepuestosds_16_tfmmsrpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRPre <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T2.MRNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T2.MRNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRCnt" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRCnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRTot" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRTot DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRDto" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRDto DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRPre" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRPre DESC" ;
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
                  return conditional_P08VP2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               return;
      }
   }

}

