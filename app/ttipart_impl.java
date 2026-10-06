package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipart_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TIPARTCOD") == 0 )
      {
         AV51TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TipArtCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51TipArtCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatipartcod2C100( AV51TipArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"TIPARTCOD") == 0 )
      {
         A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
         n829TipArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         AV52autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asatipartcod2C100( A829TipArtCod, AV52autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"") == 0 )
      {
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
            AV46EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46EmprCod", AV46EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
            AV51TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TipArtCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51TipArtCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tipos de Articulos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttipart_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttipart_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipart_impl.class ));
   }

   public ttipart_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkTipArtEst = UIFactory.getCheckbox(this);
      chkTipArtAct = UIFactory.getCheckbox(this);
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
      A8713TipArtEst = ((GXutil.strcmp(GXutil.rtrim( A8713TipArtEst), "S")==0) ? "S" : "N") ;
      n8713TipArtEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
      A14361TipArtAct = ((GXutil.strcmp(GXutil.rtrim( A14361TipArtAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtCod_Internalname, GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtDsc_Internalname, GXutil.rtrim( A830TipArtDsc), GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtDsc2_Internalname, httpContext.getMessage( "Descripcion (large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtDsc2_Internalname, GXutil.rtrim( A6014TipArtDsc2), GXutil.rtrim( localUtil.format( A6014TipArtDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtDsc2_Enabled, 1, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkTipArtEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkTipArtEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkTipArtEst.getInternalname(), A8713TipArtEst, "", httpContext.getMessage( "Estado", ""), 1, chkTipArtEst.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(37, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,37);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkTipArtAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkTipArtAct.getInternalname(), httpContext.getMessage( "Activo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkTipArtAct.getInternalname(), A14361TipArtAct, "", httpContext.getMessage( "Activo?", ""), 1, chkTipArtAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(42, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,42);\"");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtProd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtProd_Internalname, httpContext.getMessage( "Productividad(%)", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtProd_Internalname, GXutil.ltrim( localUtil.ntoc( A7078TipArtProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtProd_Enabled!=0) ? localUtil.format( A7078TipArtProd, "ZZ9.99") : localUtil.format( A7078TipArtProd, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtProd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtProd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTipArtDias_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipArtDias_Internalname, httpContext.getMessage( "Dias, Ciclo Produccion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtDias_Internalname, GXutil.ltrim( localUtil.ntoc( A7376TipArtDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtDias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7376TipArtDias), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7376TipArtDias), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtDias_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipArtDias_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTIPART.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTIPART.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV54Pgmname), GXutil.rtrim( localUtil.format( AV54Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTIPART.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e112C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z829TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8713TipArtEst = httpContext.cgiGet( "Z8713TipArtEst") ;
            Z830TipArtDsc = httpContext.cgiGet( "Z830TipArtDsc") ;
            Z6014TipArtDsc2 = httpContext.cgiGet( "Z6014TipArtDsc2") ;
            Z4608TipArtClas = httpContext.cgiGet( "Z4608TipArtClas") ;
            Z5250TipArtCtb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5250TipArtCtb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7078TipArtProd = localUtil.ctond( httpContext.cgiGet( "Z7078TipArtProd")) ;
            Z7376TipArtDias = (short)(localUtil.ctol( httpContext.cgiGet( "Z7376TipArtDias"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11044TipArtOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z11044TipArtOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14361TipArtAct = httpContext.cgiGet( "Z14361TipArtAct") ;
            A4608TipArtClas = httpContext.cgiGet( "Z4608TipArtClas") ;
            n4608TipArtClas = false ;
            A5250TipArtCtb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5250TipArtCtb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5250TipArtCtb = false ;
            A11044TipArtOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z11044TipArtOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11044TipArtOrd = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A14008ID_TipArtD = httpContext.cgiGet( "ID_TIPARTD") ;
            A13788TipArtCodD = httpContext.cgiGet( "TIPARTCODD") ;
            AV46EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV51TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPARTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV52autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4608TipArtClas = httpContext.cgiGet( "TIPARTCLAS") ;
            A5250TipArtCtb = (byte)(localUtil.ctol( httpContext.cgiGet( "TIPARTCTB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11044TipArtOrd = (short)(localUtil.ctol( httpContext.cgiGet( "TIPARTORD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A829TipArtCod = (short)(0) ;
               n829TipArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
            }
            else
            {
               A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n829TipArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
            }
            A830TipArtDsc = httpContext.cgiGet( edtTipArtDsc_Internalname) ;
            n830TipArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
            A6014TipArtDsc2 = httpContext.cgiGet( edtTipArtDsc2_Internalname) ;
            n6014TipArtDsc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6014TipArtDsc2", A6014TipArtDsc2);
            A8713TipArtEst = ((GXutil.strcmp(httpContext.cgiGet( chkTipArtEst.getInternalname()), "S")==0) ? "S" : "N") ;
            n8713TipArtEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
            A14361TipArtAct = ((GXutil.strcmp(httpContext.cgiGet( chkTipArtAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipArtProd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipArtProd_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTPROD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipArtProd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7078TipArtProd = DecimalUtil.ZERO ;
               n7078TipArtProd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7078TipArtProd", GXutil.ltrimstr( A7078TipArtProd, 6, 2));
            }
            else
            {
               A7078TipArtProd = localUtil.ctond( httpContext.cgiGet( edtTipArtProd_Internalname)) ;
               n7078TipArtProd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7078TipArtProd", GXutil.ltrimstr( A7078TipArtProd, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTDIAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipArtDias_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7376TipArtDias = (short)(0) ;
               n7376TipArtDias = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7376TipArtDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7376TipArtDias), 3, 0));
            }
            else
            {
               A7376TipArtDias = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n7376TipArtDias = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7376TipArtDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7376TipArtDias), 3, 0));
            }
            AV54Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTIPART");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("TipArtClas", GXutil.rtrim( localUtil.format( A4608TipArtClas, "")));
            forbiddenHiddens.add("TipArtCtb", localUtil.format( DecimalUtil.doubleToDec(A5250TipArtCtb), "Z9"));
            forbiddenHiddens.add("TipArtOrd", localUtil.format( DecimalUtil.doubleToDec(A11044TipArtOrd), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A829TipArtCod != Z829TipArtCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttipart:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
               n829TipArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
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
                  sMode100 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode100 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound100 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_2C0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TIPARTCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipArtCod_Internalname ;
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
                        e112C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e122C2 ();
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
         e122C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2C100( ) ;
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
         disableAttributes2C100( ) ;
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

   public void confirm_2C0( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2C100( ) ;
         }
         else
         {
            checkExtendedTable2C100( ) ;
            closeExtendedTableCursors2C100( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption2C0( )
   {
   }

   public void e112C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttipart_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttipart_impl.this.A396EmprCod = GXv_char2[0] ;
      ttipart_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipart_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV52autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      ttipart_impl.this.GXt_int5 = GXv_int6[0] ;
      AV52autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52autonumber), 4, 0));
      GXt_int5 = AV28Reg000 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      ttipart_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Reg000", GXutil.str( AV28Reg000, 1, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttipart_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV46EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttipart_impl.this.AV46EmprCod = GXv_char4[0] ;
      ttipart_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipart_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46EmprCod", AV46EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV48WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV48WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV49TrnContext.fromxml(AV50WebSession.getValue("TrnContext"), null, null);
   }

   public void e122C2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV49TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ttipartww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
   }

   public void zm2C100( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8713TipArtEst = T002C3_A8713TipArtEst[0] ;
            Z830TipArtDsc = T002C3_A830TipArtDsc[0] ;
            Z6014TipArtDsc2 = T002C3_A6014TipArtDsc2[0] ;
            Z4608TipArtClas = T002C3_A4608TipArtClas[0] ;
            Z5250TipArtCtb = T002C3_A5250TipArtCtb[0] ;
            Z7078TipArtProd = T002C3_A7078TipArtProd[0] ;
            Z7376TipArtDias = T002C3_A7376TipArtDias[0] ;
            Z11044TipArtOrd = T002C3_A11044TipArtOrd[0] ;
            Z14361TipArtAct = T002C3_A14361TipArtAct[0] ;
         }
         else
         {
            Z8713TipArtEst = A8713TipArtEst ;
            Z830TipArtDsc = A830TipArtDsc ;
            Z6014TipArtDsc2 = A6014TipArtDsc2 ;
            Z4608TipArtClas = A4608TipArtClas ;
            Z5250TipArtCtb = A5250TipArtCtb ;
            Z7078TipArtProd = A7078TipArtProd ;
            Z7376TipArtDias = A7376TipArtDias ;
            Z11044TipArtOrd = A11044TipArtOrd ;
            Z14361TipArtAct = A14361TipArtAct ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z829TipArtCod = A829TipArtCod ;
         Z8713TipArtEst = A8713TipArtEst ;
         Z830TipArtDsc = A830TipArtDsc ;
         Z6014TipArtDsc2 = A6014TipArtDsc2 ;
         Z4608TipArtClas = A4608TipArtClas ;
         Z5250TipArtCtb = A5250TipArtCtb ;
         Z7078TipArtProd = A7078TipArtProd ;
         Z7376TipArtDias = A7376TipArtDias ;
         Z11044TipArtOrd = A11044TipArtOrd ;
         Z14361TipArtAct = A14361TipArtAct ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTipArtDsc2_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc2_Enabled), 5, 0), true);
      AV54Pgmname = "TTIPART" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV46EmprCod)==0) )
      {
         A396EmprCod = AV46EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SUPREM", ""), ""), GXv_int6) ;
      ttipart_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SUPREM", ""), ""), GXv_int6) ;
         ttipart_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
         }
      }
      if ( ! (0==AV51TipArtCod) )
      {
         A829TipArtCod = AV51TipArtCod ;
         n829TipArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      }
      if ( ! (0==AV51TipArtCod) )
      {
         edtTipArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV51TipArtCod) )
      {
         edtTipArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A14361TipArtAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A14361TipArtAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
      }
   }

   public void load2C100( )
   {
      /* Using cursor T002C4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound100 = (short)(1) ;
         A8713TipArtEst = T002C4_A8713TipArtEst[0] ;
         n8713TipArtEst = T002C4_n8713TipArtEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
         A830TipArtDsc = T002C4_A830TipArtDsc[0] ;
         n830TipArtDsc = T002C4_n830TipArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A6014TipArtDsc2 = T002C4_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = T002C4_n6014TipArtDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6014TipArtDsc2", A6014TipArtDsc2);
         A4608TipArtClas = T002C4_A4608TipArtClas[0] ;
         n4608TipArtClas = T002C4_n4608TipArtClas[0] ;
         A5250TipArtCtb = T002C4_A5250TipArtCtb[0] ;
         n5250TipArtCtb = T002C4_n5250TipArtCtb[0] ;
         A7078TipArtProd = T002C4_A7078TipArtProd[0] ;
         n7078TipArtProd = T002C4_n7078TipArtProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7078TipArtProd", GXutil.ltrimstr( A7078TipArtProd, 6, 2));
         A7376TipArtDias = T002C4_A7376TipArtDias[0] ;
         n7376TipArtDias = T002C4_n7376TipArtDias[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7376TipArtDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7376TipArtDias), 3, 0));
         A11044TipArtOrd = T002C4_A11044TipArtOrd[0] ;
         n11044TipArtOrd = T002C4_n11044TipArtOrd[0] ;
         A14361TipArtAct = T002C4_A14361TipArtAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
         zm2C100( -14) ;
      }
      pr_default.close(2);
      onLoadActions2C100( ) ;
   }

   public void onLoadActions2C100( )
   {
      A14008ID_TipArtD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14008ID_TipArtD", A14008ID_TipArtD);
      A13788TipArtCodD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) + " " + GXutil.trim( A6014TipArtDsc2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13788TipArtCodD", A13788TipArtCodD);
      if ( isIns( )  )
      {
         A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n8713TipArtEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) )
         {
            A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            n8713TipArtEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) )
            {
               A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               n8713TipArtEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
            }
         }
      }
   }

   public void checkExtendedTable2C100( )
   {
      nIsDirty_100 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_100 = (short)(1) ;
      A14008ID_TipArtD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14008ID_TipArtD", A14008ID_TipArtD);
      nIsDirty_100 = (short)(1) ;
      A13788TipArtCodD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) + " " + GXutil.trim( A6014TipArtDsc2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13788TipArtCodD", A13788TipArtCodD);
      if ( isIns( )  )
      {
         nIsDirty_100 = (short)(1) ;
         A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n8713TipArtEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) )
         {
            nIsDirty_100 = (short)(1) ;
            A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            n8713TipArtEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) )
            {
               nIsDirty_100 = (short)(1) ;
               A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               n8713TipArtEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
            }
         }
      }
   }

   public void closeExtendedTableCursors2C100( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2C100( )
   {
      /* Using cursor T002C5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound100 = (short)(1) ;
      }
      else
      {
         RcdFound100 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002C3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T002C3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2C100( 14) ;
         RcdFound100 = (short)(1) ;
         A829TipArtCod = T002C3_A829TipArtCod[0] ;
         n829TipArtCod = T002C3_n829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         A8713TipArtEst = T002C3_A8713TipArtEst[0] ;
         n8713TipArtEst = T002C3_n8713TipArtEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
         A830TipArtDsc = T002C3_A830TipArtDsc[0] ;
         n830TipArtDsc = T002C3_n830TipArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A6014TipArtDsc2 = T002C3_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = T002C3_n6014TipArtDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6014TipArtDsc2", A6014TipArtDsc2);
         A4608TipArtClas = T002C3_A4608TipArtClas[0] ;
         n4608TipArtClas = T002C3_n4608TipArtClas[0] ;
         A5250TipArtCtb = T002C3_A5250TipArtCtb[0] ;
         n5250TipArtCtb = T002C3_n5250TipArtCtb[0] ;
         A7078TipArtProd = T002C3_A7078TipArtProd[0] ;
         n7078TipArtProd = T002C3_n7078TipArtProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7078TipArtProd", GXutil.ltrimstr( A7078TipArtProd, 6, 2));
         A7376TipArtDias = T002C3_A7376TipArtDias[0] ;
         n7376TipArtDias = T002C3_n7376TipArtDias[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7376TipArtDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7376TipArtDias), 3, 0));
         A11044TipArtOrd = T002C3_A11044TipArtOrd[0] ;
         n11044TipArtOrd = T002C3_n11044TipArtOrd[0] ;
         A14361TipArtAct = T002C3_A14361TipArtAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
         Z396EmprCod = A396EmprCod ;
         Z829TipArtCod = A829TipArtCod ;
         sMode100 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2C100( ) ;
         if ( AnyError == 1 )
         {
            RcdFound100 = (short)(0) ;
            initializeNonKey2C100( ) ;
         }
         Gx_mode = sMode100 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound100 = (short)(0) ;
         initializeNonKey2C100( ) ;
         sMode100 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode100 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2C100( ) ;
      if ( RcdFound100 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound100 = (short)(0) ;
      /* Using cursor T002C6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod), A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T002C6_A829TipArtCod[0] < A829TipArtCod ) ) && ( GXutil.strcmp(T002C6_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T002C6_A829TipArtCod[0] > A829TipArtCod ) ) && ( GXutil.strcmp(T002C6_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A829TipArtCod = T002C6_A829TipArtCod[0] ;
            n829TipArtCod = T002C6_n829TipArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
            RcdFound100 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound100 = (short)(0) ;
      /* Using cursor T002C7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T002C7_A829TipArtCod[0] > A829TipArtCod ) ) && ( GXutil.strcmp(T002C7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T002C7_A829TipArtCod[0] < A829TipArtCod ) ) && ( GXutil.strcmp(T002C7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A829TipArtCod = T002C7_A829TipArtCod[0] ;
            n829TipArtCod = T002C7_n829TipArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
            RcdFound100 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2C100( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2C100( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound100 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
            {
               A829TipArtCod = Z829TipArtCod ;
               n829TipArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TIPARTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update2C100( ) ;
               GX_FocusControl = edtTipArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTipArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2C100( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TIPARTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTipArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2C100( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
      {
         A829TipArtCod = Z829TipArtCod ;
         n829TipArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2C100( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002C2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPART"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8713TipArtEst, T002C2_A8713TipArtEst[0]) != 0 ) || ( GXutil.strcmp(Z830TipArtDsc, T002C2_A830TipArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z6014TipArtDsc2, T002C2_A6014TipArtDsc2[0]) != 0 ) || ( GXutil.strcmp(Z4608TipArtClas, T002C2_A4608TipArtClas[0]) != 0 ) || ( Z5250TipArtCtb != T002C2_A5250TipArtCtb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7078TipArtProd, T002C2_A7078TipArtProd[0]) != 0 ) || ( Z7376TipArtDias != T002C2_A7376TipArtDias[0] ) || ( Z11044TipArtOrd != T002C2_A11044TipArtOrd[0] ) || ( GXutil.strcmp(Z14361TipArtAct, T002C2_A14361TipArtAct[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8713TipArtEst, T002C2_A8713TipArtEst[0]) != 0 )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtEst");
               GXutil.writeLogRaw("Old: ",Z8713TipArtEst);
               GXutil.writeLogRaw("Current: ",T002C2_A8713TipArtEst[0]);
            }
            if ( GXutil.strcmp(Z830TipArtDsc, T002C2_A830TipArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtDsc");
               GXutil.writeLogRaw("Old: ",Z830TipArtDsc);
               GXutil.writeLogRaw("Current: ",T002C2_A830TipArtDsc[0]);
            }
            if ( GXutil.strcmp(Z6014TipArtDsc2, T002C2_A6014TipArtDsc2[0]) != 0 )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtDsc2");
               GXutil.writeLogRaw("Old: ",Z6014TipArtDsc2);
               GXutil.writeLogRaw("Current: ",T002C2_A6014TipArtDsc2[0]);
            }
            if ( GXutil.strcmp(Z4608TipArtClas, T002C2_A4608TipArtClas[0]) != 0 )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtClas");
               GXutil.writeLogRaw("Old: ",Z4608TipArtClas);
               GXutil.writeLogRaw("Current: ",T002C2_A4608TipArtClas[0]);
            }
            if ( Z5250TipArtCtb != T002C2_A5250TipArtCtb[0] )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtCtb");
               GXutil.writeLogRaw("Old: ",Z5250TipArtCtb);
               GXutil.writeLogRaw("Current: ",T002C2_A5250TipArtCtb[0]);
            }
            if ( DecimalUtil.compareTo(Z7078TipArtProd, T002C2_A7078TipArtProd[0]) != 0 )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtProd");
               GXutil.writeLogRaw("Old: ",Z7078TipArtProd);
               GXutil.writeLogRaw("Current: ",T002C2_A7078TipArtProd[0]);
            }
            if ( Z7376TipArtDias != T002C2_A7376TipArtDias[0] )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtDias");
               GXutil.writeLogRaw("Old: ",Z7376TipArtDias);
               GXutil.writeLogRaw("Current: ",T002C2_A7376TipArtDias[0]);
            }
            if ( Z11044TipArtOrd != T002C2_A11044TipArtOrd[0] )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtOrd");
               GXutil.writeLogRaw("Old: ",Z11044TipArtOrd);
               GXutil.writeLogRaw("Current: ",T002C2_A11044TipArtOrd[0]);
            }
            if ( GXutil.strcmp(Z14361TipArtAct, T002C2_A14361TipArtAct[0]) != 0 )
            {
               GXutil.writeLogln("ttipart:[seudo value changed for attri]"+"TipArtAct");
               GXutil.writeLogRaw("Old: ",Z14361TipArtAct);
               GXutil.writeLogRaw("Current: ",T002C2_A14361TipArtAct[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPART"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2C100( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2C100( 0) ;
         checkOptimisticConcurrency2C100( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2C100( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2C100( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002C8 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod), Boolean.valueOf(n8713TipArtEst), A8713TipArtEst, Boolean.valueOf(n830TipArtDsc), A830TipArtDsc, Boolean.valueOf(n6014TipArtDsc2), A6014TipArtDsc2, Boolean.valueOf(n4608TipArtClas), A4608TipArtClas, Boolean.valueOf(n5250TipArtCtb), Byte.valueOf(A5250TipArtCtb), Boolean.valueOf(n7078TipArtProd), A7078TipArtProd, Boolean.valueOf(n7376TipArtDias), Short.valueOf(A7376TipArtDias), Boolean.valueOf(n11044TipArtOrd), Short.valueOf(A11044TipArtOrd), A14361TipArtAct, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPART");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption2C0( ) ;
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
            load2C100( ) ;
         }
         endLevel2C100( ) ;
      }
      closeExtendedTableCursors2C100( ) ;
   }

   public void update2C100( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2C100( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2C100( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2C100( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002C9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n8713TipArtEst), A8713TipArtEst, Boolean.valueOf(n830TipArtDsc), A830TipArtDsc, Boolean.valueOf(n6014TipArtDsc2), A6014TipArtDsc2, Boolean.valueOf(n4608TipArtClas), A4608TipArtClas, Boolean.valueOf(n5250TipArtCtb), Byte.valueOf(A5250TipArtCtb), Boolean.valueOf(n7078TipArtProd), A7078TipArtProd, Boolean.valueOf(n7376TipArtDias), Short.valueOf(A7376TipArtDias), Boolean.valueOf(n11044TipArtOrd), Short.valueOf(A11044TipArtOrd), A14361TipArtAct, A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPART");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPART"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2C100( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
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
         endLevel2C100( ) ;
      }
      closeExtendedTableCursors2C100( ) ;
   }

   public void deferredUpdate2C100( )
   {
   }

   public void delete( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2C100( ) ;
         afterConfirm2C100( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2C100( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002C10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPART");
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
      sMode100 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2C100( ) ;
      Gx_mode = sMode100 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2C100( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14008ID_TipArtD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14008ID_TipArtD", A14008ID_TipArtD);
         A13788TipArtCodD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) + " " + GXutil.trim( A6014TipArtDsc2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13788TipArtCodD", A13788TipArtCodD);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002C11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T002C12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAREST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T002C13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T002C14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T002C15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T002C16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T002C17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T002C18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002C19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002C20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T002C21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void endLevel2C100( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttipart");
         if ( AnyError == 0 )
         {
            confirmValues2C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttipart");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2C100( )
   {
      /* Scan By routine */
      /* Using cursor T002C22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      RcdFound100 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound100 = (short)(1) ;
         A829TipArtCod = T002C22_A829TipArtCod[0] ;
         n829TipArtCod = T002C22_n829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2C100( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound100 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound100 = (short)(1) ;
         A829TipArtCod = T002C22_A829TipArtCod[0] ;
         n829TipArtCod = T002C22_n829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      }
   }

   public void scanEnd2C100( )
   {
      pr_default.close(20);
   }

   public void afterConfirm2C100( )
   {
      /* After Confirm Rules */
      if ( (0==A829TipArtCod) && (0==AV52autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert2C100( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A829TipArtCod) && ( AV52autonumber == 1 ) )
      {
         GXt_int8 = A829TipArtCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.ttipart_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         ttipart_impl.this.GXt_int8 = GXv_int9[0] ;
         A829TipArtCod = GXt_int8 ;
         n829TipArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      }
   }

   public void beforeUpdate2C100( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2C100( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2C100( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2C100( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2C100( )
   {
      edtTipArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), true);
      edtTipArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc_Enabled), 5, 0), true);
      edtTipArtDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc2_Enabled), 5, 0), true);
      chkTipArtEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkTipArtEst.getInternalname(), "Enabled", GXutil.ltrimstr( chkTipArtEst.getEnabled(), 5, 0), true);
      chkTipArtAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkTipArtAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkTipArtAct.getEnabled(), 5, 0), true);
      edtTipArtProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtProd_Enabled), 5, 0), true);
      edtTipArtDias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDias_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2C100( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2C0( )
   {
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttipart", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV46EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV51TipArtCod,4,0))}, new String[] {"Gx_mode","EmprCod","TipArtCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTIPART");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("TipArtClas", GXutil.rtrim( localUtil.format( A4608TipArtClas, "")));
      forbiddenHiddens.add("TipArtCtb", localUtil.format( DecimalUtil.doubleToDec(A5250TipArtCtb), "Z9"));
      forbiddenHiddens.add("TipArtOrd", localUtil.format( DecimalUtil.doubleToDec(A11044TipArtOrd), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttipart:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z829TipArtCod", GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8713TipArtEst", GXutil.rtrim( Z8713TipArtEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z830TipArtDsc", GXutil.rtrim( Z830TipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6014TipArtDsc2", GXutil.rtrim( Z6014TipArtDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4608TipArtClas", GXutil.rtrim( Z4608TipArtClas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5250TipArtCtb", GXutil.ltrim( localUtil.ntoc( Z5250TipArtCtb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7078TipArtProd", GXutil.ltrim( localUtil.ntoc( Z7078TipArtProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7376TipArtDias", GXutil.ltrim( localUtil.ntoc( Z7376TipArtDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11044TipArtOrd", GXutil.ltrim( localUtil.ntoc( Z11044TipArtOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14361TipArtAct", GXutil.rtrim( Z14361TipArtAct));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV49TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV49TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV49TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "ID_TIPARTD", GXutil.rtrim( A14008ID_TipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTCODD", A13788TipArtCodD);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV46EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV51TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPARTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51TipArtCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV52autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTCLAS", GXutil.rtrim( A4608TipArtClas));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTCTB", GXutil.ltrim( localUtil.ntoc( A5250TipArtCtb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTORD", GXutil.ltrim( localUtil.ntoc( A11044TipArtOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
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
      return formatLink("app.ttipart", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV46EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV51TipArtCod,4,0))}, new String[] {"Gx_mode","EmprCod","TipArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTIPART" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tipos de Articulos", "") ;
   }

   public void initializeNonKey2C100( )
   {
      A8713TipArtEst = "" ;
      n8713TipArtEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
      A13788TipArtCodD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13788TipArtCodD", A13788TipArtCodD);
      A14008ID_TipArtD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14008ID_TipArtD", A14008ID_TipArtD);
      A830TipArtDsc = "" ;
      n830TipArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      A6014TipArtDsc2 = "" ;
      n6014TipArtDsc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6014TipArtDsc2", A6014TipArtDsc2);
      A4608TipArtClas = "" ;
      n4608TipArtClas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
      A5250TipArtCtb = (byte)(0) ;
      n5250TipArtCtb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5250TipArtCtb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5250TipArtCtb), 2, 0));
      A7078TipArtProd = DecimalUtil.ZERO ;
      n7078TipArtProd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7078TipArtProd", GXutil.ltrimstr( A7078TipArtProd, 6, 2));
      A7376TipArtDias = (short)(0) ;
      n7376TipArtDias = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7376TipArtDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7376TipArtDias), 3, 0));
      A11044TipArtOrd = (short)(0) ;
      n11044TipArtOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11044TipArtOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11044TipArtOrd), 4, 0));
      A14361TipArtAct = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
      Z8713TipArtEst = "" ;
      Z830TipArtDsc = "" ;
      Z6014TipArtDsc2 = "" ;
      Z4608TipArtClas = "" ;
      Z5250TipArtCtb = (byte)(0) ;
      Z7078TipArtProd = DecimalUtil.ZERO ;
      Z7376TipArtDias = (short)(0) ;
      Z11044TipArtOrd = (short)(0) ;
      Z14361TipArtAct = "" ;
   }

   public void initAll2C100( )
   {
      A829TipArtCod = (short)(0) ;
      n829TipArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      initializeNonKey2C100( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14361TipArtAct = i14361TipArtAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652969", true, true);
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
      httpContext.AddJavascriptSource("ttipart.js", "?20268211652969", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtTipArtCod_Internalname = "TIPARTCOD" ;
      edtTipArtDsc_Internalname = "TIPARTDSC" ;
      edtTipArtDsc2_Internalname = "TIPARTDSC2" ;
      chkTipArtEst.setInternalname( "TIPARTEST" );
      chkTipArtAct.setInternalname( "TIPARTACT" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtTipArtProd_Internalname = "TIPARTPROD" ;
      edtTipArtDias_Internalname = "TIPARTDIAS" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tipos de Articulos", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTipArtDias_Jsonclick = "" ;
      edtTipArtDias_Enabled = 1 ;
      edtTipArtProd_Jsonclick = "" ;
      edtTipArtProd_Enabled = 1 ;
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
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      chkTipArtAct.setEnabled( 1 );
      chkTipArtEst.setEnabled( 1 );
      edtTipArtDsc2_Jsonclick = "" ;
      edtTipArtDsc2_Enabled = 1 ;
      edtTipArtDsc_Jsonclick = "" ;
      edtTipArtDsc_Enabled = 1 ;
      edtTipArtCod_Jsonclick = "" ;
      edtTipArtCod_Enabled = 1 ;
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

   public void gx4asatipartcod2C100( short AV51TipArtCod )
   {
      if ( ! (0==AV51TipArtCod) )
      {
         A829TipArtCod = AV51TipArtCod ;
         n829TipArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asatipartcod2C100( short A829TipArtCod ,
                                     short AV52autonumber ,
                                     String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A829TipArtCod) && ( AV52autonumber == 1 ) )
      {
         GXt_int8 = A829TipArtCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.ttipart_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         ttipart_impl.this.GXt_int8 = GXv_int9[0] ;
         A829TipArtCod = GXt_int8 ;
         n829TipArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      chkTipArtEst.setName( "TIPARTEST" );
      chkTipArtEst.setWebtags( "" );
      chkTipArtEst.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkTipArtEst.getInternalname(), "TitleCaption", chkTipArtEst.getCaption(), true);
      chkTipArtEst.setCheckedValue( "N" );
      A8713TipArtEst = ((GXutil.strcmp(GXutil.rtrim( A8713TipArtEst), "S")==0) ? "S" : "N") ;
      n8713TipArtEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8713TipArtEst", A8713TipArtEst);
      chkTipArtAct.setName( "TIPARTACT" );
      chkTipArtAct.setWebtags( "" );
      chkTipArtAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkTipArtAct.getInternalname(), "TitleCaption", chkTipArtAct.getCaption(), true);
      chkTipArtAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A14361TipArtAct)==0) )
      {
         A14361TipArtAct = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14361TipArtAct", A14361TipArtAct);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9',hsh:true},{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV49TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9',hsh:true},{av:'A4608TipArtClas',fld:'TIPARTCLAS',pic:''},{av:'A5250TipArtCtb',fld:'TIPARTCTB',pic:'Z9'},{av:'A11044TipArtOrd',fld:'TIPARTORD',pic:'ZZZ9'},{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e122C2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV49TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
      setEventMetadata("VALID_TIPARTDSC","{handler:'valid_Tipartdsc',iparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("VALID_TIPARTDSC",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
      setEventMetadata("VALID_TIPARTDSC2","{handler:'valid_Tipartdsc2',iparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("VALID_TIPARTDSC2",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
      setEventMetadata("VALID_TIPARTEST","{handler:'valid_Tipartest',iparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]");
      setEventMetadata("VALID_TIPARTEST",",oparms:[{av:'A8713TipArtEst',fld:'TIPARTEST',pic:''},{av:'A14361TipArtAct',fld:'TIPARTACT',pic:''}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV46EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8713TipArtEst = "" ;
      Z830TipArtDsc = "" ;
      Z6014TipArtDsc2 = "" ;
      Z4608TipArtClas = "" ;
      Z7078TipArtProd = DecimalUtil.ZERO ;
      Z14361TipArtAct = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV46EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A8713TipArtEst = "" ;
      A14361TipArtAct = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      A7078TipArtProd = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV54Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A4608TipArtClas = "" ;
      A14008ID_TipArtD = "" ;
      A13788TipArtCodD = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode100 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV48WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV50WebSession = httpContext.getWebSession();
      GXv_int6 = new byte[1] ;
      T002C4_A829TipArtCod = new short[1] ;
      T002C4_n829TipArtCod = new boolean[] {false} ;
      T002C4_A8713TipArtEst = new String[] {""} ;
      T002C4_n8713TipArtEst = new boolean[] {false} ;
      T002C4_A830TipArtDsc = new String[] {""} ;
      T002C4_n830TipArtDsc = new boolean[] {false} ;
      T002C4_A6014TipArtDsc2 = new String[] {""} ;
      T002C4_n6014TipArtDsc2 = new boolean[] {false} ;
      T002C4_A4608TipArtClas = new String[] {""} ;
      T002C4_n4608TipArtClas = new boolean[] {false} ;
      T002C4_A5250TipArtCtb = new byte[1] ;
      T002C4_n5250TipArtCtb = new boolean[] {false} ;
      T002C4_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002C4_n7078TipArtProd = new boolean[] {false} ;
      T002C4_A7376TipArtDias = new short[1] ;
      T002C4_n7376TipArtDias = new boolean[] {false} ;
      T002C4_A11044TipArtOrd = new short[1] ;
      T002C4_n11044TipArtOrd = new boolean[] {false} ;
      T002C4_A14361TipArtAct = new String[] {""} ;
      T002C4_A396EmprCod = new String[] {""} ;
      T002C5_A396EmprCod = new String[] {""} ;
      T002C5_A829TipArtCod = new short[1] ;
      T002C5_n829TipArtCod = new boolean[] {false} ;
      T002C3_A829TipArtCod = new short[1] ;
      T002C3_n829TipArtCod = new boolean[] {false} ;
      T002C3_A8713TipArtEst = new String[] {""} ;
      T002C3_n8713TipArtEst = new boolean[] {false} ;
      T002C3_A830TipArtDsc = new String[] {""} ;
      T002C3_n830TipArtDsc = new boolean[] {false} ;
      T002C3_A6014TipArtDsc2 = new String[] {""} ;
      T002C3_n6014TipArtDsc2 = new boolean[] {false} ;
      T002C3_A4608TipArtClas = new String[] {""} ;
      T002C3_n4608TipArtClas = new boolean[] {false} ;
      T002C3_A5250TipArtCtb = new byte[1] ;
      T002C3_n5250TipArtCtb = new boolean[] {false} ;
      T002C3_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002C3_n7078TipArtProd = new boolean[] {false} ;
      T002C3_A7376TipArtDias = new short[1] ;
      T002C3_n7376TipArtDias = new boolean[] {false} ;
      T002C3_A11044TipArtOrd = new short[1] ;
      T002C3_n11044TipArtOrd = new boolean[] {false} ;
      T002C3_A14361TipArtAct = new String[] {""} ;
      T002C3_A396EmprCod = new String[] {""} ;
      T002C6_A396EmprCod = new String[] {""} ;
      T002C6_A829TipArtCod = new short[1] ;
      T002C6_n829TipArtCod = new boolean[] {false} ;
      T002C7_A396EmprCod = new String[] {""} ;
      T002C7_A829TipArtCod = new short[1] ;
      T002C7_n829TipArtCod = new boolean[] {false} ;
      T002C2_A829TipArtCod = new short[1] ;
      T002C2_n829TipArtCod = new boolean[] {false} ;
      T002C2_A8713TipArtEst = new String[] {""} ;
      T002C2_n8713TipArtEst = new boolean[] {false} ;
      T002C2_A830TipArtDsc = new String[] {""} ;
      T002C2_n830TipArtDsc = new boolean[] {false} ;
      T002C2_A6014TipArtDsc2 = new String[] {""} ;
      T002C2_n6014TipArtDsc2 = new boolean[] {false} ;
      T002C2_A4608TipArtClas = new String[] {""} ;
      T002C2_n4608TipArtClas = new boolean[] {false} ;
      T002C2_A5250TipArtCtb = new byte[1] ;
      T002C2_n5250TipArtCtb = new boolean[] {false} ;
      T002C2_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002C2_n7078TipArtProd = new boolean[] {false} ;
      T002C2_A7376TipArtDias = new short[1] ;
      T002C2_n7376TipArtDias = new boolean[] {false} ;
      T002C2_A11044TipArtOrd = new short[1] ;
      T002C2_n11044TipArtOrd = new boolean[] {false} ;
      T002C2_A14361TipArtAct = new String[] {""} ;
      T002C2_A396EmprCod = new String[] {""} ;
      T002C11_A396EmprCod = new String[] {""} ;
      T002C11_A829TipArtCod = new short[1] ;
      T002C11_n829TipArtCod = new boolean[] {false} ;
      T002C11_A583IntCod = new byte[1] ;
      T002C12_A396EmprCod = new String[] {""} ;
      T002C12_A829TipArtCod = new short[1] ;
      T002C12_n829TipArtCod = new boolean[] {false} ;
      T002C12_A5173EstTpaAny = new short[1] ;
      T002C12_A5174EstTpaSF = new String[] {""} ;
      T002C13_A396EmprCod = new String[] {""} ;
      T002C13_A4686MaqTipArt = new short[1] ;
      T002C14_A396EmprCod = new String[] {""} ;
      T002C14_A829TipArtCod = new short[1] ;
      T002C14_n829TipArtCod = new boolean[] {false} ;
      T002C14_A4378TipArtVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002C15_A396EmprCod = new String[] {""} ;
      T002C15_A4364GrdTipArt = new short[1] ;
      T002C15_A829TipArtCod = new short[1] ;
      T002C15_n829TipArtCod = new boolean[] {false} ;
      T002C16_A396EmprCod = new String[] {""} ;
      T002C16_A2720TarSec = new String[] {""} ;
      T002C16_A252CliCod = new int[1] ;
      T002C16_A829TipArtCod = new short[1] ;
      T002C16_n829TipArtCod = new boolean[] {false} ;
      T002C16_A831TipColCod = new byte[1] ;
      T002C17_A396EmprCod = new String[] {""} ;
      T002C17_A966PartCod = new String[] {""} ;
      T002C17_A252CliCod = new int[1] ;
      T002C18_A396EmprCod = new String[] {""} ;
      T002C18_A539HisBarCod = new int[1] ;
      T002C18_A545HisCodReo = new byte[1] ;
      T002C18_A544HisCodPar = new String[] {""} ;
      T002C18_A833TipDefCod = new short[1] ;
      T002C19_A396EmprCod = new String[] {""} ;
      T002C19_A129BarCod = new int[1] ;
      T002C19_A132BarCodReo = new byte[1] ;
      T002C19_A130BarCodPar = new String[] {""} ;
      T002C20_A396EmprCod = new String[] {""} ;
      T002C20_A252CliCod = new int[1] ;
      T002C20_A65ArtCod = new String[] {""} ;
      T002C21_A396EmprCod = new String[] {""} ;
      T002C21_A44AlbRecCod = new int[1] ;
      T002C22_A396EmprCod = new String[] {""} ;
      T002C22_A829TipArtCod = new short[1] ;
      T002C22_n829TipArtCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i14361TipArtAct = "" ;
      GXv_int9 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttipart__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttipart__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttipart__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttipart__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttipart__default(),
         new Object[] {
             new Object[] {
            T002C2_A829TipArtCod, T002C2_A8713TipArtEst, T002C2_n8713TipArtEst, T002C2_A830TipArtDsc, T002C2_n830TipArtDsc, T002C2_A6014TipArtDsc2, T002C2_n6014TipArtDsc2, T002C2_A4608TipArtClas, T002C2_n4608TipArtClas, T002C2_A5250TipArtCtb,
            T002C2_n5250TipArtCtb, T002C2_A7078TipArtProd, T002C2_n7078TipArtProd, T002C2_A7376TipArtDias, T002C2_n7376TipArtDias, T002C2_A11044TipArtOrd, T002C2_n11044TipArtOrd, T002C2_A14361TipArtAct, T002C2_A396EmprCod
            }
            , new Object[] {
            T002C3_A829TipArtCod, T002C3_A8713TipArtEst, T002C3_n8713TipArtEst, T002C3_A830TipArtDsc, T002C3_n830TipArtDsc, T002C3_A6014TipArtDsc2, T002C3_n6014TipArtDsc2, T002C3_A4608TipArtClas, T002C3_n4608TipArtClas, T002C3_A5250TipArtCtb,
            T002C3_n5250TipArtCtb, T002C3_A7078TipArtProd, T002C3_n7078TipArtProd, T002C3_A7376TipArtDias, T002C3_n7376TipArtDias, T002C3_A11044TipArtOrd, T002C3_n11044TipArtOrd, T002C3_A14361TipArtAct, T002C3_A396EmprCod
            }
            , new Object[] {
            T002C4_A829TipArtCod, T002C4_A8713TipArtEst, T002C4_n8713TipArtEst, T002C4_A830TipArtDsc, T002C4_n830TipArtDsc, T002C4_A6014TipArtDsc2, T002C4_n6014TipArtDsc2, T002C4_A4608TipArtClas, T002C4_n4608TipArtClas, T002C4_A5250TipArtCtb,
            T002C4_n5250TipArtCtb, T002C4_A7078TipArtProd, T002C4_n7078TipArtProd, T002C4_A7376TipArtDias, T002C4_n7376TipArtDias, T002C4_A11044TipArtOrd, T002C4_n11044TipArtOrd, T002C4_A14361TipArtAct, T002C4_A396EmprCod
            }
            , new Object[] {
            T002C5_A396EmprCod, T002C5_A829TipArtCod
            }
            , new Object[] {
            T002C6_A396EmprCod, T002C6_A829TipArtCod
            }
            , new Object[] {
            T002C7_A396EmprCod, T002C7_A829TipArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002C11_A396EmprCod, T002C11_A829TipArtCod, T002C11_A583IntCod
            }
            , new Object[] {
            T002C12_A396EmprCod, T002C12_A829TipArtCod, T002C12_A5173EstTpaAny, T002C12_A5174EstTpaSF
            }
            , new Object[] {
            T002C13_A396EmprCod, T002C13_A4686MaqTipArt
            }
            , new Object[] {
            T002C14_A396EmprCod, T002C14_A829TipArtCod, T002C14_A4378TipArtVal
            }
            , new Object[] {
            T002C15_A396EmprCod, T002C15_A4364GrdTipArt, T002C15_A829TipArtCod
            }
            , new Object[] {
            T002C16_A396EmprCod, T002C16_A2720TarSec, T002C16_A252CliCod, T002C16_A829TipArtCod, T002C16_A831TipColCod
            }
            , new Object[] {
            T002C17_A396EmprCod, T002C17_A966PartCod, T002C17_A252CliCod
            }
            , new Object[] {
            T002C18_A396EmprCod, T002C18_A539HisBarCod, T002C18_A545HisCodReo, T002C18_A544HisCodPar, T002C18_A833TipDefCod
            }
            , new Object[] {
            T002C19_A396EmprCod, T002C19_A129BarCod, T002C19_A132BarCodReo, T002C19_A130BarCodPar
            }
            , new Object[] {
            T002C20_A396EmprCod, T002C20_A252CliCod, T002C20_A65ArtCod
            }
            , new Object[] {
            T002C21_A396EmprCod, T002C21_A44AlbRecCod
            }
            , new Object[] {
            T002C22_A396EmprCod, T002C22_A829TipArtCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV54Pgmname = "TTIPART" ;
      Z14361TipArtAct = httpContext.getMessage( "S", "") ;
      A14361TipArtAct = httpContext.getMessage( "S", "") ;
      i14361TipArtAct = httpContext.getMessage( "S", "") ;
   }

   private byte Z5250TipArtCtb ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5250TipArtCtb ;
   private byte Gx_BScreen ;
   private byte AV28Reg000 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte gxajaxcallmode ;
   private short wcpOAV51TipArtCod ;
   private short Z829TipArtCod ;
   private short Z7376TipArtDias ;
   private short Z11044TipArtOrd ;
   private short AV51TipArtCod ;
   private short A829TipArtCod ;
   private short AV52autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7376TipArtDias ;
   private short A11044TipArtOrd ;
   private short RcdFound100 ;
   private short nIsDirty_100 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int trnEnded ;
   private int edtTipArtCod_Enabled ;
   private int edtTipArtDsc_Enabled ;
   private int edtTipArtDsc2_Enabled ;
   private int edtTipArtProd_Enabled ;
   private int edtTipArtDias_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z7078TipArtProd ;
   private java.math.BigDecimal A7078TipArtProd ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV46EmprCod ;
   private String Z396EmprCod ;
   private String Z8713TipArtEst ;
   private String Z830TipArtDsc ;
   private String Z6014TipArtDsc2 ;
   private String Z4608TipArtClas ;
   private String Z14361TipArtAct ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV46EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipArtCod_Internalname ;
   private String A8713TipArtEst ;
   private String A14361TipArtAct ;
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
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtTipArtCod_Jsonclick ;
   private String edtTipArtDsc_Internalname ;
   private String A830TipArtDsc ;
   private String edtTipArtDsc_Jsonclick ;
   private String edtTipArtDsc2_Internalname ;
   private String A6014TipArtDsc2 ;
   private String edtTipArtDsc2_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String edtTipArtProd_Internalname ;
   private String edtTipArtProd_Jsonclick ;
   private String edtTipArtDias_Internalname ;
   private String edtTipArtDias_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV54Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A4608TipArtClas ;
   private String A14008ID_TipArtD ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode100 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i14361TipArtAct ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n829TipArtCod ;
   private boolean wbErr ;
   private boolean n8713TipArtEst ;
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
   private boolean n4608TipArtClas ;
   private boolean n5250TipArtCtb ;
   private boolean n11044TipArtOrd ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private boolean n7078TipArtProd ;
   private boolean n7376TipArtDias ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13788TipArtCodD ;
   private com.genexus.webpanels.WebSession AV50WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkTipArtEst ;
   private ICheckbox chkTipArtAct ;
   private IDataStoreProvider pr_default ;
   private short[] T002C4_A829TipArtCod ;
   private boolean[] T002C4_n829TipArtCod ;
   private String[] T002C4_A8713TipArtEst ;
   private boolean[] T002C4_n8713TipArtEst ;
   private String[] T002C4_A830TipArtDsc ;
   private boolean[] T002C4_n830TipArtDsc ;
   private String[] T002C4_A6014TipArtDsc2 ;
   private boolean[] T002C4_n6014TipArtDsc2 ;
   private String[] T002C4_A4608TipArtClas ;
   private boolean[] T002C4_n4608TipArtClas ;
   private byte[] T002C4_A5250TipArtCtb ;
   private boolean[] T002C4_n5250TipArtCtb ;
   private java.math.BigDecimal[] T002C4_A7078TipArtProd ;
   private boolean[] T002C4_n7078TipArtProd ;
   private short[] T002C4_A7376TipArtDias ;
   private boolean[] T002C4_n7376TipArtDias ;
   private short[] T002C4_A11044TipArtOrd ;
   private boolean[] T002C4_n11044TipArtOrd ;
   private String[] T002C4_A14361TipArtAct ;
   private String[] T002C4_A396EmprCod ;
   private String[] T002C5_A396EmprCod ;
   private short[] T002C5_A829TipArtCod ;
   private boolean[] T002C5_n829TipArtCod ;
   private short[] T002C3_A829TipArtCod ;
   private boolean[] T002C3_n829TipArtCod ;
   private String[] T002C3_A8713TipArtEst ;
   private boolean[] T002C3_n8713TipArtEst ;
   private String[] T002C3_A830TipArtDsc ;
   private boolean[] T002C3_n830TipArtDsc ;
   private String[] T002C3_A6014TipArtDsc2 ;
   private boolean[] T002C3_n6014TipArtDsc2 ;
   private String[] T002C3_A4608TipArtClas ;
   private boolean[] T002C3_n4608TipArtClas ;
   private byte[] T002C3_A5250TipArtCtb ;
   private boolean[] T002C3_n5250TipArtCtb ;
   private java.math.BigDecimal[] T002C3_A7078TipArtProd ;
   private boolean[] T002C3_n7078TipArtProd ;
   private short[] T002C3_A7376TipArtDias ;
   private boolean[] T002C3_n7376TipArtDias ;
   private short[] T002C3_A11044TipArtOrd ;
   private boolean[] T002C3_n11044TipArtOrd ;
   private String[] T002C3_A14361TipArtAct ;
   private String[] T002C3_A396EmprCod ;
   private String[] T002C6_A396EmprCod ;
   private short[] T002C6_A829TipArtCod ;
   private boolean[] T002C6_n829TipArtCod ;
   private String[] T002C7_A396EmprCod ;
   private short[] T002C7_A829TipArtCod ;
   private boolean[] T002C7_n829TipArtCod ;
   private short[] T002C2_A829TipArtCod ;
   private boolean[] T002C2_n829TipArtCod ;
   private String[] T002C2_A8713TipArtEst ;
   private boolean[] T002C2_n8713TipArtEst ;
   private String[] T002C2_A830TipArtDsc ;
   private boolean[] T002C2_n830TipArtDsc ;
   private String[] T002C2_A6014TipArtDsc2 ;
   private boolean[] T002C2_n6014TipArtDsc2 ;
   private String[] T002C2_A4608TipArtClas ;
   private boolean[] T002C2_n4608TipArtClas ;
   private byte[] T002C2_A5250TipArtCtb ;
   private boolean[] T002C2_n5250TipArtCtb ;
   private java.math.BigDecimal[] T002C2_A7078TipArtProd ;
   private boolean[] T002C2_n7078TipArtProd ;
   private short[] T002C2_A7376TipArtDias ;
   private boolean[] T002C2_n7376TipArtDias ;
   private short[] T002C2_A11044TipArtOrd ;
   private boolean[] T002C2_n11044TipArtOrd ;
   private String[] T002C2_A14361TipArtAct ;
   private String[] T002C2_A396EmprCod ;
   private String[] T002C11_A396EmprCod ;
   private short[] T002C11_A829TipArtCod ;
   private boolean[] T002C11_n829TipArtCod ;
   private byte[] T002C11_A583IntCod ;
   private String[] T002C12_A396EmprCod ;
   private short[] T002C12_A829TipArtCod ;
   private boolean[] T002C12_n829TipArtCod ;
   private short[] T002C12_A5173EstTpaAny ;
   private String[] T002C12_A5174EstTpaSF ;
   private String[] T002C13_A396EmprCod ;
   private short[] T002C13_A4686MaqTipArt ;
   private String[] T002C14_A396EmprCod ;
   private short[] T002C14_A829TipArtCod ;
   private boolean[] T002C14_n829TipArtCod ;
   private java.math.BigDecimal[] T002C14_A4378TipArtVal ;
   private String[] T002C15_A396EmprCod ;
   private short[] T002C15_A4364GrdTipArt ;
   private short[] T002C15_A829TipArtCod ;
   private boolean[] T002C15_n829TipArtCod ;
   private String[] T002C16_A396EmprCod ;
   private String[] T002C16_A2720TarSec ;
   private int[] T002C16_A252CliCod ;
   private short[] T002C16_A829TipArtCod ;
   private boolean[] T002C16_n829TipArtCod ;
   private byte[] T002C16_A831TipColCod ;
   private String[] T002C17_A396EmprCod ;
   private String[] T002C17_A966PartCod ;
   private int[] T002C17_A252CliCod ;
   private String[] T002C18_A396EmprCod ;
   private int[] T002C18_A539HisBarCod ;
   private byte[] T002C18_A545HisCodReo ;
   private String[] T002C18_A544HisCodPar ;
   private short[] T002C18_A833TipDefCod ;
   private String[] T002C19_A396EmprCod ;
   private int[] T002C19_A129BarCod ;
   private byte[] T002C19_A132BarCodReo ;
   private String[] T002C19_A130BarCodPar ;
   private String[] T002C20_A396EmprCod ;
   private int[] T002C20_A252CliCod ;
   private String[] T002C20_A65ArtCod ;
   private String[] T002C21_A396EmprCod ;
   private int[] T002C21_A44AlbRecCod ;
   private String[] T002C22_A396EmprCod ;
   private short[] T002C22_A829TipArtCod ;
   private boolean[] T002C22_n829TipArtCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV48WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV49TrnContext ;
}

final  class ttipart__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002C2", "SELECT TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ?  FOR UPDATE OF TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002C3", "SELECT TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002C4", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipArtCod, TM1.TipArtEst, TM1.TipArtDsc, TM1.TipArtDsc2, TM1.TipArtClas, TM1.TipArtCtb, TM1.TipArtProd, TM1.TipArtDias, TM1.TipArtOrd, TM1.TipArtAct, TM1.EmprCod FROM TXPTIPART TM1 WHERE TM1.EmprCod = ? and TM1.TipArtCod = ? ORDER BY TM1.EmprCod, TM1.TipArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002C5", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002C6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipArtCod FROM TXPTIPART WHERE ( TipArtCod > ?) and EmprCod = ? ORDER BY EmprCod, TipArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipArtCod FROM TXPTIPART WHERE ( TipArtCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002C8", "INSERT INTO TXPTIPART(TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod, TipArtCos, EnsGru) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK, "TXPTIPART")
         ,new UpdateCursor("T002C9", "UPDATE TXPTIPART SET TipArtEst=?, TipArtDsc=?, TipArtDsc2=?, TipArtClas=?, TipArtCtb=?, TipArtProd=?, TipArtDias=?, TipArtOrd=?, TipArtAct=?  WHERE EmprCod = ? AND TipArtCod = ?", GX_NOMASK, "TXPTIPART")
         ,new UpdateCursor("T002C10", "DELETE FROM TXPTIPART  WHERE EmprCod = ? AND TipArtCod = ?", GX_NOMASK, "TXPTIPART")
         ,new ForEachCursor("T002C11", "SELECT * FROM (SELECT EmprCod, TipArtCod, IntCod FROM TXPTARINT WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C12", "SELECT * FROM (SELECT EmprCod, TipArtCod, EstTpaAny, EstTpaSF FROM TXPTAREST WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C13", "SELECT * FROM (SELECT EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C14", "SELECT * FROM (SELECT EmprCod, TipArtCod, TipArtVal FROM TXPTIPARC WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C15", "SELECT * FROM (SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C16", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C17", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C18", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND HisTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C20", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C21", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRTartC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002C22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ? ORDER BY EmprCod, TipArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 1 :
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
            case 2 :
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
            case 3 :
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
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setString(4, (String)parms[7], 80);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 4);
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 1);
               stmt.setString(11, (String)parms[19], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 80);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 4);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               stmt.setString(9, (String)parms[16], 1);
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
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
            case 13 :
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
            case 14 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 17 :
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
            case 18 :
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
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

