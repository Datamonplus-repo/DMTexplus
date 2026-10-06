package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipcau_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"CODCAUSA") == 0 )
      {
         AV29CodCausa = (short)(GXutil.lval( httpContext.GetPar( "CodCausa"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CodCausa), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29CodCausa), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asacodcausaO9745( AV29CodCausa) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"CODCAUSA") == 0 )
      {
         A5085CodCausa = (short)(GXutil.lval( httpContext.GetPar( "CodCausa"))) ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         AV33autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asacodcausaO9745( A5085CodCausa, AV33autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa13699O9745( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
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
            AV28EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
            AV29CodCausa = (short)(GXutil.lval( httpContext.GetPar( "CodCausa"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CodCausa), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29CodCausa), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Causas del Defecto", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCodCausa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttipcau_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttipcau_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipcau_impl.class ));
   }

   public ttipcau_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkFacCausa = UIFactory.getCheckbox(this);
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
      A6174FacCausa = ((GXutil.strcmp(GXutil.rtrim( A6174FacCausa), "S")==0) ? "S" : "N") ;
      n6174FacCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6174FacCausa", A6174FacCausa);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCodCausa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCodCausa_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A5085CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5085CodCausa), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodCausa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCodCausa_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTIPCAU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDscCausa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDscCausa_Internalname, httpContext.getMessage( "Causa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDscCausa_Internalname, GXutil.rtrim( A5086DscCausa), GXutil.rtrim( localUtil.format( A5086DscCausa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDscCausa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDscCausa_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTIPCAU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkFacCausa.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkFacCausa.getInternalname(), httpContext.getMessage( "Facturar?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkFacCausa.getInternalname(), A6174FacCausa, "", httpContext.getMessage( "Facturar?", ""), 1, chkFacCausa.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(31, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCostcausa_cell_Internalname, 1, 0, "px", 0, "px", divCostcausa_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtCostCausa_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCostCausa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCostCausa_Internalname, httpContext.getMessage( "Coste", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCostCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCostCausa_Enabled!=0) ? localUtil.format( A13699CostCausa, "ZZZZZZ9.999") : localUtil.format( A13699CostCausa, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCostCausa_Jsonclick, 0, "AttributeFL", "", "", "", "", edtCostCausa_Visible, edtCostCausa_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TTIPCAU.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTIPCAU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTIPCAU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TTIPCAU.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV34Pgmname), GXutil.rtrim( localUtil.format( AV34Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TTIPCAU.htm");
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
      e11O92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5085CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( "Z5085CodCausa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5086DscCausa = httpContext.cgiGet( "Z5086DscCausa") ;
            Z6174FacCausa = httpContext.cgiGet( "Z6174FacCausa") ;
            Z2324CodErpC = httpContext.cgiGet( "Z2324CodErpC") ;
            Z13699CostCausa = localUtil.ctond( httpContext.cgiGet( "Z13699CostCausa")) ;
            A2324CodErpC = httpContext.cgiGet( "Z2324CodErpC") ;
            n2324CodErpC = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13816DscCausaID = httpContext.cgiGet( "DSCCAUSAID") ;
            AV28EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV29CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( "vCODCAUSA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2324CodErpC = httpContext.cgiGet( "CODERPC") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCodCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCodCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CODCAUSA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCodCausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5085CodCausa = (short)(0) ;
               n5085CodCausa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
            }
            else
            {
               A5085CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtCodCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5085CodCausa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
            }
            A5086DscCausa = httpContext.cgiGet( edtDscCausa_Internalname) ;
            n5086DscCausa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
            A6174FacCausa = ((GXutil.strcmp(httpContext.cgiGet( chkFacCausa.getInternalname()), "S")==0) ? "S" : "N") ;
            n6174FacCausa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6174FacCausa", A6174FacCausa);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCostCausa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCostCausa_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTCAUSA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCostCausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13699CostCausa = DecimalUtil.ZERO ;
               n13699CostCausa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrimstr( A13699CostCausa, 11, 3));
            }
            else
            {
               A13699CostCausa = localUtil.ctond( httpContext.cgiGet( edtCostCausa_Internalname)) ;
               n13699CostCausa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrimstr( A13699CostCausa, 11, 3));
            }
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTIPCAU");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("CodErpC", GXutil.rtrim( localUtil.format( A2324CodErpC, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A5085CodCausa != Z5085CodCausa ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\ttipcau:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A5085CodCausa = (short)(GXutil.lval( httpContext.GetPar( "CodCausa"))) ;
               n5085CodCausa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
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
                  sMode745 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode745 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound745 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_O90( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CODCAUSA");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodCausa_Internalname ;
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
                        e11O92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12O92 ();
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
         e12O92 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllO9745( ) ;
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
         disableAttributesO9745( ) ;
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

   public void confirm_O90( )
   {
      beforeValidateO9745( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsO9745( ) ;
         }
         else
         {
            checkExtendedTableO9745( ) ;
            closeExtendedTableCursorsO9745( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionO90( )
   {
   }

   public void e11O92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttipcau_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttipcau_impl.this.A396EmprCod = GXv_char2[0] ;
      ttipcau_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipcau_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV33autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      ttipcau_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33autonumber), 4, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttipcau_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV28EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttipcau_impl.this.AV28EmprCod = GXv_char4[0] ;
      ttipcau_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttipcau_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV30WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV30WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV31TrnContext.fromxml(AV32WebSession.getValue("TrnContext"), null, null);
   }

   public void e12O92( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV31TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.ttipcauww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divCostcausa_cell_Class = "col-xs-12 col-sm-10 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divCostcausa_cell_Internalname, "Class", divCostcausa_cell_Class, true);
   }

   public void zmO9745( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5086DscCausa = T00O93_A5086DscCausa[0] ;
            Z6174FacCausa = T00O93_A6174FacCausa[0] ;
            Z2324CodErpC = T00O93_A2324CodErpC[0] ;
            Z13699CostCausa = T00O93_A13699CostCausa[0] ;
         }
         else
         {
            Z5086DscCausa = A5086DscCausa ;
            Z6174FacCausa = A6174FacCausa ;
            Z2324CodErpC = A2324CodErpC ;
            Z13699CostCausa = A13699CostCausa ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z5085CodCausa = A5085CodCausa ;
         Z5086DscCausa = A5086DscCausa ;
         Z6174FacCausa = A6174FacCausa ;
         Z2324CodErpC = A2324CodErpC ;
         Z13699CostCausa = A13699CostCausa ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "FicherosBasicos.TTIPCAU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         A396EmprCod = AV28EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00O94 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00O94_A407EmprNom[0] ;
      n407EmprNom = T00O94_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
      ttipcau_impl.this.GXt_int5 = GXv_int6[0] ;
      edtCostCausa_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
      ttipcau_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divCostcausa_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCostcausa_cell_Internalname, "Class", divCostcausa_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
         ttipcau_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divCostcausa_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-10 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCostcausa_cell_Internalname, "Class", divCostcausa_cell_Class, true);
         }
      }
      if ( ! (0==AV29CodCausa) )
      {
         A5085CodCausa = AV29CodCausa ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      }
      if ( ! (0==AV29CodCausa) )
      {
         edtCodCausa_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCausa_Enabled), 5, 0), true);
      }
      else
      {
         edtCodCausa_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCausa_Enabled), 5, 0), true);
      }
      if ( ! (0==AV29CodCausa) )
      {
         edtCodCausa_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCausa_Enabled), 5, 0), true);
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
   }

   public void loadO9745( )
   {
      /* Using cursor T00O95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound745 = (short)(1) ;
         A5086DscCausa = T00O95_A5086DscCausa[0] ;
         n5086DscCausa = T00O95_n5086DscCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
         A407EmprNom = T00O95_A407EmprNom[0] ;
         n407EmprNom = T00O95_n407EmprNom[0] ;
         A6174FacCausa = T00O95_A6174FacCausa[0] ;
         n6174FacCausa = T00O95_n6174FacCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6174FacCausa", A6174FacCausa);
         A2324CodErpC = T00O95_A2324CodErpC[0] ;
         n2324CodErpC = T00O95_n2324CodErpC[0] ;
         A13699CostCausa = T00O95_A13699CostCausa[0] ;
         n13699CostCausa = T00O95_n13699CostCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrimstr( A13699CostCausa, 11, 3));
         zmO9745( -12) ;
      }
      pr_default.close(3);
      onLoadActionsO9745( ) ;
   }

   public void onLoadActionsO9745( )
   {
      A13816DscCausaID = GXutil.trim( GXutil.str( A5085CodCausa, 4, 0)) + "-" + GXutil.trim( A5086DscCausa) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13816DscCausaID", A13816DscCausaID);
   }

   public void checkExtendedTableO9745( )
   {
      nIsDirty_745 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_745 = (short)(1) ;
      A13816DscCausaID = GXutil.trim( GXutil.str( A5085CodCausa, 4, 0)) + "-" + GXutil.trim( A5086DscCausa) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13816DscCausaID", A13816DscCausaID);
      if ( ! ( ( GXutil.strcmp(A6174FacCausa, "S") == 0 ) || ( GXutil.strcmp(A6174FacCausa, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Facturar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FACCAUSA");
         AnyError = (short)(1) ;
         GX_FocusControl = chkFacCausa.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsO9745( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyO9745( )
   {
      /* Using cursor T00O96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound745 = (short)(1) ;
      }
      else
      {
         RcdFound745 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00O93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00O93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmO9745( 12) ;
         RcdFound745 = (short)(1) ;
         A5085CodCausa = T00O93_A5085CodCausa[0] ;
         n5085CodCausa = T00O93_n5085CodCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         A5086DscCausa = T00O93_A5086DscCausa[0] ;
         n5086DscCausa = T00O93_n5086DscCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
         A6174FacCausa = T00O93_A6174FacCausa[0] ;
         n6174FacCausa = T00O93_n6174FacCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6174FacCausa", A6174FacCausa);
         A2324CodErpC = T00O93_A2324CodErpC[0] ;
         n2324CodErpC = T00O93_n2324CodErpC[0] ;
         A13699CostCausa = T00O93_A13699CostCausa[0] ;
         n13699CostCausa = T00O93_n13699CostCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrimstr( A13699CostCausa, 11, 3));
         Z396EmprCod = A396EmprCod ;
         Z5085CodCausa = A5085CodCausa ;
         sMode745 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadO9745( ) ;
         if ( AnyError == 1 )
         {
            RcdFound745 = (short)(0) ;
            initializeNonKeyO9745( ) ;
         }
         Gx_mode = sMode745 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound745 = (short)(0) ;
         initializeNonKeyO9745( ) ;
         sMode745 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode745 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyO9745( ) ;
      if ( RcdFound745 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound745 = (short)(0) ;
      /* Using cursor T00O97 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00O97_A5085CodCausa[0] < A5085CodCausa ) ) && ( GXutil.strcmp(T00O97_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00O97_A5085CodCausa[0] > A5085CodCausa ) ) && ( GXutil.strcmp(T00O97_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5085CodCausa = T00O97_A5085CodCausa[0] ;
            n5085CodCausa = T00O97_n5085CodCausa[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
            RcdFound745 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound745 = (short)(0) ;
      /* Using cursor T00O98 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00O98_A5085CodCausa[0] > A5085CodCausa ) ) && ( GXutil.strcmp(T00O98_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00O98_A5085CodCausa[0] < A5085CodCausa ) ) && ( GXutil.strcmp(T00O98_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5085CodCausa = T00O98_A5085CodCausa[0] ;
            n5085CodCausa = T00O98_n5085CodCausa[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
            RcdFound745 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyO9745( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCodCausa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertO9745( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound745 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5085CodCausa != Z5085CodCausa ) )
            {
               A5085CodCausa = Z5085CodCausa ;
               n5085CodCausa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CODCAUSA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCodCausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCodCausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateO9745( ) ;
               GX_FocusControl = edtCodCausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5085CodCausa != Z5085CodCausa ) )
            {
               /* Insert record */
               GX_FocusControl = edtCodCausa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertO9745( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CODCAUSA");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCodCausa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCodCausa_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertO9745( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5085CodCausa != Z5085CodCausa ) )
      {
         A5085CodCausa = Z5085CodCausa ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CODCAUSA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodCausa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCodCausa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyO9745( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00O92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPCAU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5086DscCausa, T00O92_A5086DscCausa[0]) != 0 ) || ( GXutil.strcmp(Z6174FacCausa, T00O92_A6174FacCausa[0]) != 0 ) || ( GXutil.strcmp(Z2324CodErpC, T00O92_A2324CodErpC[0]) != 0 ) || ( DecimalUtil.compareTo(Z13699CostCausa, T00O92_A13699CostCausa[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5086DscCausa, T00O92_A5086DscCausa[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttipcau:[seudo value changed for attri]"+"DscCausa");
               GXutil.writeLogRaw("Old: ",Z5086DscCausa);
               GXutil.writeLogRaw("Current: ",T00O92_A5086DscCausa[0]);
            }
            if ( GXutil.strcmp(Z6174FacCausa, T00O92_A6174FacCausa[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttipcau:[seudo value changed for attri]"+"FacCausa");
               GXutil.writeLogRaw("Old: ",Z6174FacCausa);
               GXutil.writeLogRaw("Current: ",T00O92_A6174FacCausa[0]);
            }
            if ( GXutil.strcmp(Z2324CodErpC, T00O92_A2324CodErpC[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttipcau:[seudo value changed for attri]"+"CodErpC");
               GXutil.writeLogRaw("Old: ",Z2324CodErpC);
               GXutil.writeLogRaw("Current: ",T00O92_A2324CodErpC[0]);
            }
            if ( DecimalUtil.compareTo(Z13699CostCausa, T00O92_A13699CostCausa[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.ttipcau:[seudo value changed for attri]"+"CostCausa");
               GXutil.writeLogRaw("Old: ",Z13699CostCausa);
               GXutil.writeLogRaw("Current: ",T00O92_A13699CostCausa[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPCAU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertO9745( )
   {
      beforeValidateO9745( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableO9745( ) ;
      }
      if ( AnyError == 0 )
      {
         zmO9745( 0) ;
         checkOptimisticConcurrencyO9745( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmO9745( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertO9745( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00O99 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5086DscCausa), A5086DscCausa, Boolean.valueOf(n6174FacCausa), A6174FacCausa, Boolean.valueOf(n2324CodErpC), A2324CodErpC, Boolean.valueOf(n13699CostCausa), A13699CostCausa, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCAU");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaptionO90( ) ;
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
            loadO9745( ) ;
         }
         endLevelO9745( ) ;
      }
      closeExtendedTableCursorsO9745( ) ;
   }

   public void updateO9745( )
   {
      beforeValidateO9745( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableO9745( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyO9745( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmO9745( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateO9745( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00O910 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n5086DscCausa), A5086DscCausa, Boolean.valueOf(n6174FacCausa), A6174FacCausa, Boolean.valueOf(n2324CodErpC), A2324CodErpC, Boolean.valueOf(n13699CostCausa), A13699CostCausa, A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCAU");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPCAU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateO9745( ) ;
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
         endLevelO9745( ) ;
      }
      closeExtendedTableCursorsO9745( ) ;
   }

   public void deferredUpdateO9745( )
   {
   }

   public void delete( )
   {
      beforeValidateO9745( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyO9745( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsO9745( ) ;
         afterConfirmO9745( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteO9745( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00O911 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCAU");
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
      sMode745 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelO9745( ) ;
      Gx_mode = sMode745 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsO9745( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13816DscCausaID = GXutil.trim( GXutil.str( A5085CodCausa, 4, 0)) + "-" + GXutil.trim( A5086DscCausa) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13816DscCausaID", A13816DscCausaID);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00O912 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00O913 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Yielding", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00O914 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00O915 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevelO9745( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteO9745( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttipcau");
         if ( AnyError == 0 )
         {
            confirmValuesO90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttipcau");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartO9745( )
   {
      /* Scan By routine */
      /* Using cursor T00O916 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound745 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound745 = (short)(1) ;
         A5085CodCausa = T00O916_A5085CodCausa[0] ;
         n5085CodCausa = T00O916_n5085CodCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextO9745( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound745 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound745 = (short)(1) ;
         A5085CodCausa = T00O916_A5085CodCausa[0] ;
         n5085CodCausa = T00O916_n5085CodCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      }
   }

   public void scanEndO9745( )
   {
      pr_default.close(14);
   }

   public void afterConfirmO9745( )
   {
      /* After Confirm Rules */
      if ( (0==A5085CodCausa) && (0==AV33autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "CODCAUSA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCodCausa_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertO9745( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A5085CodCausa) && ( AV33autonumber == 1 ) )
      {
         GXt_int8 = A5085CodCausa ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.ttipcau_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         ttipcau_impl.this.GXt_int8 = GXv_int9[0] ;
         A5085CodCausa = GXt_int8 ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      }
   }

   public void beforeUpdateO9745( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteO9745( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteO9745( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateO9745( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesO9745( )
   {
      edtCodCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCausa_Enabled), 5, 0), true);
      edtDscCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscCausa_Enabled), 5, 0), true);
      chkFacCausa.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkFacCausa.getInternalname(), "Enabled", GXutil.ltrimstr( chkFacCausa.getEnabled(), 5, 0), true);
      edtCostCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesO9745( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesO90( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.ttipcau", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29CodCausa,4,0))}, new String[] {"Gx_mode","EmprCod","CodCausa"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTIPCAU");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CodErpC", GXutil.rtrim( localUtil.format( A2324CodErpC, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\ttipcau:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5085CodCausa", GXutil.ltrim( localUtil.ntoc( Z5085CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5086DscCausa", GXutil.rtrim( Z5086DscCausa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6174FacCausa", GXutil.rtrim( Z6174FacCausa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2324CodErpC", GXutil.rtrim( Z2324CodErpC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13699CostCausa", GXutil.ltrim( localUtil.ntoc( Z13699CostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV31TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV31TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV31TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "DSCCAUSAID", A13816DscCausaID);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODCAUSA", GXutil.ltrim( localUtil.ntoc( AV29CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODCAUSA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29CodCausa), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV33autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODERPC", GXutil.rtrim( A2324CodErpC));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.ficherosbasicos.ttipcau", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29CodCausa,4,0))}, new String[] {"Gx_mode","EmprCod","CodCausa"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TTIPCAU" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Causas del Defecto", "") ;
   }

   public void initializeNonKeyO9745( )
   {
      A13816DscCausaID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13816DscCausaID", A13816DscCausaID);
      A5086DscCausa = "" ;
      n5086DscCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5086DscCausa", A5086DscCausa);
      A6174FacCausa = "" ;
      n6174FacCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6174FacCausa", A6174FacCausa);
      A2324CodErpC = "" ;
      n2324CodErpC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2324CodErpC", A2324CodErpC);
      A13699CostCausa = DecimalUtil.ZERO ;
      n13699CostCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13699CostCausa", GXutil.ltrimstr( A13699CostCausa, 11, 3));
      Z5086DscCausa = "" ;
      Z6174FacCausa = "" ;
      Z2324CodErpC = "" ;
      Z13699CostCausa = DecimalUtil.ZERO ;
   }

   public void initAllO9745( )
   {
      A5085CodCausa = (short)(0) ;
      n5085CodCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      initializeNonKeyO9745( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655118", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/ttipcau.js", "?20268211655118", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCodCausa_Internalname = "CODCAUSA" ;
      edtDscCausa_Internalname = "DSCCAUSA" ;
      chkFacCausa.setInternalname( "FACCAUSA" );
      edtCostCausa_Internalname = "COSTCAUSA" ;
      divCostcausa_cell_Internalname = "COSTCAUSA_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
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
      Form.setCaption( httpContext.getMessage( "Causas del Defecto", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCostCausa_Jsonclick = "" ;
      edtCostCausa_Enabled = 1 ;
      edtCostCausa_Visible = 1 ;
      divCostcausa_cell_Class = "col-xs-12 col-sm-10" ;
      chkFacCausa.setEnabled( 1 );
      edtDscCausa_Jsonclick = "" ;
      edtDscCausa_Enabled = 1 ;
      edtCodCausa_Jsonclick = "" ;
      edtCodCausa_Enabled = 1 ;
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

   public void gx4asacodcausaO9745( short AV29CodCausa )
   {
      if ( ! (0==AV29CodCausa) )
      {
         A5085CodCausa = AV29CodCausa ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5085CodCausa, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asacodcausaO9745( short A5085CodCausa ,
                                    short AV33autonumber ,
                                    String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A5085CodCausa) && ( AV33autonumber == 1 ) )
      {
         GXt_int8 = A5085CodCausa ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.ttipcau_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         ttipcau_impl.this.GXt_int8 = GXv_int9[0] ;
         A5085CodCausa = GXt_int8 ;
         n5085CodCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5085CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5085CodCausa), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5085CodCausa, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa13699O9745( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CARVIT", ""), ""), GXv_int6) ;
      ttipcau_impl.this.GXt_int5 = GXv_int6[0] ;
      edtCostCausa_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), true);
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

   public void init_web_controls( )
   {
      chkFacCausa.setName( "FACCAUSA" );
      chkFacCausa.setWebtags( "" );
      chkFacCausa.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkFacCausa.getInternalname(), "TitleCaption", chkFacCausa.getCaption(), true);
      chkFacCausa.setCheckedValue( "N" );
      A6174FacCausa = ((GXutil.strcmp(GXutil.rtrim( A6174FacCausa), "S")==0) ? "S" : "N") ;
      n6174FacCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6174FacCausa", A6174FacCausa);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29CodCausa',fld:'vCODCAUSA',pic:'ZZZ9',hsh:true},{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29CodCausa',fld:'vCODCAUSA',pic:'ZZZ9',hsh:true},{av:'A2324CodErpC',fld:'CODERPC',pic:''},{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e12O92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]}");
      setEventMetadata("VALID_CODCAUSA","{handler:'valid_Codcausa',iparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]");
      setEventMetadata("VALID_CODCAUSA",",oparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]}");
      setEventMetadata("VALID_DSCCAUSA","{handler:'valid_Dsccausa',iparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]");
      setEventMetadata("VALID_DSCCAUSA",",oparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]}");
      setEventMetadata("VALID_FACCAUSA","{handler:'valid_Faccausa',iparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]");
      setEventMetadata("VALID_FACCAUSA",",oparms:[{av:'A6174FacCausa',fld:'FACCAUSA',pic:'@!'}]}");
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
      wcpOAV28EmprCod = "" ;
      Z396EmprCod = "" ;
      Z5086DscCausa = "" ;
      Z6174FacCausa = "" ;
      Z2324CodErpC = "" ;
      Z13699CostCausa = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV28EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A6174FacCausa = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A5086DscCausa = "" ;
      A13699CostCausa = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV34Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A2324CodErpC = "" ;
      A13816DscCausaID = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode745 = "" ;
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
      AV30WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV32WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00O94_A407EmprNom = new String[] {""} ;
      T00O94_n407EmprNom = new boolean[] {false} ;
      T00O95_A5085CodCausa = new short[1] ;
      T00O95_n5085CodCausa = new boolean[] {false} ;
      T00O95_A5086DscCausa = new String[] {""} ;
      T00O95_n5086DscCausa = new boolean[] {false} ;
      T00O95_A407EmprNom = new String[] {""} ;
      T00O95_n407EmprNom = new boolean[] {false} ;
      T00O95_A6174FacCausa = new String[] {""} ;
      T00O95_n6174FacCausa = new boolean[] {false} ;
      T00O95_A2324CodErpC = new String[] {""} ;
      T00O95_n2324CodErpC = new boolean[] {false} ;
      T00O95_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00O95_n13699CostCausa = new boolean[] {false} ;
      T00O95_A396EmprCod = new String[] {""} ;
      T00O96_A396EmprCod = new String[] {""} ;
      T00O96_A5085CodCausa = new short[1] ;
      T00O96_n5085CodCausa = new boolean[] {false} ;
      T00O93_A5085CodCausa = new short[1] ;
      T00O93_n5085CodCausa = new boolean[] {false} ;
      T00O93_A5086DscCausa = new String[] {""} ;
      T00O93_n5086DscCausa = new boolean[] {false} ;
      T00O93_A6174FacCausa = new String[] {""} ;
      T00O93_n6174FacCausa = new boolean[] {false} ;
      T00O93_A2324CodErpC = new String[] {""} ;
      T00O93_n2324CodErpC = new boolean[] {false} ;
      T00O93_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00O93_n13699CostCausa = new boolean[] {false} ;
      T00O93_A396EmprCod = new String[] {""} ;
      T00O97_A396EmprCod = new String[] {""} ;
      T00O97_A5085CodCausa = new short[1] ;
      T00O97_n5085CodCausa = new boolean[] {false} ;
      T00O98_A396EmprCod = new String[] {""} ;
      T00O98_A5085CodCausa = new short[1] ;
      T00O98_n5085CodCausa = new boolean[] {false} ;
      T00O92_A5085CodCausa = new short[1] ;
      T00O92_n5085CodCausa = new boolean[] {false} ;
      T00O92_A5086DscCausa = new String[] {""} ;
      T00O92_n5086DscCausa = new boolean[] {false} ;
      T00O92_A6174FacCausa = new String[] {""} ;
      T00O92_n6174FacCausa = new boolean[] {false} ;
      T00O92_A2324CodErpC = new String[] {""} ;
      T00O92_n2324CodErpC = new boolean[] {false} ;
      T00O92_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00O92_n13699CostCausa = new boolean[] {false} ;
      T00O92_A396EmprCod = new String[] {""} ;
      T00O912_A396EmprCod = new String[] {""} ;
      T00O912_A13137NCHdr = new int[1] ;
      T00O912_A13138NCHdrr = new byte[1] ;
      T00O912_A13139NCHdrp = new String[] {""} ;
      T00O913_A396EmprCod = new String[] {""} ;
      T00O913_A6475YCBarcod = new int[1] ;
      T00O913_A6476YCBarcodre = new byte[1] ;
      T00O913_A6477YCBarcodpa = new String[] {""} ;
      T00O913_A6478YCReclinma = new short[1] ;
      T00O913_A6479YCYieldCop = new String[] {""} ;
      T00O913_A6480YCRecPrdNu = new String[] {""} ;
      T00O914_A396EmprCod = new String[] {""} ;
      T00O914_A5059Hl_hdr = new int[1] ;
      T00O914_A5060Hl_hdrr = new byte[1] ;
      T00O914_A5061Hl_hdrp = new String[] {""} ;
      T00O915_A396EmprCod = new String[] {""} ;
      T00O915_A539HisBarCod = new int[1] ;
      T00O915_A545HisCodReo = new byte[1] ;
      T00O915_A544HisCodPar = new String[] {""} ;
      T00O915_A833TipDefCod = new short[1] ;
      T00O916_A396EmprCod = new String[] {""} ;
      T00O916_A5085CodCausa = new short[1] ;
      T00O916_n5085CodCausa = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int9 = new short[1] ;
      GXv_int6 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipcau__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipcau__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipcau__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipcau__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipcau__default(),
         new Object[] {
             new Object[] {
            T00O92_A5085CodCausa, T00O92_A5086DscCausa, T00O92_n5086DscCausa, T00O92_A6174FacCausa, T00O92_n6174FacCausa, T00O92_A2324CodErpC, T00O92_n2324CodErpC, T00O92_A13699CostCausa, T00O92_n13699CostCausa, T00O92_A396EmprCod
            }
            , new Object[] {
            T00O93_A5085CodCausa, T00O93_A5086DscCausa, T00O93_n5086DscCausa, T00O93_A6174FacCausa, T00O93_n6174FacCausa, T00O93_A2324CodErpC, T00O93_n2324CodErpC, T00O93_A13699CostCausa, T00O93_n13699CostCausa, T00O93_A396EmprCod
            }
            , new Object[] {
            T00O94_A407EmprNom, T00O94_n407EmprNom
            }
            , new Object[] {
            T00O95_A5085CodCausa, T00O95_A5086DscCausa, T00O95_n5086DscCausa, T00O95_A407EmprNom, T00O95_n407EmprNom, T00O95_A6174FacCausa, T00O95_n6174FacCausa, T00O95_A2324CodErpC, T00O95_n2324CodErpC, T00O95_A13699CostCausa,
            T00O95_n13699CostCausa, T00O95_A396EmprCod
            }
            , new Object[] {
            T00O96_A396EmprCod, T00O96_A5085CodCausa
            }
            , new Object[] {
            T00O97_A396EmprCod, T00O97_A5085CodCausa
            }
            , new Object[] {
            T00O98_A396EmprCod, T00O98_A5085CodCausa
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00O912_A396EmprCod, T00O912_A13137NCHdr, T00O912_A13138NCHdrr, T00O912_A13139NCHdrp
            }
            , new Object[] {
            T00O913_A396EmprCod, T00O913_A6475YCBarcod, T00O913_A6476YCBarcodre, T00O913_A6477YCBarcodpa, T00O913_A6478YCReclinma, T00O913_A6479YCYieldCop, T00O913_A6480YCRecPrdNu
            }
            , new Object[] {
            T00O914_A396EmprCod, T00O914_A5059Hl_hdr, T00O914_A5060Hl_hdrr, T00O914_A5061Hl_hdrp
            }
            , new Object[] {
            T00O915_A396EmprCod, T00O915_A539HisBarCod, T00O915_A545HisCodReo, T00O915_A544HisCodPar, T00O915_A833TipDefCod
            }
            , new Object[] {
            T00O916_A396EmprCod, T00O916_A5085CodCausa
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "FicherosBasicos.TTIPCAU" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short wcpOAV29CodCausa ;
   private short Z5085CodCausa ;
   private short AV29CodCausa ;
   private short A5085CodCausa ;
   private short AV33autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound745 ;
   private short nIsDirty_745 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int trnEnded ;
   private int edtCodCausa_Enabled ;
   private int edtDscCausa_Enabled ;
   private int edtCostCausa_Visible ;
   private int edtCostCausa_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z13699CostCausa ;
   private java.math.BigDecimal A13699CostCausa ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV28EmprCod ;
   private String Z396EmprCod ;
   private String Z5086DscCausa ;
   private String Z6174FacCausa ;
   private String Z2324CodErpC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV28EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCodCausa_Internalname ;
   private String A6174FacCausa ;
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
   private String edtCodCausa_Jsonclick ;
   private String edtDscCausa_Internalname ;
   private String A5086DscCausa ;
   private String edtDscCausa_Jsonclick ;
   private String divCostcausa_cell_Internalname ;
   private String divCostcausa_cell_Class ;
   private String edtCostCausa_Internalname ;
   private String edtCostCausa_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV34Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A2324CodErpC ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode745 ;
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
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n5085CodCausa ;
   private boolean wbErr ;
   private boolean n6174FacCausa ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n2324CodErpC ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n5086DscCausa ;
   private boolean n13699CostCausa ;
   private boolean returnInSub ;
   private String A13816DscCausaID ;
   private com.genexus.webpanels.WebSession AV32WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkFacCausa ;
   private IDataStoreProvider pr_default ;
   private String[] T00O94_A407EmprNom ;
   private boolean[] T00O94_n407EmprNom ;
   private short[] T00O95_A5085CodCausa ;
   private boolean[] T00O95_n5085CodCausa ;
   private String[] T00O95_A5086DscCausa ;
   private boolean[] T00O95_n5086DscCausa ;
   private String[] T00O95_A407EmprNom ;
   private boolean[] T00O95_n407EmprNom ;
   private String[] T00O95_A6174FacCausa ;
   private boolean[] T00O95_n6174FacCausa ;
   private String[] T00O95_A2324CodErpC ;
   private boolean[] T00O95_n2324CodErpC ;
   private java.math.BigDecimal[] T00O95_A13699CostCausa ;
   private boolean[] T00O95_n13699CostCausa ;
   private String[] T00O95_A396EmprCod ;
   private String[] T00O96_A396EmprCod ;
   private short[] T00O96_A5085CodCausa ;
   private boolean[] T00O96_n5085CodCausa ;
   private short[] T00O93_A5085CodCausa ;
   private boolean[] T00O93_n5085CodCausa ;
   private String[] T00O93_A5086DscCausa ;
   private boolean[] T00O93_n5086DscCausa ;
   private String[] T00O93_A6174FacCausa ;
   private boolean[] T00O93_n6174FacCausa ;
   private String[] T00O93_A2324CodErpC ;
   private boolean[] T00O93_n2324CodErpC ;
   private java.math.BigDecimal[] T00O93_A13699CostCausa ;
   private boolean[] T00O93_n13699CostCausa ;
   private String[] T00O93_A396EmprCod ;
   private String[] T00O97_A396EmprCod ;
   private short[] T00O97_A5085CodCausa ;
   private boolean[] T00O97_n5085CodCausa ;
   private String[] T00O98_A396EmprCod ;
   private short[] T00O98_A5085CodCausa ;
   private boolean[] T00O98_n5085CodCausa ;
   private short[] T00O92_A5085CodCausa ;
   private boolean[] T00O92_n5085CodCausa ;
   private String[] T00O92_A5086DscCausa ;
   private boolean[] T00O92_n5086DscCausa ;
   private String[] T00O92_A6174FacCausa ;
   private boolean[] T00O92_n6174FacCausa ;
   private String[] T00O92_A2324CodErpC ;
   private boolean[] T00O92_n2324CodErpC ;
   private java.math.BigDecimal[] T00O92_A13699CostCausa ;
   private boolean[] T00O92_n13699CostCausa ;
   private String[] T00O92_A396EmprCod ;
   private String[] T00O912_A396EmprCod ;
   private int[] T00O912_A13137NCHdr ;
   private byte[] T00O912_A13138NCHdrr ;
   private String[] T00O912_A13139NCHdrp ;
   private String[] T00O913_A396EmprCod ;
   private int[] T00O913_A6475YCBarcod ;
   private byte[] T00O913_A6476YCBarcodre ;
   private String[] T00O913_A6477YCBarcodpa ;
   private short[] T00O913_A6478YCReclinma ;
   private String[] T00O913_A6479YCYieldCop ;
   private String[] T00O913_A6480YCRecPrdNu ;
   private String[] T00O914_A396EmprCod ;
   private int[] T00O914_A5059Hl_hdr ;
   private byte[] T00O914_A5060Hl_hdrr ;
   private String[] T00O914_A5061Hl_hdrp ;
   private String[] T00O915_A396EmprCod ;
   private int[] T00O915_A539HisBarCod ;
   private byte[] T00O915_A545HisCodReo ;
   private String[] T00O915_A544HisCodPar ;
   private short[] T00O915_A833TipDefCod ;
   private String[] T00O916_A396EmprCod ;
   private short[] T00O916_A5085CodCausa ;
   private boolean[] T00O916_n5085CodCausa ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV30WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV31TrnContext ;
}

final  class ttipcau__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcau__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcau__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcau__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipcau__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00O92", "SELECT CodCausa, DscCausa, FacCausa, CodErpC, CostCausa, EmprCod FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ?  FOR UPDATE OF DscCausa, FacCausa, CodErpC, CostCausa NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00O93", "SELECT CodCausa, DscCausa, FacCausa, CodErpC, CostCausa, EmprCod FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00O94", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00O95", "SELECT /*+ FIRST_ROWS(100) */ TM1.CodCausa, TM1.DscCausa, T2.EmprNom, TM1.FacCausa, TM1.CodErpC, TM1.CostCausa, TM1.EmprCod FROM (TXPTIPCAU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CodCausa = ? ORDER BY TM1.EmprCod, TM1.CodCausa ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00O96", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CodCausa FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00O97", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CodCausa FROM TXPTIPCAU WHERE ( CodCausa > ?) and EmprCod = ? ORDER BY EmprCod, CodCausa) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00O98", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CodCausa FROM TXPTIPCAU WHERE ( CodCausa < ?) and EmprCod = ? ORDER BY EmprCod DESC, CodCausa DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00O99", "INSERT INTO TXPTIPCAU(CodCausa, DscCausa, FacCausa, CodErpC, CostCausa, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTIPCAU")
         ,new UpdateCursor("T00O910", "UPDATE TXPTIPCAU SET DscCausa=?, FacCausa=?, CodErpC=?, CostCausa=?  WHERE EmprCod = ? AND CodCausa = ?", GX_NOMASK, "TXPTIPCAU")
         ,new UpdateCursor("T00O911", "DELETE FROM TXPTIPCAU  WHERE EmprCod = ? AND CodCausa = ?", GX_NOMASK, "TXPTIPCAU")
         ,new ForEachCursor("T00O912", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND CodCausa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00O913", "SELECT * FROM (SELECT EmprCod, YCBarcod, YCBarcodre, YCBarcodpa, YCReclinma, YCYieldCop, YCRecPrdNu FROM TXPYieldi WHERE EmprCod = ? AND CodCausa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00O914", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CodCausa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00O915", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CodCausa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00O916", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CodCausa FROM TXPTIPCAU WHERE EmprCod = ? ORDER BY EmprCod, CodCausa ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
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
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
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
                  stmt.setString(2, (String)parms[3], 60);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 3);
               }
               stmt.setString(6, (String)parms[10], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
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
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
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
               return;
      }
   }

}

