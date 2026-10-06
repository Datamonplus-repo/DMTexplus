package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_productovariable_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5560Lb_LineaPr = (short)(GXutil.lval( httpContext.GetPar( "Lb_LineaPr"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_1SW821( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, A5560Lb_LineaPr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"PRDCTWST") == 0 )
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
         gx10asaprdctwst1SW821( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
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
         gxload_16( A396EmprCod, A5532Lb_numero) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
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
         gxload_18( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
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
         gxload_19( A396EmprCod, A490ForPrdUMe) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_producto") == 0 )
      {
         gxnrgridlevel_producto_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Ensayo Laboratorio (Producto variable)", ""), (short)(0)) ;
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

   public void gxnrgridlevel_producto_newrow_invoke( )
   {
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
      edtForPrdUMe_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_37_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_producto_newrow( ) ;
      /* End function gxnrGridlevel_producto_newrow_invoke */
   }

   public entradaensayolaboratorio_productovariable_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratorio_productovariable_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_productovariable_trn_impl.class ));
   }

   public entradaensayolaboratorio_productovariable_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_numero_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_numero_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productovariable_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_opcion_Internalname, GXutil.rtrim( A5555Lb_opcion), GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_opcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_opcion_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productovariable_TRN.htm");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_producto_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_producto( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productovariable_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productovariable_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productovariable_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productovariable_TRN.htm");
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
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV16PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* User Defined Control */
      ucCombo_forprdume.setProperty("Caption", Combo_forprdume_Caption);
      ucCombo_forprdume.setProperty("Cls", Combo_forprdume_Cls);
      ucCombo_forprdume.setProperty("IsGridItem", Combo_forprdume_Isgriditem);
      ucCombo_forprdume.setProperty("EmptyItem", Combo_forprdume_Emptyitem);
      ucCombo_forprdume.setProperty("DropDownOptionsData", AV18ForPrdUMe_Data);
      ucCombo_forprdume.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_forprdume_Internalname, "COMBO_FORPRDUMEContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_producto( )
   {
      /*  Grid Control  */
      startgridcontrol37( ) ;
      nGXsfl_37_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount821 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_821 = (short)(1) ;
            scanStart1SW821( ) ;
            while ( RcdFound821 != 0 )
            {
               init_level_properties821( ) ;
               getByPrimaryKey1SW821( ) ;
               addRow1SW821( ) ;
               scanNext1SW821( ) ;
            }
            scanEnd1SW821( ) ;
            nBlankRcdCount821 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1SW821( ) ;
         standaloneModal1SW821( ) ;
         sMode821 = Gx_mode ;
         while ( nGXsfl_37_idx < nRC_GXsfl_37 )
         {
            bGXsfl_37_Refreshing = true ;
            readRow1SW821( ) ;
            edtLb_LineaPr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAPR_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaPr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            edtLB_CantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_CANTP_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLB_CantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLB_CantP_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_37_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_37_Refreshing);
            edtLb_orden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_ORDEN_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_orden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_orden_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            edtLb_PTinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_PTINP_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_PTinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PTinP_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            edtPrdCtwSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTWST_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), !bGXsfl_37_Refreshing);
            imgprompt_5562_Link = httpContext.cgiGet( "PROMPT_5562_"+sGXsfl_37_idx+"Link") ;
            if ( ( nRcdExists_821 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1SW821( ) ;
            }
            sendRow1SW821( ) ;
            bGXsfl_37_Refreshing = false ;
         }
         Gx_mode = sMode821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount821 = (short)(1) ;
         nRcdExists_821 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1SW821( ) ;
            while ( RcdFound821 != 0 )
            {
               sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_37821( ) ;
               init_level_properties821( ) ;
               standaloneNotModal1SW821( ) ;
               getByPrimaryKey1SW821( ) ;
               standaloneModal1SW821( ) ;
               addRow1SW821( ) ;
               scanNext1SW821( ) ;
            }
            scanEnd1SW821( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode821 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_37821( ) ;
         initAll1SW821( ) ;
         init_level_properties821( ) ;
         nRcdExists_821 = (short)(0) ;
         nIsMod_821 = (short)(0) ;
         nRcdDeleted_821 = (short)(0) ;
         nBlankRcdCount821 = (short)(nBlankRcdUsr821+nBlankRcdCount821) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount821 > 0 )
         {
            standaloneNotModal1SW821( ) ;
            standaloneModal1SW821( ) ;
            addRow1SW821( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtLb_LineaPr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount821 = (short)(nBlankRcdCount821-1) ;
         }
         Gx_mode = sMode821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_productoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_producto", Gridlevel_productoContainer, subGridlevel_producto_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productoContainerData", Gridlevel_productoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_productoContainerData"+"V", Gridlevel_productoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_productoContainerData"+"V"+"\" value='"+Gridlevel_productoContainer.GridValuesHidden()+"'/>") ;
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
      e111SW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV16PrdNum_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFORPRDUME_DATA"), AV18ForPrdUMe_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z5532Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5555Lb_opcion = httpContext.cgiGet( "Z5555Lb_opcion") ;
            Z5559Lb_UltlP = (short)(localUtil.ctol( httpContext.cgiGet( "Z5559Lb_UltlP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5559Lb_UltlP = (short)(localUtil.ctol( httpContext.cgiGet( "Z5559Lb_UltlP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV11Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "vLB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Lb_opcion = httpContext.cgiGet( "vLB_OPCION") ;
            A5559Lb_UltlP = (short)(localUtil.ctol( httpContext.cgiGet( "LB_ULTLP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A14088Lb_Gots = httpContext.cgiGet( "LB_GOTS") ;
            n14088Lb_Gots = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6059Lb_solup = (int)(localUtil.ctol( httpContext.cgiGet( "LB_SOLUP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            A11663PrdCtw4 = httpContext.cgiGet( "PRDCTW4") ;
            A10938PrdCtw3 = httpContext.cgiGet( "PRDCTW3") ;
            A10937PrdCtw2 = httpContext.cgiGet( "PRDCTW2") ;
            A10936PrdCtw1 = httpContext.cgiGet( "PRDCTW1") ;
            A11363PrdGots = httpContext.cgiGet( "PRDGOTS") ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
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
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Productovariable_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("Lb_UltlP", localUtil.format( DecimalUtil.doubleToDec(A5559Lb_UltlP), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratorio_productovariable_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1SW0( ) ;
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
                        e111SW2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SW2 ();
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
         e121SW2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SW819( ) ;
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
         disableAttributes1SW819( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1SW0( )
   {
      beforeValidate1SW819( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SW819( ) ;
         }
         else
         {
            checkExtendedTable1SW819( ) ;
            closeExtendedTableCursors1SW819( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode819 = Gx_mode ;
         confirm_1SW821( ) ;
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

   public void confirm_1SW821( )
   {
      nGXsfl_37_idx = 0 ;
      while ( nGXsfl_37_idx < nRC_GXsfl_37 )
      {
         readRow1SW821( ) ;
         if ( ( nRcdExists_821 != 0 ) || ( nIsMod_821 != 0 ) )
         {
            getKey1SW821( ) ;
            if ( ( nRcdExists_821 == 0 ) && ( nRcdDeleted_821 == 0 ) )
            {
               if ( RcdFound821 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1SW821( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1SW821( ) ;
                     closeExtendedTableCursors1SW821( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LB_LINEAPR_" + sGXsfl_37_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_LineaPr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound821 != 0 )
               {
                  if ( nRcdDeleted_821 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1SW821( ) ;
                     load1SW821( ) ;
                     beforeValidate1SW821( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1SW821( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_821 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1SW821( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1SW821( ) ;
                           closeExtendedTableCursors1SW821( ) ;
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
                  if ( nRcdDeleted_821 == 0 )
                  {
                     GXCCtl = "LB_LINEAPR_" + sGXsfl_37_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_LineaPr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_LineaPr_Internalname, GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLB_CantP_Internalname, GXutil.ltrim( localUtil.ntoc( A5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_orden_Internalname, GXutil.ltrim( localUtil.ntoc( A5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_PTinP_Internalname, GXutil.ltrim( localUtil.ntoc( A6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCtwSt_Internalname, A14097PrdCtwSt) ;
         httpContext.changePostValue( "ZT_"+"Z5560Lb_LineaPr_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5561LB_CantP_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5562Lb_orden_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6059Lb_solup_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z6059Lb_solup, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6545Lb_PTinP_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_37_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_821_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_821_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_821_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_821 != 0 )
         {
            httpContext.changePostValue( "LB_LINEAPR_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaPr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_CANTP_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_37_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "LB_ORDEN_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_orden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_PTINP_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTWST_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1SW0( )
   {
   }

   public void e111SW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A396EmprCod = GXv_char2[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV10EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV9UsurCod = GXv_char2[0] ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_37_Refreshing);
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
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
      S122 ();
      if ( returnInSub )
      {
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
   }

   public void e121SW2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADCOMBOFORPRDUME' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV18ForPrdUMe_Data ;
      GXv_char4[0] = AV17ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trnloaddvcombo(remoteHandle, context).execute( "ForPrdUMe", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV17ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV18ForPrdUMe_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV16PrdNum_Data ;
      GXv_char4[0] = AV17ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trnloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV10EmprCod, AV11Lb_numero, AV12Lb_opcion, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.AV17ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV16PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1SW819( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5559Lb_UltlP = T01SW7_A5559Lb_UltlP[0] ;
         }
         else
         {
            Z5559Lb_UltlP = A5559Lb_UltlP ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5559Lb_UltlP = A5559Lb_UltlP ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z407EmprNom = A407EmprNom ;
         Z14088Lb_Gots = A14088Lb_Gots ;
      }
   }

   public void standaloneNotModal( )
   {
      AV21Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productovariable_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01SW8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01SW8_A407EmprNom[0] ;
      n407EmprNom = T01SW8_n407EmprNom[0] ;
      pr_default.close(6);
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
   }

   public void standaloneModal( )
   {
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01SW9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         A14088Lb_Gots = T01SW9_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01SW9_n14088Lb_Gots[0] ;
         pr_default.close(7);
      }
   }

   public void load1SW819( )
   {
      /* Using cursor T01SW10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A407EmprNom = T01SW10_A407EmprNom[0] ;
         n407EmprNom = T01SW10_n407EmprNom[0] ;
         A14088Lb_Gots = T01SW10_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01SW10_n14088Lb_Gots[0] ;
         A5559Lb_UltlP = T01SW10_A5559Lb_UltlP[0] ;
         zm1SW819( -14) ;
      }
      pr_default.close(8);
      onLoadActions1SW819( ) ;
   }

   public void onLoadActions1SW819( )
   {
   }

   public void checkExtendedTable1SW819( )
   {
      nIsDirty_819 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01SW9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14088Lb_Gots = T01SW9_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01SW9_n14088Lb_Gots[0] ;
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1SW819( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          int A5532Lb_numero )
   {
      /* Using cursor T01SW11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14088Lb_Gots = T01SW11_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01SW11_n14088Lb_Gots[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14088Lb_Gots))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1SW819( )
   {
      /* Using cursor T01SW12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound819 = (short)(1) ;
      }
      else
      {
         RcdFound819 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SW7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01SW7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SW819( 14) ;
         RcdFound819 = (short)(1) ;
         A5555Lb_opcion = T01SW7_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5559Lb_UltlP = T01SW7_A5559Lb_UltlP[0] ;
         A5532Lb_numero = T01SW7_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         sMode819 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SW819( ) ;
         if ( AnyError == 1 )
         {
            RcdFound819 = (short)(0) ;
            initializeNonKey1SW819( ) ;
         }
         Gx_mode = sMode819 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound819 = (short)(0) ;
         initializeNonKey1SW819( ) ;
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
      getKey1SW819( ) ;
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
      /* Using cursor T01SW13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01SW13_A5532Lb_numero[0] < A5532Lb_numero ) || ( T01SW13_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SW13_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) ) && ( GXutil.strcmp(T01SW13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01SW13_A5532Lb_numero[0] > A5532Lb_numero ) || ( T01SW13_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SW13_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) ) && ( GXutil.strcmp(T01SW13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5532Lb_numero = T01SW13_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T01SW13_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            RcdFound819 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound819 = (short)(0) ;
      /* Using cursor T01SW14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01SW14_A5532Lb_numero[0] > A5532Lb_numero ) || ( T01SW14_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SW14_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) ) && ( GXutil.strcmp(T01SW14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01SW14_A5532Lb_numero[0] < A5532Lb_numero ) || ( T01SW14_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01SW14_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) ) && ( GXutil.strcmp(T01SW14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5532Lb_numero = T01SW14_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T01SW14_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            RcdFound819 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SW819( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SW819( ) ;
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
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SW819( ) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SW819( ) ;
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
                  GX_FocusControl = edtLb_numero_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SW819( ) ;
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
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SW819( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SW6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z5559Lb_UltlP != T01SW6_A5559Lb_UltlP[0] ) )
         {
            if ( Z5559Lb_UltlP != T01SW6_A5559Lb_UltlP[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"Lb_UltlP");
               GXutil.writeLogRaw("Old: ",Z5559Lb_UltlP);
               GXutil.writeLogRaw("Current: ",T01SW6_A5559Lb_UltlP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SW819( )
   {
      beforeValidate1SW819( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SW819( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SW819( 0) ;
         checkOptimisticConcurrency1SW819( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SW819( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SW819( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SW15 */
                  pr_default.execute(13, new Object[] {A5555Lb_opcion, Short.valueOf(A5559Lb_UltlP), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1SW819( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1SW0( ) ;
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
            load1SW819( ) ;
         }
         endLevel1SW819( ) ;
      }
      closeExtendedTableCursors1SW819( ) ;
   }

   public void update1SW819( )
   {
      beforeValidate1SW819( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SW819( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SW819( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SW819( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SW819( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SW16 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A5559Lb_UltlP), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS002"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SW819( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1SW819( ) ;
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
         endLevel1SW819( ) ;
      }
      closeExtendedTableCursors1SW819( ) ;
   }

   public void deferredUpdate1SW819( )
   {
   }

   public void delete( )
   {
      beforeValidate1SW819( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SW819( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SW819( ) ;
         afterConfirm1SW819( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SW819( ) ;
            if ( AnyError == 0 )
            {
               scanStart1SW821( ) ;
               while ( RcdFound821 != 0 )
               {
                  getByPrimaryKey1SW821( ) ;
                  delete1SW821( ) ;
                  scanNext1SW821( ) ;
               }
               scanEnd1SW821( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SW17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
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
      endLevel1SW819( ) ;
      Gx_mode = sMode819 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SW819( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SW18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         A14088Lb_Gots = T01SW18_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01SW18_n14088Lb_Gots[0] ;
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SW19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01SW20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1SW821( )
   {
      nGXsfl_37_idx = 0 ;
      while ( nGXsfl_37_idx < nRC_GXsfl_37 )
      {
         readRow1SW821( ) ;
         if ( ( nRcdExists_821 != 0 ) || ( nIsMod_821 != 0 ) )
         {
            standaloneNotModal1SW821( ) ;
            getKey1SW821( ) ;
            if ( ( nRcdExists_821 == 0 ) && ( nRcdDeleted_821 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1SW821( ) ;
            }
            else
            {
               if ( RcdFound821 != 0 )
               {
                  if ( ( nRcdDeleted_821 != 0 ) && ( nRcdExists_821 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1SW821( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_821 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1SW821( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_821 == 0 )
                  {
                     GXCCtl = "LB_LINEAPR_" + sGXsfl_37_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_LineaPr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_LineaPr_Internalname, GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLB_CantP_Internalname, GXutil.ltrim( localUtil.ntoc( A5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_orden_Internalname, GXutil.ltrim( localUtil.ntoc( A5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_PTinP_Internalname, GXutil.ltrim( localUtil.ntoc( A6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCtwSt_Internalname, A14097PrdCtwSt) ;
         httpContext.changePostValue( "ZT_"+"Z5560Lb_LineaPr_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5561LB_CantP_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5562Lb_orden_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6059Lb_solup_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z6059Lb_solup, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6545Lb_PTinP_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_37_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_821_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_821_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_821_"+sGXsfl_37_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_821 != 0 )
         {
            httpContext.changePostValue( "LB_LINEAPR_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaPr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_CANTP_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_37_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "LB_ORDEN_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_orden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_PTINP_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCTWST_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1SW821( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_821 = (short)(0) ;
      nIsMod_821 = (short)(0) ;
      nRcdDeleted_821 = (short)(0) ;
   }

   public void processLevel1SW819( )
   {
      /* Save parent mode. */
      sMode819 = Gx_mode ;
      processNestedLevel1SW821( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode819 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1SW819( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SW819( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.entradaensayolaboratorio_productovariable_trn");
         if ( AnyError == 0 )
         {
            confirmValues1SW0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.entradaensayolaboratorio_productovariable_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SW819( )
   {
      /* Scan By routine */
      /* Using cursor T01SW21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound819 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A5532Lb_numero = T01SW21_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01SW21_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SW819( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound819 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound819 = (short)(1) ;
         A5532Lb_numero = T01SW21_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01SW21_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
   }

   public void scanEnd1SW819( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1SW819( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SW819( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SW819( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SW819( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SW819( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SW819( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SW819( )
   {
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1SW821( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5561LB_CantP = T01SW3_A5561LB_CantP[0] ;
            Z5562Lb_orden = T01SW3_A5562Lb_orden[0] ;
            Z6059Lb_solup = T01SW3_A6059Lb_solup[0] ;
            Z6545Lb_PTinP = T01SW3_A6545Lb_PTinP[0] ;
            Z719PrdNum = T01SW3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01SW3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z5561LB_CantP = A5561LB_CantP ;
            Z5562Lb_orden = A5562Lb_orden ;
            Z6059Lb_solup = A6059Lb_solup ;
            Z6545Lb_PTinP = A6545Lb_PTinP ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5560Lb_LineaPr = A5560Lb_LineaPr ;
         Z5561LB_CantP = A5561LB_CantP ;
         Z5562Lb_orden = A5562Lb_orden ;
         Z6059Lb_solup = A6059Lb_solup ;
         Z6545Lb_PTinP = A6545Lb_PTinP ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z11663PrdCtw4 = A11663PrdCtw4 ;
         Z10938PrdCtw3 = A10938PrdCtw3 ;
         Z10937PrdCtw2 = A10937PrdCtw2 ;
         Z10936PrdCtw1 = A10936PrdCtw1 ;
         Z11363PrdGots = A11363PrdGots ;
         Z856ValCod = A856ValCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1SW821( )
   {
   }

   public void standaloneModal1SW821( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_LineaPr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaPr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      }
      else
      {
         edtLb_LineaPr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaPr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      }
   }

   public void load1SW821( )
   {
      /* Using cursor T01SW22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound821 = (short)(1) ;
         A718PrdNom = T01SW22_A718PrdNom[0] ;
         A488ForPrdDsc = T01SW22_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SW22_n488ForPrdDsc[0] ;
         A5561LB_CantP = T01SW22_A5561LB_CantP[0] ;
         A5562Lb_orden = T01SW22_A5562Lb_orden[0] ;
         A4338PrdUMeFo = T01SW22_A4338PrdUMeFo[0] ;
         A6059Lb_solup = T01SW22_A6059Lb_solup[0] ;
         A6545Lb_PTinP = T01SW22_A6545Lb_PTinP[0] ;
         A724PrdPreAct = T01SW22_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01SW22_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = T01SW22_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = T01SW22_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = T01SW22_A10936PrdCtw1[0] ;
         A11363PrdGots = T01SW22_A11363PrdGots[0] ;
         A719PrdNum = T01SW22_A719PrdNum[0] ;
         A490ForPrdUMe = T01SW22_A490ForPrdUMe[0] ;
         A856ValCod = T01SW22_A856ValCod[0] ;
         zm1SW821( -17) ;
      }
      pr_default.close(20);
      onLoadActions1SW821( ) ;
   }

   public void onLoadActions1SW821( )
   {
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14097PrdCtwSt = GXt_char1 ;
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
   }

   public void checkExtendedTable1SW821( )
   {
      nIsDirty_821 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1SW821( ) ;
      /* Using cursor T01SW4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SW4_A718PrdNom[0] ;
      A4338PrdUMeFo = T01SW4_A4338PrdUMeFo[0] ;
      A724PrdPreAct = T01SW4_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01SW4_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01SW4_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01SW4_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01SW4_A10936PrdCtw1[0] ;
      A11363PrdGots = T01SW4_A11363PrdGots[0] ;
      A856ValCod = T01SW4_A856ValCod[0] ;
      pr_default.close(2);
      nIsDirty_821 = (short)(1) ;
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14097PrdCtwSt = GXt_char1 ;
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_821 = (short)(1) ;
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      if ( (0==A5560Lb_LineaPr) && true /* After */ )
      {
         GXv_int8[0] = A5560Lb_LineaPr ;
         new app.getlblineacp(remoteHandle, context).execute( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, GXv_int8) ;
         entradaensayolaboratorio_productovariable_trn_impl.this.A5560Lb_LineaPr = GXv_int8[0] ;
      }
      /* Using cursor T01SW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01SW5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SW5_n488ForPrdDsc[0] ;
      pr_default.close(3);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1SW821( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1SW821( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01SW23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SW23_A718PrdNom[0] ;
      A4338PrdUMeFo = T01SW23_A4338PrdUMeFo[0] ;
      A724PrdPreAct = T01SW23_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01SW23_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01SW23_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01SW23_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01SW23_A10936PrdCtw1[0] ;
      A11363PrdGots = T01SW23_A11363PrdGots[0] ;
      A856ValCod = T01SW23_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11663PrdCtw4))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10938PrdCtw3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10937PrdCtw2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10936PrdCtw1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11363PrdGots))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_19( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01SW24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01SW24_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SW24_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1SW821( )
   {
      /* Using cursor T01SW25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound821 = (short)(1) ;
      }
      else
      {
         RcdFound821 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey1SW821( )
   {
      /* Using cursor T01SW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01SW3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1SW821( 17) ;
         RcdFound821 = (short)(1) ;
         initializeNonKey1SW821( ) ;
         A5560Lb_LineaPr = T01SW3_A5560Lb_LineaPr[0] ;
         A5561LB_CantP = T01SW3_A5561LB_CantP[0] ;
         A5562Lb_orden = T01SW3_A5562Lb_orden[0] ;
         A6059Lb_solup = T01SW3_A6059Lb_solup[0] ;
         A6545Lb_PTinP = T01SW3_A6545Lb_PTinP[0] ;
         A719PrdNum = T01SW3_A719PrdNum[0] ;
         A490ForPrdUMe = T01SW3_A490ForPrdUMe[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5560Lb_LineaPr = A5560Lb_LineaPr ;
         sMode821 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SW821( ) ;
         Gx_mode = sMode821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound821 = (short)(0) ;
         initializeNonKey1SW821( ) ;
         sMode821 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1SW821( ) ;
         Gx_mode = sMode821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1SW821( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1SW821( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS004"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5561LB_CantP, T01SW2_A5561LB_CantP[0]) != 0 ) || ( Z5562Lb_orden != T01SW2_A5562Lb_orden[0] ) || ( Z6059Lb_solup != T01SW2_A6059Lb_solup[0] ) || ( Z6545Lb_PTinP != T01SW2_A6545Lb_PTinP[0] ) || ( GXutil.strcmp(Z719PrdNum, T01SW2_A719PrdNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01SW2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z5561LB_CantP, T01SW2_A5561LB_CantP[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"LB_CantP");
               GXutil.writeLogRaw("Old: ",Z5561LB_CantP);
               GXutil.writeLogRaw("Current: ",T01SW2_A5561LB_CantP[0]);
            }
            if ( Z5562Lb_orden != T01SW2_A5562Lb_orden[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"Lb_orden");
               GXutil.writeLogRaw("Old: ",Z5562Lb_orden);
               GXutil.writeLogRaw("Current: ",T01SW2_A5562Lb_orden[0]);
            }
            if ( Z6059Lb_solup != T01SW2_A6059Lb_solup[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"Lb_solup");
               GXutil.writeLogRaw("Old: ",Z6059Lb_solup);
               GXutil.writeLogRaw("Current: ",T01SW2_A6059Lb_solup[0]);
            }
            if ( Z6545Lb_PTinP != T01SW2_A6545Lb_PTinP[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"Lb_PTinP");
               GXutil.writeLogRaw("Old: ",Z6545Lb_PTinP);
               GXutil.writeLogRaw("Current: ",T01SW2_A6545Lb_PTinP[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01SW2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01SW2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01SW2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratorio_productovariable_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01SW2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS004"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SW821( )
   {
      beforeValidate1SW821( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SW821( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SW821( 0) ;
         checkOptimisticConcurrency1SW821( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SW821( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SW821( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SW26 */
                  pr_default.execute(24, new Object[] {Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr), A5561LB_CantP, Short.valueOf(A5562Lb_orden), Integer.valueOf(A6059Lb_solup), Byte.valueOf(A6545Lb_PTinP), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1SW821( ) ;
         }
         endLevel1SW821( ) ;
      }
      closeExtendedTableCursors1SW821( ) ;
   }

   public void update1SW821( )
   {
      beforeValidate1SW821( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SW821( ) ;
      }
      if ( ( nIsMod_821 != 0 ) || ( nIsDirty_821 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1SW821( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1SW821( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1SW821( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01SW27 */
                     pr_default.execute(25, new Object[] {A5561LB_CantP, Short.valueOf(A5562Lb_orden), Integer.valueOf(A6059Lb_solup), Byte.valueOf(A6545Lb_PTinP), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS004"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1SW821( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1SW821( ) ;
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
            endLevel1SW821( ) ;
         }
      }
      closeExtendedTableCursors1SW821( ) ;
   }

   public void deferredUpdate1SW821( )
   {
   }

   public void delete1SW821( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SW821( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SW821( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SW821( ) ;
         afterConfirm1SW821( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SW821( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SW28 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
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
      sMode821 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SW821( ) ;
      Gx_mode = sMode821 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SW821( )
   {
      standaloneModal1SW821( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SW29 */
         pr_default.execute(27, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01SW29_A718PrdNom[0] ;
         A4338PrdUMeFo = T01SW29_A4338PrdUMeFo[0] ;
         A724PrdPreAct = T01SW29_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01SW29_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = T01SW29_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = T01SW29_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = T01SW29_A10936PrdCtw1[0] ;
         A11363PrdGots = T01SW29_A11363PrdGots[0] ;
         A856ValCod = T01SW29_A856ValCod[0] ;
         pr_default.close(27);
         GXt_char1 = A14097PrdCtwSt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         entradaensayolaboratorio_productovariable_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaensayolaboratorio_productovariable_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14097PrdCtwSt = GXt_char1 ;
         /* Using cursor T01SW30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01SW30_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01SW30_n488ForPrdDsc[0] ;
         pr_default.close(28);
      }
   }

   public void endLevel1SW821( )
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

   public void scanStart1SW821( )
   {
      /* Scan By routine */
      /* Using cursor T01SW31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      RcdFound821 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound821 = (short)(1) ;
         A5560Lb_LineaPr = T01SW31_A5560Lb_LineaPr[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SW821( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound821 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound821 = (short)(1) ;
         A5560Lb_LineaPr = T01SW31_A5560Lb_LineaPr[0] ;
      }
   }

   public void scanEnd1SW821( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1SW821( )
   {
      /* After Confirm Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A5561LB_CantP)==0) && true /* After */ && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         GXCCtl = "LB_CANTP_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Cantidad", ""), 0, GXCCtl);
      }
   }

   public void beforeInsert1SW821( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SW821( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SW821( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SW821( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SW821( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SW821( )
   {
      edtLb_LineaPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaPr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtLB_CantP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLB_CantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLB_CantP_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtLb_orden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_orden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_orden_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtLb_PTinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PTinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PTinP_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtPrdCtwSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), !bGXsfl_37_Refreshing);
   }

   public void send_integrity_lvl_hashes1SW821( )
   {
   }

   public void send_integrity_lvl_hashes1SW819( )
   {
   }

   public void subsflControlProps_37821( )
   {
      edtLb_LineaPr_Internalname = "LB_LINEAPR_"+sGXsfl_37_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_37_idx ;
      edtLB_CantP_Internalname = "LB_CANTP_"+sGXsfl_37_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_37_idx ;
      edtLb_orden_Internalname = "LB_ORDEN_"+sGXsfl_37_idx ;
      imgprompt_5562_Internalname = "PROMPT_5562_"+sGXsfl_37_idx ;
      edtLb_PTinP_Internalname = "LB_PTINP_"+sGXsfl_37_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_37821( )
   {
      edtLb_LineaPr_Internalname = "LB_LINEAPR_"+sGXsfl_37_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_37_fel_idx ;
      edtLB_CantP_Internalname = "LB_CANTP_"+sGXsfl_37_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_37_fel_idx ;
      edtLb_orden_Internalname = "LB_ORDEN_"+sGXsfl_37_fel_idx ;
      imgprompt_5562_Internalname = "PROMPT_5562_"+sGXsfl_37_fel_idx ;
      edtLb_PTinP_Internalname = "LB_PTINP_"+sGXsfl_37_fel_idx ;
      edtPrdCtwSt_Internalname = "PRDCTWST_"+sGXsfl_37_fel_idx ;
   }

   public void addRow1SW821( )
   {
      nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_37821( ) ;
      sendRow1SW821( ) ;
   }

   public void sendRow1SW821( )
   {
      Gridlevel_productoRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_producto_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_producto_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(0) ;
         subGridlevel_producto_Backcolor = subGridlevel_producto_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_producto_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
         {
            subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
         }
         subGridlevel_producto_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_producto_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_producto_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
         {
            subGridlevel_producto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
            {
               subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_producto_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_producto_Class, "") != 0 )
            {
               subGridlevel_producto_Linesclass = subGridlevel_producto_Class+"Odd" ;
            }
         }
      }
      imgprompt_5562_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"LB_ORDEN_"+sGXsfl_37_idx+"'), id:'"+"LB_ORDEN_"+sGXsfl_37_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_821_"+sGXsfl_37_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_821_" + sGXsfl_37_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_37_idx + "',37)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LineaPr_Internalname,GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5560Lb_LineaPr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_LineaPr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_LineaPr_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_821_" + sGXsfl_37_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_37_idx + "',37)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_821_" + sGXsfl_37_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_37_idx + "',37)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLB_CantP_Internalname,GXutil.ltrim( localUtil.ntoc( A5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLB_CantP_Enabled!=0) ? localUtil.format( A5561LB_CantP, "ZZZZ9.99999") : localUtil.format( A5561LB_CantP, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLB_CantP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLB_CantP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_821_" + sGXsfl_37_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_37_idx + "',37)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtForPrdUMe_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_821_" + sGXsfl_37_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_37_idx + "',37)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_orden_Internalname,GXutil.ltrim( localUtil.ntoc( A5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_orden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5562Lb_orden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5562Lb_orden), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_orden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_orden_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_5562_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_5562_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_productoRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_5562_Internalname,sImgUrl,imgprompt_5562_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_5562_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_821_" + sGXsfl_37_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_37_idx + "',37)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_PTinP_Internalname,GXutil.ltrim( localUtil.ntoc( A6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_PTinP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6545Lb_PTinP), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6545Lb_PTinP), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_PTinP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_PTinP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_productoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCtwSt_Internalname,A14097PrdCtwSt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCtwSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdCtwSt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_productoRow);
      send_integrity_lvl_hashes1SW821( ) ;
      GXCCtl = "Z5560Lb_LineaPr_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5560Lb_LineaPr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5561LB_CantP_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5561LB_CantP, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5562Lb_orden_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5562Lb_orden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6059Lb_solup_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6059Lb_solup, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6545Lb_PTinP_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6545Lb_PTinP, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_821_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_821_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_821_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10EmprCod));
      GXCCtl = "vLB_NUMERO_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV11Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vLB_OPCION_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12Lb_opcion));
      GXCCtl = "EMPRCOD_" + sGXsfl_37_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_LINEAPR_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaPr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_CANTP_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_37_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ORDEN_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_orden_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_PTINP_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTWST_"+sGXsfl_37_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_5562_"+sGXsfl_37_idx+"Link", GXutil.rtrim( imgprompt_5562_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_productoContainer.AddRow(Gridlevel_productoRow);
   }

   public void readRow1SW821( )
   {
      nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_37821( ) ;
      edtLb_LineaPr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINEAPR_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLB_CantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_CANTP_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_37_idx+"Horizontalalignment") ;
      edtLb_orden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_ORDEN_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_PTinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_PTINP_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCtwSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCTWST_"+sGXsfl_37_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_5562_Link = httpContext.cgiGet( "PROMPT_5562_"+sGXsfl_37_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LineaPr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LineaPr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_LINEAPR_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_LineaPr_Internalname ;
         wbErr = true ;
         A5560Lb_LineaPr = (short)(0) ;
      }
      else
      {
         A5560Lb_LineaPr = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaPr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLB_CantP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLB_CantP_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "LB_CANTP_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLB_CantP_Internalname ;
         wbErr = true ;
         A5561LB_CantP = DecimalUtil.ZERO ;
      }
      else
      {
         A5561LB_CantP = localUtil.ctond( httpContext.cgiGet( edtLB_CantP_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_37_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_ORDEN_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_orden_Internalname ;
         wbErr = true ;
         A5562Lb_orden = (short)(0) ;
      }
      else
      {
         A5562Lb_orden = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_orden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_PTinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_PTinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "LB_PTINP_" + sGXsfl_37_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_PTinP_Internalname ;
         wbErr = true ;
         A6545Lb_PTinP = (byte)(0) ;
      }
      else
      {
         A6545Lb_PTinP = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_PTinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A14097PrdCtwSt = httpContext.cgiGet( edtPrdCtwSt_Internalname) ;
      GXCCtl = "Z5560Lb_LineaPr_" + sGXsfl_37_idx ;
      Z5560Lb_LineaPr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5561LB_CantP_" + sGXsfl_37_idx ;
      Z5561LB_CantP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5562Lb_orden_" + sGXsfl_37_idx ;
      Z5562Lb_orden = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6059Lb_solup_" + sGXsfl_37_idx ;
      Z6059Lb_solup = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6545Lb_PTinP_" + sGXsfl_37_idx ;
      Z6545Lb_PTinP = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_37_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_37_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6059Lb_solup_" + sGXsfl_37_idx ;
      A6059Lb_solup = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_821_" + sGXsfl_37_idx ;
      nRcdDeleted_821 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_821_" + sGXsfl_37_idx ;
      nRcdExists_821 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_821_" + sGXsfl_37_idx ;
      nIsMod_821 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_LineaPr_Enabled = edtLb_LineaPr_Enabled ;
   }

   public void confirmValues1SW0( )
   {
      nGXsfl_37_idx = 0 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_37821( ) ;
      while ( nGXsfl_37_idx < nRC_GXsfl_37 )
      {
         nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_37821( ) ;
         httpContext.changePostValue( "Z5560Lb_LineaPr_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z5560Lb_LineaPr_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5560Lb_LineaPr_"+sGXsfl_37_idx) ;
         httpContext.changePostValue( "Z5561LB_CantP_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z5561LB_CantP_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5561LB_CantP_"+sGXsfl_37_idx) ;
         httpContext.changePostValue( "Z5562Lb_orden_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z5562Lb_orden_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5562Lb_orden_"+sGXsfl_37_idx) ;
         httpContext.changePostValue( "Z6059Lb_solup_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z6059Lb_solup_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6059Lb_solup_"+sGXsfl_37_idx) ;
         httpContext.changePostValue( "Z6545Lb_PTinP_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z6545Lb_PTinP_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6545Lb_PTinP_"+sGXsfl_37_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_37_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_37_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_37_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_37_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV12Lb_opcion))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorio_Productovariable_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Lb_UltlP", localUtil.format( DecimalUtil.doubleToDec(A5559Lb_UltlP), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_productovariable_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5555Lb_opcion", GXutil.rtrim( Z5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5559Lb_UltlP", GXutil.ltrim( localUtil.ntoc( Z5559Lb_UltlP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nGXsfl_37_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV16PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV16PrdNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFORPRDUME_DATA", AV18ForPrdUMe_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFORPRDUME_DATA", AV18ForPrdUMe_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV11Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_OPCION", GXutil.rtrim( AV12Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ULTLP", GXutil.ltrim( localUtil.ntoc( A5559Lb_UltlP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_GOTS", GXutil.rtrim( A14088Lb_Gots));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_SOLUP", GXutil.ltrim( localUtil.ntoc( A6059Lb_solup, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW4", GXutil.rtrim( A11663PrdCtw4));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW3", GXutil.rtrim( A10938PrdCtw3));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW2", GXutil.rtrim( A10937PrdCtw2));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCTW1", GXutil.rtrim( A10936PrdCtw1));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDGOTS", GXutil.rtrim( A11363PrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
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
      return formatLink("app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV12Lb_opcion))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayoLaboratorio_Productovariable_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Ensayo Laboratorio (Producto variable)", "") ;
   }

   public void initializeNonKey1SW819( )
   {
      A14088Lb_Gots = "" ;
      n14088Lb_Gots = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
      A5559Lb_UltlP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5559Lb_UltlP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5559Lb_UltlP), 4, 0));
      Z5559Lb_UltlP = (short)(0) ;
   }

   public void initAll1SW819( )
   {
      A5532Lb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      A5555Lb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      initializeNonKey1SW819( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1SW821( )
   {
      A14097PrdCtwSt = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A5561LB_CantP = DecimalUtil.ZERO ;
      A5562Lb_orden = (short)(0) ;
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      A6059Lb_solup = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6059Lb_solup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6059Lb_solup), 5, 0));
      A6545Lb_PTinP = (byte)(0) ;
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A11663PrdCtw4 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
      A10938PrdCtw3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
      A10937PrdCtw2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
      A10936PrdCtw1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
      A11363PrdGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
      A490ForPrdUMe = (byte)(0) ;
      Z5561LB_CantP = DecimalUtil.ZERO ;
      Z5562Lb_orden = (short)(0) ;
      Z6059Lb_solup = 0 ;
      Z6545Lb_PTinP = (byte)(0) ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1SW821( )
   {
      A5560Lb_LineaPr = (short)(0) ;
      initializeNonKey1SW821( ) ;
   }

   public void standaloneModalInsert1SW821( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211694219", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratorio_productovariable_trn.js", "?20268211694219", false, true);
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
      /* End function include_jscripts */
   }

   public void init_level_properties821( )
   {
      edtLb_LineaPr_Enabled = defedtLb_LineaPr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaPr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
   }

   public void startgridcontrol37( )
   {
      Gridlevel_productoContainer.AddObjectProperty("GridName", "Gridlevel_producto");
      Gridlevel_productoContainer.AddObjectProperty("Header", subGridlevel_producto_Header);
      Gridlevel_productoContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_productoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_productoContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LineaPr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5561LB_CantP, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLB_CantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5562Lb_orden, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_orden_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6545Lb_PTinP, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_PTinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_productoColumn.AddObjectProperty("Value", A14097PrdCtwSt);
      Gridlevel_productoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCtwSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddColumnProperties(Gridlevel_productoColumn);
      Gridlevel_productoContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_productoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_producto_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtLb_numero_Internalname = "LB_NUMERO" ;
      edtLb_opcion_Internalname = "LB_OPCION" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLb_LineaPr_Internalname = "LB_LINEAPR" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtLB_CantP_Internalname = "LB_CANTP" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtLb_orden_Internalname = "LB_ORDEN" ;
      edtLb_PTinP_Internalname = "LB_PTINP" ;
      edtPrdCtwSt_Internalname = "PRDCTWST" ;
      divTableleaflevel_producto_Internalname = "TABLELEAFLEVEL_PRODUCTO" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      Combo_forprdume_Internalname = "COMBO_FORPRDUME" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_5562_Internalname = "PROMPT_5562" ;
      subGridlevel_producto_Internalname = "GRIDLEVEL_PRODUCTO" ;
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
      subGridlevel_producto_Allowcollapsing = (byte)(0) ;
      subGridlevel_producto_Allowselection = (byte)(0) ;
      subGridlevel_producto_Header = "" ;
      Combo_forprdume_Enabled = GXutil.toBoolean( -1) ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada Ensayo Laboratorio (Producto variable)", "") );
      edtPrdCtwSt_Jsonclick = "" ;
      edtLb_PTinP_Jsonclick = "" ;
      imgprompt_5562_Visible = 1 ;
      imgprompt_5562_Link = "" ;
      imgprompt_5562_Visible = 1 ;
      edtLb_orden_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtLB_CantP_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLb_LineaPr_Jsonclick = "" ;
      subGridlevel_producto_Class = "GridNoBorder WorkWith" ;
      subGridlevel_producto_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_forprdume_Titlecontrolidtoreplace = "" ;
      edtPrdCtwSt_Enabled = 0 ;
      edtLb_PTinP_Enabled = 1 ;
      edtLb_orden_Enabled = 1 ;
      edtForPrdUMe_Enabled = 1 ;
      edtLB_CantP_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtLb_LineaPr_Enabled = 1 ;
      Combo_forprdume_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_forprdume_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_forprdume_Cls = "ExtendedCombo" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_opcion_Enabled = 1 ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Enabled = 1 ;
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

   public void gx10asaprdctwst1SW821( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char2[0] ;
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

   public void xc_12_1SW821( String A396EmprCod ,
                             int A5532Lb_numero ,
                             String A5555Lb_opcion ,
                             short A5560Lb_LineaPr )
   {
      if ( (0==A5560Lb_LineaPr) && true /* After */ )
      {
         GXv_int8[0] = A5560Lb_LineaPr ;
         new app.getlblineacp(remoteHandle, context).execute( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, GXv_int8) ;
         A5560Lb_LineaPr = GXv_int8[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_producto_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_37821( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1SW821( ) ;
         standaloneModal1SW821( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1SW821( ) ;
         nGXsfl_37_idx = (int)(nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_37821( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_productoContainer)) ;
      /* End function gxnrGridlevel_producto_newrow */
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
      /* Using cursor T01SW18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
      }
      A14088Lb_Gots = T01SW18_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01SW18_n14088Lb_Gots[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", GXutil.rtrim( A14088Lb_Gots));
   }

   public void valid_Lb_lineapr( )
   {
      if ( (0==A5560Lb_LineaPr) && true /* After */ )
      {
         GXv_int8[0] = A5560Lb_LineaPr ;
         new app.getlblineacp(remoteHandle, context).execute( A396EmprCod, A5532Lb_numero, A5555Lb_opcion, GXv_int8) ;
         entradaensayolaboratorio_productovariable_trn_impl.this.A5560Lb_LineaPr = GXv_int8[0] ;
         A5560Lb_LineaPr = this.A5560Lb_LineaPr ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5560Lb_LineaPr", GXutil.ltrim( localUtil.ntoc( A5560Lb_LineaPr, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01SW29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01SW29_A718PrdNom[0] ;
      A4338PrdUMeFo = T01SW29_A4338PrdUMeFo[0] ;
      A724PrdPreAct = T01SW29_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01SW29_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01SW29_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01SW29_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01SW29_A10936PrdCtw1[0] ;
      A11363PrdGots = T01SW29_A11363PrdGots[0] ;
      A856ValCod = T01SW29_A856ValCod[0] ;
      pr_default.close(27);
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratorio_productovariable_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14097PrdCtwSt = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", GXutil.rtrim( A11663PrdCtw4));
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", GXutil.rtrim( A10938PrdCtw3));
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", GXutil.rtrim( A10937PrdCtw2));
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", GXutil.rtrim( A10936PrdCtw1));
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", GXutil.rtrim( A11363PrdGots));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01SW30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01SW30_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01SW30_n488ForPrdDsc[0] ;
      pr_default.close(28);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'A5559Lb_UltlP',fld:'LB_ULTLP',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121SW2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A14088Lb_Gots',fld:'LB_GOTS',pic:''}]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[{av:'A14088Lb_Gots',fld:'LB_GOTS',pic:''}]}");
      setEventMetadata("VALID_LB_OPCION","{handler:'valid_Lb_opcion',iparms:[]");
      setEventMetadata("VALID_LB_OPCION",",oparms:[]}");
      setEventMetadata("VALID_LB_LINEAPR","{handler:'valid_Lb_lineapr',iparms:[{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5560Lb_LineaPr',fld:'LB_LINEAPR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_LB_LINEAPR",",oparms:[{av:'A5560Lb_LineaPr',fld:'LB_LINEAPR',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A14097PrdCtwSt',fld:'PRDCTWST',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A14097PrdCtwSt',fld:'PRDCTWST',pic:''}]}");
      setEventMetadata("VALID_LB_CANTP","{handler:'valid_Lb_cantp',iparms:[]");
      setEventMetadata("VALID_LB_CANTP",",oparms:[]}");
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
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV12Lb_opcion = "" ;
      Z396EmprCod = "" ;
      Z5555Lb_opcion = "" ;
      Z5561LB_CantP = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      AV12Lb_opcion = "" ;
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
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV21Pgmname = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV16PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_forprdume = new com.genexus.webpanels.GXUserControl();
      Combo_forprdume_Caption = "" ;
      AV18ForPrdUMe_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_productoContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode821 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A14088Lb_Gots = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A11663PrdCtw4 = "" ;
      A10938PrdCtw3 = "" ;
      A10937PrdCtw2 = "" ;
      A10936PrdCtw1 = "" ;
      A11363PrdGots = "" ;
      A488ForPrdDsc = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
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
      GXCCtl = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      A14097PrdCtwSt = "" ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV17ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z14088Lb_Gots = "" ;
      T01SW8_A407EmprNom = new String[] {""} ;
      T01SW8_n407EmprNom = new boolean[] {false} ;
      T01SW9_A14088Lb_Gots = new String[] {""} ;
      T01SW9_n14088Lb_Gots = new boolean[] {false} ;
      T01SW10_A5555Lb_opcion = new String[] {""} ;
      T01SW10_A407EmprNom = new String[] {""} ;
      T01SW10_n407EmprNom = new boolean[] {false} ;
      T01SW10_A14088Lb_Gots = new String[] {""} ;
      T01SW10_n14088Lb_Gots = new boolean[] {false} ;
      T01SW10_A5559Lb_UltlP = new short[1] ;
      T01SW10_A396EmprCod = new String[] {""} ;
      T01SW10_A5532Lb_numero = new int[1] ;
      T01SW11_A14088Lb_Gots = new String[] {""} ;
      T01SW11_n14088Lb_Gots = new boolean[] {false} ;
      T01SW12_A396EmprCod = new String[] {""} ;
      T01SW12_A5532Lb_numero = new int[1] ;
      T01SW12_A5555Lb_opcion = new String[] {""} ;
      T01SW7_A5555Lb_opcion = new String[] {""} ;
      T01SW7_A5559Lb_UltlP = new short[1] ;
      T01SW7_A396EmprCod = new String[] {""} ;
      T01SW7_A5532Lb_numero = new int[1] ;
      T01SW13_A396EmprCod = new String[] {""} ;
      T01SW13_A5532Lb_numero = new int[1] ;
      T01SW13_A5555Lb_opcion = new String[] {""} ;
      T01SW14_A396EmprCod = new String[] {""} ;
      T01SW14_A5532Lb_numero = new int[1] ;
      T01SW14_A5555Lb_opcion = new String[] {""} ;
      T01SW6_A5555Lb_opcion = new String[] {""} ;
      T01SW6_A5559Lb_UltlP = new short[1] ;
      T01SW6_A396EmprCod = new String[] {""} ;
      T01SW6_A5532Lb_numero = new int[1] ;
      T01SW18_A14088Lb_Gots = new String[] {""} ;
      T01SW18_n14088Lb_Gots = new boolean[] {false} ;
      T01SW19_A396EmprCod = new String[] {""} ;
      T01SW19_A5532Lb_numero = new int[1] ;
      T01SW19_A5555Lb_opcion = new String[] {""} ;
      T01SW19_A13460Lb_linCP = new short[1] ;
      T01SW19_A13458Lb_TipCP = new String[] {""} ;
      T01SW20_A396EmprCod = new String[] {""} ;
      T01SW20_A5532Lb_numero = new int[1] ;
      T01SW20_A5555Lb_opcion = new String[] {""} ;
      T01SW20_A5557Lb_LineaC = new short[1] ;
      T01SW21_A396EmprCod = new String[] {""} ;
      T01SW21_A5532Lb_numero = new int[1] ;
      T01SW21_A5555Lb_opcion = new String[] {""} ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z11663PrdCtw4 = "" ;
      Z10938PrdCtw3 = "" ;
      Z10937PrdCtw2 = "" ;
      Z10936PrdCtw1 = "" ;
      Z11363PrdGots = "" ;
      Z488ForPrdDsc = "" ;
      T01SW22_A5532Lb_numero = new int[1] ;
      T01SW22_A5555Lb_opcion = new String[] {""} ;
      T01SW22_A5560Lb_LineaPr = new short[1] ;
      T01SW22_A718PrdNom = new String[] {""} ;
      T01SW22_A488ForPrdDsc = new String[] {""} ;
      T01SW22_n488ForPrdDsc = new boolean[] {false} ;
      T01SW22_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW22_A5562Lb_orden = new short[1] ;
      T01SW22_A4338PrdUMeFo = new byte[1] ;
      T01SW22_A6059Lb_solup = new int[1] ;
      T01SW22_A6545Lb_PTinP = new byte[1] ;
      T01SW22_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW22_A11663PrdCtw4 = new String[] {""} ;
      T01SW22_A10938PrdCtw3 = new String[] {""} ;
      T01SW22_A10937PrdCtw2 = new String[] {""} ;
      T01SW22_A10936PrdCtw1 = new String[] {""} ;
      T01SW22_A11363PrdGots = new String[] {""} ;
      T01SW22_A396EmprCod = new String[] {""} ;
      T01SW22_A719PrdNum = new String[] {""} ;
      T01SW22_A490ForPrdUMe = new byte[1] ;
      T01SW22_A856ValCod = new byte[1] ;
      T01SW4_A718PrdNom = new String[] {""} ;
      T01SW4_A4338PrdUMeFo = new byte[1] ;
      T01SW4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW4_A11663PrdCtw4 = new String[] {""} ;
      T01SW4_A10938PrdCtw3 = new String[] {""} ;
      T01SW4_A10937PrdCtw2 = new String[] {""} ;
      T01SW4_A10936PrdCtw1 = new String[] {""} ;
      T01SW4_A11363PrdGots = new String[] {""} ;
      T01SW4_A856ValCod = new byte[1] ;
      T01SW5_A488ForPrdDsc = new String[] {""} ;
      T01SW5_n488ForPrdDsc = new boolean[] {false} ;
      T01SW23_A718PrdNom = new String[] {""} ;
      T01SW23_A4338PrdUMeFo = new byte[1] ;
      T01SW23_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW23_A11663PrdCtw4 = new String[] {""} ;
      T01SW23_A10938PrdCtw3 = new String[] {""} ;
      T01SW23_A10937PrdCtw2 = new String[] {""} ;
      T01SW23_A10936PrdCtw1 = new String[] {""} ;
      T01SW23_A11363PrdGots = new String[] {""} ;
      T01SW23_A856ValCod = new byte[1] ;
      T01SW24_A488ForPrdDsc = new String[] {""} ;
      T01SW24_n488ForPrdDsc = new boolean[] {false} ;
      T01SW25_A396EmprCod = new String[] {""} ;
      T01SW25_A5532Lb_numero = new int[1] ;
      T01SW25_A5555Lb_opcion = new String[] {""} ;
      T01SW25_A5560Lb_LineaPr = new short[1] ;
      T01SW3_A5532Lb_numero = new int[1] ;
      T01SW3_A5555Lb_opcion = new String[] {""} ;
      T01SW3_A5560Lb_LineaPr = new short[1] ;
      T01SW3_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW3_A5562Lb_orden = new short[1] ;
      T01SW3_A6059Lb_solup = new int[1] ;
      T01SW3_A6545Lb_PTinP = new byte[1] ;
      T01SW3_A396EmprCod = new String[] {""} ;
      T01SW3_A719PrdNum = new String[] {""} ;
      T01SW3_A490ForPrdUMe = new byte[1] ;
      T01SW2_A5532Lb_numero = new int[1] ;
      T01SW2_A5555Lb_opcion = new String[] {""} ;
      T01SW2_A5560Lb_LineaPr = new short[1] ;
      T01SW2_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW2_A5562Lb_orden = new short[1] ;
      T01SW2_A6059Lb_solup = new int[1] ;
      T01SW2_A6545Lb_PTinP = new byte[1] ;
      T01SW2_A396EmprCod = new String[] {""} ;
      T01SW2_A719PrdNum = new String[] {""} ;
      T01SW2_A490ForPrdUMe = new byte[1] ;
      T01SW29_A718PrdNom = new String[] {""} ;
      T01SW29_A4338PrdUMeFo = new byte[1] ;
      T01SW29_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SW29_A11663PrdCtw4 = new String[] {""} ;
      T01SW29_A10938PrdCtw3 = new String[] {""} ;
      T01SW29_A10937PrdCtw2 = new String[] {""} ;
      T01SW29_A10936PrdCtw1 = new String[] {""} ;
      T01SW29_A11363PrdGots = new String[] {""} ;
      T01SW29_A856ValCod = new byte[1] ;
      T01SW30_A488ForPrdDsc = new String[] {""} ;
      T01SW30_n488ForPrdDsc = new boolean[] {false} ;
      T01SW31_A396EmprCod = new String[] {""} ;
      T01SW31_A5532Lb_numero = new int[1] ;
      T01SW31_A5555Lb_opcion = new String[] {""} ;
      T01SW31_A5560Lb_LineaPr = new short[1] ;
      Gridlevel_productoRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_producto_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_5562_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_productoColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int8 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z14097PrdCtwSt = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productovariable_trn__default(),
         new Object[] {
             new Object[] {
            T01SW2_A5532Lb_numero, T01SW2_A5555Lb_opcion, T01SW2_A5560Lb_LineaPr, T01SW2_A5561LB_CantP, T01SW2_A5562Lb_orden, T01SW2_A6059Lb_solup, T01SW2_A6545Lb_PTinP, T01SW2_A396EmprCod, T01SW2_A719PrdNum, T01SW2_A490ForPrdUMe
            }
            , new Object[] {
            T01SW3_A5532Lb_numero, T01SW3_A5555Lb_opcion, T01SW3_A5560Lb_LineaPr, T01SW3_A5561LB_CantP, T01SW3_A5562Lb_orden, T01SW3_A6059Lb_solup, T01SW3_A6545Lb_PTinP, T01SW3_A396EmprCod, T01SW3_A719PrdNum, T01SW3_A490ForPrdUMe
            }
            , new Object[] {
            T01SW4_A718PrdNom, T01SW4_A4338PrdUMeFo, T01SW4_A724PrdPreAct, T01SW4_A11663PrdCtw4, T01SW4_A10938PrdCtw3, T01SW4_A10937PrdCtw2, T01SW4_A10936PrdCtw1, T01SW4_A11363PrdGots, T01SW4_A856ValCod
            }
            , new Object[] {
            T01SW5_A488ForPrdDsc, T01SW5_n488ForPrdDsc
            }
            , new Object[] {
            T01SW6_A5555Lb_opcion, T01SW6_A5559Lb_UltlP, T01SW6_A396EmprCod, T01SW6_A5532Lb_numero
            }
            , new Object[] {
            T01SW7_A5555Lb_opcion, T01SW7_A5559Lb_UltlP, T01SW7_A396EmprCod, T01SW7_A5532Lb_numero
            }
            , new Object[] {
            T01SW8_A407EmprNom, T01SW8_n407EmprNom
            }
            , new Object[] {
            T01SW9_A14088Lb_Gots, T01SW9_n14088Lb_Gots
            }
            , new Object[] {
            T01SW10_A5555Lb_opcion, T01SW10_A407EmprNom, T01SW10_n407EmprNom, T01SW10_A14088Lb_Gots, T01SW10_n14088Lb_Gots, T01SW10_A5559Lb_UltlP, T01SW10_A396EmprCod, T01SW10_A5532Lb_numero
            }
            , new Object[] {
            T01SW11_A14088Lb_Gots, T01SW11_n14088Lb_Gots
            }
            , new Object[] {
            T01SW12_A396EmprCod, T01SW12_A5532Lb_numero, T01SW12_A5555Lb_opcion
            }
            , new Object[] {
            T01SW13_A396EmprCod, T01SW13_A5532Lb_numero, T01SW13_A5555Lb_opcion
            }
            , new Object[] {
            T01SW14_A396EmprCod, T01SW14_A5532Lb_numero, T01SW14_A5555Lb_opcion
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SW18_A14088Lb_Gots, T01SW18_n14088Lb_Gots
            }
            , new Object[] {
            T01SW19_A396EmprCod, T01SW19_A5532Lb_numero, T01SW19_A5555Lb_opcion, T01SW19_A13460Lb_linCP, T01SW19_A13458Lb_TipCP
            }
            , new Object[] {
            T01SW20_A396EmprCod, T01SW20_A5532Lb_numero, T01SW20_A5555Lb_opcion, T01SW20_A5557Lb_LineaC
            }
            , new Object[] {
            T01SW21_A396EmprCod, T01SW21_A5532Lb_numero, T01SW21_A5555Lb_opcion
            }
            , new Object[] {
            T01SW22_A5532Lb_numero, T01SW22_A5555Lb_opcion, T01SW22_A5560Lb_LineaPr, T01SW22_A718PrdNom, T01SW22_A488ForPrdDsc, T01SW22_n488ForPrdDsc, T01SW22_A5561LB_CantP, T01SW22_A5562Lb_orden, T01SW22_A4338PrdUMeFo, T01SW22_A6059Lb_solup,
            T01SW22_A6545Lb_PTinP, T01SW22_A724PrdPreAct, T01SW22_A11663PrdCtw4, T01SW22_A10938PrdCtw3, T01SW22_A10937PrdCtw2, T01SW22_A10936PrdCtw1, T01SW22_A11363PrdGots, T01SW22_A396EmprCod, T01SW22_A719PrdNum, T01SW22_A490ForPrdUMe,
            T01SW22_A856ValCod
            }
            , new Object[] {
            T01SW23_A718PrdNom, T01SW23_A4338PrdUMeFo, T01SW23_A724PrdPreAct, T01SW23_A11663PrdCtw4, T01SW23_A10938PrdCtw3, T01SW23_A10937PrdCtw2, T01SW23_A10936PrdCtw1, T01SW23_A11363PrdGots, T01SW23_A856ValCod
            }
            , new Object[] {
            T01SW24_A488ForPrdDsc, T01SW24_n488ForPrdDsc
            }
            , new Object[] {
            T01SW25_A396EmprCod, T01SW25_A5532Lb_numero, T01SW25_A5555Lb_opcion, T01SW25_A5560Lb_LineaPr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SW29_A718PrdNom, T01SW29_A4338PrdUMeFo, T01SW29_A724PrdPreAct, T01SW29_A11663PrdCtw4, T01SW29_A10938PrdCtw3, T01SW29_A10937PrdCtw2, T01SW29_A10936PrdCtw1, T01SW29_A11363PrdGots, T01SW29_A856ValCod
            }
            , new Object[] {
            T01SW30_A488ForPrdDsc, T01SW30_n488ForPrdDsc
            }
            , new Object[] {
            T01SW31_A396EmprCod, T01SW31_A5532Lb_numero, T01SW31_A5555Lb_opcion, T01SW31_A5560Lb_LineaPr
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productovariable_TRN" ;
      Z490ForPrdUMe = (byte)(0) ;
      A490ForPrdUMe = (byte)(0) ;
   }

   private byte Z6545Lb_PTinP ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A4338PrdUMeFo ;
   private byte A856ValCod ;
   private byte A6545Lb_PTinP ;
   private byte Z4338PrdUMeFo ;
   private byte Z856ValCod ;
   private byte subGridlevel_producto_Backcolorstyle ;
   private byte subGridlevel_producto_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_producto_Allowselection ;
   private byte subGridlevel_producto_Allowhovering ;
   private byte subGridlevel_producto_Allowcollapsing ;
   private byte subGridlevel_producto_Collapsed ;
   private short nIsMod_821 ;
   private short Z5559Lb_UltlP ;
   private short Z5560Lb_LineaPr ;
   private short Z5562Lb_orden ;
   private short nRcdDeleted_821 ;
   private short nRcdExists_821 ;
   private short A5560Lb_LineaPr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount821 ;
   private short RcdFound821 ;
   private short nBlankRcdUsr821 ;
   private short A5559Lb_UltlP ;
   private short RcdFound819 ;
   private short A5562Lb_orden ;
   private short nIsDirty_819 ;
   private short nIsDirty_821 ;
   private short GXv_int8[] ;
   private int wcpOAV11Lb_numero ;
   private int Z5532Lb_numero ;
   private int nRC_GXsfl_37 ;
   private int nGXsfl_37_idx=1 ;
   private int Z6059Lb_solup ;
   private int A5532Lb_numero ;
   private int AV11Lb_numero ;
   private int trnEnded ;
   private int edtLb_numero_Enabled ;
   private int edtLb_opcion_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtLb_LineaPr_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtLB_CantP_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtLb_orden_Enabled ;
   private int edtLb_PTinP_Enabled ;
   private int edtPrdCtwSt_Enabled ;
   private int fRowAdded ;
   private int A6059Lb_solup ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_forprdume_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_producto_Backcolor ;
   private int subGridlevel_producto_Allbackcolor ;
   private int imgprompt_5562_Visible ;
   private int defedtLb_LineaPr_Enabled ;
   private int idxLst ;
   private int subGridlevel_producto_Selectedindex ;
   private int subGridlevel_producto_Selectioncolor ;
   private int subGridlevel_producto_Hoveringcolor ;
   private long GRIDLEVEL_PRODUCTO_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5561LB_CantP ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private String sPrefix ;
   private String sGXsfl_37_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV12Lb_opcion ;
   private String Z396EmprCod ;
   private String Z5555Lb_opcion ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String AV12Lb_opcion ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_numero_Internalname ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_opcion_Jsonclick ;
   private String divTableleaflevel_producto_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String Combo_forprdume_Caption ;
   private String Combo_forprdume_Cls ;
   private String Combo_forprdume_Internalname ;
   private String sMode821 ;
   private String edtLb_LineaPr_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtLB_CantP_Internalname ;
   private String edtLb_orden_Internalname ;
   private String edtLb_PTinP_Internalname ;
   private String edtPrdCtwSt_Internalname ;
   private String imgprompt_5562_Link ;
   private String sStyleString ;
   private String subGridlevel_producto_Internalname ;
   private String A407EmprNom ;
   private String A14088Lb_Gots ;
   private String A718PrdNom ;
   private String A11663PrdCtw4 ;
   private String A10938PrdCtw3 ;
   private String A10937PrdCtw2 ;
   private String A10936PrdCtw1 ;
   private String A11363PrdGots ;
   private String A488ForPrdDsc ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
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
   private String AV7Station ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String Z407EmprNom ;
   private String Z14088Lb_Gots ;
   private String Z718PrdNom ;
   private String Z11663PrdCtw4 ;
   private String Z10938PrdCtw3 ;
   private String Z10937PrdCtw2 ;
   private String Z10936PrdCtw1 ;
   private String Z11363PrdGots ;
   private String Z488ForPrdDsc ;
   private String imgprompt_5562_Internalname ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String subGridlevel_producto_Class ;
   private String subGridlevel_producto_Linesclass ;
   private String ROClassString ;
   private String edtLb_LineaPr_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtLB_CantP_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtLb_orden_Jsonclick ;
   private String imgprompt_5562_gximage ;
   private String sImgUrl ;
   private String edtLb_PTinP_Jsonclick ;
   private String edtPrdCtwSt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_producto_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_37_Refreshing=false ;
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
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_forprdume_Isgriditem ;
   private boolean Combo_forprdume_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n14088Lb_Gots ;
   private boolean n488ForPrdDsc ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
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
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A14097PrdCtwSt ;
   private String AV17ComboSelectedValue ;
   private String Z14097PrdCtwSt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_productoContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_productoRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_productoColumn ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_forprdume ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01SW8_A407EmprNom ;
   private boolean[] T01SW8_n407EmprNom ;
   private String[] T01SW9_A14088Lb_Gots ;
   private boolean[] T01SW9_n14088Lb_Gots ;
   private String[] T01SW10_A5555Lb_opcion ;
   private String[] T01SW10_A407EmprNom ;
   private boolean[] T01SW10_n407EmprNom ;
   private String[] T01SW10_A14088Lb_Gots ;
   private boolean[] T01SW10_n14088Lb_Gots ;
   private short[] T01SW10_A5559Lb_UltlP ;
   private String[] T01SW10_A396EmprCod ;
   private int[] T01SW10_A5532Lb_numero ;
   private String[] T01SW11_A14088Lb_Gots ;
   private boolean[] T01SW11_n14088Lb_Gots ;
   private String[] T01SW12_A396EmprCod ;
   private int[] T01SW12_A5532Lb_numero ;
   private String[] T01SW12_A5555Lb_opcion ;
   private String[] T01SW7_A5555Lb_opcion ;
   private short[] T01SW7_A5559Lb_UltlP ;
   private String[] T01SW7_A396EmprCod ;
   private int[] T01SW7_A5532Lb_numero ;
   private String[] T01SW13_A396EmprCod ;
   private int[] T01SW13_A5532Lb_numero ;
   private String[] T01SW13_A5555Lb_opcion ;
   private String[] T01SW14_A396EmprCod ;
   private int[] T01SW14_A5532Lb_numero ;
   private String[] T01SW14_A5555Lb_opcion ;
   private String[] T01SW6_A5555Lb_opcion ;
   private short[] T01SW6_A5559Lb_UltlP ;
   private String[] T01SW6_A396EmprCod ;
   private int[] T01SW6_A5532Lb_numero ;
   private String[] T01SW18_A14088Lb_Gots ;
   private boolean[] T01SW18_n14088Lb_Gots ;
   private String[] T01SW19_A396EmprCod ;
   private int[] T01SW19_A5532Lb_numero ;
   private String[] T01SW19_A5555Lb_opcion ;
   private short[] T01SW19_A13460Lb_linCP ;
   private String[] T01SW19_A13458Lb_TipCP ;
   private String[] T01SW20_A396EmprCod ;
   private int[] T01SW20_A5532Lb_numero ;
   private String[] T01SW20_A5555Lb_opcion ;
   private short[] T01SW20_A5557Lb_LineaC ;
   private String[] T01SW21_A396EmprCod ;
   private int[] T01SW21_A5532Lb_numero ;
   private String[] T01SW21_A5555Lb_opcion ;
   private int[] T01SW22_A5532Lb_numero ;
   private String[] T01SW22_A5555Lb_opcion ;
   private short[] T01SW22_A5560Lb_LineaPr ;
   private String[] T01SW22_A718PrdNom ;
   private String[] T01SW22_A488ForPrdDsc ;
   private boolean[] T01SW22_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01SW22_A5561LB_CantP ;
   private short[] T01SW22_A5562Lb_orden ;
   private byte[] T01SW22_A4338PrdUMeFo ;
   private int[] T01SW22_A6059Lb_solup ;
   private byte[] T01SW22_A6545Lb_PTinP ;
   private java.math.BigDecimal[] T01SW22_A724PrdPreAct ;
   private String[] T01SW22_A11663PrdCtw4 ;
   private String[] T01SW22_A10938PrdCtw3 ;
   private String[] T01SW22_A10937PrdCtw2 ;
   private String[] T01SW22_A10936PrdCtw1 ;
   private String[] T01SW22_A11363PrdGots ;
   private String[] T01SW22_A396EmprCod ;
   private String[] T01SW22_A719PrdNum ;
   private byte[] T01SW22_A490ForPrdUMe ;
   private byte[] T01SW22_A856ValCod ;
   private String[] T01SW4_A718PrdNom ;
   private byte[] T01SW4_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01SW4_A724PrdPreAct ;
   private String[] T01SW4_A11663PrdCtw4 ;
   private String[] T01SW4_A10938PrdCtw3 ;
   private String[] T01SW4_A10937PrdCtw2 ;
   private String[] T01SW4_A10936PrdCtw1 ;
   private String[] T01SW4_A11363PrdGots ;
   private byte[] T01SW4_A856ValCod ;
   private String[] T01SW5_A488ForPrdDsc ;
   private boolean[] T01SW5_n488ForPrdDsc ;
   private String[] T01SW23_A718PrdNom ;
   private byte[] T01SW23_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01SW23_A724PrdPreAct ;
   private String[] T01SW23_A11663PrdCtw4 ;
   private String[] T01SW23_A10938PrdCtw3 ;
   private String[] T01SW23_A10937PrdCtw2 ;
   private String[] T01SW23_A10936PrdCtw1 ;
   private String[] T01SW23_A11363PrdGots ;
   private byte[] T01SW23_A856ValCod ;
   private String[] T01SW24_A488ForPrdDsc ;
   private boolean[] T01SW24_n488ForPrdDsc ;
   private String[] T01SW25_A396EmprCod ;
   private int[] T01SW25_A5532Lb_numero ;
   private String[] T01SW25_A5555Lb_opcion ;
   private short[] T01SW25_A5560Lb_LineaPr ;
   private int[] T01SW3_A5532Lb_numero ;
   private String[] T01SW3_A5555Lb_opcion ;
   private short[] T01SW3_A5560Lb_LineaPr ;
   private java.math.BigDecimal[] T01SW3_A5561LB_CantP ;
   private short[] T01SW3_A5562Lb_orden ;
   private int[] T01SW3_A6059Lb_solup ;
   private byte[] T01SW3_A6545Lb_PTinP ;
   private String[] T01SW3_A396EmprCod ;
   private String[] T01SW3_A719PrdNum ;
   private byte[] T01SW3_A490ForPrdUMe ;
   private int[] T01SW2_A5532Lb_numero ;
   private String[] T01SW2_A5555Lb_opcion ;
   private short[] T01SW2_A5560Lb_LineaPr ;
   private java.math.BigDecimal[] T01SW2_A5561LB_CantP ;
   private short[] T01SW2_A5562Lb_orden ;
   private int[] T01SW2_A6059Lb_solup ;
   private byte[] T01SW2_A6545Lb_PTinP ;
   private String[] T01SW2_A396EmprCod ;
   private String[] T01SW2_A719PrdNum ;
   private byte[] T01SW2_A490ForPrdUMe ;
   private String[] T01SW29_A718PrdNom ;
   private byte[] T01SW29_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01SW29_A724PrdPreAct ;
   private String[] T01SW29_A11663PrdCtw4 ;
   private String[] T01SW29_A10938PrdCtw3 ;
   private String[] T01SW29_A10937PrdCtw2 ;
   private String[] T01SW29_A10936PrdCtw1 ;
   private String[] T01SW29_A11363PrdGots ;
   private byte[] T01SW29_A856ValCod ;
   private String[] T01SW30_A488ForPrdDsc ;
   private boolean[] T01SW30_n488ForPrdDsc ;
   private String[] T01SW31_A396EmprCod ;
   private int[] T01SW31_A5532Lb_numero ;
   private String[] T01SW31_A5555Lb_opcion ;
   private short[] T01SW31_A5560Lb_LineaPr ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18ForPrdUMe_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
}

final  class entradaensayolaboratorio_productovariable_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_productovariable_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_productovariable_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_productovariable_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratorio_productovariable_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SW2", "SELECT Lb_numero, Lb_opcion, Lb_LineaPr, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP, EmprCod, PrdNum, ForPrdUMe FROM TXPENS004 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ?  FOR UPDATE OF LB_CantP, Lb_orden, Lb_solup, Lb_PTinP, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW3", "SELECT Lb_numero, Lb_opcion, Lb_LineaPr, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP, EmprCod, PrdNum, ForPrdUMe FROM TXPENS004 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW4", "SELECT PrdNom, PrdUMeFo, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW6", "SELECT Lb_opcion, Lb_UltlP, EmprCod, Lb_numero FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?  FOR UPDATE OF Lb_UltlP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW7", "SELECT Lb_opcion, Lb_UltlP, EmprCod, Lb_numero FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW9", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW10", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_opcion, T2.EmprNom, T3.Lb_Gots, TM1.Lb_UltlP, TM1.EmprCod, TM1.Lb_numero FROM ((TXPENS002 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPENS001 T3 ON T3.EmprCod = TM1.EmprCod AND T3.Lb_numero = TM1.Lb_numero) WHERE TM1.EmprCod = ? and TM1.Lb_numero = ? and TM1.Lb_opcion = ? ORDER BY TM1.EmprCod, TM1.Lb_numero, TM1.Lb_opcion ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW11", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE ( Lb_numero > ? or Lb_numero = ? and Lb_opcion > ?) and EmprCod = ? ORDER BY EmprCod, Lb_numero, Lb_opcion) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SW14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE ( Lb_numero < ? or Lb_numero = ? and Lb_opcion < ?) and EmprCod = ? ORDER BY EmprCod DESC, Lb_numero DESC, Lb_opcion DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SW15", "INSERT INTO TXPENS002(Lb_opcion, Lb_UltlP, EmprCod, Lb_numero, Lb_UltLC, Lb_FechaR, Lb_HoraR, Lb_CosteE, Lb_Estado, Lb_FechaEn, Lb_HoraEn, Lb_numop, Lb_PreKg, Lb_FecPre, Lb_TaAuxC, Lb_famc1, Lb_famc2, Lb_famc3, Lb_FecEnt1, Lb_FecNoa1, Lb_ProvDef, Lb_NumAux, Lb_IntCod, Lb_CosteC, Lb_hhent1, Lb_hhnoa1, Lb_PreMt, Lb_ObsCR, Lb_opSt, Lb_opFc, Lb_ObsFac, Lb_UltLinC) VALUES(?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0)", GX_NOMASK, "TXPENS002")
         ,new UpdateCursor("T01SW16", "UPDATE TXPENS002 SET Lb_UltlP=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK, "TXPENS002")
         ,new UpdateCursor("T01SW17", "DELETE FROM TXPENS002  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK, "TXPENS002")
         ,new ForEachCursor("T01SW18", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW19", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SW20", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SW21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW22", "SELECT T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr, T2.PrdNom, T3.ForPrdDsc, T1.LB_CantP, T1.Lb_orden, T2.PrdUMeFo, T1.Lb_solup, T1.Lb_PTinP, T2.PrdPreAct, T2.PrdCtw4, T2.PrdCtw3, T2.PrdCtw2, T2.PrdCtw1, T2.PrdGots, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ValCod FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? and T1.Lb_LineaPr = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW23", "SELECT PrdNom, PrdUMeFo, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW24", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW25", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01SW26", "INSERT INTO TXPENS004(Lb_numero, Lb_opcion, Lb_LineaPr, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP, EmprCod, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS004")
         ,new UpdateCursor("T01SW27", "UPDATE TXPENS004 SET LB_CantP=?, Lb_orden=?, Lb_solup=?, Lb_PTinP=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ?", GX_NOMASK, "TXPENS004")
         ,new UpdateCursor("T01SW28", "DELETE FROM TXPENS004  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ?", GX_NOMASK, "TXPENS004")
         ,new ForEachCursor("T01SW29", "SELECT PrdNom, PrdUMeFo, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW30", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SW31", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 25 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

