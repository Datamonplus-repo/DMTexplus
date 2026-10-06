package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeprocesosquimicos_wcexportreport_impl extends GXWebReport
{
   public listadodeprocesosquimicos_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV40Title = httpContext.getMessage( "Lista de Mantenimiento de Procesos Quimicos", "") ;
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
         h9TX0( true, 0) ;
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
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFProForCod_Sel)==0) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFProForCod_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFProForCod)==0) )
         {
            h9TX0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFProForCod, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFProForDsc_Sel)==0) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFProForDsc_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFProForDsc)==0) )
         {
            h9TX0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFProForDsc, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFProForMat_Sel)==0) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Materia", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFProForMat_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFProForMat)==0) )
         {
            h9TX0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Materia", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFProForMat, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV27TFProForTie) && (0==AV28TFProForTie_To) ) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFProForTie), "ZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV29TFProForTie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tiempo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFProForTie_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFProForTie_To), "ZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV50TFProForTmx) && (0==AV51TFProForTmx_To) ) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Temp.", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFProForTmx), "ZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV52TFProForTmx_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Temp.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFProForTmx_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFProForTmx_To), "ZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV44TFProNumPro) && (0==AV45TFProNumPro_To) ) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Prog.", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFProNumPro), "ZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFProNumPro_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Prog.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFProNumPro_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFProNumPro_To), "ZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV46TFProNumRec) && (0==AV47TFProNumRec_To) ) )
      {
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Receta", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFProNumRec), "ZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFProNumRec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Receta", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9TX0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFProNumRec_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFProNumRec_To), "ZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9TX0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9TX0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 30, Gx_line+10, 111, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 115, Gx_line+10, 277, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Materia", ""), 281, Gx_line+10, 443, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 447, Gx_line+10, 529, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Temp.", ""), 533, Gx_line+10, 615, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Prog.", ""), 619, Gx_line+10, 701, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Receta", ""), 705, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = AV23TFProForCod ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = AV24TFProForCod_Sel ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = AV25TFProForDsc ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = AV26TFProForDsc_Sel ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = AV42TFProForMat ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = AV43TFProForMat_Sel ;
      AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie = AV27TFProForTie ;
      AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to = AV28TFProForTie_To ;
      AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx = AV50TFProForTmx ;
      AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to = AV51TFProForTmx_To ;
      AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro = AV44TFProNumPro ;
      AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to = AV45TFProNumPro_To ;
      AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec = AV46TFProNumRec ;
      AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to = AV47TFProNumRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                           AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                           AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                           AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                           AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                           AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                           AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                           Short.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) ,
                                           Short.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) ,
                                           Short.valueOf(AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) ,
                                           Short.valueOf(AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) ,
                                           Integer.valueOf(AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) ,
                                           Integer.valueOf(AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) ,
                                           Integer.valueOf(AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) ,
                                           Integer.valueOf(AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) ,
                                           AV12Proforcodfrom ,
                                           AV13Proforcodto ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A769ProForMat ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Integer.valueOf(A2392ProNumPro) ,
                                           Integer.valueOf(A2393ProNumRec) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A13133ProForAct ,
                                           AV15Proforact ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod), 6, "%") ;
      lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc), 30, "%") ;
      lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat), 16, "%") ;
      /* Using cursor P09TX2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV15Proforact, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod, AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel, lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc, AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel, lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat, AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel, Short.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie), Short.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to), Short.valueOf(AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx), Short.valueOf(AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to), Integer.valueOf(AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro), Integer.valueOf(AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to), Integer.valueOf(AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec), Integer.valueOf(AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to), AV12Proforcodfrom, AV13Proforcodto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13133ProForAct = P09TX2_A13133ProForAct[0] ;
         A396EmprCod = P09TX2_A396EmprCod[0] ;
         A2393ProNumRec = P09TX2_A2393ProNumRec[0] ;
         A2392ProNumPro = P09TX2_A2392ProNumPro[0] ;
         A772ProForTmx = P09TX2_A772ProForTmx[0] ;
         A771ProForTie = P09TX2_A771ProForTie[0] ;
         A769ProForMat = P09TX2_A769ProForMat[0] ;
         A766ProForDsc = P09TX2_A766ProForDsc[0] ;
         A764ProForCod = P09TX2_A764ProForCod[0] ;
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
         h9TX0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 30, Gx_line+10, 111, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 115, Gx_line+10, 277, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A769ProForMat, "")), 281, Gx_line+10, 443, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 447, Gx_line+10, 529, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9")), 533, Gx_line+10, 615, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9")), 619, Gx_line+10, 701, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9")), 705, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV23TFProForCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV24TFProForCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV25TFProForDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV26TFProForDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT") == 0 )
         {
            AV42TFProForMat = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT_SEL") == 0 )
         {
            AV43TFProForMat_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTIE") == 0 )
         {
            AV27TFProForTie = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFProForTie_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTMX") == 0 )
         {
            AV50TFProForTmx = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFProForTmx_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMPRO") == 0 )
         {
            AV44TFProNumPro = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFProNumPro_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMREC") == 0 )
         {
            AV46TFProNumRec = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFProNumRec_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&IMPCOD") == 0 )
         {
            AV11Impcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODFROM") == 0 )
         {
            AV12Proforcodfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODTO") == 0 )
         {
            AV13Proforcodto = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORABS") == 0 )
         {
            AV14ProforAbs = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORACT") == 0 )
         {
            AV15Proforact = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
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

   public void h9TX0( boolean bFoot ,
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
               AV38PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV35DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV40Title = AV55Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV40Title = "" ;
      AV18FilterFullText = "" ;
      AV24TFProForCod_Sel = "" ;
      AV23TFProForCod = "" ;
      AV26TFProForDsc_Sel = "" ;
      AV25TFProForDsc = "" ;
      AV43TFProForMat_Sel = "" ;
      AV42TFProForMat = "" ;
      AV29TFProForTie_To_Description = "" ;
      AV52TFProForTmx_To_Description = "" ;
      AV48TFProNumPro_To_Description = "" ;
      AV49TFProNumRec_To_Description = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A769ProForMat = "" ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = "" ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = "" ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = "" ;
      scmdbuf = "" ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV12Proforcodfrom = "" ;
      AV13Proforcodto = "" ;
      A13133ProForAct = "" ;
      AV15Proforact = "" ;
      AV10Emprcod = "" ;
      A396EmprCod = "" ;
      P09TX2_A13133ProForAct = new String[] {""} ;
      P09TX2_A396EmprCod = new String[] {""} ;
      P09TX2_A2393ProNumRec = new int[1] ;
      P09TX2_A2392ProNumPro = new int[1] ;
      P09TX2_A772ProForTmx = new short[1] ;
      P09TX2_A771ProForTie = new short[1] ;
      P09TX2_A769ProForMat = new String[] {""} ;
      P09TX2_A766ProForDsc = new String[] {""} ;
      P09TX2_A764ProForCod = new String[] {""} ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV11Impcod = "" ;
      AV14ProforAbs = DecimalUtil.ZERO ;
      AV38PageInfo = "" ;
      AV35DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV55Pgmdesc = "" ;
      AV33AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeprocesosquimicos_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09TX2_A13133ProForAct, P09TX2_A396EmprCod, P09TX2_A2393ProNumRec, P09TX2_A2392ProNumPro, P09TX2_A772ProForTmx, P09TX2_A771ProForTie, P09TX2_A769ProForMat, P09TX2_A766ProForDsc, P09TX2_A764ProForCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "Listado Procesos Quimicos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "Listado Procesos Quimicos", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV27TFProForTie ;
   private short AV28TFProForTie_To ;
   private short AV50TFProForTmx ;
   private short AV51TFProForTmx_To ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ;
   private short AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ;
   private short AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ;
   private short AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV44TFProNumPro ;
   private int AV45TFProNumPro_To ;
   private int AV46TFProNumRec ;
   private int AV47TFProNumRec_To ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ;
   private int AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ;
   private int AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ;
   private int AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ;
   private int AV74GXV1 ;
   private java.math.BigDecimal AV14ProforAbs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24TFProForCod_Sel ;
   private String AV23TFProForCod ;
   private String AV26TFProForDsc_Sel ;
   private String AV25TFProForDsc ;
   private String AV43TFProForMat_Sel ;
   private String AV42TFProForMat ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A769ProForMat ;
   private String AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ;
   private String AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ;
   private String AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ;
   private String scmdbuf ;
   private String lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV12Proforcodfrom ;
   private String AV13Proforcodto ;
   private String A13133ProForAct ;
   private String AV15Proforact ;
   private String AV10Emprcod ;
   private String A396EmprCod ;
   private String AV11Impcod ;
   private String AV55Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV40Title ;
   private String AV18FilterFullText ;
   private String AV29TFProForTie_To_Description ;
   private String AV52TFProForTmx_To_Description ;
   private String AV48TFProNumPro_To_Description ;
   private String AV49TFProNumRec_To_Description ;
   private String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String AV38PageInfo ;
   private String AV35DateInfo ;
   private String AV33AppName ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09TX2_A13133ProForAct ;
   private String[] P09TX2_A396EmprCod ;
   private int[] P09TX2_A2393ProNumRec ;
   private int[] P09TX2_A2392ProNumPro ;
   private short[] P09TX2_A772ProForTmx ;
   private short[] P09TX2_A771ProForTie ;
   private String[] P09TX2_A769ProForMat ;
   private String[] P09TX2_A766ProForDsc ;
   private String[] P09TX2_A764ProForCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class listadodeprocesosquimicos_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09TX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                          String AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                          String AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                          String AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                          String AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                          String AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                          String AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                          short AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ,
                                          short AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ,
                                          short AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ,
                                          short AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ,
                                          int AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ,
                                          int AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ,
                                          int AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ,
                                          int AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ,
                                          String AV12Proforcodfrom ,
                                          String AV13Proforcodto ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A769ProForMat ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          int A2392ProNumPro ,
                                          int A2393ProNumRec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A13133ProForAct ,
                                          String AV15Proforact ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProForAct, EmprCod, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForMat, ProForDsc, ProForCod FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumPro,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumRec,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) )
      {
         addWhere(sWhereString, "(ProForMat = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) )
      {
         addWhere(sWhereString, "(ProNumPro >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) )
      {
         addWhere(sWhereString, "(ProNumPro <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) )
      {
         addWhere(sWhereString, "(ProNumRec >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) )
      {
         addWhere(sWhereString, "(ProNumRec <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12Proforcodfrom)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13Proforcodto)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForMat" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForMat DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTie" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTie DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTmx" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTmx DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProNumPro" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProNumPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProNumRec" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProNumRec DESC" ;
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
                  return conditional_P09TX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               return;
      }
   }

}

