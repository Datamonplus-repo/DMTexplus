package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbaragr_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"BARMAQCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgabarmaqcod090( A396EmprCod, A13734MaqCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod090( A396EmprCod, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"BARMAQCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgabarmaqcod090( A396EmprCod, A13734MaqCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"BARMAQCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         h180BarMaqCod = httpContext.GetPar( "h180BarMaqCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcabarmaqcod0912( A396EmprCod, h180BarMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod090( A396EmprCod, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         h252CliCod = httpContext.GetPar( "h252CliCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaclicod0912( A396EmprCod, h252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A129BarCod, A132BarCodReo, A130BarCodPar, A180BarMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A401EmprCodVi = httpContext.GetPar( "EmprCodVi") ;
         httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A401EmprCodVi, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AGRUPACION HOJAS RUTA TINTE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarDisNum_Internalname ;
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
      nRC_GXsfl_101 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_101"))) ;
      nGXsfl_101_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_101_idx"))) ;
      sGXsfl_101_idx = httpContext.GetPar( "sGXsfl_101_idx") ;
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

   public tbaragr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbaragr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbaragr_impl.class ));
   }

   public tbaragr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarDisNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarDisNum_Internalname, httpContext.getMessage( "Disp Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrCant_Internalname, httpContext.getMessage( "Total Agrp", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrCant_Internalname, GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrCant_Enabled!=0) ? localUtil.format( A13846BarAgrCant, "ZZZ,ZZ9.99") : localUtil.format( A13846BarAgrCant, "ZZZ,ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrCant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAgrCant_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Cantidad", "right", false, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablacabecera_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabladatoshdr_Internalname, tblTabladatoshdr_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcod_Internalname, httpContext.getMessage( "Nro. HDR", ""), "", "", lblTextblockbarcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcodreo_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcodreo_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblockbarcodreo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcodpar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcodpar_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblockbarcodpar_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarmaqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockbarmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMaqCod_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, h180BarMaqCod, GXutil.rtrim( localUtil.format( h180BarMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarvolmaq_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarvolmaq_Internalname, httpContext.getMessage( "Volumen", ""), "", "", lblTextblockbarvolmaq_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarVolMaq_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarVolMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarVolMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarVolMaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarVolMaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divTabladatosadicionales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( " Número", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAGR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodVi_Internalname, GXutil.rtrim( A401EmprCodVi), GXutil.rtrim( localUtil.format( A401EmprCodVi, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodVi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCodVi_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMed_Internalname, GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A479FindVolMed), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A479FindVolMed), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFindVolMed_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFindVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMax_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFindVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol101( ) ;
      nGXsfl_101_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount13 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_13 = (short)(1) ;
            scanStart0913( ) ;
            while ( RcdFound13 != 0 )
            {
               init_level_properties13( ) ;
               getByPrimaryKey0913( ) ;
               addRow0913( ) ;
               scanNext0913( ) ;
            }
            scanEnd0913( ) ;
            nBlankRcdCount13 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13846BarAgrCant = A13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         standaloneNotModal0913( ) ;
         standaloneModal0913( ) ;
         sMode13 = Gx_mode ;
         while ( nGXsfl_101_idx < nRC_GXsfl_101 )
         {
            bGXsfl_101_Refreshing = true ;
            readRow0913( ) ;
            edtBarAgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRCOD_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRREO_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPAR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtCliCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICODAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRSER_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtColNomAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOMAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtColNumAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUMAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRKGM_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRMTR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPIE_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNDES_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarPNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPNDES_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtFindDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDDES_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtFindBarAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDBARAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtKgmAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KGMAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtPieAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtMtrAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDSC_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtDisCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCODAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtColNoCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOCAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtColNuCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUCAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrDNu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDNU_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAGrHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRHDR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            edtBarAgrNhdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNHDR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
            if ( ( nRcdExists_13 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0913( ) ;
            }
            sendRow0913( ) ;
            bGXsfl_101_Refreshing = false ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13846BarAgrCant = B13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount13 = (short)(5) ;
         nRcdExists_13 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0913( ) ;
            while ( RcdFound13 != 0 )
            {
               sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_10113( ) ;
               init_level_properties13( ) ;
               standaloneNotModal0913( ) ;
               getByPrimaryKey0913( ) ;
               standaloneModal0913( ) ;
               addRow0913( ) ;
               scanNext0913( ) ;
            }
            scanEnd0913( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode13 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_10113( ) ;
      initAll0913( ) ;
      init_level_properties13( ) ;
      B13846BarAgrCant = A13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      nRcdExists_13 = (short)(0) ;
      nIsMod_13 = (short)(0) ;
      nRcdDeleted_13 = (short)(0) ;
      nBlankRcdCount13 = (short)(nBlankRcdUsr13+nBlankRcdCount13) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount13 > 0 )
      {
         standaloneNotModal0913( ) ;
         standaloneModal0913( ) ;
         addRow0913( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarAgrCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount13 = (short)(nBlankRcdCount13-1) ;
      }
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13846BarAgrCant = B13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
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
      e11092 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( "Z236BarVolMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
            Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
            Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            O13846BarAgrCant = localUtil.ctond( httpContext.cgiGet( "O13846BarAgrCant")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_101 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_101"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "GXHCBARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
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
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A13846BarAgrCant = localUtil.ctond( httpContext.cgiGet( edtBarAgrCant_Internalname)) ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            h180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARVOLMAQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarVolMaq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A236BarVolMaq = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            }
            else
            {
               A236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            }
            h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A136BarColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            }
            else
            {
               A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            }
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A401EmprCodVi = GXutil.upper( httpContext.cgiGet( edtEmprCodVi_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A213BarSit = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            else
            {
               A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A479FindVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
            A478FindVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBARAGR");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbaragr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
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
                        e11092 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12092 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         e12092 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0912( ) ;
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
      if ( isIns( ) )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtntrn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
      }
      disableAttributes0912( ) ;
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

   public void confirm_0913( )
   {
      s13846BarAgrCant = O13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      nGXsfl_101_idx = 0 ;
      while ( nGXsfl_101_idx < nRC_GXsfl_101 )
      {
         readRow0913( ) ;
         if ( ( nRcdExists_13 != 0 ) || ( nIsMod_13 != 0 ) )
         {
            getKey0913( ) ;
            if ( ( nRcdExists_13 == 0 ) && ( nRcdDeleted_13 == 0 ) )
            {
               if ( RcdFound13 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0913( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0913( ) ;
                     closeExtendedTableCursors0913( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13846BarAgrCant = A13846BarAgrCant ;
                     n13846BarAgrCant = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "BARAGRCOD_" + sGXsfl_101_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarAgrCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound13 != 0 )
               {
                  if ( nRcdDeleted_13 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0913( ) ;
                     load0913( ) ;
                     beforeValidate0913( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0913( ) ;
                        O13846BarAgrCant = A13846BarAgrCant ;
                        n13846BarAgrCant = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_13 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0913( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0913( ) ;
                           closeExtendedTableCursors0913( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13846BarAgrCant = A13846BarAgrCant ;
                           n13846BarAgrCant = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_13 == 0 )
                  {
                     GXCCtl = "BARAGRCOD_" + sGXsfl_101_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAgrCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPar_Internalname, GXutil.rtrim( A122BarAgrPar)) ;
         httpContext.changePostValue( edtCliCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrSer_Internalname, GXutil.rtrim( A1245BarAgrSer)) ;
         httpContext.changePostValue( edtColNomAgr_Internalname, GXutil.rtrim( A1510ColNomAgr)) ;
         httpContext.changePostValue( edtColNumAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFindDes_Internalname, GXutil.rtrim( A1653FindDes)) ;
         httpContext.changePostValue( edtFindBarAgr_Internalname, GXutil.rtrim( A474FindBarAgr)) ;
         httpContext.changePostValue( edtKgmAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrDsc_Internalname, GXutil.rtrim( A1507BarAgrDsc)) ;
         httpContext.changePostValue( edtDisCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColNoCAgr_Internalname, GXutil.rtrim( A1509ColNoCAgr)) ;
         httpContext.changePostValue( edtColNuCAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrDNu_Internalname, GXutil.rtrim( A1649BarAgrDNu)) ;
         httpContext.changePostValue( edtBarAGrHdr_Internalname, GXutil.rtrim( A13695BarAGrHdr)) ;
         httpContext.changePostValue( edtBarAgrNhdr_Internalname, GXutil.rtrim( A13792BarAgrNhdr)) ;
         httpContext.changePostValue( "ZT_"+"Z119BarAgrCod_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z124BarAgrReo_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z122BarAgrPar_"+sGXsfl_101_idx, GXutil.rtrim( Z122BarAgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z590KgmAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z671PieAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z869MtrAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_101_idx, GXutil.rtrim( Z1245BarAgrSer)) ;
         httpContext.changePostValue( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_101_idx, GXutil.rtrim( Z1507BarAgrDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_101_idx, GXutil.rtrim( Z1510ColNomAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_101_idx, GXutil.rtrim( Z1509ColNoCAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_101_idx, GXutil.rtrim( Z1649BarAgrDNu)) ;
         httpContext.changePostValue( "nRcdDeleted_13_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_13_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_13_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_13 != 0 )
         {
            httpContext.changePostValue( "BARAGRCOD_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRREO_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPAR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICODAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRSER_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRKGM_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRMTR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPIE_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPNDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDBARAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KGMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDSC_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCODAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOCAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUCAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDNU_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRHDR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNHDR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13846BarAgrCant = s13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption090( )
   {
   }

   public void e11092( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char1 = AV36LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36LitFe", AV36LitFe);
      GXt_char1 = AV21Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1093_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char1 = AV23Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN506_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char1 = AV24Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN438_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char1 = AV25Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      GXt_char1 = AV26Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char1 = AV27Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit7", AV27Lit7);
      GXt_char1 = AV30Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1147_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char1 = AV37Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit11", AV37Lit11);
      GXt_char1 = AV38Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit12", AV38Lit12);
      GXt_char1 = AV39Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit13", AV39Lit13);
      GXt_char1 = AV40Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit14", AV40Lit14);
      GXt_char1 = AV41Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit15", AV41Lit15);
      GXt_char1 = AV42Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit16", AV42Lit16);
      GXt_char1 = AV43Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lit17", AV43Lit17);
      GXt_char1 = AV44Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1162_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lit18", AV44Lit18);
      GXt_char1 = AV59Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Lit19", AV59Lit19);
      GXt_char1 = AV62Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Lit20 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Lit20", AV62Lit20);
      GXt_char1 = AV63Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Lit21 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Lit21", AV63Lit21);
      GXt_char1 = AV66Lit22 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1054_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Lit22 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Lit22", AV66Lit22);
      GXt_char1 = AV31msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31msg0", AV31msg0);
      GXt_char1 = AV32msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG232_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32msg1", AV32msg1);
      GXt_char1 = AV33msg2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG229_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33msg2", AV33msg2);
      GXt_char1 = AV34msg3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34msg3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34msg3", AV34msg3);
      GXt_char1 = AV35msg4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35msg4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35msg4", AV35msg4);
      GXt_char1 = AV67msg5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR304_", ""), (byte)(99), GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67msg5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67msg5", AV67msg5);
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tbaragr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV75BuscarEmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbaragr_impl.this.AV75BuscarEmprCod = GXv_char2[0] ;
      tbaragr_impl.this.AV16EmprNom = GXv_char3[0] ;
      tbaragr_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75BuscarEmprCod", AV75BuscarEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV46PlusUltra ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "AEPU", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV46PlusUltra = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46PlusUltra", GXutil.str( AV46PlusUltra, 1, 0));
      GXt_int5 = AV47Kohler ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV47Kohler = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Kohler", GXutil.str( AV47Kohler, 1, 0));
      GXt_int5 = AV48Vincolor ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV48Vincolor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Vincolor", GXutil.str( AV48Vincolor, 1, 0));
      AV49FlagMAgr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49FlagMAgr", GXutil.str( AV49FlagMAgr, 1, 0));
      AV53FlagEli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53FlagEli", GXutil.str( AV53FlagEli, 1, 0));
      GXt_int5 = AV54FasMin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV54FasMin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54FasMin", GXutil.str( AV54FasMin, 1, 0));
      GXt_int5 = AV55Wckgcol ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "WCHGCO", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV55Wckgcol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Wckgcol", GXutil.str( AV55Wckgcol, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55Wckgcol), "9")));
      GXt_int5 = AV64AgrCol ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "AGRCOL", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV64AgrCol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64AgrCol", GXutil.str( AV64AgrCol, 1, 0));
      GXt_int5 = AV72Lindalana ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV72Lindalana = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Lindalana", GXutil.str( AV72Lindalana, 1, 0));
      GXt_int5 = AV73Eliot ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV75BuscarEmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      tbaragr_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73Eliot = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Eliot", GXutil.str( AV73Eliot, 1, 0));
   }

   public void e12092( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( AV55Wckgcol == 1 ) && ( AV74DelAll == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         new app.pctrcolagr(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3) ;
         tbaragr_impl.this.A396EmprCod = GXv_char4[0] ;
         tbaragr_impl.this.A129BarCod = GXv_int7[0] ;
         tbaragr_impl.this.A132BarCodReo = GXv_int6[0] ;
         tbaragr_impl.this.A130BarCodPar = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( 0 > 1 )
      {
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm0912( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T00099_A361DisCod[0] ;
            Z2759BarMaqGru = T00099_A2759BarMaqGru[0] ;
            Z143BarDisNum = T00099_A143BarDisNum[0] ;
            Z120BarAgrEst = T00099_A120BarAgrEst[0] ;
            Z180BarMaqCod = T00099_A180BarMaqCod[0] ;
            Z236BarVolMaq = T00099_A236BarVolMaq[0] ;
            Z213BarSit = T00099_A213BarSit[0] ;
            Z212BarSer = T00099_A212BarSer[0] ;
            Z135BarColNom = T00099_A135BarColNom[0] ;
            Z136BarColNum = T00099_A136BarColNum[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z143BarDisNum = A143BarDisNum ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z236BarVolMaq = A236BarVolMaq ;
            Z213BarSit = A213BarSit ;
            Z212BarSer = A212BarSer ;
            Z135BarColNom = A135BarColNom ;
            Z136BarColNum = A136BarColNum ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z143BarDisNum = A143BarDisNum ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z236BarVolMaq = A236BarVolMaq ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13846BarAgrCant = A13846BarAgrCant ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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
   }

   public void load0912( )
   {
      /* Using cursor T000917 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T000917_A361DisCod[0] ;
         A2759BarMaqGru = T000917_A2759BarMaqGru[0] ;
         A407EmprNom = T000917_A407EmprNom[0] ;
         n407EmprNom = T000917_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A143BarDisNum = T000917_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A120BarAgrEst = T000917_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A180BarMaqCod = T000917_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = T000917_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A213BarSit = T000917_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A252CliCod = T000917_A252CliCod[0] ;
         n252CliCod = T000917_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A212BarSer = T000917_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T000917_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T000917_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A365DisDes = T000917_A365DisDes[0] ;
         A13846BarAgrCant = T000917_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T000917_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         zm0912( -23) ;
      }
      pr_default.close(11);
      onLoadActions0912( ) ;
   }

   public void onLoadActions0912( )
   {
      O13846BarAgrCant = A13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      /* Using cursor T000911 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T000911_A252CliCod[0] ;
      n252CliCod = T000911_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T000911_A365DisDes[0] ;
      pr_default.close(8);
      A401EmprCodVi = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      /* Using cursor T000913 */
      pr_default.execute(9, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A478FindVolMax = T000913_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T000913_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T000913_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(9);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      /* Using cursor T000918 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A180BarMaqCod});
      h180BarMaqCod = "" ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         h180BarMaqCod = T000918_A13734MaqCDsc[0] ;
         if (true) break;
      }
      pr_default.close(12);
      httpContext.ajax_rsp_assign_attri("", false, "h180BarMaqCod", h180BarMaqCod);
      /* Using cursor T000919 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      h252CliCod = "" ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         h252CliCod = T000919_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(13);
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
   }

   public void checkExtendedTable0912( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_12 = (short)(1) ;
         A252CliCod = 0 ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T000920 */
         pr_default.execute(14, new Object[] {A13735CliCNom, Boolean.valueOf(n396EmprCod), A396EmprCod});
         A396EmprCod = T000920_A396EmprCod[0] ;
         n396EmprCod = T000920_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T000920_A252CliCod[0] ;
         n252CliCod = T000920_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T000920_A252CliCod[0] ;
         n252CliCod = T000920_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T000910 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T000910_A407EmprNom[0] ;
      n407EmprNom = T000910_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T000911 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T000911_A252CliCod[0] ;
      n252CliCod = T000911_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T000911_A365DisDes[0] ;
      pr_default.close(8);
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_12 = (short)(1) ;
         A252CliCod = 0 ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T000921 */
         pr_default.execute(15, new Object[] {A13735CliCNom, Boolean.valueOf(n396EmprCod), A396EmprCod});
         A396EmprCod = T000921_A396EmprCod[0] ;
         n396EmprCod = T000921_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T000921_A252CliCod[0] ;
         n252CliCod = T000921_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T000921_A252CliCod[0] ;
         n252CliCod = T000921_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      nIsDirty_12 = (short)(1) ;
      A401EmprCodVi = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      /* Using cursor T000913 */
      pr_default.execute(9, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A478FindVolMax = T000913_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T000913_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T000913_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         nIsDirty_12 = (short)(1) ;
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         nIsDirty_12 = (short)(1) ;
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(9);
      /* Using cursor T000915 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A13846BarAgrCant = T000915_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T000915_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      pr_default.close(10);
      nIsDirty_12 = (short)(1) ;
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
   }

   public void closeExtendedTableCursors0912( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_24( String A396EmprCod )
   {
      /* Using cursor T000922 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T000922_A407EmprNom[0] ;
      n407EmprNom = T000922_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_25( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T000923 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T000923_A252CliCod[0] ;
      n252CliCod = T000923_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T000923_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_26( int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A180BarMaqCod )
   {
      /* Using cursor T000925 */
      pr_default.execute(18, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A478FindVolMax = T000925_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T000925_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T000925_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_27( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T000927 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A13846BarAgrCant = T000927_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T000927_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey0912( )
   {
      /* Using cursor T000928 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00099 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm0912( 23) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T00099_A361DisCod[0] ;
         A2759BarMaqGru = T00099_A2759BarMaqGru[0] ;
         A129BarCod = T00099_A129BarCod[0] ;
         n129BarCod = T00099_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00099_A132BarCodReo[0] ;
         n132BarCodReo = T00099_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00099_A130BarCodPar[0] ;
         n130BarCodPar = T00099_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A143BarDisNum = T00099_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A120BarAgrEst = T00099_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A180BarMaqCod = T00099_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = T00099_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A213BarSit = T00099_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T00099_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T00099_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T00099_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A396EmprCod = T00099_A396EmprCod[0] ;
         n396EmprCod = T00099_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0912( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey0912( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0912( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey0912( ) ;
      if ( RcdFound12 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000929 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000929_A129BarCod[0] < A129BarCod ) || ( T000929_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000929_A132BarCodReo[0] < A132BarCodReo ) || ( T000929_A132BarCodReo[0] == A132BarCodReo ) && ( T000929_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T000929_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000929_A129BarCod[0] > A129BarCod ) || ( T000929_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000929_A132BarCodReo[0] > A132BarCodReo ) || ( T000929_A132BarCodReo[0] == A132BarCodReo ) && ( T000929_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000929_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T000929_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T000929_A396EmprCod[0] ;
            n396EmprCod = T000929_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T000929_A129BarCod[0] ;
            n129BarCod = T000929_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T000929_A132BarCodReo[0] ;
            n132BarCodReo = T000929_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T000929_A130BarCodPar[0] ;
            n130BarCodPar = T000929_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000930 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000930_A129BarCod[0] > A129BarCod ) || ( T000930_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000930_A132BarCodReo[0] > A132BarCodReo ) || ( T000930_A132BarCodReo[0] == A132BarCodReo ) && ( T000930_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T000930_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000930_A129BarCod[0] < A129BarCod ) || ( T000930_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000930_A132BarCodReo[0] < A132BarCodReo ) || ( T000930_A132BarCodReo[0] == A132BarCodReo ) && ( T000930_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T000930_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T000930_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T000930_A396EmprCod[0] ;
            n396EmprCod = T000930_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T000930_A129BarCod[0] ;
            n129BarCod = T000930_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T000930_A132BarCodReo[0] ;
            n132BarCodReo = T000930_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T000930_A130BarCodPar[0] ;
            n130BarCodPar = T000930_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0912( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13846BarAgrCant = O13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         GX_FocusControl = edtBarDisNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0912( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarDisNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               update0912( ) ;
               GX_FocusControl = edtBarDisNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               GX_FocusControl = edtBarDisNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0912( ) ;
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
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A13846BarAgrCant = O13846BarAgrCant ;
                  n13846BarAgrCant = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                  GX_FocusControl = edtBarDisNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0912( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13846BarAgrCant = O13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarDisNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0912( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0912( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0912( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext0912( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0912( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0912( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = h252CliCod ;
            /* Using cursor T000931 */
            pr_default.execute(23, new Object[] {A13735CliCNom, Boolean.valueOf(n396EmprCod), A396EmprCod});
            A396EmprCod = T000931_A396EmprCod[0] ;
            n396EmprCod = T000931_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T000931_A252CliCod[0] ;
            n252CliCod = T000931_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = T000931_A252CliCod[0] ;
            n252CliCod = T000931_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               pr_default.readNext(23);
               if ( ! ( (pr_default.getStatus(23) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
            }
            pr_default.close(23);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00098 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( Z361DisCod != T00098_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T00098_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z143BarDisNum, T00098_A143BarDisNum[0]) != 0 ) || ( GXutil.strcmp(Z120BarAgrEst, T00098_A120BarAgrEst[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T00098_A180BarMaqCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z236BarVolMaq != T00098_A236BarVolMaq[0] ) || ( Z213BarSit != T00098_A213BarSit[0] ) || ( GXutil.strcmp(Z212BarSer, T00098_A212BarSer[0]) != 0 ) || ( GXutil.strcmp(Z135BarColNom, T00098_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T00098_A136BarColNum[0] ) )
         {
            if ( Z361DisCod != T00098_A361DisCod[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T00098_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T00098_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T00098_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z143BarDisNum, T00098_A143BarDisNum[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarDisNum");
               GXutil.writeLogRaw("Old: ",Z143BarDisNum);
               GXutil.writeLogRaw("Current: ",T00098_A143BarDisNum[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T00098_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T00098_A120BarAgrEst[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T00098_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T00098_A180BarMaqCod[0]);
            }
            if ( Z236BarVolMaq != T00098_A236BarVolMaq[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarVolMaq");
               GXutil.writeLogRaw("Old: ",Z236BarVolMaq);
               GXutil.writeLogRaw("Current: ",T00098_A236BarVolMaq[0]);
            }
            if ( Z213BarSit != T00098_A213BarSit[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T00098_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T00098_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T00098_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T00098_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T00098_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T00098_A136BarColNum[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T00098_A136BarColNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0912( )
   {
      beforeValidate0912( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0912( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0912( 0) ;
         checkOptimisticConcurrency0912( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0912( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0912( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000932 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A143BarDisNum, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Byte.valueOf(A213BarSit), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(24) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN10912( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0912( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption090( ) ;
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
            load0912( ) ;
         }
         endLevel0912( ) ;
      }
      closeExtendedTableCursors0912( ) ;
   }

   public void update0912( )
   {
      beforeValidate0912( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0912( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0912( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0912( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0912( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000933 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A143BarDisNum, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Byte.valueOf(A213BarSit), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(25) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0912( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int7[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3) ;
                     tbaragr_impl.this.A396EmprCod = GXv_char4[0] ;
                     tbaragr_impl.this.A129BarCod = GXv_int7[0] ;
                     tbaragr_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tbaragr_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN10912( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0912( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption090( ) ;
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
         endLevel0912( ) ;
      }
      closeExtendedTableCursors0912( ) ;
   }

   public void deferredUpdate0912( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0912( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0912( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0912( ) ;
         afterConfirm0912( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0912( ) ;
            if ( AnyError == 0 )
            {
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               scanStart0913( ) ;
               while ( RcdFound13 != 0 )
               {
                  getByPrimaryKey0913( ) ;
                  delete0913( ) ;
                  scanNext0913( ) ;
                  O13846BarAgrCant = A13846BarAgrCant ;
                  n13846BarAgrCant = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               }
               scanEnd0913( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000934 */
                  pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN10912( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll0912( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaption090( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0912( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0912( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000935 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T000935_A407EmprNom[0] ;
         n407EmprNom = T000935_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(27);
         A401EmprCodVi = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
         /* Using cursor T000937 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A13846BarAgrCant = T000937_A13846BarAgrCant[0] ;
            n13846BarAgrCant = T000937_n13846BarAgrCant[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         else
         {
            A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         pr_default.close(28);
         /* Using cursor T000939 */
         pr_default.execute(29, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A478FindVolMax = T000939_A478FindVolMax[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A479FindVolMed = T000939_A479FindVolMed[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = T000939_A480FindVolMin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
         }
         else
         {
            A478FindVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A479FindVolMed = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
         }
         pr_default.close(29);
         /* Using cursor T000940 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T000940_A252CliCod[0] ;
         n252CliCod = T000940_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A365DisDes = T000940_A365DisDes[0] ;
         pr_default.close(30);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000941 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000942 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000943 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T000944 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T000945 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T000946 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T000947 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T000948 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T000949 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T000950 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T000951 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T000952 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T000953 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T000954 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T000955 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T000956 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T000957 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T000958 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T000959 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T000960 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T000961 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T000962 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T000963 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T000964 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T000965 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T000966 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T000967 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T000968 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T000969 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T000970 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T000971 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T000972 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T000973 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T000974 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T000975 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T000976 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T000977 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T000978 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T000979 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T000980 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T000981 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T000982 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T000983 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T000984 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T000985 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T000986 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T000987 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T000988 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T000989 */
         pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T000990 */
         pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T000991 */
         pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T000992 */
         pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T000993 */
         pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T000994 */
         pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T000995 */
         pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T000996 */
         pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T000997 */
         pr_default.execute(87, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T000998 */
         pr_default.execute(88, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T000999 */
         pr_default.execute(89, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T0009100 */
         pr_default.execute(90, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T0009101 */
         pr_default.execute(91, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T0009102 */
         pr_default.execute(92, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
      }
   }

   public void processNestedLevel0913( )
   {
      s13846BarAgrCant = O13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      nGXsfl_101_idx = 0 ;
      while ( nGXsfl_101_idx < nRC_GXsfl_101 )
      {
         readRow0913( ) ;
         if ( ( nRcdExists_13 != 0 ) || ( nIsMod_13 != 0 ) )
         {
            standaloneNotModal0913( ) ;
            getKey0913( ) ;
            if ( ( nRcdExists_13 == 0 ) && ( nRcdDeleted_13 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0913( ) ;
            }
            else
            {
               if ( RcdFound13 != 0 )
               {
                  if ( ( nRcdDeleted_13 != 0 ) && ( nRcdExists_13 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0913( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_13 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0913( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_13 == 0 )
                  {
                     GXCCtl = "BARAGRCOD_" + sGXsfl_101_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAgrCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13846BarAgrCant = A13846BarAgrCant ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         httpContext.changePostValue( edtBarAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPar_Internalname, GXutil.rtrim( A122BarAgrPar)) ;
         httpContext.changePostValue( edtCliCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrSer_Internalname, GXutil.rtrim( A1245BarAgrSer)) ;
         httpContext.changePostValue( edtColNomAgr_Internalname, GXutil.rtrim( A1510ColNomAgr)) ;
         httpContext.changePostValue( edtColNumAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFindDes_Internalname, GXutil.rtrim( A1653FindDes)) ;
         httpContext.changePostValue( edtFindBarAgr_Internalname, GXutil.rtrim( A474FindBarAgr)) ;
         httpContext.changePostValue( edtKgmAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrDsc_Internalname, GXutil.rtrim( A1507BarAgrDsc)) ;
         httpContext.changePostValue( edtDisCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColNoCAgr_Internalname, GXutil.rtrim( A1509ColNoCAgr)) ;
         httpContext.changePostValue( edtColNuCAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrDNu_Internalname, GXutil.rtrim( A1649BarAgrDNu)) ;
         httpContext.changePostValue( edtBarAGrHdr_Internalname, GXutil.rtrim( A13695BarAGrHdr)) ;
         httpContext.changePostValue( edtBarAgrNhdr_Internalname, GXutil.rtrim( A13792BarAgrNhdr)) ;
         httpContext.changePostValue( "ZT_"+"Z119BarAgrCod_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z124BarAgrReo_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z122BarAgrPar_"+sGXsfl_101_idx, GXutil.rtrim( Z122BarAgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z590KgmAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z671PieAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z869MtrAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_101_idx, GXutil.rtrim( Z1245BarAgrSer)) ;
         httpContext.changePostValue( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_101_idx, GXutil.rtrim( Z1507BarAgrDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_101_idx, GXutil.rtrim( Z1510ColNomAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_101_idx, GXutil.rtrim( Z1509ColNoCAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_101_idx, GXutil.rtrim( Z1649BarAgrDNu)) ;
         httpContext.changePostValue( "nRcdDeleted_13_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_13_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_13_"+sGXsfl_101_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_13 != 0 )
         {
            httpContext.changePostValue( "BARAGRCOD_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRREO_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPAR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICODAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRSER_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRKGM_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRMTR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPIE_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPNDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDBARAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KGMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDSC_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCODAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOCAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUCAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDNU_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRHDR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNHDR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0913( ) ;
      if ( AnyError != 0 )
      {
         O13846BarAgrCant = s13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      nRcdExists_13 = (short)(0) ;
      nIsMod_13 = (short)(0) ;
      nRcdDeleted_13 = (short)(0) ;
   }

   public void processLevel0912( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel0913( ) ;
      if ( AnyError != 0 )
      {
         O13846BarAgrCant = s13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN10912( )
   {
      /* Using cursor T0009103 */
      pr_default.execute(93, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel0912( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0912( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbaragr");
         if ( AnyError == 0 )
         {
            confirmValues090( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbaragr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0912( )
   {
      /* Scan By routine */
      /* Using cursor T0009104 */
      pr_default.execute(94);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T0009104_A396EmprCod[0] ;
         n396EmprCod = T0009104_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T0009104_A129BarCod[0] ;
         n129BarCod = T0009104_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T0009104_A132BarCodReo[0] ;
         n132BarCodReo = T0009104_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T0009104_A130BarCodPar[0] ;
         n130BarCodPar = T0009104_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0912( )
   {
      /* Scan next routine */
      pr_default.readNext(94);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T0009104_A396EmprCod[0] ;
         n396EmprCod = T0009104_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T0009104_A129BarCod[0] ;
         n129BarCod = T0009104_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T0009104_A132BarCodReo[0] ;
         n132BarCodReo = T0009104_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T0009104_A130BarCodPar[0] ;
         n130BarCodPar = T0009104_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd0912( )
   {
      pr_default.close(94);
   }

   public void afterConfirm0912( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0912( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0912( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0912( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0912( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0912( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0912( )
   {
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtBarAgrCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCant_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmprCodVi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodVi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodVi_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtFindVolMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMed_Enabled), 5, 0), true);
      edtFindVolMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMin_Enabled), 5, 0), true);
      edtFindVolMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMax_Enabled), 5, 0), true);
   }

   public void zm0913( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z590KgmAgr = T00093_A590KgmAgr[0] ;
            Z671PieAgr = T00093_A671PieAgr[0] ;
            Z869MtrAgr = T00093_A869MtrAgr[0] ;
            Z1245BarAgrSer = T00093_A1245BarAgrSer[0] ;
            Z1507BarAgrDsc = T00093_A1507BarAgrDsc[0] ;
            Z1508CliCodAgr = T00093_A1508CliCodAgr[0] ;
            Z1513DisCodAgr = T00093_A1513DisCodAgr[0] ;
            Z1510ColNomAgr = T00093_A1510ColNomAgr[0] ;
            Z1512ColNumAgr = T00093_A1512ColNumAgr[0] ;
            Z1509ColNoCAgr = T00093_A1509ColNoCAgr[0] ;
            Z1511ColNuCAgr = T00093_A1511ColNuCAgr[0] ;
            Z1649BarAgrDNu = T00093_A1649BarAgrDNu[0] ;
         }
         else
         {
            Z590KgmAgr = A590KgmAgr ;
            Z671PieAgr = A671PieAgr ;
            Z869MtrAgr = A869MtrAgr ;
            Z1245BarAgrSer = A1245BarAgrSer ;
            Z1507BarAgrDsc = A1507BarAgrDsc ;
            Z1508CliCodAgr = A1508CliCodAgr ;
            Z1513DisCodAgr = A1513DisCodAgr ;
            Z1510ColNomAgr = A1510ColNomAgr ;
            Z1512ColNumAgr = A1512ColNumAgr ;
            Z1509ColNoCAgr = A1509ColNoCAgr ;
            Z1511ColNuCAgr = A1511ColNuCAgr ;
            Z1649BarAgrDNu = A1649BarAgrDNu ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z119BarAgrCod = A119BarAgrCod ;
         Z124BarAgrReo = A124BarAgrReo ;
         Z122BarAgrPar = A122BarAgrPar ;
         Z590KgmAgr = A590KgmAgr ;
         Z671PieAgr = A671PieAgr ;
         Z869MtrAgr = A869MtrAgr ;
         Z1245BarAgrSer = A1245BarAgrSer ;
         Z1507BarAgrDsc = A1507BarAgrDsc ;
         Z1508CliCodAgr = A1508CliCodAgr ;
         Z1513DisCodAgr = A1513DisCodAgr ;
         Z1510ColNomAgr = A1510ColNomAgr ;
         Z1512ColNumAgr = A1512ColNumAgr ;
         Z1509ColNoCAgr = A1509ColNoCAgr ;
         Z1511ColNuCAgr = A1511ColNuCAgr ;
         Z1649BarAgrDNu = A1649BarAgrDNu ;
         Z396EmprCod = A396EmprCod ;
         Z474FindBarAgr = A474FindBarAgr ;
         Z1653FindDes = A1653FindDes ;
      }
   }

   public void standaloneNotModal0913( )
   {
      edtBarAgrNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarPNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtFindDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtFindBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtDisCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNoCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNuCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrDNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAGrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrNhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
   }

   public void standaloneModal0913( )
   {
      if ( isIns( )  )
      {
         A13846BarAgrCant = O13846BarAgrCant.add(DecimalUtil.doubleToDec(1)) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A13846BarAgrCant = O13846BarAgrCant ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A13846BarAgrCant = O13846BarAgrCant.subtract(DecimalUtil.doubleToDec(1)) ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAgrCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      }
      else
      {
         edtBarAgrCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAgrReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      }
      else
      {
         edtBarAgrReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAgrPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      }
      else
      {
         edtBarAgrPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      }
   }

   public void load0913( )
   {
      /* Using cursor T0009105 */
      pr_default.execute(95, new Object[] {A401EmprCodVi, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(95) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A590KgmAgr = T0009105_A590KgmAgr[0] ;
         A671PieAgr = T0009105_A671PieAgr[0] ;
         A869MtrAgr = T0009105_A869MtrAgr[0] ;
         A1245BarAgrSer = T0009105_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = T0009105_A1507BarAgrDsc[0] ;
         A1508CliCodAgr = T0009105_A1508CliCodAgr[0] ;
         A1513DisCodAgr = T0009105_A1513DisCodAgr[0] ;
         A1510ColNomAgr = T0009105_A1510ColNomAgr[0] ;
         A1512ColNumAgr = T0009105_A1512ColNumAgr[0] ;
         A1509ColNoCAgr = T0009105_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = T0009105_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = T0009105_A1649BarAgrDNu[0] ;
         A474FindBarAgr = T0009105_A474FindBarAgr[0] ;
         n474FindBarAgr = T0009105_n474FindBarAgr[0] ;
         A1653FindDes = T0009105_A1653FindDes[0] ;
         n1653FindDes = T0009105_n1653FindDes[0] ;
         zm0913( -28) ;
      }
      pr_default.close(95);
      onLoadActions0913( ) ;
   }

   public void onLoadActions0913( )
   {
      /* Using cursor T00095 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A121BarAgrKgm = T00095_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T00095_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T00095_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T00095_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
      }
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
   }

   public void checkExtendedTable0913( )
   {
      nIsDirty_13 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal0913( ) ;
      /* Using cursor T00095 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A121BarAgrKgm = T00095_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T00095_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T00095_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T00095_A1651BarPNDes[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         nIsDirty_13 = (short)(1) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         nIsDirty_13 = (short)(1) ;
         A1650BarAgrNDes = (short)(0) ;
         nIsDirty_13 = (short)(1) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(2);
      /* Using cursor T00096 */
      pr_default.execute(3, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A474FindBarAgr = T00096_A474FindBarAgr[0] ;
         n474FindBarAgr = T00096_n474FindBarAgr[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
      }
      pr_default.close(3);
      /* Using cursor T00097 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A1653FindDes = T00097_A1653FindDes[0] ;
         n1653FindDes = T00097_n1653FindDes[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      pr_default.close(4);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1651BarPNDes ;
      }
      nIsDirty_13 = (short)(1) ;
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      nIsDirty_13 = (short)(1) ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
   }

   public void closeExtendedTableCursors0913( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable0913( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T0009107 */
      pr_default.execute(96, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(96) != 101) )
      {
         A121BarAgrKgm = T0009107_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T0009107_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T0009107_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T0009107_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(96) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(96);
   }

   public void gxload_30( String A401EmprCodVi ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T0009108 */
      pr_default.execute(97, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(97) != 101) )
      {
         A474FindBarAgr = T0009108_A474FindBarAgr[0] ;
         n474FindBarAgr = T0009108_n474FindBarAgr[0] ;
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A474FindBarAgr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(97) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(97);
   }

   public void gxload_31( String A396EmprCod ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T0009109 */
      pr_default.execute(98, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(98) != 101) )
      {
         A1653FindDes = T0009109_A1653FindDes[0] ;
         n1653FindDes = T0009109_n1653FindDes[0] ;
      }
      else
      {
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1653FindDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(98) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(98);
   }

   public void getKey0913( )
   {
      /* Using cursor T0009110 */
      pr_default.execute(99, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(99) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(99);
   }

   public void getByPrimaryKey0913( )
   {
      /* Using cursor T00093 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0913( 28) ;
         RcdFound13 = (short)(1) ;
         initializeNonKey0913( ) ;
         A119BarAgrCod = T00093_A119BarAgrCod[0] ;
         A124BarAgrReo = T00093_A124BarAgrReo[0] ;
         A122BarAgrPar = T00093_A122BarAgrPar[0] ;
         A590KgmAgr = T00093_A590KgmAgr[0] ;
         A671PieAgr = T00093_A671PieAgr[0] ;
         A869MtrAgr = T00093_A869MtrAgr[0] ;
         A1245BarAgrSer = T00093_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = T00093_A1507BarAgrDsc[0] ;
         A1508CliCodAgr = T00093_A1508CliCodAgr[0] ;
         A1513DisCodAgr = T00093_A1513DisCodAgr[0] ;
         A1510ColNomAgr = T00093_A1510ColNomAgr[0] ;
         A1512ColNumAgr = T00093_A1512ColNumAgr[0] ;
         A1509ColNoCAgr = T00093_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = T00093_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = T00093_A1649BarAgrDNu[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z119BarAgrCod = A119BarAgrCod ;
         Z124BarAgrReo = A124BarAgrReo ;
         Z122BarAgrPar = A122BarAgrPar ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0913( ) ;
         load0913( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey0913( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0913( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0913( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0913( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00092 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z590KgmAgr, T00092_A590KgmAgr[0]) != 0 ) || ( Z671PieAgr != T00092_A671PieAgr[0] ) || ( DecimalUtil.compareTo(Z869MtrAgr, T00092_A869MtrAgr[0]) != 0 ) || ( GXutil.strcmp(Z1245BarAgrSer, T00092_A1245BarAgrSer[0]) != 0 ) || ( GXutil.strcmp(Z1507BarAgrDsc, T00092_A1507BarAgrDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1508CliCodAgr != T00092_A1508CliCodAgr[0] ) || ( Z1513DisCodAgr != T00092_A1513DisCodAgr[0] ) || ( GXutil.strcmp(Z1510ColNomAgr, T00092_A1510ColNomAgr[0]) != 0 ) || ( Z1512ColNumAgr != T00092_A1512ColNumAgr[0] ) || ( GXutil.strcmp(Z1509ColNoCAgr, T00092_A1509ColNoCAgr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1511ColNuCAgr != T00092_A1511ColNuCAgr[0] ) || ( GXutil.strcmp(Z1649BarAgrDNu, T00092_A1649BarAgrDNu[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z590KgmAgr, T00092_A590KgmAgr[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"KgmAgr");
               GXutil.writeLogRaw("Old: ",Z590KgmAgr);
               GXutil.writeLogRaw("Current: ",T00092_A590KgmAgr[0]);
            }
            if ( Z671PieAgr != T00092_A671PieAgr[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"PieAgr");
               GXutil.writeLogRaw("Old: ",Z671PieAgr);
               GXutil.writeLogRaw("Current: ",T00092_A671PieAgr[0]);
            }
            if ( DecimalUtil.compareTo(Z869MtrAgr, T00092_A869MtrAgr[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"MtrAgr");
               GXutil.writeLogRaw("Old: ",Z869MtrAgr);
               GXutil.writeLogRaw("Current: ",T00092_A869MtrAgr[0]);
            }
            if ( GXutil.strcmp(Z1245BarAgrSer, T00092_A1245BarAgrSer[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarAgrSer");
               GXutil.writeLogRaw("Old: ",Z1245BarAgrSer);
               GXutil.writeLogRaw("Current: ",T00092_A1245BarAgrSer[0]);
            }
            if ( GXutil.strcmp(Z1507BarAgrDsc, T00092_A1507BarAgrDsc[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarAgrDsc");
               GXutil.writeLogRaw("Old: ",Z1507BarAgrDsc);
               GXutil.writeLogRaw("Current: ",T00092_A1507BarAgrDsc[0]);
            }
            if ( Z1508CliCodAgr != T00092_A1508CliCodAgr[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"CliCodAgr");
               GXutil.writeLogRaw("Old: ",Z1508CliCodAgr);
               GXutil.writeLogRaw("Current: ",T00092_A1508CliCodAgr[0]);
            }
            if ( Z1513DisCodAgr != T00092_A1513DisCodAgr[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"DisCodAgr");
               GXutil.writeLogRaw("Old: ",Z1513DisCodAgr);
               GXutil.writeLogRaw("Current: ",T00092_A1513DisCodAgr[0]);
            }
            if ( GXutil.strcmp(Z1510ColNomAgr, T00092_A1510ColNomAgr[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"ColNomAgr");
               GXutil.writeLogRaw("Old: ",Z1510ColNomAgr);
               GXutil.writeLogRaw("Current: ",T00092_A1510ColNomAgr[0]);
            }
            if ( Z1512ColNumAgr != T00092_A1512ColNumAgr[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"ColNumAgr");
               GXutil.writeLogRaw("Old: ",Z1512ColNumAgr);
               GXutil.writeLogRaw("Current: ",T00092_A1512ColNumAgr[0]);
            }
            if ( GXutil.strcmp(Z1509ColNoCAgr, T00092_A1509ColNoCAgr[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"ColNoCAgr");
               GXutil.writeLogRaw("Old: ",Z1509ColNoCAgr);
               GXutil.writeLogRaw("Current: ",T00092_A1509ColNoCAgr[0]);
            }
            if ( Z1511ColNuCAgr != T00092_A1511ColNuCAgr[0] )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"ColNuCAgr");
               GXutil.writeLogRaw("Old: ",Z1511ColNuCAgr);
               GXutil.writeLogRaw("Current: ",T00092_A1511ColNuCAgr[0]);
            }
            if ( GXutil.strcmp(Z1649BarAgrDNu, T00092_A1649BarAgrDNu[0]) != 0 )
            {
               GXutil.writeLogln("tbaragr:[seudo value changed for attri]"+"BarAgrDNu");
               GXutil.writeLogRaw("Old: ",Z1649BarAgrDNu);
               GXutil.writeLogRaw("Current: ",T00092_A1649BarAgrDNu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARAGR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0913( )
   {
      beforeValidate0913( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0913( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0913( 0) ;
         checkOptimisticConcurrency0913( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0913( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0913( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T0009111 */
                  pr_default.execute(100, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(100) == 1) )
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
            load0913( ) ;
         }
         endLevel0913( ) ;
      }
      closeExtendedTableCursors0913( ) ;
   }

   public void update0913( )
   {
      beforeValidate0913( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0913( ) ;
      }
      if ( ( nIsMod_13 != 0 ) || ( nIsDirty_13 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0913( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0913( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0913( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T0009112 */
                     pr_default.execute(101, new Object[] {A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                     if ( (pr_default.getStatus(101) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0913( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int7[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3) ;
                        tbaragr_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbaragr_impl.this.A129BarCod = GXv_int7[0] ;
                        tbaragr_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbaragr_impl.this.A130BarCodPar = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0913( ) ;
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
            endLevel0913( ) ;
         }
      }
      closeExtendedTableCursors0913( ) ;
   }

   public void deferredUpdate0913( )
   {
   }

   public void delete0913( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0913( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0913( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0913( ) ;
         afterConfirm0913( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0913( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T0009113 */
               pr_default.execute(102, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0913( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0913( )
   {
      standaloneModal0913( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T0009115 */
         pr_default.execute(103, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
         if ( (pr_default.getStatus(103) != 101) )
         {
            A121BarAgrKgm = T0009115_A121BarAgrKgm[0] ;
            A868BarAgrMtr = T0009115_A868BarAgrMtr[0] ;
            A1650BarAgrNDes = T0009115_A1650BarAgrNDes[0] ;
            A1651BarPNDes = T0009115_A1651BarPNDes[0] ;
         }
         else
         {
            A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
            A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
            A1650BarAgrNDes = (short)(0) ;
            A1651BarPNDes = (short)(0) ;
         }
         pr_default.close(103);
         /* Using cursor T0009116 */
         pr_default.execute(104, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(104) != 101) )
         {
            A474FindBarAgr = T0009116_A474FindBarAgr[0] ;
            n474FindBarAgr = T0009116_n474FindBarAgr[0] ;
         }
         else
         {
            A474FindBarAgr = "" ;
            n474FindBarAgr = false ;
         }
         pr_default.close(104);
         /* Using cursor T0009117 */
         pr_default.execute(105, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(105) != 101) )
         {
            A1653FindDes = T0009117_A1653FindDes[0] ;
            n1653FindDes = T0009117_n1653FindDes[0] ;
         }
         else
         {
            A1653FindDes = " " ;
            n1653FindDes = false ;
         }
         pr_default.close(105);
         if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A123BarAgrPie = A1650BarAgrNDes ;
         }
         else
         {
            A123BarAgrPie = A1651BarPNDes ;
         }
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      }
   }

   public void endLevel0913( )
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

   public void scanStart0913( )
   {
      /* Scan By routine */
      /* Using cursor T0009118 */
      pr_default.execute(106, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(106) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A119BarAgrCod = T0009118_A119BarAgrCod[0] ;
         A124BarAgrReo = T0009118_A124BarAgrReo[0] ;
         A122BarAgrPar = T0009118_A122BarAgrPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0913( )
   {
      /* Scan next routine */
      pr_default.readNext(106);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(106) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A119BarAgrCod = T0009118_A119BarAgrCod[0] ;
         A124BarAgrReo = T0009118_A124BarAgrReo[0] ;
         A122BarAgrPar = T0009118_A122BarAgrPar[0] ;
      }
   }

   public void scanEnd0913( )
   {
      pr_default.close(106);
   }

   public void afterConfirm0913( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0913( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0913( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0913( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0913( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0913( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0913( )
   {
      edtBarAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarPNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtFindDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtFindBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtDisCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNoCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNuCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrDNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAGrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrNhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
   }

   public void send_integrity_lvl_hashes0913( )
   {
   }

   public void send_integrity_lvl_hashes0912( )
   {
   }

   public void subsflControlProps_10113( )
   {
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_101_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_101_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_101_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_101_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_101_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_101_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_101_idx ;
      edtBarAgrKgm_Internalname = "BARAGRKGM_"+sGXsfl_101_idx ;
      edtBarAgrMtr_Internalname = "BARAGRMTR_"+sGXsfl_101_idx ;
      edtBarAgrPie_Internalname = "BARAGRPIE_"+sGXsfl_101_idx ;
      edtBarAgrNDes_Internalname = "BARAGRNDES_"+sGXsfl_101_idx ;
      edtBarPNDes_Internalname = "BARPNDES_"+sGXsfl_101_idx ;
      edtFindDes_Internalname = "FINDDES_"+sGXsfl_101_idx ;
      edtFindBarAgr_Internalname = "FINDBARAGR_"+sGXsfl_101_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_101_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_101_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_101_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_101_idx ;
      edtDisCodAgr_Internalname = "DISCODAGR_"+sGXsfl_101_idx ;
      edtColNoCAgr_Internalname = "COLNOCAGR_"+sGXsfl_101_idx ;
      edtColNuCAgr_Internalname = "COLNUCAGR_"+sGXsfl_101_idx ;
      edtBarAgrDNu_Internalname = "BARAGRDNU_"+sGXsfl_101_idx ;
      edtBarAGrHdr_Internalname = "BARAGRHDR_"+sGXsfl_101_idx ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_101_idx ;
   }

   public void subsflControlProps_fel_10113( )
   {
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_101_fel_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_101_fel_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_101_fel_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_101_fel_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_101_fel_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_101_fel_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_101_fel_idx ;
      edtBarAgrKgm_Internalname = "BARAGRKGM_"+sGXsfl_101_fel_idx ;
      edtBarAgrMtr_Internalname = "BARAGRMTR_"+sGXsfl_101_fel_idx ;
      edtBarAgrPie_Internalname = "BARAGRPIE_"+sGXsfl_101_fel_idx ;
      edtBarAgrNDes_Internalname = "BARAGRNDES_"+sGXsfl_101_fel_idx ;
      edtBarPNDes_Internalname = "BARPNDES_"+sGXsfl_101_fel_idx ;
      edtFindDes_Internalname = "FINDDES_"+sGXsfl_101_fel_idx ;
      edtFindBarAgr_Internalname = "FINDBARAGR_"+sGXsfl_101_fel_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_101_fel_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_101_fel_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_101_fel_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_101_fel_idx ;
      edtDisCodAgr_Internalname = "DISCODAGR_"+sGXsfl_101_fel_idx ;
      edtColNoCAgr_Internalname = "COLNOCAGR_"+sGXsfl_101_fel_idx ;
      edtColNuCAgr_Internalname = "COLNUCAGR_"+sGXsfl_101_fel_idx ;
      edtBarAgrDNu_Internalname = "BARAGRDNU_"+sGXsfl_101_fel_idx ;
      edtBarAGrHdr_Internalname = "BARAGRHDR_"+sGXsfl_101_fel_idx ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_101_fel_idx ;
   }

   public void addRow0913( )
   {
      nGXsfl_101_idx = (int)(nGXsfl_101_idx+1) ;
      sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10113( ) ;
      sendRow0913( ) ;
   }

   public void sendRow0913( )
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
         if ( ((int)((nGXsfl_101_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCodAgr_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliCodAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrSer_Internalname,GXutil.rtrim( A1245BarAgrSer),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrSer_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNomAgr_Internalname,GXutil.rtrim( A1510ColNomAgr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNomAgr_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtColNomAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_101_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_101_idx + "',101)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNumAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColNumAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNumAgr_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtColNumAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrKgm_Enabled!=0) ? localUtil.format( A121BarAgrKgm, "ZZZZZ9.99") : localUtil.format( A121BarAgrKgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrKgm_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrMtr_Enabled!=0) ? localUtil.format( A868BarAgrMtr, "ZZZZZ9.99") : localUtil.format( A868BarAgrMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrMtr_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPie_Internalname,GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A123BarAgrPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A123BarAgrPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPie_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNDes_Internalname,GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1650BarAgrNDes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1650BarAgrNDes), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrNDes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPNDes_Internalname,GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1651BarPNDes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1651BarPNDes), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPNDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPNDes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFindDes_Internalname,GXutil.rtrim( A1653FindDes),GXutil.rtrim( localUtil.format( A1653FindDes, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFindDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFindDes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFindBarAgr_Internalname,GXutil.rtrim( A474FindBarAgr),GXutil.rtrim( localUtil.format( A474FindBarAgr, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFindBarAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFindBarAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgmAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtKgmAgr_Enabled!=0) ? localUtil.format( A590KgmAgr, "ZZZZZ9.99") : localUtil.format( A590KgmAgr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKgmAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtKgmAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPieAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPieAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPieAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtrAgr_Enabled!=0) ? localUtil.format( A869MtrAgr, "ZZZZZ9.99") : localUtil.format( A869MtrAgr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMtrAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDsc_Internalname,GXutil.rtrim( A1507BarAgrDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCodAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtDisCodAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNoCAgr_Internalname,GXutil.rtrim( A1509ColNoCAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNoCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtColNoCAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNuCAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColNuCAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNuCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtColNuCAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDNu_Internalname,GXutil.rtrim( A1649BarAgrDNu),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDNu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrDNu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAGrHdr_Internalname,GXutil.rtrim( A13695BarAGrHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAGrHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAGrHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrNhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(101),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes0913( ) ;
      GXCCtl = "Z119BarAgrCod_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z124BarAgrReo_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z122BarAgrPar_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z122BarAgrPar));
      GXCCtl = "Z590KgmAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z671PieAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z869MtrAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1245BarAgrSer_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1245BarAgrSer));
      GXCCtl = "Z1507BarAgrDsc_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1507BarAgrDsc));
      GXCCtl = "Z1508CliCodAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1513DisCodAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1510ColNomAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1510ColNomAgr));
      GXCCtl = "Z1512ColNumAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1509ColNoCAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1509ColNoCAgr));
      GXCCtl = "Z1511ColNuCAgr_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1649BarAgrDNu_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1649BarAgrDNu));
      GXCCtl = "nRcdDeleted_13_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_13_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_13_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vWCKGCOL_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV55Wckgcol, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vDELALL_" + sGXsfl_101_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV74DelAll, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICODAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRSER_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNOMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNUMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRKGM_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRMTR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPIE_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRNDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPNDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDDES_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDBARAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "KGMAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTRAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRDSC_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCODAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNOCAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNUCAGR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRDNU_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRHDR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRNHDR_"+sGXsfl_101_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow0913( )
   {
      nGXsfl_101_idx = (int)(nGXsfl_101_idx+1) ;
      sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10113( ) ;
      edtBarAgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRCOD_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRREO_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPAR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICODAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRSER_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNomAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOMAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNumAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUMAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRKGM_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRMTR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPIE_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNDES_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPNDES_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFindDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDDES_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFindBarAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDBARAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtKgmAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KGMAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPieAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtrAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDSC_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCODAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNoCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOCAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNuCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUCAGR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrDNu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDNU_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAGrHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRHDR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrNhdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNHDR_"+sGXsfl_101_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARAGRCOD_" + sGXsfl_101_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         wbErr = true ;
         A119BarAgrCod = 0 ;
      }
      else
      {
         A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARAGRREO_" + sGXsfl_101_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrReo_Internalname ;
         wbErr = true ;
         A124BarAgrReo = (byte)(0) ;
      }
      else
      {
         A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICODAGR_" + sGXsfl_101_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCodAgr_Internalname ;
         wbErr = true ;
         A1508CliCodAgr = 0 ;
      }
      else
      {
         A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
      A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "COLNUMAGR_" + sGXsfl_101_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColNumAgr_Internalname ;
         wbErr = true ;
         A1512ColNumAgr = 0 ;
      }
      else
      {
         A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A121BarAgrKgm = localUtil.ctond( httpContext.cgiGet( edtBarAgrKgm_Internalname)) ;
      A868BarAgrMtr = localUtil.ctond( httpContext.cgiGet( edtBarAgrMtr_Internalname)) ;
      A123BarAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1650BarAgrNDes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAgrNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1651BarPNDes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1653FindDes = GXutil.upper( httpContext.cgiGet( edtFindDes_Internalname)) ;
      n1653FindDes = false ;
      A474FindBarAgr = GXutil.upper( httpContext.cgiGet( edtFindBarAgr_Internalname)) ;
      n474FindBarAgr = false ;
      A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
      A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
      A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
      A1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1509ColNoCAgr = httpContext.cgiGet( edtColNoCAgr_Internalname) ;
      A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1649BarAgrDNu = httpContext.cgiGet( edtBarAgrDNu_Internalname) ;
      A13695BarAGrHdr = httpContext.cgiGet( edtBarAGrHdr_Internalname) ;
      A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
      GXCCtl = "Z119BarAgrCod_" + sGXsfl_101_idx ;
      Z119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z124BarAgrReo_" + sGXsfl_101_idx ;
      Z124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z122BarAgrPar_" + sGXsfl_101_idx ;
      Z122BarAgrPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z590KgmAgr_" + sGXsfl_101_idx ;
      Z590KgmAgr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z671PieAgr_" + sGXsfl_101_idx ;
      Z671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z869MtrAgr_" + sGXsfl_101_idx ;
      Z869MtrAgr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1245BarAgrSer_" + sGXsfl_101_idx ;
      Z1245BarAgrSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1507BarAgrDsc_" + sGXsfl_101_idx ;
      Z1507BarAgrDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1508CliCodAgr_" + sGXsfl_101_idx ;
      Z1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1513DisCodAgr_" + sGXsfl_101_idx ;
      Z1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1510ColNomAgr_" + sGXsfl_101_idx ;
      Z1510ColNomAgr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1512ColNumAgr_" + sGXsfl_101_idx ;
      Z1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1509ColNoCAgr_" + sGXsfl_101_idx ;
      Z1509ColNoCAgr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1511ColNuCAgr_" + sGXsfl_101_idx ;
      Z1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1649BarAgrDNu_" + sGXsfl_101_idx ;
      Z1649BarAgrDNu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_13_" + sGXsfl_101_idx ;
      nRcdDeleted_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_13_" + sGXsfl_101_idx ;
      nRcdExists_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_13_" + sGXsfl_101_idx ;
      nIsMod_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarAgrNhdr_Enabled = edtBarAgrNhdr_Enabled ;
      defedtBarAGrHdr_Enabled = edtBarAGrHdr_Enabled ;
      defedtBarAgrDNu_Enabled = edtBarAgrDNu_Enabled ;
      defedtColNuCAgr_Enabled = edtColNuCAgr_Enabled ;
      defedtColNoCAgr_Enabled = edtColNoCAgr_Enabled ;
      defedtDisCodAgr_Enabled = edtDisCodAgr_Enabled ;
      defedtBarAgrDsc_Enabled = edtBarAgrDsc_Enabled ;
      defedtMtrAgr_Enabled = edtMtrAgr_Enabled ;
      defedtPieAgr_Enabled = edtPieAgr_Enabled ;
      defedtKgmAgr_Enabled = edtKgmAgr_Enabled ;
      defedtFindBarAgr_Enabled = edtFindBarAgr_Enabled ;
      defedtFindDes_Enabled = edtFindDes_Enabled ;
      defedtBarPNDes_Enabled = edtBarPNDes_Enabled ;
      defedtBarAgrNDes_Enabled = edtBarAgrNDes_Enabled ;
      defedtBarAgrPar_Enabled = edtBarAgrPar_Enabled ;
      defedtBarAgrReo_Enabled = edtBarAgrReo_Enabled ;
      defedtBarAgrCod_Enabled = edtBarAgrCod_Enabled ;
   }

   public void confirmValues090( )
   {
      nGXsfl_101_idx = 0 ;
      sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10113( ) ;
      while ( nGXsfl_101_idx < nRC_GXsfl_101 )
      {
         nGXsfl_101_idx = (int)(nGXsfl_101_idx+1) ;
         sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10113( ) ;
         httpContext.changePostValue( "Z119BarAgrCod_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z119BarAgrCod_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z119BarAgrCod_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z124BarAgrReo_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z124BarAgrReo_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z124BarAgrReo_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z122BarAgrPar_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z122BarAgrPar_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z122BarAgrPar_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z590KgmAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z590KgmAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z590KgmAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z671PieAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z671PieAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z671PieAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z869MtrAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z869MtrAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z869MtrAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1245BarAgrSer_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1507BarAgrDsc_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1508CliCodAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1513DisCodAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1510ColNomAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1512ColNumAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1509ColNoCAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1511ColNuCAgr_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_101_idx) ;
         httpContext.changePostValue( "Z1649BarAgrDNu_"+sGXsfl_101_idx, httpContext.cgiGet( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_101_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_101_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tbaragr", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARAGR");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbaragr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z236BarVolMaq", GXutil.ltrim( localUtil.ntoc( Z236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13846BarAgrCant", GXutil.ltrim( localUtil.ntoc( O13846BarAgrCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_101", GXutil.ltrim( localUtil.ntoc( nGXsfl_101_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vWCKGCOL", GXutil.ltrim( localUtil.ntoc( AV55Wckgcol, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55Wckgcol), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDELALL", GXutil.ltrim( localUtil.ntoc( AV74DelAll, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDELALL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74DelAll), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCBARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.tbaragr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TBARAGR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AGRUPACION HOJAS RUTA TINTE", "") ;
   }

   public void initializeNonKey0912( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A401EmprCodVi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      A478FindVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
      A479FindVolMed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
      A480FindVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      h180BarMaqCod = "" ;
      A236BarVolMaq = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A13846BarAgrCant = DecimalUtil.ZERO ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      h252CliCod = "" ;
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O13846BarAgrCant = A13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z143BarDisNum = "" ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z236BarVolMaq = 0 ;
      Z213BarSit = (byte)(0) ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
   }

   public void initAll0912( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey0912( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0913( )
   {
      A123BarAgrPie = (short)(0) ;
      A121BarAgrKgm = DecimalUtil.ZERO ;
      A474FindBarAgr = "" ;
      n474FindBarAgr = false ;
      A868BarAgrMtr = DecimalUtil.ZERO ;
      A1650BarAgrNDes = (short)(0) ;
      A1651BarPNDes = (short)(0) ;
      A1653FindDes = "" ;
      n1653FindDes = false ;
      A13695BarAGrHdr = "" ;
      A13792BarAgrNhdr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A671PieAgr = (short)(0) ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1508CliCodAgr = 0 ;
      A1513DisCodAgr = 0 ;
      A1510ColNomAgr = "" ;
      A1512ColNumAgr = 0 ;
      A1509ColNoCAgr = "" ;
      A1511ColNuCAgr = 0 ;
      A1649BarAgrDNu = "" ;
      Z590KgmAgr = DecimalUtil.ZERO ;
      Z671PieAgr = (short)(0) ;
      Z869MtrAgr = DecimalUtil.ZERO ;
      Z1245BarAgrSer = "" ;
      Z1507BarAgrDsc = "" ;
      Z1508CliCodAgr = 0 ;
      Z1513DisCodAgr = 0 ;
      Z1510ColNomAgr = "" ;
      Z1512ColNumAgr = 0 ;
      Z1509ColNoCAgr = "" ;
      Z1511ColNuCAgr = 0 ;
      Z1649BarAgrDNu = "" ;
   }

   public void initAll0913( )
   {
      A119BarAgrCod = 0 ;
      A124BarAgrReo = (byte)(0) ;
      A122BarAgrPar = "" ;
      initializeNonKey0913( ) ;
   }

   public void standaloneModalInsert0913( )
   {
      A13846BarAgrCant = i13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824150391", true, true);
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
      httpContext.AddJavascriptSource("tbaragr.js", "?2026824150391", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties13( )
   {
      edtBarAgrNhdr_Enabled = defedtBarAgrNhdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAGrHdr_Enabled = defedtBarAGrHdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrDNu_Enabled = defedtBarAgrDNu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNuCAgr_Enabled = defedtColNuCAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtColNoCAgr_Enabled = defedtColNoCAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtDisCodAgr_Enabled = defedtDisCodAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrDsc_Enabled = defedtBarAgrDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtMtrAgr_Enabled = defedtMtrAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtPieAgr_Enabled = defedtPieAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtKgmAgr_Enabled = defedtKgmAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtFindBarAgr_Enabled = defedtFindBarAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtFindDes_Enabled = defedtFindDes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarPNDes_Enabled = defedtBarPNDes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrNDes_Enabled = defedtBarAgrNDes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrPar_Enabled = defedtBarAgrPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrReo_Enabled = defedtBarAgrReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_101_Refreshing);
      edtBarAgrCod_Enabled = defedtBarAgrCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_101_Refreshing);
   }

   public void startgridcontrol101( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A122BarAgrPar));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1245BarAgrSer));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1510ColNomAgr));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1653FindDes));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A474FindBarAgr));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1507BarAgrDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1509ColNoCAgr));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1649BarAgrDNu));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13695BarAGrHdr));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarDisNum_Internalname = "BARDISNUM" ;
      edtBarAgrCant_Internalname = "BARAGRCANT" ;
      lblTextblockbarcod_Internalname = "TEXTBLOCKBARCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      divUnnamedtablebarcod_Internalname = "UNNAMEDTABLEBARCOD" ;
      lblTextblockbarcodreo_Internalname = "TEXTBLOCKBARCODREO" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      divUnnamedtablebarcodreo_Internalname = "UNNAMEDTABLEBARCODREO" ;
      lblTextblockbarcodpar_Internalname = "TEXTBLOCKBARCODPAR" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      divUnnamedtablebarcodpar_Internalname = "UNNAMEDTABLEBARCODPAR" ;
      lblTextblockbarmaqcod_Internalname = "TEXTBLOCKBARMAQCOD" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      divUnnamedtablebarmaqcod_Internalname = "UNNAMEDTABLEBARMAQCOD" ;
      lblTextblockbarvolmaq_Internalname = "TEXTBLOCKBARVOLMAQ" ;
      edtBarVolMaq_Internalname = "BARVOLMAQ" ;
      divUnnamedtablebarvolmaq_Internalname = "UNNAMEDTABLEBARVOLMAQ" ;
      tblTabladatoshdr_Internalname = "TABLADATOSHDR" ;
      divTablacabecera_Internalname = "TABLACABECERA" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      divTabladatosadicionales_Internalname = "TABLADATOSADICIONALES" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
      edtCliCodAgr_Internalname = "CLICODAGR" ;
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtBarAgrKgm_Internalname = "BARAGRKGM" ;
      edtBarAgrMtr_Internalname = "BARAGRMTR" ;
      edtBarAgrPie_Internalname = "BARAGRPIE" ;
      edtBarAgrNDes_Internalname = "BARAGRNDES" ;
      edtBarPNDes_Internalname = "BARPNDES" ;
      edtFindDes_Internalname = "FINDDES" ;
      edtFindBarAgr_Internalname = "FINDBARAGR" ;
      edtKgmAgr_Internalname = "KGMAGR" ;
      edtPieAgr_Internalname = "PIEAGR" ;
      edtMtrAgr_Internalname = "MTRAGR" ;
      edtBarAgrDsc_Internalname = "BARAGRDSC" ;
      edtDisCodAgr_Internalname = "DISCODAGR" ;
      edtColNoCAgr_Internalname = "COLNOCAGR" ;
      edtColNuCAgr_Internalname = "COLNUCAGR" ;
      edtBarAgrDNu_Internalname = "BARAGRDNU" ;
      edtBarAGrHdr_Internalname = "BARAGRHDR" ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEmprCodVi_Internalname = "EMPRCODVI" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtFindVolMed_Internalname = "FINDVOLMED" ;
      edtFindVolMin_Internalname = "FINDVOLMIN" ;
      edtFindVolMax_Internalname = "FINDVOLMAX" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "AGRUPACION HOJAS RUTA TINTE", "") );
      edtBarAgrNhdr_Jsonclick = "" ;
      edtBarAGrHdr_Jsonclick = "" ;
      edtBarAgrDNu_Jsonclick = "" ;
      edtColNuCAgr_Jsonclick = "" ;
      edtColNoCAgr_Jsonclick = "" ;
      edtDisCodAgr_Jsonclick = "" ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtMtrAgr_Jsonclick = "" ;
      edtPieAgr_Jsonclick = "" ;
      edtKgmAgr_Jsonclick = "" ;
      edtFindBarAgr_Jsonclick = "" ;
      edtFindDes_Jsonclick = "" ;
      edtBarPNDes_Jsonclick = "" ;
      edtBarAgrNDes_Jsonclick = "" ;
      edtBarAgrPie_Jsonclick = "" ;
      edtBarAgrMtr_Jsonclick = "" ;
      edtBarAgrKgm_Jsonclick = "" ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNomAgr_Jsonclick = "" ;
      edtBarAgrSer_Jsonclick = "" ;
      edtCliCodAgr_Jsonclick = "" ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtBarAgrNhdr_Enabled = 0 ;
      edtBarAGrHdr_Enabled = 0 ;
      edtBarAgrDNu_Enabled = 0 ;
      edtColNuCAgr_Enabled = 0 ;
      edtColNoCAgr_Enabled = 0 ;
      edtDisCodAgr_Enabled = 0 ;
      edtBarAgrDsc_Enabled = 0 ;
      edtMtrAgr_Enabled = 0 ;
      edtPieAgr_Enabled = 0 ;
      edtKgmAgr_Enabled = 0 ;
      edtFindBarAgr_Enabled = 0 ;
      edtFindDes_Enabled = 0 ;
      edtBarPNDes_Enabled = 0 ;
      edtBarAgrNDes_Enabled = 0 ;
      edtBarAgrPie_Enabled = 0 ;
      edtBarAgrMtr_Enabled = 0 ;
      edtBarAgrKgm_Enabled = 0 ;
      edtColNumAgr_Enabled = 1 ;
      edtColNomAgr_Enabled = 1 ;
      edtBarAgrSer_Enabled = 1 ;
      edtCliCodAgr_Enabled = 1 ;
      edtBarAgrPar_Enabled = 1 ;
      edtBarAgrReo_Enabled = 1 ;
      edtBarAgrCod_Enabled = 1 ;
      edtFindVolMax_Jsonclick = "" ;
      edtFindVolMax_Enabled = 0 ;
      edtFindVolMin_Jsonclick = "" ;
      edtFindVolMin_Enabled = 0 ;
      edtFindVolMed_Jsonclick = "" ;
      edtFindVolMed_Enabled = 0 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 1 ;
      edtEmprCodVi_Jsonclick = "" ;
      edtEmprCodVi_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 1 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 1 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarVolMaq_Jsonclick = "" ;
      edtBarVolMaq_Enabled = 1 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtBarAgrCant_Jsonclick = "" ;
      edtBarAgrCant_Enabled = 0 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Enabled = 1 ;
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

   public void gxsgabarmaqcod090( String A396EmprCod ,
                                  String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgabarmaqcod_data090( A396EmprCod, A13734MaqCDsc) ;
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

   protected void gxsgabarmaqcod_data090( String A396EmprCod ,
                                          String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor T0009119 */
      pr_default.execute(107, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(107) != 101) )
      {
         gxdynajaxctrlcodr.add(T0009119_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(T0009119_A13734MaqCDsc[0]);
         pr_default.readNext(107);
      }
      pr_default.close(107);
   }

   public void gxsgaclicod090( String A396EmprCod ,
                               String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data090( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_data090( String A396EmprCod ,
                                       String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T0009120 */
      pr_default.execute(108, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(108) != 101) )
      {
         gxdynajaxctrlcodr.add(T0009120_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(T0009120_A13735CliCNom[0]);
         pr_default.readNext(108);
      }
      pr_default.close(108);
   }

   public void gxhcabarmaqcod0912( String A396EmprCod ,
                                   String A13734MaqCDsc )
   {
      /* Using cursor T0009121 */
      pr_default.execute(109, new Object[] {A13734MaqCDsc, Boolean.valueOf(n396EmprCod), A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(109) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = T0009121_A13734MaqCDsc[0] ;
         A396EmprCod = T0009121_A396EmprCod[0] ;
         n396EmprCod = T0009121_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T0009121_A602MaqCod[0] ;
         pr_default.readNext(109);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      pr_default.close(109);
   }

   public void gxhcaclicod0912( String A396EmprCod ,
                                String A13735CliCNom )
   {
      /* Using cursor T0009122 */
      pr_default.execute(110, new Object[] {A13735CliCNom, Boolean.valueOf(n396EmprCod), A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(110) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = T0009122_A13735CliCNom[0] ;
         A396EmprCod = T0009122_A396EmprCod[0] ;
         n396EmprCod = T0009122_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T0009122_A252CliCod[0] ;
         n252CliCod = T0009122_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(110);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(110);
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_10113( ) ;
      while ( nGXsfl_101_idx <= nRC_GXsfl_101 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0913( ) ;
         standaloneModal0913( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0913( ) ;
         nGXsfl_101_idx = (int)(nGXsfl_101_idx+1) ;
         sGXsfl_101_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_101_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10113( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T0009123 */
      pr_default.execute(111, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(111) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T0009123_A407EmprNom[0] ;
      n407EmprNom = T0009123_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(111);
      /* Using cursor T0009125 */
      pr_default.execute(112, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(112) != 101) )
      {
         A13846BarAgrCant = T0009125_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T0009125_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      pr_default.close(112);
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T0009126 */
      pr_default.execute(113, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(113) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T0009126_A407EmprNom[0] ;
      n407EmprNom = T0009126_n407EmprNom[0] ;
      pr_default.close(113);
      /* Using cursor T0009127 */
      pr_default.execute(114, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(114) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A252CliCod = T0009127_A252CliCod[0] ;
      n252CliCod = T0009127_n252CliCod[0] ;
      A365DisDes = T0009127_A365DisDes[0] ;
      pr_default.close(114);
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         A252CliCod = 0 ;
         n252CliCod = false ;
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T0009128 */
         pr_default.execute(115, new Object[] {A13735CliCNom, Boolean.valueOf(n396EmprCod), A396EmprCod});
         A396EmprCod = T0009128_A396EmprCod[0] ;
         n396EmprCod = T0009128_n396EmprCod[0] ;
         A252CliCod = T0009128_A252CliCod[0] ;
         n252CliCod = T0009128_n252CliCod[0] ;
         A252CliCod = T0009128_A252CliCod[0] ;
         n252CliCod = T0009128_n252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(115) == 101) ) )
         {
            pr_default.readNext(115);
            if ( ! ( (pr_default.getStatus(115) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
            }
         }
         else
         {
         }
         pr_default.close(115);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T0009130 */
      pr_default.execute(116, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(116) != 101) )
      {
         A13846BarAgrCant = T0009130_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T0009130_n13846BarAgrCant[0] ;
      }
      else
      {
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
      }
      pr_default.close(116);
      A401EmprCodVi = A396EmprCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", GXutil.rtrim( A401EmprCodVi));
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z236BarVolMaq", GXutil.ltrim( localUtil.ntoc( Z236BarVolMaq, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z401EmprCodVi", GXutil.rtrim( Z401EmprCodVi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z478FindVolMax", GXutil.ltrim( localUtil.ntoc( Z478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z479FindVolMed", GXutil.ltrim( localUtil.ntoc( Z479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z480FindVolMin", GXutil.ltrim( localUtil.ntoc( Z480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13846BarAgrCant", GXutil.ltrim( localUtil.ntoc( Z13846BarAgrCant, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "O13846BarAgrCant", GXutil.ltrim( localUtil.ntoc( O13846BarAgrCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "h180BarMaqCod", h180BarMaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barmaqcod( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      if ( (GXutil.strcmp("", h180BarMaqCod)==0) )
      {
         A180BarMaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = h180BarMaqCod ;
         /* Using cursor T0009131 */
         pr_default.execute(117, new Object[] {A13734MaqCDsc, Boolean.valueOf(n396EmprCod), A396EmprCod});
         A180BarMaqCod = T0009131_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(117) == 101) ) )
         {
            pr_default.readNext(117);
            if ( ! ( (pr_default.getStatus(117) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "BARMAQCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarMaqCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(117);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h180BarMaqCod", h180BarMaqCod);
      /* Using cursor T0009133 */
      pr_default.execute(118, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(118) != 101) )
      {
         A478FindVolMax = T0009133_A478FindVolMax[0] ;
         A479FindVolMed = T0009133_A479FindVolMed[0] ;
         A480FindVolMin = T0009133_A480FindVolMin[0] ;
      }
      else
      {
         A478FindVolMax = 0 ;
         A479FindVolMed = 0 ;
         A480FindVolMin = 0 ;
      }
      pr_default.close(118);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "h180BarMaqCod", h180BarMaqCod);
   }

   public void valid_Baragrpar( )
   {
      n396EmprCod = false ;
      n1653FindDes = false ;
      n474FindBarAgr = false ;
      /* Using cursor T0009115 */
      pr_default.execute(103, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(103) != 101) )
      {
         A121BarAgrKgm = T0009115_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T0009115_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T0009115_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T0009115_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(103);
      /* Using cursor T0009116 */
      pr_default.execute(104, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(104) != 101) )
      {
         A474FindBarAgr = T0009116_A474FindBarAgr[0] ;
         n474FindBarAgr = T0009116_n474FindBarAgr[0] ;
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
      }
      pr_default.close(104);
      /* Using cursor T0009117 */
      pr_default.execute(105, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(105) != 101) )
      {
         A1653FindDes = T0009117_A1653FindDes[0] ;
         n1653FindDes = T0009117_n1653FindDes[0] ;
      }
      else
      {
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      pr_default.close(105);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
      }
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", GXutil.rtrim( A474FindBarAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", GXutil.rtrim( A1653FindDes));
      httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", GXutil.rtrim( A13792BarAgrNhdr));
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", GXutil.rtrim( A13695BarAGrHdr));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV55Wckgcol',fld:'vWCKGCOL',pic:'9',hsh:true},{av:'AV74DelAll',fld:'vDELALL',pic:'9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12092',iparms:[{av:'AV55Wckgcol',fld:'vWCKGCOL',pic:'9',hsh:true},{av:'AV74DelAll',fld:'vDELALL',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[{av:'h180BarMaqCod'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''}]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'h180BarMaqCod'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'AV74DelAll',fld:'vDELALL',pic:'9'},{av:'AV55Wckgcol',fld:'vWCKGCOL',pic:'9'},{av:'h252CliCod'},{av:'h180BarMaqCod'},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A236BarVolMaq',fld:'BARVOLMAQ',pic:'ZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A401EmprCodVi',fld:'EMPRCODVI',pic:'@!'},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A13846BarAgrCant',fld:'BARAGRCANT',pic:'ZZZ,ZZ9.99'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z143BarDisNum'},{av:'Z120BarAgrEst'},{av:'Z180BarMaqCod'},{av:'Z236BarVolMaq'},{av:'Z213BarSit'},{av:'Z212BarSer'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z365DisDes'},{av:'Z401EmprCodVi'},{av:'Z478FindVolMax'},{av:'Z479FindVolMed'},{av:'Z480FindVolMin'},{av:'Z13846BarAgrCant'},{av:'Z2759BarMaqGru'},{av:'O13846BarAgrCant'},{ctrl:'BTNTRN_DELETE',prop:'Enabled'},{ctrl:'BTNTRN_ENTER',prop:'Enabled'},{av:'h180BarMaqCod'},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_EMPRCODVI","{handler:'valid_Emprcodvi',iparms:[]");
      setEventMetadata("VALID_EMPRCODVI",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A401EmprCodVi',fld:'EMPRCODVI',pic:'@!'},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A474FindBarAgr',fld:'FINDBARAGR',pic:'@!'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''}]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'A474FindBarAgr',fld:'FINDBARAGR',pic:'@!'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''}]}");
      setEventMetadata("VALID_BARAGRNDES","{handler:'valid_Baragrndes',iparms:[]");
      setEventMetadata("VALID_BARAGRNDES",",oparms:[]}");
      setEventMetadata("VALID_BARPNDES","{handler:'valid_Barpndes',iparms:[]");
      setEventMetadata("VALID_BARPNDES",",oparms:[]}");
      setEventMetadata("VALID_FINDDES","{handler:'valid_Finddes',iparms:[]");
      setEventMetadata("VALID_FINDDES",",oparms:[]}");
      setEventMetadata("VALID_KGMAGR","{handler:'valid_Kgmagr',iparms:[]");
      setEventMetadata("VALID_KGMAGR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baragrnhdr',iparms:[]");
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
      pr_default.close(103);
      pr_default.close(104);
      pr_default.close(105);
      pr_default.close(113);
      pr_default.close(111);
      pr_default.close(27);
      pr_default.close(114);
      pr_default.close(30);
      pr_default.close(118);
      pr_default.close(29);
      pr_default.close(116);
      pr_default.close(112);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z143BarDisNum = "" ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      O13846BarAgrCant = DecimalUtil.ZERO ;
      Z122BarAgrPar = "" ;
      Z590KgmAgr = DecimalUtil.ZERO ;
      Z869MtrAgr = DecimalUtil.ZERO ;
      Z1245BarAgrSer = "" ;
      Z1507BarAgrDsc = "" ;
      Z1510ColNomAgr = "" ;
      Z1509ColNoCAgr = "" ;
      Z1649BarAgrDNu = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13734MaqCDsc = "" ;
      A13735CliCNom = "" ;
      h180BarMaqCod = "" ;
      h252CliCod = "" ;
      A130BarCodPar = "" ;
      A180BarMaqCod = "" ;
      A122BarAgrPar = "" ;
      A401EmprCodVi = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A143BarDisNum = "" ;
      A13846BarAgrCant = DecimalUtil.ZERO ;
      sStyleString = "" ;
      lblTextblockbarcod_Jsonclick = "" ;
      lblTextblockbarcodreo_Jsonclick = "" ;
      lblTextblockbarcodpar_Jsonclick = "" ;
      lblTextblockbarmaqcod_Jsonclick = "" ;
      lblTextblockbarvolmaq_Jsonclick = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A120BarAgrEst = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B13846BarAgrCant = DecimalUtil.ZERO ;
      sMode13 = "" ;
      A2759BarMaqGru = "" ;
      A365DisDes = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s13846BarAgrCant = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1245BarAgrSer = "" ;
      A1510ColNomAgr = "" ;
      A121BarAgrKgm = DecimalUtil.ZERO ;
      A868BarAgrMtr = DecimalUtil.ZERO ;
      A1653FindDes = "" ;
      A474FindBarAgr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1507BarAgrDsc = "" ;
      A1509ColNoCAgr = "" ;
      A1649BarAgrDNu = "" ;
      A13695BarAGrHdr = "" ;
      A13792BarAgrNhdr = "" ;
      AV20Lit0 = "" ;
      AV36LitFe = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV30Lit10 = "" ;
      AV37Lit11 = "" ;
      AV38Lit12 = "" ;
      AV39Lit13 = "" ;
      AV40Lit14 = "" ;
      AV41Lit15 = "" ;
      AV42Lit16 = "" ;
      AV43Lit17 = "" ;
      AV44Lit18 = "" ;
      AV59Lit19 = "" ;
      AV62Lit20 = "" ;
      AV63Lit21 = "" ;
      AV66Lit22 = "" ;
      AV31msg0 = "" ;
      AV32msg1 = "" ;
      AV33msg2 = "" ;
      AV34msg3 = "" ;
      AV35msg4 = "" ;
      AV67msg5 = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      AV75BuscarEmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z13846BarAgrCant = DecimalUtil.ZERO ;
      T000917_A361DisCod = new int[1] ;
      T000917_A2759BarMaqGru = new String[] {""} ;
      T000917_A129BarCod = new int[1] ;
      T000917_n129BarCod = new boolean[] {false} ;
      T000917_A132BarCodReo = new byte[1] ;
      T000917_n132BarCodReo = new boolean[] {false} ;
      T000917_A130BarCodPar = new String[] {""} ;
      T000917_n130BarCodPar = new boolean[] {false} ;
      T000917_A407EmprNom = new String[] {""} ;
      T000917_n407EmprNom = new boolean[] {false} ;
      T000917_A143BarDisNum = new String[] {""} ;
      T000917_A120BarAgrEst = new String[] {""} ;
      T000917_A180BarMaqCod = new String[] {""} ;
      T000917_A236BarVolMaq = new int[1] ;
      T000917_A213BarSit = new byte[1] ;
      T000917_A252CliCod = new int[1] ;
      T000917_n252CliCod = new boolean[] {false} ;
      T000917_A212BarSer = new String[] {""} ;
      T000917_A135BarColNom = new String[] {""} ;
      T000917_A136BarColNum = new int[1] ;
      T000917_A365DisDes = new String[] {""} ;
      T000917_A396EmprCod = new String[] {""} ;
      T000917_n396EmprCod = new boolean[] {false} ;
      T000917_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000917_n13846BarAgrCant = new boolean[] {false} ;
      T000911_A252CliCod = new int[1] ;
      T000911_n252CliCod = new boolean[] {false} ;
      T000911_A365DisDes = new String[] {""} ;
      T000913_A478FindVolMax = new int[1] ;
      T000913_A479FindVolMed = new int[1] ;
      T000913_A480FindVolMin = new int[1] ;
      T000918_A13734MaqCDsc = new String[] {""} ;
      T000918_A396EmprCod = new String[] {""} ;
      T000918_n396EmprCod = new boolean[] {false} ;
      T000918_A602MaqCod = new String[] {""} ;
      T000919_A13735CliCNom = new String[] {""} ;
      T000919_A396EmprCod = new String[] {""} ;
      T000919_n396EmprCod = new boolean[] {false} ;
      T000919_A252CliCod = new int[1] ;
      T000919_n252CliCod = new boolean[] {false} ;
      T000920_A13735CliCNom = new String[] {""} ;
      T000920_A396EmprCod = new String[] {""} ;
      T000920_n396EmprCod = new boolean[] {false} ;
      T000920_A252CliCod = new int[1] ;
      T000920_n252CliCod = new boolean[] {false} ;
      T000910_A407EmprNom = new String[] {""} ;
      T000910_n407EmprNom = new boolean[] {false} ;
      T000921_A13735CliCNom = new String[] {""} ;
      T000921_A396EmprCod = new String[] {""} ;
      T000921_n396EmprCod = new boolean[] {false} ;
      T000921_A252CliCod = new int[1] ;
      T000921_n252CliCod = new boolean[] {false} ;
      T000915_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000915_n13846BarAgrCant = new boolean[] {false} ;
      T000922_A407EmprNom = new String[] {""} ;
      T000922_n407EmprNom = new boolean[] {false} ;
      T000923_A252CliCod = new int[1] ;
      T000923_n252CliCod = new boolean[] {false} ;
      T000923_A365DisDes = new String[] {""} ;
      T000925_A478FindVolMax = new int[1] ;
      T000925_A479FindVolMed = new int[1] ;
      T000925_A480FindVolMin = new int[1] ;
      T000927_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000927_n13846BarAgrCant = new boolean[] {false} ;
      T000928_A396EmprCod = new String[] {""} ;
      T000928_n396EmprCod = new boolean[] {false} ;
      T000928_A129BarCod = new int[1] ;
      T000928_n129BarCod = new boolean[] {false} ;
      T000928_A132BarCodReo = new byte[1] ;
      T000928_n132BarCodReo = new boolean[] {false} ;
      T000928_A130BarCodPar = new String[] {""} ;
      T000928_n130BarCodPar = new boolean[] {false} ;
      T00099_A361DisCod = new int[1] ;
      T00099_A2759BarMaqGru = new String[] {""} ;
      T00099_A129BarCod = new int[1] ;
      T00099_n129BarCod = new boolean[] {false} ;
      T00099_A132BarCodReo = new byte[1] ;
      T00099_n132BarCodReo = new boolean[] {false} ;
      T00099_A130BarCodPar = new String[] {""} ;
      T00099_n130BarCodPar = new boolean[] {false} ;
      T00099_A143BarDisNum = new String[] {""} ;
      T00099_A120BarAgrEst = new String[] {""} ;
      T00099_A180BarMaqCod = new String[] {""} ;
      T00099_A236BarVolMaq = new int[1] ;
      T00099_A213BarSit = new byte[1] ;
      T00099_A212BarSer = new String[] {""} ;
      T00099_A135BarColNom = new String[] {""} ;
      T00099_A136BarColNum = new int[1] ;
      T00099_A396EmprCod = new String[] {""} ;
      T00099_n396EmprCod = new boolean[] {false} ;
      T00099_A252CliCod = new int[1] ;
      T00099_n252CliCod = new boolean[] {false} ;
      T00099_A365DisDes = new String[] {""} ;
      sMode12 = "" ;
      T000929_A396EmprCod = new String[] {""} ;
      T000929_n396EmprCod = new boolean[] {false} ;
      T000929_A129BarCod = new int[1] ;
      T000929_n129BarCod = new boolean[] {false} ;
      T000929_A132BarCodReo = new byte[1] ;
      T000929_n132BarCodReo = new boolean[] {false} ;
      T000929_A130BarCodPar = new String[] {""} ;
      T000929_n130BarCodPar = new boolean[] {false} ;
      T000930_A396EmprCod = new String[] {""} ;
      T000930_n396EmprCod = new boolean[] {false} ;
      T000930_A129BarCod = new int[1] ;
      T000930_n129BarCod = new boolean[] {false} ;
      T000930_A132BarCodReo = new byte[1] ;
      T000930_n132BarCodReo = new boolean[] {false} ;
      T000930_A130BarCodPar = new String[] {""} ;
      T000930_n130BarCodPar = new boolean[] {false} ;
      T000931_A13735CliCNom = new String[] {""} ;
      T000931_A396EmprCod = new String[] {""} ;
      T000931_n396EmprCod = new boolean[] {false} ;
      T000931_A252CliCod = new int[1] ;
      T000931_n252CliCod = new boolean[] {false} ;
      T00098_A361DisCod = new int[1] ;
      T00098_A2759BarMaqGru = new String[] {""} ;
      T00098_A129BarCod = new int[1] ;
      T00098_n129BarCod = new boolean[] {false} ;
      T00098_A132BarCodReo = new byte[1] ;
      T00098_n132BarCodReo = new boolean[] {false} ;
      T00098_A130BarCodPar = new String[] {""} ;
      T00098_n130BarCodPar = new boolean[] {false} ;
      T00098_A143BarDisNum = new String[] {""} ;
      T00098_A120BarAgrEst = new String[] {""} ;
      T00098_A180BarMaqCod = new String[] {""} ;
      T00098_A236BarVolMaq = new int[1] ;
      T00098_A213BarSit = new byte[1] ;
      T00098_A212BarSer = new String[] {""} ;
      T00098_A135BarColNom = new String[] {""} ;
      T00098_A136BarColNum = new int[1] ;
      T00098_A396EmprCod = new String[] {""} ;
      T00098_n396EmprCod = new boolean[] {false} ;
      T00098_A252CliCod = new int[1] ;
      T00098_n252CliCod = new boolean[] {false} ;
      T00098_A365DisDes = new String[] {""} ;
      T000935_A407EmprNom = new String[] {""} ;
      T000935_n407EmprNom = new boolean[] {false} ;
      T000937_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000937_n13846BarAgrCant = new boolean[] {false} ;
      T000939_A478FindVolMax = new int[1] ;
      T000939_A479FindVolMed = new int[1] ;
      T000939_A480FindVolMin = new int[1] ;
      T000940_A252CliCod = new int[1] ;
      T000940_n252CliCod = new boolean[] {false} ;
      T000940_A365DisDes = new String[] {""} ;
      T000941_A14681MRPrId = new long[1] ;
      T000942_A5921XCjaDis = new String[] {""} ;
      T000942_A5922XCjaCod = new long[1] ;
      T000943_A396EmprCod = new String[] {""} ;
      T000943_n396EmprCod = new boolean[] {false} ;
      T000943_A129BarCod = new int[1] ;
      T000943_n129BarCod = new boolean[] {false} ;
      T000943_A132BarCodReo = new byte[1] ;
      T000943_n132BarCodReo = new boolean[] {false} ;
      T000943_A130BarCodPar = new String[] {""} ;
      T000943_n130BarCodPar = new boolean[] {false} ;
      T000943_A14152MEnvOrd = new short[1] ;
      T000944_A396EmprCod = new String[] {""} ;
      T000944_n396EmprCod = new boolean[] {false} ;
      T000944_A129BarCod = new int[1] ;
      T000944_n129BarCod = new boolean[] {false} ;
      T000944_A132BarCodReo = new byte[1] ;
      T000944_n132BarCodReo = new boolean[] {false} ;
      T000944_A130BarCodPar = new String[] {""} ;
      T000944_n130BarCodPar = new boolean[] {false} ;
      T000944_A13905BarTraID = new String[] {""} ;
      T000945_A396EmprCod = new String[] {""} ;
      T000945_n396EmprCod = new boolean[] {false} ;
      T000945_A129BarCod = new int[1] ;
      T000945_n129BarCod = new boolean[] {false} ;
      T000945_A132BarCodReo = new byte[1] ;
      T000945_n132BarCodReo = new boolean[] {false} ;
      T000945_A130BarCodPar = new String[] {""} ;
      T000945_n130BarCodPar = new boolean[] {false} ;
      T000945_A13093BarDGLin = new byte[1] ;
      T000945_A13094BarDGDibCl = new String[] {""} ;
      T000945_A13095BarDGDibIn = new int[1] ;
      T000945_A13096BarDGComb = new String[] {""} ;
      T000945_A13097BarDGFOndo = new String[] {""} ;
      T000946_A396EmprCod = new String[] {""} ;
      T000946_n396EmprCod = new boolean[] {false} ;
      T000946_A11917Ebd_numero = new int[1] ;
      T000947_A396EmprCod = new String[] {""} ;
      T000947_n396EmprCod = new boolean[] {false} ;
      T000947_A11898Prd_numero = new int[1] ;
      T000948_A396EmprCod = new String[] {""} ;
      T000948_n396EmprCod = new boolean[] {false} ;
      T000948_A11849Cte_numero = new int[1] ;
      T000949_A396EmprCod = new String[] {""} ;
      T000949_n396EmprCod = new boolean[] {false} ;
      T000949_A11791Ap_numero = new int[1] ;
      T000950_A396EmprCod = new String[] {""} ;
      T000950_n396EmprCod = new boolean[] {false} ;
      T000950_A3985CalBarCod = new int[1] ;
      T000950_A3986CalBarCodR = new byte[1] ;
      T000950_A3987CalBarCodP = new String[] {""} ;
      T000951_A396EmprCod = new String[] {""} ;
      T000951_n396EmprCod = new boolean[] {false} ;
      T000951_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T000951_A652OpeCod = new int[1] ;
      T000952_A396EmprCod = new String[] {""} ;
      T000952_n396EmprCod = new boolean[] {false} ;
      T000952_A129BarCod = new int[1] ;
      T000952_n129BarCod = new boolean[] {false} ;
      T000952_A132BarCodReo = new byte[1] ;
      T000952_n132BarCodReo = new boolean[] {false} ;
      T000952_A130BarCodPar = new String[] {""} ;
      T000952_n130BarCodPar = new boolean[] {false} ;
      T000952_A4118tinagrcod = new int[1] ;
      T000952_A4119tinagrreo = new byte[1] ;
      T000952_A4120tinagrpar = new String[] {""} ;
      T000953_A396EmprCod = new String[] {""} ;
      T000953_n396EmprCod = new boolean[] {false} ;
      T000953_A129BarCod = new int[1] ;
      T000953_n129BarCod = new boolean[] {false} ;
      T000953_A132BarCodReo = new byte[1] ;
      T000953_n132BarCodReo = new boolean[] {false} ;
      T000953_A130BarCodPar = new String[] {""} ;
      T000953_n130BarCodPar = new boolean[] {false} ;
      T000953_A4080estagrcod = new int[1] ;
      T000953_A4081estagrreo = new byte[1] ;
      T000953_A4082estagrpar = new String[] {""} ;
      T000954_A396EmprCod = new String[] {""} ;
      T000954_n396EmprCod = new boolean[] {false} ;
      T000954_A129BarCod = new int[1] ;
      T000954_n129BarCod = new boolean[] {false} ;
      T000954_A132BarCodReo = new byte[1] ;
      T000954_n132BarCodReo = new boolean[] {false} ;
      T000954_A130BarCodPar = new String[] {""} ;
      T000954_n130BarCodPar = new boolean[] {false} ;
      T000954_A4075recestncol = new byte[1] ;
      T000954_A4076recestnpro = new byte[1] ;
      T000955_A396EmprCod = new String[] {""} ;
      T000955_n396EmprCod = new boolean[] {false} ;
      T000955_A602MaqCod = new String[] {""} ;
      T000955_A1142MaqFCod = new String[] {""} ;
      T000955_A3068PlaEtaOrd = new short[1] ;
      T000955_A3069PlaEtaOrdA = new byte[1] ;
      T000955_A129BarCod = new int[1] ;
      T000955_n129BarCod = new boolean[] {false} ;
      T000955_A132BarCodReo = new byte[1] ;
      T000955_n132BarCodReo = new boolean[] {false} ;
      T000955_A130BarCodPar = new String[] {""} ;
      T000955_n130BarCodPar = new boolean[] {false} ;
      T000956_A396EmprCod = new String[] {""} ;
      T000956_n396EmprCod = new boolean[] {false} ;
      T000956_A129BarCod = new int[1] ;
      T000956_n129BarCod = new boolean[] {false} ;
      T000956_A132BarCodReo = new byte[1] ;
      T000956_n132BarCodReo = new boolean[] {false} ;
      T000956_A130BarCodPar = new String[] {""} ;
      T000956_n130BarCodPar = new boolean[] {false} ;
      T000956_A4846BarAudLin = new short[1] ;
      T000957_A396EmprCod = new String[] {""} ;
      T000957_n396EmprCod = new boolean[] {false} ;
      T000957_A129BarCod = new int[1] ;
      T000957_n129BarCod = new boolean[] {false} ;
      T000957_A132BarCodReo = new byte[1] ;
      T000957_n132BarCodReo = new boolean[] {false} ;
      T000957_A130BarCodPar = new String[] {""} ;
      T000957_n130BarCodPar = new boolean[] {false} ;
      T000957_A3940BarEnsLin = new short[1] ;
      T000958_A396EmprCod = new String[] {""} ;
      T000958_n396EmprCod = new boolean[] {false} ;
      T000958_A129BarCod = new int[1] ;
      T000958_n129BarCod = new boolean[] {false} ;
      T000958_A132BarCodReo = new byte[1] ;
      T000958_n132BarCodReo = new boolean[] {false} ;
      T000958_A130BarCodPar = new String[] {""} ;
      T000958_n130BarCodPar = new boolean[] {false} ;
      T000958_A3384RefBarCod = new int[1] ;
      T000958_A3385RefBarReo = new byte[1] ;
      T000958_A3386RefBarPar = new String[] {""} ;
      T000959_A396EmprCod = new String[] {""} ;
      T000959_n396EmprCod = new boolean[] {false} ;
      T000959_A10914SolSalCod = new int[1] ;
      T000960_A396EmprCod = new String[] {""} ;
      T000960_n396EmprCod = new boolean[] {false} ;
      T000960_A10364Ph_numero = new int[1] ;
      T000961_A396EmprCod = new String[] {""} ;
      T000961_n396EmprCod = new boolean[] {false} ;
      T000961_A129BarCod = new int[1] ;
      T000961_n129BarCod = new boolean[] {false} ;
      T000961_A132BarCodReo = new byte[1] ;
      T000961_n132BarCodReo = new boolean[] {false} ;
      T000961_A130BarCodPar = new String[] {""} ;
      T000961_n130BarCodPar = new boolean[] {false} ;
      T000961_A10197ProEspCod = new String[] {""} ;
      T000962_A396EmprCod = new String[] {""} ;
      T000962_n396EmprCod = new boolean[] {false} ;
      T000962_A129BarCod = new int[1] ;
      T000962_n129BarCod = new boolean[] {false} ;
      T000962_A132BarCodReo = new byte[1] ;
      T000962_n132BarCodReo = new boolean[] {false} ;
      T000962_A130BarCodPar = new String[] {""} ;
      T000962_n130BarCodPar = new boolean[] {false} ;
      T000962_A5322Dp_Nrecep = new int[1] ;
      T000963_A396EmprCod = new String[] {""} ;
      T000963_n396EmprCod = new boolean[] {false} ;
      T000963_A129BarCod = new int[1] ;
      T000963_n129BarCod = new boolean[] {false} ;
      T000963_A132BarCodReo = new byte[1] ;
      T000963_n132BarCodReo = new boolean[] {false} ;
      T000963_A130BarCodPar = new String[] {""} ;
      T000963_n130BarCodPar = new boolean[] {false} ;
      T000963_A8569EntSecLn = new int[1] ;
      T000964_A396EmprCod = new String[] {""} ;
      T000964_n396EmprCod = new boolean[] {false} ;
      T000964_A7434PLLNro = new int[1] ;
      T000964_A7443LPLNro = new short[1] ;
      T000964_A7459CPLCom = new short[1] ;
      T000964_A129BarCod = new int[1] ;
      T000964_n129BarCod = new boolean[] {false} ;
      T000964_A132BarCodReo = new byte[1] ;
      T000964_n132BarCodReo = new boolean[] {false} ;
      T000964_A130BarCodPar = new String[] {""} ;
      T000964_n130BarCodPar = new boolean[] {false} ;
      T000965_A396EmprCod = new String[] {""} ;
      T000965_n396EmprCod = new boolean[] {false} ;
      T000965_A7145OSSCod = new int[1] ;
      T000966_A396EmprCod = new String[] {""} ;
      T000966_n396EmprCod = new boolean[] {false} ;
      T000966_A7049OGSCod = new int[1] ;
      T000967_A396EmprCod = new String[] {""} ;
      T000967_n396EmprCod = new boolean[] {false} ;
      T000967_A129BarCod = new int[1] ;
      T000967_n129BarCod = new boolean[] {false} ;
      T000967_A132BarCodReo = new byte[1] ;
      T000967_n132BarCodReo = new boolean[] {false} ;
      T000967_A130BarCodPar = new String[] {""} ;
      T000967_n130BarCodPar = new boolean[] {false} ;
      T000967_A6031Ac_Barcod = new int[1] ;
      T000967_A6032Ac_BarReo = new byte[1] ;
      T000967_A6033Ac_BarPar = new String[] {""} ;
      T000968_A396EmprCod = new String[] {""} ;
      T000968_n396EmprCod = new boolean[] {false} ;
      T000968_A129BarCod = new int[1] ;
      T000968_n129BarCod = new boolean[] {false} ;
      T000968_A132BarCodReo = new byte[1] ;
      T000968_n132BarCodReo = new boolean[] {false} ;
      T000968_A130BarCodPar = new String[] {""} ;
      T000968_n130BarCodPar = new boolean[] {false} ;
      T000968_A5908PartPal = new int[1] ;
      T000969_A396EmprCod = new String[] {""} ;
      T000969_n396EmprCod = new boolean[] {false} ;
      T000969_A129BarCod = new int[1] ;
      T000969_n129BarCod = new boolean[] {false} ;
      T000969_A132BarCodReo = new byte[1] ;
      T000969_n132BarCodReo = new boolean[] {false} ;
      T000969_A130BarCodPar = new String[] {""} ;
      T000969_n130BarCodPar = new boolean[] {false} ;
      T000969_A2524DisComLin = new byte[1] ;
      T000969_A1056DisComCod = new String[] {""} ;
      T000969_A1032FonCod = new String[] {""} ;
      T000970_A396EmprCod = new String[] {""} ;
      T000970_n396EmprCod = new boolean[] {false} ;
      T000970_A1736AlbExtCod = new long[1] ;
      T000970_A129BarCod = new int[1] ;
      T000970_n129BarCod = new boolean[] {false} ;
      T000970_A132BarCodReo = new byte[1] ;
      T000970_n132BarCodReo = new boolean[] {false} ;
      T000970_A130BarCodPar = new String[] {""} ;
      T000970_n130BarCodPar = new boolean[] {false} ;
      T000971_A396EmprCod = new String[] {""} ;
      T000971_n396EmprCod = new boolean[] {false} ;
      T000971_A129BarCod = new int[1] ;
      T000971_n129BarCod = new boolean[] {false} ;
      T000971_A132BarCodReo = new byte[1] ;
      T000971_n132BarCodReo = new boolean[] {false} ;
      T000971_A130BarCodPar = new String[] {""} ;
      T000971_n130BarCodPar = new boolean[] {false} ;
      T000971_A3753BarFoaCod = new int[1] ;
      T000971_A3754BarFoaReo = new byte[1] ;
      T000971_A3755BarFoaPar = new String[] {""} ;
      T000972_A396EmprCod = new String[] {""} ;
      T000972_n396EmprCod = new boolean[] {false} ;
      T000972_A129BarCod = new int[1] ;
      T000972_n129BarCod = new boolean[] {false} ;
      T000972_A132BarCodReo = new byte[1] ;
      T000972_n132BarCodReo = new boolean[] {false} ;
      T000972_A130BarCodPar = new String[] {""} ;
      T000972_n130BarCodPar = new boolean[] {false} ;
      T000972_A3747BarPegCod = new int[1] ;
      T000972_A3748BarPegReo = new byte[1] ;
      T000972_A3749BarPegPar = new String[] {""} ;
      T000973_A396EmprCod = new String[] {""} ;
      T000973_n396EmprCod = new boolean[] {false} ;
      T000973_A3253SolTraCod = new int[1] ;
      T000974_A396EmprCod = new String[] {""} ;
      T000974_n396EmprCod = new boolean[] {false} ;
      T000974_A3235SolSubCod = new int[1] ;
      T000975_A396EmprCod = new String[] {""} ;
      T000975_n396EmprCod = new boolean[] {false} ;
      T000975_A3218SolLuzCod = new int[1] ;
      T000976_A396EmprCod = new String[] {""} ;
      T000976_n396EmprCod = new boolean[] {false} ;
      T000976_A3196SolFriCod = new int[1] ;
      T000977_A396EmprCod = new String[] {""} ;
      T000977_n396EmprCod = new boolean[] {false} ;
      T000977_A3165SolPilCod = new int[1] ;
      T000978_A396EmprCod = new String[] {""} ;
      T000978_n396EmprCod = new boolean[] {false} ;
      T000978_A129BarCod = new int[1] ;
      T000978_n129BarCod = new boolean[] {false} ;
      T000978_A132BarCodReo = new byte[1] ;
      T000978_n132BarCodReo = new boolean[] {false} ;
      T000978_A130BarCodPar = new String[] {""} ;
      T000978_n130BarCodPar = new boolean[] {false} ;
      T000978_A2872HAnRLinMaq = new short[1] ;
      T000978_A2873HAnRLinPro = new byte[1] ;
      T000978_A2874HAnRLin = new short[1] ;
      T000978_A2875HAnNumAny = new byte[1] ;
      T000979_A396EmprCod = new String[] {""} ;
      T000979_n396EmprCod = new boolean[] {false} ;
      T000979_A2817PlaTer = new String[] {""} ;
      T000979_A2818PlaOrd = new short[1] ;
      T000980_A396EmprCod = new String[] {""} ;
      T000980_n396EmprCod = new boolean[] {false} ;
      T000980_A2809MetTerCod = new String[] {""} ;
      T000980_A129BarCod = new int[1] ;
      T000980_n129BarCod = new boolean[] {false} ;
      T000980_A132BarCodReo = new byte[1] ;
      T000980_n132BarCodReo = new boolean[] {false} ;
      T000980_A130BarCodPar = new String[] {""} ;
      T000980_n130BarCodPar = new boolean[] {false} ;
      T000981_A396EmprCod = new String[] {""} ;
      T000981_n396EmprCod = new boolean[] {false} ;
      T000981_A129BarCod = new int[1] ;
      T000981_n129BarCod = new boolean[] {false} ;
      T000981_A132BarCodReo = new byte[1] ;
      T000981_n132BarCodReo = new boolean[] {false} ;
      T000981_A130BarCodPar = new String[] {""} ;
      T000981_n130BarCodPar = new boolean[] {false} ;
      T000981_A2808RecLinMAL = new short[1] ;
      T000981_A1377RecNumAny = new byte[1] ;
      T000981_A719PrdNum = new String[] {""} ;
      T000982_A396EmprCod = new String[] {""} ;
      T000982_n396EmprCod = new boolean[] {false} ;
      T000982_A129BarCod = new int[1] ;
      T000982_n129BarCod = new boolean[] {false} ;
      T000982_A132BarCodReo = new byte[1] ;
      T000982_n132BarCodReo = new boolean[] {false} ;
      T000982_A130BarCodPar = new String[] {""} ;
      T000982_n130BarCodPar = new boolean[] {false} ;
      T000982_A2804RecLinMaq = new short[1] ;
      T000983_A396EmprCod = new String[] {""} ;
      T000983_n396EmprCod = new boolean[] {false} ;
      T000983_A2792TermiCod = new String[] {""} ;
      T000983_A129BarCod = new int[1] ;
      T000983_n129BarCod = new boolean[] {false} ;
      T000983_A132BarCodReo = new byte[1] ;
      T000983_n132BarCodReo = new boolean[] {false} ;
      T000983_A130BarCodPar = new String[] {""} ;
      T000983_n130BarCodPar = new boolean[] {false} ;
      T000984_A396EmprCod = new String[] {""} ;
      T000984_n396EmprCod = new boolean[] {false} ;
      T000984_A2248ManCod = new short[1] ;
      T000984_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T000984_A2713RpExHdLi = new short[1] ;
      T000985_A396EmprCod = new String[] {""} ;
      T000985_n396EmprCod = new boolean[] {false} ;
      T000985_A2248ManCod = new short[1] ;
      T000985_A2689ExHdrFas = new String[] {""} ;
      T000985_A2692ExHdrLin = new int[1] ;
      T000986_A396EmprCod = new String[] {""} ;
      T000986_n396EmprCod = new boolean[] {false} ;
      T000986_A129BarCod = new int[1] ;
      T000986_n129BarCod = new boolean[] {false} ;
      T000986_A132BarCodReo = new byte[1] ;
      T000986_n132BarCodReo = new boolean[] {false} ;
      T000986_A130BarCodPar = new String[] {""} ;
      T000986_n130BarCodPar = new boolean[] {false} ;
      T000986_A2494BarDosPro = new String[] {""} ;
      T000986_A719PrdNum = new String[] {""} ;
      T000987_A396EmprCod = new String[] {""} ;
      T000987_n396EmprCod = new boolean[] {false} ;
      T000987_A602MaqCod = new String[] {""} ;
      T000987_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T000987_A129BarCod = new int[1] ;
      T000987_n129BarCod = new boolean[] {false} ;
      T000987_A132BarCodReo = new byte[1] ;
      T000987_n132BarCodReo = new boolean[] {false} ;
      T000987_A130BarCodPar = new String[] {""} ;
      T000987_n130BarCodPar = new boolean[] {false} ;
      T000988_A396EmprCod = new String[] {""} ;
      T000988_n396EmprCod = new boolean[] {false} ;
      T000988_A129BarCod = new int[1] ;
      T000988_n129BarCod = new boolean[] {false} ;
      T000988_A132BarCodReo = new byte[1] ;
      T000988_n132BarCodReo = new boolean[] {false} ;
      T000988_A130BarCodPar = new String[] {""} ;
      T000988_n130BarCodPar = new boolean[] {false} ;
      T000988_A2457BarObLin = new short[1] ;
      T000989_A396EmprCod = new String[] {""} ;
      T000989_n396EmprCod = new boolean[] {false} ;
      T000989_A129BarCod = new int[1] ;
      T000989_n129BarCod = new boolean[] {false} ;
      T000989_A132BarCodReo = new byte[1] ;
      T000989_n132BarCodReo = new boolean[] {false} ;
      T000989_A130BarCodPar = new String[] {""} ;
      T000989_n130BarCodPar = new boolean[] {false} ;
      T000989_A2444BarEnLin = new short[1] ;
      T000990_A396EmprCod = new String[] {""} ;
      T000990_n396EmprCod = new boolean[] {false} ;
      T000990_A2406ExhAlbCod = new int[1] ;
      T000990_A129BarCod = new int[1] ;
      T000990_n129BarCod = new boolean[] {false} ;
      T000990_A132BarCodReo = new byte[1] ;
      T000990_n132BarCodReo = new boolean[] {false} ;
      T000990_A130BarCodPar = new String[] {""} ;
      T000990_n130BarCodPar = new boolean[] {false} ;
      T000991_A396EmprCod = new String[] {""} ;
      T000991_n396EmprCod = new boolean[] {false} ;
      T000991_A2253SalExtAlb = new int[1] ;
      T000991_A129BarCod = new int[1] ;
      T000991_n129BarCod = new boolean[] {false} ;
      T000991_A132BarCodReo = new byte[1] ;
      T000991_n132BarCodReo = new boolean[] {false} ;
      T000991_A130BarCodPar = new String[] {""} ;
      T000991_n130BarCodPar = new boolean[] {false} ;
      T000992_A396EmprCod = new String[] {""} ;
      T000992_n396EmprCod = new boolean[] {false} ;
      T000992_A30AlbProCod = new long[1] ;
      T000992_A129BarCod = new int[1] ;
      T000992_n129BarCod = new boolean[] {false} ;
      T000992_A132BarCodReo = new byte[1] ;
      T000992_n132BarCodReo = new boolean[] {false} ;
      T000992_A130BarCodPar = new String[] {""} ;
      T000992_n130BarCodPar = new boolean[] {false} ;
      T000993_A396EmprCod = new String[] {""} ;
      T000993_n396EmprCod = new boolean[] {false} ;
      T000993_A1348SolColCod = new int[1] ;
      T000994_A396EmprCod = new String[] {""} ;
      T000994_n396EmprCod = new boolean[] {false} ;
      T000994_A1333EstDimCod = new int[1] ;
      T000995_A396EmprCod = new String[] {""} ;
      T000995_n396EmprCod = new boolean[] {false} ;
      T000995_A1314EnsLabCod = new int[1] ;
      T000996_A396EmprCod = new String[] {""} ;
      T000996_n396EmprCod = new boolean[] {false} ;
      T000996_A129BarCod = new int[1] ;
      T000996_n129BarCod = new boolean[] {false} ;
      T000996_A132BarCodReo = new byte[1] ;
      T000996_n132BarCodReo = new boolean[] {false} ;
      T000996_A130BarCodPar = new String[] {""} ;
      T000996_n130BarCodPar = new boolean[] {false} ;
      T000996_A906ObsReoLin = new byte[1] ;
      T000997_A396EmprCod = new String[] {""} ;
      T000997_n396EmprCod = new boolean[] {false} ;
      T000997_A859CumCodCont = new int[1] ;
      T000998_A396EmprCod = new String[] {""} ;
      T000998_n396EmprCod = new boolean[] {false} ;
      T000998_A602MaqCod = new String[] {""} ;
      T000998_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000998_A561HisProLin = new int[1] ;
      T000999_A396EmprCod = new String[] {""} ;
      T000999_n396EmprCod = new boolean[] {false} ;
      T000999_A252CliCod = new int[1] ;
      T000999_n252CliCod = new boolean[] {false} ;
      T000999_A494ForSer = new String[] {""} ;
      T000999_A482ForColNom = new String[] {""} ;
      T000999_A483ForColNum = new int[1] ;
      T000999_A831TipColCod = new byte[1] ;
      T0009100_A396EmprCod = new String[] {""} ;
      T0009100_n396EmprCod = new boolean[] {false} ;
      T0009100_A129BarCod = new int[1] ;
      T0009100_n129BarCod = new boolean[] {false} ;
      T0009100_A132BarCodReo = new byte[1] ;
      T0009100_n132BarCodReo = new boolean[] {false} ;
      T0009100_A130BarCodPar = new String[] {""} ;
      T0009100_n130BarCodPar = new boolean[] {false} ;
      T0009100_A200BarPieCod = new String[] {""} ;
      T0009101_A396EmprCod = new String[] {""} ;
      T0009101_n396EmprCod = new boolean[] {false} ;
      T0009101_A129BarCod = new int[1] ;
      T0009101_n129BarCod = new boolean[] {false} ;
      T0009101_A132BarCodReo = new byte[1] ;
      T0009101_n132BarCodReo = new boolean[] {false} ;
      T0009101_A130BarCodPar = new String[] {""} ;
      T0009101_n130BarCodPar = new boolean[] {false} ;
      T0009101_A188BarNotLin = new byte[1] ;
      T0009102_A396EmprCod = new String[] {""} ;
      T0009102_n396EmprCod = new boolean[] {false} ;
      T0009102_A129BarCod = new int[1] ;
      T0009102_n129BarCod = new boolean[] {false} ;
      T0009102_A132BarCodReo = new byte[1] ;
      T0009102_n132BarCodReo = new boolean[] {false} ;
      T0009102_A130BarCodPar = new String[] {""} ;
      T0009102_n130BarCodPar = new boolean[] {false} ;
      T0009102_A758ProCod = new String[] {""} ;
      T0009104_A396EmprCod = new String[] {""} ;
      T0009104_n396EmprCod = new boolean[] {false} ;
      T0009104_A129BarCod = new int[1] ;
      T0009104_n129BarCod = new boolean[] {false} ;
      T0009104_A132BarCodReo = new byte[1] ;
      T0009104_n132BarCodReo = new boolean[] {false} ;
      T0009104_A130BarCodPar = new String[] {""} ;
      T0009104_n130BarCodPar = new boolean[] {false} ;
      Z474FindBarAgr = "" ;
      Z1653FindDes = "" ;
      T0009105_A129BarCod = new int[1] ;
      T0009105_n129BarCod = new boolean[] {false} ;
      T0009105_A132BarCodReo = new byte[1] ;
      T0009105_n132BarCodReo = new boolean[] {false} ;
      T0009105_A130BarCodPar = new String[] {""} ;
      T0009105_n130BarCodPar = new boolean[] {false} ;
      T0009105_A119BarAgrCod = new int[1] ;
      T0009105_A124BarAgrReo = new byte[1] ;
      T0009105_A122BarAgrPar = new String[] {""} ;
      T0009105_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009105_A671PieAgr = new short[1] ;
      T0009105_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009105_A1245BarAgrSer = new String[] {""} ;
      T0009105_A1507BarAgrDsc = new String[] {""} ;
      T0009105_A1508CliCodAgr = new int[1] ;
      T0009105_A1513DisCodAgr = new int[1] ;
      T0009105_A1510ColNomAgr = new String[] {""} ;
      T0009105_A1512ColNumAgr = new int[1] ;
      T0009105_A1509ColNoCAgr = new String[] {""} ;
      T0009105_A1511ColNuCAgr = new int[1] ;
      T0009105_A1649BarAgrDNu = new String[] {""} ;
      T0009105_A396EmprCod = new String[] {""} ;
      T0009105_n396EmprCod = new boolean[] {false} ;
      T0009105_A474FindBarAgr = new String[] {""} ;
      T0009105_n474FindBarAgr = new boolean[] {false} ;
      T0009105_A1653FindDes = new String[] {""} ;
      T0009105_n1653FindDes = new boolean[] {false} ;
      T00095_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00095_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00095_A1650BarAgrNDes = new short[1] ;
      T00095_A1651BarPNDes = new short[1] ;
      T00096_A474FindBarAgr = new String[] {""} ;
      T00096_n474FindBarAgr = new boolean[] {false} ;
      T00097_A1653FindDes = new String[] {""} ;
      T00097_n1653FindDes = new boolean[] {false} ;
      T0009107_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009107_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009107_A1650BarAgrNDes = new short[1] ;
      T0009107_A1651BarPNDes = new short[1] ;
      T0009108_A474FindBarAgr = new String[] {""} ;
      T0009108_n474FindBarAgr = new boolean[] {false} ;
      T0009109_A1653FindDes = new String[] {""} ;
      T0009109_n1653FindDes = new boolean[] {false} ;
      T0009110_A396EmprCod = new String[] {""} ;
      T0009110_n396EmprCod = new boolean[] {false} ;
      T0009110_A129BarCod = new int[1] ;
      T0009110_n129BarCod = new boolean[] {false} ;
      T0009110_A132BarCodReo = new byte[1] ;
      T0009110_n132BarCodReo = new boolean[] {false} ;
      T0009110_A130BarCodPar = new String[] {""} ;
      T0009110_n130BarCodPar = new boolean[] {false} ;
      T0009110_A119BarAgrCod = new int[1] ;
      T0009110_A124BarAgrReo = new byte[1] ;
      T0009110_A122BarAgrPar = new String[] {""} ;
      T00093_A129BarCod = new int[1] ;
      T00093_n129BarCod = new boolean[] {false} ;
      T00093_A132BarCodReo = new byte[1] ;
      T00093_n132BarCodReo = new boolean[] {false} ;
      T00093_A130BarCodPar = new String[] {""} ;
      T00093_n130BarCodPar = new boolean[] {false} ;
      T00093_A119BarAgrCod = new int[1] ;
      T00093_A124BarAgrReo = new byte[1] ;
      T00093_A122BarAgrPar = new String[] {""} ;
      T00093_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00093_A671PieAgr = new short[1] ;
      T00093_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00093_A1245BarAgrSer = new String[] {""} ;
      T00093_A1507BarAgrDsc = new String[] {""} ;
      T00093_A1508CliCodAgr = new int[1] ;
      T00093_A1513DisCodAgr = new int[1] ;
      T00093_A1510ColNomAgr = new String[] {""} ;
      T00093_A1512ColNumAgr = new int[1] ;
      T00093_A1509ColNoCAgr = new String[] {""} ;
      T00093_A1511ColNuCAgr = new int[1] ;
      T00093_A1649BarAgrDNu = new String[] {""} ;
      T00093_A396EmprCod = new String[] {""} ;
      T00093_n396EmprCod = new boolean[] {false} ;
      T00092_A129BarCod = new int[1] ;
      T00092_n129BarCod = new boolean[] {false} ;
      T00092_A132BarCodReo = new byte[1] ;
      T00092_n132BarCodReo = new boolean[] {false} ;
      T00092_A130BarCodPar = new String[] {""} ;
      T00092_n130BarCodPar = new boolean[] {false} ;
      T00092_A119BarAgrCod = new int[1] ;
      T00092_A124BarAgrReo = new byte[1] ;
      T00092_A122BarAgrPar = new String[] {""} ;
      T00092_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00092_A671PieAgr = new short[1] ;
      T00092_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00092_A1245BarAgrSer = new String[] {""} ;
      T00092_A1507BarAgrDsc = new String[] {""} ;
      T00092_A1508CliCodAgr = new int[1] ;
      T00092_A1513DisCodAgr = new int[1] ;
      T00092_A1510ColNomAgr = new String[] {""} ;
      T00092_A1512ColNumAgr = new int[1] ;
      T00092_A1509ColNoCAgr = new String[] {""} ;
      T00092_A1511ColNuCAgr = new int[1] ;
      T00092_A1649BarAgrDNu = new String[] {""} ;
      T00092_A396EmprCod = new String[] {""} ;
      T00092_n396EmprCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      T0009115_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009115_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009115_A1650BarAgrNDes = new short[1] ;
      T0009115_A1651BarPNDes = new short[1] ;
      T0009116_A474FindBarAgr = new String[] {""} ;
      T0009116_n474FindBarAgr = new boolean[] {false} ;
      T0009117_A1653FindDes = new String[] {""} ;
      T0009117_n1653FindDes = new boolean[] {false} ;
      T0009118_A396EmprCod = new String[] {""} ;
      T0009118_n396EmprCod = new boolean[] {false} ;
      T0009118_A129BarCod = new int[1] ;
      T0009118_n129BarCod = new boolean[] {false} ;
      T0009118_A132BarCodReo = new byte[1] ;
      T0009118_n132BarCodReo = new boolean[] {false} ;
      T0009118_A130BarCodPar = new String[] {""} ;
      T0009118_n130BarCodPar = new boolean[] {false} ;
      T0009118_A119BarAgrCod = new int[1] ;
      T0009118_A124BarAgrReo = new byte[1] ;
      T0009118_A122BarAgrPar = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13846BarAgrCant = DecimalUtil.ZERO ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13734MaqCDsc = "" ;
      T0009119_A13734MaqCDsc = new String[] {""} ;
      l13735CliCNom = "" ;
      T0009120_A13735CliCNom = new String[] {""} ;
      T0009121_A13734MaqCDsc = new String[] {""} ;
      T0009121_A396EmprCod = new String[] {""} ;
      T0009121_n396EmprCod = new boolean[] {false} ;
      T0009121_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      T0009122_A13735CliCNom = new String[] {""} ;
      T0009122_A396EmprCod = new String[] {""} ;
      T0009122_n396EmprCod = new boolean[] {false} ;
      T0009122_A252CliCod = new int[1] ;
      T0009122_n252CliCod = new boolean[] {false} ;
      T0009123_A407EmprNom = new String[] {""} ;
      T0009123_n407EmprNom = new boolean[] {false} ;
      T0009125_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009125_n13846BarAgrCant = new boolean[] {false} ;
      Z401EmprCodVi = "" ;
      T0009126_A407EmprNom = new String[] {""} ;
      T0009126_n407EmprNom = new boolean[] {false} ;
      T0009127_A252CliCod = new int[1] ;
      T0009127_n252CliCod = new boolean[] {false} ;
      T0009127_A365DisDes = new String[] {""} ;
      T0009128_A13735CliCNom = new String[] {""} ;
      T0009128_A396EmprCod = new String[] {""} ;
      T0009128_n396EmprCod = new boolean[] {false} ;
      T0009128_A252CliCod = new int[1] ;
      T0009128_n252CliCod = new boolean[] {false} ;
      T0009130_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T0009130_n13846BarAgrCant = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ143BarDisNum = "" ;
      ZZ120BarAgrEst = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ212BarSer = "" ;
      ZZ135BarColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ365DisDes = "" ;
      ZZ401EmprCodVi = "" ;
      ZZ13846BarAgrCant = DecimalUtil.ZERO ;
      ZZ2759BarMaqGru = "" ;
      ZO13846BarAgrCant = DecimalUtil.ZERO ;
      Zh180BarMaqCod = "" ;
      Zh252CliCod = "" ;
      T0009131_A13734MaqCDsc = new String[] {""} ;
      T0009131_A396EmprCod = new String[] {""} ;
      T0009131_n396EmprCod = new boolean[] {false} ;
      T0009131_A602MaqCod = new String[] {""} ;
      T0009133_A478FindVolMax = new int[1] ;
      T0009133_A479FindVolMed = new int[1] ;
      T0009133_A480FindVolMin = new int[1] ;
      Z121BarAgrKgm = DecimalUtil.ZERO ;
      Z868BarAgrMtr = DecimalUtil.ZERO ;
      Z13792BarAgrNhdr = "" ;
      Z13695BarAGrHdr = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbaragr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbaragr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbaragr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbaragr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbaragr__default(),
         new Object[] {
             new Object[] {
            T00092_A129BarCod, T00092_A132BarCodReo, T00092_A130BarCodPar, T00092_A119BarAgrCod, T00092_A124BarAgrReo, T00092_A122BarAgrPar, T00092_A590KgmAgr, T00092_A671PieAgr, T00092_A869MtrAgr, T00092_A1245BarAgrSer,
            T00092_A1507BarAgrDsc, T00092_A1508CliCodAgr, T00092_A1513DisCodAgr, T00092_A1510ColNomAgr, T00092_A1512ColNumAgr, T00092_A1509ColNoCAgr, T00092_A1511ColNuCAgr, T00092_A1649BarAgrDNu, T00092_A396EmprCod
            }
            , new Object[] {
            T00093_A129BarCod, T00093_A132BarCodReo, T00093_A130BarCodPar, T00093_A119BarAgrCod, T00093_A124BarAgrReo, T00093_A122BarAgrPar, T00093_A590KgmAgr, T00093_A671PieAgr, T00093_A869MtrAgr, T00093_A1245BarAgrSer,
            T00093_A1507BarAgrDsc, T00093_A1508CliCodAgr, T00093_A1513DisCodAgr, T00093_A1510ColNomAgr, T00093_A1512ColNumAgr, T00093_A1509ColNoCAgr, T00093_A1511ColNuCAgr, T00093_A1649BarAgrDNu, T00093_A396EmprCod
            }
            , new Object[] {
            T00095_A121BarAgrKgm, T00095_A868BarAgrMtr, T00095_A1650BarAgrNDes, T00095_A1651BarPNDes
            }
            , new Object[] {
            T00096_A474FindBarAgr, T00096_n474FindBarAgr
            }
            , new Object[] {
            T00097_A1653FindDes, T00097_n1653FindDes
            }
            , new Object[] {
            T00098_A361DisCod, T00098_A2759BarMaqGru, T00098_A129BarCod, T00098_A132BarCodReo, T00098_A130BarCodPar, T00098_A143BarDisNum, T00098_A120BarAgrEst, T00098_A180BarMaqCod, T00098_A236BarVolMaq, T00098_A213BarSit,
            T00098_A212BarSer, T00098_A135BarColNom, T00098_A136BarColNum, T00098_A396EmprCod, T00098_A252CliCod, T00098_n252CliCod, T00098_A365DisDes
            }
            , new Object[] {
            T00099_A361DisCod, T00099_A2759BarMaqGru, T00099_A129BarCod, T00099_A132BarCodReo, T00099_A130BarCodPar, T00099_A143BarDisNum, T00099_A120BarAgrEst, T00099_A180BarMaqCod, T00099_A236BarVolMaq, T00099_A213BarSit,
            T00099_A212BarSer, T00099_A135BarColNom, T00099_A136BarColNum, T00099_A396EmprCod, T00099_A252CliCod, T00099_n252CliCod, T00099_A365DisDes
            }
            , new Object[] {
            T000910_A407EmprNom, T000910_n407EmprNom
            }
            , new Object[] {
            T000911_A252CliCod, T000911_A365DisDes
            }
            , new Object[] {
            T000913_A478FindVolMax, T000913_A479FindVolMed, T000913_A480FindVolMin
            }
            , new Object[] {
            T000915_A13846BarAgrCant, T000915_n13846BarAgrCant
            }
            , new Object[] {
            T000917_A361DisCod, T000917_A2759BarMaqGru, T000917_A129BarCod, T000917_A132BarCodReo, T000917_A130BarCodPar, T000917_A407EmprNom, T000917_n407EmprNom, T000917_A143BarDisNum, T000917_A120BarAgrEst, T000917_A180BarMaqCod,
            T000917_A236BarVolMaq, T000917_A213BarSit, T000917_A252CliCod, T000917_n252CliCod, T000917_A212BarSer, T000917_A135BarColNom, T000917_A136BarColNum, T000917_A365DisDes, T000917_A396EmprCod, T000917_A13846BarAgrCant,
            T000917_n13846BarAgrCant
            }
            , new Object[] {
            T000918_A13734MaqCDsc, T000918_A396EmprCod, T000918_A602MaqCod
            }
            , new Object[] {
            T000919_A13735CliCNom, T000919_A396EmprCod, T000919_A252CliCod
            }
            , new Object[] {
            T000920_A13735CliCNom, T000920_A396EmprCod, T000920_A252CliCod
            }
            , new Object[] {
            T000921_A13735CliCNom, T000921_A396EmprCod, T000921_A252CliCod
            }
            , new Object[] {
            T000922_A407EmprNom, T000922_n407EmprNom
            }
            , new Object[] {
            T000923_A252CliCod, T000923_A365DisDes
            }
            , new Object[] {
            T000925_A478FindVolMax, T000925_A479FindVolMed, T000925_A480FindVolMin
            }
            , new Object[] {
            T000927_A13846BarAgrCant, T000927_n13846BarAgrCant
            }
            , new Object[] {
            T000928_A396EmprCod, T000928_A129BarCod, T000928_A132BarCodReo, T000928_A130BarCodPar
            }
            , new Object[] {
            T000929_A396EmprCod, T000929_A129BarCod, T000929_A132BarCodReo, T000929_A130BarCodPar
            }
            , new Object[] {
            T000930_A396EmprCod, T000930_A129BarCod, T000930_A132BarCodReo, T000930_A130BarCodPar
            }
            , new Object[] {
            T000931_A13735CliCNom, T000931_A396EmprCod, T000931_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000935_A407EmprNom, T000935_n407EmprNom
            }
            , new Object[] {
            T000937_A13846BarAgrCant, T000937_n13846BarAgrCant
            }
            , new Object[] {
            T000939_A478FindVolMax, T000939_A479FindVolMed, T000939_A480FindVolMin
            }
            , new Object[] {
            T000940_A252CliCod, T000940_A365DisDes
            }
            , new Object[] {
            T000941_A14681MRPrId
            }
            , new Object[] {
            T000942_A5921XCjaDis, T000942_A5922XCjaCod
            }
            , new Object[] {
            T000943_A396EmprCod, T000943_A129BarCod, T000943_A132BarCodReo, T000943_A130BarCodPar, T000943_A14152MEnvOrd
            }
            , new Object[] {
            T000944_A396EmprCod, T000944_A129BarCod, T000944_A132BarCodReo, T000944_A130BarCodPar, T000944_A13905BarTraID
            }
            , new Object[] {
            T000945_A396EmprCod, T000945_A129BarCod, T000945_A132BarCodReo, T000945_A130BarCodPar, T000945_A13093BarDGLin, T000945_A13094BarDGDibCl, T000945_A13095BarDGDibIn, T000945_A13096BarDGComb, T000945_A13097BarDGFOndo
            }
            , new Object[] {
            T000946_A396EmprCod, T000946_A11917Ebd_numero
            }
            , new Object[] {
            T000947_A396EmprCod, T000947_A11898Prd_numero
            }
            , new Object[] {
            T000948_A396EmprCod, T000948_A11849Cte_numero
            }
            , new Object[] {
            T000949_A396EmprCod, T000949_A11791Ap_numero
            }
            , new Object[] {
            T000950_A396EmprCod, T000950_A3985CalBarCod, T000950_A3986CalBarCodR, T000950_A3987CalBarCodP
            }
            , new Object[] {
            T000951_A396EmprCod, T000951_A5294InPTime, T000951_A652OpeCod
            }
            , new Object[] {
            T000952_A396EmprCod, T000952_A129BarCod, T000952_A132BarCodReo, T000952_A130BarCodPar, T000952_A4118tinagrcod, T000952_A4119tinagrreo, T000952_A4120tinagrpar
            }
            , new Object[] {
            T000953_A396EmprCod, T000953_A129BarCod, T000953_A132BarCodReo, T000953_A130BarCodPar, T000953_A4080estagrcod, T000953_A4081estagrreo, T000953_A4082estagrpar
            }
            , new Object[] {
            T000954_A396EmprCod, T000954_A129BarCod, T000954_A132BarCodReo, T000954_A130BarCodPar, T000954_A4075recestncol, T000954_A4076recestnpro
            }
            , new Object[] {
            T000955_A396EmprCod, T000955_A602MaqCod, T000955_A1142MaqFCod, T000955_A3068PlaEtaOrd, T000955_A3069PlaEtaOrdA, T000955_A129BarCod, T000955_A132BarCodReo, T000955_A130BarCodPar
            }
            , new Object[] {
            T000956_A396EmprCod, T000956_A129BarCod, T000956_A132BarCodReo, T000956_A130BarCodPar, T000956_A4846BarAudLin
            }
            , new Object[] {
            T000957_A396EmprCod, T000957_A129BarCod, T000957_A132BarCodReo, T000957_A130BarCodPar, T000957_A3940BarEnsLin
            }
            , new Object[] {
            T000958_A396EmprCod, T000958_A129BarCod, T000958_A132BarCodReo, T000958_A130BarCodPar, T000958_A3384RefBarCod, T000958_A3385RefBarReo, T000958_A3386RefBarPar
            }
            , new Object[] {
            T000959_A396EmprCod, T000959_A10914SolSalCod
            }
            , new Object[] {
            T000960_A396EmprCod, T000960_A10364Ph_numero
            }
            , new Object[] {
            T000961_A396EmprCod, T000961_A129BarCod, T000961_A132BarCodReo, T000961_A130BarCodPar, T000961_A10197ProEspCod
            }
            , new Object[] {
            T000962_A396EmprCod, T000962_A129BarCod, T000962_A132BarCodReo, T000962_A130BarCodPar, T000962_A5322Dp_Nrecep
            }
            , new Object[] {
            T000963_A396EmprCod, T000963_A129BarCod, T000963_A132BarCodReo, T000963_A130BarCodPar, T000963_A8569EntSecLn
            }
            , new Object[] {
            T000964_A396EmprCod, T000964_A7434PLLNro, T000964_A7443LPLNro, T000964_A7459CPLCom, T000964_A129BarCod, T000964_A132BarCodReo, T000964_A130BarCodPar
            }
            , new Object[] {
            T000965_A396EmprCod, T000965_A7145OSSCod
            }
            , new Object[] {
            T000966_A396EmprCod, T000966_A7049OGSCod
            }
            , new Object[] {
            T000967_A396EmprCod, T000967_A129BarCod, T000967_A132BarCodReo, T000967_A130BarCodPar, T000967_A6031Ac_Barcod, T000967_A6032Ac_BarReo, T000967_A6033Ac_BarPar
            }
            , new Object[] {
            T000968_A396EmprCod, T000968_A129BarCod, T000968_A132BarCodReo, T000968_A130BarCodPar, T000968_A5908PartPal
            }
            , new Object[] {
            T000969_A396EmprCod, T000969_A129BarCod, T000969_A132BarCodReo, T000969_A130BarCodPar, T000969_A2524DisComLin, T000969_A1056DisComCod, T000969_A1032FonCod
            }
            , new Object[] {
            T000970_A396EmprCod, T000970_A1736AlbExtCod, T000970_A129BarCod, T000970_A132BarCodReo, T000970_A130BarCodPar
            }
            , new Object[] {
            T000971_A396EmprCod, T000971_A129BarCod, T000971_A132BarCodReo, T000971_A130BarCodPar, T000971_A3753BarFoaCod, T000971_A3754BarFoaReo, T000971_A3755BarFoaPar
            }
            , new Object[] {
            T000972_A396EmprCod, T000972_A129BarCod, T000972_A132BarCodReo, T000972_A130BarCodPar, T000972_A3747BarPegCod, T000972_A3748BarPegReo, T000972_A3749BarPegPar
            }
            , new Object[] {
            T000973_A396EmprCod, T000973_A3253SolTraCod
            }
            , new Object[] {
            T000974_A396EmprCod, T000974_A3235SolSubCod
            }
            , new Object[] {
            T000975_A396EmprCod, T000975_A3218SolLuzCod
            }
            , new Object[] {
            T000976_A396EmprCod, T000976_A3196SolFriCod
            }
            , new Object[] {
            T000977_A396EmprCod, T000977_A3165SolPilCod
            }
            , new Object[] {
            T000978_A396EmprCod, T000978_A129BarCod, T000978_A132BarCodReo, T000978_A130BarCodPar, T000978_A2872HAnRLinMaq, T000978_A2873HAnRLinPro, T000978_A2874HAnRLin, T000978_A2875HAnNumAny
            }
            , new Object[] {
            T000979_A396EmprCod, T000979_A2817PlaTer, T000979_A2818PlaOrd
            }
            , new Object[] {
            T000980_A396EmprCod, T000980_A2809MetTerCod, T000980_A129BarCod, T000980_A132BarCodReo, T000980_A130BarCodPar
            }
            , new Object[] {
            T000981_A396EmprCod, T000981_A129BarCod, T000981_A132BarCodReo, T000981_A130BarCodPar, T000981_A2808RecLinMAL, T000981_A1377RecNumAny, T000981_A719PrdNum
            }
            , new Object[] {
            T000982_A396EmprCod, T000982_A129BarCod, T000982_A132BarCodReo, T000982_A130BarCodPar, T000982_A2804RecLinMaq
            }
            , new Object[] {
            T000983_A396EmprCod, T000983_A2792TermiCod, T000983_A129BarCod, T000983_A132BarCodReo, T000983_A130BarCodPar
            }
            , new Object[] {
            T000984_A396EmprCod, T000984_A2248ManCod, T000984_A2711RpExHdFe, T000984_A2713RpExHdLi
            }
            , new Object[] {
            T000985_A396EmprCod, T000985_A2248ManCod, T000985_A2689ExHdrFas, T000985_A2692ExHdrLin
            }
            , new Object[] {
            T000986_A396EmprCod, T000986_A129BarCod, T000986_A132BarCodReo, T000986_A130BarCodPar, T000986_A2494BarDosPro, T000986_A719PrdNum
            }
            , new Object[] {
            T000987_A396EmprCod, T000987_A602MaqCod, T000987_A2461PlaFecTin, T000987_A129BarCod, T000987_A132BarCodReo, T000987_A130BarCodPar
            }
            , new Object[] {
            T000988_A396EmprCod, T000988_A129BarCod, T000988_A132BarCodReo, T000988_A130BarCodPar, T000988_A2457BarObLin
            }
            , new Object[] {
            T000989_A396EmprCod, T000989_A129BarCod, T000989_A132BarCodReo, T000989_A130BarCodPar, T000989_A2444BarEnLin
            }
            , new Object[] {
            T000990_A396EmprCod, T000990_A2406ExhAlbCod, T000990_A129BarCod, T000990_A132BarCodReo, T000990_A130BarCodPar
            }
            , new Object[] {
            T000991_A396EmprCod, T000991_A2253SalExtAlb, T000991_A129BarCod, T000991_A132BarCodReo, T000991_A130BarCodPar
            }
            , new Object[] {
            T000992_A396EmprCod, T000992_A30AlbProCod, T000992_A129BarCod, T000992_A132BarCodReo, T000992_A130BarCodPar
            }
            , new Object[] {
            T000993_A396EmprCod, T000993_A1348SolColCod
            }
            , new Object[] {
            T000994_A396EmprCod, T000994_A1333EstDimCod
            }
            , new Object[] {
            T000995_A396EmprCod, T000995_A1314EnsLabCod
            }
            , new Object[] {
            T000996_A396EmprCod, T000996_A129BarCod, T000996_A132BarCodReo, T000996_A130BarCodPar, T000996_A906ObsReoLin
            }
            , new Object[] {
            T000997_A396EmprCod, T000997_A859CumCodCont
            }
            , new Object[] {
            T000998_A396EmprCod, T000998_A602MaqCod, T000998_A558HisProFec, T000998_A561HisProLin
            }
            , new Object[] {
            T000999_A396EmprCod, T000999_A252CliCod, T000999_A494ForSer, T000999_A482ForColNom, T000999_A483ForColNum, T000999_A831TipColCod
            }
            , new Object[] {
            T0009100_A396EmprCod, T0009100_A129BarCod, T0009100_A132BarCodReo, T0009100_A130BarCodPar, T0009100_A200BarPieCod
            }
            , new Object[] {
            T0009101_A396EmprCod, T0009101_A129BarCod, T0009101_A132BarCodReo, T0009101_A130BarCodPar, T0009101_A188BarNotLin
            }
            , new Object[] {
            T0009102_A396EmprCod, T0009102_A129BarCod, T0009102_A132BarCodReo, T0009102_A130BarCodPar, T0009102_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            T0009104_A396EmprCod, T0009104_A129BarCod, T0009104_A132BarCodReo, T0009104_A130BarCodPar
            }
            , new Object[] {
            T0009105_A129BarCod, T0009105_A132BarCodReo, T0009105_A130BarCodPar, T0009105_A119BarAgrCod, T0009105_A124BarAgrReo, T0009105_A122BarAgrPar, T0009105_A590KgmAgr, T0009105_A671PieAgr, T0009105_A869MtrAgr, T0009105_A1245BarAgrSer,
            T0009105_A1507BarAgrDsc, T0009105_A1508CliCodAgr, T0009105_A1513DisCodAgr, T0009105_A1510ColNomAgr, T0009105_A1512ColNumAgr, T0009105_A1509ColNoCAgr, T0009105_A1511ColNuCAgr, T0009105_A1649BarAgrDNu, T0009105_A396EmprCod, T0009105_A474FindBarAgr,
            T0009105_n474FindBarAgr, T0009105_A1653FindDes, T0009105_n1653FindDes
            }
            , new Object[] {
            T0009107_A121BarAgrKgm, T0009107_A868BarAgrMtr, T0009107_A1650BarAgrNDes, T0009107_A1651BarPNDes
            }
            , new Object[] {
            T0009108_A474FindBarAgr, T0009108_n474FindBarAgr
            }
            , new Object[] {
            T0009109_A1653FindDes, T0009109_n1653FindDes
            }
            , new Object[] {
            T0009110_A396EmprCod, T0009110_A129BarCod, T0009110_A132BarCodReo, T0009110_A130BarCodPar, T0009110_A119BarAgrCod, T0009110_A124BarAgrReo, T0009110_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T0009115_A121BarAgrKgm, T0009115_A868BarAgrMtr, T0009115_A1650BarAgrNDes, T0009115_A1651BarPNDes
            }
            , new Object[] {
            T0009116_A474FindBarAgr, T0009116_n474FindBarAgr
            }
            , new Object[] {
            T0009117_A1653FindDes, T0009117_n1653FindDes
            }
            , new Object[] {
            T0009118_A396EmprCod, T0009118_A129BarCod, T0009118_A132BarCodReo, T0009118_A130BarCodPar, T0009118_A119BarAgrCod, T0009118_A124BarAgrReo, T0009118_A122BarAgrPar
            }
            , new Object[] {
            T0009119_A13734MaqCDsc
            }
            , new Object[] {
            T0009120_A13735CliCNom
            }
            , new Object[] {
            T0009121_A13734MaqCDsc, T0009121_A396EmprCod, T0009121_A602MaqCod
            }
            , new Object[] {
            T0009122_A13735CliCNom, T0009122_A396EmprCod, T0009122_A252CliCod
            }
            , new Object[] {
            T0009123_A407EmprNom, T0009123_n407EmprNom
            }
            , new Object[] {
            T0009125_A13846BarAgrCant, T0009125_n13846BarAgrCant
            }
            , new Object[] {
            T0009126_A407EmprNom, T0009126_n407EmprNom
            }
            , new Object[] {
            T0009127_A252CliCod, T0009127_A365DisDes
            }
            , new Object[] {
            T0009128_A13735CliCNom, T0009128_A396EmprCod, T0009128_A252CliCod
            }
            , new Object[] {
            T0009130_A13846BarAgrCant, T0009130_n13846BarAgrCant
            }
            , new Object[] {
            T0009131_A13734MaqCDsc, T0009131_A396EmprCod, T0009131_A602MaqCod
            }
            , new Object[] {
            T0009133_A478FindVolMax, T0009133_A479FindVolMed, T0009133_A480FindVolMin
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z213BarSit ;
   private byte Z124BarAgrReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte AV46PlusUltra ;
   private byte AV47Kohler ;
   private byte AV48Vincolor ;
   private byte AV49FlagMAgr ;
   private byte AV53FlagEli ;
   private byte AV54FasMin ;
   private byte AV55Wckgcol ;
   private byte AV64AgrCol ;
   private byte AV72Lindalana ;
   private byte AV73Eliot ;
   private byte GXt_int5 ;
   private byte AV74DelAll ;
   private byte Gx_BScreen ;
   private byte GXv_int6[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ213BarSit ;
   private short Z671PieAgr ;
   private short nRcdDeleted_13 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount13 ;
   private short RcdFound13 ;
   private short nBlankRcdUsr13 ;
   private short A123BarAgrPie ;
   private short A1650BarAgrNDes ;
   private short A1651BarPNDes ;
   private short A671PieAgr ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_13 ;
   private short gxhchits ;
   private short Z1650BarAgrNDes ;
   private short Z1651BarPNDes ;
   private short Z123BarAgrPie ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z236BarVolMaq ;
   private int Z136BarColNum ;
   private int nRC_GXsfl_101 ;
   private int nGXsfl_101_idx=1 ;
   private int Z119BarAgrCod ;
   private int Z1508CliCodAgr ;
   private int Z1513DisCodAgr ;
   private int Z1512ColNumAgr ;
   private int Z1511ColNuCAgr ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int trnEnded ;
   private int edtBarDisNum_Enabled ;
   private int edtBarAgrCant_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int A236BarVolMaq ;
   private int edtBarVolMaq_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEmprCodVi_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int A479FindVolMed ;
   private int edtFindVolMed_Enabled ;
   private int A480FindVolMin ;
   private int edtFindVolMin_Enabled ;
   private int A478FindVolMax ;
   private int edtFindVolMax_Enabled ;
   private int edtBarAgrCod_Enabled ;
   private int edtBarAgrReo_Enabled ;
   private int edtBarAgrPar_Enabled ;
   private int edtCliCodAgr_Enabled ;
   private int edtBarAgrSer_Enabled ;
   private int edtColNomAgr_Enabled ;
   private int edtColNumAgr_Enabled ;
   private int edtBarAgrKgm_Enabled ;
   private int edtBarAgrMtr_Enabled ;
   private int edtBarAgrPie_Enabled ;
   private int edtBarAgrNDes_Enabled ;
   private int edtBarPNDes_Enabled ;
   private int edtFindDes_Enabled ;
   private int edtFindBarAgr_Enabled ;
   private int edtKgmAgr_Enabled ;
   private int edtPieAgr_Enabled ;
   private int edtMtrAgr_Enabled ;
   private int edtBarAgrDsc_Enabled ;
   private int edtDisCodAgr_Enabled ;
   private int edtColNoCAgr_Enabled ;
   private int edtColNuCAgr_Enabled ;
   private int edtBarAgrDNu_Enabled ;
   private int edtBarAGrHdr_Enabled ;
   private int edtBarAgrNhdr_Enabled ;
   private int fRowAdded ;
   private int A252CliCod ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A1513DisCodAgr ;
   private int A1511ColNuCAgr ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int GXv_int7[] ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtBarAgrNhdr_Enabled ;
   private int defedtBarAGrHdr_Enabled ;
   private int defedtBarAgrDNu_Enabled ;
   private int defedtColNuCAgr_Enabled ;
   private int defedtColNoCAgr_Enabled ;
   private int defedtDisCodAgr_Enabled ;
   private int defedtBarAgrDsc_Enabled ;
   private int defedtMtrAgr_Enabled ;
   private int defedtPieAgr_Enabled ;
   private int defedtKgmAgr_Enabled ;
   private int defedtFindBarAgr_Enabled ;
   private int defedtFindDes_Enabled ;
   private int defedtBarPNDes_Enabled ;
   private int defedtBarAgrNDes_Enabled ;
   private int defedtBarAgrPar_Enabled ;
   private int defedtBarAgrReo_Enabled ;
   private int defedtBarAgrCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int Z478FindVolMax ;
   private int Z479FindVolMed ;
   private int Z480FindVolMin ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ236BarVolMaq ;
   private int ZZ136BarColNum ;
   private int ZZ252CliCod ;
   private int ZZ478FindVolMax ;
   private int ZZ479FindVolMed ;
   private int ZZ480FindVolMin ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal O13846BarAgrCant ;
   private java.math.BigDecimal Z590KgmAgr ;
   private java.math.BigDecimal Z869MtrAgr ;
   private java.math.BigDecimal A13846BarAgrCant ;
   private java.math.BigDecimal B13846BarAgrCant ;
   private java.math.BigDecimal s13846BarAgrCant ;
   private java.math.BigDecimal A121BarAgrKgm ;
   private java.math.BigDecimal A868BarAgrMtr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal Z13846BarAgrCant ;
   private java.math.BigDecimal i13846BarAgrCant ;
   private java.math.BigDecimal ZZ13846BarAgrCant ;
   private java.math.BigDecimal ZO13846BarAgrCant ;
   private java.math.BigDecimal Z121BarAgrKgm ;
   private java.math.BigDecimal Z868BarAgrMtr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z143BarDisNum ;
   private String Z120BarAgrEst ;
   private String Z180BarMaqCod ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z122BarAgrPar ;
   private String Z1245BarAgrSer ;
   private String Z1507BarAgrDsc ;
   private String Z1510ColNomAgr ;
   private String Z1509ColNoCAgr ;
   private String Z1649BarAgrDNu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A180BarMaqCod ;
   private String A122BarAgrPar ;
   private String A401EmprCodVi ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarDisNum_Internalname ;
   private String sGXsfl_101_idx="0001" ;
   private String Gx_mode ;
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
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String edtBarAgrCant_Internalname ;
   private String edtBarAgrCant_Jsonclick ;
   private String divTablacabecera_Internalname ;
   private String sStyleString ;
   private String tblTabladatoshdr_Internalname ;
   private String divUnnamedtablebarcod_Internalname ;
   private String lblTextblockbarcod_Internalname ;
   private String lblTextblockbarcod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String divUnnamedtablebarcodreo_Internalname ;
   private String lblTextblockbarcodreo_Internalname ;
   private String lblTextblockbarcodreo_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String divUnnamedtablebarcodpar_Internalname ;
   private String lblTextblockbarcodpar_Internalname ;
   private String lblTextblockbarcodpar_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String divUnnamedtablebarmaqcod_Internalname ;
   private String lblTextblockbarmaqcod_Internalname ;
   private String lblTextblockbarmaqcod_Jsonclick ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarMaqCod_Jsonclick ;
   private String divUnnamedtablebarvolmaq_Internalname ;
   private String lblTextblockbarvolmaq_Internalname ;
   private String lblTextblockbarvolmaq_Jsonclick ;
   private String edtBarVolMaq_Internalname ;
   private String edtBarVolMaq_Jsonclick ;
   private String divTabladatosadicionales_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEmprCodVi_Internalname ;
   private String edtEmprCodVi_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtFindVolMed_Internalname ;
   private String edtFindVolMed_Jsonclick ;
   private String edtFindVolMin_Internalname ;
   private String edtFindVolMin_Jsonclick ;
   private String edtFindVolMax_Internalname ;
   private String edtFindVolMax_Jsonclick ;
   private String sMode13 ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String edtBarAgrPar_Internalname ;
   private String edtCliCodAgr_Internalname ;
   private String edtBarAgrSer_Internalname ;
   private String edtColNomAgr_Internalname ;
   private String edtColNumAgr_Internalname ;
   private String edtBarAgrKgm_Internalname ;
   private String edtBarAgrMtr_Internalname ;
   private String edtBarAgrPie_Internalname ;
   private String edtBarAgrNDes_Internalname ;
   private String edtBarPNDes_Internalname ;
   private String edtFindDes_Internalname ;
   private String edtFindBarAgr_Internalname ;
   private String edtKgmAgr_Internalname ;
   private String edtPieAgr_Internalname ;
   private String edtMtrAgr_Internalname ;
   private String edtBarAgrDsc_Internalname ;
   private String edtDisCodAgr_Internalname ;
   private String edtColNoCAgr_Internalname ;
   private String edtColNuCAgr_Internalname ;
   private String edtBarAgrDNu_Internalname ;
   private String edtBarAGrHdr_Internalname ;
   private String edtBarAgrNhdr_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String A2759BarMaqGru ;
   private String A365DisDes ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1245BarAgrSer ;
   private String A1510ColNomAgr ;
   private String A1653FindDes ;
   private String A474FindBarAgr ;
   private String A1507BarAgrDsc ;
   private String A1509ColNoCAgr ;
   private String A1649BarAgrDNu ;
   private String A13695BarAGrHdr ;
   private String A13792BarAgrNhdr ;
   private String AV20Lit0 ;
   private String AV36LitFe ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV30Lit10 ;
   private String AV37Lit11 ;
   private String AV38Lit12 ;
   private String AV39Lit13 ;
   private String AV40Lit14 ;
   private String AV41Lit15 ;
   private String AV42Lit16 ;
   private String AV43Lit17 ;
   private String AV44Lit18 ;
   private String AV59Lit19 ;
   private String AV62Lit20 ;
   private String AV63Lit21 ;
   private String AV66Lit22 ;
   private String AV31msg0 ;
   private String AV32msg1 ;
   private String AV33msg2 ;
   private String AV34msg3 ;
   private String AV35msg4 ;
   private String AV67msg5 ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String AV75BuscarEmprCod ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String sMode12 ;
   private String Z474FindBarAgr ;
   private String Z1653FindDes ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_101_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Jsonclick ;
   private String edtBarAgrKgm_Jsonclick ;
   private String edtBarAgrMtr_Jsonclick ;
   private String edtBarAgrPie_Jsonclick ;
   private String edtBarAgrNDes_Jsonclick ;
   private String edtBarPNDes_Jsonclick ;
   private String edtFindDes_Jsonclick ;
   private String edtFindBarAgr_Jsonclick ;
   private String edtKgmAgr_Jsonclick ;
   private String edtPieAgr_Jsonclick ;
   private String edtMtrAgr_Jsonclick ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtDisCodAgr_Jsonclick ;
   private String edtColNoCAgr_Jsonclick ;
   private String edtColNuCAgr_Jsonclick ;
   private String edtBarAgrDNu_Jsonclick ;
   private String edtBarAGrHdr_Jsonclick ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String A602MaqCod ;
   private String Z401EmprCodVi ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ143BarDisNum ;
   private String ZZ120BarAgrEst ;
   private String ZZ180BarMaqCod ;
   private String ZZ212BarSer ;
   private String ZZ135BarColNom ;
   private String ZZ407EmprNom ;
   private String ZZ365DisDes ;
   private String ZZ401EmprCodVi ;
   private String ZZ2759BarMaqGru ;
   private String Z13792BarAgrNhdr ;
   private String Z13695BarAGrHdr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n13846BarAgrCant ;
   private boolean bGXsfl_101_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n474FindBarAgr ;
   private boolean n1653FindDes ;
   private String A13734MaqCDsc ;
   private String A13735CliCNom ;
   private String h180BarMaqCod ;
   private String h252CliCod ;
   private String l13734MaqCDsc ;
   private String l13735CliCNom ;
   private String Zh180BarMaqCod ;
   private String Zh252CliCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T000917_A361DisCod ;
   private String[] T000917_A2759BarMaqGru ;
   private int[] T000917_A129BarCod ;
   private boolean[] T000917_n129BarCod ;
   private byte[] T000917_A132BarCodReo ;
   private boolean[] T000917_n132BarCodReo ;
   private String[] T000917_A130BarCodPar ;
   private boolean[] T000917_n130BarCodPar ;
   private String[] T000917_A407EmprNom ;
   private boolean[] T000917_n407EmprNom ;
   private String[] T000917_A143BarDisNum ;
   private String[] T000917_A120BarAgrEst ;
   private String[] T000917_A180BarMaqCod ;
   private int[] T000917_A236BarVolMaq ;
   private byte[] T000917_A213BarSit ;
   private int[] T000917_A252CliCod ;
   private boolean[] T000917_n252CliCod ;
   private String[] T000917_A212BarSer ;
   private String[] T000917_A135BarColNom ;
   private int[] T000917_A136BarColNum ;
   private String[] T000917_A365DisDes ;
   private String[] T000917_A396EmprCod ;
   private boolean[] T000917_n396EmprCod ;
   private java.math.BigDecimal[] T000917_A13846BarAgrCant ;
   private boolean[] T000917_n13846BarAgrCant ;
   private int[] T000911_A252CliCod ;
   private boolean[] T000911_n252CliCod ;
   private String[] T000911_A365DisDes ;
   private int[] T000913_A478FindVolMax ;
   private int[] T000913_A479FindVolMed ;
   private int[] T000913_A480FindVolMin ;
   private String[] T000918_A13734MaqCDsc ;
   private String[] T000918_A396EmprCod ;
   private boolean[] T000918_n396EmprCod ;
   private String[] T000918_A602MaqCod ;
   private String[] T000919_A13735CliCNom ;
   private String[] T000919_A396EmprCod ;
   private boolean[] T000919_n396EmprCod ;
   private int[] T000919_A252CliCod ;
   private boolean[] T000919_n252CliCod ;
   private String[] T000920_A13735CliCNom ;
   private String[] T000920_A396EmprCod ;
   private boolean[] T000920_n396EmprCod ;
   private int[] T000920_A252CliCod ;
   private boolean[] T000920_n252CliCod ;
   private String[] T000910_A407EmprNom ;
   private boolean[] T000910_n407EmprNom ;
   private String[] T000921_A13735CliCNom ;
   private String[] T000921_A396EmprCod ;
   private boolean[] T000921_n396EmprCod ;
   private int[] T000921_A252CliCod ;
   private boolean[] T000921_n252CliCod ;
   private java.math.BigDecimal[] T000915_A13846BarAgrCant ;
   private boolean[] T000915_n13846BarAgrCant ;
   private String[] T000922_A407EmprNom ;
   private boolean[] T000922_n407EmprNom ;
   private int[] T000923_A252CliCod ;
   private boolean[] T000923_n252CliCod ;
   private String[] T000923_A365DisDes ;
   private int[] T000925_A478FindVolMax ;
   private int[] T000925_A479FindVolMed ;
   private int[] T000925_A480FindVolMin ;
   private java.math.BigDecimal[] T000927_A13846BarAgrCant ;
   private boolean[] T000927_n13846BarAgrCant ;
   private String[] T000928_A396EmprCod ;
   private boolean[] T000928_n396EmprCod ;
   private int[] T000928_A129BarCod ;
   private boolean[] T000928_n129BarCod ;
   private byte[] T000928_A132BarCodReo ;
   private boolean[] T000928_n132BarCodReo ;
   private String[] T000928_A130BarCodPar ;
   private boolean[] T000928_n130BarCodPar ;
   private int[] T00099_A361DisCod ;
   private String[] T00099_A2759BarMaqGru ;
   private int[] T00099_A129BarCod ;
   private boolean[] T00099_n129BarCod ;
   private byte[] T00099_A132BarCodReo ;
   private boolean[] T00099_n132BarCodReo ;
   private String[] T00099_A130BarCodPar ;
   private boolean[] T00099_n130BarCodPar ;
   private String[] T00099_A143BarDisNum ;
   private String[] T00099_A120BarAgrEst ;
   private String[] T00099_A180BarMaqCod ;
   private int[] T00099_A236BarVolMaq ;
   private byte[] T00099_A213BarSit ;
   private String[] T00099_A212BarSer ;
   private String[] T00099_A135BarColNom ;
   private int[] T00099_A136BarColNum ;
   private String[] T00099_A396EmprCod ;
   private boolean[] T00099_n396EmprCod ;
   private int[] T00099_A252CliCod ;
   private boolean[] T00099_n252CliCod ;
   private String[] T00099_A365DisDes ;
   private String[] T000929_A396EmprCod ;
   private boolean[] T000929_n396EmprCod ;
   private int[] T000929_A129BarCod ;
   private boolean[] T000929_n129BarCod ;
   private byte[] T000929_A132BarCodReo ;
   private boolean[] T000929_n132BarCodReo ;
   private String[] T000929_A130BarCodPar ;
   private boolean[] T000929_n130BarCodPar ;
   private String[] T000930_A396EmprCod ;
   private boolean[] T000930_n396EmprCod ;
   private int[] T000930_A129BarCod ;
   private boolean[] T000930_n129BarCod ;
   private byte[] T000930_A132BarCodReo ;
   private boolean[] T000930_n132BarCodReo ;
   private String[] T000930_A130BarCodPar ;
   private boolean[] T000930_n130BarCodPar ;
   private String[] T000931_A13735CliCNom ;
   private String[] T000931_A396EmprCod ;
   private boolean[] T000931_n396EmprCod ;
   private int[] T000931_A252CliCod ;
   private boolean[] T000931_n252CliCod ;
   private int[] T00098_A361DisCod ;
   private String[] T00098_A2759BarMaqGru ;
   private int[] T00098_A129BarCod ;
   private boolean[] T00098_n129BarCod ;
   private byte[] T00098_A132BarCodReo ;
   private boolean[] T00098_n132BarCodReo ;
   private String[] T00098_A130BarCodPar ;
   private boolean[] T00098_n130BarCodPar ;
   private String[] T00098_A143BarDisNum ;
   private String[] T00098_A120BarAgrEst ;
   private String[] T00098_A180BarMaqCod ;
   private int[] T00098_A236BarVolMaq ;
   private byte[] T00098_A213BarSit ;
   private String[] T00098_A212BarSer ;
   private String[] T00098_A135BarColNom ;
   private int[] T00098_A136BarColNum ;
   private String[] T00098_A396EmprCod ;
   private boolean[] T00098_n396EmprCod ;
   private int[] T00098_A252CliCod ;
   private boolean[] T00098_n252CliCod ;
   private String[] T00098_A365DisDes ;
   private String[] T000935_A407EmprNom ;
   private boolean[] T000935_n407EmprNom ;
   private java.math.BigDecimal[] T000937_A13846BarAgrCant ;
   private boolean[] T000937_n13846BarAgrCant ;
   private int[] T000939_A478FindVolMax ;
   private int[] T000939_A479FindVolMed ;
   private int[] T000939_A480FindVolMin ;
   private int[] T000940_A252CliCod ;
   private boolean[] T000940_n252CliCod ;
   private String[] T000940_A365DisDes ;
   private long[] T000941_A14681MRPrId ;
   private String[] T000942_A5921XCjaDis ;
   private long[] T000942_A5922XCjaCod ;
   private String[] T000943_A396EmprCod ;
   private boolean[] T000943_n396EmprCod ;
   private int[] T000943_A129BarCod ;
   private boolean[] T000943_n129BarCod ;
   private byte[] T000943_A132BarCodReo ;
   private boolean[] T000943_n132BarCodReo ;
   private String[] T000943_A130BarCodPar ;
   private boolean[] T000943_n130BarCodPar ;
   private short[] T000943_A14152MEnvOrd ;
   private String[] T000944_A396EmprCod ;
   private boolean[] T000944_n396EmprCod ;
   private int[] T000944_A129BarCod ;
   private boolean[] T000944_n129BarCod ;
   private byte[] T000944_A132BarCodReo ;
   private boolean[] T000944_n132BarCodReo ;
   private String[] T000944_A130BarCodPar ;
   private boolean[] T000944_n130BarCodPar ;
   private String[] T000944_A13905BarTraID ;
   private String[] T000945_A396EmprCod ;
   private boolean[] T000945_n396EmprCod ;
   private int[] T000945_A129BarCod ;
   private boolean[] T000945_n129BarCod ;
   private byte[] T000945_A132BarCodReo ;
   private boolean[] T000945_n132BarCodReo ;
   private String[] T000945_A130BarCodPar ;
   private boolean[] T000945_n130BarCodPar ;
   private byte[] T000945_A13093BarDGLin ;
   private String[] T000945_A13094BarDGDibCl ;
   private int[] T000945_A13095BarDGDibIn ;
   private String[] T000945_A13096BarDGComb ;
   private String[] T000945_A13097BarDGFOndo ;
   private String[] T000946_A396EmprCod ;
   private boolean[] T000946_n396EmprCod ;
   private int[] T000946_A11917Ebd_numero ;
   private String[] T000947_A396EmprCod ;
   private boolean[] T000947_n396EmprCod ;
   private int[] T000947_A11898Prd_numero ;
   private String[] T000948_A396EmprCod ;
   private boolean[] T000948_n396EmprCod ;
   private int[] T000948_A11849Cte_numero ;
   private String[] T000949_A396EmprCod ;
   private boolean[] T000949_n396EmprCod ;
   private int[] T000949_A11791Ap_numero ;
   private String[] T000950_A396EmprCod ;
   private boolean[] T000950_n396EmprCod ;
   private int[] T000950_A3985CalBarCod ;
   private byte[] T000950_A3986CalBarCodR ;
   private String[] T000950_A3987CalBarCodP ;
   private String[] T000951_A396EmprCod ;
   private boolean[] T000951_n396EmprCod ;
   private java.util.Date[] T000951_A5294InPTime ;
   private int[] T000951_A652OpeCod ;
   private String[] T000952_A396EmprCod ;
   private boolean[] T000952_n396EmprCod ;
   private int[] T000952_A129BarCod ;
   private boolean[] T000952_n129BarCod ;
   private byte[] T000952_A132BarCodReo ;
   private boolean[] T000952_n132BarCodReo ;
   private String[] T000952_A130BarCodPar ;
   private boolean[] T000952_n130BarCodPar ;
   private int[] T000952_A4118tinagrcod ;
   private byte[] T000952_A4119tinagrreo ;
   private String[] T000952_A4120tinagrpar ;
   private String[] T000953_A396EmprCod ;
   private boolean[] T000953_n396EmprCod ;
   private int[] T000953_A129BarCod ;
   private boolean[] T000953_n129BarCod ;
   private byte[] T000953_A132BarCodReo ;
   private boolean[] T000953_n132BarCodReo ;
   private String[] T000953_A130BarCodPar ;
   private boolean[] T000953_n130BarCodPar ;
   private int[] T000953_A4080estagrcod ;
   private byte[] T000953_A4081estagrreo ;
   private String[] T000953_A4082estagrpar ;
   private String[] T000954_A396EmprCod ;
   private boolean[] T000954_n396EmprCod ;
   private int[] T000954_A129BarCod ;
   private boolean[] T000954_n129BarCod ;
   private byte[] T000954_A132BarCodReo ;
   private boolean[] T000954_n132BarCodReo ;
   private String[] T000954_A130BarCodPar ;
   private boolean[] T000954_n130BarCodPar ;
   private byte[] T000954_A4075recestncol ;
   private byte[] T000954_A4076recestnpro ;
   private String[] T000955_A396EmprCod ;
   private boolean[] T000955_n396EmprCod ;
   private String[] T000955_A602MaqCod ;
   private String[] T000955_A1142MaqFCod ;
   private short[] T000955_A3068PlaEtaOrd ;
   private byte[] T000955_A3069PlaEtaOrdA ;
   private int[] T000955_A129BarCod ;
   private boolean[] T000955_n129BarCod ;
   private byte[] T000955_A132BarCodReo ;
   private boolean[] T000955_n132BarCodReo ;
   private String[] T000955_A130BarCodPar ;
   private boolean[] T000955_n130BarCodPar ;
   private String[] T000956_A396EmprCod ;
   private boolean[] T000956_n396EmprCod ;
   private int[] T000956_A129BarCod ;
   private boolean[] T000956_n129BarCod ;
   private byte[] T000956_A132BarCodReo ;
   private boolean[] T000956_n132BarCodReo ;
   private String[] T000956_A130BarCodPar ;
   private boolean[] T000956_n130BarCodPar ;
   private short[] T000956_A4846BarAudLin ;
   private String[] T000957_A396EmprCod ;
   private boolean[] T000957_n396EmprCod ;
   private int[] T000957_A129BarCod ;
   private boolean[] T000957_n129BarCod ;
   private byte[] T000957_A132BarCodReo ;
   private boolean[] T000957_n132BarCodReo ;
   private String[] T000957_A130BarCodPar ;
   private boolean[] T000957_n130BarCodPar ;
   private short[] T000957_A3940BarEnsLin ;
   private String[] T000958_A396EmprCod ;
   private boolean[] T000958_n396EmprCod ;
   private int[] T000958_A129BarCod ;
   private boolean[] T000958_n129BarCod ;
   private byte[] T000958_A132BarCodReo ;
   private boolean[] T000958_n132BarCodReo ;
   private String[] T000958_A130BarCodPar ;
   private boolean[] T000958_n130BarCodPar ;
   private int[] T000958_A3384RefBarCod ;
   private byte[] T000958_A3385RefBarReo ;
   private String[] T000958_A3386RefBarPar ;
   private String[] T000959_A396EmprCod ;
   private boolean[] T000959_n396EmprCod ;
   private int[] T000959_A10914SolSalCod ;
   private String[] T000960_A396EmprCod ;
   private boolean[] T000960_n396EmprCod ;
   private int[] T000960_A10364Ph_numero ;
   private String[] T000961_A396EmprCod ;
   private boolean[] T000961_n396EmprCod ;
   private int[] T000961_A129BarCod ;
   private boolean[] T000961_n129BarCod ;
   private byte[] T000961_A132BarCodReo ;
   private boolean[] T000961_n132BarCodReo ;
   private String[] T000961_A130BarCodPar ;
   private boolean[] T000961_n130BarCodPar ;
   private String[] T000961_A10197ProEspCod ;
   private String[] T000962_A396EmprCod ;
   private boolean[] T000962_n396EmprCod ;
   private int[] T000962_A129BarCod ;
   private boolean[] T000962_n129BarCod ;
   private byte[] T000962_A132BarCodReo ;
   private boolean[] T000962_n132BarCodReo ;
   private String[] T000962_A130BarCodPar ;
   private boolean[] T000962_n130BarCodPar ;
   private int[] T000962_A5322Dp_Nrecep ;
   private String[] T000963_A396EmprCod ;
   private boolean[] T000963_n396EmprCod ;
   private int[] T000963_A129BarCod ;
   private boolean[] T000963_n129BarCod ;
   private byte[] T000963_A132BarCodReo ;
   private boolean[] T000963_n132BarCodReo ;
   private String[] T000963_A130BarCodPar ;
   private boolean[] T000963_n130BarCodPar ;
   private int[] T000963_A8569EntSecLn ;
   private String[] T000964_A396EmprCod ;
   private boolean[] T000964_n396EmprCod ;
   private int[] T000964_A7434PLLNro ;
   private short[] T000964_A7443LPLNro ;
   private short[] T000964_A7459CPLCom ;
   private int[] T000964_A129BarCod ;
   private boolean[] T000964_n129BarCod ;
   private byte[] T000964_A132BarCodReo ;
   private boolean[] T000964_n132BarCodReo ;
   private String[] T000964_A130BarCodPar ;
   private boolean[] T000964_n130BarCodPar ;
   private String[] T000965_A396EmprCod ;
   private boolean[] T000965_n396EmprCod ;
   private int[] T000965_A7145OSSCod ;
   private String[] T000966_A396EmprCod ;
   private boolean[] T000966_n396EmprCod ;
   private int[] T000966_A7049OGSCod ;
   private String[] T000967_A396EmprCod ;
   private boolean[] T000967_n396EmprCod ;
   private int[] T000967_A129BarCod ;
   private boolean[] T000967_n129BarCod ;
   private byte[] T000967_A132BarCodReo ;
   private boolean[] T000967_n132BarCodReo ;
   private String[] T000967_A130BarCodPar ;
   private boolean[] T000967_n130BarCodPar ;
   private int[] T000967_A6031Ac_Barcod ;
   private byte[] T000967_A6032Ac_BarReo ;
   private String[] T000967_A6033Ac_BarPar ;
   private String[] T000968_A396EmprCod ;
   private boolean[] T000968_n396EmprCod ;
   private int[] T000968_A129BarCod ;
   private boolean[] T000968_n129BarCod ;
   private byte[] T000968_A132BarCodReo ;
   private boolean[] T000968_n132BarCodReo ;
   private String[] T000968_A130BarCodPar ;
   private boolean[] T000968_n130BarCodPar ;
   private int[] T000968_A5908PartPal ;
   private String[] T000969_A396EmprCod ;
   private boolean[] T000969_n396EmprCod ;
   private int[] T000969_A129BarCod ;
   private boolean[] T000969_n129BarCod ;
   private byte[] T000969_A132BarCodReo ;
   private boolean[] T000969_n132BarCodReo ;
   private String[] T000969_A130BarCodPar ;
   private boolean[] T000969_n130BarCodPar ;
   private byte[] T000969_A2524DisComLin ;
   private String[] T000969_A1056DisComCod ;
   private String[] T000969_A1032FonCod ;
   private String[] T000970_A396EmprCod ;
   private boolean[] T000970_n396EmprCod ;
   private long[] T000970_A1736AlbExtCod ;
   private int[] T000970_A129BarCod ;
   private boolean[] T000970_n129BarCod ;
   private byte[] T000970_A132BarCodReo ;
   private boolean[] T000970_n132BarCodReo ;
   private String[] T000970_A130BarCodPar ;
   private boolean[] T000970_n130BarCodPar ;
   private String[] T000971_A396EmprCod ;
   private boolean[] T000971_n396EmprCod ;
   private int[] T000971_A129BarCod ;
   private boolean[] T000971_n129BarCod ;
   private byte[] T000971_A132BarCodReo ;
   private boolean[] T000971_n132BarCodReo ;
   private String[] T000971_A130BarCodPar ;
   private boolean[] T000971_n130BarCodPar ;
   private int[] T000971_A3753BarFoaCod ;
   private byte[] T000971_A3754BarFoaReo ;
   private String[] T000971_A3755BarFoaPar ;
   private String[] T000972_A396EmprCod ;
   private boolean[] T000972_n396EmprCod ;
   private int[] T000972_A129BarCod ;
   private boolean[] T000972_n129BarCod ;
   private byte[] T000972_A132BarCodReo ;
   private boolean[] T000972_n132BarCodReo ;
   private String[] T000972_A130BarCodPar ;
   private boolean[] T000972_n130BarCodPar ;
   private int[] T000972_A3747BarPegCod ;
   private byte[] T000972_A3748BarPegReo ;
   private String[] T000972_A3749BarPegPar ;
   private String[] T000973_A396EmprCod ;
   private boolean[] T000973_n396EmprCod ;
   private int[] T000973_A3253SolTraCod ;
   private String[] T000974_A396EmprCod ;
   private boolean[] T000974_n396EmprCod ;
   private int[] T000974_A3235SolSubCod ;
   private String[] T000975_A396EmprCod ;
   private boolean[] T000975_n396EmprCod ;
   private int[] T000975_A3218SolLuzCod ;
   private String[] T000976_A396EmprCod ;
   private boolean[] T000976_n396EmprCod ;
   private int[] T000976_A3196SolFriCod ;
   private String[] T000977_A396EmprCod ;
   private boolean[] T000977_n396EmprCod ;
   private int[] T000977_A3165SolPilCod ;
   private String[] T000978_A396EmprCod ;
   private boolean[] T000978_n396EmprCod ;
   private int[] T000978_A129BarCod ;
   private boolean[] T000978_n129BarCod ;
   private byte[] T000978_A132BarCodReo ;
   private boolean[] T000978_n132BarCodReo ;
   private String[] T000978_A130BarCodPar ;
   private boolean[] T000978_n130BarCodPar ;
   private short[] T000978_A2872HAnRLinMaq ;
   private byte[] T000978_A2873HAnRLinPro ;
   private short[] T000978_A2874HAnRLin ;
   private byte[] T000978_A2875HAnNumAny ;
   private String[] T000979_A396EmprCod ;
   private boolean[] T000979_n396EmprCod ;
   private String[] T000979_A2817PlaTer ;
   private short[] T000979_A2818PlaOrd ;
   private String[] T000980_A396EmprCod ;
   private boolean[] T000980_n396EmprCod ;
   private String[] T000980_A2809MetTerCod ;
   private int[] T000980_A129BarCod ;
   private boolean[] T000980_n129BarCod ;
   private byte[] T000980_A132BarCodReo ;
   private boolean[] T000980_n132BarCodReo ;
   private String[] T000980_A130BarCodPar ;
   private boolean[] T000980_n130BarCodPar ;
   private String[] T000981_A396EmprCod ;
   private boolean[] T000981_n396EmprCod ;
   private int[] T000981_A129BarCod ;
   private boolean[] T000981_n129BarCod ;
   private byte[] T000981_A132BarCodReo ;
   private boolean[] T000981_n132BarCodReo ;
   private String[] T000981_A130BarCodPar ;
   private boolean[] T000981_n130BarCodPar ;
   private short[] T000981_A2808RecLinMAL ;
   private byte[] T000981_A1377RecNumAny ;
   private String[] T000981_A719PrdNum ;
   private String[] T000982_A396EmprCod ;
   private boolean[] T000982_n396EmprCod ;
   private int[] T000982_A129BarCod ;
   private boolean[] T000982_n129BarCod ;
   private byte[] T000982_A132BarCodReo ;
   private boolean[] T000982_n132BarCodReo ;
   private String[] T000982_A130BarCodPar ;
   private boolean[] T000982_n130BarCodPar ;
   private short[] T000982_A2804RecLinMaq ;
   private String[] T000983_A396EmprCod ;
   private boolean[] T000983_n396EmprCod ;
   private String[] T000983_A2792TermiCod ;
   private int[] T000983_A129BarCod ;
   private boolean[] T000983_n129BarCod ;
   private byte[] T000983_A132BarCodReo ;
   private boolean[] T000983_n132BarCodReo ;
   private String[] T000983_A130BarCodPar ;
   private boolean[] T000983_n130BarCodPar ;
   private String[] T000984_A396EmprCod ;
   private boolean[] T000984_n396EmprCod ;
   private short[] T000984_A2248ManCod ;
   private java.util.Date[] T000984_A2711RpExHdFe ;
   private short[] T000984_A2713RpExHdLi ;
   private String[] T000985_A396EmprCod ;
   private boolean[] T000985_n396EmprCod ;
   private short[] T000985_A2248ManCod ;
   private String[] T000985_A2689ExHdrFas ;
   private int[] T000985_A2692ExHdrLin ;
   private String[] T000986_A396EmprCod ;
   private boolean[] T000986_n396EmprCod ;
   private int[] T000986_A129BarCod ;
   private boolean[] T000986_n129BarCod ;
   private byte[] T000986_A132BarCodReo ;
   private boolean[] T000986_n132BarCodReo ;
   private String[] T000986_A130BarCodPar ;
   private boolean[] T000986_n130BarCodPar ;
   private String[] T000986_A2494BarDosPro ;
   private String[] T000986_A719PrdNum ;
   private String[] T000987_A396EmprCod ;
   private boolean[] T000987_n396EmprCod ;
   private String[] T000987_A602MaqCod ;
   private java.util.Date[] T000987_A2461PlaFecTin ;
   private int[] T000987_A129BarCod ;
   private boolean[] T000987_n129BarCod ;
   private byte[] T000987_A132BarCodReo ;
   private boolean[] T000987_n132BarCodReo ;
   private String[] T000987_A130BarCodPar ;
   private boolean[] T000987_n130BarCodPar ;
   private String[] T000988_A396EmprCod ;
   private boolean[] T000988_n396EmprCod ;
   private int[] T000988_A129BarCod ;
   private boolean[] T000988_n129BarCod ;
   private byte[] T000988_A132BarCodReo ;
   private boolean[] T000988_n132BarCodReo ;
   private String[] T000988_A130BarCodPar ;
   private boolean[] T000988_n130BarCodPar ;
   private short[] T000988_A2457BarObLin ;
   private String[] T000989_A396EmprCod ;
   private boolean[] T000989_n396EmprCod ;
   private int[] T000989_A129BarCod ;
   private boolean[] T000989_n129BarCod ;
   private byte[] T000989_A132BarCodReo ;
   private boolean[] T000989_n132BarCodReo ;
   private String[] T000989_A130BarCodPar ;
   private boolean[] T000989_n130BarCodPar ;
   private short[] T000989_A2444BarEnLin ;
   private String[] T000990_A396EmprCod ;
   private boolean[] T000990_n396EmprCod ;
   private int[] T000990_A2406ExhAlbCod ;
   private int[] T000990_A129BarCod ;
   private boolean[] T000990_n129BarCod ;
   private byte[] T000990_A132BarCodReo ;
   private boolean[] T000990_n132BarCodReo ;
   private String[] T000990_A130BarCodPar ;
   private boolean[] T000990_n130BarCodPar ;
   private String[] T000991_A396EmprCod ;
   private boolean[] T000991_n396EmprCod ;
   private int[] T000991_A2253SalExtAlb ;
   private int[] T000991_A129BarCod ;
   private boolean[] T000991_n129BarCod ;
   private byte[] T000991_A132BarCodReo ;
   private boolean[] T000991_n132BarCodReo ;
   private String[] T000991_A130BarCodPar ;
   private boolean[] T000991_n130BarCodPar ;
   private String[] T000992_A396EmprCod ;
   private boolean[] T000992_n396EmprCod ;
   private long[] T000992_A30AlbProCod ;
   private int[] T000992_A129BarCod ;
   private boolean[] T000992_n129BarCod ;
   private byte[] T000992_A132BarCodReo ;
   private boolean[] T000992_n132BarCodReo ;
   private String[] T000992_A130BarCodPar ;
   private boolean[] T000992_n130BarCodPar ;
   private String[] T000993_A396EmprCod ;
   private boolean[] T000993_n396EmprCod ;
   private int[] T000993_A1348SolColCod ;
   private String[] T000994_A396EmprCod ;
   private boolean[] T000994_n396EmprCod ;
   private int[] T000994_A1333EstDimCod ;
   private String[] T000995_A396EmprCod ;
   private boolean[] T000995_n396EmprCod ;
   private int[] T000995_A1314EnsLabCod ;
   private String[] T000996_A396EmprCod ;
   private boolean[] T000996_n396EmprCod ;
   private int[] T000996_A129BarCod ;
   private boolean[] T000996_n129BarCod ;
   private byte[] T000996_A132BarCodReo ;
   private boolean[] T000996_n132BarCodReo ;
   private String[] T000996_A130BarCodPar ;
   private boolean[] T000996_n130BarCodPar ;
   private byte[] T000996_A906ObsReoLin ;
   private String[] T000997_A396EmprCod ;
   private boolean[] T000997_n396EmprCod ;
   private int[] T000997_A859CumCodCont ;
   private String[] T000998_A396EmprCod ;
   private boolean[] T000998_n396EmprCod ;
   private String[] T000998_A602MaqCod ;
   private java.util.Date[] T000998_A558HisProFec ;
   private int[] T000998_A561HisProLin ;
   private String[] T000999_A396EmprCod ;
   private boolean[] T000999_n396EmprCod ;
   private int[] T000999_A252CliCod ;
   private boolean[] T000999_n252CliCod ;
   private String[] T000999_A494ForSer ;
   private String[] T000999_A482ForColNom ;
   private int[] T000999_A483ForColNum ;
   private byte[] T000999_A831TipColCod ;
   private String[] T0009100_A396EmprCod ;
   private boolean[] T0009100_n396EmprCod ;
   private int[] T0009100_A129BarCod ;
   private boolean[] T0009100_n129BarCod ;
   private byte[] T0009100_A132BarCodReo ;
   private boolean[] T0009100_n132BarCodReo ;
   private String[] T0009100_A130BarCodPar ;
   private boolean[] T0009100_n130BarCodPar ;
   private String[] T0009100_A200BarPieCod ;
   private String[] T0009101_A396EmprCod ;
   private boolean[] T0009101_n396EmprCod ;
   private int[] T0009101_A129BarCod ;
   private boolean[] T0009101_n129BarCod ;
   private byte[] T0009101_A132BarCodReo ;
   private boolean[] T0009101_n132BarCodReo ;
   private String[] T0009101_A130BarCodPar ;
   private boolean[] T0009101_n130BarCodPar ;
   private byte[] T0009101_A188BarNotLin ;
   private String[] T0009102_A396EmprCod ;
   private boolean[] T0009102_n396EmprCod ;
   private int[] T0009102_A129BarCod ;
   private boolean[] T0009102_n129BarCod ;
   private byte[] T0009102_A132BarCodReo ;
   private boolean[] T0009102_n132BarCodReo ;
   private String[] T0009102_A130BarCodPar ;
   private boolean[] T0009102_n130BarCodPar ;
   private String[] T0009102_A758ProCod ;
   private String[] T0009104_A396EmprCod ;
   private boolean[] T0009104_n396EmprCod ;
   private int[] T0009104_A129BarCod ;
   private boolean[] T0009104_n129BarCod ;
   private byte[] T0009104_A132BarCodReo ;
   private boolean[] T0009104_n132BarCodReo ;
   private String[] T0009104_A130BarCodPar ;
   private boolean[] T0009104_n130BarCodPar ;
   private int[] T0009105_A129BarCod ;
   private boolean[] T0009105_n129BarCod ;
   private byte[] T0009105_A132BarCodReo ;
   private boolean[] T0009105_n132BarCodReo ;
   private String[] T0009105_A130BarCodPar ;
   private boolean[] T0009105_n130BarCodPar ;
   private int[] T0009105_A119BarAgrCod ;
   private byte[] T0009105_A124BarAgrReo ;
   private String[] T0009105_A122BarAgrPar ;
   private java.math.BigDecimal[] T0009105_A590KgmAgr ;
   private short[] T0009105_A671PieAgr ;
   private java.math.BigDecimal[] T0009105_A869MtrAgr ;
   private String[] T0009105_A1245BarAgrSer ;
   private String[] T0009105_A1507BarAgrDsc ;
   private int[] T0009105_A1508CliCodAgr ;
   private int[] T0009105_A1513DisCodAgr ;
   private String[] T0009105_A1510ColNomAgr ;
   private int[] T0009105_A1512ColNumAgr ;
   private String[] T0009105_A1509ColNoCAgr ;
   private int[] T0009105_A1511ColNuCAgr ;
   private String[] T0009105_A1649BarAgrDNu ;
   private String[] T0009105_A396EmprCod ;
   private boolean[] T0009105_n396EmprCod ;
   private String[] T0009105_A474FindBarAgr ;
   private boolean[] T0009105_n474FindBarAgr ;
   private String[] T0009105_A1653FindDes ;
   private boolean[] T0009105_n1653FindDes ;
   private java.math.BigDecimal[] T00095_A121BarAgrKgm ;
   private java.math.BigDecimal[] T00095_A868BarAgrMtr ;
   private short[] T00095_A1650BarAgrNDes ;
   private short[] T00095_A1651BarPNDes ;
   private String[] T00096_A474FindBarAgr ;
   private boolean[] T00096_n474FindBarAgr ;
   private String[] T00097_A1653FindDes ;
   private boolean[] T00097_n1653FindDes ;
   private java.math.BigDecimal[] T0009107_A121BarAgrKgm ;
   private java.math.BigDecimal[] T0009107_A868BarAgrMtr ;
   private short[] T0009107_A1650BarAgrNDes ;
   private short[] T0009107_A1651BarPNDes ;
   private String[] T0009108_A474FindBarAgr ;
   private boolean[] T0009108_n474FindBarAgr ;
   private String[] T0009109_A1653FindDes ;
   private boolean[] T0009109_n1653FindDes ;
   private String[] T0009110_A396EmprCod ;
   private boolean[] T0009110_n396EmprCod ;
   private int[] T0009110_A129BarCod ;
   private boolean[] T0009110_n129BarCod ;
   private byte[] T0009110_A132BarCodReo ;
   private boolean[] T0009110_n132BarCodReo ;
   private String[] T0009110_A130BarCodPar ;
   private boolean[] T0009110_n130BarCodPar ;
   private int[] T0009110_A119BarAgrCod ;
   private byte[] T0009110_A124BarAgrReo ;
   private String[] T0009110_A122BarAgrPar ;
   private int[] T00093_A129BarCod ;
   private boolean[] T00093_n129BarCod ;
   private byte[] T00093_A132BarCodReo ;
   private boolean[] T00093_n132BarCodReo ;
   private String[] T00093_A130BarCodPar ;
   private boolean[] T00093_n130BarCodPar ;
   private int[] T00093_A119BarAgrCod ;
   private byte[] T00093_A124BarAgrReo ;
   private String[] T00093_A122BarAgrPar ;
   private java.math.BigDecimal[] T00093_A590KgmAgr ;
   private short[] T00093_A671PieAgr ;
   private java.math.BigDecimal[] T00093_A869MtrAgr ;
   private String[] T00093_A1245BarAgrSer ;
   private String[] T00093_A1507BarAgrDsc ;
   private int[] T00093_A1508CliCodAgr ;
   private int[] T00093_A1513DisCodAgr ;
   private String[] T00093_A1510ColNomAgr ;
   private int[] T00093_A1512ColNumAgr ;
   private String[] T00093_A1509ColNoCAgr ;
   private int[] T00093_A1511ColNuCAgr ;
   private String[] T00093_A1649BarAgrDNu ;
   private String[] T00093_A396EmprCod ;
   private boolean[] T00093_n396EmprCod ;
   private int[] T00092_A129BarCod ;
   private boolean[] T00092_n129BarCod ;
   private byte[] T00092_A132BarCodReo ;
   private boolean[] T00092_n132BarCodReo ;
   private String[] T00092_A130BarCodPar ;
   private boolean[] T00092_n130BarCodPar ;
   private int[] T00092_A119BarAgrCod ;
   private byte[] T00092_A124BarAgrReo ;
   private String[] T00092_A122BarAgrPar ;
   private java.math.BigDecimal[] T00092_A590KgmAgr ;
   private short[] T00092_A671PieAgr ;
   private java.math.BigDecimal[] T00092_A869MtrAgr ;
   private String[] T00092_A1245BarAgrSer ;
   private String[] T00092_A1507BarAgrDsc ;
   private int[] T00092_A1508CliCodAgr ;
   private int[] T00092_A1513DisCodAgr ;
   private String[] T00092_A1510ColNomAgr ;
   private int[] T00092_A1512ColNumAgr ;
   private String[] T00092_A1509ColNoCAgr ;
   private int[] T00092_A1511ColNuCAgr ;
   private String[] T00092_A1649BarAgrDNu ;
   private String[] T00092_A396EmprCod ;
   private boolean[] T00092_n396EmprCod ;
   private java.math.BigDecimal[] T0009115_A121BarAgrKgm ;
   private java.math.BigDecimal[] T0009115_A868BarAgrMtr ;
   private short[] T0009115_A1650BarAgrNDes ;
   private short[] T0009115_A1651BarPNDes ;
   private String[] T0009116_A474FindBarAgr ;
   private boolean[] T0009116_n474FindBarAgr ;
   private String[] T0009117_A1653FindDes ;
   private boolean[] T0009117_n1653FindDes ;
   private String[] T0009118_A396EmprCod ;
   private boolean[] T0009118_n396EmprCod ;
   private int[] T0009118_A129BarCod ;
   private boolean[] T0009118_n129BarCod ;
   private byte[] T0009118_A132BarCodReo ;
   private boolean[] T0009118_n132BarCodReo ;
   private String[] T0009118_A130BarCodPar ;
   private boolean[] T0009118_n130BarCodPar ;
   private int[] T0009118_A119BarAgrCod ;
   private byte[] T0009118_A124BarAgrReo ;
   private String[] T0009118_A122BarAgrPar ;
   private String[] T0009119_A13734MaqCDsc ;
   private String[] T0009120_A13735CliCNom ;
   private String[] T0009121_A13734MaqCDsc ;
   private String[] T0009121_A396EmprCod ;
   private boolean[] T0009121_n396EmprCod ;
   private String[] T0009121_A602MaqCod ;
   private String[] T0009122_A13735CliCNom ;
   private String[] T0009122_A396EmprCod ;
   private boolean[] T0009122_n396EmprCod ;
   private int[] T0009122_A252CliCod ;
   private boolean[] T0009122_n252CliCod ;
   private String[] T0009123_A407EmprNom ;
   private boolean[] T0009123_n407EmprNom ;
   private java.math.BigDecimal[] T0009125_A13846BarAgrCant ;
   private boolean[] T0009125_n13846BarAgrCant ;
   private String[] T0009126_A407EmprNom ;
   private boolean[] T0009126_n407EmprNom ;
   private int[] T0009127_A252CliCod ;
   private boolean[] T0009127_n252CliCod ;
   private String[] T0009127_A365DisDes ;
   private String[] T0009128_A13735CliCNom ;
   private String[] T0009128_A396EmprCod ;
   private boolean[] T0009128_n396EmprCod ;
   private int[] T0009128_A252CliCod ;
   private boolean[] T0009128_n252CliCod ;
   private java.math.BigDecimal[] T0009130_A13846BarAgrCant ;
   private boolean[] T0009130_n13846BarAgrCant ;
   private String[] T0009131_A13734MaqCDsc ;
   private String[] T0009131_A396EmprCod ;
   private boolean[] T0009131_n396EmprCod ;
   private String[] T0009131_A602MaqCod ;
   private int[] T0009133_A478FindVolMax ;
   private int[] T0009133_A479FindVolMed ;
   private int[] T0009133_A480FindVolMin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbaragr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaragr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaragr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaragr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00092", "SELECT BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?  FOR UPDATE OF KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00093", "SELECT BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00095", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00096", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00097", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00098", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00099", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000910", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000911", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000913", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000915", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000917", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T2.EmprNom, TM1.BarDisNum, TM1.BarAgrEst, TM1.BarMaqCod, TM1.BarVolMaq, TM1.BarSit, TM1.CliCod, TM1.BarSer, TM1.BarColNom, TM1.BarColNum, TM1.DisDes, TM1.EmprCod, COALESCE( T3.BarAgrCant, 0) AS BarAgrCant FROM ((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000918", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000919", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000920", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000921", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000922", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000923", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000925", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000927", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000928", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000929", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000930", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000931", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000932", "INSERT INTO TXPBARCAD(CliCod, DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, EmprCod, BarTipArt, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T000933", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, DisCod=?, BarMaqGru=?, BarDisNum=?, BarAgrEst=?, BarMaqCod=?, BarVolMaq=?, BarSit=?, BarSer=?, BarColNom=?, BarColNum=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T000934", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T000935", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000937", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000939", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000940", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000941", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000942", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000943", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000944", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000945", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000946", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000947", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000948", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000949", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000950", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000951", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000952", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000953", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000954", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000955", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000956", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000957", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000958", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000959", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000960", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000961", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000962", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000963", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000964", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000965", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000966", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000967", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000968", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000969", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000970", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000971", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000972", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000973", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000974", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000975", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000976", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000977", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000978", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000979", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000980", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000981", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000982", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000983", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000984", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000985", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000986", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000987", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000988", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000989", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000990", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000991", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000992", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000993", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000994", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000995", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000996", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000997", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000998", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000999", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0009100", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0009101", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T0009102", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T0009103", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T0009104", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009105", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrCod, T1.BarAgrReo, T1.BarAgrPar, T1.KgmAgr, T1.PieAgr, T1.MtrAgr, T1.BarAgrSer, T1.BarAgrDsc, T1.CliCodAgr, T1.DisCodAgr, T1.ColNomAgr, T1.ColNumAgr, T1.ColNoCAgr, T1.ColNuCAgr, T1.BarAgrDNu, T1.EmprCod, COALESCE( T2.BarAgrEst, '') AS FindBarAgr, COALESCE( T3.DisDes, ' ') AS FindDes FROM ((TXPBARAGR T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = ? AND T2.BarCod = T1.BarAgrCod AND T2.BarCodReo = T1.BarAgrReo AND T2.BarCodPar = T1.BarAgrPar) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarAgrCod AND T3.BarCodReo = T1.BarAgrReo AND T3.BarCodPar = T1.BarAgrPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarAgrCod = ? and T1.BarAgrReo = ? and T1.BarAgrPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrCod, T1.BarAgrReo, T1.BarAgrPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009107", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009108", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009109", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009110", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T0009111", "INSERT INTO TXPBARAGR(BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T0009112", "UPDATE TXPBARAGR SET KgmAgr=?, PieAgr=?, MtrAgr=?, BarAgrSer=?, BarAgrDsc=?, CliCodAgr=?, DisCodAgr=?, ColNomAgr=?, ColNumAgr=?, ColNoCAgr=?, ColNuCAgr=?, BarAgrDNu=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T0009113", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new ForEachCursor("T0009115", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009116", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009117", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009118", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009119", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) ORDER BY MaqCDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009120", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?))) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009121", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009122", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009123", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009125", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009126", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009127", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009128", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009130", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009131", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0009133", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((String[]) buf[18])[0] = rslt.getString(17, 3);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 31 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 95 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 96 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 103 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 112 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 114 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 116 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 118 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 3);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 6);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 60);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
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
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
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
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 60);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               stmt.setString(8, (String)parms[11], 8);
               stmt.setString(9, (String)parms[12], 1);
               stmt.setString(10, (String)parms[13], 6);
               stmt.setInt(11, ((Number) parms[14]).intValue());
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setString(13, (String)parms[16], 16);
               stmt.setString(14, (String)parms[17], 13);
               stmt.setInt(15, ((Number) parms[18]).intValue());
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[20], 3);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               stmt.setString(5, (String)parms[5], 8);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 6);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 13);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[20], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 86 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 88 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 89 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 91 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 92 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 93 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               return;
            case 96 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 3);
               }
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 98 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 99 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 100 :
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 1);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(10, (String)parms[12], 16);
               stmt.setString(11, (String)parms[13], 26);
               stmt.setInt(12, ((Number) parms[14]).intValue());
               stmt.setInt(13, ((Number) parms[15]).intValue());
               stmt.setString(14, (String)parms[16], 13);
               stmt.setInt(15, ((Number) parms[17]).intValue());
               stmt.setString(16, (String)parms[18], 13);
               stmt.setInt(17, ((Number) parms[19]).intValue());
               stmt.setString(18, (String)parms[20], 8);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[22], 3);
               }
               return;
            case 101 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 26);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 8);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[19], 1);
               }
               stmt.setInt(17, ((Number) parms[20]).intValue());
               stmt.setByte(18, ((Number) parms[21]).byteValue());
               stmt.setString(19, (String)parms[22], 1);
               return;
            case 102 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 103 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 3);
               }
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 105 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 106 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 107 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setVarchar(2, (String)parms[2], 40);
               return;
            case 108 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setVarchar(2, (String)parms[2], 60);
               return;
            case 109 :
               stmt.setVarchar(1, (String)parms[0], 40);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 110 :
               stmt.setVarchar(1, (String)parms[0], 60);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 111 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 112 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 113 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 114 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 115 :
               stmt.setVarchar(1, (String)parms[0], 60);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 116 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 117 :
               stmt.setVarchar(1, (String)parms[0], 40);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
      }
   }

}

