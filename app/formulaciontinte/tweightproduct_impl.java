package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tweightproduct_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "tabla TWeightProduct", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtWP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tweightproduct_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tweightproduct_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tweightproduct_impl.class ));
   }

   public tweightproduct_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "tabla TWeightProduct", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TWeightProduct.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_FormulacionTinte\\TWeightProduct.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_ID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_ID_Internalname, httpContext.getMessage( "ID", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A13948WP_ID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_ID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13948WP_ID), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13948WP_ID), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_ID_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_ID_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_Start_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_Start_Internalname, httpContext.getMessage( "Date Time Start", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtWP_Start_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_Start_Internalname, localUtil.ttoc( A13949WP_Start, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13949WP_Start, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_Start_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_Start_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtWP_Start_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtWP_Start_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_Date_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_Date_Internalname, httpContext.getMessage( "Date Time", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtWP_Date_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_Date_Internalname, localUtil.ttoc( A13950WP_Date, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13950WP_Date, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_Date_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_Date_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtWP_Date_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtWP_Date_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_BatchCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_BatchCo_Internalname, httpContext.getMessage( "Batch Code", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_BatchCo_Internalname, A13951WP_BatchCo, GXutil.rtrim( localUtil.format( A13951WP_BatchCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_BatchCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_BatchCo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_CallOff_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_CallOff_Internalname, httpContext.getMessage( "Call Off", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_CallOff_Internalname, GXutil.ltrim( localUtil.ntoc( A13952WP_CallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_CallOff_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13952WP_CallOff), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13952WP_CallOff), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_CallOff_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_CallOff_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_ReDyeCS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_ReDyeCS_Internalname, httpContext.getMessage( "Re Dye", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_ReDyeCS_Internalname, GXutil.ltrim( localUtil.ntoc( A13953WP_ReDyeCS, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_ReDyeCS_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_ReDyeCS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_ReDyeCS_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_Machine_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_Machine_Internalname, httpContext.getMessage( "Machine", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_Machine_Internalname, A13954WP_Machine, GXutil.rtrim( localUtil.format( A13954WP_Machine, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_Machine_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_Machine_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_TankCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_TankCod_Internalname, httpContext.getMessage( "Tank", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_TankCod_Internalname, GXutil.ltrim( localUtil.ntoc( A13955WP_TankCod, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_TankCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13955WP_TankCod), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13955WP_TankCod), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_TankCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_TankCod_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_Product_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_Product_Internalname, httpContext.getMessage( "Product", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_Product_Internalname, A13956WP_Product, GXutil.rtrim( localUtil.format( A13956WP_Product, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_Product_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_Product_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_ToDose_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_ToDose_Internalname, httpContext.getMessage( "To Dose", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_ToDose_Internalname, GXutil.ltrim( localUtil.ntoc( A13957WP_ToDose, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_ToDose_Enabled!=0) ? localUtil.format( A13957WP_ToDose, "ZZZZZZ9.99") : localUtil.format( A13957WP_ToDose, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_ToDose_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_ToDose_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_Dosed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_Dosed_Internalname, httpContext.getMessage( "Dosed", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_Dosed_Internalname, GXutil.ltrim( localUtil.ntoc( A13958WP_Dosed, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_Dosed_Enabled!=0) ? localUtil.format( A13958WP_Dosed, "ZZZZZZ9.99") : localUtil.format( A13958WP_Dosed, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_Dosed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_Dosed_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_ProdBat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_ProdBat_Internalname, httpContext.getMessage( "Batch", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_ProdBat_Internalname, A13959WP_ProdBat, GXutil.rtrim( localUtil.format( A13959WP_ProdBat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_ProdBat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_ProdBat_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_DosingO_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_DosingO_Internalname, httpContext.getMessage( "Dosing Origin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_DosingO_Internalname, GXutil.ltrim( localUtil.ntoc( A13960WP_DosingO, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_DosingO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13960WP_DosingO), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13960WP_DosingO), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_DosingO_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_DosingO_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtWP_StatusC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtWP_StatusC_Internalname, httpContext.getMessage( "Status", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWP_StatusC_Internalname, GXutil.ltrim( localUtil.ntoc( A13961WP_StatusC, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWP_StatusC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13961WP_StatusC), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13961WP_StatusC), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWP_StatusC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtWP_StatusC_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TWeightProduct.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TWeightProduct.htm");
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
      e111RU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z13948WP_ID = localUtil.ctol( httpContext.cgiGet( "Z13948WP_ID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z13949WP_Start = localUtil.ctot( httpContext.cgiGet( "Z13949WP_Start"), 0) ;
            Z13950WP_Date = localUtil.ctot( httpContext.cgiGet( "Z13950WP_Date"), 0) ;
            Z13951WP_BatchCo = httpContext.cgiGet( "Z13951WP_BatchCo") ;
            Z13952WP_CallOff = (int)(localUtil.ctol( httpContext.cgiGet( "Z13952WP_CallOff"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13953WP_ReDyeCS = (int)(localUtil.ctol( httpContext.cgiGet( "Z13953WP_ReDyeCS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13954WP_Machine = httpContext.cgiGet( "Z13954WP_Machine") ;
            Z13955WP_TankCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z13955WP_TankCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13956WP_Product = httpContext.cgiGet( "Z13956WP_Product") ;
            Z13957WP_ToDose = localUtil.ctond( httpContext.cgiGet( "Z13957WP_ToDose")) ;
            Z13958WP_Dosed = localUtil.ctond( httpContext.cgiGet( "Z13958WP_Dosed")) ;
            Z13959WP_ProdBat = httpContext.cgiGet( "Z13959WP_ProdBat") ;
            Z13960WP_DosingO = (int)(localUtil.ctol( httpContext.cgiGet( "Z13960WP_DosingO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13961WP_StatusC = (int)(localUtil.ctol( httpContext.cgiGet( "Z13961WP_StatusC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtWP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtWP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13948WP_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
            }
            else
            {
               A13948WP_ID = localUtil.ctol( httpContext.cgiGet( edtWP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtWP_Start_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "WP_START");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_Start_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A13949WP_Start", localUtil.ttoc( A13949WP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13949WP_Start = localUtil.ctot( httpContext.cgiGet( edtWP_Start_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13949WP_Start", localUtil.ttoc( A13949WP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtWP_Date_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "WP_DATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_Date_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A13950WP_Date", localUtil.ttoc( A13950WP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13950WP_Date = localUtil.ctot( httpContext.cgiGet( edtWP_Date_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13950WP_Date", localUtil.ttoc( A13950WP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A13951WP_BatchCo = httpContext.cgiGet( edtWP_BatchCo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13951WP_BatchCo", A13951WP_BatchCo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtWP_CallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtWP_CallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_CALLOFF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_CallOff_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13952WP_CallOff = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13952WP_CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13952WP_CallOff), 5, 0));
            }
            else
            {
               A13952WP_CallOff = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_CallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13952WP_CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13952WP_CallOff), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtWP_ReDyeCS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtWP_ReDyeCS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_REDYECS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_ReDyeCS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13953WP_ReDyeCS = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13953WP_ReDyeCS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), 5, 0));
            }
            else
            {
               A13953WP_ReDyeCS = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_ReDyeCS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13953WP_ReDyeCS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), 5, 0));
            }
            A13954WP_Machine = httpContext.cgiGet( edtWP_Machine_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13954WP_Machine", A13954WP_Machine);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtWP_TankCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtWP_TankCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_TANKCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_TankCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13955WP_TankCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13955WP_TankCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13955WP_TankCod), 5, 0));
            }
            else
            {
               A13955WP_TankCod = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_TankCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13955WP_TankCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13955WP_TankCod), 5, 0));
            }
            A13956WP_Product = httpContext.cgiGet( edtWP_Product_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13956WP_Product", A13956WP_Product);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtWP_ToDose_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtWP_ToDose_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_TODOSE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_ToDose_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13957WP_ToDose = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A13957WP_ToDose", GXutil.ltrimstr( A13957WP_ToDose, 10, 2));
            }
            else
            {
               A13957WP_ToDose = localUtil.ctond( httpContext.cgiGet( edtWP_ToDose_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13957WP_ToDose", GXutil.ltrimstr( A13957WP_ToDose, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtWP_Dosed_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtWP_Dosed_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_DOSED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_Dosed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13958WP_Dosed = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A13958WP_Dosed", GXutil.ltrimstr( A13958WP_Dosed, 10, 2));
            }
            else
            {
               A13958WP_Dosed = localUtil.ctond( httpContext.cgiGet( edtWP_Dosed_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13958WP_Dosed", GXutil.ltrimstr( A13958WP_Dosed, 10, 2));
            }
            A13959WP_ProdBat = httpContext.cgiGet( edtWP_ProdBat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13959WP_ProdBat", A13959WP_ProdBat);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtWP_DosingO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtWP_DosingO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_DOSINGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_DosingO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13960WP_DosingO = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13960WP_DosingO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13960WP_DosingO), 5, 0));
            }
            else
            {
               A13960WP_DosingO = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_DosingO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13960WP_DosingO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13960WP_DosingO), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtWP_StatusC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtWP_StatusC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WP_STATUSC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_StatusC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13961WP_StatusC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13961WP_StatusC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13961WP_StatusC), 5, 0));
            }
            else
            {
               A13961WP_StatusC = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_StatusC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13961WP_StatusC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13961WP_StatusC), 5, 0));
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
               A13948WP_ID = GXutil.lval( httpContext.GetPar( "WP_ID")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
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
                        e111RU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1RU1880( ) ;
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
      disableAttributes1RU1880( ) ;
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

   public void resetCaption1RU0( )
   {
   }

   public void e111RU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tweightproduct_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tweightproduct_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tweightproduct_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
   }

   public void zm1RU1880( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13949WP_Start = T01RU3_A13949WP_Start[0] ;
            Z13950WP_Date = T01RU3_A13950WP_Date[0] ;
            Z13951WP_BatchCo = T01RU3_A13951WP_BatchCo[0] ;
            Z13952WP_CallOff = T01RU3_A13952WP_CallOff[0] ;
            Z13953WP_ReDyeCS = T01RU3_A13953WP_ReDyeCS[0] ;
            Z13954WP_Machine = T01RU3_A13954WP_Machine[0] ;
            Z13955WP_TankCod = T01RU3_A13955WP_TankCod[0] ;
            Z13956WP_Product = T01RU3_A13956WP_Product[0] ;
            Z13957WP_ToDose = T01RU3_A13957WP_ToDose[0] ;
            Z13958WP_Dosed = T01RU3_A13958WP_Dosed[0] ;
            Z13959WP_ProdBat = T01RU3_A13959WP_ProdBat[0] ;
            Z13960WP_DosingO = T01RU3_A13960WP_DosingO[0] ;
            Z13961WP_StatusC = T01RU3_A13961WP_StatusC[0] ;
         }
         else
         {
            Z13949WP_Start = A13949WP_Start ;
            Z13950WP_Date = A13950WP_Date ;
            Z13951WP_BatchCo = A13951WP_BatchCo ;
            Z13952WP_CallOff = A13952WP_CallOff ;
            Z13953WP_ReDyeCS = A13953WP_ReDyeCS ;
            Z13954WP_Machine = A13954WP_Machine ;
            Z13955WP_TankCod = A13955WP_TankCod ;
            Z13956WP_Product = A13956WP_Product ;
            Z13957WP_ToDose = A13957WP_ToDose ;
            Z13958WP_Dosed = A13958WP_Dosed ;
            Z13959WP_ProdBat = A13959WP_ProdBat ;
            Z13960WP_DosingO = A13960WP_DosingO ;
            Z13961WP_StatusC = A13961WP_StatusC ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13948WP_ID = A13948WP_ID ;
         Z13949WP_Start = A13949WP_Start ;
         Z13950WP_Date = A13950WP_Date ;
         Z13951WP_BatchCo = A13951WP_BatchCo ;
         Z13952WP_CallOff = A13952WP_CallOff ;
         Z13953WP_ReDyeCS = A13953WP_ReDyeCS ;
         Z13954WP_Machine = A13954WP_Machine ;
         Z13955WP_TankCod = A13955WP_TankCod ;
         Z13956WP_Product = A13956WP_Product ;
         Z13957WP_ToDose = A13957WP_ToDose ;
         Z13958WP_Dosed = A13958WP_Dosed ;
         Z13959WP_ProdBat = A13959WP_ProdBat ;
         Z13960WP_DosingO = A13960WP_DosingO ;
         Z13961WP_StatusC = A13961WP_StatusC ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "FormulacionTinte.TWeightProduct" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
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

   public void load1RU1880( )
   {
      /* Using cursor T01RU4 */
      pr_colorservice.execute(2, new Object[] {Long.valueOf(A13948WP_ID)});
      if ( (pr_colorservice.getStatus(2) != 101) )
      {
         RcdFound1880 = (short)(1) ;
         A13949WP_Start = T01RU4_A13949WP_Start[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13949WP_Start", localUtil.ttoc( A13949WP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13950WP_Date = T01RU4_A13950WP_Date[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13950WP_Date", localUtil.ttoc( A13950WP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13951WP_BatchCo = T01RU4_A13951WP_BatchCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13951WP_BatchCo", A13951WP_BatchCo);
         A13952WP_CallOff = T01RU4_A13952WP_CallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13952WP_CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13952WP_CallOff), 5, 0));
         A13953WP_ReDyeCS = T01RU4_A13953WP_ReDyeCS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13953WP_ReDyeCS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), 5, 0));
         A13954WP_Machine = T01RU4_A13954WP_Machine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13954WP_Machine", A13954WP_Machine);
         A13955WP_TankCod = T01RU4_A13955WP_TankCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13955WP_TankCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13955WP_TankCod), 5, 0));
         A13956WP_Product = T01RU4_A13956WP_Product[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13956WP_Product", A13956WP_Product);
         A13957WP_ToDose = T01RU4_A13957WP_ToDose[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13957WP_ToDose", GXutil.ltrimstr( A13957WP_ToDose, 10, 2));
         A13958WP_Dosed = T01RU4_A13958WP_Dosed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13958WP_Dosed", GXutil.ltrimstr( A13958WP_Dosed, 10, 2));
         A13959WP_ProdBat = T01RU4_A13959WP_ProdBat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13959WP_ProdBat", A13959WP_ProdBat);
         A13960WP_DosingO = T01RU4_A13960WP_DosingO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13960WP_DosingO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13960WP_DosingO), 5, 0));
         A13961WP_StatusC = T01RU4_A13961WP_StatusC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13961WP_StatusC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13961WP_StatusC), 5, 0));
         zm1RU1880( -1) ;
      }
      pr_colorservice.close(2);
      onLoadActions1RU1880( ) ;
   }

   public void onLoadActions1RU1880( )
   {
   }

   public void checkExtendedTable1RU1880( )
   {
      nIsDirty_1880 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1RU1880( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1RU1880( )
   {
      /* Using cursor T01RU5 */
      pr_colorservice.execute(3, new Object[] {Long.valueOf(A13948WP_ID)});
      if ( (pr_colorservice.getStatus(3) != 101) )
      {
         RcdFound1880 = (short)(1) ;
      }
      else
      {
         RcdFound1880 = (short)(0) ;
      }
      pr_colorservice.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RU3 */
      pr_colorservice.execute(1, new Object[] {Long.valueOf(A13948WP_ID)});
      if ( (pr_colorservice.getStatus(1) != 101) )
      {
         zm1RU1880( 1) ;
         RcdFound1880 = (short)(1) ;
         A13948WP_ID = T01RU3_A13948WP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
         A13949WP_Start = T01RU3_A13949WP_Start[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13949WP_Start", localUtil.ttoc( A13949WP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13950WP_Date = T01RU3_A13950WP_Date[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13950WP_Date", localUtil.ttoc( A13950WP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13951WP_BatchCo = T01RU3_A13951WP_BatchCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13951WP_BatchCo", A13951WP_BatchCo);
         A13952WP_CallOff = T01RU3_A13952WP_CallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13952WP_CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13952WP_CallOff), 5, 0));
         A13953WP_ReDyeCS = T01RU3_A13953WP_ReDyeCS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13953WP_ReDyeCS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), 5, 0));
         A13954WP_Machine = T01RU3_A13954WP_Machine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13954WP_Machine", A13954WP_Machine);
         A13955WP_TankCod = T01RU3_A13955WP_TankCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13955WP_TankCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13955WP_TankCod), 5, 0));
         A13956WP_Product = T01RU3_A13956WP_Product[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13956WP_Product", A13956WP_Product);
         A13957WP_ToDose = T01RU3_A13957WP_ToDose[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13957WP_ToDose", GXutil.ltrimstr( A13957WP_ToDose, 10, 2));
         A13958WP_Dosed = T01RU3_A13958WP_Dosed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13958WP_Dosed", GXutil.ltrimstr( A13958WP_Dosed, 10, 2));
         A13959WP_ProdBat = T01RU3_A13959WP_ProdBat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13959WP_ProdBat", A13959WP_ProdBat);
         A13960WP_DosingO = T01RU3_A13960WP_DosingO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13960WP_DosingO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13960WP_DosingO), 5, 0));
         A13961WP_StatusC = T01RU3_A13961WP_StatusC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13961WP_StatusC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13961WP_StatusC), 5, 0));
         Z13948WP_ID = A13948WP_ID ;
         sMode1880 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RU1880( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1880 = (short)(0) ;
            initializeNonKey1RU1880( ) ;
         }
         Gx_mode = sMode1880 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1880 = (short)(0) ;
         initializeNonKey1RU1880( ) ;
         sMode1880 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1880 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_colorservice.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RU1880( ) ;
      if ( RcdFound1880 == 0 )
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
      RcdFound1880 = (short)(0) ;
      /* Using cursor T01RU6 */
      pr_colorservice.execute(4, new Object[] {Long.valueOf(A13948WP_ID)});
      if ( (pr_colorservice.getStatus(4) != 101) )
      {
         while ( (pr_colorservice.getStatus(4) != 101) && ( ( T01RU6_A13948WP_ID[0] < A13948WP_ID ) ) )
         {
            pr_colorservice.readNext(4);
         }
         if ( (pr_colorservice.getStatus(4) != 101) && ( ( T01RU6_A13948WP_ID[0] > A13948WP_ID ) ) )
         {
            A13948WP_ID = T01RU6_A13948WP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
            RcdFound1880 = (short)(1) ;
         }
      }
      pr_colorservice.close(4);
   }

   public void move_previous( )
   {
      RcdFound1880 = (short)(0) ;
      /* Using cursor T01RU7 */
      pr_colorservice.execute(5, new Object[] {Long.valueOf(A13948WP_ID)});
      if ( (pr_colorservice.getStatus(5) != 101) )
      {
         while ( (pr_colorservice.getStatus(5) != 101) && ( ( T01RU7_A13948WP_ID[0] > A13948WP_ID ) ) )
         {
            pr_colorservice.readNext(5);
         }
         if ( (pr_colorservice.getStatus(5) != 101) && ( ( T01RU7_A13948WP_ID[0] < A13948WP_ID ) ) )
         {
            A13948WP_ID = T01RU7_A13948WP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
            RcdFound1880 = (short)(1) ;
         }
      }
      pr_colorservice.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RU1880( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtWP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RU1880( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1880 == 1 )
         {
            if ( A13948WP_ID != Z13948WP_ID )
            {
               A13948WP_ID = Z13948WP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "WP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtWP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1RU1880( ) ;
               GX_FocusControl = edtWP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A13948WP_ID != Z13948WP_ID )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtWP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RU1880( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "WP_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtWP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtWP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RU1880( ) ;
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
      if ( A13948WP_ID != Z13948WP_ID )
      {
         A13948WP_ID = Z13948WP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "WP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtWP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtWP_ID_Internalname ;
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
      if ( RcdFound1880 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "WP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtWP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtWP_Start_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1RU1880( ) ;
      if ( RcdFound1880 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtWP_Start_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RU1880( ) ;
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
      if ( RcdFound1880 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtWP_Start_Internalname ;
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
      if ( RcdFound1880 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtWP_Start_Internalname ;
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
      scanStart1RU1880( ) ;
      if ( RcdFound1880 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1880 != 0 )
         {
            scanNext1RU1880( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtWP_Start_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1RU1880( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RU1880( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RU2 */
         pr_colorservice.execute(0, new Object[] {Long.valueOf(A13948WP_ID)});
         if ( (pr_colorservice.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPWEIGHTPRODUCT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_colorservice.getStatus(0) == 101) || !( GXutil.dateCompare(Z13949WP_Start, T01RU2_A13949WP_Start[0]) ) || !( GXutil.dateCompare(Z13950WP_Date, T01RU2_A13950WP_Date[0]) ) || ( GXutil.strcmp(Z13951WP_BatchCo, T01RU2_A13951WP_BatchCo[0]) != 0 ) || ( Z13952WP_CallOff != T01RU2_A13952WP_CallOff[0] ) || ( Z13953WP_ReDyeCS != T01RU2_A13953WP_ReDyeCS[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13954WP_Machine, T01RU2_A13954WP_Machine[0]) != 0 ) || ( Z13955WP_TankCod != T01RU2_A13955WP_TankCod[0] ) || ( GXutil.strcmp(Z13956WP_Product, T01RU2_A13956WP_Product[0]) != 0 ) || ( DecimalUtil.compareTo(Z13957WP_ToDose, T01RU2_A13957WP_ToDose[0]) != 0 ) || ( DecimalUtil.compareTo(Z13958WP_Dosed, T01RU2_A13958WP_Dosed[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13959WP_ProdBat, T01RU2_A13959WP_ProdBat[0]) != 0 ) || ( Z13960WP_DosingO != T01RU2_A13960WP_DosingO[0] ) || ( Z13961WP_StatusC != T01RU2_A13961WP_StatusC[0] ) )
         {
            if ( !( GXutil.dateCompare(Z13949WP_Start, T01RU2_A13949WP_Start[0]) ) )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_Start");
               GXutil.writeLogRaw("Old: ",Z13949WP_Start);
               GXutil.writeLogRaw("Current: ",T01RU2_A13949WP_Start[0]);
            }
            if ( !( GXutil.dateCompare(Z13950WP_Date, T01RU2_A13950WP_Date[0]) ) )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_Date");
               GXutil.writeLogRaw("Old: ",Z13950WP_Date);
               GXutil.writeLogRaw("Current: ",T01RU2_A13950WP_Date[0]);
            }
            if ( GXutil.strcmp(Z13951WP_BatchCo, T01RU2_A13951WP_BatchCo[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_BatchCo");
               GXutil.writeLogRaw("Old: ",Z13951WP_BatchCo);
               GXutil.writeLogRaw("Current: ",T01RU2_A13951WP_BatchCo[0]);
            }
            if ( Z13952WP_CallOff != T01RU2_A13952WP_CallOff[0] )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_CallOff");
               GXutil.writeLogRaw("Old: ",Z13952WP_CallOff);
               GXutil.writeLogRaw("Current: ",T01RU2_A13952WP_CallOff[0]);
            }
            if ( Z13953WP_ReDyeCS != T01RU2_A13953WP_ReDyeCS[0] )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_ReDyeCS");
               GXutil.writeLogRaw("Old: ",Z13953WP_ReDyeCS);
               GXutil.writeLogRaw("Current: ",T01RU2_A13953WP_ReDyeCS[0]);
            }
            if ( GXutil.strcmp(Z13954WP_Machine, T01RU2_A13954WP_Machine[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_Machine");
               GXutil.writeLogRaw("Old: ",Z13954WP_Machine);
               GXutil.writeLogRaw("Current: ",T01RU2_A13954WP_Machine[0]);
            }
            if ( Z13955WP_TankCod != T01RU2_A13955WP_TankCod[0] )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_TankCod");
               GXutil.writeLogRaw("Old: ",Z13955WP_TankCod);
               GXutil.writeLogRaw("Current: ",T01RU2_A13955WP_TankCod[0]);
            }
            if ( GXutil.strcmp(Z13956WP_Product, T01RU2_A13956WP_Product[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_Product");
               GXutil.writeLogRaw("Old: ",Z13956WP_Product);
               GXutil.writeLogRaw("Current: ",T01RU2_A13956WP_Product[0]);
            }
            if ( DecimalUtil.compareTo(Z13957WP_ToDose, T01RU2_A13957WP_ToDose[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_ToDose");
               GXutil.writeLogRaw("Old: ",Z13957WP_ToDose);
               GXutil.writeLogRaw("Current: ",T01RU2_A13957WP_ToDose[0]);
            }
            if ( DecimalUtil.compareTo(Z13958WP_Dosed, T01RU2_A13958WP_Dosed[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_Dosed");
               GXutil.writeLogRaw("Old: ",Z13958WP_Dosed);
               GXutil.writeLogRaw("Current: ",T01RU2_A13958WP_Dosed[0]);
            }
            if ( GXutil.strcmp(Z13959WP_ProdBat, T01RU2_A13959WP_ProdBat[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_ProdBat");
               GXutil.writeLogRaw("Old: ",Z13959WP_ProdBat);
               GXutil.writeLogRaw("Current: ",T01RU2_A13959WP_ProdBat[0]);
            }
            if ( Z13960WP_DosingO != T01RU2_A13960WP_DosingO[0] )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_DosingO");
               GXutil.writeLogRaw("Old: ",Z13960WP_DosingO);
               GXutil.writeLogRaw("Current: ",T01RU2_A13960WP_DosingO[0]);
            }
            if ( Z13961WP_StatusC != T01RU2_A13961WP_StatusC[0] )
            {
               GXutil.writeLogln("formulaciontinte.tweightproduct:[seudo value changed for attri]"+"WP_StatusC");
               GXutil.writeLogRaw("Old: ",Z13961WP_StatusC);
               GXutil.writeLogRaw("Current: ",T01RU2_A13961WP_StatusC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPWEIGHTPRODUCT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RU1880( )
   {
      beforeValidate1RU1880( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RU1880( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RU1880( 0) ;
         checkOptimisticConcurrency1RU1880( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RU1880( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RU1880( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RU8 */
                  pr_colorservice.execute(6, new Object[] {Long.valueOf(A13948WP_ID), A13949WP_Start, A13950WP_Date, A13951WP_BatchCo, Integer.valueOf(A13952WP_CallOff), Integer.valueOf(A13953WP_ReDyeCS), A13954WP_Machine, Integer.valueOf(A13955WP_TankCod), A13956WP_Product, A13957WP_ToDose, A13958WP_Dosed, A13959WP_ProdBat, Integer.valueOf(A13960WP_DosingO), Integer.valueOf(A13961WP_StatusC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPWeightProduct");
                  if ( (pr_colorservice.getStatus(6) == 1) )
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
                        resetCaption1RU0( ) ;
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
            load1RU1880( ) ;
         }
         endLevel1RU1880( ) ;
      }
      closeExtendedTableCursors1RU1880( ) ;
   }

   public void update1RU1880( )
   {
      beforeValidate1RU1880( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RU1880( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RU1880( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RU1880( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RU1880( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RU9 */
                  pr_colorservice.execute(7, new Object[] {A13949WP_Start, A13950WP_Date, A13951WP_BatchCo, Integer.valueOf(A13952WP_CallOff), Integer.valueOf(A13953WP_ReDyeCS), A13954WP_Machine, Integer.valueOf(A13955WP_TankCod), A13956WP_Product, A13957WP_ToDose, A13958WP_Dosed, A13959WP_ProdBat, Integer.valueOf(A13960WP_DosingO), Integer.valueOf(A13961WP_StatusC), Long.valueOf(A13948WP_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPWeightProduct");
                  if ( (pr_colorservice.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPWEIGHTPRODUCT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RU1880( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1RU0( ) ;
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
         endLevel1RU1880( ) ;
      }
      closeExtendedTableCursors1RU1880( ) ;
   }

   public void deferredUpdate1RU1880( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RU1880( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RU1880( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RU1880( ) ;
         afterConfirm1RU1880( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RU1880( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RU10 */
               pr_colorservice.execute(8, new Object[] {Long.valueOf(A13948WP_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPWeightProduct");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1880 == 0 )
                     {
                        initAll1RU1880( ) ;
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
                     resetCaption1RU0( ) ;
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
      sMode1880 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RU1880( ) ;
      Gx_mode = sMode1880 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RU1880( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1RU1880( )
   {
      if ( ! isIns( ) )
      {
         pr_colorservice.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RU1880( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.tweightproduct");
         if ( AnyError == 0 )
         {
            confirmValues1RU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.tweightproduct");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RU1880( )
   {
      /* Scan By routine */
      /* Using cursor T01RU11 */
      pr_colorservice.execute(9);
      RcdFound1880 = (short)(0) ;
      if ( (pr_colorservice.getStatus(9) != 101) )
      {
         RcdFound1880 = (short)(1) ;
         A13948WP_ID = T01RU11_A13948WP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RU1880( )
   {
      /* Scan next routine */
      pr_colorservice.readNext(9);
      RcdFound1880 = (short)(0) ;
      if ( (pr_colorservice.getStatus(9) != 101) )
      {
         RcdFound1880 = (short)(1) ;
         A13948WP_ID = T01RU11_A13948WP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
      }
   }

   public void scanEnd1RU1880( )
   {
      pr_colorservice.close(9);
   }

   public void afterConfirm1RU1880( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RU1880( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RU1880( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RU1880( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RU1880( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RU1880( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RU1880( )
   {
      edtWP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_ID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ID_Enabled), 5, 0), true);
      edtWP_Start_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_Start_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Start_Enabled), 5, 0), true);
      edtWP_Date_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_Date_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Date_Enabled), 5, 0), true);
      edtWP_BatchCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_BatchCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_BatchCo_Enabled), 5, 0), true);
      edtWP_CallOff_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_CallOff_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_CallOff_Enabled), 5, 0), true);
      edtWP_ReDyeCS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_ReDyeCS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ReDyeCS_Enabled), 5, 0), true);
      edtWP_Machine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_Machine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Machine_Enabled), 5, 0), true);
      edtWP_TankCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_TankCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_TankCod_Enabled), 5, 0), true);
      edtWP_Product_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_Product_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Product_Enabled), 5, 0), true);
      edtWP_ToDose_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_ToDose_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ToDose_Enabled), 5, 0), true);
      edtWP_Dosed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_Dosed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Dosed_Enabled), 5, 0), true);
      edtWP_ProdBat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_ProdBat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ProdBat_Enabled), 5, 0), true);
      edtWP_DosingO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_DosingO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_DosingO_Enabled), 5, 0), true);
      edtWP_StatusC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWP_StatusC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_StatusC_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RU1880( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RU0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.tweightproduct", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13948WP_ID", GXutil.ltrim( localUtil.ntoc( Z13948WP_ID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13949WP_Start", localUtil.ttoc( Z13949WP_Start, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13950WP_Date", localUtil.ttoc( Z13950WP_Date, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13951WP_BatchCo", Z13951WP_BatchCo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13952WP_CallOff", GXutil.ltrim( localUtil.ntoc( Z13952WP_CallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13953WP_ReDyeCS", GXutil.ltrim( localUtil.ntoc( Z13953WP_ReDyeCS, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13954WP_Machine", Z13954WP_Machine);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13955WP_TankCod", GXutil.ltrim( localUtil.ntoc( Z13955WP_TankCod, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13956WP_Product", Z13956WP_Product);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13957WP_ToDose", GXutil.ltrim( localUtil.ntoc( Z13957WP_ToDose, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13958WP_Dosed", GXutil.ltrim( localUtil.ntoc( Z13958WP_Dosed, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13959WP_ProdBat", Z13959WP_ProdBat);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13960WP_DosingO", GXutil.ltrim( localUtil.ntoc( Z13960WP_DosingO, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13961WP_StatusC", GXutil.ltrim( localUtil.ntoc( Z13961WP_StatusC, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.formulaciontinte.tweightproduct", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TWeightProduct" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "tabla TWeightProduct", "") ;
   }

   public void initializeNonKey1RU1880( )
   {
      A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13949WP_Start", localUtil.ttoc( A13949WP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13950WP_Date", localUtil.ttoc( A13950WP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13951WP_BatchCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13951WP_BatchCo", A13951WP_BatchCo);
      A13952WP_CallOff = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13952WP_CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13952WP_CallOff), 5, 0));
      A13953WP_ReDyeCS = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13953WP_ReDyeCS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), 5, 0));
      A13954WP_Machine = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13954WP_Machine", A13954WP_Machine);
      A13955WP_TankCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13955WP_TankCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13955WP_TankCod), 5, 0));
      A13956WP_Product = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13956WP_Product", A13956WP_Product);
      A13957WP_ToDose = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13957WP_ToDose", GXutil.ltrimstr( A13957WP_ToDose, 10, 2));
      A13958WP_Dosed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13958WP_Dosed", GXutil.ltrimstr( A13958WP_Dosed, 10, 2));
      A13959WP_ProdBat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13959WP_ProdBat", A13959WP_ProdBat);
      A13960WP_DosingO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13960WP_DosingO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13960WP_DosingO), 5, 0));
      A13961WP_StatusC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13961WP_StatusC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13961WP_StatusC), 5, 0));
      Z13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      Z13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      Z13951WP_BatchCo = "" ;
      Z13952WP_CallOff = 0 ;
      Z13953WP_ReDyeCS = 0 ;
      Z13954WP_Machine = "" ;
      Z13955WP_TankCod = 0 ;
      Z13956WP_Product = "" ;
      Z13957WP_ToDose = DecimalUtil.ZERO ;
      Z13958WP_Dosed = DecimalUtil.ZERO ;
      Z13959WP_ProdBat = "" ;
      Z13960WP_DosingO = 0 ;
      Z13961WP_StatusC = 0 ;
   }

   public void initAll1RU1880( )
   {
      A13948WP_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13948WP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13948WP_ID), 12, 0));
      initializeNonKey1RU1880( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016381391", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/tweightproduct.js", "?202661016381391", false, true);
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
      edtWP_ID_Internalname = "WP_ID" ;
      edtWP_Start_Internalname = "WP_START" ;
      edtWP_Date_Internalname = "WP_DATE" ;
      edtWP_BatchCo_Internalname = "WP_BATCHCO" ;
      edtWP_CallOff_Internalname = "WP_CALLOFF" ;
      edtWP_ReDyeCS_Internalname = "WP_REDYECS" ;
      edtWP_Machine_Internalname = "WP_MACHINE" ;
      edtWP_TankCod_Internalname = "WP_TANKCOD" ;
      edtWP_Product_Internalname = "WP_PRODUCT" ;
      edtWP_ToDose_Internalname = "WP_TODOSE" ;
      edtWP_Dosed_Internalname = "WP_DOSED" ;
      edtWP_ProdBat_Internalname = "WP_PRODBAT" ;
      edtWP_DosingO_Internalname = "WP_DOSINGO" ;
      edtWP_StatusC_Internalname = "WP_STATUSC" ;
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
      Form.setCaption( httpContext.getMessage( "tabla TWeightProduct", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtWP_StatusC_Jsonclick = "" ;
      edtWP_StatusC_Enabled = 1 ;
      edtWP_DosingO_Jsonclick = "" ;
      edtWP_DosingO_Enabled = 1 ;
      edtWP_ProdBat_Jsonclick = "" ;
      edtWP_ProdBat_Enabled = 1 ;
      edtWP_Dosed_Jsonclick = "" ;
      edtWP_Dosed_Enabled = 1 ;
      edtWP_ToDose_Jsonclick = "" ;
      edtWP_ToDose_Enabled = 1 ;
      edtWP_Product_Jsonclick = "" ;
      edtWP_Product_Enabled = 1 ;
      edtWP_TankCod_Jsonclick = "" ;
      edtWP_TankCod_Enabled = 1 ;
      edtWP_Machine_Jsonclick = "" ;
      edtWP_Machine_Enabled = 1 ;
      edtWP_ReDyeCS_Jsonclick = "" ;
      edtWP_ReDyeCS_Enabled = 1 ;
      edtWP_CallOff_Jsonclick = "" ;
      edtWP_CallOff_Enabled = 1 ;
      edtWP_BatchCo_Jsonclick = "" ;
      edtWP_BatchCo_Enabled = 1 ;
      edtWP_Date_Jsonclick = "" ;
      edtWP_Date_Enabled = 1 ;
      edtWP_Start_Jsonclick = "" ;
      edtWP_Start_Enabled = 1 ;
      edtWP_ID_Jsonclick = "" ;
      edtWP_ID_Enabled = 1 ;
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
      GX_FocusControl = edtWP_Start_Internalname ;
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

   public void valid_Wp_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13949WP_Start", localUtil.ttoc( A13949WP_Start, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A13950WP_Date", localUtil.ttoc( A13950WP_Date, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A13951WP_BatchCo", A13951WP_BatchCo);
      httpContext.ajax_rsp_assign_attri("", false, "A13952WP_CallOff", GXutil.ltrim( localUtil.ntoc( A13952WP_CallOff, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13953WP_ReDyeCS", GXutil.ltrim( localUtil.ntoc( A13953WP_ReDyeCS, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13954WP_Machine", A13954WP_Machine);
      httpContext.ajax_rsp_assign_attri("", false, "A13955WP_TankCod", GXutil.ltrim( localUtil.ntoc( A13955WP_TankCod, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13956WP_Product", A13956WP_Product);
      httpContext.ajax_rsp_assign_attri("", false, "A13957WP_ToDose", GXutil.ltrim( localUtil.ntoc( A13957WP_ToDose, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13958WP_Dosed", GXutil.ltrim( localUtil.ntoc( A13958WP_Dosed, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13959WP_ProdBat", A13959WP_ProdBat);
      httpContext.ajax_rsp_assign_attri("", false, "A13960WP_DosingO", GXutil.ltrim( localUtil.ntoc( A13960WP_DosingO, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13961WP_StatusC", GXutil.ltrim( localUtil.ntoc( A13961WP_StatusC, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13948WP_ID", GXutil.ltrim( localUtil.ntoc( Z13948WP_ID, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13949WP_Start", localUtil.ttoc( Z13949WP_Start, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13950WP_Date", localUtil.ttoc( Z13950WP_Date, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13951WP_BatchCo", Z13951WP_BatchCo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13952WP_CallOff", GXutil.ltrim( localUtil.ntoc( Z13952WP_CallOff, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13953WP_ReDyeCS", GXutil.ltrim( localUtil.ntoc( Z13953WP_ReDyeCS, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13954WP_Machine", Z13954WP_Machine);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13955WP_TankCod", GXutil.ltrim( localUtil.ntoc( Z13955WP_TankCod, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13956WP_Product", Z13956WP_Product);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13957WP_ToDose", GXutil.ltrim( localUtil.ntoc( Z13957WP_ToDose, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13958WP_Dosed", GXutil.ltrim( localUtil.ntoc( Z13958WP_Dosed, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13959WP_ProdBat", Z13959WP_ProdBat);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13960WP_DosingO", GXutil.ltrim( localUtil.ntoc( Z13960WP_DosingO, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13961WP_StatusC", GXutil.ltrim( localUtil.ntoc( Z13961WP_StatusC, (byte)(5), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_WP_ID","{handler:'valid_Wp_id',iparms:[{av:'A13948WP_ID',fld:'WP_ID',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_WP_ID",",oparms:[{av:'A13949WP_Start',fld:'WP_START',pic:'99/99/99 99:99'},{av:'A13950WP_Date',fld:'WP_DATE',pic:'99/99/99 99:99'},{av:'A13951WP_BatchCo',fld:'WP_BATCHCO',pic:''},{av:'A13952WP_CallOff',fld:'WP_CALLOFF',pic:'ZZZZ9'},{av:'A13953WP_ReDyeCS',fld:'WP_REDYECS',pic:'ZZZZ9'},{av:'A13954WP_Machine',fld:'WP_MACHINE',pic:''},{av:'A13955WP_TankCod',fld:'WP_TANKCOD',pic:'ZZZZ9'},{av:'A13956WP_Product',fld:'WP_PRODUCT',pic:''},{av:'A13957WP_ToDose',fld:'WP_TODOSE',pic:'ZZZZZZ9.99'},{av:'A13958WP_Dosed',fld:'WP_DOSED',pic:'ZZZZZZ9.99'},{av:'A13959WP_ProdBat',fld:'WP_PRODBAT',pic:''},{av:'A13960WP_DosingO',fld:'WP_DOSINGO',pic:'ZZZZ9'},{av:'A13961WP_StatusC',fld:'WP_STATUSC',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z13948WP_ID'},{av:'Z13949WP_Start'},{av:'Z13950WP_Date'},{av:'Z13951WP_BatchCo'},{av:'Z13952WP_CallOff'},{av:'Z13953WP_ReDyeCS'},{av:'Z13954WP_Machine'},{av:'Z13955WP_TankCod'},{av:'Z13956WP_Product'},{av:'Z13957WP_ToDose'},{av:'Z13958WP_Dosed'},{av:'Z13959WP_ProdBat'},{av:'Z13960WP_DosingO'},{av:'Z13961WP_StatusC'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      Z13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      Z13951WP_BatchCo = "" ;
      Z13954WP_Machine = "" ;
      Z13956WP_Product = "" ;
      Z13957WP_ToDose = DecimalUtil.ZERO ;
      Z13958WP_Dosed = DecimalUtil.ZERO ;
      Z13959WP_ProdBat = "" ;
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
      A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      A13951WP_BatchCo = "" ;
      A13954WP_Machine = "" ;
      A13956WP_Product = "" ;
      A13957WP_ToDose = DecimalUtil.ZERO ;
      A13958WP_Dosed = DecimalUtil.ZERO ;
      A13959WP_ProdBat = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      T01RU4_A13948WP_ID = new long[1] ;
      T01RU4_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      T01RU4_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      T01RU4_A13951WP_BatchCo = new String[] {""} ;
      T01RU4_A13952WP_CallOff = new int[1] ;
      T01RU4_A13953WP_ReDyeCS = new int[1] ;
      T01RU4_A13954WP_Machine = new String[] {""} ;
      T01RU4_A13955WP_TankCod = new int[1] ;
      T01RU4_A13956WP_Product = new String[] {""} ;
      T01RU4_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RU4_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RU4_A13959WP_ProdBat = new String[] {""} ;
      T01RU4_A13960WP_DosingO = new int[1] ;
      T01RU4_A13961WP_StatusC = new int[1] ;
      T01RU5_A13948WP_ID = new long[1] ;
      T01RU3_A13948WP_ID = new long[1] ;
      T01RU3_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      T01RU3_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      T01RU3_A13951WP_BatchCo = new String[] {""} ;
      T01RU3_A13952WP_CallOff = new int[1] ;
      T01RU3_A13953WP_ReDyeCS = new int[1] ;
      T01RU3_A13954WP_Machine = new String[] {""} ;
      T01RU3_A13955WP_TankCod = new int[1] ;
      T01RU3_A13956WP_Product = new String[] {""} ;
      T01RU3_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RU3_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RU3_A13959WP_ProdBat = new String[] {""} ;
      T01RU3_A13960WP_DosingO = new int[1] ;
      T01RU3_A13961WP_StatusC = new int[1] ;
      sMode1880 = "" ;
      T01RU6_A13948WP_ID = new long[1] ;
      T01RU7_A13948WP_ID = new long[1] ;
      T01RU2_A13948WP_ID = new long[1] ;
      T01RU2_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      T01RU2_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      T01RU2_A13951WP_BatchCo = new String[] {""} ;
      T01RU2_A13952WP_CallOff = new int[1] ;
      T01RU2_A13953WP_ReDyeCS = new int[1] ;
      T01RU2_A13954WP_Machine = new String[] {""} ;
      T01RU2_A13955WP_TankCod = new int[1] ;
      T01RU2_A13956WP_Product = new String[] {""} ;
      T01RU2_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RU2_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RU2_A13959WP_ProdBat = new String[] {""} ;
      T01RU2_A13960WP_DosingO = new int[1] ;
      T01RU2_A13961WP_StatusC = new int[1] ;
      T01RU11_A13948WP_ID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      ZZ13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      ZZ13951WP_BatchCo = "" ;
      ZZ13954WP_Machine = "" ;
      ZZ13956WP_Product = "" ;
      ZZ13957WP_ToDose = DecimalUtil.ZERO ;
      ZZ13958WP_Dosed = DecimalUtil.ZERO ;
      ZZ13959WP_ProdBat = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tweightproduct__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tweightproduct__colorservice(),
         new Object[] {
             new Object[] {
            T01RU2_A13948WP_ID, T01RU2_A13949WP_Start, T01RU2_A13950WP_Date, T01RU2_A13951WP_BatchCo, T01RU2_A13952WP_CallOff, T01RU2_A13953WP_ReDyeCS, T01RU2_A13954WP_Machine, T01RU2_A13955WP_TankCod, T01RU2_A13956WP_Product, T01RU2_A13957WP_ToDose,
            T01RU2_A13958WP_Dosed, T01RU2_A13959WP_ProdBat, T01RU2_A13960WP_DosingO, T01RU2_A13961WP_StatusC
            }
            , new Object[] {
            T01RU3_A13948WP_ID, T01RU3_A13949WP_Start, T01RU3_A13950WP_Date, T01RU3_A13951WP_BatchCo, T01RU3_A13952WP_CallOff, T01RU3_A13953WP_ReDyeCS, T01RU3_A13954WP_Machine, T01RU3_A13955WP_TankCod, T01RU3_A13956WP_Product, T01RU3_A13957WP_ToDose,
            T01RU3_A13958WP_Dosed, T01RU3_A13959WP_ProdBat, T01RU3_A13960WP_DosingO, T01RU3_A13961WP_StatusC
            }
            , new Object[] {
            T01RU4_A13948WP_ID, T01RU4_A13949WP_Start, T01RU4_A13950WP_Date, T01RU4_A13951WP_BatchCo, T01RU4_A13952WP_CallOff, T01RU4_A13953WP_ReDyeCS, T01RU4_A13954WP_Machine, T01RU4_A13955WP_TankCod, T01RU4_A13956WP_Product, T01RU4_A13957WP_ToDose,
            T01RU4_A13958WP_Dosed, T01RU4_A13959WP_ProdBat, T01RU4_A13960WP_DosingO, T01RU4_A13961WP_StatusC
            }
            , new Object[] {
            T01RU5_A13948WP_ID
            }
            , new Object[] {
            T01RU6_A13948WP_ID
            }
            , new Object[] {
            T01RU7_A13948WP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RU11_A13948WP_ID
            }
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tweightproduct__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tweightproduct__default(),
         new Object[] {
         }
      );
      AV33Pgmname = "FormulacionTinte.TWeightProduct" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1880 ;
   private short nIsDirty_1880 ;
   private int Z13952WP_CallOff ;
   private int Z13953WP_ReDyeCS ;
   private int Z13955WP_TankCod ;
   private int Z13960WP_DosingO ;
   private int Z13961WP_StatusC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtWP_ID_Enabled ;
   private int edtWP_Start_Enabled ;
   private int edtWP_Date_Enabled ;
   private int edtWP_BatchCo_Enabled ;
   private int A13952WP_CallOff ;
   private int edtWP_CallOff_Enabled ;
   private int A13953WP_ReDyeCS ;
   private int edtWP_ReDyeCS_Enabled ;
   private int edtWP_Machine_Enabled ;
   private int A13955WP_TankCod ;
   private int edtWP_TankCod_Enabled ;
   private int edtWP_Product_Enabled ;
   private int edtWP_ToDose_Enabled ;
   private int edtWP_Dosed_Enabled ;
   private int edtWP_ProdBat_Enabled ;
   private int A13960WP_DosingO ;
   private int edtWP_DosingO_Enabled ;
   private int A13961WP_StatusC ;
   private int edtWP_StatusC_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ13952WP_CallOff ;
   private int ZZ13953WP_ReDyeCS ;
   private int ZZ13955WP_TankCod ;
   private int ZZ13960WP_DosingO ;
   private int ZZ13961WP_StatusC ;
   private long Z13948WP_ID ;
   private long A13948WP_ID ;
   private long ZZ13948WP_ID ;
   private java.math.BigDecimal Z13957WP_ToDose ;
   private java.math.BigDecimal Z13958WP_Dosed ;
   private java.math.BigDecimal A13957WP_ToDose ;
   private java.math.BigDecimal A13958WP_Dosed ;
   private java.math.BigDecimal ZZ13957WP_ToDose ;
   private java.math.BigDecimal ZZ13958WP_Dosed ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtWP_ID_Internalname ;
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
   private String edtWP_ID_Jsonclick ;
   private String edtWP_Start_Internalname ;
   private String edtWP_Start_Jsonclick ;
   private String edtWP_Date_Internalname ;
   private String edtWP_Date_Jsonclick ;
   private String edtWP_BatchCo_Internalname ;
   private String edtWP_BatchCo_Jsonclick ;
   private String edtWP_CallOff_Internalname ;
   private String edtWP_CallOff_Jsonclick ;
   private String edtWP_ReDyeCS_Internalname ;
   private String edtWP_ReDyeCS_Jsonclick ;
   private String edtWP_Machine_Internalname ;
   private String edtWP_Machine_Jsonclick ;
   private String edtWP_TankCod_Internalname ;
   private String edtWP_TankCod_Jsonclick ;
   private String edtWP_Product_Internalname ;
   private String edtWP_Product_Jsonclick ;
   private String edtWP_ToDose_Internalname ;
   private String edtWP_ToDose_Jsonclick ;
   private String edtWP_Dosed_Internalname ;
   private String edtWP_Dosed_Jsonclick ;
   private String edtWP_ProdBat_Internalname ;
   private String edtWP_ProdBat_Jsonclick ;
   private String edtWP_DosingO_Internalname ;
   private String edtWP_DosingO_Jsonclick ;
   private String edtWP_StatusC_Internalname ;
   private String edtWP_StatusC_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sMode1880 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z13949WP_Start ;
   private java.util.Date Z13950WP_Date ;
   private java.util.Date A13949WP_Start ;
   private java.util.Date A13950WP_Date ;
   private java.util.Date ZZ13949WP_Start ;
   private java.util.Date ZZ13950WP_Date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z13951WP_BatchCo ;
   private String Z13954WP_Machine ;
   private String Z13956WP_Product ;
   private String Z13959WP_ProdBat ;
   private String A13951WP_BatchCo ;
   private String A13954WP_Machine ;
   private String A13956WP_Product ;
   private String A13959WP_ProdBat ;
   private String ZZ13951WP_BatchCo ;
   private String ZZ13954WP_Machine ;
   private String ZZ13956WP_Product ;
   private String ZZ13959WP_ProdBat ;
   private IDataStoreProvider pr_colorservice ;
   private long[] T01RU4_A13948WP_ID ;
   private java.util.Date[] T01RU4_A13949WP_Start ;
   private java.util.Date[] T01RU4_A13950WP_Date ;
   private String[] T01RU4_A13951WP_BatchCo ;
   private int[] T01RU4_A13952WP_CallOff ;
   private int[] T01RU4_A13953WP_ReDyeCS ;
   private String[] T01RU4_A13954WP_Machine ;
   private int[] T01RU4_A13955WP_TankCod ;
   private String[] T01RU4_A13956WP_Product ;
   private java.math.BigDecimal[] T01RU4_A13957WP_ToDose ;
   private java.math.BigDecimal[] T01RU4_A13958WP_Dosed ;
   private String[] T01RU4_A13959WP_ProdBat ;
   private int[] T01RU4_A13960WP_DosingO ;
   private int[] T01RU4_A13961WP_StatusC ;
   private long[] T01RU5_A13948WP_ID ;
   private long[] T01RU3_A13948WP_ID ;
   private java.util.Date[] T01RU3_A13949WP_Start ;
   private java.util.Date[] T01RU3_A13950WP_Date ;
   private String[] T01RU3_A13951WP_BatchCo ;
   private int[] T01RU3_A13952WP_CallOff ;
   private int[] T01RU3_A13953WP_ReDyeCS ;
   private String[] T01RU3_A13954WP_Machine ;
   private int[] T01RU3_A13955WP_TankCod ;
   private String[] T01RU3_A13956WP_Product ;
   private java.math.BigDecimal[] T01RU3_A13957WP_ToDose ;
   private java.math.BigDecimal[] T01RU3_A13958WP_Dosed ;
   private String[] T01RU3_A13959WP_ProdBat ;
   private int[] T01RU3_A13960WP_DosingO ;
   private int[] T01RU3_A13961WP_StatusC ;
   private long[] T01RU6_A13948WP_ID ;
   private long[] T01RU7_A13948WP_ID ;
   private long[] T01RU2_A13948WP_ID ;
   private java.util.Date[] T01RU2_A13949WP_Start ;
   private java.util.Date[] T01RU2_A13950WP_Date ;
   private String[] T01RU2_A13951WP_BatchCo ;
   private int[] T01RU2_A13952WP_CallOff ;
   private int[] T01RU2_A13953WP_ReDyeCS ;
   private String[] T01RU2_A13954WP_Machine ;
   private int[] T01RU2_A13955WP_TankCod ;
   private String[] T01RU2_A13956WP_Product ;
   private java.math.BigDecimal[] T01RU2_A13957WP_ToDose ;
   private java.math.BigDecimal[] T01RU2_A13958WP_Dosed ;
   private String[] T01RU2_A13959WP_ProdBat ;
   private int[] T01RU2_A13960WP_DosingO ;
   private int[] T01RU2_A13961WP_StatusC ;
   private IDataStoreProvider pr_default ;
   private long[] T01RU11_A13948WP_ID ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tweightproduct__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tweightproduct__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RU2", "SELECT [id], [DateTimeStart], [DateTime], [BatchCode], [CallOff], [ReDye], [MachineCode], [TankCode], [ProductCode], [ToDose], [Dosed], [ProductBatchCode], [DosingOrigin], [Status] FROM [TXPWeightProduct] WITH (UPDLOCK) WHERE [id] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RU3", "SELECT [id], [DateTimeStart], [DateTime], [BatchCode], [CallOff], [ReDye], [MachineCode], [TankCode], [ProductCode], [ToDose], [Dosed], [ProductBatchCode], [DosingOrigin], [Status] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE [id] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RU4", "SELECT TM1.[id], TM1.[DateTimeStart], TM1.[DateTime], TM1.[BatchCode], TM1.[CallOff], TM1.[ReDye], TM1.[MachineCode], TM1.[TankCode], TM1.[ProductCode], TM1.[ToDose], TM1.[Dosed], TM1.[ProductBatchCode], TM1.[DosingOrigin], TM1.[Status] FROM [TXPWeightProduct] TM1 WITH (NOLOCK) WHERE TM1.[id] = ? ORDER BY TM1.[id]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RU5", "SELECT [id] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE [id] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RU6", "SELECT TOP 1 [id] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE ( [id] > ?) ORDER BY [id]  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RU7", "SELECT TOP 1 [id] FROM [TXPWeightProduct] WITH (NOLOCK) WHERE ( [id] < ?) ORDER BY [id] DESC  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RU8", "INSERT INTO [TXPWeightProduct]([id], [DateTimeStart], [DateTime], [BatchCode], [CallOff], [ReDye], [MachineCode], [TankCode], [ProductCode], [ToDose], [Dosed], [ProductBatchCode], [DosingOrigin], [Status]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T01RU9", "UPDATE [TXPWeightProduct] SET [DateTimeStart]=?, [DateTime]=?, [BatchCode]=?, [CallOff]=?, [ReDye]=?, [MachineCode]=?, [TankCode]=?, [ProductCode]=?, [ToDose]=?, [Dosed]=?, [ProductBatchCode]=?, [DosingOrigin]=?, [Status]=?  WHERE [id] = ?", GX_NOMASK)
         ,new UpdateCursor("T01RU10", "DELETE FROM [TXPWeightProduct]  WHERE [id] = ?", GX_NOMASK)
         ,new ForEachCursor("T01RU11", "SELECT [id] FROM [TXPWeightProduct] WITH (NOLOCK) ORDER BY [id]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 100, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 100, false);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setVarchar(12, (String)parms[11], 100, false);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               return;
            case 7 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setVarchar(8, (String)parms[7], 100, false);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setVarchar(11, (String)parms[10], 100, false);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setLong(14, ((Number) parms[13]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class tweightproduct__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tweightproduct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

}

