package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class crtin1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4929Inc_Dia = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A4929Inc_Dia) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla CRTIN1", ""), (short)(0)) ;
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

   public crtin1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public crtin1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crtin1_impl.class ));
   }

   public crtin1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla CRTIN1", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_CRTIN1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_CRTIN1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Dia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Dia_Internalname, httpContext.getMessage( "Dia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtInc_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Dia_Internalname, localUtil.format(A4929Inc_Dia, "99/99/99"), localUtil.format( A4929Inc_Dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Dia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtInc_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInc_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CRTIN1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Linea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Linea_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInc_Linea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Linea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Linea_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Hora_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Hora_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtInc_Hora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Hora_Internalname, localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4932Inc_Hora, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Hora_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Hora_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtInc_Hora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInc_Hora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CRTIN1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Usuari_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Usuari_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Usuari_Internalname, GXutil.rtrim( A4933Inc_Usuari), GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Usuari_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Usuari_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Termin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Termin_Internalname, httpContext.getMessage( "Terminal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Termin_Internalname, GXutil.rtrim( A4934Inc_Termin), GXutil.rtrim( localUtil.format( A4934Inc_Termin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Termin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Termin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Prog_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Prog_Internalname, httpContext.getMessage( "Programa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Prog_Internalname, GXutil.rtrim( A4935Inc_Prog), GXutil.rtrim( localUtil.format( A4935Inc_Prog, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Prog_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Prog_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Obs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Obs_Internalname, httpContext.getMessage( "Inc Obs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInc_Obs_Internalname, A4936Inc_Obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", (short)(0), 1, edtInc_Obs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Barcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Barcod_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInc_Barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5299Inc_Barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5299Inc_Barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Barcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Barcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_BarReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_BarReo_Internalname, httpContext.getMessage( "Reoperado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInc_BarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5300Inc_BarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A5300Inc_BarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_BarReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_BarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_BarPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_BarPar_Internalname, httpContext.getMessage( "Particion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_BarPar_Internalname, GXutil.rtrim( A5301Inc_BarPar), GXutil.rtrim( localUtil.format( A5301Inc_BarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_BarPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_BarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Maqcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Maqcod_Internalname, GXutil.rtrim( A7499Inc_Maqcod), GXutil.rtrim( localUtil.format( A7499Inc_Maqcod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Maqcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Maqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_St_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_St_Internalname, httpContext.getMessage( "Estado 0,1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_St_Internalname, GXutil.ltrim( localUtil.ntoc( A8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInc_St_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8012Inc_St), "9") : localUtil.format( DecimalUtil.doubleToDec(A8012Inc_St), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_St_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_St_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_obsTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_obsTxt_Internalname, httpContext.getMessage( "Obs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtInc_obsTxt_Internalname, A13712Inc_obsTxt, "", "", (short)(0), 1, edtInc_obsTxt_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Hdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Hdr_Internalname, httpContext.getMessage( "Nº documento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Hdr_Internalname, GXutil.rtrim( A13713Inc_Hdr), GXutil.rtrim( localUtil.format( A13713Inc_Hdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Hdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtInc_Hdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CRTIN1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CRTIN1.htm");
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
         Z4929Inc_Dia = localUtil.ctod( httpContext.cgiGet( "Z4929Inc_Dia"), 0) ;
         Z4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( "Z4931Inc_Linea"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z4932Inc_Hora"), 0)) ;
         Z4933Inc_Usuari = httpContext.cgiGet( "Z4933Inc_Usuari") ;
         Z4934Inc_Termin = httpContext.cgiGet( "Z4934Inc_Termin") ;
         Z4935Inc_Prog = httpContext.cgiGet( "Z4935Inc_Prog") ;
         Z4936Inc_Obs = httpContext.cgiGet( "Z4936Inc_Obs") ;
         Z5299Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( "Z5299Inc_Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5300Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5300Inc_BarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5301Inc_BarPar = httpContext.cgiGet( "Z5301Inc_BarPar") ;
         Z7499Inc_Maqcod = httpContext.cgiGet( "Z7499Inc_Maqcod") ;
         Z8012Inc_St = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8012Inc_St"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( localUtil.vcdate( httpContext.cgiGet( edtInc_Dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "INC_DIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInc_Dia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4929Inc_Dia = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         }
         else
         {
            A4929Inc_Dia = localUtil.ctod( httpContext.cgiGet( edtInc_Dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INC_LINEA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInc_Linea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4931Inc_Linea = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
         }
         else
         {
            A4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtInc_Hora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "INC_HORA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInc_Hora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A4932Inc_Hora", localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtInc_Hora_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4932Inc_Hora", localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A4933Inc_Usuari = GXutil.upper( httpContext.cgiGet( edtInc_Usuari_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4933Inc_Usuari", A4933Inc_Usuari);
         A4934Inc_Termin = httpContext.cgiGet( edtInc_Termin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4934Inc_Termin", A4934Inc_Termin);
         A4935Inc_Prog = httpContext.cgiGet( edtInc_Prog_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4935Inc_Prog", A4935Inc_Prog);
         A4936Inc_Obs = httpContext.cgiGet( edtInc_Obs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4936Inc_Obs", A4936Inc_Obs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INC_BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInc_Barcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5299Inc_Barcod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5299Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5299Inc_Barcod), 8, 0));
         }
         else
         {
            A5299Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5299Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5299Inc_Barcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INC_BARREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInc_BarReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5300Inc_BarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5300Inc_BarReo", GXutil.str( A5300Inc_BarReo, 1, 0));
         }
         else
         {
            A5300Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5300Inc_BarReo", GXutil.str( A5300Inc_BarReo, 1, 0));
         }
         A5301Inc_BarPar = httpContext.cgiGet( edtInc_BarPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5301Inc_BarPar", A5301Inc_BarPar);
         A7499Inc_Maqcod = httpContext.cgiGet( edtInc_Maqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7499Inc_Maqcod", A7499Inc_Maqcod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INC_ST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtInc_St_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8012Inc_St = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8012Inc_St", GXutil.str( A8012Inc_St, 1, 0));
         }
         else
         {
            A8012Inc_St = (byte)(localUtil.ctol( httpContext.cgiGet( edtInc_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8012Inc_St", GXutil.str( A8012Inc_St, 1, 0));
         }
         A13712Inc_obsTxt = httpContext.cgiGet( edtInc_obsTxt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13712Inc_obsTxt", A13712Inc_obsTxt);
         A13713Inc_Hdr = httpContext.cgiGet( edtInc_Hdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13713Inc_Hdr", A13713Inc_Hdr);
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
            A4929Inc_Dia = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            A4931Inc_Linea = GXutil.lval( httpContext.GetPar( "Inc_Linea")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
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
            initAll1QC726( ) ;
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
      disableAttributes1QC726( ) ;
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

   public void resetCaption1QC0( )
   {
   }

   public void zm1QC726( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4932Inc_Hora = T01QC3_A4932Inc_Hora[0] ;
            Z4933Inc_Usuari = T01QC3_A4933Inc_Usuari[0] ;
            Z4934Inc_Termin = T01QC3_A4934Inc_Termin[0] ;
            Z4935Inc_Prog = T01QC3_A4935Inc_Prog[0] ;
            Z4936Inc_Obs = T01QC3_A4936Inc_Obs[0] ;
            Z5299Inc_Barcod = T01QC3_A5299Inc_Barcod[0] ;
            Z5300Inc_BarReo = T01QC3_A5300Inc_BarReo[0] ;
            Z5301Inc_BarPar = T01QC3_A5301Inc_BarPar[0] ;
            Z7499Inc_Maqcod = T01QC3_A7499Inc_Maqcod[0] ;
            Z8012Inc_St = T01QC3_A8012Inc_St[0] ;
         }
         else
         {
            Z4932Inc_Hora = A4932Inc_Hora ;
            Z4933Inc_Usuari = A4933Inc_Usuari ;
            Z4934Inc_Termin = A4934Inc_Termin ;
            Z4935Inc_Prog = A4935Inc_Prog ;
            Z4936Inc_Obs = A4936Inc_Obs ;
            Z5299Inc_Barcod = A5299Inc_Barcod ;
            Z5300Inc_BarReo = A5300Inc_BarReo ;
            Z5301Inc_BarPar = A5301Inc_BarPar ;
            Z7499Inc_Maqcod = A7499Inc_Maqcod ;
            Z8012Inc_St = A8012Inc_St ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z4931Inc_Linea = A4931Inc_Linea ;
         Z4932Inc_Hora = A4932Inc_Hora ;
         Z4933Inc_Usuari = A4933Inc_Usuari ;
         Z4934Inc_Termin = A4934Inc_Termin ;
         Z4935Inc_Prog = A4935Inc_Prog ;
         Z4936Inc_Obs = A4936Inc_Obs ;
         Z5299Inc_Barcod = A5299Inc_Barcod ;
         Z5300Inc_BarReo = A5300Inc_BarReo ;
         Z5301Inc_BarPar = A5301Inc_BarPar ;
         Z7499Inc_Maqcod = A7499Inc_Maqcod ;
         Z8012Inc_St = A8012Inc_St ;
         Z396EmprCod = A396EmprCod ;
         Z4929Inc_Dia = A4929Inc_Dia ;
         Z407EmprNom = A407EmprNom ;
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

   public void load1QC726( )
   {
      /* Using cursor T01QC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound726 = (short)(1) ;
         A407EmprNom = T01QC6_A407EmprNom[0] ;
         n407EmprNom = T01QC6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4932Inc_Hora = T01QC6_A4932Inc_Hora[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4932Inc_Hora", localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4933Inc_Usuari = T01QC6_A4933Inc_Usuari[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4933Inc_Usuari", A4933Inc_Usuari);
         A4934Inc_Termin = T01QC6_A4934Inc_Termin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4934Inc_Termin", A4934Inc_Termin);
         A4935Inc_Prog = T01QC6_A4935Inc_Prog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4935Inc_Prog", A4935Inc_Prog);
         A4936Inc_Obs = T01QC6_A4936Inc_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4936Inc_Obs", A4936Inc_Obs);
         A5299Inc_Barcod = T01QC6_A5299Inc_Barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5299Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5299Inc_Barcod), 8, 0));
         A5300Inc_BarReo = T01QC6_A5300Inc_BarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5300Inc_BarReo", GXutil.str( A5300Inc_BarReo, 1, 0));
         A5301Inc_BarPar = T01QC6_A5301Inc_BarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5301Inc_BarPar", A5301Inc_BarPar);
         A7499Inc_Maqcod = T01QC6_A7499Inc_Maqcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7499Inc_Maqcod", A7499Inc_Maqcod);
         A8012Inc_St = T01QC6_A8012Inc_St[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8012Inc_St", GXutil.str( A8012Inc_St, 1, 0));
         zm1QC726( -3) ;
      }
      pr_default.close(4);
      onLoadActions1QC726( ) ;
   }

   public void onLoadActions1QC726( )
   {
      A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13712Inc_obsTxt", A13712Inc_obsTxt);
      A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13713Inc_Hdr", A13713Inc_Hdr);
   }

   public void checkExtendedTable1QC726( )
   {
      nIsDirty_726 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QC4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QC4_A407EmprNom[0] ;
      n407EmprNom = T01QC4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01QC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRTINC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INC_DIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      nIsDirty_726 = (short)(1) ;
      A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13712Inc_obsTxt", A13712Inc_obsTxt);
      nIsDirty_726 = (short)(1) ;
      A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13713Inc_Hdr", A13713Inc_Hdr);
   }

   public void closeExtendedTableCursors1QC726( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T01QC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QC7_A407EmprNom[0] ;
      n407EmprNom = T01QC7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_5( String A396EmprCod ,
                         java.util.Date A4929Inc_Dia )
   {
      /* Using cursor T01QC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRTINC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INC_DIA");
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

   public void getKey1QC726( )
   {
      /* Using cursor T01QC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound726 = (short)(1) ;
      }
      else
      {
         RcdFound726 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QC726( 3) ;
         RcdFound726 = (short)(1) ;
         A4931Inc_Linea = T01QC3_A4931Inc_Linea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
         A4932Inc_Hora = T01QC3_A4932Inc_Hora[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4932Inc_Hora", localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4933Inc_Usuari = T01QC3_A4933Inc_Usuari[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4933Inc_Usuari", A4933Inc_Usuari);
         A4934Inc_Termin = T01QC3_A4934Inc_Termin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4934Inc_Termin", A4934Inc_Termin);
         A4935Inc_Prog = T01QC3_A4935Inc_Prog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4935Inc_Prog", A4935Inc_Prog);
         A4936Inc_Obs = T01QC3_A4936Inc_Obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4936Inc_Obs", A4936Inc_Obs);
         A5299Inc_Barcod = T01QC3_A5299Inc_Barcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5299Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5299Inc_Barcod), 8, 0));
         A5300Inc_BarReo = T01QC3_A5300Inc_BarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5300Inc_BarReo", GXutil.str( A5300Inc_BarReo, 1, 0));
         A5301Inc_BarPar = T01QC3_A5301Inc_BarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5301Inc_BarPar", A5301Inc_BarPar);
         A7499Inc_Maqcod = T01QC3_A7499Inc_Maqcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7499Inc_Maqcod", A7499Inc_Maqcod);
         A8012Inc_St = T01QC3_A8012Inc_St[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8012Inc_St", GXutil.str( A8012Inc_St, 1, 0));
         A396EmprCod = T01QC3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4929Inc_Dia = T01QC3_A4929Inc_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         Z396EmprCod = A396EmprCod ;
         Z4929Inc_Dia = A4929Inc_Dia ;
         Z4931Inc_Linea = A4931Inc_Linea ;
         sMode726 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QC726( ) ;
         if ( AnyError == 1 )
         {
            RcdFound726 = (short)(0) ;
            initializeNonKey1QC726( ) ;
         }
         Gx_mode = sMode726 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound726 = (short)(0) ;
         initializeNonKey1QC726( ) ;
         sMode726 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode726 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QC726( ) ;
      if ( RcdFound726 == 0 )
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
      RcdFound726 = (short)(0) ;
      /* Using cursor T01QC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A4929Inc_Dia, A4929Inc_Dia, A396EmprCod, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QC10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QC10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QC10_A4929Inc_Dia[0]).before( GXutil.resetTime( A4929Inc_Dia )) || GXutil.dateCompare(GXutil.resetTime(T01QC10_A4929Inc_Dia[0]), GXutil.resetTime(A4929Inc_Dia)) && ( GXutil.strcmp(T01QC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QC10_A4931Inc_Linea[0] < A4931Inc_Linea ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QC10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QC10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QC10_A4929Inc_Dia[0]).after( GXutil.resetTime( A4929Inc_Dia )) || GXutil.dateCompare(GXutil.resetTime(T01QC10_A4929Inc_Dia[0]), GXutil.resetTime(A4929Inc_Dia)) && ( GXutil.strcmp(T01QC10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QC10_A4931Inc_Linea[0] > A4931Inc_Linea ) ) )
         {
            A396EmprCod = T01QC10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4929Inc_Dia = T01QC10_A4929Inc_Dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            A4931Inc_Linea = T01QC10_A4931Inc_Linea[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
            RcdFound726 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound726 = (short)(0) ;
      /* Using cursor T01QC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A4929Inc_Dia, A4929Inc_Dia, A396EmprCod, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QC11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QC11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QC11_A4929Inc_Dia[0]).after( GXutil.resetTime( A4929Inc_Dia )) || GXutil.dateCompare(GXutil.resetTime(T01QC11_A4929Inc_Dia[0]), GXutil.resetTime(A4929Inc_Dia)) && ( GXutil.strcmp(T01QC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QC11_A4931Inc_Linea[0] > A4931Inc_Linea ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QC11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QC11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01QC11_A4929Inc_Dia[0]).before( GXutil.resetTime( A4929Inc_Dia )) || GXutil.dateCompare(GXutil.resetTime(T01QC11_A4929Inc_Dia[0]), GXutil.resetTime(A4929Inc_Dia)) && ( GXutil.strcmp(T01QC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QC11_A4931Inc_Linea[0] < A4931Inc_Linea ) ) )
         {
            A396EmprCod = T01QC11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4929Inc_Dia = T01QC11_A4929Inc_Dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            A4931Inc_Linea = T01QC11_A4931Inc_Linea[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
            RcdFound726 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QC726( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QC726( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound726 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) || ( A4931Inc_Linea != Z4931Inc_Linea ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4929Inc_Dia = Z4929Inc_Dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
               A4931Inc_Linea = Z4931Inc_Linea ;
               httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
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
               update1QC726( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) || ( A4931Inc_Linea != Z4931Inc_Linea ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QC726( ) ;
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
                  insert1QC726( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) || ( A4931Inc_Linea != Z4931Inc_Linea ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4929Inc_Dia = Z4929Inc_Dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         A4931Inc_Linea = Z4931Inc_Linea ;
         httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
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
      if ( RcdFound726 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtInc_Hora_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QC726( ) ;
      if ( RcdFound726 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInc_Hora_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QC726( ) ;
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
      if ( RcdFound726 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInc_Hora_Internalname ;
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
      if ( RcdFound726 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInc_Hora_Internalname ;
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
      scanStart1QC726( ) ;
      if ( RcdFound726 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound726 != 0 )
         {
            scanNext1QC726( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtInc_Hora_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QC726( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QC726( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRTIN1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z4932Inc_Hora, T01QC2_A4932Inc_Hora[0]) ) || ( GXutil.strcmp(Z4933Inc_Usuari, T01QC2_A4933Inc_Usuari[0]) != 0 ) || ( GXutil.strcmp(Z4934Inc_Termin, T01QC2_A4934Inc_Termin[0]) != 0 ) || ( GXutil.strcmp(Z4935Inc_Prog, T01QC2_A4935Inc_Prog[0]) != 0 ) || ( GXutil.strcmp(Z4936Inc_Obs, T01QC2_A4936Inc_Obs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5299Inc_Barcod != T01QC2_A5299Inc_Barcod[0] ) || ( Z5300Inc_BarReo != T01QC2_A5300Inc_BarReo[0] ) || ( GXutil.strcmp(Z5301Inc_BarPar, T01QC2_A5301Inc_BarPar[0]) != 0 ) || ( GXutil.strcmp(Z7499Inc_Maqcod, T01QC2_A7499Inc_Maqcod[0]) != 0 ) || ( Z8012Inc_St != T01QC2_A8012Inc_St[0] ) )
         {
            if ( !( GXutil.dateCompare(Z4932Inc_Hora, T01QC2_A4932Inc_Hora[0]) ) )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Hora");
               GXutil.writeLogRaw("Old: ",Z4932Inc_Hora);
               GXutil.writeLogRaw("Current: ",T01QC2_A4932Inc_Hora[0]);
            }
            if ( GXutil.strcmp(Z4933Inc_Usuari, T01QC2_A4933Inc_Usuari[0]) != 0 )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Usuari");
               GXutil.writeLogRaw("Old: ",Z4933Inc_Usuari);
               GXutil.writeLogRaw("Current: ",T01QC2_A4933Inc_Usuari[0]);
            }
            if ( GXutil.strcmp(Z4934Inc_Termin, T01QC2_A4934Inc_Termin[0]) != 0 )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Termin");
               GXutil.writeLogRaw("Old: ",Z4934Inc_Termin);
               GXutil.writeLogRaw("Current: ",T01QC2_A4934Inc_Termin[0]);
            }
            if ( GXutil.strcmp(Z4935Inc_Prog, T01QC2_A4935Inc_Prog[0]) != 0 )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Prog");
               GXutil.writeLogRaw("Old: ",Z4935Inc_Prog);
               GXutil.writeLogRaw("Current: ",T01QC2_A4935Inc_Prog[0]);
            }
            if ( GXutil.strcmp(Z4936Inc_Obs, T01QC2_A4936Inc_Obs[0]) != 0 )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Obs");
               GXutil.writeLogRaw("Old: ",Z4936Inc_Obs);
               GXutil.writeLogRaw("Current: ",T01QC2_A4936Inc_Obs[0]);
            }
            if ( Z5299Inc_Barcod != T01QC2_A5299Inc_Barcod[0] )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Barcod");
               GXutil.writeLogRaw("Old: ",Z5299Inc_Barcod);
               GXutil.writeLogRaw("Current: ",T01QC2_A5299Inc_Barcod[0]);
            }
            if ( Z5300Inc_BarReo != T01QC2_A5300Inc_BarReo[0] )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_BarReo");
               GXutil.writeLogRaw("Old: ",Z5300Inc_BarReo);
               GXutil.writeLogRaw("Current: ",T01QC2_A5300Inc_BarReo[0]);
            }
            if ( GXutil.strcmp(Z5301Inc_BarPar, T01QC2_A5301Inc_BarPar[0]) != 0 )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_BarPar");
               GXutil.writeLogRaw("Old: ",Z5301Inc_BarPar);
               GXutil.writeLogRaw("Current: ",T01QC2_A5301Inc_BarPar[0]);
            }
            if ( GXutil.strcmp(Z7499Inc_Maqcod, T01QC2_A7499Inc_Maqcod[0]) != 0 )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_Maqcod");
               GXutil.writeLogRaw("Old: ",Z7499Inc_Maqcod);
               GXutil.writeLogRaw("Current: ",T01QC2_A7499Inc_Maqcod[0]);
            }
            if ( Z8012Inc_St != T01QC2_A8012Inc_St[0] )
            {
               GXutil.writeLogln("crtin1:[seudo value changed for attri]"+"Inc_St");
               GXutil.writeLogRaw("Old: ",Z8012Inc_St);
               GXutil.writeLogRaw("Current: ",T01QC2_A8012Inc_St[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRTIN1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QC726( )
   {
      beforeValidate1QC726( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QC726( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QC726( 0) ;
         checkOptimisticConcurrency1QC726( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QC726( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QC726( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QC12 */
                  pr_default.execute(10, new Object[] {Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar, A7499Inc_Maqcod, Byte.valueOf(A8012Inc_St), A396EmprCod, A4929Inc_Dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption1QC0( ) ;
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
            load1QC726( ) ;
         }
         endLevel1QC726( ) ;
      }
      closeExtendedTableCursors1QC726( ) ;
   }

   public void update1QC726( )
   {
      beforeValidate1QC726( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QC726( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QC726( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QC726( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QC726( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QC13 */
                  pr_default.execute(11, new Object[] {A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar, A7499Inc_Maqcod, Byte.valueOf(A8012Inc_St), A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRTIN1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QC726( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QC0( ) ;
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
         endLevel1QC726( ) ;
      }
      closeExtendedTableCursors1QC726( ) ;
   }

   public void deferredUpdate1QC726( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QC726( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QC726( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QC726( ) ;
         afterConfirm1QC726( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QC726( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QC14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound726 == 0 )
                     {
                        initAll1QC726( ) ;
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
                     resetCaption1QC0( ) ;
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
      sMode726 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QC726( ) ;
      Gx_mode = sMode726 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QC726( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QC15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01QC15_A407EmprNom[0] ;
         n407EmprNom = T01QC15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13712Inc_obsTxt", A13712Inc_obsTxt);
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13713Inc_Hdr", A13713Inc_Hdr);
      }
   }

   public void endLevel1QC726( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QC726( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "crtin1");
         if ( AnyError == 0 )
         {
            confirmValues1QC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "crtin1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QC726( )
   {
      /* Using cursor T01QC16 */
      pr_default.execute(14);
      RcdFound726 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound726 = (short)(1) ;
         A396EmprCod = T01QC16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4929Inc_Dia = T01QC16_A4929Inc_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         A4931Inc_Linea = T01QC16_A4931Inc_Linea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QC726( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound726 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound726 = (short)(1) ;
         A396EmprCod = T01QC16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4929Inc_Dia = T01QC16_A4929Inc_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         A4931Inc_Linea = T01QC16_A4931Inc_Linea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
      }
   }

   public void scanEnd1QC726( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1QC726( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QC726( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QC726( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QC726( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QC726( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QC726( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QC726( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtInc_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Enabled), 5, 0), true);
      edtInc_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Enabled), 5, 0), true);
      edtInc_Hora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hora_Enabled), 5, 0), true);
      edtInc_Usuari_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Usuari_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Usuari_Enabled), 5, 0), true);
      edtInc_Termin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Termin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Termin_Enabled), 5, 0), true);
      edtInc_Prog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Prog_Enabled), 5, 0), true);
      edtInc_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Obs_Enabled), 5, 0), true);
      edtInc_Barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Barcod_Enabled), 5, 0), true);
      edtInc_BarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_BarReo_Enabled), 5, 0), true);
      edtInc_BarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_BarPar_Enabled), 5, 0), true);
      edtInc_Maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Maqcod_Enabled), 5, 0), true);
      edtInc_St_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_St_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_St_Enabled), 5, 0), true);
      edtInc_obsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_obsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_obsTxt_Enabled), 5, 0), true);
      edtInc_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QC726( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.crtin1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4929Inc_Dia", localUtil.dtoc( Z4929Inc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4931Inc_Linea", GXutil.ltrim( localUtil.ntoc( Z4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4932Inc_Hora", localUtil.ttoc( Z4932Inc_Hora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4933Inc_Usuari", GXutil.rtrim( Z4933Inc_Usuari));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4934Inc_Termin", GXutil.rtrim( Z4934Inc_Termin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4935Inc_Prog", GXutil.rtrim( Z4935Inc_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4936Inc_Obs", Z4936Inc_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5299Inc_Barcod", GXutil.ltrim( localUtil.ntoc( Z5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5300Inc_BarReo", GXutil.ltrim( localUtil.ntoc( Z5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5301Inc_BarPar", GXutil.rtrim( Z5301Inc_BarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7499Inc_Maqcod", GXutil.rtrim( Z7499Inc_Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8012Inc_St", GXutil.ltrim( localUtil.ntoc( Z8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.crtin1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "CRTIN1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla CRTIN1", "") ;
   }

   public void initializeNonKey1QC726( )
   {
      A13713Inc_Hdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13713Inc_Hdr", A13713Inc_Hdr);
      A13712Inc_obsTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13712Inc_obsTxt", A13712Inc_obsTxt);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4932Inc_Hora", localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4933Inc_Usuari = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4933Inc_Usuari", A4933Inc_Usuari);
      A4934Inc_Termin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4934Inc_Termin", A4934Inc_Termin);
      A4935Inc_Prog = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4935Inc_Prog", A4935Inc_Prog);
      A4936Inc_Obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4936Inc_Obs", A4936Inc_Obs);
      A5299Inc_Barcod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5299Inc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5299Inc_Barcod), 8, 0));
      A5300Inc_BarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5300Inc_BarReo", GXutil.str( A5300Inc_BarReo, 1, 0));
      A5301Inc_BarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5301Inc_BarPar", A5301Inc_BarPar);
      A7499Inc_Maqcod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7499Inc_Maqcod", A7499Inc_Maqcod);
      A8012Inc_St = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8012Inc_St", GXutil.str( A8012Inc_St, 1, 0));
      Z4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      Z4933Inc_Usuari = "" ;
      Z4934Inc_Termin = "" ;
      Z4935Inc_Prog = "" ;
      Z4936Inc_Obs = "" ;
      Z5299Inc_Barcod = 0 ;
      Z5300Inc_BarReo = (byte)(0) ;
      Z5301Inc_BarPar = "" ;
      Z7499Inc_Maqcod = "" ;
      Z8012Inc_St = (byte)(0) ;
   }

   public void initAll1QC726( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4929Inc_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
      A4931Inc_Linea = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4931Inc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4931Inc_Linea), 10, 0));
      initializeNonKey1QC726( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511612", true, true);
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
      httpContext.AddJavascriptSource("crtin1.js", "?20268241511612", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtInc_Dia_Internalname = "INC_DIA" ;
      edtInc_Linea_Internalname = "INC_LINEA" ;
      edtInc_Hora_Internalname = "INC_HORA" ;
      edtInc_Usuari_Internalname = "INC_USUARI" ;
      edtInc_Termin_Internalname = "INC_TERMIN" ;
      edtInc_Prog_Internalname = "INC_PROG" ;
      edtInc_Obs_Internalname = "INC_OBS" ;
      edtInc_Barcod_Internalname = "INC_BARCOD" ;
      edtInc_BarReo_Internalname = "INC_BARREO" ;
      edtInc_BarPar_Internalname = "INC_BARPAR" ;
      edtInc_Maqcod_Internalname = "INC_MAQCOD" ;
      edtInc_St_Internalname = "INC_ST" ;
      edtInc_obsTxt_Internalname = "INC_OBSTXT" ;
      edtInc_Hdr_Internalname = "INC_HDR" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla CRTIN1", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtInc_Hdr_Jsonclick = "" ;
      edtInc_Hdr_Enabled = 0 ;
      edtInc_obsTxt_Enabled = 0 ;
      edtInc_St_Jsonclick = "" ;
      edtInc_St_Enabled = 1 ;
      edtInc_Maqcod_Jsonclick = "" ;
      edtInc_Maqcod_Enabled = 1 ;
      edtInc_BarPar_Jsonclick = "" ;
      edtInc_BarPar_Enabled = 1 ;
      edtInc_BarReo_Jsonclick = "" ;
      edtInc_BarReo_Enabled = 1 ;
      edtInc_Barcod_Jsonclick = "" ;
      edtInc_Barcod_Enabled = 1 ;
      edtInc_Obs_Enabled = 1 ;
      edtInc_Prog_Jsonclick = "" ;
      edtInc_Prog_Enabled = 1 ;
      edtInc_Termin_Jsonclick = "" ;
      edtInc_Termin_Enabled = 1 ;
      edtInc_Usuari_Jsonclick = "" ;
      edtInc_Usuari_Enabled = 1 ;
      edtInc_Hora_Jsonclick = "" ;
      edtInc_Hora_Enabled = 1 ;
      edtInc_Linea_Jsonclick = "" ;
      edtInc_Linea_Enabled = 1 ;
      edtInc_Dia_Jsonclick = "" ;
      edtInc_Dia_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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
      /* Using cursor T01QC15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QC15_A407EmprNom[0] ;
      n407EmprNom = T01QC15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01QC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRTINC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INC_DIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtInc_Hora_Internalname ;
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
      n407EmprNom = false ;
      /* Using cursor T01QC15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01QC15_A407EmprNom[0] ;
      n407EmprNom = T01QC15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Inc_dia( )
   {
      /* Using cursor T01QC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRTINC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INC_DIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Inc_linea( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4932Inc_Hora", localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4933Inc_Usuari", GXutil.rtrim( A4933Inc_Usuari));
      httpContext.ajax_rsp_assign_attri("", false, "A4934Inc_Termin", GXutil.rtrim( A4934Inc_Termin));
      httpContext.ajax_rsp_assign_attri("", false, "A4935Inc_Prog", GXutil.rtrim( A4935Inc_Prog));
      httpContext.ajax_rsp_assign_attri("", false, "A4936Inc_Obs", A4936Inc_Obs);
      httpContext.ajax_rsp_assign_attri("", false, "A5299Inc_Barcod", GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5300Inc_BarReo", GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5301Inc_BarPar", GXutil.rtrim( A5301Inc_BarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A7499Inc_Maqcod", GXutil.rtrim( A7499Inc_Maqcod));
      httpContext.ajax_rsp_assign_attri("", false, "A8012Inc_St", GXutil.ltrim( localUtil.ntoc( A8012Inc_St, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13712Inc_obsTxt", A13712Inc_obsTxt);
      httpContext.ajax_rsp_assign_attri("", false, "A13713Inc_Hdr", GXutil.rtrim( A13713Inc_Hdr));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4929Inc_Dia", localUtil.format(Z4929Inc_Dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4931Inc_Linea", GXutil.ltrim( localUtil.ntoc( Z4931Inc_Linea, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4932Inc_Hora", localUtil.ttoc( Z4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4933Inc_Usuari", GXutil.rtrim( Z4933Inc_Usuari));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4934Inc_Termin", GXutil.rtrim( Z4934Inc_Termin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4935Inc_Prog", GXutil.rtrim( Z4935Inc_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4936Inc_Obs", Z4936Inc_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z5299Inc_Barcod", GXutil.ltrim( localUtil.ntoc( Z5299Inc_Barcod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5300Inc_BarReo", GXutil.ltrim( localUtil.ntoc( Z5300Inc_BarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5301Inc_BarPar", GXutil.rtrim( Z5301Inc_BarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7499Inc_Maqcod", GXutil.rtrim( Z7499Inc_Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8012Inc_St", GXutil.ltrim( localUtil.ntoc( Z8012Inc_St, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13712Inc_obsTxt", Z13712Inc_obsTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13713Inc_Hdr", GXutil.rtrim( Z13713Inc_Hdr));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_INC_DIA","{handler:'valid_Inc_dia',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4929Inc_Dia',fld:'INC_DIA',pic:''}]");
      setEventMetadata("VALID_INC_DIA",",oparms:[]}");
      setEventMetadata("VALID_INC_LINEA","{handler:'valid_Inc_linea',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4929Inc_Dia',fld:'INC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_INC_LINEA",",oparms:[{av:'A4932Inc_Hora',fld:'INC_HORA',pic:'99:99:99'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A5299Inc_Barcod',fld:'INC_BARCOD',pic:'ZZZZZZZ9'},{av:'A5300Inc_BarReo',fld:'INC_BARREO',pic:'9'},{av:'A5301Inc_BarPar',fld:'INC_BARPAR',pic:''},{av:'A7499Inc_Maqcod',fld:'INC_MAQCOD',pic:''},{av:'A8012Inc_St',fld:'INC_ST',pic:'9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13712Inc_obsTxt',fld:'INC_OBSTXT',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4929Inc_Dia'},{av:'Z4931Inc_Linea'},{av:'Z4932Inc_Hora'},{av:'Z4933Inc_Usuari'},{av:'Z4934Inc_Termin'},{av:'Z4935Inc_Prog'},{av:'Z4936Inc_Obs'},{av:'Z5299Inc_Barcod'},{av:'Z5300Inc_BarReo'},{av:'Z5301Inc_BarPar'},{av:'Z7499Inc_Maqcod'},{av:'Z8012Inc_St'},{av:'Z407EmprNom'},{av:'Z13712Inc_obsTxt'},{av:'Z13713Inc_Hdr'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_INC_OBS","{handler:'valid_Inc_obs',iparms:[]");
      setEventMetadata("VALID_INC_OBS",",oparms:[]}");
      setEventMetadata("VALID_INC_BARCOD","{handler:'valid_Inc_barcod',iparms:[]");
      setEventMetadata("VALID_INC_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_INC_BARREO","{handler:'valid_Inc_barreo',iparms:[]");
      setEventMetadata("VALID_INC_BARREO",",oparms:[]}");
      setEventMetadata("VALID_INC_BARPAR","{handler:'valid_Inc_barpar',iparms:[]");
      setEventMetadata("VALID_INC_BARPAR",",oparms:[]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4929Inc_Dia = GXutil.nullDate() ;
      Z4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      Z4933Inc_Usuari = "" ;
      Z4934Inc_Termin = "" ;
      Z4935Inc_Prog = "" ;
      Z4936Inc_Obs = "" ;
      Z5301Inc_BarPar = "" ;
      Z7499Inc_Maqcod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
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
      A407EmprNom = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A5301Inc_BarPar = "" ;
      A7499Inc_Maqcod = "" ;
      A13712Inc_obsTxt = "" ;
      A13713Inc_Hdr = "" ;
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
      Z407EmprNom = "" ;
      T01QC6_A4931Inc_Linea = new long[1] ;
      T01QC6_A407EmprNom = new String[] {""} ;
      T01QC6_n407EmprNom = new boolean[] {false} ;
      T01QC6_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC6_A4933Inc_Usuari = new String[] {""} ;
      T01QC6_A4934Inc_Termin = new String[] {""} ;
      T01QC6_A4935Inc_Prog = new String[] {""} ;
      T01QC6_A4936Inc_Obs = new String[] {""} ;
      T01QC6_A5299Inc_Barcod = new int[1] ;
      T01QC6_A5300Inc_BarReo = new byte[1] ;
      T01QC6_A5301Inc_BarPar = new String[] {""} ;
      T01QC6_A7499Inc_Maqcod = new String[] {""} ;
      T01QC6_A8012Inc_St = new byte[1] ;
      T01QC6_A396EmprCod = new String[] {""} ;
      T01QC6_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC4_A407EmprNom = new String[] {""} ;
      T01QC4_n407EmprNom = new boolean[] {false} ;
      T01QC5_A396EmprCod = new String[] {""} ;
      T01QC7_A407EmprNom = new String[] {""} ;
      T01QC7_n407EmprNom = new boolean[] {false} ;
      T01QC8_A396EmprCod = new String[] {""} ;
      T01QC9_A396EmprCod = new String[] {""} ;
      T01QC9_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC9_A4931Inc_Linea = new long[1] ;
      T01QC3_A4931Inc_Linea = new long[1] ;
      T01QC3_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC3_A4933Inc_Usuari = new String[] {""} ;
      T01QC3_A4934Inc_Termin = new String[] {""} ;
      T01QC3_A4935Inc_Prog = new String[] {""} ;
      T01QC3_A4936Inc_Obs = new String[] {""} ;
      T01QC3_A5299Inc_Barcod = new int[1] ;
      T01QC3_A5300Inc_BarReo = new byte[1] ;
      T01QC3_A5301Inc_BarPar = new String[] {""} ;
      T01QC3_A7499Inc_Maqcod = new String[] {""} ;
      T01QC3_A8012Inc_St = new byte[1] ;
      T01QC3_A396EmprCod = new String[] {""} ;
      T01QC3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      sMode726 = "" ;
      T01QC10_A396EmprCod = new String[] {""} ;
      T01QC10_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC10_A4931Inc_Linea = new long[1] ;
      T01QC11_A396EmprCod = new String[] {""} ;
      T01QC11_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC11_A4931Inc_Linea = new long[1] ;
      T01QC2_A4931Inc_Linea = new long[1] ;
      T01QC2_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC2_A4933Inc_Usuari = new String[] {""} ;
      T01QC2_A4934Inc_Termin = new String[] {""} ;
      T01QC2_A4935Inc_Prog = new String[] {""} ;
      T01QC2_A4936Inc_Obs = new String[] {""} ;
      T01QC2_A5299Inc_Barcod = new int[1] ;
      T01QC2_A5300Inc_BarReo = new byte[1] ;
      T01QC2_A5301Inc_BarPar = new String[] {""} ;
      T01QC2_A7499Inc_Maqcod = new String[] {""} ;
      T01QC2_A8012Inc_St = new byte[1] ;
      T01QC2_A396EmprCod = new String[] {""} ;
      T01QC2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC15_A407EmprNom = new String[] {""} ;
      T01QC15_n407EmprNom = new boolean[] {false} ;
      T01QC16_A396EmprCod = new String[] {""} ;
      T01QC16_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01QC16_A4931Inc_Linea = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QC17_A396EmprCod = new String[] {""} ;
      Z13712Inc_obsTxt = "" ;
      Z13713Inc_Hdr = "" ;
      ZZ396EmprCod = "" ;
      ZZ4929Inc_Dia = GXutil.nullDate() ;
      ZZ4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      ZZ4933Inc_Usuari = "" ;
      ZZ4934Inc_Termin = "" ;
      ZZ4935Inc_Prog = "" ;
      ZZ4936Inc_Obs = "" ;
      ZZ5301Inc_BarPar = "" ;
      ZZ7499Inc_Maqcod = "" ;
      ZZ407EmprNom = "" ;
      ZZ13712Inc_obsTxt = "" ;
      ZZ13713Inc_Hdr = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.crtin1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.crtin1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.crtin1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.crtin1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.crtin1__default(),
         new Object[] {
             new Object[] {
            T01QC2_A4931Inc_Linea, T01QC2_A4932Inc_Hora, T01QC2_A4933Inc_Usuari, T01QC2_A4934Inc_Termin, T01QC2_A4935Inc_Prog, T01QC2_A4936Inc_Obs, T01QC2_A5299Inc_Barcod, T01QC2_A5300Inc_BarReo, T01QC2_A5301Inc_BarPar, T01QC2_A7499Inc_Maqcod,
            T01QC2_A8012Inc_St, T01QC2_A396EmprCod, T01QC2_A4929Inc_Dia
            }
            , new Object[] {
            T01QC3_A4931Inc_Linea, T01QC3_A4932Inc_Hora, T01QC3_A4933Inc_Usuari, T01QC3_A4934Inc_Termin, T01QC3_A4935Inc_Prog, T01QC3_A4936Inc_Obs, T01QC3_A5299Inc_Barcod, T01QC3_A5300Inc_BarReo, T01QC3_A5301Inc_BarPar, T01QC3_A7499Inc_Maqcod,
            T01QC3_A8012Inc_St, T01QC3_A396EmprCod, T01QC3_A4929Inc_Dia
            }
            , new Object[] {
            T01QC4_A407EmprNom, T01QC4_n407EmprNom
            }
            , new Object[] {
            T01QC5_A396EmprCod
            }
            , new Object[] {
            T01QC6_A4931Inc_Linea, T01QC6_A407EmprNom, T01QC6_n407EmprNom, T01QC6_A4932Inc_Hora, T01QC6_A4933Inc_Usuari, T01QC6_A4934Inc_Termin, T01QC6_A4935Inc_Prog, T01QC6_A4936Inc_Obs, T01QC6_A5299Inc_Barcod, T01QC6_A5300Inc_BarReo,
            T01QC6_A5301Inc_BarPar, T01QC6_A7499Inc_Maqcod, T01QC6_A8012Inc_St, T01QC6_A396EmprCod, T01QC6_A4929Inc_Dia
            }
            , new Object[] {
            T01QC7_A407EmprNom, T01QC7_n407EmprNom
            }
            , new Object[] {
            T01QC8_A396EmprCod
            }
            , new Object[] {
            T01QC9_A396EmprCod, T01QC9_A4929Inc_Dia, T01QC9_A4931Inc_Linea
            }
            , new Object[] {
            T01QC10_A396EmprCod, T01QC10_A4929Inc_Dia, T01QC10_A4931Inc_Linea
            }
            , new Object[] {
            T01QC11_A396EmprCod, T01QC11_A4929Inc_Dia, T01QC11_A4931Inc_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QC15_A407EmprNom, T01QC15_n407EmprNom
            }
            , new Object[] {
            T01QC16_A396EmprCod, T01QC16_A4929Inc_Dia, T01QC16_A4931Inc_Linea
            }
            , new Object[] {
            T01QC17_A396EmprCod
            }
         }
      );
   }

   private byte Z5300Inc_BarReo ;
   private byte Z8012Inc_St ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5300Inc_BarReo ;
   private byte A8012Inc_St ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ5300Inc_BarReo ;
   private byte ZZ8012Inc_St ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound726 ;
   private short nIsDirty_726 ;
   private int Z5299Inc_Barcod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtInc_Dia_Enabled ;
   private int edtInc_Linea_Enabled ;
   private int edtInc_Hora_Enabled ;
   private int edtInc_Usuari_Enabled ;
   private int edtInc_Termin_Enabled ;
   private int edtInc_Prog_Enabled ;
   private int edtInc_Obs_Enabled ;
   private int A5299Inc_Barcod ;
   private int edtInc_Barcod_Enabled ;
   private int edtInc_BarReo_Enabled ;
   private int edtInc_BarPar_Enabled ;
   private int edtInc_Maqcod_Enabled ;
   private int edtInc_St_Enabled ;
   private int edtInc_obsTxt_Enabled ;
   private int edtInc_Hdr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ5299Inc_Barcod ;
   private long Z4931Inc_Linea ;
   private long A4931Inc_Linea ;
   private long ZZ4931Inc_Linea ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4933Inc_Usuari ;
   private String Z4934Inc_Termin ;
   private String Z4935Inc_Prog ;
   private String Z5301Inc_BarPar ;
   private String Z7499Inc_Maqcod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtInc_Dia_Internalname ;
   private String edtInc_Dia_Jsonclick ;
   private String edtInc_Linea_Internalname ;
   private String edtInc_Linea_Jsonclick ;
   private String edtInc_Hora_Internalname ;
   private String edtInc_Hora_Jsonclick ;
   private String edtInc_Usuari_Internalname ;
   private String A4933Inc_Usuari ;
   private String edtInc_Usuari_Jsonclick ;
   private String edtInc_Termin_Internalname ;
   private String A4934Inc_Termin ;
   private String edtInc_Termin_Jsonclick ;
   private String edtInc_Prog_Internalname ;
   private String A4935Inc_Prog ;
   private String edtInc_Prog_Jsonclick ;
   private String edtInc_Obs_Internalname ;
   private String edtInc_Barcod_Internalname ;
   private String edtInc_Barcod_Jsonclick ;
   private String edtInc_BarReo_Internalname ;
   private String edtInc_BarReo_Jsonclick ;
   private String edtInc_BarPar_Internalname ;
   private String A5301Inc_BarPar ;
   private String edtInc_BarPar_Jsonclick ;
   private String edtInc_Maqcod_Internalname ;
   private String A7499Inc_Maqcod ;
   private String edtInc_Maqcod_Jsonclick ;
   private String edtInc_St_Internalname ;
   private String edtInc_St_Jsonclick ;
   private String edtInc_obsTxt_Internalname ;
   private String edtInc_Hdr_Internalname ;
   private String A13713Inc_Hdr ;
   private String edtInc_Hdr_Jsonclick ;
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
   private String Z407EmprNom ;
   private String sMode726 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13713Inc_Hdr ;
   private String ZZ396EmprCod ;
   private String ZZ4933Inc_Usuari ;
   private String ZZ4934Inc_Termin ;
   private String ZZ4935Inc_Prog ;
   private String ZZ5301Inc_BarPar ;
   private String ZZ7499Inc_Maqcod ;
   private String ZZ407EmprNom ;
   private String ZZ13713Inc_Hdr ;
   private java.util.Date Z4932Inc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date ZZ4932Inc_Hora ;
   private java.util.Date Z4929Inc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date ZZ4929Inc_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private String Z4936Inc_Obs ;
   private String A4936Inc_Obs ;
   private String A13712Inc_obsTxt ;
   private String Z13712Inc_obsTxt ;
   private String ZZ4936Inc_Obs ;
   private String ZZ13712Inc_obsTxt ;
   private IDataStoreProvider pr_default ;
   private long[] T01QC6_A4931Inc_Linea ;
   private String[] T01QC6_A407EmprNom ;
   private boolean[] T01QC6_n407EmprNom ;
   private java.util.Date[] T01QC6_A4932Inc_Hora ;
   private String[] T01QC6_A4933Inc_Usuari ;
   private String[] T01QC6_A4934Inc_Termin ;
   private String[] T01QC6_A4935Inc_Prog ;
   private String[] T01QC6_A4936Inc_Obs ;
   private int[] T01QC6_A5299Inc_Barcod ;
   private byte[] T01QC6_A5300Inc_BarReo ;
   private String[] T01QC6_A5301Inc_BarPar ;
   private String[] T01QC6_A7499Inc_Maqcod ;
   private byte[] T01QC6_A8012Inc_St ;
   private String[] T01QC6_A396EmprCod ;
   private java.util.Date[] T01QC6_A4929Inc_Dia ;
   private String[] T01QC4_A407EmprNom ;
   private boolean[] T01QC4_n407EmprNom ;
   private String[] T01QC5_A396EmprCod ;
   private String[] T01QC7_A407EmprNom ;
   private boolean[] T01QC7_n407EmprNom ;
   private String[] T01QC8_A396EmprCod ;
   private String[] T01QC9_A396EmprCod ;
   private java.util.Date[] T01QC9_A4929Inc_Dia ;
   private long[] T01QC9_A4931Inc_Linea ;
   private long[] T01QC3_A4931Inc_Linea ;
   private java.util.Date[] T01QC3_A4932Inc_Hora ;
   private String[] T01QC3_A4933Inc_Usuari ;
   private String[] T01QC3_A4934Inc_Termin ;
   private String[] T01QC3_A4935Inc_Prog ;
   private String[] T01QC3_A4936Inc_Obs ;
   private int[] T01QC3_A5299Inc_Barcod ;
   private byte[] T01QC3_A5300Inc_BarReo ;
   private String[] T01QC3_A5301Inc_BarPar ;
   private String[] T01QC3_A7499Inc_Maqcod ;
   private byte[] T01QC3_A8012Inc_St ;
   private String[] T01QC3_A396EmprCod ;
   private java.util.Date[] T01QC3_A4929Inc_Dia ;
   private String[] T01QC10_A396EmprCod ;
   private java.util.Date[] T01QC10_A4929Inc_Dia ;
   private long[] T01QC10_A4931Inc_Linea ;
   private String[] T01QC11_A396EmprCod ;
   private java.util.Date[] T01QC11_A4929Inc_Dia ;
   private long[] T01QC11_A4931Inc_Linea ;
   private long[] T01QC2_A4931Inc_Linea ;
   private java.util.Date[] T01QC2_A4932Inc_Hora ;
   private String[] T01QC2_A4933Inc_Usuari ;
   private String[] T01QC2_A4934Inc_Termin ;
   private String[] T01QC2_A4935Inc_Prog ;
   private String[] T01QC2_A4936Inc_Obs ;
   private int[] T01QC2_A5299Inc_Barcod ;
   private byte[] T01QC2_A5300Inc_BarReo ;
   private String[] T01QC2_A5301Inc_BarPar ;
   private String[] T01QC2_A7499Inc_Maqcod ;
   private byte[] T01QC2_A8012Inc_St ;
   private String[] T01QC2_A396EmprCod ;
   private java.util.Date[] T01QC2_A4929Inc_Dia ;
   private String[] T01QC15_A407EmprNom ;
   private boolean[] T01QC15_n407EmprNom ;
   private String[] T01QC16_A396EmprCod ;
   private java.util.Date[] T01QC16_A4929Inc_Dia ;
   private long[] T01QC16_A4931Inc_Linea ;
   private String[] T01QC17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class crtin1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crtin1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crtin1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crtin1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class crtin1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QC2", "SELECT Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St, EmprCod, Inc_Dia FROM TXPCRTIN1 WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?  FOR UPDATE OF Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC3", "SELECT Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St, EmprCod, Inc_Dia FROM TXPCRTIN1 WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC5", "SELECT EmprCod FROM TXPCRTINC WHERE EmprCod = ? AND Inc_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Inc_Linea, T2.EmprNom, TM1.Inc_Hora, TM1.Inc_Usuari, TM1.Inc_Termin, TM1.Inc_Prog, TM1.Inc_Obs, TM1.Inc_Barcod, TM1.Inc_BarReo, TM1.Inc_BarPar, TM1.Inc_Maqcod, TM1.Inc_St, TM1.EmprCod, TM1.Inc_Dia FROM (TXPCRTIN1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Inc_Dia = ? and TM1.Inc_Linea = ? ORDER BY TM1.EmprCod, TM1.Inc_Dia, TM1.Inc_Linea ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC8", "SELECT EmprCod FROM TXPCRTINC WHERE EmprCod = ? AND Inc_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE ( EmprCod > ? or EmprCod = ? and Inc_Dia > ? or Inc_Dia = ? and EmprCod = ? and Inc_Linea > ?) ORDER BY EmprCod, Inc_Dia, Inc_Linea) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE ( EmprCod < ? or EmprCod = ? and Inc_Dia < ? or Inc_Dia = ? and EmprCod = ? and Inc_Linea < ?) ORDER BY EmprCod DESC, Inc_Dia DESC, Inc_Linea DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QC12", "INSERT INTO TXPCRTIN1(Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St, EmprCod, Inc_Dia) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCRTIN1")
         ,new UpdateCursor("T01QC13", "UPDATE TXPCRTIN1 SET Inc_Hora=?, Inc_Usuari=?, Inc_Termin=?, Inc_Prog=?, Inc_Obs=?, Inc_Barcod=?, Inc_BarReo=?, Inc_BarPar=?, Inc_Maqcod=?, Inc_St=?  WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?", GX_NOMASK, "TXPCRTIN1")
         ,new UpdateCursor("T01QC14", "DELETE FROM TXPCRTIN1  WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?", GX_NOMASK, "TXPCRTIN1")
         ,new ForEachCursor("T01QC15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 ORDER BY EmprCod, Inc_Dia, Inc_Linea ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QC17", "SELECT EmprCod FROM TXPCRTINC WHERE EmprCod = ? AND Inc_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 15 :
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], true);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setVarchar(6, (String)parms[5], 400, false);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setDate(13, (java.util.Date)parms[12]);
               return;
            case 11 :
               stmt.setDateTime(1, (java.util.Date)parms[0], true);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setVarchar(5, (String)parms[4], 400, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

