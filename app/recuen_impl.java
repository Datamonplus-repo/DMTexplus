package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recuen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla RECUEN", ""), (short)(0)) ;
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

   public recuen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recuen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuen_impl.class ));
   }

   public recuen_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla RECUEN", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_RECUEN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_RECUEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecFec_Internalname, httpContext.getMessage( "Fecha Recuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRecFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFec_Internalname, localUtil.format(A810RecFec, "99/99/99"), localUtil.format( A810RecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRecFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRecFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RECUEN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecExiTeo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecExiTeo_Internalname, httpContext.getMessage( "Existencia Teorica Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiTeo_Enabled!=0) ? localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999") : localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiTeo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecExiTeo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecExiRea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecExiRea_Internalname, httpContext.getMessage( "Existencia Real Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiRea_Internalname, GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiRea_Enabled!=0) ? localUtil.format( A807RecExiRea, "ZZZZZZ9.9999") : localUtil.format( A807RecExiRea, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiRea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecExiRea_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecExiTcc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecExiTcc_Internalname, httpContext.getMessage( "Existencia Teorica Cuarto Col.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiTcc_Internalname, GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiTcc_Enabled!=0) ? localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999") : localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiTcc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecExiTcc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecExiRcc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecExiRcc_Internalname, httpContext.getMessage( "Existencia Real Cuarto Col.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiRcc_Internalname, GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiRcc_Enabled!=0) ? localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999") : localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiRcc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecExiRcc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPreRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPreRec_Internalname, httpContext.getMessage( "Precio Mov Recuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecPreRec_Enabled!=0) ? localUtil.format( A6573RecPreRec, "ZZZZ9.99999") : localUtil.format( A6573RecPreRec, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPreRec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecPreRec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecExiTAc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecExiTAc_Internalname, httpContext.getMessage( "Teorico Almacen en Consigna", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiTAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiTAc_Enabled!=0) ? localUtil.format( A8668RecExiTAc, "ZZZZZZ9.9999") : localUtil.format( A8668RecExiTAc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiTAc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecExiTAc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecExiRAc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecExiRAc_Internalname, httpContext.getMessage( "Real Almacen en Consigna", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiRAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiRAc_Enabled!=0) ? localUtil.format( A8669RecExiRAc, "ZZZZZZ9.9999") : localUtil.format( A8669RecExiRAc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiRAc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecExiRAc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecUbic_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecUbic_Internalname, httpContext.getMessage( "Ubicacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecUbic_Internalname, GXutil.rtrim( A11195RecUbic), GXutil.rtrim( localUtil.format( A11195RecUbic, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecUbic_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecUbic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMemCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMemCant_Internalname, httpContext.getMessage( "Memorizo Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMemCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMemCant_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11624RecMemCant), "9") : localUtil.format( DecimalUtil.doubleToDec(A11624RecMemCant), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMemCant_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMemCant_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLot_Internalname, httpContext.getMessage( "Lote Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLot_Internalname, GXutil.rtrim( A12285RecLot), GXutil.rtrim( localUtil.format( A12285RecLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecEstInv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecEstInv_Internalname, httpContext.getMessage( "Estado Inventario, 0=En recuento, 1=Finalizado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecEstInv_Internalname, GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecEstInv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13416RecEstInv), "9") : localUtil.format( DecimalUtil.doubleToDec(A13416RecEstInv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecEstInv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecEstInv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRechora_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRechora_Internalname, httpContext.getMessage( "Hora Recuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRechora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRechora_Internalname, localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13455Rechora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRechora_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRechora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RECUEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRechora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRechora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RECUEN.htm");
      httpContext.writeTextNL( "</div>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RECUEN.htm");
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z810RecFec = localUtil.ctod( httpContext.cgiGet( "Z810RecFec"), 0) ;
         Z809RecExiTeo = localUtil.ctond( httpContext.cgiGet( "Z809RecExiTeo")) ;
         Z807RecExiRea = localUtil.ctond( httpContext.cgiGet( "Z807RecExiRea")) ;
         Z808RecExiTcc = localUtil.ctond( httpContext.cgiGet( "Z808RecExiTcc")) ;
         Z806RecExiRcc = localUtil.ctond( httpContext.cgiGet( "Z806RecExiRcc")) ;
         Z6573RecPreRec = localUtil.ctond( httpContext.cgiGet( "Z6573RecPreRec")) ;
         Z8668RecExiTAc = localUtil.ctond( httpContext.cgiGet( "Z8668RecExiTAc")) ;
         Z8669RecExiRAc = localUtil.ctond( httpContext.cgiGet( "Z8669RecExiRAc")) ;
         Z11195RecUbic = httpContext.cgiGet( "Z11195RecUbic") ;
         Z11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11624RecMemCant"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12285RecLot = httpContext.cgiGet( "Z12285RecLot") ;
         Z13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13416RecEstInv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13455Rechora = localUtil.ctot( httpContext.cgiGet( "Z13455Rechora"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( localUtil.vcdate( httpContext.cgiGet( edtRecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RECFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A810RecFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
         }
         else
         {
            A810RecFec = localUtil.ctod( httpContext.cgiGet( edtRecFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXITEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecExiTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A809RecExiTeo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A809RecExiTeo", GXutil.ltrimstr( A809RecExiTeo, 12, 4));
         }
         else
         {
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A809RecExiTeo", GXutil.ltrimstr( A809RecExiTeo, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXIREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecExiRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A807RecExiRea = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A807RecExiRea", GXutil.ltrimstr( A807RecExiRea, 12, 4));
         }
         else
         {
            A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A807RecExiRea", GXutil.ltrimstr( A807RecExiRea, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXITCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecExiTcc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A808RecExiTcc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
         }
         else
         {
            A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXIRCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecExiRcc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A806RecExiRcc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
         }
         else
         {
            A806RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECPREREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecPreRec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6573RecPreRec = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6573RecPreRec", GXutil.ltrimstr( A6573RecPreRec, 14, 5));
         }
         else
         {
            A6573RecPreRec = localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6573RecPreRec", GXutil.ltrimstr( A6573RecPreRec, 14, 5));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTAc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXITAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecExiTAc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8668RecExiTAc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8668RecExiTAc", GXutil.ltrimstr( A8668RecExiTAc, 12, 4));
         }
         else
         {
            A8668RecExiTAc = localUtil.ctond( httpContext.cgiGet( edtRecExiTAc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8668RecExiTAc", GXutil.ltrimstr( A8668RecExiTAc, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRAc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXIRAC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecExiRAc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8669RecExiRAc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8669RecExiRAc", GXutil.ltrimstr( A8669RecExiRAc, 12, 4));
         }
         else
         {
            A8669RecExiRAc = localUtil.ctond( httpContext.cgiGet( edtRecExiRAc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8669RecExiRAc", GXutil.ltrimstr( A8669RecExiRAc, 12, 4));
         }
         A11195RecUbic = httpContext.cgiGet( edtRecUbic_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11195RecUbic", A11195RecUbic);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMEMCANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMemCant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11624RecMemCant = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11624RecMemCant", GXutil.str( A11624RecMemCant, 1, 0));
         }
         else
         {
            A11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11624RecMemCant", GXutil.str( A11624RecMemCant, 1, 0));
         }
         A12285RecLot = httpContext.cgiGet( edtRecLot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12285RecLot", A12285RecLot);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECESTINV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecEstInv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13416RecEstInv = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13416RecEstInv", GXutil.str( A13416RecEstInv, 1, 0));
         }
         else
         {
            A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13416RecEstInv", GXutil.str( A13416RecEstInv, 1, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtRechora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RECHORA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRechora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A13455Rechora", localUtil.ttoc( A13455Rechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A13455Rechora = localUtil.ctot( httpContext.cgiGet( edtRechora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13455Rechora", localUtil.ttoc( A13455Rechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A810RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
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
            initAll1QA98( ) ;
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
      disableAttributes1QA98( ) ;
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

   public void resetCaption1QA0( )
   {
   }

   public void zm1QA98( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z809RecExiTeo = T01QA3_A809RecExiTeo[0] ;
            Z807RecExiRea = T01QA3_A807RecExiRea[0] ;
            Z808RecExiTcc = T01QA3_A808RecExiTcc[0] ;
            Z806RecExiRcc = T01QA3_A806RecExiRcc[0] ;
            Z6573RecPreRec = T01QA3_A6573RecPreRec[0] ;
            Z8668RecExiTAc = T01QA3_A8668RecExiTAc[0] ;
            Z8669RecExiRAc = T01QA3_A8669RecExiRAc[0] ;
            Z11195RecUbic = T01QA3_A11195RecUbic[0] ;
            Z11624RecMemCant = T01QA3_A11624RecMemCant[0] ;
            Z12285RecLot = T01QA3_A12285RecLot[0] ;
            Z13416RecEstInv = T01QA3_A13416RecEstInv[0] ;
            Z13455Rechora = T01QA3_A13455Rechora[0] ;
         }
         else
         {
            Z809RecExiTeo = A809RecExiTeo ;
            Z807RecExiRea = A807RecExiRea ;
            Z808RecExiTcc = A808RecExiTcc ;
            Z806RecExiRcc = A806RecExiRcc ;
            Z6573RecPreRec = A6573RecPreRec ;
            Z8668RecExiTAc = A8668RecExiTAc ;
            Z8669RecExiRAc = A8669RecExiRAc ;
            Z11195RecUbic = A11195RecUbic ;
            Z11624RecMemCant = A11624RecMemCant ;
            Z12285RecLot = A12285RecLot ;
            Z13416RecEstInv = A13416RecEstInv ;
            Z13455Rechora = A13455Rechora ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z810RecFec = A810RecFec ;
         Z809RecExiTeo = A809RecExiTeo ;
         Z807RecExiRea = A807RecExiRea ;
         Z808RecExiTcc = A808RecExiTcc ;
         Z806RecExiRcc = A806RecExiRcc ;
         Z6573RecPreRec = A6573RecPreRec ;
         Z8668RecExiTAc = A8668RecExiTAc ;
         Z8669RecExiRAc = A8669RecExiRAc ;
         Z11195RecUbic = A11195RecUbic ;
         Z11624RecMemCant = A11624RecMemCant ;
         Z12285RecLot = A12285RecLot ;
         Z13416RecEstInv = A13416RecEstInv ;
         Z13455Rechora = A13455Rechora ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
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

   public void load1QA98( )
   {
      /* Using cursor T01QA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A809RecExiTeo = T01QA5_A809RecExiTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A809RecExiTeo", GXutil.ltrimstr( A809RecExiTeo, 12, 4));
         A807RecExiRea = T01QA5_A807RecExiRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A807RecExiRea", GXutil.ltrimstr( A807RecExiRea, 12, 4));
         A808RecExiTcc = T01QA5_A808RecExiTcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
         A806RecExiRcc = T01QA5_A806RecExiRcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
         A6573RecPreRec = T01QA5_A6573RecPreRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6573RecPreRec", GXutil.ltrimstr( A6573RecPreRec, 14, 5));
         A8668RecExiTAc = T01QA5_A8668RecExiTAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8668RecExiTAc", GXutil.ltrimstr( A8668RecExiTAc, 12, 4));
         A8669RecExiRAc = T01QA5_A8669RecExiRAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8669RecExiRAc", GXutil.ltrimstr( A8669RecExiRAc, 12, 4));
         A11195RecUbic = T01QA5_A11195RecUbic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11195RecUbic", A11195RecUbic);
         A11624RecMemCant = T01QA5_A11624RecMemCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11624RecMemCant", GXutil.str( A11624RecMemCant, 1, 0));
         A12285RecLot = T01QA5_A12285RecLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12285RecLot", A12285RecLot);
         A13416RecEstInv = T01QA5_A13416RecEstInv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13416RecEstInv", GXutil.str( A13416RecEstInv, 1, 0));
         A13455Rechora = T01QA5_A13455Rechora[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13455Rechora", localUtil.ttoc( A13455Rechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         zm1QA98( -1) ;
      }
      pr_default.close(3);
      onLoadActions1QA98( ) ;
   }

   public void onLoadActions1QA98( )
   {
   }

   public void checkExtendedTable1QA98( )
   {
      nIsDirty_98 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1QA98( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01QA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1QA98( )
   {
      /* Using cursor T01QA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound98 = (short)(1) ;
      }
      else
      {
         RcdFound98 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QA98( 1) ;
         RcdFound98 = (short)(1) ;
         A810RecFec = T01QA3_A810RecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
         A809RecExiTeo = T01QA3_A809RecExiTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A809RecExiTeo", GXutil.ltrimstr( A809RecExiTeo, 12, 4));
         A807RecExiRea = T01QA3_A807RecExiRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A807RecExiRea", GXutil.ltrimstr( A807RecExiRea, 12, 4));
         A808RecExiTcc = T01QA3_A808RecExiTcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
         A806RecExiRcc = T01QA3_A806RecExiRcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
         A6573RecPreRec = T01QA3_A6573RecPreRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6573RecPreRec", GXutil.ltrimstr( A6573RecPreRec, 14, 5));
         A8668RecExiTAc = T01QA3_A8668RecExiTAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8668RecExiTAc", GXutil.ltrimstr( A8668RecExiTAc, 12, 4));
         A8669RecExiRAc = T01QA3_A8669RecExiRAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8669RecExiRAc", GXutil.ltrimstr( A8669RecExiRAc, 12, 4));
         A11195RecUbic = T01QA3_A11195RecUbic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11195RecUbic", A11195RecUbic);
         A11624RecMemCant = T01QA3_A11624RecMemCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11624RecMemCant", GXutil.str( A11624RecMemCant, 1, 0));
         A12285RecLot = T01QA3_A12285RecLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12285RecLot", A12285RecLot);
         A13416RecEstInv = T01QA3_A13416RecEstInv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13416RecEstInv", GXutil.str( A13416RecEstInv, 1, 0));
         A13455Rechora = T01QA3_A13455Rechora[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13455Rechora", localUtil.ttoc( A13455Rechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A396EmprCod = T01QA3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01QA3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z810RecFec = A810RecFec ;
         sMode98 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QA98( ) ;
         if ( AnyError == 1 )
         {
            RcdFound98 = (short)(0) ;
            initializeNonKey1QA98( ) ;
         }
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound98 = (short)(0) ;
         initializeNonKey1QA98( ) ;
         sMode98 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QA98( ) ;
      if ( RcdFound98 == 0 )
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
      RcdFound98 = (short)(0) ;
      /* Using cursor T01QA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A810RecFec});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01QA8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QA8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QA8_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01QA8_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QA8_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QA8_A810RecFec[0]).before( GXutil.resetTime( A810RecFec )) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01QA8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QA8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QA8_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01QA8_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QA8_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QA8_A810RecFec[0]).after( GXutil.resetTime( A810RecFec )) ) )
         {
            A396EmprCod = T01QA8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01QA8_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A810RecFec = T01QA8_A810RecFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
            RcdFound98 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound98 = (short)(0) ;
      /* Using cursor T01QA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A810RecFec});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01QA9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QA9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QA9_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01QA9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QA9_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QA9_A810RecFec[0]).after( GXutil.resetTime( A810RecFec )) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01QA9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QA9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QA9_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01QA9_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QA9_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QA9_A810RecFec[0]).before( GXutil.resetTime( A810RecFec )) ) )
         {
            A396EmprCod = T01QA9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01QA9_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A810RecFec = T01QA9_A810RecFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
            RcdFound98 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QA98( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QA98( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound98 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A810RecFec = Z810RecFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
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
               update1QA98( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QA98( ) ;
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
                  insert1QA98( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A810RecFec = Z810RecFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
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
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRecExiTeo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QA98( ) ;
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTeo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QA98( ) ;
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
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTeo_Internalname ;
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
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTeo_Internalname ;
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
      scanStart1QA98( ) ;
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound98 != 0 )
         {
            scanNext1QA98( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTeo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QA98( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QA98( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECUEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z809RecExiTeo, T01QA2_A809RecExiTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z807RecExiRea, T01QA2_A807RecExiRea[0]) != 0 ) || ( DecimalUtil.compareTo(Z808RecExiTcc, T01QA2_A808RecExiTcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z806RecExiRcc, T01QA2_A806RecExiRcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z6573RecPreRec, T01QA2_A6573RecPreRec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8668RecExiTAc, T01QA2_A8668RecExiTAc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8669RecExiRAc, T01QA2_A8669RecExiRAc[0]) != 0 ) || ( GXutil.strcmp(Z11195RecUbic, T01QA2_A11195RecUbic[0]) != 0 ) || ( Z11624RecMemCant != T01QA2_A11624RecMemCant[0] ) || ( GXutil.strcmp(Z12285RecLot, T01QA2_A12285RecLot[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13416RecEstInv != T01QA2_A13416RecEstInv[0] ) || !( GXutil.dateCompare(Z13455Rechora, T01QA2_A13455Rechora[0]) ) )
         {
            if ( DecimalUtil.compareTo(Z809RecExiTeo, T01QA2_A809RecExiTeo[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecExiTeo");
               GXutil.writeLogRaw("Old: ",Z809RecExiTeo);
               GXutil.writeLogRaw("Current: ",T01QA2_A809RecExiTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z807RecExiRea, T01QA2_A807RecExiRea[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecExiRea");
               GXutil.writeLogRaw("Old: ",Z807RecExiRea);
               GXutil.writeLogRaw("Current: ",T01QA2_A807RecExiRea[0]);
            }
            if ( DecimalUtil.compareTo(Z808RecExiTcc, T01QA2_A808RecExiTcc[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecExiTcc");
               GXutil.writeLogRaw("Old: ",Z808RecExiTcc);
               GXutil.writeLogRaw("Current: ",T01QA2_A808RecExiTcc[0]);
            }
            if ( DecimalUtil.compareTo(Z806RecExiRcc, T01QA2_A806RecExiRcc[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecExiRcc");
               GXutil.writeLogRaw("Old: ",Z806RecExiRcc);
               GXutil.writeLogRaw("Current: ",T01QA2_A806RecExiRcc[0]);
            }
            if ( DecimalUtil.compareTo(Z6573RecPreRec, T01QA2_A6573RecPreRec[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecPreRec");
               GXutil.writeLogRaw("Old: ",Z6573RecPreRec);
               GXutil.writeLogRaw("Current: ",T01QA2_A6573RecPreRec[0]);
            }
            if ( DecimalUtil.compareTo(Z8668RecExiTAc, T01QA2_A8668RecExiTAc[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecExiTAc");
               GXutil.writeLogRaw("Old: ",Z8668RecExiTAc);
               GXutil.writeLogRaw("Current: ",T01QA2_A8668RecExiTAc[0]);
            }
            if ( DecimalUtil.compareTo(Z8669RecExiRAc, T01QA2_A8669RecExiRAc[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecExiRAc");
               GXutil.writeLogRaw("Old: ",Z8669RecExiRAc);
               GXutil.writeLogRaw("Current: ",T01QA2_A8669RecExiRAc[0]);
            }
            if ( GXutil.strcmp(Z11195RecUbic, T01QA2_A11195RecUbic[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecUbic");
               GXutil.writeLogRaw("Old: ",Z11195RecUbic);
               GXutil.writeLogRaw("Current: ",T01QA2_A11195RecUbic[0]);
            }
            if ( Z11624RecMemCant != T01QA2_A11624RecMemCant[0] )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecMemCant");
               GXutil.writeLogRaw("Old: ",Z11624RecMemCant);
               GXutil.writeLogRaw("Current: ",T01QA2_A11624RecMemCant[0]);
            }
            if ( GXutil.strcmp(Z12285RecLot, T01QA2_A12285RecLot[0]) != 0 )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecLot");
               GXutil.writeLogRaw("Old: ",Z12285RecLot);
               GXutil.writeLogRaw("Current: ",T01QA2_A12285RecLot[0]);
            }
            if ( Z13416RecEstInv != T01QA2_A13416RecEstInv[0] )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"RecEstInv");
               GXutil.writeLogRaw("Old: ",Z13416RecEstInv);
               GXutil.writeLogRaw("Current: ",T01QA2_A13416RecEstInv[0]);
            }
            if ( !( GXutil.dateCompare(Z13455Rechora, T01QA2_A13455Rechora[0]) ) )
            {
               GXutil.writeLogln("recuen:[seudo value changed for attri]"+"Rechora");
               GXutil.writeLogRaw("Old: ",Z13455Rechora);
               GXutil.writeLogRaw("Current: ",T01QA2_A13455Rechora[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECUEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QA98( )
   {
      beforeValidate1QA98( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QA98( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QA98( 0) ;
         checkOptimisticConcurrency1QA98( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QA98( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QA98( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QA10 */
                  pr_default.execute(8, new Object[] {A810RecFec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, A6573RecPreRec, A8668RecExiTAc, A8669RecExiRAc, A11195RecUbic, Byte.valueOf(A11624RecMemCant), A12285RecLot, Byte.valueOf(A13416RecEstInv), A13455Rechora, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1QA0( ) ;
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
            load1QA98( ) ;
         }
         endLevel1QA98( ) ;
      }
      closeExtendedTableCursors1QA98( ) ;
   }

   public void update1QA98( )
   {
      beforeValidate1QA98( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QA98( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QA98( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QA98( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QA98( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QA11 */
                  pr_default.execute(9, new Object[] {A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, A6573RecPreRec, A8668RecExiTAc, A8669RecExiRAc, A11195RecUbic, Byte.valueOf(A11624RecMemCant), A12285RecLot, Byte.valueOf(A13416RecEstInv), A13455Rechora, A396EmprCod, A719PrdNum, A810RecFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECUEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QA98( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QA0( ) ;
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
         endLevel1QA98( ) ;
      }
      closeExtendedTableCursors1QA98( ) ;
   }

   public void deferredUpdate1QA98( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QA98( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QA98( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QA98( ) ;
         afterConfirm1QA98( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QA98( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QA12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound98 == 0 )
                     {
                        initAll1QA98( ) ;
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
                     resetCaption1QA0( ) ;
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
      sMode98 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QA98( ) ;
      Gx_mode = sMode98 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QA98( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01QA13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel1QA98( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QA98( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recuen");
         if ( AnyError == 0 )
         {
            confirmValues1QA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "recuen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QA98( )
   {
      /* Using cursor T01QA14 */
      pr_default.execute(12);
      RcdFound98 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A396EmprCod = T01QA14_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01QA14_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A810RecFec = T01QA14_A810RecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QA98( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound98 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A396EmprCod = T01QA14_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01QA14_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A810RecFec = T01QA14_A810RecFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
      }
   }

   public void scanEnd1QA98( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1QA98( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QA98( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QA98( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QA98( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QA98( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QA98( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QA98( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), true);
      edtRecExiTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Enabled), 5, 0), true);
      edtRecExiRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRea_Enabled), 5, 0), true);
      edtRecExiTcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Enabled), 5, 0), true);
      edtRecExiRcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRcc_Enabled), 5, 0), true);
      edtRecPreRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPreRec_Enabled), 5, 0), true);
      edtRecExiTAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTAc_Enabled), 5, 0), true);
      edtRecExiRAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRAc_Enabled), 5, 0), true);
      edtRecUbic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUbic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUbic_Enabled), 5, 0), true);
      edtRecMemCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMemCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMemCant_Enabled), 5, 0), true);
      edtRecLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLot_Enabled), 5, 0), true);
      edtRecEstInv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstInv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstInv_Enabled), 5, 0), true);
      edtRechora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRechora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRechora_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QA98( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QA0( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recuen", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z810RecFec", localUtil.dtoc( Z810RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z809RecExiTeo", GXutil.ltrim( localUtil.ntoc( Z809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z807RecExiRea", GXutil.ltrim( localUtil.ntoc( Z807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z808RecExiTcc", GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z806RecExiRcc", GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6573RecPreRec", GXutil.ltrim( localUtil.ntoc( Z6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8668RecExiTAc", GXutil.ltrim( localUtil.ntoc( Z8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8669RecExiRAc", GXutil.ltrim( localUtil.ntoc( Z8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11195RecUbic", GXutil.rtrim( Z11195RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11624RecMemCant", GXutil.ltrim( localUtil.ntoc( Z11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12285RecLot", GXutil.rtrim( Z12285RecLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13416RecEstInv", GXutil.ltrim( localUtil.ntoc( Z13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13455Rechora", localUtil.ttoc( Z13455Rechora, 10, 8, 0, 0, "/", ":", " "));
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
      return formatLink("app.recuen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "RECUEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla RECUEN", "") ;
   }

   public void initializeNonKey1QA98( )
   {
      A809RecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A809RecExiTeo", GXutil.ltrimstr( A809RecExiTeo, 12, 4));
      A807RecExiRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A807RecExiRea", GXutil.ltrimstr( A807RecExiRea, 12, 4));
      A808RecExiTcc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
      A806RecExiRcc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
      A6573RecPreRec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6573RecPreRec", GXutil.ltrimstr( A6573RecPreRec, 14, 5));
      A8668RecExiTAc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8668RecExiTAc", GXutil.ltrimstr( A8668RecExiTAc, 12, 4));
      A8669RecExiRAc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8669RecExiRAc", GXutil.ltrimstr( A8669RecExiRAc, 12, 4));
      A11195RecUbic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11195RecUbic", A11195RecUbic);
      A11624RecMemCant = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11624RecMemCant", GXutil.str( A11624RecMemCant, 1, 0));
      A12285RecLot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12285RecLot", A12285RecLot);
      A13416RecEstInv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13416RecEstInv", GXutil.str( A13416RecEstInv, 1, 0));
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13455Rechora", localUtil.ttoc( A13455Rechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z809RecExiTeo = DecimalUtil.ZERO ;
      Z807RecExiRea = DecimalUtil.ZERO ;
      Z808RecExiTcc = DecimalUtil.ZERO ;
      Z806RecExiRcc = DecimalUtil.ZERO ;
      Z6573RecPreRec = DecimalUtil.ZERO ;
      Z8668RecExiTAc = DecimalUtil.ZERO ;
      Z8669RecExiRAc = DecimalUtil.ZERO ;
      Z11195RecUbic = "" ;
      Z11624RecMemCant = (byte)(0) ;
      Z12285RecLot = "" ;
      Z13416RecEstInv = (byte)(0) ;
      Z13455Rechora = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1QA98( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A810RecFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
      initializeNonKey1QA98( ) ;
   }

   public void standaloneModalInsert( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016371692", true, true);
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
      httpContext.AddJavascriptSource("recuen.js", "?202661016371693", false, true);
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtRecFec_Internalname = "RECFEC" ;
      edtRecExiTeo_Internalname = "RECEXITEO" ;
      edtRecExiRea_Internalname = "RECEXIREA" ;
      edtRecExiTcc_Internalname = "RECEXITCC" ;
      edtRecExiRcc_Internalname = "RECEXIRCC" ;
      edtRecPreRec_Internalname = "RECPREREC" ;
      edtRecExiTAc_Internalname = "RECEXITAC" ;
      edtRecExiRAc_Internalname = "RECEXIRAC" ;
      edtRecUbic_Internalname = "RECUBIC" ;
      edtRecMemCant_Internalname = "RECMEMCANT" ;
      edtRecLot_Internalname = "RECLOT" ;
      edtRecEstInv_Internalname = "RECESTINV" ;
      edtRechora_Internalname = "RECHORA" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla RECUEN", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRechora_Jsonclick = "" ;
      edtRechora_Enabled = 1 ;
      edtRecEstInv_Jsonclick = "" ;
      edtRecEstInv_Enabled = 1 ;
      edtRecLot_Jsonclick = "" ;
      edtRecLot_Enabled = 1 ;
      edtRecMemCant_Jsonclick = "" ;
      edtRecMemCant_Enabled = 1 ;
      edtRecUbic_Jsonclick = "" ;
      edtRecUbic_Enabled = 1 ;
      edtRecExiRAc_Jsonclick = "" ;
      edtRecExiRAc_Enabled = 1 ;
      edtRecExiTAc_Jsonclick = "" ;
      edtRecExiTAc_Enabled = 1 ;
      edtRecPreRec_Jsonclick = "" ;
      edtRecPreRec_Enabled = 1 ;
      edtRecExiRcc_Jsonclick = "" ;
      edtRecExiRcc_Enabled = 1 ;
      edtRecExiTcc_Jsonclick = "" ;
      edtRecExiTcc_Enabled = 1 ;
      edtRecExiRea_Jsonclick = "" ;
      edtRecExiRea_Enabled = 1 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtRecExiTeo_Enabled = 1 ;
      edtRecFec_Jsonclick = "" ;
      edtRecFec_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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
      /* Using cursor T01QA15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      GX_FocusControl = edtRecExiTeo_Internalname ;
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

   public void valid_Prdnum( )
   {
      /* Using cursor T01QA15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Recfec( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A809RecExiTeo", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A807RecExiRea", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6573RecPreRec", GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8668RecExiTAc", GXutil.ltrim( localUtil.ntoc( A8668RecExiTAc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8669RecExiRAc", GXutil.ltrim( localUtil.ntoc( A8669RecExiRAc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11195RecUbic", GXutil.rtrim( A11195RecUbic));
      httpContext.ajax_rsp_assign_attri("", false, "A11624RecMemCant", GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12285RecLot", GXutil.rtrim( A12285RecLot));
      httpContext.ajax_rsp_assign_attri("", false, "A13416RecEstInv", GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13455Rechora", localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z810RecFec", localUtil.format(Z810RecFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z809RecExiTeo", GXutil.ltrim( localUtil.ntoc( Z809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z807RecExiRea", GXutil.ltrim( localUtil.ntoc( Z807RecExiRea, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z808RecExiTcc", GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z806RecExiRcc", GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6573RecPreRec", GXutil.ltrim( localUtil.ntoc( Z6573RecPreRec, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8668RecExiTAc", GXutil.ltrim( localUtil.ntoc( Z8668RecExiTAc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8669RecExiRAc", GXutil.ltrim( localUtil.ntoc( Z8669RecExiRAc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11195RecUbic", GXutil.rtrim( Z11195RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11624RecMemCant", GXutil.ltrim( localUtil.ntoc( Z11624RecMemCant, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12285RecLot", GXutil.rtrim( Z12285RecLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13416RecEstInv", GXutil.ltrim( localUtil.ntoc( Z13416RecEstInv, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13455Rechora", localUtil.ttoc( Z13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_RECFEC","{handler:'valid_Recfec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECFEC",",oparms:[{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999'},{av:'A8668RecExiTAc',fld:'RECEXITAC',pic:'ZZZZZZ9.9999'},{av:'A8669RecExiRAc',fld:'RECEXIRAC',pic:'ZZZZZZ9.9999'},{av:'A11195RecUbic',fld:'RECUBIC',pic:''},{av:'A11624RecMemCant',fld:'RECMEMCANT',pic:'9'},{av:'A12285RecLot',fld:'RECLOT',pic:''},{av:'A13416RecEstInv',fld:'RECESTINV',pic:'9'},{av:'A13455Rechora',fld:'RECHORA',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z810RecFec'},{av:'Z809RecExiTeo'},{av:'Z807RecExiRea'},{av:'Z808RecExiTcc'},{av:'Z806RecExiRcc'},{av:'Z6573RecPreRec'},{av:'Z8668RecExiTAc'},{av:'Z8669RecExiRAc'},{av:'Z11195RecUbic'},{av:'Z11624RecMemCant'},{av:'Z12285RecLot'},{av:'Z13416RecEstInv'},{av:'Z13455Rechora'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z810RecFec = GXutil.nullDate() ;
      Z809RecExiTeo = DecimalUtil.ZERO ;
      Z807RecExiRea = DecimalUtil.ZERO ;
      Z808RecExiTcc = DecimalUtil.ZERO ;
      Z806RecExiRcc = DecimalUtil.ZERO ;
      Z6573RecPreRec = DecimalUtil.ZERO ;
      Z8668RecExiTAc = DecimalUtil.ZERO ;
      Z8669RecExiRAc = DecimalUtil.ZERO ;
      Z11195RecUbic = "" ;
      Z12285RecLot = "" ;
      Z13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
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
      A810RecFec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A8668RecExiTAc = DecimalUtil.ZERO ;
      A8669RecExiRAc = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
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
      T01QA5_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA5_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA5_A11195RecUbic = new String[] {""} ;
      T01QA5_A11624RecMemCant = new byte[1] ;
      T01QA5_A12285RecLot = new String[] {""} ;
      T01QA5_A13416RecEstInv = new byte[1] ;
      T01QA5_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA5_A396EmprCod = new String[] {""} ;
      T01QA5_A719PrdNum = new String[] {""} ;
      T01QA4_A396EmprCod = new String[] {""} ;
      T01QA6_A396EmprCod = new String[] {""} ;
      T01QA7_A396EmprCod = new String[] {""} ;
      T01QA7_A719PrdNum = new String[] {""} ;
      T01QA7_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA3_A11195RecUbic = new String[] {""} ;
      T01QA3_A11624RecMemCant = new byte[1] ;
      T01QA3_A12285RecLot = new String[] {""} ;
      T01QA3_A13416RecEstInv = new byte[1] ;
      T01QA3_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA3_A396EmprCod = new String[] {""} ;
      T01QA3_A719PrdNum = new String[] {""} ;
      sMode98 = "" ;
      T01QA8_A396EmprCod = new String[] {""} ;
      T01QA8_A719PrdNum = new String[] {""} ;
      T01QA8_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA9_A396EmprCod = new String[] {""} ;
      T01QA9_A719PrdNum = new String[] {""} ;
      T01QA9_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QA2_A11195RecUbic = new String[] {""} ;
      T01QA2_A11624RecMemCant = new byte[1] ;
      T01QA2_A12285RecLot = new String[] {""} ;
      T01QA2_A13416RecEstInv = new byte[1] ;
      T01QA2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA2_A396EmprCod = new String[] {""} ;
      T01QA2_A719PrdNum = new String[] {""} ;
      T01QA13_A396EmprCod = new String[] {""} ;
      T01QA13_A719PrdNum = new String[] {""} ;
      T01QA13_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QA13_A8908CC_AlmCod = new byte[1] ;
      T01QA14_A396EmprCod = new String[] {""} ;
      T01QA14_A719PrdNum = new String[] {""} ;
      T01QA14_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QA15_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ810RecFec = GXutil.nullDate() ;
      ZZ809RecExiTeo = DecimalUtil.ZERO ;
      ZZ807RecExiRea = DecimalUtil.ZERO ;
      ZZ808RecExiTcc = DecimalUtil.ZERO ;
      ZZ806RecExiRcc = DecimalUtil.ZERO ;
      ZZ6573RecPreRec = DecimalUtil.ZERO ;
      ZZ8668RecExiTAc = DecimalUtil.ZERO ;
      ZZ8669RecExiRAc = DecimalUtil.ZERO ;
      ZZ11195RecUbic = "" ;
      ZZ12285RecLot = "" ;
      ZZ13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recuen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recuen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recuen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuen__default(),
         new Object[] {
             new Object[] {
            T01QA2_A810RecFec, T01QA2_A809RecExiTeo, T01QA2_A807RecExiRea, T01QA2_A808RecExiTcc, T01QA2_A806RecExiRcc, T01QA2_A6573RecPreRec, T01QA2_A8668RecExiTAc, T01QA2_A8669RecExiRAc, T01QA2_A11195RecUbic, T01QA2_A11624RecMemCant,
            T01QA2_A12285RecLot, T01QA2_A13416RecEstInv, T01QA2_A13455Rechora, T01QA2_A396EmprCod, T01QA2_A719PrdNum
            }
            , new Object[] {
            T01QA3_A810RecFec, T01QA3_A809RecExiTeo, T01QA3_A807RecExiRea, T01QA3_A808RecExiTcc, T01QA3_A806RecExiRcc, T01QA3_A6573RecPreRec, T01QA3_A8668RecExiTAc, T01QA3_A8669RecExiRAc, T01QA3_A11195RecUbic, T01QA3_A11624RecMemCant,
            T01QA3_A12285RecLot, T01QA3_A13416RecEstInv, T01QA3_A13455Rechora, T01QA3_A396EmprCod, T01QA3_A719PrdNum
            }
            , new Object[] {
            T01QA4_A396EmprCod
            }
            , new Object[] {
            T01QA5_A810RecFec, T01QA5_A809RecExiTeo, T01QA5_A807RecExiRea, T01QA5_A808RecExiTcc, T01QA5_A806RecExiRcc, T01QA5_A6573RecPreRec, T01QA5_A8668RecExiTAc, T01QA5_A8669RecExiRAc, T01QA5_A11195RecUbic, T01QA5_A11624RecMemCant,
            T01QA5_A12285RecLot, T01QA5_A13416RecEstInv, T01QA5_A13455Rechora, T01QA5_A396EmprCod, T01QA5_A719PrdNum
            }
            , new Object[] {
            T01QA6_A396EmprCod
            }
            , new Object[] {
            T01QA7_A396EmprCod, T01QA7_A719PrdNum, T01QA7_A810RecFec
            }
            , new Object[] {
            T01QA8_A396EmprCod, T01QA8_A719PrdNum, T01QA8_A810RecFec
            }
            , new Object[] {
            T01QA9_A396EmprCod, T01QA9_A719PrdNum, T01QA9_A810RecFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QA13_A396EmprCod, T01QA13_A719PrdNum, T01QA13_A810RecFec, T01QA13_A8908CC_AlmCod
            }
            , new Object[] {
            T01QA14_A396EmprCod, T01QA14_A719PrdNum, T01QA14_A810RecFec
            }
            , new Object[] {
            T01QA15_A396EmprCod
            }
         }
      );
   }

   private byte Z11624RecMemCant ;
   private byte Z13416RecEstInv ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11624RecMemCant ;
   private byte A13416RecEstInv ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11624RecMemCant ;
   private byte ZZ13416RecEstInv ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound98 ;
   private short nIsDirty_98 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtRecFec_Enabled ;
   private int edtRecExiTeo_Enabled ;
   private int edtRecExiRea_Enabled ;
   private int edtRecExiTcc_Enabled ;
   private int edtRecExiRcc_Enabled ;
   private int edtRecPreRec_Enabled ;
   private int edtRecExiTAc_Enabled ;
   private int edtRecExiRAc_Enabled ;
   private int edtRecUbic_Enabled ;
   private int edtRecMemCant_Enabled ;
   private int edtRecLot_Enabled ;
   private int edtRecEstInv_Enabled ;
   private int edtRechora_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z809RecExiTeo ;
   private java.math.BigDecimal Z807RecExiRea ;
   private java.math.BigDecimal Z808RecExiTcc ;
   private java.math.BigDecimal Z806RecExiRcc ;
   private java.math.BigDecimal Z6573RecPreRec ;
   private java.math.BigDecimal Z8668RecExiTAc ;
   private java.math.BigDecimal Z8669RecExiRAc ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A8668RecExiTAc ;
   private java.math.BigDecimal A8669RecExiRAc ;
   private java.math.BigDecimal ZZ809RecExiTeo ;
   private java.math.BigDecimal ZZ807RecExiRea ;
   private java.math.BigDecimal ZZ808RecExiTcc ;
   private java.math.BigDecimal ZZ806RecExiRcc ;
   private java.math.BigDecimal ZZ6573RecPreRec ;
   private java.math.BigDecimal ZZ8668RecExiTAc ;
   private java.math.BigDecimal ZZ8669RecExiRAc ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11195RecUbic ;
   private String Z12285RecLot ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtRecFec_Internalname ;
   private String edtRecFec_Jsonclick ;
   private String edtRecExiTeo_Internalname ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtRecExiRea_Internalname ;
   private String edtRecExiRea_Jsonclick ;
   private String edtRecExiTcc_Internalname ;
   private String edtRecExiTcc_Jsonclick ;
   private String edtRecExiRcc_Internalname ;
   private String edtRecExiRcc_Jsonclick ;
   private String edtRecPreRec_Internalname ;
   private String edtRecPreRec_Jsonclick ;
   private String edtRecExiTAc_Internalname ;
   private String edtRecExiTAc_Jsonclick ;
   private String edtRecExiRAc_Internalname ;
   private String edtRecExiRAc_Jsonclick ;
   private String edtRecUbic_Internalname ;
   private String A11195RecUbic ;
   private String edtRecUbic_Jsonclick ;
   private String edtRecMemCant_Internalname ;
   private String edtRecMemCant_Jsonclick ;
   private String edtRecLot_Internalname ;
   private String A12285RecLot ;
   private String edtRecLot_Jsonclick ;
   private String edtRecEstInv_Internalname ;
   private String edtRecEstInv_Jsonclick ;
   private String edtRechora_Internalname ;
   private String edtRechora_Jsonclick ;
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
   private String sMode98 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ11195RecUbic ;
   private String ZZ12285RecLot ;
   private java.util.Date Z13455Rechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date ZZ13455Rechora ;
   private java.util.Date Z810RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date ZZ810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01QA5_A810RecFec ;
   private java.math.BigDecimal[] T01QA5_A809RecExiTeo ;
   private java.math.BigDecimal[] T01QA5_A807RecExiRea ;
   private java.math.BigDecimal[] T01QA5_A808RecExiTcc ;
   private java.math.BigDecimal[] T01QA5_A806RecExiRcc ;
   private java.math.BigDecimal[] T01QA5_A6573RecPreRec ;
   private java.math.BigDecimal[] T01QA5_A8668RecExiTAc ;
   private java.math.BigDecimal[] T01QA5_A8669RecExiRAc ;
   private String[] T01QA5_A11195RecUbic ;
   private byte[] T01QA5_A11624RecMemCant ;
   private String[] T01QA5_A12285RecLot ;
   private byte[] T01QA5_A13416RecEstInv ;
   private java.util.Date[] T01QA5_A13455Rechora ;
   private String[] T01QA5_A396EmprCod ;
   private String[] T01QA5_A719PrdNum ;
   private String[] T01QA4_A396EmprCod ;
   private String[] T01QA6_A396EmprCod ;
   private String[] T01QA7_A396EmprCod ;
   private String[] T01QA7_A719PrdNum ;
   private java.util.Date[] T01QA7_A810RecFec ;
   private java.util.Date[] T01QA3_A810RecFec ;
   private java.math.BigDecimal[] T01QA3_A809RecExiTeo ;
   private java.math.BigDecimal[] T01QA3_A807RecExiRea ;
   private java.math.BigDecimal[] T01QA3_A808RecExiTcc ;
   private java.math.BigDecimal[] T01QA3_A806RecExiRcc ;
   private java.math.BigDecimal[] T01QA3_A6573RecPreRec ;
   private java.math.BigDecimal[] T01QA3_A8668RecExiTAc ;
   private java.math.BigDecimal[] T01QA3_A8669RecExiRAc ;
   private String[] T01QA3_A11195RecUbic ;
   private byte[] T01QA3_A11624RecMemCant ;
   private String[] T01QA3_A12285RecLot ;
   private byte[] T01QA3_A13416RecEstInv ;
   private java.util.Date[] T01QA3_A13455Rechora ;
   private String[] T01QA3_A396EmprCod ;
   private String[] T01QA3_A719PrdNum ;
   private String[] T01QA8_A396EmprCod ;
   private String[] T01QA8_A719PrdNum ;
   private java.util.Date[] T01QA8_A810RecFec ;
   private String[] T01QA9_A396EmprCod ;
   private String[] T01QA9_A719PrdNum ;
   private java.util.Date[] T01QA9_A810RecFec ;
   private java.util.Date[] T01QA2_A810RecFec ;
   private java.math.BigDecimal[] T01QA2_A809RecExiTeo ;
   private java.math.BigDecimal[] T01QA2_A807RecExiRea ;
   private java.math.BigDecimal[] T01QA2_A808RecExiTcc ;
   private java.math.BigDecimal[] T01QA2_A806RecExiRcc ;
   private java.math.BigDecimal[] T01QA2_A6573RecPreRec ;
   private java.math.BigDecimal[] T01QA2_A8668RecExiTAc ;
   private java.math.BigDecimal[] T01QA2_A8669RecExiRAc ;
   private String[] T01QA2_A11195RecUbic ;
   private byte[] T01QA2_A11624RecMemCant ;
   private String[] T01QA2_A12285RecLot ;
   private byte[] T01QA2_A13416RecEstInv ;
   private java.util.Date[] T01QA2_A13455Rechora ;
   private String[] T01QA2_A396EmprCod ;
   private String[] T01QA2_A719PrdNum ;
   private String[] T01QA13_A396EmprCod ;
   private String[] T01QA13_A719PrdNum ;
   private java.util.Date[] T01QA13_A810RecFec ;
   private byte[] T01QA13_A8908CC_AlmCod ;
   private String[] T01QA14_A396EmprCod ;
   private String[] T01QA14_A719PrdNum ;
   private java.util.Date[] T01QA14_A810RecFec ;
   private String[] T01QA15_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class recuen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recuen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recuen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recuen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QA2", "SELECT RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod, PrdNum FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?  FOR UPDATE OF RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA3", "SELECT RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod, PrdNum FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA4", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA5", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecFec, TM1.RecExiTeo, TM1.RecExiRea, TM1.RecExiTcc, TM1.RecExiRcc, TM1.RecPreRec, TM1.RecExiTAc, TM1.RecExiRAc, TM1.RecUbic, TM1.RecMemCant, TM1.RecLot, TM1.RecEstInv, TM1.Rechora, TM1.EmprCod, TM1.PrdNum FROM TXPRECUEN TM1 WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.RecFec = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.RecFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA6", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and RecFec > ?) ORDER BY EmprCod, PrdNum, RecFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QA9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and RecFec < ?) ORDER BY EmprCod DESC, PrdNum DESC, RecFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QA10", "INSERT INTO TXPRECUEN(RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECUEN")
         ,new UpdateCursor("T01QA11", "UPDATE TXPRECUEN SET RecExiTeo=?, RecExiRea=?, RecExiTcc=?, RecExiRcc=?, RecPreRec=?, RecExiTAc=?, RecExiRAc=?, RecUbic=?, RecMemCant=?, RecLot=?, RecEstInv=?, Rechora=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK, "TXPRECUEN")
         ,new UpdateCursor("T01QA12", "DELETE FROM TXPRECUEN  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK, "TXPRECUEN")
         ,new ForEachCursor("T01QA13", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec, CC_AlmCod FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QA14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN ORDER BY EmprCod, PrdNum, RecFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QA15", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 4);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 26);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 6);
               return;
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 26);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setDateTime(12, (java.util.Date)parms[11], false);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setString(14, (String)parms[13], 6);
               stmt.setDate(15, (java.util.Date)parms[14]);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

