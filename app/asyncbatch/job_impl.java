package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class job_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "JOB", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public job_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public job_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( job_impl.class ));
   }

   public job_impl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbJobStat = new HTMLChoice();
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
      if ( cmbJobStat.getItemCount() > 0 )
      {
         A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
         n14450JobStat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbJobStat.getInternalname(), "Values", cmbJobStat.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "JOB", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AsyncBatch\\JOB.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AsyncBatch\\JOB.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtJobId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtJobId_Internalname, httpContext.getMessage( "Job", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJobId_Internalname, A14423JobId.toString(), A14423JobId.toString(), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJobId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtJobId_Enabled, 0, "text", "", 36, "chr", 1, "row", 36, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtJobDesc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtJobDesc_Internalname, httpContext.getMessage( "arquivo ", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJobDesc_Internalname, A14485JobDesc, GXutil.rtrim( localUtil.format( A14485JobDesc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJobDesc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtJobDesc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtJobType_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtJobType_Internalname, httpContext.getMessage( "Type", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJobType_Internalname, A14424JobType, GXutil.rtrim( localUtil.format( A14424JobType, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJobType_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtJobType_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtJobExec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtJobExec_Internalname, httpContext.getMessage( "Program", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJobExec_Internalname, A14484JobExec, GXutil.rtrim( localUtil.format( A14484JobExec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJobExec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtJobExec_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbJobStat.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbJobStat.getInternalname(), httpContext.getMessage( "Status", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbJobStat, cmbJobStat.getInternalname(), GXutil.rtrim( A14450JobStat), 1, cmbJobStat.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbJobStat.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "", true, (byte)(0), "HLP_AsyncBatch\\JOB.htm");
      cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbJobStat.getInternalname(), "Values", cmbJobStat.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsrCreat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtUsrCreat_Internalname, httpContext.getMessage( "User", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsrCreat_Internalname, A14451UsrCreat, GXutil.rtrim( localUtil.format( A14451UsrCreat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsrCreat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsrCreat_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUsrSocket_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtUsrSocket_Internalname, httpContext.getMessage( "Socket Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsrSocket_Internalname, A14488UsrSocket, GXutil.rtrim( localUtil.format( A14488UsrSocket, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsrSocket_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUsrSocket_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDtCreat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDtCreat_Internalname, httpContext.getMessage( "Created", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDtCreat_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtCreat_Internalname, localUtil.ttoc( A14452DtCreat, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14452DtCreat, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtCreat_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDtCreat_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDtCreat_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDtCreat_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AsyncBatch\\JOB.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDtStart_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDtStart_Internalname, httpContext.getMessage( "Start", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDtStart_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtStart_Internalname, localUtil.ttoc( A14453DtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14453DtStart, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtStart_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDtStart_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDtStart_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDtStart_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AsyncBatch\\JOB.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDtEnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDtEnd_Internalname, httpContext.getMessage( "Finished", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDtEnd_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDtEnd_Internalname, localUtil.ttoc( A14454DtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14454DtEnd, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDtEnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDtEnd_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDtEnd_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDtEnd_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AsyncBatch\\JOB.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTotItem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTotItem_Internalname, httpContext.getMessage( "Total Rows", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotItem_Internalname, GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotItem_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14455TotItem), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14455TotItem), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotItem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTotItem_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrcItem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrcItem_Internalname, httpContext.getMessage( "Processed", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrcItem_Internalname, GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrcItem_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14456PrcItem), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14456PrcItem), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrcItem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrcItem_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOkItem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOkItem_Internalname, httpContext.getMessage( "Success", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOkItem_Internalname, GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOkItem_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14457OkItem), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14457OkItem), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOkItem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOkItem_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtErItem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtErItem_Internalname, httpContext.getMessage( "Error", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErItem_Internalname, GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErItem_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14458ErItem), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14458ErItem), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErItem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtErItem_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrgPct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrgPct_Internalname, httpContext.getMessage( "Progress", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrgPct_Internalname, GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrgPct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14459PrgPct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14459PrgPct), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrgPct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrgPct_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCurItem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCurItem_Internalname, httpContext.getMessage( "Doc.Cod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCurItem_Internalname, A14460CurItem, GXutil.rtrim( localUtil.format( A14460CurItem, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCurItem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCurItem_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBasePath_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBasePath_Internalname, httpContext.getMessage( "Base Path", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBasePath_Internalname, A14437BasePath, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", (short)(0), 1, edtBasePath_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOutPath_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOutPath_Internalname, httpContext.getMessage( "Output", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOutPath_Internalname, A14462OutPath, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", (short)(0), 1, edtOutPath_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtZipPath_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtZipPath_Internalname, httpContext.getMessage( "Zip Path", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtZipPath_Internalname, A14463ZipPath, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", (short)(0), 1, edtZipPath_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtZipUrl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtZipUrl_Internalname, httpContext.getMessage( "Url Zip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtZipUrl_Internalname, A14464ZipUrl, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", (short)(0), 1, edtZipUrl_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLastErr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLastErr_Internalname, httpContext.getMessage( "Console", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtLastErr_Internalname, A14465LastErr, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", (short)(0), 1, edtLastErr_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLockId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLockId_Internalname, httpContext.getMessage( "Lock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLockId_Internalname, A14466LockId, GXutil.rtrim( localUtil.format( A14466LockId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLockId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLockId_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLockDt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLockDt_Internalname, httpContext.getMessage( "Time Lock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLockDt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLockDt_Internalname, localUtil.ttoc( A14467LockDt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14467LockDt, "99/99/9999 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLockDt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLockDt_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLockDt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLockDt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AsyncBatch\\JOB.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOB.htm");
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
         Z14423JobId = GXutil.strToGuid(httpContext.cgiGet( "Z14423JobId")) ;
         Z14485JobDesc = httpContext.cgiGet( "Z14485JobDesc") ;
         Z14424JobType = httpContext.cgiGet( "Z14424JobType") ;
         Z14484JobExec = httpContext.cgiGet( "Z14484JobExec") ;
         Z14450JobStat = httpContext.cgiGet( "Z14450JobStat") ;
         Z14451UsrCreat = httpContext.cgiGet( "Z14451UsrCreat") ;
         Z14488UsrSocket = httpContext.cgiGet( "Z14488UsrSocket") ;
         Z14452DtCreat = localUtil.ctot( httpContext.cgiGet( "Z14452DtCreat"), 0) ;
         Z14453DtStart = localUtil.ctot( httpContext.cgiGet( "Z14453DtStart"), 0) ;
         Z14454DtEnd = localUtil.ctot( httpContext.cgiGet( "Z14454DtEnd"), 0) ;
         Z14455TotItem = localUtil.ctol( httpContext.cgiGet( "Z14455TotItem"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14456PrcItem = localUtil.ctol( httpContext.cgiGet( "Z14456PrcItem"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14457OkItem = localUtil.ctol( httpContext.cgiGet( "Z14457OkItem"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14458ErItem = localUtil.ctol( httpContext.cgiGet( "Z14458ErItem"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( "Z14459PrgPct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14460CurItem = httpContext.cgiGet( "Z14460CurItem") ;
         Z14437BasePath = httpContext.cgiGet( "Z14437BasePath") ;
         Z14462OutPath = httpContext.cgiGet( "Z14462OutPath") ;
         Z14463ZipPath = httpContext.cgiGet( "Z14463ZipPath") ;
         Z14464ZipUrl = httpContext.cgiGet( "Z14464ZipUrl") ;
         Z14466LockId = httpContext.cgiGet( "Z14466LockId") ;
         Z14467LockDt = localUtil.ctot( httpContext.cgiGet( "Z14467LockDt"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( GXutil.strcmp(httpContext.cgiGet( edtJobId_Internalname), "") == 0 )
         {
            A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
         }
         else
         {
            try
            {
               A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
            }
            catch ( IllegalArgumentException  e)
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_invalidguid"), 1, "JOBID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
            }
         }
         A14485JobDesc = httpContext.cgiGet( edtJobDesc_Internalname) ;
         n14485JobDesc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14485JobDesc", A14485JobDesc);
         A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
         n14424JobType = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
         A14484JobExec = httpContext.cgiGet( edtJobExec_Internalname) ;
         n14484JobExec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14484JobExec", A14484JobExec);
         cmbJobStat.setValue( httpContext.cgiGet( cmbJobStat.getInternalname()) );
         A14450JobStat = httpContext.cgiGet( cmbJobStat.getInternalname()) ;
         n14450JobStat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
         A14451UsrCreat = httpContext.cgiGet( edtUsrCreat_Internalname) ;
         n14451UsrCreat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14451UsrCreat", A14451UsrCreat);
         A14488UsrSocket = httpContext.cgiGet( edtUsrSocket_Internalname) ;
         n14488UsrSocket = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14488UsrSocket", A14488UsrSocket);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtDtCreat_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DTCREAT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDtCreat_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
            n14452DtCreat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14452DtCreat", localUtil.ttoc( A14452DtCreat, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14452DtCreat = localUtil.ctot( httpContext.cgiGet( edtDtCreat_Internalname)) ;
            n14452DtCreat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14452DtCreat", localUtil.ttoc( A14452DtCreat, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtDtStart_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DTSTART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDtStart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14453DtStart = GXutil.resetTime( GXutil.nullDate() );
            n14453DtStart = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14453DtStart", localUtil.ttoc( A14453DtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14453DtStart = localUtil.ctot( httpContext.cgiGet( edtDtStart_Internalname)) ;
            n14453DtStart = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14453DtStart", localUtil.ttoc( A14453DtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtDtEnd_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DTEND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDtEnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
            n14454DtEnd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14454DtEnd", localUtil.ttoc( A14454DtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14454DtEnd = localUtil.ctot( httpContext.cgiGet( edtDtEnd_Internalname)) ;
            n14454DtEnd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14454DtEnd", localUtil.ttoc( A14454DtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TOTITEM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTotItem_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14455TotItem = 0 ;
            n14455TotItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14455TotItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14455TotItem), 10, 0));
         }
         else
         {
            A14455TotItem = localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14455TotItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14455TotItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14455TotItem), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRCITEM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrcItem_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14456PrcItem = 0 ;
            n14456PrcItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14456PrcItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14456PrcItem), 10, 0));
         }
         else
         {
            A14456PrcItem = localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14456PrcItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14456PrcItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14456PrcItem), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OKITEM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOkItem_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14457OkItem = 0 ;
            n14457OkItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14457OkItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14457OkItem), 10, 0));
         }
         else
         {
            A14457OkItem = localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14457OkItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14457OkItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14457OkItem), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERITEM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtErItem_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14458ErItem = 0 ;
            n14458ErItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14458ErItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14458ErItem), 10, 0));
         }
         else
         {
            A14458ErItem = localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14458ErItem = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14458ErItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14458ErItem), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRGPCT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrgPct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14459PrgPct = (short)(0) ;
            n14459PrgPct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14459PrgPct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14459PrgPct), 3, 0));
         }
         else
         {
            A14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14459PrgPct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14459PrgPct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14459PrgPct), 3, 0));
         }
         A14460CurItem = httpContext.cgiGet( edtCurItem_Internalname) ;
         n14460CurItem = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14460CurItem", A14460CurItem);
         A14437BasePath = httpContext.cgiGet( edtBasePath_Internalname) ;
         n14437BasePath = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14437BasePath", A14437BasePath);
         A14462OutPath = httpContext.cgiGet( edtOutPath_Internalname) ;
         n14462OutPath = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14462OutPath", A14462OutPath);
         A14463ZipPath = httpContext.cgiGet( edtZipPath_Internalname) ;
         n14463ZipPath = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14463ZipPath", A14463ZipPath);
         A14464ZipUrl = httpContext.cgiGet( edtZipUrl_Internalname) ;
         n14464ZipUrl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14464ZipUrl", A14464ZipUrl);
         A14465LastErr = httpContext.cgiGet( edtLastErr_Internalname) ;
         n14465LastErr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14465LastErr", A14465LastErr);
         A14466LockId = httpContext.cgiGet( edtLockId_Internalname) ;
         n14466LockId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14466LockId", A14466LockId);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtLockDt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "LOCKDT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLockDt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14467LockDt = GXutil.resetTime( GXutil.nullDate() );
            n14467LockDt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14467LockDt", localUtil.ttoc( A14467LockDt, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14467LockDt = localUtil.ctot( httpContext.cgiGet( edtLockDt_Internalname)) ;
            n14467LockDt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14467LockDt", localUtil.ttoc( A14467LockDt, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
            A14423JobId = GXutil.strToGuid(httpContext.GetPar( "JobId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
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
            initAll1VJ1907( ) ;
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
      disableAttributes1VJ1907( ) ;
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

   public void resetCaption1VJ0( )
   {
   }

   public void zm1VJ1907( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14485JobDesc = T01VJ3_A14485JobDesc[0] ;
            Z14424JobType = T01VJ3_A14424JobType[0] ;
            Z14484JobExec = T01VJ3_A14484JobExec[0] ;
            Z14450JobStat = T01VJ3_A14450JobStat[0] ;
            Z14451UsrCreat = T01VJ3_A14451UsrCreat[0] ;
            Z14488UsrSocket = T01VJ3_A14488UsrSocket[0] ;
            Z14452DtCreat = T01VJ3_A14452DtCreat[0] ;
            Z14453DtStart = T01VJ3_A14453DtStart[0] ;
            Z14454DtEnd = T01VJ3_A14454DtEnd[0] ;
            Z14455TotItem = T01VJ3_A14455TotItem[0] ;
            Z14456PrcItem = T01VJ3_A14456PrcItem[0] ;
            Z14457OkItem = T01VJ3_A14457OkItem[0] ;
            Z14458ErItem = T01VJ3_A14458ErItem[0] ;
            Z14459PrgPct = T01VJ3_A14459PrgPct[0] ;
            Z14460CurItem = T01VJ3_A14460CurItem[0] ;
            Z14437BasePath = T01VJ3_A14437BasePath[0] ;
            Z14462OutPath = T01VJ3_A14462OutPath[0] ;
            Z14463ZipPath = T01VJ3_A14463ZipPath[0] ;
            Z14464ZipUrl = T01VJ3_A14464ZipUrl[0] ;
            Z14466LockId = T01VJ3_A14466LockId[0] ;
            Z14467LockDt = T01VJ3_A14467LockDt[0] ;
         }
         else
         {
            Z14485JobDesc = A14485JobDesc ;
            Z14424JobType = A14424JobType ;
            Z14484JobExec = A14484JobExec ;
            Z14450JobStat = A14450JobStat ;
            Z14451UsrCreat = A14451UsrCreat ;
            Z14488UsrSocket = A14488UsrSocket ;
            Z14452DtCreat = A14452DtCreat ;
            Z14453DtStart = A14453DtStart ;
            Z14454DtEnd = A14454DtEnd ;
            Z14455TotItem = A14455TotItem ;
            Z14456PrcItem = A14456PrcItem ;
            Z14457OkItem = A14457OkItem ;
            Z14458ErItem = A14458ErItem ;
            Z14459PrgPct = A14459PrgPct ;
            Z14460CurItem = A14460CurItem ;
            Z14437BasePath = A14437BasePath ;
            Z14462OutPath = A14462OutPath ;
            Z14463ZipPath = A14463ZipPath ;
            Z14464ZipUrl = A14464ZipUrl ;
            Z14466LockId = A14466LockId ;
            Z14467LockDt = A14467LockDt ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z14423JobId = A14423JobId ;
         Z14485JobDesc = A14485JobDesc ;
         Z14424JobType = A14424JobType ;
         Z14484JobExec = A14484JobExec ;
         Z14450JobStat = A14450JobStat ;
         Z14451UsrCreat = A14451UsrCreat ;
         Z14488UsrSocket = A14488UsrSocket ;
         Z14452DtCreat = A14452DtCreat ;
         Z14453DtStart = A14453DtStart ;
         Z14454DtEnd = A14454DtEnd ;
         Z14455TotItem = A14455TotItem ;
         Z14456PrcItem = A14456PrcItem ;
         Z14457OkItem = A14457OkItem ;
         Z14458ErItem = A14458ErItem ;
         Z14459PrgPct = A14459PrgPct ;
         Z14460CurItem = A14460CurItem ;
         Z14437BasePath = A14437BasePath ;
         Z14462OutPath = A14462OutPath ;
         Z14463ZipPath = A14463ZipPath ;
         Z14464ZipUrl = A14464ZipUrl ;
         Z14465LastErr = A14465LastErr ;
         Z14466LockId = A14466LockId ;
         Z14467LockDt = A14467LockDt ;
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

   public void load1VJ1907( )
   {
      /* Using cursor T01VJ4 */
      pr_default.execute(2, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1907 = (short)(1) ;
         A14465LastErr = T01VJ4_A14465LastErr[0] ;
         n14465LastErr = T01VJ4_n14465LastErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14465LastErr", A14465LastErr);
         A14485JobDesc = T01VJ4_A14485JobDesc[0] ;
         n14485JobDesc = T01VJ4_n14485JobDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14485JobDesc", A14485JobDesc);
         A14424JobType = T01VJ4_A14424JobType[0] ;
         n14424JobType = T01VJ4_n14424JobType[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
         A14484JobExec = T01VJ4_A14484JobExec[0] ;
         n14484JobExec = T01VJ4_n14484JobExec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14484JobExec", A14484JobExec);
         A14450JobStat = T01VJ4_A14450JobStat[0] ;
         n14450JobStat = T01VJ4_n14450JobStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
         A14451UsrCreat = T01VJ4_A14451UsrCreat[0] ;
         n14451UsrCreat = T01VJ4_n14451UsrCreat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14451UsrCreat", A14451UsrCreat);
         A14488UsrSocket = T01VJ4_A14488UsrSocket[0] ;
         n14488UsrSocket = T01VJ4_n14488UsrSocket[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14488UsrSocket", A14488UsrSocket);
         A14452DtCreat = T01VJ4_A14452DtCreat[0] ;
         n14452DtCreat = T01VJ4_n14452DtCreat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14452DtCreat", localUtil.ttoc( A14452DtCreat, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14453DtStart = T01VJ4_A14453DtStart[0] ;
         n14453DtStart = T01VJ4_n14453DtStart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14453DtStart", localUtil.ttoc( A14453DtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14454DtEnd = T01VJ4_A14454DtEnd[0] ;
         n14454DtEnd = T01VJ4_n14454DtEnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14454DtEnd", localUtil.ttoc( A14454DtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14455TotItem = T01VJ4_A14455TotItem[0] ;
         n14455TotItem = T01VJ4_n14455TotItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14455TotItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14455TotItem), 10, 0));
         A14456PrcItem = T01VJ4_A14456PrcItem[0] ;
         n14456PrcItem = T01VJ4_n14456PrcItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14456PrcItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14456PrcItem), 10, 0));
         A14457OkItem = T01VJ4_A14457OkItem[0] ;
         n14457OkItem = T01VJ4_n14457OkItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14457OkItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14457OkItem), 10, 0));
         A14458ErItem = T01VJ4_A14458ErItem[0] ;
         n14458ErItem = T01VJ4_n14458ErItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14458ErItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14458ErItem), 10, 0));
         A14459PrgPct = T01VJ4_A14459PrgPct[0] ;
         n14459PrgPct = T01VJ4_n14459PrgPct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14459PrgPct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14459PrgPct), 3, 0));
         A14460CurItem = T01VJ4_A14460CurItem[0] ;
         n14460CurItem = T01VJ4_n14460CurItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14460CurItem", A14460CurItem);
         A14437BasePath = T01VJ4_A14437BasePath[0] ;
         n14437BasePath = T01VJ4_n14437BasePath[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14437BasePath", A14437BasePath);
         A14462OutPath = T01VJ4_A14462OutPath[0] ;
         n14462OutPath = T01VJ4_n14462OutPath[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14462OutPath", A14462OutPath);
         A14463ZipPath = T01VJ4_A14463ZipPath[0] ;
         n14463ZipPath = T01VJ4_n14463ZipPath[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14463ZipPath", A14463ZipPath);
         A14464ZipUrl = T01VJ4_A14464ZipUrl[0] ;
         n14464ZipUrl = T01VJ4_n14464ZipUrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14464ZipUrl", A14464ZipUrl);
         A14466LockId = T01VJ4_A14466LockId[0] ;
         n14466LockId = T01VJ4_n14466LockId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14466LockId", A14466LockId);
         A14467LockDt = T01VJ4_A14467LockDt[0] ;
         n14467LockDt = T01VJ4_n14467LockDt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14467LockDt", localUtil.ttoc( A14467LockDt, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         zm1VJ1907( -3) ;
      }
      pr_default.close(2);
      onLoadActions1VJ1907( ) ;
   }

   public void onLoadActions1VJ1907( )
   {
   }

   public void checkExtendedTable1VJ1907( )
   {
      nIsDirty_1907 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A14450JobStat, "WAINTING") == 0 ) || ( GXutil.strcmp(A14450JobStat, "PROCESSING") == 0 ) || ( GXutil.strcmp(A14450JobStat, "SUCCESS") == 0 ) || ( GXutil.strcmp(A14450JobStat, "ERROR") == 0 ) || ( GXutil.strcmp(A14450JobStat, "DONE") == 0 ) || ( GXutil.strcmp(A14450JobStat, "DONE_ERR") == 0 ) || (GXutil.strcmp("", A14450JobStat)==0) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Status", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "JOBSTAT");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbJobStat.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1VJ1907( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1VJ1907( )
   {
      /* Using cursor T01VJ5 */
      pr_default.execute(3, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1907 = (short)(1) ;
      }
      else
      {
         RcdFound1907 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VJ3 */
      pr_default.execute(1, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VJ1907( 3) ;
         RcdFound1907 = (short)(1) ;
         A14465LastErr = T01VJ3_A14465LastErr[0] ;
         n14465LastErr = T01VJ3_n14465LastErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14465LastErr", A14465LastErr);
         A14423JobId = T01VJ3_A14423JobId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
         A14485JobDesc = T01VJ3_A14485JobDesc[0] ;
         n14485JobDesc = T01VJ3_n14485JobDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14485JobDesc", A14485JobDesc);
         A14424JobType = T01VJ3_A14424JobType[0] ;
         n14424JobType = T01VJ3_n14424JobType[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
         A14484JobExec = T01VJ3_A14484JobExec[0] ;
         n14484JobExec = T01VJ3_n14484JobExec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14484JobExec", A14484JobExec);
         A14450JobStat = T01VJ3_A14450JobStat[0] ;
         n14450JobStat = T01VJ3_n14450JobStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
         A14451UsrCreat = T01VJ3_A14451UsrCreat[0] ;
         n14451UsrCreat = T01VJ3_n14451UsrCreat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14451UsrCreat", A14451UsrCreat);
         A14488UsrSocket = T01VJ3_A14488UsrSocket[0] ;
         n14488UsrSocket = T01VJ3_n14488UsrSocket[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14488UsrSocket", A14488UsrSocket);
         A14452DtCreat = T01VJ3_A14452DtCreat[0] ;
         n14452DtCreat = T01VJ3_n14452DtCreat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14452DtCreat", localUtil.ttoc( A14452DtCreat, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14453DtStart = T01VJ3_A14453DtStart[0] ;
         n14453DtStart = T01VJ3_n14453DtStart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14453DtStart", localUtil.ttoc( A14453DtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14454DtEnd = T01VJ3_A14454DtEnd[0] ;
         n14454DtEnd = T01VJ3_n14454DtEnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14454DtEnd", localUtil.ttoc( A14454DtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14455TotItem = T01VJ3_A14455TotItem[0] ;
         n14455TotItem = T01VJ3_n14455TotItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14455TotItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14455TotItem), 10, 0));
         A14456PrcItem = T01VJ3_A14456PrcItem[0] ;
         n14456PrcItem = T01VJ3_n14456PrcItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14456PrcItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14456PrcItem), 10, 0));
         A14457OkItem = T01VJ3_A14457OkItem[0] ;
         n14457OkItem = T01VJ3_n14457OkItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14457OkItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14457OkItem), 10, 0));
         A14458ErItem = T01VJ3_A14458ErItem[0] ;
         n14458ErItem = T01VJ3_n14458ErItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14458ErItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14458ErItem), 10, 0));
         A14459PrgPct = T01VJ3_A14459PrgPct[0] ;
         n14459PrgPct = T01VJ3_n14459PrgPct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14459PrgPct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14459PrgPct), 3, 0));
         A14460CurItem = T01VJ3_A14460CurItem[0] ;
         n14460CurItem = T01VJ3_n14460CurItem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14460CurItem", A14460CurItem);
         A14437BasePath = T01VJ3_A14437BasePath[0] ;
         n14437BasePath = T01VJ3_n14437BasePath[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14437BasePath", A14437BasePath);
         A14462OutPath = T01VJ3_A14462OutPath[0] ;
         n14462OutPath = T01VJ3_n14462OutPath[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14462OutPath", A14462OutPath);
         A14463ZipPath = T01VJ3_A14463ZipPath[0] ;
         n14463ZipPath = T01VJ3_n14463ZipPath[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14463ZipPath", A14463ZipPath);
         A14464ZipUrl = T01VJ3_A14464ZipUrl[0] ;
         n14464ZipUrl = T01VJ3_n14464ZipUrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14464ZipUrl", A14464ZipUrl);
         A14466LockId = T01VJ3_A14466LockId[0] ;
         n14466LockId = T01VJ3_n14466LockId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14466LockId", A14466LockId);
         A14467LockDt = T01VJ3_A14467LockDt[0] ;
         n14467LockDt = T01VJ3_n14467LockDt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14467LockDt", localUtil.ttoc( A14467LockDt, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         Z14423JobId = A14423JobId ;
         sMode1907 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VJ1907( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1907 = (short)(0) ;
            initializeNonKey1VJ1907( ) ;
         }
         Gx_mode = sMode1907 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1907 = (short)(0) ;
         initializeNonKey1VJ1907( ) ;
         sMode1907 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1907 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
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
      RcdFound1907 = (short)(0) ;
      /* Using cursor T01VJ6 */
      pr_default.execute(4, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.guidCompare(T01VJ6_A14423JobId[0], A14423JobId, 0) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.guidCompare(T01VJ6_A14423JobId[0], A14423JobId, 0) > 0 ) ) )
         {
            A14423JobId = T01VJ6_A14423JobId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
            RcdFound1907 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1907 = (short)(0) ;
      /* Using cursor T01VJ7 */
      pr_default.execute(5, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.guidCompare(T01VJ7_A14423JobId[0], A14423JobId, 0) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.guidCompare(T01VJ7_A14423JobId[0], A14423JobId, 0) < 0 ) ) )
         {
            A14423JobId = T01VJ7_A14423JobId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
            RcdFound1907 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VJ1907( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VJ1907( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1907 == 1 )
         {
            if ( !( A14423JobId.equals( Z14423JobId ) ) )
            {
               A14423JobId = Z14423JobId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "JOBID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1VJ1907( ) ;
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( !( A14423JobId.equals( Z14423JobId ) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VJ1907( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "JOBID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtJobId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtJobId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1VJ1907( ) ;
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
      if ( !( A14423JobId.equals( Z14423JobId ) ) )
      {
         A14423JobId = Z14423JobId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "JOBID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtJobId_Internalname ;
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
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "JOBID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtJobDesc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJobDesc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VJ1907( ) ;
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
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJobDesc_Internalname ;
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
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJobDesc_Internalname ;
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
      scanStart1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1907 != 0 )
         {
            scanNext1VJ1907( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtJobDesc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VJ1907( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VJ1907( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VJ2 */
         pr_default.execute(0, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14485JobDesc, T01VJ2_A14485JobDesc[0]) != 0 ) || ( GXutil.strcmp(Z14424JobType, T01VJ2_A14424JobType[0]) != 0 ) || ( GXutil.strcmp(Z14484JobExec, T01VJ2_A14484JobExec[0]) != 0 ) || ( GXutil.strcmp(Z14450JobStat, T01VJ2_A14450JobStat[0]) != 0 ) || ( GXutil.strcmp(Z14451UsrCreat, T01VJ2_A14451UsrCreat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14488UsrSocket, T01VJ2_A14488UsrSocket[0]) != 0 ) || !( GXutil.dateCompare(Z14452DtCreat, T01VJ2_A14452DtCreat[0]) ) || !( GXutil.dateCompare(Z14453DtStart, T01VJ2_A14453DtStart[0]) ) || !( GXutil.dateCompare(Z14454DtEnd, T01VJ2_A14454DtEnd[0]) ) || ( Z14455TotItem != T01VJ2_A14455TotItem[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14456PrcItem != T01VJ2_A14456PrcItem[0] ) || ( Z14457OkItem != T01VJ2_A14457OkItem[0] ) || ( Z14458ErItem != T01VJ2_A14458ErItem[0] ) || ( Z14459PrgPct != T01VJ2_A14459PrgPct[0] ) || ( GXutil.strcmp(Z14460CurItem, T01VJ2_A14460CurItem[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14437BasePath, T01VJ2_A14437BasePath[0]) != 0 ) || ( GXutil.strcmp(Z14462OutPath, T01VJ2_A14462OutPath[0]) != 0 ) || ( GXutil.strcmp(Z14463ZipPath, T01VJ2_A14463ZipPath[0]) != 0 ) || ( GXutil.strcmp(Z14464ZipUrl, T01VJ2_A14464ZipUrl[0]) != 0 ) || ( GXutil.strcmp(Z14466LockId, T01VJ2_A14466LockId[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14467LockDt, T01VJ2_A14467LockDt[0]) ) )
         {
            if ( GXutil.strcmp(Z14485JobDesc, T01VJ2_A14485JobDesc[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"JobDesc");
               GXutil.writeLogRaw("Old: ",Z14485JobDesc);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14485JobDesc[0]);
            }
            if ( GXutil.strcmp(Z14424JobType, T01VJ2_A14424JobType[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"JobType");
               GXutil.writeLogRaw("Old: ",Z14424JobType);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14424JobType[0]);
            }
            if ( GXutil.strcmp(Z14484JobExec, T01VJ2_A14484JobExec[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"JobExec");
               GXutil.writeLogRaw("Old: ",Z14484JobExec);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14484JobExec[0]);
            }
            if ( GXutil.strcmp(Z14450JobStat, T01VJ2_A14450JobStat[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"JobStat");
               GXutil.writeLogRaw("Old: ",Z14450JobStat);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14450JobStat[0]);
            }
            if ( GXutil.strcmp(Z14451UsrCreat, T01VJ2_A14451UsrCreat[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"UsrCreat");
               GXutil.writeLogRaw("Old: ",Z14451UsrCreat);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14451UsrCreat[0]);
            }
            if ( GXutil.strcmp(Z14488UsrSocket, T01VJ2_A14488UsrSocket[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"UsrSocket");
               GXutil.writeLogRaw("Old: ",Z14488UsrSocket);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14488UsrSocket[0]);
            }
            if ( !( GXutil.dateCompare(Z14452DtCreat, T01VJ2_A14452DtCreat[0]) ) )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"DtCreat");
               GXutil.writeLogRaw("Old: ",Z14452DtCreat);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14452DtCreat[0]);
            }
            if ( !( GXutil.dateCompare(Z14453DtStart, T01VJ2_A14453DtStart[0]) ) )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"DtStart");
               GXutil.writeLogRaw("Old: ",Z14453DtStart);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14453DtStart[0]);
            }
            if ( !( GXutil.dateCompare(Z14454DtEnd, T01VJ2_A14454DtEnd[0]) ) )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"DtEnd");
               GXutil.writeLogRaw("Old: ",Z14454DtEnd);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14454DtEnd[0]);
            }
            if ( Z14455TotItem != T01VJ2_A14455TotItem[0] )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"TotItem");
               GXutil.writeLogRaw("Old: ",Z14455TotItem);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14455TotItem[0]);
            }
            if ( Z14456PrcItem != T01VJ2_A14456PrcItem[0] )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"PrcItem");
               GXutil.writeLogRaw("Old: ",Z14456PrcItem);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14456PrcItem[0]);
            }
            if ( Z14457OkItem != T01VJ2_A14457OkItem[0] )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"OkItem");
               GXutil.writeLogRaw("Old: ",Z14457OkItem);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14457OkItem[0]);
            }
            if ( Z14458ErItem != T01VJ2_A14458ErItem[0] )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"ErItem");
               GXutil.writeLogRaw("Old: ",Z14458ErItem);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14458ErItem[0]);
            }
            if ( Z14459PrgPct != T01VJ2_A14459PrgPct[0] )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"PrgPct");
               GXutil.writeLogRaw("Old: ",Z14459PrgPct);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14459PrgPct[0]);
            }
            if ( GXutil.strcmp(Z14460CurItem, T01VJ2_A14460CurItem[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"CurItem");
               GXutil.writeLogRaw("Old: ",Z14460CurItem);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14460CurItem[0]);
            }
            if ( GXutil.strcmp(Z14437BasePath, T01VJ2_A14437BasePath[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"BasePath");
               GXutil.writeLogRaw("Old: ",Z14437BasePath);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14437BasePath[0]);
            }
            if ( GXutil.strcmp(Z14462OutPath, T01VJ2_A14462OutPath[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"OutPath");
               GXutil.writeLogRaw("Old: ",Z14462OutPath);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14462OutPath[0]);
            }
            if ( GXutil.strcmp(Z14463ZipPath, T01VJ2_A14463ZipPath[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"ZipPath");
               GXutil.writeLogRaw("Old: ",Z14463ZipPath);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14463ZipPath[0]);
            }
            if ( GXutil.strcmp(Z14464ZipUrl, T01VJ2_A14464ZipUrl[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"ZipUrl");
               GXutil.writeLogRaw("Old: ",Z14464ZipUrl);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14464ZipUrl[0]);
            }
            if ( GXutil.strcmp(Z14466LockId, T01VJ2_A14466LockId[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"LockId");
               GXutil.writeLogRaw("Old: ",Z14466LockId);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14466LockId[0]);
            }
            if ( !( GXutil.dateCompare(Z14467LockDt, T01VJ2_A14467LockDt[0]) ) )
            {
               GXutil.writeLogln("asyncbatch.job:[seudo value changed for attri]"+"LockDt");
               GXutil.writeLogRaw("Old: ",Z14467LockDt);
               GXutil.writeLogRaw("Current: ",T01VJ2_A14467LockDt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VJ1907( )
   {
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VJ1907( 0) ;
         checkOptimisticConcurrency1VJ1907( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VJ1907( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VJ1907( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VJ8 */
                  pr_default.execute(6, new Object[] {A14423JobId, Boolean.valueOf(n14485JobDesc), A14485JobDesc, Boolean.valueOf(n14424JobType), A14424JobType, Boolean.valueOf(n14484JobExec), A14484JobExec, Boolean.valueOf(n14450JobStat), A14450JobStat, Boolean.valueOf(n14451UsrCreat), A14451UsrCreat, Boolean.valueOf(n14488UsrSocket), A14488UsrSocket, Boolean.valueOf(n14452DtCreat), A14452DtCreat, Boolean.valueOf(n14453DtStart), A14453DtStart, Boolean.valueOf(n14454DtEnd), A14454DtEnd, Boolean.valueOf(n14455TotItem), Long.valueOf(A14455TotItem), Boolean.valueOf(n14456PrcItem), Long.valueOf(A14456PrcItem), Boolean.valueOf(n14457OkItem), Long.valueOf(A14457OkItem), Boolean.valueOf(n14458ErItem), Long.valueOf(A14458ErItem), Boolean.valueOf(n14459PrgPct), Short.valueOf(A14459PrgPct), Boolean.valueOf(n14460CurItem), A14460CurItem, Boolean.valueOf(n14437BasePath), A14437BasePath, Boolean.valueOf(n14462OutPath), A14462OutPath, Boolean.valueOf(n14463ZipPath), A14463ZipPath, Boolean.valueOf(n14464ZipUrl), A14464ZipUrl, Boolean.valueOf(n14465LastErr), A14465LastErr, Boolean.valueOf(n14466LockId), A14466LockId, Boolean.valueOf(n14467LockDt), A14467LockDt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
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
                        resetCaption1VJ0( ) ;
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
            load1VJ1907( ) ;
         }
         endLevel1VJ1907( ) ;
      }
      closeExtendedTableCursors1VJ1907( ) ;
   }

   public void update1VJ1907( )
   {
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VJ1907( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VJ1907( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VJ1907( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VJ9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n14485JobDesc), A14485JobDesc, Boolean.valueOf(n14424JobType), A14424JobType, Boolean.valueOf(n14484JobExec), A14484JobExec, Boolean.valueOf(n14450JobStat), A14450JobStat, Boolean.valueOf(n14451UsrCreat), A14451UsrCreat, Boolean.valueOf(n14488UsrSocket), A14488UsrSocket, Boolean.valueOf(n14452DtCreat), A14452DtCreat, Boolean.valueOf(n14453DtStart), A14453DtStart, Boolean.valueOf(n14454DtEnd), A14454DtEnd, Boolean.valueOf(n14455TotItem), Long.valueOf(A14455TotItem), Boolean.valueOf(n14456PrcItem), Long.valueOf(A14456PrcItem), Boolean.valueOf(n14457OkItem), Long.valueOf(A14457OkItem), Boolean.valueOf(n14458ErItem), Long.valueOf(A14458ErItem), Boolean.valueOf(n14459PrgPct), Short.valueOf(A14459PrgPct), Boolean.valueOf(n14460CurItem), A14460CurItem, Boolean.valueOf(n14437BasePath), A14437BasePath, Boolean.valueOf(n14462OutPath), A14462OutPath, Boolean.valueOf(n14463ZipPath), A14463ZipPath, Boolean.valueOf(n14464ZipUrl), A14464ZipUrl, Boolean.valueOf(n14465LastErr), A14465LastErr, Boolean.valueOf(n14466LockId), A14466LockId, Boolean.valueOf(n14467LockDt), A14467LockDt, A14423JobId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VJ1907( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VJ0( ) ;
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
         endLevel1VJ1907( ) ;
      }
      closeExtendedTableCursors1VJ1907( ) ;
   }

   public void deferredUpdate1VJ1907( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VJ1907( ) ;
         afterConfirm1VJ1907( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VJ1907( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VJ10 */
               pr_default.execute(8, new Object[] {A14423JobId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1907 == 0 )
                     {
                        initAll1VJ1907( ) ;
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
                     resetCaption1VJ0( ) ;
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
      sMode1907 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VJ1907( ) ;
      Gx_mode = sMode1907 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VJ1907( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01VJ11 */
         pr_default.execute(9, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOBPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T01VJ12 */
         pr_default.execute(10, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOBITEM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel1VJ1907( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.job");
         if ( AnyError == 0 )
         {
            confirmValues1VJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "asyncbatch.job");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VJ1907( )
   {
      /* Using cursor T01VJ13 */
      pr_default.execute(11);
      RcdFound1907 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1907 = (short)(1) ;
         A14423JobId = T01VJ13_A14423JobId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VJ1907( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1907 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1907 = (short)(1) ;
         A14423JobId = T01VJ13_A14423JobId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
      }
   }

   public void scanEnd1VJ1907( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1VJ1907( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VJ1907( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VJ1907( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VJ1907( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VJ1907( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VJ1907( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VJ1907( )
   {
      edtJobId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJobId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJobId_Enabled), 5, 0), true);
      edtJobDesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJobDesc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJobDesc_Enabled), 5, 0), true);
      edtJobType_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJobType_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJobType_Enabled), 5, 0), true);
      edtJobExec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJobExec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJobExec_Enabled), 5, 0), true);
      cmbJobStat.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbJobStat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbJobStat.getEnabled(), 5, 0), true);
      edtUsrCreat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsrCreat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsrCreat_Enabled), 5, 0), true);
      edtUsrSocket_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsrSocket_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsrSocket_Enabled), 5, 0), true);
      edtDtCreat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtCreat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtCreat_Enabled), 5, 0), true);
      edtDtStart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtStart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtStart_Enabled), 5, 0), true);
      edtDtEnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDtEnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDtEnd_Enabled), 5, 0), true);
      edtTotItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotItem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotItem_Enabled), 5, 0), true);
      edtPrcItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrcItem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrcItem_Enabled), 5, 0), true);
      edtOkItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOkItem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOkItem_Enabled), 5, 0), true);
      edtErItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErItem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErItem_Enabled), 5, 0), true);
      edtPrgPct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrgPct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrgPct_Enabled), 5, 0), true);
      edtCurItem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCurItem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCurItem_Enabled), 5, 0), true);
      edtBasePath_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBasePath_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBasePath_Enabled), 5, 0), true);
      edtOutPath_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOutPath_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOutPath_Enabled), 5, 0), true);
      edtZipPath_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtZipPath_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtZipPath_Enabled), 5, 0), true);
      edtZipUrl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtZipUrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtZipUrl_Enabled), 5, 0), true);
      edtLastErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLastErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLastErr_Enabled), 5, 0), true);
      edtLockId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLockId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLockId_Enabled), 5, 0), true);
      edtLockDt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLockDt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLockDt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VJ1907( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VJ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.asyncbatch.job", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14423JobId", Z14423JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "Z14485JobDesc", Z14485JobDesc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14424JobType", Z14424JobType);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14484JobExec", Z14484JobExec);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14450JobStat", Z14450JobStat);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14451UsrCreat", Z14451UsrCreat);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14488UsrSocket", Z14488UsrSocket);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14452DtCreat", localUtil.ttoc( Z14452DtCreat, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14453DtStart", localUtil.ttoc( Z14453DtStart, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14454DtEnd", localUtil.ttoc( Z14454DtEnd, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14455TotItem", GXutil.ltrim( localUtil.ntoc( Z14455TotItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14456PrcItem", GXutil.ltrim( localUtil.ntoc( Z14456PrcItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14457OkItem", GXutil.ltrim( localUtil.ntoc( Z14457OkItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14458ErItem", GXutil.ltrim( localUtil.ntoc( Z14458ErItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14459PrgPct", GXutil.ltrim( localUtil.ntoc( Z14459PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14460CurItem", Z14460CurItem);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14437BasePath", Z14437BasePath);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14462OutPath", Z14462OutPath);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14463ZipPath", Z14463ZipPath);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14464ZipUrl", Z14464ZipUrl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14466LockId", Z14466LockId);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14467LockDt", localUtil.ttoc( Z14467LockDt, 10, 8, 0, 0, "/", ":", " "));
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
      return formatLink("app.asyncbatch.job", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AsyncBatch.JOB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "JOB", "") ;
   }

   public void initializeNonKey1VJ1907( )
   {
      A14485JobDesc = "" ;
      n14485JobDesc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14485JobDesc", A14485JobDesc);
      A14424JobType = "" ;
      n14424JobType = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      A14484JobExec = "" ;
      n14484JobExec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14484JobExec", A14484JobExec);
      A14450JobStat = "" ;
      n14450JobStat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
      A14451UsrCreat = "" ;
      n14451UsrCreat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14451UsrCreat", A14451UsrCreat);
      A14488UsrSocket = "" ;
      n14488UsrSocket = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14488UsrSocket", A14488UsrSocket);
      A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      n14452DtCreat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14452DtCreat", localUtil.ttoc( A14452DtCreat, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      n14453DtStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14453DtStart", localUtil.ttoc( A14453DtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      n14454DtEnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14454DtEnd", localUtil.ttoc( A14454DtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14455TotItem = 0 ;
      n14455TotItem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14455TotItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14455TotItem), 10, 0));
      A14456PrcItem = 0 ;
      n14456PrcItem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14456PrcItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14456PrcItem), 10, 0));
      A14457OkItem = 0 ;
      n14457OkItem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14457OkItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14457OkItem), 10, 0));
      A14458ErItem = 0 ;
      n14458ErItem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14458ErItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14458ErItem), 10, 0));
      A14459PrgPct = (short)(0) ;
      n14459PrgPct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14459PrgPct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14459PrgPct), 3, 0));
      A14460CurItem = "" ;
      n14460CurItem = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14460CurItem", A14460CurItem);
      A14437BasePath = "" ;
      n14437BasePath = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14437BasePath", A14437BasePath);
      A14462OutPath = "" ;
      n14462OutPath = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14462OutPath", A14462OutPath);
      A14463ZipPath = "" ;
      n14463ZipPath = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14463ZipPath", A14463ZipPath);
      A14464ZipUrl = "" ;
      n14464ZipUrl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14464ZipUrl", A14464ZipUrl);
      A14465LastErr = "" ;
      n14465LastErr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14465LastErr", A14465LastErr);
      A14466LockId = "" ;
      n14466LockId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14466LockId", A14466LockId);
      A14467LockDt = GXutil.resetTime( GXutil.nullDate() );
      n14467LockDt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14467LockDt", localUtil.ttoc( A14467LockDt, 10, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z14485JobDesc = "" ;
      Z14424JobType = "" ;
      Z14484JobExec = "" ;
      Z14450JobStat = "" ;
      Z14451UsrCreat = "" ;
      Z14488UsrSocket = "" ;
      Z14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      Z14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14455TotItem = 0 ;
      Z14456PrcItem = 0 ;
      Z14457OkItem = 0 ;
      Z14458ErItem = 0 ;
      Z14459PrgPct = (short)(0) ;
      Z14460CurItem = "" ;
      Z14437BasePath = "" ;
      Z14462OutPath = "" ;
      Z14463ZipPath = "" ;
      Z14464ZipUrl = "" ;
      Z14466LockId = "" ;
      Z14467LockDt = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1VJ1907( )
   {
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
      initializeNonKey1VJ1907( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266291352469", true, true);
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
      httpContext.AddJavascriptSource("asyncbatch/job.js", "?20266291352469", false, true);
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
      edtJobId_Internalname = "JOBID" ;
      edtJobDesc_Internalname = "JOBDESC" ;
      edtJobType_Internalname = "JOBTYPE" ;
      edtJobExec_Internalname = "JOBEXEC" ;
      cmbJobStat.setInternalname( "JOBSTAT" );
      edtUsrCreat_Internalname = "USRCREAT" ;
      edtUsrSocket_Internalname = "USRSOCKET" ;
      edtDtCreat_Internalname = "DTCREAT" ;
      edtDtStart_Internalname = "DTSTART" ;
      edtDtEnd_Internalname = "DTEND" ;
      edtTotItem_Internalname = "TOTITEM" ;
      edtPrcItem_Internalname = "PRCITEM" ;
      edtOkItem_Internalname = "OKITEM" ;
      edtErItem_Internalname = "ERITEM" ;
      edtPrgPct_Internalname = "PRGPCT" ;
      edtCurItem_Internalname = "CURITEM" ;
      edtBasePath_Internalname = "BASEPATH" ;
      edtOutPath_Internalname = "OUTPATH" ;
      edtZipPath_Internalname = "ZIPPATH" ;
      edtZipUrl_Internalname = "ZIPURL" ;
      edtLastErr_Internalname = "LASTERR" ;
      edtLockId_Internalname = "LOCKID" ;
      edtLockDt_Internalname = "LOCKDT" ;
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
      Form.setCaption( httpContext.getMessage( "JOB", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtLockDt_Jsonclick = "" ;
      edtLockDt_Enabled = 1 ;
      edtLockId_Jsonclick = "" ;
      edtLockId_Enabled = 1 ;
      edtLastErr_Enabled = 1 ;
      edtZipUrl_Enabled = 1 ;
      edtZipPath_Enabled = 1 ;
      edtOutPath_Enabled = 1 ;
      edtBasePath_Enabled = 1 ;
      edtCurItem_Jsonclick = "" ;
      edtCurItem_Enabled = 1 ;
      edtPrgPct_Jsonclick = "" ;
      edtPrgPct_Enabled = 1 ;
      edtErItem_Jsonclick = "" ;
      edtErItem_Enabled = 1 ;
      edtOkItem_Jsonclick = "" ;
      edtOkItem_Enabled = 1 ;
      edtPrcItem_Jsonclick = "" ;
      edtPrcItem_Enabled = 1 ;
      edtTotItem_Jsonclick = "" ;
      edtTotItem_Enabled = 1 ;
      edtDtEnd_Jsonclick = "" ;
      edtDtEnd_Enabled = 1 ;
      edtDtStart_Jsonclick = "" ;
      edtDtStart_Enabled = 1 ;
      edtDtCreat_Jsonclick = "" ;
      edtDtCreat_Enabled = 1 ;
      edtUsrSocket_Jsonclick = "" ;
      edtUsrSocket_Enabled = 1 ;
      edtUsrCreat_Jsonclick = "" ;
      edtUsrCreat_Enabled = 1 ;
      cmbJobStat.setJsonclick( "" );
      cmbJobStat.setEnabled( 1 );
      edtJobExec_Jsonclick = "" ;
      edtJobExec_Enabled = 1 ;
      edtJobType_Jsonclick = "" ;
      edtJobType_Enabled = 1 ;
      edtJobDesc_Jsonclick = "" ;
      edtJobDesc_Enabled = 1 ;
      edtJobId_Jsonclick = "" ;
      edtJobId_Enabled = 1 ;
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
      cmbJobStat.setName( "JOBSTAT" );
      cmbJobStat.setWebtags( "" );
      cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
      cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
      cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
      cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
      cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
      if ( cmbJobStat.getItemCount() > 0 )
      {
         A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
         n14450JobStat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtJobDesc_Internalname ;
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

   public void valid_Jobid( )
   {
      n14450JobStat = false ;
      A14450JobStat = cmbJobStat.getValue() ;
      n14450JobStat = false ;
      cmbJobStat.setValue( A14450JobStat );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbJobStat.getItemCount() > 0 )
      {
         A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
         n14450JobStat = false ;
         cmbJobStat.setValue( A14450JobStat );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14485JobDesc", A14485JobDesc);
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      httpContext.ajax_rsp_assign_attri("", false, "A14484JobExec", A14484JobExec);
      httpContext.ajax_rsp_assign_attri("", false, "A14450JobStat", A14450JobStat);
      cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
      httpContext.ajax_rsp_assign_prop("", false, cmbJobStat.getInternalname(), "Values", cmbJobStat.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A14451UsrCreat", A14451UsrCreat);
      httpContext.ajax_rsp_assign_attri("", false, "A14488UsrSocket", A14488UsrSocket);
      httpContext.ajax_rsp_assign_attri("", false, "A14452DtCreat", localUtil.ttoc( A14452DtCreat, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14453DtStart", localUtil.ttoc( A14453DtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14454DtEnd", localUtil.ttoc( A14454DtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14455TotItem", GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14456PrcItem", GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14457OkItem", GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14458ErItem", GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14459PrgPct", GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14460CurItem", A14460CurItem);
      httpContext.ajax_rsp_assign_attri("", false, "A14437BasePath", A14437BasePath);
      httpContext.ajax_rsp_assign_attri("", false, "A14462OutPath", A14462OutPath);
      httpContext.ajax_rsp_assign_attri("", false, "A14463ZipPath", A14463ZipPath);
      httpContext.ajax_rsp_assign_attri("", false, "A14464ZipUrl", A14464ZipUrl);
      httpContext.ajax_rsp_assign_attri("", false, "A14465LastErr", A14465LastErr);
      httpContext.ajax_rsp_assign_attri("", false, "A14466LockId", A14466LockId);
      httpContext.ajax_rsp_assign_attri("", false, "A14467LockDt", localUtil.ttoc( A14467LockDt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14423JobId", Z14423JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "Z14485JobDesc", Z14485JobDesc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14424JobType", Z14424JobType);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14484JobExec", Z14484JobExec);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14450JobStat", Z14450JobStat);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14451UsrCreat", Z14451UsrCreat);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14488UsrSocket", Z14488UsrSocket);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14452DtCreat", localUtil.ttoc( Z14452DtCreat, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14453DtStart", localUtil.ttoc( Z14453DtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14454DtEnd", localUtil.ttoc( Z14454DtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14455TotItem", GXutil.ltrim( localUtil.ntoc( Z14455TotItem, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14456PrcItem", GXutil.ltrim( localUtil.ntoc( Z14456PrcItem, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14457OkItem", GXutil.ltrim( localUtil.ntoc( Z14457OkItem, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14458ErItem", GXutil.ltrim( localUtil.ntoc( Z14458ErItem, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14459PrgPct", GXutil.ltrim( localUtil.ntoc( Z14459PrgPct, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14460CurItem", Z14460CurItem);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14437BasePath", Z14437BasePath);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14462OutPath", Z14462OutPath);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14463ZipPath", Z14463ZipPath);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14464ZipUrl", Z14464ZipUrl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14465LastErr", Z14465LastErr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14466LockId", Z14466LockId);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14467LockDt", localUtil.ttoc( Z14467LockDt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      setEventMetadata("VALID_JOBID","{handler:'valid_Jobid',iparms:[{av:'cmbJobStat'},{av:'A14450JobStat',fld:'JOBSTAT',pic:''},{av:'A14423JobId',fld:'JOBID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_JOBID",",oparms:[{av:'A14485JobDesc',fld:'JOBDESC',pic:''},{av:'A14424JobType',fld:'JOBTYPE',pic:''},{av:'A14484JobExec',fld:'JOBEXEC',pic:''},{av:'cmbJobStat'},{av:'A14450JobStat',fld:'JOBSTAT',pic:''},{av:'A14451UsrCreat',fld:'USRCREAT',pic:''},{av:'A14488UsrSocket',fld:'USRSOCKET',pic:''},{av:'A14452DtCreat',fld:'DTCREAT',pic:'99/99/99 99:99'},{av:'A14453DtStart',fld:'DTSTART',pic:'99/99/99 99:99'},{av:'A14454DtEnd',fld:'DTEND',pic:'99/99/99 99:99'},{av:'A14455TotItem',fld:'TOTITEM',pic:'ZZZZZZZZZ9'},{av:'A14456PrcItem',fld:'PRCITEM',pic:'ZZZZZZZZZ9'},{av:'A14457OkItem',fld:'OKITEM',pic:'ZZZZZZZZZ9'},{av:'A14458ErItem',fld:'ERITEM',pic:'ZZZZZZZZZ9'},{av:'A14459PrgPct',fld:'PRGPCT',pic:'ZZ9'},{av:'A14460CurItem',fld:'CURITEM',pic:''},{av:'A14437BasePath',fld:'BASEPATH',pic:''},{av:'A14462OutPath',fld:'OUTPATH',pic:''},{av:'A14463ZipPath',fld:'ZIPPATH',pic:''},{av:'A14464ZipUrl',fld:'ZIPURL',pic:''},{av:'A14465LastErr',fld:'LASTERR',pic:''},{av:'A14466LockId',fld:'LOCKID',pic:''},{av:'A14467LockDt',fld:'LOCKDT',pic:'99/99/9999 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14423JobId'},{av:'Z14485JobDesc'},{av:'Z14424JobType'},{av:'Z14484JobExec'},{av:'Z14450JobStat'},{av:'Z14451UsrCreat'},{av:'Z14488UsrSocket'},{av:'Z14452DtCreat'},{av:'Z14453DtStart'},{av:'Z14454DtEnd'},{av:'Z14455TotItem'},{av:'Z14456PrcItem'},{av:'Z14457OkItem'},{av:'Z14458ErItem'},{av:'Z14459PrgPct'},{av:'Z14460CurItem'},{av:'Z14437BasePath'},{av:'Z14462OutPath'},{av:'Z14463ZipPath'},{av:'Z14464ZipUrl'},{av:'Z14465LastErr'},{av:'Z14466LockId'},{av:'Z14467LockDt'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_JOBSTAT","{handler:'valid_Jobstat',iparms:[]");
      setEventMetadata("VALID_JOBSTAT",",oparms:[]}");
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
      Z14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Z14485JobDesc = "" ;
      Z14424JobType = "" ;
      Z14484JobExec = "" ;
      Z14450JobStat = "" ;
      Z14451UsrCreat = "" ;
      Z14488UsrSocket = "" ;
      Z14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      Z14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14460CurItem = "" ;
      Z14437BasePath = "" ;
      Z14462OutPath = "" ;
      Z14463ZipPath = "" ;
      Z14464ZipUrl = "" ;
      Z14466LockId = "" ;
      Z14467LockDt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A14450JobStat = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14485JobDesc = "" ;
      A14424JobType = "" ;
      A14484JobExec = "" ;
      A14451UsrCreat = "" ;
      A14488UsrSocket = "" ;
      A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      A14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      A14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14460CurItem = "" ;
      A14437BasePath = "" ;
      A14462OutPath = "" ;
      A14463ZipPath = "" ;
      A14464ZipUrl = "" ;
      A14465LastErr = "" ;
      A14466LockId = "" ;
      A14467LockDt = GXutil.resetTime( GXutil.nullDate() );
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
      Z14465LastErr = "" ;
      T01VJ4_A14465LastErr = new String[] {""} ;
      T01VJ4_n14465LastErr = new boolean[] {false} ;
      T01VJ4_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ4_A14485JobDesc = new String[] {""} ;
      T01VJ4_n14485JobDesc = new boolean[] {false} ;
      T01VJ4_A14424JobType = new String[] {""} ;
      T01VJ4_n14424JobType = new boolean[] {false} ;
      T01VJ4_A14484JobExec = new String[] {""} ;
      T01VJ4_n14484JobExec = new boolean[] {false} ;
      T01VJ4_A14450JobStat = new String[] {""} ;
      T01VJ4_n14450JobStat = new boolean[] {false} ;
      T01VJ4_A14451UsrCreat = new String[] {""} ;
      T01VJ4_n14451UsrCreat = new boolean[] {false} ;
      T01VJ4_A14488UsrSocket = new String[] {""} ;
      T01VJ4_n14488UsrSocket = new boolean[] {false} ;
      T01VJ4_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ4_n14452DtCreat = new boolean[] {false} ;
      T01VJ4_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ4_n14453DtStart = new boolean[] {false} ;
      T01VJ4_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ4_n14454DtEnd = new boolean[] {false} ;
      T01VJ4_A14455TotItem = new long[1] ;
      T01VJ4_n14455TotItem = new boolean[] {false} ;
      T01VJ4_A14456PrcItem = new long[1] ;
      T01VJ4_n14456PrcItem = new boolean[] {false} ;
      T01VJ4_A14457OkItem = new long[1] ;
      T01VJ4_n14457OkItem = new boolean[] {false} ;
      T01VJ4_A14458ErItem = new long[1] ;
      T01VJ4_n14458ErItem = new boolean[] {false} ;
      T01VJ4_A14459PrgPct = new short[1] ;
      T01VJ4_n14459PrgPct = new boolean[] {false} ;
      T01VJ4_A14460CurItem = new String[] {""} ;
      T01VJ4_n14460CurItem = new boolean[] {false} ;
      T01VJ4_A14437BasePath = new String[] {""} ;
      T01VJ4_n14437BasePath = new boolean[] {false} ;
      T01VJ4_A14462OutPath = new String[] {""} ;
      T01VJ4_n14462OutPath = new boolean[] {false} ;
      T01VJ4_A14463ZipPath = new String[] {""} ;
      T01VJ4_n14463ZipPath = new boolean[] {false} ;
      T01VJ4_A14464ZipUrl = new String[] {""} ;
      T01VJ4_n14464ZipUrl = new boolean[] {false} ;
      T01VJ4_A14466LockId = new String[] {""} ;
      T01VJ4_n14466LockId = new boolean[] {false} ;
      T01VJ4_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ4_n14467LockDt = new boolean[] {false} ;
      T01VJ5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ3_A14465LastErr = new String[] {""} ;
      T01VJ3_n14465LastErr = new boolean[] {false} ;
      T01VJ3_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ3_A14485JobDesc = new String[] {""} ;
      T01VJ3_n14485JobDesc = new boolean[] {false} ;
      T01VJ3_A14424JobType = new String[] {""} ;
      T01VJ3_n14424JobType = new boolean[] {false} ;
      T01VJ3_A14484JobExec = new String[] {""} ;
      T01VJ3_n14484JobExec = new boolean[] {false} ;
      T01VJ3_A14450JobStat = new String[] {""} ;
      T01VJ3_n14450JobStat = new boolean[] {false} ;
      T01VJ3_A14451UsrCreat = new String[] {""} ;
      T01VJ3_n14451UsrCreat = new boolean[] {false} ;
      T01VJ3_A14488UsrSocket = new String[] {""} ;
      T01VJ3_n14488UsrSocket = new boolean[] {false} ;
      T01VJ3_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ3_n14452DtCreat = new boolean[] {false} ;
      T01VJ3_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ3_n14453DtStart = new boolean[] {false} ;
      T01VJ3_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ3_n14454DtEnd = new boolean[] {false} ;
      T01VJ3_A14455TotItem = new long[1] ;
      T01VJ3_n14455TotItem = new boolean[] {false} ;
      T01VJ3_A14456PrcItem = new long[1] ;
      T01VJ3_n14456PrcItem = new boolean[] {false} ;
      T01VJ3_A14457OkItem = new long[1] ;
      T01VJ3_n14457OkItem = new boolean[] {false} ;
      T01VJ3_A14458ErItem = new long[1] ;
      T01VJ3_n14458ErItem = new boolean[] {false} ;
      T01VJ3_A14459PrgPct = new short[1] ;
      T01VJ3_n14459PrgPct = new boolean[] {false} ;
      T01VJ3_A14460CurItem = new String[] {""} ;
      T01VJ3_n14460CurItem = new boolean[] {false} ;
      T01VJ3_A14437BasePath = new String[] {""} ;
      T01VJ3_n14437BasePath = new boolean[] {false} ;
      T01VJ3_A14462OutPath = new String[] {""} ;
      T01VJ3_n14462OutPath = new boolean[] {false} ;
      T01VJ3_A14463ZipPath = new String[] {""} ;
      T01VJ3_n14463ZipPath = new boolean[] {false} ;
      T01VJ3_A14464ZipUrl = new String[] {""} ;
      T01VJ3_n14464ZipUrl = new boolean[] {false} ;
      T01VJ3_A14466LockId = new String[] {""} ;
      T01VJ3_n14466LockId = new boolean[] {false} ;
      T01VJ3_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ3_n14467LockDt = new boolean[] {false} ;
      sMode1907 = "" ;
      T01VJ6_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ7_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ2_A14465LastErr = new String[] {""} ;
      T01VJ2_n14465LastErr = new boolean[] {false} ;
      T01VJ2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ2_A14485JobDesc = new String[] {""} ;
      T01VJ2_n14485JobDesc = new boolean[] {false} ;
      T01VJ2_A14424JobType = new String[] {""} ;
      T01VJ2_n14424JobType = new boolean[] {false} ;
      T01VJ2_A14484JobExec = new String[] {""} ;
      T01VJ2_n14484JobExec = new boolean[] {false} ;
      T01VJ2_A14450JobStat = new String[] {""} ;
      T01VJ2_n14450JobStat = new boolean[] {false} ;
      T01VJ2_A14451UsrCreat = new String[] {""} ;
      T01VJ2_n14451UsrCreat = new boolean[] {false} ;
      T01VJ2_A14488UsrSocket = new String[] {""} ;
      T01VJ2_n14488UsrSocket = new boolean[] {false} ;
      T01VJ2_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ2_n14452DtCreat = new boolean[] {false} ;
      T01VJ2_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ2_n14453DtStart = new boolean[] {false} ;
      T01VJ2_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ2_n14454DtEnd = new boolean[] {false} ;
      T01VJ2_A14455TotItem = new long[1] ;
      T01VJ2_n14455TotItem = new boolean[] {false} ;
      T01VJ2_A14456PrcItem = new long[1] ;
      T01VJ2_n14456PrcItem = new boolean[] {false} ;
      T01VJ2_A14457OkItem = new long[1] ;
      T01VJ2_n14457OkItem = new boolean[] {false} ;
      T01VJ2_A14458ErItem = new long[1] ;
      T01VJ2_n14458ErItem = new boolean[] {false} ;
      T01VJ2_A14459PrgPct = new short[1] ;
      T01VJ2_n14459PrgPct = new boolean[] {false} ;
      T01VJ2_A14460CurItem = new String[] {""} ;
      T01VJ2_n14460CurItem = new boolean[] {false} ;
      T01VJ2_A14437BasePath = new String[] {""} ;
      T01VJ2_n14437BasePath = new boolean[] {false} ;
      T01VJ2_A14462OutPath = new String[] {""} ;
      T01VJ2_n14462OutPath = new boolean[] {false} ;
      T01VJ2_A14463ZipPath = new String[] {""} ;
      T01VJ2_n14463ZipPath = new boolean[] {false} ;
      T01VJ2_A14464ZipUrl = new String[] {""} ;
      T01VJ2_n14464ZipUrl = new boolean[] {false} ;
      T01VJ2_A14466LockId = new String[] {""} ;
      T01VJ2_n14466LockId = new boolean[] {false} ;
      T01VJ2_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      T01VJ2_n14467LockDt = new boolean[] {false} ;
      T01VJ11_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ11_A14478ParKey = new String[] {""} ;
      T01VJ12_A14468ItmId = new long[1] ;
      T01VJ12_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VJ13_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      ZZ14485JobDesc = "" ;
      ZZ14424JobType = "" ;
      ZZ14484JobExec = "" ;
      ZZ14450JobStat = "" ;
      ZZ14451UsrCreat = "" ;
      ZZ14488UsrSocket = "" ;
      ZZ14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      ZZ14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      ZZ14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      ZZ14460CurItem = "" ;
      ZZ14437BasePath = "" ;
      ZZ14462OutPath = "" ;
      ZZ14463ZipPath = "" ;
      ZZ14464ZipUrl = "" ;
      ZZ14465LastErr = "" ;
      ZZ14466LockId = "" ;
      ZZ14467LockDt = GXutil.resetTime( GXutil.nullDate() );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job__default(),
         new Object[] {
             new Object[] {
            T01VJ2_A14465LastErr, T01VJ2_n14465LastErr, T01VJ2_A14423JobId, T01VJ2_A14485JobDesc, T01VJ2_n14485JobDesc, T01VJ2_A14424JobType, T01VJ2_n14424JobType, T01VJ2_A14484JobExec, T01VJ2_n14484JobExec, T01VJ2_A14450JobStat,
            T01VJ2_n14450JobStat, T01VJ2_A14451UsrCreat, T01VJ2_n14451UsrCreat, T01VJ2_A14488UsrSocket, T01VJ2_n14488UsrSocket, T01VJ2_A14452DtCreat, T01VJ2_n14452DtCreat, T01VJ2_A14453DtStart, T01VJ2_n14453DtStart, T01VJ2_A14454DtEnd,
            T01VJ2_n14454DtEnd, T01VJ2_A14455TotItem, T01VJ2_n14455TotItem, T01VJ2_A14456PrcItem, T01VJ2_n14456PrcItem, T01VJ2_A14457OkItem, T01VJ2_n14457OkItem, T01VJ2_A14458ErItem, T01VJ2_n14458ErItem, T01VJ2_A14459PrgPct,
            T01VJ2_n14459PrgPct, T01VJ2_A14460CurItem, T01VJ2_n14460CurItem, T01VJ2_A14437BasePath, T01VJ2_n14437BasePath, T01VJ2_A14462OutPath, T01VJ2_n14462OutPath, T01VJ2_A14463ZipPath, T01VJ2_n14463ZipPath, T01VJ2_A14464ZipUrl,
            T01VJ2_n14464ZipUrl, T01VJ2_A14466LockId, T01VJ2_n14466LockId, T01VJ2_A14467LockDt, T01VJ2_n14467LockDt
            }
            , new Object[] {
            T01VJ3_A14465LastErr, T01VJ3_n14465LastErr, T01VJ3_A14423JobId, T01VJ3_A14485JobDesc, T01VJ3_n14485JobDesc, T01VJ3_A14424JobType, T01VJ3_n14424JobType, T01VJ3_A14484JobExec, T01VJ3_n14484JobExec, T01VJ3_A14450JobStat,
            T01VJ3_n14450JobStat, T01VJ3_A14451UsrCreat, T01VJ3_n14451UsrCreat, T01VJ3_A14488UsrSocket, T01VJ3_n14488UsrSocket, T01VJ3_A14452DtCreat, T01VJ3_n14452DtCreat, T01VJ3_A14453DtStart, T01VJ3_n14453DtStart, T01VJ3_A14454DtEnd,
            T01VJ3_n14454DtEnd, T01VJ3_A14455TotItem, T01VJ3_n14455TotItem, T01VJ3_A14456PrcItem, T01VJ3_n14456PrcItem, T01VJ3_A14457OkItem, T01VJ3_n14457OkItem, T01VJ3_A14458ErItem, T01VJ3_n14458ErItem, T01VJ3_A14459PrgPct,
            T01VJ3_n14459PrgPct, T01VJ3_A14460CurItem, T01VJ3_n14460CurItem, T01VJ3_A14437BasePath, T01VJ3_n14437BasePath, T01VJ3_A14462OutPath, T01VJ3_n14462OutPath, T01VJ3_A14463ZipPath, T01VJ3_n14463ZipPath, T01VJ3_A14464ZipUrl,
            T01VJ3_n14464ZipUrl, T01VJ3_A14466LockId, T01VJ3_n14466LockId, T01VJ3_A14467LockDt, T01VJ3_n14467LockDt
            }
            , new Object[] {
            T01VJ4_A14465LastErr, T01VJ4_n14465LastErr, T01VJ4_A14423JobId, T01VJ4_A14485JobDesc, T01VJ4_n14485JobDesc, T01VJ4_A14424JobType, T01VJ4_n14424JobType, T01VJ4_A14484JobExec, T01VJ4_n14484JobExec, T01VJ4_A14450JobStat,
            T01VJ4_n14450JobStat, T01VJ4_A14451UsrCreat, T01VJ4_n14451UsrCreat, T01VJ4_A14488UsrSocket, T01VJ4_n14488UsrSocket, T01VJ4_A14452DtCreat, T01VJ4_n14452DtCreat, T01VJ4_A14453DtStart, T01VJ4_n14453DtStart, T01VJ4_A14454DtEnd,
            T01VJ4_n14454DtEnd, T01VJ4_A14455TotItem, T01VJ4_n14455TotItem, T01VJ4_A14456PrcItem, T01VJ4_n14456PrcItem, T01VJ4_A14457OkItem, T01VJ4_n14457OkItem, T01VJ4_A14458ErItem, T01VJ4_n14458ErItem, T01VJ4_A14459PrgPct,
            T01VJ4_n14459PrgPct, T01VJ4_A14460CurItem, T01VJ4_n14460CurItem, T01VJ4_A14437BasePath, T01VJ4_n14437BasePath, T01VJ4_A14462OutPath, T01VJ4_n14462OutPath, T01VJ4_A14463ZipPath, T01VJ4_n14463ZipPath, T01VJ4_A14464ZipUrl,
            T01VJ4_n14464ZipUrl, T01VJ4_A14466LockId, T01VJ4_n14466LockId, T01VJ4_A14467LockDt, T01VJ4_n14467LockDt
            }
            , new Object[] {
            T01VJ5_A14423JobId
            }
            , new Object[] {
            T01VJ6_A14423JobId
            }
            , new Object[] {
            T01VJ7_A14423JobId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VJ11_A14423JobId, T01VJ11_A14478ParKey
            }
            , new Object[] {
            T01VJ12_A14468ItmId, T01VJ12_A14423JobId
            }
            , new Object[] {
            T01VJ13_A14423JobId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14459PrgPct ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14459PrgPct ;
   private short RcdFound1907 ;
   private short nIsDirty_1907 ;
   private short ZZ14459PrgPct ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtJobId_Enabled ;
   private int edtJobDesc_Enabled ;
   private int edtJobType_Enabled ;
   private int edtJobExec_Enabled ;
   private int edtUsrCreat_Enabled ;
   private int edtUsrSocket_Enabled ;
   private int edtDtCreat_Enabled ;
   private int edtDtStart_Enabled ;
   private int edtDtEnd_Enabled ;
   private int edtTotItem_Enabled ;
   private int edtPrcItem_Enabled ;
   private int edtOkItem_Enabled ;
   private int edtErItem_Enabled ;
   private int edtPrgPct_Enabled ;
   private int edtCurItem_Enabled ;
   private int edtBasePath_Enabled ;
   private int edtOutPath_Enabled ;
   private int edtZipPath_Enabled ;
   private int edtZipUrl_Enabled ;
   private int edtLastErr_Enabled ;
   private int edtLockId_Enabled ;
   private int edtLockDt_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14455TotItem ;
   private long Z14456PrcItem ;
   private long Z14457OkItem ;
   private long Z14458ErItem ;
   private long A14455TotItem ;
   private long A14456PrcItem ;
   private long A14457OkItem ;
   private long A14458ErItem ;
   private long ZZ14455TotItem ;
   private long ZZ14456PrcItem ;
   private long ZZ14457OkItem ;
   private long ZZ14458ErItem ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtJobId_Internalname ;
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
   private String edtJobId_Jsonclick ;
   private String edtJobDesc_Internalname ;
   private String edtJobDesc_Jsonclick ;
   private String edtJobType_Internalname ;
   private String edtJobType_Jsonclick ;
   private String edtJobExec_Internalname ;
   private String edtJobExec_Jsonclick ;
   private String edtUsrCreat_Internalname ;
   private String edtUsrCreat_Jsonclick ;
   private String edtUsrSocket_Internalname ;
   private String edtUsrSocket_Jsonclick ;
   private String edtDtCreat_Internalname ;
   private String edtDtCreat_Jsonclick ;
   private String edtDtStart_Internalname ;
   private String edtDtStart_Jsonclick ;
   private String edtDtEnd_Internalname ;
   private String edtDtEnd_Jsonclick ;
   private String edtTotItem_Internalname ;
   private String edtTotItem_Jsonclick ;
   private String edtPrcItem_Internalname ;
   private String edtPrcItem_Jsonclick ;
   private String edtOkItem_Internalname ;
   private String edtOkItem_Jsonclick ;
   private String edtErItem_Internalname ;
   private String edtErItem_Jsonclick ;
   private String edtPrgPct_Internalname ;
   private String edtPrgPct_Jsonclick ;
   private String edtCurItem_Internalname ;
   private String edtCurItem_Jsonclick ;
   private String edtBasePath_Internalname ;
   private String edtOutPath_Internalname ;
   private String edtZipPath_Internalname ;
   private String edtZipUrl_Internalname ;
   private String edtLastErr_Internalname ;
   private String edtLockId_Internalname ;
   private String edtLockId_Jsonclick ;
   private String edtLockDt_Internalname ;
   private String edtLockDt_Jsonclick ;
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
   private String sMode1907 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14452DtCreat ;
   private java.util.Date Z14453DtStart ;
   private java.util.Date Z14454DtEnd ;
   private java.util.Date Z14467LockDt ;
   private java.util.Date A14452DtCreat ;
   private java.util.Date A14453DtStart ;
   private java.util.Date A14454DtEnd ;
   private java.util.Date A14467LockDt ;
   private java.util.Date ZZ14452DtCreat ;
   private java.util.Date ZZ14453DtStart ;
   private java.util.Date ZZ14454DtEnd ;
   private java.util.Date ZZ14467LockDt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14450JobStat ;
   private boolean n14485JobDesc ;
   private boolean n14424JobType ;
   private boolean n14484JobExec ;
   private boolean n14451UsrCreat ;
   private boolean n14488UsrSocket ;
   private boolean n14452DtCreat ;
   private boolean n14453DtStart ;
   private boolean n14454DtEnd ;
   private boolean n14455TotItem ;
   private boolean n14456PrcItem ;
   private boolean n14457OkItem ;
   private boolean n14458ErItem ;
   private boolean n14459PrgPct ;
   private boolean n14460CurItem ;
   private boolean n14437BasePath ;
   private boolean n14462OutPath ;
   private boolean n14463ZipPath ;
   private boolean n14464ZipUrl ;
   private boolean n14465LastErr ;
   private boolean n14466LockId ;
   private boolean n14467LockDt ;
   private boolean Gx_longc ;
   private String A14465LastErr ;
   private String Z14465LastErr ;
   private String ZZ14465LastErr ;
   private String Z14485JobDesc ;
   private String Z14424JobType ;
   private String Z14484JobExec ;
   private String Z14450JobStat ;
   private String Z14451UsrCreat ;
   private String Z14488UsrSocket ;
   private String Z14460CurItem ;
   private String Z14437BasePath ;
   private String Z14462OutPath ;
   private String Z14463ZipPath ;
   private String Z14464ZipUrl ;
   private String Z14466LockId ;
   private String A14450JobStat ;
   private String A14485JobDesc ;
   private String A14424JobType ;
   private String A14484JobExec ;
   private String A14451UsrCreat ;
   private String A14488UsrSocket ;
   private String A14460CurItem ;
   private String A14437BasePath ;
   private String A14462OutPath ;
   private String A14463ZipPath ;
   private String A14464ZipUrl ;
   private String A14466LockId ;
   private String ZZ14485JobDesc ;
   private String ZZ14424JobType ;
   private String ZZ14484JobExec ;
   private String ZZ14450JobStat ;
   private String ZZ14451UsrCreat ;
   private String ZZ14488UsrSocket ;
   private String ZZ14460CurItem ;
   private String ZZ14437BasePath ;
   private String ZZ14462OutPath ;
   private String ZZ14463ZipPath ;
   private String ZZ14464ZipUrl ;
   private String ZZ14466LockId ;
   private java.util.UUID Z14423JobId ;
   private java.util.UUID A14423JobId ;
   private java.util.UUID ZZ14423JobId ;
   private HTMLChoice cmbJobStat ;
   private IDataStoreProvider pr_default ;
   private String[] T01VJ4_A14465LastErr ;
   private boolean[] T01VJ4_n14465LastErr ;
   private java.util.UUID[] T01VJ4_A14423JobId ;
   private String[] T01VJ4_A14485JobDesc ;
   private boolean[] T01VJ4_n14485JobDesc ;
   private String[] T01VJ4_A14424JobType ;
   private boolean[] T01VJ4_n14424JobType ;
   private String[] T01VJ4_A14484JobExec ;
   private boolean[] T01VJ4_n14484JobExec ;
   private String[] T01VJ4_A14450JobStat ;
   private boolean[] T01VJ4_n14450JobStat ;
   private String[] T01VJ4_A14451UsrCreat ;
   private boolean[] T01VJ4_n14451UsrCreat ;
   private String[] T01VJ4_A14488UsrSocket ;
   private boolean[] T01VJ4_n14488UsrSocket ;
   private java.util.Date[] T01VJ4_A14452DtCreat ;
   private boolean[] T01VJ4_n14452DtCreat ;
   private java.util.Date[] T01VJ4_A14453DtStart ;
   private boolean[] T01VJ4_n14453DtStart ;
   private java.util.Date[] T01VJ4_A14454DtEnd ;
   private boolean[] T01VJ4_n14454DtEnd ;
   private long[] T01VJ4_A14455TotItem ;
   private boolean[] T01VJ4_n14455TotItem ;
   private long[] T01VJ4_A14456PrcItem ;
   private boolean[] T01VJ4_n14456PrcItem ;
   private long[] T01VJ4_A14457OkItem ;
   private boolean[] T01VJ4_n14457OkItem ;
   private long[] T01VJ4_A14458ErItem ;
   private boolean[] T01VJ4_n14458ErItem ;
   private short[] T01VJ4_A14459PrgPct ;
   private boolean[] T01VJ4_n14459PrgPct ;
   private String[] T01VJ4_A14460CurItem ;
   private boolean[] T01VJ4_n14460CurItem ;
   private String[] T01VJ4_A14437BasePath ;
   private boolean[] T01VJ4_n14437BasePath ;
   private String[] T01VJ4_A14462OutPath ;
   private boolean[] T01VJ4_n14462OutPath ;
   private String[] T01VJ4_A14463ZipPath ;
   private boolean[] T01VJ4_n14463ZipPath ;
   private String[] T01VJ4_A14464ZipUrl ;
   private boolean[] T01VJ4_n14464ZipUrl ;
   private String[] T01VJ4_A14466LockId ;
   private boolean[] T01VJ4_n14466LockId ;
   private java.util.Date[] T01VJ4_A14467LockDt ;
   private boolean[] T01VJ4_n14467LockDt ;
   private java.util.UUID[] T01VJ5_A14423JobId ;
   private String[] T01VJ3_A14465LastErr ;
   private boolean[] T01VJ3_n14465LastErr ;
   private java.util.UUID[] T01VJ3_A14423JobId ;
   private String[] T01VJ3_A14485JobDesc ;
   private boolean[] T01VJ3_n14485JobDesc ;
   private String[] T01VJ3_A14424JobType ;
   private boolean[] T01VJ3_n14424JobType ;
   private String[] T01VJ3_A14484JobExec ;
   private boolean[] T01VJ3_n14484JobExec ;
   private String[] T01VJ3_A14450JobStat ;
   private boolean[] T01VJ3_n14450JobStat ;
   private String[] T01VJ3_A14451UsrCreat ;
   private boolean[] T01VJ3_n14451UsrCreat ;
   private String[] T01VJ3_A14488UsrSocket ;
   private boolean[] T01VJ3_n14488UsrSocket ;
   private java.util.Date[] T01VJ3_A14452DtCreat ;
   private boolean[] T01VJ3_n14452DtCreat ;
   private java.util.Date[] T01VJ3_A14453DtStart ;
   private boolean[] T01VJ3_n14453DtStart ;
   private java.util.Date[] T01VJ3_A14454DtEnd ;
   private boolean[] T01VJ3_n14454DtEnd ;
   private long[] T01VJ3_A14455TotItem ;
   private boolean[] T01VJ3_n14455TotItem ;
   private long[] T01VJ3_A14456PrcItem ;
   private boolean[] T01VJ3_n14456PrcItem ;
   private long[] T01VJ3_A14457OkItem ;
   private boolean[] T01VJ3_n14457OkItem ;
   private long[] T01VJ3_A14458ErItem ;
   private boolean[] T01VJ3_n14458ErItem ;
   private short[] T01VJ3_A14459PrgPct ;
   private boolean[] T01VJ3_n14459PrgPct ;
   private String[] T01VJ3_A14460CurItem ;
   private boolean[] T01VJ3_n14460CurItem ;
   private String[] T01VJ3_A14437BasePath ;
   private boolean[] T01VJ3_n14437BasePath ;
   private String[] T01VJ3_A14462OutPath ;
   private boolean[] T01VJ3_n14462OutPath ;
   private String[] T01VJ3_A14463ZipPath ;
   private boolean[] T01VJ3_n14463ZipPath ;
   private String[] T01VJ3_A14464ZipUrl ;
   private boolean[] T01VJ3_n14464ZipUrl ;
   private String[] T01VJ3_A14466LockId ;
   private boolean[] T01VJ3_n14466LockId ;
   private java.util.Date[] T01VJ3_A14467LockDt ;
   private boolean[] T01VJ3_n14467LockDt ;
   private java.util.UUID[] T01VJ6_A14423JobId ;
   private java.util.UUID[] T01VJ7_A14423JobId ;
   private String[] T01VJ2_A14465LastErr ;
   private boolean[] T01VJ2_n14465LastErr ;
   private java.util.UUID[] T01VJ2_A14423JobId ;
   private String[] T01VJ2_A14485JobDesc ;
   private boolean[] T01VJ2_n14485JobDesc ;
   private String[] T01VJ2_A14424JobType ;
   private boolean[] T01VJ2_n14424JobType ;
   private String[] T01VJ2_A14484JobExec ;
   private boolean[] T01VJ2_n14484JobExec ;
   private String[] T01VJ2_A14450JobStat ;
   private boolean[] T01VJ2_n14450JobStat ;
   private String[] T01VJ2_A14451UsrCreat ;
   private boolean[] T01VJ2_n14451UsrCreat ;
   private String[] T01VJ2_A14488UsrSocket ;
   private boolean[] T01VJ2_n14488UsrSocket ;
   private java.util.Date[] T01VJ2_A14452DtCreat ;
   private boolean[] T01VJ2_n14452DtCreat ;
   private java.util.Date[] T01VJ2_A14453DtStart ;
   private boolean[] T01VJ2_n14453DtStart ;
   private java.util.Date[] T01VJ2_A14454DtEnd ;
   private boolean[] T01VJ2_n14454DtEnd ;
   private long[] T01VJ2_A14455TotItem ;
   private boolean[] T01VJ2_n14455TotItem ;
   private long[] T01VJ2_A14456PrcItem ;
   private boolean[] T01VJ2_n14456PrcItem ;
   private long[] T01VJ2_A14457OkItem ;
   private boolean[] T01VJ2_n14457OkItem ;
   private long[] T01VJ2_A14458ErItem ;
   private boolean[] T01VJ2_n14458ErItem ;
   private short[] T01VJ2_A14459PrgPct ;
   private boolean[] T01VJ2_n14459PrgPct ;
   private String[] T01VJ2_A14460CurItem ;
   private boolean[] T01VJ2_n14460CurItem ;
   private String[] T01VJ2_A14437BasePath ;
   private boolean[] T01VJ2_n14437BasePath ;
   private String[] T01VJ2_A14462OutPath ;
   private boolean[] T01VJ2_n14462OutPath ;
   private String[] T01VJ2_A14463ZipPath ;
   private boolean[] T01VJ2_n14463ZipPath ;
   private String[] T01VJ2_A14464ZipUrl ;
   private boolean[] T01VJ2_n14464ZipUrl ;
   private String[] T01VJ2_A14466LockId ;
   private boolean[] T01VJ2_n14466LockId ;
   private java.util.Date[] T01VJ2_A14467LockDt ;
   private boolean[] T01VJ2_n14467LockDt ;
   private java.util.UUID[] T01VJ11_A14423JobId ;
   private String[] T01VJ11_A14478ParKey ;
   private long[] T01VJ12_A14468ItmId ;
   private java.util.UUID[] T01VJ12_A14423JobId ;
   private java.util.UUID[] T01VJ13_A14423JobId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class job__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class job__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class job__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class job__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VJ2", "SELECT LastErr, JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LockId, LockDt FROM TXPJOB WHERE JobId = ?  FOR UPDATE OF JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LastErr, LockId, LockDt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VJ3", "SELECT LastErr, JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LockId, LockDt FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VJ4", "SELECT /*+ FIRST_ROWS(100) */ TM1.LastErr, TM1.JobId, TM1.JobDesc, TM1.JobType, TM1.JobExec, TM1.JobStat, TM1.UsrCreat, TM1.UsrSocket, TM1.DtCreat, TM1.DtStart, TM1.DtEnd, TM1.TotItem, TM1.PrcItem, TM1.OkItem, TM1.ErItem, TM1.PrgPct, TM1.CurItem, TM1.BasePath, TM1.OutPath, TM1.ZipPath, TM1.ZipUrl, TM1.LockId, TM1.LockDt FROM TXPJOB TM1 WHERE TM1.JobId = ? ORDER BY TM1.JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VJ5", "SELECT /*+ FIRST_ROWS(1) */ JobId FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VJ6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ JobId FROM TXPJOB WHERE ( JobId > ?) ORDER BY JobId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VJ7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ JobId FROM TXPJOB WHERE ( JobId < ?) ORDER BY JobId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VJ8", "INSERT INTO TXPJOB(JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LastErr, LockId, LockDt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJOB")
         ,new UpdateCursor("T01VJ9", "UPDATE TXPJOB SET JobDesc=?, JobType=?, JobExec=?, JobStat=?, UsrCreat=?, UsrSocket=?, DtCreat=?, DtStart=?, DtEnd=?, TotItem=?, PrcItem=?, OkItem=?, ErItem=?, PrgPct=?, CurItem=?, BasePath=?, OutPath=?, ZipPath=?, ZipUrl=?, LastErr=?, LockId=?, LockDt=?  WHERE JobId = ?", GX_NOMASK, "TXPJOB")
         ,new UpdateCursor("T01VJ10", "DELETE FROM TXPJOB  WHERE JobId = ?", GX_NOMASK, "TXPJOB")
         ,new ForEachCursor("T01VJ11", "SELECT * FROM (SELECT JobId, ParKey FROM TXPJOBPAR WHERE JobId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VJ12", "SELECT * FROM (SELECT ItmId, JobId FROM TXPJOBITE WHERE JobId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VJ13", "SELECT /*+ FIRST_ROWS(100) */ JobId FROM TXPJOB ORDER BY JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               return;
            case 4 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               return;
            case 5 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               return;
            case 9 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               return;
            case 11 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
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
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 1 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 2 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 4 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 5 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 6 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 60);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[20]).longValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[22]).longValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[24]).longValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(14, ((Number) parms[26]).longValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 100);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 200);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 200);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 200);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 200);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(21, (String)parms[40]);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[44], false);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 60);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[21]).longValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[25]).longValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 100);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 200);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 200);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 200);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(20, (String)parms[39]);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 100);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               stmt.setGUID(23, (java.util.UUID)parms[44]);
               return;
            case 8 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 9 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 10 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

