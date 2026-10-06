package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class madet_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MADet", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMADetId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public madet_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public madet_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( madet_impl.class ));
   }

   public madet_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MADet", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AnticipacionErrores\\MADet.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AnticipacionErrores\\MADet.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetId_Internalname, GXutil.ltrim( localUtil.ntoc( A14582MADetId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14582MADetId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14582MADetId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMADetFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetFec_Internalname, localUtil.format(A14586MADetFec, "99/99/99"), localUtil.format( A14586MADetFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMADetFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMADetFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AnticipacionErrores\\MADet.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetEmprC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetEmprC_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetEmprC_Internalname, GXutil.rtrim( A14587MADetEmprC), GXutil.rtrim( localUtil.format( A14587MADetEmprC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetEmprC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetEmprC_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetCliCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetCliCo_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetCliCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14585MADetCliCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetCliCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14585MADetCliCo), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14585MADetCliCo), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetCliCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetCliCo_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetCliNo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetCliNo_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetCliNo_Internalname, A14651MADetCliNo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", (short)(0), 1, edtMADetCliNo_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetArtCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetArtCo_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetArtCo_Internalname, GXutil.rtrim( A14588MADetArtCo), GXutil.rtrim( localUtil.format( A14588MADetArtCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetArtCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetArtCo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetArtDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetArtDs_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetArtDs_Internalname, A14652MADetArtDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", (short)(0), 1, edtMADetArtDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetColNo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetColNo_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetColNo_Internalname, GXutil.rtrim( A14653MADetColNo), GXutil.rtrim( localUtil.format( A14653MADetColNo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetColNo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetColNo_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetColNu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetColNu_Internalname, httpContext.getMessage( "Nro.Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetColNu_Internalname, GXutil.ltrim( localUtil.ntoc( A14589MADetColNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetColNu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14589MADetColNu), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14589MADetColNu), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetColNu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetColNu_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetColCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetColCo_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetColCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14654MADetColCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetColCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14654MADetColCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14654MADetColCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetColCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetColCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMatCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMatCo_Internalname, httpContext.getMessage( "Cód Matiz", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetMatCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14592MADetMatCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetMatCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14592MADetMatCo), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14592MADetMatCo), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetMatCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetMatCo_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMatDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMatDs_Internalname, httpContext.getMessage( "Matiz", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetMatDs_Internalname, A14655MADetMatDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), 1, edtMADetMatDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetIntCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetIntCo_Internalname, httpContext.getMessage( "Cód. Intensidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetIntCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14593MADetIntCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetIntCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14593MADetIntCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14593MADetIntCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetIntCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetIntCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetIntDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetIntDs_Internalname, httpContext.getMessage( "Intensidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetIntDs_Internalname, A14660MADetIntDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", (short)(0), 1, edtMADetIntDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMaqCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMaqCo_Internalname, httpContext.getMessage( "Cód. máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetMaqCo_Internalname, GXutil.rtrim( A14591MADetMaqCo), GXutil.rtrim( localUtil.format( A14591MADetMaqCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetMaqCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetMaqCo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMaqDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMaqDs_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetMaqDs_Internalname, A14656MADetMaqDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", (short)(0), 1, edtMADetMaqDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetTipMC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetTipMC_Internalname, httpContext.getMessage( "Cód.  Tipo Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetTipMC_Internalname, GXutil.rtrim( A14590MADetTipMC), GXutil.rtrim( localUtil.format( A14590MADetTipMC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetTipMC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetTipMC_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetTipMD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetTipMD_Internalname, httpContext.getMessage( "Tipo Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetTipMD_Internalname, A14657MADetTipMD, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", (short)(0), 1, edtMADetTipMD_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetKilPr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetKilPr_Internalname, httpContext.getMessage( "Kilos Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetKilPr_Internalname, GXutil.ltrim( localUtil.ntoc( A14658MADetKilPr, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetKilPr_Enabled!=0) ? localUtil.format( A14658MADetKilPr, "ZZZZZZZZ9.99") : localUtil.format( A14658MADetKilPr, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetKilPr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetKilPr_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetKilRe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetKilRe_Internalname, httpContext.getMessage( "Kilos Reoperados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetKilRe_Internalname, GXutil.ltrim( localUtil.ntoc( A14659MADetKilRe, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetKilRe_Enabled!=0) ? localUtil.format( A14659MADetKilRe, "ZZZZZZZZ9.99") : localUtil.format( A14659MADetKilRe, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetKilRe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetKilRe_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetKilTo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetKilTo_Internalname, httpContext.getMessage( "Kilos Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetKilTo_Internalname, GXutil.ltrim( localUtil.ntoc( A14661MADetKilTo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetKilTo_Enabled!=0) ? localUtil.format( A14661MADetKilTo, "ZZZZZZZZ9.99") : localUtil.format( A14661MADetKilTo, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetKilTo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetKilTo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetDefCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetDefCo_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetDefCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14662MADetDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetDefCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14662MADetDefCo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14662MADetDefCo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetDefCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetDefCo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetDefDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetDefDs_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetDefDs_Internalname, A14663MADetDefDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", (short)(0), 1, edtMADetDefDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetCatCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetCatCo_Internalname, httpContext.getMessage( "Categoria Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetCatCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14664MADetCatCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetCatCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14664MADetCatCo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14664MADetCatCo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetCatCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetCatCo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetCatDs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetCatDs_Internalname, httpContext.getMessage( "Categoria", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetCatDs_Internalname, A14665MADetCatDs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", (short)(0), 1, edtMADetCatDs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "Mensaje", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetUsu_Internalname, GXutil.rtrim( A14584MADetUsu), GXutil.rtrim( localUtil.format( A14584MADetUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMADetTkn_Internalname, A14583MADetTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", (short)(0), 1, edtMADetTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetBarCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetBarCo_Internalname, httpContext.getMessage( "Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetBarCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14666MADetBarCo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetBarCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14666MADetBarCo), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14666MADetBarCo), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetBarCo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetBarCo_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetBarRe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetBarRe_Internalname, httpContext.getMessage( "Reoperado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetBarRe_Internalname, GXutil.ltrim( localUtil.ntoc( A14667MADetBarRe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetBarRe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14667MADetBarRe), "9") : localUtil.format( DecimalUtil.doubleToDec(A14667MADetBarRe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetBarRe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetBarRe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetBarPa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetBarPa_Internalname, httpContext.getMessage( "Particion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetBarPa_Internalname, GXutil.rtrim( A14668MADetBarPa), GXutil.rtrim( localUtil.format( A14668MADetBarPa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetBarPa_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetBarPa_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetHdr_Internalname, httpContext.getMessage( "HDR", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetHdr_Internalname, GXutil.rtrim( A14669MADetHdr), GXutil.rtrim( localUtil.format( A14669MADetHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMetPr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMetPr_Internalname, httpContext.getMessage( "Metros Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetMetPr_Internalname, GXutil.ltrim( localUtil.ntoc( A14670MADetMetPr, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetMetPr_Enabled!=0) ? localUtil.format( A14670MADetMetPr, "ZZZZZZZZ9.99") : localUtil.format( A14670MADetMetPr, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetMetPr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetMetPr_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMetRe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMetRe_Internalname, httpContext.getMessage( "Metros Reoperados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetMetRe_Internalname, GXutil.ltrim( localUtil.ntoc( A14671MADetMetRe, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetMetRe_Enabled!=0) ? localUtil.format( A14671MADetMetRe, "ZZZZZZZZ9.99") : localUtil.format( A14671MADetMetRe, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetMetRe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetMetRe_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMADetMetTo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMADetMetTo_Internalname, httpContext.getMessage( "Metros Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMADetMetTo_Internalname, GXutil.ltrim( localUtil.ntoc( A14672MADetMetTo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMADetMetTo_Enabled!=0) ? localUtil.format( A14672MADetMetTo, "ZZZZZZZZ9.99") : localUtil.format( A14672MADetMetTo, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMADetMetTo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMADetMetTo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AnticipacionErrores\\MADet.htm");
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
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AnticipacionErrores\\MADet.htm");
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
         Z14582MADetId = localUtil.ctol( httpContext.cgiGet( "Z14582MADetId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14586MADetFec = localUtil.ctod( httpContext.cgiGet( "Z14586MADetFec"), 0) ;
         Z14587MADetEmprC = httpContext.cgiGet( "Z14587MADetEmprC") ;
         Z14585MADetCliCo = (int)(localUtil.ctol( httpContext.cgiGet( "Z14585MADetCliCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14651MADetCliNo = httpContext.cgiGet( "Z14651MADetCliNo") ;
         Z14588MADetArtCo = httpContext.cgiGet( "Z14588MADetArtCo") ;
         Z14652MADetArtDs = httpContext.cgiGet( "Z14652MADetArtDs") ;
         Z14653MADetColNo = httpContext.cgiGet( "Z14653MADetColNo") ;
         Z14589MADetColNu = (int)(localUtil.ctol( httpContext.cgiGet( "Z14589MADetColNu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14654MADetColCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14654MADetColCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14592MADetMatCo = (short)(localUtil.ctol( httpContext.cgiGet( "Z14592MADetMatCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14655MADetMatDs = httpContext.cgiGet( "Z14655MADetMatDs") ;
         Z14593MADetIntCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14593MADetIntCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14660MADetIntDs = httpContext.cgiGet( "Z14660MADetIntDs") ;
         Z14591MADetMaqCo = httpContext.cgiGet( "Z14591MADetMaqCo") ;
         Z14656MADetMaqDs = httpContext.cgiGet( "Z14656MADetMaqDs") ;
         Z14590MADetTipMC = httpContext.cgiGet( "Z14590MADetTipMC") ;
         Z14657MADetTipMD = httpContext.cgiGet( "Z14657MADetTipMD") ;
         Z14658MADetKilPr = localUtil.ctond( httpContext.cgiGet( "Z14658MADetKilPr")) ;
         Z14659MADetKilRe = localUtil.ctond( httpContext.cgiGet( "Z14659MADetKilRe")) ;
         Z14661MADetKilTo = localUtil.ctond( httpContext.cgiGet( "Z14661MADetKilTo")) ;
         Z14662MADetDefCo = (short)(localUtil.ctol( httpContext.cgiGet( "Z14662MADetDefCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14663MADetDefDs = httpContext.cgiGet( "Z14663MADetDefDs") ;
         Z14664MADetCatCo = (short)(localUtil.ctol( httpContext.cgiGet( "Z14664MADetCatCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14665MADetCatDs = httpContext.cgiGet( "Z14665MADetCatDs") ;
         Z14584MADetUsu = httpContext.cgiGet( "Z14584MADetUsu") ;
         Z14583MADetTkn = httpContext.cgiGet( "Z14583MADetTkn") ;
         Z14666MADetBarCo = (int)(localUtil.ctol( httpContext.cgiGet( "Z14666MADetBarCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14667MADetBarRe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14667MADetBarRe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14668MADetBarPa = httpContext.cgiGet( "Z14668MADetBarPa") ;
         Z14670MADetMetPr = localUtil.ctond( httpContext.cgiGet( "Z14670MADetMetPr")) ;
         Z14671MADetMetRe = localUtil.ctond( httpContext.cgiGet( "Z14671MADetMetRe")) ;
         Z14672MADetMetTo = localUtil.ctond( httpContext.cgiGet( "Z14672MADetMetTo")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14582MADetId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
         }
         else
         {
            A14582MADetId = localUtil.ctol( httpContext.cgiGet( edtMADetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtMADetFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MADETFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14586MADetFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A14586MADetFec", localUtil.format(A14586MADetFec, "99/99/99"));
         }
         else
         {
            A14586MADetFec = localUtil.ctod( httpContext.cgiGet( edtMADetFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14586MADetFec", localUtil.format(A14586MADetFec, "99/99/99"));
         }
         A14587MADetEmprC = httpContext.cgiGet( edtMADetEmprC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14587MADetEmprC", A14587MADetEmprC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetCliCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetCliCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETCLICO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetCliCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14585MADetCliCo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14585MADetCliCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14585MADetCliCo), 6, 0));
         }
         else
         {
            A14585MADetCliCo = (int)(localUtil.ctol( httpContext.cgiGet( edtMADetCliCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14585MADetCliCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14585MADetCliCo), 6, 0));
         }
         A14651MADetCliNo = httpContext.cgiGet( edtMADetCliNo_Internalname) ;
         n14651MADetCliNo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14651MADetCliNo", A14651MADetCliNo);
         A14588MADetArtCo = httpContext.cgiGet( edtMADetArtCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14588MADetArtCo", A14588MADetArtCo);
         A14652MADetArtDs = httpContext.cgiGet( edtMADetArtDs_Internalname) ;
         n14652MADetArtDs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14652MADetArtDs", A14652MADetArtDs);
         A14653MADetColNo = httpContext.cgiGet( edtMADetColNo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14653MADetColNo", A14653MADetColNo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETCOLNU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetColNu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14589MADetColNu = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14589MADetColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14589MADetColNu), 6, 0));
         }
         else
         {
            A14589MADetColNu = (int)(localUtil.ctol( httpContext.cgiGet( edtMADetColNu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14589MADetColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14589MADetColNu), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetColCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetColCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETCOLCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetColCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14654MADetColCo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14654MADetColCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14654MADetColCo), 2, 0));
         }
         else
         {
            A14654MADetColCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMADetColCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14654MADetColCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14654MADetColCo), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetMatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetMatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETMATCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetMatCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14592MADetMatCo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14592MADetMatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14592MADetMatCo), 3, 0));
         }
         else
         {
            A14592MADetMatCo = (short)(localUtil.ctol( httpContext.cgiGet( edtMADetMatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14592MADetMatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14592MADetMatCo), 3, 0));
         }
         A14655MADetMatDs = httpContext.cgiGet( edtMADetMatDs_Internalname) ;
         n14655MADetMatDs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14655MADetMatDs", A14655MADetMatDs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetIntCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetIntCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETINTCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetIntCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14593MADetIntCo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14593MADetIntCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14593MADetIntCo), 2, 0));
         }
         else
         {
            A14593MADetIntCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMADetIntCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14593MADetIntCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14593MADetIntCo), 2, 0));
         }
         A14660MADetIntDs = httpContext.cgiGet( edtMADetIntDs_Internalname) ;
         n14660MADetIntDs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14660MADetIntDs", A14660MADetIntDs);
         A14591MADetMaqCo = httpContext.cgiGet( edtMADetMaqCo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14591MADetMaqCo", A14591MADetMaqCo);
         A14656MADetMaqDs = httpContext.cgiGet( edtMADetMaqDs_Internalname) ;
         n14656MADetMaqDs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14656MADetMaqDs", A14656MADetMaqDs);
         A14590MADetTipMC = httpContext.cgiGet( edtMADetTipMC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14590MADetTipMC", A14590MADetTipMC);
         A14657MADetTipMD = httpContext.cgiGet( edtMADetTipMD_Internalname) ;
         n14657MADetTipMD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14657MADetTipMD", A14657MADetTipMD);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMADetKilPr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMADetKilPr_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETKILPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetKilPr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14658MADetKilPr = DecimalUtil.ZERO ;
            n14658MADetKilPr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14658MADetKilPr", GXutil.ltrimstr( A14658MADetKilPr, 12, 2));
         }
         else
         {
            A14658MADetKilPr = localUtil.ctond( httpContext.cgiGet( edtMADetKilPr_Internalname)) ;
            n14658MADetKilPr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14658MADetKilPr", GXutil.ltrimstr( A14658MADetKilPr, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMADetKilRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMADetKilRe_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETKILRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetKilRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14659MADetKilRe = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14659MADetKilRe", GXutil.ltrimstr( A14659MADetKilRe, 12, 2));
         }
         else
         {
            A14659MADetKilRe = localUtil.ctond( httpContext.cgiGet( edtMADetKilRe_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14659MADetKilRe", GXutil.ltrimstr( A14659MADetKilRe, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMADetKilTo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMADetKilTo_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETKILTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetKilTo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14661MADetKilTo = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14661MADetKilTo", GXutil.ltrimstr( A14661MADetKilTo, 12, 2));
         }
         else
         {
            A14661MADetKilTo = localUtil.ctond( httpContext.cgiGet( edtMADetKilTo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14661MADetKilTo", GXutil.ltrimstr( A14661MADetKilTo, 12, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETDEFCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetDefCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14662MADetDefCo = (short)(0) ;
            n14662MADetDefCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14662MADetDefCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14662MADetDefCo), 4, 0));
         }
         else
         {
            A14662MADetDefCo = (short)(localUtil.ctol( httpContext.cgiGet( edtMADetDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14662MADetDefCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14662MADetDefCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14662MADetDefCo), 4, 0));
         }
         A14663MADetDefDs = httpContext.cgiGet( edtMADetDefDs_Internalname) ;
         n14663MADetDefDs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14663MADetDefDs", A14663MADetDefDs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetCatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetCatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETCATCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetCatCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14664MADetCatCo = (short)(0) ;
            n14664MADetCatCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14664MADetCatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14664MADetCatCo), 4, 0));
         }
         else
         {
            A14664MADetCatCo = (short)(localUtil.ctol( httpContext.cgiGet( edtMADetCatCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14664MADetCatCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14664MADetCatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14664MADetCatCo), 4, 0));
         }
         A14665MADetCatDs = httpContext.cgiGet( edtMADetCatDs_Internalname) ;
         n14665MADetCatDs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14665MADetCatDs", A14665MADetCatDs);
         A14584MADetUsu = httpContext.cgiGet( edtMADetUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14584MADetUsu", A14584MADetUsu);
         A14583MADetTkn = httpContext.cgiGet( edtMADetTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14583MADetTkn", A14583MADetTkn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetBarCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetBarCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETBARCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetBarCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14666MADetBarCo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14666MADetBarCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14666MADetBarCo), 8, 0));
         }
         else
         {
            A14666MADetBarCo = (int)(localUtil.ctol( httpContext.cgiGet( edtMADetBarCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14666MADetBarCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14666MADetBarCo), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMADetBarRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMADetBarRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETBARRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetBarRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14667MADetBarRe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14667MADetBarRe", GXutil.str( A14667MADetBarRe, 1, 0));
         }
         else
         {
            A14667MADetBarRe = (byte)(localUtil.ctol( httpContext.cgiGet( edtMADetBarRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14667MADetBarRe", GXutil.str( A14667MADetBarRe, 1, 0));
         }
         A14668MADetBarPa = httpContext.cgiGet( edtMADetBarPa_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14668MADetBarPa", A14668MADetBarPa);
         A14669MADetHdr = httpContext.cgiGet( edtMADetHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14669MADetHdr", A14669MADetHdr);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMADetMetPr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMADetMetPr_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETMETPR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetMetPr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14670MADetMetPr = DecimalUtil.ZERO ;
            n14670MADetMetPr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14670MADetMetPr", GXutil.ltrimstr( A14670MADetMetPr, 12, 2));
         }
         else
         {
            A14670MADetMetPr = localUtil.ctond( httpContext.cgiGet( edtMADetMetPr_Internalname)) ;
            n14670MADetMetPr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14670MADetMetPr", GXutil.ltrimstr( A14670MADetMetPr, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMADetMetRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMADetMetRe_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETMETRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetMetRe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14671MADetMetRe = DecimalUtil.ZERO ;
            n14671MADetMetRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14671MADetMetRe", GXutil.ltrimstr( A14671MADetMetRe, 12, 2));
         }
         else
         {
            A14671MADetMetRe = localUtil.ctond( httpContext.cgiGet( edtMADetMetRe_Internalname)) ;
            n14671MADetMetRe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14671MADetMetRe", GXutil.ltrimstr( A14671MADetMetRe, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMADetMetTo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMADetMetTo_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MADETMETTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMADetMetTo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14672MADetMetTo = DecimalUtil.ZERO ;
            n14672MADetMetTo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14672MADetMetTo", GXutil.ltrimstr( A14672MADetMetTo, 12, 2));
         }
         else
         {
            A14672MADetMetTo = localUtil.ctond( httpContext.cgiGet( edtMADetMetTo_Internalname)) ;
            n14672MADetMetTo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14672MADetMetTo", GXutil.ltrimstr( A14672MADetMetTo, 12, 2));
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
            A14582MADetId = GXutil.lval( httpContext.GetPar( "MADetId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
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
            initAll1W61918( ) ;
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
      disableAttributes1W61918( ) ;
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

   public void resetCaption1W60( )
   {
   }

   public void zm1W61918( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14586MADetFec = T01W63_A14586MADetFec[0] ;
            Z14587MADetEmprC = T01W63_A14587MADetEmprC[0] ;
            Z14585MADetCliCo = T01W63_A14585MADetCliCo[0] ;
            Z14651MADetCliNo = T01W63_A14651MADetCliNo[0] ;
            Z14588MADetArtCo = T01W63_A14588MADetArtCo[0] ;
            Z14652MADetArtDs = T01W63_A14652MADetArtDs[0] ;
            Z14653MADetColNo = T01W63_A14653MADetColNo[0] ;
            Z14589MADetColNu = T01W63_A14589MADetColNu[0] ;
            Z14654MADetColCo = T01W63_A14654MADetColCo[0] ;
            Z14592MADetMatCo = T01W63_A14592MADetMatCo[0] ;
            Z14655MADetMatDs = T01W63_A14655MADetMatDs[0] ;
            Z14593MADetIntCo = T01W63_A14593MADetIntCo[0] ;
            Z14660MADetIntDs = T01W63_A14660MADetIntDs[0] ;
            Z14591MADetMaqCo = T01W63_A14591MADetMaqCo[0] ;
            Z14656MADetMaqDs = T01W63_A14656MADetMaqDs[0] ;
            Z14590MADetTipMC = T01W63_A14590MADetTipMC[0] ;
            Z14657MADetTipMD = T01W63_A14657MADetTipMD[0] ;
            Z14658MADetKilPr = T01W63_A14658MADetKilPr[0] ;
            Z14659MADetKilRe = T01W63_A14659MADetKilRe[0] ;
            Z14661MADetKilTo = T01W63_A14661MADetKilTo[0] ;
            Z14662MADetDefCo = T01W63_A14662MADetDefCo[0] ;
            Z14663MADetDefDs = T01W63_A14663MADetDefDs[0] ;
            Z14664MADetCatCo = T01W63_A14664MADetCatCo[0] ;
            Z14665MADetCatDs = T01W63_A14665MADetCatDs[0] ;
            Z14584MADetUsu = T01W63_A14584MADetUsu[0] ;
            Z14583MADetTkn = T01W63_A14583MADetTkn[0] ;
            Z14666MADetBarCo = T01W63_A14666MADetBarCo[0] ;
            Z14667MADetBarRe = T01W63_A14667MADetBarRe[0] ;
            Z14668MADetBarPa = T01W63_A14668MADetBarPa[0] ;
            Z14670MADetMetPr = T01W63_A14670MADetMetPr[0] ;
            Z14671MADetMetRe = T01W63_A14671MADetMetRe[0] ;
            Z14672MADetMetTo = T01W63_A14672MADetMetTo[0] ;
         }
         else
         {
            Z14586MADetFec = A14586MADetFec ;
            Z14587MADetEmprC = A14587MADetEmprC ;
            Z14585MADetCliCo = A14585MADetCliCo ;
            Z14651MADetCliNo = A14651MADetCliNo ;
            Z14588MADetArtCo = A14588MADetArtCo ;
            Z14652MADetArtDs = A14652MADetArtDs ;
            Z14653MADetColNo = A14653MADetColNo ;
            Z14589MADetColNu = A14589MADetColNu ;
            Z14654MADetColCo = A14654MADetColCo ;
            Z14592MADetMatCo = A14592MADetMatCo ;
            Z14655MADetMatDs = A14655MADetMatDs ;
            Z14593MADetIntCo = A14593MADetIntCo ;
            Z14660MADetIntDs = A14660MADetIntDs ;
            Z14591MADetMaqCo = A14591MADetMaqCo ;
            Z14656MADetMaqDs = A14656MADetMaqDs ;
            Z14590MADetTipMC = A14590MADetTipMC ;
            Z14657MADetTipMD = A14657MADetTipMD ;
            Z14658MADetKilPr = A14658MADetKilPr ;
            Z14659MADetKilRe = A14659MADetKilRe ;
            Z14661MADetKilTo = A14661MADetKilTo ;
            Z14662MADetDefCo = A14662MADetDefCo ;
            Z14663MADetDefDs = A14663MADetDefDs ;
            Z14664MADetCatCo = A14664MADetCatCo ;
            Z14665MADetCatDs = A14665MADetCatDs ;
            Z14584MADetUsu = A14584MADetUsu ;
            Z14583MADetTkn = A14583MADetTkn ;
            Z14666MADetBarCo = A14666MADetBarCo ;
            Z14667MADetBarRe = A14667MADetBarRe ;
            Z14668MADetBarPa = A14668MADetBarPa ;
            Z14670MADetMetPr = A14670MADetMetPr ;
            Z14671MADetMetRe = A14671MADetMetRe ;
            Z14672MADetMetTo = A14672MADetMetTo ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z14582MADetId = A14582MADetId ;
         Z14586MADetFec = A14586MADetFec ;
         Z14587MADetEmprC = A14587MADetEmprC ;
         Z14585MADetCliCo = A14585MADetCliCo ;
         Z14651MADetCliNo = A14651MADetCliNo ;
         Z14588MADetArtCo = A14588MADetArtCo ;
         Z14652MADetArtDs = A14652MADetArtDs ;
         Z14653MADetColNo = A14653MADetColNo ;
         Z14589MADetColNu = A14589MADetColNu ;
         Z14654MADetColCo = A14654MADetColCo ;
         Z14592MADetMatCo = A14592MADetMatCo ;
         Z14655MADetMatDs = A14655MADetMatDs ;
         Z14593MADetIntCo = A14593MADetIntCo ;
         Z14660MADetIntDs = A14660MADetIntDs ;
         Z14591MADetMaqCo = A14591MADetMaqCo ;
         Z14656MADetMaqDs = A14656MADetMaqDs ;
         Z14590MADetTipMC = A14590MADetTipMC ;
         Z14657MADetTipMD = A14657MADetTipMD ;
         Z14658MADetKilPr = A14658MADetKilPr ;
         Z14659MADetKilRe = A14659MADetKilRe ;
         Z14661MADetKilTo = A14661MADetKilTo ;
         Z14662MADetDefCo = A14662MADetDefCo ;
         Z14663MADetDefDs = A14663MADetDefDs ;
         Z14664MADetCatCo = A14664MADetCatCo ;
         Z14665MADetCatDs = A14665MADetCatDs ;
         Z14584MADetUsu = A14584MADetUsu ;
         Z14583MADetTkn = A14583MADetTkn ;
         Z14666MADetBarCo = A14666MADetBarCo ;
         Z14667MADetBarRe = A14667MADetBarRe ;
         Z14668MADetBarPa = A14668MADetBarPa ;
         Z14670MADetMetPr = A14670MADetMetPr ;
         Z14671MADetMetRe = A14671MADetMetRe ;
         Z14672MADetMetTo = A14672MADetMetTo ;
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

   public void load1W61918( )
   {
      /* Using cursor T01W64 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14582MADetId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1918 = (short)(1) ;
         A14586MADetFec = T01W64_A14586MADetFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14586MADetFec", localUtil.format(A14586MADetFec, "99/99/99"));
         A14587MADetEmprC = T01W64_A14587MADetEmprC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14587MADetEmprC", A14587MADetEmprC);
         A14585MADetCliCo = T01W64_A14585MADetCliCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14585MADetCliCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14585MADetCliCo), 6, 0));
         A14651MADetCliNo = T01W64_A14651MADetCliNo[0] ;
         n14651MADetCliNo = T01W64_n14651MADetCliNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14651MADetCliNo", A14651MADetCliNo);
         A14588MADetArtCo = T01W64_A14588MADetArtCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14588MADetArtCo", A14588MADetArtCo);
         A14652MADetArtDs = T01W64_A14652MADetArtDs[0] ;
         n14652MADetArtDs = T01W64_n14652MADetArtDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14652MADetArtDs", A14652MADetArtDs);
         A14653MADetColNo = T01W64_A14653MADetColNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14653MADetColNo", A14653MADetColNo);
         A14589MADetColNu = T01W64_A14589MADetColNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14589MADetColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14589MADetColNu), 6, 0));
         A14654MADetColCo = T01W64_A14654MADetColCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14654MADetColCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14654MADetColCo), 2, 0));
         A14592MADetMatCo = T01W64_A14592MADetMatCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14592MADetMatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14592MADetMatCo), 3, 0));
         A14655MADetMatDs = T01W64_A14655MADetMatDs[0] ;
         n14655MADetMatDs = T01W64_n14655MADetMatDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14655MADetMatDs", A14655MADetMatDs);
         A14593MADetIntCo = T01W64_A14593MADetIntCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14593MADetIntCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14593MADetIntCo), 2, 0));
         A14660MADetIntDs = T01W64_A14660MADetIntDs[0] ;
         n14660MADetIntDs = T01W64_n14660MADetIntDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14660MADetIntDs", A14660MADetIntDs);
         A14591MADetMaqCo = T01W64_A14591MADetMaqCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14591MADetMaqCo", A14591MADetMaqCo);
         A14656MADetMaqDs = T01W64_A14656MADetMaqDs[0] ;
         n14656MADetMaqDs = T01W64_n14656MADetMaqDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14656MADetMaqDs", A14656MADetMaqDs);
         A14590MADetTipMC = T01W64_A14590MADetTipMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14590MADetTipMC", A14590MADetTipMC);
         A14657MADetTipMD = T01W64_A14657MADetTipMD[0] ;
         n14657MADetTipMD = T01W64_n14657MADetTipMD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14657MADetTipMD", A14657MADetTipMD);
         A14658MADetKilPr = T01W64_A14658MADetKilPr[0] ;
         n14658MADetKilPr = T01W64_n14658MADetKilPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14658MADetKilPr", GXutil.ltrimstr( A14658MADetKilPr, 12, 2));
         A14659MADetKilRe = T01W64_A14659MADetKilRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14659MADetKilRe", GXutil.ltrimstr( A14659MADetKilRe, 12, 2));
         A14661MADetKilTo = T01W64_A14661MADetKilTo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14661MADetKilTo", GXutil.ltrimstr( A14661MADetKilTo, 12, 2));
         A14662MADetDefCo = T01W64_A14662MADetDefCo[0] ;
         n14662MADetDefCo = T01W64_n14662MADetDefCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14662MADetDefCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14662MADetDefCo), 4, 0));
         A14663MADetDefDs = T01W64_A14663MADetDefDs[0] ;
         n14663MADetDefDs = T01W64_n14663MADetDefDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14663MADetDefDs", A14663MADetDefDs);
         A14664MADetCatCo = T01W64_A14664MADetCatCo[0] ;
         n14664MADetCatCo = T01W64_n14664MADetCatCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14664MADetCatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14664MADetCatCo), 4, 0));
         A14665MADetCatDs = T01W64_A14665MADetCatDs[0] ;
         n14665MADetCatDs = T01W64_n14665MADetCatDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14665MADetCatDs", A14665MADetCatDs);
         A14584MADetUsu = T01W64_A14584MADetUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14584MADetUsu", A14584MADetUsu);
         A14583MADetTkn = T01W64_A14583MADetTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14583MADetTkn", A14583MADetTkn);
         A14666MADetBarCo = T01W64_A14666MADetBarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14666MADetBarCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14666MADetBarCo), 8, 0));
         A14667MADetBarRe = T01W64_A14667MADetBarRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14667MADetBarRe", GXutil.str( A14667MADetBarRe, 1, 0));
         A14668MADetBarPa = T01W64_A14668MADetBarPa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14668MADetBarPa", A14668MADetBarPa);
         A14670MADetMetPr = T01W64_A14670MADetMetPr[0] ;
         n14670MADetMetPr = T01W64_n14670MADetMetPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14670MADetMetPr", GXutil.ltrimstr( A14670MADetMetPr, 12, 2));
         A14671MADetMetRe = T01W64_A14671MADetMetRe[0] ;
         n14671MADetMetRe = T01W64_n14671MADetMetRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14671MADetMetRe", GXutil.ltrimstr( A14671MADetMetRe, 12, 2));
         A14672MADetMetTo = T01W64_A14672MADetMetTo[0] ;
         n14672MADetMetTo = T01W64_n14672MADetMetTo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14672MADetMetTo", GXutil.ltrimstr( A14672MADetMetTo, 12, 2));
         zm1W61918( -2) ;
      }
      pr_default.close(2);
      onLoadActions1W61918( ) ;
   }

   public void onLoadActions1W61918( )
   {
      A14669MADetHdr = GXutil.trim( GXutil.str( A14666MADetBarCo, 8, 0)) + GXutil.trim( GXutil.str( A14667MADetBarRe, 1, 0)) + A14668MADetBarPa ;
      httpContext.ajax_rsp_assign_attri("", false, "A14669MADetHdr", A14669MADetHdr);
   }

   public void checkExtendedTable1W61918( )
   {
      nIsDirty_1918 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1918 = (short)(1) ;
      A14669MADetHdr = GXutil.trim( GXutil.str( A14666MADetBarCo, 8, 0)) + GXutil.trim( GXutil.str( A14667MADetBarRe, 1, 0)) + A14668MADetBarPa ;
      httpContext.ajax_rsp_assign_attri("", false, "A14669MADetHdr", A14669MADetHdr);
   }

   public void closeExtendedTableCursors1W61918( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W61918( )
   {
      /* Using cursor T01W65 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14582MADetId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1918 = (short)(1) ;
      }
      else
      {
         RcdFound1918 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W63 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14582MADetId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1W61918( 2) ;
         RcdFound1918 = (short)(1) ;
         A14582MADetId = T01W63_A14582MADetId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
         A14586MADetFec = T01W63_A14586MADetFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14586MADetFec", localUtil.format(A14586MADetFec, "99/99/99"));
         A14587MADetEmprC = T01W63_A14587MADetEmprC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14587MADetEmprC", A14587MADetEmprC);
         A14585MADetCliCo = T01W63_A14585MADetCliCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14585MADetCliCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14585MADetCliCo), 6, 0));
         A14651MADetCliNo = T01W63_A14651MADetCliNo[0] ;
         n14651MADetCliNo = T01W63_n14651MADetCliNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14651MADetCliNo", A14651MADetCliNo);
         A14588MADetArtCo = T01W63_A14588MADetArtCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14588MADetArtCo", A14588MADetArtCo);
         A14652MADetArtDs = T01W63_A14652MADetArtDs[0] ;
         n14652MADetArtDs = T01W63_n14652MADetArtDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14652MADetArtDs", A14652MADetArtDs);
         A14653MADetColNo = T01W63_A14653MADetColNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14653MADetColNo", A14653MADetColNo);
         A14589MADetColNu = T01W63_A14589MADetColNu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14589MADetColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14589MADetColNu), 6, 0));
         A14654MADetColCo = T01W63_A14654MADetColCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14654MADetColCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14654MADetColCo), 2, 0));
         A14592MADetMatCo = T01W63_A14592MADetMatCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14592MADetMatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14592MADetMatCo), 3, 0));
         A14655MADetMatDs = T01W63_A14655MADetMatDs[0] ;
         n14655MADetMatDs = T01W63_n14655MADetMatDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14655MADetMatDs", A14655MADetMatDs);
         A14593MADetIntCo = T01W63_A14593MADetIntCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14593MADetIntCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14593MADetIntCo), 2, 0));
         A14660MADetIntDs = T01W63_A14660MADetIntDs[0] ;
         n14660MADetIntDs = T01W63_n14660MADetIntDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14660MADetIntDs", A14660MADetIntDs);
         A14591MADetMaqCo = T01W63_A14591MADetMaqCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14591MADetMaqCo", A14591MADetMaqCo);
         A14656MADetMaqDs = T01W63_A14656MADetMaqDs[0] ;
         n14656MADetMaqDs = T01W63_n14656MADetMaqDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14656MADetMaqDs", A14656MADetMaqDs);
         A14590MADetTipMC = T01W63_A14590MADetTipMC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14590MADetTipMC", A14590MADetTipMC);
         A14657MADetTipMD = T01W63_A14657MADetTipMD[0] ;
         n14657MADetTipMD = T01W63_n14657MADetTipMD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14657MADetTipMD", A14657MADetTipMD);
         A14658MADetKilPr = T01W63_A14658MADetKilPr[0] ;
         n14658MADetKilPr = T01W63_n14658MADetKilPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14658MADetKilPr", GXutil.ltrimstr( A14658MADetKilPr, 12, 2));
         A14659MADetKilRe = T01W63_A14659MADetKilRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14659MADetKilRe", GXutil.ltrimstr( A14659MADetKilRe, 12, 2));
         A14661MADetKilTo = T01W63_A14661MADetKilTo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14661MADetKilTo", GXutil.ltrimstr( A14661MADetKilTo, 12, 2));
         A14662MADetDefCo = T01W63_A14662MADetDefCo[0] ;
         n14662MADetDefCo = T01W63_n14662MADetDefCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14662MADetDefCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14662MADetDefCo), 4, 0));
         A14663MADetDefDs = T01W63_A14663MADetDefDs[0] ;
         n14663MADetDefDs = T01W63_n14663MADetDefDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14663MADetDefDs", A14663MADetDefDs);
         A14664MADetCatCo = T01W63_A14664MADetCatCo[0] ;
         n14664MADetCatCo = T01W63_n14664MADetCatCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14664MADetCatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14664MADetCatCo), 4, 0));
         A14665MADetCatDs = T01W63_A14665MADetCatDs[0] ;
         n14665MADetCatDs = T01W63_n14665MADetCatDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14665MADetCatDs", A14665MADetCatDs);
         A14584MADetUsu = T01W63_A14584MADetUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14584MADetUsu", A14584MADetUsu);
         A14583MADetTkn = T01W63_A14583MADetTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14583MADetTkn", A14583MADetTkn);
         A14666MADetBarCo = T01W63_A14666MADetBarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14666MADetBarCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14666MADetBarCo), 8, 0));
         A14667MADetBarRe = T01W63_A14667MADetBarRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14667MADetBarRe", GXutil.str( A14667MADetBarRe, 1, 0));
         A14668MADetBarPa = T01W63_A14668MADetBarPa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14668MADetBarPa", A14668MADetBarPa);
         A14670MADetMetPr = T01W63_A14670MADetMetPr[0] ;
         n14670MADetMetPr = T01W63_n14670MADetMetPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14670MADetMetPr", GXutil.ltrimstr( A14670MADetMetPr, 12, 2));
         A14671MADetMetRe = T01W63_A14671MADetMetRe[0] ;
         n14671MADetMetRe = T01W63_n14671MADetMetRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14671MADetMetRe", GXutil.ltrimstr( A14671MADetMetRe, 12, 2));
         A14672MADetMetTo = T01W63_A14672MADetMetTo[0] ;
         n14672MADetMetTo = T01W63_n14672MADetMetTo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14672MADetMetTo", GXutil.ltrimstr( A14672MADetMetTo, 12, 2));
         Z14582MADetId = A14582MADetId ;
         sMode1918 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W61918( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1918 = (short)(0) ;
            initializeNonKey1W61918( ) ;
         }
         Gx_mode = sMode1918 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1918 = (short)(0) ;
         initializeNonKey1W61918( ) ;
         sMode1918 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1918 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W61918( ) ;
      if ( RcdFound1918 == 0 )
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
      RcdFound1918 = (short)(0) ;
      /* Using cursor T01W66 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14582MADetId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01W66_A14582MADetId[0] < A14582MADetId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01W66_A14582MADetId[0] > A14582MADetId ) ) )
         {
            A14582MADetId = T01W66_A14582MADetId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
            RcdFound1918 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1918 = (short)(0) ;
      /* Using cursor T01W67 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14582MADetId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01W67_A14582MADetId[0] > A14582MADetId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01W67_A14582MADetId[0] < A14582MADetId ) ) )
         {
            A14582MADetId = T01W67_A14582MADetId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
            RcdFound1918 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W61918( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMADetId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W61918( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1918 == 1 )
         {
            if ( A14582MADetId != Z14582MADetId )
            {
               A14582MADetId = Z14582MADetId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MADETID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMADetId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMADetId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W61918( ) ;
               GX_FocusControl = edtMADetId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14582MADetId != Z14582MADetId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMADetId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W61918( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MADETID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMADetId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMADetId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W61918( ) ;
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
      if ( A14582MADetId != Z14582MADetId )
      {
         A14582MADetId = Z14582MADetId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MADETID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMADetId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMADetId_Internalname ;
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
      if ( RcdFound1918 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MADETID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMADetId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMADetFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1W61918( ) ;
      if ( RcdFound1918 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMADetFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W61918( ) ;
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
      if ( RcdFound1918 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMADetFec_Internalname ;
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
      if ( RcdFound1918 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMADetFec_Internalname ;
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
      scanStart1W61918( ) ;
      if ( RcdFound1918 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1918 != 0 )
         {
            scanNext1W61918( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMADetFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W61918( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W61918( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W62 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14582MADetId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MADet"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z14586MADetFec), GXutil.resetTime(T01W62_A14586MADetFec[0])) ) || ( GXutil.strcmp(Z14587MADetEmprC, T01W62_A14587MADetEmprC[0]) != 0 ) || ( Z14585MADetCliCo != T01W62_A14585MADetCliCo[0] ) || ( GXutil.strcmp(Z14651MADetCliNo, T01W62_A14651MADetCliNo[0]) != 0 ) || ( GXutil.strcmp(Z14588MADetArtCo, T01W62_A14588MADetArtCo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14652MADetArtDs, T01W62_A14652MADetArtDs[0]) != 0 ) || ( GXutil.strcmp(Z14653MADetColNo, T01W62_A14653MADetColNo[0]) != 0 ) || ( Z14589MADetColNu != T01W62_A14589MADetColNu[0] ) || ( Z14654MADetColCo != T01W62_A14654MADetColCo[0] ) || ( Z14592MADetMatCo != T01W62_A14592MADetMatCo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14655MADetMatDs, T01W62_A14655MADetMatDs[0]) != 0 ) || ( Z14593MADetIntCo != T01W62_A14593MADetIntCo[0] ) || ( GXutil.strcmp(Z14660MADetIntDs, T01W62_A14660MADetIntDs[0]) != 0 ) || ( GXutil.strcmp(Z14591MADetMaqCo, T01W62_A14591MADetMaqCo[0]) != 0 ) || ( GXutil.strcmp(Z14656MADetMaqDs, T01W62_A14656MADetMaqDs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14590MADetTipMC, T01W62_A14590MADetTipMC[0]) != 0 ) || ( GXutil.strcmp(Z14657MADetTipMD, T01W62_A14657MADetTipMD[0]) != 0 ) || ( DecimalUtil.compareTo(Z14658MADetKilPr, T01W62_A14658MADetKilPr[0]) != 0 ) || ( DecimalUtil.compareTo(Z14659MADetKilRe, T01W62_A14659MADetKilRe[0]) != 0 ) || ( DecimalUtil.compareTo(Z14661MADetKilTo, T01W62_A14661MADetKilTo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14662MADetDefCo != T01W62_A14662MADetDefCo[0] ) || ( GXutil.strcmp(Z14663MADetDefDs, T01W62_A14663MADetDefDs[0]) != 0 ) || ( Z14664MADetCatCo != T01W62_A14664MADetCatCo[0] ) || ( GXutil.strcmp(Z14665MADetCatDs, T01W62_A14665MADetCatDs[0]) != 0 ) || ( GXutil.strcmp(Z14584MADetUsu, T01W62_A14584MADetUsu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14583MADetTkn, T01W62_A14583MADetTkn[0]) != 0 ) || ( Z14666MADetBarCo != T01W62_A14666MADetBarCo[0] ) || ( Z14667MADetBarRe != T01W62_A14667MADetBarRe[0] ) || ( GXutil.strcmp(Z14668MADetBarPa, T01W62_A14668MADetBarPa[0]) != 0 ) || ( DecimalUtil.compareTo(Z14670MADetMetPr, T01W62_A14670MADetMetPr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14671MADetMetRe, T01W62_A14671MADetMetRe[0]) != 0 ) || ( DecimalUtil.compareTo(Z14672MADetMetTo, T01W62_A14672MADetMetTo[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14586MADetFec), GXutil.resetTime(T01W62_A14586MADetFec[0])) ) )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetFec");
               GXutil.writeLogRaw("Old: ",Z14586MADetFec);
               GXutil.writeLogRaw("Current: ",T01W62_A14586MADetFec[0]);
            }
            if ( GXutil.strcmp(Z14587MADetEmprC, T01W62_A14587MADetEmprC[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetEmprC");
               GXutil.writeLogRaw("Old: ",Z14587MADetEmprC);
               GXutil.writeLogRaw("Current: ",T01W62_A14587MADetEmprC[0]);
            }
            if ( Z14585MADetCliCo != T01W62_A14585MADetCliCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetCliCo");
               GXutil.writeLogRaw("Old: ",Z14585MADetCliCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14585MADetCliCo[0]);
            }
            if ( GXutil.strcmp(Z14651MADetCliNo, T01W62_A14651MADetCliNo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetCliNo");
               GXutil.writeLogRaw("Old: ",Z14651MADetCliNo);
               GXutil.writeLogRaw("Current: ",T01W62_A14651MADetCliNo[0]);
            }
            if ( GXutil.strcmp(Z14588MADetArtCo, T01W62_A14588MADetArtCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetArtCo");
               GXutil.writeLogRaw("Old: ",Z14588MADetArtCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14588MADetArtCo[0]);
            }
            if ( GXutil.strcmp(Z14652MADetArtDs, T01W62_A14652MADetArtDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetArtDs");
               GXutil.writeLogRaw("Old: ",Z14652MADetArtDs);
               GXutil.writeLogRaw("Current: ",T01W62_A14652MADetArtDs[0]);
            }
            if ( GXutil.strcmp(Z14653MADetColNo, T01W62_A14653MADetColNo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetColNo");
               GXutil.writeLogRaw("Old: ",Z14653MADetColNo);
               GXutil.writeLogRaw("Current: ",T01W62_A14653MADetColNo[0]);
            }
            if ( Z14589MADetColNu != T01W62_A14589MADetColNu[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetColNu");
               GXutil.writeLogRaw("Old: ",Z14589MADetColNu);
               GXutil.writeLogRaw("Current: ",T01W62_A14589MADetColNu[0]);
            }
            if ( Z14654MADetColCo != T01W62_A14654MADetColCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetColCo");
               GXutil.writeLogRaw("Old: ",Z14654MADetColCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14654MADetColCo[0]);
            }
            if ( Z14592MADetMatCo != T01W62_A14592MADetMatCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMatCo");
               GXutil.writeLogRaw("Old: ",Z14592MADetMatCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14592MADetMatCo[0]);
            }
            if ( GXutil.strcmp(Z14655MADetMatDs, T01W62_A14655MADetMatDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMatDs");
               GXutil.writeLogRaw("Old: ",Z14655MADetMatDs);
               GXutil.writeLogRaw("Current: ",T01W62_A14655MADetMatDs[0]);
            }
            if ( Z14593MADetIntCo != T01W62_A14593MADetIntCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetIntCo");
               GXutil.writeLogRaw("Old: ",Z14593MADetIntCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14593MADetIntCo[0]);
            }
            if ( GXutil.strcmp(Z14660MADetIntDs, T01W62_A14660MADetIntDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetIntDs");
               GXutil.writeLogRaw("Old: ",Z14660MADetIntDs);
               GXutil.writeLogRaw("Current: ",T01W62_A14660MADetIntDs[0]);
            }
            if ( GXutil.strcmp(Z14591MADetMaqCo, T01W62_A14591MADetMaqCo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMaqCo");
               GXutil.writeLogRaw("Old: ",Z14591MADetMaqCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14591MADetMaqCo[0]);
            }
            if ( GXutil.strcmp(Z14656MADetMaqDs, T01W62_A14656MADetMaqDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMaqDs");
               GXutil.writeLogRaw("Old: ",Z14656MADetMaqDs);
               GXutil.writeLogRaw("Current: ",T01W62_A14656MADetMaqDs[0]);
            }
            if ( GXutil.strcmp(Z14590MADetTipMC, T01W62_A14590MADetTipMC[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetTipMC");
               GXutil.writeLogRaw("Old: ",Z14590MADetTipMC);
               GXutil.writeLogRaw("Current: ",T01W62_A14590MADetTipMC[0]);
            }
            if ( GXutil.strcmp(Z14657MADetTipMD, T01W62_A14657MADetTipMD[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetTipMD");
               GXutil.writeLogRaw("Old: ",Z14657MADetTipMD);
               GXutil.writeLogRaw("Current: ",T01W62_A14657MADetTipMD[0]);
            }
            if ( DecimalUtil.compareTo(Z14658MADetKilPr, T01W62_A14658MADetKilPr[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetKilPr");
               GXutil.writeLogRaw("Old: ",Z14658MADetKilPr);
               GXutil.writeLogRaw("Current: ",T01W62_A14658MADetKilPr[0]);
            }
            if ( DecimalUtil.compareTo(Z14659MADetKilRe, T01W62_A14659MADetKilRe[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetKilRe");
               GXutil.writeLogRaw("Old: ",Z14659MADetKilRe);
               GXutil.writeLogRaw("Current: ",T01W62_A14659MADetKilRe[0]);
            }
            if ( DecimalUtil.compareTo(Z14661MADetKilTo, T01W62_A14661MADetKilTo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetKilTo");
               GXutil.writeLogRaw("Old: ",Z14661MADetKilTo);
               GXutil.writeLogRaw("Current: ",T01W62_A14661MADetKilTo[0]);
            }
            if ( Z14662MADetDefCo != T01W62_A14662MADetDefCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetDefCo");
               GXutil.writeLogRaw("Old: ",Z14662MADetDefCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14662MADetDefCo[0]);
            }
            if ( GXutil.strcmp(Z14663MADetDefDs, T01W62_A14663MADetDefDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetDefDs");
               GXutil.writeLogRaw("Old: ",Z14663MADetDefDs);
               GXutil.writeLogRaw("Current: ",T01W62_A14663MADetDefDs[0]);
            }
            if ( Z14664MADetCatCo != T01W62_A14664MADetCatCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetCatCo");
               GXutil.writeLogRaw("Old: ",Z14664MADetCatCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14664MADetCatCo[0]);
            }
            if ( GXutil.strcmp(Z14665MADetCatDs, T01W62_A14665MADetCatDs[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetCatDs");
               GXutil.writeLogRaw("Old: ",Z14665MADetCatDs);
               GXutil.writeLogRaw("Current: ",T01W62_A14665MADetCatDs[0]);
            }
            if ( GXutil.strcmp(Z14584MADetUsu, T01W62_A14584MADetUsu[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetUsu");
               GXutil.writeLogRaw("Old: ",Z14584MADetUsu);
               GXutil.writeLogRaw("Current: ",T01W62_A14584MADetUsu[0]);
            }
            if ( GXutil.strcmp(Z14583MADetTkn, T01W62_A14583MADetTkn[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetTkn");
               GXutil.writeLogRaw("Old: ",Z14583MADetTkn);
               GXutil.writeLogRaw("Current: ",T01W62_A14583MADetTkn[0]);
            }
            if ( Z14666MADetBarCo != T01W62_A14666MADetBarCo[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetBarCo");
               GXutil.writeLogRaw("Old: ",Z14666MADetBarCo);
               GXutil.writeLogRaw("Current: ",T01W62_A14666MADetBarCo[0]);
            }
            if ( Z14667MADetBarRe != T01W62_A14667MADetBarRe[0] )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetBarRe");
               GXutil.writeLogRaw("Old: ",Z14667MADetBarRe);
               GXutil.writeLogRaw("Current: ",T01W62_A14667MADetBarRe[0]);
            }
            if ( GXutil.strcmp(Z14668MADetBarPa, T01W62_A14668MADetBarPa[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetBarPa");
               GXutil.writeLogRaw("Old: ",Z14668MADetBarPa);
               GXutil.writeLogRaw("Current: ",T01W62_A14668MADetBarPa[0]);
            }
            if ( DecimalUtil.compareTo(Z14670MADetMetPr, T01W62_A14670MADetMetPr[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMetPr");
               GXutil.writeLogRaw("Old: ",Z14670MADetMetPr);
               GXutil.writeLogRaw("Current: ",T01W62_A14670MADetMetPr[0]);
            }
            if ( DecimalUtil.compareTo(Z14671MADetMetRe, T01W62_A14671MADetMetRe[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMetRe");
               GXutil.writeLogRaw("Old: ",Z14671MADetMetRe);
               GXutil.writeLogRaw("Current: ",T01W62_A14671MADetMetRe[0]);
            }
            if ( DecimalUtil.compareTo(Z14672MADetMetTo, T01W62_A14672MADetMetTo[0]) != 0 )
            {
               GXutil.writeLogln("anticipacionerrores.madet:[seudo value changed for attri]"+"MADetMetTo");
               GXutil.writeLogRaw("Old: ",Z14672MADetMetTo);
               GXutil.writeLogRaw("Current: ",T01W62_A14672MADetMetTo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MADet"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W61918( )
   {
      beforeValidate1W61918( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W61918( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W61918( 0) ;
         checkOptimisticConcurrency1W61918( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W61918( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W61918( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W68 */
                  pr_default.execute(6, new Object[] {A14586MADetFec, A14587MADetEmprC, Integer.valueOf(A14585MADetCliCo), Boolean.valueOf(n14651MADetCliNo), A14651MADetCliNo, A14588MADetArtCo, Boolean.valueOf(n14652MADetArtDs), A14652MADetArtDs, A14653MADetColNo, Integer.valueOf(A14589MADetColNu), Byte.valueOf(A14654MADetColCo), Short.valueOf(A14592MADetMatCo), Boolean.valueOf(n14655MADetMatDs), A14655MADetMatDs, Byte.valueOf(A14593MADetIntCo), Boolean.valueOf(n14660MADetIntDs), A14660MADetIntDs, A14591MADetMaqCo, Boolean.valueOf(n14656MADetMaqDs), A14656MADetMaqDs, A14590MADetTipMC, Boolean.valueOf(n14657MADetTipMD), A14657MADetTipMD, Boolean.valueOf(n14658MADetKilPr), A14658MADetKilPr, A14659MADetKilRe, A14661MADetKilTo, Boolean.valueOf(n14662MADetDefCo), Short.valueOf(A14662MADetDefCo), Boolean.valueOf(n14663MADetDefDs), A14663MADetDefDs, Boolean.valueOf(n14664MADetCatCo), Short.valueOf(A14664MADetCatCo), Boolean.valueOf(n14665MADetCatDs), A14665MADetCatDs, A14584MADetUsu, A14583MADetTkn, Integer.valueOf(A14666MADetBarCo), Byte.valueOf(A14667MADetBarRe), A14668MADetBarPa, Boolean.valueOf(n14670MADetMetPr), A14670MADetMetPr, Boolean.valueOf(n14671MADetMetRe), A14671MADetMetRe, Boolean.valueOf(n14672MADetMetTo), A14672MADetMetTo});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01W69 */
                  pr_default.execute(7);
                  A14582MADetId = T01W69_A14582MADetId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MADet");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1W60( ) ;
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
            load1W61918( ) ;
         }
         endLevel1W61918( ) ;
      }
      closeExtendedTableCursors1W61918( ) ;
   }

   public void update1W61918( )
   {
      beforeValidate1W61918( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W61918( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W61918( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W61918( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W61918( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W610 */
                  pr_default.execute(8, new Object[] {A14586MADetFec, A14587MADetEmprC, Integer.valueOf(A14585MADetCliCo), Boolean.valueOf(n14651MADetCliNo), A14651MADetCliNo, A14588MADetArtCo, Boolean.valueOf(n14652MADetArtDs), A14652MADetArtDs, A14653MADetColNo, Integer.valueOf(A14589MADetColNu), Byte.valueOf(A14654MADetColCo), Short.valueOf(A14592MADetMatCo), Boolean.valueOf(n14655MADetMatDs), A14655MADetMatDs, Byte.valueOf(A14593MADetIntCo), Boolean.valueOf(n14660MADetIntDs), A14660MADetIntDs, A14591MADetMaqCo, Boolean.valueOf(n14656MADetMaqDs), A14656MADetMaqDs, A14590MADetTipMC, Boolean.valueOf(n14657MADetTipMD), A14657MADetTipMD, Boolean.valueOf(n14658MADetKilPr), A14658MADetKilPr, A14659MADetKilRe, A14661MADetKilTo, Boolean.valueOf(n14662MADetDefCo), Short.valueOf(A14662MADetDefCo), Boolean.valueOf(n14663MADetDefDs), A14663MADetDefDs, Boolean.valueOf(n14664MADetCatCo), Short.valueOf(A14664MADetCatCo), Boolean.valueOf(n14665MADetCatDs), A14665MADetCatDs, A14584MADetUsu, A14583MADetTkn, Integer.valueOf(A14666MADetBarCo), Byte.valueOf(A14667MADetBarRe), A14668MADetBarPa, Boolean.valueOf(n14670MADetMetPr), A14670MADetMetPr, Boolean.valueOf(n14671MADetMetRe), A14671MADetMetRe, Boolean.valueOf(n14672MADetMetTo), A14672MADetMetTo, Long.valueOf(A14582MADetId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MADet");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MADet"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W61918( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1W60( ) ;
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
         endLevel1W61918( ) ;
      }
      closeExtendedTableCursors1W61918( ) ;
   }

   public void deferredUpdate1W61918( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W61918( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W61918( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W61918( ) ;
         afterConfirm1W61918( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W61918( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W611 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14582MADetId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MADet");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1918 == 0 )
                     {
                        initAll1W61918( ) ;
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
                     resetCaption1W60( ) ;
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
      sMode1918 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W61918( ) ;
      Gx_mode = sMode1918 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W61918( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14669MADetHdr = GXutil.trim( GXutil.str( A14666MADetBarCo, 8, 0)) + GXutil.trim( GXutil.str( A14667MADetBarRe, 1, 0)) + A14668MADetBarPa ;
         httpContext.ajax_rsp_assign_attri("", false, "A14669MADetHdr", A14669MADetHdr);
      }
   }

   public void endLevel1W61918( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W61918( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "anticipacionerrores.madet");
         if ( AnyError == 0 )
         {
            confirmValues1W60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "anticipacionerrores.madet");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W61918( )
   {
      /* Using cursor T01W612 */
      pr_default.execute(10);
      RcdFound1918 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1918 = (short)(1) ;
         A14582MADetId = T01W612_A14582MADetId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W61918( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1918 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1918 = (short)(1) ;
         A14582MADetId = T01W612_A14582MADetId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
      }
   }

   public void scanEnd1W61918( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1W61918( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W61918( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W61918( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W61918( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W61918( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W61918( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W61918( )
   {
      edtMADetId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetId_Enabled), 5, 0), true);
      edtMADetFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetFec_Enabled), 5, 0), true);
      edtMADetEmprC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetEmprC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetEmprC_Enabled), 5, 0), true);
      edtMADetCliCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetCliCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCliCo_Enabled), 5, 0), true);
      edtMADetCliNo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetCliNo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCliNo_Enabled), 5, 0), true);
      edtMADetArtCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetArtCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetArtCo_Enabled), 5, 0), true);
      edtMADetArtDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetArtDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetArtDs_Enabled), 5, 0), true);
      edtMADetColNo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetColNo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetColNo_Enabled), 5, 0), true);
      edtMADetColNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetColNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetColNu_Enabled), 5, 0), true);
      edtMADetColCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetColCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetColCo_Enabled), 5, 0), true);
      edtMADetMatCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMatCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMatCo_Enabled), 5, 0), true);
      edtMADetMatDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMatDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMatDs_Enabled), 5, 0), true);
      edtMADetIntCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetIntCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetIntCo_Enabled), 5, 0), true);
      edtMADetIntDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetIntDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetIntDs_Enabled), 5, 0), true);
      edtMADetMaqCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMaqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMaqCo_Enabled), 5, 0), true);
      edtMADetMaqDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMaqDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMaqDs_Enabled), 5, 0), true);
      edtMADetTipMC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetTipMC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetTipMC_Enabled), 5, 0), true);
      edtMADetTipMD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetTipMD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetTipMD_Enabled), 5, 0), true);
      edtMADetKilPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetKilPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetKilPr_Enabled), 5, 0), true);
      edtMADetKilRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetKilRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetKilRe_Enabled), 5, 0), true);
      edtMADetKilTo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetKilTo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetKilTo_Enabled), 5, 0), true);
      edtMADetDefCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetDefCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetDefCo_Enabled), 5, 0), true);
      edtMADetDefDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetDefDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetDefDs_Enabled), 5, 0), true);
      edtMADetCatCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetCatCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCatCo_Enabled), 5, 0), true);
      edtMADetCatDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetCatDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetCatDs_Enabled), 5, 0), true);
      edtMADetUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetUsu_Enabled), 5, 0), true);
      edtMADetTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetTkn_Enabled), 5, 0), true);
      edtMADetBarCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetBarCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetBarCo_Enabled), 5, 0), true);
      edtMADetBarRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetBarRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetBarRe_Enabled), 5, 0), true);
      edtMADetBarPa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetBarPa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetBarPa_Enabled), 5, 0), true);
      edtMADetHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetHdr_Enabled), 5, 0), true);
      edtMADetMetPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMetPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMetPr_Enabled), 5, 0), true);
      edtMADetMetRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMetRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMetRe_Enabled), 5, 0), true);
      edtMADetMetTo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMADetMetTo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMADetMetTo_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W61918( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W60( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.anticipacionerrores.madet", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14582MADetId", GXutil.ltrim( localUtil.ntoc( Z14582MADetId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14586MADetFec", localUtil.dtoc( Z14586MADetFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14587MADetEmprC", GXutil.rtrim( Z14587MADetEmprC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14585MADetCliCo", GXutil.ltrim( localUtil.ntoc( Z14585MADetCliCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14651MADetCliNo", Z14651MADetCliNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14588MADetArtCo", GXutil.rtrim( Z14588MADetArtCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14652MADetArtDs", Z14652MADetArtDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14653MADetColNo", GXutil.rtrim( Z14653MADetColNo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14589MADetColNu", GXutil.ltrim( localUtil.ntoc( Z14589MADetColNu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14654MADetColCo", GXutil.ltrim( localUtil.ntoc( Z14654MADetColCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14592MADetMatCo", GXutil.ltrim( localUtil.ntoc( Z14592MADetMatCo, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14655MADetMatDs", Z14655MADetMatDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14593MADetIntCo", GXutil.ltrim( localUtil.ntoc( Z14593MADetIntCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14660MADetIntDs", Z14660MADetIntDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14591MADetMaqCo", GXutil.rtrim( Z14591MADetMaqCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14656MADetMaqDs", Z14656MADetMaqDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14590MADetTipMC", GXutil.rtrim( Z14590MADetTipMC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14657MADetTipMD", Z14657MADetTipMD);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14658MADetKilPr", GXutil.ltrim( localUtil.ntoc( Z14658MADetKilPr, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14659MADetKilRe", GXutil.ltrim( localUtil.ntoc( Z14659MADetKilRe, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14661MADetKilTo", GXutil.ltrim( localUtil.ntoc( Z14661MADetKilTo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14662MADetDefCo", GXutil.ltrim( localUtil.ntoc( Z14662MADetDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14663MADetDefDs", Z14663MADetDefDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14664MADetCatCo", GXutil.ltrim( localUtil.ntoc( Z14664MADetCatCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14665MADetCatDs", Z14665MADetCatDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14584MADetUsu", GXutil.rtrim( Z14584MADetUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14583MADetTkn", Z14583MADetTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14666MADetBarCo", GXutil.ltrim( localUtil.ntoc( Z14666MADetBarCo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14667MADetBarRe", GXutil.ltrim( localUtil.ntoc( Z14667MADetBarRe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14668MADetBarPa", GXutil.rtrim( Z14668MADetBarPa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14670MADetMetPr", GXutil.ltrim( localUtil.ntoc( Z14670MADetMetPr, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14671MADetMetRe", GXutil.ltrim( localUtil.ntoc( Z14671MADetMetRe, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14672MADetMetTo", GXutil.ltrim( localUtil.ntoc( Z14672MADetMetTo, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.anticipacionerrores.madet", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AnticipacionErrores.MADet" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MADet", "") ;
   }

   public void initializeNonKey1W61918( )
   {
      A14669MADetHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14669MADetHdr", A14669MADetHdr);
      A14586MADetFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14586MADetFec", localUtil.format(A14586MADetFec, "99/99/99"));
      A14587MADetEmprC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14587MADetEmprC", A14587MADetEmprC);
      A14585MADetCliCo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14585MADetCliCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14585MADetCliCo), 6, 0));
      A14651MADetCliNo = "" ;
      n14651MADetCliNo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14651MADetCliNo", A14651MADetCliNo);
      A14588MADetArtCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14588MADetArtCo", A14588MADetArtCo);
      A14652MADetArtDs = "" ;
      n14652MADetArtDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14652MADetArtDs", A14652MADetArtDs);
      A14653MADetColNo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14653MADetColNo", A14653MADetColNo);
      A14589MADetColNu = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14589MADetColNu", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14589MADetColNu), 6, 0));
      A14654MADetColCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14654MADetColCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14654MADetColCo), 2, 0));
      A14592MADetMatCo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14592MADetMatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14592MADetMatCo), 3, 0));
      A14655MADetMatDs = "" ;
      n14655MADetMatDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14655MADetMatDs", A14655MADetMatDs);
      A14593MADetIntCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14593MADetIntCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14593MADetIntCo), 2, 0));
      A14660MADetIntDs = "" ;
      n14660MADetIntDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14660MADetIntDs", A14660MADetIntDs);
      A14591MADetMaqCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14591MADetMaqCo", A14591MADetMaqCo);
      A14656MADetMaqDs = "" ;
      n14656MADetMaqDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14656MADetMaqDs", A14656MADetMaqDs);
      A14590MADetTipMC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14590MADetTipMC", A14590MADetTipMC);
      A14657MADetTipMD = "" ;
      n14657MADetTipMD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14657MADetTipMD", A14657MADetTipMD);
      A14658MADetKilPr = DecimalUtil.ZERO ;
      n14658MADetKilPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14658MADetKilPr", GXutil.ltrimstr( A14658MADetKilPr, 12, 2));
      A14659MADetKilRe = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14659MADetKilRe", GXutil.ltrimstr( A14659MADetKilRe, 12, 2));
      A14661MADetKilTo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14661MADetKilTo", GXutil.ltrimstr( A14661MADetKilTo, 12, 2));
      A14662MADetDefCo = (short)(0) ;
      n14662MADetDefCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14662MADetDefCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14662MADetDefCo), 4, 0));
      A14663MADetDefDs = "" ;
      n14663MADetDefDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14663MADetDefDs", A14663MADetDefDs);
      A14664MADetCatCo = (short)(0) ;
      n14664MADetCatCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14664MADetCatCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14664MADetCatCo), 4, 0));
      A14665MADetCatDs = "" ;
      n14665MADetCatDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14665MADetCatDs", A14665MADetCatDs);
      A14584MADetUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14584MADetUsu", A14584MADetUsu);
      A14583MADetTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14583MADetTkn", A14583MADetTkn);
      A14666MADetBarCo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14666MADetBarCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14666MADetBarCo), 8, 0));
      A14667MADetBarRe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14667MADetBarRe", GXutil.str( A14667MADetBarRe, 1, 0));
      A14668MADetBarPa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14668MADetBarPa", A14668MADetBarPa);
      A14670MADetMetPr = DecimalUtil.ZERO ;
      n14670MADetMetPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14670MADetMetPr", GXutil.ltrimstr( A14670MADetMetPr, 12, 2));
      A14671MADetMetRe = DecimalUtil.ZERO ;
      n14671MADetMetRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14671MADetMetRe", GXutil.ltrimstr( A14671MADetMetRe, 12, 2));
      A14672MADetMetTo = DecimalUtil.ZERO ;
      n14672MADetMetTo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14672MADetMetTo", GXutil.ltrimstr( A14672MADetMetTo, 12, 2));
      Z14586MADetFec = GXutil.nullDate() ;
      Z14587MADetEmprC = "" ;
      Z14585MADetCliCo = 0 ;
      Z14651MADetCliNo = "" ;
      Z14588MADetArtCo = "" ;
      Z14652MADetArtDs = "" ;
      Z14653MADetColNo = "" ;
      Z14589MADetColNu = 0 ;
      Z14654MADetColCo = (byte)(0) ;
      Z14592MADetMatCo = (short)(0) ;
      Z14655MADetMatDs = "" ;
      Z14593MADetIntCo = (byte)(0) ;
      Z14660MADetIntDs = "" ;
      Z14591MADetMaqCo = "" ;
      Z14656MADetMaqDs = "" ;
      Z14590MADetTipMC = "" ;
      Z14657MADetTipMD = "" ;
      Z14658MADetKilPr = DecimalUtil.ZERO ;
      Z14659MADetKilRe = DecimalUtil.ZERO ;
      Z14661MADetKilTo = DecimalUtil.ZERO ;
      Z14662MADetDefCo = (short)(0) ;
      Z14663MADetDefDs = "" ;
      Z14664MADetCatCo = (short)(0) ;
      Z14665MADetCatDs = "" ;
      Z14584MADetUsu = "" ;
      Z14583MADetTkn = "" ;
      Z14666MADetBarCo = 0 ;
      Z14667MADetBarRe = (byte)(0) ;
      Z14668MADetBarPa = "" ;
      Z14670MADetMetPr = DecimalUtil.ZERO ;
      Z14671MADetMetRe = DecimalUtil.ZERO ;
      Z14672MADetMetTo = DecimalUtil.ZERO ;
   }

   public void initAll1W61918( )
   {
      A14582MADetId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14582MADetId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14582MADetId), 10, 0));
      initializeNonKey1W61918( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026799163448", true, true);
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
      httpContext.AddJavascriptSource("anticipacionerrores/madet.js", "?2026799163448", false, true);
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
      edtMADetId_Internalname = "MADETID" ;
      edtMADetFec_Internalname = "MADETFEC" ;
      edtMADetEmprC_Internalname = "MADETEMPRC" ;
      edtMADetCliCo_Internalname = "MADETCLICO" ;
      edtMADetCliNo_Internalname = "MADETCLINO" ;
      edtMADetArtCo_Internalname = "MADETARTCO" ;
      edtMADetArtDs_Internalname = "MADETARTDS" ;
      edtMADetColNo_Internalname = "MADETCOLNO" ;
      edtMADetColNu_Internalname = "MADETCOLNU" ;
      edtMADetColCo_Internalname = "MADETCOLCO" ;
      edtMADetMatCo_Internalname = "MADETMATCO" ;
      edtMADetMatDs_Internalname = "MADETMATDS" ;
      edtMADetIntCo_Internalname = "MADETINTCO" ;
      edtMADetIntDs_Internalname = "MADETINTDS" ;
      edtMADetMaqCo_Internalname = "MADETMAQCO" ;
      edtMADetMaqDs_Internalname = "MADETMAQDS" ;
      edtMADetTipMC_Internalname = "MADETTIPMC" ;
      edtMADetTipMD_Internalname = "MADETTIPMD" ;
      edtMADetKilPr_Internalname = "MADETKILPR" ;
      edtMADetKilRe_Internalname = "MADETKILRE" ;
      edtMADetKilTo_Internalname = "MADETKILTO" ;
      edtMADetDefCo_Internalname = "MADETDEFCO" ;
      edtMADetDefDs_Internalname = "MADETDEFDS" ;
      edtMADetCatCo_Internalname = "MADETCATCO" ;
      edtMADetCatDs_Internalname = "MADETCATDS" ;
      edtMADetUsu_Internalname = "MADETUSU" ;
      edtMADetTkn_Internalname = "MADETTKN" ;
      edtMADetBarCo_Internalname = "MADETBARCO" ;
      edtMADetBarRe_Internalname = "MADETBARRE" ;
      edtMADetBarPa_Internalname = "MADETBARPA" ;
      edtMADetHdr_Internalname = "MADETHDR" ;
      edtMADetMetPr_Internalname = "MADETMETPR" ;
      edtMADetMetRe_Internalname = "MADETMETRE" ;
      edtMADetMetTo_Internalname = "MADETMETTO" ;
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
      Form.setCaption( httpContext.getMessage( "MADet", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMADetMetTo_Jsonclick = "" ;
      edtMADetMetTo_Enabled = 1 ;
      edtMADetMetRe_Jsonclick = "" ;
      edtMADetMetRe_Enabled = 1 ;
      edtMADetMetPr_Jsonclick = "" ;
      edtMADetMetPr_Enabled = 1 ;
      edtMADetHdr_Jsonclick = "" ;
      edtMADetHdr_Enabled = 0 ;
      edtMADetBarPa_Jsonclick = "" ;
      edtMADetBarPa_Enabled = 1 ;
      edtMADetBarRe_Jsonclick = "" ;
      edtMADetBarRe_Enabled = 1 ;
      edtMADetBarCo_Jsonclick = "" ;
      edtMADetBarCo_Enabled = 1 ;
      edtMADetTkn_Enabled = 1 ;
      edtMADetUsu_Jsonclick = "" ;
      edtMADetUsu_Enabled = 1 ;
      edtMADetCatDs_Enabled = 1 ;
      edtMADetCatCo_Jsonclick = "" ;
      edtMADetCatCo_Enabled = 1 ;
      edtMADetDefDs_Enabled = 1 ;
      edtMADetDefCo_Jsonclick = "" ;
      edtMADetDefCo_Enabled = 1 ;
      edtMADetKilTo_Jsonclick = "" ;
      edtMADetKilTo_Enabled = 1 ;
      edtMADetKilRe_Jsonclick = "" ;
      edtMADetKilRe_Enabled = 1 ;
      edtMADetKilPr_Jsonclick = "" ;
      edtMADetKilPr_Enabled = 1 ;
      edtMADetTipMD_Enabled = 1 ;
      edtMADetTipMC_Jsonclick = "" ;
      edtMADetTipMC_Enabled = 1 ;
      edtMADetMaqDs_Enabled = 1 ;
      edtMADetMaqCo_Jsonclick = "" ;
      edtMADetMaqCo_Enabled = 1 ;
      edtMADetIntDs_Enabled = 1 ;
      edtMADetIntCo_Jsonclick = "" ;
      edtMADetIntCo_Enabled = 1 ;
      edtMADetMatDs_Enabled = 1 ;
      edtMADetMatCo_Jsonclick = "" ;
      edtMADetMatCo_Enabled = 1 ;
      edtMADetColCo_Jsonclick = "" ;
      edtMADetColCo_Enabled = 1 ;
      edtMADetColNu_Jsonclick = "" ;
      edtMADetColNu_Enabled = 1 ;
      edtMADetColNo_Jsonclick = "" ;
      edtMADetColNo_Enabled = 1 ;
      edtMADetArtDs_Enabled = 1 ;
      edtMADetArtCo_Jsonclick = "" ;
      edtMADetArtCo_Enabled = 1 ;
      edtMADetCliNo_Enabled = 1 ;
      edtMADetCliCo_Jsonclick = "" ;
      edtMADetCliCo_Enabled = 1 ;
      edtMADetEmprC_Jsonclick = "" ;
      edtMADetEmprC_Enabled = 1 ;
      edtMADetFec_Jsonclick = "" ;
      edtMADetFec_Enabled = 1 ;
      edtMADetId_Jsonclick = "" ;
      edtMADetId_Enabled = 1 ;
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
      GX_FocusControl = edtMADetFec_Internalname ;
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

   public void valid_Madetid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14586MADetFec", localUtil.format(A14586MADetFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A14587MADetEmprC", GXutil.rtrim( A14587MADetEmprC));
      httpContext.ajax_rsp_assign_attri("", false, "A14585MADetCliCo", GXutil.ltrim( localUtil.ntoc( A14585MADetCliCo, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14651MADetCliNo", A14651MADetCliNo);
      httpContext.ajax_rsp_assign_attri("", false, "A14588MADetArtCo", GXutil.rtrim( A14588MADetArtCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14652MADetArtDs", A14652MADetArtDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14653MADetColNo", GXutil.rtrim( A14653MADetColNo));
      httpContext.ajax_rsp_assign_attri("", false, "A14589MADetColNu", GXutil.ltrim( localUtil.ntoc( A14589MADetColNu, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14654MADetColCo", GXutil.ltrim( localUtil.ntoc( A14654MADetColCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14592MADetMatCo", GXutil.ltrim( localUtil.ntoc( A14592MADetMatCo, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14655MADetMatDs", A14655MADetMatDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14593MADetIntCo", GXutil.ltrim( localUtil.ntoc( A14593MADetIntCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14660MADetIntDs", A14660MADetIntDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14591MADetMaqCo", GXutil.rtrim( A14591MADetMaqCo));
      httpContext.ajax_rsp_assign_attri("", false, "A14656MADetMaqDs", A14656MADetMaqDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14590MADetTipMC", GXutil.rtrim( A14590MADetTipMC));
      httpContext.ajax_rsp_assign_attri("", false, "A14657MADetTipMD", A14657MADetTipMD);
      httpContext.ajax_rsp_assign_attri("", false, "A14658MADetKilPr", GXutil.ltrim( localUtil.ntoc( A14658MADetKilPr, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14659MADetKilRe", GXutil.ltrim( localUtil.ntoc( A14659MADetKilRe, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14661MADetKilTo", GXutil.ltrim( localUtil.ntoc( A14661MADetKilTo, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14662MADetDefCo", GXutil.ltrim( localUtil.ntoc( A14662MADetDefCo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14663MADetDefDs", A14663MADetDefDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14664MADetCatCo", GXutil.ltrim( localUtil.ntoc( A14664MADetCatCo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14665MADetCatDs", A14665MADetCatDs);
      httpContext.ajax_rsp_assign_attri("", false, "A14584MADetUsu", GXutil.rtrim( A14584MADetUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14583MADetTkn", A14583MADetTkn);
      httpContext.ajax_rsp_assign_attri("", false, "A14666MADetBarCo", GXutil.ltrim( localUtil.ntoc( A14666MADetBarCo, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14667MADetBarRe", GXutil.ltrim( localUtil.ntoc( A14667MADetBarRe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14668MADetBarPa", GXutil.rtrim( A14668MADetBarPa));
      httpContext.ajax_rsp_assign_attri("", false, "A14670MADetMetPr", GXutil.ltrim( localUtil.ntoc( A14670MADetMetPr, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14671MADetMetRe", GXutil.ltrim( localUtil.ntoc( A14671MADetMetRe, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14672MADetMetTo", GXutil.ltrim( localUtil.ntoc( A14672MADetMetTo, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14669MADetHdr", GXutil.rtrim( A14669MADetHdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14582MADetId", GXutil.ltrim( localUtil.ntoc( Z14582MADetId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14586MADetFec", localUtil.format(Z14586MADetFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14587MADetEmprC", GXutil.rtrim( Z14587MADetEmprC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14585MADetCliCo", GXutil.ltrim( localUtil.ntoc( Z14585MADetCliCo, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14651MADetCliNo", Z14651MADetCliNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14588MADetArtCo", GXutil.rtrim( Z14588MADetArtCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14652MADetArtDs", Z14652MADetArtDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14653MADetColNo", GXutil.rtrim( Z14653MADetColNo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14589MADetColNu", GXutil.ltrim( localUtil.ntoc( Z14589MADetColNu, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14654MADetColCo", GXutil.ltrim( localUtil.ntoc( Z14654MADetColCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14592MADetMatCo", GXutil.ltrim( localUtil.ntoc( Z14592MADetMatCo, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14655MADetMatDs", Z14655MADetMatDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14593MADetIntCo", GXutil.ltrim( localUtil.ntoc( Z14593MADetIntCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14660MADetIntDs", Z14660MADetIntDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14591MADetMaqCo", GXutil.rtrim( Z14591MADetMaqCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14656MADetMaqDs", Z14656MADetMaqDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14590MADetTipMC", GXutil.rtrim( Z14590MADetTipMC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14657MADetTipMD", Z14657MADetTipMD);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14658MADetKilPr", GXutil.ltrim( localUtil.ntoc( Z14658MADetKilPr, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14659MADetKilRe", GXutil.ltrim( localUtil.ntoc( Z14659MADetKilRe, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14661MADetKilTo", GXutil.ltrim( localUtil.ntoc( Z14661MADetKilTo, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14662MADetDefCo", GXutil.ltrim( localUtil.ntoc( Z14662MADetDefCo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14663MADetDefDs", Z14663MADetDefDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14664MADetCatCo", GXutil.ltrim( localUtil.ntoc( Z14664MADetCatCo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14665MADetCatDs", Z14665MADetCatDs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14584MADetUsu", GXutil.rtrim( Z14584MADetUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14583MADetTkn", Z14583MADetTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14666MADetBarCo", GXutil.ltrim( localUtil.ntoc( Z14666MADetBarCo, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14667MADetBarRe", GXutil.ltrim( localUtil.ntoc( Z14667MADetBarRe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14668MADetBarPa", GXutil.rtrim( Z14668MADetBarPa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14670MADetMetPr", GXutil.ltrim( localUtil.ntoc( Z14670MADetMetPr, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14671MADetMetRe", GXutil.ltrim( localUtil.ntoc( Z14671MADetMetRe, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14672MADetMetTo", GXutil.ltrim( localUtil.ntoc( Z14672MADetMetTo, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14669MADetHdr", GXutil.rtrim( Z14669MADetHdr));
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
      setEventMetadata("VALID_MADETID","{handler:'valid_Madetid',iparms:[{av:'A14582MADetId',fld:'MADETID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MADETID",",oparms:[{av:'A14586MADetFec',fld:'MADETFEC',pic:''},{av:'A14587MADetEmprC',fld:'MADETEMPRC',pic:''},{av:'A14585MADetCliCo',fld:'MADETCLICO',pic:'ZZZZZ9'},{av:'A14651MADetCliNo',fld:'MADETCLINO',pic:''},{av:'A14588MADetArtCo',fld:'MADETARTCO',pic:''},{av:'A14652MADetArtDs',fld:'MADETARTDS',pic:''},{av:'A14653MADetColNo',fld:'MADETCOLNO',pic:''},{av:'A14589MADetColNu',fld:'MADETCOLNU',pic:'ZZZZZ9'},{av:'A14654MADetColCo',fld:'MADETCOLCO',pic:'Z9'},{av:'A14592MADetMatCo',fld:'MADETMATCO',pic:'ZZ9'},{av:'A14655MADetMatDs',fld:'MADETMATDS',pic:''},{av:'A14593MADetIntCo',fld:'MADETINTCO',pic:'Z9'},{av:'A14660MADetIntDs',fld:'MADETINTDS',pic:''},{av:'A14591MADetMaqCo',fld:'MADETMAQCO',pic:''},{av:'A14656MADetMaqDs',fld:'MADETMAQDS',pic:''},{av:'A14590MADetTipMC',fld:'MADETTIPMC',pic:''},{av:'A14657MADetTipMD',fld:'MADETTIPMD',pic:''},{av:'A14658MADetKilPr',fld:'MADETKILPR',pic:'ZZZZZZZZ9.99'},{av:'A14659MADetKilRe',fld:'MADETKILRE',pic:'ZZZZZZZZ9.99'},{av:'A14661MADetKilTo',fld:'MADETKILTO',pic:'ZZZZZZZZ9.99'},{av:'A14662MADetDefCo',fld:'MADETDEFCO',pic:'ZZZ9'},{av:'A14663MADetDefDs',fld:'MADETDEFDS',pic:''},{av:'A14664MADetCatCo',fld:'MADETCATCO',pic:'ZZZ9'},{av:'A14665MADetCatDs',fld:'MADETCATDS',pic:''},{av:'A14584MADetUsu',fld:'MADETUSU',pic:''},{av:'A14583MADetTkn',fld:'MADETTKN',pic:''},{av:'A14666MADetBarCo',fld:'MADETBARCO',pic:'ZZZZZZZ9'},{av:'A14667MADetBarRe',fld:'MADETBARRE',pic:'9'},{av:'A14668MADetBarPa',fld:'MADETBARPA',pic:''},{av:'A14670MADetMetPr',fld:'MADETMETPR',pic:'ZZZZZZZZ9.99'},{av:'A14671MADetMetRe',fld:'MADETMETRE',pic:'ZZZZZZZZ9.99'},{av:'A14672MADetMetTo',fld:'MADETMETTO',pic:'ZZZZZZZZ9.99'},{av:'A14669MADetHdr',fld:'MADETHDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14582MADetId'},{av:'Z14586MADetFec'},{av:'Z14587MADetEmprC'},{av:'Z14585MADetCliCo'},{av:'Z14651MADetCliNo'},{av:'Z14588MADetArtCo'},{av:'Z14652MADetArtDs'},{av:'Z14653MADetColNo'},{av:'Z14589MADetColNu'},{av:'Z14654MADetColCo'},{av:'Z14592MADetMatCo'},{av:'Z14655MADetMatDs'},{av:'Z14593MADetIntCo'},{av:'Z14660MADetIntDs'},{av:'Z14591MADetMaqCo'},{av:'Z14656MADetMaqDs'},{av:'Z14590MADetTipMC'},{av:'Z14657MADetTipMD'},{av:'Z14658MADetKilPr'},{av:'Z14659MADetKilRe'},{av:'Z14661MADetKilTo'},{av:'Z14662MADetDefCo'},{av:'Z14663MADetDefDs'},{av:'Z14664MADetCatCo'},{av:'Z14665MADetCatDs'},{av:'Z14584MADetUsu'},{av:'Z14583MADetTkn'},{av:'Z14666MADetBarCo'},{av:'Z14667MADetBarRe'},{av:'Z14668MADetBarPa'},{av:'Z14670MADetMetPr'},{av:'Z14671MADetMetRe'},{av:'Z14672MADetMetTo'},{av:'Z14669MADetHdr'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MADETBARCO","{handler:'valid_Madetbarco',iparms:[]");
      setEventMetadata("VALID_MADETBARCO",",oparms:[]}");
      setEventMetadata("VALID_MADETBARRE","{handler:'valid_Madetbarre',iparms:[]");
      setEventMetadata("VALID_MADETBARRE",",oparms:[]}");
      setEventMetadata("VALID_MADETBARPA","{handler:'valid_Madetbarpa',iparms:[]");
      setEventMetadata("VALID_MADETBARPA",",oparms:[]}");
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
      Z14586MADetFec = GXutil.nullDate() ;
      Z14587MADetEmprC = "" ;
      Z14651MADetCliNo = "" ;
      Z14588MADetArtCo = "" ;
      Z14652MADetArtDs = "" ;
      Z14653MADetColNo = "" ;
      Z14655MADetMatDs = "" ;
      Z14660MADetIntDs = "" ;
      Z14591MADetMaqCo = "" ;
      Z14656MADetMaqDs = "" ;
      Z14590MADetTipMC = "" ;
      Z14657MADetTipMD = "" ;
      Z14658MADetKilPr = DecimalUtil.ZERO ;
      Z14659MADetKilRe = DecimalUtil.ZERO ;
      Z14661MADetKilTo = DecimalUtil.ZERO ;
      Z14663MADetDefDs = "" ;
      Z14665MADetCatDs = "" ;
      Z14584MADetUsu = "" ;
      Z14583MADetTkn = "" ;
      Z14668MADetBarPa = "" ;
      Z14670MADetMetPr = DecimalUtil.ZERO ;
      Z14671MADetMetRe = DecimalUtil.ZERO ;
      Z14672MADetMetTo = DecimalUtil.ZERO ;
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
      A14586MADetFec = GXutil.nullDate() ;
      A14587MADetEmprC = "" ;
      A14651MADetCliNo = "" ;
      A14588MADetArtCo = "" ;
      A14652MADetArtDs = "" ;
      A14653MADetColNo = "" ;
      A14655MADetMatDs = "" ;
      A14660MADetIntDs = "" ;
      A14591MADetMaqCo = "" ;
      A14656MADetMaqDs = "" ;
      A14590MADetTipMC = "" ;
      A14657MADetTipMD = "" ;
      A14658MADetKilPr = DecimalUtil.ZERO ;
      A14659MADetKilRe = DecimalUtil.ZERO ;
      A14661MADetKilTo = DecimalUtil.ZERO ;
      A14663MADetDefDs = "" ;
      A14665MADetCatDs = "" ;
      A14584MADetUsu = "" ;
      A14583MADetTkn = "" ;
      A14668MADetBarPa = "" ;
      A14669MADetHdr = "" ;
      A14670MADetMetPr = DecimalUtil.ZERO ;
      A14671MADetMetRe = DecimalUtil.ZERO ;
      A14672MADetMetTo = DecimalUtil.ZERO ;
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
      T01W64_A14582MADetId = new long[1] ;
      T01W64_A14586MADetFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W64_A14587MADetEmprC = new String[] {""} ;
      T01W64_A14585MADetCliCo = new int[1] ;
      T01W64_A14651MADetCliNo = new String[] {""} ;
      T01W64_n14651MADetCliNo = new boolean[] {false} ;
      T01W64_A14588MADetArtCo = new String[] {""} ;
      T01W64_A14652MADetArtDs = new String[] {""} ;
      T01W64_n14652MADetArtDs = new boolean[] {false} ;
      T01W64_A14653MADetColNo = new String[] {""} ;
      T01W64_A14589MADetColNu = new int[1] ;
      T01W64_A14654MADetColCo = new byte[1] ;
      T01W64_A14592MADetMatCo = new short[1] ;
      T01W64_A14655MADetMatDs = new String[] {""} ;
      T01W64_n14655MADetMatDs = new boolean[] {false} ;
      T01W64_A14593MADetIntCo = new byte[1] ;
      T01W64_A14660MADetIntDs = new String[] {""} ;
      T01W64_n14660MADetIntDs = new boolean[] {false} ;
      T01W64_A14591MADetMaqCo = new String[] {""} ;
      T01W64_A14656MADetMaqDs = new String[] {""} ;
      T01W64_n14656MADetMaqDs = new boolean[] {false} ;
      T01W64_A14590MADetTipMC = new String[] {""} ;
      T01W64_A14657MADetTipMD = new String[] {""} ;
      T01W64_n14657MADetTipMD = new boolean[] {false} ;
      T01W64_A14658MADetKilPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W64_n14658MADetKilPr = new boolean[] {false} ;
      T01W64_A14659MADetKilRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W64_A14661MADetKilTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W64_A14662MADetDefCo = new short[1] ;
      T01W64_n14662MADetDefCo = new boolean[] {false} ;
      T01W64_A14663MADetDefDs = new String[] {""} ;
      T01W64_n14663MADetDefDs = new boolean[] {false} ;
      T01W64_A14664MADetCatCo = new short[1] ;
      T01W64_n14664MADetCatCo = new boolean[] {false} ;
      T01W64_A14665MADetCatDs = new String[] {""} ;
      T01W64_n14665MADetCatDs = new boolean[] {false} ;
      T01W64_A14584MADetUsu = new String[] {""} ;
      T01W64_A14583MADetTkn = new String[] {""} ;
      T01W64_A14666MADetBarCo = new int[1] ;
      T01W64_A14667MADetBarRe = new byte[1] ;
      T01W64_A14668MADetBarPa = new String[] {""} ;
      T01W64_A14670MADetMetPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W64_n14670MADetMetPr = new boolean[] {false} ;
      T01W64_A14671MADetMetRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W64_n14671MADetMetRe = new boolean[] {false} ;
      T01W64_A14672MADetMetTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W64_n14672MADetMetTo = new boolean[] {false} ;
      T01W65_A14582MADetId = new long[1] ;
      T01W63_A14582MADetId = new long[1] ;
      T01W63_A14586MADetFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W63_A14587MADetEmprC = new String[] {""} ;
      T01W63_A14585MADetCliCo = new int[1] ;
      T01W63_A14651MADetCliNo = new String[] {""} ;
      T01W63_n14651MADetCliNo = new boolean[] {false} ;
      T01W63_A14588MADetArtCo = new String[] {""} ;
      T01W63_A14652MADetArtDs = new String[] {""} ;
      T01W63_n14652MADetArtDs = new boolean[] {false} ;
      T01W63_A14653MADetColNo = new String[] {""} ;
      T01W63_A14589MADetColNu = new int[1] ;
      T01W63_A14654MADetColCo = new byte[1] ;
      T01W63_A14592MADetMatCo = new short[1] ;
      T01W63_A14655MADetMatDs = new String[] {""} ;
      T01W63_n14655MADetMatDs = new boolean[] {false} ;
      T01W63_A14593MADetIntCo = new byte[1] ;
      T01W63_A14660MADetIntDs = new String[] {""} ;
      T01W63_n14660MADetIntDs = new boolean[] {false} ;
      T01W63_A14591MADetMaqCo = new String[] {""} ;
      T01W63_A14656MADetMaqDs = new String[] {""} ;
      T01W63_n14656MADetMaqDs = new boolean[] {false} ;
      T01W63_A14590MADetTipMC = new String[] {""} ;
      T01W63_A14657MADetTipMD = new String[] {""} ;
      T01W63_n14657MADetTipMD = new boolean[] {false} ;
      T01W63_A14658MADetKilPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W63_n14658MADetKilPr = new boolean[] {false} ;
      T01W63_A14659MADetKilRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W63_A14661MADetKilTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W63_A14662MADetDefCo = new short[1] ;
      T01W63_n14662MADetDefCo = new boolean[] {false} ;
      T01W63_A14663MADetDefDs = new String[] {""} ;
      T01W63_n14663MADetDefDs = new boolean[] {false} ;
      T01W63_A14664MADetCatCo = new short[1] ;
      T01W63_n14664MADetCatCo = new boolean[] {false} ;
      T01W63_A14665MADetCatDs = new String[] {""} ;
      T01W63_n14665MADetCatDs = new boolean[] {false} ;
      T01W63_A14584MADetUsu = new String[] {""} ;
      T01W63_A14583MADetTkn = new String[] {""} ;
      T01W63_A14666MADetBarCo = new int[1] ;
      T01W63_A14667MADetBarRe = new byte[1] ;
      T01W63_A14668MADetBarPa = new String[] {""} ;
      T01W63_A14670MADetMetPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W63_n14670MADetMetPr = new boolean[] {false} ;
      T01W63_A14671MADetMetRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W63_n14671MADetMetRe = new boolean[] {false} ;
      T01W63_A14672MADetMetTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W63_n14672MADetMetTo = new boolean[] {false} ;
      sMode1918 = "" ;
      T01W66_A14582MADetId = new long[1] ;
      T01W67_A14582MADetId = new long[1] ;
      T01W62_A14582MADetId = new long[1] ;
      T01W62_A14586MADetFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W62_A14587MADetEmprC = new String[] {""} ;
      T01W62_A14585MADetCliCo = new int[1] ;
      T01W62_A14651MADetCliNo = new String[] {""} ;
      T01W62_n14651MADetCliNo = new boolean[] {false} ;
      T01W62_A14588MADetArtCo = new String[] {""} ;
      T01W62_A14652MADetArtDs = new String[] {""} ;
      T01W62_n14652MADetArtDs = new boolean[] {false} ;
      T01W62_A14653MADetColNo = new String[] {""} ;
      T01W62_A14589MADetColNu = new int[1] ;
      T01W62_A14654MADetColCo = new byte[1] ;
      T01W62_A14592MADetMatCo = new short[1] ;
      T01W62_A14655MADetMatDs = new String[] {""} ;
      T01W62_n14655MADetMatDs = new boolean[] {false} ;
      T01W62_A14593MADetIntCo = new byte[1] ;
      T01W62_A14660MADetIntDs = new String[] {""} ;
      T01W62_n14660MADetIntDs = new boolean[] {false} ;
      T01W62_A14591MADetMaqCo = new String[] {""} ;
      T01W62_A14656MADetMaqDs = new String[] {""} ;
      T01W62_n14656MADetMaqDs = new boolean[] {false} ;
      T01W62_A14590MADetTipMC = new String[] {""} ;
      T01W62_A14657MADetTipMD = new String[] {""} ;
      T01W62_n14657MADetTipMD = new boolean[] {false} ;
      T01W62_A14658MADetKilPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W62_n14658MADetKilPr = new boolean[] {false} ;
      T01W62_A14659MADetKilRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W62_A14661MADetKilTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W62_A14662MADetDefCo = new short[1] ;
      T01W62_n14662MADetDefCo = new boolean[] {false} ;
      T01W62_A14663MADetDefDs = new String[] {""} ;
      T01W62_n14663MADetDefDs = new boolean[] {false} ;
      T01W62_A14664MADetCatCo = new short[1] ;
      T01W62_n14664MADetCatCo = new boolean[] {false} ;
      T01W62_A14665MADetCatDs = new String[] {""} ;
      T01W62_n14665MADetCatDs = new boolean[] {false} ;
      T01W62_A14584MADetUsu = new String[] {""} ;
      T01W62_A14583MADetTkn = new String[] {""} ;
      T01W62_A14666MADetBarCo = new int[1] ;
      T01W62_A14667MADetBarRe = new byte[1] ;
      T01W62_A14668MADetBarPa = new String[] {""} ;
      T01W62_A14670MADetMetPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W62_n14670MADetMetPr = new boolean[] {false} ;
      T01W62_A14671MADetMetRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W62_n14671MADetMetRe = new boolean[] {false} ;
      T01W62_A14672MADetMetTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W62_n14672MADetMetTo = new boolean[] {false} ;
      T01W69_A14582MADetId = new long[1] ;
      T01W612_A14582MADetId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z14669MADetHdr = "" ;
      ZZ14586MADetFec = GXutil.nullDate() ;
      ZZ14587MADetEmprC = "" ;
      ZZ14651MADetCliNo = "" ;
      ZZ14588MADetArtCo = "" ;
      ZZ14652MADetArtDs = "" ;
      ZZ14653MADetColNo = "" ;
      ZZ14655MADetMatDs = "" ;
      ZZ14660MADetIntDs = "" ;
      ZZ14591MADetMaqCo = "" ;
      ZZ14656MADetMaqDs = "" ;
      ZZ14590MADetTipMC = "" ;
      ZZ14657MADetTipMD = "" ;
      ZZ14658MADetKilPr = DecimalUtil.ZERO ;
      ZZ14659MADetKilRe = DecimalUtil.ZERO ;
      ZZ14661MADetKilTo = DecimalUtil.ZERO ;
      ZZ14663MADetDefDs = "" ;
      ZZ14665MADetCatDs = "" ;
      ZZ14584MADetUsu = "" ;
      ZZ14583MADetTkn = "" ;
      ZZ14668MADetBarPa = "" ;
      ZZ14670MADetMetPr = DecimalUtil.ZERO ;
      ZZ14671MADetMetRe = DecimalUtil.ZERO ;
      ZZ14672MADetMetTo = DecimalUtil.ZERO ;
      ZZ14669MADetHdr = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.madet__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.madet__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.madet__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.madet__default(),
         new Object[] {
             new Object[] {
            T01W62_A14582MADetId, T01W62_A14586MADetFec, T01W62_A14587MADetEmprC, T01W62_A14585MADetCliCo, T01W62_A14651MADetCliNo, T01W62_n14651MADetCliNo, T01W62_A14588MADetArtCo, T01W62_A14652MADetArtDs, T01W62_n14652MADetArtDs, T01W62_A14653MADetColNo,
            T01W62_A14589MADetColNu, T01W62_A14654MADetColCo, T01W62_A14592MADetMatCo, T01W62_A14655MADetMatDs, T01W62_n14655MADetMatDs, T01W62_A14593MADetIntCo, T01W62_A14660MADetIntDs, T01W62_n14660MADetIntDs, T01W62_A14591MADetMaqCo, T01W62_A14656MADetMaqDs,
            T01W62_n14656MADetMaqDs, T01W62_A14590MADetTipMC, T01W62_A14657MADetTipMD, T01W62_n14657MADetTipMD, T01W62_A14658MADetKilPr, T01W62_n14658MADetKilPr, T01W62_A14659MADetKilRe, T01W62_A14661MADetKilTo, T01W62_A14662MADetDefCo, T01W62_n14662MADetDefCo,
            T01W62_A14663MADetDefDs, T01W62_n14663MADetDefDs, T01W62_A14664MADetCatCo, T01W62_n14664MADetCatCo, T01W62_A14665MADetCatDs, T01W62_n14665MADetCatDs, T01W62_A14584MADetUsu, T01W62_A14583MADetTkn, T01W62_A14666MADetBarCo, T01W62_A14667MADetBarRe,
            T01W62_A14668MADetBarPa, T01W62_A14670MADetMetPr, T01W62_n14670MADetMetPr, T01W62_A14671MADetMetRe, T01W62_n14671MADetMetRe, T01W62_A14672MADetMetTo, T01W62_n14672MADetMetTo
            }
            , new Object[] {
            T01W63_A14582MADetId, T01W63_A14586MADetFec, T01W63_A14587MADetEmprC, T01W63_A14585MADetCliCo, T01W63_A14651MADetCliNo, T01W63_n14651MADetCliNo, T01W63_A14588MADetArtCo, T01W63_A14652MADetArtDs, T01W63_n14652MADetArtDs, T01W63_A14653MADetColNo,
            T01W63_A14589MADetColNu, T01W63_A14654MADetColCo, T01W63_A14592MADetMatCo, T01W63_A14655MADetMatDs, T01W63_n14655MADetMatDs, T01W63_A14593MADetIntCo, T01W63_A14660MADetIntDs, T01W63_n14660MADetIntDs, T01W63_A14591MADetMaqCo, T01W63_A14656MADetMaqDs,
            T01W63_n14656MADetMaqDs, T01W63_A14590MADetTipMC, T01W63_A14657MADetTipMD, T01W63_n14657MADetTipMD, T01W63_A14658MADetKilPr, T01W63_n14658MADetKilPr, T01W63_A14659MADetKilRe, T01W63_A14661MADetKilTo, T01W63_A14662MADetDefCo, T01W63_n14662MADetDefCo,
            T01W63_A14663MADetDefDs, T01W63_n14663MADetDefDs, T01W63_A14664MADetCatCo, T01W63_n14664MADetCatCo, T01W63_A14665MADetCatDs, T01W63_n14665MADetCatDs, T01W63_A14584MADetUsu, T01W63_A14583MADetTkn, T01W63_A14666MADetBarCo, T01W63_A14667MADetBarRe,
            T01W63_A14668MADetBarPa, T01W63_A14670MADetMetPr, T01W63_n14670MADetMetPr, T01W63_A14671MADetMetRe, T01W63_n14671MADetMetRe, T01W63_A14672MADetMetTo, T01W63_n14672MADetMetTo
            }
            , new Object[] {
            T01W64_A14582MADetId, T01W64_A14586MADetFec, T01W64_A14587MADetEmprC, T01W64_A14585MADetCliCo, T01W64_A14651MADetCliNo, T01W64_n14651MADetCliNo, T01W64_A14588MADetArtCo, T01W64_A14652MADetArtDs, T01W64_n14652MADetArtDs, T01W64_A14653MADetColNo,
            T01W64_A14589MADetColNu, T01W64_A14654MADetColCo, T01W64_A14592MADetMatCo, T01W64_A14655MADetMatDs, T01W64_n14655MADetMatDs, T01W64_A14593MADetIntCo, T01W64_A14660MADetIntDs, T01W64_n14660MADetIntDs, T01W64_A14591MADetMaqCo, T01W64_A14656MADetMaqDs,
            T01W64_n14656MADetMaqDs, T01W64_A14590MADetTipMC, T01W64_A14657MADetTipMD, T01W64_n14657MADetTipMD, T01W64_A14658MADetKilPr, T01W64_n14658MADetKilPr, T01W64_A14659MADetKilRe, T01W64_A14661MADetKilTo, T01W64_A14662MADetDefCo, T01W64_n14662MADetDefCo,
            T01W64_A14663MADetDefDs, T01W64_n14663MADetDefDs, T01W64_A14664MADetCatCo, T01W64_n14664MADetCatCo, T01W64_A14665MADetCatDs, T01W64_n14665MADetCatDs, T01W64_A14584MADetUsu, T01W64_A14583MADetTkn, T01W64_A14666MADetBarCo, T01W64_A14667MADetBarRe,
            T01W64_A14668MADetBarPa, T01W64_A14670MADetMetPr, T01W64_n14670MADetMetPr, T01W64_A14671MADetMetRe, T01W64_n14671MADetMetRe, T01W64_A14672MADetMetTo, T01W64_n14672MADetMetTo
            }
            , new Object[] {
            T01W65_A14582MADetId
            }
            , new Object[] {
            T01W66_A14582MADetId
            }
            , new Object[] {
            T01W67_A14582MADetId
            }
            , new Object[] {
            }
            , new Object[] {
            T01W69_A14582MADetId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W612_A14582MADetId
            }
         }
      );
   }

   private byte Z14654MADetColCo ;
   private byte Z14593MADetIntCo ;
   private byte Z14667MADetBarRe ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14654MADetColCo ;
   private byte A14593MADetIntCo ;
   private byte A14667MADetBarRe ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ14654MADetColCo ;
   private byte ZZ14593MADetIntCo ;
   private byte ZZ14667MADetBarRe ;
   private short Z14592MADetMatCo ;
   private short Z14662MADetDefCo ;
   private short Z14664MADetCatCo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14592MADetMatCo ;
   private short A14662MADetDefCo ;
   private short A14664MADetCatCo ;
   private short RcdFound1918 ;
   private short nIsDirty_1918 ;
   private short ZZ14592MADetMatCo ;
   private short ZZ14662MADetDefCo ;
   private short ZZ14664MADetCatCo ;
   private int Z14585MADetCliCo ;
   private int Z14589MADetColNu ;
   private int Z14666MADetBarCo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMADetId_Enabled ;
   private int edtMADetFec_Enabled ;
   private int edtMADetEmprC_Enabled ;
   private int A14585MADetCliCo ;
   private int edtMADetCliCo_Enabled ;
   private int edtMADetCliNo_Enabled ;
   private int edtMADetArtCo_Enabled ;
   private int edtMADetArtDs_Enabled ;
   private int edtMADetColNo_Enabled ;
   private int A14589MADetColNu ;
   private int edtMADetColNu_Enabled ;
   private int edtMADetColCo_Enabled ;
   private int edtMADetMatCo_Enabled ;
   private int edtMADetMatDs_Enabled ;
   private int edtMADetIntCo_Enabled ;
   private int edtMADetIntDs_Enabled ;
   private int edtMADetMaqCo_Enabled ;
   private int edtMADetMaqDs_Enabled ;
   private int edtMADetTipMC_Enabled ;
   private int edtMADetTipMD_Enabled ;
   private int edtMADetKilPr_Enabled ;
   private int edtMADetKilRe_Enabled ;
   private int edtMADetKilTo_Enabled ;
   private int edtMADetDefCo_Enabled ;
   private int edtMADetDefDs_Enabled ;
   private int edtMADetCatCo_Enabled ;
   private int edtMADetCatDs_Enabled ;
   private int edtMADetUsu_Enabled ;
   private int edtMADetTkn_Enabled ;
   private int A14666MADetBarCo ;
   private int edtMADetBarCo_Enabled ;
   private int edtMADetBarRe_Enabled ;
   private int edtMADetBarPa_Enabled ;
   private int edtMADetHdr_Enabled ;
   private int edtMADetMetPr_Enabled ;
   private int edtMADetMetRe_Enabled ;
   private int edtMADetMetTo_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ14585MADetCliCo ;
   private int ZZ14589MADetColNu ;
   private int ZZ14666MADetBarCo ;
   private long Z14582MADetId ;
   private long A14582MADetId ;
   private long ZZ14582MADetId ;
   private java.math.BigDecimal Z14658MADetKilPr ;
   private java.math.BigDecimal Z14659MADetKilRe ;
   private java.math.BigDecimal Z14661MADetKilTo ;
   private java.math.BigDecimal Z14670MADetMetPr ;
   private java.math.BigDecimal Z14671MADetMetRe ;
   private java.math.BigDecimal Z14672MADetMetTo ;
   private java.math.BigDecimal A14658MADetKilPr ;
   private java.math.BigDecimal A14659MADetKilRe ;
   private java.math.BigDecimal A14661MADetKilTo ;
   private java.math.BigDecimal A14670MADetMetPr ;
   private java.math.BigDecimal A14671MADetMetRe ;
   private java.math.BigDecimal A14672MADetMetTo ;
   private java.math.BigDecimal ZZ14658MADetKilPr ;
   private java.math.BigDecimal ZZ14659MADetKilRe ;
   private java.math.BigDecimal ZZ14661MADetKilTo ;
   private java.math.BigDecimal ZZ14670MADetMetPr ;
   private java.math.BigDecimal ZZ14671MADetMetRe ;
   private java.math.BigDecimal ZZ14672MADetMetTo ;
   private String sPrefix ;
   private String Z14587MADetEmprC ;
   private String Z14588MADetArtCo ;
   private String Z14653MADetColNo ;
   private String Z14591MADetMaqCo ;
   private String Z14590MADetTipMC ;
   private String Z14584MADetUsu ;
   private String Z14668MADetBarPa ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMADetId_Internalname ;
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
   private String edtMADetId_Jsonclick ;
   private String edtMADetFec_Internalname ;
   private String edtMADetFec_Jsonclick ;
   private String edtMADetEmprC_Internalname ;
   private String A14587MADetEmprC ;
   private String edtMADetEmprC_Jsonclick ;
   private String edtMADetCliCo_Internalname ;
   private String edtMADetCliCo_Jsonclick ;
   private String edtMADetCliNo_Internalname ;
   private String edtMADetArtCo_Internalname ;
   private String A14588MADetArtCo ;
   private String edtMADetArtCo_Jsonclick ;
   private String edtMADetArtDs_Internalname ;
   private String edtMADetColNo_Internalname ;
   private String A14653MADetColNo ;
   private String edtMADetColNo_Jsonclick ;
   private String edtMADetColNu_Internalname ;
   private String edtMADetColNu_Jsonclick ;
   private String edtMADetColCo_Internalname ;
   private String edtMADetColCo_Jsonclick ;
   private String edtMADetMatCo_Internalname ;
   private String edtMADetMatCo_Jsonclick ;
   private String edtMADetMatDs_Internalname ;
   private String edtMADetIntCo_Internalname ;
   private String edtMADetIntCo_Jsonclick ;
   private String edtMADetIntDs_Internalname ;
   private String edtMADetMaqCo_Internalname ;
   private String A14591MADetMaqCo ;
   private String edtMADetMaqCo_Jsonclick ;
   private String edtMADetMaqDs_Internalname ;
   private String edtMADetTipMC_Internalname ;
   private String A14590MADetTipMC ;
   private String edtMADetTipMC_Jsonclick ;
   private String edtMADetTipMD_Internalname ;
   private String edtMADetKilPr_Internalname ;
   private String edtMADetKilPr_Jsonclick ;
   private String edtMADetKilRe_Internalname ;
   private String edtMADetKilRe_Jsonclick ;
   private String edtMADetKilTo_Internalname ;
   private String edtMADetKilTo_Jsonclick ;
   private String edtMADetDefCo_Internalname ;
   private String edtMADetDefCo_Jsonclick ;
   private String edtMADetDefDs_Internalname ;
   private String edtMADetCatCo_Internalname ;
   private String edtMADetCatCo_Jsonclick ;
   private String edtMADetCatDs_Internalname ;
   private String edtMADetUsu_Internalname ;
   private String A14584MADetUsu ;
   private String edtMADetUsu_Jsonclick ;
   private String edtMADetTkn_Internalname ;
   private String edtMADetBarCo_Internalname ;
   private String edtMADetBarCo_Jsonclick ;
   private String edtMADetBarRe_Internalname ;
   private String edtMADetBarRe_Jsonclick ;
   private String edtMADetBarPa_Internalname ;
   private String A14668MADetBarPa ;
   private String edtMADetBarPa_Jsonclick ;
   private String edtMADetHdr_Internalname ;
   private String A14669MADetHdr ;
   private String edtMADetHdr_Jsonclick ;
   private String edtMADetMetPr_Internalname ;
   private String edtMADetMetPr_Jsonclick ;
   private String edtMADetMetRe_Internalname ;
   private String edtMADetMetRe_Jsonclick ;
   private String edtMADetMetTo_Internalname ;
   private String edtMADetMetTo_Jsonclick ;
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
   private String sMode1918 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z14669MADetHdr ;
   private String ZZ14587MADetEmprC ;
   private String ZZ14588MADetArtCo ;
   private String ZZ14653MADetColNo ;
   private String ZZ14591MADetMaqCo ;
   private String ZZ14590MADetTipMC ;
   private String ZZ14584MADetUsu ;
   private String ZZ14668MADetBarPa ;
   private String ZZ14669MADetHdr ;
   private java.util.Date Z14586MADetFec ;
   private java.util.Date A14586MADetFec ;
   private java.util.Date ZZ14586MADetFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14651MADetCliNo ;
   private boolean n14652MADetArtDs ;
   private boolean n14655MADetMatDs ;
   private boolean n14660MADetIntDs ;
   private boolean n14656MADetMaqDs ;
   private boolean n14657MADetTipMD ;
   private boolean n14658MADetKilPr ;
   private boolean n14662MADetDefCo ;
   private boolean n14663MADetDefDs ;
   private boolean n14664MADetCatCo ;
   private boolean n14665MADetCatDs ;
   private boolean n14670MADetMetPr ;
   private boolean n14671MADetMetRe ;
   private boolean n14672MADetMetTo ;
   private boolean Gx_longc ;
   private String Z14651MADetCliNo ;
   private String Z14652MADetArtDs ;
   private String Z14655MADetMatDs ;
   private String Z14660MADetIntDs ;
   private String Z14656MADetMaqDs ;
   private String Z14657MADetTipMD ;
   private String Z14663MADetDefDs ;
   private String Z14665MADetCatDs ;
   private String Z14583MADetTkn ;
   private String A14651MADetCliNo ;
   private String A14652MADetArtDs ;
   private String A14655MADetMatDs ;
   private String A14660MADetIntDs ;
   private String A14656MADetMaqDs ;
   private String A14657MADetTipMD ;
   private String A14663MADetDefDs ;
   private String A14665MADetCatDs ;
   private String A14583MADetTkn ;
   private String ZZ14651MADetCliNo ;
   private String ZZ14652MADetArtDs ;
   private String ZZ14655MADetMatDs ;
   private String ZZ14660MADetIntDs ;
   private String ZZ14656MADetMaqDs ;
   private String ZZ14657MADetTipMD ;
   private String ZZ14663MADetDefDs ;
   private String ZZ14665MADetCatDs ;
   private String ZZ14583MADetTkn ;
   private IDataStoreProvider pr_default ;
   private long[] T01W64_A14582MADetId ;
   private java.util.Date[] T01W64_A14586MADetFec ;
   private String[] T01W64_A14587MADetEmprC ;
   private int[] T01W64_A14585MADetCliCo ;
   private String[] T01W64_A14651MADetCliNo ;
   private boolean[] T01W64_n14651MADetCliNo ;
   private String[] T01W64_A14588MADetArtCo ;
   private String[] T01W64_A14652MADetArtDs ;
   private boolean[] T01W64_n14652MADetArtDs ;
   private String[] T01W64_A14653MADetColNo ;
   private int[] T01W64_A14589MADetColNu ;
   private byte[] T01W64_A14654MADetColCo ;
   private short[] T01W64_A14592MADetMatCo ;
   private String[] T01W64_A14655MADetMatDs ;
   private boolean[] T01W64_n14655MADetMatDs ;
   private byte[] T01W64_A14593MADetIntCo ;
   private String[] T01W64_A14660MADetIntDs ;
   private boolean[] T01W64_n14660MADetIntDs ;
   private String[] T01W64_A14591MADetMaqCo ;
   private String[] T01W64_A14656MADetMaqDs ;
   private boolean[] T01W64_n14656MADetMaqDs ;
   private String[] T01W64_A14590MADetTipMC ;
   private String[] T01W64_A14657MADetTipMD ;
   private boolean[] T01W64_n14657MADetTipMD ;
   private java.math.BigDecimal[] T01W64_A14658MADetKilPr ;
   private boolean[] T01W64_n14658MADetKilPr ;
   private java.math.BigDecimal[] T01W64_A14659MADetKilRe ;
   private java.math.BigDecimal[] T01W64_A14661MADetKilTo ;
   private short[] T01W64_A14662MADetDefCo ;
   private boolean[] T01W64_n14662MADetDefCo ;
   private String[] T01W64_A14663MADetDefDs ;
   private boolean[] T01W64_n14663MADetDefDs ;
   private short[] T01W64_A14664MADetCatCo ;
   private boolean[] T01W64_n14664MADetCatCo ;
   private String[] T01W64_A14665MADetCatDs ;
   private boolean[] T01W64_n14665MADetCatDs ;
   private String[] T01W64_A14584MADetUsu ;
   private String[] T01W64_A14583MADetTkn ;
   private int[] T01W64_A14666MADetBarCo ;
   private byte[] T01W64_A14667MADetBarRe ;
   private String[] T01W64_A14668MADetBarPa ;
   private java.math.BigDecimal[] T01W64_A14670MADetMetPr ;
   private boolean[] T01W64_n14670MADetMetPr ;
   private java.math.BigDecimal[] T01W64_A14671MADetMetRe ;
   private boolean[] T01W64_n14671MADetMetRe ;
   private java.math.BigDecimal[] T01W64_A14672MADetMetTo ;
   private boolean[] T01W64_n14672MADetMetTo ;
   private long[] T01W65_A14582MADetId ;
   private long[] T01W63_A14582MADetId ;
   private java.util.Date[] T01W63_A14586MADetFec ;
   private String[] T01W63_A14587MADetEmprC ;
   private int[] T01W63_A14585MADetCliCo ;
   private String[] T01W63_A14651MADetCliNo ;
   private boolean[] T01W63_n14651MADetCliNo ;
   private String[] T01W63_A14588MADetArtCo ;
   private String[] T01W63_A14652MADetArtDs ;
   private boolean[] T01W63_n14652MADetArtDs ;
   private String[] T01W63_A14653MADetColNo ;
   private int[] T01W63_A14589MADetColNu ;
   private byte[] T01W63_A14654MADetColCo ;
   private short[] T01W63_A14592MADetMatCo ;
   private String[] T01W63_A14655MADetMatDs ;
   private boolean[] T01W63_n14655MADetMatDs ;
   private byte[] T01W63_A14593MADetIntCo ;
   private String[] T01W63_A14660MADetIntDs ;
   private boolean[] T01W63_n14660MADetIntDs ;
   private String[] T01W63_A14591MADetMaqCo ;
   private String[] T01W63_A14656MADetMaqDs ;
   private boolean[] T01W63_n14656MADetMaqDs ;
   private String[] T01W63_A14590MADetTipMC ;
   private String[] T01W63_A14657MADetTipMD ;
   private boolean[] T01W63_n14657MADetTipMD ;
   private java.math.BigDecimal[] T01W63_A14658MADetKilPr ;
   private boolean[] T01W63_n14658MADetKilPr ;
   private java.math.BigDecimal[] T01W63_A14659MADetKilRe ;
   private java.math.BigDecimal[] T01W63_A14661MADetKilTo ;
   private short[] T01W63_A14662MADetDefCo ;
   private boolean[] T01W63_n14662MADetDefCo ;
   private String[] T01W63_A14663MADetDefDs ;
   private boolean[] T01W63_n14663MADetDefDs ;
   private short[] T01W63_A14664MADetCatCo ;
   private boolean[] T01W63_n14664MADetCatCo ;
   private String[] T01W63_A14665MADetCatDs ;
   private boolean[] T01W63_n14665MADetCatDs ;
   private String[] T01W63_A14584MADetUsu ;
   private String[] T01W63_A14583MADetTkn ;
   private int[] T01W63_A14666MADetBarCo ;
   private byte[] T01W63_A14667MADetBarRe ;
   private String[] T01W63_A14668MADetBarPa ;
   private java.math.BigDecimal[] T01W63_A14670MADetMetPr ;
   private boolean[] T01W63_n14670MADetMetPr ;
   private java.math.BigDecimal[] T01W63_A14671MADetMetRe ;
   private boolean[] T01W63_n14671MADetMetRe ;
   private java.math.BigDecimal[] T01W63_A14672MADetMetTo ;
   private boolean[] T01W63_n14672MADetMetTo ;
   private long[] T01W66_A14582MADetId ;
   private long[] T01W67_A14582MADetId ;
   private long[] T01W62_A14582MADetId ;
   private java.util.Date[] T01W62_A14586MADetFec ;
   private String[] T01W62_A14587MADetEmprC ;
   private int[] T01W62_A14585MADetCliCo ;
   private String[] T01W62_A14651MADetCliNo ;
   private boolean[] T01W62_n14651MADetCliNo ;
   private String[] T01W62_A14588MADetArtCo ;
   private String[] T01W62_A14652MADetArtDs ;
   private boolean[] T01W62_n14652MADetArtDs ;
   private String[] T01W62_A14653MADetColNo ;
   private int[] T01W62_A14589MADetColNu ;
   private byte[] T01W62_A14654MADetColCo ;
   private short[] T01W62_A14592MADetMatCo ;
   private String[] T01W62_A14655MADetMatDs ;
   private boolean[] T01W62_n14655MADetMatDs ;
   private byte[] T01W62_A14593MADetIntCo ;
   private String[] T01W62_A14660MADetIntDs ;
   private boolean[] T01W62_n14660MADetIntDs ;
   private String[] T01W62_A14591MADetMaqCo ;
   private String[] T01W62_A14656MADetMaqDs ;
   private boolean[] T01W62_n14656MADetMaqDs ;
   private String[] T01W62_A14590MADetTipMC ;
   private String[] T01W62_A14657MADetTipMD ;
   private boolean[] T01W62_n14657MADetTipMD ;
   private java.math.BigDecimal[] T01W62_A14658MADetKilPr ;
   private boolean[] T01W62_n14658MADetKilPr ;
   private java.math.BigDecimal[] T01W62_A14659MADetKilRe ;
   private java.math.BigDecimal[] T01W62_A14661MADetKilTo ;
   private short[] T01W62_A14662MADetDefCo ;
   private boolean[] T01W62_n14662MADetDefCo ;
   private String[] T01W62_A14663MADetDefDs ;
   private boolean[] T01W62_n14663MADetDefDs ;
   private short[] T01W62_A14664MADetCatCo ;
   private boolean[] T01W62_n14664MADetCatCo ;
   private String[] T01W62_A14665MADetCatDs ;
   private boolean[] T01W62_n14665MADetCatDs ;
   private String[] T01W62_A14584MADetUsu ;
   private String[] T01W62_A14583MADetTkn ;
   private int[] T01W62_A14666MADetBarCo ;
   private byte[] T01W62_A14667MADetBarRe ;
   private String[] T01W62_A14668MADetBarPa ;
   private java.math.BigDecimal[] T01W62_A14670MADetMetPr ;
   private boolean[] T01W62_n14670MADetMetPr ;
   private java.math.BigDecimal[] T01W62_A14671MADetMetRe ;
   private boolean[] T01W62_n14671MADetMetRe ;
   private java.math.BigDecimal[] T01W62_A14672MADetMetTo ;
   private boolean[] T01W62_n14672MADetMetTo ;
   private long[] T01W69_A14582MADetId ;
   private long[] T01W612_A14582MADetId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class madet__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class madet__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class madet__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class madet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W62", "SELECT MADetId, MADetFec, MADetEmprC, MADetCliCo, MADetCliNo, MADetArtCo, MADetArtDs, MADetColNo, MADetColNu, MADetColCo, MADetMatCo, MADetMatDs, MADetIntCo, MADetIntDs, MADetMaqCo, MADetMaqDs, MADetTipMC, MADetTipMD, MADetKilPr, MADetKilRe, MADetKilTo, MADetDefCo, MADetDefDs, MADetCatCo, MADetCatDs, MADetUsu, MADetTkn, MADetBarCo, MADetBarRe, MADetBarPa, MADetMetPr, MADetMetRe, MADetMetTo FROM MADet WHERE MADetId = ?  FOR UPDATE OF MADetFec, MADetEmprC, MADetCliCo, MADetCliNo, MADetArtCo, MADetArtDs, MADetColNo, MADetColNu, MADetColCo, MADetMatCo, MADetMatDs, MADetIntCo, MADetIntDs, MADetMaqCo, MADetMaqDs, MADetTipMC, MADetTipMD, MADetKilPr, MADetKilRe, MADetKilTo, MADetDefCo, MADetDefDs, MADetCatCo, MADetCatDs, MADetUsu, MADetTkn, MADetBarCo, MADetBarRe, MADetBarPa, MADetMetPr, MADetMetRe, MADetMetTo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W63", "SELECT MADetId, MADetFec, MADetEmprC, MADetCliCo, MADetCliNo, MADetArtCo, MADetArtDs, MADetColNo, MADetColNu, MADetColCo, MADetMatCo, MADetMatDs, MADetIntCo, MADetIntDs, MADetMaqCo, MADetMaqDs, MADetTipMC, MADetTipMD, MADetKilPr, MADetKilRe, MADetKilTo, MADetDefCo, MADetDefDs, MADetCatCo, MADetCatDs, MADetUsu, MADetTkn, MADetBarCo, MADetBarRe, MADetBarPa, MADetMetPr, MADetMetRe, MADetMetTo FROM MADet WHERE MADetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W64", "SELECT /*+ FIRST_ROWS(100) */ TM1.MADetId, TM1.MADetFec, TM1.MADetEmprC, TM1.MADetCliCo, TM1.MADetCliNo, TM1.MADetArtCo, TM1.MADetArtDs, TM1.MADetColNo, TM1.MADetColNu, TM1.MADetColCo, TM1.MADetMatCo, TM1.MADetMatDs, TM1.MADetIntCo, TM1.MADetIntDs, TM1.MADetMaqCo, TM1.MADetMaqDs, TM1.MADetTipMC, TM1.MADetTipMD, TM1.MADetKilPr, TM1.MADetKilRe, TM1.MADetKilTo, TM1.MADetDefCo, TM1.MADetDefDs, TM1.MADetCatCo, TM1.MADetCatDs, TM1.MADetUsu, TM1.MADetTkn, TM1.MADetBarCo, TM1.MADetBarRe, TM1.MADetBarPa, TM1.MADetMetPr, TM1.MADetMetRe, TM1.MADetMetTo FROM MADet TM1 WHERE TM1.MADetId = ? ORDER BY TM1.MADetId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W65", "SELECT /*+ FIRST_ROWS(1) */ MADetId FROM MADet WHERE MADetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W66", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MADetId FROM MADet WHERE ( MADetId > ?) ORDER BY MADetId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W67", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MADetId FROM MADet WHERE ( MADetId < ?) ORDER BY MADetId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W68", "INSERT INTO MADet(MADetFec, MADetEmprC, MADetCliCo, MADetCliNo, MADetArtCo, MADetArtDs, MADetColNo, MADetColNu, MADetColCo, MADetMatCo, MADetMatDs, MADetIntCo, MADetIntDs, MADetMaqCo, MADetMaqDs, MADetTipMC, MADetTipMD, MADetKilPr, MADetKilRe, MADetKilTo, MADetDefCo, MADetDefDs, MADetCatCo, MADetCatDs, MADetUsu, MADetTkn, MADetBarCo, MADetBarRe, MADetBarPa, MADetMetPr, MADetMetRe, MADetMetTo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MADet")
         ,new ForEachCursor("T01W69", "SELECT MADetId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01W610", "UPDATE MADet SET MADetFec=?, MADetEmprC=?, MADetCliCo=?, MADetCliNo=?, MADetArtCo=?, MADetArtDs=?, MADetColNo=?, MADetColNu=?, MADetColCo=?, MADetMatCo=?, MADetMatDs=?, MADetIntCo=?, MADetIntDs=?, MADetMaqCo=?, MADetMaqDs=?, MADetTipMC=?, MADetTipMD=?, MADetKilPr=?, MADetKilRe=?, MADetKilTo=?, MADetDefCo=?, MADetDefDs=?, MADetCatCo=?, MADetCatDs=?, MADetUsu=?, MADetTkn=?, MADetBarCo=?, MADetBarRe=?, MADetBarPa=?, MADetMetPr=?, MADetMetRe=?, MADetMetTo=?  WHERE MADetId = ?", GX_NOMASK, "MADet")
         ,new UpdateCursor("T01W611", "DELETE FROM MADet  WHERE MADetId = ?", GX_NOMASK, "MADet")
         ,new ForEachCursor("T01W612", "SELECT /*+ FIRST_ROWS(100) */ MADetId FROM MADet ORDER BY MADetId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((String[]) buf[19])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 4);
               ((String[]) buf[22])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[28])[0] = rslt.getShort(22);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(24);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(26, 8);
               ((String[]) buf[37])[0] = rslt.getVarchar(27);
               ((int[]) buf[38])[0] = rslt.getInt(28);
               ((byte[]) buf[39])[0] = rslt.getByte(29);
               ((String[]) buf[40])[0] = rslt.getString(30, 1);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((String[]) buf[19])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 4);
               ((String[]) buf[22])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[28])[0] = rslt.getShort(22);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(24);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(26, 8);
               ((String[]) buf[37])[0] = rslt.getVarchar(27);
               ((int[]) buf[38])[0] = rslt.getInt(28);
               ((byte[]) buf[39])[0] = rslt.getByte(29);
               ((String[]) buf[40])[0] = rslt.getString(30, 1);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((String[]) buf[19])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 4);
               ((String[]) buf[22])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[28])[0] = rslt.getShort(22);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(24);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(26, 8);
               ((String[]) buf[37])[0] = rslt.getVarchar(27);
               ((int[]) buf[38])[0] = rslt.getInt(28);
               ((byte[]) buf[39])[0] = rslt.getByte(29);
               ((String[]) buf[40])[0] = rslt.getString(30, 1);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 255);
               }
               stmt.setString(5, (String)parms[5], 16);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 255);
               }
               stmt.setString(7, (String)parms[8], 13);
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[13], 255);
               }
               stmt.setByte(12, ((Number) parms[14]).byteValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[16], 255);
               }
               stmt.setString(14, (String)parms[17], 6);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[19], 255);
               }
               stmt.setString(16, (String)parms[20], 4);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[22], 255);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[24], 2);
               }
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[25], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[26], 2);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[30], 255);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[34], 255);
               }
               stmt.setString(25, (String)parms[35], 8);
               stmt.setVarchar(26, (String)parms[36], 256, false);
               stmt.setInt(27, ((Number) parms[37]).intValue());
               stmt.setByte(28, ((Number) parms[38]).byteValue());
               stmt.setString(29, (String)parms[39], 1);
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[45], 2);
               }
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 255);
               }
               stmt.setString(5, (String)parms[5], 16);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 255);
               }
               stmt.setString(7, (String)parms[8], 13);
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[13], 255);
               }
               stmt.setByte(12, ((Number) parms[14]).byteValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[16], 255);
               }
               stmt.setString(14, (String)parms[17], 6);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[19], 255);
               }
               stmt.setString(16, (String)parms[20], 4);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[22], 255);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[24], 2);
               }
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[25], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[26], 2);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[30], 255);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[34], 255);
               }
               stmt.setString(25, (String)parms[35], 8);
               stmt.setVarchar(26, (String)parms[36], 256, false);
               stmt.setInt(27, ((Number) parms[37]).intValue());
               stmt.setByte(28, ((Number) parms[38]).byteValue());
               stmt.setString(29, (String)parms[39], 1);
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[45], 2);
               }
               stmt.setLong(33, ((Number) parms[46]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

