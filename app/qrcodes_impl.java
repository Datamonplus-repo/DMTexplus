package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class qrcodes_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "QRCodes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtQrcID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public qrcodes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public qrcodes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( qrcodes_impl.class ));
   }

   public qrcodes_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "QRCodes", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_QRCodes.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_QRCodes.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtQrcID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtQrcID_Internalname, httpContext.getMessage( "ID", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtQrcID_Internalname, GXutil.ltrim( localUtil.ntoc( A13688QrcID, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtQrcID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13688QrcID), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13688QrcID), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtQrcID_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtQrcID_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtQrcNombre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtQrcNombre_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtQrcNombre_Internalname, A13689QrcNombre, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", (short)(0), 1, edtQrcNombre_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtQrcURL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtQrcURL_Internalname, httpContext.getMessage( "URL", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtQrcURL_Internalname, A13690QrcURL, GXutil.rtrim( localUtil.format( A13690QrcURL, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", A13690QrcURL, "_blank", "", "", edtQrcURL_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtQrcURL_Enabled, 0, "url", "", 80, "chr", 1, "row", 1000, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "GeneXus\\Url", "left", true, "", "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgQrcImagen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, "", httpContext.getMessage( "Imagen", ""), "col-sm-3 ImageAttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Static Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ImageAttribute" ;
      StyleString = "" ;
      A13691QrcImagen_IsBlob = (boolean)(((GXutil.strcmp("", A13691QrcImagen)==0)&&(GXutil.strcmp("", A40000QrcImagen_)==0))||!(GXutil.strcmp("", A13691QrcImagen)==0)) ;
      sImgUrl = ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.getResourceRelative(A13691QrcImagen)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgQrcImagen_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, imgQrcImagen_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "", "", "", 0, A13691QrcImagen_IsBlob, true, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_QRCodes.htm");
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "URL", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.getResourceRelative(A13691QrcImagen)), true);
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "IsBlob", GXutil.booltostr( A13691QrcImagen_IsBlob), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtQrcTexto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtQrcTexto_Internalname, httpContext.getMessage( "Texto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtQrcTexto_Internalname, A13692QrcTexto, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", (short)(0), 1, edtQrcTexto_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2048", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_QRCodes.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_QRCodes.htm");
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
         Z13688QrcID = localUtil.ctol( httpContext.cgiGet( "Z13688QrcID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z13689QrcNombre = httpContext.cgiGet( "Z13689QrcNombre") ;
         Z13690QrcURL = httpContext.cgiGet( "Z13690QrcURL") ;
         Z13692QrcTexto = httpContext.cgiGet( "Z13692QrcTexto") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A40000QrcImagen_ = httpContext.cgiGet( "QRCIMAGEN_") ;
         n40000QrcImagen_ = ((GXutil.strcmp("", A40000QrcImagen_)==0)&&(GXutil.strcmp("", A13691QrcImagen)==0) ? true : false) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtQrcID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtQrcID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "QRCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtQrcID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13688QrcID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
         }
         else
         {
            A13688QrcID = localUtil.ctol( httpContext.cgiGet( edtQrcID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
         }
         A13689QrcNombre = httpContext.cgiGet( edtQrcNombre_Internalname) ;
         n13689QrcNombre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13689QrcNombre", A13689QrcNombre);
         A13690QrcURL = httpContext.cgiGet( edtQrcURL_Internalname) ;
         n13690QrcURL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13690QrcURL", A13690QrcURL);
         A13691QrcImagen = httpContext.cgiGet( imgQrcImagen_Internalname) ;
         n13691QrcImagen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13691QrcImagen", A13691QrcImagen);
         A13692QrcTexto = httpContext.cgiGet( edtQrcTexto_Internalname) ;
         n13692QrcTexto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13692QrcTexto", A13692QrcTexto);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXv_char1[0] = A13691QrcImagen ;
         GXv_char2[0] = A40000QrcImagen_ ;
         httpContext.getMultimediaValue(imgQrcImagen_Internalname, GXv_char1, GXv_char2);
         qrcodes_impl.this.A13691QrcImagen = GXv_char1[0] ;
         qrcodes_impl.this.A40000QrcImagen_ = GXv_char2[0] ;
         n40000QrcImagen_ = ((GXutil.strcmp("", A40000QrcImagen_)==0)&&(GXutil.strcmp("", A13691QrcImagen)==0) ? true : false) ;
         n40000QrcImagen_ = ((GXutil.strcmp("", A40000QrcImagen_)==0)&&(GXutil.strcmp("", A13691QrcImagen)==0) ? true : false) ;
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
            A13688QrcID = GXutil.lval( httpContext.GetPar( "QrcID")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
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
            initAll1OX1869( ) ;
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
      disableAttributes1OX1869( ) ;
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

   public void resetCaption1OX0( )
   {
   }

   public void zm1OX1869( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13689QrcNombre = T01OX3_A13689QrcNombre[0] ;
            Z13690QrcURL = T01OX3_A13690QrcURL[0] ;
            Z13692QrcTexto = T01OX3_A13692QrcTexto[0] ;
         }
         else
         {
            Z13689QrcNombre = A13689QrcNombre ;
            Z13690QrcURL = A13690QrcURL ;
            Z13692QrcTexto = A13692QrcTexto ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z13688QrcID = A13688QrcID ;
         Z13689QrcNombre = A13689QrcNombre ;
         Z13690QrcURL = A13690QrcURL ;
         Z13691QrcImagen = A13691QrcImagen ;
         Z40000QrcImagen_ = A40000QrcImagen_ ;
         Z13692QrcTexto = A13692QrcTexto ;
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

   public void load1OX1869( )
   {
      /* Using cursor T01OX4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1869 = (short)(1) ;
         A13689QrcNombre = T01OX4_A13689QrcNombre[0] ;
         n13689QrcNombre = T01OX4_n13689QrcNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13689QrcNombre", A13689QrcNombre);
         A13690QrcURL = T01OX4_A13690QrcURL[0] ;
         n13690QrcURL = T01OX4_n13690QrcURL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13690QrcURL", A13690QrcURL);
         A13691QrcImagen = T01OX4_A13691QrcImagen[0] ;
         n13691QrcImagen = T01OX4_n13691QrcImagen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13691QrcImagen", A13691QrcImagen);
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.convertURL( httpContext.getResourceRelative(A13691QrcImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A13691QrcImagen), true);
         A40000QrcImagen_ = T01OX4_A40000QrcImagen_[0] ;
         n40000QrcImagen_ = T01OX4_n40000QrcImagen_[0] ;
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.convertURL( httpContext.getResourceRelative(A13691QrcImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A13691QrcImagen), true);
         A13692QrcTexto = T01OX4_A13692QrcTexto[0] ;
         n13692QrcTexto = T01OX4_n13692QrcTexto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13692QrcTexto", A13692QrcTexto);
         zm1OX1869( -2) ;
      }
      pr_default.close(2);
      onLoadActions1OX1869( ) ;
   }

   public void onLoadActions1OX1869( )
   {
   }

   public void checkExtendedTable1OX1869( )
   {
      nIsDirty_1869 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01OX5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n13689QrcNombre), A13689QrcNombre, Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Qrc Nombre", "")}), 1, "QRCNOMBRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtQrcNombre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( ! ( GxRegex.IsMatch(A13690QrcURL,"^((?:[a-zA-Z]+:(//)?)?((?:(?:[a-zA-Z]([a-zA-Z0-9$\\-_@&+!*\"'(),]|%[0-9a-fA-F]{2})*)(?:\\.(?:([a-zA-Z0-9$\\-_@&+!*\"'(),]|%[0-9a-fA-F]{2})*))*)|(?:(\\d{1,3}\\.){3}\\d{1,3}))(?::\\d+)?(?:/([a-zA-Z0-9$\\-_@.&+!*\"'(),=;: ]|%[0-9a-fA-F]{2})+)*/?(?:[#?](?:[a-zA-Z0-9$\\-_@.&+!*\"'(),=;: /]|%[0-9a-fA-F]{2})*)?)?\\s*$") || (GXutil.strcmp("", A13690QrcURL)==0) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXM_DoesNotMatchRegExp", ""), httpContext.getMessage( "Qrc URL", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "QRCURL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtQrcURL_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1OX1869( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1OX1869( )
   {
      /* Using cursor T01OX6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1869 = (short)(1) ;
      }
      else
      {
         RcdFound1869 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OX3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1OX1869( 2) ;
         RcdFound1869 = (short)(1) ;
         A13688QrcID = T01OX3_A13688QrcID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
         A13689QrcNombre = T01OX3_A13689QrcNombre[0] ;
         n13689QrcNombre = T01OX3_n13689QrcNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13689QrcNombre", A13689QrcNombre);
         A13690QrcURL = T01OX3_A13690QrcURL[0] ;
         n13690QrcURL = T01OX3_n13690QrcURL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13690QrcURL", A13690QrcURL);
         A13691QrcImagen = T01OX3_A13691QrcImagen[0] ;
         n13691QrcImagen = T01OX3_n13691QrcImagen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13691QrcImagen", A13691QrcImagen);
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.convertURL( httpContext.getResourceRelative(A13691QrcImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A13691QrcImagen), true);
         A40000QrcImagen_ = T01OX3_A40000QrcImagen_[0] ;
         n40000QrcImagen_ = T01OX3_n40000QrcImagen_[0] ;
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.convertURL( httpContext.getResourceRelative(A13691QrcImagen))), true);
         httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A13691QrcImagen), true);
         A13692QrcTexto = T01OX3_A13692QrcTexto[0] ;
         n13692QrcTexto = T01OX3_n13692QrcTexto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13692QrcTexto", A13692QrcTexto);
         Z13688QrcID = A13688QrcID ;
         sMode1869 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OX1869( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1869 = (short)(0) ;
            initializeNonKey1OX1869( ) ;
         }
         Gx_mode = sMode1869 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1869 = (short)(0) ;
         initializeNonKey1OX1869( ) ;
         sMode1869 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1869 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1OX1869( ) ;
      if ( RcdFound1869 == 0 )
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
      RcdFound1869 = (short)(0) ;
      /* Using cursor T01OX7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01OX7_A13688QrcID[0] < A13688QrcID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01OX7_A13688QrcID[0] > A13688QrcID ) ) )
         {
            A13688QrcID = T01OX7_A13688QrcID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
            RcdFound1869 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1869 = (short)(0) ;
      /* Using cursor T01OX8 */
      pr_default.execute(6, new Object[] {Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01OX8_A13688QrcID[0] > A13688QrcID ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01OX8_A13688QrcID[0] < A13688QrcID ) ) )
         {
            A13688QrcID = T01OX8_A13688QrcID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
            RcdFound1869 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OX1869( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtQrcID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OX1869( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1869 == 1 )
         {
            if ( A13688QrcID != Z13688QrcID )
            {
               A13688QrcID = Z13688QrcID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "QRCID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtQrcID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtQrcID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1OX1869( ) ;
               GX_FocusControl = edtQrcID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A13688QrcID != Z13688QrcID )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtQrcID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OX1869( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "QRCID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtQrcID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtQrcID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OX1869( ) ;
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
      if ( A13688QrcID != Z13688QrcID )
      {
         A13688QrcID = Z13688QrcID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "QRCID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtQrcID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtQrcID_Internalname ;
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
      if ( RcdFound1869 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "QRCID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtQrcID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtQrcNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OX1869( ) ;
      if ( RcdFound1869 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtQrcNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OX1869( ) ;
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
      if ( RcdFound1869 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtQrcNombre_Internalname ;
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
      if ( RcdFound1869 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtQrcNombre_Internalname ;
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
      scanStart1OX1869( ) ;
      if ( RcdFound1869 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1869 != 0 )
         {
            scanNext1OX1869( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtQrcNombre_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OX1869( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OX1869( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OX2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A13688QrcID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"QRCodes"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13689QrcNombre, T01OX2_A13689QrcNombre[0]) != 0 ) || ( GXutil.strcmp(Z13690QrcURL, T01OX2_A13690QrcURL[0]) != 0 ) || ( GXutil.strcmp(Z13692QrcTexto, T01OX2_A13692QrcTexto[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13689QrcNombre, T01OX2_A13689QrcNombre[0]) != 0 )
            {
               GXutil.writeLogln("qrcodes:[seudo value changed for attri]"+"QrcNombre");
               GXutil.writeLogRaw("Old: ",Z13689QrcNombre);
               GXutil.writeLogRaw("Current: ",T01OX2_A13689QrcNombre[0]);
            }
            if ( GXutil.strcmp(Z13690QrcURL, T01OX2_A13690QrcURL[0]) != 0 )
            {
               GXutil.writeLogln("qrcodes:[seudo value changed for attri]"+"QrcURL");
               GXutil.writeLogRaw("Old: ",Z13690QrcURL);
               GXutil.writeLogRaw("Current: ",T01OX2_A13690QrcURL[0]);
            }
            if ( GXutil.strcmp(Z13692QrcTexto, T01OX2_A13692QrcTexto[0]) != 0 )
            {
               GXutil.writeLogln("qrcodes:[seudo value changed for attri]"+"QrcTexto");
               GXutil.writeLogRaw("Old: ",Z13692QrcTexto);
               GXutil.writeLogRaw("Current: ",T01OX2_A13692QrcTexto[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"QRCodes"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OX1869( )
   {
      beforeValidate1OX1869( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OX1869( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OX1869( 0) ;
         checkOptimisticConcurrency1OX1869( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OX1869( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OX1869( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OX9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n13689QrcNombre), A13689QrcNombre, Boolean.valueOf(n13690QrcURL), A13690QrcURL, Boolean.valueOf(n13691QrcImagen), A13691QrcImagen, Boolean.valueOf(n40000QrcImagen_), A40000QrcImagen_, Boolean.valueOf(n13692QrcTexto), A13692QrcTexto});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01OX10 */
                  pr_default.execute(8);
                  A13688QrcID = T01OX10_A13688QrcID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
                  pr_default.close(8);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("QRCodes");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1OX0( ) ;
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
            load1OX1869( ) ;
         }
         endLevel1OX1869( ) ;
      }
      closeExtendedTableCursors1OX1869( ) ;
   }

   public void update1OX1869( )
   {
      beforeValidate1OX1869( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OX1869( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OX1869( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OX1869( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OX1869( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OX11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n13689QrcNombre), A13689QrcNombre, Boolean.valueOf(n13690QrcURL), A13690QrcURL, Boolean.valueOf(n13692QrcTexto), A13692QrcTexto, Long.valueOf(A13688QrcID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("QRCodes");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"QRCodes"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OX1869( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1OX0( ) ;
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
         endLevel1OX1869( ) ;
      }
      closeExtendedTableCursors1OX1869( ) ;
   }

   public void deferredUpdate1OX1869( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T01OX12 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n13691QrcImagen), A13691QrcImagen, Boolean.valueOf(n40000QrcImagen_), A40000QrcImagen_, Long.valueOf(A13688QrcID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("QRCodes");
      }
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OX1869( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OX1869( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OX1869( ) ;
         afterConfirm1OX1869( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OX1869( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OX13 */
               pr_default.execute(11, new Object[] {Long.valueOf(A13688QrcID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("QRCodes");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1869 == 0 )
                     {
                        initAll1OX1869( ) ;
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
                     resetCaption1OX0( ) ;
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
      sMode1869 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OX1869( ) ;
      Gx_mode = sMode1869 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OX1869( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OX1869( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OX1869( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "qrcodes");
         if ( AnyError == 0 )
         {
            confirmValues1OX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "qrcodes");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OX1869( )
   {
      /* Using cursor T01OX14 */
      pr_default.execute(12);
      RcdFound1869 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1869 = (short)(1) ;
         A13688QrcID = T01OX14_A13688QrcID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OX1869( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1869 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1869 = (short)(1) ;
         A13688QrcID = T01OX14_A13688QrcID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
      }
   }

   public void scanEnd1OX1869( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1OX1869( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OX1869( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OX1869( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OX1869( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OX1869( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OX1869( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OX1869( )
   {
      edtQrcID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtQrcID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtQrcID_Enabled), 5, 0), true);
      edtQrcNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtQrcNombre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtQrcNombre_Enabled), 5, 0), true);
      edtQrcURL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtQrcURL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtQrcURL_Enabled), 5, 0), true);
      imgQrcImagen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgQrcImagen_Enabled), 5, 0), true);
      edtQrcTexto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtQrcTexto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtQrcTexto_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1OX1869( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1OX0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.qrcodes", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13688QrcID", GXutil.ltrim( localUtil.ntoc( Z13688QrcID, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13689QrcNombre", Z13689QrcNombre);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13690QrcURL", Z13690QrcURL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13692QrcTexto", Z13692QrcTexto);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "QRCIMAGEN_", A40000QrcImagen_);
      GXCCtlgxBlob = "QRCIMAGEN" + "_gxBlob" ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, A13691QrcImagen);
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
      return formatLink("app.qrcodes", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "QRCodes" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "QRCodes", "") ;
   }

   public void initializeNonKey1OX1869( )
   {
      A13689QrcNombre = "" ;
      n13689QrcNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13689QrcNombre", A13689QrcNombre);
      A13690QrcURL = "" ;
      n13690QrcURL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13690QrcURL", A13690QrcURL);
      A13691QrcImagen = "" ;
      n13691QrcImagen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13691QrcImagen", A13691QrcImagen);
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.convertURL( httpContext.getResourceRelative(A13691QrcImagen))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A13691QrcImagen), true);
      A40000QrcImagen_ = "" ;
      n40000QrcImagen_ = false ;
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "Bitmap", ((GXutil.strcmp("", A13691QrcImagen)==0) ? A40000QrcImagen_ : httpContext.convertURL( httpContext.getResourceRelative(A13691QrcImagen))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgQrcImagen_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( A13691QrcImagen), true);
      A13692QrcTexto = "" ;
      n13692QrcTexto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13692QrcTexto", A13692QrcTexto);
      Z13689QrcNombre = "" ;
      Z13690QrcURL = "" ;
      Z13692QrcTexto = "" ;
   }

   public void initAll1OX1869( )
   {
      A13688QrcID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13688QrcID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13688QrcID), 18, 0));
      initializeNonKey1OX1869( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251973357", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("qrcodes.js", "?20261251973357", false, true);
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
      edtQrcID_Internalname = "QRCID" ;
      edtQrcNombre_Internalname = "QRCNOMBRE" ;
      edtQrcURL_Internalname = "QRCURL" ;
      imgQrcImagen_Internalname = "QRCIMAGEN" ;
      edtQrcTexto_Internalname = "QRCTEXTO" ;
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
      Form.setCaption( httpContext.getMessage( "QRCodes", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtQrcTexto_Enabled = 1 ;
      imgQrcImagen_Enabled = 1 ;
      edtQrcURL_Jsonclick = "" ;
      edtQrcURL_Enabled = 1 ;
      edtQrcNombre_Enabled = 1 ;
      edtQrcID_Jsonclick = "" ;
      edtQrcID_Enabled = 1 ;
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
      GX_FocusControl = edtQrcNombre_Internalname ;
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

   public void valid_Qrcid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13689QrcNombre", A13689QrcNombre);
      httpContext.ajax_rsp_assign_attri("", false, "A13690QrcURL", A13690QrcURL);
      httpContext.ajax_rsp_assign_attri("", false, "A13691QrcImagen", httpContext.getResourceRelative(A13691QrcImagen));
      GXCCtlgxBlob = "QRCIMAGEN" + "_gxBlob" ;
      httpContext.ajax_rsp_assign_attri("", false, "GXCCtlgxBlob", GXCCtlgxBlob);
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, httpContext.getResourceRelative(A13691QrcImagen));
      httpContext.ajax_rsp_assign_attri("", false, "A40000QrcImagen_", A40000QrcImagen_);
      httpContext.ajax_rsp_assign_attri("", false, "A13692QrcTexto", A13692QrcTexto);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13688QrcID", GXutil.ltrim( localUtil.ntoc( Z13688QrcID, (byte)(18), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13689QrcNombre", Z13689QrcNombre);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13690QrcURL", Z13690QrcURL);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13691QrcImagen", httpContext.getResourceRelative(Z13691QrcImagen));
      app.GxWebStd.gx_hidden_field( httpContext, "Z40000QrcImagen_", Z40000QrcImagen_);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13692QrcTexto", Z13692QrcTexto);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Qrcnombre( )
   {
      n13689QrcNombre = false ;
      /* Using cursor T01OX15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n13689QrcNombre), A13689QrcNombre, Long.valueOf(A13688QrcID)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Qrc Nombre", "")}), 1, "QRCNOMBRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtQrcNombre_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_QRCID","{handler:'valid_Qrcid',iparms:[{av:'A13688QrcID',fld:'QRCID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_QRCID",",oparms:[{av:'A13689QrcNombre',fld:'QRCNOMBRE',pic:''},{av:'A13690QrcURL',fld:'QRCURL',pic:''},{av:'A13691QrcImagen',fld:'QRCIMAGEN',pic:''},{av:'A40000QrcImagen_',fld:'QRCIMAGEN_',pic:''},{av:'A13692QrcTexto',fld:'QRCTEXTO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z13688QrcID'},{av:'Z13689QrcNombre'},{av:'Z13690QrcURL'},{av:'Z13691QrcImagen'},{av:'Z40000QrcImagen_'},{av:'Z13692QrcTexto'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_QRCNOMBRE","{handler:'valid_Qrcnombre',iparms:[{av:'A13689QrcNombre',fld:'QRCNOMBRE',pic:''},{av:'A13688QrcID',fld:'QRCID',pic:'ZZZZZZZZZZZZZZZZZ9'}]");
      setEventMetadata("VALID_QRCNOMBRE",",oparms:[]}");
      setEventMetadata("VALID_QRCURL","{handler:'valid_Qrcurl',iparms:[]");
      setEventMetadata("VALID_QRCURL",",oparms:[]}");
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
      Z13689QrcNombre = "" ;
      Z13690QrcURL = "" ;
      Z13692QrcTexto = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A13689QrcNombre = "" ;
      A13690QrcURL = "" ;
      A13691QrcImagen = "" ;
      A40000QrcImagen_ = "" ;
      sImgUrl = "" ;
      A13692QrcTexto = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z13691QrcImagen = "" ;
      Z40000QrcImagen_ = "" ;
      T01OX4_A13688QrcID = new long[1] ;
      T01OX4_A13689QrcNombre = new String[] {""} ;
      T01OX4_n13689QrcNombre = new boolean[] {false} ;
      T01OX4_A13690QrcURL = new String[] {""} ;
      T01OX4_n13690QrcURL = new boolean[] {false} ;
      T01OX4_A13691QrcImagen = new String[] {""} ;
      T01OX4_n13691QrcImagen = new boolean[] {false} ;
      T01OX4_A40000QrcImagen_ = new String[] {""} ;
      T01OX4_n40000QrcImagen_ = new boolean[] {false} ;
      T01OX4_A13692QrcTexto = new String[] {""} ;
      T01OX4_n13692QrcTexto = new boolean[] {false} ;
      T01OX5_A13689QrcNombre = new String[] {""} ;
      T01OX5_n13689QrcNombre = new boolean[] {false} ;
      T01OX6_A13688QrcID = new long[1] ;
      T01OX3_A13688QrcID = new long[1] ;
      T01OX3_A13689QrcNombre = new String[] {""} ;
      T01OX3_n13689QrcNombre = new boolean[] {false} ;
      T01OX3_A13690QrcURL = new String[] {""} ;
      T01OX3_n13690QrcURL = new boolean[] {false} ;
      T01OX3_A13691QrcImagen = new String[] {""} ;
      T01OX3_n13691QrcImagen = new boolean[] {false} ;
      T01OX3_A40000QrcImagen_ = new String[] {""} ;
      T01OX3_n40000QrcImagen_ = new boolean[] {false} ;
      T01OX3_A13692QrcTexto = new String[] {""} ;
      T01OX3_n13692QrcTexto = new boolean[] {false} ;
      sMode1869 = "" ;
      T01OX7_A13688QrcID = new long[1] ;
      T01OX8_A13688QrcID = new long[1] ;
      T01OX2_A13688QrcID = new long[1] ;
      T01OX2_A13689QrcNombre = new String[] {""} ;
      T01OX2_n13689QrcNombre = new boolean[] {false} ;
      T01OX2_A13690QrcURL = new String[] {""} ;
      T01OX2_n13690QrcURL = new boolean[] {false} ;
      T01OX2_A13691QrcImagen = new String[] {""} ;
      T01OX2_n13691QrcImagen = new boolean[] {false} ;
      T01OX2_A40000QrcImagen_ = new String[] {""} ;
      T01OX2_n40000QrcImagen_ = new boolean[] {false} ;
      T01OX2_A13692QrcTexto = new String[] {""} ;
      T01OX2_n13692QrcTexto = new boolean[] {false} ;
      T01OX10_A13688QrcID = new long[1] ;
      T01OX14_A13688QrcID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXCCtlgxBlob = "" ;
      ZZ13689QrcNombre = "" ;
      ZZ13690QrcURL = "" ;
      ZZ13691QrcImagen = "" ;
      ZZ40000QrcImagen_ = "" ;
      ZZ13692QrcTexto = "" ;
      T01OX15_A13689QrcNombre = new String[] {""} ;
      T01OX15_n13689QrcNombre = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.qrcodes__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.qrcodes__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.qrcodes__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.qrcodes__default(),
         new Object[] {
             new Object[] {
            T01OX2_A13688QrcID, T01OX2_A13689QrcNombre, T01OX2_n13689QrcNombre, T01OX2_A13690QrcURL, T01OX2_n13690QrcURL, T01OX2_A13691QrcImagen, T01OX2_n13691QrcImagen, T01OX2_A40000QrcImagen_, T01OX2_n40000QrcImagen_, T01OX2_A13692QrcTexto,
            T01OX2_n13692QrcTexto
            }
            , new Object[] {
            T01OX3_A13688QrcID, T01OX3_A13689QrcNombre, T01OX3_n13689QrcNombre, T01OX3_A13690QrcURL, T01OX3_n13690QrcURL, T01OX3_A13691QrcImagen, T01OX3_n13691QrcImagen, T01OX3_A40000QrcImagen_, T01OX3_n40000QrcImagen_, T01OX3_A13692QrcTexto,
            T01OX3_n13692QrcTexto
            }
            , new Object[] {
            T01OX4_A13688QrcID, T01OX4_A13689QrcNombre, T01OX4_n13689QrcNombre, T01OX4_A13690QrcURL, T01OX4_n13690QrcURL, T01OX4_A13691QrcImagen, T01OX4_n13691QrcImagen, T01OX4_A40000QrcImagen_, T01OX4_n40000QrcImagen_, T01OX4_A13692QrcTexto,
            T01OX4_n13692QrcTexto
            }
            , new Object[] {
            T01OX5_A13689QrcNombre, T01OX5_n13689QrcNombre
            }
            , new Object[] {
            T01OX6_A13688QrcID
            }
            , new Object[] {
            T01OX7_A13688QrcID
            }
            , new Object[] {
            T01OX8_A13688QrcID
            }
            , new Object[] {
            }
            , new Object[] {
            T01OX10_A13688QrcID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OX14_A13688QrcID
            }
            , new Object[] {
            T01OX15_A13689QrcNombre, T01OX15_n13689QrcNombre
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1869 ;
   private short nIsDirty_1869 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtQrcID_Enabled ;
   private int edtQrcNombre_Enabled ;
   private int edtQrcURL_Enabled ;
   private int imgQrcImagen_Enabled ;
   private int edtQrcTexto_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z13688QrcID ;
   private long A13688QrcID ;
   private long ZZ13688QrcID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtQrcID_Internalname ;
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
   private String edtQrcID_Jsonclick ;
   private String edtQrcNombre_Internalname ;
   private String edtQrcURL_Internalname ;
   private String edtQrcURL_Jsonclick ;
   private String imgQrcImagen_Internalname ;
   private String sImgUrl ;
   private String edtQrcTexto_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1869 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXCCtlgxBlob ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean A13691QrcImagen_IsBlob ;
   private boolean n40000QrcImagen_ ;
   private boolean n13689QrcNombre ;
   private boolean n13690QrcURL ;
   private boolean n13691QrcImagen ;
   private boolean n13692QrcTexto ;
   private String Z13689QrcNombre ;
   private String Z13690QrcURL ;
   private String Z13692QrcTexto ;
   private String A13689QrcNombre ;
   private String A13690QrcURL ;
   private String A40000QrcImagen_ ;
   private String A13692QrcTexto ;
   private String Z40000QrcImagen_ ;
   private String ZZ13689QrcNombre ;
   private String ZZ13690QrcURL ;
   private String ZZ40000QrcImagen_ ;
   private String ZZ13692QrcTexto ;
   private String A13691QrcImagen ;
   private String Z13691QrcImagen ;
   private String ZZ13691QrcImagen ;
   private IDataStoreProvider pr_default ;
   private long[] T01OX4_A13688QrcID ;
   private String[] T01OX4_A13689QrcNombre ;
   private boolean[] T01OX4_n13689QrcNombre ;
   private String[] T01OX4_A13690QrcURL ;
   private boolean[] T01OX4_n13690QrcURL ;
   private String[] T01OX4_A13691QrcImagen ;
   private boolean[] T01OX4_n13691QrcImagen ;
   private String[] T01OX4_A40000QrcImagen_ ;
   private boolean[] T01OX4_n40000QrcImagen_ ;
   private String[] T01OX4_A13692QrcTexto ;
   private boolean[] T01OX4_n13692QrcTexto ;
   private String[] T01OX5_A13689QrcNombre ;
   private boolean[] T01OX5_n13689QrcNombre ;
   private long[] T01OX6_A13688QrcID ;
   private long[] T01OX3_A13688QrcID ;
   private String[] T01OX3_A13689QrcNombre ;
   private boolean[] T01OX3_n13689QrcNombre ;
   private String[] T01OX3_A13690QrcURL ;
   private boolean[] T01OX3_n13690QrcURL ;
   private String[] T01OX3_A13691QrcImagen ;
   private boolean[] T01OX3_n13691QrcImagen ;
   private String[] T01OX3_A40000QrcImagen_ ;
   private boolean[] T01OX3_n40000QrcImagen_ ;
   private String[] T01OX3_A13692QrcTexto ;
   private boolean[] T01OX3_n13692QrcTexto ;
   private long[] T01OX7_A13688QrcID ;
   private long[] T01OX8_A13688QrcID ;
   private long[] T01OX2_A13688QrcID ;
   private String[] T01OX2_A13689QrcNombre ;
   private boolean[] T01OX2_n13689QrcNombre ;
   private String[] T01OX2_A13690QrcURL ;
   private boolean[] T01OX2_n13690QrcURL ;
   private String[] T01OX2_A13691QrcImagen ;
   private boolean[] T01OX2_n13691QrcImagen ;
   private String[] T01OX2_A40000QrcImagen_ ;
   private boolean[] T01OX2_n40000QrcImagen_ ;
   private String[] T01OX2_A13692QrcTexto ;
   private boolean[] T01OX2_n13692QrcTexto ;
   private long[] T01OX10_A13688QrcID ;
   private long[] T01OX14_A13688QrcID ;
   private String[] T01OX15_A13689QrcNombre ;
   private boolean[] T01OX15_n13689QrcNombre ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class qrcodes__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class qrcodes__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class qrcodes__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class qrcodes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OX2", "SELECT QrcID, QrcNombre, QrcURL, QrcImagen, QrcImagen_, QrcTexto FROM QRCodes WHERE QrcID = ?  FOR UPDATE OF QrcNombre, QrcURL, QrcImagen, QrcImagen_, QrcTexto NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OX3", "SELECT QrcID, QrcNombre, QrcURL, QrcImagen, QrcImagen_, QrcTexto FROM QRCodes WHERE QrcID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OX4", "SELECT /*+ FIRST_ROWS(100) */ TM1.QrcID, TM1.QrcNombre, TM1.QrcURL, TM1.QrcImagen, TM1.QrcImagen_, TM1.QrcTexto FROM QRCodes TM1 WHERE TM1.QrcID = ? ORDER BY TM1.QrcID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OX5", "SELECT QrcNombre FROM QRCodes WHERE (QrcNombre = ?) AND (Not ( QrcID = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OX6", "SELECT /*+ FIRST_ROWS(1) */ QrcID FROM QRCodes WHERE QrcID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OX7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ QrcID FROM QRCodes WHERE ( QrcID > ?) ORDER BY QrcID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OX8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ QrcID FROM QRCodes WHERE ( QrcID < ?) ORDER BY QrcID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new BlobUpdateCursor("T01OX9", "BEGIN INSERT INTO QRCodes(QrcNombre, QrcURL, QrcImagen, QrcImagen_, QrcTexto) VALUES(?, ?, '0', ?, ?)  RETURNING ROWID INTO ?; END;",
         "SELECT QrcImagen FROM QRCodes WHERE ROWID = ? FOR UPDATE", "ins", 4, GX_NOMASK, "QRCodes")
         ,new ForEachCursor("T01OX10", "SELECT QrcID.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OX11", "UPDATE QRCodes SET QrcNombre=?, QrcURL=?, QrcTexto=?  WHERE QrcID = ?", GX_NOMASK, "QRCodes")
         ,new BlobUpdateCursor("T01OX12", "UPDATE QRCodes SET QrcImagen='0', QrcImagen_=?  WHERE QrcID = ?",
         "SELECT QrcImagen FROM QRCodes WHERE QrcID = ? FOR UPDATE", "upd", 2, GX_NOMASK, "QRCodes")
         ,new UpdateCursor("T01OX13", "DELETE FROM QRCodes  WHERE QrcID = ?", GX_NOMASK, "QRCodes")
         ,new ForEachCursor("T01OX14", "SELECT /*+ FIRST_ROWS(100) */ QrcID FROM QRCodes ORDER BY QrcID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OX15", "SELECT QrcNombre FROM QRCodes WHERE (QrcNombre = ?) AND (Not ( QrcID = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(4, rslt.getVarchar(5));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(4, rslt.getVarchar(5));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getMultimediaFile(4, rslt.getVarchar(5));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaUri(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               stmt.setBLOBFile(1, ((Boolean) parms[4]).booleanValue() ? null : (String)parms[5], true);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(3, (String)parms[7], ((Boolean) parms[4]).booleanValue() ? null : (String)parms[5], 2048,"QRCodes","QrcImagen");
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[9], 2048);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 2048);
               }
               stmt.setLong(4, ((Number) parms[6]).longValue());
               return;
            case 10 :
               stmt.setBLOBFile(1, ((Boolean) parms[0]).booleanValue() ? null : (String)parms[1], true);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(1, (String)parms[3], ((Boolean) parms[0]).booleanValue() ? null : (String)parms[1], 2048,"QRCodes","QrcImagen");
               }
               stmt.setLong(2, ((Number) parms[4]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 65546 :
               stmt.setLong(1, ((Number) parms[4]).longValue());
               break;
      }
   }

}

