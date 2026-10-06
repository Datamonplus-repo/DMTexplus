package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_colorantes_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5557Lb_LineaC = (short)(GXutil.lval( httpContext.GetPar( "Lb_LineaC"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1SV820( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, A5557Lb_LineaC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"PRDCTWST") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx24asaprdctwst1SV820( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_37( A396EmprCod, A5532Lb_numero) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A396EmprCod, A6310Lb_TaAuxC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_40( A396EmprCod, A5532Lb_numero, A5555Lb_opcion) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_42( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A490ForPrdUMe) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV11Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Lb_numero), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Lb_numero), "ZZZZZZZ9")));
            AV12Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Lb_opcion", AV12Lb_opcion);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Lb_opcion, "@!"))));
            AV29Lb_Rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_Rb"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Lb_Rb", GXutil.ltrimstr( AV29Lb_Rb, 7, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_RB", getSecureSignedToken( "", localUtil.format( AV29Lb_Rb, "ZZZ9.99")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Ensayo Laboratorio (Colorantes)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_numero_Internalname ;
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
      nRC_GXsfl_99 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_99"))) ;
      nGXsfl_99_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_99_idx"))) ;
      sGXsfl_99_idx = httpContext.GetPar( "sGXsfl_99_idx") ;
      edtForPrdUMe_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_99_Refreshing);
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public entradaensayolaboratorio_colorantes_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratorio_colorantes_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_colorantes_trn_impl.class ));
   }

   public entradaensayolaboratorio_colorantes_trn_impl( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_numero_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_numero_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_opcion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_opcion_Internalname, httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_opcion_Internalname, GXutil.rtrim( A5555Lb_opcion), GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_opcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_opcion_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_Gots_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_Gots_Internalname, httpContext.getMessage( "GOTS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_Gots_Internalname, GXutil.rtrim( A14088Lb_Gots), GXutil.rtrim( localUtil.format( A14088Lb_Gots, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_Gots_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_Gots_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable3_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable3_cell_Class, "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_taauxc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_taauxc_Internalname, httpContext.getMessage( "Tabla", ""), "", "", lblTextblocklb_taauxc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_taauxc.setProperty("Caption", Combo_lb_taauxc_Caption);
      ucCombo_lb_taauxc.setProperty("Cls", Combo_lb_taauxc_Cls);
      ucCombo_lb_taauxc.setProperty("EmptyItem", Combo_lb_taauxc_Emptyitem);
      ucCombo_lb_taauxc.setProperty("DropDownOptionsData", AV21Lb_TaAuxC_Data);
      ucCombo_lb_taauxc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_taauxc_Internalname, "COMBO_LB_TAAUXCContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxC_Internalname, httpContext.getMessage( "Codigo Tabla Auxiliares", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxC_Internalname, GXutil.rtrim( A6310Lb_TaAuxC), GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxC_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_TaAuxC_Visible, edtLb_TaAuxC_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_famc1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_famc1_Internalname, httpContext.getMessage( "Familia C1", ""), "", "", lblTextblocklb_famc1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_famc1.setProperty("Caption", Combo_lb_famc1_Caption);
      ucCombo_lb_famc1.setProperty("Cls", Combo_lb_famc1_Cls);
      ucCombo_lb_famc1.setProperty("EmptyItem", Combo_lb_famc1_Emptyitem);
      ucCombo_lb_famc1.setProperty("DropDownOptionsData", AV23Lb_famc1_Data);
      ucCombo_lb_famc1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_famc1_Internalname, "COMBO_LB_FAMC1Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_famc1_Internalname, httpContext.getMessage( "Familia C1", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_famc1_Internalname, GXutil.ltrim( localUtil.ntoc( A6373Lb_famc1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_famc1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6373Lb_famc1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6373Lb_famc1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_famc1_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_famc1_Visible, edtLb_famc1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_famc2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_famc2_Internalname, httpContext.getMessage( "Familia C2", ""), "", "", lblTextblocklb_famc2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_famc2.setProperty("Caption", Combo_lb_famc2_Caption);
      ucCombo_lb_famc2.setProperty("Cls", Combo_lb_famc2_Cls);
      ucCombo_lb_famc2.setProperty("EmptyItem", Combo_lb_famc2_Emptyitem);
      ucCombo_lb_famc2.setProperty("DropDownOptionsData", AV25Lb_famc2_Data);
      ucCombo_lb_famc2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_famc2_Internalname, "COMBO_LB_FAMC2Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_famc2_Internalname, httpContext.getMessage( "Familia C2", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_famc2_Internalname, GXutil.ltrim( localUtil.ntoc( A6374Lb_famc2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_famc2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6374Lb_famc2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6374Lb_famc2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_famc2_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_famc2_Visible, edtLb_famc2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_famc3_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_famc3_Internalname, httpContext.getMessage( "Familia C3", ""), "", "", lblTextblocklb_famc3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_famc3.setProperty("Caption", Combo_lb_famc3_Caption);
      ucCombo_lb_famc3.setProperty("Cls", Combo_lb_famc3_Cls);
      ucCombo_lb_famc3.setProperty("EmptyItem", Combo_lb_famc3_Emptyitem);
      ucCombo_lb_famc3.setProperty("DropDownOptionsData", AV27Lb_famc3_Data);
      ucCombo_lb_famc3.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_famc3_Internalname, "COMBO_LB_FAMC3Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_famc3_Internalname, httpContext.getMessage( "Familia C3", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_famc3_Internalname, GXutil.ltrim( localUtil.ntoc( A6375Lb_famc3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_famc3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6375Lb_famc3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6375Lb_famc3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_famc3_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_famc3_Visible, edtLb_famc3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnproductosvariables_Internalname, "", httpContext.getMessage( "Productos (#)", ""), bttBtnproductosvariables_Jsonclick, 7, httpContext.getMessage( "Productos (#)", ""), "", StyleString, ClassString, bttBtnproductosvariables_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111sv819_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellAlignRight DscTop", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSumColor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSumColor_Internalname, httpContext.getMessage( "Total Colorante", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumColor_Internalname, GXutil.ltrim( localUtil.ntoc( A6376SumColor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumColor_Enabled!=0) ? localUtil.format( A6376SumColor, "ZZZZ9.99999") : localUtil.format( A6376SumColor, "ZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumColor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSumColor_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV36Pgmname), GXutil.rtrim( localUtil.format( AV36Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_taauxc_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_taauxc_Internalname, GXutil.rtrim( AV22ComboLb_TaAuxC), GXutil.rtrim( localUtil.format( AV22ComboLb_TaAuxC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_taauxc_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_taauxc_Visible, edtavCombolb_taauxc_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_famc1_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_famc1_Internalname, GXutil.ltrim( localUtil.ntoc( AV24ComboLb_famc1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_famc1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24ComboLb_famc1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV24ComboLb_famc1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_famc1_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_famc1_Visible, edtavCombolb_famc1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_famc2_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_famc2_Internalname, GXutil.ltrim( localUtil.ntoc( AV26ComboLb_famc2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_famc2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26ComboLb_famc2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV26ComboLb_famc2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_famc2_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_famc2_Visible, edtavCombolb_famc2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_famc3_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_famc3_Internalname, GXutil.ltrim( localUtil.ntoc( AV28ComboLb_famc3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_famc3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28ComboLb_famc3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV28ComboLb_famc3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_famc3_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_famc3_Visible, edtavCombolb_famc3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Colorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV18PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* User Defined Control */
      ucCombo_forprdume.setProperty("Caption", Combo_forprdume_Caption);
      ucCombo_forprdume.setProperty("Cls", Combo_forprdume_Cls);
      ucCombo_forprdume.setProperty("IsGridItem", Combo_forprdume_Isgriditem);
      ucCombo_forprdume.setProperty("EmptyItem", Combo_forprdume_Emptyitem);
      ucCombo_forprdume.setProperty("DropDownOptionsData", AV20ForPrdUMe_Data);
      ucCombo_forprdume.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_forprdume_Internalname, "COMBO_FORPRDUMEContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol99( ) ;
      nGXsfl_99_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount820 = (short)(6) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_820 = (short)(1) ;
            scanStart1SV820( ) ;
            while ( RcdFound820 != 0 )
            {
               init_level_properties820( ) ;
               getByPrimaryKey1SV820( ) ;
               addRow1SV820( ) ;
               scanNext1SV820( ) ;
            }
            scanEnd1SV820( ) ;
            nBlankRcdCount820 = (short)(6) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6376SumColor = A6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         standaloneNotModal1SV820( ) ;
         standaloneModal1SV820( ) ;
         sMode820 = Gx_mode ;
         while ( nGXsfl_99_idx < nRC_GXsfl_99 )
         {
            bGXsfl_99_Refreshing = true ;
            readRow1SV820( ) ;
            edtLb_LineaC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAC_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtLB_CantC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_CANTC_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLB_CantC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLB_CantC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_99_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_99_Refreshing);
            edtPrdCtw1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW1_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdCtw2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW2_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdCtw3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW3_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdCtw4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW4_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtLb_fibra_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FIBRA_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_fibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fibra_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtLb_fibra_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FIBRA_"+sGXsfl_99_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_fibra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fibra_Visible), 5, 0), !bGXsfl_99_Refreshing);
            edtLb_PTinC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_PTINC_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_PTinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PTinC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdGots_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDGOTS_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdGots_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDGOTS_"+sGXsfl_99_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdCtwSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTWST_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), !bGXsfl_99_Refreshing);
            edtPrdCtwSt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTWST_"+sGXsfl_99_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_99_Refreshing);
            if ( ( nRcdExists_820 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SV820( ) ;
            }
            sendRow1SV820( ) ;
            bGXsfl_99_Refreshing = false ;
         }
         Gx_mode = sMode820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6376SumColor = B6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount820 = (short)(6) ;
         nRcdExists_820 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SV820( ) ;
            while ( RcdFound820 != 0 )
            {
               sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_99820( ) ;
               init_level_properties820( ) ;
               standaloneNotModal1SV820( ) ;
               getByPrimaryKey1SV820( ) ;
               standaloneModal1SV820( ) ;
               addRow1SV820( ) ;
               scanNext1SV820( ) ;
            }
            scanEnd1SV820( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode820 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_99820( ) ;
         initAll1SV820( ) ;
         init_level_properties820( ) ;
         B6376SumColor = A6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         nRcdExists_820 = (short)(0) ;
         nIsMod_820 = (short)(0) ;
         nRcdDeleted_820 = (short)(0) ;
         nBlankRcdCount820 = (short)(nBlankRcdUsr820+nBlankRcdCount820) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount820 > 0 )
         {
            standaloneNotModal1SV820( ) ;
            standaloneModal1SV820( ) ;
            addRow1SV820( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtLb_LineaC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount820 = (short)(nBlankRcdCount820-1) ;
         }
         Gx_mode = sMode820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6376SumColor = B6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
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
      e121SV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_TAAUXC_DATA"), AV21Lb_TaAuxC_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_FAMC1_DATA"), AV23Lb_famc1_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_FAMC2_DATA"), AV25Lb_famc2_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_FAMC3_DATA"), AV27Lb_famc3_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV18PrdNum_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFORPRDUME_DATA"), AV20ForPrdUMe_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z5532Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5555Lb_opcion = httpContext.cgiGet( "Z5555Lb_opcion") ;
            Z6373Lb_famc1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6373Lb_famc1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6374Lb_famc2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6374Lb_famc2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6375Lb_famc3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6375Lb_famc3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( "Z5565Lb_CosteE")) ;
            Z5556Lb_UltLC = (short)(localUtil.ctol( httpContext.cgiGet( "Z5556Lb_UltLC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5718Lb_numop"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8622Lb_IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8622Lb_IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6310Lb_TaAuxC = httpContext.cgiGet( "Z6310Lb_TaAuxC") ;
            A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( "Z5565Lb_CosteE")) ;
            A5556Lb_UltLC = (short)(localUtil.ctol( httpContext.cgiGet( "Z5556Lb_UltLC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5718Lb_numop"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8622Lb_IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8622Lb_IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6376SumColor = localUtil.ctond( httpContext.cgiGet( "O6376SumColor")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_99 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_99"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N6310Lb_TaAuxC = httpContext.cgiGet( "N6310Lb_TaAuxC") ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV11Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "vLB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Lb_opcion = httpContext.cgiGet( "vLB_OPCION") ;
            AV16Insert_Lb_TaAuxC = httpContext.cgiGet( "vINSERT_LB_TAAUXC") ;
            AV34fibracolorante = (short)(localUtil.ctol( httpContext.cgiGet( "vFIBRACOLORANTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5565Lb_CosteE = localUtil.ctond( httpContext.cgiGet( "LB_COSTEE")) ;
            A5556Lb_UltLC = (short)(localUtil.ctol( httpContext.cgiGet( "LB_ULTLC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5718Lb_numop = (byte)(localUtil.ctol( httpContext.cgiGet( "LB_NUMOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8622Lb_IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "LB_INTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A6311Lb_TaAuxD = httpContext.cgiGet( "LB_TAAUXD") ;
            A7261Lb_HorMax = (byte)(localUtil.ctol( httpContext.cgiGet( "LB_HORMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7261Lb_HorMax = false ;
            A14094PrdFibra = httpContext.cgiGet( "PRDFIBRA") ;
            n14094PrdFibra = false ;
            A6058Lb_soluc = (int)(localUtil.ctol( httpContext.cgiGet( "LB_SOLUC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDHORMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
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
            Combo_lb_taauxc_Objectcall = httpContext.cgiGet( "COMBO_LB_TAAUXC_Objectcall") ;
            Combo_lb_taauxc_Class = httpContext.cgiGet( "COMBO_LB_TAAUXC_Class") ;
            Combo_lb_taauxc_Icontype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Icontype") ;
            Combo_lb_taauxc_Icon = httpContext.cgiGet( "COMBO_LB_TAAUXC_Icon") ;
            Combo_lb_taauxc_Caption = httpContext.cgiGet( "COMBO_LB_TAAUXC_Caption") ;
            Combo_lb_taauxc_Tooltip = httpContext.cgiGet( "COMBO_LB_TAAUXC_Tooltip") ;
            Combo_lb_taauxc_Cls = httpContext.cgiGet( "COMBO_LB_TAAUXC_Cls") ;
            Combo_lb_taauxc_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedvalue_set") ;
            Combo_lb_taauxc_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedvalue_get") ;
            Combo_lb_taauxc_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedtext_set") ;
            Combo_lb_taauxc_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedtext_get") ;
            Combo_lb_taauxc_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_TAAUXC_Gamoauthtoken") ;
            Combo_lb_taauxc_Ddointernalname = httpContext.cgiGet( "COMBO_LB_TAAUXC_Ddointernalname") ;
            Combo_lb_taauxc_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_TAAUXC_Titlecontrolalign") ;
            Combo_lb_taauxc_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Dropdownoptionstype") ;
            Combo_lb_taauxc_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Enabled")) ;
            Combo_lb_taauxc_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Visible")) ;
            Combo_lb_taauxc_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_TAAUXC_Titlecontrolidtoreplace") ;
            Combo_lb_taauxc_Datalisttype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalisttype") ;
            Combo_lb_taauxc_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Allowmultipleselection")) ;
            Combo_lb_taauxc_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistfixedvalues") ;
            Combo_lb_taauxc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Isgriditem")) ;
            Combo_lb_taauxc_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Hasdescription")) ;
            Combo_lb_taauxc_Datalistproc = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistproc") ;
            Combo_lb_taauxc_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistprocparametersprefix") ;
            Combo_lb_taauxc_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_TAAUXC_Remoteservicesparameters") ;
            Combo_lb_taauxc_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_taauxc_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Includeonlyselectedoption")) ;
            Combo_lb_taauxc_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Includeselectalloption")) ;
            Combo_lb_taauxc_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Emptyitem")) ;
            Combo_lb_taauxc_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Includeaddnewoption")) ;
            Combo_lb_taauxc_Htmltemplate = httpContext.cgiGet( "COMBO_LB_TAAUXC_Htmltemplate") ;
            Combo_lb_taauxc_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Multiplevaluestype") ;
            Combo_lb_taauxc_Loadingdata = httpContext.cgiGet( "COMBO_LB_TAAUXC_Loadingdata") ;
            Combo_lb_taauxc_Noresultsfound = httpContext.cgiGet( "COMBO_LB_TAAUXC_Noresultsfound") ;
            Combo_lb_taauxc_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_TAAUXC_Emptyitemtext") ;
            Combo_lb_taauxc_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXC_Onlyselectedvalues") ;
            Combo_lb_taauxc_Selectalltext = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectalltext") ;
            Combo_lb_taauxc_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_TAAUXC_Multiplevaluesseparator") ;
            Combo_lb_taauxc_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_TAAUXC_Addnewoptiontext") ;
            Combo_lb_famc1_Objectcall = httpContext.cgiGet( "COMBO_LB_FAMC1_Objectcall") ;
            Combo_lb_famc1_Class = httpContext.cgiGet( "COMBO_LB_FAMC1_Class") ;
            Combo_lb_famc1_Icontype = httpContext.cgiGet( "COMBO_LB_FAMC1_Icontype") ;
            Combo_lb_famc1_Icon = httpContext.cgiGet( "COMBO_LB_FAMC1_Icon") ;
            Combo_lb_famc1_Caption = httpContext.cgiGet( "COMBO_LB_FAMC1_Caption") ;
            Combo_lb_famc1_Tooltip = httpContext.cgiGet( "COMBO_LB_FAMC1_Tooltip") ;
            Combo_lb_famc1_Cls = httpContext.cgiGet( "COMBO_LB_FAMC1_Cls") ;
            Combo_lb_famc1_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_FAMC1_Selectedvalue_set") ;
            Combo_lb_famc1_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_FAMC1_Selectedvalue_get") ;
            Combo_lb_famc1_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_FAMC1_Selectedtext_set") ;
            Combo_lb_famc1_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_FAMC1_Selectedtext_get") ;
            Combo_lb_famc1_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_FAMC1_Gamoauthtoken") ;
            Combo_lb_famc1_Ddointernalname = httpContext.cgiGet( "COMBO_LB_FAMC1_Ddointernalname") ;
            Combo_lb_famc1_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_FAMC1_Titlecontrolalign") ;
            Combo_lb_famc1_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_FAMC1_Dropdownoptionstype") ;
            Combo_lb_famc1_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Enabled")) ;
            Combo_lb_famc1_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Visible")) ;
            Combo_lb_famc1_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_FAMC1_Titlecontrolidtoreplace") ;
            Combo_lb_famc1_Datalisttype = httpContext.cgiGet( "COMBO_LB_FAMC1_Datalisttype") ;
            Combo_lb_famc1_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Allowmultipleselection")) ;
            Combo_lb_famc1_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_FAMC1_Datalistfixedvalues") ;
            Combo_lb_famc1_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Isgriditem")) ;
            Combo_lb_famc1_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Hasdescription")) ;
            Combo_lb_famc1_Datalistproc = httpContext.cgiGet( "COMBO_LB_FAMC1_Datalistproc") ;
            Combo_lb_famc1_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_FAMC1_Datalistprocparametersprefix") ;
            Combo_lb_famc1_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_FAMC1_Remoteservicesparameters") ;
            Combo_lb_famc1_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAMC1_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_famc1_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Includeonlyselectedoption")) ;
            Combo_lb_famc1_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Includeselectalloption")) ;
            Combo_lb_famc1_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Emptyitem")) ;
            Combo_lb_famc1_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC1_Includeaddnewoption")) ;
            Combo_lb_famc1_Htmltemplate = httpContext.cgiGet( "COMBO_LB_FAMC1_Htmltemplate") ;
            Combo_lb_famc1_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_FAMC1_Multiplevaluestype") ;
            Combo_lb_famc1_Loadingdata = httpContext.cgiGet( "COMBO_LB_FAMC1_Loadingdata") ;
            Combo_lb_famc1_Noresultsfound = httpContext.cgiGet( "COMBO_LB_FAMC1_Noresultsfound") ;
            Combo_lb_famc1_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_FAMC1_Emptyitemtext") ;
            Combo_lb_famc1_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_FAMC1_Onlyselectedvalues") ;
            Combo_lb_famc1_Selectalltext = httpContext.cgiGet( "COMBO_LB_FAMC1_Selectalltext") ;
            Combo_lb_famc1_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_FAMC1_Multiplevaluesseparator") ;
            Combo_lb_famc1_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_FAMC1_Addnewoptiontext") ;
            Combo_lb_famc2_Objectcall = httpContext.cgiGet( "COMBO_LB_FAMC2_Objectcall") ;
            Combo_lb_famc2_Class = httpContext.cgiGet( "COMBO_LB_FAMC2_Class") ;
            Combo_lb_famc2_Icontype = httpContext.cgiGet( "COMBO_LB_FAMC2_Icontype") ;
            Combo_lb_famc2_Icon = httpContext.cgiGet( "COMBO_LB_FAMC2_Icon") ;
            Combo_lb_famc2_Caption = httpContext.cgiGet( "COMBO_LB_FAMC2_Caption") ;
            Combo_lb_famc2_Tooltip = httpContext.cgiGet( "COMBO_LB_FAMC2_Tooltip") ;
            Combo_lb_famc2_Cls = httpContext.cgiGet( "COMBO_LB_FAMC2_Cls") ;
            Combo_lb_famc2_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_FAMC2_Selectedvalue_set") ;
            Combo_lb_famc2_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_FAMC2_Selectedvalue_get") ;
            Combo_lb_famc2_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_FAMC2_Selectedtext_set") ;
            Combo_lb_famc2_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_FAMC2_Selectedtext_get") ;
            Combo_lb_famc2_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_FAMC2_Gamoauthtoken") ;
            Combo_lb_famc2_Ddointernalname = httpContext.cgiGet( "COMBO_LB_FAMC2_Ddointernalname") ;
            Combo_lb_famc2_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_FAMC2_Titlecontrolalign") ;
            Combo_lb_famc2_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_FAMC2_Dropdownoptionstype") ;
            Combo_lb_famc2_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Enabled")) ;
            Combo_lb_famc2_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Visible")) ;
            Combo_lb_famc2_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_FAMC2_Titlecontrolidtoreplace") ;
            Combo_lb_famc2_Datalisttype = httpContext.cgiGet( "COMBO_LB_FAMC2_Datalisttype") ;
            Combo_lb_famc2_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Allowmultipleselection")) ;
            Combo_lb_famc2_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_FAMC2_Datalistfixedvalues") ;
            Combo_lb_famc2_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Isgriditem")) ;
            Combo_lb_famc2_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Hasdescription")) ;
            Combo_lb_famc2_Datalistproc = httpContext.cgiGet( "COMBO_LB_FAMC2_Datalistproc") ;
            Combo_lb_famc2_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_FAMC2_Datalistprocparametersprefix") ;
            Combo_lb_famc2_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_FAMC2_Remoteservicesparameters") ;
            Combo_lb_famc2_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAMC2_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_famc2_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Includeonlyselectedoption")) ;
            Combo_lb_famc2_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Includeselectalloption")) ;
            Combo_lb_famc2_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Emptyitem")) ;
            Combo_lb_famc2_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC2_Includeaddnewoption")) ;
            Combo_lb_famc2_Htmltemplate = httpContext.cgiGet( "COMBO_LB_FAMC2_Htmltemplate") ;
            Combo_lb_famc2_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_FAMC2_Multiplevaluestype") ;
            Combo_lb_famc2_Loadingdata = httpContext.cgiGet( "COMBO_LB_FAMC2_Loadingdata") ;
            Combo_lb_famc2_Noresultsfound = httpContext.cgiGet( "COMBO_LB_FAMC2_Noresultsfound") ;
            Combo_lb_famc2_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_FAMC2_Emptyitemtext") ;
            Combo_lb_famc2_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_FAMC2_Onlyselectedvalues") ;
            Combo_lb_famc2_Selectalltext = httpContext.cgiGet( "COMBO_LB_FAMC2_Selectalltext") ;
            Combo_lb_famc2_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_FAMC2_Multiplevaluesseparator") ;
            Combo_lb_famc2_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_FAMC2_Addnewoptiontext") ;
            Combo_lb_famc3_Objectcall = httpContext.cgiGet( "COMBO_LB_FAMC3_Objectcall") ;
            Combo_lb_famc3_Class = httpContext.cgiGet( "COMBO_LB_FAMC3_Class") ;
            Combo_lb_famc3_Icontype = httpContext.cgiGet( "COMBO_LB_FAMC3_Icontype") ;
            Combo_lb_famc3_Icon = httpContext.cgiGet( "COMBO_LB_FAMC3_Icon") ;
            Combo_lb_famc3_Caption = httpContext.cgiGet( "COMBO_LB_FAMC3_Caption") ;
            Combo_lb_famc3_Tooltip = httpContext.cgiGet( "COMBO_LB_FAMC3_Tooltip") ;
            Combo_lb_famc3_Cls = httpContext.cgiGet( "COMBO_LB_FAMC3_Cls") ;
            Combo_lb_famc3_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_FAMC3_Selectedvalue_set") ;
            Combo_lb_famc3_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_FAMC3_Selectedvalue_get") ;
            Combo_lb_famc3_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_FAMC3_Selectedtext_set") ;
            Combo_lb_famc3_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_FAMC3_Selectedtext_get") ;
            Combo_lb_famc3_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_FAMC3_Gamoauthtoken") ;
            Combo_lb_famc3_Ddointernalname = httpContext.cgiGet( "COMBO_LB_FAMC3_Ddointernalname") ;
            Combo_lb_famc3_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_FAMC3_Titlecontrolalign") ;
            Combo_lb_famc3_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_FAMC3_Dropdownoptionstype") ;
            Combo_lb_famc3_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Enabled")) ;
            Combo_lb_famc3_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Visible")) ;
            Combo_lb_famc3_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_FAMC3_Titlecontrolidtoreplace") ;
            Combo_lb_famc3_Datalisttype = httpContext.cgiGet( "COMBO_LB_FAMC3_Datalisttype") ;
            Combo_lb_famc3_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Allowmultipleselection")) ;
            Combo_lb_famc3_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_FAMC3_Datalistfixedvalues") ;
            Combo_lb_famc3_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Isgriditem")) ;
            Combo_lb_famc3_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Hasdescription")) ;
            Combo_lb_famc3_Datalistproc = httpContext.cgiGet( "COMBO_LB_FAMC3_Datalistproc") ;
            Combo_lb_famc3_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_FAMC3_Datalistprocparametersprefix") ;
            Combo_lb_famc3_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_FAMC3_Remoteservicesparameters") ;
            Combo_lb_famc3_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAMC3_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_famc3_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Includeonlyselectedoption")) ;
            Combo_lb_famc3_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Includeselectalloption")) ;
            Combo_lb_famc3_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Emptyitem")) ;
            Combo_lb_famc3_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAMC3_Includeaddnewoption")) ;
            Combo_lb_famc3_Htmltemplate = httpContext.cgiGet( "COMBO_LB_FAMC3_Htmltemplate") ;
            Combo_lb_famc3_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_FAMC3_Multiplevaluestype") ;
            Combo_lb_famc3_Loadingdata = httpContext.cgiGet( "COMBO_LB_FAMC3_Loadingdata") ;
            Combo_lb_famc3_Noresultsfound = httpContext.cgiGet( "COMBO_LB_FAMC3_Noresultsfound") ;
            Combo_lb_famc3_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_FAMC3_Emptyitemtext") ;
            Combo_lb_famc3_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_FAMC3_Onlyselectedvalues") ;
            Combo_lb_famc3_Selectalltext = httpContext.cgiGet( "COMBO_LB_FAMC3_Selectalltext") ;
            Combo_lb_famc3_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_FAMC3_Multiplevaluesseparator") ;
            Combo_lb_famc3_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_FAMC3_Addnewoptiontext") ;
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
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Combo_forprdume_Objectcall = httpContext.cgiGet( "COMBO_FORPRDUME_Objectcall") ;
            Combo_forprdume_Class = httpContext.cgiGet( "COMBO_FORPRDUME_Class") ;
            Combo_forprdume_Icontype = httpContext.cgiGet( "COMBO_FORPRDUME_Icontype") ;
            Combo_forprdume_Icon = httpContext.cgiGet( "COMBO_FORPRDUME_Icon") ;
            Combo_forprdume_Caption = httpContext.cgiGet( "COMBO_FORPRDUME_Caption") ;
            Combo_forprdume_Tooltip = httpContext.cgiGet( "COMBO_FORPRDUME_Tooltip") ;
            Combo_forprdume_Cls = httpContext.cgiGet( "COMBO_FORPRDUME_Cls") ;
            Combo_forprdume_Selectedvalue_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_set") ;
            Combo_forprdume_Selectedvalue_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_get") ;
            Combo_forprdume_Selectedtext_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_set") ;
            Combo_forprdume_Selectedtext_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_get") ;
            Combo_forprdume_Gamoauthtoken = httpContext.cgiGet( "COMBO_FORPRDUME_Gamoauthtoken") ;
            Combo_forprdume_Ddointernalname = httpContext.cgiGet( "COMBO_FORPRDUME_Ddointernalname") ;
            Combo_forprdume_Titlecontrolalign = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolalign") ;
            Combo_forprdume_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FORPRDUME_Dropdownoptionstype") ;
            Combo_forprdume_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Enabled")) ;
            Combo_forprdume_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Visible")) ;
            Combo_forprdume_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolidtoreplace") ;
            Combo_forprdume_Datalisttype = httpContext.cgiGet( "COMBO_FORPRDUME_Datalisttype") ;
            Combo_forprdume_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Allowmultipleselection")) ;
            Combo_forprdume_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistfixedvalues") ;
            Combo_forprdume_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Isgriditem")) ;
            Combo_forprdume_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Hasdescription")) ;
            Combo_forprdume_Datalistproc = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistproc") ;
            Combo_forprdume_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistprocparametersprefix") ;
            Combo_forprdume_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FORPRDUME_Remoteservicesparameters") ;
            Combo_forprdume_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FORPRDUME_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_forprdume_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeonlyselectedoption")) ;
            Combo_forprdume_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeselectalloption")) ;
            Combo_forprdume_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitem")) ;
            Combo_forprdume_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeaddnewoption")) ;
            Combo_forprdume_Htmltemplate = httpContext.cgiGet( "COMBO_FORPRDUME_Htmltemplate") ;
            Combo_forprdume_Multiplevaluestype = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluestype") ;
            Combo_forprdume_Loadingdata = httpContext.cgiGet( "COMBO_FORPRDUME_Loadingdata") ;
            Combo_forprdume_Noresultsfound = httpContext.cgiGet( "COMBO_FORPRDUME_Noresultsfound") ;
            Combo_forprdume_Emptyitemtext = httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitemtext") ;
            Combo_forprdume_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Onlyselectedvalues") ;
            Combo_forprdume_Selectalltext = httpContext.cgiGet( "COMBO_FORPRDUME_Selectalltext") ;
            Combo_forprdume_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluesseparator") ;
            Combo_forprdume_Addnewoptiontext = httpContext.cgiGet( "COMBO_FORPRDUME_Addnewoptiontext") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5532Lb_numero = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            }
            else
            {
               A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            }
            A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            A14088Lb_Gots = httpContext.cgiGet( edtLb_Gots_Internalname) ;
            n14088Lb_Gots = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
            A6310Lb_TaAuxC = httpContext.cgiGet( edtLb_TaAuxC_Internalname) ;
            n6310Lb_TaAuxC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_famc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_famc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAMC1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_famc1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6373Lb_famc1 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6373Lb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6373Lb_famc1), 2, 0));
            }
            else
            {
               A6373Lb_famc1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_famc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6373Lb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6373Lb_famc1), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_famc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_famc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAMC2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_famc2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6374Lb_famc2 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6374Lb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6374Lb_famc2), 2, 0));
            }
            else
            {
               A6374Lb_famc2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_famc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6374Lb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6374Lb_famc2), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_famc3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_famc3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAMC3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_famc3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6375Lb_famc3 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6375Lb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6375Lb_famc3), 2, 0));
            }
            else
            {
               A6375Lb_famc3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_famc3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6375Lb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6375Lb_famc3), 2, 0));
            }
            A6376SumColor = localUtil.ctond( httpContext.cgiGet( edtSumColor_Internalname)) ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            AV22ComboLb_TaAuxC = httpContext.cgiGet( edtavCombolb_taauxc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ComboLb_TaAuxC", AV22ComboLb_TaAuxC);
            AV24ComboLb_famc1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_famc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ComboLb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboLb_famc1), 2, 0));
            AV26ComboLb_famc2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_famc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ComboLb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboLb_famc2), 2, 0));
            AV28ComboLb_famc3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_famc3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ComboLb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboLb_famc3), 2, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Colorantes_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
            forbiddenHiddens.add("Lb_CosteE", localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999"));
            forbiddenHiddens.add("Lb_UltLC", localUtil.format( DecimalUtil.doubleToDec(A5556Lb_UltLC), "ZZZ9"));
            forbiddenHiddens.add("Lb_numop", localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"));
            forbiddenHiddens.add("Lb_IntCod", localUtil.format( DecimalUtil.doubleToDec(A8622Lb_IntCod), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratorio_colorantes_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
               A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
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
                  sMode819 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode819 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound819 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SV0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LB_NUMERO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_numero_Internalname ;
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
                        e121SV2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131SV2 ();
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
         e131SV2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SV819( ) ;
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
         disableAttributes1SV819( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc1_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc2_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc3_Enabled), 5, 0), true);
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

   public void confirm_1SV0( )
   {
      beforeValidate1SV819( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SV819( ) ;
         }
         else
         {
            checkExtendedTable1SV819( ) ;
            closeExtendedTableCursors1SV819( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode819 = Gx_mode ;
         confirm_1SV820( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode819 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode819 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1SV820( )
   {
      s6376SumColor = O6376SumColor ;
      n6376SumColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      nGXsfl_99_idx = 0 ;
      while ( nGXsfl_99_idx < nRC_GXsfl_99 )
      {
         readRow1SV820( ) ;
         if ( ( nRcdExists_820 != 0 ) || ( nIsMod_820 != 0 ) )
         {
            getKey1SV820( ) ;
            if ( ( nRcdExists_820 == 0 ) && ( nRcdDeleted_820 == 0 ) )
            {
               if ( RcdFound820 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SV820( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SV820( ) ;
                     closeExtendedTableCursors1SV820( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6376SumColor = A6376SumColor ;
                     n6376SumColor = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
                  }
               }
               else
               {
                  GXCCtl = "LB_LINEAC_" + sGXsfl_99_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_LineaC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound820 != 0 )
               {
                  if ( nRcdDeleted_820 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1SV820( ) ;
                     load1SV820( ) ;
                     beforeValidate1SV820( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SV820( ) ;
                        O6376SumColor = A6376SumColor ;
                        n6376SumColor = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
                     }
                  }
                  else
                  {
                     if ( nIsMod_820 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SV820( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SV820( ) ;
                           closeExtendedTableCursors1SV820( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6376SumColor = A6376SumColor ;
                           n6376SumColor = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_820 == 0 )
                  {
                     GXCCtl = "LB_LINEAC_" + sGXsfl_99_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_LineaC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_LineaC_Internalname, GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLB_CantC_Internalname, GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCtw1_Internalname, GXutil.rtrim( A10936PrdCtw1)) ;
         httpContext.changePostValue( edtPrdCtw2_Internalname, GXutil.rtrim( A10937PrdCtw2)) ;
         httpContext.changePostValue( edtPrdCtw3_Internalname, GXutil.rtrim( A10938PrdCtw3)) ;
         httpContext.changePostValue( edtPrdCtw4_Internalname, GXutil.rtrim( A11663PrdCtw4)) ;
         httpContext.changePostValue( edtLb_fibra_Internalname, GXutil.rtrim( A14096Lb_fibra)) ;
         httpContext.changePostValue( edtLb_PTinC_Internalname, GXutil.ltrim( localUtil.ntoc( A6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdGots_Internalname, GXutil.rtrim( A11363PrdGots)) ;
         httpContext.changePostValue( edtPrdCtwSt_Internalname, A14097PrdCtwSt) ;
         httpContext.changePostValue( "ZT_"+"Z5557Lb_LineaC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14096Lb_fibra_"+sGXsfl_99_idx, GXutil.rtrim( Z14096Lb_fibra)) ;
         httpContext.changePostValue( "ZT_"+"Z5558LB_CantC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6058Lb_soluc_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z6058Lb_soluc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6544Lb_PTinC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_99_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5558LB_CantC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( O5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_820_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_820_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_820_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_820 != 0 )
         {
            httpContext.changePostValue( "LB_LINEAC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_CANTC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_99_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "PRDCTW1_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTW2_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTW3_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTW4_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FIBRA_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FIBRA_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_PTINC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDGOTS_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDGOTS_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTWST_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTWST_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6376SumColor = s6376SumColor ;
      n6376SumColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1SV0( )
   {
   }

   public void e121SV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV10EmprCod = GXv_char2[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXv_SdtWWPContext5[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV13WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_forprdume_Titlecontrolidtoreplace = edtForPrdUMe_Internalname ;
      ucCombo_forprdume.sendProperty(context, "", false, Combo_forprdume_Internalname, "TitleControlIdToReplace", Combo_forprdume_Titlecontrolidtoreplace);
      edtForPrdUMe_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_99_Refreshing);
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      edtLb_famc3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_famc3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_famc3_Visible), 5, 0), true);
      AV28ComboLb_famc3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboLb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboLb_famc3), 2, 0));
      edtavCombolb_famc3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc3_Visible), 5, 0), true);
      edtLb_famc2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_famc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_famc2_Visible), 5, 0), true);
      AV26ComboLb_famc2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboLb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboLb_famc2), 2, 0));
      edtavCombolb_famc2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc2_Visible), 5, 0), true);
      edtLb_famc1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_famc1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_famc1_Visible), 5, 0), true);
      AV24ComboLb_famc1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboLb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboLb_famc1), 2, 0));
      edtavCombolb_famc1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc1_Visible), 5, 0), true);
      edtLb_TaAuxC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Visible), 5, 0), true);
      AV22ComboLb_TaAuxC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ComboLb_TaAuxC", AV22ComboLb_TaAuxC);
      edtavCombolb_taauxc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxc_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLB_TAAUXC' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_FAMC1' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_FAMC2' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_FAMC3' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOFORPRDUME' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S172 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV14TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV36Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV37GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GXV1), 8, 0));
         while ( AV37GXV1 <= AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV17TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV37GXV1));
            if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "Lb_TaAuxC") == 0 )
            {
               AV16Insert_Lb_TaAuxC = AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Insert_Lb_TaAuxC", AV16Insert_Lb_TaAuxC);
               if ( ! (GXutil.strcmp("", AV16Insert_Lb_TaAuxC)==0) )
               {
                  AV22ComboLb_TaAuxC = AV16Insert_Lb_TaAuxC ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV22ComboLb_TaAuxC", AV22ComboLb_TaAuxC);
                  Combo_lb_taauxc_Selectedvalue_set = AV22ComboLb_TaAuxC ;
                  ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "SelectedValue_set", Combo_lb_taauxc_Selectedvalue_set);
                  Combo_lb_taauxc_Enabled = false ;
                  ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxc_Enabled));
               }
            }
            AV37GXV1 = (int)(AV37GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GXV1), 8, 0));
         }
      }
      GXt_int6 = (byte)(AV32Moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV32Moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Moda21), 4, 0));
      GXt_int6 = (byte)(AV34fibracolorante) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "FIBCOL", ""), GXv_int7) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV34fibracolorante = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34fibracolorante", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34fibracolorante), 4, 0));
   }

   public void e131SV2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV12Lb_opcion))}, new String[] {"Mode","EmprCod","Lb_numero","Lb_opcion"}) , new Object[] {});
      GXv_char4[0] = AV10EmprCod ;
      GXv_int8[0] = AV11Lb_numero ;
      GXv_char3[0] = AV12Lb_opcion ;
      GXv_decimal9[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int10[0] = (int)(DecimalUtil.decToDouble(AV29Lb_Rb)) ;
      GXv_char2[0] = " " ;
      GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
      new app.gestionlaboratorio.pens003x(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_decimal9, GXv_int10, GXv_char2, GXv_decimal11) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV10EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV11Lb_numero = GXv_int8[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV12Lb_opcion = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV29Lb_Rb = DecimalUtil.doubleToDec(GXv_int10[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Lb_numero), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Lb_numero), "ZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lb_opcion", AV12Lb_opcion);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Lb_opcion, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lb_Rb", GXutil.ltrimstr( AV29Lb_Rb, 7, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_RB", getSecureSignedToken( "", localUtil.format( AV29Lb_Rb, "ZZZ9.99")));
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV7Station ;
      GXv_decimal11[0] = AV31Coste_cor ;
      GXv_decimal9[0] = AV30Lb_costec ;
      new app.gestionlaboratorio.costecoloranteycostetotal(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal11, GXv_decimal9) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV10EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV7Station = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV31Coste_cor = GXv_decimal11[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV30Lb_costec = GXv_decimal9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXv_char4[0] = AV10EmprCod ;
      GXv_int10[0] = AV11Lb_numero ;
      GXv_char3[0] = AV12Lb_opcion ;
      GXv_decimal11[0] = AV31Coste_cor ;
      GXv_decimal9[0] = AV30Lb_costec ;
      new app.gestionlaboratorio.pens004(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_decimal11, GXv_decimal9) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV10EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV11Lb_numero = GXv_int10[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV12Lb_opcion = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV31Coste_cor = GXv_decimal11[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV30Lb_costec = GXv_decimal9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Lb_numero), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Lb_numero), "ZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lb_opcion", AV12Lb_opcion);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Lb_opcion, "@!"))));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S172( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
   }

   public void S162( )
   {
      /* 'LOADCOMBOFORPRDUME' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV20ForPrdUMe_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo(remoteHandle, context).execute( "ForPrdUMe", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV20ForPrdUMe_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
   }

   public void S152( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV18PrdNum_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV18PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
   }

   public void S142( )
   {
      /* 'LOADCOMBOLB_FAMC3' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV27Lb_famc3_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo(remoteHandle, context).execute( "Lb_famc3", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV27Lb_famc3_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_lb_famc3_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_lb_famc3.sendProperty(context, "", false, Combo_lb_famc3_Internalname, "SelectedValue_set", Combo_lb_famc3_Selectedvalue_set);
      AV28ComboLb_famc3 = (byte)(GXutil.lval( AV19ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboLb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboLb_famc3), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_famc3_Enabled = false ;
         ucCombo_lb_famc3.sendProperty(context, "", false, Combo_lb_famc3_Internalname, "Enabled", GXutil.booltostr( Combo_lb_famc3_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOLB_FAMC2' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV25Lb_famc2_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo(remoteHandle, context).execute( "Lb_famc2", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV25Lb_famc2_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_lb_famc2_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_lb_famc2.sendProperty(context, "", false, Combo_lb_famc2_Internalname, "SelectedValue_set", Combo_lb_famc2_Selectedvalue_set);
      AV26ComboLb_famc2 = (byte)(GXutil.lval( AV19ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboLb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboLb_famc2), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_famc2_Enabled = false ;
         ucCombo_lb_famc2.sendProperty(context, "", false, Combo_lb_famc2_Internalname, "Enabled", GXutil.booltostr( Combo_lb_famc2_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOLB_FAMC1' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV23Lb_famc1_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo(remoteHandle, context).execute( "Lb_famc1", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV23Lb_famc1_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_lb_famc1_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_lb_famc1.sendProperty(context, "", false, Combo_lb_famc1_Internalname, "SelectedValue_set", Combo_lb_famc1_Selectedvalue_set);
      AV24ComboLb_famc1 = (byte)(GXutil.lval( AV19ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboLb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboLb_famc1), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_famc1_Enabled = false ;
         ucCombo_lb_famc1.sendProperty(context, "", false, Combo_lb_famc1_Internalname, "Enabled", GXutil.booltostr( Combo_lb_famc1_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOLB_TAAUXC' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = AV21Lb_TaAuxC_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item13[0] = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo(remoteHandle, context).execute( "Lb_TaAuxC", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item13) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = GXv_objcol_SdtDVB_SDTComboData_Item13[0] ;
      AV21Lb_TaAuxC_Data = GXt_objcol_SdtDVB_SDTComboData_Item12 ;
      Combo_lb_taauxc_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "SelectedValue_set", Combo_lb_taauxc_Selectedvalue_set);
      AV22ComboLb_TaAuxC = AV19ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ComboLb_TaAuxC", AV22ComboLb_TaAuxC);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_taauxc_Enabled = false ;
         ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxc_Enabled));
      }
   }

   public void zm1SV819( int GX_JID )
   {
      if ( ( GX_JID == 35 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6373Lb_famc1 = T01SV7_A6373Lb_famc1[0] ;
            Z6374Lb_famc2 = T01SV7_A6374Lb_famc2[0] ;
            Z6375Lb_famc3 = T01SV7_A6375Lb_famc3[0] ;
            Z5565Lb_CosteE = T01SV7_A5565Lb_CosteE[0] ;
            Z5556Lb_UltLC = T01SV7_A5556Lb_UltLC[0] ;
            Z5718Lb_numop = T01SV7_A5718Lb_numop[0] ;
            Z8622Lb_IntCod = T01SV7_A8622Lb_IntCod[0] ;
            Z6310Lb_TaAuxC = T01SV7_A6310Lb_TaAuxC[0] ;
         }
         else
         {
            Z6373Lb_famc1 = A6373Lb_famc1 ;
            Z6374Lb_famc2 = A6374Lb_famc2 ;
            Z6375Lb_famc3 = A6375Lb_famc3 ;
            Z5565Lb_CosteE = A5565Lb_CosteE ;
            Z5556Lb_UltLC = A5556Lb_UltLC ;
            Z5718Lb_numop = A5718Lb_numop ;
            Z8622Lb_IntCod = A8622Lb_IntCod ;
            Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         }
      }
      if ( GX_JID == -35 )
      {
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z6373Lb_famc1 = A6373Lb_famc1 ;
         Z6374Lb_famc2 = A6374Lb_famc2 ;
         Z6375Lb_famc3 = A6375Lb_famc3 ;
         Z5565Lb_CosteE = A5565Lb_CosteE ;
         Z5556Lb_UltLC = A5556Lb_UltLC ;
         Z5718Lb_numop = A5718Lb_numop ;
         Z8622Lb_IntCod = A8622Lb_IntCod ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z407EmprNom = A407EmprNom ;
         Z7261Lb_HorMax = A7261Lb_HorMax ;
         Z14088Lb_Gots = A14088Lb_Gots ;
         Z6376SumColor = A6376SumColor ;
         Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
      }
   }

   public void standaloneNotModal( )
   {
      edtLb_Gots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Gots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Gots_Enabled), 5, 0), true);
      AV36Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Colorantes_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtLb_Gots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Gots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Gots_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SV8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SV8_A407EmprNom[0] ;
      n407EmprNom = T01SV8_n407EmprNom[0] ;
      pr_default.close(6);
      /* Using cursor T01SV12 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A7261Lb_HorMax = T01SV12_A7261Lb_HorMax[0] ;
         n7261Lb_HorMax = T01SV12_n7261Lb_HorMax[0] ;
      }
      else
      {
         A7261Lb_HorMax = (byte)(0) ;
         n7261Lb_HorMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7261Lb_HorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7261Lb_HorMax), 2, 0));
      }
      pr_default.close(9);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( httpContext.getMessage( "SIALSU", ""), ""), GXv_int7) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divDvpanel_unnamedtable3_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( httpContext.getMessage( "SIALSU", ""), ""), GXv_int7) ;
         entradaensayolaboratorio_colorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divDvpanel_unnamedtable3_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
         }
      }
      if ( ! (0==AV11Lb_numero) )
      {
         A5532Lb_numero = AV11Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      }
      if ( ! (0==AV11Lb_numero) )
      {
         edtLb_numero_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_numero_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11Lb_numero) )
      {
         edtLb_numero_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12Lb_opcion)==0) )
      {
         A5555Lb_opcion = AV12Lb_opcion ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
      if ( ! (GXutil.strcmp("", AV12Lb_opcion)==0) )
      {
         edtLb_opcion_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_opcion_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV12Lb_opcion)==0) )
      {
         edtLb_opcion_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_Lb_TaAuxC)==0) )
      {
         edtLb_TaAuxC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_TaAuxC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      edtPrdGots_Visible = AV32Moda21 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtwSt_Visible = ((AV32Moda21==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), !bGXsfl_99_Refreshing);
      edtLb_fibra_Visible = ((AV34fibracolorante==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fibra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fibra_Visible), 5, 0), !bGXsfl_99_Refreshing);
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_Lb_TaAuxC)==0) )
      {
         A6310Lb_TaAuxC = AV16Insert_Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      else
      {
         if ( (GXutil.strcmp("", AV22ComboLb_TaAuxC)==0) )
         {
            A6310Lb_TaAuxC = "" ;
            n6310Lb_TaAuxC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            n6310Lb_TaAuxC = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV22ComboLb_TaAuxC)==0) )
            {
               A6310Lb_TaAuxC = AV22ComboLb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            }
         }
      }
      A6373Lb_famc1 = AV24ComboLb_famc1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6373Lb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6373Lb_famc1), 2, 0));
      A6374Lb_famc2 = AV26ComboLb_famc2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6374Lb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6374Lb_famc2), 2, 0));
      A6375Lb_famc3 = AV28ComboLb_famc3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6375Lb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6375Lb_famc3), 2, 0));
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
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5565Lb_CosteE)==0) && ( Gx_BScreen == 0 ) )
      {
         A5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01SV9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         A14088Lb_Gots = T01SV9_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01SV9_n14088Lb_Gots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
         pr_default.close(7);
         /* Using cursor T01SV14 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(10) != 101) )
         {
            A6376SumColor = T01SV14_A6376SumColor[0] ;
            n6376SumColor = T01SV14_n6376SumColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         else
         {
            A6376SumColor = DecimalUtil.doubleToDec(0) ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         O6376SumColor = A6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         pr_default.close(10);
         /* Using cursor T01SV10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T01SV10_A6311Lb_TaAuxD[0] ;
         pr_default.close(8);
      }
   }

   public void load1SV819( )
   {
      /* Using cursor T01SV17 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A6373Lb_famc1 = T01SV17_A6373Lb_famc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6373Lb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6373Lb_famc1), 2, 0));
         A6374Lb_famc2 = T01SV17_A6374Lb_famc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6374Lb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6374Lb_famc2), 2, 0));
         A6375Lb_famc3 = T01SV17_A6375Lb_famc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6375Lb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6375Lb_famc3), 2, 0));
         A407EmprNom = T01SV17_A407EmprNom[0] ;
         n407EmprNom = T01SV17_n407EmprNom[0] ;
         A14088Lb_Gots = T01SV17_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01SV17_n14088Lb_Gots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
         A5565Lb_CosteE = T01SV17_A5565Lb_CosteE[0] ;
         A5556Lb_UltLC = T01SV17_A5556Lb_UltLC[0] ;
         A5718Lb_numop = T01SV17_A5718Lb_numop[0] ;
         A6311Lb_TaAuxD = T01SV17_A6311Lb_TaAuxD[0] ;
         A8622Lb_IntCod = T01SV17_A8622Lb_IntCod[0] ;
         A6310Lb_TaAuxC = T01SV17_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T01SV17_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6376SumColor = T01SV17_A6376SumColor[0] ;
         n6376SumColor = T01SV17_n6376SumColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         A7261Lb_HorMax = T01SV17_A7261Lb_HorMax[0] ;
         n7261Lb_HorMax = T01SV17_n7261Lb_HorMax[0] ;
         zm1SV819( -35) ;
      }
      pr_default.close(11);
      onLoadActions1SV819( ) ;
   }

   public void onLoadActions1SV819( )
   {
      O6376SumColor = A6376SumColor ;
      n6376SumColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
   }

   public void checkExtendedTable1SV819( )
   {
      nIsDirty_819 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01SV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14088Lb_Gots = T01SV9_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01SV9_n14088Lb_Gots[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
      pr_default.close(7);
      /* Using cursor T01SV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TaAuxC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6311Lb_TaAuxD = T01SV10_A6311Lb_TaAuxD[0] ;
      pr_default.close(8);
      /* Using cursor T01SV14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A6376SumColor = T01SV14_A6376SumColor[0] ;
         n6376SumColor = T01SV14_n6376SumColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      else
      {
         nIsDirty_819 = (short)(1) ;
         A6376SumColor = DecimalUtil.doubleToDec(0) ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      pr_default.close(10);
   }

   public void closeExtendedTableCursors1SV819( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_37( String A396EmprCod ,
                          int A5532Lb_numero )
   {
      /* Using cursor T01SV18 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14088Lb_Gots = T01SV18_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01SV18_n14088Lb_Gots[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14088Lb_Gots))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_38( String A396EmprCod ,
                          String A6310Lb_TaAuxC )
   {
      /* Using cursor T01SV19 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TaAuxC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6311Lb_TaAuxD = T01SV19_A6311Lb_TaAuxD[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6311Lb_TaAuxD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_40( String A396EmprCod ,
                          int A5532Lb_numero ,
                          String A5555Lb_opcion )
   {
      /* Using cursor T01SV21 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A6376SumColor = T01SV21_A6376SumColor[0] ;
         n6376SumColor = T01SV21_n6376SumColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      else
      {
         A6376SumColor = DecimalUtil.doubleToDec(0) ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6376SumColor, (byte)(11), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1SV819( )
   {
      /* Using cursor T01SV22 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound819 = (short)(1) ;
      }
      else
      {
         RcdFound819 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1SV819( 35) ;
         RcdFound819 = (short)(1) ;
         A5555Lb_opcion = T01SV7_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A6373Lb_famc1 = T01SV7_A6373Lb_famc1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6373Lb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6373Lb_famc1), 2, 0));
         A6374Lb_famc2 = T01SV7_A6374Lb_famc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6374Lb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6374Lb_famc2), 2, 0));
         A6375Lb_famc3 = T01SV7_A6375Lb_famc3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6375Lb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6375Lb_famc3), 2, 0));
         A5565Lb_CosteE = T01SV7_A5565Lb_CosteE[0] ;
         A5556Lb_UltLC = T01SV7_A5556Lb_UltLC[0] ;
         A5718Lb_numop = T01SV7_A5718Lb_numop[0] ;
         A8622Lb_IntCod = T01SV7_A8622Lb_IntCod[0] ;
         A396EmprCod = T01SV7_A396EmprCod[0] ;
         A5532Lb_numero = T01SV7_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A6310Lb_TaAuxC = T01SV7_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T01SV7_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         sMode819 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SV819( ) ;
         if ( AnyError == 1 )
         {
            RcdFound819 = (short)(0) ;
            initializeNonKey1SV819( ) ;
         }
         Gx_mode = sMode819 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound819 = (short)(0) ;
         initializeNonKey1SV819( ) ;
         sMode819 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode819 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1SV819( ) ;
      if ( RcdFound819 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound819 = (short)(0) ;
      /* Using cursor T01SV23 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A396EmprCod, A5555Lb_opcion});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01SV23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SV23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SV23_A5532Lb_numero[0] < A5532Lb_numero ) || ( T01SV23_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SV23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SV23_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01SV23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SV23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SV23_A5532Lb_numero[0] > A5532Lb_numero ) || ( T01SV23_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SV23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SV23_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) ) )
         {
            A396EmprCod = T01SV23_A396EmprCod[0] ;
            A5532Lb_numero = T01SV23_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T01SV23_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            RcdFound819 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound819 = (short)(0) ;
      /* Using cursor T01SV24 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A396EmprCod, A5555Lb_opcion});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01SV24_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SV24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SV24_A5532Lb_numero[0] > A5532Lb_numero ) || ( T01SV24_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SV24_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SV24_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01SV24_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SV24_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SV24_A5532Lb_numero[0] < A5532Lb_numero ) || ( T01SV24_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SV24_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SV24_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) ) )
         {
            A396EmprCod = T01SV24_A396EmprCod[0] ;
            A5532Lb_numero = T01SV24_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T01SV24_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            RcdFound819 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SV819( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6376SumColor = O6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SV819( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound819 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5532Lb_numero = Z5532Lb_numero ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
               A5555Lb_opcion = Z5555Lb_opcion ;
               httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LB_NUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6376SumColor = O6376SumColor ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A6376SumColor = O6376SumColor ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
               update1SV819( ) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
            {
               /* Insert record */
               A6376SumColor = O6376SumColor ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SV819( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LB_NUMERO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_numero_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A6376SumColor = O6376SumColor ;
                  n6376SumColor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
                  GX_FocusControl = edtLb_numero_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SV819( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = Z5532Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = Z5555Lb_opcion ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6376SumColor = O6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SV819( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SV6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( Z6373Lb_famc1 != T01SV6_A6373Lb_famc1[0] ) || ( Z6374Lb_famc2 != T01SV6_A6374Lb_famc2[0] ) || ( Z6375Lb_famc3 != T01SV6_A6375Lb_famc3[0] ) || ( DecimalUtil.compareTo(Z5565Lb_CosteE, T01SV6_A5565Lb_CosteE[0]) != 0 ) || ( Z5556Lb_UltLC != T01SV6_A5556Lb_UltLC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5718Lb_numop != T01SV6_A5718Lb_numop[0] ) || ( Z8622Lb_IntCod != T01SV6_A8622Lb_IntCod[0] ) || ( GXutil.strcmp(Z6310Lb_TaAuxC, T01SV6_A6310Lb_TaAuxC[0]) != 0 ) )
         {
            if ( Z6373Lb_famc1 != T01SV6_A6373Lb_famc1[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_famc1");
               GXutil.writeLogRaw("Old: ",Z6373Lb_famc1);
               GXutil.writeLogRaw("Current: ",T01SV6_A6373Lb_famc1[0]);
            }
            if ( Z6374Lb_famc2 != T01SV6_A6374Lb_famc2[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_famc2");
               GXutil.writeLogRaw("Old: ",Z6374Lb_famc2);
               GXutil.writeLogRaw("Current: ",T01SV6_A6374Lb_famc2[0]);
            }
            if ( Z6375Lb_famc3 != T01SV6_A6375Lb_famc3[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_famc3");
               GXutil.writeLogRaw("Old: ",Z6375Lb_famc3);
               GXutil.writeLogRaw("Current: ",T01SV6_A6375Lb_famc3[0]);
            }
            if ( DecimalUtil.compareTo(Z5565Lb_CosteE, T01SV6_A5565Lb_CosteE[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_CosteE");
               GXutil.writeLogRaw("Old: ",Z5565Lb_CosteE);
               GXutil.writeLogRaw("Current: ",T01SV6_A5565Lb_CosteE[0]);
            }
            if ( Z5556Lb_UltLC != T01SV6_A5556Lb_UltLC[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_UltLC");
               GXutil.writeLogRaw("Old: ",Z5556Lb_UltLC);
               GXutil.writeLogRaw("Current: ",T01SV6_A5556Lb_UltLC[0]);
            }
            if ( Z5718Lb_numop != T01SV6_A5718Lb_numop[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_numop");
               GXutil.writeLogRaw("Old: ",Z5718Lb_numop);
               GXutil.writeLogRaw("Current: ",T01SV6_A5718Lb_numop[0]);
            }
            if ( Z8622Lb_IntCod != T01SV6_A8622Lb_IntCod[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_IntCod");
               GXutil.writeLogRaw("Old: ",Z8622Lb_IntCod);
               GXutil.writeLogRaw("Current: ",T01SV6_A8622Lb_IntCod[0]);
            }
            if ( GXutil.strcmp(Z6310Lb_TaAuxC, T01SV6_A6310Lb_TaAuxC[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_TaAuxC");
               GXutil.writeLogRaw("Old: ",Z6310Lb_TaAuxC);
               GXutil.writeLogRaw("Current: ",T01SV6_A6310Lb_TaAuxC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SV819( )
   {
      beforeValidate1SV819( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SV819( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SV819( 0) ;
         checkOptimisticConcurrency1SV819( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SV819( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SV819( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SV25 */
                  pr_default.execute(18, new Object[] {A5555Lb_opcion, Byte.valueOf(A6373Lb_famc1), Byte.valueOf(A6374Lb_famc2), Byte.valueOf(A6375Lb_famc3), A5565Lb_CosteE, Short.valueOf(A5556Lb_UltLC), Byte.valueOf(A5718Lb_numop), Byte.valueOf(A8622Lb_IntCod), A396EmprCod, Integer.valueOf(A5532Lb_numero), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevel1SV819( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SV0( ) ;
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
            load1SV819( ) ;
         }
         endLevel1SV819( ) ;
      }
      closeExtendedTableCursors1SV819( ) ;
   }

   public void update1SV819( )
   {
      beforeValidate1SV819( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SV819( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SV819( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SV819( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SV819( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SV26 */
                  pr_default.execute(19, new Object[] {Byte.valueOf(A6373Lb_famc1), Byte.valueOf(A6374Lb_famc2), Byte.valueOf(A6375Lb_famc3), A5565Lb_CosteE, Short.valueOf(A5556Lb_UltLC), Byte.valueOf(A5718Lb_numop), Byte.valueOf(A8622Lb_IntCod), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS002"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SV819( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SV819( ) ;
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
         endLevel1SV819( ) ;
      }
      closeExtendedTableCursors1SV819( ) ;
   }

   public void deferredUpdate1SV819( )
   {
   }

   public void delete( )
   {
      beforeValidate1SV819( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SV819( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SV819( ) ;
         afterConfirm1SV819( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SV819( ) ;
            if ( AnyError == 0 )
            {
               A6376SumColor = O6376SumColor ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
               scanStart1SV820( ) ;
               while ( RcdFound820 != 0 )
               {
                  getByPrimaryKey1SV820( ) ;
                  delete1SV820( ) ;
                  scanNext1SV820( ) ;
                  O6376SumColor = A6376SumColor ;
                  n6376SumColor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
               }
               scanEnd1SV820( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SV27 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
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
      sMode819 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SV819( ) ;
      Gx_mode = sMode819 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SV819( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SV28 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         A14088Lb_Gots = T01SV28_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01SV28_n14088Lb_Gots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
         pr_default.close(21);
         /* Using cursor T01SV29 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T01SV29_A6311Lb_TaAuxD[0] ;
         pr_default.close(22);
         /* Using cursor T01SV31 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A6376SumColor = T01SV31_A6376SumColor[0] ;
            n6376SumColor = T01SV31_n6376SumColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         else
         {
            A6376SumColor = DecimalUtil.doubleToDec(0) ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         pr_default.close(23);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SV32 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01SV33 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel1SV820( )
   {
      s6376SumColor = O6376SumColor ;
      n6376SumColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      nGXsfl_99_idx = 0 ;
      while ( nGXsfl_99_idx < nRC_GXsfl_99 )
      {
         readRow1SV820( ) ;
         if ( ( nRcdExists_820 != 0 ) || ( nIsMod_820 != 0 ) )
         {
            standaloneNotModal1SV820( ) ;
            getKey1SV820( ) ;
            if ( ( nRcdExists_820 == 0 ) && ( nRcdDeleted_820 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SV820( ) ;
            }
            else
            {
               if ( RcdFound820 != 0 )
               {
                  if ( ( nRcdDeleted_820 != 0 ) && ( nRcdExists_820 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SV820( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_820 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SV820( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_820 == 0 )
                  {
                     GXCCtl = "LB_LINEAC_" + sGXsfl_99_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_LineaC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6376SumColor = A6376SumColor ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         httpContext.changePostValue( edtLb_LineaC_Internalname, GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLB_CantC_Internalname, GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCtw1_Internalname, GXutil.rtrim( A10936PrdCtw1)) ;
         httpContext.changePostValue( edtPrdCtw2_Internalname, GXutil.rtrim( A10937PrdCtw2)) ;
         httpContext.changePostValue( edtPrdCtw3_Internalname, GXutil.rtrim( A10938PrdCtw3)) ;
         httpContext.changePostValue( edtPrdCtw4_Internalname, GXutil.rtrim( A11663PrdCtw4)) ;
         httpContext.changePostValue( edtLb_fibra_Internalname, GXutil.rtrim( A14096Lb_fibra)) ;
         httpContext.changePostValue( edtLb_PTinC_Internalname, GXutil.ltrim( localUtil.ntoc( A6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdGots_Internalname, GXutil.rtrim( A11363PrdGots)) ;
         httpContext.changePostValue( edtPrdCtwSt_Internalname, A14097PrdCtwSt) ;
         httpContext.changePostValue( "ZT_"+"Z5557Lb_LineaC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14096Lb_fibra_"+sGXsfl_99_idx, GXutil.rtrim( Z14096Lb_fibra)) ;
         httpContext.changePostValue( "ZT_"+"Z5558LB_CantC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6058Lb_soluc_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z6058Lb_soluc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6544Lb_PTinC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_99_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5558LB_CantC_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( O5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_820_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_820_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_820_"+sGXsfl_99_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_820 != 0 )
         {
            httpContext.changePostValue( "LB_LINEAC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_CANTC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_99_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "PRDCTW1_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTW2_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTW3_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTW4_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FIBRA_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FIBRA_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_PTINC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDGOTS_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDGOTS_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTWST_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTWST_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1SV820( ) ;
      if ( AnyError != 0 )
      {
         O6376SumColor = s6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      nRcdExists_820 = (short)(0) ;
      nIsMod_820 = (short)(0) ;
      nRcdDeleted_820 = (short)(0) ;
   }

   public void processLevel1SV819( )
   {
      /* Save parent mode. */
      sMode819 = Gx_mode ;
      processNestedLevel1SV820( ) ;
      if ( AnyError != 0 )
      {
         O6376SumColor = s6376SumColor ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      /* Restore parent mode. */
      Gx_mode = sMode819 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1SV819( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SV819( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.entradaensayolaboratorio_colorantes_trn");
         if ( AnyError == 0 )
         {
            confirmValues1SV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.entradaensayolaboratorio_colorantes_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SV819( )
   {
      /* Scan By routine */
      /* Using cursor T01SV34 */
      pr_default.execute(26);
      RcdFound819 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A396EmprCod = T01SV34_A396EmprCod[0] ;
         A5532Lb_numero = T01SV34_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01SV34_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SV819( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound819 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A396EmprCod = T01SV34_A396EmprCod[0] ;
         A5532Lb_numero = T01SV34_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01SV34_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
   }

   public void scanEnd1SV819( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1SV819( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SV819( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SV819( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SV819( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SV819( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SV819( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SV819( )
   {
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      edtLb_Gots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_Gots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_Gots_Enabled), 5, 0), true);
      edtLb_TaAuxC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      edtLb_famc1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_famc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_famc1_Enabled), 5, 0), true);
      edtLb_famc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_famc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_famc2_Enabled), 5, 0), true);
      edtLb_famc3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_famc3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_famc3_Enabled), 5, 0), true);
      edtSumColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumColor_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombolb_taauxc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxc_Enabled), 5, 0), true);
      edtavCombolb_famc1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc1_Enabled), 5, 0), true);
      edtavCombolb_famc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc2_Enabled), 5, 0), true);
      edtavCombolb_famc3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_famc3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_famc3_Enabled), 5, 0), true);
   }

   public void zm1SV820( int GX_JID )
   {
      if ( ( GX_JID == 41 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14096Lb_fibra = T01SV3_A14096Lb_fibra[0] ;
            Z5558LB_CantC = T01SV3_A5558LB_CantC[0] ;
            Z6058Lb_soluc = T01SV3_A6058Lb_soluc[0] ;
            Z6544Lb_PTinC = T01SV3_A6544Lb_PTinC[0] ;
            Z719PrdNum = T01SV3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01SV3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z14096Lb_fibra = A14096Lb_fibra ;
            Z5558LB_CantC = A5558LB_CantC ;
            Z6058Lb_soluc = A6058Lb_soluc ;
            Z6544Lb_PTinC = A6544Lb_PTinC ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -41 )
      {
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5557Lb_LineaC = A5557Lb_LineaC ;
         Z14096Lb_fibra = A14096Lb_fibra ;
         Z5558LB_CantC = A5558LB_CantC ;
         Z6058Lb_soluc = A6058Lb_soluc ;
         Z6544Lb_PTinC = A6544Lb_PTinC ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z11663PrdCtw4 = A11663PrdCtw4 ;
         Z10938PrdCtw3 = A10938PrdCtw3 ;
         Z10937PrdCtw2 = A10937PrdCtw2 ;
         Z10936PrdCtw1 = A10936PrdCtw1 ;
         Z11363PrdGots = A11363PrdGots ;
         Z14094PrdFibra = A14094PrdFibra ;
         Z856ValCod = A856ValCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1SV820( )
   {
      edtPrdCtw1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Enabled), 5, 0), !bGXsfl_99_Refreshing);
   }

   public void standaloneModal1SV820( )
   {
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         A490ForPrdUMe = (byte)(3) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_LineaC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      }
      else
      {
         edtLb_LineaC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01SV5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01SV5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SV5_n488ForPrdDsc[0] ;
         pr_default.close(3);
      }
   }

   public void load1SV820( )
   {
      /* Using cursor T01SV35 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound820 = (short)(1) ;
         A14096Lb_fibra = T01SV35_A14096Lb_fibra[0] ;
         A718PrdNom = T01SV35_A718PrdNom[0] ;
         A488ForPrdDsc = T01SV35_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SV35_n488ForPrdDsc[0] ;
         A5558LB_CantC = T01SV35_A5558LB_CantC[0] ;
         A6058Lb_soluc = T01SV35_A6058Lb_soluc[0] ;
         A6544Lb_PTinC = T01SV35_A6544Lb_PTinC[0] ;
         A7260PrdHorMad = T01SV35_A7260PrdHorMad[0] ;
         A724PrdPreAct = T01SV35_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01SV35_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = T01SV35_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = T01SV35_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = T01SV35_A10936PrdCtw1[0] ;
         A11363PrdGots = T01SV35_A11363PrdGots[0] ;
         A14094PrdFibra = T01SV35_A14094PrdFibra[0] ;
         n14094PrdFibra = T01SV35_n14094PrdFibra[0] ;
         A719PrdNum = T01SV35_A719PrdNum[0] ;
         A490ForPrdUMe = T01SV35_A490ForPrdUMe[0] ;
         A856ValCod = T01SV35_A856ValCod[0] ;
         zm1SV820( -41) ;
      }
      pr_default.close(27);
      onLoadActions1SV820( ) ;
   }

   public void onLoadActions1SV820( )
   {
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14097PrdCtwSt = GXt_char1 ;
      if ( isIns( )  && (GXutil.strcmp("", A14096Lb_fibra)==0) && ( Gx_BScreen == 0 ) )
      {
         A14096Lb_fibra = A14094PrdFibra ;
      }
      if ( isIns( )  )
      {
         A6376SumColor = O6376SumColor.add(A5558LB_CantC) ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6376SumColor = O6376SumColor.add(A5558LB_CantC).subtract(O5558LB_CantC) ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6376SumColor = O6376SumColor.subtract(O5558LB_CantC) ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
            }
         }
      }
   }

   public void checkExtendedTable1SV820( )
   {
      nIsDirty_820 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1SV820( ) ;
      /* Using cursor T01SV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SV4_A718PrdNom[0] ;
      A7260PrdHorMad = T01SV4_A7260PrdHorMad[0] ;
      A724PrdPreAct = T01SV4_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01SV4_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01SV4_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01SV4_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01SV4_A10936PrdCtw1[0] ;
      A11363PrdGots = T01SV4_A11363PrdGots[0] ;
      A14094PrdFibra = T01SV4_A14094PrdFibra[0] ;
      n14094PrdFibra = T01SV4_n14094PrdFibra[0] ;
      A856ValCod = T01SV4_A856ValCod[0] ;
      pr_default.close(2);
      /* Using cursor T01SV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01SV5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SV5_n488ForPrdDsc[0] ;
      pr_default.close(3);
      nIsDirty_820 = (short)(1) ;
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14097PrdCtwSt = GXt_char1 ;
      if ( isIns( )  && (GXutil.strcmp("", A14096Lb_fibra)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_820 = (short)(1) ;
         A14096Lb_fibra = A14094PrdFibra ;
      }
      if ( (0==A5557Lb_LineaC) && true /* After */ )
      {
         GXv_int14[0] = A5557Lb_LineaC ;
         new app.getlblineacc(remoteHandle, context).execute( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, GXv_int14) ;
         entradaensayolaboratorio_colorantes_trn_impl.this.A5557Lb_LineaC = GXv_int14[0] ;
      }
      if ( ( AV32Moda21 == 1 ) && ( GXutil.strcmp(A11363PrdGots, "N") == 0 ) && ( GXutil.strcmp(A14088Lb_Gots, "S") == 0 ) && true /* After */ )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção O produto / corante não é GOTS", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_820 = (short)(1) ;
         A6376SumColor = O6376SumColor.add(A5558LB_CantC) ;
         n6376SumColor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_820 = (short)(1) ;
            A6376SumColor = O6376SumColor.add(A5558LB_CantC).subtract(O5558LB_CantC) ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_820 = (short)(1) ;
               A6376SumColor = O6376SumColor.subtract(O5558LB_CantC) ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors1SV820( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1SV820( )
   {
   }

   public void gxload_42( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SV36 */
      pr_default.execute(28, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SV36_A718PrdNom[0] ;
      A7260PrdHorMad = T01SV36_A7260PrdHorMad[0] ;
      A724PrdPreAct = T01SV36_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01SV36_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01SV36_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01SV36_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01SV36_A10936PrdCtw1[0] ;
      A11363PrdGots = T01SV36_A11363PrdGots[0] ;
      A14094PrdFibra = T01SV36_A14094PrdFibra[0] ;
      n14094PrdFibra = T01SV36_n14094PrdFibra[0] ;
      A856ValCod = T01SV36_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11663PrdCtw4))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10938PrdCtw3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10937PrdCtw2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10936PrdCtw1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11363PrdGots))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14094PrdFibra))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void gxload_43( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01SV37 */
      pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01SV37_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SV37_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void getKey1SV820( )
   {
      /* Using cursor T01SV38 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound820 = (short)(1) ;
      }
      else
      {
         RcdFound820 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey1SV820( )
   {
      /* Using cursor T01SV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SV820( 41) ;
         RcdFound820 = (short)(1) ;
         initializeNonKey1SV820( ) ;
         A5557Lb_LineaC = T01SV3_A5557Lb_LineaC[0] ;
         A14096Lb_fibra = T01SV3_A14096Lb_fibra[0] ;
         A5558LB_CantC = T01SV3_A5558LB_CantC[0] ;
         A6058Lb_soluc = T01SV3_A6058Lb_soluc[0] ;
         A6544Lb_PTinC = T01SV3_A6544Lb_PTinC[0] ;
         A719PrdNum = T01SV3_A719PrdNum[0] ;
         A490ForPrdUMe = T01SV3_A490ForPrdUMe[0] ;
         O5558LB_CantC = A5558LB_CantC ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5557Lb_LineaC = A5557Lb_LineaC ;
         sMode820 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SV820( ) ;
         Gx_mode = sMode820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound820 = (short)(0) ;
         initializeNonKey1SV820( ) ;
         sMode820 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SV820( ) ;
         Gx_mode = sMode820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SV820( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SV820( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS003"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14096Lb_fibra, T01SV2_A14096Lb_fibra[0]) != 0 ) || ( DecimalUtil.compareTo(Z5558LB_CantC, T01SV2_A5558LB_CantC[0]) != 0 ) || ( Z6058Lb_soluc != T01SV2_A6058Lb_soluc[0] ) || ( Z6544Lb_PTinC != T01SV2_A6544Lb_PTinC[0] ) || ( GXutil.strcmp(Z719PrdNum, T01SV2_A719PrdNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01SV2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z14096Lb_fibra, T01SV2_A14096Lb_fibra[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_fibra");
               GXutil.writeLogRaw("Old: ",Z14096Lb_fibra);
               GXutil.writeLogRaw("Current: ",T01SV2_A14096Lb_fibra[0]);
            }
            if ( DecimalUtil.compareTo(Z5558LB_CantC, T01SV2_A5558LB_CantC[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"LB_CantC");
               GXutil.writeLogRaw("Old: ",Z5558LB_CantC);
               GXutil.writeLogRaw("Current: ",T01SV2_A5558LB_CantC[0]);
            }
            if ( Z6058Lb_soluc != T01SV2_A6058Lb_soluc[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_soluc");
               GXutil.writeLogRaw("Old: ",Z6058Lb_soluc);
               GXutil.writeLogRaw("Current: ",T01SV2_A6058Lb_soluc[0]);
            }
            if ( Z6544Lb_PTinC != T01SV2_A6544Lb_PTinC[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"Lb_PTinC");
               GXutil.writeLogRaw("Old: ",Z6544Lb_PTinC);
               GXutil.writeLogRaw("Current: ",T01SV2_A6544Lb_PTinC[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01SV2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01SV2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01SV2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_colorantes_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01SV2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS003"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SV820( )
   {
      beforeValidate1SV820( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SV820( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SV820( 0) ;
         checkOptimisticConcurrency1SV820( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SV820( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SV820( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SV39 */
                  pr_default.execute(31, new Object[] {Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC), A14096Lb_fibra, A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
                  if ( (pr_default.getStatus(31) == 1) )
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
            load1SV820( ) ;
         }
         endLevel1SV820( ) ;
      }
      closeExtendedTableCursors1SV820( ) ;
   }

   public void update1SV820( )
   {
      beforeValidate1SV820( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SV820( ) ;
      }
      if ( ( nIsMod_820 != 0 ) || ( nIsDirty_820 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SV820( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SV820( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SV820( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SV40 */
                     pr_default.execute(32, new Object[] {A14096Lb_fibra, A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS003"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SV820( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1SV820( ) ;
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
            endLevel1SV820( ) ;
         }
      }
      closeExtendedTableCursors1SV820( ) ;
   }

   public void deferredUpdate1SV820( )
   {
   }

   public void delete1SV820( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SV820( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SV820( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SV820( ) ;
         afterConfirm1SV820( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SV820( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SV41 */
               pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
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
      sMode820 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SV820( ) ;
      Gx_mode = sMode820 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SV820( )
   {
      standaloneModal1SV820( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SV42 */
         pr_default.execute(34, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01SV42_A718PrdNom[0] ;
         A7260PrdHorMad = T01SV42_A7260PrdHorMad[0] ;
         A724PrdPreAct = T01SV42_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01SV42_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = T01SV42_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = T01SV42_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = T01SV42_A10936PrdCtw1[0] ;
         A11363PrdGots = T01SV42_A11363PrdGots[0] ;
         A14094PrdFibra = T01SV42_A14094PrdFibra[0] ;
         n14094PrdFibra = T01SV42_n14094PrdFibra[0] ;
         A856ValCod = T01SV42_A856ValCod[0] ;
         pr_default.close(34);
         GXt_char1 = A14097PrdCtwSt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         entradaensayolaboratorio_colorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaensayolaboratorio_colorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaensayolaboratorio_colorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14097PrdCtwSt = GXt_char1 ;
         /* Using cursor T01SV43 */
         pr_default.execute(35, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01SV43_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SV43_n488ForPrdDsc[0] ;
         pr_default.close(35);
         if ( isIns( )  )
         {
            A6376SumColor = O6376SumColor.add(A5558LB_CantC) ;
            n6376SumColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6376SumColor = O6376SumColor.add(A5558LB_CantC).subtract(O5558LB_CantC) ;
               n6376SumColor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6376SumColor = O6376SumColor.subtract(O5558LB_CantC) ;
                  n6376SumColor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
               }
            }
         }
      }
   }

   public void endLevel1SV820( )
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

   public void scanStart1SV820( )
   {
      /* Scan By routine */
      /* Using cursor T01SV44 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      RcdFound820 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound820 = (short)(1) ;
         A5557Lb_LineaC = T01SV44_A5557Lb_LineaC[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SV820( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound820 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound820 = (short)(1) ;
         A5557Lb_LineaC = T01SV44_A5557Lb_LineaC[0] ;
      }
   }

   public void scanEnd1SV820( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1SV820( )
   {
      /* After Confirm Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A5558LB_CantC)==0) && true /* After */ && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         GXCCtl = "LB_CANTC_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Existem linhas com quantidade zero. Deseja continuar?", ""), 0, GXCCtl);
      }
   }

   public void beforeInsert1SV820( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SV820( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SV820( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SV820( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SV820( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SV820( )
   {
      edtLb_LineaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtLB_CantC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLB_CantC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLB_CantC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtLb_fibra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fibra_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtLb_PTinC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PTinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PTinC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdGots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtwSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), !bGXsfl_99_Refreshing);
   }

   public void send_integrity_lvl_hashes1SV820( )
   {
   }

   public void send_integrity_lvl_hashes1SV819( )
   {
   }

   public void subsflControlProps_99820( )
   {
      edtLb_LineaC_Internalname = "LB_LINEAC_"+sGXsfl_99_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_99_idx ;
      edtLB_CantC_Internalname = "LB_CANTC_"+sGXsfl_99_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_99_idx ;
      edtPrdCtw1_Internalname = "PRDCTW1_"+sGXsfl_99_idx ;
      edtPrdCtw2_Internalname = "PRDCTW2_"+sGXsfl_99_idx ;
      edtPrdCtw3_Internalname = "PRDCTW3_"+sGXsfl_99_idx ;
      edtPrdCtw4_Internalname = "PRDCTW4_"+sGXsfl_99_idx ;
      edtLb_fibra_Internalname = "LB_FIBRA_"+sGXsfl_99_idx ;
      edtLb_PTinC_Internalname = "LB_PTINC_"+sGXsfl_99_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_99_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_99_idx ;
   }

   public void subsflControlProps_fel_99820( )
   {
      edtLb_LineaC_Internalname = "LB_LINEAC_"+sGXsfl_99_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_99_fel_idx ;
      edtLB_CantC_Internalname = "LB_CANTC_"+sGXsfl_99_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_99_fel_idx ;
      edtPrdCtw1_Internalname = "PRDCTW1_"+sGXsfl_99_fel_idx ;
      edtPrdCtw2_Internalname = "PRDCTW2_"+sGXsfl_99_fel_idx ;
      edtPrdCtw3_Internalname = "PRDCTW3_"+sGXsfl_99_fel_idx ;
      edtPrdCtw4_Internalname = "PRDCTW4_"+sGXsfl_99_fel_idx ;
      edtLb_fibra_Internalname = "LB_FIBRA_"+sGXsfl_99_fel_idx ;
      edtLb_PTinC_Internalname = "LB_PTINC_"+sGXsfl_99_fel_idx ;
      edtPrdGots_Internalname = "PRDGOTS_"+sGXsfl_99_fel_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_99_fel_idx ;
   }

   public void addRow1SV820( )
   {
      nGXsfl_99_idx = (int)(nGXsfl_99_idx+1) ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_99820( ) ;
      sendRow1SV820( ) ;
   }

   public void sendRow1SV820( )
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
         if ( ((int)((nGXsfl_99_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_820_" + sGXsfl_99_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_99_idx + "',99)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LineaC_Internalname,GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5557Lb_LineaC), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_LineaC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_LineaC_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_820_" + sGXsfl_99_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_99_idx + "',99)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_820_" + sGXsfl_99_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_99_idx + "',99)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLB_CantC_Internalname,GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLB_CantC_Enabled!=0) ? localUtil.format( A5558LB_CantC, "ZZZZ9.99999") : localUtil.format( A5558LB_CantC, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLB_CantC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLB_CantC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_820_" + sGXsfl_99_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_99_idx + "',99)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtForPrdUMe_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw1_Internalname,GXutil.rtrim( A10936PrdCtw1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCtw1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw2_Internalname,GXutil.rtrim( A10937PrdCtw2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCtw2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw3_Internalname,GXutil.rtrim( A10938PrdCtw3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCtw3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtw4_Internalname,GXutil.rtrim( A11663PrdCtw4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtw4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCtw4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_820_" + sGXsfl_99_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_99_idx + "',99)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_fibra_Internalname,GXutil.rtrim( A14096Lb_fibra),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_fibra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtLb_fibra_Visible),Integer.valueOf(edtLb_fibra_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_820_" + sGXsfl_99_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_99_idx + "',99)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_PTinC_Internalname,GXutil.ltrim( localUtil.ntoc( A6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_PTinC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6544Lb_PTinC), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6544Lb_PTinC), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_PTinC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_PTinC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdGots_Internalname,GXutil.rtrim( A11363PrdGots),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtPrdGots_Visible),Integer.valueOf(edtPrdGots_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtwSt_Internalname,A14097PrdCtwSt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtwSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtPrdCtwSt_Visible),Integer.valueOf(edtPrdCtwSt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1SV820( ) ;
      GXCCtl = "Z5557Lb_LineaC_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14096Lb_fibra_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14096Lb_fibra));
      GXCCtl = "Z5558LB_CantC_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6058Lb_soluc_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6058Lb_soluc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6544Lb_PTinC_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5558LB_CantC_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_820_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_820_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_820_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_820, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10EmprCod));
      GXCCtl = "vLB_NUMERO_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV11Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vLB_OPCION_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Lb_opcion));
      GXCCtl = "vLB_RB_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV29Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vSTATION_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7Station));
      GXCCtl = "VALCOD_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "EMPRCOD_" + sGXsfl_99_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_LINEAC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_CANTC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_99_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW1_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW2_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW3_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW4_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw4_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FIBRA_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FIBRA_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_PTINC_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDGOTS_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDGOTS_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTWST_"+sGXsfl_99_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTWST_"+sGXsfl_99_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1SV820( )
   {
      nGXsfl_99_idx = (int)(nGXsfl_99_idx+1) ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_99820( ) ;
      edtLb_LineaC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAC_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLB_CantC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_CANTC_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_99_idx+"Horizontalalignment") ;
      edtPrdCtw1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW1_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCtw2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW2_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCtw3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW3_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCtw4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTW4_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_fibra_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FIBRA_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_fibra_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FIBRA_"+sGXsfl_99_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_PTinC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_PTINC_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdGots_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDGOTS_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdGots_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDGOTS_"+sGXsfl_99_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCtwSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTWST_"+sGXsfl_99_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCtwSt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTWST_"+sGXsfl_99_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LineaC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LineaC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_LINEAC_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_LineaC_Internalname ;
         wbErr = true ;
         A5557Lb_LineaC = (short)(0) ;
      }
      else
      {
         A5557Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "LB_CANTC_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLB_CantC_Internalname ;
         wbErr = true ;
         A5558LB_CantC = DecimalUtil.ZERO ;
      }
      else
      {
         A5558LB_CantC = localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
      A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
      A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
      A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
      A14096Lb_fibra = httpContext.cgiGet( edtLb_fibra_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_PTinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_PTinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "LB_PTINC_" + sGXsfl_99_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_PTinC_Internalname ;
         wbErr = true ;
         A6544Lb_PTinC = (byte)(0) ;
      }
      else
      {
         A6544Lb_PTinC = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_PTinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
      A14097PrdCtwSt = httpContext.cgiGet( edtPrdCtwSt_Internalname) ;
      GXCCtl = "Z5557Lb_LineaC_" + sGXsfl_99_idx ;
      Z5557Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14096Lb_fibra_" + sGXsfl_99_idx ;
      Z14096Lb_fibra = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5558LB_CantC_" + sGXsfl_99_idx ;
      Z5558LB_CantC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6058Lb_soluc_" + sGXsfl_99_idx ;
      Z6058Lb_soluc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6544Lb_PTinC_" + sGXsfl_99_idx ;
      Z6544Lb_PTinC = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_99_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_99_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6058Lb_soluc_" + sGXsfl_99_idx ;
      A6058Lb_soluc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5558LB_CantC_" + sGXsfl_99_idx ;
      O5558LB_CantC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_820_" + sGXsfl_99_idx ;
      nRcdDeleted_820 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_820_" + sGXsfl_99_idx ;
      nRcdExists_820 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_820_" + sGXsfl_99_idx ;
      nIsMod_820 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdCtw4_Enabled = edtPrdCtw4_Enabled ;
      defedtPrdCtw3_Enabled = edtPrdCtw3_Enabled ;
      defedtPrdCtw2_Enabled = edtPrdCtw2_Enabled ;
      defedtPrdCtw1_Enabled = edtPrdCtw1_Enabled ;
      defedtLb_LineaC_Enabled = edtLb_LineaC_Enabled ;
   }

   public void confirmValues1SV0( )
   {
      nGXsfl_99_idx = 0 ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_99820( ) ;
      while ( nGXsfl_99_idx < nRC_GXsfl_99 )
      {
         nGXsfl_99_idx = (int)(nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_99820( ) ;
         httpContext.changePostValue( "Z5557Lb_LineaC_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z5557Lb_LineaC_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5557Lb_LineaC_"+sGXsfl_99_idx) ;
         httpContext.changePostValue( "Z14096Lb_fibra_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z14096Lb_fibra_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14096Lb_fibra_"+sGXsfl_99_idx) ;
         httpContext.changePostValue( "Z5558LB_CantC_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z5558LB_CantC_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5558LB_CantC_"+sGXsfl_99_idx) ;
         httpContext.changePostValue( "Z6058Lb_soluc_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z6058Lb_soluc_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6058Lb_soluc_"+sGXsfl_99_idx) ;
         httpContext.changePostValue( "Z6544Lb_PTinC_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z6544Lb_PTinC_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6544Lb_PTinC_"+sGXsfl_99_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_99_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_99_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_99_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_99_idx) ;
      }
      httpContext.changePostValue( "O5558LB_CantC", httpContext.cgiGet( "T5558LB_CantC")) ;
      httpContext.deletePostValue( "T5558LB_CantC") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV12Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV29Lb_Rb))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion","Lb_Rb"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Colorantes_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
      forbiddenHiddens.add("Lb_CosteE", localUtil.format( A5565Lb_CosteE, "ZZZZ9.99999"));
      forbiddenHiddens.add("Lb_UltLC", localUtil.format( DecimalUtil.doubleToDec(A5556Lb_UltLC), "ZZZ9"));
      forbiddenHiddens.add("Lb_numop", localUtil.format( DecimalUtil.doubleToDec(A5718Lb_numop), "Z9"));
      forbiddenHiddens.add("Lb_IntCod", localUtil.format( DecimalUtil.doubleToDec(A8622Lb_IntCod), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_colorantes_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5555Lb_opcion", GXutil.rtrim( Z5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6373Lb_famc1", GXutil.ltrim( localUtil.ntoc( Z6373Lb_famc1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6374Lb_famc2", GXutil.ltrim( localUtil.ntoc( Z6374Lb_famc2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6375Lb_famc3", GXutil.ltrim( localUtil.ntoc( Z6375Lb_famc3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5565Lb_CosteE", GXutil.ltrim( localUtil.ntoc( Z5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5556Lb_UltLC", GXutil.ltrim( localUtil.ntoc( Z5556Lb_UltLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5718Lb_numop", GXutil.ltrim( localUtil.ntoc( Z5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8622Lb_IntCod", GXutil.ltrim( localUtil.ntoc( Z8622Lb_IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6310Lb_TaAuxC", GXutil.rtrim( Z6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "O6376SumColor", GXutil.ltrim( localUtil.ntoc( O6376SumColor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_99", GXutil.ltrim( localUtil.ntoc( nGXsfl_99_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N6310Lb_TaAuxC", GXutil.rtrim( A6310Lb_TaAuxC));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_TAAUXC_DATA", AV21Lb_TaAuxC_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_TAAUXC_DATA", AV21Lb_TaAuxC_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_FAMC1_DATA", AV23Lb_famc1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_FAMC1_DATA", AV23Lb_famc1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_FAMC2_DATA", AV25Lb_famc2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_FAMC2_DATA", AV25Lb_famc2_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_FAMC3_DATA", AV27Lb_famc3_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_FAMC3_DATA", AV27Lb_famc3_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV18PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV18PrdNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFORPRDUME_DATA", AV20ForPrdUMe_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFORPRDUME_DATA", AV20ForPrdUMe_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_RB", GXutil.ltrim( localUtil.ntoc( AV29Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_RB", getSecureSignedToken( "", localUtil.format( AV29Lb_Rb, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV11Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_OPCION", GXutil.rtrim( AV12Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_LB_TAAUXC", GXutil.rtrim( AV16Insert_Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIBRACOLORANTE", GXutil.ltrim( localUtil.ntoc( AV34fibracolorante, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV32Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_COSTEE", GXutil.ltrim( localUtil.ntoc( A5565Lb_CosteE, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ULTLC", GXutil.ltrim( localUtil.ntoc( A5556Lb_UltLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_NUMOP", GXutil.ltrim( localUtil.ntoc( A5718Lb_numop, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_INTCOD", GXutil.ltrim( localUtil.ntoc( A8622Lb_IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXD", GXutil.rtrim( A6311Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_HORMAX", GXutil.ltrim( localUtil.ntoc( A7261Lb_HorMax, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFIBRA", GXutil.rtrim( A14094PrdFibra));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_SOLUC", GXutil.ltrim( localUtil.ntoc( A6058Lb_soluc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDHORMAD", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Objectcall", GXutil.rtrim( Combo_lb_taauxc_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Cls", GXutil.rtrim( Combo_lb_taauxc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Selectedvalue_set", GXutil.rtrim( Combo_lb_taauxc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Enabled", GXutil.booltostr( Combo_lb_taauxc_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Emptyitem", GXutil.booltostr( Combo_lb_taauxc_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC1_Objectcall", GXutil.rtrim( Combo_lb_famc1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC1_Cls", GXutil.rtrim( Combo_lb_famc1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC1_Selectedvalue_set", GXutil.rtrim( Combo_lb_famc1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC1_Enabled", GXutil.booltostr( Combo_lb_famc1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC1_Emptyitem", GXutil.booltostr( Combo_lb_famc1_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC2_Objectcall", GXutil.rtrim( Combo_lb_famc2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC2_Cls", GXutil.rtrim( Combo_lb_famc2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC2_Selectedvalue_set", GXutil.rtrim( Combo_lb_famc2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC2_Enabled", GXutil.booltostr( Combo_lb_famc2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC2_Emptyitem", GXutil.booltostr( Combo_lb_famc2_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC3_Objectcall", GXutil.rtrim( Combo_lb_famc3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC3_Cls", GXutil.rtrim( Combo_lb_famc3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC3_Selectedvalue_set", GXutil.rtrim( Combo_lb_famc3_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC3_Enabled", GXutil.booltostr( Combo_lb_famc3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAMC3_Emptyitem", GXutil.booltostr( Combo_lb_famc3_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Objectcall", GXutil.rtrim( Combo_forprdume_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Cls", GXutil.rtrim( Combo_forprdume_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Enabled", GXutil.booltostr( Combo_forprdume_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Titlecontrolidtoreplace", GXutil.rtrim( Combo_forprdume_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Isgriditem", GXutil.booltostr( Combo_forprdume_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Emptyitem", GXutil.booltostr( Combo_forprdume_Emptyitem));
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
      return formatLink("app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV12Lb_opcion)),GXutil.URLEncode(DecimalUtil.decToString(AV29Lb_Rb))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion","Lb_Rb"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayoLaboratorio_Colorantes_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Ensayo Laboratorio (Colorantes)", "") ;
   }

   public void initializeNonKey1SV819( )
   {
      A6310Lb_TaAuxC = "" ;
      n6310Lb_TaAuxC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      A6373Lb_famc1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6373Lb_famc1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6373Lb_famc1), 2, 0));
      A6374Lb_famc2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6374Lb_famc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6374Lb_famc2), 2, 0));
      A6375Lb_famc3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6375Lb_famc3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6375Lb_famc3), 2, 0));
      A14088Lb_Gots = "" ;
      n14088Lb_Gots = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
      A5556Lb_UltLC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5556Lb_UltLC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5556Lb_UltLC), 4, 0));
      A5718Lb_numop = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5718Lb_numop", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5718Lb_numop), 2, 0));
      A6311Lb_TaAuxD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      A6376SumColor = DecimalUtil.ZERO ;
      n6376SumColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      A8622Lb_IntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8622Lb_IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8622Lb_IntCod), 2, 0));
      A5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
      O6376SumColor = A6376SumColor ;
      n6376SumColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrimstr( A6376SumColor, 11, 5));
      Z6373Lb_famc1 = (byte)(0) ;
      Z6374Lb_famc2 = (byte)(0) ;
      Z6375Lb_famc3 = (byte)(0) ;
      Z5565Lb_CosteE = DecimalUtil.ZERO ;
      Z5556Lb_UltLC = (short)(0) ;
      Z5718Lb_numop = (byte)(0) ;
      Z8622Lb_IntCod = (byte)(0) ;
      Z6310Lb_TaAuxC = "" ;
   }

   public void initAll1SV819( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5532Lb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      A5555Lb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      initializeNonKey1SV819( ) ;
   }

   public void standaloneModalInsert( )
   {
      A5565Lb_CosteE = i5565Lb_CosteE ;
      httpContext.ajax_rsp_assign_attri("", false, "A5565Lb_CosteE", GXutil.ltrimstr( A5565Lb_CosteE, 11, 5));
   }

   public void initializeNonKey1SV820( )
   {
      A14097PrdCtwSt = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A5558LB_CantC = DecimalUtil.ZERO ;
      A6058Lb_soluc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6058Lb_soluc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6058Lb_soluc), 5, 0));
      A6544Lb_PTinC = (byte)(0) ;
      A7260PrdHorMad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A11663PrdCtw4 = "" ;
      A10938PrdCtw3 = "" ;
      A10937PrdCtw2 = "" ;
      A10936PrdCtw1 = "" ;
      A11363PrdGots = "" ;
      A14094PrdFibra = "" ;
      n14094PrdFibra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
      A490ForPrdUMe = (byte)(3) ;
      A14096Lb_fibra = "" ;
      O5558LB_CantC = A5558LB_CantC ;
      Z14096Lb_fibra = "" ;
      Z5558LB_CantC = DecimalUtil.ZERO ;
      Z6058Lb_soluc = 0 ;
      Z6544Lb_PTinC = (byte)(0) ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1SV820( )
   {
      A5557Lb_LineaC = (short)(0) ;
      initializeNonKey1SV820( ) ;
   }

   public void standaloneModalInsert1SV820( )
   {
      A490ForPrdUMe = i490ForPrdUMe ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695489", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratorio_colorantes_trn.js", "?20268211695490", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties820( )
   {
      edtPrdCtw4_Enabled = defedtPrdCtw4_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw3_Enabled = defedtPrdCtw3_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw2_Enabled = defedtPrdCtw2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtPrdCtw1_Enabled = defedtPrdCtw1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Enabled), 5, 0), !bGXsfl_99_Refreshing);
      edtLb_LineaC_Enabled = defedtLb_LineaC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), !bGXsfl_99_Refreshing);
   }

   public void startgridcontrol99( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10936PrdCtw1));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10937PrdCtw2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10938PrdCtw3));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11663PrdCtw4));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtw4_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14096Lb_fibra));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLb_fibra_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6544Lb_PTinC, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11363PrdGots));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdGots_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", A14097PrdCtwSt);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtLb_numero_Internalname = "LB_NUMERO" ;
      edtLb_opcion_Internalname = "LB_OPCION" ;
      edtLb_Gots_Internalname = "LB_GOTS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTextblocklb_taauxc_Internalname = "TEXTBLOCKLB_TAAUXC" ;
      Combo_lb_taauxc_Internalname = "COMBO_LB_TAAUXC" ;
      edtLb_TaAuxC_Internalname = "LB_TAAUXC" ;
      divTablesplittedlb_taauxc_Internalname = "TABLESPLITTEDLB_TAAUXC" ;
      lblTextblocklb_famc1_Internalname = "TEXTBLOCKLB_FAMC1" ;
      Combo_lb_famc1_Internalname = "COMBO_LB_FAMC1" ;
      edtLb_famc1_Internalname = "LB_FAMC1" ;
      divTablesplittedlb_famc1_Internalname = "TABLESPLITTEDLB_FAMC1" ;
      lblTextblocklb_famc2_Internalname = "TEXTBLOCKLB_FAMC2" ;
      Combo_lb_famc2_Internalname = "COMBO_LB_FAMC2" ;
      edtLb_famc2_Internalname = "LB_FAMC2" ;
      divTablesplittedlb_famc2_Internalname = "TABLESPLITTEDLB_FAMC2" ;
      lblTextblocklb_famc3_Internalname = "TEXTBLOCKLB_FAMC3" ;
      Combo_lb_famc3_Internalname = "COMBO_LB_FAMC3" ;
      edtLb_famc3_Internalname = "LB_FAMC3" ;
      divTablesplittedlb_famc3_Internalname = "TABLESPLITTEDLB_FAMC3" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divDvpanel_unnamedtable3_cell_Internalname = "DVPANEL_UNNAMEDTABLE3_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtnproductosvariables_Internalname = "BTNPRODUCTOSVARIABLES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLb_LineaC_Internalname = "LB_LINEAC" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtLB_CantC_Internalname = "LB_CANTC" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtPrdCtw1_Internalname = "PRDCTW1" ;
      edtPrdCtw2_Internalname = "PRDCTW2" ;
      edtPrdCtw3_Internalname = "PRDCTW3" ;
      edtPrdCtw4_Internalname = "PRDCTW4" ;
      edtLb_fibra_Internalname = "LB_FIBRA" ;
      edtLb_PTinC_Internalname = "LB_PTINC" ;
      edtPrdGots_Internalname = "PRDGOTS" ;
      edtPrdCtwSt_Internalname = "PRDCTWST" ;
      edtSumColor_Internalname = "SUMCOLOR" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombolb_taauxc_Internalname = "vCOMBOLB_TAAUXC" ;
      divSectionattribute_lb_taauxc_Internalname = "SECTIONATTRIBUTE_LB_TAAUXC" ;
      edtavCombolb_famc1_Internalname = "vCOMBOLB_FAMC1" ;
      divSectionattribute_lb_famc1_Internalname = "SECTIONATTRIBUTE_LB_FAMC1" ;
      edtavCombolb_famc2_Internalname = "vCOMBOLB_FAMC2" ;
      divSectionattribute_lb_famc2_Internalname = "SECTIONATTRIBUTE_LB_FAMC2" ;
      edtavCombolb_famc3_Internalname = "vCOMBOLB_FAMC3" ;
      divSectionattribute_lb_famc3_Internalname = "SECTIONATTRIBUTE_LB_FAMC3" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      Combo_forprdume_Internalname = "COMBO_FORPRDUME" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      Combo_forprdume_Enabled = GXutil.toBoolean( -1) ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada Ensayo Laboratorio (Colorantes)", "") );
      edtPrdCtwSt_Jsonclick = "" ;
      edtPrdGots_Jsonclick = "" ;
      edtLb_PTinC_Jsonclick = "" ;
      edtLb_fibra_Jsonclick = "" ;
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw1_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtLB_CantC_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLb_LineaC_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_forprdume_Titlecontrolidtoreplace = "" ;
      edtPrdCtwSt_Visible = -1 ;
      edtPrdCtwSt_Enabled = 0 ;
      edtPrdGots_Visible = -1 ;
      edtPrdGots_Enabled = 0 ;
      edtLb_PTinC_Enabled = 1 ;
      edtLb_fibra_Visible = -1 ;
      edtLb_fibra_Enabled = 1 ;
      edtPrdCtw4_Enabled = 0 ;
      edtPrdCtw3_Enabled = 0 ;
      edtPrdCtw2_Enabled = 0 ;
      edtPrdCtw1_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtLB_CantC_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtLb_LineaC_Enabled = 1 ;
      Combo_forprdume_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_forprdume_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_forprdume_Cls = "ExtendedCombo" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      edtavCombolb_famc3_Jsonclick = "" ;
      edtavCombolb_famc3_Enabled = 0 ;
      edtavCombolb_famc3_Visible = 1 ;
      edtavCombolb_famc2_Jsonclick = "" ;
      edtavCombolb_famc2_Enabled = 0 ;
      edtavCombolb_famc2_Visible = 1 ;
      edtavCombolb_famc1_Jsonclick = "" ;
      edtavCombolb_famc1_Enabled = 0 ;
      edtavCombolb_famc1_Visible = 1 ;
      edtavCombolb_taauxc_Jsonclick = "" ;
      edtavCombolb_taauxc_Enabled = 0 ;
      edtavCombolb_taauxc_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtSumColor_Jsonclick = "" ;
      edtSumColor_Enabled = 0 ;
      bttBtnproductosvariables_Visible = 1 ;
      edtLb_famc3_Jsonclick = "" ;
      edtLb_famc3_Enabled = 1 ;
      edtLb_famc3_Visible = 1 ;
      Combo_lb_famc3_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_famc3_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_famc3_Enabled = GXutil.toBoolean( -1) ;
      edtLb_famc2_Jsonclick = "" ;
      edtLb_famc2_Enabled = 1 ;
      edtLb_famc2_Visible = 1 ;
      Combo_lb_famc2_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_famc2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_famc2_Enabled = GXutil.toBoolean( -1) ;
      edtLb_famc1_Jsonclick = "" ;
      edtLb_famc1_Enabled = 1 ;
      edtLb_famc1_Visible = 1 ;
      Combo_lb_famc1_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_famc1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_famc1_Enabled = GXutil.toBoolean( -1) ;
      edtLb_TaAuxC_Jsonclick = "" ;
      edtLb_TaAuxC_Enabled = 1 ;
      edtLb_TaAuxC_Visible = 1 ;
      Combo_lb_taauxc_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_taauxc_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_taauxc_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Tabla Alcali y Sulfato", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
      edtLb_Gots_Jsonclick = "" ;
      edtLb_Gots_Enabled = 0 ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_opcion_Enabled = 1 ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtForPrdUMe_Horizontalalignment = "right" ;
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

   public void gx24asaprdctwst1SV820( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14097PrdCtwSt = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A14097PrdCtwSt)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1SV820( String A396EmprCod ,
                             int A5532Lb_numero ,
                             String A5555Lb_opcion ,
                             short A5557Lb_LineaC )
   {
      if ( (0==A5557Lb_LineaC) && true /* After */ )
      {
         GXv_int14[0] = A5557Lb_LineaC ;
         new app.getlblineacc(remoteHandle, context).execute( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, GXv_int14) ;
         A5557Lb_LineaC = GXv_int14[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_99820( ) ;
      while ( nGXsfl_99_idx <= nRC_GXsfl_99 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SV820( ) ;
         standaloneModal1SV820( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SV820( ) ;
         nGXsfl_99_idx = (int)(nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_99820( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
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

   public void valid_Lb_numero( )
   {
      n14088Lb_Gots = false ;
      /* Using cursor T01SV28 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
      }
      A14088Lb_Gots = T01SV28_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01SV28_n14088Lb_Gots[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", GXutil.rtrim( A14088Lb_Gots));
   }

   public void valid_Lb_opcion( )
   {
      n6376SumColor = false ;
      /* Using cursor T01SV31 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A6376SumColor = T01SV31_A6376SumColor[0] ;
         n6376SumColor = T01SV31_n6376SumColor[0] ;
      }
      else
      {
         A6376SumColor = DecimalUtil.doubleToDec(0) ;
         n6376SumColor = false ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6376SumColor", GXutil.ltrim( localUtil.ntoc( A6376SumColor, (byte)(11), (byte)(5), ".", "")));
   }

   public void valid_Lb_taauxc( )
   {
      n6310Lb_TaAuxC = false ;
      /* Using cursor T01SV29 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TaAuxC_Internalname ;
         }
      }
      A6311Lb_TaAuxD = T01SV29_A6311Lb_TaAuxD[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", GXutil.rtrim( A6311Lb_TaAuxD));
   }

   public void valid_Lb_lineac( )
   {
      if ( (0==A5557Lb_LineaC) && true /* After */ )
      {
         GXv_int14[0] = A5557Lb_LineaC ;
         new app.getlblineacc(remoteHandle, context).execute( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, GXv_int14) ;
         entradaensayolaboratorio_colorantes_trn_impl.this.A5557Lb_LineaC = GXv_int14[0] ;
         A5557Lb_LineaC = this.A5557Lb_LineaC ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      n14094PrdFibra = false ;
      /* Using cursor T01SV42 */
      pr_default.execute(34, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01SV42_A718PrdNom[0] ;
      A7260PrdHorMad = T01SV42_A7260PrdHorMad[0] ;
      A724PrdPreAct = T01SV42_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01SV42_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01SV42_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01SV42_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01SV42_A10936PrdCtw1[0] ;
      A11363PrdGots = T01SV42_A11363PrdGots[0] ;
      A14094PrdFibra = T01SV42_A14094PrdFibra[0] ;
      n14094PrdFibra = T01SV42_n14094PrdFibra[0] ;
      A856ValCod = T01SV42_A856ValCod[0] ;
      pr_default.close(34);
      if ( isIns( )  && (GXutil.strcmp("", A14096Lb_fibra)==0) && ( Gx_BScreen == 0 ) )
      {
         A14096Lb_fibra = A14094PrdFibra ;
      }
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_colorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14097PrdCtwSt = GXt_char1 ;
      if ( ( AV32Moda21 == 1 ) && ( GXutil.strcmp(A11363PrdGots, "N") == 0 ) && ( GXutil.strcmp(A14088Lb_Gots, "S") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção O produto / corante não é GOTS", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", GXutil.rtrim( A11663PrdCtw4));
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", GXutil.rtrim( A10938PrdCtw3));
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", GXutil.rtrim( A10937PrdCtw2));
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", GXutil.rtrim( A10936PrdCtw1));
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", GXutil.rtrim( A11363PrdGots));
      httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", GXutil.rtrim( A14094PrdFibra));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14096Lb_fibra", GXutil.rtrim( A14096Lb_fibra));
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01SV43 */
      pr_default.execute(35, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01SV43_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SV43_n488ForPrdDsc[0] ;
      pr_default.close(35);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'AV29Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'AV36Pgmname',fld:'vPGMNAME',pic:''},{av:'A5565Lb_CosteE',fld:'LB_COSTEE',pic:'ZZZZ9.99999'},{av:'A5556Lb_UltLC',fld:'LB_ULTLC',pic:'ZZZ9'},{av:'A5718Lb_numop',fld:'LB_NUMOP',pic:'Z9'},{av:'A8622Lb_IntCod',fld:'LB_INTCOD',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131SV2',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'AV29Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV29Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true}]}");
      setEventMetadata("'DOPRODUCTOSVARIABLES'","{handler:'e111SV819',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("'DOPRODUCTOSVARIABLES'",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A14088Lb_Gots',fld:'LB_GOTS',pic:''}]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[{av:'A14088Lb_Gots',fld:'LB_GOTS',pic:''}]}");
      setEventMetadata("VALID_LB_OPCION","{handler:'valid_Lb_opcion',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A6376SumColor',fld:'SUMCOLOR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("VALID_LB_OPCION",",oparms:[{av:'A6376SumColor',fld:'SUMCOLOR',pic:'ZZZZ9.99999'}]}");
      setEventMetadata("VALID_LB_TAAUXC","{handler:'valid_Lb_taauxc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]");
      setEventMetadata("VALID_LB_TAAUXC",",oparms:[{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''}]}");
      setEventMetadata("VALIDV_COMBOLB_TAAUXC","{handler:'validv_Combolb_taauxc',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_TAAUXC",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_FAMC1","{handler:'validv_Combolb_famc1',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_FAMC1",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_FAMC2","{handler:'validv_Combolb_famc2',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_FAMC2",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_FAMC3","{handler:'validv_Combolb_famc3',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_FAMC3",",oparms:[]}");
      setEventMetadata("VALID_LB_LINEAC","{handler:'valid_Lb_lineac',iparms:[{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5557Lb_LineaC',fld:'LB_LINEAC',pic:'ZZZ9'}]");
      setEventMetadata("VALID_LB_LINEAC",",oparms:[{av:'A5557Lb_LineaC',fld:'LB_LINEAC',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A14094PrdFibra',fld:'PRDFIBRA',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A14096Lb_fibra',fld:'LB_FIBRA',pic:''},{av:'A14097PrdCtwSt',fld:'PRDCTWST',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A14094PrdFibra',fld:'PRDFIBRA',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A14096Lb_fibra',fld:'LB_FIBRA',pic:''},{av:'A14097PrdCtwSt',fld:'PRDCTWST',pic:''}]}");
      setEventMetadata("VALID_LB_CANTC","{handler:'valid_Lb_cantc',iparms:[]");
      setEventMetadata("VALID_LB_CANTC",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Prdctwst',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(34);
      pr_default.close(35);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV12Lb_opcion = "" ;
      wcpOAV29Lb_Rb = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z5555Lb_opcion = "" ;
      Z5565Lb_CosteE = DecimalUtil.ZERO ;
      Z6310Lb_TaAuxC = "" ;
      O6376SumColor = DecimalUtil.ZERO ;
      N6310Lb_TaAuxC = "" ;
      Combo_lb_famc3_Selectedvalue_get = "" ;
      Combo_lb_famc2_Selectedvalue_get = "" ;
      Combo_lb_famc1_Selectedvalue_get = "" ;
      Combo_lb_taauxc_Selectedvalue_get = "" ;
      Z14096Lb_fibra = "" ;
      Z5558LB_CantC = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O5558LB_CantC = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A6310Lb_TaAuxC = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      AV12Lb_opcion = "" ;
      AV29Lb_Rb = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A14088Lb_Gots = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblocklb_taauxc_Jsonclick = "" ;
      ucCombo_lb_taauxc = new com.genexus.webpanels.GXUserControl();
      Combo_lb_taauxc_Caption = "" ;
      AV21Lb_TaAuxC_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_famc1_Jsonclick = "" ;
      ucCombo_lb_famc1 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_famc1_Caption = "" ;
      AV23Lb_famc1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_famc2_Jsonclick = "" ;
      ucCombo_lb_famc2 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_famc2_Caption = "" ;
      AV25Lb_famc2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_famc3_Jsonclick = "" ;
      ucCombo_lb_famc3 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_famc3_Caption = "" ;
      AV27Lb_famc3_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtnproductosvariables_Jsonclick = "" ;
      A6376SumColor = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV36Pgmname = "" ;
      AV22ComboLb_TaAuxC = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV18PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_forprdume = new com.genexus.webpanels.GXUserControl();
      Combo_forprdume_Caption = "" ;
      AV20ForPrdUMe_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B6376SumColor = DecimalUtil.ZERO ;
      sMode820 = "" ;
      sStyleString = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      AV16Insert_Lb_TaAuxC = "" ;
      A407EmprNom = "" ;
      A6311Lb_TaAuxD = "" ;
      A14094PrdFibra = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Combo_lb_taauxc_Objectcall = "" ;
      Combo_lb_taauxc_Class = "" ;
      Combo_lb_taauxc_Icontype = "" ;
      Combo_lb_taauxc_Icon = "" ;
      Combo_lb_taauxc_Tooltip = "" ;
      Combo_lb_taauxc_Selectedvalue_set = "" ;
      Combo_lb_taauxc_Selectedtext_set = "" ;
      Combo_lb_taauxc_Selectedtext_get = "" ;
      Combo_lb_taauxc_Gamoauthtoken = "" ;
      Combo_lb_taauxc_Ddointernalname = "" ;
      Combo_lb_taauxc_Titlecontrolalign = "" ;
      Combo_lb_taauxc_Dropdownoptionstype = "" ;
      Combo_lb_taauxc_Titlecontrolidtoreplace = "" ;
      Combo_lb_taauxc_Datalisttype = "" ;
      Combo_lb_taauxc_Datalistfixedvalues = "" ;
      Combo_lb_taauxc_Datalistproc = "" ;
      Combo_lb_taauxc_Datalistprocparametersprefix = "" ;
      Combo_lb_taauxc_Remoteservicesparameters = "" ;
      Combo_lb_taauxc_Htmltemplate = "" ;
      Combo_lb_taauxc_Multiplevaluestype = "" ;
      Combo_lb_taauxc_Loadingdata = "" ;
      Combo_lb_taauxc_Noresultsfound = "" ;
      Combo_lb_taauxc_Emptyitemtext = "" ;
      Combo_lb_taauxc_Onlyselectedvalues = "" ;
      Combo_lb_taauxc_Selectalltext = "" ;
      Combo_lb_taauxc_Multiplevaluesseparator = "" ;
      Combo_lb_taauxc_Addnewoptiontext = "" ;
      Combo_lb_famc1_Objectcall = "" ;
      Combo_lb_famc1_Class = "" ;
      Combo_lb_famc1_Icontype = "" ;
      Combo_lb_famc1_Icon = "" ;
      Combo_lb_famc1_Tooltip = "" ;
      Combo_lb_famc1_Selectedvalue_set = "" ;
      Combo_lb_famc1_Selectedtext_set = "" ;
      Combo_lb_famc1_Selectedtext_get = "" ;
      Combo_lb_famc1_Gamoauthtoken = "" ;
      Combo_lb_famc1_Ddointernalname = "" ;
      Combo_lb_famc1_Titlecontrolalign = "" ;
      Combo_lb_famc1_Dropdownoptionstype = "" ;
      Combo_lb_famc1_Titlecontrolidtoreplace = "" ;
      Combo_lb_famc1_Datalisttype = "" ;
      Combo_lb_famc1_Datalistfixedvalues = "" ;
      Combo_lb_famc1_Datalistproc = "" ;
      Combo_lb_famc1_Datalistprocparametersprefix = "" ;
      Combo_lb_famc1_Remoteservicesparameters = "" ;
      Combo_lb_famc1_Htmltemplate = "" ;
      Combo_lb_famc1_Multiplevaluestype = "" ;
      Combo_lb_famc1_Loadingdata = "" ;
      Combo_lb_famc1_Noresultsfound = "" ;
      Combo_lb_famc1_Emptyitemtext = "" ;
      Combo_lb_famc1_Onlyselectedvalues = "" ;
      Combo_lb_famc1_Selectalltext = "" ;
      Combo_lb_famc1_Multiplevaluesseparator = "" ;
      Combo_lb_famc1_Addnewoptiontext = "" ;
      Combo_lb_famc2_Objectcall = "" ;
      Combo_lb_famc2_Class = "" ;
      Combo_lb_famc2_Icontype = "" ;
      Combo_lb_famc2_Icon = "" ;
      Combo_lb_famc2_Tooltip = "" ;
      Combo_lb_famc2_Selectedvalue_set = "" ;
      Combo_lb_famc2_Selectedtext_set = "" ;
      Combo_lb_famc2_Selectedtext_get = "" ;
      Combo_lb_famc2_Gamoauthtoken = "" ;
      Combo_lb_famc2_Ddointernalname = "" ;
      Combo_lb_famc2_Titlecontrolalign = "" ;
      Combo_lb_famc2_Dropdownoptionstype = "" ;
      Combo_lb_famc2_Titlecontrolidtoreplace = "" ;
      Combo_lb_famc2_Datalisttype = "" ;
      Combo_lb_famc2_Datalistfixedvalues = "" ;
      Combo_lb_famc2_Datalistproc = "" ;
      Combo_lb_famc2_Datalistprocparametersprefix = "" ;
      Combo_lb_famc2_Remoteservicesparameters = "" ;
      Combo_lb_famc2_Htmltemplate = "" ;
      Combo_lb_famc2_Multiplevaluestype = "" ;
      Combo_lb_famc2_Loadingdata = "" ;
      Combo_lb_famc2_Noresultsfound = "" ;
      Combo_lb_famc2_Emptyitemtext = "" ;
      Combo_lb_famc2_Onlyselectedvalues = "" ;
      Combo_lb_famc2_Selectalltext = "" ;
      Combo_lb_famc2_Multiplevaluesseparator = "" ;
      Combo_lb_famc2_Addnewoptiontext = "" ;
      Combo_lb_famc3_Objectcall = "" ;
      Combo_lb_famc3_Class = "" ;
      Combo_lb_famc3_Icontype = "" ;
      Combo_lb_famc3_Icon = "" ;
      Combo_lb_famc3_Tooltip = "" ;
      Combo_lb_famc3_Selectedvalue_set = "" ;
      Combo_lb_famc3_Selectedtext_set = "" ;
      Combo_lb_famc3_Selectedtext_get = "" ;
      Combo_lb_famc3_Gamoauthtoken = "" ;
      Combo_lb_famc3_Ddointernalname = "" ;
      Combo_lb_famc3_Titlecontrolalign = "" ;
      Combo_lb_famc3_Dropdownoptionstype = "" ;
      Combo_lb_famc3_Titlecontrolidtoreplace = "" ;
      Combo_lb_famc3_Datalisttype = "" ;
      Combo_lb_famc3_Datalistfixedvalues = "" ;
      Combo_lb_famc3_Datalistproc = "" ;
      Combo_lb_famc3_Datalistprocparametersprefix = "" ;
      Combo_lb_famc3_Remoteservicesparameters = "" ;
      Combo_lb_famc3_Htmltemplate = "" ;
      Combo_lb_famc3_Multiplevaluestype = "" ;
      Combo_lb_famc3_Loadingdata = "" ;
      Combo_lb_famc3_Noresultsfound = "" ;
      Combo_lb_famc3_Emptyitemtext = "" ;
      Combo_lb_famc3_Onlyselectedvalues = "" ;
      Combo_lb_famc3_Selectalltext = "" ;
      Combo_lb_famc3_Multiplevaluesseparator = "" ;
      Combo_lb_famc3_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Combo_forprdume_Objectcall = "" ;
      Combo_forprdume_Class = "" ;
      Combo_forprdume_Icontype = "" ;
      Combo_forprdume_Icon = "" ;
      Combo_forprdume_Tooltip = "" ;
      Combo_forprdume_Selectedvalue_set = "" ;
      Combo_forprdume_Selectedvalue_get = "" ;
      Combo_forprdume_Selectedtext_set = "" ;
      Combo_forprdume_Selectedtext_get = "" ;
      Combo_forprdume_Gamoauthtoken = "" ;
      Combo_forprdume_Ddointernalname = "" ;
      Combo_forprdume_Titlecontrolalign = "" ;
      Combo_forprdume_Dropdownoptionstype = "" ;
      Combo_forprdume_Datalisttype = "" ;
      Combo_forprdume_Datalistfixedvalues = "" ;
      Combo_forprdume_Datalistproc = "" ;
      Combo_forprdume_Datalistprocparametersprefix = "" ;
      Combo_forprdume_Remoteservicesparameters = "" ;
      Combo_forprdume_Htmltemplate = "" ;
      Combo_forprdume_Multiplevaluestype = "" ;
      Combo_forprdume_Loadingdata = "" ;
      Combo_forprdume_Noresultsfound = "" ;
      Combo_forprdume_Emptyitemtext = "" ;
      Combo_forprdume_Onlyselectedvalues = "" ;
      Combo_forprdume_Selectalltext = "" ;
      Combo_forprdume_Multiplevaluesseparator = "" ;
      Combo_forprdume_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode819 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s6376SumColor = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A14096Lb_fibra = "" ;
      A11363PrdGots = "" ;
      A14097PrdCtwSt = "" ;
      T5558LB_CantC = DecimalUtil.ZERO ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV17TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_int8 = new int[1] ;
      AV31Coste_cor = DecimalUtil.ZERO ;
      AV30Lb_costec = DecimalUtil.ZERO ;
      GXv_int10 = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV19ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item13 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z14088Lb_Gots = "" ;
      Z6376SumColor = DecimalUtil.ZERO ;
      Z6311Lb_TaAuxD = "" ;
      T01SV8_A407EmprNom = new String[] {""} ;
      T01SV8_n407EmprNom = new boolean[] {false} ;
      T01SV12_A7261Lb_HorMax = new byte[1] ;
      T01SV12_n7261Lb_HorMax = new boolean[] {false} ;
      GXv_int7 = new byte[1] ;
      T01SV9_A14088Lb_Gots = new String[] {""} ;
      T01SV9_n14088Lb_Gots = new boolean[] {false} ;
      T01SV14_A6376SumColor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV14_n6376SumColor = new boolean[] {false} ;
      T01SV10_A6311Lb_TaAuxD = new String[] {""} ;
      T01SV17_A5555Lb_opcion = new String[] {""} ;
      T01SV17_A6373Lb_famc1 = new byte[1] ;
      T01SV17_A6374Lb_famc2 = new byte[1] ;
      T01SV17_A6375Lb_famc3 = new byte[1] ;
      T01SV17_A407EmprNom = new String[] {""} ;
      T01SV17_n407EmprNom = new boolean[] {false} ;
      T01SV17_A14088Lb_Gots = new String[] {""} ;
      T01SV17_n14088Lb_Gots = new boolean[] {false} ;
      T01SV17_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV17_A5556Lb_UltLC = new short[1] ;
      T01SV17_A5718Lb_numop = new byte[1] ;
      T01SV17_A6311Lb_TaAuxD = new String[] {""} ;
      T01SV17_A8622Lb_IntCod = new byte[1] ;
      T01SV17_A396EmprCod = new String[] {""} ;
      T01SV17_A5532Lb_numero = new int[1] ;
      T01SV17_A6310Lb_TaAuxC = new String[] {""} ;
      T01SV17_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SV17_A6376SumColor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV17_n6376SumColor = new boolean[] {false} ;
      T01SV17_A7261Lb_HorMax = new byte[1] ;
      T01SV17_n7261Lb_HorMax = new boolean[] {false} ;
      T01SV18_A14088Lb_Gots = new String[] {""} ;
      T01SV18_n14088Lb_Gots = new boolean[] {false} ;
      T01SV19_A6311Lb_TaAuxD = new String[] {""} ;
      T01SV21_A6376SumColor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV21_n6376SumColor = new boolean[] {false} ;
      T01SV22_A396EmprCod = new String[] {""} ;
      T01SV22_A5532Lb_numero = new int[1] ;
      T01SV22_A5555Lb_opcion = new String[] {""} ;
      T01SV7_A5555Lb_opcion = new String[] {""} ;
      T01SV7_A6373Lb_famc1 = new byte[1] ;
      T01SV7_A6374Lb_famc2 = new byte[1] ;
      T01SV7_A6375Lb_famc3 = new byte[1] ;
      T01SV7_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV7_A5556Lb_UltLC = new short[1] ;
      T01SV7_A5718Lb_numop = new byte[1] ;
      T01SV7_A8622Lb_IntCod = new byte[1] ;
      T01SV7_A396EmprCod = new String[] {""} ;
      T01SV7_A5532Lb_numero = new int[1] ;
      T01SV7_A6310Lb_TaAuxC = new String[] {""} ;
      T01SV7_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SV23_A396EmprCod = new String[] {""} ;
      T01SV23_A5532Lb_numero = new int[1] ;
      T01SV23_A5555Lb_opcion = new String[] {""} ;
      T01SV24_A396EmprCod = new String[] {""} ;
      T01SV24_A5532Lb_numero = new int[1] ;
      T01SV24_A5555Lb_opcion = new String[] {""} ;
      T01SV6_A5555Lb_opcion = new String[] {""} ;
      T01SV6_A6373Lb_famc1 = new byte[1] ;
      T01SV6_A6374Lb_famc2 = new byte[1] ;
      T01SV6_A6375Lb_famc3 = new byte[1] ;
      T01SV6_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV6_A5556Lb_UltLC = new short[1] ;
      T01SV6_A5718Lb_numop = new byte[1] ;
      T01SV6_A8622Lb_IntCod = new byte[1] ;
      T01SV6_A396EmprCod = new String[] {""} ;
      T01SV6_A5532Lb_numero = new int[1] ;
      T01SV6_A6310Lb_TaAuxC = new String[] {""} ;
      T01SV6_n6310Lb_TaAuxC = new boolean[] {false} ;
      T01SV28_A14088Lb_Gots = new String[] {""} ;
      T01SV28_n14088Lb_Gots = new boolean[] {false} ;
      T01SV29_A6311Lb_TaAuxD = new String[] {""} ;
      T01SV31_A6376SumColor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV31_n6376SumColor = new boolean[] {false} ;
      T01SV32_A396EmprCod = new String[] {""} ;
      T01SV32_A5532Lb_numero = new int[1] ;
      T01SV32_A5555Lb_opcion = new String[] {""} ;
      T01SV32_A13460Lb_linCP = new short[1] ;
      T01SV32_A13458Lb_TipCP = new String[] {""} ;
      T01SV33_A396EmprCod = new String[] {""} ;
      T01SV33_A5532Lb_numero = new int[1] ;
      T01SV33_A5555Lb_opcion = new String[] {""} ;
      T01SV33_A5560Lb_LineaPr = new short[1] ;
      T01SV34_A396EmprCod = new String[] {""} ;
      T01SV34_A5532Lb_numero = new int[1] ;
      T01SV34_A5555Lb_opcion = new String[] {""} ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z11663PrdCtw4 = "" ;
      Z10938PrdCtw3 = "" ;
      Z10937PrdCtw2 = "" ;
      Z10936PrdCtw1 = "" ;
      Z11363PrdGots = "" ;
      Z14094PrdFibra = "" ;
      Z488ForPrdDsc = "" ;
      T01SV5_A488ForPrdDsc = new String[] {""} ;
      T01SV5_n488ForPrdDsc = new boolean[] {false} ;
      T01SV35_A5532Lb_numero = new int[1] ;
      T01SV35_A5555Lb_opcion = new String[] {""} ;
      T01SV35_A5557Lb_LineaC = new short[1] ;
      T01SV35_A14096Lb_fibra = new String[] {""} ;
      T01SV35_A718PrdNom = new String[] {""} ;
      T01SV35_A488ForPrdDsc = new String[] {""} ;
      T01SV35_n488ForPrdDsc = new boolean[] {false} ;
      T01SV35_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV35_A6058Lb_soluc = new int[1] ;
      T01SV35_A6544Lb_PTinC = new byte[1] ;
      T01SV35_A7260PrdHorMad = new byte[1] ;
      T01SV35_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV35_A11663PrdCtw4 = new String[] {""} ;
      T01SV35_A10938PrdCtw3 = new String[] {""} ;
      T01SV35_A10937PrdCtw2 = new String[] {""} ;
      T01SV35_A10936PrdCtw1 = new String[] {""} ;
      T01SV35_A11363PrdGots = new String[] {""} ;
      T01SV35_A14094PrdFibra = new String[] {""} ;
      T01SV35_n14094PrdFibra = new boolean[] {false} ;
      T01SV35_A396EmprCod = new String[] {""} ;
      T01SV35_A719PrdNum = new String[] {""} ;
      T01SV35_A490ForPrdUMe = new byte[1] ;
      T01SV35_A856ValCod = new byte[1] ;
      T01SV4_A718PrdNom = new String[] {""} ;
      T01SV4_A7260PrdHorMad = new byte[1] ;
      T01SV4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV4_A11663PrdCtw4 = new String[] {""} ;
      T01SV4_A10938PrdCtw3 = new String[] {""} ;
      T01SV4_A10937PrdCtw2 = new String[] {""} ;
      T01SV4_A10936PrdCtw1 = new String[] {""} ;
      T01SV4_A11363PrdGots = new String[] {""} ;
      T01SV4_A14094PrdFibra = new String[] {""} ;
      T01SV4_n14094PrdFibra = new boolean[] {false} ;
      T01SV4_A856ValCod = new byte[1] ;
      T01SV36_A718PrdNom = new String[] {""} ;
      T01SV36_A7260PrdHorMad = new byte[1] ;
      T01SV36_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV36_A11663PrdCtw4 = new String[] {""} ;
      T01SV36_A10938PrdCtw3 = new String[] {""} ;
      T01SV36_A10937PrdCtw2 = new String[] {""} ;
      T01SV36_A10936PrdCtw1 = new String[] {""} ;
      T01SV36_A11363PrdGots = new String[] {""} ;
      T01SV36_A14094PrdFibra = new String[] {""} ;
      T01SV36_n14094PrdFibra = new boolean[] {false} ;
      T01SV36_A856ValCod = new byte[1] ;
      T01SV37_A488ForPrdDsc = new String[] {""} ;
      T01SV37_n488ForPrdDsc = new boolean[] {false} ;
      T01SV38_A396EmprCod = new String[] {""} ;
      T01SV38_A5532Lb_numero = new int[1] ;
      T01SV38_A5555Lb_opcion = new String[] {""} ;
      T01SV38_A5557Lb_LineaC = new short[1] ;
      T01SV3_A5532Lb_numero = new int[1] ;
      T01SV3_A5555Lb_opcion = new String[] {""} ;
      T01SV3_A5557Lb_LineaC = new short[1] ;
      T01SV3_A14096Lb_fibra = new String[] {""} ;
      T01SV3_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV3_A6058Lb_soluc = new int[1] ;
      T01SV3_A6544Lb_PTinC = new byte[1] ;
      T01SV3_A396EmprCod = new String[] {""} ;
      T01SV3_A719PrdNum = new String[] {""} ;
      T01SV3_A490ForPrdUMe = new byte[1] ;
      T01SV2_A5532Lb_numero = new int[1] ;
      T01SV2_A5555Lb_opcion = new String[] {""} ;
      T01SV2_A5557Lb_LineaC = new short[1] ;
      T01SV2_A14096Lb_fibra = new String[] {""} ;
      T01SV2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV2_A6058Lb_soluc = new int[1] ;
      T01SV2_A6544Lb_PTinC = new byte[1] ;
      T01SV2_A396EmprCod = new String[] {""} ;
      T01SV2_A719PrdNum = new String[] {""} ;
      T01SV2_A490ForPrdUMe = new byte[1] ;
      T01SV42_A718PrdNom = new String[] {""} ;
      T01SV42_A7260PrdHorMad = new byte[1] ;
      T01SV42_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SV42_A11663PrdCtw4 = new String[] {""} ;
      T01SV42_A10938PrdCtw3 = new String[] {""} ;
      T01SV42_A10937PrdCtw2 = new String[] {""} ;
      T01SV42_A10936PrdCtw1 = new String[] {""} ;
      T01SV42_A11363PrdGots = new String[] {""} ;
      T01SV42_A14094PrdFibra = new String[] {""} ;
      T01SV42_n14094PrdFibra = new boolean[] {false} ;
      T01SV42_A856ValCod = new byte[1] ;
      T01SV43_A488ForPrdDsc = new String[] {""} ;
      T01SV43_n488ForPrdDsc = new boolean[] {false} ;
      T01SV44_A396EmprCod = new String[] {""} ;
      T01SV44_A5532Lb_numero = new int[1] ;
      T01SV44_A5555Lb_opcion = new String[] {""} ;
      T01SV44_A5557Lb_LineaC = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i5565Lb_CosteE = DecimalUtil.ZERO ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int14 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z14097PrdCtwSt = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn__default(),
         new Object[] {
             new Object[] {
            T01SV2_A5532Lb_numero, T01SV2_A5555Lb_opcion, T01SV2_A5557Lb_LineaC, T01SV2_A14096Lb_fibra, T01SV2_A5558LB_CantC, T01SV2_A6058Lb_soluc, T01SV2_A6544Lb_PTinC, T01SV2_A396EmprCod, T01SV2_A719PrdNum, T01SV2_A490ForPrdUMe
            }
            , new Object[] {
            T01SV3_A5532Lb_numero, T01SV3_A5555Lb_opcion, T01SV3_A5557Lb_LineaC, T01SV3_A14096Lb_fibra, T01SV3_A5558LB_CantC, T01SV3_A6058Lb_soluc, T01SV3_A6544Lb_PTinC, T01SV3_A396EmprCod, T01SV3_A719PrdNum, T01SV3_A490ForPrdUMe
            }
            , new Object[] {
            T01SV4_A718PrdNom, T01SV4_A7260PrdHorMad, T01SV4_A724PrdPreAct, T01SV4_A11663PrdCtw4, T01SV4_A10938PrdCtw3, T01SV4_A10937PrdCtw2, T01SV4_A10936PrdCtw1, T01SV4_A11363PrdGots, T01SV4_A14094PrdFibra, T01SV4_n14094PrdFibra,
            T01SV4_A856ValCod
            }
            , new Object[] {
            T01SV5_A488ForPrdDsc, T01SV5_n488ForPrdDsc
            }
            , new Object[] {
            T01SV6_A5555Lb_opcion, T01SV6_A6373Lb_famc1, T01SV6_A6374Lb_famc2, T01SV6_A6375Lb_famc3, T01SV6_A5565Lb_CosteE, T01SV6_A5556Lb_UltLC, T01SV6_A5718Lb_numop, T01SV6_A8622Lb_IntCod, T01SV6_A396EmprCod, T01SV6_A5532Lb_numero,
            T01SV6_A6310Lb_TaAuxC, T01SV6_n6310Lb_TaAuxC
            }
            , new Object[] {
            T01SV7_A5555Lb_opcion, T01SV7_A6373Lb_famc1, T01SV7_A6374Lb_famc2, T01SV7_A6375Lb_famc3, T01SV7_A5565Lb_CosteE, T01SV7_A5556Lb_UltLC, T01SV7_A5718Lb_numop, T01SV7_A8622Lb_IntCod, T01SV7_A396EmprCod, T01SV7_A5532Lb_numero,
            T01SV7_A6310Lb_TaAuxC, T01SV7_n6310Lb_TaAuxC
            }
            , new Object[] {
            T01SV8_A407EmprNom, T01SV8_n407EmprNom
            }
            , new Object[] {
            T01SV9_A14088Lb_Gots, T01SV9_n14088Lb_Gots
            }
            , new Object[] {
            T01SV10_A6311Lb_TaAuxD
            }
            , new Object[] {
            T01SV12_A7261Lb_HorMax, T01SV12_n7261Lb_HorMax
            }
            , new Object[] {
            T01SV14_A6376SumColor, T01SV14_n6376SumColor
            }
            , new Object[] {
            T01SV17_A5555Lb_opcion, T01SV17_A6373Lb_famc1, T01SV17_A6374Lb_famc2, T01SV17_A6375Lb_famc3, T01SV17_A407EmprNom, T01SV17_n407EmprNom, T01SV17_A14088Lb_Gots, T01SV17_n14088Lb_Gots, T01SV17_A5565Lb_CosteE, T01SV17_A5556Lb_UltLC,
            T01SV17_A5718Lb_numop, T01SV17_A6311Lb_TaAuxD, T01SV17_A8622Lb_IntCod, T01SV17_A396EmprCod, T01SV17_A5532Lb_numero, T01SV17_A6310Lb_TaAuxC, T01SV17_n6310Lb_TaAuxC, T01SV17_A6376SumColor, T01SV17_n6376SumColor, T01SV17_A7261Lb_HorMax,
            T01SV17_n7261Lb_HorMax
            }
            , new Object[] {
            T01SV18_A14088Lb_Gots, T01SV18_n14088Lb_Gots
            }
            , new Object[] {
            T01SV19_A6311Lb_TaAuxD
            }
            , new Object[] {
            T01SV21_A6376SumColor, T01SV21_n6376SumColor
            }
            , new Object[] {
            T01SV22_A396EmprCod, T01SV22_A5532Lb_numero, T01SV22_A5555Lb_opcion
            }
            , new Object[] {
            T01SV23_A396EmprCod, T01SV23_A5532Lb_numero, T01SV23_A5555Lb_opcion
            }
            , new Object[] {
            T01SV24_A396EmprCod, T01SV24_A5532Lb_numero, T01SV24_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SV28_A14088Lb_Gots, T01SV28_n14088Lb_Gots
            }
            , new Object[] {
            T01SV29_A6311Lb_TaAuxD
            }
            , new Object[] {
            T01SV31_A6376SumColor, T01SV31_n6376SumColor
            }
            , new Object[] {
            T01SV32_A396EmprCod, T01SV32_A5532Lb_numero, T01SV32_A5555Lb_opcion, T01SV32_A13460Lb_linCP, T01SV32_A13458Lb_TipCP
            }
            , new Object[] {
            T01SV33_A396EmprCod, T01SV33_A5532Lb_numero, T01SV33_A5555Lb_opcion, T01SV33_A5560Lb_LineaPr
            }
            , new Object[] {
            T01SV34_A396EmprCod, T01SV34_A5532Lb_numero, T01SV34_A5555Lb_opcion
            }
            , new Object[] {
            T01SV35_A5532Lb_numero, T01SV35_A5555Lb_opcion, T01SV35_A5557Lb_LineaC, T01SV35_A14096Lb_fibra, T01SV35_A718PrdNom, T01SV35_A488ForPrdDsc, T01SV35_n488ForPrdDsc, T01SV35_A5558LB_CantC, T01SV35_A6058Lb_soluc, T01SV35_A6544Lb_PTinC,
            T01SV35_A7260PrdHorMad, T01SV35_A724PrdPreAct, T01SV35_A11663PrdCtw4, T01SV35_A10938PrdCtw3, T01SV35_A10937PrdCtw2, T01SV35_A10936PrdCtw1, T01SV35_A11363PrdGots, T01SV35_A14094PrdFibra, T01SV35_n14094PrdFibra, T01SV35_A396EmprCod,
            T01SV35_A719PrdNum, T01SV35_A490ForPrdUMe, T01SV35_A856ValCod
            }
            , new Object[] {
            T01SV36_A718PrdNom, T01SV36_A7260PrdHorMad, T01SV36_A724PrdPreAct, T01SV36_A11663PrdCtw4, T01SV36_A10938PrdCtw3, T01SV36_A10937PrdCtw2, T01SV36_A10936PrdCtw1, T01SV36_A11363PrdGots, T01SV36_A14094PrdFibra, T01SV36_n14094PrdFibra,
            T01SV36_A856ValCod
            }
            , new Object[] {
            T01SV37_A488ForPrdDsc, T01SV37_n488ForPrdDsc
            }
            , new Object[] {
            T01SV38_A396EmprCod, T01SV38_A5532Lb_numero, T01SV38_A5555Lb_opcion, T01SV38_A5557Lb_LineaC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SV42_A718PrdNom, T01SV42_A7260PrdHorMad, T01SV42_A724PrdPreAct, T01SV42_A11663PrdCtw4, T01SV42_A10938PrdCtw3, T01SV42_A10937PrdCtw2, T01SV42_A10936PrdCtw1, T01SV42_A11363PrdGots, T01SV42_A14094PrdFibra, T01SV42_n14094PrdFibra,
            T01SV42_A856ValCod
            }
            , new Object[] {
            T01SV43_A488ForPrdDsc, T01SV43_n488ForPrdDsc
            }
            , new Object[] {
            T01SV44_A396EmprCod, T01SV44_A5532Lb_numero, T01SV44_A5555Lb_opcion, T01SV44_A5557Lb_LineaC
            }
         }
      );
      AV36Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Colorantes_TRN" ;
      Z14096Lb_fibra = "" ;
      A14096Lb_fibra = "" ;
      Z5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
      A5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
      i5565Lb_CosteE = DecimalUtil.doubleToDec(0) ;
      Z490ForPrdUMe = (byte)(3) ;
      i490ForPrdUMe = (byte)(3) ;
      A490ForPrdUMe = (byte)(3) ;
   }

   private byte Z6373Lb_famc1 ;
   private byte Z6374Lb_famc2 ;
   private byte Z6375Lb_famc3 ;
   private byte Z5718Lb_numop ;
   private byte Z8622Lb_IntCod ;
   private byte Z6544Lb_PTinC ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A6373Lb_famc1 ;
   private byte A6374Lb_famc2 ;
   private byte A6375Lb_famc3 ;
   private byte AV24ComboLb_famc1 ;
   private byte AV26ComboLb_famc2 ;
   private byte AV28ComboLb_famc3 ;
   private byte A5718Lb_numop ;
   private byte A8622Lb_IntCod ;
   private byte A7261Lb_HorMax ;
   private byte A7260PrdHorMad ;
   private byte A856ValCod ;
   private byte A6544Lb_PTinC ;
   private byte Z7261Lb_HorMax ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Z7260PrdHorMad ;
   private byte Z856ValCod ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i490ForPrdUMe ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z5556Lb_UltLC ;
   private short Z5557Lb_LineaC ;
   private short nRcdDeleted_820 ;
   private short nRcdExists_820 ;
   private short nIsMod_820 ;
   private short A5557Lb_LineaC ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount820 ;
   private short RcdFound820 ;
   private short nBlankRcdUsr820 ;
   private short A5556Lb_UltLC ;
   private short AV34fibracolorante ;
   private short AV32Moda21 ;
   private short RcdFound819 ;
   private short nIsDirty_819 ;
   private short nIsDirty_820 ;
   private short GXv_int14[] ;
   private int wcpOAV11Lb_numero ;
   private int Z5532Lb_numero ;
   private int nRC_GXsfl_99 ;
   private int nGXsfl_99_idx=1 ;
   private int Z6058Lb_soluc ;
   private int A5532Lb_numero ;
   private int AV11Lb_numero ;
   private int trnEnded ;
   private int edtLb_numero_Enabled ;
   private int edtLb_opcion_Enabled ;
   private int edtLb_Gots_Enabled ;
   private int edtLb_TaAuxC_Visible ;
   private int edtLb_TaAuxC_Enabled ;
   private int edtLb_famc1_Enabled ;
   private int edtLb_famc1_Visible ;
   private int edtLb_famc2_Enabled ;
   private int edtLb_famc2_Visible ;
   private int edtLb_famc3_Enabled ;
   private int edtLb_famc3_Visible ;
   private int bttBtnproductosvariables_Visible ;
   private int edtSumColor_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombolb_taauxc_Visible ;
   private int edtavCombolb_taauxc_Enabled ;
   private int edtavCombolb_famc1_Enabled ;
   private int edtavCombolb_famc1_Visible ;
   private int edtavCombolb_famc2_Enabled ;
   private int edtavCombolb_famc2_Visible ;
   private int edtavCombolb_famc3_Enabled ;
   private int edtavCombolb_famc3_Visible ;
   private int edtLb_LineaC_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtLB_CantC_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtPrdCtw1_Enabled ;
   private int edtPrdCtw2_Enabled ;
   private int edtPrdCtw3_Enabled ;
   private int edtPrdCtw4_Enabled ;
   private int edtLb_fibra_Enabled ;
   private int edtLb_fibra_Visible ;
   private int edtLb_PTinC_Enabled ;
   private int edtPrdGots_Enabled ;
   private int edtPrdGots_Visible ;
   private int edtPrdCtwSt_Enabled ;
   private int edtPrdCtwSt_Visible ;
   private int fRowAdded ;
   private int A6058Lb_soluc ;
   private int Combo_lb_taauxc_Datalistupdateminimumcharacters ;
   private int Combo_lb_famc1_Datalistupdateminimumcharacters ;
   private int Combo_lb_famc2_Datalistupdateminimumcharacters ;
   private int Combo_lb_famc3_Datalistupdateminimumcharacters ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_forprdume_Datalistupdateminimumcharacters ;
   private int AV37GXV1 ;
   private int GXv_int8[] ;
   private int GXv_int10[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtPrdCtw4_Enabled ;
   private int defedtPrdCtw3_Enabled ;
   private int defedtPrdCtw2_Enabled ;
   private int defedtPrdCtw1_Enabled ;
   private int defedtLb_LineaC_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV29Lb_Rb ;
   private java.math.BigDecimal Z5565Lb_CosteE ;
   private java.math.BigDecimal O6376SumColor ;
   private java.math.BigDecimal Z5558LB_CantC ;
   private java.math.BigDecimal O5558LB_CantC ;
   private java.math.BigDecimal AV29Lb_Rb ;
   private java.math.BigDecimal A6376SumColor ;
   private java.math.BigDecimal B6376SumColor ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal s6376SumColor ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal T5558LB_CantC ;
   private java.math.BigDecimal AV31Coste_cor ;
   private java.math.BigDecimal AV30Lb_costec ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal Z6376SumColor ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal i5565Lb_CosteE ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV12Lb_opcion ;
   private String Z396EmprCod ;
   private String Z5555Lb_opcion ;
   private String Z6310Lb_TaAuxC ;
   private String N6310Lb_TaAuxC ;
   private String Combo_lb_famc3_Selectedvalue_get ;
   private String Combo_lb_famc2_Selectedvalue_get ;
   private String Combo_lb_famc1_Selectedvalue_get ;
   private String Combo_lb_taauxc_Selectedvalue_get ;
   private String Z14096Lb_fibra ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String A6310Lb_TaAuxC ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String AV12Lb_opcion ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_numero_Internalname ;
   private String sGXsfl_99_idx="0001" ;
   private String edtForPrdUMe_Horizontalalignment ;
   private String edtForPrdUMe_Internalname ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_opcion_Jsonclick ;
   private String edtLb_Gots_Internalname ;
   private String A14088Lb_Gots ;
   private String edtLb_Gots_Jsonclick ;
   private String divDvpanel_unnamedtable3_cell_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Class ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedlb_taauxc_Internalname ;
   private String lblTextblocklb_taauxc_Internalname ;
   private String lblTextblocklb_taauxc_Jsonclick ;
   private String Combo_lb_taauxc_Caption ;
   private String Combo_lb_taauxc_Cls ;
   private String Combo_lb_taauxc_Internalname ;
   private String edtLb_TaAuxC_Internalname ;
   private String edtLb_TaAuxC_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedlb_famc1_Internalname ;
   private String lblTextblocklb_famc1_Internalname ;
   private String lblTextblocklb_famc1_Jsonclick ;
   private String Combo_lb_famc1_Caption ;
   private String Combo_lb_famc1_Cls ;
   private String Combo_lb_famc1_Internalname ;
   private String edtLb_famc1_Internalname ;
   private String edtLb_famc1_Jsonclick ;
   private String divTablesplittedlb_famc2_Internalname ;
   private String lblTextblocklb_famc2_Internalname ;
   private String lblTextblocklb_famc2_Jsonclick ;
   private String Combo_lb_famc2_Caption ;
   private String Combo_lb_famc2_Cls ;
   private String Combo_lb_famc2_Internalname ;
   private String edtLb_famc2_Internalname ;
   private String edtLb_famc2_Jsonclick ;
   private String divTablesplittedlb_famc3_Internalname ;
   private String lblTextblocklb_famc3_Internalname ;
   private String lblTextblocklb_famc3_Jsonclick ;
   private String Combo_lb_famc3_Caption ;
   private String Combo_lb_famc3_Cls ;
   private String Combo_lb_famc3_Internalname ;
   private String edtLb_famc3_Internalname ;
   private String edtLb_famc3_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnproductosvariables_Internalname ;
   private String bttBtnproductosvariables_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String edtSumColor_Internalname ;
   private String edtSumColor_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV36Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_lb_taauxc_Internalname ;
   private String edtavCombolb_taauxc_Internalname ;
   private String AV22ComboLb_TaAuxC ;
   private String edtavCombolb_taauxc_Jsonclick ;
   private String divSectionattribute_lb_famc1_Internalname ;
   private String edtavCombolb_famc1_Internalname ;
   private String edtavCombolb_famc1_Jsonclick ;
   private String divSectionattribute_lb_famc2_Internalname ;
   private String edtavCombolb_famc2_Internalname ;
   private String edtavCombolb_famc2_Jsonclick ;
   private String divSectionattribute_lb_famc3_Internalname ;
   private String edtavCombolb_famc3_Internalname ;
   private String edtavCombolb_famc3_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String Combo_forprdume_Caption ;
   private String Combo_forprdume_Cls ;
   private String Combo_forprdume_Internalname ;
   private String sMode820 ;
   private String edtLb_LineaC_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtLB_CantC_Internalname ;
   private String edtPrdCtw1_Internalname ;
   private String edtPrdCtw2_Internalname ;
   private String edtPrdCtw3_Internalname ;
   private String edtPrdCtw4_Internalname ;
   private String edtLb_fibra_Internalname ;
   private String edtLb_PTinC_Internalname ;
   private String edtPrdGots_Internalname ;
   private String edtPrdCtwSt_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV16Insert_Lb_TaAuxC ;
   private String A407EmprNom ;
   private String A6311Lb_TaAuxD ;
   private String A14094PrdFibra ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Combo_lb_taauxc_Objectcall ;
   private String Combo_lb_taauxc_Class ;
   private String Combo_lb_taauxc_Icontype ;
   private String Combo_lb_taauxc_Icon ;
   private String Combo_lb_taauxc_Tooltip ;
   private String Combo_lb_taauxc_Selectedvalue_set ;
   private String Combo_lb_taauxc_Selectedtext_set ;
   private String Combo_lb_taauxc_Selectedtext_get ;
   private String Combo_lb_taauxc_Gamoauthtoken ;
   private String Combo_lb_taauxc_Ddointernalname ;
   private String Combo_lb_taauxc_Titlecontrolalign ;
   private String Combo_lb_taauxc_Dropdownoptionstype ;
   private String Combo_lb_taauxc_Titlecontrolidtoreplace ;
   private String Combo_lb_taauxc_Datalisttype ;
   private String Combo_lb_taauxc_Datalistfixedvalues ;
   private String Combo_lb_taauxc_Datalistproc ;
   private String Combo_lb_taauxc_Datalistprocparametersprefix ;
   private String Combo_lb_taauxc_Remoteservicesparameters ;
   private String Combo_lb_taauxc_Htmltemplate ;
   private String Combo_lb_taauxc_Multiplevaluestype ;
   private String Combo_lb_taauxc_Loadingdata ;
   private String Combo_lb_taauxc_Noresultsfound ;
   private String Combo_lb_taauxc_Emptyitemtext ;
   private String Combo_lb_taauxc_Onlyselectedvalues ;
   private String Combo_lb_taauxc_Selectalltext ;
   private String Combo_lb_taauxc_Multiplevaluesseparator ;
   private String Combo_lb_taauxc_Addnewoptiontext ;
   private String Combo_lb_famc1_Objectcall ;
   private String Combo_lb_famc1_Class ;
   private String Combo_lb_famc1_Icontype ;
   private String Combo_lb_famc1_Icon ;
   private String Combo_lb_famc1_Tooltip ;
   private String Combo_lb_famc1_Selectedvalue_set ;
   private String Combo_lb_famc1_Selectedtext_set ;
   private String Combo_lb_famc1_Selectedtext_get ;
   private String Combo_lb_famc1_Gamoauthtoken ;
   private String Combo_lb_famc1_Ddointernalname ;
   private String Combo_lb_famc1_Titlecontrolalign ;
   private String Combo_lb_famc1_Dropdownoptionstype ;
   private String Combo_lb_famc1_Titlecontrolidtoreplace ;
   private String Combo_lb_famc1_Datalisttype ;
   private String Combo_lb_famc1_Datalistfixedvalues ;
   private String Combo_lb_famc1_Datalistproc ;
   private String Combo_lb_famc1_Datalistprocparametersprefix ;
   private String Combo_lb_famc1_Remoteservicesparameters ;
   private String Combo_lb_famc1_Htmltemplate ;
   private String Combo_lb_famc1_Multiplevaluestype ;
   private String Combo_lb_famc1_Loadingdata ;
   private String Combo_lb_famc1_Noresultsfound ;
   private String Combo_lb_famc1_Emptyitemtext ;
   private String Combo_lb_famc1_Onlyselectedvalues ;
   private String Combo_lb_famc1_Selectalltext ;
   private String Combo_lb_famc1_Multiplevaluesseparator ;
   private String Combo_lb_famc1_Addnewoptiontext ;
   private String Combo_lb_famc2_Objectcall ;
   private String Combo_lb_famc2_Class ;
   private String Combo_lb_famc2_Icontype ;
   private String Combo_lb_famc2_Icon ;
   private String Combo_lb_famc2_Tooltip ;
   private String Combo_lb_famc2_Selectedvalue_set ;
   private String Combo_lb_famc2_Selectedtext_set ;
   private String Combo_lb_famc2_Selectedtext_get ;
   private String Combo_lb_famc2_Gamoauthtoken ;
   private String Combo_lb_famc2_Ddointernalname ;
   private String Combo_lb_famc2_Titlecontrolalign ;
   private String Combo_lb_famc2_Dropdownoptionstype ;
   private String Combo_lb_famc2_Titlecontrolidtoreplace ;
   private String Combo_lb_famc2_Datalisttype ;
   private String Combo_lb_famc2_Datalistfixedvalues ;
   private String Combo_lb_famc2_Datalistproc ;
   private String Combo_lb_famc2_Datalistprocparametersprefix ;
   private String Combo_lb_famc2_Remoteservicesparameters ;
   private String Combo_lb_famc2_Htmltemplate ;
   private String Combo_lb_famc2_Multiplevaluestype ;
   private String Combo_lb_famc2_Loadingdata ;
   private String Combo_lb_famc2_Noresultsfound ;
   private String Combo_lb_famc2_Emptyitemtext ;
   private String Combo_lb_famc2_Onlyselectedvalues ;
   private String Combo_lb_famc2_Selectalltext ;
   private String Combo_lb_famc2_Multiplevaluesseparator ;
   private String Combo_lb_famc2_Addnewoptiontext ;
   private String Combo_lb_famc3_Objectcall ;
   private String Combo_lb_famc3_Class ;
   private String Combo_lb_famc3_Icontype ;
   private String Combo_lb_famc3_Icon ;
   private String Combo_lb_famc3_Tooltip ;
   private String Combo_lb_famc3_Selectedvalue_set ;
   private String Combo_lb_famc3_Selectedtext_set ;
   private String Combo_lb_famc3_Selectedtext_get ;
   private String Combo_lb_famc3_Gamoauthtoken ;
   private String Combo_lb_famc3_Ddointernalname ;
   private String Combo_lb_famc3_Titlecontrolalign ;
   private String Combo_lb_famc3_Dropdownoptionstype ;
   private String Combo_lb_famc3_Titlecontrolidtoreplace ;
   private String Combo_lb_famc3_Datalisttype ;
   private String Combo_lb_famc3_Datalistfixedvalues ;
   private String Combo_lb_famc3_Datalistproc ;
   private String Combo_lb_famc3_Datalistprocparametersprefix ;
   private String Combo_lb_famc3_Remoteservicesparameters ;
   private String Combo_lb_famc3_Htmltemplate ;
   private String Combo_lb_famc3_Multiplevaluestype ;
   private String Combo_lb_famc3_Loadingdata ;
   private String Combo_lb_famc3_Noresultsfound ;
   private String Combo_lb_famc3_Emptyitemtext ;
   private String Combo_lb_famc3_Onlyselectedvalues ;
   private String Combo_lb_famc3_Selectalltext ;
   private String Combo_lb_famc3_Multiplevaluesseparator ;
   private String Combo_lb_famc3_Addnewoptiontext ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Combo_forprdume_Objectcall ;
   private String Combo_forprdume_Class ;
   private String Combo_forprdume_Icontype ;
   private String Combo_forprdume_Icon ;
   private String Combo_forprdume_Tooltip ;
   private String Combo_forprdume_Selectedvalue_set ;
   private String Combo_forprdume_Selectedvalue_get ;
   private String Combo_forprdume_Selectedtext_set ;
   private String Combo_forprdume_Selectedtext_get ;
   private String Combo_forprdume_Gamoauthtoken ;
   private String Combo_forprdume_Ddointernalname ;
   private String Combo_forprdume_Titlecontrolalign ;
   private String Combo_forprdume_Dropdownoptionstype ;
   private String Combo_forprdume_Titlecontrolidtoreplace ;
   private String Combo_forprdume_Datalisttype ;
   private String Combo_forprdume_Datalistfixedvalues ;
   private String Combo_forprdume_Datalistproc ;
   private String Combo_forprdume_Datalistprocparametersprefix ;
   private String Combo_forprdume_Remoteservicesparameters ;
   private String Combo_forprdume_Htmltemplate ;
   private String Combo_forprdume_Multiplevaluestype ;
   private String Combo_forprdume_Loadingdata ;
   private String Combo_forprdume_Noresultsfound ;
   private String Combo_forprdume_Emptyitemtext ;
   private String Combo_forprdume_Onlyselectedvalues ;
   private String Combo_forprdume_Selectalltext ;
   private String Combo_forprdume_Multiplevaluesseparator ;
   private String Combo_forprdume_Addnewoptiontext ;
   private String hsh ;
   private String sMode819 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11663PrdCtw4 ;
   private String A14096Lb_fibra ;
   private String A11363PrdGots ;
   private String AV7Station ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String Z407EmprNom ;
   private String Z14088Lb_Gots ;
   private String Z6311Lb_TaAuxD ;
   private String Z718PrdNom ;
   private String Z11663PrdCtw4 ;
   private String Z10938PrdCtw3 ;
   private String Z10937PrdCtw2 ;
   private String Z10936PrdCtw1 ;
   private String Z11363PrdGots ;
   private String Z14094PrdFibra ;
   private String Z488ForPrdDsc ;
   private String sGXsfl_99_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtLb_LineaC_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtLB_CantC_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw4_Jsonclick ;
   private String edtLb_fibra_Jsonclick ;
   private String edtLb_PTinC_Jsonclick ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdCtwSt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6310Lb_TaAuxC ;
   private boolean wbErr ;
   private boolean bGXsfl_99_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
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
   private boolean Combo_lb_taauxc_Emptyitem ;
   private boolean Combo_lb_famc1_Emptyitem ;
   private boolean Combo_lb_famc2_Emptyitem ;
   private boolean Combo_lb_famc3_Emptyitem ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_forprdume_Isgriditem ;
   private boolean Combo_forprdume_Emptyitem ;
   private boolean n6376SumColor ;
   private boolean n407EmprNom ;
   private boolean n7261Lb_HorMax ;
   private boolean n14094PrdFibra ;
   private boolean n488ForPrdDsc ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Combo_lb_taauxc_Enabled ;
   private boolean Combo_lb_taauxc_Visible ;
   private boolean Combo_lb_taauxc_Allowmultipleselection ;
   private boolean Combo_lb_taauxc_Isgriditem ;
   private boolean Combo_lb_taauxc_Hasdescription ;
   private boolean Combo_lb_taauxc_Includeonlyselectedoption ;
   private boolean Combo_lb_taauxc_Includeselectalloption ;
   private boolean Combo_lb_taauxc_Includeaddnewoption ;
   private boolean Combo_lb_famc1_Enabled ;
   private boolean Combo_lb_famc1_Visible ;
   private boolean Combo_lb_famc1_Allowmultipleselection ;
   private boolean Combo_lb_famc1_Isgriditem ;
   private boolean Combo_lb_famc1_Hasdescription ;
   private boolean Combo_lb_famc1_Includeonlyselectedoption ;
   private boolean Combo_lb_famc1_Includeselectalloption ;
   private boolean Combo_lb_famc1_Includeaddnewoption ;
   private boolean Combo_lb_famc2_Enabled ;
   private boolean Combo_lb_famc2_Visible ;
   private boolean Combo_lb_famc2_Allowmultipleselection ;
   private boolean Combo_lb_famc2_Isgriditem ;
   private boolean Combo_lb_famc2_Hasdescription ;
   private boolean Combo_lb_famc2_Includeonlyselectedoption ;
   private boolean Combo_lb_famc2_Includeselectalloption ;
   private boolean Combo_lb_famc2_Includeaddnewoption ;
   private boolean Combo_lb_famc3_Enabled ;
   private boolean Combo_lb_famc3_Visible ;
   private boolean Combo_lb_famc3_Allowmultipleselection ;
   private boolean Combo_lb_famc3_Isgriditem ;
   private boolean Combo_lb_famc3_Hasdescription ;
   private boolean Combo_lb_famc3_Includeonlyselectedoption ;
   private boolean Combo_lb_famc3_Includeselectalloption ;
   private boolean Combo_lb_famc3_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Combo_forprdume_Enabled ;
   private boolean Combo_forprdume_Visible ;
   private boolean Combo_forprdume_Allowmultipleselection ;
   private boolean Combo_forprdume_Hasdescription ;
   private boolean Combo_forprdume_Includeonlyselectedoption ;
   private boolean Combo_forprdume_Includeselectalloption ;
   private boolean Combo_forprdume_Includeaddnewoption ;
   private boolean n14088Lb_Gots ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A14097PrdCtwSt ;
   private String AV19ComboSelectedValue ;
   private String Z14097PrdCtwSt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_taauxc ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_famc1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_famc2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_famc3 ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_forprdume ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SV8_A407EmprNom ;
   private boolean[] T01SV8_n407EmprNom ;
   private byte[] T01SV12_A7261Lb_HorMax ;
   private boolean[] T01SV12_n7261Lb_HorMax ;
   private String[] T01SV9_A14088Lb_Gots ;
   private boolean[] T01SV9_n14088Lb_Gots ;
   private java.math.BigDecimal[] T01SV14_A6376SumColor ;
   private boolean[] T01SV14_n6376SumColor ;
   private String[] T01SV10_A6311Lb_TaAuxD ;
   private String[] T01SV17_A5555Lb_opcion ;
   private byte[] T01SV17_A6373Lb_famc1 ;
   private byte[] T01SV17_A6374Lb_famc2 ;
   private byte[] T01SV17_A6375Lb_famc3 ;
   private String[] T01SV17_A407EmprNom ;
   private boolean[] T01SV17_n407EmprNom ;
   private String[] T01SV17_A14088Lb_Gots ;
   private boolean[] T01SV17_n14088Lb_Gots ;
   private java.math.BigDecimal[] T01SV17_A5565Lb_CosteE ;
   private short[] T01SV17_A5556Lb_UltLC ;
   private byte[] T01SV17_A5718Lb_numop ;
   private String[] T01SV17_A6311Lb_TaAuxD ;
   private byte[] T01SV17_A8622Lb_IntCod ;
   private String[] T01SV17_A396EmprCod ;
   private int[] T01SV17_A5532Lb_numero ;
   private String[] T01SV17_A6310Lb_TaAuxC ;
   private boolean[] T01SV17_n6310Lb_TaAuxC ;
   private java.math.BigDecimal[] T01SV17_A6376SumColor ;
   private boolean[] T01SV17_n6376SumColor ;
   private byte[] T01SV17_A7261Lb_HorMax ;
   private boolean[] T01SV17_n7261Lb_HorMax ;
   private String[] T01SV18_A14088Lb_Gots ;
   private boolean[] T01SV18_n14088Lb_Gots ;
   private String[] T01SV19_A6311Lb_TaAuxD ;
   private java.math.BigDecimal[] T01SV21_A6376SumColor ;
   private boolean[] T01SV21_n6376SumColor ;
   private String[] T01SV22_A396EmprCod ;
   private int[] T01SV22_A5532Lb_numero ;
   private String[] T01SV22_A5555Lb_opcion ;
   private String[] T01SV7_A5555Lb_opcion ;
   private byte[] T01SV7_A6373Lb_famc1 ;
   private byte[] T01SV7_A6374Lb_famc2 ;
   private byte[] T01SV7_A6375Lb_famc3 ;
   private java.math.BigDecimal[] T01SV7_A5565Lb_CosteE ;
   private short[] T01SV7_A5556Lb_UltLC ;
   private byte[] T01SV7_A5718Lb_numop ;
   private byte[] T01SV7_A8622Lb_IntCod ;
   private String[] T01SV7_A396EmprCod ;
   private int[] T01SV7_A5532Lb_numero ;
   private String[] T01SV7_A6310Lb_TaAuxC ;
   private boolean[] T01SV7_n6310Lb_TaAuxC ;
   private String[] T01SV23_A396EmprCod ;
   private int[] T01SV23_A5532Lb_numero ;
   private String[] T01SV23_A5555Lb_opcion ;
   private String[] T01SV24_A396EmprCod ;
   private int[] T01SV24_A5532Lb_numero ;
   private String[] T01SV24_A5555Lb_opcion ;
   private String[] T01SV6_A5555Lb_opcion ;
   private byte[] T01SV6_A6373Lb_famc1 ;
   private byte[] T01SV6_A6374Lb_famc2 ;
   private byte[] T01SV6_A6375Lb_famc3 ;
   private java.math.BigDecimal[] T01SV6_A5565Lb_CosteE ;
   private short[] T01SV6_A5556Lb_UltLC ;
   private byte[] T01SV6_A5718Lb_numop ;
   private byte[] T01SV6_A8622Lb_IntCod ;
   private String[] T01SV6_A396EmprCod ;
   private int[] T01SV6_A5532Lb_numero ;
   private String[] T01SV6_A6310Lb_TaAuxC ;
   private boolean[] T01SV6_n6310Lb_TaAuxC ;
   private String[] T01SV28_A14088Lb_Gots ;
   private boolean[] T01SV28_n14088Lb_Gots ;
   private String[] T01SV29_A6311Lb_TaAuxD ;
   private java.math.BigDecimal[] T01SV31_A6376SumColor ;
   private boolean[] T01SV31_n6376SumColor ;
   private String[] T01SV32_A396EmprCod ;
   private int[] T01SV32_A5532Lb_numero ;
   private String[] T01SV32_A5555Lb_opcion ;
   private short[] T01SV32_A13460Lb_linCP ;
   private String[] T01SV32_A13458Lb_TipCP ;
   private String[] T01SV33_A396EmprCod ;
   private int[] T01SV33_A5532Lb_numero ;
   private String[] T01SV33_A5555Lb_opcion ;
   private short[] T01SV33_A5560Lb_LineaPr ;
   private String[] T01SV34_A396EmprCod ;
   private int[] T01SV34_A5532Lb_numero ;
   private String[] T01SV34_A5555Lb_opcion ;
   private String[] T01SV5_A488ForPrdDsc ;
   private boolean[] T01SV5_n488ForPrdDsc ;
   private int[] T01SV35_A5532Lb_numero ;
   private String[] T01SV35_A5555Lb_opcion ;
   private short[] T01SV35_A5557Lb_LineaC ;
   private String[] T01SV35_A14096Lb_fibra ;
   private String[] T01SV35_A718PrdNom ;
   private String[] T01SV35_A488ForPrdDsc ;
   private boolean[] T01SV35_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01SV35_A5558LB_CantC ;
   private int[] T01SV35_A6058Lb_soluc ;
   private byte[] T01SV35_A6544Lb_PTinC ;
   private byte[] T01SV35_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01SV35_A724PrdPreAct ;
   private String[] T01SV35_A11663PrdCtw4 ;
   private String[] T01SV35_A10938PrdCtw3 ;
   private String[] T01SV35_A10937PrdCtw2 ;
   private String[] T01SV35_A10936PrdCtw1 ;
   private String[] T01SV35_A11363PrdGots ;
   private String[] T01SV35_A14094PrdFibra ;
   private boolean[] T01SV35_n14094PrdFibra ;
   private String[] T01SV35_A396EmprCod ;
   private String[] T01SV35_A719PrdNum ;
   private byte[] T01SV35_A490ForPrdUMe ;
   private byte[] T01SV35_A856ValCod ;
   private String[] T01SV4_A718PrdNom ;
   private byte[] T01SV4_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01SV4_A724PrdPreAct ;
   private String[] T01SV4_A11663PrdCtw4 ;
   private String[] T01SV4_A10938PrdCtw3 ;
   private String[] T01SV4_A10937PrdCtw2 ;
   private String[] T01SV4_A10936PrdCtw1 ;
   private String[] T01SV4_A11363PrdGots ;
   private String[] T01SV4_A14094PrdFibra ;
   private boolean[] T01SV4_n14094PrdFibra ;
   private byte[] T01SV4_A856ValCod ;
   private String[] T01SV36_A718PrdNom ;
   private byte[] T01SV36_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01SV36_A724PrdPreAct ;
   private String[] T01SV36_A11663PrdCtw4 ;
   private String[] T01SV36_A10938PrdCtw3 ;
   private String[] T01SV36_A10937PrdCtw2 ;
   private String[] T01SV36_A10936PrdCtw1 ;
   private String[] T01SV36_A11363PrdGots ;
   private String[] T01SV36_A14094PrdFibra ;
   private boolean[] T01SV36_n14094PrdFibra ;
   private byte[] T01SV36_A856ValCod ;
   private String[] T01SV37_A488ForPrdDsc ;
   private boolean[] T01SV37_n488ForPrdDsc ;
   private String[] T01SV38_A396EmprCod ;
   private int[] T01SV38_A5532Lb_numero ;
   private String[] T01SV38_A5555Lb_opcion ;
   private short[] T01SV38_A5557Lb_LineaC ;
   private int[] T01SV3_A5532Lb_numero ;
   private String[] T01SV3_A5555Lb_opcion ;
   private short[] T01SV3_A5557Lb_LineaC ;
   private String[] T01SV3_A14096Lb_fibra ;
   private java.math.BigDecimal[] T01SV3_A5558LB_CantC ;
   private int[] T01SV3_A6058Lb_soluc ;
   private byte[] T01SV3_A6544Lb_PTinC ;
   private String[] T01SV3_A396EmprCod ;
   private String[] T01SV3_A719PrdNum ;
   private byte[] T01SV3_A490ForPrdUMe ;
   private int[] T01SV2_A5532Lb_numero ;
   private String[] T01SV2_A5555Lb_opcion ;
   private short[] T01SV2_A5557Lb_LineaC ;
   private String[] T01SV2_A14096Lb_fibra ;
   private java.math.BigDecimal[] T01SV2_A5558LB_CantC ;
   private int[] T01SV2_A6058Lb_soluc ;
   private byte[] T01SV2_A6544Lb_PTinC ;
   private String[] T01SV2_A396EmprCod ;
   private String[] T01SV2_A719PrdNum ;
   private byte[] T01SV2_A490ForPrdUMe ;
   private String[] T01SV42_A718PrdNom ;
   private byte[] T01SV42_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01SV42_A724PrdPreAct ;
   private String[] T01SV42_A11663PrdCtw4 ;
   private String[] T01SV42_A10938PrdCtw3 ;
   private String[] T01SV42_A10937PrdCtw2 ;
   private String[] T01SV42_A10936PrdCtw1 ;
   private String[] T01SV42_A11363PrdGots ;
   private String[] T01SV42_A14094PrdFibra ;
   private boolean[] T01SV42_n14094PrdFibra ;
   private byte[] T01SV42_A856ValCod ;
   private String[] T01SV43_A488ForPrdDsc ;
   private boolean[] T01SV43_n488ForPrdDsc ;
   private String[] T01SV44_A396EmprCod ;
   private int[] T01SV44_A5532Lb_numero ;
   private String[] T01SV44_A5555Lb_opcion ;
   private short[] T01SV44_A5557Lb_LineaC ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV21Lb_TaAuxC_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23Lb_famc1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV25Lb_famc2_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27Lb_famc3_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20ForPrdUMe_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV17TrnContextAtt ;
}

final  class entradaensayolaboratorio_colorantes_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_colorantes_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_colorantes_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_colorantes_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_colorantes_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SV2", "SELECT Lb_numero, Lb_opcion, Lb_LineaC, Lb_fibra, LB_CantC, Lb_soluc, Lb_PTinC, EmprCod, PrdNum, ForPrdUMe FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?  FOR UPDATE OF Lb_fibra, LB_CantC, Lb_soluc, Lb_PTinC, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV3", "SELECT Lb_numero, Lb_opcion, Lb_LineaC, Lb_fibra, LB_CantC, Lb_soluc, Lb_PTinC, EmprCod, PrdNum, ForPrdUMe FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV4", "SELECT PrdNom, PrdHorMad, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, PrdFibra, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV6", "SELECT Lb_opcion, Lb_famc1, Lb_famc2, Lb_famc3, Lb_CosteE, Lb_UltLC, Lb_numop, Lb_IntCod, EmprCod, Lb_numero, Lb_TaAuxC FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?  FOR UPDATE OF Lb_famc1, Lb_famc2, Lb_famc3, Lb_CosteE, Lb_UltLC, Lb_numop, Lb_IntCod, Lb_TaAuxC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV7", "SELECT Lb_opcion, Lb_famc1, Lb_famc2, Lb_famc3, Lb_CosteE, Lb_UltLC, Lb_numop, Lb_IntCod, EmprCod, Lb_numero, Lb_TaAuxC FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV9", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV10", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV12", "SELECT COALESCE( T1.Lb_HorMax, 0) AS Lb_HorMax FROM (SELECT MAX(PrdHorMad) AS Lb_HorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV14", "SELECT COALESCE( T1.SumColor, 0) AS SumColor FROM (SELECT SUM(LB_CantC) AS SumColor, EmprCod, Lb_numero, Lb_opcion FROM TXPENS003 GROUP BY EmprCod, Lb_numero, Lb_opcion ) T1 WHERE T1.EmprCod = ? AND T1.Lb_numero = ? AND T1.Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV17", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_opcion, TM1.Lb_famc1, TM1.Lb_famc2, TM1.Lb_famc3, T2.EmprNom, T4.Lb_Gots, TM1.Lb_CosteE, TM1.Lb_UltLC, TM1.Lb_numop, T6.Lb_TaAuxD, TM1.Lb_IntCod, TM1.EmprCod, TM1.Lb_numero, TM1.Lb_TaAuxC, COALESCE( T5.SumColor, 0) AS SumColor, COALESCE( T3.Lb_HorMax, 0) AS Lb_HorMax FROM (((((TXPENS002 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(PrdHorMad) AS Lb_HorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T3 ON T3.EmprCod = TM1.EmprCod) INNER JOIN TXPENS001 T4 ON T4.EmprCod = TM1.EmprCod AND T4.Lb_numero = TM1.Lb_numero) LEFT JOIN (SELECT SUM(LB_CantC) AS SumColor, EmprCod, Lb_numero, Lb_opcion FROM TXPENS003 GROUP BY EmprCod, Lb_numero, Lb_opcion ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.Lb_numero = TM1.Lb_numero AND T5.Lb_opcion = TM1.Lb_opcion) LEFT JOIN TXPENS005 T6 ON T6.EmprCod = TM1.EmprCod AND T6.Lb_TaAuxC = TM1.Lb_TaAuxC) WHERE TM1.EmprCod = ? and TM1.Lb_numero = ? and TM1.Lb_opcion = ? ORDER BY TM1.EmprCod, TM1.Lb_numero, TM1.Lb_opcion ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV18", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV19", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV21", "SELECT COALESCE( T1.SumColor, 0) AS SumColor FROM (SELECT SUM(LB_CantC) AS SumColor, EmprCod, Lb_numero, Lb_opcion FROM TXPENS003 GROUP BY EmprCod, Lb_numero, Lb_opcion ) T1 WHERE T1.EmprCod = ? AND T1.Lb_numero = ? AND T1.Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE ( EmprCod > ? or EmprCod = ? and Lb_numero > ? or Lb_numero = ? and EmprCod = ? and Lb_opcion > ?) ORDER BY EmprCod, Lb_numero, Lb_opcion) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SV24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE ( EmprCod < ? or EmprCod = ? and Lb_numero < ? or Lb_numero = ? and EmprCod = ? and Lb_opcion < ?) ORDER BY EmprCod DESC, Lb_numero DESC, Lb_opcion DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SV25", "INSERT INTO TXPENS002(Lb_opcion, Lb_famc1, Lb_famc2, Lb_famc3, Lb_CosteE, Lb_UltLC, Lb_numop, Lb_IntCod, EmprCod, Lb_numero, Lb_TaAuxC, Lb_UltlP, Lb_FechaR, Lb_HoraR, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_PreKg, Lb_FecPre, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_opSt, Lb_opFc, Lb_ObsFac, Lb_UltLinC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK, "TXPENS002")
         ,new UpdateCursor("T01SV26", "UPDATE TXPENS002 SET Lb_famc1=?, Lb_famc2=?, Lb_famc3=?, Lb_CosteE=?, Lb_UltLC=?, Lb_numop=?, Lb_IntCod=?, Lb_TaAuxC=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK, "TXPENS002")
         ,new UpdateCursor("T01SV27", "DELETE FROM TXPENS002  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK, "TXPENS002")
         ,new ForEachCursor("T01SV28", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV29", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV31", "SELECT COALESCE( T1.SumColor, 0) AS SumColor FROM (SELECT SUM(LB_CantC) AS SumColor, EmprCod, Lb_numero, Lb_opcion FROM TXPENS003 GROUP BY EmprCod, Lb_numero, Lb_opcion ) T1 WHERE T1.EmprCod = ? AND T1.Lb_numero = ? AND T1.Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV32", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SV33", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SV34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV35", "SELECT T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC, T1.Lb_fibra, T2.PrdNom, T3.ForPrdDsc, T1.LB_CantC, T1.Lb_soluc, T1.Lb_PTinC, T2.PrdHorMad, T2.PrdPreAct, T2.PrdCtw4, T2.PrdCtw3, T2.PrdCtw2, T2.PrdCtw1, T2.PrdGots, T2.PrdFibra, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ValCod FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? and T1.Lb_LineaC = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",true, GX_NOMASK, false, this,7, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV36", "SELECT PrdNom, PrdHorMad, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, PrdFibra, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV37", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV38", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SV39", "INSERT INTO TXPENS003(Lb_numero, Lb_opcion, Lb_LineaC, Lb_fibra, LB_CantC, Lb_soluc, Lb_PTinC, EmprCod, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS003")
         ,new UpdateCursor("T01SV40", "UPDATE TXPENS003 SET Lb_fibra=?, LB_CantC=?, Lb_soluc=?, Lb_PTinC=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?", GX_NOMASK, "TXPENS003")
         ,new UpdateCursor("T01SV41", "DELETE FROM TXPENS003  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?", GX_NOMASK, "TXPENS003")
         ,new ForEachCursor("T01SV42", "SELECT PrdNom, PrdHorMad, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, PrdFibra, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV43", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SV44", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",true, GX_NOMASK, false, this,7, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 60);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((String[]) buf[17])[0] = rslt.getString(17, 4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((String[]) buf[20])[0] = rslt.getString(19, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 4);
               }
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 4);
               }
               stmt.setString(9, (String)parms[9], 3);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 31 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

