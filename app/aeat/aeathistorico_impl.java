package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aeathistorico_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AEATHistorico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAEATId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public aeathistorico_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public aeathistorico_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aeathistorico_impl.class ));
   }

   public aeathistorico_impl( int remoteHandle ,
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
         validateSpaRequest();
         userMain( ) ;
         if ( ! isFullAjaxMode( ) && ( nDynComponent == 0 ) )
         {
            draw( ) ;
         }
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
      cleanup();
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
         renderHtmlCloseForm1V21905( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      renderHtmlHeaders( ) ;
      renderHtmlOpenForm( ) ;
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "AEATHistorico", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AEAT\\AEATHistorico.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AEAT\\AEATHistorico.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATId_Internalname, httpContext.getMessage( "AEATId", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATId_Internalname, GXutil.ltrim( localUtil.ntoc( A14378AEATId, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAEATId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14378AEATId), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14378AEATId), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATId_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AEAT\\Autonumerico", "right", false, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATNumero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATNumero_Internalname, httpContext.getMessage( "Factura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATNumero_Internalname, A14381AEATNumero, GXutil.rtrim( localUtil.format( A14381AEATNumero, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATNumero_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATNumero_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATFExped_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATFExped_Internalname, httpContext.getMessage( "AEATFExpedicion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAEATFExped_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATFExped_Internalname, localUtil.format(A14382AEATFExped, "99/99/99"), localUtil.format( A14382AEATFExped, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATFExped_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATFExped_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAEATFExped_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAEATFExped_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AEAT\\AEATHistorico.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATRecept_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATRecept_Internalname, httpContext.getMessage( "NIF", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATRecept_Internalname, A14383AEATRecept, GXutil.rtrim( localUtil.format( A14383AEATRecept, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATRecept_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATRecept_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATHuella_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATHuella_Internalname, httpContext.getMessage( "Factura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATHuella_Internalname, A14384AEATHuella, GXutil.rtrim( localUtil.format( A14384AEATHuella, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATHuella_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATHuella_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATAnteri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATAnteri_Internalname, httpContext.getMessage( "Huella", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATAnteri_Internalname, A14385AEATAnteri, GXutil.rtrim( localUtil.format( A14385AEATAnteri, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATAnteri_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATAnteri_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATEstado_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATEstado_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATEstado_Internalname, A14379AEATEstado, GXutil.rtrim( localUtil.format( A14379AEATEstado, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATEstado_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATEstado_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATFRecep_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATFRecep_Internalname, httpContext.getMessage( "AEATFRecepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAEATFRecep_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATFRecep_Internalname, localUtil.ttoc( A14380AEATFRecep, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14380AEATFRecep, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATFRecep_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATFRecep_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAEATFRecep_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAEATFRecep_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AEAT\\AEATHistorico.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATCSV_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATCSV_Internalname, httpContext.getMessage( "AEATCSV", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATCSV_Internalname, A14386AEATCSV, GXutil.rtrim( localUtil.format( A14386AEATCSV, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATCSV_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATCSV_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATXmlEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATXmlEnv_Internalname, httpContext.getMessage( "Enviado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAEATXmlEnv_Internalname, A14387AEATXmlEnv, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", (short)(0), 1, edtAEATXmlEnv_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATXmlRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATXmlRes_Internalname, httpContext.getMessage( "Respuesta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAEATXmlRes_Internalname, A14388AEATXmlRes, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", (short)(0), 1, edtAEATXmlRes_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAEATFechaE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAEATFechaE_Internalname, httpContext.getMessage( "Envio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAEATFechaE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAEATFechaE_Internalname, localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14389AEATFechaE, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAEATFechaE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAEATFechaE_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAEATFechaE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAEATFechaE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AEAT\\AEATHistorico.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEATHistorico.htm");
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
      e111V22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z14378AEATId = localUtil.ctol( httpContext.cgiGet( "Z14378AEATId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z14381AEATNumero = httpContext.cgiGet( "Z14381AEATNumero") ;
            Z14382AEATFExped = localUtil.ctod( httpContext.cgiGet( "Z14382AEATFExped"), 0) ;
            Z14383AEATRecept = httpContext.cgiGet( "Z14383AEATRecept") ;
            Z14384AEATHuella = httpContext.cgiGet( "Z14384AEATHuella") ;
            Z14385AEATAnteri = httpContext.cgiGet( "Z14385AEATAnteri") ;
            Z14379AEATEstado = httpContext.cgiGet( "Z14379AEATEstado") ;
            Z14380AEATFRecep = localUtil.ctot( httpContext.cgiGet( "Z14380AEATFRecep"), 0) ;
            Z14386AEATCSV = httpContext.cgiGet( "Z14386AEATCSV") ;
            Z14389AEATFechaE = localUtil.ctot( httpContext.cgiGet( "Z14389AEATFechaE"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAEATId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAEATId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AEATID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAEATId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14378AEATId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
            }
            else
            {
               A14378AEATId = localUtil.ctol( httpContext.cgiGet( edtAEATId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
            }
            A14381AEATNumero = httpContext.cgiGet( edtAEATNumero_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14381AEATNumero", A14381AEATNumero);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAEATFExped_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "AEATFEXPED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAEATFExped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14382AEATFExped = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A14382AEATFExped", localUtil.format(A14382AEATFExped, "99/99/99"));
            }
            else
            {
               A14382AEATFExped = localUtil.ctod( httpContext.cgiGet( edtAEATFExped_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14382AEATFExped", localUtil.format(A14382AEATFExped, "99/99/99"));
            }
            A14383AEATRecept = httpContext.cgiGet( edtAEATRecept_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14383AEATRecept", A14383AEATRecept);
            A14384AEATHuella = httpContext.cgiGet( edtAEATHuella_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14384AEATHuella", A14384AEATHuella);
            A14385AEATAnteri = httpContext.cgiGet( edtAEATAnteri_Internalname) ;
            n14385AEATAnteri = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14385AEATAnteri", A14385AEATAnteri);
            A14379AEATEstado = httpContext.cgiGet( edtAEATEstado_Internalname) ;
            n14379AEATEstado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14379AEATEstado", A14379AEATEstado);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAEATFRecep_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "AEATFRECEP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAEATFRecep_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
               n14380AEATFRecep = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14380AEATFRecep", localUtil.ttoc( A14380AEATFRecep, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A14380AEATFRecep = localUtil.ctot( httpContext.cgiGet( edtAEATFRecep_Internalname)) ;
               n14380AEATFRecep = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14380AEATFRecep", localUtil.ttoc( A14380AEATFRecep, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A14386AEATCSV = httpContext.cgiGet( edtAEATCSV_Internalname) ;
            n14386AEATCSV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14386AEATCSV", A14386AEATCSV);
            A14387AEATXmlEnv = httpContext.cgiGet( edtAEATXmlEnv_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14387AEATXmlEnv", A14387AEATXmlEnv);
            A14388AEATXmlRes = httpContext.cgiGet( edtAEATXmlRes_Internalname) ;
            n14388AEATXmlRes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14388AEATXmlRes", A14388AEATXmlRes);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAEATFechaE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "AEATFECHAE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAEATFechaE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A14389AEATFechaE", localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A14389AEATFechaE = localUtil.ctot( httpContext.cgiGet( edtAEATFechaE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14389AEATFechaE", localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
               A14378AEATId = GXutil.lval( httpContext.GetPar( "AEATId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
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
                     e111V22 ();
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
            initAll1V21905( ) ;
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
      disableAttributes1V21905( ) ;
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

   public void resetCaption1V20( )
   {
   }

   public void e111V22( )
   {
      /* Start Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1V21905( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14381AEATNumero = T01V23_A14381AEATNumero[0] ;
            Z14382AEATFExped = T01V23_A14382AEATFExped[0] ;
            Z14383AEATRecept = T01V23_A14383AEATRecept[0] ;
            Z14384AEATHuella = T01V23_A14384AEATHuella[0] ;
            Z14385AEATAnteri = T01V23_A14385AEATAnteri[0] ;
            Z14379AEATEstado = T01V23_A14379AEATEstado[0] ;
            Z14380AEATFRecep = T01V23_A14380AEATFRecep[0] ;
            Z14386AEATCSV = T01V23_A14386AEATCSV[0] ;
            Z14389AEATFechaE = T01V23_A14389AEATFechaE[0] ;
         }
         else
         {
            Z14381AEATNumero = A14381AEATNumero ;
            Z14382AEATFExped = A14382AEATFExped ;
            Z14383AEATRecept = A14383AEATRecept ;
            Z14384AEATHuella = A14384AEATHuella ;
            Z14385AEATAnteri = A14385AEATAnteri ;
            Z14379AEATEstado = A14379AEATEstado ;
            Z14380AEATFRecep = A14380AEATFRecep ;
            Z14386AEATCSV = A14386AEATCSV ;
            Z14389AEATFechaE = A14389AEATFechaE ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14378AEATId = A14378AEATId ;
         Z14381AEATNumero = A14381AEATNumero ;
         Z14382AEATFExped = A14382AEATFExped ;
         Z14383AEATRecept = A14383AEATRecept ;
         Z14384AEATHuella = A14384AEATHuella ;
         Z14385AEATAnteri = A14385AEATAnteri ;
         Z14379AEATEstado = A14379AEATEstado ;
         Z14380AEATFRecep = A14380AEATFRecep ;
         Z14386AEATCSV = A14386AEATCSV ;
         Z14387AEATXmlEnv = A14387AEATXmlEnv ;
         Z14388AEATXmlRes = A14388AEATXmlRes ;
         Z14389AEATFechaE = A14389AEATFechaE ;
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

   public void load1V21905( )
   {
      /* Using cursor T01V24 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14378AEATId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1905 = (short)(1) ;
         A14387AEATXmlEnv = T01V24_A14387AEATXmlEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14387AEATXmlEnv", A14387AEATXmlEnv);
         A14388AEATXmlRes = T01V24_A14388AEATXmlRes[0] ;
         n14388AEATXmlRes = T01V24_n14388AEATXmlRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14388AEATXmlRes", A14388AEATXmlRes);
         A14381AEATNumero = T01V24_A14381AEATNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14381AEATNumero", A14381AEATNumero);
         A14382AEATFExped = T01V24_A14382AEATFExped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14382AEATFExped", localUtil.format(A14382AEATFExped, "99/99/99"));
         A14383AEATRecept = T01V24_A14383AEATRecept[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14383AEATRecept", A14383AEATRecept);
         A14384AEATHuella = T01V24_A14384AEATHuella[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14384AEATHuella", A14384AEATHuella);
         A14385AEATAnteri = T01V24_A14385AEATAnteri[0] ;
         n14385AEATAnteri = T01V24_n14385AEATAnteri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14385AEATAnteri", A14385AEATAnteri);
         A14379AEATEstado = T01V24_A14379AEATEstado[0] ;
         n14379AEATEstado = T01V24_n14379AEATEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14379AEATEstado", A14379AEATEstado);
         A14380AEATFRecep = T01V24_A14380AEATFRecep[0] ;
         n14380AEATFRecep = T01V24_n14380AEATFRecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14380AEATFRecep", localUtil.ttoc( A14380AEATFRecep, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14386AEATCSV = T01V24_A14386AEATCSV[0] ;
         n14386AEATCSV = T01V24_n14386AEATCSV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14386AEATCSV", A14386AEATCSV);
         A14389AEATFechaE = T01V24_A14389AEATFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14389AEATFechaE", localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         zm1V21905( -1) ;
      }
      pr_default.close(2);
      onLoadActions1V21905( ) ;
   }

   public void onLoadActions1V21905( )
   {
   }

   public void checkExtendedTable1V21905( )
   {
      nIsDirty_1905 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1V21905( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1V21905( )
   {
      /* Using cursor T01V25 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14378AEATId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1905 = (short)(1) ;
      }
      else
      {
         RcdFound1905 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01V23 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14378AEATId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1V21905( 1) ;
         RcdFound1905 = (short)(1) ;
         A14388AEATXmlRes = T01V23_A14388AEATXmlRes[0] ;
         n14388AEATXmlRes = T01V23_n14388AEATXmlRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14388AEATXmlRes", A14388AEATXmlRes);
         A14387AEATXmlEnv = T01V23_A14387AEATXmlEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14387AEATXmlEnv", A14387AEATXmlEnv);
         A14378AEATId = T01V23_A14378AEATId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
         A14381AEATNumero = T01V23_A14381AEATNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14381AEATNumero", A14381AEATNumero);
         A14382AEATFExped = T01V23_A14382AEATFExped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14382AEATFExped", localUtil.format(A14382AEATFExped, "99/99/99"));
         A14383AEATRecept = T01V23_A14383AEATRecept[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14383AEATRecept", A14383AEATRecept);
         A14384AEATHuella = T01V23_A14384AEATHuella[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14384AEATHuella", A14384AEATHuella);
         A14385AEATAnteri = T01V23_A14385AEATAnteri[0] ;
         n14385AEATAnteri = T01V23_n14385AEATAnteri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14385AEATAnteri", A14385AEATAnteri);
         A14379AEATEstado = T01V23_A14379AEATEstado[0] ;
         n14379AEATEstado = T01V23_n14379AEATEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14379AEATEstado", A14379AEATEstado);
         A14380AEATFRecep = T01V23_A14380AEATFRecep[0] ;
         n14380AEATFRecep = T01V23_n14380AEATFRecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14380AEATFRecep", localUtil.ttoc( A14380AEATFRecep, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14386AEATCSV = T01V23_A14386AEATCSV[0] ;
         n14386AEATCSV = T01V23_n14386AEATCSV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14386AEATCSV", A14386AEATCSV);
         A14389AEATFechaE = T01V23_A14389AEATFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14389AEATFechaE", localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Z14378AEATId = A14378AEATId ;
         sMode1905 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1V21905( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1905 = (short)(0) ;
            initializeNonKey1V21905( ) ;
         }
         Gx_mode = sMode1905 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1905 = (short)(0) ;
         initializeNonKey1V21905( ) ;
         sMode1905 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1905 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1V21905( ) ;
      if ( RcdFound1905 == 0 )
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
      RcdFound1905 = (short)(0) ;
      /* Using cursor T01V26 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14378AEATId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01V26_A14378AEATId[0] < A14378AEATId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01V26_A14378AEATId[0] > A14378AEATId ) ) )
         {
            A14378AEATId = T01V26_A14378AEATId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
            RcdFound1905 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1905 = (short)(0) ;
      /* Using cursor T01V27 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14378AEATId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01V27_A14378AEATId[0] > A14378AEATId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01V27_A14378AEATId[0] < A14378AEATId ) ) )
         {
            A14378AEATId = T01V27_A14378AEATId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
            RcdFound1905 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1V21905( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAEATId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1V21905( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1905 == 1 )
         {
            if ( A14378AEATId != Z14378AEATId )
            {
               A14378AEATId = Z14378AEATId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "AEATID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAEATId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAEATId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1V21905( ) ;
               GX_FocusControl = edtAEATId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14378AEATId != Z14378AEATId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAEATId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1V21905( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "AEATID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAEATId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtAEATId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1V21905( ) ;
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
      if ( A14378AEATId != Z14378AEATId )
      {
         A14378AEATId = Z14378AEATId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "AEATID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAEATId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAEATId_Internalname ;
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
      if ( RcdFound1905 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "AEATID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAEATId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAEATNumero_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1V21905( ) ;
      if ( RcdFound1905 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAEATNumero_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V21905( ) ;
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
      if ( RcdFound1905 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAEATNumero_Internalname ;
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
      if ( RcdFound1905 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAEATNumero_Internalname ;
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
      scanStart1V21905( ) ;
      if ( RcdFound1905 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1905 != 0 )
         {
            scanNext1V21905( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAEATNumero_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1V21905( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1V21905( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01V22 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14378AEATId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAEATHi"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14381AEATNumero, T01V22_A14381AEATNumero[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z14382AEATFExped), GXutil.resetTime(T01V22_A14382AEATFExped[0])) ) || ( GXutil.strcmp(Z14383AEATRecept, T01V22_A14383AEATRecept[0]) != 0 ) || ( GXutil.strcmp(Z14384AEATHuella, T01V22_A14384AEATHuella[0]) != 0 ) || ( GXutil.strcmp(Z14385AEATAnteri, T01V22_A14385AEATAnteri[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14379AEATEstado, T01V22_A14379AEATEstado[0]) != 0 ) || !( GXutil.dateCompare(Z14380AEATFRecep, T01V22_A14380AEATFRecep[0]) ) || ( GXutil.strcmp(Z14386AEATCSV, T01V22_A14386AEATCSV[0]) != 0 ) || !( GXutil.dateCompare(Z14389AEATFechaE, T01V22_A14389AEATFechaE[0]) ) )
         {
            if ( GXutil.strcmp(Z14381AEATNumero, T01V22_A14381AEATNumero[0]) != 0 )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATNumero");
               GXutil.writeLogRaw("Old: ",Z14381AEATNumero);
               GXutil.writeLogRaw("Current: ",T01V22_A14381AEATNumero[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14382AEATFExped), GXutil.resetTime(T01V22_A14382AEATFExped[0])) ) )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATFExped");
               GXutil.writeLogRaw("Old: ",Z14382AEATFExped);
               GXutil.writeLogRaw("Current: ",T01V22_A14382AEATFExped[0]);
            }
            if ( GXutil.strcmp(Z14383AEATRecept, T01V22_A14383AEATRecept[0]) != 0 )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATRecept");
               GXutil.writeLogRaw("Old: ",Z14383AEATRecept);
               GXutil.writeLogRaw("Current: ",T01V22_A14383AEATRecept[0]);
            }
            if ( GXutil.strcmp(Z14384AEATHuella, T01V22_A14384AEATHuella[0]) != 0 )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATHuella");
               GXutil.writeLogRaw("Old: ",Z14384AEATHuella);
               GXutil.writeLogRaw("Current: ",T01V22_A14384AEATHuella[0]);
            }
            if ( GXutil.strcmp(Z14385AEATAnteri, T01V22_A14385AEATAnteri[0]) != 0 )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATAnteri");
               GXutil.writeLogRaw("Old: ",Z14385AEATAnteri);
               GXutil.writeLogRaw("Current: ",T01V22_A14385AEATAnteri[0]);
            }
            if ( GXutil.strcmp(Z14379AEATEstado, T01V22_A14379AEATEstado[0]) != 0 )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATEstado");
               GXutil.writeLogRaw("Old: ",Z14379AEATEstado);
               GXutil.writeLogRaw("Current: ",T01V22_A14379AEATEstado[0]);
            }
            if ( !( GXutil.dateCompare(Z14380AEATFRecep, T01V22_A14380AEATFRecep[0]) ) )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATFRecep");
               GXutil.writeLogRaw("Old: ",Z14380AEATFRecep);
               GXutil.writeLogRaw("Current: ",T01V22_A14380AEATFRecep[0]);
            }
            if ( GXutil.strcmp(Z14386AEATCSV, T01V22_A14386AEATCSV[0]) != 0 )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATCSV");
               GXutil.writeLogRaw("Old: ",Z14386AEATCSV);
               GXutil.writeLogRaw("Current: ",T01V22_A14386AEATCSV[0]);
            }
            if ( !( GXutil.dateCompare(Z14389AEATFechaE, T01V22_A14389AEATFechaE[0]) ) )
            {
               GXutil.writeLogln("aeat.aeathistorico:[seudo value changed for attri]"+"AEATFechaE");
               GXutil.writeLogRaw("Old: ",Z14389AEATFechaE);
               GXutil.writeLogRaw("Current: ",T01V22_A14389AEATFechaE[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAEATHi"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1V21905( )
   {
      beforeValidate1V21905( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V21905( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1V21905( 0) ;
         checkOptimisticConcurrency1V21905( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V21905( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1V21905( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V28 */
                  pr_default.execute(6, new Object[] {A14381AEATNumero, A14382AEATFExped, A14383AEATRecept, A14384AEATHuella, Boolean.valueOf(n14385AEATAnteri), A14385AEATAnteri, Boolean.valueOf(n14379AEATEstado), A14379AEATEstado, Boolean.valueOf(n14380AEATFRecep), A14380AEATFRecep, Boolean.valueOf(n14386AEATCSV), A14386AEATCSV, A14387AEATXmlEnv, Boolean.valueOf(n14388AEATXmlRes), A14388AEATXmlRes, A14389AEATFechaE});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01V29 */
                  pr_default.execute(7);
                  A14378AEATId = T01V29_A14378AEATId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAEATHi");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1V20( ) ;
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
            load1V21905( ) ;
         }
         endLevel1V21905( ) ;
      }
      closeExtendedTableCursors1V21905( ) ;
   }

   public void update1V21905( )
   {
      beforeValidate1V21905( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V21905( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V21905( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V21905( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1V21905( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01V210 */
                  pr_default.execute(8, new Object[] {A14381AEATNumero, A14382AEATFExped, A14383AEATRecept, A14384AEATHuella, Boolean.valueOf(n14385AEATAnteri), A14385AEATAnteri, Boolean.valueOf(n14379AEATEstado), A14379AEATEstado, Boolean.valueOf(n14380AEATFRecep), A14380AEATFRecep, Boolean.valueOf(n14386AEATCSV), A14386AEATCSV, A14387AEATXmlEnv, Boolean.valueOf(n14388AEATXmlRes), A14388AEATXmlRes, A14389AEATFechaE, Long.valueOf(A14378AEATId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAEATHi");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAEATHi"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1V21905( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1V20( ) ;
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
         endLevel1V21905( ) ;
      }
      closeExtendedTableCursors1V21905( ) ;
   }

   public void deferredUpdate1V21905( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1V21905( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V21905( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1V21905( ) ;
         afterConfirm1V21905( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1V21905( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01V211 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14378AEATId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAEATHi");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1905 == 0 )
                     {
                        initAll1V21905( ) ;
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
                     resetCaption1V20( ) ;
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
      sMode1905 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1V21905( ) ;
      Gx_mode = sMode1905 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1V21905( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1V21905( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1V21905( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "aeat.aeathistorico");
         if ( AnyError == 0 )
         {
            confirmValues1V20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "aeat.aeathistorico");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1V21905( )
   {
      /* Using cursor T01V212 */
      pr_default.execute(10);
      RcdFound1905 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1905 = (short)(1) ;
         A14378AEATId = T01V212_A14378AEATId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1V21905( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1905 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1905 = (short)(1) ;
         A14378AEATId = T01V212_A14378AEATId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
      }
   }

   public void scanEnd1V21905( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1V21905( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1V21905( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1V21905( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1V21905( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1V21905( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1V21905( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1V21905( )
   {
      edtAEATId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATId_Enabled), 5, 0), true);
      edtAEATNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATNumero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATNumero_Enabled), 5, 0), true);
      edtAEATFExped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATFExped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATFExped_Enabled), 5, 0), true);
      edtAEATRecept_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATRecept_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATRecept_Enabled), 5, 0), true);
      edtAEATHuella_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATHuella_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATHuella_Enabled), 5, 0), true);
      edtAEATAnteri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATAnteri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATAnteri_Enabled), 5, 0), true);
      edtAEATEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATEstado_Enabled), 5, 0), true);
      edtAEATFRecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATFRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATFRecep_Enabled), 5, 0), true);
      edtAEATCSV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATCSV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATCSV_Enabled), 5, 0), true);
      edtAEATXmlEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATXmlEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATXmlEnv_Enabled), 5, 0), true);
      edtAEATXmlRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATXmlRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATXmlRes_Enabled), 5, 0), true);
      edtAEATFechaE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAEATFechaE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAEATFechaE_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1V21905( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1V20( )
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
      httpContext.writeValue( httpContext.getMessage( "AEATHistorico", "")) ;
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
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.aeat.aeathistorico", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14378AEATId", GXutil.ltrim( localUtil.ntoc( Z14378AEATId, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14381AEATNumero", Z14381AEATNumero);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14382AEATFExped", localUtil.dtoc( Z14382AEATFExped, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14383AEATRecept", Z14383AEATRecept);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14384AEATHuella", Z14384AEATHuella);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14385AEATAnteri", Z14385AEATAnteri);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14379AEATEstado", Z14379AEATEstado);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14380AEATFRecep", localUtil.ttoc( Z14380AEATFRecep, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14386AEATCSV", Z14386AEATCSV);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14389AEATFechaE", localUtil.ttoc( Z14389AEATFechaE, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
   }

   public void renderHtmlCloseForm1V21905( )
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
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "AEAT.AEATHistorico" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AEATHistorico", "") ;
   }

   public void initializeNonKey1V21905( )
   {
      A14381AEATNumero = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14381AEATNumero", A14381AEATNumero);
      A14382AEATFExped = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14382AEATFExped", localUtil.format(A14382AEATFExped, "99/99/99"));
      A14383AEATRecept = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14383AEATRecept", A14383AEATRecept);
      A14384AEATHuella = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14384AEATHuella", A14384AEATHuella);
      A14385AEATAnteri = "" ;
      n14385AEATAnteri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14385AEATAnteri", A14385AEATAnteri);
      A14379AEATEstado = "" ;
      n14379AEATEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14379AEATEstado", A14379AEATEstado);
      A14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      n14380AEATFRecep = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14380AEATFRecep", localUtil.ttoc( A14380AEATFRecep, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14386AEATCSV = "" ;
      n14386AEATCSV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14386AEATCSV", A14386AEATCSV);
      A14387AEATXmlEnv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14387AEATXmlEnv", A14387AEATXmlEnv);
      A14388AEATXmlRes = "" ;
      n14388AEATXmlRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14388AEATXmlRes", A14388AEATXmlRes);
      A14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14389AEATFechaE", localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z14381AEATNumero = "" ;
      Z14382AEATFExped = GXutil.nullDate() ;
      Z14383AEATRecept = "" ;
      Z14384AEATHuella = "" ;
      Z14385AEATAnteri = "" ;
      Z14379AEATEstado = "" ;
      Z14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      Z14386AEATCSV = "" ;
      Z14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1V21905( )
   {
      A14378AEATId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14378AEATId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14378AEATId), 18, 0));
      initializeNonKey1V21905( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612519111558", true, true);
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
      httpContext.AddJavascriptSource("aeat/aeathistorico.js", "?202612519111558", false, true);
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
      edtAEATId_Internalname = "AEATID" ;
      edtAEATNumero_Internalname = "AEATNUMERO" ;
      edtAEATFExped_Internalname = "AEATFEXPED" ;
      edtAEATRecept_Internalname = "AEATRECEPT" ;
      edtAEATHuella_Internalname = "AEATHUELLA" ;
      edtAEATAnteri_Internalname = "AEATANTERI" ;
      edtAEATEstado_Internalname = "AEATESTADO" ;
      edtAEATFRecep_Internalname = "AEATFRECEP" ;
      edtAEATCSV_Internalname = "AEATCSV" ;
      edtAEATXmlEnv_Internalname = "AEATXMLENV" ;
      edtAEATXmlRes_Internalname = "AEATXMLRES" ;
      edtAEATFechaE_Internalname = "AEATFECHAE" ;
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
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAEATFechaE_Jsonclick = "" ;
      edtAEATFechaE_Enabled = 1 ;
      edtAEATXmlRes_Enabled = 1 ;
      edtAEATXmlEnv_Enabled = 1 ;
      edtAEATCSV_Jsonclick = "" ;
      edtAEATCSV_Enabled = 1 ;
      edtAEATFRecep_Jsonclick = "" ;
      edtAEATFRecep_Enabled = 1 ;
      edtAEATEstado_Jsonclick = "" ;
      edtAEATEstado_Enabled = 1 ;
      edtAEATAnteri_Jsonclick = "" ;
      edtAEATAnteri_Enabled = 1 ;
      edtAEATHuella_Jsonclick = "" ;
      edtAEATHuella_Enabled = 1 ;
      edtAEATRecept_Jsonclick = "" ;
      edtAEATRecept_Enabled = 1 ;
      edtAEATFExped_Jsonclick = "" ;
      edtAEATFExped_Enabled = 1 ;
      edtAEATNumero_Jsonclick = "" ;
      edtAEATNumero_Enabled = 1 ;
      edtAEATId_Jsonclick = "" ;
      edtAEATId_Enabled = 1 ;
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
      GX_FocusControl = edtAEATNumero_Internalname ;
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

   public void valid_Aeatid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14381AEATNumero", A14381AEATNumero);
      httpContext.ajax_rsp_assign_attri("", false, "A14382AEATFExped", localUtil.format(A14382AEATFExped, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A14383AEATRecept", A14383AEATRecept);
      httpContext.ajax_rsp_assign_attri("", false, "A14384AEATHuella", A14384AEATHuella);
      httpContext.ajax_rsp_assign_attri("", false, "A14385AEATAnteri", A14385AEATAnteri);
      httpContext.ajax_rsp_assign_attri("", false, "A14379AEATEstado", A14379AEATEstado);
      httpContext.ajax_rsp_assign_attri("", false, "A14380AEATFRecep", localUtil.ttoc( A14380AEATFRecep, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14386AEATCSV", A14386AEATCSV);
      httpContext.ajax_rsp_assign_attri("", false, "A14387AEATXmlEnv", A14387AEATXmlEnv);
      httpContext.ajax_rsp_assign_attri("", false, "A14388AEATXmlRes", A14388AEATXmlRes);
      httpContext.ajax_rsp_assign_attri("", false, "A14389AEATFechaE", localUtil.ttoc( A14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14378AEATId", GXutil.ltrim( localUtil.ntoc( Z14378AEATId, (byte)(18), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14381AEATNumero", Z14381AEATNumero);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14382AEATFExped", localUtil.format(Z14382AEATFExped, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14383AEATRecept", Z14383AEATRecept);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14384AEATHuella", Z14384AEATHuella);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14385AEATAnteri", Z14385AEATAnteri);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14379AEATEstado", Z14379AEATEstado);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14380AEATFRecep", localUtil.ttoc( Z14380AEATFRecep, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14386AEATCSV", Z14386AEATCSV);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14387AEATXmlEnv", Z14387AEATXmlEnv);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14388AEATXmlRes", Z14388AEATXmlRes);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14389AEATFechaE", localUtil.ttoc( Z14389AEATFechaE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      setEventMetadata("VALID_AEATID","{handler:'valid_Aeatid',iparms:[{av:'A14378AEATId',fld:'AEATID',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AEATID",",oparms:[{av:'A14381AEATNumero',fld:'AEATNUMERO',pic:''},{av:'A14382AEATFExped',fld:'AEATFEXPED',pic:''},{av:'A14383AEATRecept',fld:'AEATRECEPT',pic:''},{av:'A14384AEATHuella',fld:'AEATHUELLA',pic:''},{av:'A14385AEATAnteri',fld:'AEATANTERI',pic:''},{av:'A14379AEATEstado',fld:'AEATESTADO',pic:''},{av:'A14380AEATFRecep',fld:'AEATFRECEP',pic:'99/99/99 99:99'},{av:'A14386AEATCSV',fld:'AEATCSV',pic:''},{av:'A14387AEATXmlEnv',fld:'AEATXMLENV',pic:''},{av:'A14388AEATXmlRes',fld:'AEATXMLRES',pic:''},{av:'A14389AEATFechaE',fld:'AEATFECHAE',pic:'99/99/9999 99:99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14378AEATId'},{av:'Z14381AEATNumero'},{av:'Z14382AEATFExped'},{av:'Z14383AEATRecept'},{av:'Z14384AEATHuella'},{av:'Z14385AEATAnteri'},{av:'Z14379AEATEstado'},{av:'Z14380AEATFRecep'},{av:'Z14386AEATCSV'},{av:'Z14387AEATXmlEnv'},{av:'Z14388AEATXmlRes'},{av:'Z14389AEATFechaE'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z14381AEATNumero = "" ;
      Z14382AEATFExped = GXutil.nullDate() ;
      Z14383AEATRecept = "" ;
      Z14384AEATHuella = "" ;
      Z14385AEATAnteri = "" ;
      Z14379AEATEstado = "" ;
      Z14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      Z14386AEATCSV = "" ;
      Z14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
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
      A14381AEATNumero = "" ;
      A14382AEATFExped = GXutil.nullDate() ;
      A14383AEATRecept = "" ;
      A14384AEATHuella = "" ;
      A14385AEATAnteri = "" ;
      A14379AEATEstado = "" ;
      A14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      A14386AEATCSV = "" ;
      A14387AEATXmlEnv = "" ;
      A14388AEATXmlRes = "" ;
      A14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
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
      Z14387AEATXmlEnv = "" ;
      Z14388AEATXmlRes = "" ;
      T01V24_A14387AEATXmlEnv = new String[] {""} ;
      T01V24_A14388AEATXmlRes = new String[] {""} ;
      T01V24_n14388AEATXmlRes = new boolean[] {false} ;
      T01V24_A14378AEATId = new long[1] ;
      T01V24_A14381AEATNumero = new String[] {""} ;
      T01V24_A14382AEATFExped = new java.util.Date[] {GXutil.nullDate()} ;
      T01V24_A14383AEATRecept = new String[] {""} ;
      T01V24_A14384AEATHuella = new String[] {""} ;
      T01V24_A14385AEATAnteri = new String[] {""} ;
      T01V24_n14385AEATAnteri = new boolean[] {false} ;
      T01V24_A14379AEATEstado = new String[] {""} ;
      T01V24_n14379AEATEstado = new boolean[] {false} ;
      T01V24_A14380AEATFRecep = new java.util.Date[] {GXutil.nullDate()} ;
      T01V24_n14380AEATFRecep = new boolean[] {false} ;
      T01V24_A14386AEATCSV = new String[] {""} ;
      T01V24_n14386AEATCSV = new boolean[] {false} ;
      T01V24_A14389AEATFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01V25_A14378AEATId = new long[1] ;
      T01V23_A14388AEATXmlRes = new String[] {""} ;
      T01V23_n14388AEATXmlRes = new boolean[] {false} ;
      T01V23_A14387AEATXmlEnv = new String[] {""} ;
      T01V23_A14378AEATId = new long[1] ;
      T01V23_A14381AEATNumero = new String[] {""} ;
      T01V23_A14382AEATFExped = new java.util.Date[] {GXutil.nullDate()} ;
      T01V23_A14383AEATRecept = new String[] {""} ;
      T01V23_A14384AEATHuella = new String[] {""} ;
      T01V23_A14385AEATAnteri = new String[] {""} ;
      T01V23_n14385AEATAnteri = new boolean[] {false} ;
      T01V23_A14379AEATEstado = new String[] {""} ;
      T01V23_n14379AEATEstado = new boolean[] {false} ;
      T01V23_A14380AEATFRecep = new java.util.Date[] {GXutil.nullDate()} ;
      T01V23_n14380AEATFRecep = new boolean[] {false} ;
      T01V23_A14386AEATCSV = new String[] {""} ;
      T01V23_n14386AEATCSV = new boolean[] {false} ;
      T01V23_A14389AEATFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      sMode1905 = "" ;
      T01V26_A14378AEATId = new long[1] ;
      T01V27_A14378AEATId = new long[1] ;
      T01V22_A14388AEATXmlRes = new String[] {""} ;
      T01V22_n14388AEATXmlRes = new boolean[] {false} ;
      T01V22_A14387AEATXmlEnv = new String[] {""} ;
      T01V22_A14378AEATId = new long[1] ;
      T01V22_A14381AEATNumero = new String[] {""} ;
      T01V22_A14382AEATFExped = new java.util.Date[] {GXutil.nullDate()} ;
      T01V22_A14383AEATRecept = new String[] {""} ;
      T01V22_A14384AEATHuella = new String[] {""} ;
      T01V22_A14385AEATAnteri = new String[] {""} ;
      T01V22_n14385AEATAnteri = new boolean[] {false} ;
      T01V22_A14379AEATEstado = new String[] {""} ;
      T01V22_n14379AEATEstado = new boolean[] {false} ;
      T01V22_A14380AEATFRecep = new java.util.Date[] {GXutil.nullDate()} ;
      T01V22_n14380AEATFRecep = new boolean[] {false} ;
      T01V22_A14386AEATCSV = new String[] {""} ;
      T01V22_n14386AEATCSV = new boolean[] {false} ;
      T01V22_A14389AEATFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01V29_A14378AEATId = new long[1] ;
      T01V212_A14378AEATId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14381AEATNumero = "" ;
      ZZ14382AEATFExped = GXutil.nullDate() ;
      ZZ14383AEATRecept = "" ;
      ZZ14384AEATHuella = "" ;
      ZZ14385AEATAnteri = "" ;
      ZZ14379AEATEstado = "" ;
      ZZ14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      ZZ14386AEATCSV = "" ;
      ZZ14387AEATXmlEnv = "" ;
      ZZ14388AEATXmlRes = "" ;
      ZZ14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.aeat.aeathistorico__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.aeat.aeathistorico__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.aeat.aeathistorico__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.aeathistorico__default(),
         new Object[] {
             new Object[] {
            T01V22_A14388AEATXmlRes, T01V22_n14388AEATXmlRes, T01V22_A14387AEATXmlEnv, T01V22_A14378AEATId, T01V22_A14381AEATNumero, T01V22_A14382AEATFExped, T01V22_A14383AEATRecept, T01V22_A14384AEATHuella, T01V22_A14385AEATAnteri, T01V22_n14385AEATAnteri,
            T01V22_A14379AEATEstado, T01V22_n14379AEATEstado, T01V22_A14380AEATFRecep, T01V22_n14380AEATFRecep, T01V22_A14386AEATCSV, T01V22_n14386AEATCSV, T01V22_A14389AEATFechaE
            }
            , new Object[] {
            T01V23_A14388AEATXmlRes, T01V23_n14388AEATXmlRes, T01V23_A14387AEATXmlEnv, T01V23_A14378AEATId, T01V23_A14381AEATNumero, T01V23_A14382AEATFExped, T01V23_A14383AEATRecept, T01V23_A14384AEATHuella, T01V23_A14385AEATAnteri, T01V23_n14385AEATAnteri,
            T01V23_A14379AEATEstado, T01V23_n14379AEATEstado, T01V23_A14380AEATFRecep, T01V23_n14380AEATFRecep, T01V23_A14386AEATCSV, T01V23_n14386AEATCSV, T01V23_A14389AEATFechaE
            }
            , new Object[] {
            T01V24_A14387AEATXmlEnv, T01V24_A14388AEATXmlRes, T01V24_n14388AEATXmlRes, T01V24_A14378AEATId, T01V24_A14381AEATNumero, T01V24_A14382AEATFExped, T01V24_A14383AEATRecept, T01V24_A14384AEATHuella, T01V24_A14385AEATAnteri, T01V24_n14385AEATAnteri,
            T01V24_A14379AEATEstado, T01V24_n14379AEATEstado, T01V24_A14380AEATFRecep, T01V24_n14380AEATFRecep, T01V24_A14386AEATCSV, T01V24_n14386AEATCSV, T01V24_A14389AEATFechaE
            }
            , new Object[] {
            T01V25_A14378AEATId
            }
            , new Object[] {
            T01V26_A14378AEATId
            }
            , new Object[] {
            T01V27_A14378AEATId
            }
            , new Object[] {
            }
            , new Object[] {
            T01V29_A14378AEATId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01V212_A14378AEATId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte nDynComponent ;
   private byte Gx_BScreen ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1905 ;
   private short nIsDirty_1905 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtAEATId_Enabled ;
   private int edtAEATNumero_Enabled ;
   private int edtAEATFExped_Enabled ;
   private int edtAEATRecept_Enabled ;
   private int edtAEATHuella_Enabled ;
   private int edtAEATAnteri_Enabled ;
   private int edtAEATEstado_Enabled ;
   private int edtAEATFRecep_Enabled ;
   private int edtAEATCSV_Enabled ;
   private int edtAEATXmlEnv_Enabled ;
   private int edtAEATXmlRes_Enabled ;
   private int edtAEATFechaE_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14378AEATId ;
   private long A14378AEATId ;
   private long ZZ14378AEATId ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAEATId_Internalname ;
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
   private String edtAEATId_Jsonclick ;
   private String edtAEATNumero_Internalname ;
   private String edtAEATNumero_Jsonclick ;
   private String edtAEATFExped_Internalname ;
   private String edtAEATFExped_Jsonclick ;
   private String edtAEATRecept_Internalname ;
   private String edtAEATRecept_Jsonclick ;
   private String edtAEATHuella_Internalname ;
   private String edtAEATHuella_Jsonclick ;
   private String edtAEATAnteri_Internalname ;
   private String edtAEATAnteri_Jsonclick ;
   private String edtAEATEstado_Internalname ;
   private String edtAEATEstado_Jsonclick ;
   private String edtAEATFRecep_Internalname ;
   private String edtAEATFRecep_Jsonclick ;
   private String edtAEATCSV_Internalname ;
   private String edtAEATCSV_Jsonclick ;
   private String edtAEATXmlEnv_Internalname ;
   private String edtAEATXmlRes_Internalname ;
   private String edtAEATFechaE_Internalname ;
   private String edtAEATFechaE_Jsonclick ;
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
   private String sMode1905 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14380AEATFRecep ;
   private java.util.Date Z14389AEATFechaE ;
   private java.util.Date A14380AEATFRecep ;
   private java.util.Date A14389AEATFechaE ;
   private java.util.Date ZZ14380AEATFRecep ;
   private java.util.Date ZZ14389AEATFechaE ;
   private java.util.Date Z14382AEATFExped ;
   private java.util.Date A14382AEATFExped ;
   private java.util.Date ZZ14382AEATFExped ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14385AEATAnteri ;
   private boolean n14379AEATEstado ;
   private boolean n14380AEATFRecep ;
   private boolean n14386AEATCSV ;
   private boolean n14388AEATXmlRes ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A14387AEATXmlEnv ;
   private String A14388AEATXmlRes ;
   private String Z14387AEATXmlEnv ;
   private String Z14388AEATXmlRes ;
   private String ZZ14387AEATXmlEnv ;
   private String ZZ14388AEATXmlRes ;
   private String Z14381AEATNumero ;
   private String Z14383AEATRecept ;
   private String Z14384AEATHuella ;
   private String Z14385AEATAnteri ;
   private String Z14379AEATEstado ;
   private String Z14386AEATCSV ;
   private String A14381AEATNumero ;
   private String A14383AEATRecept ;
   private String A14384AEATHuella ;
   private String A14385AEATAnteri ;
   private String A14379AEATEstado ;
   private String A14386AEATCSV ;
   private String ZZ14381AEATNumero ;
   private String ZZ14383AEATRecept ;
   private String ZZ14384AEATHuella ;
   private String ZZ14385AEATAnteri ;
   private String ZZ14379AEATEstado ;
   private String ZZ14386AEATCSV ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private String[] T01V24_A14387AEATXmlEnv ;
   private String[] T01V24_A14388AEATXmlRes ;
   private boolean[] T01V24_n14388AEATXmlRes ;
   private long[] T01V24_A14378AEATId ;
   private String[] T01V24_A14381AEATNumero ;
   private java.util.Date[] T01V24_A14382AEATFExped ;
   private String[] T01V24_A14383AEATRecept ;
   private String[] T01V24_A14384AEATHuella ;
   private String[] T01V24_A14385AEATAnteri ;
   private boolean[] T01V24_n14385AEATAnteri ;
   private String[] T01V24_A14379AEATEstado ;
   private boolean[] T01V24_n14379AEATEstado ;
   private java.util.Date[] T01V24_A14380AEATFRecep ;
   private boolean[] T01V24_n14380AEATFRecep ;
   private String[] T01V24_A14386AEATCSV ;
   private boolean[] T01V24_n14386AEATCSV ;
   private java.util.Date[] T01V24_A14389AEATFechaE ;
   private long[] T01V25_A14378AEATId ;
   private String[] T01V23_A14388AEATXmlRes ;
   private boolean[] T01V23_n14388AEATXmlRes ;
   private String[] T01V23_A14387AEATXmlEnv ;
   private long[] T01V23_A14378AEATId ;
   private String[] T01V23_A14381AEATNumero ;
   private java.util.Date[] T01V23_A14382AEATFExped ;
   private String[] T01V23_A14383AEATRecept ;
   private String[] T01V23_A14384AEATHuella ;
   private String[] T01V23_A14385AEATAnteri ;
   private boolean[] T01V23_n14385AEATAnteri ;
   private String[] T01V23_A14379AEATEstado ;
   private boolean[] T01V23_n14379AEATEstado ;
   private java.util.Date[] T01V23_A14380AEATFRecep ;
   private boolean[] T01V23_n14380AEATFRecep ;
   private String[] T01V23_A14386AEATCSV ;
   private boolean[] T01V23_n14386AEATCSV ;
   private java.util.Date[] T01V23_A14389AEATFechaE ;
   private long[] T01V26_A14378AEATId ;
   private long[] T01V27_A14378AEATId ;
   private String[] T01V22_A14388AEATXmlRes ;
   private boolean[] T01V22_n14388AEATXmlRes ;
   private String[] T01V22_A14387AEATXmlEnv ;
   private long[] T01V22_A14378AEATId ;
   private String[] T01V22_A14381AEATNumero ;
   private java.util.Date[] T01V22_A14382AEATFExped ;
   private String[] T01V22_A14383AEATRecept ;
   private String[] T01V22_A14384AEATHuella ;
   private String[] T01V22_A14385AEATAnteri ;
   private boolean[] T01V22_n14385AEATAnteri ;
   private String[] T01V22_A14379AEATEstado ;
   private boolean[] T01V22_n14379AEATEstado ;
   private java.util.Date[] T01V22_A14380AEATFRecep ;
   private boolean[] T01V22_n14380AEATFRecep ;
   private String[] T01V22_A14386AEATCSV ;
   private boolean[] T01V22_n14386AEATCSV ;
   private java.util.Date[] T01V22_A14389AEATFechaE ;
   private long[] T01V29_A14378AEATId ;
   private long[] T01V212_A14378AEATId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class aeathistorico__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class aeathistorico__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class aeathistorico__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class aeathistorico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01V22", "SELECT AEATXmlRes, AEATXmlEnv, AEATId, AEATNumero, AEATFExped, AEATRecept, AEATHuella, AEATAnteri, AEATEstado, AEATFRecep, AEATCSV, AEATFechaE FROM TXPAEATHi WHERE AEATId = ?  FOR UPDATE OF AEATNumero, AEATFExped, AEATRecept, AEATHuella, AEATAnteri, AEATEstado, AEATFRecep, AEATCSV, AEATXmlEnv, AEATXmlRes, AEATFechaE NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V23", "SELECT AEATXmlRes, AEATXmlEnv, AEATId, AEATNumero, AEATFExped, AEATRecept, AEATHuella, AEATAnteri, AEATEstado, AEATFRecep, AEATCSV, AEATFechaE FROM TXPAEATHi WHERE AEATId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V24", "SELECT /*+ FIRST_ROWS(100) */ TM1.AEATXmlEnv, TM1.AEATXmlRes, TM1.AEATId, TM1.AEATNumero, TM1.AEATFExped, TM1.AEATRecept, TM1.AEATHuella, TM1.AEATAnteri, TM1.AEATEstado, TM1.AEATFRecep, TM1.AEATCSV, TM1.AEATFechaE FROM TXPAEATHi TM1 WHERE TM1.AEATId = ? ORDER BY TM1.AEATId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V25", "SELECT /*+ FIRST_ROWS(1) */ AEATId FROM TXPAEATHi WHERE AEATId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01V26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AEATId FROM TXPAEATHi WHERE ( AEATId > ?) ORDER BY AEATId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01V27", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AEATId FROM TXPAEATHi WHERE ( AEATId < ?) ORDER BY AEATId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01V28", "INSERT INTO TXPAEATHi(AEATNumero, AEATFExped, AEATRecept, AEATHuella, AEATAnteri, AEATEstado, AEATFRecep, AEATCSV, AEATXmlEnv, AEATXmlRes, AEATFechaE) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAEATHi")
         ,new ForEachCursor("T01V29", "SELECT AEATId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01V210", "UPDATE TXPAEATHi SET AEATNumero=?, AEATFExped=?, AEATRecept=?, AEATHuella=?, AEATAnteri=?, AEATEstado=?, AEATFRecep=?, AEATCSV=?, AEATXmlEnv=?, AEATXmlRes=?, AEATFechaE=?  WHERE AEATId = ?", GX_NOMASK, "TXPAEATHi")
         ,new UpdateCursor("T01V211", "DELETE FROM TXPAEATHi  WHERE AEATId = ?", GX_NOMASK, "TXPAEATHi")
         ,new ForEachCursor("T01V212", "SELECT /*+ FIRST_ROWS(100) */ AEATId FROM TXPAEATHi ORDER BY AEATId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getLongVarchar(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getLongVarchar(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getLongVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
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
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 10 :
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
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 100);
               }
               stmt.setLongVarchar(9, (String)parms[12], false);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[14]);
               }
               stmt.setDateTime(11, (java.util.Date)parms[15], false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 100);
               }
               stmt.setLongVarchar(9, (String)parms[12], false);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[14]);
               }
               stmt.setDateTime(11, (java.util.Date)parms[15], false);
               stmt.setLong(12, ((Number) parms[16]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

