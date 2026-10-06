package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class baragr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "BARAGR", ""), (short)(0)) ;
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

   public baragr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public baragr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( baragr_impl.class ));
   }

   public baragr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "BARAGR", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrCod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrPar_Internalname, GXutil.rtrim( A122BarAgrPar), GXutil.rtrim( localUtil.format( A122BarAgrPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrKgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrKgm_Enabled!=0) ? localUtil.format( A121BarAgrKgm, "ZZZZZ9.99") : localUtil.format( A121BarAgrKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrMtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrMtr_Enabled!=0) ? localUtil.format( A868BarAgrMtr, "ZZZZZ9.99") : localUtil.format( A868BarAgrMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrPie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A123BarAgrPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A123BarAgrPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrNDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrNDes_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1650BarAgrNDes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1650BarAgrNDes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrNDes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrNDes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPNDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPNDes_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1651BarPNDes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1651BarPNDes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPNDes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPNDes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFindDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFindDes_Internalname, httpContext.getMessage( "Desglose", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindDes_Internalname, GXutil.rtrim( A1653FindDes), GXutil.rtrim( localUtil.format( A1653FindDes, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindDes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFindDes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFindBarAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFindBarAgr_Internalname, httpContext.getMessage( "Agrupada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindBarAgr_Internalname, GXutil.rtrim( A474FindBarAgr), GXutil.rtrim( localUtil.format( A474FindBarAgr, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindBarAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFindBarAgr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKgmAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKgmAgr_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKgmAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKgmAgr_Enabled!=0) ? localUtil.format( A590KgmAgr, "ZZZZZ9.99") : localUtil.format( A590KgmAgr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKgmAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtKgmAgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPieAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPieAgr_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPieAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPieAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPieAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPieAgr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMtrAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMtrAgr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMtrAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMtrAgr_Enabled!=0) ? localUtil.format( A869MtrAgr, "ZZZZZ9.99") : localUtil.format( A869MtrAgr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMtrAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMtrAgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrSer_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrSer_Internalname, GXutil.rtrim( A1245BarAgrSer), GXutil.rtrim( localUtil.format( A1245BarAgrSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrDsc_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrDsc_Internalname, GXutil.rtrim( A1507BarAgrDsc), GXutil.rtrim( localUtil.format( A1507BarAgrDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCodAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCodAgr_Internalname, httpContext.getMessage( "Cód Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCodAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCodAgr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCodAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCodAgr_Internalname, httpContext.getMessage( "N° Dispos. Int", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCodAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDisCodAgr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColNomAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColNomAgr_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNomAgr_Internalname, GXutil.rtrim( A1510ColNomAgr), GXutil.rtrim( localUtil.format( A1510ColNomAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNomAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtColNomAgr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColNumAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColNumAgr_Internalname, httpContext.getMessage( "N° Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNumAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColNumAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNumAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtColNumAgr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColNoCAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColNoCAgr_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNoCAgr_Internalname, GXutil.rtrim( A1509ColNoCAgr), GXutil.rtrim( localUtil.format( A1509ColNoCAgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNoCAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtColNoCAgr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColNuCAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColNuCAgr_Internalname, httpContext.getMessage( "N° Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNuCAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColNuCAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNuCAgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtColNuCAgr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrDNu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrDNu_Internalname, httpContext.getMessage( "N° Dispos. Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrDNu_Internalname, GXutil.rtrim( A1649BarAgrDNu), GXutil.rtrim( localUtil.format( A1649BarAgrDNu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrDNu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrDNu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAGrHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAGrHdr_Internalname, httpContext.getMessage( "Hdr Agrupada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAGrHdr_Internalname, GXutil.rtrim( A13695BarAGrHdr), GXutil.rtrim( localUtil.format( A13695BarAGrHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAGrHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAGrHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrNhdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrNhdr_Internalname, httpContext.getMessage( "N° Hdr Agrupada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrNhdr_Internalname, GXutil.rtrim( A13792BarAgrNhdr), GXutil.rtrim( localUtil.format( A13792BarAgrNhdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrNhdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrNhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_BARAGR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_BARAGR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z119BarAgrCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z124BarAgrReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z122BarAgrPar = httpContext.cgiGet( "Z122BarAgrPar") ;
         Z590KgmAgr = localUtil.ctond( httpContext.cgiGet( "Z590KgmAgr")) ;
         Z671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( "Z671PieAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z869MtrAgr = localUtil.ctond( httpContext.cgiGet( "Z869MtrAgr")) ;
         Z1245BarAgrSer = httpContext.cgiGet( "Z1245BarAgrSer") ;
         Z1507BarAgrDsc = httpContext.cgiGet( "Z1507BarAgrDsc") ;
         Z1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1508CliCodAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1513DisCodAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1510ColNomAgr = httpContext.cgiGet( "Z1510ColNomAgr") ;
         Z1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1512ColNumAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1509ColNoCAgr = httpContext.cgiGet( "Z1509ColNoCAgr") ;
         Z1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1511ColNuCAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1649BarAgrDNu = httpContext.cgiGet( "Z1649BarAgrDNu") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAGRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAgrCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A119BarAgrCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         }
         else
         {
            A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAGRREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAgrReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A124BarAgrReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         }
         else
         {
            A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         }
         A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         A121BarAgrKgm = localUtil.ctond( httpContext.cgiGet( edtBarAgrKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = localUtil.ctond( httpContext.cgiGet( edtBarAgrMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A123BarAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         A1650BarAgrNDes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAgrNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
         A1653FindDes = GXutil.upper( httpContext.cgiGet( edtFindDes_Internalname)) ;
         n1653FindDes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         A474FindBarAgr = GXutil.upper( httpContext.cgiGet( edtFindBarAgr_Internalname)) ;
         n474FindBarAgr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KGMAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtKgmAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A590KgmAgr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         }
         else
         {
            A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PIEAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPieAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A671PieAgr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         }
         else
         {
            A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MTRAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMtrAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A869MtrAgr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         }
         else
         {
            A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         }
         A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICODAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCodAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1508CliCodAgr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         }
         else
         {
            A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCODAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisCodAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1513DisCodAgr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1513DisCodAgr), 8, 0));
         }
         else
         {
            A1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1513DisCodAgr), 8, 0));
         }
         A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLNUMAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtColNumAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1512ColNumAgr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         }
         else
         {
            A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         }
         A1509ColNoCAgr = httpContext.cgiGet( edtColNoCAgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1509ColNoCAgr", A1509ColNoCAgr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLNUCAGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtColNuCAgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1511ColNuCAgr = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1511ColNuCAgr), 6, 0));
         }
         else
         {
            A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1511ColNuCAgr), 6, 0));
         }
         A1649BarAgrDNu = httpContext.cgiGet( edtBarAgrDNu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1649BarAgrDNu", A1649BarAgrDNu);
         A13695BarAGrHdr = httpContext.cgiGet( edtBarAGrHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
         A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1Q413( ) ;
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
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes1Q413( ) ;
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

   public void resetCaption1Q40( )
   {
   }

   public void zm1Q413( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z590KgmAgr = T01Q43_A590KgmAgr[0] ;
            Z671PieAgr = T01Q43_A671PieAgr[0] ;
            Z869MtrAgr = T01Q43_A869MtrAgr[0] ;
            Z1245BarAgrSer = T01Q43_A1245BarAgrSer[0] ;
            Z1507BarAgrDsc = T01Q43_A1507BarAgrDsc[0] ;
            Z1508CliCodAgr = T01Q43_A1508CliCodAgr[0] ;
            Z1513DisCodAgr = T01Q43_A1513DisCodAgr[0] ;
            Z1510ColNomAgr = T01Q43_A1510ColNomAgr[0] ;
            Z1512ColNumAgr = T01Q43_A1512ColNumAgr[0] ;
            Z1509ColNoCAgr = T01Q43_A1509ColNoCAgr[0] ;
            Z1511ColNuCAgr = T01Q43_A1511ColNuCAgr[0] ;
            Z1649BarAgrDNu = T01Q43_A1649BarAgrDNu[0] ;
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
      if ( GX_JID == -4 )
      {
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
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1653FindDes = A1653FindDes ;
         Z474FindBarAgr = A474FindBarAgr ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load1Q413( )
   {
      /* Using cursor T01Q48 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A590KgmAgr = T01Q48_A590KgmAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         A671PieAgr = T01Q48_A671PieAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         A869MtrAgr = T01Q48_A869MtrAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         A1245BarAgrSer = T01Q48_A1245BarAgrSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         A1507BarAgrDsc = T01Q48_A1507BarAgrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         A1508CliCodAgr = T01Q48_A1508CliCodAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         A1513DisCodAgr = T01Q48_A1513DisCodAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1513DisCodAgr), 8, 0));
         A1510ColNomAgr = T01Q48_A1510ColNomAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         A1512ColNumAgr = T01Q48_A1512ColNumAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         A1509ColNoCAgr = T01Q48_A1509ColNoCAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1509ColNoCAgr", A1509ColNoCAgr);
         A1511ColNuCAgr = T01Q48_A1511ColNuCAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1511ColNuCAgr), 6, 0));
         A1649BarAgrDNu = T01Q48_A1649BarAgrDNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1649BarAgrDNu", A1649BarAgrDNu);
         A1653FindDes = T01Q48_A1653FindDes[0] ;
         n1653FindDes = T01Q48_n1653FindDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         A474FindBarAgr = T01Q48_A474FindBarAgr[0] ;
         n474FindBarAgr = T01Q48_n474FindBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
         zm1Q413( -4) ;
      }
      pr_default.close(5);
      onLoadActions1Q413( ) ;
   }

   public void onLoadActions1Q413( )
   {
      /* Using cursor T01Q46 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A121BarAgrKgm = T01Q46_A121BarAgrKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = T01Q46_A868BarAgrMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = T01Q46_A1650BarAgrNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = T01Q46_A1651BarPNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      pr_default.close(3);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
   }

   public void checkExtendedTable1Q413( )
   {
      nIsDirty_13 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01Q44 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01Q46 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A121BarAgrKgm = T01Q46_A121BarAgrKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = T01Q46_A868BarAgrMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = T01Q46_A1650BarAgrNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = T01Q46_A1651BarPNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         nIsDirty_13 = (short)(1) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         nIsDirty_13 = (short)(1) ;
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         nIsDirty_13 = (short)(1) ;
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      pr_default.close(3);
      /* Using cursor T01Q47 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A1653FindDes = T01Q47_A1653FindDes[0] ;
         n1653FindDes = T01Q47_n1653FindDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         A474FindBarAgr = T01Q47_A474FindBarAgr[0] ;
         n474FindBarAgr = T01Q47_n474FindBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
         nIsDirty_13 = (short)(1) ;
         A1653FindDes = " " ;
         n1653FindDes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1650BarAgrNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1651BarPNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      nIsDirty_13 = (short)(1) ;
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
      nIsDirty_13 = (short)(1) ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
   }

   public void closeExtendedTableCursors1Q413( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01Q49 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_6( String A396EmprCod ,
                         int A119BarAgrCod ,
                         byte A124BarAgrReo ,
                         String A122BarAgrPar )
   {
      /* Using cursor T01Q411 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A121BarAgrKgm = T01Q411_A121BarAgrKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = T01Q411_A868BarAgrMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = T01Q411_A1650BarAgrNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = T01Q411_A1651BarPNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_7( String A396EmprCod ,
                         int A119BarAgrCod ,
                         byte A124BarAgrReo ,
                         String A122BarAgrPar )
   {
      /* Using cursor T01Q412 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A1653FindDes = T01Q412_A1653FindDes[0] ;
         n1653FindDes = T01Q412_n1653FindDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         A474FindBarAgr = T01Q412_A474FindBarAgr[0] ;
         n474FindBarAgr = T01Q412_n474FindBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
         A1653FindDes = " " ;
         n1653FindDes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1653FindDes))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A474FindBarAgr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1Q413( )
   {
      /* Using cursor T01Q413 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01Q43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1Q413( 4) ;
         RcdFound13 = (short)(1) ;
         A119BarAgrCod = T01Q43_A119BarAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = T01Q43_A124BarAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = T01Q43_A122BarAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         A590KgmAgr = T01Q43_A590KgmAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         A671PieAgr = T01Q43_A671PieAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         A869MtrAgr = T01Q43_A869MtrAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         A1245BarAgrSer = T01Q43_A1245BarAgrSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         A1507BarAgrDsc = T01Q43_A1507BarAgrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         A1508CliCodAgr = T01Q43_A1508CliCodAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         A1513DisCodAgr = T01Q43_A1513DisCodAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1513DisCodAgr), 8, 0));
         A1510ColNomAgr = T01Q43_A1510ColNomAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         A1512ColNumAgr = T01Q43_A1512ColNumAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         A1509ColNoCAgr = T01Q43_A1509ColNoCAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1509ColNoCAgr", A1509ColNoCAgr);
         A1511ColNuCAgr = T01Q43_A1511ColNuCAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1511ColNuCAgr), 6, 0));
         A1649BarAgrDNu = T01Q43_A1649BarAgrDNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1649BarAgrDNu", A1649BarAgrDNu);
         A396EmprCod = T01Q43_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01Q43_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01Q43_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01Q43_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         standaloneModal( ) ;
         load1Q413( ) ;
         if ( AnyError == 1 )
         {
            RcdFound13 = (short)(0) ;
            initializeNonKey1Q413( ) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey1Q413( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1Q413( ) ;
      if ( RcdFound13 == 0 )
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
      RcdFound13 = (short)(0) ;
      /* Using cursor T01Q414 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Integer.valueOf(A119BarAgrCod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A124BarAgrReo), Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A122BarAgrPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A129BarCod[0] < A129BarCod ) || ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A132BarCodReo[0] < A132BarCodReo ) || ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A119BarAgrCod[0] < A119BarAgrCod ) || ( T01Q414_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A124BarAgrReo[0] < A124BarAgrReo ) || ( T01Q414_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01Q414_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q414_A122BarAgrPar[0], A122BarAgrPar) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A129BarCod[0] > A129BarCod ) || ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A132BarCodReo[0] > A132BarCodReo ) || ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A119BarAgrCod[0] > A119BarAgrCod ) || ( T01Q414_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q414_A124BarAgrReo[0] > A124BarAgrReo ) || ( T01Q414_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01Q414_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q414_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q414_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q414_A122BarAgrPar[0], A122BarAgrPar) > 0 ) ) )
         {
            A396EmprCod = T01Q414_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01Q414_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01Q414_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01Q414_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A119BarAgrCod = T01Q414_A119BarAgrCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            A124BarAgrReo = T01Q414_A124BarAgrReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            A122BarAgrPar = T01Q414_A122BarAgrPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound13 = (short)(0) ;
      /* Using cursor T01Q415 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Integer.valueOf(A119BarAgrCod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A124BarAgrReo), Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A122BarAgrPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A129BarCod[0] > A129BarCod ) || ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A132BarCodReo[0] > A132BarCodReo ) || ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A119BarAgrCod[0] > A119BarAgrCod ) || ( T01Q415_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A124BarAgrReo[0] > A124BarAgrReo ) || ( T01Q415_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01Q415_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q415_A122BarAgrPar[0], A122BarAgrPar) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A129BarCod[0] < A129BarCod ) || ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A132BarCodReo[0] < A132BarCodReo ) || ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A119BarAgrCod[0] < A119BarAgrCod ) || ( T01Q415_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q415_A124BarAgrReo[0] < A124BarAgrReo ) || ( T01Q415_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01Q415_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01Q415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q415_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q415_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q415_A122BarAgrPar[0], A122BarAgrPar) < 0 ) ) )
         {
            A396EmprCod = T01Q415_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01Q415_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01Q415_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01Q415_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A119BarAgrCod = T01Q415_A119BarAgrCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            A124BarAgrReo = T01Q415_A124BarAgrReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            A122BarAgrPar = T01Q415_A122BarAgrPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q413( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1Q413( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound13 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A119BarAgrCod = Z119BarAgrCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
               A124BarAgrReo = Z124BarAgrReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
               A122BarAgrPar = Z122BarAgrPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1Q413( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1Q413( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1Q413( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A119BarAgrCod = Z119BarAgrCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = Z124BarAgrReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = Z122BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtKgmAgr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1Q413( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtKgmAgr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1Q413( ) ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtKgmAgr_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtKgmAgr_Internalname ;
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
      scanStart1Q413( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound13 != 0 )
         {
            scanNext1Q413( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtKgmAgr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1Q413( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1Q413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01Q42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z590KgmAgr, T01Q42_A590KgmAgr[0]) != 0 ) || ( Z671PieAgr != T01Q42_A671PieAgr[0] ) || ( DecimalUtil.compareTo(Z869MtrAgr, T01Q42_A869MtrAgr[0]) != 0 ) || ( GXutil.strcmp(Z1245BarAgrSer, T01Q42_A1245BarAgrSer[0]) != 0 ) || ( GXutil.strcmp(Z1507BarAgrDsc, T01Q42_A1507BarAgrDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1508CliCodAgr != T01Q42_A1508CliCodAgr[0] ) || ( Z1513DisCodAgr != T01Q42_A1513DisCodAgr[0] ) || ( GXutil.strcmp(Z1510ColNomAgr, T01Q42_A1510ColNomAgr[0]) != 0 ) || ( Z1512ColNumAgr != T01Q42_A1512ColNumAgr[0] ) || ( GXutil.strcmp(Z1509ColNoCAgr, T01Q42_A1509ColNoCAgr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1511ColNuCAgr != T01Q42_A1511ColNuCAgr[0] ) || ( GXutil.strcmp(Z1649BarAgrDNu, T01Q42_A1649BarAgrDNu[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z590KgmAgr, T01Q42_A590KgmAgr[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"KgmAgr");
               GXutil.writeLogRaw("Old: ",Z590KgmAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A590KgmAgr[0]);
            }
            if ( Z671PieAgr != T01Q42_A671PieAgr[0] )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"PieAgr");
               GXutil.writeLogRaw("Old: ",Z671PieAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A671PieAgr[0]);
            }
            if ( DecimalUtil.compareTo(Z869MtrAgr, T01Q42_A869MtrAgr[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"MtrAgr");
               GXutil.writeLogRaw("Old: ",Z869MtrAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A869MtrAgr[0]);
            }
            if ( GXutil.strcmp(Z1245BarAgrSer, T01Q42_A1245BarAgrSer[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"BarAgrSer");
               GXutil.writeLogRaw("Old: ",Z1245BarAgrSer);
               GXutil.writeLogRaw("Current: ",T01Q42_A1245BarAgrSer[0]);
            }
            if ( GXutil.strcmp(Z1507BarAgrDsc, T01Q42_A1507BarAgrDsc[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"BarAgrDsc");
               GXutil.writeLogRaw("Old: ",Z1507BarAgrDsc);
               GXutil.writeLogRaw("Current: ",T01Q42_A1507BarAgrDsc[0]);
            }
            if ( Z1508CliCodAgr != T01Q42_A1508CliCodAgr[0] )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"CliCodAgr");
               GXutil.writeLogRaw("Old: ",Z1508CliCodAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A1508CliCodAgr[0]);
            }
            if ( Z1513DisCodAgr != T01Q42_A1513DisCodAgr[0] )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"DisCodAgr");
               GXutil.writeLogRaw("Old: ",Z1513DisCodAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A1513DisCodAgr[0]);
            }
            if ( GXutil.strcmp(Z1510ColNomAgr, T01Q42_A1510ColNomAgr[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"ColNomAgr");
               GXutil.writeLogRaw("Old: ",Z1510ColNomAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A1510ColNomAgr[0]);
            }
            if ( Z1512ColNumAgr != T01Q42_A1512ColNumAgr[0] )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"ColNumAgr");
               GXutil.writeLogRaw("Old: ",Z1512ColNumAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A1512ColNumAgr[0]);
            }
            if ( GXutil.strcmp(Z1509ColNoCAgr, T01Q42_A1509ColNoCAgr[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"ColNoCAgr");
               GXutil.writeLogRaw("Old: ",Z1509ColNoCAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A1509ColNoCAgr[0]);
            }
            if ( Z1511ColNuCAgr != T01Q42_A1511ColNuCAgr[0] )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"ColNuCAgr");
               GXutil.writeLogRaw("Old: ",Z1511ColNuCAgr);
               GXutil.writeLogRaw("Current: ",T01Q42_A1511ColNuCAgr[0]);
            }
            if ( GXutil.strcmp(Z1649BarAgrDNu, T01Q42_A1649BarAgrDNu[0]) != 0 )
            {
               GXutil.writeLogln("baragr:[seudo value changed for attri]"+"BarAgrDNu");
               GXutil.writeLogRaw("Old: ",Z1649BarAgrDNu);
               GXutil.writeLogRaw("Current: ",T01Q42_A1649BarAgrDNu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARAGR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q413( )
   {
      beforeValidate1Q413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q413( 0) ;
         checkOptimisticConcurrency1Q413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q416 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        resetCaption1Q40( ) ;
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
            load1Q413( ) ;
         }
         endLevel1Q413( ) ;
      }
      closeExtendedTableCursors1Q413( ) ;
   }

   public void update1Q413( )
   {
      beforeValidate1Q413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q413( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q413( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q417 */
                  pr_default.execute(13, new Object[] {A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1Q40( ) ;
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
         endLevel1Q413( ) ;
      }
      closeExtendedTableCursors1Q413( ) ;
   }

   public void deferredUpdate1Q413( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1Q413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q413( ) ;
         afterConfirm1Q413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01Q418 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound13 == 0 )
                     {
                        initAll1Q413( ) ;
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
                     resetCaption1Q40( ) ;
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1Q413( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1Q413( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01Q420 */
         pr_default.execute(15, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A121BarAgrKgm = T01Q420_A121BarAgrKgm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
            A868BarAgrMtr = T01Q420_A868BarAgrMtr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
            A1650BarAgrNDes = T01Q420_A1650BarAgrNDes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
            A1651BarPNDes = T01Q420_A1651BarPNDes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
         }
         else
         {
            A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
            A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
            A1650BarAgrNDes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
            A1651BarPNDes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
         }
         pr_default.close(15);
         /* Using cursor T01Q421 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            A1653FindDes = T01Q421_A1653FindDes[0] ;
            n1653FindDes = T01Q421_n1653FindDes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
            A474FindBarAgr = T01Q421_A474FindBarAgr[0] ;
            n474FindBarAgr = T01Q421_n474FindBarAgr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
         }
         else
         {
            A474FindBarAgr = "" ;
            n474FindBarAgr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
            A1653FindDes = " " ;
            n1653FindDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         }
         pr_default.close(16);
         if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A123BarAgrPie = A1650BarAgrNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         }
         else
         {
            A123BarAgrPie = A1651BarPNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         }
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
      }
   }

   public void endLevel1Q413( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1Q413( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "baragr");
         if ( AnyError == 0 )
         {
            confirmValues1Q40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "baragr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1Q413( )
   {
      /* Using cursor T01Q422 */
      pr_default.execute(17);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A396EmprCod = T01Q422_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01Q422_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01Q422_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01Q422_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A119BarAgrCod = T01Q422_A119BarAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = T01Q422_A124BarAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = T01Q422_A122BarAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1Q413( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A396EmprCod = T01Q422_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01Q422_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01Q422_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01Q422_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A119BarAgrCod = T01Q422_A119BarAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = T01Q422_A124BarAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = T01Q422_A122BarAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      }
   }

   public void scanEnd1Q413( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1Q413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1Q413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1Q413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q413( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), true);
      edtBarAgrReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), true);
      edtBarAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), true);
      edtBarAgrKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), true);
      edtBarAgrMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), true);
      edtBarAgrPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), true);
      edtBarAgrNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), true);
      edtBarPNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), true);
      edtFindDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), true);
      edtFindBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), true);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), true);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), true);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), true);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), true);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), true);
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), true);
      edtDisCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), true);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), true);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), true);
      edtColNoCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), true);
      edtColNuCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), true);
      edtBarAgrDNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), true);
      edtBarAGrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), true);
      edtBarAgrNhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1Q413( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1Q40( )
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.baragr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z119BarAgrCod", GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z124BarAgrReo", GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z122BarAgrPar", GXutil.rtrim( Z122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z590KgmAgr", GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z671PieAgr", GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z869MtrAgr", GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1245BarAgrSer", GXutil.rtrim( Z1245BarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1507BarAgrDsc", GXutil.rtrim( Z1507BarAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1508CliCodAgr", GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1513DisCodAgr", GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1510ColNomAgr", GXutil.rtrim( Z1510ColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1512ColNumAgr", GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1509ColNoCAgr", GXutil.rtrim( Z1509ColNoCAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1511ColNuCAgr", GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1649BarAgrDNu", GXutil.rtrim( Z1649BarAgrDNu));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.baragr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "BARAGR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "BARAGR", "") ;
   }

   public void initializeNonKey1Q413( )
   {
      A123BarAgrPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      A13695BarAGrHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
      A13792BarAgrNhdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
      A121BarAgrKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
      A868BarAgrMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
      A1650BarAgrNDes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
      A1651BarPNDes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      A1653FindDes = "" ;
      n1653FindDes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      A474FindBarAgr = "" ;
      n474FindBarAgr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
      A590KgmAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
      A671PieAgr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
      A869MtrAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
      A1245BarAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
      A1507BarAgrDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
      A1508CliCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
      A1513DisCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1513DisCodAgr), 8, 0));
      A1510ColNomAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
      A1512ColNumAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
      A1509ColNoCAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1509ColNoCAgr", A1509ColNoCAgr);
      A1511ColNuCAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1511ColNuCAgr), 6, 0));
      A1649BarAgrDNu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1649BarAgrDNu", A1649BarAgrDNu);
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

   public void initAll1Q413( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A119BarAgrCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
      A124BarAgrReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
      A122BarAgrPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      initializeNonKey1Q413( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613475669", true, true);
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
      httpContext.AddJavascriptSource("baragr.js", "?20267613475669", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
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
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtBarAgrDsc_Internalname = "BARAGRDSC" ;
      edtCliCodAgr_Internalname = "CLICODAGR" ;
      edtDisCodAgr_Internalname = "DISCODAGR" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtColNoCAgr_Internalname = "COLNOCAGR" ;
      edtColNuCAgr_Internalname = "COLNUCAGR" ;
      edtBarAgrDNu_Internalname = "BARAGRDNU" ;
      edtBarAGrHdr_Internalname = "BARAGRHDR" ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
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
      Form.setCaption( httpContext.getMessage( "BARAGR", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarAgrNhdr_Jsonclick = "" ;
      edtBarAgrNhdr_Enabled = 0 ;
      edtBarAGrHdr_Jsonclick = "" ;
      edtBarAGrHdr_Enabled = 0 ;
      edtBarAgrDNu_Jsonclick = "" ;
      edtBarAgrDNu_Enabled = 1 ;
      edtColNuCAgr_Jsonclick = "" ;
      edtColNuCAgr_Enabled = 1 ;
      edtColNoCAgr_Jsonclick = "" ;
      edtColNoCAgr_Enabled = 1 ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNumAgr_Enabled = 1 ;
      edtColNomAgr_Jsonclick = "" ;
      edtColNomAgr_Enabled = 1 ;
      edtDisCodAgr_Jsonclick = "" ;
      edtDisCodAgr_Enabled = 1 ;
      edtCliCodAgr_Jsonclick = "" ;
      edtCliCodAgr_Enabled = 1 ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtBarAgrDsc_Enabled = 1 ;
      edtBarAgrSer_Jsonclick = "" ;
      edtBarAgrSer_Enabled = 1 ;
      edtMtrAgr_Jsonclick = "" ;
      edtMtrAgr_Enabled = 1 ;
      edtPieAgr_Jsonclick = "" ;
      edtPieAgr_Enabled = 1 ;
      edtKgmAgr_Jsonclick = "" ;
      edtKgmAgr_Enabled = 1 ;
      edtFindBarAgr_Jsonclick = "" ;
      edtFindBarAgr_Enabled = 0 ;
      edtFindDes_Jsonclick = "" ;
      edtFindDes_Enabled = 0 ;
      edtBarPNDes_Jsonclick = "" ;
      edtBarPNDes_Enabled = 0 ;
      edtBarAgrNDes_Jsonclick = "" ;
      edtBarAgrNDes_Enabled = 0 ;
      edtBarAgrPie_Jsonclick = "" ;
      edtBarAgrPie_Enabled = 0 ;
      edtBarAgrMtr_Jsonclick = "" ;
      edtBarAgrMtr_Enabled = 0 ;
      edtBarAgrKgm_Jsonclick = "" ;
      edtBarAgrKgm_Enabled = 0 ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrPar_Enabled = 1 ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrReo_Enabled = 1 ;
      edtBarAgrCod_Jsonclick = "" ;
      edtBarAgrCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01Q423 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(18);
      /* Using cursor T01Q420 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A121BarAgrKgm = T01Q420_A121BarAgrKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = T01Q420_A868BarAgrMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = T01Q420_A1650BarAgrNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = T01Q420_A1651BarPNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      pr_default.close(15);
      /* Using cursor T01Q421 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A1653FindDes = T01Q421_A1653FindDes[0] ;
         n1653FindDes = T01Q421_n1653FindDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         A474FindBarAgr = T01Q421_A474FindBarAgr[0] ;
         n474FindBarAgr = T01Q421_n474FindBarAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
         A1653FindDes = " " ;
         n1653FindDes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      }
      pr_default.close(16);
      GX_FocusControl = edtKgmAgr_Internalname ;
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01Q423 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Baragrpar( )
   {
      n1653FindDes = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01Q420 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A121BarAgrKgm = T01Q420_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01Q420_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01Q420_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01Q420_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(15);
      /* Using cursor T01Q421 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A1653FindDes = T01Q421_A1653FindDes[0] ;
         n1653FindDes = T01Q421_n1653FindDes[0] ;
         A474FindBarAgr = T01Q421_A474FindBarAgr[0] ;
         n474FindBarAgr = T01Q421_n474FindBarAgr[0] ;
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      pr_default.close(16);
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
      httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", GXutil.rtrim( A1245BarAgrSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", GXutil.rtrim( A1507BarAgrDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", GXutil.rtrim( A1510ColNomAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1509ColNoCAgr", GXutil.rtrim( A1509ColNoCAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1649BarAgrDNu", GXutil.rtrim( A1649BarAgrDNu));
      httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", GXutil.rtrim( A1653FindDes));
      httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", GXutil.rtrim( A474FindBarAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", GXutil.rtrim( A13792BarAgrNhdr));
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", GXutil.rtrim( A13695BarAGrHdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z119BarAgrCod", GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z124BarAgrReo", GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z122BarAgrPar", GXutil.rtrim( Z122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z590KgmAgr", GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z671PieAgr", GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z869MtrAgr", GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1245BarAgrSer", GXutil.rtrim( Z1245BarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1507BarAgrDsc", GXutil.rtrim( Z1507BarAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1508CliCodAgr", GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1513DisCodAgr", GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1510ColNomAgr", GXutil.rtrim( Z1510ColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1512ColNumAgr", GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1509ColNoCAgr", GXutil.rtrim( Z1509ColNoCAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1511ColNuCAgr", GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1649BarAgrDNu", GXutil.rtrim( Z1649BarAgrDNu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z121BarAgrKgm", GXutil.ltrim( localUtil.ntoc( Z121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z868BarAgrMtr", GXutil.ltrim( localUtil.ntoc( Z868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1650BarAgrNDes", GXutil.ltrim( localUtil.ntoc( Z1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1651BarPNDes", GXutil.ltrim( localUtil.ntoc( Z1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1653FindDes", GXutil.rtrim( Z1653FindDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z474FindBarAgr", GXutil.rtrim( Z474FindBarAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z123BarAgrPie", GXutil.ltrim( localUtil.ntoc( Z123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13792BarAgrNhdr", GXutil.rtrim( Z13792BarAgrNhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13695BarAGrHdr", GXutil.rtrim( Z13695BarAGrHdr));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A1245BarAgrSer',fld:'BARAGRSER',pic:''},{av:'A1507BarAgrDsc',fld:'BARAGRDSC',pic:''},{av:'A1508CliCodAgr',fld:'CLICODAGR',pic:'ZZZZZ9'},{av:'A1513DisCodAgr',fld:'DISCODAGR',pic:'ZZZZZZZ9'},{av:'A1510ColNomAgr',fld:'COLNOMAGR',pic:''},{av:'A1512ColNumAgr',fld:'COLNUMAGR',pic:'ZZZZZ9'},{av:'A1509ColNoCAgr',fld:'COLNOCAGR',pic:''},{av:'A1511ColNuCAgr',fld:'COLNUCAGR',pic:'ZZZZZ9'},{av:'A1649BarAgrDNu',fld:'BARAGRDNU',pic:''},{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A474FindBarAgr',fld:'FINDBARAGR',pic:'@!'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z119BarAgrCod'},{av:'Z124BarAgrReo'},{av:'Z122BarAgrPar'},{av:'Z590KgmAgr'},{av:'Z671PieAgr'},{av:'Z869MtrAgr'},{av:'Z1245BarAgrSer'},{av:'Z1507BarAgrDsc'},{av:'Z1508CliCodAgr'},{av:'Z1513DisCodAgr'},{av:'Z1510ColNomAgr'},{av:'Z1512ColNumAgr'},{av:'Z1509ColNoCAgr'},{av:'Z1511ColNuCAgr'},{av:'Z1649BarAgrDNu'},{av:'Z121BarAgrKgm'},{av:'Z868BarAgrMtr'},{av:'Z1650BarAgrNDes'},{av:'Z1651BarPNDes'},{av:'Z1653FindDes'},{av:'Z474FindBarAgr'},{av:'Z123BarAgrPie'},{av:'Z13792BarAgrNhdr'},{av:'Z13695BarAGrHdr'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARAGRNDES","{handler:'valid_Baragrndes',iparms:[]");
      setEventMetadata("VALID_BARAGRNDES",",oparms:[]}");
      setEventMetadata("VALID_BARPNDES","{handler:'valid_Barpndes',iparms:[]");
      setEventMetadata("VALID_BARPNDES",",oparms:[]}");
      setEventMetadata("VALID_FINDDES","{handler:'valid_Finddes',iparms:[]");
      setEventMetadata("VALID_FINDDES",",oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
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
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A121BarAgrKgm = DecimalUtil.ZERO ;
      A868BarAgrMtr = DecimalUtil.ZERO ;
      A1653FindDes = "" ;
      A474FindBarAgr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      A1649BarAgrDNu = "" ;
      A13695BarAGrHdr = "" ;
      A13792BarAgrNhdr = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z1653FindDes = "" ;
      Z474FindBarAgr = "" ;
      T01Q48_A119BarAgrCod = new int[1] ;
      T01Q48_A124BarAgrReo = new byte[1] ;
      T01Q48_A122BarAgrPar = new String[] {""} ;
      T01Q48_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q48_A671PieAgr = new short[1] ;
      T01Q48_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q48_A1245BarAgrSer = new String[] {""} ;
      T01Q48_A1507BarAgrDsc = new String[] {""} ;
      T01Q48_A1508CliCodAgr = new int[1] ;
      T01Q48_A1513DisCodAgr = new int[1] ;
      T01Q48_A1510ColNomAgr = new String[] {""} ;
      T01Q48_A1512ColNumAgr = new int[1] ;
      T01Q48_A1509ColNoCAgr = new String[] {""} ;
      T01Q48_A1511ColNuCAgr = new int[1] ;
      T01Q48_A1649BarAgrDNu = new String[] {""} ;
      T01Q48_A396EmprCod = new String[] {""} ;
      T01Q48_A129BarCod = new int[1] ;
      T01Q48_A132BarCodReo = new byte[1] ;
      T01Q48_A130BarCodPar = new String[] {""} ;
      T01Q48_A1653FindDes = new String[] {""} ;
      T01Q48_n1653FindDes = new boolean[] {false} ;
      T01Q48_A474FindBarAgr = new String[] {""} ;
      T01Q48_n474FindBarAgr = new boolean[] {false} ;
      T01Q46_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q46_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q46_A1650BarAgrNDes = new short[1] ;
      T01Q46_A1651BarPNDes = new short[1] ;
      T01Q44_A396EmprCod = new String[] {""} ;
      T01Q47_A1653FindDes = new String[] {""} ;
      T01Q47_n1653FindDes = new boolean[] {false} ;
      T01Q47_A474FindBarAgr = new String[] {""} ;
      T01Q47_n474FindBarAgr = new boolean[] {false} ;
      T01Q49_A396EmprCod = new String[] {""} ;
      T01Q411_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q411_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q411_A1650BarAgrNDes = new short[1] ;
      T01Q411_A1651BarPNDes = new short[1] ;
      T01Q412_A1653FindDes = new String[] {""} ;
      T01Q412_n1653FindDes = new boolean[] {false} ;
      T01Q412_A474FindBarAgr = new String[] {""} ;
      T01Q412_n474FindBarAgr = new boolean[] {false} ;
      T01Q413_A396EmprCod = new String[] {""} ;
      T01Q413_A129BarCod = new int[1] ;
      T01Q413_A132BarCodReo = new byte[1] ;
      T01Q413_A130BarCodPar = new String[] {""} ;
      T01Q413_A119BarAgrCod = new int[1] ;
      T01Q413_A124BarAgrReo = new byte[1] ;
      T01Q413_A122BarAgrPar = new String[] {""} ;
      T01Q43_A119BarAgrCod = new int[1] ;
      T01Q43_A124BarAgrReo = new byte[1] ;
      T01Q43_A122BarAgrPar = new String[] {""} ;
      T01Q43_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q43_A671PieAgr = new short[1] ;
      T01Q43_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q43_A1245BarAgrSer = new String[] {""} ;
      T01Q43_A1507BarAgrDsc = new String[] {""} ;
      T01Q43_A1508CliCodAgr = new int[1] ;
      T01Q43_A1513DisCodAgr = new int[1] ;
      T01Q43_A1510ColNomAgr = new String[] {""} ;
      T01Q43_A1512ColNumAgr = new int[1] ;
      T01Q43_A1509ColNoCAgr = new String[] {""} ;
      T01Q43_A1511ColNuCAgr = new int[1] ;
      T01Q43_A1649BarAgrDNu = new String[] {""} ;
      T01Q43_A396EmprCod = new String[] {""} ;
      T01Q43_A129BarCod = new int[1] ;
      T01Q43_A132BarCodReo = new byte[1] ;
      T01Q43_A130BarCodPar = new String[] {""} ;
      sMode13 = "" ;
      T01Q414_A396EmprCod = new String[] {""} ;
      T01Q414_A129BarCod = new int[1] ;
      T01Q414_A132BarCodReo = new byte[1] ;
      T01Q414_A130BarCodPar = new String[] {""} ;
      T01Q414_A119BarAgrCod = new int[1] ;
      T01Q414_A124BarAgrReo = new byte[1] ;
      T01Q414_A122BarAgrPar = new String[] {""} ;
      T01Q415_A396EmprCod = new String[] {""} ;
      T01Q415_A129BarCod = new int[1] ;
      T01Q415_A132BarCodReo = new byte[1] ;
      T01Q415_A130BarCodPar = new String[] {""} ;
      T01Q415_A119BarAgrCod = new int[1] ;
      T01Q415_A124BarAgrReo = new byte[1] ;
      T01Q415_A122BarAgrPar = new String[] {""} ;
      T01Q42_A119BarAgrCod = new int[1] ;
      T01Q42_A124BarAgrReo = new byte[1] ;
      T01Q42_A122BarAgrPar = new String[] {""} ;
      T01Q42_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q42_A671PieAgr = new short[1] ;
      T01Q42_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q42_A1245BarAgrSer = new String[] {""} ;
      T01Q42_A1507BarAgrDsc = new String[] {""} ;
      T01Q42_A1508CliCodAgr = new int[1] ;
      T01Q42_A1513DisCodAgr = new int[1] ;
      T01Q42_A1510ColNomAgr = new String[] {""} ;
      T01Q42_A1512ColNumAgr = new int[1] ;
      T01Q42_A1509ColNoCAgr = new String[] {""} ;
      T01Q42_A1511ColNuCAgr = new int[1] ;
      T01Q42_A1649BarAgrDNu = new String[] {""} ;
      T01Q42_A396EmprCod = new String[] {""} ;
      T01Q42_A129BarCod = new int[1] ;
      T01Q42_A132BarCodReo = new byte[1] ;
      T01Q42_A130BarCodPar = new String[] {""} ;
      T01Q420_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q420_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q420_A1650BarAgrNDes = new short[1] ;
      T01Q420_A1651BarPNDes = new short[1] ;
      T01Q421_A1653FindDes = new String[] {""} ;
      T01Q421_n1653FindDes = new boolean[] {false} ;
      T01Q421_A474FindBarAgr = new String[] {""} ;
      T01Q421_n474FindBarAgr = new boolean[] {false} ;
      T01Q422_A396EmprCod = new String[] {""} ;
      T01Q422_A129BarCod = new int[1] ;
      T01Q422_A132BarCodReo = new byte[1] ;
      T01Q422_A130BarCodPar = new String[] {""} ;
      T01Q422_A119BarAgrCod = new int[1] ;
      T01Q422_A124BarAgrReo = new byte[1] ;
      T01Q422_A122BarAgrPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01Q423_A396EmprCod = new String[] {""} ;
      Z121BarAgrKgm = DecimalUtil.ZERO ;
      Z868BarAgrMtr = DecimalUtil.ZERO ;
      Z13792BarAgrNhdr = "" ;
      Z13695BarAGrHdr = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ122BarAgrPar = "" ;
      ZZ590KgmAgr = DecimalUtil.ZERO ;
      ZZ869MtrAgr = DecimalUtil.ZERO ;
      ZZ1245BarAgrSer = "" ;
      ZZ1507BarAgrDsc = "" ;
      ZZ1510ColNomAgr = "" ;
      ZZ1509ColNoCAgr = "" ;
      ZZ1649BarAgrDNu = "" ;
      ZZ121BarAgrKgm = DecimalUtil.ZERO ;
      ZZ868BarAgrMtr = DecimalUtil.ZERO ;
      ZZ1653FindDes = "" ;
      ZZ474FindBarAgr = "" ;
      ZZ13792BarAgrNhdr = "" ;
      ZZ13695BarAGrHdr = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.baragr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.baragr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.baragr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.baragr__default(),
         new Object[] {
             new Object[] {
            T01Q42_A119BarAgrCod, T01Q42_A124BarAgrReo, T01Q42_A122BarAgrPar, T01Q42_A590KgmAgr, T01Q42_A671PieAgr, T01Q42_A869MtrAgr, T01Q42_A1245BarAgrSer, T01Q42_A1507BarAgrDsc, T01Q42_A1508CliCodAgr, T01Q42_A1513DisCodAgr,
            T01Q42_A1510ColNomAgr, T01Q42_A1512ColNumAgr, T01Q42_A1509ColNoCAgr, T01Q42_A1511ColNuCAgr, T01Q42_A1649BarAgrDNu, T01Q42_A396EmprCod, T01Q42_A129BarCod, T01Q42_A132BarCodReo, T01Q42_A130BarCodPar
            }
            , new Object[] {
            T01Q43_A119BarAgrCod, T01Q43_A124BarAgrReo, T01Q43_A122BarAgrPar, T01Q43_A590KgmAgr, T01Q43_A671PieAgr, T01Q43_A869MtrAgr, T01Q43_A1245BarAgrSer, T01Q43_A1507BarAgrDsc, T01Q43_A1508CliCodAgr, T01Q43_A1513DisCodAgr,
            T01Q43_A1510ColNomAgr, T01Q43_A1512ColNumAgr, T01Q43_A1509ColNoCAgr, T01Q43_A1511ColNuCAgr, T01Q43_A1649BarAgrDNu, T01Q43_A396EmprCod, T01Q43_A129BarCod, T01Q43_A132BarCodReo, T01Q43_A130BarCodPar
            }
            , new Object[] {
            T01Q44_A396EmprCod
            }
            , new Object[] {
            T01Q46_A121BarAgrKgm, T01Q46_A868BarAgrMtr, T01Q46_A1650BarAgrNDes, T01Q46_A1651BarPNDes
            }
            , new Object[] {
            T01Q47_A1653FindDes, T01Q47_n1653FindDes, T01Q47_A474FindBarAgr, T01Q47_n474FindBarAgr
            }
            , new Object[] {
            T01Q48_A119BarAgrCod, T01Q48_A124BarAgrReo, T01Q48_A122BarAgrPar, T01Q48_A590KgmAgr, T01Q48_A671PieAgr, T01Q48_A869MtrAgr, T01Q48_A1245BarAgrSer, T01Q48_A1507BarAgrDsc, T01Q48_A1508CliCodAgr, T01Q48_A1513DisCodAgr,
            T01Q48_A1510ColNomAgr, T01Q48_A1512ColNumAgr, T01Q48_A1509ColNoCAgr, T01Q48_A1511ColNuCAgr, T01Q48_A1649BarAgrDNu, T01Q48_A396EmprCod, T01Q48_A129BarCod, T01Q48_A132BarCodReo, T01Q48_A130BarCodPar, T01Q48_A1653FindDes,
            T01Q48_n1653FindDes, T01Q48_A474FindBarAgr, T01Q48_n474FindBarAgr
            }
            , new Object[] {
            T01Q49_A396EmprCod
            }
            , new Object[] {
            T01Q411_A121BarAgrKgm, T01Q411_A868BarAgrMtr, T01Q411_A1650BarAgrNDes, T01Q411_A1651BarPNDes
            }
            , new Object[] {
            T01Q412_A1653FindDes, T01Q412_n1653FindDes, T01Q412_A474FindBarAgr, T01Q412_n474FindBarAgr
            }
            , new Object[] {
            T01Q413_A396EmprCod, T01Q413_A129BarCod, T01Q413_A132BarCodReo, T01Q413_A130BarCodPar, T01Q413_A119BarAgrCod, T01Q413_A124BarAgrReo, T01Q413_A122BarAgrPar
            }
            , new Object[] {
            T01Q414_A396EmprCod, T01Q414_A129BarCod, T01Q414_A132BarCodReo, T01Q414_A130BarCodPar, T01Q414_A119BarAgrCod, T01Q414_A124BarAgrReo, T01Q414_A122BarAgrPar
            }
            , new Object[] {
            T01Q415_A396EmprCod, T01Q415_A129BarCod, T01Q415_A132BarCodReo, T01Q415_A130BarCodPar, T01Q415_A119BarAgrCod, T01Q415_A124BarAgrReo, T01Q415_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q420_A121BarAgrKgm, T01Q420_A868BarAgrMtr, T01Q420_A1650BarAgrNDes, T01Q420_A1651BarPNDes
            }
            , new Object[] {
            T01Q421_A1653FindDes, T01Q421_n1653FindDes, T01Q421_A474FindBarAgr, T01Q421_n474FindBarAgr
            }
            , new Object[] {
            T01Q422_A396EmprCod, T01Q422_A129BarCod, T01Q422_A132BarCodReo, T01Q422_A130BarCodPar, T01Q422_A119BarAgrCod, T01Q422_A124BarAgrReo, T01Q422_A122BarAgrPar
            }
            , new Object[] {
            T01Q423_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z124BarAgrReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ124BarAgrReo ;
   private short Z671PieAgr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A123BarAgrPie ;
   private short A1650BarAgrNDes ;
   private short A1651BarPNDes ;
   private short A671PieAgr ;
   private short RcdFound13 ;
   private short nIsDirty_13 ;
   private short Z1650BarAgrNDes ;
   private short Z1651BarPNDes ;
   private short Z123BarAgrPie ;
   private short ZZ671PieAgr ;
   private short ZZ1650BarAgrNDes ;
   private short ZZ1651BarPNDes ;
   private short ZZ123BarAgrPie ;
   private int Z129BarCod ;
   private int Z119BarAgrCod ;
   private int Z1508CliCodAgr ;
   private int Z1513DisCodAgr ;
   private int Z1512ColNumAgr ;
   private int Z1511ColNuCAgr ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarAgrCod_Enabled ;
   private int edtBarAgrReo_Enabled ;
   private int edtBarAgrPar_Enabled ;
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
   private int edtBarAgrSer_Enabled ;
   private int edtBarAgrDsc_Enabled ;
   private int A1508CliCodAgr ;
   private int edtCliCodAgr_Enabled ;
   private int A1513DisCodAgr ;
   private int edtDisCodAgr_Enabled ;
   private int edtColNomAgr_Enabled ;
   private int A1512ColNumAgr ;
   private int edtColNumAgr_Enabled ;
   private int edtColNoCAgr_Enabled ;
   private int A1511ColNuCAgr ;
   private int edtColNuCAgr_Enabled ;
   private int edtBarAgrDNu_Enabled ;
   private int edtBarAGrHdr_Enabled ;
   private int edtBarAgrNhdr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ119BarAgrCod ;
   private int ZZ1508CliCodAgr ;
   private int ZZ1513DisCodAgr ;
   private int ZZ1512ColNumAgr ;
   private int ZZ1511ColNuCAgr ;
   private java.math.BigDecimal Z590KgmAgr ;
   private java.math.BigDecimal Z869MtrAgr ;
   private java.math.BigDecimal A121BarAgrKgm ;
   private java.math.BigDecimal A868BarAgrMtr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal Z121BarAgrKgm ;
   private java.math.BigDecimal Z868BarAgrMtr ;
   private java.math.BigDecimal ZZ590KgmAgr ;
   private java.math.BigDecimal ZZ869MtrAgr ;
   private java.math.BigDecimal ZZ121BarAgrKgm ;
   private java.math.BigDecimal ZZ868BarAgrMtr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
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
   private String A122BarAgrPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Internalname ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Internalname ;
   private String edtBarAgrPar_Jsonclick ;
   private String edtBarAgrKgm_Internalname ;
   private String edtBarAgrKgm_Jsonclick ;
   private String edtBarAgrMtr_Internalname ;
   private String edtBarAgrMtr_Jsonclick ;
   private String edtBarAgrPie_Internalname ;
   private String edtBarAgrPie_Jsonclick ;
   private String edtBarAgrNDes_Internalname ;
   private String edtBarAgrNDes_Jsonclick ;
   private String edtBarPNDes_Internalname ;
   private String edtBarPNDes_Jsonclick ;
   private String edtFindDes_Internalname ;
   private String A1653FindDes ;
   private String edtFindDes_Jsonclick ;
   private String edtFindBarAgr_Internalname ;
   private String A474FindBarAgr ;
   private String edtFindBarAgr_Jsonclick ;
   private String edtKgmAgr_Internalname ;
   private String edtKgmAgr_Jsonclick ;
   private String edtPieAgr_Internalname ;
   private String edtPieAgr_Jsonclick ;
   private String edtMtrAgr_Internalname ;
   private String edtMtrAgr_Jsonclick ;
   private String edtBarAgrSer_Internalname ;
   private String A1245BarAgrSer ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtBarAgrDsc_Internalname ;
   private String A1507BarAgrDsc ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtCliCodAgr_Internalname ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtDisCodAgr_Internalname ;
   private String edtDisCodAgr_Jsonclick ;
   private String edtColNomAgr_Internalname ;
   private String A1510ColNomAgr ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Internalname ;
   private String edtColNumAgr_Jsonclick ;
   private String edtColNoCAgr_Internalname ;
   private String A1509ColNoCAgr ;
   private String edtColNoCAgr_Jsonclick ;
   private String edtColNuCAgr_Internalname ;
   private String edtColNuCAgr_Jsonclick ;
   private String edtBarAgrDNu_Internalname ;
   private String A1649BarAgrDNu ;
   private String edtBarAgrDNu_Jsonclick ;
   private String edtBarAGrHdr_Internalname ;
   private String A13695BarAGrHdr ;
   private String edtBarAGrHdr_Jsonclick ;
   private String edtBarAgrNhdr_Internalname ;
   private String A13792BarAgrNhdr ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z1653FindDes ;
   private String Z474FindBarAgr ;
   private String sMode13 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13792BarAgrNhdr ;
   private String Z13695BarAGrHdr ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ122BarAgrPar ;
   private String ZZ1245BarAgrSer ;
   private String ZZ1507BarAgrDsc ;
   private String ZZ1510ColNomAgr ;
   private String ZZ1509ColNoCAgr ;
   private String ZZ1649BarAgrDNu ;
   private String ZZ1653FindDes ;
   private String ZZ474FindBarAgr ;
   private String ZZ13792BarAgrNhdr ;
   private String ZZ13695BarAGrHdr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1653FindDes ;
   private boolean n474FindBarAgr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01Q48_A119BarAgrCod ;
   private byte[] T01Q48_A124BarAgrReo ;
   private String[] T01Q48_A122BarAgrPar ;
   private java.math.BigDecimal[] T01Q48_A590KgmAgr ;
   private short[] T01Q48_A671PieAgr ;
   private java.math.BigDecimal[] T01Q48_A869MtrAgr ;
   private String[] T01Q48_A1245BarAgrSer ;
   private String[] T01Q48_A1507BarAgrDsc ;
   private int[] T01Q48_A1508CliCodAgr ;
   private int[] T01Q48_A1513DisCodAgr ;
   private String[] T01Q48_A1510ColNomAgr ;
   private int[] T01Q48_A1512ColNumAgr ;
   private String[] T01Q48_A1509ColNoCAgr ;
   private int[] T01Q48_A1511ColNuCAgr ;
   private String[] T01Q48_A1649BarAgrDNu ;
   private String[] T01Q48_A396EmprCod ;
   private int[] T01Q48_A129BarCod ;
   private byte[] T01Q48_A132BarCodReo ;
   private String[] T01Q48_A130BarCodPar ;
   private String[] T01Q48_A1653FindDes ;
   private boolean[] T01Q48_n1653FindDes ;
   private String[] T01Q48_A474FindBarAgr ;
   private boolean[] T01Q48_n474FindBarAgr ;
   private java.math.BigDecimal[] T01Q46_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01Q46_A868BarAgrMtr ;
   private short[] T01Q46_A1650BarAgrNDes ;
   private short[] T01Q46_A1651BarPNDes ;
   private String[] T01Q44_A396EmprCod ;
   private String[] T01Q47_A1653FindDes ;
   private boolean[] T01Q47_n1653FindDes ;
   private String[] T01Q47_A474FindBarAgr ;
   private boolean[] T01Q47_n474FindBarAgr ;
   private String[] T01Q49_A396EmprCod ;
   private java.math.BigDecimal[] T01Q411_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01Q411_A868BarAgrMtr ;
   private short[] T01Q411_A1650BarAgrNDes ;
   private short[] T01Q411_A1651BarPNDes ;
   private String[] T01Q412_A1653FindDes ;
   private boolean[] T01Q412_n1653FindDes ;
   private String[] T01Q412_A474FindBarAgr ;
   private boolean[] T01Q412_n474FindBarAgr ;
   private String[] T01Q413_A396EmprCod ;
   private int[] T01Q413_A129BarCod ;
   private byte[] T01Q413_A132BarCodReo ;
   private String[] T01Q413_A130BarCodPar ;
   private int[] T01Q413_A119BarAgrCod ;
   private byte[] T01Q413_A124BarAgrReo ;
   private String[] T01Q413_A122BarAgrPar ;
   private int[] T01Q43_A119BarAgrCod ;
   private byte[] T01Q43_A124BarAgrReo ;
   private String[] T01Q43_A122BarAgrPar ;
   private java.math.BigDecimal[] T01Q43_A590KgmAgr ;
   private short[] T01Q43_A671PieAgr ;
   private java.math.BigDecimal[] T01Q43_A869MtrAgr ;
   private String[] T01Q43_A1245BarAgrSer ;
   private String[] T01Q43_A1507BarAgrDsc ;
   private int[] T01Q43_A1508CliCodAgr ;
   private int[] T01Q43_A1513DisCodAgr ;
   private String[] T01Q43_A1510ColNomAgr ;
   private int[] T01Q43_A1512ColNumAgr ;
   private String[] T01Q43_A1509ColNoCAgr ;
   private int[] T01Q43_A1511ColNuCAgr ;
   private String[] T01Q43_A1649BarAgrDNu ;
   private String[] T01Q43_A396EmprCod ;
   private int[] T01Q43_A129BarCod ;
   private byte[] T01Q43_A132BarCodReo ;
   private String[] T01Q43_A130BarCodPar ;
   private String[] T01Q414_A396EmprCod ;
   private int[] T01Q414_A129BarCod ;
   private byte[] T01Q414_A132BarCodReo ;
   private String[] T01Q414_A130BarCodPar ;
   private int[] T01Q414_A119BarAgrCod ;
   private byte[] T01Q414_A124BarAgrReo ;
   private String[] T01Q414_A122BarAgrPar ;
   private String[] T01Q415_A396EmprCod ;
   private int[] T01Q415_A129BarCod ;
   private byte[] T01Q415_A132BarCodReo ;
   private String[] T01Q415_A130BarCodPar ;
   private int[] T01Q415_A119BarAgrCod ;
   private byte[] T01Q415_A124BarAgrReo ;
   private String[] T01Q415_A122BarAgrPar ;
   private int[] T01Q42_A119BarAgrCod ;
   private byte[] T01Q42_A124BarAgrReo ;
   private String[] T01Q42_A122BarAgrPar ;
   private java.math.BigDecimal[] T01Q42_A590KgmAgr ;
   private short[] T01Q42_A671PieAgr ;
   private java.math.BigDecimal[] T01Q42_A869MtrAgr ;
   private String[] T01Q42_A1245BarAgrSer ;
   private String[] T01Q42_A1507BarAgrDsc ;
   private int[] T01Q42_A1508CliCodAgr ;
   private int[] T01Q42_A1513DisCodAgr ;
   private String[] T01Q42_A1510ColNomAgr ;
   private int[] T01Q42_A1512ColNumAgr ;
   private String[] T01Q42_A1509ColNoCAgr ;
   private int[] T01Q42_A1511ColNuCAgr ;
   private String[] T01Q42_A1649BarAgrDNu ;
   private String[] T01Q42_A396EmprCod ;
   private int[] T01Q42_A129BarCod ;
   private byte[] T01Q42_A132BarCodReo ;
   private String[] T01Q42_A130BarCodPar ;
   private java.math.BigDecimal[] T01Q420_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01Q420_A868BarAgrMtr ;
   private short[] T01Q420_A1650BarAgrNDes ;
   private short[] T01Q420_A1651BarPNDes ;
   private String[] T01Q421_A1653FindDes ;
   private boolean[] T01Q421_n1653FindDes ;
   private String[] T01Q421_A474FindBarAgr ;
   private boolean[] T01Q421_n474FindBarAgr ;
   private String[] T01Q422_A396EmprCod ;
   private int[] T01Q422_A129BarCod ;
   private byte[] T01Q422_A132BarCodReo ;
   private String[] T01Q422_A130BarCodPar ;
   private int[] T01Q422_A119BarAgrCod ;
   private byte[] T01Q422_A124BarAgrReo ;
   private String[] T01Q422_A122BarAgrPar ;
   private String[] T01Q423_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class baragr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class baragr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class baragr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class baragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01Q42", "SELECT BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?  FOR UPDATE OF KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q43", "SELECT BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q44", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q46", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q47", "SELECT COALESCE( DisDes, ' ') AS FindDes, COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q48", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarAgrCod, TM1.BarAgrReo, TM1.BarAgrPar, TM1.KgmAgr, TM1.PieAgr, TM1.MtrAgr, TM1.BarAgrSer, TM1.BarAgrDsc, TM1.CliCodAgr, TM1.DisCodAgr, TM1.ColNomAgr, TM1.ColNumAgr, TM1.ColNoCAgr, TM1.ColNuCAgr, TM1.BarAgrDNu, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, COALESCE( T2.DisDes, ' ') AS FindDes, COALESCE( T2.BarAgrEst, '') AS FindBarAgr FROM (TXPBARAGR TM1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarAgrCod AND T2.BarCodReo = TM1.BarAgrReo AND T2.BarCodPar = TM1.BarAgrPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarAgrCod = ? and TM1.BarAgrReo = ? and TM1.BarAgrPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarAgrCod, TM1.BarAgrReo, TM1.BarAgrPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q49", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q411", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q412", "SELECT COALESCE( DisDes, ' ') AS FindDes, COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q413", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q414", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrCod > ? or BarAgrCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrReo > ? or BarAgrReo = ? and BarAgrCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q415", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrCod < ? or BarAgrCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrReo < ? or BarAgrReo = ? and BarAgrCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarAgrCod DESC, BarAgrReo DESC, BarAgrPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01Q416", "INSERT INTO TXPBARAGR(BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T01Q417", "UPDATE TXPBARAGR SET KgmAgr=?, PieAgr=?, MtrAgr=?, BarAgrSer=?, BarAgrDsc=?, CliCodAgr=?, DisCodAgr=?, ColNomAgr=?, ColNumAgr=?, ColNoCAgr=?, ColNuCAgr=?, BarAgrDNu=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T01Q418", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new ForEachCursor("T01Q420", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q421", "SELECT COALESCE( DisDes, ' ') AS FindDes, COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q422", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q423", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setString(28, (String)parms[27], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setString(28, (String)parms[27], 1);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 26);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 13);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 13);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 3);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               return;
            case 13 :
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
               stmt.setString(13, (String)parms[12], 3);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

