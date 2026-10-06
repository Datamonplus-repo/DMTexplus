package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnotrec_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5206Nr_albrecc = (int)(GXutil.lval( httpContext.GetPar( "Nr_albrecc"))) ;
         n5206Nr_albrecc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
         A5340Nr_CliCod = (int)(GXutil.lval( httpContext.GetPar( "Nr_CliCod"))) ;
         n5340Nr_CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         A5341Nr_CliNom = httpContext.GetPar( "Nr_CliNom") ;
         n5341Nr_CliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         A5199Nr_albent = httpContext.GetPar( "Nr_albent") ;
         n5199Nr_albent = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         A5201Nr_artcod = httpContext.GetPar( "Nr_artcod") ;
         n5201Nr_artcod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         A5202Nr_artdsc = httpContext.GetPar( "Nr_artdsc") ;
         n5202Nr_artdsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         A5207Nr_piezas = (int)(GXutil.lval( httpContext.GetPar( "Nr_piezas"))) ;
         n5207Nr_piezas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         A5208Nr_unidade = CommonUtil.decimalVal( httpContext.GetPar( "Nr_unidade"), ".") ;
         n5208Nr_unidade = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         A5209Nr_unidad = httpContext.GetPar( "Nr_unidad") ;
         n5209Nr_unidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         AV38Ctrl_r = (byte)(GXutil.lval( httpContext.GetPar( "Ctrl_r"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
         AV39Msg_1 = httpContext.GetPar( "Msg_1") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
         AV47Aplicacion = httpContext.GetPar( "Aplicacion") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Aplicacion", AV47Aplicacion);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_OY761( A396EmprCod, A5206Nr_albrecc, A5340Nr_CliCod, A5341Nr_CliNom, A5199Nr_albent, A5201Nr_artcod, A5202Nr_artdsc, A5207Nr_piezas, A5208Nr_unidade, A5209Nr_unidad, AV38Ctrl_r, AV39Msg_1, AV47Aplicacion) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7090Nr_PartCod = httpContext.GetPar( "Nr_PartCod") ;
         n7090Nr_PartCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7090Nr_PartCod", A7090Nr_PartCod);
         A5340Nr_CliCod = (int)(GXutil.lval( httpContext.GetPar( "Nr_CliCod"))) ;
         n5340Nr_CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         A5341Nr_CliNom = httpContext.GetPar( "Nr_CliNom") ;
         n5341Nr_CliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         A5199Nr_albent = httpContext.GetPar( "Nr_albent") ;
         n5199Nr_albent = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         A5201Nr_artcod = httpContext.GetPar( "Nr_artcod") ;
         n5201Nr_artcod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         A5202Nr_artdsc = httpContext.GetPar( "Nr_artdsc") ;
         n5202Nr_artdsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         A5207Nr_piezas = (int)(GXutil.lval( httpContext.GetPar( "Nr_piezas"))) ;
         n5207Nr_piezas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         A5208Nr_unidade = CommonUtil.decimalVal( httpContext.GetPar( "Nr_unidade"), ".") ;
         n5208Nr_unidade = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         A5209Nr_unidad = httpContext.GetPar( "Nr_unidad") ;
         n5209Nr_unidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         A7091Nr_ParNMtr = httpContext.GetPar( "Nr_ParNMtr") ;
         n7091Nr_ParNMtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7091Nr_ParNMtr", A7091Nr_ParNMtr);
         AV38Ctrl_r = (byte)(GXutil.lval( httpContext.GetPar( "Ctrl_r"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
         AV39Msg_1 = httpContext.GetPar( "Msg_1") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
         AV47Aplicacion = httpContext.GetPar( "Aplicacion") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Aplicacion", AV47Aplicacion);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_OY761( A396EmprCod, A7090Nr_PartCod, A5340Nr_CliCod, A5341Nr_CliNom, A5199Nr_albent, A5201Nr_artcod, A5202Nr_artdsc, A5207Nr_piezas, A5208Nr_unidade, A5209Nr_unidad, A7091Nr_ParNMtr, AV38Ctrl_r, AV39Msg_1, AV47Aplicacion) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDISCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13845TipDisDscI = httpContext.GetPar( "TipDisDscI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipdiscodOY0( A396EmprCod, A13845TipDisDscI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDEFCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipdefcodOY0( A396EmprCod, A13819TipdefDscI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDISCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13845TipDisDscI = httpContext.GetPar( "TipDisDscI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipdiscodOY0( A396EmprCod, A13845TipDisDscI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPDISCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h5098TipDisCod = httpContext.GetPar( "h5098TipDisCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatipdiscodOY761( A396EmprCod, h5098TipDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TIPDEFCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatipdefcodOY0( A396EmprCod, A13819TipdefDscI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TIPDEFCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h833TipDefCod = httpContext.GetPar( "h833TipDefCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatipdefcodOY764( A396EmprCod, h833TipDefCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa5098OY761( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5098TipDisCod = httpContext.GetPar( "TipDisCod") ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_41( A396EmprCod, A5098TipDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A833TipDefCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
         return  ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV52EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52EmprCod, "@!"))));
            AV43Nr_codigo = (int)(GXutil.lval( httpContext.GetPar( "Nr_codigo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Nr_codigo), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNR_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43Nr_codigo), "ZZZZZZZ9")));
         }
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_web_controls( ) ;
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "NOTAS DE RECLAMACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtNr_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_201 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_201"))) ;
      nGXsfl_201_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_201_idx"))) ;
      sGXsfl_201_idx = httpContext.GetPar( "sGXsfl_201_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tnotrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnotrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnotrec_impl.class ));
   }

   public tnotrec_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbNr_unidad = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbNr_unidad.getItemCount() > 0 )
      {
         A5209Nr_unidad = cmbNr_unidad.getValidValue(A5209Nr_unidad) ;
         n5209Nr_unidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Values", cmbNr_unidad.ToJavascriptSource(), true);
      }
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_codigo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_codigo_Internalname, httpContext.getMessage( "N Reclamacion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A5198Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_codigo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_codigo_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_albrecc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_albrecc_Internalname, httpContext.getMessage( "N Recepcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_albrecc_Internalname, GXutil.ltrim( localUtil.ntoc( A5206Nr_albrecc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_albrecc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5206Nr_albrecc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5206Nr_albrecc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_albrecc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_albrecc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTipdiscod_cell_Internalname, 1, 0, "px", 0, "px", divTipdiscod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTipDisCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDisCod_Internalname, httpContext.getMessage( "Tipo Disposicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDisCod_Internalname, h5098TipDisCod, GXutil.rtrim( localUtil.format( h5098TipDisCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTipDisCod_Visible, edtTipDisCod_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_CliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_CliCod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_CliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5340Nr_CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_CliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_CliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_CliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_CliNom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_CliNom_Internalname, GXutil.rtrim( A5341Nr_CliNom), GXutil.rtrim( localUtil.format( A5341Nr_CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_CliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_CliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_albent_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_albent_Internalname, httpContext.getMessage( "Pedido Cliente", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_albent_Internalname, GXutil.rtrim( A5199Nr_albent), GXutil.rtrim( localUtil.format( A5199Nr_albent, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_albent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_albent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_refcli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_refcli_Internalname, httpContext.getMessage( "V/Referencia", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_refcli_Internalname, GXutil.rtrim( A5200Nr_refcli), GXutil.rtrim( localUtil.format( A5200Nr_refcli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_refcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_refcli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
      ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
      ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
      ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
      ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
      ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
      ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
      ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
      ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
      ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
      ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable10.setProperty("Width", Dvpanel_unnamedtable10_Width);
      ucDvpanel_unnamedtable10.setProperty("AutoWidth", Dvpanel_unnamedtable10_Autowidth);
      ucDvpanel_unnamedtable10.setProperty("AutoHeight", Dvpanel_unnamedtable10_Autoheight);
      ucDvpanel_unnamedtable10.setProperty("Cls", Dvpanel_unnamedtable10_Cls);
      ucDvpanel_unnamedtable10.setProperty("Title", Dvpanel_unnamedtable10_Title);
      ucDvpanel_unnamedtable10.setProperty("Collapsible", Dvpanel_unnamedtable10_Collapsible);
      ucDvpanel_unnamedtable10.setProperty("Collapsed", Dvpanel_unnamedtable10_Collapsed);
      ucDvpanel_unnamedtable10.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable10_Showcollapseicon);
      ucDvpanel_unnamedtable10.setProperty("IconPosition", Dvpanel_unnamedtable10_Iconposition);
      ucDvpanel_unnamedtable10.setProperty("AutoScroll", Dvpanel_unnamedtable10_Autoscroll);
      ucDvpanel_unnamedtable10.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable10_Internalname, "DVPANEL_UNNAMEDTABLE10Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE10Container"+"UnnamedTable10"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_artcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_artcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_artcod_Internalname, GXutil.rtrim( A5201Nr_artcod), GXutil.rtrim( localUtil.format( A5201Nr_artcod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_artcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_artcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_artdsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_artdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_artdsc_Internalname, GXutil.rtrim( A5202Nr_artdsc), GXutil.rtrim( localUtil.format( A5202Nr_artdsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_artdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_artdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_colnom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_colnom_Internalname, httpContext.getMessage( "Color", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_colnom_Internalname, GXutil.rtrim( A5203Nr_colnom), GXutil.rtrim( localUtil.format( A5203Nr_colnom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_colnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_colnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_colnum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_colnum_Internalname, httpContext.getMessage( "Numero", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_colnum_Internalname, GXutil.ltrim( localUtil.ntoc( A5204Nr_colnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_colnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5204Nr_colnum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5204Nr_colnum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_colnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_colnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_partida_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_partida_Internalname, httpContext.getMessage( "Partida", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_partida_Internalname, GXutil.ltrim( localUtil.ntoc( A5205Nr_partida, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_partida_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5205Nr_partida), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5205Nr_partida), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_partida_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_partida_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable11.setProperty("Width", Dvpanel_unnamedtable11_Width);
      ucDvpanel_unnamedtable11.setProperty("AutoWidth", Dvpanel_unnamedtable11_Autowidth);
      ucDvpanel_unnamedtable11.setProperty("AutoHeight", Dvpanel_unnamedtable11_Autoheight);
      ucDvpanel_unnamedtable11.setProperty("Cls", Dvpanel_unnamedtable11_Cls);
      ucDvpanel_unnamedtable11.setProperty("Title", Dvpanel_unnamedtable11_Title);
      ucDvpanel_unnamedtable11.setProperty("Collapsible", Dvpanel_unnamedtable11_Collapsible);
      ucDvpanel_unnamedtable11.setProperty("Collapsed", Dvpanel_unnamedtable11_Collapsed);
      ucDvpanel_unnamedtable11.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable11_Showcollapseicon);
      ucDvpanel_unnamedtable11.setProperty("IconPosition", Dvpanel_unnamedtable11_Iconposition);
      ucDvpanel_unnamedtable11.setProperty("AutoScroll", Dvpanel_unnamedtable11_Autoscroll);
      ucDvpanel_unnamedtable11.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable11_Internalname, "DVPANEL_UNNAMEDTABLE11Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE11Container"+"UnnamedTable11"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_piezas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_piezas_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_piezas_Internalname, GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_piezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5207Nr_piezas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5207Nr_piezas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_piezas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_piezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_unidade_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_unidade_Internalname, httpContext.getMessage( "Unidades", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_unidade_Internalname, GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_unidade_Enabled!=0) ? localUtil.format( A5208Nr_unidade, "ZZZZZ9.99") : localUtil.format( A5208Nr_unidade, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_unidade_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_unidade_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbNr_unidad.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbNr_unidad.getInternalname(), httpContext.getMessage( "Unidad", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNr_unidad, cmbNr_unidad.getInternalname(), GXutil.rtrim( A5209Nr_unidad), 1, cmbNr_unidad.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbNr_unidad.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TNOTREC.htm");
      cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Values", cmbNr_unidad.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
      ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
      ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
      ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
      ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
      ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
      ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
      ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
      ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
      ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
      ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
      ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
      ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
      ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
      ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
      ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
      ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
      ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
      ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
      ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
      ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barcoda_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_barcoda_Internalname, httpContext.getMessage( "N Hdr Ant", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barcoda_Internalname, GXutil.ltrim( localUtil.ntoc( A5222Nr_barcoda, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barcoda_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barcoda_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barcoda_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barreoa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_barreoa_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barreoa_Internalname, GXutil.ltrim( localUtil.ntoc( A5223Nr_barreoa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barreoa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9") : localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barreoa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barreoa_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barpara_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_barpara_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barpara_Internalname, GXutil.rtrim( A5224Nr_barpara), GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barpara_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barpara_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_NAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_NAlb_Internalname, httpContext.getMessage( "Nº Albaran", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_NAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A12235Nr_NAlb, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_NAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12235Nr_NAlb), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12235Nr_NAlb), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_NAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_NAlb_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_local_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_local_Internalname, httpContext.getMessage( "Localizacion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_local_Internalname, GXutil.rtrim( A5214Nr_local), GXutil.rtrim( localUtil.format( A5214Nr_local, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_local_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_local_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_fecent_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_fecent_Internalname, httpContext.getMessage( "Fecha entrega", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtNr_fecent_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_fecent_Internalname, localUtil.format(A5217Nr_fecent, "99/99/99"), localUtil.format( A5217Nr_fecent, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_fecent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_fecent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtNr_fecent_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNr_fecent_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TNOTREC.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
      ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
      ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
      ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
      ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
      ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
      ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
      ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
      ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
      ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
      ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_fecreg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_fecreg_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtNr_fecreg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_fecreg_Internalname, localUtil.ttoc( A5216Nr_fecreg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_fecreg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_fecreg_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtNr_fecreg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNr_fecreg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TNOTREC.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_user_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_user_Internalname, httpContext.getMessage( "Usuario", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_user_Internalname, GXutil.rtrim( A5215Nr_user), GXutil.rtrim( localUtil.format( A5215Nr_user, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_user_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_user_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_barcod_Internalname, httpContext.getMessage( "Hdr", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5210Nr_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barreo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_barreo_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barreo_Internalname, GXutil.ltrim( localUtil.ntoc( A5211Nr_barreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_barreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5211Nr_barreo), "9") : localUtil.format( DecimalUtil.doubleToDec(A5211Nr_barreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_barpar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_barpar_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_barpar_Internalname, GXutil.rtrim( A5212Nr_barpar), GXutil.rtrim( localUtil.format( A5212Nr_barpar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_barpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_barpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtNr_discod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtNr_discod_Internalname, httpContext.getMessage( "N Disp", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtNr_discod_Internalname, GXutil.ltrim( localUtil.ntoc( A5213Nr_discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNr_discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5213Nr_discod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5213Nr_discod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNr_discod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtNr_discod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNOTREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol201( ) ;
      nGXsfl_201_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount764 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_764 = (short)(1) ;
            scanStartOY764( ) ;
            while ( RcdFound764 != 0 )
            {
               init_level_properties764( ) ;
               getByPrimaryKeyOY764( ) ;
               addRowOY764( ) ;
               scanNextOY764( ) ;
            }
            scanEndOY764( ) ;
            nBlankRcdCount764 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalOY764( ) ;
         standaloneModalOY764( ) ;
         sMode764 = Gx_mode ;
         while ( nGXsfl_201_idx < nRC_GXsfl_201 )
         {
            bGXsfl_201_Refreshing = true ;
            readRowOY764( ) ;
            edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_201_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_201_Refreshing);
            if ( ( nRcdExists_764 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalOY764( ) ;
            }
            sendRowOY764( ) ;
            bGXsfl_201_Refreshing = false ;
         }
         Gx_mode = sMode764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount764 = (short)(2) ;
         nRcdExists_764 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartOY764( ) ;
            while ( RcdFound764 != 0 )
            {
               sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_201764( ) ;
               init_level_properties764( ) ;
               standaloneNotModalOY764( ) ;
               getByPrimaryKeyOY764( ) ;
               standaloneModalOY764( ) ;
               addRowOY764( ) ;
               scanNextOY764( ) ;
            }
            scanEndOY764( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode764 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_201764( ) ;
         initAllOY764( ) ;
         init_level_properties764( ) ;
         nRcdExists_764 = (short)(0) ;
         nIsMod_764 = (short)(0) ;
         nRcdDeleted_764 = (short)(0) ;
         nBlankRcdCount764 = (short)(nBlankRcdUsr764+nBlankRcdCount764) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount764 > 0 )
         {
            standaloneNotModalOY764( ) ;
            standaloneModalOY764( ) ;
            addRowOY764( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount764 = (short)(nBlankRcdCount764-1) ;
         }
         Gx_mode = sMode764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11OY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( "Z5198Nr_codigo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5206Nr_albrecc = (int)(localUtil.ctol( httpContext.cgiGet( "Z5206Nr_albrecc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5340Nr_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z5340Nr_CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5341Nr_CliNom = httpContext.cgiGet( "Z5341Nr_CliNom") ;
            Z5199Nr_albent = httpContext.cgiGet( "Z5199Nr_albent") ;
            Z5200Nr_refcli = httpContext.cgiGet( "Z5200Nr_refcli") ;
            Z5201Nr_artcod = httpContext.cgiGet( "Z5201Nr_artcod") ;
            Z5202Nr_artdsc = httpContext.cgiGet( "Z5202Nr_artdsc") ;
            Z5203Nr_colnom = httpContext.cgiGet( "Z5203Nr_colnom") ;
            Z5204Nr_colnum = (int)(localUtil.ctol( httpContext.cgiGet( "Z5204Nr_colnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5205Nr_partida = (int)(localUtil.ctol( httpContext.cgiGet( "Z5205Nr_partida"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5207Nr_piezas = (int)(localUtil.ctol( httpContext.cgiGet( "Z5207Nr_piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5208Nr_unidade = localUtil.ctond( httpContext.cgiGet( "Z5208Nr_unidade")) ;
            Z5209Nr_unidad = httpContext.cgiGet( "Z5209Nr_unidad") ;
            Z5222Nr_barcoda = (int)(localUtil.ctol( httpContext.cgiGet( "Z5222Nr_barcoda"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5223Nr_barreoa = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5223Nr_barreoa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5224Nr_barpara = httpContext.cgiGet( "Z5224Nr_barpara") ;
            Z12235Nr_NAlb = localUtil.ctol( httpContext.cgiGet( "Z12235Nr_NAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z5214Nr_local = httpContext.cgiGet( "Z5214Nr_local") ;
            Z5215Nr_user = httpContext.cgiGet( "Z5215Nr_user") ;
            Z5216Nr_fecreg = localUtil.ctot( httpContext.cgiGet( "Z5216Nr_fecreg"), 0) ;
            Z5217Nr_fecent = localUtil.ctod( httpContext.cgiGet( "Z5217Nr_fecent"), 0) ;
            Z5210Nr_barcod = (int)(localUtil.ctol( httpContext.cgiGet( "Z5210Nr_barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5211Nr_barreo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5211Nr_barreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5212Nr_barpar = httpContext.cgiGet( "Z5212Nr_barpar") ;
            Z5213Nr_discod = (int)(localUtil.ctol( httpContext.cgiGet( "Z5213Nr_discod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7090Nr_PartCod = httpContext.cgiGet( "Z7090Nr_PartCod") ;
            Z7091Nr_ParNMtr = httpContext.cgiGet( "Z7091Nr_ParNMtr") ;
            Z5098TipDisCod = httpContext.cgiGet( "Z5098TipDisCod") ;
            A7090Nr_PartCod = httpContext.cgiGet( "Z7090Nr_PartCod") ;
            n7090Nr_PartCod = false ;
            A7091Nr_ParNMtr = httpContext.cgiGet( "Z7091Nr_ParNMtr") ;
            n7091Nr_ParNMtr = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_201 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_201"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N5098TipDisCod = httpContext.cgiGet( "N5098TipDisCod") ;
            AV52EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV43Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( "vNR_CODIGO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV56Insert_TipDisCod = httpContext.cgiGet( "vINSERT_TIPDISCOD") ;
            A5098TipDisCod = httpContext.cgiGet( "GXHCTIPDISCOD") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39Msg_1 = httpContext.cgiGet( "vMSG_1") ;
            AV38Ctrl_r = (byte)(localUtil.ctol( httpContext.cgiGet( "vCTRL_R"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV47Aplicacion = httpContext.cgiGet( "vAPLICACION") ;
            A7090Nr_PartCod = httpContext.cgiGet( "NR_PARTCOD") ;
            A7091Nr_ParNMtr = httpContext.cgiGet( "NR_PARNMTR") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A5097TipDisDsc = httpContext.cgiGet( "TIPDISDSC") ;
            n5097TipDisDsc = false ;
            AV60Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTIPDEFCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A834TipDefDsc = httpContext.cgiGet( "TIPDEFDSC") ;
            n834TipDefDsc = false ;
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            Dvpanel_unnamedtable10_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Objectcall") ;
            Dvpanel_unnamedtable10_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Class") ;
            Dvpanel_unnamedtable10_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Enabled")) ;
            Dvpanel_unnamedtable10_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Width") ;
            Dvpanel_unnamedtable10_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Height") ;
            Dvpanel_unnamedtable10_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autowidth")) ;
            Dvpanel_unnamedtable10_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autoheight")) ;
            Dvpanel_unnamedtable10_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Cls") ;
            Dvpanel_unnamedtable10_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Showheader")) ;
            Dvpanel_unnamedtable10_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Title") ;
            Dvpanel_unnamedtable10_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Collapsible")) ;
            Dvpanel_unnamedtable10_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Collapsed")) ;
            Dvpanel_unnamedtable10_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Showcollapseicon")) ;
            Dvpanel_unnamedtable10_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Iconposition") ;
            Dvpanel_unnamedtable10_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autoscroll")) ;
            Dvpanel_unnamedtable10_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Visible")) ;
            Dvpanel_unnamedtable11_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Objectcall") ;
            Dvpanel_unnamedtable11_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Class") ;
            Dvpanel_unnamedtable11_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Enabled")) ;
            Dvpanel_unnamedtable11_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Width") ;
            Dvpanel_unnamedtable11_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Height") ;
            Dvpanel_unnamedtable11_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autowidth")) ;
            Dvpanel_unnamedtable11_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autoheight")) ;
            Dvpanel_unnamedtable11_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Cls") ;
            Dvpanel_unnamedtable11_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Showheader")) ;
            Dvpanel_unnamedtable11_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Title") ;
            Dvpanel_unnamedtable11_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Collapsible")) ;
            Dvpanel_unnamedtable11_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Collapsed")) ;
            Dvpanel_unnamedtable11_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Showcollapseicon")) ;
            Dvpanel_unnamedtable11_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Iconposition") ;
            Dvpanel_unnamedtable11_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autoscroll")) ;
            Dvpanel_unnamedtable11_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Visible")) ;
            Dvpanel_unnamedtable3_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Objectcall") ;
            Dvpanel_unnamedtable3_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Class") ;
            Dvpanel_unnamedtable3_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Enabled")) ;
            Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
            Dvpanel_unnamedtable3_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Height") ;
            Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
            Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
            Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
            Dvpanel_unnamedtable3_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showheader")) ;
            Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
            Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
            Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
            Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
            Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
            Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
            Dvpanel_unnamedtable3_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Visible")) ;
            Dvpanel_unnamedtable5_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Objectcall") ;
            Dvpanel_unnamedtable5_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Class") ;
            Dvpanel_unnamedtable5_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Enabled")) ;
            Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
            Dvpanel_unnamedtable5_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Height") ;
            Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
            Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
            Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
            Dvpanel_unnamedtable5_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showheader")) ;
            Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
            Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
            Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
            Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
            Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
            Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
            Dvpanel_unnamedtable5_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Visible")) ;
            Dvpanel_unnamedtable6_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Objectcall") ;
            Dvpanel_unnamedtable6_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Class") ;
            Dvpanel_unnamedtable6_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Enabled")) ;
            Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
            Dvpanel_unnamedtable6_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Height") ;
            Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
            Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
            Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
            Dvpanel_unnamedtable6_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showheader")) ;
            Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
            Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
            Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
            Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
            Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
            Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
            Dvpanel_unnamedtable6_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Visible")) ;
            Dvpanel_unnamedtable4_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Objectcall") ;
            Dvpanel_unnamedtable4_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Class") ;
            Dvpanel_unnamedtable4_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Enabled")) ;
            Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
            Dvpanel_unnamedtable4_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Height") ;
            Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
            Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
            Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
            Dvpanel_unnamedtable4_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showheader")) ;
            Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
            Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
            Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
            Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
            Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
            Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
            Dvpanel_unnamedtable4_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Visible")) ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNr_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNr_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NR_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5198Nr_codigo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
            }
            else
            {
               A5198Nr_codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
            }
            A5206Nr_albrecc = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_albrecc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5206Nr_albrecc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
            h5098TipDisCod = httpContext.cgiGet( edtTipDisCod_Internalname) ;
            A5340Nr_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_CliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5340Nr_CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
            A5341Nr_CliNom = httpContext.cgiGet( edtNr_CliNom_Internalname) ;
            n5341Nr_CliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
            A5199Nr_albent = httpContext.cgiGet( edtNr_albent_Internalname) ;
            n5199Nr_albent = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
            A5200Nr_refcli = httpContext.cgiGet( edtNr_refcli_Internalname) ;
            n5200Nr_refcli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5200Nr_refcli", A5200Nr_refcli);
            A5201Nr_artcod = httpContext.cgiGet( edtNr_artcod_Internalname) ;
            n5201Nr_artcod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
            A5202Nr_artdsc = httpContext.cgiGet( edtNr_artdsc_Internalname) ;
            n5202Nr_artdsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
            A5203Nr_colnom = httpContext.cgiGet( edtNr_colnom_Internalname) ;
            n5203Nr_colnom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5203Nr_colnom", A5203Nr_colnom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNr_colnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNr_colnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NR_COLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_colnum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5204Nr_colnum = 0 ;
               n5204Nr_colnum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
            }
            else
            {
               A5204Nr_colnum = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_colnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5204Nr_colnum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNr_partida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNr_partida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NR_PARTIDA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_partida_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5205Nr_partida = 0 ;
               n5205Nr_partida = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
            }
            else
            {
               A5205Nr_partida = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_partida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5205Nr_partida = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
            }
            A5207Nr_piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_piezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5207Nr_piezas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
            A5208Nr_unidade = localUtil.ctond( httpContext.cgiGet( edtNr_unidade_Internalname)) ;
            n5208Nr_unidade = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
            cmbNr_unidad.setName( cmbNr_unidad.getInternalname() );
            cmbNr_unidad.setValue( httpContext.cgiGet( cmbNr_unidad.getInternalname()) );
            A5209Nr_unidad = httpContext.cgiGet( cmbNr_unidad.getInternalname()) ;
            n5209Nr_unidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNr_barcoda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNr_barcoda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NR_BARCODA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_barcoda_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5222Nr_barcoda = 0 ;
               n5222Nr_barcoda = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
            }
            else
            {
               A5222Nr_barcoda = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcoda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5222Nr_barcoda = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNr_barreoa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNr_barreoa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NR_BARREOA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_barreoa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5223Nr_barreoa = (byte)(0) ;
               n5223Nr_barreoa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
            }
            else
            {
               A5223Nr_barreoa = (byte)(localUtil.ctol( httpContext.cgiGet( edtNr_barreoa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5223Nr_barreoa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
            }
            A5224Nr_barpara = httpContext.cgiGet( edtNr_barpara_Internalname) ;
            n5224Nr_barpara = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5224Nr_barpara", A5224Nr_barpara);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNr_NAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNr_NAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NR_NALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_NAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12235Nr_NAlb = 0 ;
               n12235Nr_NAlb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
            }
            else
            {
               A12235Nr_NAlb = localUtil.ctol( httpContext.cgiGet( edtNr_NAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n12235Nr_NAlb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
            }
            A5214Nr_local = httpContext.cgiGet( edtNr_local_Internalname) ;
            n5214Nr_local = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5214Nr_local", A5214Nr_local);
            if ( localUtil.vcdate( httpContext.cgiGet( edtNr_fecent_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "NR_FECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_fecent_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5217Nr_fecent = GXutil.nullDate() ;
               n5217Nr_fecent = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
            }
            else
            {
               A5217Nr_fecent = localUtil.ctod( httpContext.cgiGet( edtNr_fecent_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n5217Nr_fecent = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
            }
            A5216Nr_fecreg = localUtil.ctot( httpContext.cgiGet( edtNr_fecreg_Internalname)) ;
            n5216Nr_fecreg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A5215Nr_user = GXutil.upper( httpContext.cgiGet( edtNr_user_Internalname)) ;
            n5215Nr_user = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
            A5210Nr_barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5210Nr_barcod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
            A5211Nr_barreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtNr_barreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5211Nr_barreo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
            A5212Nr_barpar = httpContext.cgiGet( edtNr_barpar_Internalname) ;
            n5212Nr_barpar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5212Nr_barpar", A5212Nr_barpar);
            A5213Nr_discod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_discod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5213Nr_discod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TNOTREC");
            A5213Nr_discod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_discod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5213Nr_discod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
            forbiddenHiddens.add("Nr_discod", localUtil.format( DecimalUtil.doubleToDec(A5213Nr_discod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A5215Nr_user = httpContext.cgiGet( edtNr_user_Internalname) ;
            n5215Nr_user = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
            forbiddenHiddens.add("Nr_user", GXutil.rtrim( localUtil.format( A5215Nr_user, "@!")));
            A5216Nr_fecreg = localUtil.ctot( httpContext.cgiGet( edtNr_fecreg_Internalname)) ;
            n5216Nr_fecreg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("Nr_fecreg", localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"));
            A5210Nr_barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtNr_barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5210Nr_barcod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
            forbiddenHiddens.add("Nr_barcod", localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9"));
            A5211Nr_barreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtNr_barreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5211Nr_barreo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
            forbiddenHiddens.add("Nr_barreo", localUtil.format( DecimalUtil.doubleToDec(A5211Nr_barreo), "9"));
            A5212Nr_barpar = httpContext.cgiGet( edtNr_barpar_Internalname) ;
            n5212Nr_barpar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5212Nr_barpar", A5212Nr_barpar);
            forbiddenHiddens.add("Nr_barpar", GXutil.rtrim( localUtil.format( A5212Nr_barpar, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A5198Nr_codigo != Z5198Nr_codigo ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tnotrec:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5198Nr_codigo = (int)(GXutil.lval( httpContext.GetPar( "Nr_codigo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode761 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode761 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound761 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_OY0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "NR_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtNr_codigo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11OY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12OY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e12OY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllOY761( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributesOY761( ) ;
      }
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_OY0( )
   {
      beforeValidateOY761( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsOY761( ) ;
         }
         else
         {
            checkExtendedTableOY761( ) ;
            closeExtendedTableCursorsOY761( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode761 = Gx_mode ;
         confirm_OY764( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode761 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode761 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_OY764( )
   {
      nGXsfl_201_idx = 0 ;
      while ( nGXsfl_201_idx < nRC_GXsfl_201 )
      {
         readRowOY764( ) ;
         if ( ( nRcdExists_764 != 0 ) || ( nIsMod_764 != 0 ) )
         {
            getKeyOY764( ) ;
            if ( ( nRcdExists_764 == 0 ) && ( nRcdDeleted_764 == 0 ) )
            {
               if ( RcdFound764 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateOY764( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableOY764( ) ;
                     closeExtendedTableCursorsOY764( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound764 != 0 )
               {
                  if ( nRcdDeleted_764 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyOY764( ) ;
                     loadOY764( ) ;
                     beforeValidateOY764( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsOY764( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_764 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateOY764( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableOY764( ) ;
                           closeExtendedTableCursorsOY764( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_764 == 0 )
                  {
                     GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipDefCod_Internalname, h833TipDefCod) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_764_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_764_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_764_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_764 != 0 )
         {
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_201_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionOY0( )
   {
   }

   public void e11OY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnotrec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnotrec_impl.this.A396EmprCod = GXv_char2[0] ;
      tnotrec_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnotrec_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tnotrec_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV52EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tnotrec_impl.this.AV52EmprCod = GXv_char4[0] ;
      tnotrec_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnotrec_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV53WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV53WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV54TrnContext.fromxml(AV55WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV54TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV60Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV61GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GXV1), 8, 0));
         while ( AV61GXV1 <= AV54TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV57TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV54TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV61GXV1));
            if ( GXutil.strcmp(AV57TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipDisCod") == 0 )
            {
               AV56Insert_TipDisCod = AV57TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56Insert_TipDisCod", AV56Insert_TipDisCod);
            }
            AV61GXV1 = (int)(AV61GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GXV1), 8, 0));
         }
      }
   }

   public void e12OY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV54TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tnotrecww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTipdiscod_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divTipdiscod_cell_Internalname, "Class", divTipdiscod_cell_Class, true);
   }

   public void zmOY761( int GX_JID )
   {
      if ( ( GX_JID == 39 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5206Nr_albrecc = T00OY6_A5206Nr_albrecc[0] ;
            Z5340Nr_CliCod = T00OY6_A5340Nr_CliCod[0] ;
            Z5341Nr_CliNom = T00OY6_A5341Nr_CliNom[0] ;
            Z5199Nr_albent = T00OY6_A5199Nr_albent[0] ;
            Z5200Nr_refcli = T00OY6_A5200Nr_refcli[0] ;
            Z5201Nr_artcod = T00OY6_A5201Nr_artcod[0] ;
            Z5202Nr_artdsc = T00OY6_A5202Nr_artdsc[0] ;
            Z5203Nr_colnom = T00OY6_A5203Nr_colnom[0] ;
            Z5204Nr_colnum = T00OY6_A5204Nr_colnum[0] ;
            Z5205Nr_partida = T00OY6_A5205Nr_partida[0] ;
            Z5207Nr_piezas = T00OY6_A5207Nr_piezas[0] ;
            Z5208Nr_unidade = T00OY6_A5208Nr_unidade[0] ;
            Z5209Nr_unidad = T00OY6_A5209Nr_unidad[0] ;
            Z5222Nr_barcoda = T00OY6_A5222Nr_barcoda[0] ;
            Z5223Nr_barreoa = T00OY6_A5223Nr_barreoa[0] ;
            Z5224Nr_barpara = T00OY6_A5224Nr_barpara[0] ;
            Z12235Nr_NAlb = T00OY6_A12235Nr_NAlb[0] ;
            Z5214Nr_local = T00OY6_A5214Nr_local[0] ;
            Z5215Nr_user = T00OY6_A5215Nr_user[0] ;
            Z5216Nr_fecreg = T00OY6_A5216Nr_fecreg[0] ;
            Z5217Nr_fecent = T00OY6_A5217Nr_fecent[0] ;
            Z5210Nr_barcod = T00OY6_A5210Nr_barcod[0] ;
            Z5211Nr_barreo = T00OY6_A5211Nr_barreo[0] ;
            Z5212Nr_barpar = T00OY6_A5212Nr_barpar[0] ;
            Z5213Nr_discod = T00OY6_A5213Nr_discod[0] ;
            Z7090Nr_PartCod = T00OY6_A7090Nr_PartCod[0] ;
            Z7091Nr_ParNMtr = T00OY6_A7091Nr_ParNMtr[0] ;
            Z5098TipDisCod = T00OY6_A5098TipDisCod[0] ;
         }
         else
         {
            Z5206Nr_albrecc = A5206Nr_albrecc ;
            Z5340Nr_CliCod = A5340Nr_CliCod ;
            Z5341Nr_CliNom = A5341Nr_CliNom ;
            Z5199Nr_albent = A5199Nr_albent ;
            Z5200Nr_refcli = A5200Nr_refcli ;
            Z5201Nr_artcod = A5201Nr_artcod ;
            Z5202Nr_artdsc = A5202Nr_artdsc ;
            Z5203Nr_colnom = A5203Nr_colnom ;
            Z5204Nr_colnum = A5204Nr_colnum ;
            Z5205Nr_partida = A5205Nr_partida ;
            Z5207Nr_piezas = A5207Nr_piezas ;
            Z5208Nr_unidade = A5208Nr_unidade ;
            Z5209Nr_unidad = A5209Nr_unidad ;
            Z5222Nr_barcoda = A5222Nr_barcoda ;
            Z5223Nr_barreoa = A5223Nr_barreoa ;
            Z5224Nr_barpara = A5224Nr_barpara ;
            Z12235Nr_NAlb = A12235Nr_NAlb ;
            Z5214Nr_local = A5214Nr_local ;
            Z5215Nr_user = A5215Nr_user ;
            Z5216Nr_fecreg = A5216Nr_fecreg ;
            Z5217Nr_fecent = A5217Nr_fecent ;
            Z5210Nr_barcod = A5210Nr_barcod ;
            Z5211Nr_barreo = A5211Nr_barreo ;
            Z5212Nr_barpar = A5212Nr_barpar ;
            Z5213Nr_discod = A5213Nr_discod ;
            Z7090Nr_PartCod = A7090Nr_PartCod ;
            Z7091Nr_ParNMtr = A7091Nr_ParNMtr ;
            Z5098TipDisCod = A5098TipDisCod ;
         }
      }
      if ( GX_JID == -39 )
      {
         Z5198Nr_codigo = A5198Nr_codigo ;
         Z5206Nr_albrecc = A5206Nr_albrecc ;
         Z5340Nr_CliCod = A5340Nr_CliCod ;
         Z5341Nr_CliNom = A5341Nr_CliNom ;
         Z5199Nr_albent = A5199Nr_albent ;
         Z5200Nr_refcli = A5200Nr_refcli ;
         Z5201Nr_artcod = A5201Nr_artcod ;
         Z5202Nr_artdsc = A5202Nr_artdsc ;
         Z5203Nr_colnom = A5203Nr_colnom ;
         Z5204Nr_colnum = A5204Nr_colnum ;
         Z5205Nr_partida = A5205Nr_partida ;
         Z5207Nr_piezas = A5207Nr_piezas ;
         Z5208Nr_unidade = A5208Nr_unidade ;
         Z5209Nr_unidad = A5209Nr_unidad ;
         Z5222Nr_barcoda = A5222Nr_barcoda ;
         Z5223Nr_barreoa = A5223Nr_barreoa ;
         Z5224Nr_barpara = A5224Nr_barpara ;
         Z12235Nr_NAlb = A12235Nr_NAlb ;
         Z5214Nr_local = A5214Nr_local ;
         Z5215Nr_user = A5215Nr_user ;
         Z5216Nr_fecreg = A5216Nr_fecreg ;
         Z5217Nr_fecent = A5217Nr_fecent ;
         Z5210Nr_barcod = A5210Nr_barcod ;
         Z5211Nr_barreo = A5211Nr_barreo ;
         Z5212Nr_barpar = A5212Nr_barpar ;
         Z5213Nr_discod = A5213Nr_discod ;
         Z7090Nr_PartCod = A7090Nr_PartCod ;
         Z7091Nr_ParNMtr = A7091Nr_ParNMtr ;
         Z396EmprCod = A396EmprCod ;
         Z5098TipDisCod = A5098TipDisCod ;
         Z407EmprNom = A407EmprNom ;
         Z5097TipDisDsc = A5097TipDisDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtNr_discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_discod_Enabled), 5, 0), true);
      edtNr_fecreg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_fecreg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_fecreg_Enabled), 5, 0), true);
      edtNr_piezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_piezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_piezas_Enabled), 5, 0), true);
      edtNr_unidade_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_unidade_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_unidade_Enabled), 5, 0), true);
      cmbNr_unidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNr_unidad.getEnabled(), 5, 0), true);
      edtNr_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artcod_Enabled), 5, 0), true);
      edtNr_artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artdsc_Enabled), 5, 0), true);
      if ( true )
      {
         edtNr_CliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNr_CliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtNr_CliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNr_CliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliCod_Enabled), 5, 0), true);
      }
      edtNr_CliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliNom_Enabled), 5, 0), true);
      edtNr_albent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albent_Enabled), 5, 0), true);
      edtNr_albrecc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albrecc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albrecc_Enabled), 5, 0), true);
      edtNr_user_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_user_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_user_Enabled), 5, 0), true);
      edtNr_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barcod_Enabled), 5, 0), true);
      edtNr_barreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barreo_Enabled), 5, 0), true);
      edtNr_barpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barpar_Enabled), 5, 0), true);
      AV60Pgmname = "TNOTREC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Pgmname", AV60Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtNr_discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_discod_Enabled), 5, 0), true);
      edtNr_fecreg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_fecreg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_fecreg_Enabled), 5, 0), true);
      edtNr_piezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_piezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_piezas_Enabled), 5, 0), true);
      edtNr_unidade_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_unidade_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_unidade_Enabled), 5, 0), true);
      cmbNr_unidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNr_unidad.getEnabled(), 5, 0), true);
      edtNr_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artcod_Enabled), 5, 0), true);
      edtNr_artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artdsc_Enabled), 5, 0), true);
      edtNr_CliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliCod_Enabled), 5, 0), true);
      edtNr_CliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliNom_Enabled), 5, 0), true);
      edtNr_albent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albent_Enabled), 5, 0), true);
      edtNr_albrecc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albrecc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albrecc_Enabled), 5, 0), true);
      edtNr_user_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_user_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_user_Enabled), 5, 0), true);
      edtNr_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barcod_Enabled), 5, 0), true);
      edtNr_barreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barreo_Enabled), 5, 0), true);
      edtNr_barpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barpar_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV52EmprCod)==0) )
      {
         A396EmprCod = AV52EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00OY7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00OY7_A407EmprNom[0] ;
      n407EmprNom = T00OY7_n407EmprNom[0] ;
      pr_default.close(5);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TIPDIS", ""), ""), GXv_int7) ;
      tnotrec_impl.this.GXt_int6 = GXv_int7[0] ;
      edtTipDisCod_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TIPDIS", ""), ""), GXv_int7) ;
      tnotrec_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divTipdiscod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divTipdiscod_cell_Internalname, "Class", divTipdiscod_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TIPDIS", ""), ""), GXv_int7) ;
         tnotrec_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divTipdiscod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divTipdiscod_cell_Internalname, "Class", divTipdiscod_cell_Class, true);
         }
      }
      if ( ! (0==AV43Nr_codigo) )
      {
         A5198Nr_codigo = AV43Nr_codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      }
      else
      {
         A5198Nr_codigo = AV43Nr_codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      }
      if ( ! (0==AV43Nr_codigo) )
      {
         edtNr_codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNr_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_codigo_Enabled), 5, 0), true);
      }
      else
      {
         edtNr_codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNr_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_codigo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV43Nr_codigo) )
      {
         edtNr_codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNr_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_codigo_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV56Insert_TipDisCod)==0) )
      {
         edtTipDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV56Insert_TipDisCod)==0) )
      {
         A5098TipDisCod = AV56Insert_TipDisCod ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         /* Using cursor T00OY9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
         h5098TipDisCod = "" ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            h5098TipDisCod = T00OY9_A13845TipDisDscI[0] ;
            if (true) break;
         }
         pr_default.close(7);
         httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5215Nr_user)==0) && ( Gx_BScreen == 0 ) )
      {
         A5215Nr_user = AV8UsurCod ;
         n5215Nr_user = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A5216Nr_fecreg) && ( Gx_BScreen == 0 ) )
      {
         A5216Nr_fecreg = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n5216Nr_fecreg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T00OY8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
         A5097TipDisDsc = T00OY8_A5097TipDisDsc[0] ;
         n5097TipDisDsc = T00OY8_n5097TipDisDsc[0] ;
         pr_default.close(6);
      }
   }

   public void loadOY761( )
   {
      /* Using cursor T00OY10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound761 = (short)(1) ;
         A5206Nr_albrecc = T00OY10_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = T00OY10_n5206Nr_albrecc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
         A407EmprNom = T00OY10_A407EmprNom[0] ;
         n407EmprNom = T00OY10_n407EmprNom[0] ;
         A5340Nr_CliCod = T00OY10_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = T00OY10_n5340Nr_CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         A5341Nr_CliNom = T00OY10_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = T00OY10_n5341Nr_CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         A5199Nr_albent = T00OY10_A5199Nr_albent[0] ;
         n5199Nr_albent = T00OY10_n5199Nr_albent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         A5200Nr_refcli = T00OY10_A5200Nr_refcli[0] ;
         n5200Nr_refcli = T00OY10_n5200Nr_refcli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5200Nr_refcli", A5200Nr_refcli);
         A5201Nr_artcod = T00OY10_A5201Nr_artcod[0] ;
         n5201Nr_artcod = T00OY10_n5201Nr_artcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         A5202Nr_artdsc = T00OY10_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = T00OY10_n5202Nr_artdsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         A5203Nr_colnom = T00OY10_A5203Nr_colnom[0] ;
         n5203Nr_colnom = T00OY10_n5203Nr_colnom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5203Nr_colnom", A5203Nr_colnom);
         A5204Nr_colnum = T00OY10_A5204Nr_colnum[0] ;
         n5204Nr_colnum = T00OY10_n5204Nr_colnum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
         A5205Nr_partida = T00OY10_A5205Nr_partida[0] ;
         n5205Nr_partida = T00OY10_n5205Nr_partida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
         A5207Nr_piezas = T00OY10_A5207Nr_piezas[0] ;
         n5207Nr_piezas = T00OY10_n5207Nr_piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         A5208Nr_unidade = T00OY10_A5208Nr_unidade[0] ;
         n5208Nr_unidade = T00OY10_n5208Nr_unidade[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         A5209Nr_unidad = T00OY10_A5209Nr_unidad[0] ;
         n5209Nr_unidad = T00OY10_n5209Nr_unidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         A5222Nr_barcoda = T00OY10_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = T00OY10_n5222Nr_barcoda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
         A5223Nr_barreoa = T00OY10_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = T00OY10_n5223Nr_barreoa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
         A5224Nr_barpara = T00OY10_A5224Nr_barpara[0] ;
         n5224Nr_barpara = T00OY10_n5224Nr_barpara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5224Nr_barpara", A5224Nr_barpara);
         A12235Nr_NAlb = T00OY10_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = T00OY10_n12235Nr_NAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
         A5214Nr_local = T00OY10_A5214Nr_local[0] ;
         n5214Nr_local = T00OY10_n5214Nr_local[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5214Nr_local", A5214Nr_local);
         A5215Nr_user = T00OY10_A5215Nr_user[0] ;
         n5215Nr_user = T00OY10_n5215Nr_user[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
         A5216Nr_fecreg = T00OY10_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = T00OY10_n5216Nr_fecreg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5217Nr_fecent = T00OY10_A5217Nr_fecent[0] ;
         n5217Nr_fecent = T00OY10_n5217Nr_fecent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
         A5210Nr_barcod = T00OY10_A5210Nr_barcod[0] ;
         n5210Nr_barcod = T00OY10_n5210Nr_barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
         A5211Nr_barreo = T00OY10_A5211Nr_barreo[0] ;
         n5211Nr_barreo = T00OY10_n5211Nr_barreo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
         A5212Nr_barpar = T00OY10_A5212Nr_barpar[0] ;
         n5212Nr_barpar = T00OY10_n5212Nr_barpar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5212Nr_barpar", A5212Nr_barpar);
         A5213Nr_discod = T00OY10_A5213Nr_discod[0] ;
         n5213Nr_discod = T00OY10_n5213Nr_discod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
         A5097TipDisDsc = T00OY10_A5097TipDisDsc[0] ;
         n5097TipDisDsc = T00OY10_n5097TipDisDsc[0] ;
         A7090Nr_PartCod = T00OY10_A7090Nr_PartCod[0] ;
         n7090Nr_PartCod = T00OY10_n7090Nr_PartCod[0] ;
         A7091Nr_ParNMtr = T00OY10_A7091Nr_ParNMtr[0] ;
         n7091Nr_ParNMtr = T00OY10_n7091Nr_ParNMtr[0] ;
         A5098TipDisCod = T00OY10_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY10_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         zmOY761( -39) ;
      }
      pr_default.close(8);
      onLoadActionsOY761( ) ;
   }

   public void onLoadActionsOY761( )
   {
      /* Using cursor T00OY11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      h5098TipDisCod = "" ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         h5098TipDisCod = T00OY11_A13845TipDisDscI[0] ;
         if (true) break;
      }
      pr_default.close(9);
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
   }

   public void checkExtendedTableOY761( )
   {
      nIsDirty_761 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
      {
         nIsDirty_761 = (short)(1) ;
         A5098TipDisCod = "" ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
      }
      else
      {
         A13845TipDisDscI = h5098TipDisCod ;
         /* Using cursor T00OY12 */
         pr_default.execute(10, new Object[] {A13845TipDisDscI, A396EmprCod});
         A396EmprCod = T00OY12_A396EmprCod[0] ;
         A5098TipDisCod = T00OY12_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY12_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         A5098TipDisCod = T00OY12_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY12_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         if ( ! ( (pr_default.getStatus(10) == 101) ) )
         {
            pr_default.readNext(10);
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(10);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      if ( isIns( )  && ( ! (0==A5198Nr_codigo) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Inexistente", ""), 1, "NR_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNr_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A5206Nr_albrecc ;
         GXv_int9[0] = A5340Nr_CliCod ;
         GXv_char3[0] = A5341Nr_CliNom ;
         GXv_char2[0] = A5199Nr_albent ;
         GXv_char10[0] = A5201Nr_artcod ;
         GXv_char11[0] = A5202Nr_artdsc ;
         GXv_int12[0] = A5207Nr_piezas ;
         GXv_decimal13[0] = A5208Nr_unidade ;
         GXv_char14[0] = A5209Nr_unidad ;
         GXv_int7[0] = AV38Ctrl_r ;
         GXv_char15[0] = AV39Msg_1 ;
         new app.pnotrer(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_char3, GXv_char2, GXv_char10, GXv_char11, GXv_int12, GXv_decimal13, GXv_char14, GXv_int7, GXv_char15) ;
         tnotrec_impl.this.A396EmprCod = GXv_char4[0] ;
         tnotrec_impl.this.A5206Nr_albrecc = GXv_int8[0] ;
         tnotrec_impl.this.A5340Nr_CliCod = GXv_int9[0] ;
         tnotrec_impl.this.A5341Nr_CliNom = GXv_char3[0] ;
         tnotrec_impl.this.A5199Nr_albent = GXv_char2[0] ;
         tnotrec_impl.this.A5201Nr_artcod = GXv_char10[0] ;
         tnotrec_impl.this.A5202Nr_artdsc = GXv_char11[0] ;
         tnotrec_impl.this.A5207Nr_piezas = GXv_int12[0] ;
         tnotrec_impl.this.A5208Nr_unidade = GXv_decimal13[0] ;
         tnotrec_impl.this.A5209Nr_unidad = GXv_char14[0] ;
         tnotrec_impl.this.AV38Ctrl_r = GXv_int7[0] ;
         tnotrec_impl.this.AV39Msg_1 = GXv_char15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) && ( AV38Ctrl_r == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Nº no es una Devolucion¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Msg_1)==0) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(AV39Msg_1, 0, "");
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_char14[0] = A7090Nr_PartCod ;
         GXv_int12[0] = A5340Nr_CliCod ;
         GXv_char11[0] = A5341Nr_CliNom ;
         GXv_char10[0] = A5199Nr_albent ;
         GXv_char4[0] = A5201Nr_artcod ;
         GXv_char3[0] = A5202Nr_artdsc ;
         GXv_int9[0] = A5207Nr_piezas ;
         GXv_decimal13[0] = A5208Nr_unidade ;
         GXv_char2[0] = A5209Nr_unidad ;
         GXv_char16[0] = A7091Nr_ParNMtr ;
         GXv_int7[0] = AV38Ctrl_r ;
         GXv_char17[0] = AV39Msg_1 ;
         new app.pnotrep(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int12, GXv_char11, GXv_char10, GXv_char4, GXv_char3, GXv_int9, GXv_decimal13, GXv_char2, GXv_char16, GXv_int7, GXv_char17) ;
         tnotrec_impl.this.A396EmprCod = GXv_char15[0] ;
         tnotrec_impl.this.A7090Nr_PartCod = GXv_char14[0] ;
         tnotrec_impl.this.A5340Nr_CliCod = GXv_int12[0] ;
         tnotrec_impl.this.A5341Nr_CliNom = GXv_char11[0] ;
         tnotrec_impl.this.A5199Nr_albent = GXv_char10[0] ;
         tnotrec_impl.this.A5201Nr_artcod = GXv_char4[0] ;
         tnotrec_impl.this.A5202Nr_artdsc = GXv_char3[0] ;
         tnotrec_impl.this.A5207Nr_piezas = GXv_int9[0] ;
         tnotrec_impl.this.A5208Nr_unidade = GXv_decimal13[0] ;
         tnotrec_impl.this.A5209Nr_unidad = GXv_char2[0] ;
         tnotrec_impl.this.A7091Nr_ParNMtr = GXv_char16[0] ;
         tnotrec_impl.this.AV38Ctrl_r = GXv_int7[0] ;
         tnotrec_impl.this.AV39Msg_1 = GXv_char17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A7090Nr_PartCod", A7090Nr_PartCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         httpContext.ajax_rsp_assign_attri("", false, "A7091Nr_ParNMtr", A7091Nr_ParNMtr);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) && ( AV38Ctrl_r == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Nº no es una Devolucion de Hilo¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Msg_1)==0) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(AV39Msg_1, 0, "");
      }
      if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
      {
         nIsDirty_761 = (short)(1) ;
         A5098TipDisCod = "" ;
         n5098TipDisCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
      }
      else
      {
         A13845TipDisDscI = h5098TipDisCod ;
         /* Using cursor T00OY13 */
         pr_default.execute(11, new Object[] {A13845TipDisDscI, A396EmprCod});
         A5098TipDisCod = T00OY13_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY13_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         A5098TipDisCod = T00OY13_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY13_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         if ( ! ( (pr_default.getStatus(11) == 101) ) )
         {
            pr_default.readNext(11);
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(11);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      /* Using cursor T00OY8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5098TipDisCod)==0) && (GXutil.strcmp("", A13845TipDisDscI)==0) || (GXutil.strcmp("", A5098TipDisCod)==0) && n5098TipDisCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDisCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5097TipDisDsc = T00OY8_A5097TipDisDsc[0] ;
      n5097TipDisDsc = T00OY8_n5097TipDisDsc[0] ;
      pr_default.close(6);
   }

   public void closeExtendedTableCursorsOY761( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_41( String A396EmprCod ,
                          String A5098TipDisCod )
   {
      /* Using cursor T00OY14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5098TipDisCod)==0) && (GXutil.strcmp("", A13845TipDisDscI)==0) || (GXutil.strcmp("", A5098TipDisCod)==0) && n5098TipDisCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDisCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A5097TipDisDsc = T00OY14_A5097TipDisDsc[0] ;
      n5097TipDisDsc = T00OY14_n5097TipDisDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5097TipDisDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKeyOY761( )
   {
      /* Using cursor T00OY15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound761 = (short)(1) ;
      }
      else
      {
         RcdFound761 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00OY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00OY6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmOY761( 39) ;
         RcdFound761 = (short)(1) ;
         A5198Nr_codigo = T00OY6_A5198Nr_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
         A5206Nr_albrecc = T00OY6_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = T00OY6_n5206Nr_albrecc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
         A5340Nr_CliCod = T00OY6_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = T00OY6_n5340Nr_CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         A5341Nr_CliNom = T00OY6_A5341Nr_CliNom[0] ;
         n5341Nr_CliNom = T00OY6_n5341Nr_CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         A5199Nr_albent = T00OY6_A5199Nr_albent[0] ;
         n5199Nr_albent = T00OY6_n5199Nr_albent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         A5200Nr_refcli = T00OY6_A5200Nr_refcli[0] ;
         n5200Nr_refcli = T00OY6_n5200Nr_refcli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5200Nr_refcli", A5200Nr_refcli);
         A5201Nr_artcod = T00OY6_A5201Nr_artcod[0] ;
         n5201Nr_artcod = T00OY6_n5201Nr_artcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         A5202Nr_artdsc = T00OY6_A5202Nr_artdsc[0] ;
         n5202Nr_artdsc = T00OY6_n5202Nr_artdsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         A5203Nr_colnom = T00OY6_A5203Nr_colnom[0] ;
         n5203Nr_colnom = T00OY6_n5203Nr_colnom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5203Nr_colnom", A5203Nr_colnom);
         A5204Nr_colnum = T00OY6_A5204Nr_colnum[0] ;
         n5204Nr_colnum = T00OY6_n5204Nr_colnum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
         A5205Nr_partida = T00OY6_A5205Nr_partida[0] ;
         n5205Nr_partida = T00OY6_n5205Nr_partida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
         A5207Nr_piezas = T00OY6_A5207Nr_piezas[0] ;
         n5207Nr_piezas = T00OY6_n5207Nr_piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         A5208Nr_unidade = T00OY6_A5208Nr_unidade[0] ;
         n5208Nr_unidade = T00OY6_n5208Nr_unidade[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         A5209Nr_unidad = T00OY6_A5209Nr_unidad[0] ;
         n5209Nr_unidad = T00OY6_n5209Nr_unidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         A5222Nr_barcoda = T00OY6_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = T00OY6_n5222Nr_barcoda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
         A5223Nr_barreoa = T00OY6_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = T00OY6_n5223Nr_barreoa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
         A5224Nr_barpara = T00OY6_A5224Nr_barpara[0] ;
         n5224Nr_barpara = T00OY6_n5224Nr_barpara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5224Nr_barpara", A5224Nr_barpara);
         A12235Nr_NAlb = T00OY6_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = T00OY6_n12235Nr_NAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
         A5214Nr_local = T00OY6_A5214Nr_local[0] ;
         n5214Nr_local = T00OY6_n5214Nr_local[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5214Nr_local", A5214Nr_local);
         A5215Nr_user = T00OY6_A5215Nr_user[0] ;
         n5215Nr_user = T00OY6_n5215Nr_user[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
         A5216Nr_fecreg = T00OY6_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = T00OY6_n5216Nr_fecreg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5217Nr_fecent = T00OY6_A5217Nr_fecent[0] ;
         n5217Nr_fecent = T00OY6_n5217Nr_fecent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
         A5210Nr_barcod = T00OY6_A5210Nr_barcod[0] ;
         n5210Nr_barcod = T00OY6_n5210Nr_barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
         A5211Nr_barreo = T00OY6_A5211Nr_barreo[0] ;
         n5211Nr_barreo = T00OY6_n5211Nr_barreo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
         A5212Nr_barpar = T00OY6_A5212Nr_barpar[0] ;
         n5212Nr_barpar = T00OY6_n5212Nr_barpar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5212Nr_barpar", A5212Nr_barpar);
         A5213Nr_discod = T00OY6_A5213Nr_discod[0] ;
         n5213Nr_discod = T00OY6_n5213Nr_discod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
         A7090Nr_PartCod = T00OY6_A7090Nr_PartCod[0] ;
         n7090Nr_PartCod = T00OY6_n7090Nr_PartCod[0] ;
         A7091Nr_ParNMtr = T00OY6_A7091Nr_ParNMtr[0] ;
         n7091Nr_ParNMtr = T00OY6_n7091Nr_ParNMtr[0] ;
         A5098TipDisCod = T00OY6_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY6_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         Z396EmprCod = A396EmprCod ;
         Z5198Nr_codigo = A5198Nr_codigo ;
         sMode761 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadOY761( ) ;
         if ( AnyError == 1 )
         {
            RcdFound761 = (short)(0) ;
            initializeNonKeyOY761( ) ;
         }
         Gx_mode = sMode761 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound761 = (short)(0) ;
         initializeNonKeyOY761( ) ;
         sMode761 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode761 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyOY761( ) ;
      if ( RcdFound761 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound761 = (short)(0) ;
      /* Using cursor T00OY16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A5198Nr_codigo), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T00OY16_A5198Nr_codigo[0] < A5198Nr_codigo ) ) && ( GXutil.strcmp(T00OY16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T00OY16_A5198Nr_codigo[0] > A5198Nr_codigo ) ) && ( GXutil.strcmp(T00OY16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5198Nr_codigo = T00OY16_A5198Nr_codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
            RcdFound761 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound761 = (short)(0) ;
      /* Using cursor T00OY17 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A5198Nr_codigo), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T00OY17_A5198Nr_codigo[0] > A5198Nr_codigo ) ) && ( GXutil.strcmp(T00OY17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T00OY17_A5198Nr_codigo[0] < A5198Nr_codigo ) ) && ( GXutil.strcmp(T00OY17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5198Nr_codigo = T00OY17_A5198Nr_codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
            RcdFound761 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyOY761( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtNr_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertOY761( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound761 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5198Nr_codigo != Z5198Nr_codigo ) )
            {
               A5198Nr_codigo = Z5198Nr_codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "NR_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNr_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtNr_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateOY761( ) ;
               GX_FocusControl = edtNr_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5198Nr_codigo != Z5198Nr_codigo ) )
            {
               /* Insert record */
               GX_FocusControl = edtNr_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertOY761( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "NR_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtNr_codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtNr_codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertOY761( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5198Nr_codigo != Z5198Nr_codigo ) )
      {
         A5198Nr_codigo = Z5198Nr_codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "NR_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNr_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtNr_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyOY761( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
         {
            A5098TipDisCod = "" ;
            n5098TipDisCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         }
         else
         {
            A13845TipDisDscI = h5098TipDisCod ;
            /* Using cursor T00OY18 */
            pr_default.execute(16, new Object[] {A13845TipDisDscI, A396EmprCod});
            A396EmprCod = T00OY18_A396EmprCod[0] ;
            A5098TipDisCod = T00OY18_A5098TipDisCod[0] ;
            n5098TipDisCod = T00OY18_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
            A5098TipDisCod = T00OY18_A5098TipDisCod[0] ;
            n5098TipDisCod = T00OY18_n5098TipDisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               pr_default.readNext(16);
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDISCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(16);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00OY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNOTREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( Z5206Nr_albrecc != T00OY5_A5206Nr_albrecc[0] ) || ( Z5340Nr_CliCod != T00OY5_A5340Nr_CliCod[0] ) || ( GXutil.strcmp(Z5341Nr_CliNom, T00OY5_A5341Nr_CliNom[0]) != 0 ) || ( GXutil.strcmp(Z5199Nr_albent, T00OY5_A5199Nr_albent[0]) != 0 ) || ( GXutil.strcmp(Z5200Nr_refcli, T00OY5_A5200Nr_refcli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5201Nr_artcod, T00OY5_A5201Nr_artcod[0]) != 0 ) || ( GXutil.strcmp(Z5202Nr_artdsc, T00OY5_A5202Nr_artdsc[0]) != 0 ) || ( GXutil.strcmp(Z5203Nr_colnom, T00OY5_A5203Nr_colnom[0]) != 0 ) || ( Z5204Nr_colnum != T00OY5_A5204Nr_colnum[0] ) || ( Z5205Nr_partida != T00OY5_A5205Nr_partida[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5207Nr_piezas != T00OY5_A5207Nr_piezas[0] ) || ( DecimalUtil.compareTo(Z5208Nr_unidade, T00OY5_A5208Nr_unidade[0]) != 0 ) || ( GXutil.strcmp(Z5209Nr_unidad, T00OY5_A5209Nr_unidad[0]) != 0 ) || ( Z5222Nr_barcoda != T00OY5_A5222Nr_barcoda[0] ) || ( Z5223Nr_barreoa != T00OY5_A5223Nr_barreoa[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5224Nr_barpara, T00OY5_A5224Nr_barpara[0]) != 0 ) || ( Z12235Nr_NAlb != T00OY5_A12235Nr_NAlb[0] ) || ( GXutil.strcmp(Z5214Nr_local, T00OY5_A5214Nr_local[0]) != 0 ) || ( GXutil.strcmp(Z5215Nr_user, T00OY5_A5215Nr_user[0]) != 0 ) || !( GXutil.dateCompare(Z5216Nr_fecreg, T00OY5_A5216Nr_fecreg[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z5217Nr_fecent), GXutil.resetTime(T00OY5_A5217Nr_fecent[0])) ) || ( Z5210Nr_barcod != T00OY5_A5210Nr_barcod[0] ) || ( Z5211Nr_barreo != T00OY5_A5211Nr_barreo[0] ) || ( GXutil.strcmp(Z5212Nr_barpar, T00OY5_A5212Nr_barpar[0]) != 0 ) || ( Z5213Nr_discod != T00OY5_A5213Nr_discod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7090Nr_PartCod, T00OY5_A7090Nr_PartCod[0]) != 0 ) || ( GXutil.strcmp(Z7091Nr_ParNMtr, T00OY5_A7091Nr_ParNMtr[0]) != 0 ) || ( GXutil.strcmp(Z5098TipDisCod, T00OY5_A5098TipDisCod[0]) != 0 ) )
         {
            if ( Z5206Nr_albrecc != T00OY5_A5206Nr_albrecc[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_albrecc");
               GXutil.writeLogRaw("Old: ",Z5206Nr_albrecc);
               GXutil.writeLogRaw("Current: ",T00OY5_A5206Nr_albrecc[0]);
            }
            if ( Z5340Nr_CliCod != T00OY5_A5340Nr_CliCod[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_CliCod");
               GXutil.writeLogRaw("Old: ",Z5340Nr_CliCod);
               GXutil.writeLogRaw("Current: ",T00OY5_A5340Nr_CliCod[0]);
            }
            if ( GXutil.strcmp(Z5341Nr_CliNom, T00OY5_A5341Nr_CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_CliNom");
               GXutil.writeLogRaw("Old: ",Z5341Nr_CliNom);
               GXutil.writeLogRaw("Current: ",T00OY5_A5341Nr_CliNom[0]);
            }
            if ( GXutil.strcmp(Z5199Nr_albent, T00OY5_A5199Nr_albent[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_albent");
               GXutil.writeLogRaw("Old: ",Z5199Nr_albent);
               GXutil.writeLogRaw("Current: ",T00OY5_A5199Nr_albent[0]);
            }
            if ( GXutil.strcmp(Z5200Nr_refcli, T00OY5_A5200Nr_refcli[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_refcli");
               GXutil.writeLogRaw("Old: ",Z5200Nr_refcli);
               GXutil.writeLogRaw("Current: ",T00OY5_A5200Nr_refcli[0]);
            }
            if ( GXutil.strcmp(Z5201Nr_artcod, T00OY5_A5201Nr_artcod[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_artcod");
               GXutil.writeLogRaw("Old: ",Z5201Nr_artcod);
               GXutil.writeLogRaw("Current: ",T00OY5_A5201Nr_artcod[0]);
            }
            if ( GXutil.strcmp(Z5202Nr_artdsc, T00OY5_A5202Nr_artdsc[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_artdsc");
               GXutil.writeLogRaw("Old: ",Z5202Nr_artdsc);
               GXutil.writeLogRaw("Current: ",T00OY5_A5202Nr_artdsc[0]);
            }
            if ( GXutil.strcmp(Z5203Nr_colnom, T00OY5_A5203Nr_colnom[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_colnom");
               GXutil.writeLogRaw("Old: ",Z5203Nr_colnom);
               GXutil.writeLogRaw("Current: ",T00OY5_A5203Nr_colnom[0]);
            }
            if ( Z5204Nr_colnum != T00OY5_A5204Nr_colnum[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_colnum");
               GXutil.writeLogRaw("Old: ",Z5204Nr_colnum);
               GXutil.writeLogRaw("Current: ",T00OY5_A5204Nr_colnum[0]);
            }
            if ( Z5205Nr_partida != T00OY5_A5205Nr_partida[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_partida");
               GXutil.writeLogRaw("Old: ",Z5205Nr_partida);
               GXutil.writeLogRaw("Current: ",T00OY5_A5205Nr_partida[0]);
            }
            if ( Z5207Nr_piezas != T00OY5_A5207Nr_piezas[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_piezas");
               GXutil.writeLogRaw("Old: ",Z5207Nr_piezas);
               GXutil.writeLogRaw("Current: ",T00OY5_A5207Nr_piezas[0]);
            }
            if ( DecimalUtil.compareTo(Z5208Nr_unidade, T00OY5_A5208Nr_unidade[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_unidade");
               GXutil.writeLogRaw("Old: ",Z5208Nr_unidade);
               GXutil.writeLogRaw("Current: ",T00OY5_A5208Nr_unidade[0]);
            }
            if ( GXutil.strcmp(Z5209Nr_unidad, T00OY5_A5209Nr_unidad[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_unidad");
               GXutil.writeLogRaw("Old: ",Z5209Nr_unidad);
               GXutil.writeLogRaw("Current: ",T00OY5_A5209Nr_unidad[0]);
            }
            if ( Z5222Nr_barcoda != T00OY5_A5222Nr_barcoda[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_barcoda");
               GXutil.writeLogRaw("Old: ",Z5222Nr_barcoda);
               GXutil.writeLogRaw("Current: ",T00OY5_A5222Nr_barcoda[0]);
            }
            if ( Z5223Nr_barreoa != T00OY5_A5223Nr_barreoa[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_barreoa");
               GXutil.writeLogRaw("Old: ",Z5223Nr_barreoa);
               GXutil.writeLogRaw("Current: ",T00OY5_A5223Nr_barreoa[0]);
            }
            if ( GXutil.strcmp(Z5224Nr_barpara, T00OY5_A5224Nr_barpara[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_barpara");
               GXutil.writeLogRaw("Old: ",Z5224Nr_barpara);
               GXutil.writeLogRaw("Current: ",T00OY5_A5224Nr_barpara[0]);
            }
            if ( Z12235Nr_NAlb != T00OY5_A12235Nr_NAlb[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_NAlb");
               GXutil.writeLogRaw("Old: ",Z12235Nr_NAlb);
               GXutil.writeLogRaw("Current: ",T00OY5_A12235Nr_NAlb[0]);
            }
            if ( GXutil.strcmp(Z5214Nr_local, T00OY5_A5214Nr_local[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_local");
               GXutil.writeLogRaw("Old: ",Z5214Nr_local);
               GXutil.writeLogRaw("Current: ",T00OY5_A5214Nr_local[0]);
            }
            if ( GXutil.strcmp(Z5215Nr_user, T00OY5_A5215Nr_user[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_user");
               GXutil.writeLogRaw("Old: ",Z5215Nr_user);
               GXutil.writeLogRaw("Current: ",T00OY5_A5215Nr_user[0]);
            }
            if ( !( GXutil.dateCompare(Z5216Nr_fecreg, T00OY5_A5216Nr_fecreg[0]) ) )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_fecreg");
               GXutil.writeLogRaw("Old: ",Z5216Nr_fecreg);
               GXutil.writeLogRaw("Current: ",T00OY5_A5216Nr_fecreg[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5217Nr_fecent), GXutil.resetTime(T00OY5_A5217Nr_fecent[0])) ) )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_fecent");
               GXutil.writeLogRaw("Old: ",Z5217Nr_fecent);
               GXutil.writeLogRaw("Current: ",T00OY5_A5217Nr_fecent[0]);
            }
            if ( Z5210Nr_barcod != T00OY5_A5210Nr_barcod[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_barcod");
               GXutil.writeLogRaw("Old: ",Z5210Nr_barcod);
               GXutil.writeLogRaw("Current: ",T00OY5_A5210Nr_barcod[0]);
            }
            if ( Z5211Nr_barreo != T00OY5_A5211Nr_barreo[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_barreo");
               GXutil.writeLogRaw("Old: ",Z5211Nr_barreo);
               GXutil.writeLogRaw("Current: ",T00OY5_A5211Nr_barreo[0]);
            }
            if ( GXutil.strcmp(Z5212Nr_barpar, T00OY5_A5212Nr_barpar[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_barpar");
               GXutil.writeLogRaw("Old: ",Z5212Nr_barpar);
               GXutil.writeLogRaw("Current: ",T00OY5_A5212Nr_barpar[0]);
            }
            if ( Z5213Nr_discod != T00OY5_A5213Nr_discod[0] )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_discod");
               GXutil.writeLogRaw("Old: ",Z5213Nr_discod);
               GXutil.writeLogRaw("Current: ",T00OY5_A5213Nr_discod[0]);
            }
            if ( GXutil.strcmp(Z7090Nr_PartCod, T00OY5_A7090Nr_PartCod[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_PartCod");
               GXutil.writeLogRaw("Old: ",Z7090Nr_PartCod);
               GXutil.writeLogRaw("Current: ",T00OY5_A7090Nr_PartCod[0]);
            }
            if ( GXutil.strcmp(Z7091Nr_ParNMtr, T00OY5_A7091Nr_ParNMtr[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"Nr_ParNMtr");
               GXutil.writeLogRaw("Old: ",Z7091Nr_ParNMtr);
               GXutil.writeLogRaw("Current: ",T00OY5_A7091Nr_ParNMtr[0]);
            }
            if ( GXutil.strcmp(Z5098TipDisCod, T00OY5_A5098TipDisCod[0]) != 0 )
            {
               GXutil.writeLogln("tnotrec:[seudo value changed for attri]"+"TipDisCod");
               GXutil.writeLogRaw("Old: ",Z5098TipDisCod);
               GXutil.writeLogRaw("Current: ",T00OY5_A5098TipDisCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPNOTREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertOY761( )
   {
      beforeValidateOY761( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOY761( ) ;
      }
      if ( AnyError == 0 )
      {
         zmOY761( 0) ;
         checkOptimisticConcurrencyOY761( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmOY761( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertOY761( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OY19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A5198Nr_codigo), Boolean.valueOf(n5206Nr_albrecc), Integer.valueOf(A5206Nr_albrecc), Boolean.valueOf(n5340Nr_CliCod), Integer.valueOf(A5340Nr_CliCod), Boolean.valueOf(n5341Nr_CliNom), A5341Nr_CliNom, Boolean.valueOf(n5199Nr_albent), A5199Nr_albent, Boolean.valueOf(n5200Nr_refcli), A5200Nr_refcli, Boolean.valueOf(n5201Nr_artcod), A5201Nr_artcod, Boolean.valueOf(n5202Nr_artdsc), A5202Nr_artdsc, Boolean.valueOf(n5203Nr_colnom), A5203Nr_colnom, Boolean.valueOf(n5204Nr_colnum), Integer.valueOf(A5204Nr_colnum), Boolean.valueOf(n5205Nr_partida), Integer.valueOf(A5205Nr_partida), Boolean.valueOf(n5207Nr_piezas), Integer.valueOf(A5207Nr_piezas), Boolean.valueOf(n5208Nr_unidade), A5208Nr_unidade, Boolean.valueOf(n5209Nr_unidad), A5209Nr_unidad, Boolean.valueOf(n5222Nr_barcoda), Integer.valueOf(A5222Nr_barcoda), Boolean.valueOf(n5223Nr_barreoa), Byte.valueOf(A5223Nr_barreoa), Boolean.valueOf(n5224Nr_barpara), A5224Nr_barpara, Boolean.valueOf(n12235Nr_NAlb), Long.valueOf(A12235Nr_NAlb), Boolean.valueOf(n5214Nr_local), A5214Nr_local, Boolean.valueOf(n5215Nr_user), A5215Nr_user, Boolean.valueOf(n5216Nr_fecreg), A5216Nr_fecreg, Boolean.valueOf(n5217Nr_fecent), A5217Nr_fecent, Boolean.valueOf(n5210Nr_barcod), Integer.valueOf(A5210Nr_barcod), Boolean.valueOf(n5211Nr_barreo), Byte.valueOf(A5211Nr_barreo), Boolean.valueOf(n5212Nr_barpar), A5212Nr_barpar, Boolean.valueOf(n5213Nr_discod), Integer.valueOf(A5213Nr_discod), Boolean.valueOf(n7090Nr_PartCod), A7090Nr_PartCod, Boolean.valueOf(n7091Nr_ParNMtr), A7091Nr_ParNMtr, A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelOY761( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionOY0( ) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            loadOY761( ) ;
         }
         endLevelOY761( ) ;
      }
      closeExtendedTableCursorsOY761( ) ;
   }

   public void updateOY761( )
   {
      beforeValidateOY761( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOY761( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyOY761( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmOY761( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateOY761( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OY20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n5206Nr_albrecc), Integer.valueOf(A5206Nr_albrecc), Boolean.valueOf(n5340Nr_CliCod), Integer.valueOf(A5340Nr_CliCod), Boolean.valueOf(n5341Nr_CliNom), A5341Nr_CliNom, Boolean.valueOf(n5199Nr_albent), A5199Nr_albent, Boolean.valueOf(n5200Nr_refcli), A5200Nr_refcli, Boolean.valueOf(n5201Nr_artcod), A5201Nr_artcod, Boolean.valueOf(n5202Nr_artdsc), A5202Nr_artdsc, Boolean.valueOf(n5203Nr_colnom), A5203Nr_colnom, Boolean.valueOf(n5204Nr_colnum), Integer.valueOf(A5204Nr_colnum), Boolean.valueOf(n5205Nr_partida), Integer.valueOf(A5205Nr_partida), Boolean.valueOf(n5207Nr_piezas), Integer.valueOf(A5207Nr_piezas), Boolean.valueOf(n5208Nr_unidade), A5208Nr_unidade, Boolean.valueOf(n5209Nr_unidad), A5209Nr_unidad, Boolean.valueOf(n5222Nr_barcoda), Integer.valueOf(A5222Nr_barcoda), Boolean.valueOf(n5223Nr_barreoa), Byte.valueOf(A5223Nr_barreoa), Boolean.valueOf(n5224Nr_barpara), A5224Nr_barpara, Boolean.valueOf(n12235Nr_NAlb), Long.valueOf(A12235Nr_NAlb), Boolean.valueOf(n5214Nr_local), A5214Nr_local, Boolean.valueOf(n5215Nr_user), A5215Nr_user, Boolean.valueOf(n5216Nr_fecreg), A5216Nr_fecreg, Boolean.valueOf(n5217Nr_fecent), A5217Nr_fecent, Boolean.valueOf(n5210Nr_barcod), Integer.valueOf(A5210Nr_barcod), Boolean.valueOf(n5211Nr_barreo), Byte.valueOf(A5211Nr_barreo), Boolean.valueOf(n5212Nr_barpar), A5212Nr_barpar, Boolean.valueOf(n5213Nr_discod), Integer.valueOf(A5213Nr_discod), Boolean.valueOf(n7090Nr_PartCod), A7090Nr_PartCod, Boolean.valueOf(n7091Nr_ParNMtr), A7091Nr_ParNMtr, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod, A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNOTREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateOY761( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelOY761( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevelOY761( ) ;
      }
      closeExtendedTableCursorsOY761( ) ;
   }

   public void deferredUpdateOY761( )
   {
   }

   public void delete( )
   {
      beforeValidateOY761( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyOY761( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsOY761( ) ;
         afterConfirmOY761( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteOY761( ) ;
            if ( AnyError == 0 )
            {
               scanStartOY764( ) ;
               while ( RcdFound764 != 0 )
               {
                  getByPrimaryKeyOY764( ) ;
                  deleteOY764( ) ;
                  scanNextOY764( ) ;
               }
               scanEndOY764( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OY21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
      }
      sMode761 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelOY761( ) ;
      Gx_mode = sMode761 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsOY761( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A5198Nr_codigo) ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Inexistente", ""), 1, "NR_CODIGO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtNr_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) && ( AV38Ctrl_r == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Nº no es una Devolucion¡¡¡", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ! (GXutil.strcmp("", AV39Msg_1)==0) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(AV39Msg_1, 0, "");
         }
         if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) && ( AV38Ctrl_r == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Nº no es una Devolucion de Hilo¡¡¡", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ! (GXutil.strcmp("", AV39Msg_1)==0) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(AV39Msg_1, 0, "");
         }
         /* Using cursor T00OY22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
         A5097TipDisDsc = T00OY22_A5097TipDisDsc[0] ;
         n5097TipDisDsc = T00OY22_n5097TipDisDsc[0] ;
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00OY23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NOTRTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00OY24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00OY25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NOTRCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevelOY764( )
   {
      nGXsfl_201_idx = 0 ;
      while ( nGXsfl_201_idx < nRC_GXsfl_201 )
      {
         readRowOY764( ) ;
         if ( ( nRcdExists_764 != 0 ) || ( nIsMod_764 != 0 ) )
         {
            standaloneNotModalOY764( ) ;
            getKeyOY764( ) ;
            if ( ( nRcdExists_764 == 0 ) && ( nRcdDeleted_764 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertOY764( ) ;
            }
            else
            {
               if ( RcdFound764 != 0 )
               {
                  if ( ( nRcdDeleted_764 != 0 ) && ( nRcdExists_764 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteOY764( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_764 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateOY764( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_764 == 0 )
                  {
                     GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipDefCod_Internalname, h833TipDefCod) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_764_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_764_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_764_"+sGXsfl_201_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_764 != 0 )
         {
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_201_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllOY764( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_764 = (short)(0) ;
      nIsMod_764 = (short)(0) ;
      nRcdDeleted_764 = (short)(0) ;
   }

   public void processLevelOY761( )
   {
      /* Save parent mode. */
      sMode761 = Gx_mode ;
      processNestedLevelOY764( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode761 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelOY761( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteOY761( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tnotrec");
         if ( AnyError == 0 )
         {
            confirmValuesOY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tnotrec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartOY761( )
   {
      /* Scan By routine */
      /* Using cursor T00OY26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      RcdFound761 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound761 = (short)(1) ;
         A5198Nr_codigo = T00OY26_A5198Nr_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextOY761( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound761 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound761 = (short)(1) ;
         A5198Nr_codigo = T00OY26_A5198Nr_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      }
   }

   public void scanEndOY761( )
   {
      pr_default.close(24);
   }

   public void afterConfirmOY761( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertOY761( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateOY761( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteOY761( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteOY761( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateOY761( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesOY761( )
   {
      edtNr_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_codigo_Enabled), 5, 0), true);
      edtNr_albrecc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albrecc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albrecc_Enabled), 5, 0), true);
      edtTipDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Enabled), 5, 0), true);
      edtNr_CliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliCod_Enabled), 5, 0), true);
      edtNr_CliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_CliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_CliNom_Enabled), 5, 0), true);
      edtNr_albent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_albent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_albent_Enabled), 5, 0), true);
      edtNr_refcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_refcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_refcli_Enabled), 5, 0), true);
      edtNr_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artcod_Enabled), 5, 0), true);
      edtNr_artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_artdsc_Enabled), 5, 0), true);
      edtNr_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_colnom_Enabled), 5, 0), true);
      edtNr_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_colnum_Enabled), 5, 0), true);
      edtNr_partida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_partida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_partida_Enabled), 5, 0), true);
      edtNr_piezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_piezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_piezas_Enabled), 5, 0), true);
      edtNr_unidade_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_unidade_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_unidade_Enabled), 5, 0), true);
      cmbNr_unidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbNr_unidad.getEnabled(), 5, 0), true);
      edtNr_barcoda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barcoda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barcoda_Enabled), 5, 0), true);
      edtNr_barreoa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barreoa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barreoa_Enabled), 5, 0), true);
      edtNr_barpara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barpara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barpara_Enabled), 5, 0), true);
      edtNr_NAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_NAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_NAlb_Enabled), 5, 0), true);
      edtNr_local_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_local_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_local_Enabled), 5, 0), true);
      edtNr_fecent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_fecent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_fecent_Enabled), 5, 0), true);
      edtNr_fecreg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_fecreg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_fecreg_Enabled), 5, 0), true);
      edtNr_user_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_user_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_user_Enabled), 5, 0), true);
      edtNr_barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barcod_Enabled), 5, 0), true);
      edtNr_barreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barreo_Enabled), 5, 0), true);
      edtNr_barpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_barpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_barpar_Enabled), 5, 0), true);
      edtNr_discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNr_discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNr_discod_Enabled), 5, 0), true);
   }

   public void zmOY764( int GX_JID )
   {
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -42 )
      {
         Z5198Nr_codigo = A5198Nr_codigo ;
         Z396EmprCod = A396EmprCod ;
         Z833TipDefCod = A833TipDefCod ;
         Z834TipDefDsc = A834TipDefDsc ;
      }
   }

   public void standaloneNotModalOY764( )
   {
   }

   public void standaloneModalOY764( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTipDefCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_201_Refreshing);
      }
      else
      {
         edtTipDefCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_201_Refreshing);
      }
   }

   public void loadOY764( )
   {
      /* Using cursor T00OY27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound764 = (short)(1) ;
         A834TipDefDsc = T00OY27_A834TipDefDsc[0] ;
         n834TipDefDsc = T00OY27_n834TipDefDsc[0] ;
         zmOY764( -42) ;
      }
      pr_default.close(25);
      onLoadActionsOY764( ) ;
   }

   public void onLoadActionsOY764( )
   {
      /* Using cursor T00OY28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      h833TipDefCod = "" ;
      while ( (pr_default.getStatus(26) != 101) )
      {
         h833TipDefCod = T00OY28_A13819TipdefDscI[0] ;
         if (true) break;
      }
      pr_default.close(26);
      httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
   }

   public void checkExtendedTableOY764( )
   {
      nIsDirty_764 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalOY764( ) ;
      if ( (GXutil.strcmp("", h833TipDefCod)==0) )
      {
         nIsDirty_764 = (short)(1) ;
         A833TipDefCod = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = h833TipDefCod ;
         /* Using cursor T00OY29 */
         pr_default.execute(27, new Object[] {A13819TipdefDscI, A396EmprCod});
         A396EmprCod = T00OY29_A396EmprCod[0] ;
         A833TipDefCod = T00OY29_A833TipDefCod[0] ;
         A833TipDefCod = T00OY29_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(27) == 101) ) )
         {
            pr_default.readNext(27);
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(27);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
      if ( (GXutil.strcmp("", h833TipDefCod)==0) )
      {
         nIsDirty_764 = (short)(1) ;
         A833TipDefCod = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = h833TipDefCod ;
         /* Using cursor T00OY30 */
         pr_default.execute(28, new Object[] {A13819TipdefDscI, A396EmprCod});
         A833TipDefCod = T00OY30_A833TipDefCod[0] ;
         A833TipDefCod = T00OY30_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(28) == 101) ) )
         {
            pr_default.readNext(28);
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(28);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
      /* Using cursor T00OY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T00OY4_A834TipDefDsc[0] ;
      n834TipDefDsc = T00OY4_n834TipDefDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsOY764( )
   {
      pr_default.close(2);
   }

   public void enableDisableOY764( )
   {
   }

   public void gxload_43( String A396EmprCod ,
                          short A833TipDefCod )
   {
      /* Using cursor T00OY31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T00OY31_A834TipDefDsc[0] ;
      n834TipDefDsc = T00OY31_n834TipDefDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A834TipDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void getKeyOY764( )
   {
      if ( (GXutil.strcmp("", h833TipDefCod)==0) )
      {
         A833TipDefCod = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = h833TipDefCod ;
         /* Using cursor T00OY32 */
         pr_default.execute(30, new Object[] {A13819TipdefDscI, A396EmprCod});
         A396EmprCod = T00OY32_A396EmprCod[0] ;
         A833TipDefCod = T00OY32_A833TipDefCod[0] ;
         A833TipDefCod = T00OY32_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(30) == 101) ) )
         {
            pr_default.readNext(30);
            if ( ! ( (pr_default.getStatus(30) == 101) ) )
            {
               GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(30);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
      /* Using cursor T00OY33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound764 = (short)(1) ;
      }
      else
      {
         RcdFound764 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKeyOY764( )
   {
      /* Using cursor T00OY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00OY3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmOY764( 42) ;
         RcdFound764 = (short)(1) ;
         initializeNonKeyOY764( ) ;
         A833TipDefCod = T00OY3_A833TipDefCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5198Nr_codigo = A5198Nr_codigo ;
         Z833TipDefCod = A833TipDefCod ;
         sMode764 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadOY764( ) ;
         Gx_mode = sMode764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound764 = (short)(0) ;
         initializeNonKeyOY764( ) ;
         sMode764 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalOY764( ) ;
         Gx_mode = sMode764 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesOY764( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyOY764( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h833TipDefCod)==0) )
         {
            A833TipDefCod = (short)(0) ;
         }
         else
         {
            A13819TipdefDscI = h833TipDefCod ;
            /* Using cursor T00OY34 */
            pr_default.execute(32, new Object[] {A13819TipdefDscI, A396EmprCod});
            A396EmprCod = T00OY34_A396EmprCod[0] ;
            A833TipDefCod = T00OY34_A833TipDefCod[0] ;
            A833TipDefCod = T00OY34_A833TipDefCod[0] ;
            if ( ! ( (pr_default.getStatus(32) == 101) ) )
            {
               pr_default.readNext(32);
               if ( ! ( (pr_default.getStatus(32) == 101) ) )
               {
                  GXCCtl = "TIPDEFCOD_" + sGXsfl_201_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(32);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00OY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNOTRE1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPNOTRE1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertOY764( )
   {
      beforeValidateOY764( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOY764( ) ;
      }
      if ( AnyError == 0 )
      {
         zmOY764( 0) ;
         checkOptimisticConcurrencyOY764( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmOY764( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertOY764( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00OY35 */
                  pr_default.execute(33, new Object[] {Integer.valueOf(A5198Nr_codigo), A396EmprCod, Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRE1");
                  if ( (pr_default.getStatus(33) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            loadOY764( ) ;
         }
         endLevelOY764( ) ;
      }
      closeExtendedTableCursorsOY764( ) ;
   }

   public void updateOY764( )
   {
      beforeValidateOY764( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableOY764( ) ;
      }
      if ( ( nIsMod_764 != 0 ) || ( nIsDirty_764 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyOY764( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmOY764( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateOY764( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPNOTRE1 */
                     deferredUpdateOY764( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyOY764( ) ;
                        }
                     }
                     else
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                        AnyError = (short)(1) ;
                     }
                  }
               }
            }
            endLevelOY764( ) ;
         }
      }
      closeExtendedTableCursorsOY764( ) ;
   }

   public void deferredUpdateOY764( )
   {
   }

   public void deleteOY764( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateOY764( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyOY764( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsOY764( ) ;
         afterConfirmOY764( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteOY764( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00OY36 */
               pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRE1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode764 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelOY764( ) ;
      Gx_mode = sMode764 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsOY764( )
   {
      standaloneModalOY764( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00OY37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T00OY37_A834TipDefDsc[0] ;
         n834TipDefDsc = T00OY37_n834TipDefDsc[0] ;
         pr_default.close(35);
      }
   }

   public void endLevelOY764( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartOY764( )
   {
      /* Scan By routine */
      /* Using cursor T00OY38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
      RcdFound764 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound764 = (short)(1) ;
         A833TipDefCod = T00OY38_A833TipDefCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextOY764( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound764 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound764 = (short)(1) ;
         A833TipDefCod = T00OY38_A833TipDefCod[0] ;
      }
   }

   public void scanEndOY764( )
   {
      pr_default.close(36);
   }

   public void afterConfirmOY764( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertOY764( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateOY764( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteOY764( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteOY764( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateOY764( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesOY764( )
   {
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_201_Refreshing);
   }

   public void send_integrity_lvl_hashesOY764( )
   {
   }

   public void send_integrity_lvl_hashesOY761( )
   {
   }

   public void subsflControlProps_201764( )
   {
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_201_idx ;
   }

   public void subsflControlProps_fel_201764( )
   {
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_201_fel_idx ;
   }

   public void addRowOY764( )
   {
      nGXsfl_201_idx = (int)(nGXsfl_201_idx+1) ;
      sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_201764( ) ;
      sendRowOY764( ) ;
   }

   public void sendRowOY764( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_201_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_764_" + sGXsfl_201_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_201_idx + "',201)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefCod_Internalname,h833TipDefCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,202);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTipDefCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(201),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesOY764( ) ;
      GXCCtl = "GXHCTIPDEFCOD_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z833TipDefCod_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_764_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_764_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_764_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_764, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_201_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV54TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV54TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV52EmprCod));
      GXCCtl = "vNR_CODIGO_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV43Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_201_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD_"+sGXsfl_201_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowOY764( )
   {
      nGXsfl_201_idx = (int)(nGXsfl_201_idx+1) ;
      sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_201764( ) ;
      edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_201_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h833TipDefCod = httpContext.cgiGet( edtTipDefCod_Internalname) ;
      GXCCtl = "GXHCTIPDEFCOD_" + sGXsfl_201_idx ;
      A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z833TipDefCod_" + sGXsfl_201_idx ;
      Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_764_" + sGXsfl_201_idx ;
      nRcdDeleted_764 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_764_" + sGXsfl_201_idx ;
      nRcdExists_764 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_764_" + sGXsfl_201_idx ;
      nIsMod_764 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTipDefCod_Enabled = edtTipDefCod_Enabled ;
   }

   public void confirmValuesOY0( )
   {
      nGXsfl_201_idx = 0 ;
      sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_201764( ) ;
      while ( nGXsfl_201_idx < nRC_GXsfl_201 )
      {
         nGXsfl_201_idx = (int)(nGXsfl_201_idx+1) ;
         sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_201764( ) ;
         httpContext.changePostValue( "Z833TipDefCod_"+sGXsfl_201_idx, httpContext.cgiGet( "ZT_"+"Z833TipDefCod_"+sGXsfl_201_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_201_idx) ;
      }
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tnotrec", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV43Nr_codigo,8,0))}, new String[] {"Gx_mode","EmprCod","Nr_codigo"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TNOTREC");
      forbiddenHiddens.add("Nr_discod", localUtil.format( DecimalUtil.doubleToDec(A5213Nr_discod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Nr_user", GXutil.rtrim( localUtil.format( A5215Nr_user, "@!")));
      forbiddenHiddens.add("Nr_fecreg", localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"));
      forbiddenHiddens.add("Nr_barcod", localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Nr_barreo", localUtil.format( DecimalUtil.doubleToDec(A5211Nr_barreo), "9"));
      forbiddenHiddens.add("Nr_barpar", GXutil.rtrim( localUtil.format( A5212Nr_barpar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tnotrec:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5198Nr_codigo", GXutil.ltrim( localUtil.ntoc( Z5198Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5206Nr_albrecc", GXutil.ltrim( localUtil.ntoc( Z5206Nr_albrecc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5340Nr_CliCod", GXutil.ltrim( localUtil.ntoc( Z5340Nr_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5341Nr_CliNom", GXutil.rtrim( Z5341Nr_CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5199Nr_albent", GXutil.rtrim( Z5199Nr_albent));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5200Nr_refcli", GXutil.rtrim( Z5200Nr_refcli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5201Nr_artcod", GXutil.rtrim( Z5201Nr_artcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5202Nr_artdsc", GXutil.rtrim( Z5202Nr_artdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5203Nr_colnom", GXutil.rtrim( Z5203Nr_colnom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5204Nr_colnum", GXutil.ltrim( localUtil.ntoc( Z5204Nr_colnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5205Nr_partida", GXutil.ltrim( localUtil.ntoc( Z5205Nr_partida, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5207Nr_piezas", GXutil.ltrim( localUtil.ntoc( Z5207Nr_piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5208Nr_unidade", GXutil.ltrim( localUtil.ntoc( Z5208Nr_unidade, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5209Nr_unidad", GXutil.rtrim( Z5209Nr_unidad));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5222Nr_barcoda", GXutil.ltrim( localUtil.ntoc( Z5222Nr_barcoda, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5223Nr_barreoa", GXutil.ltrim( localUtil.ntoc( Z5223Nr_barreoa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5224Nr_barpara", GXutil.rtrim( Z5224Nr_barpara));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12235Nr_NAlb", GXutil.ltrim( localUtil.ntoc( Z12235Nr_NAlb, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5214Nr_local", GXutil.rtrim( Z5214Nr_local));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5215Nr_user", GXutil.rtrim( Z5215Nr_user));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5216Nr_fecreg", localUtil.ttoc( Z5216Nr_fecreg, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5217Nr_fecent", localUtil.dtoc( Z5217Nr_fecent, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5210Nr_barcod", GXutil.ltrim( localUtil.ntoc( Z5210Nr_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5211Nr_barreo", GXutil.ltrim( localUtil.ntoc( Z5211Nr_barreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5212Nr_barpar", GXutil.rtrim( Z5212Nr_barpar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5213Nr_discod", GXutil.ltrim( localUtil.ntoc( Z5213Nr_discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7090Nr_PartCod", GXutil.rtrim( Z7090Nr_PartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7091Nr_ParNMtr", GXutil.rtrim( Z7091Nr_ParNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5098TipDisCod", GXutil.rtrim( Z5098TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_201", GXutil.ltrim( localUtil.ntoc( nGXsfl_201_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N5098TipDisCod", GXutil.rtrim( A5098TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV54TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV54TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV54TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV52EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNR_CODIGO", GXutil.ltrim( localUtil.ntoc( AV43Nr_codigo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNR_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43Nr_codigo), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPDISCOD", GXutil.rtrim( AV56Insert_TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTIPDISCOD", GXutil.rtrim( A5098TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_1", GXutil.rtrim( AV39Msg_1));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRL_R", GXutil.ltrim( localUtil.ntoc( AV38Ctrl_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAPLICACION", GXutil.rtrim( AV47Aplicacion));
      app.GxWebStd.gx_hidden_field( httpContext, "NR_PARTCOD", GXutil.rtrim( A7090Nr_PartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "NR_PARNMTR", GXutil.rtrim( A7091Nr_ParNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDISDSC", GXutil.rtrim( A5097TipDisDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV60Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDSC", GXutil.rtrim( A834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable10_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Enabled", GXutil.booltostr( Dvpanel_unnamedtable10_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Width", GXutil.rtrim( Dvpanel_unnamedtable10_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable10_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable10_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Cls", GXutil.rtrim( Dvpanel_unnamedtable10_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Title", GXutil.rtrim( Dvpanel_unnamedtable10_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable10_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable10_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable10_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable11_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Enabled", GXutil.booltostr( Dvpanel_unnamedtable11_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Width", GXutil.rtrim( Dvpanel_unnamedtable11_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable11_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable11_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Cls", GXutil.rtrim( Dvpanel_unnamedtable11_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Title", GXutil.rtrim( Dvpanel_unnamedtable11_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable11_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable11_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable11_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Enabled", GXutil.booltostr( Dvpanel_unnamedtable3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable5_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Enabled", GXutil.booltostr( Dvpanel_unnamedtable5_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable6_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Enabled", GXutil.booltostr( Dvpanel_unnamedtable6_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable4_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Enabled", GXutil.booltostr( Dvpanel_unnamedtable4_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.tnotrec", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV43Nr_codigo,8,0))}, new String[] {"Gx_mode","EmprCod","Nr_codigo"})  ;
   }

   public String getPgmname( )
   {
      return "TNOTREC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "NOTAS DE RECLAMACIONES", "") ;
   }

   public void initializeNonKeyOY761( )
   {
      h5098TipDisCod = "" ;
      AV39Msg_1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
      AV38Ctrl_r = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
      AV47Aplicacion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Aplicacion", AV47Aplicacion);
      A5206Nr_albrecc = 0 ;
      n5206Nr_albrecc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
      A5340Nr_CliCod = 0 ;
      n5340Nr_CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
      A5341Nr_CliNom = "" ;
      n5341Nr_CliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
      A5199Nr_albent = "" ;
      n5199Nr_albent = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
      A5200Nr_refcli = "" ;
      n5200Nr_refcli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5200Nr_refcli", A5200Nr_refcli);
      A5201Nr_artcod = "" ;
      n5201Nr_artcod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
      A5202Nr_artdsc = "" ;
      n5202Nr_artdsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
      A5203Nr_colnom = "" ;
      n5203Nr_colnom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5203Nr_colnom", A5203Nr_colnom);
      A5204Nr_colnum = 0 ;
      n5204Nr_colnum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5204Nr_colnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5204Nr_colnum), 6, 0));
      A5205Nr_partida = 0 ;
      n5205Nr_partida = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5205Nr_partida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5205Nr_partida), 8, 0));
      A5207Nr_piezas = 0 ;
      n5207Nr_piezas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
      A5208Nr_unidade = DecimalUtil.ZERO ;
      n5208Nr_unidade = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
      A5209Nr_unidad = "" ;
      n5209Nr_unidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
      A5222Nr_barcoda = 0 ;
      n5222Nr_barcoda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5222Nr_barcoda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5222Nr_barcoda), 8, 0));
      A5223Nr_barreoa = (byte)(0) ;
      n5223Nr_barreoa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5223Nr_barreoa", GXutil.str( A5223Nr_barreoa, 1, 0));
      A5224Nr_barpara = "" ;
      n5224Nr_barpara = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5224Nr_barpara", A5224Nr_barpara);
      A12235Nr_NAlb = 0 ;
      n12235Nr_NAlb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12235Nr_NAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12235Nr_NAlb), 10, 0));
      A5214Nr_local = "" ;
      n5214Nr_local = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5214Nr_local", A5214Nr_local);
      A5217Nr_fecent = GXutil.nullDate() ;
      n5217Nr_fecent = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5217Nr_fecent", localUtil.format(A5217Nr_fecent, "99/99/99"));
      A5210Nr_barcod = 0 ;
      n5210Nr_barcod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5210Nr_barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5210Nr_barcod), 8, 0));
      A5211Nr_barreo = (byte)(0) ;
      n5211Nr_barreo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5211Nr_barreo", GXutil.str( A5211Nr_barreo, 1, 0));
      A5212Nr_barpar = "" ;
      n5212Nr_barpar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5212Nr_barpar", A5212Nr_barpar);
      A5213Nr_discod = 0 ;
      n5213Nr_discod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5213Nr_discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5213Nr_discod), 8, 0));
      A5097TipDisDsc = "" ;
      n5097TipDisDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", A5097TipDisDsc);
      A7090Nr_PartCod = "" ;
      n7090Nr_PartCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7090Nr_PartCod", A7090Nr_PartCod);
      A7091Nr_ParNMtr = "" ;
      n7091Nr_ParNMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7091Nr_ParNMtr", A7091Nr_ParNMtr);
      A5215Nr_user = AV8UsurCod ;
      n5215Nr_user = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
      A5216Nr_fecreg = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n5216Nr_fecreg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z5206Nr_albrecc = 0 ;
      Z5340Nr_CliCod = 0 ;
      Z5341Nr_CliNom = "" ;
      Z5199Nr_albent = "" ;
      Z5200Nr_refcli = "" ;
      Z5201Nr_artcod = "" ;
      Z5202Nr_artdsc = "" ;
      Z5203Nr_colnom = "" ;
      Z5204Nr_colnum = 0 ;
      Z5205Nr_partida = 0 ;
      Z5207Nr_piezas = 0 ;
      Z5208Nr_unidade = DecimalUtil.ZERO ;
      Z5209Nr_unidad = "" ;
      Z5222Nr_barcoda = 0 ;
      Z5223Nr_barreoa = (byte)(0) ;
      Z5224Nr_barpara = "" ;
      Z12235Nr_NAlb = 0 ;
      Z5214Nr_local = "" ;
      Z5215Nr_user = "" ;
      Z5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      Z5217Nr_fecent = GXutil.nullDate() ;
      Z5210Nr_barcod = 0 ;
      Z5211Nr_barreo = (byte)(0) ;
      Z5212Nr_barpar = "" ;
      Z5213Nr_discod = 0 ;
      Z7090Nr_PartCod = "" ;
      Z7091Nr_ParNMtr = "" ;
      Z5098TipDisCod = "" ;
   }

   public void initAllOY761( )
   {
      A5198Nr_codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5198Nr_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5198Nr_codigo), 8, 0));
      initializeNonKeyOY761( ) ;
   }

   public void standaloneModalInsert( )
   {
      A5215Nr_user = i5215Nr_user ;
      n5215Nr_user = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5215Nr_user", A5215Nr_user);
      A5216Nr_fecreg = i5216Nr_fecreg ;
      n5216Nr_fecreg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5216Nr_fecreg", localUtil.ttoc( A5216Nr_fecreg, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKeyOY764( )
   {
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
   }

   public void initAllOY764( )
   {
      h833TipDefCod = "" ;
      initializeNonKeyOY764( ) ;
   }

   public void standaloneModalInsertOY764( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655824", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("tnotrec.js", "?20268211655824", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties764( )
   {
      edtTipDefCod_Enabled = defedtTipDefCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_201_Refreshing);
   }

   public void startgridcontrol201( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", h833TipDefCod);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtNr_codigo_Internalname = "NR_CODIGO" ;
      edtNr_albrecc_Internalname = "NR_ALBRECC" ;
      edtTipDisCod_Internalname = "TIPDISCOD" ;
      divTipdiscod_cell_Internalname = "TIPDISCOD_CELL" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtNr_CliCod_Internalname = "NR_CLICOD" ;
      edtNr_CliNom_Internalname = "NR_CLINOM" ;
      edtNr_albent_Internalname = "NR_ALBENT" ;
      edtNr_refcli_Internalname = "NR_REFCLI" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtNr_artcod_Internalname = "NR_ARTCOD" ;
      edtNr_artdsc_Internalname = "NR_ARTDSC" ;
      edtNr_colnom_Internalname = "NR_COLNOM" ;
      edtNr_colnum_Internalname = "NR_COLNUM" ;
      edtNr_partida_Internalname = "NR_PARTIDA" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = "DVPANEL_UNNAMEDTABLE10" ;
      edtNr_piezas_Internalname = "NR_PIEZAS" ;
      edtNr_unidade_Internalname = "NR_UNIDADE" ;
      cmbNr_unidad.setInternalname( "NR_UNIDAD" );
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      Dvpanel_unnamedtable11_Internalname = "DVPANEL_UNNAMEDTABLE11" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtNr_barcoda_Internalname = "NR_BARCODA" ;
      edtNr_barreoa_Internalname = "NR_BARREOA" ;
      edtNr_barpara_Internalname = "NR_BARPARA" ;
      edtNr_NAlb_Internalname = "NR_NALB" ;
      edtNr_local_Internalname = "NR_LOCAL" ;
      edtNr_fecent_Internalname = "NR_FECENT" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      edtNr_fecreg_Internalname = "NR_FECREG" ;
      edtNr_user_Internalname = "NR_USER" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtNr_barcod_Internalname = "NR_BARCOD" ;
      edtNr_barreo_Internalname = "NR_BARREO" ;
      edtNr_barpar_Internalname = "NR_BARPAR" ;
      edtNr_discod_Internalname = "NR_DISCOD" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "NOTAS DE RECLAMACIONES", "") );
      edtTipDefCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtTipDefCod_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtNr_discod_Jsonclick = "" ;
      edtNr_discod_Enabled = 0 ;
      edtNr_barpar_Jsonclick = "" ;
      edtNr_barpar_Enabled = 0 ;
      edtNr_barreo_Jsonclick = "" ;
      edtNr_barreo_Enabled = 0 ;
      edtNr_barcod_Jsonclick = "" ;
      edtNr_barcod_Enabled = 0 ;
      edtNr_user_Jsonclick = "" ;
      edtNr_user_Enabled = 0 ;
      edtNr_fecreg_Jsonclick = "" ;
      edtNr_fecreg_Enabled = 0 ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = "" ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      edtNr_fecent_Jsonclick = "" ;
      edtNr_fecent_Enabled = 1 ;
      edtNr_local_Jsonclick = "" ;
      edtNr_local_Enabled = 1 ;
      edtNr_NAlb_Jsonclick = "" ;
      edtNr_NAlb_Enabled = 1 ;
      edtNr_barpara_Jsonclick = "" ;
      edtNr_barpara_Enabled = 1 ;
      edtNr_barreoa_Jsonclick = "" ;
      edtNr_barreoa_Enabled = 1 ;
      edtNr_barcoda_Jsonclick = "" ;
      edtNr_barcoda_Enabled = 1 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = "" ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Datos (3)", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      cmbNr_unidad.setJsonclick( "" );
      cmbNr_unidad.setEnabled( 0 );
      edtNr_unidade_Jsonclick = "" ;
      edtNr_unidade_Enabled = 0 ;
      edtNr_piezas_Jsonclick = "" ;
      edtNr_piezas_Enabled = 0 ;
      Dvpanel_unnamedtable11_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Iconposition = "Right" ;
      Dvpanel_unnamedtable11_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Title = "" ;
      Dvpanel_unnamedtable11_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable11_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Width = "100%" ;
      edtNr_partida_Jsonclick = "" ;
      edtNr_partida_Enabled = 1 ;
      edtNr_colnum_Jsonclick = "" ;
      edtNr_colnum_Enabled = 1 ;
      edtNr_colnom_Jsonclick = "" ;
      edtNr_colnom_Enabled = 1 ;
      edtNr_artdsc_Jsonclick = "" ;
      edtNr_artdsc_Enabled = 0 ;
      edtNr_artcod_Jsonclick = "" ;
      edtNr_artcod_Enabled = 0 ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = "" ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Datos (2)", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      edtNr_refcli_Jsonclick = "" ;
      edtNr_refcli_Enabled = 1 ;
      edtNr_albent_Jsonclick = "" ;
      edtNr_albent_Enabled = 0 ;
      edtNr_CliNom_Jsonclick = "" ;
      edtNr_CliNom_Enabled = 0 ;
      edtNr_CliCod_Jsonclick = "" ;
      edtNr_CliCod_Enabled = 0 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos (1)", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtTipDisCod_Jsonclick = "" ;
      edtTipDisCod_Enabled = 1 ;
      edtTipDisCod_Visible = 1 ;
      divTipdiscod_cell_Class = "col-xs-12 col-sm-4" ;
      edtNr_albrecc_Jsonclick = "" ;
      edtNr_albrecc_Enabled = 0 ;
      edtNr_codigo_Jsonclick = "" ;
      edtNr_codigo_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgatipdiscodOY0( String A396EmprCod ,
                                  String A13845TipDisDscI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipdiscod_dataOY0( A396EmprCod, A13845TipDisDscI) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatipdiscod_dataOY0( String A396EmprCod ,
                                          String A13845TipDisDscI )
   {
      l13845TipDisDscI = GXutil.concat( GXutil.rtrim( A13845TipDisDscI), "%", "") ;
      /* Using cursor T00OY39 */
      pr_default.execute(37, new Object[] {A396EmprCod, l13845TipDisDscI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(37) != 101) )
      {
         gxdynajaxctrlcodr.add(T00OY39_A13845TipDisDscI[0]);
         gxdynajaxctrldescr.add(T00OY39_A13845TipDisDscI[0]);
         pr_default.readNext(37);
      }
      pr_default.close(37);
   }

   public void gxsgatipdefcodOY0( String A396EmprCod ,
                                  String A13819TipdefDscI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatipdefcod_dataOY0( A396EmprCod, A13819TipdefDscI) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatipdefcod_dataOY0( String A396EmprCod ,
                                          String A13819TipdefDscI )
   {
      l13819TipdefDscI = GXutil.concat( GXutil.rtrim( A13819TipdefDscI), "%", "") ;
      /* Using cursor T00OY40 */
      pr_default.execute(38, new Object[] {A396EmprCod, l13819TipdefDscI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(38) != 101) )
      {
         gxdynajaxctrlcodr.add(T00OY40_A13819TipdefDscI[0]);
         gxdynajaxctrldescr.add(T00OY40_A13819TipdefDscI[0]);
         pr_default.readNext(38);
      }
      pr_default.close(38);
   }

   public void gxhcatipdiscodOY761( String A396EmprCod ,
                                    String A13845TipDisDscI )
   {
      /* Using cursor T00OY41 */
      pr_default.execute(39, new Object[] {A13845TipDisDscI, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(39) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13845TipDisDscI = T00OY41_A13845TipDisDscI[0] ;
         A396EmprCod = T00OY41_A396EmprCod[0] ;
         A5098TipDisCod = T00OY41_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY41_n5098TipDisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", A5098TipDisCod);
         pr_default.readNext(39);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5098TipDisCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(39);
   }

   public void gxhcatipdefcodOY764( String A396EmprCod ,
                                    String A13819TipdefDscI )
   {
      /* Using cursor T00OY42 */
      pr_default.execute(40, new Object[] {A13819TipdefDscI, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(40) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13819TipdefDscI = T00OY42_A13819TipdefDscI[0] ;
         A396EmprCod = T00OY42_A396EmprCod[0] ;
         A833TipDefCod = T00OY42_A833TipDefCod[0] ;
         pr_default.readNext(40);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(40);
   }

   public void gxasa5098OY761( String A396EmprCod )
   {
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TIPDIS", ""), ""), GXv_int7) ;
      tnotrec_impl.this.GXt_int6 = GXv_int7[0] ;
      edtTipDisCod_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDisCod_Visible), 5, 0), true);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_31_OY761( String A396EmprCod ,
                            int A5206Nr_albrecc ,
                            int A5340Nr_CliCod ,
                            String A5341Nr_CliNom ,
                            String A5199Nr_albent ,
                            String A5201Nr_artcod ,
                            String A5202Nr_artdsc ,
                            int A5207Nr_piezas ,
                            java.math.BigDecimal A5208Nr_unidade ,
                            String A5209Nr_unidad ,
                            byte AV38Ctrl_r ,
                            String AV39Msg_1 ,
                            String AV47Aplicacion )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int12[0] = A5206Nr_albrecc ;
         GXv_int9[0] = A5340Nr_CliCod ;
         GXv_char16[0] = A5341Nr_CliNom ;
         GXv_char15[0] = A5199Nr_albent ;
         GXv_char14[0] = A5201Nr_artcod ;
         GXv_char11[0] = A5202Nr_artdsc ;
         GXv_int8[0] = A5207Nr_piezas ;
         GXv_decimal13[0] = A5208Nr_unidade ;
         GXv_char10[0] = A5209Nr_unidad ;
         GXv_int7[0] = AV38Ctrl_r ;
         GXv_char4[0] = AV39Msg_1 ;
         new app.pnotrer(remoteHandle, context).execute( GXv_char17, GXv_int12, GXv_int9, GXv_char16, GXv_char15, GXv_char14, GXv_char11, GXv_int8, GXv_decimal13, GXv_char10, GXv_int7, GXv_char4) ;
         A396EmprCod = GXv_char17[0] ;
         A5206Nr_albrecc = GXv_int12[0] ;
         A5340Nr_CliCod = GXv_int9[0] ;
         A5341Nr_CliNom = GXv_char16[0] ;
         A5199Nr_albent = GXv_char15[0] ;
         A5201Nr_artcod = GXv_char14[0] ;
         A5202Nr_artdsc = GXv_char11[0] ;
         A5207Nr_piezas = GXv_int8[0] ;
         A5208Nr_unidade = GXv_decimal13[0] ;
         A5209Nr_unidad = GXv_char10[0] ;
         AV38Ctrl_r = GXv_int7[0] ;
         AV39Msg_1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5206Nr_albrecc), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5206Nr_albrecc, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5341Nr_CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5199Nr_albent))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5201Nr_artcod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5202Nr_artdsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5209Nr_unidad))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38Ctrl_r, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV39Msg_1))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_34_OY761( String A396EmprCod ,
                            String A7090Nr_PartCod ,
                            int A5340Nr_CliCod ,
                            String A5341Nr_CliNom ,
                            String A5199Nr_albent ,
                            String A5201Nr_artcod ,
                            String A5202Nr_artdsc ,
                            int A5207Nr_piezas ,
                            java.math.BigDecimal A5208Nr_unidade ,
                            String A5209Nr_unidad ,
                            String A7091Nr_ParNMtr ,
                            byte AV38Ctrl_r ,
                            String AV39Msg_1 ,
                            String AV47Aplicacion )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_char16[0] = A7090Nr_PartCod ;
         GXv_int12[0] = A5340Nr_CliCod ;
         GXv_char15[0] = A5341Nr_CliNom ;
         GXv_char14[0] = A5199Nr_albent ;
         GXv_char11[0] = A5201Nr_artcod ;
         GXv_char10[0] = A5202Nr_artdsc ;
         GXv_int9[0] = A5207Nr_piezas ;
         GXv_decimal13[0] = A5208Nr_unidade ;
         GXv_char4[0] = A5209Nr_unidad ;
         GXv_char3[0] = A7091Nr_ParNMtr ;
         GXv_int7[0] = AV38Ctrl_r ;
         GXv_char2[0] = AV39Msg_1 ;
         new app.pnotrep(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_int12, GXv_char15, GXv_char14, GXv_char11, GXv_char10, GXv_int9, GXv_decimal13, GXv_char4, GXv_char3, GXv_int7, GXv_char2) ;
         A396EmprCod = GXv_char17[0] ;
         A7090Nr_PartCod = GXv_char16[0] ;
         A5340Nr_CliCod = GXv_int12[0] ;
         A5341Nr_CliNom = GXv_char15[0] ;
         A5199Nr_albent = GXv_char14[0] ;
         A5201Nr_artcod = GXv_char11[0] ;
         A5202Nr_artdsc = GXv_char10[0] ;
         A5207Nr_piezas = GXv_int9[0] ;
         A5208Nr_unidade = GXv_decimal13[0] ;
         A5209Nr_unidad = GXv_char4[0] ;
         A7091Nr_ParNMtr = GXv_char3[0] ;
         AV38Ctrl_r = GXv_int7[0] ;
         AV39Msg_1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A7090Nr_PartCod", A7090Nr_PartCod);
         httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5340Nr_CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", A5341Nr_CliNom);
         httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", A5199Nr_albent);
         httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", A5201Nr_artcod);
         httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", A5202Nr_artdsc);
         httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5207Nr_piezas), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrimstr( A5208Nr_unidade, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
         httpContext.ajax_rsp_assign_attri("", false, "A7091Nr_ParNMtr", A7091Nr_ParNMtr);
         httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.str( AV38Ctrl_r, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", AV39Msg_1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7090Nr_PartCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5341Nr_CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5199Nr_albent))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5201Nr_artcod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5202Nr_artdsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5209Nr_unidad))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7091Nr_ParNMtr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38Ctrl_r, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV39Msg_1))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_201764( ) ;
      while ( nGXsfl_201_idx <= nRC_GXsfl_201 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalOY764( ) ;
         standaloneModalOY764( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowOY764( ) ;
         nGXsfl_201_idx = (int)(nGXsfl_201_idx+1) ;
         sGXsfl_201_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_201_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_201764( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbNr_unidad.setName( "NR_UNIDAD" );
      cmbNr_unidad.setWebtags( "" );
      cmbNr_unidad.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbNr_unidad.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbNr_unidad.getItemCount() > 0 )
      {
         A5209Nr_unidad = cmbNr_unidad.getValidValue(A5209Nr_unidad) ;
         n5209Nr_unidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", A5209Nr_unidad);
      }
      /* End function init_web_controls */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Nr_codigo( )
   {
      if ( isIns( )  && ( ! (0==A5198Nr_codigo) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Inexistente", ""), 1, "NR_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNr_codigo_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Nr_albrecc( )
   {
      n5209Nr_unidad = false ;
      A5209Nr_unidad = cmbNr_unidad.getValue() ;
      n5209Nr_unidad = false ;
      cmbNr_unidad.setValue( A5209Nr_unidad );
      n5208Nr_unidade = false ;
      n5207Nr_piezas = false ;
      n5202Nr_artdsc = false ;
      n5201Nr_artcod = false ;
      n5199Nr_albent = false ;
      n5341Nr_CliNom = false ;
      n5340Nr_CliCod = false ;
      n5206Nr_albrecc = false ;
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_int12[0] = A5206Nr_albrecc ;
         GXv_int9[0] = A5340Nr_CliCod ;
         GXv_char16[0] = A5341Nr_CliNom ;
         GXv_char15[0] = A5199Nr_albent ;
         GXv_char14[0] = A5201Nr_artcod ;
         GXv_char11[0] = A5202Nr_artdsc ;
         GXv_int8[0] = A5207Nr_piezas ;
         GXv_decimal13[0] = A5208Nr_unidade ;
         GXv_char10[0] = A5209Nr_unidad ;
         GXv_int7[0] = AV38Ctrl_r ;
         GXv_char4[0] = AV39Msg_1 ;
         new app.pnotrer(remoteHandle, context).execute( GXv_char17, GXv_int12, GXv_int9, GXv_char16, GXv_char15, GXv_char14, GXv_char11, GXv_int8, GXv_decimal13, GXv_char10, GXv_int7, GXv_char4) ;
         tnotrec_impl.this.A396EmprCod = GXv_char17[0] ;
         A396EmprCod = this.A396EmprCod ;
         tnotrec_impl.this.A5206Nr_albrecc = GXv_int12[0] ;
         A5206Nr_albrecc = this.A5206Nr_albrecc ;
         tnotrec_impl.this.A5340Nr_CliCod = GXv_int9[0] ;
         A5340Nr_CliCod = this.A5340Nr_CliCod ;
         tnotrec_impl.this.A5341Nr_CliNom = GXv_char16[0] ;
         A5341Nr_CliNom = this.A5341Nr_CliNom ;
         tnotrec_impl.this.A5199Nr_albent = GXv_char15[0] ;
         A5199Nr_albent = this.A5199Nr_albent ;
         tnotrec_impl.this.A5201Nr_artcod = GXv_char14[0] ;
         A5201Nr_artcod = this.A5201Nr_artcod ;
         tnotrec_impl.this.A5202Nr_artdsc = GXv_char11[0] ;
         A5202Nr_artdsc = this.A5202Nr_artdsc ;
         tnotrec_impl.this.A5207Nr_piezas = GXv_int8[0] ;
         A5207Nr_piezas = this.A5207Nr_piezas ;
         tnotrec_impl.this.A5208Nr_unidade = GXv_decimal13[0] ;
         A5208Nr_unidade = this.A5208Nr_unidade ;
         tnotrec_impl.this.A5209Nr_unidad = GXv_char10[0] ;
         A5209Nr_unidad = this.A5209Nr_unidad ;
         tnotrec_impl.this.AV38Ctrl_r = GXv_int7[0] ;
         AV38Ctrl_r = this.AV38Ctrl_r ;
         tnotrec_impl.this.AV39Msg_1 = GXv_char4[0] ;
         AV39Msg_1 = this.AV39Msg_1 ;
         cmbNr_unidad.setValue( A5209Nr_unidad );
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) && ( AV38Ctrl_r == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Nº no es una Devolucion¡¡¡", ""), 1, "NR_ALBRECC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNr_albrecc_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV39Msg_1)==0) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "P", "")) == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(AV39Msg_1, 0, "");
      }
      dynload_actions( ) ;
      if ( cmbNr_unidad.getItemCount() > 0 )
      {
         A5209Nr_unidad = cmbNr_unidad.getValidValue(A5209Nr_unidad) ;
         n5209Nr_unidad = false ;
         cmbNr_unidad.setValue( A5209Nr_unidad );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5206Nr_albrecc", GXutil.ltrim( localUtil.ntoc( A5206Nr_albrecc, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", GXutil.rtrim( A5341Nr_CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", GXutil.rtrim( A5199Nr_albent));
      httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", GXutil.rtrim( A5201Nr_artcod));
      httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", GXutil.rtrim( A5202Nr_artdsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", GXutil.rtrim( A5209Nr_unidad));
      cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Values", cmbNr_unidad.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.ltrim( localUtil.ntoc( AV38Ctrl_r, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", GXutil.rtrim( AV39Msg_1));
   }

   public void valid_Tipdiscod( )
   {
      n5098TipDisCod = false ;
      n5097TipDisDsc = false ;
      if ( (GXutil.strcmp("", h5098TipDisCod)==0) )
      {
         A5098TipDisCod = "" ;
         n5098TipDisCod = false ;
      }
      else
      {
         A13845TipDisDscI = h5098TipDisCod ;
         /* Using cursor T00OY43 */
         pr_default.execute(41, new Object[] {A13845TipDisDscI, A396EmprCod});
         A5098TipDisCod = T00OY43_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY43_n5098TipDisCod[0] ;
         A5098TipDisCod = T00OY43_A5098TipDisCod[0] ;
         n5098TipDisCod = T00OY43_n5098TipDisCod[0] ;
         if ( ! ( (pr_default.getStatus(41) == 101) ) )
         {
            pr_default.readNext(41);
            if ( ! ( (pr_default.getStatus(41) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDisCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(41);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
      /* Using cursor T00OY22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n5098TipDisCod), A5098TipDisCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A5098TipDisCod)==0) && (GXutil.strcmp("", A13845TipDisDscI)==0) || (GXutil.strcmp("", A5098TipDisCod)==0) && n5098TipDisCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDIS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDisCod_Internalname ;
         }
      }
      A5097TipDisDsc = T00OY22_A5097TipDisDsc[0] ;
      n5097TipDisDsc = T00OY22_n5097TipDisDsc[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5098TipDisCod", GXutil.rtrim( A5098TipDisCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5097TipDisDsc", GXutil.rtrim( A5097TipDisDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h5098TipDisCod", h5098TipDisCod);
   }

   public void valid_Nr_clicod( )
   {
      n7091Nr_ParNMtr = false ;
      n5209Nr_unidad = false ;
      A5209Nr_unidad = cmbNr_unidad.getValue() ;
      n5209Nr_unidad = false ;
      cmbNr_unidad.setValue( A5209Nr_unidad );
      n5208Nr_unidade = false ;
      n5207Nr_piezas = false ;
      n5202Nr_artdsc = false ;
      n5201Nr_artcod = false ;
      n5199Nr_albent = false ;
      n5341Nr_CliNom = false ;
      n7090Nr_PartCod = false ;
      n5340Nr_CliCod = false ;
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) )
      {
         GXv_char17[0] = A396EmprCod ;
         GXv_char16[0] = A7090Nr_PartCod ;
         GXv_int12[0] = A5340Nr_CliCod ;
         GXv_char15[0] = A5341Nr_CliNom ;
         GXv_char14[0] = A5199Nr_albent ;
         GXv_char11[0] = A5201Nr_artcod ;
         GXv_char10[0] = A5202Nr_artdsc ;
         GXv_int9[0] = A5207Nr_piezas ;
         GXv_decimal13[0] = A5208Nr_unidade ;
         GXv_char4[0] = A5209Nr_unidad ;
         GXv_char3[0] = A7091Nr_ParNMtr ;
         GXv_int7[0] = AV38Ctrl_r ;
         GXv_char2[0] = AV39Msg_1 ;
         new app.pnotrep(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_int12, GXv_char15, GXv_char14, GXv_char11, GXv_char10, GXv_int9, GXv_decimal13, GXv_char4, GXv_char3, GXv_int7, GXv_char2) ;
         tnotrec_impl.this.A396EmprCod = GXv_char17[0] ;
         A396EmprCod = this.A396EmprCod ;
         tnotrec_impl.this.A7090Nr_PartCod = GXv_char16[0] ;
         A7090Nr_PartCod = this.A7090Nr_PartCod ;
         tnotrec_impl.this.A5340Nr_CliCod = GXv_int12[0] ;
         A5340Nr_CliCod = this.A5340Nr_CliCod ;
         tnotrec_impl.this.A5341Nr_CliNom = GXv_char15[0] ;
         A5341Nr_CliNom = this.A5341Nr_CliNom ;
         tnotrec_impl.this.A5199Nr_albent = GXv_char14[0] ;
         A5199Nr_albent = this.A5199Nr_albent ;
         tnotrec_impl.this.A5201Nr_artcod = GXv_char11[0] ;
         A5201Nr_artcod = this.A5201Nr_artcod ;
         tnotrec_impl.this.A5202Nr_artdsc = GXv_char10[0] ;
         A5202Nr_artdsc = this.A5202Nr_artdsc ;
         tnotrec_impl.this.A5207Nr_piezas = GXv_int9[0] ;
         A5207Nr_piezas = this.A5207Nr_piezas ;
         tnotrec_impl.this.A5208Nr_unidade = GXv_decimal13[0] ;
         A5208Nr_unidade = this.A5208Nr_unidade ;
         tnotrec_impl.this.A5209Nr_unidad = GXv_char4[0] ;
         A5209Nr_unidad = this.A5209Nr_unidad ;
         tnotrec_impl.this.A7091Nr_ParNMtr = GXv_char3[0] ;
         A7091Nr_ParNMtr = this.A7091Nr_ParNMtr ;
         tnotrec_impl.this.AV38Ctrl_r = GXv_int7[0] ;
         AV38Ctrl_r = this.AV38Ctrl_r ;
         tnotrec_impl.this.AV39Msg_1 = GXv_char2[0] ;
         AV39Msg_1 = this.AV39Msg_1 ;
         cmbNr_unidad.setValue( A5209Nr_unidad );
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) && ( AV38Ctrl_r == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Nº no es una Devolucion de Hilo¡¡¡", ""), 1, "NR_CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNr_CliCod_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV39Msg_1)==0) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV47Aplicacion, httpContext.getMessage( "H", "")) == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(AV39Msg_1, 0, "");
      }
      dynload_actions( ) ;
      if ( cmbNr_unidad.getItemCount() > 0 )
      {
         A5209Nr_unidad = cmbNr_unidad.getValidValue(A5209Nr_unidad) ;
         n5209Nr_unidad = false ;
         cmbNr_unidad.setValue( A5209Nr_unidad );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A7090Nr_PartCod", GXutil.rtrim( A7090Nr_PartCod));
      httpContext.ajax_rsp_assign_attri("", false, "A5340Nr_CliCod", GXutil.ltrim( localUtil.ntoc( A5340Nr_CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5341Nr_CliNom", GXutil.rtrim( A5341Nr_CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5199Nr_albent", GXutil.rtrim( A5199Nr_albent));
      httpContext.ajax_rsp_assign_attri("", false, "A5201Nr_artcod", GXutil.rtrim( A5201Nr_artcod));
      httpContext.ajax_rsp_assign_attri("", false, "A5202Nr_artdsc", GXutil.rtrim( A5202Nr_artdsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5207Nr_piezas", GXutil.ltrim( localUtil.ntoc( A5207Nr_piezas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5208Nr_unidade", GXutil.ltrim( localUtil.ntoc( A5208Nr_unidade, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5209Nr_unidad", GXutil.rtrim( A5209Nr_unidad));
      cmbNr_unidad.setValue( GXutil.rtrim( A5209Nr_unidad) );
      httpContext.ajax_rsp_assign_prop("", false, cmbNr_unidad.getInternalname(), "Values", cmbNr_unidad.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A7091Nr_ParNMtr", GXutil.rtrim( A7091Nr_ParNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "AV38Ctrl_r", GXutil.ltrim( localUtil.ntoc( AV38Ctrl_r, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Msg_1", GXutil.rtrim( AV39Msg_1));
   }

   public void valid_Tipdefcod( )
   {
      n834TipDefDsc = false ;
      if ( (GXutil.strcmp("", h833TipDefCod)==0) )
      {
         A833TipDefCod = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = h833TipDefCod ;
         /* Using cursor T00OY44 */
         pr_default.execute(42, new Object[] {A13819TipdefDscI, A396EmprCod});
         A833TipDefCod = T00OY44_A833TipDefCod[0] ;
         A833TipDefCod = T00OY44_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(42) == 101) ) )
         {
            pr_default.readNext(42);
            if ( ! ( (pr_default.getStatus(42) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TIPDEFCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipDefCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(42);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
      /* Using cursor T00OY45 */
      pr_default.execute(43, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
      }
      A834TipDefDsc = T00OY45_A834TipDefDsc[0] ;
      n834TipDefDsc = T00OY45_n834TipDefDsc[0] ;
      pr_default.close(43);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A833TipDefCod", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h833TipDefCod", h833TipDefCod);
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public String ajaxOnSessionTimeout( )
   {
      httpContext.setAjaxOnSessionTimeout("Warn");
      return "Warn" ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43Nr_codigo',fld:'vNR_CODIGO',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV54TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43Nr_codigo',fld:'vNR_CODIGO',pic:'ZZZZZZZ9',hsh:true},{av:'A5213Nr_discod',fld:'NR_DISCOD',pic:'ZZZZZZZ9'},{av:'A5215Nr_user',fld:'NR_USER',pic:'@!'},{av:'A5216Nr_fecreg',fld:'NR_FECREG',pic:'99/99/99 99:99:99'},{av:'A5210Nr_barcod',fld:'NR_BARCOD',pic:'ZZZZZZZ9'},{av:'A5211Nr_barreo',fld:'NR_BARREO',pic:'9'},{av:'A5212Nr_barpar',fld:'NR_BARPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12OY2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV54TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_NR_CODIGO","{handler:'valid_Nr_codigo',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A5198Nr_codigo',fld:'NR_CODIGO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_NR_CODIGO",",oparms:[]}");
      setEventMetadata("VALID_NR_ALBRECC","{handler:'valid_Nr_albrecc',iparms:[{av:'AV47Aplicacion',fld:'vAPLICACION',pic:''},{av:'cmbNr_unidad'},{av:'A5209Nr_unidad',fld:'NR_UNIDAD',pic:''},{av:'A5208Nr_unidade',fld:'NR_UNIDADE',pic:'ZZZZZ9.99'},{av:'A5207Nr_piezas',fld:'NR_PIEZAS',pic:'ZZZ9'},{av:'A5202Nr_artdsc',fld:'NR_ARTDSC',pic:''},{av:'A5201Nr_artcod',fld:'NR_ARTCOD',pic:''},{av:'A5199Nr_albent',fld:'NR_ALBENT',pic:''},{av:'A5341Nr_CliNom',fld:'NR_CLINOM',pic:''},{av:'A5340Nr_CliCod',fld:'NR_CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A5206Nr_albrecc',fld:'NR_ALBRECC',pic:'ZZZZZZZ9'},{av:'AV39Msg_1',fld:'vMSG_1',pic:''},{av:'AV38Ctrl_r',fld:'vCTRL_R',pic:'9'}]");
      setEventMetadata("VALID_NR_ALBRECC",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5206Nr_albrecc',fld:'NR_ALBRECC',pic:'ZZZZZZZ9'},{av:'A5340Nr_CliCod',fld:'NR_CLICOD',pic:'ZZZZZ9'},{av:'A5341Nr_CliNom',fld:'NR_CLINOM',pic:''},{av:'A5199Nr_albent',fld:'NR_ALBENT',pic:''},{av:'A5201Nr_artcod',fld:'NR_ARTCOD',pic:''},{av:'A5202Nr_artdsc',fld:'NR_ARTDSC',pic:''},{av:'A5207Nr_piezas',fld:'NR_PIEZAS',pic:'ZZZ9'},{av:'A5208Nr_unidade',fld:'NR_UNIDADE',pic:'ZZZZZ9.99'},{av:'cmbNr_unidad'},{av:'A5209Nr_unidad',fld:'NR_UNIDAD',pic:''},{av:'AV38Ctrl_r',fld:'vCTRL_R',pic:'9'},{av:'AV39Msg_1',fld:'vMSG_1',pic:''}]}");
      setEventMetadata("VALID_TIPDISCOD","{handler:'valid_Tipdiscod',iparms:[{av:'h5098TipDisCod'},{av:'A5098TipDisCod',fld:'TIPDISCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5097TipDisDsc',fld:'TIPDISDSC',pic:''}]");
      setEventMetadata("VALID_TIPDISCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5098TipDisCod',fld:'TIPDISCOD',pic:''},{av:'A5097TipDisDsc',fld:'TIPDISDSC',pic:''},{av:'h5098TipDisCod'}]}");
      setEventMetadata("VALID_NR_CLICOD","{handler:'valid_Nr_clicod',iparms:[{av:'AV47Aplicacion',fld:'vAPLICACION',pic:''},{av:'AV39Msg_1',fld:'vMSG_1',pic:''},{av:'AV38Ctrl_r',fld:'vCTRL_R',pic:'9'},{av:'A7091Nr_ParNMtr',fld:'NR_PARNMTR',pic:''},{av:'cmbNr_unidad'},{av:'A5209Nr_unidad',fld:'NR_UNIDAD',pic:''},{av:'A5208Nr_unidade',fld:'NR_UNIDADE',pic:'ZZZZZ9.99'},{av:'A5207Nr_piezas',fld:'NR_PIEZAS',pic:'ZZZ9'},{av:'A5202Nr_artdsc',fld:'NR_ARTDSC',pic:''},{av:'A5201Nr_artcod',fld:'NR_ARTCOD',pic:''},{av:'A5199Nr_albent',fld:'NR_ALBENT',pic:''},{av:'A5341Nr_CliNom',fld:'NR_CLINOM',pic:''},{av:'A7090Nr_PartCod',fld:'NR_PARTCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A5340Nr_CliCod',fld:'NR_CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_NR_CLICOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7090Nr_PartCod',fld:'NR_PARTCOD',pic:''},{av:'A5340Nr_CliCod',fld:'NR_CLICOD',pic:'ZZZZZ9'},{av:'A5341Nr_CliNom',fld:'NR_CLINOM',pic:''},{av:'A5199Nr_albent',fld:'NR_ALBENT',pic:''},{av:'A5201Nr_artcod',fld:'NR_ARTCOD',pic:''},{av:'A5202Nr_artdsc',fld:'NR_ARTDSC',pic:''},{av:'A5207Nr_piezas',fld:'NR_PIEZAS',pic:'ZZZ9'},{av:'A5208Nr_unidade',fld:'NR_UNIDADE',pic:'ZZZZZ9.99'},{av:'cmbNr_unidad'},{av:'A5209Nr_unidad',fld:'NR_UNIDAD',pic:''},{av:'A7091Nr_ParNMtr',fld:'NR_PARNMTR',pic:''},{av:'AV38Ctrl_r',fld:'vCTRL_R',pic:'9'},{av:'AV39Msg_1',fld:'vMSG_1',pic:''}]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[{av:'h833TipDefCod'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''}]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'h833TipDefCod'}]}");
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
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(43);
      pr_default.close(35);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV52EmprCod = "" ;
      Z396EmprCod = "" ;
      Z5341Nr_CliNom = "" ;
      Z5199Nr_albent = "" ;
      Z5200Nr_refcli = "" ;
      Z5201Nr_artcod = "" ;
      Z5202Nr_artdsc = "" ;
      Z5203Nr_colnom = "" ;
      Z5208Nr_unidade = DecimalUtil.ZERO ;
      Z5209Nr_unidad = "" ;
      Z5224Nr_barpara = "" ;
      Z5214Nr_local = "" ;
      Z5215Nr_user = "" ;
      Z5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      Z5217Nr_fecent = GXutil.nullDate() ;
      Z5212Nr_barpar = "" ;
      Z7090Nr_PartCod = "" ;
      Z7091Nr_ParNMtr = "" ;
      Z5098TipDisCod = "" ;
      N5098TipDisCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5341Nr_CliNom = "" ;
      A5199Nr_albent = "" ;
      A5201Nr_artcod = "" ;
      A5202Nr_artdsc = "" ;
      A5208Nr_unidade = DecimalUtil.ZERO ;
      A5209Nr_unidad = "" ;
      AV39Msg_1 = "" ;
      AV47Aplicacion = "" ;
      A7090Nr_PartCod = "" ;
      A7091Nr_ParNMtr = "" ;
      A13845TipDisDscI = "" ;
      A13819TipdefDscI = "" ;
      h5098TipDisCod = "" ;
      h833TipDefCod = "" ;
      A5098TipDisCod = "" ;
      Gx_mode = "" ;
      AV52EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      A5200Nr_refcli = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      A5203Nr_colnom = "" ;
      ucDvpanel_unnamedtable11 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A5224Nr_barpara = "" ;
      A5214Nr_local = "" ;
      A5217Nr_fecent = GXutil.nullDate() ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      A5215Nr_user = "" ;
      A5212Nr_barpar = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode764 = "" ;
      sStyleString = "" ;
      AV56Insert_TipDisCod = "" ;
      AV8UsurCod = "" ;
      A407EmprNom = "" ;
      A5097TipDisDsc = "" ;
      AV60Pgmname = "" ;
      A834TipDefDsc = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_unnamedtable10_Objectcall = "" ;
      Dvpanel_unnamedtable10_Class = "" ;
      Dvpanel_unnamedtable10_Height = "" ;
      Dvpanel_unnamedtable11_Objectcall = "" ;
      Dvpanel_unnamedtable11_Class = "" ;
      Dvpanel_unnamedtable11_Height = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Dvpanel_unnamedtable6_Objectcall = "" ;
      Dvpanel_unnamedtable6_Class = "" ;
      Dvpanel_unnamedtable6_Height = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode761 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      GXt_char1 = "" ;
      AV53WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV54TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV55WebSession = httpContext.getWebSession();
      AV57TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z5097TipDisDsc = "" ;
      T00OY7_A407EmprNom = new String[] {""} ;
      T00OY7_n407EmprNom = new boolean[] {false} ;
      T00OY9_A13845TipDisDscI = new String[] {""} ;
      T00OY9_A396EmprCod = new String[] {""} ;
      T00OY9_A5098TipDisCod = new String[] {""} ;
      T00OY9_n5098TipDisCod = new boolean[] {false} ;
      T00OY8_A5097TipDisDsc = new String[] {""} ;
      T00OY8_n5097TipDisDsc = new boolean[] {false} ;
      T00OY10_A5198Nr_codigo = new int[1] ;
      T00OY10_A5206Nr_albrecc = new int[1] ;
      T00OY10_n5206Nr_albrecc = new boolean[] {false} ;
      T00OY10_A407EmprNom = new String[] {""} ;
      T00OY10_n407EmprNom = new boolean[] {false} ;
      T00OY10_A5340Nr_CliCod = new int[1] ;
      T00OY10_n5340Nr_CliCod = new boolean[] {false} ;
      T00OY10_A5341Nr_CliNom = new String[] {""} ;
      T00OY10_n5341Nr_CliNom = new boolean[] {false} ;
      T00OY10_A5199Nr_albent = new String[] {""} ;
      T00OY10_n5199Nr_albent = new boolean[] {false} ;
      T00OY10_A5200Nr_refcli = new String[] {""} ;
      T00OY10_n5200Nr_refcli = new boolean[] {false} ;
      T00OY10_A5201Nr_artcod = new String[] {""} ;
      T00OY10_n5201Nr_artcod = new boolean[] {false} ;
      T00OY10_A5202Nr_artdsc = new String[] {""} ;
      T00OY10_n5202Nr_artdsc = new boolean[] {false} ;
      T00OY10_A5203Nr_colnom = new String[] {""} ;
      T00OY10_n5203Nr_colnom = new boolean[] {false} ;
      T00OY10_A5204Nr_colnum = new int[1] ;
      T00OY10_n5204Nr_colnum = new boolean[] {false} ;
      T00OY10_A5205Nr_partida = new int[1] ;
      T00OY10_n5205Nr_partida = new boolean[] {false} ;
      T00OY10_A5207Nr_piezas = new int[1] ;
      T00OY10_n5207Nr_piezas = new boolean[] {false} ;
      T00OY10_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00OY10_n5208Nr_unidade = new boolean[] {false} ;
      T00OY10_A5209Nr_unidad = new String[] {""} ;
      T00OY10_n5209Nr_unidad = new boolean[] {false} ;
      T00OY10_A5222Nr_barcoda = new int[1] ;
      T00OY10_n5222Nr_barcoda = new boolean[] {false} ;
      T00OY10_A5223Nr_barreoa = new byte[1] ;
      T00OY10_n5223Nr_barreoa = new boolean[] {false} ;
      T00OY10_A5224Nr_barpara = new String[] {""} ;
      T00OY10_n5224Nr_barpara = new boolean[] {false} ;
      T00OY10_A12235Nr_NAlb = new long[1] ;
      T00OY10_n12235Nr_NAlb = new boolean[] {false} ;
      T00OY10_A5214Nr_local = new String[] {""} ;
      T00OY10_n5214Nr_local = new boolean[] {false} ;
      T00OY10_A5215Nr_user = new String[] {""} ;
      T00OY10_n5215Nr_user = new boolean[] {false} ;
      T00OY10_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      T00OY10_n5216Nr_fecreg = new boolean[] {false} ;
      T00OY10_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      T00OY10_n5217Nr_fecent = new boolean[] {false} ;
      T00OY10_A5210Nr_barcod = new int[1] ;
      T00OY10_n5210Nr_barcod = new boolean[] {false} ;
      T00OY10_A5211Nr_barreo = new byte[1] ;
      T00OY10_n5211Nr_barreo = new boolean[] {false} ;
      T00OY10_A5212Nr_barpar = new String[] {""} ;
      T00OY10_n5212Nr_barpar = new boolean[] {false} ;
      T00OY10_A5213Nr_discod = new int[1] ;
      T00OY10_n5213Nr_discod = new boolean[] {false} ;
      T00OY10_A5097TipDisDsc = new String[] {""} ;
      T00OY10_n5097TipDisDsc = new boolean[] {false} ;
      T00OY10_A7090Nr_PartCod = new String[] {""} ;
      T00OY10_n7090Nr_PartCod = new boolean[] {false} ;
      T00OY10_A7091Nr_ParNMtr = new String[] {""} ;
      T00OY10_n7091Nr_ParNMtr = new boolean[] {false} ;
      T00OY10_A396EmprCod = new String[] {""} ;
      T00OY10_A5098TipDisCod = new String[] {""} ;
      T00OY10_n5098TipDisCod = new boolean[] {false} ;
      T00OY11_A13845TipDisDscI = new String[] {""} ;
      T00OY11_A396EmprCod = new String[] {""} ;
      T00OY11_A5098TipDisCod = new String[] {""} ;
      T00OY11_n5098TipDisCod = new boolean[] {false} ;
      T00OY12_A13845TipDisDscI = new String[] {""} ;
      T00OY12_A396EmprCod = new String[] {""} ;
      T00OY12_A5098TipDisCod = new String[] {""} ;
      T00OY12_n5098TipDisCod = new boolean[] {false} ;
      T00OY13_A13845TipDisDscI = new String[] {""} ;
      T00OY13_A396EmprCod = new String[] {""} ;
      T00OY13_A5098TipDisCod = new String[] {""} ;
      T00OY13_n5098TipDisCod = new boolean[] {false} ;
      T00OY14_A5097TipDisDsc = new String[] {""} ;
      T00OY14_n5097TipDisDsc = new boolean[] {false} ;
      T00OY15_A396EmprCod = new String[] {""} ;
      T00OY15_A5198Nr_codigo = new int[1] ;
      T00OY6_A5198Nr_codigo = new int[1] ;
      T00OY6_A5206Nr_albrecc = new int[1] ;
      T00OY6_n5206Nr_albrecc = new boolean[] {false} ;
      T00OY6_A5340Nr_CliCod = new int[1] ;
      T00OY6_n5340Nr_CliCod = new boolean[] {false} ;
      T00OY6_A5341Nr_CliNom = new String[] {""} ;
      T00OY6_n5341Nr_CliNom = new boolean[] {false} ;
      T00OY6_A5199Nr_albent = new String[] {""} ;
      T00OY6_n5199Nr_albent = new boolean[] {false} ;
      T00OY6_A5200Nr_refcli = new String[] {""} ;
      T00OY6_n5200Nr_refcli = new boolean[] {false} ;
      T00OY6_A5201Nr_artcod = new String[] {""} ;
      T00OY6_n5201Nr_artcod = new boolean[] {false} ;
      T00OY6_A5202Nr_artdsc = new String[] {""} ;
      T00OY6_n5202Nr_artdsc = new boolean[] {false} ;
      T00OY6_A5203Nr_colnom = new String[] {""} ;
      T00OY6_n5203Nr_colnom = new boolean[] {false} ;
      T00OY6_A5204Nr_colnum = new int[1] ;
      T00OY6_n5204Nr_colnum = new boolean[] {false} ;
      T00OY6_A5205Nr_partida = new int[1] ;
      T00OY6_n5205Nr_partida = new boolean[] {false} ;
      T00OY6_A5207Nr_piezas = new int[1] ;
      T00OY6_n5207Nr_piezas = new boolean[] {false} ;
      T00OY6_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00OY6_n5208Nr_unidade = new boolean[] {false} ;
      T00OY6_A5209Nr_unidad = new String[] {""} ;
      T00OY6_n5209Nr_unidad = new boolean[] {false} ;
      T00OY6_A5222Nr_barcoda = new int[1] ;
      T00OY6_n5222Nr_barcoda = new boolean[] {false} ;
      T00OY6_A5223Nr_barreoa = new byte[1] ;
      T00OY6_n5223Nr_barreoa = new boolean[] {false} ;
      T00OY6_A5224Nr_barpara = new String[] {""} ;
      T00OY6_n5224Nr_barpara = new boolean[] {false} ;
      T00OY6_A12235Nr_NAlb = new long[1] ;
      T00OY6_n12235Nr_NAlb = new boolean[] {false} ;
      T00OY6_A5214Nr_local = new String[] {""} ;
      T00OY6_n5214Nr_local = new boolean[] {false} ;
      T00OY6_A5215Nr_user = new String[] {""} ;
      T00OY6_n5215Nr_user = new boolean[] {false} ;
      T00OY6_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      T00OY6_n5216Nr_fecreg = new boolean[] {false} ;
      T00OY6_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      T00OY6_n5217Nr_fecent = new boolean[] {false} ;
      T00OY6_A5210Nr_barcod = new int[1] ;
      T00OY6_n5210Nr_barcod = new boolean[] {false} ;
      T00OY6_A5211Nr_barreo = new byte[1] ;
      T00OY6_n5211Nr_barreo = new boolean[] {false} ;
      T00OY6_A5212Nr_barpar = new String[] {""} ;
      T00OY6_n5212Nr_barpar = new boolean[] {false} ;
      T00OY6_A5213Nr_discod = new int[1] ;
      T00OY6_n5213Nr_discod = new boolean[] {false} ;
      T00OY6_A7090Nr_PartCod = new String[] {""} ;
      T00OY6_n7090Nr_PartCod = new boolean[] {false} ;
      T00OY6_A7091Nr_ParNMtr = new String[] {""} ;
      T00OY6_n7091Nr_ParNMtr = new boolean[] {false} ;
      T00OY6_A396EmprCod = new String[] {""} ;
      T00OY6_A5098TipDisCod = new String[] {""} ;
      T00OY6_n5098TipDisCod = new boolean[] {false} ;
      T00OY16_A396EmprCod = new String[] {""} ;
      T00OY16_A5198Nr_codigo = new int[1] ;
      T00OY17_A396EmprCod = new String[] {""} ;
      T00OY17_A5198Nr_codigo = new int[1] ;
      T00OY18_A13845TipDisDscI = new String[] {""} ;
      T00OY18_A396EmprCod = new String[] {""} ;
      T00OY18_A5098TipDisCod = new String[] {""} ;
      T00OY18_n5098TipDisCod = new boolean[] {false} ;
      T00OY5_A5198Nr_codigo = new int[1] ;
      T00OY5_A5206Nr_albrecc = new int[1] ;
      T00OY5_n5206Nr_albrecc = new boolean[] {false} ;
      T00OY5_A5340Nr_CliCod = new int[1] ;
      T00OY5_n5340Nr_CliCod = new boolean[] {false} ;
      T00OY5_A5341Nr_CliNom = new String[] {""} ;
      T00OY5_n5341Nr_CliNom = new boolean[] {false} ;
      T00OY5_A5199Nr_albent = new String[] {""} ;
      T00OY5_n5199Nr_albent = new boolean[] {false} ;
      T00OY5_A5200Nr_refcli = new String[] {""} ;
      T00OY5_n5200Nr_refcli = new boolean[] {false} ;
      T00OY5_A5201Nr_artcod = new String[] {""} ;
      T00OY5_n5201Nr_artcod = new boolean[] {false} ;
      T00OY5_A5202Nr_artdsc = new String[] {""} ;
      T00OY5_n5202Nr_artdsc = new boolean[] {false} ;
      T00OY5_A5203Nr_colnom = new String[] {""} ;
      T00OY5_n5203Nr_colnom = new boolean[] {false} ;
      T00OY5_A5204Nr_colnum = new int[1] ;
      T00OY5_n5204Nr_colnum = new boolean[] {false} ;
      T00OY5_A5205Nr_partida = new int[1] ;
      T00OY5_n5205Nr_partida = new boolean[] {false} ;
      T00OY5_A5207Nr_piezas = new int[1] ;
      T00OY5_n5207Nr_piezas = new boolean[] {false} ;
      T00OY5_A5208Nr_unidade = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00OY5_n5208Nr_unidade = new boolean[] {false} ;
      T00OY5_A5209Nr_unidad = new String[] {""} ;
      T00OY5_n5209Nr_unidad = new boolean[] {false} ;
      T00OY5_A5222Nr_barcoda = new int[1] ;
      T00OY5_n5222Nr_barcoda = new boolean[] {false} ;
      T00OY5_A5223Nr_barreoa = new byte[1] ;
      T00OY5_n5223Nr_barreoa = new boolean[] {false} ;
      T00OY5_A5224Nr_barpara = new String[] {""} ;
      T00OY5_n5224Nr_barpara = new boolean[] {false} ;
      T00OY5_A12235Nr_NAlb = new long[1] ;
      T00OY5_n12235Nr_NAlb = new boolean[] {false} ;
      T00OY5_A5214Nr_local = new String[] {""} ;
      T00OY5_n5214Nr_local = new boolean[] {false} ;
      T00OY5_A5215Nr_user = new String[] {""} ;
      T00OY5_n5215Nr_user = new boolean[] {false} ;
      T00OY5_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      T00OY5_n5216Nr_fecreg = new boolean[] {false} ;
      T00OY5_A5217Nr_fecent = new java.util.Date[] {GXutil.nullDate()} ;
      T00OY5_n5217Nr_fecent = new boolean[] {false} ;
      T00OY5_A5210Nr_barcod = new int[1] ;
      T00OY5_n5210Nr_barcod = new boolean[] {false} ;
      T00OY5_A5211Nr_barreo = new byte[1] ;
      T00OY5_n5211Nr_barreo = new boolean[] {false} ;
      T00OY5_A5212Nr_barpar = new String[] {""} ;
      T00OY5_n5212Nr_barpar = new boolean[] {false} ;
      T00OY5_A5213Nr_discod = new int[1] ;
      T00OY5_n5213Nr_discod = new boolean[] {false} ;
      T00OY5_A7090Nr_PartCod = new String[] {""} ;
      T00OY5_n7090Nr_PartCod = new boolean[] {false} ;
      T00OY5_A7091Nr_ParNMtr = new String[] {""} ;
      T00OY5_n7091Nr_ParNMtr = new boolean[] {false} ;
      T00OY5_A396EmprCod = new String[] {""} ;
      T00OY5_A5098TipDisCod = new String[] {""} ;
      T00OY5_n5098TipDisCod = new boolean[] {false} ;
      T00OY22_A5097TipDisDsc = new String[] {""} ;
      T00OY22_n5097TipDisDsc = new boolean[] {false} ;
      T00OY23_A396EmprCod = new String[] {""} ;
      T00OY23_A5198Nr_codigo = new int[1] ;
      T00OY23_A5230Nr_linTre = new short[1] ;
      T00OY24_A396EmprCod = new String[] {""} ;
      T00OY24_A5198Nr_codigo = new int[1] ;
      T00OY24_A5228Nr_linTec = new short[1] ;
      T00OY25_A396EmprCod = new String[] {""} ;
      T00OY25_A5198Nr_codigo = new int[1] ;
      T00OY25_A5196TipCorCod = new short[1] ;
      T00OY26_A396EmprCod = new String[] {""} ;
      T00OY26_A5198Nr_codigo = new int[1] ;
      Z834TipDefDsc = "" ;
      T00OY27_A5198Nr_codigo = new int[1] ;
      T00OY27_A834TipDefDsc = new String[] {""} ;
      T00OY27_n834TipDefDsc = new boolean[] {false} ;
      T00OY27_A396EmprCod = new String[] {""} ;
      T00OY27_A833TipDefCod = new short[1] ;
      T00OY28_A13819TipdefDscI = new String[] {""} ;
      T00OY28_A396EmprCod = new String[] {""} ;
      T00OY28_A833TipDefCod = new short[1] ;
      T00OY29_A13819TipdefDscI = new String[] {""} ;
      T00OY29_A396EmprCod = new String[] {""} ;
      T00OY29_A833TipDefCod = new short[1] ;
      T00OY30_A13819TipdefDscI = new String[] {""} ;
      T00OY30_A396EmprCod = new String[] {""} ;
      T00OY30_A833TipDefCod = new short[1] ;
      T00OY4_A834TipDefDsc = new String[] {""} ;
      T00OY4_n834TipDefDsc = new boolean[] {false} ;
      T00OY31_A834TipDefDsc = new String[] {""} ;
      T00OY31_n834TipDefDsc = new boolean[] {false} ;
      T00OY32_A13819TipdefDscI = new String[] {""} ;
      T00OY32_A396EmprCod = new String[] {""} ;
      T00OY32_A833TipDefCod = new short[1] ;
      T00OY33_A396EmprCod = new String[] {""} ;
      T00OY33_A5198Nr_codigo = new int[1] ;
      T00OY33_A833TipDefCod = new short[1] ;
      T00OY3_A5198Nr_codigo = new int[1] ;
      T00OY3_A396EmprCod = new String[] {""} ;
      T00OY3_A833TipDefCod = new short[1] ;
      T00OY34_A13819TipdefDscI = new String[] {""} ;
      T00OY34_A396EmprCod = new String[] {""} ;
      T00OY34_A833TipDefCod = new short[1] ;
      T00OY2_A5198Nr_codigo = new int[1] ;
      T00OY2_A396EmprCod = new String[] {""} ;
      T00OY2_A833TipDefCod = new short[1] ;
      T00OY37_A834TipDefDsc = new String[] {""} ;
      T00OY37_n834TipDefDsc = new boolean[] {false} ;
      T00OY38_A396EmprCod = new String[] {""} ;
      T00OY38_A5198Nr_codigo = new int[1] ;
      T00OY38_A833TipDefCod = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i5215Nr_user = "" ;
      i5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13845TipDisDscI = "" ;
      T00OY39_A13845TipDisDscI = new String[] {""} ;
      l13819TipdefDscI = "" ;
      T00OY40_A13819TipdefDscI = new String[] {""} ;
      T00OY41_A13845TipDisDscI = new String[] {""} ;
      T00OY41_A396EmprCod = new String[] {""} ;
      T00OY41_A5098TipDisCod = new String[] {""} ;
      T00OY41_n5098TipDisCod = new boolean[] {false} ;
      T00OY42_A13819TipdefDscI = new String[] {""} ;
      T00OY42_A396EmprCod = new String[] {""} ;
      T00OY42_A833TipDefCod = new short[1] ;
      GXv_int8 = new int[1] ;
      ZV39Msg_1 = "" ;
      T00OY43_A13845TipDisDscI = new String[] {""} ;
      T00OY43_A396EmprCod = new String[] {""} ;
      T00OY43_A5098TipDisCod = new String[] {""} ;
      T00OY43_n5098TipDisCod = new boolean[] {false} ;
      Zh5098TipDisCod = "" ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char15 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char2 = new String[1] ;
      T00OY44_A13819TipdefDscI = new String[] {""} ;
      T00OY44_A396EmprCod = new String[] {""} ;
      T00OY44_A833TipDefCod = new short[1] ;
      T00OY45_A834TipDefDsc = new String[] {""} ;
      T00OY45_n834TipDefDsc = new boolean[] {false} ;
      Zh833TipDefCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tnotrec__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tnotrec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tnotrec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tnotrec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnotrec__default(),
         new Object[] {
             new Object[] {
            T00OY2_A5198Nr_codigo, T00OY2_A396EmprCod, T00OY2_A833TipDefCod
            }
            , new Object[] {
            T00OY3_A5198Nr_codigo, T00OY3_A396EmprCod, T00OY3_A833TipDefCod
            }
            , new Object[] {
            T00OY4_A834TipDefDsc, T00OY4_n834TipDefDsc
            }
            , new Object[] {
            T00OY5_A5198Nr_codigo, T00OY5_A5206Nr_albrecc, T00OY5_n5206Nr_albrecc, T00OY5_A5340Nr_CliCod, T00OY5_n5340Nr_CliCod, T00OY5_A5341Nr_CliNom, T00OY5_n5341Nr_CliNom, T00OY5_A5199Nr_albent, T00OY5_n5199Nr_albent, T00OY5_A5200Nr_refcli,
            T00OY5_n5200Nr_refcli, T00OY5_A5201Nr_artcod, T00OY5_n5201Nr_artcod, T00OY5_A5202Nr_artdsc, T00OY5_n5202Nr_artdsc, T00OY5_A5203Nr_colnom, T00OY5_n5203Nr_colnom, T00OY5_A5204Nr_colnum, T00OY5_n5204Nr_colnum, T00OY5_A5205Nr_partida,
            T00OY5_n5205Nr_partida, T00OY5_A5207Nr_piezas, T00OY5_n5207Nr_piezas, T00OY5_A5208Nr_unidade, T00OY5_n5208Nr_unidade, T00OY5_A5209Nr_unidad, T00OY5_n5209Nr_unidad, T00OY5_A5222Nr_barcoda, T00OY5_n5222Nr_barcoda, T00OY5_A5223Nr_barreoa,
            T00OY5_n5223Nr_barreoa, T00OY5_A5224Nr_barpara, T00OY5_n5224Nr_barpara, T00OY5_A12235Nr_NAlb, T00OY5_n12235Nr_NAlb, T00OY5_A5214Nr_local, T00OY5_n5214Nr_local, T00OY5_A5215Nr_user, T00OY5_n5215Nr_user, T00OY5_A5216Nr_fecreg,
            T00OY5_n5216Nr_fecreg, T00OY5_A5217Nr_fecent, T00OY5_n5217Nr_fecent, T00OY5_A5210Nr_barcod, T00OY5_n5210Nr_barcod, T00OY5_A5211Nr_barreo, T00OY5_n5211Nr_barreo, T00OY5_A5212Nr_barpar, T00OY5_n5212Nr_barpar, T00OY5_A5213Nr_discod,
            T00OY5_n5213Nr_discod, T00OY5_A7090Nr_PartCod, T00OY5_n7090Nr_PartCod, T00OY5_A7091Nr_ParNMtr, T00OY5_n7091Nr_ParNMtr, T00OY5_A396EmprCod, T00OY5_A5098TipDisCod, T00OY5_n5098TipDisCod
            }
            , new Object[] {
            T00OY6_A5198Nr_codigo, T00OY6_A5206Nr_albrecc, T00OY6_n5206Nr_albrecc, T00OY6_A5340Nr_CliCod, T00OY6_n5340Nr_CliCod, T00OY6_A5341Nr_CliNom, T00OY6_n5341Nr_CliNom, T00OY6_A5199Nr_albent, T00OY6_n5199Nr_albent, T00OY6_A5200Nr_refcli,
            T00OY6_n5200Nr_refcli, T00OY6_A5201Nr_artcod, T00OY6_n5201Nr_artcod, T00OY6_A5202Nr_artdsc, T00OY6_n5202Nr_artdsc, T00OY6_A5203Nr_colnom, T00OY6_n5203Nr_colnom, T00OY6_A5204Nr_colnum, T00OY6_n5204Nr_colnum, T00OY6_A5205Nr_partida,
            T00OY6_n5205Nr_partida, T00OY6_A5207Nr_piezas, T00OY6_n5207Nr_piezas, T00OY6_A5208Nr_unidade, T00OY6_n5208Nr_unidade, T00OY6_A5209Nr_unidad, T00OY6_n5209Nr_unidad, T00OY6_A5222Nr_barcoda, T00OY6_n5222Nr_barcoda, T00OY6_A5223Nr_barreoa,
            T00OY6_n5223Nr_barreoa, T00OY6_A5224Nr_barpara, T00OY6_n5224Nr_barpara, T00OY6_A12235Nr_NAlb, T00OY6_n12235Nr_NAlb, T00OY6_A5214Nr_local, T00OY6_n5214Nr_local, T00OY6_A5215Nr_user, T00OY6_n5215Nr_user, T00OY6_A5216Nr_fecreg,
            T00OY6_n5216Nr_fecreg, T00OY6_A5217Nr_fecent, T00OY6_n5217Nr_fecent, T00OY6_A5210Nr_barcod, T00OY6_n5210Nr_barcod, T00OY6_A5211Nr_barreo, T00OY6_n5211Nr_barreo, T00OY6_A5212Nr_barpar, T00OY6_n5212Nr_barpar, T00OY6_A5213Nr_discod,
            T00OY6_n5213Nr_discod, T00OY6_A7090Nr_PartCod, T00OY6_n7090Nr_PartCod, T00OY6_A7091Nr_ParNMtr, T00OY6_n7091Nr_ParNMtr, T00OY6_A396EmprCod, T00OY6_A5098TipDisCod, T00OY6_n5098TipDisCod
            }
            , new Object[] {
            T00OY7_A407EmprNom, T00OY7_n407EmprNom
            }
            , new Object[] {
            T00OY8_A5097TipDisDsc, T00OY8_n5097TipDisDsc
            }
            , new Object[] {
            T00OY9_A13845TipDisDscI, T00OY9_A396EmprCod, T00OY9_A5098TipDisCod
            }
            , new Object[] {
            T00OY10_A5198Nr_codigo, T00OY10_A5206Nr_albrecc, T00OY10_n5206Nr_albrecc, T00OY10_A407EmprNom, T00OY10_n407EmprNom, T00OY10_A5340Nr_CliCod, T00OY10_n5340Nr_CliCod, T00OY10_A5341Nr_CliNom, T00OY10_n5341Nr_CliNom, T00OY10_A5199Nr_albent,
            T00OY10_n5199Nr_albent, T00OY10_A5200Nr_refcli, T00OY10_n5200Nr_refcli, T00OY10_A5201Nr_artcod, T00OY10_n5201Nr_artcod, T00OY10_A5202Nr_artdsc, T00OY10_n5202Nr_artdsc, T00OY10_A5203Nr_colnom, T00OY10_n5203Nr_colnom, T00OY10_A5204Nr_colnum,
            T00OY10_n5204Nr_colnum, T00OY10_A5205Nr_partida, T00OY10_n5205Nr_partida, T00OY10_A5207Nr_piezas, T00OY10_n5207Nr_piezas, T00OY10_A5208Nr_unidade, T00OY10_n5208Nr_unidade, T00OY10_A5209Nr_unidad, T00OY10_n5209Nr_unidad, T00OY10_A5222Nr_barcoda,
            T00OY10_n5222Nr_barcoda, T00OY10_A5223Nr_barreoa, T00OY10_n5223Nr_barreoa, T00OY10_A5224Nr_barpara, T00OY10_n5224Nr_barpara, T00OY10_A12235Nr_NAlb, T00OY10_n12235Nr_NAlb, T00OY10_A5214Nr_local, T00OY10_n5214Nr_local, T00OY10_A5215Nr_user,
            T00OY10_n5215Nr_user, T00OY10_A5216Nr_fecreg, T00OY10_n5216Nr_fecreg, T00OY10_A5217Nr_fecent, T00OY10_n5217Nr_fecent, T00OY10_A5210Nr_barcod, T00OY10_n5210Nr_barcod, T00OY10_A5211Nr_barreo, T00OY10_n5211Nr_barreo, T00OY10_A5212Nr_barpar,
            T00OY10_n5212Nr_barpar, T00OY10_A5213Nr_discod, T00OY10_n5213Nr_discod, T00OY10_A5097TipDisDsc, T00OY10_n5097TipDisDsc, T00OY10_A7090Nr_PartCod, T00OY10_n7090Nr_PartCod, T00OY10_A7091Nr_ParNMtr, T00OY10_n7091Nr_ParNMtr, T00OY10_A396EmprCod,
            T00OY10_A5098TipDisCod, T00OY10_n5098TipDisCod
            }
            , new Object[] {
            T00OY11_A13845TipDisDscI, T00OY11_A396EmprCod, T00OY11_A5098TipDisCod
            }
            , new Object[] {
            T00OY12_A13845TipDisDscI, T00OY12_A396EmprCod, T00OY12_A5098TipDisCod
            }
            , new Object[] {
            T00OY13_A13845TipDisDscI, T00OY13_A396EmprCod, T00OY13_A5098TipDisCod
            }
            , new Object[] {
            T00OY14_A5097TipDisDsc, T00OY14_n5097TipDisDsc
            }
            , new Object[] {
            T00OY15_A396EmprCod, T00OY15_A5198Nr_codigo
            }
            , new Object[] {
            T00OY16_A396EmprCod, T00OY16_A5198Nr_codigo
            }
            , new Object[] {
            T00OY17_A396EmprCod, T00OY17_A5198Nr_codigo
            }
            , new Object[] {
            T00OY18_A13845TipDisDscI, T00OY18_A396EmprCod, T00OY18_A5098TipDisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00OY22_A5097TipDisDsc, T00OY22_n5097TipDisDsc
            }
            , new Object[] {
            T00OY23_A396EmprCod, T00OY23_A5198Nr_codigo, T00OY23_A5230Nr_linTre
            }
            , new Object[] {
            T00OY24_A396EmprCod, T00OY24_A5198Nr_codigo, T00OY24_A5228Nr_linTec
            }
            , new Object[] {
            T00OY25_A396EmprCod, T00OY25_A5198Nr_codigo, T00OY25_A5196TipCorCod
            }
            , new Object[] {
            T00OY26_A396EmprCod, T00OY26_A5198Nr_codigo
            }
            , new Object[] {
            T00OY27_A5198Nr_codigo, T00OY27_A834TipDefDsc, T00OY27_n834TipDefDsc, T00OY27_A396EmprCod, T00OY27_A833TipDefCod
            }
            , new Object[] {
            T00OY28_A13819TipdefDscI, T00OY28_A396EmprCod, T00OY28_A833TipDefCod
            }
            , new Object[] {
            T00OY29_A13819TipdefDscI, T00OY29_A396EmprCod, T00OY29_A833TipDefCod
            }
            , new Object[] {
            T00OY30_A13819TipdefDscI, T00OY30_A396EmprCod, T00OY30_A833TipDefCod
            }
            , new Object[] {
            T00OY31_A834TipDefDsc, T00OY31_n834TipDefDsc
            }
            , new Object[] {
            T00OY32_A13819TipdefDscI, T00OY32_A396EmprCod, T00OY32_A833TipDefCod
            }
            , new Object[] {
            T00OY33_A396EmprCod, T00OY33_A5198Nr_codigo, T00OY33_A833TipDefCod
            }
            , new Object[] {
            T00OY34_A13819TipdefDscI, T00OY34_A396EmprCod, T00OY34_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00OY37_A834TipDefDsc, T00OY37_n834TipDefDsc
            }
            , new Object[] {
            T00OY38_A396EmprCod, T00OY38_A5198Nr_codigo, T00OY38_A833TipDefCod
            }
            , new Object[] {
            T00OY39_A13845TipDisDscI
            }
            , new Object[] {
            T00OY40_A13819TipdefDscI
            }
            , new Object[] {
            T00OY41_A13845TipDisDscI, T00OY41_A396EmprCod, T00OY41_A5098TipDisCod
            }
            , new Object[] {
            T00OY42_A13819TipdefDscI, T00OY42_A396EmprCod, T00OY42_A833TipDefCod
            }
            , new Object[] {
            T00OY43_A13845TipDisDscI, T00OY43_A396EmprCod, T00OY43_A5098TipDisCod
            }
            , new Object[] {
            T00OY44_A13819TipdefDscI, T00OY44_A396EmprCod, T00OY44_A833TipDefCod
            }
            , new Object[] {
            T00OY45_A834TipDefDsc, T00OY45_n834TipDefDsc
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV60Pgmname = "TNOTREC" ;
      Z5216Nr_fecreg = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n5216Nr_fecreg = false ;
      A5216Nr_fecreg = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n5216Nr_fecreg = false ;
      i5216Nr_fecreg = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n5216Nr_fecreg = false ;
      Z5215Nr_user = "" ;
      n5215Nr_user = false ;
      A5215Nr_user = "" ;
      n5215Nr_user = false ;
      i5215Nr_user = "" ;
      n5215Nr_user = false ;
   }

   private byte Z5223Nr_barreoa ;
   private byte Z5211Nr_barreo ;
   private byte GxWebError ;
   private byte AV38Ctrl_r ;
   private byte nKeyPressed ;
   private byte A5223Nr_barreoa ;
   private byte A5211Nr_barreo ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXt_int6 ;
   private byte ZV38Ctrl_r ;
   private byte GXv_int7[] ;
   private short Z833TipDefCod ;
   private short nRcdDeleted_764 ;
   private short nRcdExists_764 ;
   private short nIsMod_764 ;
   private short A833TipDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount764 ;
   private short RcdFound764 ;
   private short nBlankRcdUsr764 ;
   private short RcdFound761 ;
   private short nIsDirty_761 ;
   private short nIsDirty_764 ;
   private short gxhchits ;
   private int wcpOAV43Nr_codigo ;
   private int Z5198Nr_codigo ;
   private int Z5206Nr_albrecc ;
   private int Z5340Nr_CliCod ;
   private int Z5204Nr_colnum ;
   private int Z5205Nr_partida ;
   private int Z5207Nr_piezas ;
   private int Z5222Nr_barcoda ;
   private int Z5210Nr_barcod ;
   private int Z5213Nr_discod ;
   private int nRC_GXsfl_201 ;
   private int nGXsfl_201_idx=1 ;
   private int A5206Nr_albrecc ;
   private int A5340Nr_CliCod ;
   private int A5207Nr_piezas ;
   private int AV43Nr_codigo ;
   private int trnEnded ;
   private int A5198Nr_codigo ;
   private int edtNr_codigo_Enabled ;
   private int edtNr_albrecc_Enabled ;
   private int edtTipDisCod_Visible ;
   private int edtTipDisCod_Enabled ;
   private int edtNr_CliCod_Enabled ;
   private int edtNr_CliNom_Enabled ;
   private int edtNr_albent_Enabled ;
   private int edtNr_refcli_Enabled ;
   private int edtNr_artcod_Enabled ;
   private int edtNr_artdsc_Enabled ;
   private int edtNr_colnom_Enabled ;
   private int A5204Nr_colnum ;
   private int edtNr_colnum_Enabled ;
   private int A5205Nr_partida ;
   private int edtNr_partida_Enabled ;
   private int edtNr_piezas_Enabled ;
   private int edtNr_unidade_Enabled ;
   private int A5222Nr_barcoda ;
   private int edtNr_barcoda_Enabled ;
   private int edtNr_barreoa_Enabled ;
   private int edtNr_barpara_Enabled ;
   private int edtNr_NAlb_Enabled ;
   private int edtNr_local_Enabled ;
   private int edtNr_fecent_Enabled ;
   private int edtNr_fecreg_Enabled ;
   private int edtNr_user_Enabled ;
   private int A5210Nr_barcod ;
   private int edtNr_barcod_Enabled ;
   private int edtNr_barreo_Enabled ;
   private int edtNr_barpar_Enabled ;
   private int A5213Nr_discod ;
   private int edtNr_discod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtTipDefCod_Enabled ;
   private int fRowAdded ;
   private int AV61GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtTipDefCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXv_int8[] ;
   private int GXv_int12[] ;
   private int GXv_int9[] ;
   private long Z12235Nr_NAlb ;
   private long A12235Nr_NAlb ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5208Nr_unidade ;
   private java.math.BigDecimal A5208Nr_unidade ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV52EmprCod ;
   private String Z396EmprCod ;
   private String Z5341Nr_CliNom ;
   private String Z5199Nr_albent ;
   private String Z5200Nr_refcli ;
   private String Z5201Nr_artcod ;
   private String Z5202Nr_artdsc ;
   private String Z5203Nr_colnom ;
   private String Z5209Nr_unidad ;
   private String Z5224Nr_barpara ;
   private String Z5214Nr_local ;
   private String Z5215Nr_user ;
   private String Z5212Nr_barpar ;
   private String Z7090Nr_PartCod ;
   private String Z7091Nr_ParNMtr ;
   private String Z5098TipDisCod ;
   private String N5098TipDisCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5341Nr_CliNom ;
   private String A5199Nr_albent ;
   private String A5201Nr_artcod ;
   private String A5202Nr_artdsc ;
   private String A5209Nr_unidad ;
   private String AV39Msg_1 ;
   private String AV47Aplicacion ;
   private String A7090Nr_PartCod ;
   private String A7091Nr_ParNMtr ;
   private String A5098TipDisCod ;
   private String Gx_mode ;
   private String AV52EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtNr_codigo_Internalname ;
   private String sGXsfl_201_idx="0001" ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable15_Internalname ;
   private String TempTags ;
   private String edtNr_codigo_Jsonclick ;
   private String edtNr_albrecc_Internalname ;
   private String edtNr_albrecc_Jsonclick ;
   private String divTipdiscod_cell_Internalname ;
   private String divTipdiscod_cell_Class ;
   private String edtTipDisCod_Internalname ;
   private String edtTipDisCod_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String edtNr_CliCod_Internalname ;
   private String edtNr_CliCod_Jsonclick ;
   private String edtNr_CliNom_Internalname ;
   private String edtNr_CliNom_Jsonclick ;
   private String edtNr_albent_Internalname ;
   private String edtNr_albent_Jsonclick ;
   private String edtNr_refcli_Internalname ;
   private String A5200Nr_refcli ;
   private String edtNr_refcli_Jsonclick ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String edtNr_artcod_Internalname ;
   private String edtNr_artcod_Jsonclick ;
   private String edtNr_artdsc_Internalname ;
   private String edtNr_artdsc_Jsonclick ;
   private String edtNr_colnom_Internalname ;
   private String A5203Nr_colnom ;
   private String edtNr_colnom_Jsonclick ;
   private String edtNr_colnum_Internalname ;
   private String edtNr_colnum_Jsonclick ;
   private String edtNr_partida_Internalname ;
   private String edtNr_partida_Jsonclick ;
   private String Dvpanel_unnamedtable11_Width ;
   private String Dvpanel_unnamedtable11_Cls ;
   private String Dvpanel_unnamedtable11_Title ;
   private String Dvpanel_unnamedtable11_Iconposition ;
   private String Dvpanel_unnamedtable11_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String edtNr_piezas_Internalname ;
   private String edtNr_piezas_Jsonclick ;
   private String edtNr_unidade_Internalname ;
   private String edtNr_unidade_Jsonclick ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtNr_barcoda_Internalname ;
   private String edtNr_barcoda_Jsonclick ;
   private String edtNr_barreoa_Internalname ;
   private String edtNr_barreoa_Jsonclick ;
   private String edtNr_barpara_Internalname ;
   private String A5224Nr_barpara ;
   private String edtNr_barpara_Jsonclick ;
   private String edtNr_NAlb_Internalname ;
   private String edtNr_NAlb_Jsonclick ;
   private String edtNr_local_Internalname ;
   private String A5214Nr_local ;
   private String edtNr_local_Jsonclick ;
   private String edtNr_fecent_Internalname ;
   private String edtNr_fecent_Jsonclick ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtNr_fecreg_Internalname ;
   private String edtNr_fecreg_Jsonclick ;
   private String edtNr_user_Internalname ;
   private String A5215Nr_user ;
   private String edtNr_user_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtNr_barcod_Internalname ;
   private String edtNr_barcod_Jsonclick ;
   private String edtNr_barreo_Internalname ;
   private String edtNr_barreo_Jsonclick ;
   private String edtNr_barpar_Internalname ;
   private String A5212Nr_barpar ;
   private String edtNr_barpar_Jsonclick ;
   private String edtNr_discod_Internalname ;
   private String edtNr_discod_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode764 ;
   private String edtTipDefCod_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV56Insert_TipDisCod ;
   private String AV8UsurCod ;
   private String A407EmprNom ;
   private String A5097TipDisDsc ;
   private String AV60Pgmname ;
   private String A834TipDefDsc ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_unnamedtable10_Objectcall ;
   private String Dvpanel_unnamedtable10_Class ;
   private String Dvpanel_unnamedtable10_Height ;
   private String Dvpanel_unnamedtable11_Objectcall ;
   private String Dvpanel_unnamedtable11_Class ;
   private String Dvpanel_unnamedtable11_Height ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Dvpanel_unnamedtable6_Objectcall ;
   private String Dvpanel_unnamedtable6_Class ;
   private String Dvpanel_unnamedtable6_Height ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode761 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z5097TipDisDsc ;
   private String Z834TipDefDsc ;
   private String sGXsfl_201_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtTipDefCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i5215Nr_user ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String ZV39Msg_1 ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z5216Nr_fecreg ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date i5216Nr_fecreg ;
   private java.util.Date Z5217Nr_fecent ;
   private java.util.Date A5217Nr_fecent ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5206Nr_albrecc ;
   private boolean n5340Nr_CliCod ;
   private boolean n5341Nr_CliNom ;
   private boolean n5199Nr_albent ;
   private boolean n5201Nr_artcod ;
   private boolean n5202Nr_artdsc ;
   private boolean n5207Nr_piezas ;
   private boolean n5208Nr_unidade ;
   private boolean n5209Nr_unidad ;
   private boolean n7090Nr_PartCod ;
   private boolean n7091Nr_ParNMtr ;
   private boolean n5098TipDisCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable10_Autowidth ;
   private boolean Dvpanel_unnamedtable10_Autoheight ;
   private boolean Dvpanel_unnamedtable10_Collapsible ;
   private boolean Dvpanel_unnamedtable10_Collapsed ;
   private boolean Dvpanel_unnamedtable10_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable10_Autoscroll ;
   private boolean Dvpanel_unnamedtable11_Autowidth ;
   private boolean Dvpanel_unnamedtable11_Autoheight ;
   private boolean Dvpanel_unnamedtable11_Collapsible ;
   private boolean Dvpanel_unnamedtable11_Collapsed ;
   private boolean Dvpanel_unnamedtable11_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable11_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean bGXsfl_201_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5097TipDisDsc ;
   private boolean n834TipDefDsc ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_unnamedtable10_Enabled ;
   private boolean Dvpanel_unnamedtable10_Showheader ;
   private boolean Dvpanel_unnamedtable10_Visible ;
   private boolean Dvpanel_unnamedtable11_Enabled ;
   private boolean Dvpanel_unnamedtable11_Showheader ;
   private boolean Dvpanel_unnamedtable11_Visible ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Dvpanel_unnamedtable6_Enabled ;
   private boolean Dvpanel_unnamedtable6_Showheader ;
   private boolean Dvpanel_unnamedtable6_Visible ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n5200Nr_refcli ;
   private boolean n5203Nr_colnom ;
   private boolean n5204Nr_colnum ;
   private boolean n5205Nr_partida ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private boolean n12235Nr_NAlb ;
   private boolean n5214Nr_local ;
   private boolean n5217Nr_fecent ;
   private boolean n5216Nr_fecreg ;
   private boolean n5215Nr_user ;
   private boolean n5210Nr_barcod ;
   private boolean n5211Nr_barreo ;
   private boolean n5212Nr_barpar ;
   private boolean n5213Nr_discod ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13845TipDisDscI ;
   private String A13819TipdefDscI ;
   private String h5098TipDisCod ;
   private String h833TipDefCod ;
   private String l13845TipDisDscI ;
   private String l13819TipdefDscI ;
   private String Zh5098TipDisCod ;
   private String Zh833TipDefCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV55WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable11 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbNr_unidad ;
   private IDataStoreProvider pr_default ;
   private String[] T00OY7_A407EmprNom ;
   private boolean[] T00OY7_n407EmprNom ;
   private String[] T00OY9_A13845TipDisDscI ;
   private String[] T00OY9_A396EmprCod ;
   private String[] T00OY9_A5098TipDisCod ;
   private boolean[] T00OY9_n5098TipDisCod ;
   private String[] T00OY8_A5097TipDisDsc ;
   private boolean[] T00OY8_n5097TipDisDsc ;
   private int[] T00OY10_A5198Nr_codigo ;
   private int[] T00OY10_A5206Nr_albrecc ;
   private boolean[] T00OY10_n5206Nr_albrecc ;
   private String[] T00OY10_A407EmprNom ;
   private boolean[] T00OY10_n407EmprNom ;
   private int[] T00OY10_A5340Nr_CliCod ;
   private boolean[] T00OY10_n5340Nr_CliCod ;
   private String[] T00OY10_A5341Nr_CliNom ;
   private boolean[] T00OY10_n5341Nr_CliNom ;
   private String[] T00OY10_A5199Nr_albent ;
   private boolean[] T00OY10_n5199Nr_albent ;
   private String[] T00OY10_A5200Nr_refcli ;
   private boolean[] T00OY10_n5200Nr_refcli ;
   private String[] T00OY10_A5201Nr_artcod ;
   private boolean[] T00OY10_n5201Nr_artcod ;
   private String[] T00OY10_A5202Nr_artdsc ;
   private boolean[] T00OY10_n5202Nr_artdsc ;
   private String[] T00OY10_A5203Nr_colnom ;
   private boolean[] T00OY10_n5203Nr_colnom ;
   private int[] T00OY10_A5204Nr_colnum ;
   private boolean[] T00OY10_n5204Nr_colnum ;
   private int[] T00OY10_A5205Nr_partida ;
   private boolean[] T00OY10_n5205Nr_partida ;
   private int[] T00OY10_A5207Nr_piezas ;
   private boolean[] T00OY10_n5207Nr_piezas ;
   private java.math.BigDecimal[] T00OY10_A5208Nr_unidade ;
   private boolean[] T00OY10_n5208Nr_unidade ;
   private String[] T00OY10_A5209Nr_unidad ;
   private boolean[] T00OY10_n5209Nr_unidad ;
   private int[] T00OY10_A5222Nr_barcoda ;
   private boolean[] T00OY10_n5222Nr_barcoda ;
   private byte[] T00OY10_A5223Nr_barreoa ;
   private boolean[] T00OY10_n5223Nr_barreoa ;
   private String[] T00OY10_A5224Nr_barpara ;
   private boolean[] T00OY10_n5224Nr_barpara ;
   private long[] T00OY10_A12235Nr_NAlb ;
   private boolean[] T00OY10_n12235Nr_NAlb ;
   private String[] T00OY10_A5214Nr_local ;
   private boolean[] T00OY10_n5214Nr_local ;
   private String[] T00OY10_A5215Nr_user ;
   private boolean[] T00OY10_n5215Nr_user ;
   private java.util.Date[] T00OY10_A5216Nr_fecreg ;
   private boolean[] T00OY10_n5216Nr_fecreg ;
   private java.util.Date[] T00OY10_A5217Nr_fecent ;
   private boolean[] T00OY10_n5217Nr_fecent ;
   private int[] T00OY10_A5210Nr_barcod ;
   private boolean[] T00OY10_n5210Nr_barcod ;
   private byte[] T00OY10_A5211Nr_barreo ;
   private boolean[] T00OY10_n5211Nr_barreo ;
   private String[] T00OY10_A5212Nr_barpar ;
   private boolean[] T00OY10_n5212Nr_barpar ;
   private int[] T00OY10_A5213Nr_discod ;
   private boolean[] T00OY10_n5213Nr_discod ;
   private String[] T00OY10_A5097TipDisDsc ;
   private boolean[] T00OY10_n5097TipDisDsc ;
   private String[] T00OY10_A7090Nr_PartCod ;
   private boolean[] T00OY10_n7090Nr_PartCod ;
   private String[] T00OY10_A7091Nr_ParNMtr ;
   private boolean[] T00OY10_n7091Nr_ParNMtr ;
   private String[] T00OY10_A396EmprCod ;
   private String[] T00OY10_A5098TipDisCod ;
   private boolean[] T00OY10_n5098TipDisCod ;
   private String[] T00OY11_A13845TipDisDscI ;
   private String[] T00OY11_A396EmprCod ;
   private String[] T00OY11_A5098TipDisCod ;
   private boolean[] T00OY11_n5098TipDisCod ;
   private String[] T00OY12_A13845TipDisDscI ;
   private String[] T00OY12_A396EmprCod ;
   private String[] T00OY12_A5098TipDisCod ;
   private boolean[] T00OY12_n5098TipDisCod ;
   private String[] T00OY13_A13845TipDisDscI ;
   private String[] T00OY13_A396EmprCod ;
   private String[] T00OY13_A5098TipDisCod ;
   private boolean[] T00OY13_n5098TipDisCod ;
   private String[] T00OY14_A5097TipDisDsc ;
   private boolean[] T00OY14_n5097TipDisDsc ;
   private String[] T00OY15_A396EmprCod ;
   private int[] T00OY15_A5198Nr_codigo ;
   private int[] T00OY6_A5198Nr_codigo ;
   private int[] T00OY6_A5206Nr_albrecc ;
   private boolean[] T00OY6_n5206Nr_albrecc ;
   private int[] T00OY6_A5340Nr_CliCod ;
   private boolean[] T00OY6_n5340Nr_CliCod ;
   private String[] T00OY6_A5341Nr_CliNom ;
   private boolean[] T00OY6_n5341Nr_CliNom ;
   private String[] T00OY6_A5199Nr_albent ;
   private boolean[] T00OY6_n5199Nr_albent ;
   private String[] T00OY6_A5200Nr_refcli ;
   private boolean[] T00OY6_n5200Nr_refcli ;
   private String[] T00OY6_A5201Nr_artcod ;
   private boolean[] T00OY6_n5201Nr_artcod ;
   private String[] T00OY6_A5202Nr_artdsc ;
   private boolean[] T00OY6_n5202Nr_artdsc ;
   private String[] T00OY6_A5203Nr_colnom ;
   private boolean[] T00OY6_n5203Nr_colnom ;
   private int[] T00OY6_A5204Nr_colnum ;
   private boolean[] T00OY6_n5204Nr_colnum ;
   private int[] T00OY6_A5205Nr_partida ;
   private boolean[] T00OY6_n5205Nr_partida ;
   private int[] T00OY6_A5207Nr_piezas ;
   private boolean[] T00OY6_n5207Nr_piezas ;
   private java.math.BigDecimal[] T00OY6_A5208Nr_unidade ;
   private boolean[] T00OY6_n5208Nr_unidade ;
   private String[] T00OY6_A5209Nr_unidad ;
   private boolean[] T00OY6_n5209Nr_unidad ;
   private int[] T00OY6_A5222Nr_barcoda ;
   private boolean[] T00OY6_n5222Nr_barcoda ;
   private byte[] T00OY6_A5223Nr_barreoa ;
   private boolean[] T00OY6_n5223Nr_barreoa ;
   private String[] T00OY6_A5224Nr_barpara ;
   private boolean[] T00OY6_n5224Nr_barpara ;
   private long[] T00OY6_A12235Nr_NAlb ;
   private boolean[] T00OY6_n12235Nr_NAlb ;
   private String[] T00OY6_A5214Nr_local ;
   private boolean[] T00OY6_n5214Nr_local ;
   private String[] T00OY6_A5215Nr_user ;
   private boolean[] T00OY6_n5215Nr_user ;
   private java.util.Date[] T00OY6_A5216Nr_fecreg ;
   private boolean[] T00OY6_n5216Nr_fecreg ;
   private java.util.Date[] T00OY6_A5217Nr_fecent ;
   private boolean[] T00OY6_n5217Nr_fecent ;
   private int[] T00OY6_A5210Nr_barcod ;
   private boolean[] T00OY6_n5210Nr_barcod ;
   private byte[] T00OY6_A5211Nr_barreo ;
   private boolean[] T00OY6_n5211Nr_barreo ;
   private String[] T00OY6_A5212Nr_barpar ;
   private boolean[] T00OY6_n5212Nr_barpar ;
   private int[] T00OY6_A5213Nr_discod ;
   private boolean[] T00OY6_n5213Nr_discod ;
   private String[] T00OY6_A7090Nr_PartCod ;
   private boolean[] T00OY6_n7090Nr_PartCod ;
   private String[] T00OY6_A7091Nr_ParNMtr ;
   private boolean[] T00OY6_n7091Nr_ParNMtr ;
   private String[] T00OY6_A396EmprCod ;
   private String[] T00OY6_A5098TipDisCod ;
   private boolean[] T00OY6_n5098TipDisCod ;
   private String[] T00OY16_A396EmprCod ;
   private int[] T00OY16_A5198Nr_codigo ;
   private String[] T00OY17_A396EmprCod ;
   private int[] T00OY17_A5198Nr_codigo ;
   private String[] T00OY18_A13845TipDisDscI ;
   private String[] T00OY18_A396EmprCod ;
   private String[] T00OY18_A5098TipDisCod ;
   private boolean[] T00OY18_n5098TipDisCod ;
   private int[] T00OY5_A5198Nr_codigo ;
   private int[] T00OY5_A5206Nr_albrecc ;
   private boolean[] T00OY5_n5206Nr_albrecc ;
   private int[] T00OY5_A5340Nr_CliCod ;
   private boolean[] T00OY5_n5340Nr_CliCod ;
   private String[] T00OY5_A5341Nr_CliNom ;
   private boolean[] T00OY5_n5341Nr_CliNom ;
   private String[] T00OY5_A5199Nr_albent ;
   private boolean[] T00OY5_n5199Nr_albent ;
   private String[] T00OY5_A5200Nr_refcli ;
   private boolean[] T00OY5_n5200Nr_refcli ;
   private String[] T00OY5_A5201Nr_artcod ;
   private boolean[] T00OY5_n5201Nr_artcod ;
   private String[] T00OY5_A5202Nr_artdsc ;
   private boolean[] T00OY5_n5202Nr_artdsc ;
   private String[] T00OY5_A5203Nr_colnom ;
   private boolean[] T00OY5_n5203Nr_colnom ;
   private int[] T00OY5_A5204Nr_colnum ;
   private boolean[] T00OY5_n5204Nr_colnum ;
   private int[] T00OY5_A5205Nr_partida ;
   private boolean[] T00OY5_n5205Nr_partida ;
   private int[] T00OY5_A5207Nr_piezas ;
   private boolean[] T00OY5_n5207Nr_piezas ;
   private java.math.BigDecimal[] T00OY5_A5208Nr_unidade ;
   private boolean[] T00OY5_n5208Nr_unidade ;
   private String[] T00OY5_A5209Nr_unidad ;
   private boolean[] T00OY5_n5209Nr_unidad ;
   private int[] T00OY5_A5222Nr_barcoda ;
   private boolean[] T00OY5_n5222Nr_barcoda ;
   private byte[] T00OY5_A5223Nr_barreoa ;
   private boolean[] T00OY5_n5223Nr_barreoa ;
   private String[] T00OY5_A5224Nr_barpara ;
   private boolean[] T00OY5_n5224Nr_barpara ;
   private long[] T00OY5_A12235Nr_NAlb ;
   private boolean[] T00OY5_n12235Nr_NAlb ;
   private String[] T00OY5_A5214Nr_local ;
   private boolean[] T00OY5_n5214Nr_local ;
   private String[] T00OY5_A5215Nr_user ;
   private boolean[] T00OY5_n5215Nr_user ;
   private java.util.Date[] T00OY5_A5216Nr_fecreg ;
   private boolean[] T00OY5_n5216Nr_fecreg ;
   private java.util.Date[] T00OY5_A5217Nr_fecent ;
   private boolean[] T00OY5_n5217Nr_fecent ;
   private int[] T00OY5_A5210Nr_barcod ;
   private boolean[] T00OY5_n5210Nr_barcod ;
   private byte[] T00OY5_A5211Nr_barreo ;
   private boolean[] T00OY5_n5211Nr_barreo ;
   private String[] T00OY5_A5212Nr_barpar ;
   private boolean[] T00OY5_n5212Nr_barpar ;
   private int[] T00OY5_A5213Nr_discod ;
   private boolean[] T00OY5_n5213Nr_discod ;
   private String[] T00OY5_A7090Nr_PartCod ;
   private boolean[] T00OY5_n7090Nr_PartCod ;
   private String[] T00OY5_A7091Nr_ParNMtr ;
   private boolean[] T00OY5_n7091Nr_ParNMtr ;
   private String[] T00OY5_A396EmprCod ;
   private String[] T00OY5_A5098TipDisCod ;
   private boolean[] T00OY5_n5098TipDisCod ;
   private String[] T00OY22_A5097TipDisDsc ;
   private boolean[] T00OY22_n5097TipDisDsc ;
   private String[] T00OY23_A396EmprCod ;
   private int[] T00OY23_A5198Nr_codigo ;
   private short[] T00OY23_A5230Nr_linTre ;
   private String[] T00OY24_A396EmprCod ;
   private int[] T00OY24_A5198Nr_codigo ;
   private short[] T00OY24_A5228Nr_linTec ;
   private String[] T00OY25_A396EmprCod ;
   private int[] T00OY25_A5198Nr_codigo ;
   private short[] T00OY25_A5196TipCorCod ;
   private String[] T00OY26_A396EmprCod ;
   private int[] T00OY26_A5198Nr_codigo ;
   private int[] T00OY27_A5198Nr_codigo ;
   private String[] T00OY27_A834TipDefDsc ;
   private boolean[] T00OY27_n834TipDefDsc ;
   private String[] T00OY27_A396EmprCod ;
   private short[] T00OY27_A833TipDefCod ;
   private String[] T00OY28_A13819TipdefDscI ;
   private String[] T00OY28_A396EmprCod ;
   private short[] T00OY28_A833TipDefCod ;
   private String[] T00OY29_A13819TipdefDscI ;
   private String[] T00OY29_A396EmprCod ;
   private short[] T00OY29_A833TipDefCod ;
   private String[] T00OY30_A13819TipdefDscI ;
   private String[] T00OY30_A396EmprCod ;
   private short[] T00OY30_A833TipDefCod ;
   private String[] T00OY4_A834TipDefDsc ;
   private boolean[] T00OY4_n834TipDefDsc ;
   private String[] T00OY31_A834TipDefDsc ;
   private boolean[] T00OY31_n834TipDefDsc ;
   private String[] T00OY32_A13819TipdefDscI ;
   private String[] T00OY32_A396EmprCod ;
   private short[] T00OY32_A833TipDefCod ;
   private String[] T00OY33_A396EmprCod ;
   private int[] T00OY33_A5198Nr_codigo ;
   private short[] T00OY33_A833TipDefCod ;
   private int[] T00OY3_A5198Nr_codigo ;
   private String[] T00OY3_A396EmprCod ;
   private short[] T00OY3_A833TipDefCod ;
   private String[] T00OY34_A13819TipdefDscI ;
   private String[] T00OY34_A396EmprCod ;
   private short[] T00OY34_A833TipDefCod ;
   private int[] T00OY2_A5198Nr_codigo ;
   private String[] T00OY2_A396EmprCod ;
   private short[] T00OY2_A833TipDefCod ;
   private String[] T00OY37_A834TipDefDsc ;
   private boolean[] T00OY37_n834TipDefDsc ;
   private String[] T00OY38_A396EmprCod ;
   private int[] T00OY38_A5198Nr_codigo ;
   private short[] T00OY38_A833TipDefCod ;
   private String[] T00OY39_A13845TipDisDscI ;
   private String[] T00OY40_A13819TipdefDscI ;
   private String[] T00OY41_A13845TipDisDscI ;
   private String[] T00OY41_A396EmprCod ;
   private String[] T00OY41_A5098TipDisCod ;
   private boolean[] T00OY41_n5098TipDisCod ;
   private String[] T00OY42_A13819TipdefDscI ;
   private String[] T00OY42_A396EmprCod ;
   private short[] T00OY42_A833TipDefCod ;
   private String[] T00OY43_A13845TipDisDscI ;
   private String[] T00OY43_A396EmprCod ;
   private String[] T00OY43_A5098TipDisCod ;
   private boolean[] T00OY43_n5098TipDisCod ;
   private String[] T00OY44_A13819TipdefDscI ;
   private String[] T00OY44_A396EmprCod ;
   private short[] T00OY44_A833TipDefCod ;
   private String[] T00OY45_A834TipDefDsc ;
   private boolean[] T00OY45_n834TipDefDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV53WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV54TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV57TrnContextAtt ;
}

final  class tnotrec__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class tnotrec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class tnotrec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class tnotrec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class tnotrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00OY2", "SELECT Nr_codigo, EmprCod, TipDefCod FROM TXPNOTRE1 WHERE EmprCod = ? AND Nr_codigo = ? AND TipDefCod = ?  FOR UPDATE OF Nr_codigo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY3", "SELECT Nr_codigo, EmprCod, TipDefCod FROM TXPNOTRE1 WHERE EmprCod = ? AND Nr_codigo = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY4", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY5", "SELECT Nr_codigo, Nr_albrecc, Nr_CliCod, Nr_CliNom, Nr_albent, Nr_refcli, Nr_artcod, Nr_artdsc, Nr_colnom, Nr_colnum, Nr_partida, Nr_piezas, Nr_unidade, Nr_unidad, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_NAlb, Nr_local, Nr_user, Nr_fecreg, Nr_fecent, Nr_barcod, Nr_barreo, Nr_barpar, Nr_discod, Nr_PartCod, Nr_ParNMtr, EmprCod, TipDisCod FROM TXPNOTREC WHERE EmprCod = ? AND Nr_codigo = ?  FOR UPDATE OF Nr_albrecc, Nr_CliCod, Nr_CliNom, Nr_albent, Nr_refcli, Nr_artcod, Nr_artdsc, Nr_colnom, Nr_colnum, Nr_partida, Nr_piezas, Nr_unidade, Nr_unidad, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_NAlb, Nr_local, Nr_user, Nr_fecreg, Nr_fecent, Nr_barcod, Nr_barreo, Nr_barpar, Nr_discod, Nr_PartCod, Nr_ParNMtr, TipDisCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY6", "SELECT Nr_codigo, Nr_albrecc, Nr_CliCod, Nr_CliNom, Nr_albent, Nr_refcli, Nr_artcod, Nr_artdsc, Nr_colnom, Nr_colnum, Nr_partida, Nr_piezas, Nr_unidade, Nr_unidad, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_NAlb, Nr_local, Nr_user, Nr_fecreg, Nr_fecent, Nr_barcod, Nr_barreo, Nr_barpar, Nr_discod, Nr_PartCod, Nr_ParNMtr, EmprCod, TipDisCod FROM TXPNOTREC WHERE EmprCod = ? AND Nr_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY8", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY9", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (EmprCod = ?) AND (TipDisCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY10", "SELECT /*+ FIRST_ROWS(100) */ TM1.Nr_codigo, TM1.Nr_albrecc, T2.EmprNom, TM1.Nr_CliCod, TM1.Nr_CliNom, TM1.Nr_albent, TM1.Nr_refcli, TM1.Nr_artcod, TM1.Nr_artdsc, TM1.Nr_colnom, TM1.Nr_colnum, TM1.Nr_partida, TM1.Nr_piezas, TM1.Nr_unidade, TM1.Nr_unidad, TM1.Nr_barcoda, TM1.Nr_barreoa, TM1.Nr_barpara, TM1.Nr_NAlb, TM1.Nr_local, TM1.Nr_user, TM1.Nr_fecreg, TM1.Nr_fecent, TM1.Nr_barcod, TM1.Nr_barreo, TM1.Nr_barpar, TM1.Nr_discod, T3.TipDisDsc, TM1.Nr_PartCod, TM1.Nr_ParNMtr, TM1.EmprCod, TM1.TipDisCod FROM ((TXPNOTREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTIPDIS T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipDisCod = TM1.TipDisCod) WHERE TM1.EmprCod = ? and TM1.Nr_codigo = ? ORDER BY TM1.EmprCod, TM1.Nr_codigo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY11", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (EmprCod = ?) AND (TipDisCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY12", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY13", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY14", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? AND Nr_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Nr_codigo FROM TXPNOTREC WHERE ( Nr_codigo > ?) and EmprCod = ? ORDER BY EmprCod, Nr_codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OY17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Nr_codigo FROM TXPNOTREC WHERE ( Nr_codigo < ?) and EmprCod = ? ORDER BY EmprCod DESC, Nr_codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OY18", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00OY19", "INSERT INTO TXPNOTREC(Nr_codigo, Nr_albrecc, Nr_CliCod, Nr_CliNom, Nr_albent, Nr_refcli, Nr_artcod, Nr_artdsc, Nr_colnom, Nr_colnum, Nr_partida, Nr_piezas, Nr_unidade, Nr_unidad, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_NAlb, Nr_local, Nr_user, Nr_fecreg, Nr_fecent, Nr_barcod, Nr_barreo, Nr_barpar, Nr_discod, Nr_PartCod, Nr_ParNMtr, EmprCod, TipDisCod, Nr_sectra, Nr_fectra, OpeCod, Nr_UltTec, Nr_UltTre, Nr_comerc, Nr_obscom, Nr_RespTec, Nr_ObsRT, Nr_AeAcdCo, Nr_AeAcCor, Nr_acccor, Nr_TipDfCL, Nr_TipCsCL, Nr_OpeCod, Nr_AeAcdSN, Nr_AeAcdOb, Nr_fecat, Nr_obscm2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPNOTREC")
         ,new UpdateCursor("T00OY20", "UPDATE TXPNOTREC SET Nr_albrecc=?, Nr_CliCod=?, Nr_CliNom=?, Nr_albent=?, Nr_refcli=?, Nr_artcod=?, Nr_artdsc=?, Nr_colnom=?, Nr_colnum=?, Nr_partida=?, Nr_piezas=?, Nr_unidade=?, Nr_unidad=?, Nr_barcoda=?, Nr_barreoa=?, Nr_barpara=?, Nr_NAlb=?, Nr_local=?, Nr_user=?, Nr_fecreg=?, Nr_fecent=?, Nr_barcod=?, Nr_barreo=?, Nr_barpar=?, Nr_discod=?, Nr_PartCod=?, Nr_ParNMtr=?, TipDisCod=?  WHERE EmprCod = ? AND Nr_codigo = ?", GX_NOMASK, "TXPNOTREC")
         ,new UpdateCursor("T00OY21", "DELETE FROM TXPNOTREC  WHERE EmprCod = ? AND Nr_codigo = ?", GX_NOMASK, "TXPNOTREC")
         ,new ForEachCursor("T00OY22", "SELECT TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? AND TipDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY23", "SELECT * FROM (SELECT EmprCod, Nr_codigo, Nr_linTre FROM TXPNOTRTE WHERE EmprCod = ? AND Nr_codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OY24", "SELECT * FROM (SELECT EmprCod, Nr_codigo, Nr_linTec FROM TXPNOTRET WHERE EmprCod = ? AND Nr_codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OY25", "SELECT * FROM (SELECT EmprCod, Nr_codigo, TipCorCod FROM TXPNOTRCO WHERE EmprCod = ? AND Nr_codigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00OY26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? ORDER BY EmprCod, Nr_codigo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY27", "SELECT T1.Nr_codigo, T2.TipDefDsc, T1.EmprCod, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? and T1.TipDefCod = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY28", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (EmprCod = ?) AND (TipDefCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY29", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY30", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY31", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY32", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY33", "SELECT EmprCod, Nr_codigo, TipDefCod FROM TXPNOTRE1 WHERE EmprCod = ? AND Nr_codigo = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY34", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00OY35", "INSERT INTO TXPNOTRE1(Nr_codigo, EmprCod, TipDefCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPNOTRE1")
         ,new UpdateCursor("T00OY36", "DELETE FROM TXPNOTRE1  WHERE EmprCod = ? AND Nr_codigo = ? AND TipDefCod = ?", GX_NOMASK, "TXPNOTRE1")
         ,new ForEachCursor("T00OY37", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY38", "SELECT EmprCod, Nr_codigo, TipDefCod FROM TXPNOTRE1 WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo, TipDefCod ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY39", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI FROM TXPTIPDIS WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, '')))) like '%' || UPPER(?)) ORDER BY TipDisDscI) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY40", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI FROM TXPTIPDEF WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, '')))) like '%' || UPPER(?)) ORDER BY TipdefDscI) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY41", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY42", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY43", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, EmprCod, TipDisCod FROM TXPTIPDIS WHERE (RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY44", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00OY45", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               ((String[]) buf[56])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDateTime(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 16);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
               ((String[]) buf[60])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(18, ((Number) parms[34]).longValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 10);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 8);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[40], false);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DATE );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[42]);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 16);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 10);
               }
               stmt.setString(29, (String)parms[55], 3);
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[57], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 26);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[33]).longValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[41]);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 16);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 10);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               stmt.setString(29, (String)parms[56], 3);
               stmt.setInt(30, ((Number) parms[57]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 32 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               return;
            case 39 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 40 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 41 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 42 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

