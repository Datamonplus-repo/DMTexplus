package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tparfaswwexportreport_impl extends GXWebReport
{
   public tparfaswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV69Title = httpContext.getMessage( "Lista de PARAMETROS FASES PRODUCCION", "") ;
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
         h80P0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV75FilterFullText)==0) )
      {
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75FilterFullText, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV40TFParFasCod) && (0==AV41TFParFasCod_To) ) )
      {
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Parametro Fase", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFParFasCod), "ZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV56TFParFasCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Parametro Fase", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFParFasCod_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFParFasCod_To), "ZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV43TFParFasDsc_Sel)==0) )
      {
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFParFasDsc_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFParFasDsc)==0) )
         {
            h80P0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFParFasDsc, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV52TFParUndID) && (0==AV53TFParUndID_To) ) )
      {
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52TFParUndID), "ZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV59TFParUndID_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFParUndID_To_Description, "")), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFParUndID_To), "ZZZ9")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFParUndDsc_Sel)==0) )
      {
         h80P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFParUndDsc_Sel, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV54TFParUndDsc)==0) )
         {
            h80P0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 185, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFParUndDsc, "")), 185, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h80P0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h80P0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Parametro Fase", ""), 30, Gx_line+10, 179, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 183, Gx_line+10, 481, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 485, Gx_line+10, 634, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 638, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV91Ficherosbasicos_tparfaswwds_1_filterfulltext = AV75FilterFullText ;
      AV92Ficherosbasicos_tparfaswwds_2_tfparfascod = AV40TFParFasCod ;
      AV93Ficherosbasicos_tparfaswwds_3_tfparfascod_to = AV41TFParFasCod_To ;
      AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc = AV42TFParFasDsc ;
      AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = AV43TFParFasDsc_Sel ;
      AV96Ficherosbasicos_tparfaswwds_6_tfparundid = AV52TFParUndID ;
      AV97Ficherosbasicos_tparfaswwds_7_tfparundid_to = AV53TFParUndID_To ;
      AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc = AV54TFParUndDsc ;
      AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = AV55TFParUndDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV91Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                           Short.valueOf(AV92Ficherosbasicos_tparfaswwds_2_tfparfascod) ,
                                           Short.valueOf(AV93Ficherosbasicos_tparfaswwds_3_tfparfascod_to) ,
                                           AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                           AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                           Short.valueOf(AV96Ficherosbasicos_tparfaswwds_6_tfparundid) ,
                                           Short.valueOf(AV97Ficherosbasicos_tparfaswwds_7_tfparundid_to) ,
                                           AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                           AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                           Short.valueOf(A1664ParFasCod) ,
                                           A1665ParFasDsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV91Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV91Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV91Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV91Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc = GXutil.padr( GXutil.rtrim( AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc), 30, "%") ;
      lV98Ficherosbasicos_tparfaswwds_8_tfparunddsc = GXutil.padr( GXutil.rtrim( AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc), 15, "%") ;
      /* Using cursor P080P2 */
      pr_default.execute(0, new Object[] {lV91Ficherosbasicos_tparfaswwds_1_filterfulltext, lV91Ficherosbasicos_tparfaswwds_1_filterfulltext, lV91Ficherosbasicos_tparfaswwds_1_filterfulltext, lV91Ficherosbasicos_tparfaswwds_1_filterfulltext, Short.valueOf(AV92Ficherosbasicos_tparfaswwds_2_tfparfascod), Short.valueOf(AV93Ficherosbasicos_tparfaswwds_3_tfparfascod_to), lV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc, AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel, Short.valueOf(AV96Ficherosbasicos_tparfaswwds_6_tfparundid), Short.valueOf(AV97Ficherosbasicos_tparfaswwds_7_tfparundid_to), lV98Ficherosbasicos_tparfaswwds_8_tfparunddsc, AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P080P2_A396EmprCod[0] ;
         A13204ParUndDsc = P080P2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080P2_n13204ParUndDsc[0] ;
         A13203ParUndID = P080P2_A13203ParUndID[0] ;
         n13203ParUndID = P080P2_n13203ParUndID[0] ;
         A1665ParFasDsc = P080P2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P080P2_n1665ParFasDsc[0] ;
         A1664ParFasCod = P080P2_A1664ParFasCod[0] ;
         A13204ParUndDsc = P080P2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080P2_n13204ParUndDsc[0] ;
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
         h80P0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")), 30, Gx_line+10, 179, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 183, Gx_line+10, 481, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13203ParUndID), "ZZZ9")), 485, Gx_line+10, 634, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13204ParUndDsc, "")), 638, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV36Session.getValue("FicherosBasicos.TPARFASWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      AV10OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV75FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASCOD") == 0 )
         {
            AV40TFParFasCod = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFParFasCod_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC") == 0 )
         {
            AV42TFParFasDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC_SEL") == 0 )
         {
            AV43TFParFasDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV52TFParUndID = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFParUndID_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV54TFParUndDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV55TFParUndDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
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

   public void h80P0( boolean bFoot ,
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
               AV66PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV62DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV69Title = AV87Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV69Title = "" ;
      AV75FilterFullText = "" ;
      AV56TFParFasCod_To_Description = "" ;
      AV43TFParFasDsc_Sel = "" ;
      AV42TFParFasDsc = "" ;
      AV59TFParUndID_To_Description = "" ;
      AV55TFParUndDsc_Sel = "" ;
      AV54TFParUndDsc = "" ;
      A1665ParFasDsc = "" ;
      A13204ParUndDsc = "" ;
      AV91Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = "" ;
      AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = "" ;
      scmdbuf = "" ;
      lV91Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      lV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      lV98Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      P080P2_A396EmprCod = new String[] {""} ;
      P080P2_A13204ParUndDsc = new String[] {""} ;
      P080P2_n13204ParUndDsc = new boolean[] {false} ;
      P080P2_A13203ParUndID = new short[1] ;
      P080P2_n13203ParUndID = new boolean[] {false} ;
      P080P2_A1665ParFasDsc = new String[] {""} ;
      P080P2_n1665ParFasDsc = new boolean[] {false} ;
      P080P2_A1664ParFasCod = new short[1] ;
      A396EmprCod = "" ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV66PageInfo = "" ;
      AV62DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV87Pgmdesc = "" ;
      AV81AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfaswwexportreport__default(),
         new Object[] {
             new Object[] {
            P080P2_A396EmprCod, P080P2_A13204ParUndDsc, P080P2_n13204ParUndDsc, P080P2_A13203ParUndID, P080P2_n13203ParUndID, P080P2_A1665ParFasDsc, P080P2_n1665ParFasDsc, P080P2_A1664ParFasCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV87Pgmdesc = httpContext.getMessage( "Listado Parametros Fase", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV87Pgmdesc = httpContext.getMessage( "Listado Parametros Fase", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV40TFParFasCod ;
   private short AV41TFParFasCod_To ;
   private short AV52TFParUndID ;
   private short AV53TFParUndID_To ;
   private short A1664ParFasCod ;
   private short A13203ParUndID ;
   private short AV92Ficherosbasicos_tparfaswwds_2_tfparfascod ;
   private short AV93Ficherosbasicos_tparfaswwds_3_tfparfascod_to ;
   private short AV96Ficherosbasicos_tparfaswwds_6_tfparundid ;
   private short AV97Ficherosbasicos_tparfaswwds_7_tfparundid_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV100GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV43TFParFasDsc_Sel ;
   private String AV42TFParFasDsc ;
   private String AV55TFParUndDsc_Sel ;
   private String AV54TFParUndDsc ;
   private String A1665ParFasDsc ;
   private String A13204ParUndDsc ;
   private String AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ;
   private String AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ;
   private String scmdbuf ;
   private String lV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String lV98Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String A396EmprCod ;
   private String AV87Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n13204ParUndDsc ;
   private boolean n13203ParUndID ;
   private boolean n1665ParFasDsc ;
   private String AV69Title ;
   private String AV75FilterFullText ;
   private String AV56TFParFasCod_To_Description ;
   private String AV59TFParUndID_To_Description ;
   private String AV91Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String lV91Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String AV66PageInfo ;
   private String AV62DateInfo ;
   private String AV81AppName ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private IDataStoreProvider pr_default ;
   private String[] P080P2_A396EmprCod ;
   private String[] P080P2_A13204ParUndDsc ;
   private boolean[] P080P2_n13204ParUndDsc ;
   private short[] P080P2_A13203ParUndID ;
   private boolean[] P080P2_n13203ParUndID ;
   private String[] P080P2_A1665ParFasDsc ;
   private boolean[] P080P2_n1665ParFasDsc ;
   private short[] P080P2_A1664ParFasCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class tparfaswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV91Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                          short AV92Ficherosbasicos_tparfaswwds_2_tfparfascod ,
                                          short AV93Ficherosbasicos_tparfaswwds_3_tfparfascod_to ,
                                          String AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                          String AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                          short AV96Ficherosbasicos_tparfaswwds_6_tfparundid ,
                                          short AV97Ficherosbasicos_tparfaswwds_7_tfparundid_to ,
                                          String AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                          String AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                          short A1664ParFasCod ,
                                          String A1665ParFasDsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ParUndDsc, T1.ParUndID, T1.ParFasDsc, T1.ParFasCod FROM (TXPPARFAS T1 LEFT JOIN TXPPARUND T2 ON T2.EmprCod = T1.EmprCod AND T2.ParUndID = T1.ParUndID)" ;
      if ( ! (GXutil.strcmp("", AV91Ficherosbasicos_tparfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ParFasCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ParFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV92Ficherosbasicos_tparfaswwds_2_tfparfascod) )
      {
         addWhere(sWhereString, "(T1.ParFasCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV93Ficherosbasicos_tparfaswwds_3_tfparfascod_to) )
      {
         addWhere(sWhereString, "(T1.ParFasCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Ficherosbasicos_tparfaswwds_4_tfparfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ParFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ParFasDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV96Ficherosbasicos_tparfaswwds_6_tfparundid) )
      {
         addWhere(sWhereString, "(T1.ParUndID >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV97Ficherosbasicos_tparfaswwds_7_tfparundid_to) )
      {
         addWhere(sWhereString, "(T1.ParUndID <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Ficherosbasicos_tparfaswwds_8_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParUndDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParFasDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParFasDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParFasCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParFasCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParUndID" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParUndID DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParUndDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ParUndDsc DESC" ;
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
                  return conditional_P080P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 15);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 15);
               }
               return;
      }
   }

}

