package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprdcom_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDCOMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdcomcod1S0( A396EmprCod, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDCOMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdcomcod1S0( A396EmprCod, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRDCOMCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h688PrdComCod = httpContext.GetPar( "h688PrdComCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprdcomcod1S160( A396EmprCod, h688PrdComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"EMPRCOD") == 0 )
      {
         AV32EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
         Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaemprcod1S160( AV32EmprCod, Gx_BScreen) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"PRDCOMVAL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1186PrdPrec = CommonUtil.decimalVal( httpContext.GetPar( "PrdPrec"), ".") ;
         A690PrdComFN = CommonUtil.decimalVal( httpContext.GetPar( "PrdComFN"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asaprdcomval1S79( A396EmprCod, A1186PrdPrec, A690PrdComFN) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A688PrdComCod = httpContext.GetPar( "PrdComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A688PrdComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A688PrdComCod = httpContext.GetPar( "PrdComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A688PrdComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
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
         gxload_26( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A856ValCod = (byte)(GXutil.lval( httpContext.GetPar( "ValCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A856ValCod) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33PrdComCod = httpContext.GetPar( "PrdComCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33PrdComCod", AV33PrdComCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDCOMCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33PrdComCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Producto Compuesto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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

   public tprdcom_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprdcom_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdcom_impl.class ));
   }

   public tprdcom_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComCod_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComCod_Internalname, h688PrdComCod, GXutil.rtrim( localUtil.format( h688PrdComCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdComCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComDsc_Internalname, GXutil.rtrim( A13884PrdComDsc), GXutil.rtrim( localUtil.format( A13884PrdComDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdComDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCOM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabletotalinfo_Internalname, 1, 0, "px", 0, "px", divTabletotalinfo_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTotalcomp_Internalname, 1, 0, "px", 0, "px", divTotalcomp_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComPor_Internalname, httpContext.getMessage( "% Total", ""), "gx-form-item Attribute250Label", 0, true, "width: 25%;");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComPor_Internalname, GXutil.ltrim( localUtil.ntoc( A1184PrdComPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComPor_Enabled!=0) ? localUtil.format( A1184PrdComPor, "ZZZ9.99") : localUtil.format( A1184PrdComPor, "ZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComPor_Jsonclick, 0, "Attribute250", "", "", "", "", 1, edtPrdComPor_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTotalprecio_Internalname, 1, 0, "px", 0, "px", divTotalprecio_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComPr_Internalname, httpContext.getMessage( "Precio", ""), "gx-form-item Attribute250Label", 0, true, "width: 25%;");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComPr_Internalname, GXutil.ltrim( localUtil.ntoc( A1185PrdComPr, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdComPr_Enabled!=0) ? localUtil.format( A1185PrdComPr, "ZZZZ9.999") : localUtil.format( A1185PrdComPr, "ZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComPr_Jsonclick, 0, "Attribute250", "", "", "", "", 1, edtPrdComPr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDCOM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV41Pgmname), GXutil.rtrim( localUtil.format( AV41Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCOM.htm");
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
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV38PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount79 = (short)(3) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_79 = (short)(1) ;
            scanStart1S79( ) ;
            while ( RcdFound79 != 0 )
            {
               init_level_properties79( ) ;
               getByPrimaryKey1S79( ) ;
               addRow1S79( ) ;
               scanNext1S79( ) ;
            }
            scanEnd1S79( ) ;
            nBlankRcdCount79 = (short)(3) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1185PrdComPr = A1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         B1184PrdComPor = A1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         standaloneNotModal1S79( ) ;
         standaloneModal1S79( ) ;
         sMode79 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1S79( ) ;
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPrdPrec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPrdComFN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMFN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdComFN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComFN_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtValDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPrdComVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMVAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdComVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComVal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_79 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1S79( ) ;
            }
            sendRow1S79( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode79 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1185PrdComPr = B1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = B1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount79 = (short)(3) ;
         nRcdExists_79 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1S79( ) ;
            while ( RcdFound79 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3579( ) ;
               init_level_properties79( ) ;
               standaloneNotModal1S79( ) ;
               getByPrimaryKey1S79( ) ;
               standaloneModal1S79( ) ;
               addRow1S79( ) ;
               scanNext1S79( ) ;
            }
            scanEnd1S79( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode79 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3579( ) ;
         initAll1S79( ) ;
         init_level_properties79( ) ;
         B1185PrdComPr = A1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         B1184PrdComPor = A1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         nRcdExists_79 = (short)(0) ;
         nIsMod_79 = (short)(0) ;
         nRcdDeleted_79 = (short)(0) ;
         nBlankRcdCount79 = (short)(nBlankRcdUsr79+nBlankRcdCount79) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount79 > 0 )
         {
            standaloneNotModal1S79( ) ;
            standaloneModal1S79( ) ;
            addRow1S79( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount79 = (short)(nBlankRcdCount79-1) ;
         }
         Gx_mode = sMode79 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1185PrdComPr = B1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = B1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
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
      e111S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV38PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z688PrdComCod = httpContext.cgiGet( "Z688PrdComCod") ;
            O1185PrdComPr = localUtil.ctond( httpContext.cgiGet( "O1185PrdComPr")) ;
            O1184PrdComPor = localUtil.ctond( httpContext.cgiGet( "O1184PrdComPor")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A688PrdComCod = httpContext.cgiGet( "GXHCPRDCOMCOD") ;
            A13883PrdComEsCo = GXutil.strtobool( httpContext.cgiGet( "PRDCOMESCO")) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33PrdComCod = httpContext.cgiGet( "vPRDCOMCOD") ;
            A13882PrdComCan = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMCAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A719PrdNum = httpContext.cgiGet( "PRDNUM") ;
            A13881PrdEsCompu = GXutil.strtobool( httpContext.cgiGet( "PRDESCOMPU")) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
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
            Combo_prdnum_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            h688PrdComCod = httpContext.cgiGet( edtPrdComCod_Internalname) ;
            A13884PrdComDsc = httpContext.cgiGet( edtPrdComDsc_Internalname) ;
            n13884PrdComDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
            A1184PrdComPor = localUtil.ctond( httpContext.cgiGet( edtPrdComPor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
            A1185PrdComPr = localUtil.ctond( httpContext.cgiGet( edtPrdComPr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            AV41Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPRDCOM");
            A688PrdComCod = httpContext.cgiGet( edtPrdComCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
            forbiddenHiddens.add("PrdComCod", GXutil.rtrim( localUtil.format( A688PrdComCod, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tprdcom:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A688PrdComCod = httpContext.GetPar( "PrdComCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
               getEqualNoModal( ) ;
               if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
               {
                  A396EmprCod = AV32EmprCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               }
               else
               {
                  if ( isIns( )  && (GXutil.strcmp("", A396EmprCod)==0) && ( Gx_BScreen == 0 ) )
                  {
                     GXt_char1 = A396EmprCod ;
                     GXv_char2[0] = GXt_char1 ;
                     new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
                     tprdcom_impl.this.GXt_char1 = GXv_char2[0] ;
                     A396EmprCod = GXt_char1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode160 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
                  {
                     A396EmprCod = AV32EmprCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  }
                  else
                  {
                     if ( isIns( )  && (GXutil.strcmp("", A396EmprCod)==0) && ( Gx_BScreen == 0 ) )
                     {
                        GXt_char1 = A396EmprCod ;
                        GXv_char2[0] = GXt_char1 ;
                        new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
                        tprdcom_impl.this.GXt_char1 = GXv_char2[0] ;
                        A396EmprCod = GXt_char1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     }
                  }
                  Gx_mode = sMode160 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound160 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1S0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                        e111S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121S2 ();
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
         e121S2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1S160( ) ;
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
         disableAttributes1S160( ) ;
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

   public void confirm_1S0( )
   {
      beforeValidate1S160( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1S160( ) ;
         }
         else
         {
            checkExtendedTable1S160( ) ;
            closeExtendedTableCursors1S160( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode160 = Gx_mode ;
         confirm_1S79( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode160 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1S79( )
   {
      s1185PrdComPr = O1185PrdComPr ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      s1184PrdComPor = O1184PrdComPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1S79( ) ;
         if ( ( nRcdExists_79 != 0 ) || ( nIsMod_79 != 0 ) )
         {
            getKey1S79( ) ;
            if ( ( nRcdExists_79 == 0 ) && ( nRcdDeleted_79 == 0 ) )
            {
               if ( RcdFound79 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1S79( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1S79( ) ;
                     closeExtendedTableCursors1S79( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1185PrdComPr = A1185PrdComPr ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
                     O1184PrdComPor = A1184PrdComPor ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
                  }
               }
               else
               {
                  GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound79 != 0 )
               {
                  if ( nRcdDeleted_79 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1S79( ) ;
                     load1S79( ) ;
                     beforeValidate1S79( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1S79( ) ;
                        O1185PrdComPr = A1185PrdComPr ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
                        O1184PrdComPor = A1184PrdComPor ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_79 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1S79( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1S79( ) ;
                           closeExtendedTableCursors1S79( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1185PrdComPr = A1185PrdComPr ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
                           O1184PrdComPor = A1184PrdComPor ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_79 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdPrec_Internalname, GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdComFN_Internalname, GXutil.ltrim( localUtil.ntoc( A690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtValDsc_Internalname, GXutil.rtrim( A857ValDsc)) ;
         httpContext.changePostValue( edtPrdComVal_Internalname, GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_35_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z1186PrdPrec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z692PrdComVal_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z690PrdComFN_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T692PrdComVal_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T690PrdComFN_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_79_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_79_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_79_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_79 != 0 )
         {
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCOMFN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComFN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCOMVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1185PrdComPr = s1185PrdComPr ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      O1184PrdComPor = s1184PrdComPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      /* Start of After( level) rules */
      /* Using cursor T001S7 */
      pr_default.execute(4, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13882PrdComCan = T001S7_A13882PrdComCan[0] ;
      }
      else
      {
         A13882PrdComCan = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      if ( ( A1184PrdComPor.doubleValue() > 100 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Suma de % debe ser <= 100", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* End of After( level) rules */
   }

   public void resetCaption1S0( )
   {
   }

   public void e111S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprdcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = AV37CargaEmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprdcom_impl.this.AV37CargaEmprCod = GXv_char2[0] ;
      tprdcom_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprdcom_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37CargaEmprCod", AV37CargaEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV20Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tprdcom_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char4, GXv_char3, GXv_char2) ;
      tprdcom_impl.this.AV32EmprCod = GXv_char4[0] ;
      tprdcom_impl.this.AV16EmprNom = GXv_char3[0] ;
      tprdcom_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      divTotalcomp_Class = "totalComp" ;
      httpContext.ajax_rsp_assign_prop("", false, divTotalcomp_Internalname, "Class", divTotalcomp_Class, true);
      divTotalprecio_Class = "totalPrecio" ;
      httpContext.ajax_rsp_assign_prop("", false, divTotalprecio_Internalname, "Class", divTotalprecio_Class, true);
      divTabletotalinfo_Class = "totalInfo" ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletotalinfo_Internalname, "Class", divTabletotalinfo_Class, true);
   }

   public void e121S2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tprdcomww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV38PrdNum_Data ;
      GXv_char4[0] = AV39ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.tprdcomloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV32EmprCod, AV33PrdComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tprdcom_impl.this.AV39ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV38PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1S160( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -21 )
      {
         Z688PrdComCod = A688PrdComCod ;
         Z396EmprCod = A396EmprCod ;
         Z13884PrdComDsc = A13884PrdComDsc ;
         Z13882PrdComCan = A13882PrdComCan ;
         Z1185PrdComPr = A1185PrdComPr ;
         Z1184PrdComPor = A1184PrdComPor ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComCod_Enabled), 5, 0), true);
      AV41Pgmname = "TPRDCOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV33PrdComCod)==0) )
      {
         A688PrdComCod = AV33PrdComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         /* Using cursor T001S12 */
         pr_default.execute(9, new Object[] {A396EmprCod, A688PrdComCod});
         h688PrdComCod = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h688PrdComCod = T001S12_A13747PrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
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
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A396EmprCod)==0) && ( Gx_BScreen == 0 ) )
         {
            GXt_char1 = A396EmprCod ;
            GXv_char4[0] = GXt_char1 ;
            new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
            tprdcom_impl.this.GXt_char1 = GXv_char4[0] ;
            A396EmprCod = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
         {
            A13883PrdComEsCo = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         }
         else
         {
            A13883PrdComEsCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         }
         /* Using cursor T001S11 */
         pr_default.execute(8, new Object[] {A396EmprCod, A688PrdComCod});
         if ( (pr_default.getStatus(8) != 101) )
         {
            A13884PrdComDsc = T001S11_A13884PrdComDsc[0] ;
            n13884PrdComDsc = T001S11_n13884PrdComDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
         }
         else
         {
            A13884PrdComDsc = "" ;
            n13884PrdComDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
         }
         pr_default.close(8);
         /* Using cursor T001S7 */
         pr_default.execute(4, new Object[] {A396EmprCod, A688PrdComCod});
         if ( (pr_default.getStatus(4) != 101) )
         {
            A13882PrdComCan = T001S7_A13882PrdComCan[0] ;
            A1185PrdComPr = T001S7_A1185PrdComPr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            A1184PrdComPor = T001S7_A1184PrdComPor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         else
         {
            A13882PrdComCan = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
            A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         O1185PrdComPr = A1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         O1184PrdComPor = A1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         pr_default.close(4);
      }
   }

   public void load1S160( )
   {
      /* Using cursor T001S14 */
      pr_default.execute(10, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound160 = (short)(1) ;
         A13884PrdComDsc = T001S14_A13884PrdComDsc[0] ;
         n13884PrdComDsc = T001S14_n13884PrdComDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
         A13882PrdComCan = T001S14_A13882PrdComCan[0] ;
         A1185PrdComPr = T001S14_A1185PrdComPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = T001S14_A1184PrdComPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         zm1S160( -21) ;
      }
      pr_default.close(10);
      onLoadActions1S160( ) ;
   }

   public void onLoadActions1S160( )
   {
      O1185PrdComPr = A1185PrdComPr ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      O1184PrdComPor = A1184PrdComPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
      {
         A13883PrdComEsCo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      else
      {
         A13883PrdComEsCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      /* Using cursor T001S15 */
      pr_default.execute(11, new Object[] {A396EmprCod, A688PrdComCod});
      h688PrdComCod = "" ;
      while ( (pr_default.getStatus(11) != 101) )
      {
         h688PrdComCod = T001S15_A13747PrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(11);
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
   }

   public void checkExtendedTable1S160( )
   {
      nIsDirty_160 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T001S10 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T001S11 */
      pr_default.execute(8, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13884PrdComDsc = T001S11_A13884PrdComDsc[0] ;
         n13884PrdComDsc = T001S11_n13884PrdComDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
      }
      else
      {
         nIsDirty_160 = (short)(1) ;
         A13884PrdComDsc = "" ;
         n13884PrdComDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
      }
      pr_default.close(8);
      /* Using cursor T001S7 */
      pr_default.execute(4, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13882PrdComCan = T001S7_A13882PrdComCan[0] ;
         A1185PrdComPr = T001S7_A1185PrdComPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = T001S7_A1184PrdComPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      else
      {
         nIsDirty_160 = (short)(1) ;
         A13882PrdComCan = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
         nIsDirty_160 = (short)(1) ;
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         nIsDirty_160 = (short)(1) ;
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      pr_default.close(4);
      if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
      {
         nIsDirty_160 = (short)(1) ;
         A13883PrdComEsCo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      else
      {
         nIsDirty_160 = (short)(1) ;
         A13883PrdComEsCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      }
      if ( ! ( GXutil.strSearch( GXutil.trim( A688PrdComCod), "0", 1) == 1 ) && ! (GXutil.strcmp("", A688PrdComCod)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. El producto debe comenzar por cero", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1S160( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( String A396EmprCod )
   {
      /* Using cursor T001S16 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_23( String A396EmprCod ,
                          String A688PrdComCod )
   {
      /* Using cursor T001S17 */
      pr_default.execute(13, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A13884PrdComDsc = T001S17_A13884PrdComDsc[0] ;
         n13884PrdComDsc = T001S17_n13884PrdComDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
      }
      else
      {
         A13884PrdComDsc = "" ;
         n13884PrdComDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13884PrdComDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_24( String A396EmprCod ,
                          String A688PrdComCod )
   {
      /* Using cursor T001S19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A13882PrdComCan = T001S19_A13882PrdComCan[0] ;
         A1185PrdComPr = T001S19_A1185PrdComPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = T001S19_A1184PrdComPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      else
      {
         A13882PrdComCan = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13882PrdComCan, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1185PrdComPr, (byte)(11), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1184PrdComPor, (byte)(7), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1S160( )
   {
      /* Using cursor T001S20 */
      pr_default.execute(15, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound160 = (short)(1) ;
      }
      else
      {
         RcdFound160 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001S9 */
      pr_default.execute(6, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1S160( 21) ;
         RcdFound160 = (short)(1) ;
         A688PrdComCod = T001S9_A688PrdComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         A396EmprCod = T001S9_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z688PrdComCod = A688PrdComCod ;
         sMode160 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1S160( ) ;
         if ( AnyError == 1 )
         {
            RcdFound160 = (short)(0) ;
            initializeNonKey1S160( ) ;
         }
         Gx_mode = sMode160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound160 = (short)(0) ;
         initializeNonKey1S160( ) ;
         sMode160 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode160 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1S160( ) ;
      if ( RcdFound160 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound160 = (short)(0) ;
      /* Using cursor T001S21 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T001S21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001S21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001S21_A688PrdComCod[0], A688PrdComCod) < 0 ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T001S21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001S21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001S21_A688PrdComCod[0], A688PrdComCod) > 0 ) ) )
         {
            A396EmprCod = T001S21_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A688PrdComCod = T001S21_A688PrdComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
            RcdFound160 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound160 = (short)(0) ;
      /* Using cursor T001S22 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T001S22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001S22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001S22_A688PrdComCod[0], A688PrdComCod) > 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T001S22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001S22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001S22_A688PrdComCod[0], A688PrdComCod) < 0 ) ) )
         {
            A396EmprCod = T001S22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A688PrdComCod = T001S22_A688PrdComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
            RcdFound160 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1S160( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1185PrdComPr = O1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = O1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1S160( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound160 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A688PrdComCod = Z688PrdComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1185PrdComPr = O1185PrdComPr ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
               A1184PrdComPor = O1184PrdComPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A1185PrdComPr = O1185PrdComPr ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
               A1184PrdComPor = O1184PrdComPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
               update1S160( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) )
            {
               /* Insert record */
               A1185PrdComPr = O1185PrdComPr ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
               A1184PrdComPor = O1184PrdComPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1S160( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A1185PrdComPr = O1185PrdComPr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
                  A1184PrdComPor = O1184PrdComPor ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1S160( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A688PrdComCod, Z688PrdComCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A688PrdComCod = Z688PrdComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1185PrdComPr = O1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = O1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1S160( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T001S8 */
         pr_default.execute(5, new Object[] {A396EmprCod, A688PrdComCod});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPRDCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPRDCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S160( )
   {
      beforeValidate1S160( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S160( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S160( 0) ;
         checkOptimisticConcurrency1S160( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S160( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S160( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001S23 */
                  pr_default.execute(18, new Object[] {A688PrdComCod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDCO");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( level) rules */
                     if ( (GXutil.strcmp("", A13884PrdComDsc)==0) && true /* After */ && true /* After */ )
                     {
                        httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Error. Producto Compuesto inexistente Cód: %1.", ""), GXutil.trim( A688PrdComCod), "", "", "", "", "", "", "", ""), 1, "");
                        AnyError = (short)(1) ;
                     }
                     /* End of After( level) rules */
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S160( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1S0( ) ;
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
            load1S160( ) ;
         }
         endLevel1S160( ) ;
      }
      closeExtendedTableCursors1S160( ) ;
   }

   public void update1S160( )
   {
      beforeValidate1S160( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S160( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S160( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S160( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1S160( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCPRDCO */
                  deferredUpdate1S160( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( level) rules */
                     if ( (GXutil.strcmp("", A13884PrdComDsc)==0) && true /* After */ && true /* After */ )
                     {
                        httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Error. Producto Compuesto inexistente Cód: %1.", ""), GXutil.trim( A688PrdComCod), "", "", "", "", "", "", "", ""), 1, "");
                        AnyError = (short)(1) ;
                     }
                     /* End of After( level) rules */
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1S160( ) ;
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
         endLevel1S160( ) ;
      }
      closeExtendedTableCursors1S160( ) ;
   }

   public void deferredUpdate1S160( )
   {
   }

   public void delete( )
   {
      beforeValidate1S160( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S160( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S160( ) ;
         afterConfirm1S160( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S160( ) ;
            if ( AnyError == 0 )
            {
               A1185PrdComPr = O1185PrdComPr ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
               A1184PrdComPor = O1184PrdComPor ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
               scanStart1S79( ) ;
               while ( RcdFound79 != 0 )
               {
                  getByPrimaryKey1S79( ) ;
                  delete1S79( ) ;
                  scanNext1S79( ) ;
                  O1185PrdComPr = A1185PrdComPr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
                  O1184PrdComPor = A1184PrdComPor ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
               }
               scanEnd1S79( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001S24 */
                  pr_default.execute(19, new Object[] {A396EmprCod, A688PrdComCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDCO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( level) rules */
                     if ( (GXutil.strcmp("", A13884PrdComDsc)==0) && true /* After */ && true /* After */ )
                     {
                        httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Error. Producto Compuesto inexistente Cód: %1.", ""), GXutil.trim( A688PrdComCod), "", "", "", "", "", "", "", ""), 1, "");
                        AnyError = (short)(1) ;
                     }
                     /* End of After( level) rules */
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
      sMode160 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1S160( ) ;
      Gx_mode = sMode160 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1S160( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001S25 */
         pr_default.execute(20, new Object[] {A396EmprCod, A688PrdComCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            A13884PrdComDsc = T001S25_A13884PrdComDsc[0] ;
            n13884PrdComDsc = T001S25_n13884PrdComDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
         }
         else
         {
            A13884PrdComDsc = "" ;
            n13884PrdComDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
         }
         pr_default.close(20);
         /* Using cursor T001S27 */
         pr_default.execute(21, new Object[] {A396EmprCod, A688PrdComCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            A13882PrdComCan = T001S27_A13882PrdComCan[0] ;
            A1185PrdComPr = T001S27_A1185PrdComPr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            A1184PrdComPor = T001S27_A1184PrdComPor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         else
         {
            A13882PrdComCan = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
            A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         pr_default.close(21);
         if ( GXutil.strSearch( A688PrdComCod, "0", 1) == 1 )
         {
            A13883PrdComEsCo = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         }
         else
         {
            A13883PrdComEsCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
         }
      }
   }

   public void processNestedLevel1S79( )
   {
      s1185PrdComPr = O1185PrdComPr ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      s1184PrdComPor = O1184PrdComPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1S79( ) ;
         if ( ( nRcdExists_79 != 0 ) || ( nIsMod_79 != 0 ) )
         {
            standaloneNotModal1S79( ) ;
            getKey1S79( ) ;
            if ( ( nRcdExists_79 == 0 ) && ( nRcdDeleted_79 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1S79( ) ;
            }
            else
            {
               if ( RcdFound79 != 0 )
               {
                  if ( ( nRcdDeleted_79 != 0 ) && ( nRcdExists_79 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1S79( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_79 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1S79( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_79 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1185PrdComPr = A1185PrdComPr ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            O1184PrdComPor = A1184PrdComPor ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdPrec_Internalname, GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdComFN_Internalname, GXutil.ltrim( localUtil.ntoc( A690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtValDsc_Internalname, GXutil.rtrim( A857ValDsc)) ;
         httpContext.changePostValue( edtPrdComVal_Internalname, GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_35_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z1186PrdPrec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z692PrdComVal_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z690PrdComFN_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T692PrdComVal_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T690PrdComFN_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_79_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_79_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_79_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_79 != 0 )
         {
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCOMFN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComFN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCOMVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T001S27 */
      pr_default.execute(21, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A13882PrdComCan = T001S27_A13882PrdComCan[0] ;
      }
      else
      {
         A13882PrdComCan = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      if ( ( A1184PrdComPor.doubleValue() > 100 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Suma de % debe ser <= 100", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* End of After( level) rules */
      initAll1S79( ) ;
      if ( AnyError != 0 )
      {
         O1185PrdComPr = s1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         O1184PrdComPor = s1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      nRcdExists_79 = (short)(0) ;
      nIsMod_79 = (short)(0) ;
      nRcdDeleted_79 = (short)(0) ;
   }

   public void processLevel1S160( )
   {
      /* Save parent mode. */
      sMode160 = Gx_mode ;
      processNestedLevel1S79( ) ;
      if ( AnyError != 0 )
      {
         O1185PrdComPr = s1185PrdComPr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         O1184PrdComPor = s1184PrdComPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode160 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1S160( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1S160( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprdcom");
         if ( AnyError == 0 )
         {
            confirmValues1S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprdcom");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1S160( )
   {
      /* Scan By routine */
      /* Using cursor T001S28 */
      pr_default.execute(22);
      RcdFound160 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound160 = (short)(1) ;
         A396EmprCod = T001S28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A688PrdComCod = T001S28_A688PrdComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1S160( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound160 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound160 = (short)(1) ;
         A396EmprCod = T001S28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A688PrdComCod = T001S28_A688PrdComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", A688PrdComCod);
      }
   }

   public void scanEnd1S160( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1S160( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S160( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S160( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S160( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S160( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S160( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S160( )
   {
      edtPrdComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComCod_Enabled), 5, 0), true);
      edtPrdComDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComDsc_Enabled), 5, 0), true);
      edtPrdComPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComPor_Enabled), 5, 0), true);
      edtPrdComPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComPr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void zm1S79( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1186PrdPrec = T001S3_A1186PrdPrec[0] ;
            Z692PrdComVal = T001S3_A692PrdComVal[0] ;
            Z690PrdComFN = T001S3_A690PrdComFN[0] ;
         }
         else
         {
            Z1186PrdPrec = A1186PrdPrec ;
            Z692PrdComVal = A692PrdComVal ;
            Z690PrdComFN = A690PrdComFN ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z688PrdComCod = A688PrdComCod ;
         Z1186PrdPrec = A1186PrdPrec ;
         Z692PrdComVal = A692PrdComVal ;
         Z690PrdComFN = A690PrdComFN ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z856ValCod = A856ValCod ;
         Z857ValDsc = A857ValDsc ;
      }
   }

   public void standaloneNotModal1S79( )
   {
   }

   public void standaloneModal1S79( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1S79( )
   {
      /* Using cursor T001S29 */
      pr_default.execute(23, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound79 = (short)(1) ;
         A1186PrdPrec = T001S29_A1186PrdPrec[0] ;
         A692PrdComVal = T001S29_A692PrdComVal[0] ;
         A718PrdNom = T001S29_A718PrdNom[0] ;
         A724PrdPreAct = T001S29_A724PrdPreAct[0] ;
         A690PrdComFN = T001S29_A690PrdComFN[0] ;
         A857ValDsc = T001S29_A857ValDsc[0] ;
         n857ValDsc = T001S29_n857ValDsc[0] ;
         A856ValCod = T001S29_A856ValCod[0] ;
         zm1S79( -25) ;
      }
      pr_default.close(23);
      onLoadActions1S79( ) ;
   }

   public void onLoadActions1S79( )
   {
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         A13881PrdEsCompu = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      else
      {
         A13881PrdEsCompu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1186PrdPrec)==0) && ( Gx_BScreen == 0 ) )
      {
         A1186PrdPrec = A724PrdPreAct ;
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1186PrdPrec)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A724PrdPreAct)==0) && true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            A1186PrdPrec = A724PrdPreAct ;
         }
      }
      GXt_decimal8 = A692PrdComVal ;
      GXv_decimal9[0] = GXt_decimal8 ;
      new app.core.pcomval(remoteHandle, context).execute( A396EmprCod, A1186PrdPrec, A690PrdComFN, GXv_decimal9) ;
      tprdcom_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
      A692PrdComVal = GXt_decimal8 ;
      if ( isIns( )  )
      {
         A1184PrdComPor = O1184PrdComPor.add(A690PrdComFN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1184PrdComPor = O1184PrdComPor.add(A690PrdComFN).subtract(O690PrdComFN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1184PrdComPor = O1184PrdComPor.subtract(O690PrdComFN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A1185PrdComPr = O1185PrdComPr.add(A692PrdComVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1185PrdComPr = O1185PrdComPr.add(A692PrdComVal).subtract(O692PrdComVal) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1185PrdComPr = O1185PrdComPr.subtract(O692PrdComVal) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            }
         }
      }
   }

   public void checkExtendedTable1S79( )
   {
      nIsDirty_79 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1S79( ) ;
      /* Using cursor T001S4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T001S4_A718PrdNom[0] ;
      A724PrdPreAct = T001S4_A724PrdPreAct[0] ;
      A856ValCod = T001S4_A856ValCod[0] ;
      pr_default.close(2);
      /* Using cursor T001S5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A857ValDsc = T001S5_A857ValDsc[0] ;
      n857ValDsc = T001S5_n857ValDsc[0] ;
      pr_default.close(3);
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         nIsDirty_79 = (short)(1) ;
         A13881PrdEsCompu = true ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      else
      {
         nIsDirty_79 = (short)(1) ;
         A13881PrdEsCompu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      }
      nIsDirty_79 = (short)(1) ;
      A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1186PrdPrec)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_79 = (short)(1) ;
         A1186PrdPrec = A724PrdPreAct ;
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1186PrdPrec)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A724PrdPreAct)==0) && true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            nIsDirty_79 = (short)(1) ;
            A1186PrdPrec = A724PrdPreAct ;
         }
      }
      if ( (GXutil.strcmp("", A719PrdNum)==0) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere código producto Componente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strSearch( A719PrdNum, "0", 1) == 1 ) && ! (GXutil.strcmp("", A719PrdNum)==0) && true /* After */ )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se puede usar Productos compuestos como componente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A856ValCod == 3 ) && true /* After */ )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Error. Este producto se encuentra %1", ""), GXutil.trim( A857ValDsc), "", "", "", "", "", "", "", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_79 = (short)(1) ;
      GXt_decimal8 = A692PrdComVal ;
      GXv_decimal9[0] = GXt_decimal8 ;
      new app.core.pcomval(remoteHandle, context).execute( A396EmprCod, A1186PrdPrec, A690PrdComFN, GXv_decimal9) ;
      tprdcom_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
      A692PrdComVal = GXt_decimal8 ;
      if ( isIns( )  )
      {
         nIsDirty_79 = (short)(1) ;
         A1184PrdComPor = O1184PrdComPor.add(A690PrdComFN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_79 = (short)(1) ;
            A1184PrdComPor = O1184PrdComPor.add(A690PrdComFN).subtract(O690PrdComFN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_79 = (short)(1) ;
               A1184PrdComPor = O1184PrdComPor.subtract(O690PrdComFN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
            }
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A690PrdComFN)==0) )
      {
         GXCCtl = "PRDCOMFN_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere % Comp.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdComFN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_79 = (short)(1) ;
         A1185PrdComPr = O1185PrdComPr.add(A692PrdComVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_79 = (short)(1) ;
            A1185PrdComPr = O1185PrdComPr.add(A692PrdComVal).subtract(O692PrdComVal) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_79 = (short)(1) ;
               A1185PrdComPr = O1185PrdComPr.subtract(O692PrdComVal) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors1S79( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1S79( )
   {
   }

   public void gxload_26( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T001S30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T001S30_A718PrdNom[0] ;
      A724PrdPreAct = T001S30_A724PrdPreAct[0] ;
      A856ValCod = T001S30_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_27( String A396EmprCod ,
                          byte A856ValCod )
   {
      /* Using cursor T001S31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A857ValDsc = T001S31_A857ValDsc[0] ;
      n857ValDsc = T001S31_n857ValDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A857ValDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey1S79( )
   {
      /* Using cursor T001S32 */
      pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound79 = (short)(1) ;
      }
      else
      {
         RcdFound79 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1S79( )
   {
      /* Using cursor T001S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T001S3_A688PrdComCod[0], A688PrdComCod) == 0 ) )
      {
         zm1S79( 25) ;
         RcdFound79 = (short)(1) ;
         initializeNonKey1S79( ) ;
         A1186PrdPrec = T001S3_A1186PrdPrec[0] ;
         A692PrdComVal = T001S3_A692PrdComVal[0] ;
         A690PrdComFN = T001S3_A690PrdComFN[0] ;
         A719PrdNum = T001S3_A719PrdNum[0] ;
         O692PrdComVal = A692PrdComVal ;
         O690PrdComFN = A690PrdComFN ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z688PrdComCod = A688PrdComCod ;
         sMode79 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1S79( ) ;
         Gx_mode = sMode79 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound79 = (short)(0) ;
         initializeNonKey1S79( ) ;
         sMode79 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1S79( ) ;
         Gx_mode = sMode79 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1S79( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1S79( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRDCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1186PrdPrec, T001S2_A1186PrdPrec[0]) != 0 ) || ( DecimalUtil.compareTo(Z692PrdComVal, T001S2_A692PrdComVal[0]) != 0 ) || ( DecimalUtil.compareTo(Z690PrdComFN, T001S2_A690PrdComFN[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1186PrdPrec, T001S2_A1186PrdPrec[0]) != 0 )
            {
               GXutil.writeLogln("tprdcom:[seudo value changed for attri]"+"PrdPrec");
               GXutil.writeLogRaw("Old: ",Z1186PrdPrec);
               GXutil.writeLogRaw("Current: ",T001S2_A1186PrdPrec[0]);
            }
            if ( DecimalUtil.compareTo(Z692PrdComVal, T001S2_A692PrdComVal[0]) != 0 )
            {
               GXutil.writeLogln("tprdcom:[seudo value changed for attri]"+"PrdComVal");
               GXutil.writeLogRaw("Old: ",Z692PrdComVal);
               GXutil.writeLogRaw("Current: ",T001S2_A692PrdComVal[0]);
            }
            if ( DecimalUtil.compareTo(Z690PrdComFN, T001S2_A690PrdComFN[0]) != 0 )
            {
               GXutil.writeLogln("tprdcom:[seudo value changed for attri]"+"PrdComFN");
               GXutil.writeLogRaw("Old: ",Z690PrdComFN);
               GXutil.writeLogRaw("Current: ",T001S2_A690PrdComFN[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPRDCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1S79( )
   {
      beforeValidate1S79( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S79( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1S79( 0) ;
         checkOptimisticConcurrency1S79( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1S79( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1S79( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001S33 */
                  pr_default.execute(27, new Object[] {A688PrdComCod, A1186PrdPrec, A692PrdComVal, A690PrdComFN, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1S79( ) ;
         }
         endLevel1S79( ) ;
      }
      closeExtendedTableCursors1S79( ) ;
   }

   public void update1S79( )
   {
      beforeValidate1S79( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1S79( ) ;
      }
      if ( ( nIsMod_79 != 0 ) || ( nIsDirty_79 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1S79( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1S79( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1S79( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T001S34 */
                     pr_default.execute(28, new Object[] {A1186PrdPrec, A692PrdComVal, A690PrdComFN, A396EmprCod, A719PrdNum, A688PrdComCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRDCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1S79( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1S79( ) ;
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
            endLevel1S79( ) ;
         }
      }
      closeExtendedTableCursors1S79( ) ;
   }

   public void deferredUpdate1S79( )
   {
   }

   public void delete1S79( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1S79( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1S79( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1S79( ) ;
         afterConfirm1S79( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1S79( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001S35 */
               pr_default.execute(29, new Object[] {A396EmprCod, A719PrdNum, A688PrdComCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDCO");
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
      sMode79 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1S79( ) ;
      Gx_mode = sMode79 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1S79( )
   {
      standaloneModal1S79( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001S36 */
         pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T001S36_A718PrdNom[0] ;
         A724PrdPreAct = T001S36_A724PrdPreAct[0] ;
         A856ValCod = T001S36_A856ValCod[0] ;
         pr_default.close(30);
         /* Using cursor T001S37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
         A857ValDsc = T001S37_A857ValDsc[0] ;
         n857ValDsc = T001S37_n857ValDsc[0] ;
         pr_default.close(31);
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            A13881PrdEsCompu = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
         }
         else
         {
            A13881PrdEsCompu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
         }
         A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
         if ( isIns( )  )
         {
            A1184PrdComPor = O1184PrdComPor.add(A690PrdComFN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1184PrdComPor = O1184PrdComPor.add(A690PrdComFN).subtract(O690PrdComFN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1184PrdComPor = O1184PrdComPor.subtract(O690PrdComFN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A1185PrdComPr = O1185PrdComPr.add(A692PrdComVal) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1185PrdComPr = O1185PrdComPr.add(A692PrdComVal).subtract(O692PrdComVal) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1185PrdComPr = O1185PrdComPr.subtract(O692PrdComVal) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
               }
            }
         }
      }
   }

   public void endLevel1S79( )
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

   public void scanStart1S79( )
   {
      /* Scan By routine */
      /* Using cursor T001S38 */
      pr_default.execute(32, new Object[] {A396EmprCod, A688PrdComCod});
      RcdFound79 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound79 = (short)(1) ;
         A719PrdNum = T001S38_A719PrdNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1S79( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound79 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound79 = (short)(1) ;
         A719PrdNum = T001S38_A719PrdNum[0] ;
      }
   }

   public void scanEnd1S79( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1S79( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1S79( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1S79( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1S79( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1S79( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1S79( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1S79( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPrdPrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPrdComFN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComFN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComFN_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPrdComVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComVal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes1S79( )
   {
   }

   public void send_integrity_lvl_hashes1S160( )
   {
   }

   public void subsflControlProps_3579( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_35_idx ;
      edtPrdPrec_Internalname = "PRDPREC_"+sGXsfl_35_idx ;
      edtPrdComFN_Internalname = "PRDCOMFN_"+sGXsfl_35_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_35_idx ;
      edtPrdComVal_Internalname = "PRDCOMVAL_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_3579( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_35_fel_idx ;
      edtPrdPrec_Internalname = "PRDPREC_"+sGXsfl_35_fel_idx ;
      edtPrdComFN_Internalname = "PRDCOMFN_"+sGXsfl_35_fel_idx ;
      edtValDsc_Internalname = "VALDSC_"+sGXsfl_35_fel_idx ;
      edtPrdComVal_Internalname = "PRDCOMVAL_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1S79( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3579( ) ;
      sendRow1S79( ) ;
   }

   public void sendRow1S79( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_79_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_79_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPrec_Internalname,GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPrec_Enabled!=0) ? localUtil.format( A1186PrdPrec, "ZZZZ9.999") : localUtil.format( A1186PrdPrec, "ZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPrec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdPrec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_79_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdComFN_Internalname,GXutil.ltrim( localUtil.ntoc( A690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdComFN_Enabled!=0) ? localUtil.format( A690PrdComFN, "ZZZ9.99") : localUtil.format( A690PrdComFN, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdComFN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdComFN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtValDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_79_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdComVal_Internalname,GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdComVal_Enabled!=0) ? localUtil.format( A692PrdComVal, "ZZZZ9.999") : localUtil.format( A692PrdComVal, "ZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdComVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdComVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1S79( ) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z1186PrdPrec_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1186PrdPrec, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z692PrdComVal_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z690PrdComFN_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O692PrdComVal_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O692PrdComVal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O690PrdComFN_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O690PrdComFN, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_79_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_79_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_79_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_79, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_35_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV35TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vPRDCOMCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33PrdComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCOMFN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComFN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCOMVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1S79( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3579( ) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPrec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdComFN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMFN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtValDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdComVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCOMVAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPrec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPrec_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "PRDPREC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdPrec_Internalname ;
         wbErr = true ;
         A1186PrdPrec = DecimalUtil.ZERO ;
      }
      else
      {
         A1186PrdPrec = localUtil.ctond( httpContext.cgiGet( edtPrdPrec_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdComFN_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdComFN_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "PRDCOMFN_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdComFN_Internalname ;
         wbErr = true ;
         A690PrdComFN = DecimalUtil.ZERO ;
      }
      else
      {
         A690PrdComFN = localUtil.ctond( httpContext.cgiGet( edtPrdComFN_Internalname)) ;
      }
      A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
      n857ValDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdComVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdComVal_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "PRDCOMVAL_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdComVal_Internalname ;
         wbErr = true ;
         A692PrdComVal = DecimalUtil.ZERO ;
      }
      else
      {
         A692PrdComVal = localUtil.ctond( httpContext.cgiGet( edtPrdComVal_Internalname)) ;
      }
      GXCCtl = "Z719PrdNum_" + sGXsfl_35_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1186PrdPrec_" + sGXsfl_35_idx ;
      Z1186PrdPrec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z692PrdComVal_" + sGXsfl_35_idx ;
      Z692PrdComVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z690PrdComFN_" + sGXsfl_35_idx ;
      Z690PrdComFN = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O692PrdComVal_" + sGXsfl_35_idx ;
      O692PrdComVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O690PrdComFN_" + sGXsfl_35_idx ;
      O690PrdComFN = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_79_" + sGXsfl_35_idx ;
      nRcdDeleted_79 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_79_" + sGXsfl_35_idx ;
      nRcdExists_79 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_79_" + sGXsfl_35_idx ;
      nIsMod_79 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
   }

   public void confirmValues1S0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3579( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3579( ) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1186PrdPrec_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1186PrdPrec_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1186PrdPrec_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z692PrdComVal_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z692PrdComVal_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z692PrdComVal_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z690PrdComFN_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z690PrdComFN_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z690PrdComFN_"+sGXsfl_35_idx) ;
      }
      httpContext.changePostValue( "O692PrdComVal", httpContext.cgiGet( "T692PrdComVal")) ;
      httpContext.deletePostValue( "T692PrdComVal") ;
      httpContext.changePostValue( "O690PrdComFN", httpContext.cgiGet( "T690PrdComFN")) ;
      httpContext.deletePostValue( "T690PrdComFN") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprdcom", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33PrdComCod))}, new String[] {"Gx_mode","EmprCod","PrdComCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPRDCOM");
      forbiddenHiddens.add("PrdComCod", GXutil.rtrim( localUtil.format( A688PrdComCod, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tprdcom:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z688PrdComCod", GXutil.rtrim( Z688PrdComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O1185PrdComPr", GXutil.ltrim( localUtil.ntoc( O1185PrdComPr, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1184PrdComPor", GXutil.ltrim( localUtil.ntoc( O1184PrdComPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV38PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV38PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV35TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV35TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPRDCOMCOD", GXutil.rtrim( A688PrdComCod));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "PRDCOMESCO", A13883PrdComEsCo);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDCOMCOD", GXutil.rtrim( AV33PrdComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDCOMCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33PrdComCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCOMCAN", GXutil.ltrim( localUtil.ntoc( A13882PrdComCan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "PRDESCOMPU", A13881PrdEsCompu);
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCDSC", A13747PrdCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tprdcom", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33PrdComCod))}, new String[] {"Gx_mode","EmprCod","PrdComCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPRDCOM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Producto Compuesto", "") ;
   }

   public void initializeNonKey1S160( )
   {
      A13883PrdComEsCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13883PrdComEsCo", A13883PrdComEsCo);
      A13884PrdComDsc = "" ;
      n13884PrdComDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", A13884PrdComDsc);
      A13882PrdComCan = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13882PrdComCan), 6, 0));
      A1185PrdComPr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      A1184PrdComPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
      O1185PrdComPr = A1185PrdComPr ;
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrimstr( A1185PrdComPr, 11, 5));
      O1184PrdComPor = A1184PrdComPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrimstr( A1184PrdComPor, 7, 2));
   }

   public void initAll1S160( )
   {
      A396EmprCod = new app.obtenerempresa(remoteHandle, context).executeUdp( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      h688PrdComCod = "" ;
      initializeNonKey1S160( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1S79( )
   {
      A692PrdComVal = DecimalUtil.ZERO ;
      A13881PrdEsCompu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A690PrdComFN = DecimalUtil.ZERO ;
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A857ValDsc = "" ;
      n857ValDsc = false ;
      A1186PrdPrec = DecimalUtil.ZERO ;
      O692PrdComVal = A692PrdComVal ;
      O690PrdComFN = A690PrdComFN ;
      Z1186PrdPrec = DecimalUtil.ZERO ;
      Z692PrdComVal = DecimalUtil.ZERO ;
      Z690PrdComFN = DecimalUtil.ZERO ;
   }

   public void initAll1S79( )
   {
      A719PrdNum = "" ;
      A13747PrdCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
      h688PrdComCod = A13747PrdCDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
      initializeNonKey1S79( ) ;
   }

   public void standaloneModalInsert1S79( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241501594", true, true);
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
      httpContext.AddJavascriptSource("tprdcom.js", "?20268241501595", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties79( )
   {
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A690PrdComFN, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComFN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtValDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdComVal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdComCod_Internalname = "PRDCOMCOD" ;
      edtPrdComDsc_Internalname = "PRDCOMDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdPrec_Internalname = "PRDPREC" ;
      edtPrdComFN_Internalname = "PRDCOMFN" ;
      edtValDsc_Internalname = "VALDSC" ;
      edtPrdComVal_Internalname = "PRDCOMVAL" ;
      edtPrdComPor_Internalname = "PRDCOMPOR" ;
      divTotalcomp_Internalname = "TOTALCOMP" ;
      edtPrdComPr_Internalname = "PRDCOMPR" ;
      divTotalprecio_Internalname = "TOTALPRECIO" ;
      divTabletotalinfo_Internalname = "TABLETOTALINFO" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
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
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Producto Compuesto", "") );
      edtPrdComVal_Jsonclick = "" ;
      edtValDsc_Jsonclick = "" ;
      edtPrdComFN_Jsonclick = "" ;
      edtPrdPrec_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      edtPrdComVal_Enabled = 1 ;
      edtValDsc_Enabled = 0 ;
      edtPrdComFN_Enabled = 1 ;
      edtPrdPrec_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
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
      edtPrdComPr_Jsonclick = "" ;
      edtPrdComPr_Enabled = 0 ;
      divTotalprecio_Class = "Section" ;
      edtPrdComPor_Jsonclick = "" ;
      edtPrdComPor_Enabled = 0 ;
      divTotalcomp_Class = "Section" ;
      divTabletotalinfo_Class = "Section" ;
      edtPrdComDsc_Jsonclick = "" ;
      edtPrdComDsc_Enabled = 0 ;
      edtPrdComCod_Jsonclick = "" ;
      edtPrdComCod_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
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

   public void gxsgaprdcomcod1S0( String A396EmprCod ,
                                  String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprdcomcod_data1S0( A396EmprCod, A13747PrdCDsc) ;
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

   protected void gxsgaprdcomcod_data1S0( String A396EmprCod ,
                                          String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor T001S39 */
      pr_default.execute(33, new Object[] {A396EmprCod, l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(33) != 101) )
      {
         gxdynajaxctrlcodr.add(T001S39_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(T001S39_A13747PrdCDsc[0]);
         pr_default.readNext(33);
      }
      pr_default.close(33);
   }

   public void gxhcaprdcomcod1S160( String A396EmprCod ,
                                    String A13747PrdCDsc )
   {
      /* Using cursor T001S40 */
      pr_default.execute(34, new Object[] {A13747PrdCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(34) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13747PrdCDsc = T001S40_A13747PrdCDsc[0] ;
         A396EmprCod = T001S40_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T001S40_A719PrdNum[0] ;
         pr_default.readNext(34);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
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
      pr_default.close(34);
   }

   public void gx3asaemprcod1S160( String AV32EmprCod ,
                                   byte Gx_BScreen )
   {
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A396EmprCod)==0) && ( Gx_BScreen == 0 ) )
         {
            GXt_char1 = A396EmprCod ;
            GXv_char4[0] = GXt_char1 ;
            new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
            tprdcom_impl.this.GXt_char1 = GXv_char4[0] ;
            A396EmprCod = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx15asaprdcomval1S79( String A396EmprCod ,
                                     java.math.BigDecimal A1186PrdPrec ,
                                     java.math.BigDecimal A690PrdComFN )
   {
      GXt_decimal8 = A692PrdComVal ;
      GXv_decimal9[0] = GXt_decimal8 ;
      new app.core.pcomval(remoteHandle, context).execute( A396EmprCod, A1186PrdPrec, A690PrdComFN, GXv_decimal9) ;
      tprdcom_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
      A692PrdComVal = GXt_decimal8 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), ".", "")))+"\"") ;
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
      subsflControlProps_3579( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1S79( ) ;
         standaloneModal1S79( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1S79( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3579( ) ;
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

   public void valid_Emprcod( )
   {
      n13884PrdComDsc = false ;
      if ( (GXutil.strcmp("", h688PrdComCod)==0) )
      {
         A688PrdComCod = "" ;
      }
      else
      {
         A13747PrdCDsc = h688PrdComCod ;
         /* Using cursor T001S41 */
         pr_default.execute(35, new Object[] {A13747PrdCDsc, A396EmprCod});
         A396EmprCod = T001S41_A396EmprCod[0] ;
         A688PrdComCod = T001S41_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(35) == 101) ) )
         {
            pr_default.readNext(35);
            if ( ! ( (pr_default.getStatus(35) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdComCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(35);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
      /* Using cursor T001S42 */
      pr_default.execute(36, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(36);
      /* Using cursor T001S43 */
      pr_default.execute(37, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(37) != 101) )
      {
         A13884PrdComDsc = T001S43_A13884PrdComDsc[0] ;
         n13884PrdComDsc = T001S43_n13884PrdComDsc[0] ;
      }
      else
      {
         A13884PrdComDsc = "" ;
         n13884PrdComDsc = false ;
      }
      pr_default.close(37);
      /* Using cursor T001S45 */
      pr_default.execute(38, new Object[] {A396EmprCod, A688PrdComCod});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A13882PrdComCan = T001S45_A13882PrdComCan[0] ;
         A1185PrdComPr = T001S45_A1185PrdComPr[0] ;
         A1184PrdComPor = T001S45_A1184PrdComPor[0] ;
      }
      else
      {
         A13882PrdComCan = 0 ;
         A1185PrdComPr = DecimalUtil.doubleToDec(0) ;
         A1184PrdComPor = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(38);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A688PrdComCod", GXutil.rtrim( A688PrdComCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13884PrdComDsc", GXutil.rtrim( A13884PrdComDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13882PrdComCan", GXutil.ltrim( localUtil.ntoc( A13882PrdComCan, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1185PrdComPr", GXutil.ltrim( localUtil.ntoc( A1185PrdComPr, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1184PrdComPor", GXutil.ltrim( localUtil.ntoc( A1184PrdComPor, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h688PrdComCod", h688PrdComCod);
   }

   public void valid_Prdnum( )
   {
      n857ValDsc = false ;
      /* Using cursor T001S36 */
      pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T001S36_A718PrdNom[0] ;
      A724PrdPreAct = T001S36_A724PrdPreAct[0] ;
      A856ValCod = T001S36_A856ValCod[0] ;
      pr_default.close(30);
      /* Using cursor T001S37 */
      pr_default.execute(31, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A857ValDsc = T001S37_A857ValDsc[0] ;
      n857ValDsc = T001S37_n857ValDsc[0] ;
      pr_default.close(31);
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         A13881PrdEsCompu = true ;
      }
      else
      {
         A13881PrdEsCompu = false ;
      }
      A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1186PrdPrec)==0) && ( Gx_BScreen == 0 ) )
      {
         A1186PrdPrec = A724PrdPreAct ;
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1186PrdPrec)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A724PrdPreAct)==0) && true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            A1186PrdPrec = A724PrdPreAct ;
         }
      }
      if ( (GXutil.strcmp("", A719PrdNum)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere código producto Componente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( ( GXutil.strSearch( A719PrdNum, "0", 1) == 1 ) && ! (GXutil.strcmp("", A719PrdNum)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se puede usar Productos compuestos como componente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( ( A856ValCod == 3 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Error. Este producto se encuentra %1", ""), GXutil.trim( A857ValDsc), "", "", "", "", "", "", "", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", GXutil.rtrim( A857ValDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13881PrdEsCompu", A13881PrdEsCompu);
      httpContext.ajax_rsp_assign_attri("", false, "A13747PrdCDsc", A13747PrdCDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A1186PrdPrec", GXutil.ltrim( localUtil.ntoc( A1186PrdPrec, (byte)(11), (byte)(5), ".", "")));
   }

   public void valid_Prdcomfn( )
   {
      GXt_decimal8 = A692PrdComVal ;
      GXv_decimal9[0] = GXt_decimal8 ;
      new app.core.pcomval(remoteHandle, context).execute( A396EmprCod, A1186PrdPrec, A690PrdComFN, GXv_decimal9) ;
      tprdcom_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
      A692PrdComVal = GXt_decimal8 ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A690PrdComFN)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere % Comp.", ""), 1, "PRDCOMFN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdComFN_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A692PrdComVal", GXutil.ltrim( localUtil.ntoc( A692PrdComVal, (byte)(11), (byte)(5), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33PrdComCod',fld:'vPRDCOMCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33PrdComCod',fld:'vPRDCOMCOD',pic:'',hsh:true},{av:'A688PrdComCod',fld:'PRDCOMCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121S2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDCOMCOD","{handler:'valid_Prdcomcod',iparms:[]");
      setEventMetadata("VALID_PRDCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDCOMPOR","{handler:'valid_Prdcompor',iparms:[]");
      setEventMetadata("VALID_PRDCOMPOR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'h688PrdComCod'},{av:'A688PrdComCod',fld:'PRDCOMCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13884PrdComDsc',fld:'PRDCOMDSC',pic:''},{av:'A13882PrdComCan',fld:'PRDCOMCAN',pic:'ZZZ,ZZZ'},{av:'A1185PrdComPr',fld:'PRDCOMPR',pic:'ZZZZ9.999'},{av:'A1184PrdComPor',fld:'PRDCOMPOR',pic:'ZZZ9.99'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A688PrdComCod',fld:'PRDCOMCOD',pic:''},{av:'A13884PrdComDsc',fld:'PRDCOMDSC',pic:''},{av:'A13882PrdComCan',fld:'PRDCOMCAN',pic:'ZZZ,ZZZ'},{av:'A1185PrdComPr',fld:'PRDCOMPR',pic:'ZZZZ9.999'},{av:'A1184PrdComPor',fld:'PRDCOMPOR',pic:'ZZZ9.99'},{av:'h688PrdComCod'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13747PrdCDsc',fld:'PRDCDSC',pic:''},{av:'A1186PrdPrec',fld:'PRDPREC',pic:'ZZZZ9.999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'A13881PrdEsCompu',fld:'PRDESCOMPU',pic:''},{av:'A13747PrdCDsc',fld:'PRDCDSC',pic:''},{av:'A1186PrdPrec',fld:'PRDPREC',pic:'ZZZZ9.999'}]}");
      setEventMetadata("VALID_PRDPREC","{handler:'valid_Prdprec',iparms:[]");
      setEventMetadata("VALID_PRDPREC",",oparms:[]}");
      setEventMetadata("VALID_PRDCOMFN","{handler:'valid_Prdcomfn',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O690PrdComFN'},{av:'O1184PrdComPor'},{av:'A690PrdComFN',fld:'PRDCOMFN',pic:'ZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1186PrdPrec',fld:'PRDPREC',pic:'ZZZZ9.999'},{av:'A692PrdComVal',fld:'PRDCOMVAL',pic:'ZZZZ9.999'}]");
      setEventMetadata("VALID_PRDCOMFN",",oparms:[{av:'A692PrdComVal',fld:'PRDCOMVAL',pic:'ZZZZ9.999'}]}");
      setEventMetadata("VALID_PRDCOMVAL","{handler:'valid_Prdcomval',iparms:[]");
      setEventMetadata("VALID_PRDCOMVAL",",oparms:[]}");
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
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(20);
      pr_default.close(38);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV33PrdComCod = "" ;
      Z396EmprCod = "" ;
      Z688PrdComCod = "" ;
      O1185PrdComPr = DecimalUtil.ZERO ;
      O1184PrdComPor = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z1186PrdPrec = DecimalUtil.ZERO ;
      Z692PrdComVal = DecimalUtil.ZERO ;
      Z690PrdComFN = DecimalUtil.ZERO ;
      O692PrdComVal = DecimalUtil.ZERO ;
      O690PrdComFN = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13747PrdCDsc = "" ;
      h688PrdComCod = "" ;
      AV32EmprCod = "" ;
      A1186PrdPrec = DecimalUtil.ZERO ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A688PrdComCod = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV33PrdComCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13884PrdComDsc = "" ;
      A1184PrdComPor = DecimalUtil.ZERO ;
      A1185PrdComPr = DecimalUtil.ZERO ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV41Pgmname = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV38PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B1185PrdComPr = DecimalUtil.ZERO ;
      B1184PrdComPor = DecimalUtil.ZERO ;
      sMode79 = "" ;
      sStyleString = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode160 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s1185PrdComPr = DecimalUtil.ZERO ;
      s1184PrdComPor = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A857ValDsc = "" ;
      A692PrdComVal = DecimalUtil.ZERO ;
      T692PrdComVal = DecimalUtil.ZERO ;
      T690PrdComFN = DecimalUtil.ZERO ;
      T001S7_A13882PrdComCan = new int[1] ;
      T001S7_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S7_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV20Station = "" ;
      AV37CargaEmprCod = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV39ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z13884PrdComDsc = "" ;
      Z1185PrdComPr = DecimalUtil.ZERO ;
      Z1184PrdComPor = DecimalUtil.ZERO ;
      T001S12_A13747PrdCDsc = new String[] {""} ;
      T001S12_A396EmprCod = new String[] {""} ;
      T001S12_A719PrdNum = new String[] {""} ;
      T001S11_A13884PrdComDsc = new String[] {""} ;
      T001S11_n13884PrdComDsc = new boolean[] {false} ;
      T001S14_A719PrdNum = new String[] {""} ;
      T001S14_A688PrdComCod = new String[] {""} ;
      T001S14_A396EmprCod = new String[] {""} ;
      T001S14_A13884PrdComDsc = new String[] {""} ;
      T001S14_n13884PrdComDsc = new boolean[] {false} ;
      T001S14_A13882PrdComCan = new int[1] ;
      T001S14_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S14_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S15_A13747PrdCDsc = new String[] {""} ;
      T001S15_A396EmprCod = new String[] {""} ;
      T001S15_A719PrdNum = new String[] {""} ;
      T001S10_A396EmprCod = new String[] {""} ;
      T001S16_A396EmprCod = new String[] {""} ;
      T001S17_A13884PrdComDsc = new String[] {""} ;
      T001S17_n13884PrdComDsc = new boolean[] {false} ;
      T001S19_A13882PrdComCan = new int[1] ;
      T001S19_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S19_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S20_A396EmprCod = new String[] {""} ;
      T001S20_A688PrdComCod = new String[] {""} ;
      T001S9_A688PrdComCod = new String[] {""} ;
      T001S9_A396EmprCod = new String[] {""} ;
      T001S21_A396EmprCod = new String[] {""} ;
      T001S21_A688PrdComCod = new String[] {""} ;
      T001S22_A396EmprCod = new String[] {""} ;
      T001S22_A688PrdComCod = new String[] {""} ;
      T001S8_A688PrdComCod = new String[] {""} ;
      T001S8_A396EmprCod = new String[] {""} ;
      T001S25_A13884PrdComDsc = new String[] {""} ;
      T001S25_n13884PrdComDsc = new boolean[] {false} ;
      T001S27_A13882PrdComCan = new int[1] ;
      T001S27_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S27_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S28_A396EmprCod = new String[] {""} ;
      T001S28_A688PrdComCod = new String[] {""} ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z857ValDsc = "" ;
      T001S29_A688PrdComCod = new String[] {""} ;
      T001S29_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S29_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S29_A718PrdNom = new String[] {""} ;
      T001S29_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S29_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S29_A857ValDsc = new String[] {""} ;
      T001S29_n857ValDsc = new boolean[] {false} ;
      T001S29_A396EmprCod = new String[] {""} ;
      T001S29_A719PrdNum = new String[] {""} ;
      T001S29_A856ValCod = new byte[1] ;
      T001S4_A718PrdNom = new String[] {""} ;
      T001S4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S4_A856ValCod = new byte[1] ;
      T001S5_A857ValDsc = new String[] {""} ;
      T001S5_n857ValDsc = new boolean[] {false} ;
      T001S30_A718PrdNom = new String[] {""} ;
      T001S30_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S30_A856ValCod = new byte[1] ;
      T001S31_A857ValDsc = new String[] {""} ;
      T001S31_n857ValDsc = new boolean[] {false} ;
      T001S32_A396EmprCod = new String[] {""} ;
      T001S32_A719PrdNum = new String[] {""} ;
      T001S32_A688PrdComCod = new String[] {""} ;
      T001S3_A688PrdComCod = new String[] {""} ;
      T001S3_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S3_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S3_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S3_A396EmprCod = new String[] {""} ;
      T001S3_A719PrdNum = new String[] {""} ;
      T001S2_A688PrdComCod = new String[] {""} ;
      T001S2_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S2_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S2_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S2_A396EmprCod = new String[] {""} ;
      T001S2_A719PrdNum = new String[] {""} ;
      T001S36_A718PrdNom = new String[] {""} ;
      T001S36_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S36_A856ValCod = new byte[1] ;
      T001S37_A857ValDsc = new String[] {""} ;
      T001S37_n857ValDsc = new boolean[] {false} ;
      T001S38_A396EmprCod = new String[] {""} ;
      T001S38_A719PrdNum = new String[] {""} ;
      T001S38_A688PrdComCod = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13747PrdCDsc = "" ;
      T001S39_A13747PrdCDsc = new String[] {""} ;
      T001S40_A13747PrdCDsc = new String[] {""} ;
      T001S40_A396EmprCod = new String[] {""} ;
      T001S40_A719PrdNum = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      T001S41_A13747PrdCDsc = new String[] {""} ;
      T001S41_A396EmprCod = new String[] {""} ;
      T001S41_A719PrdNum = new String[] {""} ;
      T001S42_A396EmprCod = new String[] {""} ;
      T001S43_A13884PrdComDsc = new String[] {""} ;
      T001S43_n13884PrdComDsc = new boolean[] {false} ;
      T001S45_A13882PrdComCan = new int[1] ;
      T001S45_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001S45_A1184PrdComPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Zh688PrdComCod = "" ;
      Z13747PrdCDsc = "" ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprdcom__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprdcom__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprdcom__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprdcom__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdcom__default(),
         new Object[] {
             new Object[] {
            T001S2_A688PrdComCod, T001S2_A1186PrdPrec, T001S2_A692PrdComVal, T001S2_A690PrdComFN, T001S2_A396EmprCod, T001S2_A719PrdNum
            }
            , new Object[] {
            T001S3_A688PrdComCod, T001S3_A1186PrdPrec, T001S3_A692PrdComVal, T001S3_A690PrdComFN, T001S3_A396EmprCod, T001S3_A719PrdNum
            }
            , new Object[] {
            T001S4_A718PrdNom, T001S4_A724PrdPreAct, T001S4_A856ValCod
            }
            , new Object[] {
            T001S5_A857ValDsc, T001S5_n857ValDsc
            }
            , new Object[] {
            T001S7_A13882PrdComCan, T001S7_A1185PrdComPr, T001S7_A1184PrdComPor
            }
            , new Object[] {
            T001S8_A688PrdComCod, T001S8_A396EmprCod
            }
            , new Object[] {
            T001S9_A688PrdComCod, T001S9_A396EmprCod
            }
            , new Object[] {
            T001S10_A396EmprCod
            }
            , new Object[] {
            T001S11_A13884PrdComDsc, T001S11_n13884PrdComDsc
            }
            , new Object[] {
            T001S12_A13747PrdCDsc, T001S12_A396EmprCod, T001S12_A719PrdNum
            }
            , new Object[] {
            T001S14_A719PrdNum, T001S14_A688PrdComCod, T001S14_A396EmprCod, T001S14_A13884PrdComDsc, T001S14_n13884PrdComDsc, T001S14_A13882PrdComCan, T001S14_A1185PrdComPr, T001S14_A1184PrdComPor
            }
            , new Object[] {
            T001S15_A13747PrdCDsc, T001S15_A396EmprCod, T001S15_A719PrdNum
            }
            , new Object[] {
            T001S16_A396EmprCod
            }
            , new Object[] {
            T001S17_A13884PrdComDsc, T001S17_n13884PrdComDsc
            }
            , new Object[] {
            T001S19_A13882PrdComCan, T001S19_A1185PrdComPr, T001S19_A1184PrdComPor
            }
            , new Object[] {
            T001S20_A396EmprCod, T001S20_A688PrdComCod
            }
            , new Object[] {
            T001S21_A396EmprCod, T001S21_A688PrdComCod
            }
            , new Object[] {
            T001S22_A396EmprCod, T001S22_A688PrdComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001S25_A13884PrdComDsc, T001S25_n13884PrdComDsc
            }
            , new Object[] {
            T001S27_A13882PrdComCan, T001S27_A1185PrdComPr, T001S27_A1184PrdComPor
            }
            , new Object[] {
            T001S28_A396EmprCod, T001S28_A688PrdComCod
            }
            , new Object[] {
            T001S29_A688PrdComCod, T001S29_A1186PrdPrec, T001S29_A692PrdComVal, T001S29_A718PrdNom, T001S29_A724PrdPreAct, T001S29_A690PrdComFN, T001S29_A857ValDsc, T001S29_n857ValDsc, T001S29_A396EmprCod, T001S29_A719PrdNum,
            T001S29_A856ValCod
            }
            , new Object[] {
            T001S30_A718PrdNom, T001S30_A724PrdPreAct, T001S30_A856ValCod
            }
            , new Object[] {
            T001S31_A857ValDsc, T001S31_n857ValDsc
            }
            , new Object[] {
            T001S32_A396EmprCod, T001S32_A719PrdNum, T001S32_A688PrdComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001S36_A718PrdNom, T001S36_A724PrdPreAct, T001S36_A856ValCod
            }
            , new Object[] {
            T001S37_A857ValDsc, T001S37_n857ValDsc
            }
            , new Object[] {
            T001S38_A396EmprCod, T001S38_A719PrdNum, T001S38_A688PrdComCod
            }
            , new Object[] {
            T001S39_A13747PrdCDsc
            }
            , new Object[] {
            T001S40_A13747PrdCDsc, T001S40_A396EmprCod, T001S40_A719PrdNum
            }
            , new Object[] {
            T001S41_A13747PrdCDsc, T001S41_A396EmprCod, T001S41_A719PrdNum
            }
            , new Object[] {
            T001S42_A396EmprCod
            }
            , new Object[] {
            T001S43_A13884PrdComDsc, T001S43_n13884PrdComDsc
            }
            , new Object[] {
            T001S45_A13882PrdComCan, T001S45_A1185PrdComPr, T001S45_A1184PrdComPor
            }
         }
      );
      Z688PrdComCod = "" ;
      A688PrdComCod = "" ;
      AV41Pgmname = "TPRDCOM" ;
      Z396EmprCod = new app.obtenerempresa(remoteHandle, context).executeUdp( ) ;
      A396EmprCod = new app.obtenerempresa(remoteHandle, context).executeUdp( ) ;
      Z1186PrdPrec = DecimalUtil.ZERO ;
      A1186PrdPrec = DecimalUtil.ZERO ;
   }

   private byte GxWebError ;
   private byte Gx_BScreen ;
   private byte A856ValCod ;
   private byte nKeyPressed ;
   private byte Z856ValCod ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_79 ;
   private short nRcdExists_79 ;
   private short nIsMod_79 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount79 ;
   private short RcdFound79 ;
   private short nBlankRcdUsr79 ;
   private short RcdFound160 ;
   private short nIsDirty_160 ;
   private short nIsDirty_79 ;
   private short gxhchits ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int trnEnded ;
   private int edtPrdComCod_Enabled ;
   private int edtPrdComDsc_Enabled ;
   private int edtPrdComPor_Enabled ;
   private int edtPrdComPr_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdPrec_Enabled ;
   private int edtPrdComFN_Enabled ;
   private int edtValDsc_Enabled ;
   private int edtPrdComVal_Enabled ;
   private int fRowAdded ;
   private int A13882PrdComCan ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_prdnum_Gxcontroltype ;
   private int GX_JID ;
   private int Z13882PrdComCan ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtPrdNum_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal O1185PrdComPr ;
   private java.math.BigDecimal O1184PrdComPor ;
   private java.math.BigDecimal Z1186PrdPrec ;
   private java.math.BigDecimal Z692PrdComVal ;
   private java.math.BigDecimal Z690PrdComFN ;
   private java.math.BigDecimal O692PrdComVal ;
   private java.math.BigDecimal O690PrdComFN ;
   private java.math.BigDecimal A1186PrdPrec ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal A1184PrdComPor ;
   private java.math.BigDecimal A1185PrdComPr ;
   private java.math.BigDecimal B1185PrdComPr ;
   private java.math.BigDecimal B1184PrdComPor ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal s1185PrdComPr ;
   private java.math.BigDecimal s1184PrdComPor ;
   private java.math.BigDecimal A692PrdComVal ;
   private java.math.BigDecimal T692PrdComVal ;
   private java.math.BigDecimal T690PrdComFN ;
   private java.math.BigDecimal Z1185PrdComPr ;
   private java.math.BigDecimal Z1184PrdComPor ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV33PrdComCod ;
   private String Z396EmprCod ;
   private String Z688PrdComCod ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV32EmprCod ;
   private String A688PrdComCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV33PrdComCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_35_idx="0001" ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtPrdComCod_Internalname ;
   private String edtPrdComCod_Jsonclick ;
   private String edtPrdComDsc_Internalname ;
   private String A13884PrdComDsc ;
   private String edtPrdComDsc_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String divTabletotalinfo_Internalname ;
   private String divTabletotalinfo_Class ;
   private String divTotalcomp_Internalname ;
   private String divTotalcomp_Class ;
   private String edtPrdComPor_Internalname ;
   private String edtPrdComPor_Jsonclick ;
   private String divTotalprecio_Internalname ;
   private String divTotalprecio_Class ;
   private String edtPrdComPr_Internalname ;
   private String edtPrdComPr_Jsonclick ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV41Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String sMode79 ;
   private String edtPrdNum_Internalname ;
   private String edtPrdPrec_Internalname ;
   private String edtPrdComFN_Internalname ;
   private String edtValDsc_Internalname ;
   private String edtPrdComVal_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A718PrdNom ;
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
   private String hsh ;
   private String sMode160 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A857ValDsc ;
   private String AV20Station ;
   private String AV37CargaEmprCod ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13884PrdComDsc ;
   private String Z718PrdNom ;
   private String Z857ValDsc ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdPrec_Jsonclick ;
   private String edtPrdComFN_Jsonclick ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdComVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean A13883PrdComEsCo ;
   private boolean A13881PrdEsCompu ;
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
   private boolean n13884PrdComDsc ;
   private boolean returnInSub ;
   private boolean n857ValDsc ;
   private boolean Z13881PrdEsCompu ;
   private String A13747PrdCDsc ;
   private String h688PrdComCod ;
   private String AV39ComboSelectedValue ;
   private String l13747PrdCDsc ;
   private String Zh688PrdComCod ;
   private String Z13747PrdCDsc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T001S7_A13882PrdComCan ;
   private java.math.BigDecimal[] T001S7_A1185PrdComPr ;
   private java.math.BigDecimal[] T001S7_A1184PrdComPor ;
   private String[] T001S12_A13747PrdCDsc ;
   private String[] T001S12_A396EmprCod ;
   private String[] T001S12_A719PrdNum ;
   private String[] T001S11_A13884PrdComDsc ;
   private boolean[] T001S11_n13884PrdComDsc ;
   private String[] T001S14_A719PrdNum ;
   private String[] T001S14_A688PrdComCod ;
   private String[] T001S14_A396EmprCod ;
   private String[] T001S14_A13884PrdComDsc ;
   private boolean[] T001S14_n13884PrdComDsc ;
   private int[] T001S14_A13882PrdComCan ;
   private java.math.BigDecimal[] T001S14_A1185PrdComPr ;
   private java.math.BigDecimal[] T001S14_A1184PrdComPor ;
   private String[] T001S15_A13747PrdCDsc ;
   private String[] T001S15_A396EmprCod ;
   private String[] T001S15_A719PrdNum ;
   private String[] T001S10_A396EmprCod ;
   private String[] T001S16_A396EmprCod ;
   private String[] T001S17_A13884PrdComDsc ;
   private boolean[] T001S17_n13884PrdComDsc ;
   private int[] T001S19_A13882PrdComCan ;
   private java.math.BigDecimal[] T001S19_A1185PrdComPr ;
   private java.math.BigDecimal[] T001S19_A1184PrdComPor ;
   private String[] T001S20_A396EmprCod ;
   private String[] T001S20_A688PrdComCod ;
   private String[] T001S9_A688PrdComCod ;
   private String[] T001S9_A396EmprCod ;
   private String[] T001S21_A396EmprCod ;
   private String[] T001S21_A688PrdComCod ;
   private String[] T001S22_A396EmprCod ;
   private String[] T001S22_A688PrdComCod ;
   private String[] T001S8_A688PrdComCod ;
   private String[] T001S8_A396EmprCod ;
   private String[] T001S25_A13884PrdComDsc ;
   private boolean[] T001S25_n13884PrdComDsc ;
   private int[] T001S27_A13882PrdComCan ;
   private java.math.BigDecimal[] T001S27_A1185PrdComPr ;
   private java.math.BigDecimal[] T001S27_A1184PrdComPor ;
   private String[] T001S28_A396EmprCod ;
   private String[] T001S28_A688PrdComCod ;
   private String[] T001S29_A688PrdComCod ;
   private java.math.BigDecimal[] T001S29_A1186PrdPrec ;
   private java.math.BigDecimal[] T001S29_A692PrdComVal ;
   private String[] T001S29_A718PrdNom ;
   private java.math.BigDecimal[] T001S29_A724PrdPreAct ;
   private java.math.BigDecimal[] T001S29_A690PrdComFN ;
   private String[] T001S29_A857ValDsc ;
   private boolean[] T001S29_n857ValDsc ;
   private String[] T001S29_A396EmprCod ;
   private String[] T001S29_A719PrdNum ;
   private byte[] T001S29_A856ValCod ;
   private String[] T001S4_A718PrdNom ;
   private java.math.BigDecimal[] T001S4_A724PrdPreAct ;
   private byte[] T001S4_A856ValCod ;
   private String[] T001S5_A857ValDsc ;
   private boolean[] T001S5_n857ValDsc ;
   private String[] T001S30_A718PrdNom ;
   private java.math.BigDecimal[] T001S30_A724PrdPreAct ;
   private byte[] T001S30_A856ValCod ;
   private String[] T001S31_A857ValDsc ;
   private boolean[] T001S31_n857ValDsc ;
   private String[] T001S32_A396EmprCod ;
   private String[] T001S32_A719PrdNum ;
   private String[] T001S32_A688PrdComCod ;
   private String[] T001S3_A688PrdComCod ;
   private java.math.BigDecimal[] T001S3_A1186PrdPrec ;
   private java.math.BigDecimal[] T001S3_A692PrdComVal ;
   private java.math.BigDecimal[] T001S3_A690PrdComFN ;
   private String[] T001S3_A396EmprCod ;
   private String[] T001S3_A719PrdNum ;
   private String[] T001S2_A688PrdComCod ;
   private java.math.BigDecimal[] T001S2_A1186PrdPrec ;
   private java.math.BigDecimal[] T001S2_A692PrdComVal ;
   private java.math.BigDecimal[] T001S2_A690PrdComFN ;
   private String[] T001S2_A396EmprCod ;
   private String[] T001S2_A719PrdNum ;
   private String[] T001S36_A718PrdNom ;
   private java.math.BigDecimal[] T001S36_A724PrdPreAct ;
   private byte[] T001S36_A856ValCod ;
   private String[] T001S37_A857ValDsc ;
   private boolean[] T001S37_n857ValDsc ;
   private String[] T001S38_A396EmprCod ;
   private String[] T001S38_A719PrdNum ;
   private String[] T001S38_A688PrdComCod ;
   private String[] T001S39_A13747PrdCDsc ;
   private String[] T001S40_A13747PrdCDsc ;
   private String[] T001S40_A396EmprCod ;
   private String[] T001S40_A719PrdNum ;
   private String[] T001S41_A13747PrdCDsc ;
   private String[] T001S41_A396EmprCod ;
   private String[] T001S41_A719PrdNum ;
   private String[] T001S42_A396EmprCod ;
   private String[] T001S43_A13884PrdComDsc ;
   private boolean[] T001S43_n13884PrdComDsc ;
   private int[] T001S45_A13882PrdComCan ;
   private java.math.BigDecimal[] T001S45_A1185PrdComPr ;
   private java.math.BigDecimal[] T001S45_A1184PrdComPor ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tprdcom__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcom__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcom__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcom__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001S2", "SELECT PrdComCod, PrdPrec, PrdComVal, PrdComFN, EmprCod, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?  FOR UPDATE OF PrdPrec, PrdComVal, PrdComFN NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S3", "SELECT PrdComCod, PrdPrec, PrdComVal, PrdComFN, EmprCod, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S4", "SELECT PrdNom, PrdPreAct, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S5", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S7", "SELECT COALESCE( T1.PrdComCan, 0) AS PrdComCan, COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor FROM (SELECT COUNT(*) AS PrdComCan, EmprCod, PrdComCod, SUM(PrdComVal) AS PrdComPr, SUM(PrdComFN) AS PrdComPor FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S8", "SELECT PrdComCod, EmprCod FROM TXPCPRDCO WHERE EmprCod = ? AND PrdComCod = ?  FOR UPDATE OF PrdComCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S9", "SELECT PrdComCod, EmprCod FROM TXPCPRDCO WHERE EmprCod = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S10", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S11", "SELECT COALESCE( PrdNom, '') AS PrdComDsc FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S12", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') AND (PrdNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S14", "SELECT /*+ FIRST_ROWS(100) */ T2.PrdNum, TM1.PrdComCod, TM1.EmprCod, COALESCE( T2.PrdNom, '') AS PrdComDsc, COALESCE( T3.PrdComCan, 0) AS PrdComCan, COALESCE( T3.PrdComPr, 0) AS PrdComPr, COALESCE( T3.PrdComPor, 0) AS PrdComPor FROM ((TXPCPRDCO TM1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdComCod) LEFT JOIN (SELECT COUNT(*) AS PrdComCan, EmprCod, PrdComCod, SUM(PrdComVal) AS PrdComPr, SUM(PrdComFN) AS PrdComPor FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdComCod = TM1.PrdComCod) WHERE TM1.EmprCod = ? and TM1.PrdComCod = ? ORDER BY TM1.EmprCod, TM1.PrdComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S15", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') AND (PrdNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S16", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S17", "SELECT COALESCE( PrdNom, '') AS PrdComDsc FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S19", "SELECT COALESCE( T1.PrdComCan, 0) AS PrdComCan, COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor FROM (SELECT COUNT(*) AS PrdComCan, EmprCod, PrdComCod, SUM(PrdComVal) AS PrdComPr, SUM(PrdComFN) AS PrdComPor FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdComCod FROM TXPCPRDCO WHERE EmprCod = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdComCod FROM TXPCPRDCO WHERE ( EmprCod > ? or EmprCod = ? and PrdComCod > ?) ORDER BY EmprCod, PrdComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001S22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdComCod FROM TXPCPRDCO WHERE ( EmprCod < ? or EmprCod = ? and PrdComCod < ?) ORDER BY EmprCod DESC, PrdComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001S23", "INSERT INTO TXPCPRDCO(PrdComCod, EmprCod) VALUES(?, ?)", GX_NOMASK, "TXPCPRDCO")
         ,new UpdateCursor("T001S24", "DELETE FROM TXPCPRDCO  WHERE EmprCod = ? AND PrdComCod = ?", GX_NOMASK, "TXPCPRDCO")
         ,new ForEachCursor("T001S25", "SELECT COALESCE( PrdNom, '') AS PrdComDsc FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S27", "SELECT COALESCE( T1.PrdComCan, 0) AS PrdComCan, COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor FROM (SELECT COUNT(*) AS PrdComCan, EmprCod, PrdComCod, SUM(PrdComVal) AS PrdComPr, SUM(PrdComFN) AS PrdComPor FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdComCod FROM TXPCPRDCO ORDER BY EmprCod, PrdComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S29", "SELECT T1.PrdComCod, T1.PrdPrec, T1.PrdComVal, T2.PrdNom, T2.PrdPreAct, T1.PrdComFN, T3.ValDsc, T1.EmprCod, T1.PrdNum, T2.ValCod FROM ((TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod = T2.ValCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.PrdComCod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdComCod ",true, GX_NOMASK, false, this,4, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S30", "SELECT PrdNom, PrdPreAct, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S31", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S32", "SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T001S33", "INSERT INTO TXPLPRDCO(PrdComCod, PrdPrec, PrdComVal, PrdComFN, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPRDCO")
         ,new UpdateCursor("T001S34", "UPDATE TXPLPRDCO SET PrdPrec=?, PrdComVal=?, PrdComFN=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?", GX_NOMASK, "TXPLPRDCO")
         ,new UpdateCursor("T001S35", "DELETE FROM TXPLPRDCO  WHERE EmprCod = ? AND PrdNum = ? AND PrdComCod = ?", GX_NOMASK, "TXPLPRDCO")
         ,new ForEachCursor("T001S36", "SELECT PrdNom, PrdPreAct, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S37", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S38", "SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdNum, PrdComCod ",true, GX_NOMASK, false, this,4, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S39", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) AND (SUBSTR(PrdNum, 1, 1) = '0')) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S40", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S41", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (EmprCod = ?) AND (SUBSTR(PrdNum, 1, 1) = '0') ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S42", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S43", "SELECT COALESCE( PrdNom, '') AS PrdComDsc FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001S45", "SELECT COALESCE( T1.PrdComCan, 0) AS PrdComCan, COALESCE( T1.PrdComPr, 0) AS PrdComPr, COALESCE( T1.PrdComPor, 0) AS PrdComPor FROM (SELECT COUNT(*) AS PrdComCan, EmprCod, PrdComCod, SUM(PrdComVal) AS PrdComPr, SUM(PrdComFN) AS PrdComPor FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T1 WHERE T1.EmprCod = ? AND T1.PrdComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 28 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 34 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

