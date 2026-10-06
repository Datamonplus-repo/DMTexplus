package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie1_impl extends GXDataArea
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
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_1P231( A396EmprCod, A323DevGenCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV13AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1P231( A396EmprCod, A44AlbRecCod, AV13AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6288DevGenDom = (byte)(GXutil.lval( httpContext.GetPar( "DevGenDom"))) ;
         n6288DevGenDom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         AV65Err_att = httpContext.GetPar( "Err_att") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_1P231( A396EmprCod, A252CliCod, A6288DevGenDom, AV65Err_att) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_37_1P231( A396EmprCod, A323DevGenCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action39") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_39_1P231( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DEVGENTRN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A329DevTrnNom = httpContext.GetPar( "DevTrnNom") ;
         n329DevTrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgadevgentrn1P20( A396EmprCod, A329DevTrnNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"DEVGENTRN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A329DevTrnNom = httpContext.GetPar( "DevTrnNom") ;
         n329DevTrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgadevgentrn1P20( A396EmprCod, A329DevTrnNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"DEVGENTRN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h327DevGenTrn = httpContext.GetPar( "h327DevGenTrn") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcadevgentrn1P231( A396EmprCod, h327DevGenTrn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_44( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_45( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A327DevGenTrn = (short)(GXutil.lval( httpContext.GetPar( "DevGenTrn"))) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_46( A396EmprCod, A327DevGenTrn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_47( A396EmprCod, A323DevGenCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level2") == 0 )
      {
         gxnrgridlevel_level2_newrow_invoke( ) ;
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
            AV75EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75EmprCod", AV75EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75EmprCod, "@!"))));
            AV76DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76DevGenCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVGENCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76DevGenCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion Piezas (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level2_newrow_invoke( )
   {
      nRC_GXsfl_169 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_169"))) ;
      nGXsfl_169_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_169_idx"))) ;
      sGXsfl_169_idx = httpContext.GetPar( "sGXsfl_169_idx") ;
      A1304DevUlin = (byte)(GXutil.lval( httpContext.GetPar( "DevUlin"))) ;
      n1304DevUlin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level2_newrow( ) ;
      /* End function gxnrGridlevel_level2_newrow_invoke */
   }

   public tdevpie1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpie1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie1_impl.class ));
   }

   public tdevpie1_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenCod_Internalname, httpContext.getMessage( "N Devolucion ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenCod_Internalname, GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprTrn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprTrn_Internalname, httpContext.getMessage( "EmprTrn", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprTrn_Internalname, GXutil.rtrim( A410EmprTrn), GXutil.rtrim( localUtil.format( A410EmprTrn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprTrn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprTrn_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgenfec_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgenfec_Internalname, httpContext.getMessage( "Fecha de Devolucion", ""), "", "", lblTextblockdevgenfec_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenFec_Internalname, httpContext.getMessage( "Fecha de Devolucion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevGenFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenFec_Internalname, localUtil.format(A325DevGenFec, "99/99/99"), localUtil.format( A325DevGenFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevGenFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevGenFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDevPie1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbreccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "", "", lblTextblockalbreccod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+"e111p231_client"+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 7, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgendom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgendom_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "", "", lblTextblockdevgendom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenDom_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenDom_Internalname, GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenDom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9") : localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenDom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclinom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblockclinom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbref_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbref_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "", "", lblTextblockalbref_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgentrn_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgentrn_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblockdevgentrn_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenTrn_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenTrn_Internalname, GXutil.rtrim( h327DevGenTrn), GXutil.rtrim( localUtil.format( h327DevGenTrn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtDevGenTrn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenTrn_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunidis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunidis_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblockalbrunidis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbruni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbruni_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblockalbruni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TDevPie1.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpiedis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpiedis_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblockalbrpiedis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable5_Internalname, tblUnnamedtable5_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgenuni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgenuni_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblockdevgenuni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenUni_Internalname, httpContext.getMessage( "Unidades Dev", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenUni_Internalname, GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenUni_Enabled!=0) ? localUtil.format( A328DevGenUni, "ZZZZZ9.99") : localUtil.format( A328DevGenUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgenpie_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgenpie_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblockdevgenpie_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenPie_Internalname, httpContext.getMessage( "Piezas Dev", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenPie_Internalname, GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level2( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie1.htm");
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

   public void gxdraw_gridlevel_level2( )
   {
      /*  Grid Control  */
      startgridcontrol169( ) ;
      nGXsfl_169_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount192 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_192 = (short)(1) ;
            scanStart1P2192( ) ;
            while ( RcdFound192 != 0 )
            {
               init_level_properties192( ) ;
               getByPrimaryKey1P2192( ) ;
               addRow1P2192( ) ;
               scanNext1P2192( ) ;
            }
            scanEnd1P2192( ) ;
            nBlankRcdCount192 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         standaloneNotModal1P2192( ) ;
         standaloneModal1P2192( ) ;
         sMode192 = Gx_mode ;
         while ( nGXsfl_169_idx < nRC_GXsfl_169 )
         {
            bGXsfl_169_Refreshing = true ;
            readRow1P2192( ) ;
            edtDevLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVLIN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtDevObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVOBS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevObs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            if ( ( nRcdExists_192 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1P2192( ) ;
            }
            sendRow1P2192( ) ;
            bGXsfl_169_Refreshing = false ;
         }
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1304DevUlin = B1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount192 = (short)(2) ;
         nRcdExists_192 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1P2192( ) ;
            while ( RcdFound192 != 0 )
            {
               sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_169192( ) ;
               init_level_properties192( ) ;
               standaloneNotModal1P2192( ) ;
               getByPrimaryKey1P2192( ) ;
               standaloneModal1P2192( ) ;
               addRow1P2192( ) ;
               scanNext1P2192( ) ;
            }
            scanEnd1P2192( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode192 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_169192( ) ;
         initAll1P2192( ) ;
         init_level_properties192( ) ;
         B1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         nRcdExists_192 = (short)(0) ;
         nIsMod_192 = (short)(0) ;
         nRcdDeleted_192 = (short)(0) ;
         nBlankRcdCount192 = (short)(nBlankRcdUsr192+nBlankRcdCount192) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount192 > 0 )
         {
            standaloneNotModal1P2192( ) ;
            standaloneModal1P2192( ) ;
            addRow1P2192( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDevLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount192 = (short)(nBlankRcdCount192-1) ;
         }
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1304DevUlin = B1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level2", Gridlevel_level2Container, subGridlevel_level2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData", Gridlevel_level2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData"+"V", Gridlevel_level2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level2ContainerData"+"V"+"\" value='"+Gridlevel_level2Container.GridValuesHidden()+"'/>") ;
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
      e121P22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z323DevGenCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z328DevGenUni = localUtil.ctond( httpContext.cgiGet( "Z328DevGenUni")) ;
            Z326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z325DevGenFec = localUtil.ctod( httpContext.cgiGet( "Z325DevGenFec"), 0) ;
            Z6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6288DevGenDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z410EmprTrn = httpContext.cgiGet( "Z410EmprTrn") ;
            n410EmprTrn = ((GXutil.strcmp("", A410EmprTrn)==0) ? true : false) ;
            Z324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "Z327DevGenTrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n324DevGenEst = false ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1304DevUlin = false ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            O1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "O326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O328DevGenUni = localUtil.ctond( httpContext.cgiGet( "O328DevGenUni")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_169 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_169"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "N44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "N327DevGenTrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "ALBRUNIENT")) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV75EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV76DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVGENCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV80Insert_AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV81Insert_DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_DEVGENTRN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCDEVGENTRN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV15MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            AV16PieAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV18Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV19Piezas = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13AlbRUni = httpContext.cgiGet( "vALBRUNI") ;
            AV11AlbRPDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12AlbRUDis = localUtil.ctond( httpContext.cgiGet( "vALBRUDIS")) ;
            AV65Err_att = httpContext.cgiGet( "vERR_ATT") ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVGENEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3066AlbDevPUni = localUtil.ctond( httpContext.cgiGet( "ALBDEVPUNI")) ;
            A5278AlbDevPPie = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDEVPPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV88Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable2_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable3_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable4_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable5_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A323DevGenCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            }
            else
            {
               A323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            }
            A410EmprTrn = httpContext.cgiGet( edtEmprTrn_Internalname) ;
            n410EmprTrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A410EmprTrn", A410EmprTrn);
            n410EmprTrn = ((GXutil.strcmp("", A410EmprTrn)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtDevGenFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVGENFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A325DevGenFec = GXutil.nullDate() ;
               n325DevGenFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            }
            else
            {
               A325DevGenFec = localUtil.ctod( httpContext.cgiGet( edtDevGenFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n325DevGenFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENDOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenDom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6288DevGenDom = (byte)(0) ;
               n6288DevGenDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
            }
            else
            {
               A6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6288DevGenDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            h327DevGenTrn = httpContext.cgiGet( edtDevGenTrn_Internalname) ;
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A328DevGenUni = localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            A326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDevPie1");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A323DevGenCod != Z323DevGenCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdevpie1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
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
                  sMode31 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode31 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound31 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P20( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEVGENCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevGenCod_Internalname ;
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
                        e121P22 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131P22 ();
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
         e131P22 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P231( ) ;
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
         disableAttributes1P231( ) ;
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

   public void confirm_1P20( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P231( ) ;
         }
         else
         {
            checkExtendedTable1P231( ) ;
            closeExtendedTableCursors1P231( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode31 = Gx_mode ;
         confirm_1P2192( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode31 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1P2192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      nGXsfl_169_idx = 0 ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         readRow1P2192( ) ;
         if ( ( nRcdExists_192 != 0 ) || ( nIsMod_192 != 0 ) )
         {
            getKey1P2192( ) ;
            if ( ( nRcdExists_192 == 0 ) && ( nRcdDeleted_192 == 0 ) )
            {
               if ( RcdFound192 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1P2192( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P2192( ) ;
                     closeExtendedTableCursors1P2192( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1304DevUlin = A1304DevUlin ;
                     n1304DevUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound192 != 0 )
               {
                  if ( nRcdDeleted_192 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1P2192( ) ;
                     load1P2192( ) ;
                     beforeValidate1P2192( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P2192( ) ;
                        O1304DevUlin = A1304DevUlin ;
                        n1304DevUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1P2192( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P2192( ) ;
                           closeExtendedTableCursors1P2192( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1304DevUlin = A1304DevUlin ;
                           n1304DevUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_192 == 0 )
                  {
                     GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDevLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevObs_Internalname, GXutil.rtrim( A1303DevObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx, GXutil.rtrim( Z1303DevObs)) ;
         httpContext.changePostValue( "nRcdDeleted_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_192 != 0 )
         {
            httpContext.changePostValue( "DEVLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVOBS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1304DevUlin = s1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1P20( )
   {
   }

   public void e121P22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpie1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpie1_impl.this.A396EmprCod = GXv_char2[0] ;
      tdevpie1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdevpie1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char4[0] = AV75EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdevpie1_impl.this.AV75EmprCod = GXv_char4[0] ;
      tdevpie1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie1_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75EmprCod", AV75EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV77WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV77WWPContext = GXv_SdtWWPContext5[0] ;
      AV78TrnContext.fromxml(AV79WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV78TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV88Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV89GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GXV1), 8, 0));
         while ( AV89GXV1 <= AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV82TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV89GXV1));
            if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbRecCod") == 0 )
            {
               AV80Insert_AlbRecCod = (int)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80Insert_AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Insert_AlbRecCod), 8, 0));
            }
            else if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "DevGenTrn") == 0 )
            {
               AV81Insert_DevGenTrn = (short)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81Insert_DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Insert_DevGenTrn), 4, 0));
            }
            AV89GXV1 = (int)(AV89GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89GXV1), 8, 0));
         }
      }
   }

   public void e131P22( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0))}, new String[] {"Mode","EmprCod","DevGenCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV78TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tdevpie1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1P231( int GX_JID )
   {
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z328DevGenUni = T01P25_A328DevGenUni[0] ;
            Z326DevGenPie = T01P25_A326DevGenPie[0] ;
            Z325DevGenFec = T01P25_A325DevGenFec[0] ;
            Z6288DevGenDom = T01P25_A6288DevGenDom[0] ;
            Z410EmprTrn = T01P25_A410EmprTrn[0] ;
            Z324DevGenEst = T01P25_A324DevGenEst[0] ;
            Z1304DevUlin = T01P25_A1304DevUlin[0] ;
            Z44AlbRecCod = T01P25_A44AlbRecCod[0] ;
            Z327DevGenTrn = T01P25_A327DevGenTrn[0] ;
         }
         else
         {
            Z328DevGenUni = A328DevGenUni ;
            Z326DevGenPie = A326DevGenPie ;
            Z325DevGenFec = A325DevGenFec ;
            Z6288DevGenDom = A6288DevGenDom ;
            Z410EmprTrn = A410EmprTrn ;
            Z324DevGenEst = A324DevGenEst ;
            Z1304DevUlin = A1304DevUlin ;
            Z44AlbRecCod = A44AlbRecCod ;
            Z327DevGenTrn = A327DevGenTrn ;
         }
      }
      if ( ( GX_JID == 44 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01P28_A47AlbREst[0] ;
         Z60AlbRUniUti = T01P28_A60AlbRUniUti[0] ;
         Z54AlbRPieUti = T01P28_A54AlbRPieUti[0] ;
         Z252CliCod = T01P28_A252CliCod[0] ;
         Z45AlbRef = T01P28_A45AlbRef[0] ;
         Z56AlbRUni = T01P28_A56AlbRUni[0] ;
         Z52AlbRPieEnt = T01P28_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T01P28_A58AlbRUniEnt[0] ;
      }
      if ( GX_JID == -42 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z252CliCod = A252CliCod ;
         Z410EmprTrn = A410EmprTrn ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
         Z47AlbREst = A47AlbREst ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z279CliNom = A279CliNom ;
         Z329DevTrnNom = A329DevTrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      AV88Pgmname = "TDevPie1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV75EmprCod)==0) )
      {
         A396EmprCod = AV75EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01P26 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01P26_A407EmprNom[0] ;
      n407EmprNom = T01P26_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV76DevGenCod) )
      {
         A323DevGenCod = AV76DevGenCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      if ( ! (0==AV76DevGenCod) )
      {
         edtDevGenCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDevGenCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV76DevGenCod) )
      {
         edtDevGenCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV80Insert_AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_DevGenTrn) )
      {
         edtDevGenTrn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenTrn_Enabled), 5, 0), true);
      }
      else
      {
         edtDevGenTrn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenTrn_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_DevGenTrn) )
      {
         A327DevGenTrn = AV81Insert_DevGenTrn ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         /* Using cursor T01P213 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         h327DevGenTrn = "" ;
         while ( (pr_default.getStatus(10) != 101) )
         {
            h327DevGenTrn = T01P213_A329DevTrnNom[0] ;
            n329DevTrnNom = T01P213_n329DevTrnNom[0] ;
            if (true) break;
         }
         pr_default.close(10);
         httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", h327DevGenTrn);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV80Insert_AlbRecCod) )
      {
         A44AlbRecCod = AV80Insert_AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A325DevGenFec)) && ( Gx_BScreen == 0 ) )
      {
         A325DevGenFec = GXutil.today( ) ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01P212 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            A3066AlbDevPUni = T01P212_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = T01P212_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            A5278AlbDevPPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         pr_default.close(9);
         /* Using cursor T01P210 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T01P210_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P210_n329DevTrnNom[0] ;
         pr_default.close(8);
         /* Using cursor T01P28 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         zm1P231( 44) ;
         A47AlbREst = T01P28_A47AlbREst[0] ;
         A60AlbRUniUti = T01P28_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01P28_A54AlbRPieUti[0] ;
         A252CliCod = T01P28_A252CliCod[0] ;
         n252CliCod = T01P28_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = T01P28_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01P28_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = T01P28_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01P28_A58AlbRUniEnt[0] ;
         pr_default.close(6);
         /* Using cursor T01P29 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01P29_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(7);
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
   }

   public void load1P231( )
   {
      /* Using cursor T01P215 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A47AlbREst = T01P215_A47AlbREst[0] ;
         A328DevGenUni = T01P215_A328DevGenUni[0] ;
         n328DevGenUni = T01P215_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T01P215_A326DevGenPie[0] ;
         n326DevGenPie = T01P215_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A60AlbRUniUti = T01P215_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01P215_A54AlbRPieUti[0] ;
         A407EmprNom = T01P215_A407EmprNom[0] ;
         n407EmprNom = T01P215_n407EmprNom[0] ;
         A325DevGenFec = T01P215_A325DevGenFec[0] ;
         n325DevGenFec = T01P215_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A6288DevGenDom = T01P215_A6288DevGenDom[0] ;
         n6288DevGenDom = T01P215_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A252CliCod = T01P215_A252CliCod[0] ;
         n252CliCod = T01P215_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01P215_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = T01P215_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A410EmprTrn = T01P215_A410EmprTrn[0] ;
         n410EmprTrn = T01P215_n410EmprTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410EmprTrn", A410EmprTrn);
         A329DevTrnNom = T01P215_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P215_n329DevTrnNom[0] ;
         A56AlbRUni = T01P215_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = T01P215_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01P215_A58AlbRUniEnt[0] ;
         A324DevGenEst = T01P215_A324DevGenEst[0] ;
         n324DevGenEst = T01P215_n324DevGenEst[0] ;
         A1304DevUlin = T01P215_A1304DevUlin[0] ;
         n1304DevUlin = T01P215_n1304DevUlin[0] ;
         A44AlbRecCod = T01P215_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P215_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T01P215_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P215_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         A3066AlbDevPUni = T01P215_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P215_A5278AlbDevPPie[0] ;
         zm1P231( -42) ;
      }
      pr_default.close(11);
      onLoadActions1P231( ) ;
   }

   public void onLoadActions1P231( )
   {
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         AV10AlbRUniDis = AV12AlbRUDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         AV9AlbRPieDis = AV11AlbRPDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      h327DevGenTrn = A329DevTrnNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", h327DevGenTrn);
   }

   public void checkExtendedTable1P231( )
   {
      nIsDirty_31 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h327DevGenTrn)==0) )
      {
         nIsDirty_31 = (short)(1) ;
         A327DevGenTrn = (short)(0) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A329DevTrnNom = h327DevGenTrn ;
         n329DevTrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
         /* Using cursor T01P216 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n329DevTrnNom), A329DevTrnNom, A396EmprCod});
         A396EmprCod = T01P216_A396EmprCod[0] ;
         A327DevGenTrn = T01P216_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P216_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         A327DevGenTrn = T01P216_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P216_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "DEVGENTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenTrn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", h327DevGenTrn);
      if ( (0==A44AlbRecCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion es requerido.", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal8[0] = AV10AlbRUniDis ;
         GXv_int9[0] = AV11AlbRPDis ;
         GXv_decimal10[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9, GXv_decimal10, GXv_char3) ;
         tdevpie1_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevpie1_impl.this.A44AlbRecCod = GXv_int6[0] ;
         tdevpie1_impl.this.AV9AlbRPieDis = GXv_int7[0] ;
         tdevpie1_impl.this.AV10AlbRUniDis = GXv_decimal8[0] ;
         tdevpie1_impl.this.AV11AlbRPDis = GXv_int9[0] ;
         tdevpie1_impl.this.AV12AlbRUDis = GXv_decimal10[0] ;
         tdevpie1_impl.this.AV13AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      }
      if ( (0==A44AlbRecCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion NO valido", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int11[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int11, GXv_char3) ;
         tdevpie1_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevpie1_impl.this.A252CliCod = GXv_int9[0] ;
         tdevpie1_impl.this.A6288DevGenDom = GXv_int11[0] ;
         tdevpie1_impl.this.AV65Err_att = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ && ( GXutil.strcmp(AV65Err_att, "") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Err_att, 1, "DEVGENDOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenDom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         AV10AlbRUniDis = AV12AlbRUDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         AV9AlbRPieDis = AV11AlbRPDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
      if ( (GXutil.strcmp("", h327DevGenTrn)==0) )
      {
         nIsDirty_31 = (short)(1) ;
         A327DevGenTrn = (short)(0) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A329DevTrnNom = h327DevGenTrn ;
         n329DevTrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
         /* Using cursor T01P217 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n329DevTrnNom), A329DevTrnNom, A396EmprCod});
         A327DevGenTrn = T01P217_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P217_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         A327DevGenTrn = T01P217_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P217_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         if ( ! ( (pr_default.getStatus(13) == 101) ) )
         {
            pr_default.readNext(13);
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "DEVGENTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenTrn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(13);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", h327DevGenTrn);
      /* Using cursor T01P28 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A47AlbREst = T01P28_A47AlbREst[0] ;
      A60AlbRUniUti = T01P28_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01P28_A54AlbRPieUti[0] ;
      A252CliCod = T01P28_A252CliCod[0] ;
      n252CliCod = T01P28_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = T01P28_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = T01P28_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = T01P28_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01P28_A58AlbRUniEnt[0] ;
      pr_default.close(6);
      nIsDirty_31 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_31 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         nIsDirty_31 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            nIsDirty_31 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      /* Using cursor T01P29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P29_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T01P210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A327DevGenTrn) && (GXutil.strcmp("", A329DevTrnNom)==0) || (0==A327DevGenTrn) && n327DevGenTrn || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevGenTrn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A329DevTrnNom = T01P210_A329DevTrnNom[0] ;
      n329DevTrnNom = T01P210_n329DevTrnNom[0] ;
      pr_default.close(8);
      /* Using cursor T01P212 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A3066AlbDevPUni = T01P212_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P212_A5278AlbDevPPie[0] ;
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         nIsDirty_31 = (short)(1) ;
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1P231( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_44( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01P28 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A47AlbREst = T01P28_A47AlbREst[0] ;
      A60AlbRUniUti = T01P28_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01P28_A54AlbRPieUti[0] ;
      A252CliCod = T01P28_A252CliCod[0] ;
      n252CliCod = T01P28_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = T01P28_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = T01P28_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = T01P28_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01P28_A58AlbRUniEnt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_45( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01P218 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P218_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_46( String A396EmprCod ,
                          short A327DevGenTrn )
   {
      /* Using cursor T01P219 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (0==A327DevGenTrn) && (GXutil.strcmp("", A329DevTrnNom)==0) || (0==A327DevGenTrn) && n327DevGenTrn || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevGenTrn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A329DevTrnNom = T01P219_A329DevTrnNom[0] ;
      n329DevTrnNom = T01P219_n329DevTrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A329DevTrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_47( String A396EmprCod ,
                          int A323DevGenCod )
   {
      /* Using cursor T01P221 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A3066AlbDevPUni = T01P221_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P221_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1P231( )
   {
      /* Using cursor T01P222 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01P25 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01P25_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P231( 42) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01P25_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         A328DevGenUni = T01P25_A328DevGenUni[0] ;
         n328DevGenUni = T01P25_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T01P25_A326DevGenPie[0] ;
         n326DevGenPie = T01P25_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A325DevGenFec = T01P25_A325DevGenFec[0] ;
         n325DevGenFec = T01P25_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A6288DevGenDom = T01P25_A6288DevGenDom[0] ;
         n6288DevGenDom = T01P25_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A410EmprTrn = T01P25_A410EmprTrn[0] ;
         n410EmprTrn = T01P25_n410EmprTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410EmprTrn", A410EmprTrn);
         A324DevGenEst = T01P25_A324DevGenEst[0] ;
         n324DevGenEst = T01P25_n324DevGenEst[0] ;
         A1304DevUlin = T01P25_A1304DevUlin[0] ;
         n1304DevUlin = T01P25_n1304DevUlin[0] ;
         A44AlbRecCod = T01P25_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P25_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T01P25_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P25_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P231( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey1P231( ) ;
         }
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey1P231( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1P231( ) ;
      if ( RcdFound31 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T01P223 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01P223_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T01P223_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01P223_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T01P223_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T01P223_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T01P224 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T01P224_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T01P224_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T01P224_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T01P224_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T01P224_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P231( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1P231( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               A323DevGenCod = Z323DevGenCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVGENCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               update1P231( ) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               /* Insert record */
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1P231( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVGENCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A1304DevUlin = O1304DevUlin ;
                  n1304DevUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1P231( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
      {
         A323DevGenCod = Z323DevGenCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVGENCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1P231( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h327DevGenTrn)==0) )
         {
            A327DevGenTrn = (short)(0) ;
            n327DevGenTrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         }
         else
         {
            A329DevTrnNom = h327DevGenTrn ;
            n329DevTrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
            /* Using cursor T01P225 */
            pr_default.execute(20, new Object[] {Boolean.valueOf(n329DevTrnNom), A329DevTrnNom, A396EmprCod});
            A396EmprCod = T01P225_A396EmprCod[0] ;
            A327DevGenTrn = T01P225_A327DevGenTrn[0] ;
            n327DevGenTrn = T01P225_n327DevGenTrn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            A327DevGenTrn = T01P225_A327DevGenTrn[0] ;
            n327DevGenTrn = T01P225_n327DevGenTrn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               pr_default.readNext(20);
               if ( ! ( (pr_default.getStatus(20) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "DEVGENTRN");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevGenTrn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(20);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", h327DevGenTrn);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01P24 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z328DevGenUni, T01P24_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != T01P24_A326DevGenPie[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T01P24_A325DevGenFec[0])) ) || ( Z6288DevGenDom != T01P24_A6288DevGenDom[0] ) || ( GXutil.strcmp(Z410EmprTrn, T01P24_A410EmprTrn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z324DevGenEst != T01P24_A324DevGenEst[0] ) || ( Z1304DevUlin != T01P24_A1304DevUlin[0] ) || ( Z44AlbRecCod != T01P24_A44AlbRecCod[0] ) || ( Z327DevGenTrn != T01P24_A327DevGenTrn[0] ) )
         {
            if ( DecimalUtil.compareTo(Z328DevGenUni, T01P24_A328DevGenUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevGenUni");
               GXutil.writeLogRaw("Old: ",Z328DevGenUni);
               GXutil.writeLogRaw("Current: ",T01P24_A328DevGenUni[0]);
            }
            if ( Z326DevGenPie != T01P24_A326DevGenPie[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevGenPie");
               GXutil.writeLogRaw("Old: ",Z326DevGenPie);
               GXutil.writeLogRaw("Current: ",T01P24_A326DevGenPie[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T01P24_A325DevGenFec[0])) ) )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevGenFec");
               GXutil.writeLogRaw("Old: ",Z325DevGenFec);
               GXutil.writeLogRaw("Current: ",T01P24_A325DevGenFec[0]);
            }
            if ( Z6288DevGenDom != T01P24_A6288DevGenDom[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevGenDom");
               GXutil.writeLogRaw("Old: ",Z6288DevGenDom);
               GXutil.writeLogRaw("Current: ",T01P24_A6288DevGenDom[0]);
            }
            if ( GXutil.strcmp(Z410EmprTrn, T01P24_A410EmprTrn[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"EmprTrn");
               GXutil.writeLogRaw("Old: ",Z410EmprTrn);
               GXutil.writeLogRaw("Current: ",T01P24_A410EmprTrn[0]);
            }
            if ( Z324DevGenEst != T01P24_A324DevGenEst[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevGenEst");
               GXutil.writeLogRaw("Old: ",Z324DevGenEst);
               GXutil.writeLogRaw("Current: ",T01P24_A324DevGenEst[0]);
            }
            if ( Z1304DevUlin != T01P24_A1304DevUlin[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevUlin");
               GXutil.writeLogRaw("Old: ",Z1304DevUlin);
               GXutil.writeLogRaw("Current: ",T01P24_A1304DevUlin[0]);
            }
            if ( Z44AlbRecCod != T01P24_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01P24_A44AlbRecCod[0]);
            }
            if ( Z327DevGenTrn != T01P24_A327DevGenTrn[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevGenTrn");
               GXutil.writeLogRaw("Old: ",Z327DevGenTrn);
               GXutil.writeLogRaw("Current: ",T01P24_A327DevGenTrn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01P226 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01P226_A47AlbREst[0] ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01P226_A60AlbRUniUti[0]) != 0 ) || ( Z54AlbRPieUti != T01P226_A54AlbRPieUti[0] ) || ( Z252CliCod != T01P226_A252CliCod[0] ) || ( GXutil.strcmp(Z45AlbRef, T01P226_A45AlbRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, T01P226_A56AlbRUni[0]) != 0 ) || ( Z52AlbRPieEnt != T01P226_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01P226_A58AlbRUniEnt[0]) != 0 ) )
         {
            if ( Z47AlbREst != T01P226_A47AlbREst[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01P226_A47AlbREst[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01P226_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01P226_A60AlbRUniUti[0]);
            }
            if ( Z54AlbRPieUti != T01P226_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01P226_A54AlbRPieUti[0]);
            }
            if ( Z252CliCod != T01P226_A252CliCod[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01P226_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01P226_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01P226_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01P226_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01P226_A56AlbRUni[0]);
            }
            if ( Z52AlbRPieEnt != T01P226_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01P226_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01P226_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01P226_A58AlbRUniEnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P231( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P231( 0) ;
         checkOptimisticConcurrency1P231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P231( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P227 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n410EmprTrn), A410EmprTrn, Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(22) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P231( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.updemprtrn(remoteHandle, context).execute( A396EmprCod, A323DevGenCod) ;
                     }
                     if ( ! (0==A323DevGenCod) && true /* After */ && true /* Level */ )
                     {
                        httpContext.wjLoc = formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A328DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(A326DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A60AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(A54AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P231( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1P20( ) ;
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
            load1P231( ) ;
         }
         endLevel1P231( ) ;
      }
      closeExtendedTableCursors1P231( ) ;
   }

   public void update1P231( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P231( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P228 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n410EmprTrn), A410EmprTrn, Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P231( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P231( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.updemprtrn(remoteHandle, context).execute( A396EmprCod, A323DevGenCod) ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P231( ) ;
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
         endLevel1P231( ) ;
      }
      closeExtendedTableCursors1P231( ) ;
   }

   public void deferredUpdate1P231( )
   {
   }

   public void delete( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P231( ) ;
         afterConfirm1P231( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P231( ) ;
            if ( AnyError == 0 )
            {
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               scanStart1P2192( ) ;
               while ( RcdFound192 != 0 )
               {
                  getByPrimaryKey1P2192( ) ;
                  delete1P2192( ) ;
                  scanNext1P2192( ) ;
                  O1304DevUlin = A1304DevUlin ;
                  n1304DevUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               }
               scanEnd1P2192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P229 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P231( ) ;
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
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P231( ) ;
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P231( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
         else
         {
            AV10AlbRUniDis = A57AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
         if ( true )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
            {
               AV14KilAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
            }
         }
         if ( true )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
            {
               AV15MetAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
            }
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV17Kilos = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV18Metros = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         }
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
         else
         {
            AV9AlbRPieDis = A51AlbRPieDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
         AV16PieAnt = O326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         AV19Piezas = A326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         /* Using cursor T01P230 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01P230_A47AlbREst[0] ;
         Z60AlbRUniUti = T01P230_A60AlbRUniUti[0] ;
         Z54AlbRPieUti = T01P230_A54AlbRPieUti[0] ;
         Z252CliCod = T01P230_A252CliCod[0] ;
         Z45AlbRef = T01P230_A45AlbRef[0] ;
         Z56AlbRUni = T01P230_A56AlbRUni[0] ;
         Z52AlbRPieEnt = T01P230_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T01P230_A58AlbRUniEnt[0] ;
         A47AlbREst = T01P230_A47AlbREst[0] ;
         A60AlbRUniUti = T01P230_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01P230_A54AlbRPieUti[0] ;
         A252CliCod = T01P230_A252CliCod[0] ;
         n252CliCod = T01P230_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = T01P230_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01P230_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = T01P230_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01P230_A58AlbRUniEnt[0] ;
         pr_default.close(25);
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
         /* Using cursor T01P231 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01P231_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(26);
         /* Using cursor T01P232 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T01P232_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P232_n329DevTrnNom[0] ;
         pr_default.close(27);
         /* Using cursor T01P234 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A3066AlbDevPUni = T01P234_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = T01P234_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            A5278AlbDevPPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         pr_default.close(28);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P235 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas devueltas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void processNestedLevel1P2192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      nGXsfl_169_idx = 0 ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         readRow1P2192( ) ;
         if ( ( nRcdExists_192 != 0 ) || ( nIsMod_192 != 0 ) )
         {
            standaloneNotModal1P2192( ) ;
            getKey1P2192( ) ;
            if ( ( nRcdExists_192 == 0 ) && ( nRcdDeleted_192 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1P2192( ) ;
            }
            else
            {
               if ( RcdFound192 != 0 )
               {
                  if ( ( nRcdDeleted_192 != 0 ) && ( nRcdExists_192 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1P2192( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1P2192( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_192 == 0 )
                  {
                     GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1304DevUlin = A1304DevUlin ;
            n1304DevUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         }
         httpContext.changePostValue( edtDevLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevObs_Internalname, GXutil.rtrim( A1303DevObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx, GXutil.rtrim( Z1303DevObs)) ;
         httpContext.changePostValue( "nRcdDeleted_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_192 != 0 )
         {
            httpContext.changePostValue( "DEVLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVOBS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1P2192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      nRcdExists_192 = (short)(0) ;
      nIsMod_192 = (short)(0) ;
      nRcdDeleted_192 = (short)(0) ;
   }

   public void processLevel1P231( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel1P2192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01P236 */
      pr_default.execute(30, new Object[] {Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
   }

   public void updateTablesN11P231( )
   {
      /* Using cursor T01P237 */
      pr_default.execute(31, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1P231( )
   {
      pr_default.close(2);
      pr_default.close(21);
      if ( AnyError == 0 )
      {
         beforeComplete1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevpie1");
         if ( AnyError == 0 )
         {
            confirmValues1P20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevpie1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P231( )
   {
      /* Scan By routine */
      /* Using cursor T01P238 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01P238_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P231( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01P238_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void scanEnd1P231( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1P231( )
   {
      /* After Confirm Rules */
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int9[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int9) ;
         tdevpie1_impl.this.A323DevGenCod = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void beforeInsert1P231( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P231( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P231( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P231( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P231( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P231( )
   {
      edtDevGenCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      edtEmprTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprTrn_Enabled), 5, 0), true);
      edtDevGenFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtDevGenDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtDevGenTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenTrn_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
   }

   public void zm1P2192( int GX_JID )
   {
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1303DevObs = T01P23_A1303DevObs[0] ;
         }
         else
         {
            Z1303DevObs = A1303DevObs ;
         }
      }
      if ( GX_JID == -48 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         Z1303DevObs = A1303DevObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1P2192( )
   {
   }

   public void standaloneModal1P2192( )
   {
      if ( isIns( )  )
      {
         A1304DevUlin = (byte)(O1304DevUlin+1) ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1302DevLin = A1304DevUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDevLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      }
      else
      {
         edtDevLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      }
   }

   public void load1P2192( )
   {
      /* Using cursor T01P239 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1303DevObs = T01P239_A1303DevObs[0] ;
         zm1P2192( -48) ;
      }
      pr_default.close(33);
      onLoadActions1P2192( ) ;
   }

   public void onLoadActions1P2192( )
   {
   }

   public void checkExtendedTable1P2192( )
   {
      nIsDirty_192 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1P2192( ) ;
   }

   public void closeExtendedTableCursors1P2192( )
   {
   }

   public void enableDisable1P2192( )
   {
   }

   public void getKey1P2192( )
   {
      /* Using cursor T01P240 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound192 = (short)(1) ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
      }
      pr_default.close(34);
   }

   public void getByPrimaryKey1P2192( )
   {
      /* Using cursor T01P23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01P23_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P2192( 48) ;
         RcdFound192 = (short)(1) ;
         initializeNonKey1P2192( ) ;
         A1302DevLin = T01P23_A1302DevLin[0] ;
         A1303DevObs = T01P23_A1303DevObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P2192( ) ;
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound192 = (short)(0) ;
         initializeNonKey1P2192( ) ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1P2192( ) ;
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P2192( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1P2192( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1303DevObs, T01P22_A1303DevObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1303DevObs, T01P22_A1303DevObs[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie1:[seudo value changed for attri]"+"DevObs");
               GXutil.writeLogRaw("Old: ",Z1303DevObs);
               GXutil.writeLogRaw("Current: ",T01P22_A1303DevObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P2192( )
   {
      beforeValidate1P2192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P2192( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P2192( 0) ;
         checkOptimisticConcurrency1P2192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P2192( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P2192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P241 */
                  pr_default.execute(35, new Object[] {Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin), A1303DevObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(35) == 1) )
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
            load1P2192( ) ;
         }
         endLevel1P2192( ) ;
      }
      closeExtendedTableCursors1P2192( ) ;
   }

   public void update1P2192( )
   {
      beforeValidate1P2192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P2192( ) ;
      }
      if ( ( nIsMod_192 != 0 ) || ( nIsDirty_192 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1P2192( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1P2192( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1P2192( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01P242 */
                     pr_default.execute(36, new Object[] {A1303DevObs, A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                     if ( (pr_default.getStatus(36) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1P2192( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1P2192( ) ;
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
            endLevel1P2192( ) ;
         }
      }
      closeExtendedTableCursors1P2192( ) ;
   }

   public void deferredUpdate1P2192( )
   {
   }

   public void delete1P2192( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1P2192( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P2192( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P2192( ) ;
         afterConfirm1P2192( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P2192( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01P243 */
               pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
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
      sMode192 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P2192( ) ;
      Gx_mode = sMode192 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P2192( )
   {
      standaloneModal1P2192( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1P2192( )
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

   public void scanStart1P2192( )
   {
      /* Scan By routine */
      /* Using cursor T01P244 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = T01P244_A1302DevLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P2192( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = T01P244_A1302DevLin[0] ;
      }
   }

   public void scanEnd1P2192( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1P2192( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P2192( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P2192( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P2192( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P2192( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P2192( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P2192( )
   {
      edtDevLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtDevObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevObs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
   }

   public void send_integrity_lvl_hashes1P2192( )
   {
   }

   public void send_integrity_lvl_hashes1P231( )
   {
   }

   public void subsflControlProps_169192( )
   {
      edtDevLin_Internalname = "DEVLIN_"+sGXsfl_169_idx ;
      edtDevObs_Internalname = "DEVOBS_"+sGXsfl_169_idx ;
   }

   public void subsflControlProps_fel_169192( )
   {
      edtDevLin_Internalname = "DEVLIN_"+sGXsfl_169_fel_idx ;
      edtDevObs_Internalname = "DEVOBS_"+sGXsfl_169_fel_idx ;
   }

   public void addRow1P2192( )
   {
      nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      sendRow1P2192( ) ;
   }

   public void sendRow1P2192( )
   {
      Gridlevel_level2Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(0) ;
         subGridlevel_level2_Backcolor = subGridlevel_level2_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
         }
         subGridlevel_level2_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_169_idx) % (2))) == 0 )
         {
            subGridlevel_level2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
            {
               subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
            {
               subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_192_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1302DevLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_192_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevObs_Internalname,GXutil.rtrim( A1303DevObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level2Row);
      send_integrity_lvl_hashes1P2192( ) ;
      GXCCtl = "Z1302DevLin_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1303DevObs_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1303DevObs));
      GXCCtl = "nRcdDeleted_192_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_192_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_192_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_169_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV78TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV78TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV75EmprCod));
      GXCCtl = "vDEVGENCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV76DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVOBS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level2Container.AddRow(Gridlevel_level2Row);
   }

   public void readRow1P2192( )
   {
      nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      edtDevLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVLIN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVOBS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevLin_Internalname ;
         wbErr = true ;
         A1302DevLin = (byte)(0) ;
      }
      else
      {
         A1302DevLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1303DevObs = httpContext.cgiGet( edtDevObs_Internalname) ;
      GXCCtl = "Z1302DevLin_" + sGXsfl_169_idx ;
      Z1302DevLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1303DevObs_" + sGXsfl_169_idx ;
      Z1303DevObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_192_" + sGXsfl_169_idx ;
      nRcdDeleted_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_192_" + sGXsfl_169_idx ;
      nRcdExists_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_192_" + sGXsfl_169_idx ;
      nIsMod_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDevLin_Enabled = edtDevLin_Enabled ;
   }

   public void confirmValues1P20( )
   {
      nGXsfl_169_idx = 0 ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_169192( ) ;
         httpContext.changePostValue( "Z1302DevLin_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z1303DevObs_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevpie1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV75EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV76DevGenCod,8,0))}, new String[] {"Gx_mode","EmprCod","DevGenCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDevPie1");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdevpie1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z323DevGenCod", GXutil.ltrim( localUtil.ntoc( Z323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z328DevGenUni", GXutil.ltrim( localUtil.ntoc( Z328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z326DevGenPie", GXutil.ltrim( localUtil.ntoc( Z326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z325DevGenFec", localUtil.dtoc( Z325DevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6288DevGenDom", GXutil.ltrim( localUtil.ntoc( Z6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z410EmprTrn", GXutil.rtrim( Z410EmprTrn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z324DevGenEst", GXutil.ltrim( localUtil.ntoc( Z324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1304DevUlin", GXutil.ltrim( localUtil.ntoc( Z1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z327DevGenTrn", GXutil.ltrim( localUtil.ntoc( Z327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1304DevUlin", GXutil.ltrim( localUtil.ntoc( O1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O326DevGenPie", GXutil.ltrim( localUtil.ntoc( O326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O328DevGenUni", GXutil.ltrim( localUtil.ntoc( O328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_169", GXutil.ltrim( localUtil.ntoc( nGXsfl_169_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N327DevGenTrn", GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV78TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV78TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV78TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV75EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGENCOD", GXutil.ltrim( localUtil.ntoc( AV76DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVGENCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76DevGenCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV80Insert_AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_DEVGENTRN", GXutil.ltrim( localUtil.ntoc( AV81Insert_DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCDEVGENTRN", GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV16PieAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEZAS", GXutil.ltrim( localUtil.ntoc( AV19Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNI", GXutil.rtrim( AV13AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPDIS", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUDIS", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_ATT", GXutil.rtrim( AV65Err_att));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENEST", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVULIN", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVTRNNOM", GXutil.rtrim( A329DevTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDEVPUNI", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDEVPPIE", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV88Pgmname));
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
      return formatLink("app.tdevpie1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV75EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV76DevGenCod,8,0))}, new String[] {"Gx_mode","EmprCod","DevGenCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDevPie1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion Piezas (Header)", "") ;
   }

   public void initializeNonKey1P231( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      h327DevGenTrn = "" ;
      AV13AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      AV9AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      AV11AlbRPDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
      AV12AlbRUDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      AV14KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      AV15MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      AV16PieAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV17Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      AV18Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      AV19Piezas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      AV65Err_att = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A6288DevGenDom = (byte)(0) ;
      n6288DevGenDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A410EmprTrn = "" ;
      n410EmprTrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A410EmprTrn", A410EmprTrn);
      n410EmprTrn = ((GXutil.strcmp("", A410EmprTrn)==0) ? true : false) ;
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A324DevGenEst = (byte)(0) ;
      n324DevGenEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A324DevGenEst", GXutil.str( A324DevGenEst, 1, 0));
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      A5278AlbDevPPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      A1304DevUlin = (byte)(0) ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      O1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z6288DevGenDom = (byte)(0) ;
      Z410EmprTrn = "" ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z47AlbREst = (byte)(0) ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z54AlbRPieUti = 0 ;
      Z252CliCod = 0 ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAll1P231( )
   {
      A323DevGenCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      initializeNonKey1P231( ) ;
   }

   public void standaloneModalInsert( )
   {
      A325DevGenFec = i325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
   }

   public void initializeNonKey1P2192( )
   {
      A1303DevObs = "" ;
      Z1303DevObs = "" ;
   }

   public void initAll1P2192( )
   {
      A1302DevLin = (byte)(0) ;
      initializeNonKey1P2192( ) ;
   }

   public void standaloneModalInsert1P2192( )
   {
      A1304DevUlin = i1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415105436", true, true);
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
      httpContext.AddJavascriptSource("tdevpie1.js", "?202682415105436", false, true);
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

   public void init_level_properties192( )
   {
      edtDevLin_Enabled = defedtDevLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
   }

   public void startgridcontrol169( )
   {
      Gridlevel_level2Container.AddObjectProperty("GridName", "Gridlevel_level2");
      Gridlevel_level2Container.AddObjectProperty("Header", subGridlevel_level2_Header);
      Gridlevel_level2Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level2Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A1303DevObs));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtDevGenCod_Internalname = "DEVGENCOD" ;
      edtEmprTrn_Internalname = "EMPRTRN" ;
      lblTextblockdevgenfec_Internalname = "TEXTBLOCKDEVGENFEC" ;
      edtDevGenFec_Internalname = "DEVGENFEC" ;
      divUnnamedtabledevgenfec_Internalname = "UNNAMEDTABLEDEVGENFEC" ;
      lblTextblockalbreccod_Internalname = "TEXTBLOCKALBRECCOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      divUnnamedtablealbreccod_Internalname = "UNNAMEDTABLEALBRECCOD" ;
      lblTextblockdevgendom_Internalname = "TEXTBLOCKDEVGENDOM" ;
      edtDevGenDom_Internalname = "DEVGENDOM" ;
      divUnnamedtabledevgendom_Internalname = "UNNAMEDTABLEDEVGENDOM" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = "TEXTBLOCKCLINOM" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtableclinom_Internalname = "UNNAMEDTABLECLINOM" ;
      lblTextblockalbref_Internalname = "TEXTBLOCKALBREF" ;
      edtAlbRef_Internalname = "ALBREF" ;
      divUnnamedtablealbref_Internalname = "UNNAMEDTABLEALBREF" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTextblockdevgentrn_Internalname = "TEXTBLOCKDEVGENTRN" ;
      edtDevGenTrn_Internalname = "DEVGENTRN" ;
      divUnnamedtabledevgentrn_Internalname = "UNNAMEDTABLEDEVGENTRN" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      lblTextblockalbrunidis_Internalname = "TEXTBLOCKALBRUNIDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      divUnnamedtablealbrunidis_Internalname = "UNNAMEDTABLEALBRUNIDIS" ;
      lblTextblockalbruni_Internalname = "TEXTBLOCKALBRUNI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      divUnnamedtablealbruni_Internalname = "UNNAMEDTABLEALBRUNI" ;
      lblTextblockalbrpiedis_Internalname = "TEXTBLOCKALBRPIEDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtablealbrpiedis_Internalname = "UNNAMEDTABLEALBRPIEDIS" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      lblTextblockdevgenuni_Internalname = "TEXTBLOCKDEVGENUNI" ;
      edtDevGenUni_Internalname = "DEVGENUNI" ;
      divUnnamedtabledevgenuni_Internalname = "UNNAMEDTABLEDEVGENUNI" ;
      lblTextblockdevgenpie_Internalname = "TEXTBLOCKDEVGENPIE" ;
      edtDevGenPie_Internalname = "DEVGENPIE" ;
      divUnnamedtabledevgenpie_Internalname = "UNNAMEDTABLEDEVGENPIE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      tblUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtDevLin_Internalname = "DEVLIN" ;
      edtDevObs_Internalname = "DEVOBS" ;
      divTableleaflevel_level2_Internalname = "TABLELEAFLEVEL_LEVEL2" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2" ;
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
      subGridlevel_level2_Allowcollapsing = (byte)(0) ;
      subGridlevel_level2_Allowselection = (byte)(0) ;
      subGridlevel_level2_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Devolucion Piezas (Header)", "") );
      edtDevObs_Jsonclick = "" ;
      edtDevLin_Jsonclick = "" ;
      subGridlevel_level2_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level2_Backcolorstyle = (byte)(0) ;
      edtDevObs_Enabled = 1 ;
      edtDevLin_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDevGenPie_Jsonclick = "" ;
      edtDevGenPie_Enabled = 0 ;
      edtDevGenUni_Jsonclick = "" ;
      edtDevGenUni_Enabled = 0 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "A Devolver", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Existencias Almacen", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      edtDevGenTrn_Jsonclick = "" ;
      edtDevGenTrn_Enabled = 1 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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
      edtDevGenDom_Jsonclick = "" ;
      edtDevGenDom_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      edtDevGenFec_Jsonclick = "" ;
      edtDevGenFec_Enabled = 1 ;
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
      edtEmprTrn_Jsonclick = "" ;
      edtEmprTrn_Enabled = 1 ;
      edtDevGenCod_Jsonclick = "" ;
      edtDevGenCod_Enabled = 1 ;
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

   public void gxsgadevgentrn1P20( String A396EmprCod ,
                                   String A329DevTrnNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgadevgentrn_data1P20( A396EmprCod, A329DevTrnNom) ;
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

   protected void gxsgadevgentrn_data1P20( String A396EmprCod ,
                                           String A329DevTrnNom )
   {
      l329DevTrnNom = GXutil.padr( GXutil.rtrim( A329DevTrnNom), 30, "%") ;
      n329DevTrnNom = false ;
      /* Using cursor T01P245 */
      pr_default.execute(39, new Object[] {A396EmprCod, l329DevTrnNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(39) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01P245_A329DevTrnNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01P245_A329DevTrnNom[0]));
         pr_default.readNext(39);
      }
      pr_default.close(39);
   }

   public void gxhcadevgentrn1P231( String A396EmprCod ,
                                    String A329DevTrnNom )
   {
      /* Using cursor T01P246 */
      pr_default.execute(40, new Object[] {Boolean.valueOf(n329DevTrnNom), A329DevTrnNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(40) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A329DevTrnNom = T01P246_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P246_n329DevTrnNom[0] ;
         A396EmprCod = T01P246_A396EmprCod[0] ;
         A327DevGenTrn = T01P246_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P246_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         pr_default.readNext(40);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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

   public void xc_31_1P231( String A396EmprCod ,
                            int A323DevGenCod ,
                            int A44AlbRecCod )
   {
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int9[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int9) ;
         A323DevGenCod = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1P231( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV13AlbRUni )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal10[0] = AV10AlbRUniDis ;
         GXv_int6[0] = AV11AlbRPDis ;
         GXv_decimal8[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int7, GXv_decimal10, GXv_int6, GXv_decimal8, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int9[0] ;
         AV9AlbRPieDis = GXv_int7[0] ;
         AV10AlbRUniDis = GXv_decimal10[0] ;
         AV11AlbRPDis = GXv_int6[0] ;
         AV12AlbRUDis = GXv_decimal8[0] ;
         AV13AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV13AlbRUni))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_34_1P231( String A396EmprCod ,
                            int A252CliCod ,
                            byte A6288DevGenDom ,
                            String AV65Err_att )
   {
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int11[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int11, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A252CliCod = GXv_int9[0] ;
         A6288DevGenDom = GXv_int11[0] ;
         AV65Err_att = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV65Err_att))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_37_1P231( String A396EmprCod ,
                            int A323DevGenCod )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.updemprtrn(remoteHandle, context).execute( A396EmprCod, A323DevGenCod) ;
      }
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

   public void xc_39_1P231( )
   {
      if ( ! (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         httpContext.wjLoc = formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A328DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(A326DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A60AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(A54AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
      }
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

   public void gxnrgridlevel_level2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_169192( ) ;
      while ( nGXsfl_169_idx <= nRC_GXsfl_169 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1P2192( ) ;
         standaloneModal1P2192( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1P2192( ) ;
         nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_169192( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level2Container)) ;
      /* End function gxnrGridlevel_level2_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
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

   public void valid_Devgencod( )
   {
      /* Using cursor T01P248 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         A3066AlbDevPUni = T01P248_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P248_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         A5278AlbDevPPie = (short)(0) ;
      }
      pr_default.close(41);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      n252CliCod = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      /* Using cursor T01P249 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01P249_A47AlbREst[0] ;
      Z60AlbRUniUti = T01P249_A60AlbRUniUti[0] ;
      Z54AlbRPieUti = T01P249_A54AlbRPieUti[0] ;
      Z252CliCod = T01P249_A252CliCod[0] ;
      Z45AlbRef = T01P249_A45AlbRef[0] ;
      Z56AlbRUni = T01P249_A56AlbRUni[0] ;
      Z52AlbRPieEnt = T01P249_A52AlbRPieEnt[0] ;
      Z58AlbRUniEnt = T01P249_A58AlbRUniEnt[0] ;
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A47AlbREst = T01P249_A47AlbREst[0] ;
      A60AlbRUniUti = T01P249_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01P249_A54AlbRPieUti[0] ;
      A252CliCod = T01P249_A252CliCod[0] ;
      n252CliCod = T01P249_n252CliCod[0] ;
      A45AlbRef = T01P249_A45AlbRef[0] ;
      A56AlbRUni = T01P249_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A52AlbRPieEnt = T01P249_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01P249_A58AlbRUniEnt[0] ;
      pr_default.close(42);
      /* Using cursor T01P250 */
      pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P250_A279CliNom[0] ;
      pr_default.close(43);
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
      if ( (0==A44AlbRecCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion es requerido.", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal10[0] = AV10AlbRUniDis ;
         GXv_int6[0] = AV11AlbRPDis ;
         GXv_decimal8[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int7, GXv_decimal10, GXv_int6, GXv_decimal8, GXv_char3) ;
         tdevpie1_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevpie1_impl.this.A44AlbRecCod = GXv_int9[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevpie1_impl.this.AV9AlbRPieDis = GXv_int7[0] ;
         AV9AlbRPieDis = this.AV9AlbRPieDis ;
         tdevpie1_impl.this.AV10AlbRUniDis = GXv_decimal10[0] ;
         AV10AlbRUniDis = this.AV10AlbRUniDis ;
         tdevpie1_impl.this.AV11AlbRPDis = GXv_int6[0] ;
         AV11AlbRPDis = this.AV11AlbRPDis ;
         tdevpie1_impl.this.AV12AlbRUDis = GXv_decimal8[0] ;
         AV12AlbRUDis = this.AV12AlbRUDis ;
         tdevpie1_impl.this.AV13AlbRUni = GXv_char3[0] ;
         AV13AlbRUni = this.AV13AlbRUni ;
      }
      if ( (0==A44AlbRecCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion NO valido", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", GXutil.rtrim( AV13AlbRUni));
   }

   public void valid_Devgendom( )
   {
      n252CliCod = false ;
      n6288DevGenDom = false ;
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int11[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int11, GXv_char3) ;
         tdevpie1_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevpie1_impl.this.A252CliCod = GXv_int9[0] ;
         A252CliCod = this.A252CliCod ;
         tdevpie1_impl.this.A6288DevGenDom = GXv_int11[0] ;
         A6288DevGenDom = this.A6288DevGenDom ;
         tdevpie1_impl.this.AV65Err_att = GXv_char3[0] ;
         AV65Err_att = this.AV65Err_att ;
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ && ( GXutil.strcmp(AV65Err_att, "") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Err_att, 1, "DEVGENDOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenDom_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", GXutil.rtrim( AV65Err_att));
   }

   public void valid_Devgentrn( )
   {
      n327DevGenTrn = false ;
      n329DevTrnNom = false ;
      if ( (GXutil.strcmp("", h327DevGenTrn)==0) )
      {
         A327DevGenTrn = (short)(0) ;
         n327DevGenTrn = false ;
      }
      else
      {
         A329DevTrnNom = h327DevGenTrn ;
         n329DevTrnNom = false ;
         /* Using cursor T01P251 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n329DevTrnNom), A329DevTrnNom, A396EmprCod});
         A327DevGenTrn = T01P251_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P251_n327DevGenTrn[0] ;
         A327DevGenTrn = T01P251_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P251_n327DevGenTrn[0] ;
         if ( ! ( (pr_default.getStatus(44) == 101) ) )
         {
            pr_default.readNext(44);
            if ( ! ( (pr_default.getStatus(44) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre", "")}), 1, "DEVGENTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenTrn_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(44);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", h327DevGenTrn);
      /* Using cursor T01P252 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         if ( ! ( (0==A327DevGenTrn) && (GXutil.strcmp("", A329DevTrnNom)==0) || (0==A327DevGenTrn) && n327DevGenTrn || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevGenTrn_Internalname ;
         }
      }
      A329DevTrnNom = T01P252_A329DevTrnNom[0] ;
      n329DevTrnNom = T01P252_n329DevTrnNom[0] ;
      pr_default.close(45);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", GXutil.rtrim( A329DevTrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h327DevGenTrn", GXutil.rtrim( h327DevGenTrn));
   }

   public void valid_Devgenuni( )
   {
      n328DevGenUni = false ;
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         AV10AlbRUniDis = AV12AlbRUDis ;
      }
      else
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devgenpie( )
   {
      n328DevGenUni = false ;
      n326DevGenPie = false ;
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         AV9AlbRPieDis = AV11AlbRPDis ;
      }
      else
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
      }
      AV16PieAnt = O326DevGenPie ;
      AV19Piezas = A326DevGenPie ;
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrim( localUtil.ntoc( AV16PieAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrim( localUtil.ntoc( AV19Piezas, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV75EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV76DevGenCod',fld:'vDEVGENCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV78TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV75EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV76DevGenCod',fld:'vDEVGENCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131P22',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV78TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("ALBRECCOD.CLICK","{handler:'e111P231',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ALBRECCOD.CLICK",",oparms:[]}");
      setEventMetadata("VALID_DEVGENCOD","{handler:'valid_Devgencod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'}]");
      setEventMetadata("VALID_DEVGENCOD",",oparms:[{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''}]}");
      setEventMetadata("VALID_DEVGENDOM","{handler:'valid_Devgendom',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'AV65Err_att',fld:'vERR_ATT',pic:''}]");
      setEventMetadata("VALID_DEVGENDOM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'AV65Err_att',fld:'vERR_ATT',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DEVGENTRN","{handler:'valid_Devgentrn',iparms:[{av:'h327DevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''}]");
      setEventMetadata("VALID_DEVGENTRN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''},{av:'h327DevGenTrn'}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_DEVGENUNI","{handler:'valid_Devgenuni',iparms:[{av:'O328DevGenUni'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DEVGENUNI",",oparms:[{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DEVGENPIE","{handler:'valid_Devgenpie',iparms:[{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'O326DevGenPie'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENPIE",",oparms:[{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVLIN","{handler:'valid_Devlin',iparms:[]");
      setEventMetadata("VALID_DEVLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devobs',iparms:[]");
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
      pr_default.close(42);
      pr_default.close(25);
      pr_default.close(43);
      pr_default.close(26);
      pr_default.close(45);
      pr_default.close(27);
      pr_default.close(41);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV75EmprCod = "" ;
      Z396EmprCod = "" ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z410EmprTrn = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      O328DevGenUni = DecimalUtil.ZERO ;
      Z1303DevObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV13AlbRUni = "" ;
      AV65Err_att = "" ;
      A329DevTrnNom = "" ;
      h327DevGenTrn = "" ;
      Gx_mode = "" ;
      AV75EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A410EmprTrn = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      lblTextblockdevgenfec_Jsonclick = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      lblTextblockalbreccod_Jsonclick = "" ;
      lblTextblockdevgendom_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblockalbref_Jsonclick = "" ;
      A45AlbRef = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblockdevgentrn_Jsonclick = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrunidis_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblockalbruni_Jsonclick = "" ;
      lblTextblockalbrpiedis_Jsonclick = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTextblockdevgenuni_Jsonclick = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      lblTextblockdevgenpie_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level2Container = new com.genexus.webpanels.GXWebGrid(context);
      B328DevGenUni = DecimalUtil.ZERO ;
      sMode192 = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      AV14KilAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      AV88Pgmname = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode31 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1303DevObs = "" ;
      AV24Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV77WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV78TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV79WebSession = httpContext.getWebSession();
      AV82TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z3066AlbDevPUni = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z329DevTrnNom = "" ;
      T01P26_A407EmprNom = new String[] {""} ;
      T01P26_n407EmprNom = new boolean[] {false} ;
      T01P213_A329DevTrnNom = new String[] {""} ;
      T01P213_n329DevTrnNom = new boolean[] {false} ;
      T01P213_A396EmprCod = new String[] {""} ;
      T01P213_A327DevGenTrn = new short[1] ;
      T01P213_n327DevGenTrn = new boolean[] {false} ;
      T01P212_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P212_A5278AlbDevPPie = new short[1] ;
      T01P210_A329DevTrnNom = new String[] {""} ;
      T01P210_n329DevTrnNom = new boolean[] {false} ;
      T01P28_A47AlbREst = new byte[1] ;
      T01P28_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P28_A54AlbRPieUti = new int[1] ;
      T01P28_A252CliCod = new int[1] ;
      T01P28_n252CliCod = new boolean[] {false} ;
      T01P28_A45AlbRef = new String[] {""} ;
      T01P28_A56AlbRUni = new String[] {""} ;
      T01P28_A52AlbRPieEnt = new int[1] ;
      T01P28_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P29_A279CliNom = new String[] {""} ;
      T01P215_A323DevGenCod = new int[1] ;
      T01P215_A47AlbREst = new byte[1] ;
      T01P215_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P215_n328DevGenUni = new boolean[] {false} ;
      T01P215_A326DevGenPie = new short[1] ;
      T01P215_n326DevGenPie = new boolean[] {false} ;
      T01P215_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P215_A54AlbRPieUti = new int[1] ;
      T01P215_A407EmprNom = new String[] {""} ;
      T01P215_n407EmprNom = new boolean[] {false} ;
      T01P215_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01P215_n325DevGenFec = new boolean[] {false} ;
      T01P215_A6288DevGenDom = new byte[1] ;
      T01P215_n6288DevGenDom = new boolean[] {false} ;
      T01P215_A252CliCod = new int[1] ;
      T01P215_n252CliCod = new boolean[] {false} ;
      T01P215_A279CliNom = new String[] {""} ;
      T01P215_A45AlbRef = new String[] {""} ;
      T01P215_A410EmprTrn = new String[] {""} ;
      T01P215_n410EmprTrn = new boolean[] {false} ;
      T01P215_A329DevTrnNom = new String[] {""} ;
      T01P215_n329DevTrnNom = new boolean[] {false} ;
      T01P215_A56AlbRUni = new String[] {""} ;
      T01P215_A52AlbRPieEnt = new int[1] ;
      T01P215_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P215_A324DevGenEst = new byte[1] ;
      T01P215_n324DevGenEst = new boolean[] {false} ;
      T01P215_A1304DevUlin = new byte[1] ;
      T01P215_n1304DevUlin = new boolean[] {false} ;
      T01P215_A396EmprCod = new String[] {""} ;
      T01P215_A44AlbRecCod = new int[1] ;
      T01P215_n44AlbRecCod = new boolean[] {false} ;
      T01P215_A327DevGenTrn = new short[1] ;
      T01P215_n327DevGenTrn = new boolean[] {false} ;
      T01P215_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P215_A5278AlbDevPPie = new short[1] ;
      T01P216_A329DevTrnNom = new String[] {""} ;
      T01P216_n329DevTrnNom = new boolean[] {false} ;
      T01P216_A396EmprCod = new String[] {""} ;
      T01P216_A327DevGenTrn = new short[1] ;
      T01P216_n327DevGenTrn = new boolean[] {false} ;
      T01P217_A329DevTrnNom = new String[] {""} ;
      T01P217_n329DevTrnNom = new boolean[] {false} ;
      T01P217_A396EmprCod = new String[] {""} ;
      T01P217_A327DevGenTrn = new short[1] ;
      T01P217_n327DevGenTrn = new boolean[] {false} ;
      T01P218_A279CliNom = new String[] {""} ;
      T01P219_A329DevTrnNom = new String[] {""} ;
      T01P219_n329DevTrnNom = new boolean[] {false} ;
      T01P221_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P221_A5278AlbDevPPie = new short[1] ;
      T01P222_A396EmprCod = new String[] {""} ;
      T01P222_A323DevGenCod = new int[1] ;
      T01P25_A323DevGenCod = new int[1] ;
      T01P25_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P25_n328DevGenUni = new boolean[] {false} ;
      T01P25_A326DevGenPie = new short[1] ;
      T01P25_n326DevGenPie = new boolean[] {false} ;
      T01P25_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01P25_n325DevGenFec = new boolean[] {false} ;
      T01P25_A6288DevGenDom = new byte[1] ;
      T01P25_n6288DevGenDom = new boolean[] {false} ;
      T01P25_A410EmprTrn = new String[] {""} ;
      T01P25_n410EmprTrn = new boolean[] {false} ;
      T01P25_A324DevGenEst = new byte[1] ;
      T01P25_n324DevGenEst = new boolean[] {false} ;
      T01P25_A1304DevUlin = new byte[1] ;
      T01P25_n1304DevUlin = new boolean[] {false} ;
      T01P25_A396EmprCod = new String[] {""} ;
      T01P25_A44AlbRecCod = new int[1] ;
      T01P25_n44AlbRecCod = new boolean[] {false} ;
      T01P25_A327DevGenTrn = new short[1] ;
      T01P25_n327DevGenTrn = new boolean[] {false} ;
      T01P25_A252CliCod = new int[1] ;
      T01P25_n252CliCod = new boolean[] {false} ;
      T01P223_A396EmprCod = new String[] {""} ;
      T01P223_A323DevGenCod = new int[1] ;
      T01P224_A396EmprCod = new String[] {""} ;
      T01P224_A323DevGenCod = new int[1] ;
      T01P225_A329DevTrnNom = new String[] {""} ;
      T01P225_n329DevTrnNom = new boolean[] {false} ;
      T01P225_A396EmprCod = new String[] {""} ;
      T01P225_A327DevGenTrn = new short[1] ;
      T01P225_n327DevGenTrn = new boolean[] {false} ;
      T01P24_A323DevGenCod = new int[1] ;
      T01P24_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P24_n328DevGenUni = new boolean[] {false} ;
      T01P24_A326DevGenPie = new short[1] ;
      T01P24_n326DevGenPie = new boolean[] {false} ;
      T01P24_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01P24_n325DevGenFec = new boolean[] {false} ;
      T01P24_A6288DevGenDom = new byte[1] ;
      T01P24_n6288DevGenDom = new boolean[] {false} ;
      T01P24_A410EmprTrn = new String[] {""} ;
      T01P24_n410EmprTrn = new boolean[] {false} ;
      T01P24_A324DevGenEst = new byte[1] ;
      T01P24_n324DevGenEst = new boolean[] {false} ;
      T01P24_A1304DevUlin = new byte[1] ;
      T01P24_n1304DevUlin = new boolean[] {false} ;
      T01P24_A396EmprCod = new String[] {""} ;
      T01P24_A44AlbRecCod = new int[1] ;
      T01P24_n44AlbRecCod = new boolean[] {false} ;
      T01P24_A327DevGenTrn = new short[1] ;
      T01P24_n327DevGenTrn = new boolean[] {false} ;
      T01P24_A252CliCod = new int[1] ;
      T01P24_n252CliCod = new boolean[] {false} ;
      T01P226_A47AlbREst = new byte[1] ;
      T01P226_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P226_A54AlbRPieUti = new int[1] ;
      T01P226_A252CliCod = new int[1] ;
      T01P226_n252CliCod = new boolean[] {false} ;
      T01P226_A45AlbRef = new String[] {""} ;
      T01P226_A56AlbRUni = new String[] {""} ;
      T01P226_A52AlbRPieEnt = new int[1] ;
      T01P226_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P230_A47AlbREst = new byte[1] ;
      T01P230_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P230_A54AlbRPieUti = new int[1] ;
      T01P230_A252CliCod = new int[1] ;
      T01P230_n252CliCod = new boolean[] {false} ;
      T01P230_A45AlbRef = new String[] {""} ;
      T01P230_A56AlbRUni = new String[] {""} ;
      T01P230_A52AlbRPieEnt = new int[1] ;
      T01P230_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P231_A279CliNom = new String[] {""} ;
      T01P232_A329DevTrnNom = new String[] {""} ;
      T01P232_n329DevTrnNom = new boolean[] {false} ;
      T01P234_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P234_A5278AlbDevPPie = new short[1] ;
      T01P235_A396EmprCod = new String[] {""} ;
      T01P235_A323DevGenCod = new int[1] ;
      T01P235_A2159AlbRecPie = new String[] {""} ;
      T01P238_A396EmprCod = new String[] {""} ;
      T01P238_A323DevGenCod = new int[1] ;
      T01P239_A323DevGenCod = new int[1] ;
      T01P239_A1302DevLin = new byte[1] ;
      T01P239_A1303DevObs = new String[] {""} ;
      T01P239_A396EmprCod = new String[] {""} ;
      T01P240_A396EmprCod = new String[] {""} ;
      T01P240_A323DevGenCod = new int[1] ;
      T01P240_A1302DevLin = new byte[1] ;
      T01P23_A323DevGenCod = new int[1] ;
      T01P23_A1302DevLin = new byte[1] ;
      T01P23_A1303DevObs = new String[] {""} ;
      T01P23_A396EmprCod = new String[] {""} ;
      T01P22_A323DevGenCod = new int[1] ;
      T01P22_A1302DevLin = new byte[1] ;
      T01P22_A1303DevObs = new String[] {""} ;
      T01P22_A396EmprCod = new String[] {""} ;
      T01P244_A396EmprCod = new String[] {""} ;
      T01P244_A323DevGenCod = new int[1] ;
      T01P244_A1302DevLin = new byte[1] ;
      Gridlevel_level2Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level2_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i325DevGenFec = GXutil.nullDate() ;
      Gridlevel_level2Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l329DevTrnNom = "" ;
      T01P245_A329DevTrnNom = new String[] {""} ;
      T01P245_n329DevTrnNom = new boolean[] {false} ;
      T01P246_A329DevTrnNom = new String[] {""} ;
      T01P246_n329DevTrnNom = new boolean[] {false} ;
      T01P246_A396EmprCod = new String[] {""} ;
      T01P246_A327DevGenTrn = new short[1] ;
      T01P246_n327DevGenTrn = new boolean[] {false} ;
      T01P248_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P248_A5278AlbDevPPie = new short[1] ;
      T01P249_A47AlbREst = new byte[1] ;
      T01P249_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P249_A54AlbRPieUti = new int[1] ;
      T01P249_A252CliCod = new int[1] ;
      T01P249_n252CliCod = new boolean[] {false} ;
      T01P249_A45AlbRef = new String[] {""} ;
      T01P249_A56AlbRUni = new String[] {""} ;
      T01P249_A52AlbRPieEnt = new int[1] ;
      T01P249_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P250_A279CliNom = new String[] {""} ;
      GXv_int7 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV10AlbRUniDis = DecimalUtil.ZERO ;
      ZV12AlbRUDis = DecimalUtil.ZERO ;
      ZV13AlbRUni = "" ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      ZV65Err_att = "" ;
      T01P251_A329DevTrnNom = new String[] {""} ;
      T01P251_n329DevTrnNom = new boolean[] {false} ;
      T01P251_A396EmprCod = new String[] {""} ;
      T01P251_A327DevGenTrn = new short[1] ;
      T01P251_n327DevGenTrn = new boolean[] {false} ;
      T01P252_A329DevTrnNom = new String[] {""} ;
      T01P252_n329DevTrnNom = new boolean[] {false} ;
      Zh327DevGenTrn = "" ;
      ZV14KilAnt = DecimalUtil.ZERO ;
      ZV15MetAnt = DecimalUtil.ZERO ;
      ZV17Kilos = DecimalUtil.ZERO ;
      ZV18Metros = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevpie1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevpie1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevpie1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevpie1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie1__default(),
         new Object[] {
             new Object[] {
            T01P22_A323DevGenCod, T01P22_A1302DevLin, T01P22_A1303DevObs, T01P22_A396EmprCod
            }
            , new Object[] {
            T01P23_A323DevGenCod, T01P23_A1302DevLin, T01P23_A1303DevObs, T01P23_A396EmprCod
            }
            , new Object[] {
            T01P24_A323DevGenCod, T01P24_A328DevGenUni, T01P24_n328DevGenUni, T01P24_A326DevGenPie, T01P24_n326DevGenPie, T01P24_A325DevGenFec, T01P24_n325DevGenFec, T01P24_A6288DevGenDom, T01P24_n6288DevGenDom, T01P24_A410EmprTrn,
            T01P24_n410EmprTrn, T01P24_A324DevGenEst, T01P24_n324DevGenEst, T01P24_A1304DevUlin, T01P24_n1304DevUlin, T01P24_A396EmprCod, T01P24_A44AlbRecCod, T01P24_n44AlbRecCod, T01P24_A327DevGenTrn, T01P24_n327DevGenTrn,
            T01P24_A252CliCod, T01P24_n252CliCod
            }
            , new Object[] {
            T01P25_A323DevGenCod, T01P25_A328DevGenUni, T01P25_n328DevGenUni, T01P25_A326DevGenPie, T01P25_n326DevGenPie, T01P25_A325DevGenFec, T01P25_n325DevGenFec, T01P25_A6288DevGenDom, T01P25_n6288DevGenDom, T01P25_A410EmprTrn,
            T01P25_n410EmprTrn, T01P25_A324DevGenEst, T01P25_n324DevGenEst, T01P25_A1304DevUlin, T01P25_n1304DevUlin, T01P25_A396EmprCod, T01P25_A44AlbRecCod, T01P25_n44AlbRecCod, T01P25_A327DevGenTrn, T01P25_n327DevGenTrn,
            T01P25_A252CliCod, T01P25_n252CliCod
            }
            , new Object[] {
            T01P26_A407EmprNom, T01P26_n407EmprNom
            }
            , new Object[] {
            T01P27_A47AlbREst, T01P27_A60AlbRUniUti, T01P27_A54AlbRPieUti, T01P27_A252CliCod, T01P27_A45AlbRef, T01P27_A56AlbRUni, T01P27_A52AlbRPieEnt, T01P27_A58AlbRUniEnt
            }
            , new Object[] {
            T01P28_A47AlbREst, T01P28_A60AlbRUniUti, T01P28_A54AlbRPieUti, T01P28_A252CliCod, T01P28_A45AlbRef, T01P28_A56AlbRUni, T01P28_A52AlbRPieEnt, T01P28_A58AlbRUniEnt
            }
            , new Object[] {
            T01P29_A279CliNom
            }
            , new Object[] {
            T01P210_A329DevTrnNom, T01P210_n329DevTrnNom
            }
            , new Object[] {
            T01P212_A3066AlbDevPUni, T01P212_A5278AlbDevPPie
            }
            , new Object[] {
            T01P213_A329DevTrnNom, T01P213_n329DevTrnNom, T01P213_A396EmprCod, T01P213_A327DevGenTrn
            }
            , new Object[] {
            T01P215_A323DevGenCod, T01P215_A47AlbREst, T01P215_A328DevGenUni, T01P215_n328DevGenUni, T01P215_A326DevGenPie, T01P215_n326DevGenPie, T01P215_A60AlbRUniUti, T01P215_A54AlbRPieUti, T01P215_A407EmprNom, T01P215_n407EmprNom,
            T01P215_A325DevGenFec, T01P215_n325DevGenFec, T01P215_A6288DevGenDom, T01P215_n6288DevGenDom, T01P215_A252CliCod, T01P215_n252CliCod, T01P215_A279CliNom, T01P215_A45AlbRef, T01P215_A410EmprTrn, T01P215_n410EmprTrn,
            T01P215_A329DevTrnNom, T01P215_n329DevTrnNom, T01P215_A56AlbRUni, T01P215_A52AlbRPieEnt, T01P215_A58AlbRUniEnt, T01P215_A324DevGenEst, T01P215_n324DevGenEst, T01P215_A1304DevUlin, T01P215_n1304DevUlin, T01P215_A396EmprCod,
            T01P215_A44AlbRecCod, T01P215_n44AlbRecCod, T01P215_A327DevGenTrn, T01P215_n327DevGenTrn, T01P215_A3066AlbDevPUni, T01P215_A5278AlbDevPPie
            }
            , new Object[] {
            T01P216_A329DevTrnNom, T01P216_n329DevTrnNom, T01P216_A396EmprCod, T01P216_A327DevGenTrn
            }
            , new Object[] {
            T01P217_A329DevTrnNom, T01P217_n329DevTrnNom, T01P217_A396EmprCod, T01P217_A327DevGenTrn
            }
            , new Object[] {
            T01P218_A279CliNom
            }
            , new Object[] {
            T01P219_A329DevTrnNom, T01P219_n329DevTrnNom
            }
            , new Object[] {
            T01P221_A3066AlbDevPUni, T01P221_A5278AlbDevPPie
            }
            , new Object[] {
            T01P222_A396EmprCod, T01P222_A323DevGenCod
            }
            , new Object[] {
            T01P223_A396EmprCod, T01P223_A323DevGenCod
            }
            , new Object[] {
            T01P224_A396EmprCod, T01P224_A323DevGenCod
            }
            , new Object[] {
            T01P225_A329DevTrnNom, T01P225_n329DevTrnNom, T01P225_A396EmprCod, T01P225_A327DevGenTrn
            }
            , new Object[] {
            T01P226_A47AlbREst, T01P226_A60AlbRUniUti, T01P226_A54AlbRPieUti, T01P226_A252CliCod, T01P226_A45AlbRef, T01P226_A56AlbRUni, T01P226_A52AlbRPieEnt, T01P226_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P230_A47AlbREst, T01P230_A60AlbRUniUti, T01P230_A54AlbRPieUti, T01P230_A252CliCod, T01P230_A45AlbRef, T01P230_A56AlbRUni, T01P230_A52AlbRPieEnt, T01P230_A58AlbRUniEnt
            }
            , new Object[] {
            T01P231_A279CliNom
            }
            , new Object[] {
            T01P232_A329DevTrnNom, T01P232_n329DevTrnNom
            }
            , new Object[] {
            T01P234_A3066AlbDevPUni, T01P234_A5278AlbDevPPie
            }
            , new Object[] {
            T01P235_A396EmprCod, T01P235_A323DevGenCod, T01P235_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P238_A396EmprCod, T01P238_A323DevGenCod
            }
            , new Object[] {
            T01P239_A323DevGenCod, T01P239_A1302DevLin, T01P239_A1303DevObs, T01P239_A396EmprCod
            }
            , new Object[] {
            T01P240_A396EmprCod, T01P240_A323DevGenCod, T01P240_A1302DevLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P244_A396EmprCod, T01P244_A323DevGenCod, T01P244_A1302DevLin
            }
            , new Object[] {
            T01P245_A329DevTrnNom, T01P245_n329DevTrnNom
            }
            , new Object[] {
            T01P246_A329DevTrnNom, T01P246_n329DevTrnNom, T01P246_A396EmprCod, T01P246_A327DevGenTrn
            }
            , new Object[] {
            T01P248_A3066AlbDevPUni, T01P248_A5278AlbDevPPie
            }
            , new Object[] {
            T01P249_A47AlbREst, T01P249_A60AlbRUniUti, T01P249_A54AlbRPieUti, T01P249_A252CliCod, T01P249_A45AlbRef, T01P249_A56AlbRUni, T01P249_A52AlbRPieEnt, T01P249_A58AlbRUniEnt
            }
            , new Object[] {
            T01P250_A279CliNom
            }
            , new Object[] {
            T01P251_A329DevTrnNom, T01P251_n329DevTrnNom, T01P251_A396EmprCod, T01P251_A327DevGenTrn
            }
            , new Object[] {
            T01P252_A329DevTrnNom, T01P252_n329DevTrnNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV88Pgmname = "TDevPie1" ;
      Z325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      i325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
   }

   private byte Z6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte Z47AlbREst ;
   private byte O1304DevUlin ;
   private byte Z1302DevLin ;
   private byte GxWebError ;
   private byte A6288DevGenDom ;
   private byte nKeyPressed ;
   private byte A1304DevUlin ;
   private byte Gx_BScreen ;
   private byte B1304DevUlin ;
   private byte A324DevGenEst ;
   private byte A47AlbREst ;
   private byte s1304DevUlin ;
   private byte A1302DevLin ;
   private byte subGridlevel_level2_Backcolorstyle ;
   private byte subGridlevel_level2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i1304DevUlin ;
   private byte subGridlevel_level2_Allowselection ;
   private byte subGridlevel_level2_Allowhovering ;
   private byte subGridlevel_level2_Allowcollapsing ;
   private byte subGridlevel_level2_Collapsed ;
   private byte GXv_int11[] ;
   private short Z326DevGenPie ;
   private short Z327DevGenTrn ;
   private short O326DevGenPie ;
   private short N327DevGenTrn ;
   private short nRcdDeleted_192 ;
   private short nRcdExists_192 ;
   private short nIsMod_192 ;
   private short A327DevGenTrn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A326DevGenPie ;
   private short nBlankRcdCount192 ;
   private short RcdFound192 ;
   private short B326DevGenPie ;
   private short nBlankRcdUsr192 ;
   private short AV81Insert_DevGenTrn ;
   private short AV16PieAnt ;
   private short AV19Piezas ;
   private short A5278AlbDevPPie ;
   private short RcdFound31 ;
   private short Z5278AlbDevPPie ;
   private short nIsDirty_31 ;
   private short nIsDirty_192 ;
   private short gxhchits ;
   private short ZV16PieAnt ;
   private short ZV19Piezas ;
   private int wcpOAV76DevGenCod ;
   private int Z323DevGenCod ;
   private int Z44AlbRecCod ;
   private int Z54AlbRPieUti ;
   private int Z252CliCod ;
   private int Z52AlbRPieEnt ;
   private int nRC_GXsfl_169 ;
   private int nGXsfl_169_idx=1 ;
   private int N44AlbRecCod ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV76DevGenCod ;
   private int trnEnded ;
   private int edtDevGenCod_Enabled ;
   private int edtEmprTrn_Enabled ;
   private int edtDevGenFec_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtDevGenDom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtDevGenTrn_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtDevGenUni_Enabled ;
   private int edtDevGenPie_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtDevLin_Enabled ;
   private int edtDevObs_Enabled ;
   private int fRowAdded ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int AV80Insert_AlbRecCod ;
   private int AV9AlbRPieDis ;
   private int AV11AlbRPDis ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int Dvpanel_unnamedtable2_Gxcontroltype ;
   private int Dvpanel_unnamedtable3_Gxcontroltype ;
   private int Dvpanel_unnamedtable4_Gxcontroltype ;
   private int Dvpanel_unnamedtable5_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int AV89GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level2_Backcolor ;
   private int subGridlevel_level2_Allbackcolor ;
   private int defedtDevLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level2_Selectedindex ;
   private int subGridlevel_level2_Selectioncolor ;
   private int subGridlevel_level2_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int Z51AlbRPieDis ;
   private int ZV9AlbRPieDis ;
   private int ZV11AlbRPDis ;
   private int GXv_int9[] ;
   private long GRIDLEVEL_LEVEL2_nFirstRecordOnPage ;
   private java.math.BigDecimal Z328DevGenUni ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O328DevGenUni ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal B328DevGenUni ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV10AlbRUniDis ;
   private java.math.BigDecimal AV14KilAnt ;
   private java.math.BigDecimal AV15MetAnt ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal AV12AlbRUDis ;
   private java.math.BigDecimal A3066AlbDevPUni ;
   private java.math.BigDecimal Z3066AlbDevPUni ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV10AlbRUniDis ;
   private java.math.BigDecimal ZV12AlbRUDis ;
   private java.math.BigDecimal ZV14KilAnt ;
   private java.math.BigDecimal ZV15MetAnt ;
   private java.math.BigDecimal ZV17Kilos ;
   private java.math.BigDecimal ZV18Metros ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV75EmprCod ;
   private String Z396EmprCod ;
   private String Z410EmprTrn ;
   private String Z45AlbRef ;
   private String Z56AlbRUni ;
   private String Z1303DevObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV13AlbRUni ;
   private String AV65Err_att ;
   private String A329DevTrnNom ;
   private String h327DevGenTrn ;
   private String Gx_mode ;
   private String AV75EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevGenCod_Internalname ;
   private String sGXsfl_169_idx="0001" ;
   private String A56AlbRUni ;
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
   private String TempTags ;
   private String edtDevGenCod_Jsonclick ;
   private String edtEmprTrn_Internalname ;
   private String A410EmprTrn ;
   private String edtEmprTrn_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtabledevgenfec_Internalname ;
   private String lblTextblockdevgenfec_Internalname ;
   private String lblTextblockdevgenfec_Jsonclick ;
   private String edtDevGenFec_Internalname ;
   private String edtDevGenFec_Jsonclick ;
   private String divUnnamedtablealbreccod_Internalname ;
   private String lblTextblockalbreccod_Internalname ;
   private String lblTextblockalbreccod_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String divUnnamedtabledevgendom_Internalname ;
   private String lblTextblockdevgendom_Internalname ;
   private String lblTextblockdevgendom_Jsonclick ;
   private String edtDevGenDom_Internalname ;
   private String edtDevGenDom_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtableclinom_Internalname ;
   private String lblTextblockclinom_Internalname ;
   private String lblTextblockclinom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtablealbref_Internalname ;
   private String lblTextblockalbref_Internalname ;
   private String lblTextblockalbref_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String divUnnamedtabledevgentrn_Internalname ;
   private String lblTextblockdevgentrn_Internalname ;
   private String lblTextblockdevgentrn_Jsonclick ;
   private String edtDevGenTrn_Internalname ;
   private String edtDevGenTrn_Jsonclick ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String tblUnnamedtable4_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtablealbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String divUnnamedtablealbruni_Internalname ;
   private String lblTextblockalbruni_Internalname ;
   private String lblTextblockalbruni_Jsonclick ;
   private String divUnnamedtablealbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String tblUnnamedtable5_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtabledevgenuni_Internalname ;
   private String lblTextblockdevgenuni_Internalname ;
   private String lblTextblockdevgenuni_Jsonclick ;
   private String edtDevGenUni_Internalname ;
   private String edtDevGenUni_Jsonclick ;
   private String divUnnamedtabledevgenpie_Internalname ;
   private String lblTextblockdevgenpie_Internalname ;
   private String lblTextblockdevgenpie_Jsonclick ;
   private String edtDevGenPie_Internalname ;
   private String edtDevGenPie_Jsonclick ;
   private String divTableleaflevel_level2_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode192 ;
   private String edtDevLin_Internalname ;
   private String edtDevObs_Internalname ;
   private String subGridlevel_level2_Internalname ;
   private String A407EmprNom ;
   private String AV88Pgmname ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode31 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1303DevObs ;
   private String AV24Station ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z329DevTrnNom ;
   private String sGXsfl_169_fel_idx="0001" ;
   private String subGridlevel_level2_Class ;
   private String subGridlevel_level2_Linesclass ;
   private String ROClassString ;
   private String edtDevLin_Jsonclick ;
   private String edtDevObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level2_Header ;
   private String gxwrpcisep ;
   private String l329DevTrnNom ;
   private String ZV13AlbRUni ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV65Err_att ;
   private String Zh327DevGenTrn ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date i325DevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n252CliCod ;
   private boolean n6288DevGenDom ;
   private boolean n329DevTrnNom ;
   private boolean n327DevGenTrn ;
   private boolean wbErr ;
   private boolean n1304DevUlin ;
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
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean bGXsfl_169_Refreshing=false ;
   private boolean n410EmprTrn ;
   private boolean n324DevGenEst ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n325DevGenFec ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level2Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level2Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level2Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV79WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01P26_A407EmprNom ;
   private boolean[] T01P26_n407EmprNom ;
   private String[] T01P213_A329DevTrnNom ;
   private boolean[] T01P213_n329DevTrnNom ;
   private String[] T01P213_A396EmprCod ;
   private short[] T01P213_A327DevGenTrn ;
   private boolean[] T01P213_n327DevGenTrn ;
   private java.math.BigDecimal[] T01P212_A3066AlbDevPUni ;
   private short[] T01P212_A5278AlbDevPPie ;
   private String[] T01P210_A329DevTrnNom ;
   private boolean[] T01P210_n329DevTrnNom ;
   private byte[] T01P28_A47AlbREst ;
   private java.math.BigDecimal[] T01P28_A60AlbRUniUti ;
   private int[] T01P28_A54AlbRPieUti ;
   private int[] T01P28_A252CliCod ;
   private boolean[] T01P28_n252CliCod ;
   private String[] T01P28_A45AlbRef ;
   private String[] T01P28_A56AlbRUni ;
   private int[] T01P28_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P28_A58AlbRUniEnt ;
   private String[] T01P29_A279CliNom ;
   private int[] T01P215_A323DevGenCod ;
   private byte[] T01P215_A47AlbREst ;
   private java.math.BigDecimal[] T01P215_A328DevGenUni ;
   private boolean[] T01P215_n328DevGenUni ;
   private short[] T01P215_A326DevGenPie ;
   private boolean[] T01P215_n326DevGenPie ;
   private java.math.BigDecimal[] T01P215_A60AlbRUniUti ;
   private int[] T01P215_A54AlbRPieUti ;
   private String[] T01P215_A407EmprNom ;
   private boolean[] T01P215_n407EmprNom ;
   private java.util.Date[] T01P215_A325DevGenFec ;
   private boolean[] T01P215_n325DevGenFec ;
   private byte[] T01P215_A6288DevGenDom ;
   private boolean[] T01P215_n6288DevGenDom ;
   private int[] T01P215_A252CliCod ;
   private boolean[] T01P215_n252CliCod ;
   private String[] T01P215_A279CliNom ;
   private String[] T01P215_A45AlbRef ;
   private String[] T01P215_A410EmprTrn ;
   private boolean[] T01P215_n410EmprTrn ;
   private String[] T01P215_A329DevTrnNom ;
   private boolean[] T01P215_n329DevTrnNom ;
   private String[] T01P215_A56AlbRUni ;
   private int[] T01P215_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P215_A58AlbRUniEnt ;
   private byte[] T01P215_A324DevGenEst ;
   private boolean[] T01P215_n324DevGenEst ;
   private byte[] T01P215_A1304DevUlin ;
   private boolean[] T01P215_n1304DevUlin ;
   private String[] T01P215_A396EmprCod ;
   private int[] T01P215_A44AlbRecCod ;
   private boolean[] T01P215_n44AlbRecCod ;
   private short[] T01P215_A327DevGenTrn ;
   private boolean[] T01P215_n327DevGenTrn ;
   private java.math.BigDecimal[] T01P215_A3066AlbDevPUni ;
   private short[] T01P215_A5278AlbDevPPie ;
   private String[] T01P216_A329DevTrnNom ;
   private boolean[] T01P216_n329DevTrnNom ;
   private String[] T01P216_A396EmprCod ;
   private short[] T01P216_A327DevGenTrn ;
   private boolean[] T01P216_n327DevGenTrn ;
   private String[] T01P217_A329DevTrnNom ;
   private boolean[] T01P217_n329DevTrnNom ;
   private String[] T01P217_A396EmprCod ;
   private short[] T01P217_A327DevGenTrn ;
   private boolean[] T01P217_n327DevGenTrn ;
   private String[] T01P218_A279CliNom ;
   private String[] T01P219_A329DevTrnNom ;
   private boolean[] T01P219_n329DevTrnNom ;
   private java.math.BigDecimal[] T01P221_A3066AlbDevPUni ;
   private short[] T01P221_A5278AlbDevPPie ;
   private String[] T01P222_A396EmprCod ;
   private int[] T01P222_A323DevGenCod ;
   private int[] T01P25_A323DevGenCod ;
   private java.math.BigDecimal[] T01P25_A328DevGenUni ;
   private boolean[] T01P25_n328DevGenUni ;
   private short[] T01P25_A326DevGenPie ;
   private boolean[] T01P25_n326DevGenPie ;
   private java.util.Date[] T01P25_A325DevGenFec ;
   private boolean[] T01P25_n325DevGenFec ;
   private byte[] T01P25_A6288DevGenDom ;
   private boolean[] T01P25_n6288DevGenDom ;
   private String[] T01P25_A410EmprTrn ;
   private boolean[] T01P25_n410EmprTrn ;
   private byte[] T01P25_A324DevGenEst ;
   private boolean[] T01P25_n324DevGenEst ;
   private byte[] T01P25_A1304DevUlin ;
   private boolean[] T01P25_n1304DevUlin ;
   private String[] T01P25_A396EmprCod ;
   private int[] T01P25_A44AlbRecCod ;
   private boolean[] T01P25_n44AlbRecCod ;
   private short[] T01P25_A327DevGenTrn ;
   private boolean[] T01P25_n327DevGenTrn ;
   private int[] T01P25_A252CliCod ;
   private boolean[] T01P25_n252CliCod ;
   private String[] T01P223_A396EmprCod ;
   private int[] T01P223_A323DevGenCod ;
   private String[] T01P224_A396EmprCod ;
   private int[] T01P224_A323DevGenCod ;
   private String[] T01P225_A329DevTrnNom ;
   private boolean[] T01P225_n329DevTrnNom ;
   private String[] T01P225_A396EmprCod ;
   private short[] T01P225_A327DevGenTrn ;
   private boolean[] T01P225_n327DevGenTrn ;
   private int[] T01P24_A323DevGenCod ;
   private java.math.BigDecimal[] T01P24_A328DevGenUni ;
   private boolean[] T01P24_n328DevGenUni ;
   private short[] T01P24_A326DevGenPie ;
   private boolean[] T01P24_n326DevGenPie ;
   private java.util.Date[] T01P24_A325DevGenFec ;
   private boolean[] T01P24_n325DevGenFec ;
   private byte[] T01P24_A6288DevGenDom ;
   private boolean[] T01P24_n6288DevGenDom ;
   private String[] T01P24_A410EmprTrn ;
   private boolean[] T01P24_n410EmprTrn ;
   private byte[] T01P24_A324DevGenEst ;
   private boolean[] T01P24_n324DevGenEst ;
   private byte[] T01P24_A1304DevUlin ;
   private boolean[] T01P24_n1304DevUlin ;
   private String[] T01P24_A396EmprCod ;
   private int[] T01P24_A44AlbRecCod ;
   private boolean[] T01P24_n44AlbRecCod ;
   private short[] T01P24_A327DevGenTrn ;
   private boolean[] T01P24_n327DevGenTrn ;
   private int[] T01P24_A252CliCod ;
   private boolean[] T01P24_n252CliCod ;
   private byte[] T01P226_A47AlbREst ;
   private java.math.BigDecimal[] T01P226_A60AlbRUniUti ;
   private int[] T01P226_A54AlbRPieUti ;
   private int[] T01P226_A252CliCod ;
   private boolean[] T01P226_n252CliCod ;
   private String[] T01P226_A45AlbRef ;
   private String[] T01P226_A56AlbRUni ;
   private int[] T01P226_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P226_A58AlbRUniEnt ;
   private byte[] T01P230_A47AlbREst ;
   private java.math.BigDecimal[] T01P230_A60AlbRUniUti ;
   private int[] T01P230_A54AlbRPieUti ;
   private int[] T01P230_A252CliCod ;
   private boolean[] T01P230_n252CliCod ;
   private String[] T01P230_A45AlbRef ;
   private String[] T01P230_A56AlbRUni ;
   private int[] T01P230_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P230_A58AlbRUniEnt ;
   private String[] T01P231_A279CliNom ;
   private String[] T01P232_A329DevTrnNom ;
   private boolean[] T01P232_n329DevTrnNom ;
   private java.math.BigDecimal[] T01P234_A3066AlbDevPUni ;
   private short[] T01P234_A5278AlbDevPPie ;
   private String[] T01P235_A396EmprCod ;
   private int[] T01P235_A323DevGenCod ;
   private String[] T01P235_A2159AlbRecPie ;
   private String[] T01P238_A396EmprCod ;
   private int[] T01P238_A323DevGenCod ;
   private int[] T01P239_A323DevGenCod ;
   private byte[] T01P239_A1302DevLin ;
   private String[] T01P239_A1303DevObs ;
   private String[] T01P239_A396EmprCod ;
   private String[] T01P240_A396EmprCod ;
   private int[] T01P240_A323DevGenCod ;
   private byte[] T01P240_A1302DevLin ;
   private int[] T01P23_A323DevGenCod ;
   private byte[] T01P23_A1302DevLin ;
   private String[] T01P23_A1303DevObs ;
   private String[] T01P23_A396EmprCod ;
   private int[] T01P22_A323DevGenCod ;
   private byte[] T01P22_A1302DevLin ;
   private String[] T01P22_A1303DevObs ;
   private String[] T01P22_A396EmprCod ;
   private String[] T01P244_A396EmprCod ;
   private int[] T01P244_A323DevGenCod ;
   private byte[] T01P244_A1302DevLin ;
   private String[] T01P245_A329DevTrnNom ;
   private boolean[] T01P245_n329DevTrnNom ;
   private String[] T01P246_A329DevTrnNom ;
   private boolean[] T01P246_n329DevTrnNom ;
   private String[] T01P246_A396EmprCod ;
   private short[] T01P246_A327DevGenTrn ;
   private boolean[] T01P246_n327DevGenTrn ;
   private java.math.BigDecimal[] T01P248_A3066AlbDevPUni ;
   private short[] T01P248_A5278AlbDevPPie ;
   private byte[] T01P249_A47AlbREst ;
   private java.math.BigDecimal[] T01P249_A60AlbRUniUti ;
   private int[] T01P249_A54AlbRPieUti ;
   private int[] T01P249_A252CliCod ;
   private boolean[] T01P249_n252CliCod ;
   private String[] T01P249_A45AlbRef ;
   private String[] T01P249_A56AlbRUni ;
   private int[] T01P249_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P249_A58AlbRUniEnt ;
   private String[] T01P250_A279CliNom ;
   private String[] T01P251_A329DevTrnNom ;
   private boolean[] T01P251_n329DevTrnNom ;
   private String[] T01P251_A396EmprCod ;
   private short[] T01P251_A327DevGenTrn ;
   private boolean[] T01P251_n327DevGenTrn ;
   private String[] T01P252_A329DevTrnNom ;
   private boolean[] T01P252_n329DevTrnNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private byte[] T01P27_A47AlbREst ;
   private java.math.BigDecimal[] T01P27_A60AlbRUniUti ;
   private int[] T01P27_A54AlbRPieUti ;
   private int[] T01P27_A252CliCod ;
   private String[] T01P27_A45AlbRef ;
   private String[] T01P27_A56AlbRUni ;
   private int[] T01P27_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P27_A58AlbRUniEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV77WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV78TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV82TrnContextAtt ;
}

final  class tdevpie1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01P22", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P23", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P24", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P25", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P27", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P28", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P29", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P210", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P212", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P213", "SELECT TrnNom AS DevTrnNom, EmprCod, TrnCod AS DevGenTrn FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P215", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T4.AlbREst, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieUti, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, TM1.EmprTrn, T6.TrnNom AS DevTrnNom, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P216", "SELECT /*+ FIRST_ROWS */ TrnNom AS DevTrnNom, EmprCod, TrnCod AS DevGenTrn FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P217", "SELECT /*+ FIRST_ROWS */ TrnNom AS DevTrnNom, EmprCod, TrnCod AS DevGenTrn FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P218", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P219", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P221", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P222", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P223", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod > ?) and EmprCod = ? ORDER BY EmprCod, DevGenCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P224", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevGenCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P225", "SELECT /*+ FIRST_ROWS */ TrnNom AS DevTrnNom, EmprCod, TrnCod AS DevGenTrn FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P226", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P227", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, DevMatric, DevHorSal, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevDiscli, DevMdl, DevEnvAT, DevATCodeI, DevGenAT, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01P228", "UPDATE TXPDEVGEN SET CliCod=?, DevGenUni=?, DevGenPie=?, DevGenFec=?, DevGenDom=?, EmprTrn=?, DevGenEst=?, DevUlin=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01P229", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("T01P230", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P231", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P232", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P234", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P235", "SELECT * FROM (SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P236", "UPDATE TXPDEVGEN SET DevUlin=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01P237", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01P238", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? ORDER BY EmprCod, DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P239", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? and DevLin = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P240", "SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P241", "INSERT INTO TXPDEVOBS(DevGenCod, DevLin, DevObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("T01P242", "UPDATE TXPDEVOBS SET DevObs=?  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("T01P243", "DELETE FROM TXPDEVOBS  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new ForEachCursor("T01P244", "SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P245", "SELECT * FROM (SELECT DISTINCT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(TrnNom) like '%' || UPPER(?)) ORDER BY TrnNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P246", "SELECT TrnNom AS DevTrnNom, EmprCod, TrnCod AS DevGenTrn FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P248", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P249", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P250", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P251", "SELECT /*+ FIRST_ROWS */ TrnNom AS DevTrnNom, EmprCod, TrnCod AS DevGenTrn FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P252", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 3);
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(22);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[35])[0] = rslt.getShort(24);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 25 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 42 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 45 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[21]).shortValue());
               }
               return;
            case 23 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
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
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 31 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

