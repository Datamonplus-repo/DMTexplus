package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tobsforwwexportreport_impl extends GXWebReport
{
   public tobsforwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV42Title = httpContext.getMessage( "Lista de Observaciones", "") ;
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
         h8KQ0( true, 0) ;
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
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFCliCod) && (0==AV18TFCliCod_To) ) )
      {
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFCliCod), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV29TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFCliCod_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFCliCod_To), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV20TFForSer_Sel)==0) )
      {
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFForSer_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFForSer)==0) )
         {
            h8KQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFForSer, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFForColNom_Sel)==0) )
      {
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFForColNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFForColNom)==0) )
         {
            h8KQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFForColNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV23TFForColNum) && (0==AV24TFForColNum_To) ) )
      {
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFForColNum), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV30TFForColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFForColNum_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFForColNum_To), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV25TFTipColCod) && (0==AV26TFTipColCod_To) ) )
      {
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFTipColCod), "Z9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV31TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFTipColCod_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFTipColCod_To), "Z9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFForCurva_Sel)==0) )
      {
         h8KQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Imagen Curva", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFForCurva_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFForCurva)==0) )
         {
            h8KQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Imagen Curva", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFForCurva, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8KQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8KQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 122, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 126, Gx_line+10, 310, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 314, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 410, Gx_line+10, 502, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 506, Gx_line+10, 598, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imagen Curva", ""), 602, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV50Formulaciontinte_tobsforwwds_1_filterfulltext = AV12FilterFullText ;
      AV51Formulaciontinte_tobsforwwds_2_tfclicod = AV17TFCliCod ;
      AV52Formulaciontinte_tobsforwwds_3_tfclicod_to = AV18TFCliCod_To ;
      AV53Formulaciontinte_tobsforwwds_4_tfforser = AV19TFForSer ;
      AV54Formulaciontinte_tobsforwwds_5_tfforser_sel = AV20TFForSer_Sel ;
      AV55Formulaciontinte_tobsforwwds_6_tfforcolnom = AV21TFForColNom ;
      AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = AV22TFForColNom_Sel ;
      AV57Formulaciontinte_tobsforwwds_8_tfforcolnum = AV23TFForColNum ;
      AV58Formulaciontinte_tobsforwwds_9_tfforcolnum_to = AV24TFForColNum_To ;
      AV59Formulaciontinte_tobsforwwds_10_tftipcolcod = AV25TFTipColCod ;
      AV60Formulaciontinte_tobsforwwds_11_tftipcolcod_to = AV26TFTipColCod_To ;
      AV61Formulaciontinte_tobsforwwds_12_tfforcurva = AV27TFForCurva ;
      AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel = AV28TFForCurva_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                           Integer.valueOf(AV51Formulaciontinte_tobsforwwds_2_tfclicod) ,
                                           Integer.valueOf(AV52Formulaciontinte_tobsforwwds_3_tfclicod_to) ,
                                           AV54Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                           AV53Formulaciontinte_tobsforwwds_4_tfforser ,
                                           AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                           AV55Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                           Integer.valueOf(AV57Formulaciontinte_tobsforwwds_8_tfforcolnum) ,
                                           Integer.valueOf(AV58Formulaciontinte_tobsforwwds_9_tfforcolnum_to) ,
                                           Byte.valueOf(AV59Formulaciontinte_tobsforwwds_10_tftipcolcod) ,
                                           Byte.valueOf(AV60Formulaciontinte_tobsforwwds_11_tftipcolcod_to) ,
                                           AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                           AV61Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A12200ForCurva ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_tobsforwwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_tobsforwwds_4_tfforser), 16, "%") ;
      lV55Formulaciontinte_tobsforwwds_6_tfforcolnom = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_tobsforwwds_6_tfforcolnom), 13, "%") ;
      lV61Formulaciontinte_tobsforwwds_12_tfforcurva = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_tobsforwwds_12_tfforcurva), 128, "%") ;
      /* Using cursor P08KQ2 */
      pr_default.execute(0, new Object[] {lV50Formulaciontinte_tobsforwwds_1_filterfulltext, lV50Formulaciontinte_tobsforwwds_1_filterfulltext, lV50Formulaciontinte_tobsforwwds_1_filterfulltext, lV50Formulaciontinte_tobsforwwds_1_filterfulltext, lV50Formulaciontinte_tobsforwwds_1_filterfulltext, lV50Formulaciontinte_tobsforwwds_1_filterfulltext, Integer.valueOf(AV51Formulaciontinte_tobsforwwds_2_tfclicod), Integer.valueOf(AV52Formulaciontinte_tobsforwwds_3_tfclicod_to), lV53Formulaciontinte_tobsforwwds_4_tfforser, AV54Formulaciontinte_tobsforwwds_5_tfforser_sel, lV55Formulaciontinte_tobsforwwds_6_tfforcolnom, AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel, Integer.valueOf(AV57Formulaciontinte_tobsforwwds_8_tfforcolnum), Integer.valueOf(AV58Formulaciontinte_tobsforwwds_9_tfforcolnum_to), Byte.valueOf(AV59Formulaciontinte_tobsforwwds_10_tftipcolcod), Byte.valueOf(AV60Formulaciontinte_tobsforwwds_11_tftipcolcod_to), lV61Formulaciontinte_tobsforwwds_12_tfforcurva, AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12200ForCurva = P08KQ2_A12200ForCurva[0] ;
         n12200ForCurva = P08KQ2_n12200ForCurva[0] ;
         A831TipColCod = P08KQ2_A831TipColCod[0] ;
         A483ForColNum = P08KQ2_A483ForColNum[0] ;
         A482ForColNom = P08KQ2_A482ForColNom[0] ;
         A494ForSer = P08KQ2_A494ForSer[0] ;
         A252CliCod = P08KQ2_A252CliCod[0] ;
         A651ObsUltLin = P08KQ2_A651ObsUltLin[0] ;
         n651ObsUltLin = P08KQ2_n651ObsUltLin[0] ;
         A396EmprCod = P08KQ2_A396EmprCod[0] ;
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
         h8KQ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 122, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 126, Gx_line+10, 310, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 314, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 410, Gx_line+10, 502, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 506, Gx_line+10, 598, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12200ForCurva, "")), 602, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("FormulacionTinte.TOBSFORWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TOBSFORWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("FormulacionTinte.TOBSFORWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV17TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV19TFForSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV20TFForSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV21TFForColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV22TFForColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV23TFForColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFForColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV25TFTipColCod = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFTipColCod_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCURVA") == 0 )
         {
            AV27TFForCurva = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCURVA_SEL") == 0 )
         {
            AV28TFForCurva_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
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

   public void h8KQ0( boolean bFoot ,
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
               AV40PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV37DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV42Title = AV46Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV42Title = "" ;
      AV12FilterFullText = "" ;
      AV29TFCliCod_To_Description = "" ;
      AV20TFForSer_Sel = "" ;
      AV19TFForSer = "" ;
      AV22TFForColNom_Sel = "" ;
      AV21TFForColNom = "" ;
      AV30TFForColNum_To_Description = "" ;
      AV31TFTipColCod_To_Description = "" ;
      AV28TFForCurva_Sel = "" ;
      AV27TFForCurva = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A12200ForCurva = "" ;
      AV50Formulaciontinte_tobsforwwds_1_filterfulltext = "" ;
      AV53Formulaciontinte_tobsforwwds_4_tfforser = "" ;
      AV54Formulaciontinte_tobsforwwds_5_tfforser_sel = "" ;
      AV55Formulaciontinte_tobsforwwds_6_tfforcolnom = "" ;
      AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = "" ;
      AV61Formulaciontinte_tobsforwwds_12_tfforcurva = "" ;
      AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel = "" ;
      scmdbuf = "" ;
      lV50Formulaciontinte_tobsforwwds_1_filterfulltext = "" ;
      lV53Formulaciontinte_tobsforwwds_4_tfforser = "" ;
      lV55Formulaciontinte_tobsforwwds_6_tfforcolnom = "" ;
      lV61Formulaciontinte_tobsforwwds_12_tfforcurva = "" ;
      P08KQ2_A12200ForCurva = new String[] {""} ;
      P08KQ2_n12200ForCurva = new boolean[] {false} ;
      P08KQ2_A831TipColCod = new byte[1] ;
      P08KQ2_A483ForColNum = new int[1] ;
      P08KQ2_A482ForColNom = new String[] {""} ;
      P08KQ2_A494ForSer = new String[] {""} ;
      P08KQ2_A252CliCod = new int[1] ;
      P08KQ2_A651ObsUltLin = new short[1] ;
      P08KQ2_n651ObsUltLin = new boolean[] {false} ;
      P08KQ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40PageInfo = "" ;
      AV37DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV46Pgmdesc = "" ;
      AV35AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tobsforwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08KQ2_A12200ForCurva, P08KQ2_n12200ForCurva, P08KQ2_A831TipColCod, P08KQ2_A483ForColNum, P08KQ2_A482ForColNom, P08KQ2_A494ForSer, P08KQ2_A252CliCod, P08KQ2_A651ObsUltLin, P08KQ2_n651ObsUltLin, P08KQ2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV46Pgmdesc = httpContext.getMessage( "TOBSFORWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV46Pgmdesc = httpContext.getMessage( "TOBSFORWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV25TFTipColCod ;
   private byte AV26TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV59Formulaciontinte_tobsforwwds_10_tftipcolcod ;
   private byte AV60Formulaciontinte_tobsforwwds_11_tftipcolcod_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short A651ObsUltLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV17TFCliCod ;
   private int AV18TFCliCod_To ;
   private int AV23TFForColNum ;
   private int AV24TFForColNum_To ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV51Formulaciontinte_tobsforwwds_2_tfclicod ;
   private int AV52Formulaciontinte_tobsforwwds_3_tfclicod_to ;
   private int AV57Formulaciontinte_tobsforwwds_8_tfforcolnum ;
   private int AV58Formulaciontinte_tobsforwwds_9_tfforcolnum_to ;
   private int AV63GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV20TFForSer_Sel ;
   private String AV19TFForSer ;
   private String AV22TFForColNom_Sel ;
   private String AV21TFForColNom ;
   private String AV28TFForCurva_Sel ;
   private String AV27TFForCurva ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A12200ForCurva ;
   private String AV53Formulaciontinte_tobsforwwds_4_tfforser ;
   private String AV54Formulaciontinte_tobsforwwds_5_tfforser_sel ;
   private String AV55Formulaciontinte_tobsforwwds_6_tfforcolnom ;
   private String AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ;
   private String AV61Formulaciontinte_tobsforwwds_12_tfforcurva ;
   private String AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel ;
   private String scmdbuf ;
   private String lV53Formulaciontinte_tobsforwwds_4_tfforser ;
   private String lV55Formulaciontinte_tobsforwwds_6_tfforcolnom ;
   private String lV61Formulaciontinte_tobsforwwds_12_tfforcurva ;
   private String A396EmprCod ;
   private String AV46Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n12200ForCurva ;
   private boolean n651ObsUltLin ;
   private String AV42Title ;
   private String AV12FilterFullText ;
   private String AV29TFCliCod_To_Description ;
   private String AV30TFForColNum_To_Description ;
   private String AV31TFTipColCod_To_Description ;
   private String AV50Formulaciontinte_tobsforwwds_1_filterfulltext ;
   private String lV50Formulaciontinte_tobsforwwds_1_filterfulltext ;
   private String AV40PageInfo ;
   private String AV37DateInfo ;
   private String AV35AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08KQ2_A12200ForCurva ;
   private boolean[] P08KQ2_n12200ForCurva ;
   private byte[] P08KQ2_A831TipColCod ;
   private int[] P08KQ2_A483ForColNum ;
   private String[] P08KQ2_A482ForColNom ;
   private String[] P08KQ2_A494ForSer ;
   private int[] P08KQ2_A252CliCod ;
   private short[] P08KQ2_A651ObsUltLin ;
   private boolean[] P08KQ2_n651ObsUltLin ;
   private String[] P08KQ2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class tobsforwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                          int AV51Formulaciontinte_tobsforwwds_2_tfclicod ,
                                          int AV52Formulaciontinte_tobsforwwds_3_tfclicod_to ,
                                          String AV54Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                          String AV53Formulaciontinte_tobsforwwds_4_tfforser ,
                                          String AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                          String AV55Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                          int AV57Formulaciontinte_tobsforwwds_8_tfforcolnum ,
                                          int AV58Formulaciontinte_tobsforwwds_9_tfforcolnum_to ,
                                          byte AV59Formulaciontinte_tobsforwwds_10_tftipcolcod ,
                                          byte AV60Formulaciontinte_tobsforwwds_11_tftipcolcod_to ,
                                          String AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                          String AV61Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A12200ForCurva ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ForCurva, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ObsUltLin, EmprCod FROM TXPCFORMU" ;
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_tobsforwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForCurva) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_tobsforwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_tobsforwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_tobsforwwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_tobsforwwds_6_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_tobsforwwds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_tobsforwwds_9_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_tobsforwwds_10_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_tobsforwwds_11_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_tobsforwwds_12_tfforcurva)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForCurva) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) )
      {
         addWhere(sWhereString, "(ForCurva = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY ObsUltLin" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ForSer" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ForColNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ForColNum" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY ForCurva" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForCurva DESC" ;
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
                  return conditional_P08KQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 128);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 128);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 128);
               }
               return;
      }
   }

}

