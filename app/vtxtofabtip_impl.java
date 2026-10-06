package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class vtxtofabtip_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "Seccod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Seccod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Seccod") ;
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
         AV9Seccod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Seccod", AV9Seccod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "O. Fabricacion - Tipos Definidos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVTXOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public vtxtofabtip_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public vtxtofabtip_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( vtxtofabtip_impl.class ));
   }

   public vtxtofabtip_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "O. Fabricacion - Tipos Definidos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_VTXTOFabTip.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_VTXTOFabTip.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtVTXOFabTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtVTXOFabTip_Internalname, httpContext.getMessage( "Tipo O. de Fabricación", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTXOFabTip_Internalname, GXutil.rtrim( A13825VTXOFabTip), GXutil.rtrim( localUtil.format( A13825VTXOFabTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTXOFabTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtVTXOFabTip_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtVTXOFTiDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtVTXOFTiDsc_Internalname, httpContext.getMessage( "Descripción  O. Fabricación", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTXOFTiDsc_Internalname, GXutil.rtrim( A13828VTXOFTiDsc), GXutil.rtrim( localUtil.format( A13828VTXOFTiDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTXOFTiDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtVTXOFTiDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtVTXOFTiOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtVTXOFTiOrd_Internalname, httpContext.getMessage( "Orden en la Producción", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTXOFTiOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A13826VTXOFTiOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVTXOFTiOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTXOFTiOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtVTXOFTiOrd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtVTXOFTiNOS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtVTXOFTiNOS_Internalname, httpContext.getMessage( "Numerador O. Servicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTXOFTiNOS_Internalname, GXutil.ltrim( localUtil.ntoc( A13829VTXOFTiNOS, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVTXOFTiNOS_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTXOFTiNOS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtVTXOFTiNOS_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtVTXOFTiEnA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtVTXOFTiEnA_Internalname, httpContext.getMessage( "Enlace con ACATEX ('S' - ' ' )", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTXOFTiEnA_Internalname, GXutil.rtrim( A13827VTXOFTiEnA), GXutil.rtrim( localUtil.format( A13827VTXOFTiEnA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTXOFTiEnA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtVTXOFTiEnA_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtVTXOFTiAnu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtVTXOFTiAnu_Internalname, httpContext.getMessage( "Marca de anulado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVTXOFTiAnu_Internalname, GXutil.rtrim( A13830VTXOFTiAnu), GXutil.rtrim( localUtil.format( A13830VTXOFTiAnu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVTXOFTiAnu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtVTXOFTiAnu_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_VTXTOFabTip.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_VTXTOFabTip.htm");
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111PI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z13825VTXOFabTip = httpContext.cgiGet( "Z13825VTXOFabTip") ;
            Z13828VTXOFTiDsc = httpContext.cgiGet( "Z13828VTXOFTiDsc") ;
            Z13826VTXOFTiOrd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13826VTXOFTiOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13829VTXOFTiNOS = (int)(localUtil.ctol( httpContext.cgiGet( "Z13829VTXOFTiNOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13827VTXOFTiEnA = httpContext.cgiGet( "Z13827VTXOFTiEnA") ;
            Z13830VTXOFTiAnu = httpContext.cgiGet( "Z13830VTXOFTiAnu") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Seccod = httpContext.cgiGet( "vSECCOD") ;
            AV8MsgModo = httpContext.cgiGet( "vMSGMODO") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10msg1 = httpContext.cgiGet( "vMSG1") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            /* Read variables values. */
            A13825VTXOFabTip = httpContext.cgiGet( edtVTXOFabTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
            A13828VTXOFTiDsc = httpContext.cgiGet( edtVTXOFTiDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13828VTXOFTiDsc", A13828VTXOFTiDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVTXOFTiOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVTXOFTiOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTXOFTIORD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTXOFTiOrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13826VTXOFTiOrd = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13826VTXOFTiOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), 2, 0));
            }
            else
            {
               A13826VTXOFTiOrd = (byte)(localUtil.ctol( httpContext.cgiGet( edtVTXOFTiOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13826VTXOFTiOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVTXOFTiNOS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVTXOFTiNOS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTXOFTINOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTXOFTiNOS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13829VTXOFTiNOS = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13829VTXOFTiNOS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), 8, 0));
            }
            else
            {
               A13829VTXOFTiNOS = (int)(localUtil.ctol( httpContext.cgiGet( edtVTXOFTiNOS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13829VTXOFTiNOS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), 8, 0));
            }
            A13827VTXOFTiEnA = httpContext.cgiGet( edtVTXOFTiEnA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13827VTXOFTiEnA", A13827VTXOFTiEnA);
            A13830VTXOFTiAnu = httpContext.cgiGet( edtVTXOFTiAnu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13830VTXOFTiAnu", A13830VTXOFTiAnu);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"VTXTOFabTip");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A13825VTXOFabTip, Z13825VTXOFabTip) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("vtxtofabtip:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
            if ( isUpd( )  || isDlt( )  )
            {
               A13825VTXOFabTip = httpContext.cgiGet( edtVTXOFabTip_Internalname) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
               forbiddenHiddens2.add("VTXOFabTip", GXutil.rtrim( localUtil.format( A13825VTXOFabTip, "")));
            }
            hsh2 = httpContext.cgiGet( "hsh2") ;
            if ( ( ! ( ( GXutil.strcmp(A13825VTXOFabTip, Z13825VTXOFabTip) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens2.toString(), hsh2, GXKey) )
            {
               GXutil.writeLogError("vtxtofabtip:[ CondSecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens2.toJSonString());
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
               A13825VTXOFabTip = httpContext.GetPar( "VTXOFabTip") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
               getEqualNoModal( ) ;
               if ( isUpd( )  || isDlt( )  )
               {
                  A13825VTXOFabTip = AV9Seccod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
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
                  sMode1873 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( isUpd( )  || isDlt( )  )
                  {
                     A13825VTXOFabTip = AV9Seccod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
                  }
                  Gx_mode = sMode1873 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1873 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PI0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "VTXOFABTIP");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVTXOFabTip_Internalname ;
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
                        e111PI2 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PI1873( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1PI1873( ) ;
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

   public void confirm_1PI0( )
   {
      beforeValidate1PI1873( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PI1873( ) ;
         }
         else
         {
            checkExtendedTable1PI1873( ) ;
            closeExtendedTableCursors1PI1873( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1PI0( )
   {
   }

   public void e111PI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV7TitPanta = httpContext.getMessage( "Gestión de O. de Fabricación", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7TitPanta", AV7TitPanta);
      Gx_msg = httpContext.getMessage( "Orden no puede ser cero", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      AV10msg1 = httpContext.getMessage( "Entre Tipo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10msg1", AV10msg1);
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DSP", "")) == 0 )
      {
         AV8MsgModo = httpContext.getMessage( "Consulta", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
      }
   }

   public void zm1PI1873( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13828VTXOFTiDsc = T01PI3_A13828VTXOFTiDsc[0] ;
            Z13826VTXOFTiOrd = T01PI3_A13826VTXOFTiOrd[0] ;
            Z13829VTXOFTiNOS = T01PI3_A13829VTXOFTiNOS[0] ;
            Z13827VTXOFTiEnA = T01PI3_A13827VTXOFTiEnA[0] ;
            Z13830VTXOFTiAnu = T01PI3_A13830VTXOFTiAnu[0] ;
         }
         else
         {
            Z13828VTXOFTiDsc = A13828VTXOFTiDsc ;
            Z13826VTXOFTiOrd = A13826VTXOFTiOrd ;
            Z13829VTXOFTiNOS = A13829VTXOFTiNOS ;
            Z13827VTXOFTiEnA = A13827VTXOFTiEnA ;
            Z13830VTXOFTiAnu = A13830VTXOFTiAnu ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z13825VTXOFabTip = A13825VTXOFabTip ;
         Z13828VTXOFTiDsc = A13828VTXOFTiDsc ;
         Z13826VTXOFTiOrd = A13826VTXOFTiOrd ;
         Z13829VTXOFTiNOS = A13829VTXOFTiNOS ;
         Z13827VTXOFTiEnA = A13827VTXOFTiEnA ;
         Z13830VTXOFTiAnu = A13830VTXOFTiAnu ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  || isDlt( )  )
      {
         edtVTXOFabTip_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVTXOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFabTip_Enabled), 5, 0), true);
      }
      else
      {
         edtVTXOFabTip_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVTXOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFabTip_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  )
      {
         edtVTXOFabTip_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVTXOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFabTip_Enabled), 5, 0), true);
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
      if ( isUpd( )  || isDlt( )  )
      {
         A13825VTXOFabTip = AV9Seccod ;
         httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
      }
      if ( isIns( )  && (GXutil.strcmp("", A13827VTXOFTiEnA)==0) && ( Gx_BScreen == 0 ) )
      {
         A13827VTXOFTiEnA = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13827VTXOFTiEnA", A13827VTXOFTiEnA);
      }
   }

   public void load1PI1873( )
   {
      /* Using cursor T01PI4 */
      pr_default.execute(2, new Object[] {A13825VTXOFabTip});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1873 = (short)(1) ;
         A13828VTXOFTiDsc = T01PI4_A13828VTXOFTiDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13828VTXOFTiDsc", A13828VTXOFTiDsc);
         A13826VTXOFTiOrd = T01PI4_A13826VTXOFTiOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13826VTXOFTiOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), 2, 0));
         A13829VTXOFTiNOS = T01PI4_A13829VTXOFTiNOS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13829VTXOFTiNOS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), 8, 0));
         A13827VTXOFTiEnA = T01PI4_A13827VTXOFTiEnA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13827VTXOFTiEnA", A13827VTXOFTiEnA);
         A13830VTXOFTiAnu = T01PI4_A13830VTXOFTiAnu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13830VTXOFTiAnu", A13830VTXOFTiAnu);
         zm1PI1873( -8) ;
      }
      pr_default.close(2);
      onLoadActions1PI1873( ) ;
   }

   public void onLoadActions1PI1873( )
   {
      if ( isUpd( )  )
      {
         AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Modificar", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Eliminar", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
         }
         else
         {
            if ( isIns( )  )
            {
               AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Insertar", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
            }
         }
      }
   }

   public void checkExtendedTable1PI1873( )
   {
      nIsDirty_1873 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( isUpd( )  )
      {
         AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Modificar", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Eliminar", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
         }
         else
         {
            if ( isIns( )  )
            {
               AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Insertar", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
            }
         }
      }
      if ( (0==A13826VTXOFTiOrd) )
      {
         httpContext.GX_msglist.addItem(Gx_msg, 1, "VTXOFTIORD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVTXOFTiOrd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A13825VTXOFabTip)==0) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(AV10msg1, 1, "VTXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVTXOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PI1873( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1PI1873( )
   {
      /* Using cursor T01PI5 */
      pr_default.execute(3, new Object[] {A13825VTXOFabTip});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1873 = (short)(1) ;
      }
      else
      {
         RcdFound1873 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PI3 */
      pr_default.execute(1, new Object[] {A13825VTXOFabTip});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PI1873( 8) ;
         RcdFound1873 = (short)(1) ;
         A13825VTXOFabTip = T01PI3_A13825VTXOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
         A13828VTXOFTiDsc = T01PI3_A13828VTXOFTiDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13828VTXOFTiDsc", A13828VTXOFTiDsc);
         A13826VTXOFTiOrd = T01PI3_A13826VTXOFTiOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13826VTXOFTiOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), 2, 0));
         A13829VTXOFTiNOS = T01PI3_A13829VTXOFTiNOS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13829VTXOFTiNOS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), 8, 0));
         A13827VTXOFTiEnA = T01PI3_A13827VTXOFTiEnA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13827VTXOFTiEnA", A13827VTXOFTiEnA);
         A13830VTXOFTiAnu = T01PI3_A13830VTXOFTiAnu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13830VTXOFTiAnu", A13830VTXOFTiAnu);
         Z13825VTXOFabTip = A13825VTXOFabTip ;
         sMode1873 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PI1873( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1873 = (short)(0) ;
            initializeNonKey1PI1873( ) ;
         }
         Gx_mode = sMode1873 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1873 = (short)(0) ;
         initializeNonKey1PI1873( ) ;
         sMode1873 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1873 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1PI1873( ) ;
      if ( RcdFound1873 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1873 = (short)(0) ;
      /* Using cursor T01PI6 */
      pr_default.execute(4, new Object[] {A13825VTXOFabTip});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01PI6_A13825VTXOFabTip[0], A13825VTXOFabTip) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01PI6_A13825VTXOFabTip[0], A13825VTXOFabTip) > 0 ) ) )
         {
            A13825VTXOFabTip = T01PI6_A13825VTXOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
            RcdFound1873 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1873 = (short)(0) ;
      /* Using cursor T01PI7 */
      pr_default.execute(5, new Object[] {A13825VTXOFabTip});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01PI7_A13825VTXOFabTip[0], A13825VTXOFabTip) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01PI7_A13825VTXOFabTip[0], A13825VTXOFabTip) < 0 ) ) )
         {
            A13825VTXOFabTip = T01PI7_A13825VTXOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
            RcdFound1873 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PI1873( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVTXOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PI1873( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1873 == 1 )
         {
            if ( GXutil.strcmp(A13825VTXOFabTip, Z13825VTXOFabTip) != 0 )
            {
               A13825VTXOFabTip = Z13825VTXOFabTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VTXOFABTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVTXOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVTXOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1PI1873( ) ;
               GX_FocusControl = edtVTXOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A13825VTXOFabTip, Z13825VTXOFabTip) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtVTXOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PI1873( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VTXOFABTIP");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVTXOFabTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtVTXOFabTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PI1873( ) ;
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
      if ( GXutil.strcmp(A13825VTXOFabTip, Z13825VTXOFabTip) != 0 )
      {
         A13825VTXOFabTip = Z13825VTXOFabTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VTXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVTXOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVTXOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PI1873( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PI2 */
         pr_default.execute(0, new Object[] {A13825VTXOFabTip});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOFABTIP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13828VTXOFTiDsc, T01PI2_A13828VTXOFTiDsc[0]) != 0 ) || ( Z13826VTXOFTiOrd != T01PI2_A13826VTXOFTiOrd[0] ) || ( Z13829VTXOFTiNOS != T01PI2_A13829VTXOFTiNOS[0] ) || ( GXutil.strcmp(Z13827VTXOFTiEnA, T01PI2_A13827VTXOFTiEnA[0]) != 0 ) || ( GXutil.strcmp(Z13830VTXOFTiAnu, T01PI2_A13830VTXOFTiAnu[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13828VTXOFTiDsc, T01PI2_A13828VTXOFTiDsc[0]) != 0 )
            {
               GXutil.writeLogln("vtxtofabtip:[seudo value changed for attri]"+"VTXOFTiDsc");
               GXutil.writeLogRaw("Old: ",Z13828VTXOFTiDsc);
               GXutil.writeLogRaw("Current: ",T01PI2_A13828VTXOFTiDsc[0]);
            }
            if ( Z13826VTXOFTiOrd != T01PI2_A13826VTXOFTiOrd[0] )
            {
               GXutil.writeLogln("vtxtofabtip:[seudo value changed for attri]"+"VTXOFTiOrd");
               GXutil.writeLogRaw("Old: ",Z13826VTXOFTiOrd);
               GXutil.writeLogRaw("Current: ",T01PI2_A13826VTXOFTiOrd[0]);
            }
            if ( Z13829VTXOFTiNOS != T01PI2_A13829VTXOFTiNOS[0] )
            {
               GXutil.writeLogln("vtxtofabtip:[seudo value changed for attri]"+"VTXOFTiNOS");
               GXutil.writeLogRaw("Old: ",Z13829VTXOFTiNOS);
               GXutil.writeLogRaw("Current: ",T01PI2_A13829VTXOFTiNOS[0]);
            }
            if ( GXutil.strcmp(Z13827VTXOFTiEnA, T01PI2_A13827VTXOFTiEnA[0]) != 0 )
            {
               GXutil.writeLogln("vtxtofabtip:[seudo value changed for attri]"+"VTXOFTiEnA");
               GXutil.writeLogRaw("Old: ",Z13827VTXOFTiEnA);
               GXutil.writeLogRaw("Current: ",T01PI2_A13827VTXOFTiEnA[0]);
            }
            if ( GXutil.strcmp(Z13830VTXOFTiAnu, T01PI2_A13830VTXOFTiAnu[0]) != 0 )
            {
               GXutil.writeLogln("vtxtofabtip:[seudo value changed for attri]"+"VTXOFTiAnu");
               GXutil.writeLogRaw("Old: ",Z13830VTXOFTiAnu);
               GXutil.writeLogRaw("Current: ",T01PI2_A13830VTXOFTiAnu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXOFABTIP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PI1873( )
   {
      beforeValidate1PI1873( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PI1873( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PI1873( 0) ;
         checkOptimisticConcurrency1PI1873( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PI1873( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PI1873( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PI8 */
                  pr_default.execute(6, new Object[] {A13825VTXOFabTip, A13828VTXOFTiDsc, Byte.valueOf(A13826VTXOFTiOrd), Integer.valueOf(A13829VTXOFTiNOS), A13827VTXOFTiEnA, A13830VTXOFTiAnu});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOFabTip");
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
                        resetCaption1PI0( ) ;
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
            load1PI1873( ) ;
         }
         endLevel1PI1873( ) ;
      }
      closeExtendedTableCursors1PI1873( ) ;
   }

   public void update1PI1873( )
   {
      beforeValidate1PI1873( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PI1873( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PI1873( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PI1873( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PI1873( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PI9 */
                  pr_default.execute(7, new Object[] {A13828VTXOFTiDsc, Byte.valueOf(A13826VTXOFTiOrd), Integer.valueOf(A13829VTXOFTiNOS), A13827VTXOFTiEnA, A13830VTXOFTiAnu, A13825VTXOFabTip});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOFabTip");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOFABTIP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PI1873( ) ;
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
         endLevel1PI1873( ) ;
      }
      closeExtendedTableCursors1PI1873( ) ;
   }

   public void deferredUpdate1PI1873( )
   {
   }

   public void delete( )
   {
      beforeValidate1PI1873( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PI1873( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PI1873( ) ;
         afterConfirm1PI1873( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PI1873( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PI10 */
               pr_default.execute(8, new Object[] {A13825VTXOFabTip});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOFabTip");
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
      sMode1873 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PI1873( ) ;
      Gx_mode = sMode1873 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PI1873( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (GXutil.strcmp("", A13825VTXOFabTip)==0) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(AV10msg1, 1, "VTXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVTXOFabTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isUpd( )  )
         {
            AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Modificar", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Eliminar", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
            }
            else
            {
               if ( isIns( )  )
               {
                  AV8MsgModo = httpContext.getMessage( httpContext.getMessage( "Insertar", ""), "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8MsgModo", AV8MsgModo);
               }
            }
         }
      }
   }

   public void endLevel1PI1873( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PI1873( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "vtxtofabtip");
         if ( AnyError == 0 )
         {
            confirmValues1PI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "vtxtofabtip");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PI1873( )
   {
      /* Scan By routine */
      /* Using cursor T01PI11 */
      pr_default.execute(9);
      RcdFound1873 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1873 = (short)(1) ;
         A13825VTXOFabTip = T01PI11_A13825VTXOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PI1873( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1873 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1873 = (short)(1) ;
         A13825VTXOFabTip = T01PI11_A13825VTXOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
      }
   }

   public void scanEnd1PI1873( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1PI1873( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PI1873( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PI1873( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PI1873( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PI1873( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PI1873( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PI1873( )
   {
      edtVTXOFabTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTXOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFabTip_Enabled), 5, 0), true);
      edtVTXOFTiDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTXOFTiDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFTiDsc_Enabled), 5, 0), true);
      edtVTXOFTiOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTXOFTiOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFTiOrd_Enabled), 5, 0), true);
      edtVTXOFTiNOS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTXOFTiNOS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFTiNOS_Enabled), 5, 0), true);
      edtVTXOFTiEnA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTXOFTiEnA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFTiEnA_Enabled), 5, 0), true);
      edtVTXOFTiAnu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVTXOFTiAnu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVTXOFTiAnu_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PI1873( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PI0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.vtxtofabtip", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9Seccod)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Seccod","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"VTXTOFabTip");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("vtxtofabtip:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
      if ( isUpd( )  || isDlt( )  )
      {
         forbiddenHiddens2.add("VTXOFabTip", GXutil.rtrim( localUtil.format( A13825VTXOFabTip, "")));
      }
      app.GxWebStd.gx_hidden_field( httpContext, "hsh2", httpContext.getEncryptedSignature( forbiddenHiddens2.toString(), GXKey));
      GXutil.writeLogInfo("vtxtofabtip:[ SendCondSecurityCheck value for]"+forbiddenHiddens2.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z13825VTXOFabTip", GXutil.rtrim( Z13825VTXOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13828VTXOFTiDsc", GXutil.rtrim( Z13828VTXOFTiDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13826VTXOFTiOrd", GXutil.ltrim( localUtil.ntoc( Z13826VTXOFTiOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13829VTXOFTiNOS", GXutil.ltrim( localUtil.ntoc( Z13829VTXOFTiNOS, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13827VTXOFTiEnA", GXutil.rtrim( Z13827VTXOFTiEnA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13830VTXOFTiAnu", GXutil.rtrim( Z13830VTXOFTiAnu));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vSECCOD", GXutil.rtrim( AV9Seccod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGMODO", GXutil.rtrim( AV8MsgModo));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV10msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
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
      return formatLink("app.vtxtofabtip", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9Seccod)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Seccod","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "VTXTOFabTip" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "O. Fabricacion - Tipos Definidos", "") ;
   }

   public void initializeNonKey1PI1873( )
   {
      A13828VTXOFTiDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13828VTXOFTiDsc", A13828VTXOFTiDsc);
      A13826VTXOFTiOrd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13826VTXOFTiOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13826VTXOFTiOrd), 2, 0));
      A13829VTXOFTiNOS = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13829VTXOFTiNOS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13829VTXOFTiNOS), 8, 0));
      A13830VTXOFTiAnu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13830VTXOFTiAnu", A13830VTXOFTiAnu);
      A13827VTXOFTiEnA = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13827VTXOFTiEnA", A13827VTXOFTiEnA);
      Z13828VTXOFTiDsc = "" ;
      Z13826VTXOFTiOrd = (byte)(0) ;
      Z13829VTXOFTiNOS = 0 ;
      Z13827VTXOFTiEnA = "" ;
      Z13830VTXOFTiAnu = "" ;
   }

   public void initAll1PI1873( )
   {
      A13825VTXOFabTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13825VTXOFabTip", A13825VTXOFabTip);
      initializeNonKey1PI1873( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13827VTXOFTiEnA = i13827VTXOFTiEnA ;
      httpContext.ajax_rsp_assign_attri("", false, "A13827VTXOFTiEnA", A13827VTXOFTiEnA);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251975399", true, true);
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
      httpContext.AddJavascriptSource("vtxtofabtip.js", "?20261251975399", false, true);
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
      edtVTXOFabTip_Internalname = "VTXOFABTIP" ;
      edtVTXOFTiDsc_Internalname = "VTXOFTIDSC" ;
      edtVTXOFTiOrd_Internalname = "VTXOFTIORD" ;
      edtVTXOFTiNOS_Internalname = "VTXOFTINOS" ;
      edtVTXOFTiEnA_Internalname = "VTXOFTIENA" ;
      edtVTXOFTiAnu_Internalname = "VTXOFTIANU" ;
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
      Form.setCaption( httpContext.getMessage( "O. Fabricacion - Tipos Definidos", "") );
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVTXOFTiAnu_Jsonclick = "" ;
      edtVTXOFTiAnu_Enabled = 1 ;
      edtVTXOFTiEnA_Jsonclick = "" ;
      edtVTXOFTiEnA_Enabled = 1 ;
      edtVTXOFTiNOS_Jsonclick = "" ;
      edtVTXOFTiNOS_Enabled = 1 ;
      edtVTXOFTiOrd_Jsonclick = "" ;
      edtVTXOFTiOrd_Enabled = 1 ;
      edtVTXOFTiDsc_Jsonclick = "" ;
      edtVTXOFTiDsc_Enabled = 1 ;
      edtVTXOFabTip_Jsonclick = "" ;
      edtVTXOFabTip_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'AV9Seccod',fld:'vSECCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_VTXOFABTIP","{handler:'valid_Vtxofabtip',iparms:[]");
      setEventMetadata("VALID_VTXOFABTIP",",oparms:[]}");
      setEventMetadata("VALID_VTXOFTIORD","{handler:'valid_Vtxoftiord',iparms:[]");
      setEventMetadata("VALID_VTXOFTIORD",",oparms:[]}");
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
      wcpOAV9Seccod = "" ;
      wcpOGx_mode = "" ;
      Z13825VTXOFabTip = "" ;
      Z13828VTXOFTiDsc = "" ;
      Z13827VTXOFTiEnA = "" ;
      Z13830VTXOFTiAnu = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV9Seccod = "" ;
      Gx_mode = "" ;
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
      A13825VTXOFabTip = "" ;
      A13828VTXOFTiDsc = "" ;
      A13827VTXOFTiEnA = "" ;
      A13830VTXOFTiAnu = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      AV8MsgModo = "" ;
      AV10msg1 = "" ;
      Gx_msg = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      forbiddenHiddens2 = new com.genexus.util.GXProperties();
      hsh2 = "" ;
      sMode1873 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7TitPanta = "" ;
      T01PI4_A13825VTXOFabTip = new String[] {""} ;
      T01PI4_A13828VTXOFTiDsc = new String[] {""} ;
      T01PI4_A13826VTXOFTiOrd = new byte[1] ;
      T01PI4_A13829VTXOFTiNOS = new int[1] ;
      T01PI4_A13827VTXOFTiEnA = new String[] {""} ;
      T01PI4_A13830VTXOFTiAnu = new String[] {""} ;
      T01PI5_A13825VTXOFabTip = new String[] {""} ;
      T01PI3_A13825VTXOFabTip = new String[] {""} ;
      T01PI3_A13828VTXOFTiDsc = new String[] {""} ;
      T01PI3_A13826VTXOFTiOrd = new byte[1] ;
      T01PI3_A13829VTXOFTiNOS = new int[1] ;
      T01PI3_A13827VTXOFTiEnA = new String[] {""} ;
      T01PI3_A13830VTXOFTiAnu = new String[] {""} ;
      T01PI6_A13825VTXOFabTip = new String[] {""} ;
      T01PI7_A13825VTXOFabTip = new String[] {""} ;
      T01PI2_A13825VTXOFabTip = new String[] {""} ;
      T01PI2_A13828VTXOFTiDsc = new String[] {""} ;
      T01PI2_A13826VTXOFTiOrd = new byte[1] ;
      T01PI2_A13829VTXOFTiNOS = new int[1] ;
      T01PI2_A13827VTXOFTiEnA = new String[] {""} ;
      T01PI2_A13830VTXOFTiAnu = new String[] {""} ;
      T01PI11_A13825VTXOFabTip = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13827VTXOFTiEnA = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.vtxtofabtip__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.vtxtofabtip__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.vtxtofabtip__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.vtxtofabtip__default(),
         new Object[] {
             new Object[] {
            T01PI2_A13825VTXOFabTip, T01PI2_A13828VTXOFTiDsc, T01PI2_A13826VTXOFTiOrd, T01PI2_A13829VTXOFTiNOS, T01PI2_A13827VTXOFTiEnA, T01PI2_A13830VTXOFTiAnu
            }
            , new Object[] {
            T01PI3_A13825VTXOFabTip, T01PI3_A13828VTXOFTiDsc, T01PI3_A13826VTXOFTiOrd, T01PI3_A13829VTXOFTiNOS, T01PI3_A13827VTXOFTiEnA, T01PI3_A13830VTXOFTiAnu
            }
            , new Object[] {
            T01PI4_A13825VTXOFabTip, T01PI4_A13828VTXOFTiDsc, T01PI4_A13826VTXOFTiOrd, T01PI4_A13829VTXOFTiNOS, T01PI4_A13827VTXOFTiEnA, T01PI4_A13830VTXOFTiAnu
            }
            , new Object[] {
            T01PI5_A13825VTXOFabTip
            }
            , new Object[] {
            T01PI6_A13825VTXOFabTip
            }
            , new Object[] {
            T01PI7_A13825VTXOFabTip
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PI11_A13825VTXOFabTip
            }
         }
      );
      Z13827VTXOFTiEnA = httpContext.getMessage( "S", "") ;
      A13827VTXOFTiEnA = httpContext.getMessage( "S", "") ;
      i13827VTXOFTiEnA = httpContext.getMessage( "S", "") ;
   }

   private byte Z13826VTXOFTiOrd ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13826VTXOFTiOrd ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1873 ;
   private short nIsDirty_1873 ;
   private int Z13829VTXOFTiNOS ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVTXOFabTip_Enabled ;
   private int edtVTXOFTiDsc_Enabled ;
   private int edtVTXOFTiOrd_Enabled ;
   private int A13829VTXOFTiNOS ;
   private int edtVTXOFTiNOS_Enabled ;
   private int edtVTXOFTiEnA_Enabled ;
   private int edtVTXOFTiAnu_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOAV9Seccod ;
   private String wcpOGx_mode ;
   private String Z13825VTXOFabTip ;
   private String Z13828VTXOFTiDsc ;
   private String Z13827VTXOFTiEnA ;
   private String Z13830VTXOFTiAnu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV9Seccod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVTXOFabTip_Internalname ;
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
   private String A13825VTXOFabTip ;
   private String edtVTXOFabTip_Jsonclick ;
   private String edtVTXOFTiDsc_Internalname ;
   private String A13828VTXOFTiDsc ;
   private String edtVTXOFTiDsc_Jsonclick ;
   private String edtVTXOFTiOrd_Internalname ;
   private String edtVTXOFTiOrd_Jsonclick ;
   private String edtVTXOFTiNOS_Internalname ;
   private String edtVTXOFTiNOS_Jsonclick ;
   private String edtVTXOFTiEnA_Internalname ;
   private String A13827VTXOFTiEnA ;
   private String edtVTXOFTiEnA_Jsonclick ;
   private String edtVTXOFTiAnu_Internalname ;
   private String A13830VTXOFTiAnu ;
   private String edtVTXOFTiAnu_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String AV8MsgModo ;
   private String AV10msg1 ;
   private String Gx_msg ;
   private String hsh ;
   private String hsh2 ;
   private String sMode1873 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7TitPanta ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13827VTXOFTiEnA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.util.GXProperties forbiddenHiddens2 ;
   private IDataStoreProvider pr_default ;
   private String[] T01PI4_A13825VTXOFabTip ;
   private String[] T01PI4_A13828VTXOFTiDsc ;
   private byte[] T01PI4_A13826VTXOFTiOrd ;
   private int[] T01PI4_A13829VTXOFTiNOS ;
   private String[] T01PI4_A13827VTXOFTiEnA ;
   private String[] T01PI4_A13830VTXOFTiAnu ;
   private String[] T01PI5_A13825VTXOFabTip ;
   private String[] T01PI3_A13825VTXOFabTip ;
   private String[] T01PI3_A13828VTXOFTiDsc ;
   private byte[] T01PI3_A13826VTXOFTiOrd ;
   private int[] T01PI3_A13829VTXOFTiNOS ;
   private String[] T01PI3_A13827VTXOFTiEnA ;
   private String[] T01PI3_A13830VTXOFTiAnu ;
   private String[] T01PI6_A13825VTXOFabTip ;
   private String[] T01PI7_A13825VTXOFabTip ;
   private String[] T01PI2_A13825VTXOFabTip ;
   private String[] T01PI2_A13828VTXOFTiDsc ;
   private byte[] T01PI2_A13826VTXOFTiOrd ;
   private int[] T01PI2_A13829VTXOFTiNOS ;
   private String[] T01PI2_A13827VTXOFTiEnA ;
   private String[] T01PI2_A13830VTXOFTiAnu ;
   private String[] T01PI11_A13825VTXOFabTip ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class vtxtofabtip__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class vtxtofabtip__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class vtxtofabtip__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class vtxtofabtip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PI2", "SELECT OFabTip, OFabTipDsc, OFabTipOrd, OFabTipNOS, OFabTipEnA, OFabTipAnu FROM VTXOFabTip WHERE OFabTip = ?  FOR UPDATE OF OFabTipDsc, OFabTipOrd, OFabTipNOS, OFabTipEnA, OFabTipAnu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PI3", "SELECT OFabTip, OFabTipDsc, OFabTipOrd, OFabTipNOS, OFabTipEnA, OFabTipAnu FROM VTXOFabTip WHERE OFabTip = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PI4", "SELECT /*+ FIRST_ROWS(100) */ TM1.OFabTip, TM1.OFabTipDsc, TM1.OFabTipOrd, TM1.OFabTipNOS, TM1.OFabTipEnA, TM1.OFabTipAnu FROM VTXOFabTip TM1 WHERE TM1.OFabTip = ? ORDER BY TM1.OFabTip ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PI5", "SELECT /*+ FIRST_ROWS(1) */ OFabTip FROM VTXOFabTip WHERE OFabTip = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PI6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip FROM VTXOFabTip WHERE ( OFabTip > ?) ORDER BY OFabTip) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PI7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip FROM VTXOFabTip WHERE ( OFabTip < ?) ORDER BY OFabTip DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PI8", "INSERT INTO VTXOFabTip(OFabTip, OFabTipDsc, OFabTipOrd, OFabTipNOS, OFabTipEnA, OFabTipAnu) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXOFABTIP")
         ,new UpdateCursor("T01PI9", "UPDATE VTXOFabTip SET OFabTipDsc=?, OFabTipOrd=?, OFabTipNOS=?, OFabTipEnA=?, OFabTipAnu=?  WHERE OFabTip = ?", GX_NOMASK, "VTXOFABTIP")
         ,new UpdateCursor("T01PI10", "DELETE FROM VTXOFabTip  WHERE OFabTip = ?", GX_NOMASK, "VTXOFABTIP")
         ,new ForEachCursor("T01PI11", "SELECT /*+ FIRST_ROWS(100) */ OFabTip FROM VTXOFabTip ORDER BY OFabTip ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
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
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               return;
      }
   }

}

