package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class jobitem_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A14423JobId = GXutil.strToGuid(httpContext.GetPar( "JobId")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A14423JobId) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "JOBITEM", ""), (short)(0)) ;
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

   public jobitem_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public jobitem_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( jobitem_impl.class ));
   }

   public jobitem_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "JOBITEM", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_AsyncBatch\\JOBITEM.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_AsyncBatch\\JOBITEM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtJobId_Internalname, A14423JobId.toString(), A14423JobId.toString(), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJobId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtJobId_Enabled, 0, "text", "", 36, "chr", 1, "row", 36, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "", false, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtItmId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtItmId_Internalname, httpContext.getMessage( "no Job.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtItmId_Internalname, GXutil.ltrim( localUtil.ntoc( A14468ItmId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtItmId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14468ItmId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14468ItmId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtItmId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOBITEM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtJobType_Internalname, A14424JobType, GXutil.rtrim( localUtil.format( A14424JobType, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJobType_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtJobType_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDocId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDocId_Internalname, httpContext.getMessage( "(ex.: FacCod).", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDocId_Internalname, GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDocId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14470DocId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14470DocId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDocId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDocLbl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDocLbl_Internalname, httpContext.getMessage( "“Fatura 12345”).", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDocLbl_Internalname, A14471DocLbl, GXutil.rtrim( localUtil.format( A14471DocLbl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDocLbl_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDocLbl_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtItmSts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtItmSts_Internalname, httpContext.getMessage( "OK, ERR).", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtItmSts_Internalname, A14472ItmSts, GXutil.rtrim( localUtil.format( A14472ItmSts, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmSts_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtItmSts_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRetryQt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRetryQt_Internalname, httpContext.getMessage( "tentativas realizadas.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRetryQt_Internalname, GXutil.ltrim( localUtil.ntoc( A14473RetryQt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRetryQt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14473RetryQt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14473RetryQt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRetryQt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRetryQt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtItmDtStart_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtItmDtStart_Internalname, httpContext.getMessage( "do item.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtItmDtStart_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtItmDtStart_Internalname, localUtil.ttoc( A14481ItmDtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14481ItmDtStart, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmDtStart_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtItmDtStart_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtItmDtStart_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtItmDtStart_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AsyncBatch\\JOBITEM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtItmDtEnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtItmDtEnd_Internalname, httpContext.getMessage( "do item.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtItmDtEnd_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtItmDtEnd_Internalname, localUtil.ttoc( A14482ItmDtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14482ItmDtEnd, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmDtEnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtItmDtEnd_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtItmDtEnd_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtItmDtEnd_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AsyncBatch\\JOBITEM.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtItmErr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtItmErr_Internalname, httpContext.getMessage( "Err", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtItmErr_Internalname, A14486ItmErr, GXutil.rtrim( localUtil.format( A14486ItmErr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtItmErr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtItmErr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOutFile_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOutFile_Internalname, httpContext.getMessage( "arquivo gerado.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOutFile_Internalname, A14474OutFile, GXutil.rtrim( localUtil.format( A14474OutFile, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOutFile_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOutFile_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOutUrl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOutUrl_Internalname, httpContext.getMessage( "(se aplicável).", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOutUrl_Internalname, A14475OutUrl, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), 1, edtOutUrl_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFileNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFileNm_Internalname, httpContext.getMessage( "(ex.: F_12345_20260116.pdf).", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFileNm_Internalname, A14476FileNm, GXutil.rtrim( localUtil.format( A14476FileNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFileNm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFileNm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AsyncBatch\\JOBITEM.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AsyncBatch\\JOBITEM.htm");
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
         Z14468ItmId = localUtil.ctol( httpContext.cgiGet( "Z14468ItmId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14423JobId = GXutil.strToGuid(httpContext.cgiGet( "Z14423JobId")) ;
         Z14470DocId = localUtil.ctol( httpContext.cgiGet( "Z14470DocId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14471DocLbl = httpContext.cgiGet( "Z14471DocLbl") ;
         Z14472ItmSts = httpContext.cgiGet( "Z14472ItmSts") ;
         Z14473RetryQt = (short)(localUtil.ctol( httpContext.cgiGet( "Z14473RetryQt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14481ItmDtStart = localUtil.ctot( httpContext.cgiGet( "Z14481ItmDtStart"), 0) ;
         Z14482ItmDtEnd = localUtil.ctot( httpContext.cgiGet( "Z14482ItmDtEnd"), 0) ;
         Z14486ItmErr = httpContext.cgiGet( "Z14486ItmErr") ;
         Z14474OutFile = httpContext.cgiGet( "Z14474OutFile") ;
         Z14476FileNm = httpContext.cgiGet( "Z14476FileNm") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtItmId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtItmId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ITMID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtItmId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14468ItmId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
         }
         else
         {
            A14468ItmId = localUtil.ctol( httpContext.cgiGet( edtItmId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
         }
         A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
         n14424JobType = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDocId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14470DocId = 0 ;
            n14470DocId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14470DocId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14470DocId), 10, 0));
         }
         else
         {
            A14470DocId = localUtil.ctol( httpContext.cgiGet( edtDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14470DocId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14470DocId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14470DocId), 10, 0));
         }
         A14471DocLbl = httpContext.cgiGet( edtDocLbl_Internalname) ;
         n14471DocLbl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14471DocLbl", A14471DocLbl);
         A14472ItmSts = httpContext.cgiGet( edtItmSts_Internalname) ;
         n14472ItmSts = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14472ItmSts", A14472ItmSts);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRetryQt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRetryQt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RETRYQT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRetryQt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14473RetryQt = (short)(0) ;
            n14473RetryQt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14473RetryQt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14473RetryQt), 3, 0));
         }
         else
         {
            A14473RetryQt = (short)(localUtil.ctol( httpContext.cgiGet( edtRetryQt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14473RetryQt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14473RetryQt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14473RetryQt), 3, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtItmDtStart_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ITMDTSTART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtItmDtStart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
            n14481ItmDtStart = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14481ItmDtStart", localUtil.ttoc( A14481ItmDtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14481ItmDtStart = localUtil.ctot( httpContext.cgiGet( edtItmDtStart_Internalname)) ;
            n14481ItmDtStart = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14481ItmDtStart", localUtil.ttoc( A14481ItmDtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtItmDtEnd_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ITMDTEND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtItmDtEnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
            n14482ItmDtEnd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14482ItmDtEnd", localUtil.ttoc( A14482ItmDtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14482ItmDtEnd = localUtil.ctot( httpContext.cgiGet( edtItmDtEnd_Internalname)) ;
            n14482ItmDtEnd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14482ItmDtEnd", localUtil.ttoc( A14482ItmDtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14486ItmErr = httpContext.cgiGet( edtItmErr_Internalname) ;
         n14486ItmErr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14486ItmErr", A14486ItmErr);
         A14474OutFile = httpContext.cgiGet( edtOutFile_Internalname) ;
         n14474OutFile = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14474OutFile", A14474OutFile);
         A14475OutUrl = httpContext.cgiGet( edtOutUrl_Internalname) ;
         n14475OutUrl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14475OutUrl", A14475OutUrl);
         A14476FileNm = httpContext.cgiGet( edtFileNm_Internalname) ;
         n14476FileNm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14476FileNm", A14476FileNm);
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
            A14468ItmId = GXutil.lval( httpContext.GetPar( "ItmId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
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
            initAll1VK1908( ) ;
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
      disableAttributes1VK1908( ) ;
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

   public void resetCaption1VK0( )
   {
   }

   public void zm1VK1908( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14470DocId = T01VK3_A14470DocId[0] ;
            Z14471DocLbl = T01VK3_A14471DocLbl[0] ;
            Z14472ItmSts = T01VK3_A14472ItmSts[0] ;
            Z14473RetryQt = T01VK3_A14473RetryQt[0] ;
            Z14481ItmDtStart = T01VK3_A14481ItmDtStart[0] ;
            Z14482ItmDtEnd = T01VK3_A14482ItmDtEnd[0] ;
            Z14486ItmErr = T01VK3_A14486ItmErr[0] ;
            Z14474OutFile = T01VK3_A14474OutFile[0] ;
            Z14476FileNm = T01VK3_A14476FileNm[0] ;
         }
         else
         {
            Z14470DocId = A14470DocId ;
            Z14471DocLbl = A14471DocLbl ;
            Z14472ItmSts = A14472ItmSts ;
            Z14473RetryQt = A14473RetryQt ;
            Z14481ItmDtStart = A14481ItmDtStart ;
            Z14482ItmDtEnd = A14482ItmDtEnd ;
            Z14486ItmErr = A14486ItmErr ;
            Z14474OutFile = A14474OutFile ;
            Z14476FileNm = A14476FileNm ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z14468ItmId = A14468ItmId ;
         Z14470DocId = A14470DocId ;
         Z14471DocLbl = A14471DocLbl ;
         Z14472ItmSts = A14472ItmSts ;
         Z14473RetryQt = A14473RetryQt ;
         Z14481ItmDtStart = A14481ItmDtStart ;
         Z14482ItmDtEnd = A14482ItmDtEnd ;
         Z14486ItmErr = A14486ItmErr ;
         Z14474OutFile = A14474OutFile ;
         Z14475OutUrl = A14475OutUrl ;
         Z14476FileNm = A14476FileNm ;
         Z14423JobId = A14423JobId ;
         Z14424JobType = A14424JobType ;
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

   public void load1VK1908( )
   {
      /* Using cursor T01VK5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1908 = (short)(1) ;
         A14475OutUrl = T01VK5_A14475OutUrl[0] ;
         n14475OutUrl = T01VK5_n14475OutUrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14475OutUrl", A14475OutUrl);
         A14424JobType = T01VK5_A14424JobType[0] ;
         n14424JobType = T01VK5_n14424JobType[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
         A14470DocId = T01VK5_A14470DocId[0] ;
         n14470DocId = T01VK5_n14470DocId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14470DocId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14470DocId), 10, 0));
         A14471DocLbl = T01VK5_A14471DocLbl[0] ;
         n14471DocLbl = T01VK5_n14471DocLbl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14471DocLbl", A14471DocLbl);
         A14472ItmSts = T01VK5_A14472ItmSts[0] ;
         n14472ItmSts = T01VK5_n14472ItmSts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14472ItmSts", A14472ItmSts);
         A14473RetryQt = T01VK5_A14473RetryQt[0] ;
         n14473RetryQt = T01VK5_n14473RetryQt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14473RetryQt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14473RetryQt), 3, 0));
         A14481ItmDtStart = T01VK5_A14481ItmDtStart[0] ;
         n14481ItmDtStart = T01VK5_n14481ItmDtStart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14481ItmDtStart", localUtil.ttoc( A14481ItmDtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14482ItmDtEnd = T01VK5_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = T01VK5_n14482ItmDtEnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14482ItmDtEnd", localUtil.ttoc( A14482ItmDtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14486ItmErr = T01VK5_A14486ItmErr[0] ;
         n14486ItmErr = T01VK5_n14486ItmErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14486ItmErr", A14486ItmErr);
         A14474OutFile = T01VK5_A14474OutFile[0] ;
         n14474OutFile = T01VK5_n14474OutFile[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14474OutFile", A14474OutFile);
         A14476FileNm = T01VK5_A14476FileNm[0] ;
         n14476FileNm = T01VK5_n14476FileNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14476FileNm", A14476FileNm);
         zm1VK1908( -2) ;
      }
      pr_default.close(3);
      onLoadActions1VK1908( ) ;
   }

   public void onLoadActions1VK1908( )
   {
   }

   public void checkExtendedTable1VK1908( )
   {
      nIsDirty_1908 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01VK4 */
      pr_default.execute(2, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14424JobType = T01VK4_A14424JobType[0] ;
      n14424JobType = T01VK4_n14424JobType[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1VK1908( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( java.util.UUID A14423JobId )
   {
      /* Using cursor T01VK6 */
      pr_default.execute(4, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14424JobType = T01VK6_A14424JobType[0] ;
      n14424JobType = T01VK6_n14424JobType[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A14424JobType)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1VK1908( )
   {
      /* Using cursor T01VK7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1908 = (short)(1) ;
      }
      else
      {
         RcdFound1908 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VK3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VK1908( 2) ;
         RcdFound1908 = (short)(1) ;
         A14475OutUrl = T01VK3_A14475OutUrl[0] ;
         n14475OutUrl = T01VK3_n14475OutUrl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14475OutUrl", A14475OutUrl);
         A14468ItmId = T01VK3_A14468ItmId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
         A14470DocId = T01VK3_A14470DocId[0] ;
         n14470DocId = T01VK3_n14470DocId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14470DocId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14470DocId), 10, 0));
         A14471DocLbl = T01VK3_A14471DocLbl[0] ;
         n14471DocLbl = T01VK3_n14471DocLbl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14471DocLbl", A14471DocLbl);
         A14472ItmSts = T01VK3_A14472ItmSts[0] ;
         n14472ItmSts = T01VK3_n14472ItmSts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14472ItmSts", A14472ItmSts);
         A14473RetryQt = T01VK3_A14473RetryQt[0] ;
         n14473RetryQt = T01VK3_n14473RetryQt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14473RetryQt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14473RetryQt), 3, 0));
         A14481ItmDtStart = T01VK3_A14481ItmDtStart[0] ;
         n14481ItmDtStart = T01VK3_n14481ItmDtStart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14481ItmDtStart", localUtil.ttoc( A14481ItmDtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14482ItmDtEnd = T01VK3_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = T01VK3_n14482ItmDtEnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14482ItmDtEnd", localUtil.ttoc( A14482ItmDtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14486ItmErr = T01VK3_A14486ItmErr[0] ;
         n14486ItmErr = T01VK3_n14486ItmErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14486ItmErr", A14486ItmErr);
         A14474OutFile = T01VK3_A14474OutFile[0] ;
         n14474OutFile = T01VK3_n14474OutFile[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14474OutFile", A14474OutFile);
         A14476FileNm = T01VK3_A14476FileNm[0] ;
         n14476FileNm = T01VK3_n14476FileNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14476FileNm", A14476FileNm);
         A14423JobId = T01VK3_A14423JobId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
         Z14468ItmId = A14468ItmId ;
         Z14423JobId = A14423JobId ;
         sMode1908 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1VK1908( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1908 = (short)(0) ;
            initializeNonKey1VK1908( ) ;
         }
         Gx_mode = sMode1908 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1908 = (short)(0) ;
         initializeNonKey1VK1908( ) ;
         sMode1908 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1908 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VK1908( ) ;
      if ( RcdFound1908 == 0 )
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
      RcdFound1908 = (short)(0) ;
      /* Using cursor T01VK8 */
      pr_default.execute(6, new Object[] {Long.valueOf(A14468ItmId), Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01VK8_A14468ItmId[0] < A14468ItmId ) || ( T01VK8_A14468ItmId[0] == A14468ItmId ) && ( GXutil.guidCompare(T01VK8_A14423JobId[0], A14423JobId, 0) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01VK8_A14468ItmId[0] > A14468ItmId ) || ( T01VK8_A14468ItmId[0] == A14468ItmId ) && ( GXutil.guidCompare(T01VK8_A14423JobId[0], A14423JobId, 0) > 0 ) ) )
         {
            A14468ItmId = T01VK8_A14468ItmId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
            A14423JobId = T01VK8_A14423JobId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
            RcdFound1908 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1908 = (short)(0) ;
      /* Using cursor T01VK9 */
      pr_default.execute(7, new Object[] {Long.valueOf(A14468ItmId), Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01VK9_A14468ItmId[0] > A14468ItmId ) || ( T01VK9_A14468ItmId[0] == A14468ItmId ) && ( GXutil.guidCompare(T01VK9_A14423JobId[0], A14423JobId, 0) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01VK9_A14468ItmId[0] < A14468ItmId ) || ( T01VK9_A14468ItmId[0] == A14468ItmId ) && ( GXutil.guidCompare(T01VK9_A14423JobId[0], A14423JobId, 0) < 0 ) ) )
         {
            A14468ItmId = T01VK9_A14468ItmId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
            A14423JobId = T01VK9_A14423JobId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
            RcdFound1908 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VK1908( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VK1908( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1908 == 1 )
         {
            if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
            {
               A14468ItmId = Z14468ItmId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
               A14423JobId = Z14423JobId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ITMID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtItmId_Internalname ;
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
               update1VK1908( ) ;
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtJobId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VK1908( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ITMID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtItmId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtJobId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1VK1908( ) ;
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
      if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
      {
         A14468ItmId = Z14468ItmId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
         A14423JobId = Z14423JobId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ITMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtItmId_Internalname ;
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
      if ( RcdFound1908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "ITMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtItmId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDocId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1VK1908( ) ;
      if ( RcdFound1908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDocId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VK1908( ) ;
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
      if ( RcdFound1908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDocId_Internalname ;
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
      if ( RcdFound1908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDocId_Internalname ;
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
      scanStart1VK1908( ) ;
      if ( RcdFound1908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1908 != 0 )
         {
            scanNext1VK1908( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDocId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1VK1908( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1VK1908( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VK2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOBITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z14470DocId != T01VK2_A14470DocId[0] ) || ( GXutil.strcmp(Z14471DocLbl, T01VK2_A14471DocLbl[0]) != 0 ) || ( GXutil.strcmp(Z14472ItmSts, T01VK2_A14472ItmSts[0]) != 0 ) || ( Z14473RetryQt != T01VK2_A14473RetryQt[0] ) || !( GXutil.dateCompare(Z14481ItmDtStart, T01VK2_A14481ItmDtStart[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14482ItmDtEnd, T01VK2_A14482ItmDtEnd[0]) ) || ( GXutil.strcmp(Z14486ItmErr, T01VK2_A14486ItmErr[0]) != 0 ) || ( GXutil.strcmp(Z14474OutFile, T01VK2_A14474OutFile[0]) != 0 ) || ( GXutil.strcmp(Z14476FileNm, T01VK2_A14476FileNm[0]) != 0 ) )
         {
            if ( Z14470DocId != T01VK2_A14470DocId[0] )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"DocId");
               GXutil.writeLogRaw("Old: ",Z14470DocId);
               GXutil.writeLogRaw("Current: ",T01VK2_A14470DocId[0]);
            }
            if ( GXutil.strcmp(Z14471DocLbl, T01VK2_A14471DocLbl[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"DocLbl");
               GXutil.writeLogRaw("Old: ",Z14471DocLbl);
               GXutil.writeLogRaw("Current: ",T01VK2_A14471DocLbl[0]);
            }
            if ( GXutil.strcmp(Z14472ItmSts, T01VK2_A14472ItmSts[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"ItmSts");
               GXutil.writeLogRaw("Old: ",Z14472ItmSts);
               GXutil.writeLogRaw("Current: ",T01VK2_A14472ItmSts[0]);
            }
            if ( Z14473RetryQt != T01VK2_A14473RetryQt[0] )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"RetryQt");
               GXutil.writeLogRaw("Old: ",Z14473RetryQt);
               GXutil.writeLogRaw("Current: ",T01VK2_A14473RetryQt[0]);
            }
            if ( !( GXutil.dateCompare(Z14481ItmDtStart, T01VK2_A14481ItmDtStart[0]) ) )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"ItmDtStart");
               GXutil.writeLogRaw("Old: ",Z14481ItmDtStart);
               GXutil.writeLogRaw("Current: ",T01VK2_A14481ItmDtStart[0]);
            }
            if ( !( GXutil.dateCompare(Z14482ItmDtEnd, T01VK2_A14482ItmDtEnd[0]) ) )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"ItmDtEnd");
               GXutil.writeLogRaw("Old: ",Z14482ItmDtEnd);
               GXutil.writeLogRaw("Current: ",T01VK2_A14482ItmDtEnd[0]);
            }
            if ( GXutil.strcmp(Z14486ItmErr, T01VK2_A14486ItmErr[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"ItmErr");
               GXutil.writeLogRaw("Old: ",Z14486ItmErr);
               GXutil.writeLogRaw("Current: ",T01VK2_A14486ItmErr[0]);
            }
            if ( GXutil.strcmp(Z14474OutFile, T01VK2_A14474OutFile[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"OutFile");
               GXutil.writeLogRaw("Old: ",Z14474OutFile);
               GXutil.writeLogRaw("Current: ",T01VK2_A14474OutFile[0]);
            }
            if ( GXutil.strcmp(Z14476FileNm, T01VK2_A14476FileNm[0]) != 0 )
            {
               GXutil.writeLogln("asyncbatch.jobitem:[seudo value changed for attri]"+"FileNm");
               GXutil.writeLogRaw("Old: ",Z14476FileNm);
               GXutil.writeLogRaw("Current: ",T01VK2_A14476FileNm[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOBITE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VK1908( )
   {
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VK1908( 0) ;
         checkOptimisticConcurrency1VK1908( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VK1908( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VK1908( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VK10 */
                  pr_default.execute(8, new Object[] {Long.valueOf(A14468ItmId), Boolean.valueOf(n14470DocId), Long.valueOf(A14470DocId), Boolean.valueOf(n14471DocLbl), A14471DocLbl, Boolean.valueOf(n14472ItmSts), A14472ItmSts, Boolean.valueOf(n14473RetryQt), Short.valueOf(A14473RetryQt), Boolean.valueOf(n14481ItmDtStart), A14481ItmDtStart, Boolean.valueOf(n14482ItmDtEnd), A14482ItmDtEnd, Boolean.valueOf(n14486ItmErr), A14486ItmErr, Boolean.valueOf(n14474OutFile), A14474OutFile, Boolean.valueOf(n14475OutUrl), A14475OutUrl, Boolean.valueOf(n14476FileNm), A14476FileNm, A14423JobId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
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
                        resetCaption1VK0( ) ;
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
            load1VK1908( ) ;
         }
         endLevel1VK1908( ) ;
      }
      closeExtendedTableCursors1VK1908( ) ;
   }

   public void update1VK1908( )
   {
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VK1908( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VK1908( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VK1908( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VK11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n14470DocId), Long.valueOf(A14470DocId), Boolean.valueOf(n14471DocLbl), A14471DocLbl, Boolean.valueOf(n14472ItmSts), A14472ItmSts, Boolean.valueOf(n14473RetryQt), Short.valueOf(A14473RetryQt), Boolean.valueOf(n14481ItmDtStart), A14481ItmDtStart, Boolean.valueOf(n14482ItmDtEnd), A14482ItmDtEnd, Boolean.valueOf(n14486ItmErr), A14486ItmErr, Boolean.valueOf(n14474OutFile), A14474OutFile, Boolean.valueOf(n14475OutUrl), A14475OutUrl, Boolean.valueOf(n14476FileNm), A14476FileNm, Long.valueOf(A14468ItmId), A14423JobId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOBITE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VK1908( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1VK0( ) ;
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
         endLevel1VK1908( ) ;
      }
      closeExtendedTableCursors1VK1908( ) ;
   }

   public void deferredUpdate1VK1908( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VK1908( ) ;
         afterConfirm1VK1908( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VK1908( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VK12 */
               pr_default.execute(10, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1908 == 0 )
                     {
                        initAll1VK1908( ) ;
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
                     resetCaption1VK0( ) ;
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
      sMode1908 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VK1908( ) ;
      Gx_mode = sMode1908 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VK1908( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01VK13 */
         pr_default.execute(11, new Object[] {A14423JobId});
         A14424JobType = T01VK13_A14424JobType[0] ;
         n14424JobType = T01VK13_n14424JobType[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
         pr_default.close(11);
      }
   }

   public void endLevel1VK1908( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.jobitem");
         if ( AnyError == 0 )
         {
            confirmValues1VK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "asyncbatch.jobitem");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VK1908( )
   {
      /* Using cursor T01VK14 */
      pr_default.execute(12);
      RcdFound1908 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1908 = (short)(1) ;
         A14468ItmId = T01VK14_A14468ItmId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
         A14423JobId = T01VK14_A14423JobId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VK1908( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1908 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1908 = (short)(1) ;
         A14468ItmId = T01VK14_A14468ItmId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
         A14423JobId = T01VK14_A14423JobId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
      }
   }

   public void scanEnd1VK1908( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1VK1908( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VK1908( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VK1908( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VK1908( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VK1908( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VK1908( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VK1908( )
   {
      edtJobId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJobId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJobId_Enabled), 5, 0), true);
      edtItmId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmId_Enabled), 5, 0), true);
      edtJobType_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJobType_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJobType_Enabled), 5, 0), true);
      edtDocId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDocId_Enabled), 5, 0), true);
      edtDocLbl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocLbl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDocLbl_Enabled), 5, 0), true);
      edtItmSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmSts_Enabled), 5, 0), true);
      edtRetryQt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRetryQt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRetryQt_Enabled), 5, 0), true);
      edtItmDtStart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmDtStart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmDtStart_Enabled), 5, 0), true);
      edtItmDtEnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmDtEnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmDtEnd_Enabled), 5, 0), true);
      edtItmErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItmErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItmErr_Enabled), 5, 0), true);
      edtOutFile_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOutFile_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOutFile_Enabled), 5, 0), true);
      edtOutUrl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOutUrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOutUrl_Enabled), 5, 0), true);
      edtFileNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFileNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFileNm_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VK1908( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.asyncbatch.jobitem", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14468ItmId", GXutil.ltrim( localUtil.ntoc( Z14468ItmId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14423JobId", Z14423JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "Z14470DocId", GXutil.ltrim( localUtil.ntoc( Z14470DocId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14471DocLbl", Z14471DocLbl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14472ItmSts", Z14472ItmSts);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14473RetryQt", GXutil.ltrim( localUtil.ntoc( Z14473RetryQt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14481ItmDtStart", localUtil.ttoc( Z14481ItmDtStart, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14482ItmDtEnd", localUtil.ttoc( Z14482ItmDtEnd, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14486ItmErr", Z14486ItmErr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14474OutFile", Z14474OutFile);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14476FileNm", Z14476FileNm);
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
      return formatLink("app.asyncbatch.jobitem", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AsyncBatch.JOBITEM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "JOBITEM", "") ;
   }

   public void initializeNonKey1VK1908( )
   {
      A14424JobType = "" ;
      n14424JobType = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      A14470DocId = 0 ;
      n14470DocId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14470DocId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14470DocId), 10, 0));
      A14471DocLbl = "" ;
      n14471DocLbl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14471DocLbl", A14471DocLbl);
      A14472ItmSts = "" ;
      n14472ItmSts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14472ItmSts", A14472ItmSts);
      A14473RetryQt = (short)(0) ;
      n14473RetryQt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14473RetryQt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14473RetryQt), 3, 0));
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      n14481ItmDtStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14481ItmDtStart", localUtil.ttoc( A14481ItmDtStart, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      n14482ItmDtEnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14482ItmDtEnd", localUtil.ttoc( A14482ItmDtEnd, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14486ItmErr = "" ;
      n14486ItmErr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14486ItmErr", A14486ItmErr);
      A14474OutFile = "" ;
      n14474OutFile = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14474OutFile", A14474OutFile);
      A14475OutUrl = "" ;
      n14475OutUrl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14475OutUrl", A14475OutUrl);
      A14476FileNm = "" ;
      n14476FileNm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14476FileNm", A14476FileNm);
      Z14470DocId = 0 ;
      Z14471DocLbl = "" ;
      Z14472ItmSts = "" ;
      Z14473RetryQt = (short)(0) ;
      Z14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14486ItmErr = "" ;
      Z14474OutFile = "" ;
      Z14476FileNm = "" ;
   }

   public void initAll1VK1908( )
   {
      A14468ItmId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14468ItmId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14468ItmId), 10, 0));
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14423JobId", A14423JobId.toString());
      initializeNonKey1VK1908( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202663016383654", true, true);
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
      httpContext.AddJavascriptSource("asyncbatch/jobitem.js", "?202663016383654", false, true);
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
      edtItmId_Internalname = "ITMID" ;
      edtJobType_Internalname = "JOBTYPE" ;
      edtDocId_Internalname = "DOCID" ;
      edtDocLbl_Internalname = "DOCLBL" ;
      edtItmSts_Internalname = "ITMSTS" ;
      edtRetryQt_Internalname = "RETRYQT" ;
      edtItmDtStart_Internalname = "ITMDTSTART" ;
      edtItmDtEnd_Internalname = "ITMDTEND" ;
      edtItmErr_Internalname = "ITMERR" ;
      edtOutFile_Internalname = "OUTFILE" ;
      edtOutUrl_Internalname = "OUTURL" ;
      edtFileNm_Internalname = "FILENM" ;
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
      Form.setCaption( httpContext.getMessage( "JOBITEM", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFileNm_Jsonclick = "" ;
      edtFileNm_Enabled = 1 ;
      edtOutUrl_Enabled = 1 ;
      edtOutFile_Jsonclick = "" ;
      edtOutFile_Enabled = 1 ;
      edtItmErr_Jsonclick = "" ;
      edtItmErr_Enabled = 1 ;
      edtItmDtEnd_Jsonclick = "" ;
      edtItmDtEnd_Enabled = 1 ;
      edtItmDtStart_Jsonclick = "" ;
      edtItmDtStart_Enabled = 1 ;
      edtRetryQt_Jsonclick = "" ;
      edtRetryQt_Enabled = 1 ;
      edtItmSts_Jsonclick = "" ;
      edtItmSts_Enabled = 1 ;
      edtDocLbl_Jsonclick = "" ;
      edtDocLbl_Enabled = 1 ;
      edtDocId_Jsonclick = "" ;
      edtDocId_Enabled = 1 ;
      edtJobType_Jsonclick = "" ;
      edtJobType_Enabled = 0 ;
      edtItmId_Jsonclick = "" ;
      edtItmId_Enabled = 1 ;
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
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01VK13 */
      pr_default.execute(11, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJobId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14424JobType = T01VK13_A14424JobType[0] ;
      n14424JobType = T01VK13_n14424JobType[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      pr_default.close(11);
      GX_FocusControl = edtDocId_Internalname ;
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
      n14424JobType = false ;
      /* Using cursor T01VK13 */
      pr_default.execute(11, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJobId_Internalname ;
      }
      A14424JobType = T01VK13_A14424JobType[0] ;
      n14424JobType = T01VK13_n14424JobType[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
   }

   public void valid_Itmid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14470DocId", GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14471DocLbl", A14471DocLbl);
      httpContext.ajax_rsp_assign_attri("", false, "A14472ItmSts", A14472ItmSts);
      httpContext.ajax_rsp_assign_attri("", false, "A14473RetryQt", GXutil.ltrim( localUtil.ntoc( A14473RetryQt, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14481ItmDtStart", localUtil.ttoc( A14481ItmDtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14482ItmDtEnd", localUtil.ttoc( A14482ItmDtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14486ItmErr", A14486ItmErr);
      httpContext.ajax_rsp_assign_attri("", false, "A14474OutFile", A14474OutFile);
      httpContext.ajax_rsp_assign_attri("", false, "A14475OutUrl", A14475OutUrl);
      httpContext.ajax_rsp_assign_attri("", false, "A14476FileNm", A14476FileNm);
      httpContext.ajax_rsp_assign_attri("", false, "A14424JobType", A14424JobType);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14468ItmId", GXutil.ltrim( localUtil.ntoc( Z14468ItmId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14423JobId", Z14423JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "Z14470DocId", GXutil.ltrim( localUtil.ntoc( Z14470DocId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14471DocLbl", Z14471DocLbl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14472ItmSts", Z14472ItmSts);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14473RetryQt", GXutil.ltrim( localUtil.ntoc( Z14473RetryQt, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14481ItmDtStart", localUtil.ttoc( Z14481ItmDtStart, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14482ItmDtEnd", localUtil.ttoc( Z14482ItmDtEnd, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14486ItmErr", Z14486ItmErr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14474OutFile", Z14474OutFile);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14475OutUrl", Z14475OutUrl);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14476FileNm", Z14476FileNm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14424JobType", Z14424JobType);
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
      setEventMetadata("VALID_JOBID","{handler:'valid_Jobid',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''},{av:'A14424JobType',fld:'JOBTYPE',pic:''}]");
      setEventMetadata("VALID_JOBID",",oparms:[{av:'A14424JobType',fld:'JOBTYPE',pic:''}]}");
      setEventMetadata("VALID_ITMID","{handler:'valid_Itmid',iparms:[{av:'A14468ItmId',fld:'ITMID',pic:'ZZZZZZZZZ9'},{av:'A14423JobId',fld:'JOBID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ITMID",",oparms:[{av:'A14470DocId',fld:'DOCID',pic:'ZZZZZZZZZ9'},{av:'A14471DocLbl',fld:'DOCLBL',pic:''},{av:'A14472ItmSts',fld:'ITMSTS',pic:''},{av:'A14473RetryQt',fld:'RETRYQT',pic:'ZZ9'},{av:'A14481ItmDtStart',fld:'ITMDTSTART',pic:'99/99/99 99:99'},{av:'A14482ItmDtEnd',fld:'ITMDTEND',pic:'99/99/99 99:99'},{av:'A14486ItmErr',fld:'ITMERR',pic:''},{av:'A14474OutFile',fld:'OUTFILE',pic:''},{av:'A14475OutUrl',fld:'OUTURL',pic:''},{av:'A14476FileNm',fld:'FILENM',pic:''},{av:'A14424JobType',fld:'JOBTYPE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14468ItmId'},{av:'Z14423JobId'},{av:'Z14470DocId'},{av:'Z14471DocLbl'},{av:'Z14472ItmSts'},{av:'Z14473RetryQt'},{av:'Z14481ItmDtStart'},{av:'Z14482ItmDtEnd'},{av:'Z14486ItmErr'},{av:'Z14474OutFile'},{av:'Z14475OutUrl'},{av:'Z14476FileNm'},{av:'Z14424JobType'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Z14471DocLbl = "" ;
      Z14472ItmSts = "" ;
      Z14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14486ItmErr = "" ;
      Z14474OutFile = "" ;
      Z14476FileNm = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
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
      A14424JobType = "" ;
      A14471DocLbl = "" ;
      A14472ItmSts = "" ;
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14486ItmErr = "" ;
      A14474OutFile = "" ;
      A14475OutUrl = "" ;
      A14476FileNm = "" ;
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
      Z14475OutUrl = "" ;
      Z14424JobType = "" ;
      T01VK5_A14475OutUrl = new String[] {""} ;
      T01VK5_n14475OutUrl = new boolean[] {false} ;
      T01VK5_A14468ItmId = new long[1] ;
      T01VK5_A14424JobType = new String[] {""} ;
      T01VK5_n14424JobType = new boolean[] {false} ;
      T01VK5_A14470DocId = new long[1] ;
      T01VK5_n14470DocId = new boolean[] {false} ;
      T01VK5_A14471DocLbl = new String[] {""} ;
      T01VK5_n14471DocLbl = new boolean[] {false} ;
      T01VK5_A14472ItmSts = new String[] {""} ;
      T01VK5_n14472ItmSts = new boolean[] {false} ;
      T01VK5_A14473RetryQt = new short[1] ;
      T01VK5_n14473RetryQt = new boolean[] {false} ;
      T01VK5_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      T01VK5_n14481ItmDtStart = new boolean[] {false} ;
      T01VK5_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      T01VK5_n14482ItmDtEnd = new boolean[] {false} ;
      T01VK5_A14486ItmErr = new String[] {""} ;
      T01VK5_n14486ItmErr = new boolean[] {false} ;
      T01VK5_A14474OutFile = new String[] {""} ;
      T01VK5_n14474OutFile = new boolean[] {false} ;
      T01VK5_A14476FileNm = new String[] {""} ;
      T01VK5_n14476FileNm = new boolean[] {false} ;
      T01VK5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VK4_A14424JobType = new String[] {""} ;
      T01VK4_n14424JobType = new boolean[] {false} ;
      T01VK6_A14424JobType = new String[] {""} ;
      T01VK6_n14424JobType = new boolean[] {false} ;
      T01VK7_A14468ItmId = new long[1] ;
      T01VK7_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VK3_A14475OutUrl = new String[] {""} ;
      T01VK3_n14475OutUrl = new boolean[] {false} ;
      T01VK3_A14468ItmId = new long[1] ;
      T01VK3_A14470DocId = new long[1] ;
      T01VK3_n14470DocId = new boolean[] {false} ;
      T01VK3_A14471DocLbl = new String[] {""} ;
      T01VK3_n14471DocLbl = new boolean[] {false} ;
      T01VK3_A14472ItmSts = new String[] {""} ;
      T01VK3_n14472ItmSts = new boolean[] {false} ;
      T01VK3_A14473RetryQt = new short[1] ;
      T01VK3_n14473RetryQt = new boolean[] {false} ;
      T01VK3_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      T01VK3_n14481ItmDtStart = new boolean[] {false} ;
      T01VK3_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      T01VK3_n14482ItmDtEnd = new boolean[] {false} ;
      T01VK3_A14486ItmErr = new String[] {""} ;
      T01VK3_n14486ItmErr = new boolean[] {false} ;
      T01VK3_A14474OutFile = new String[] {""} ;
      T01VK3_n14474OutFile = new boolean[] {false} ;
      T01VK3_A14476FileNm = new String[] {""} ;
      T01VK3_n14476FileNm = new boolean[] {false} ;
      T01VK3_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      sMode1908 = "" ;
      T01VK8_A14468ItmId = new long[1] ;
      T01VK8_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VK9_A14468ItmId = new long[1] ;
      T01VK9_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VK2_A14475OutUrl = new String[] {""} ;
      T01VK2_n14475OutUrl = new boolean[] {false} ;
      T01VK2_A14468ItmId = new long[1] ;
      T01VK2_A14470DocId = new long[1] ;
      T01VK2_n14470DocId = new boolean[] {false} ;
      T01VK2_A14471DocLbl = new String[] {""} ;
      T01VK2_n14471DocLbl = new boolean[] {false} ;
      T01VK2_A14472ItmSts = new String[] {""} ;
      T01VK2_n14472ItmSts = new boolean[] {false} ;
      T01VK2_A14473RetryQt = new short[1] ;
      T01VK2_n14473RetryQt = new boolean[] {false} ;
      T01VK2_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      T01VK2_n14481ItmDtStart = new boolean[] {false} ;
      T01VK2_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      T01VK2_n14482ItmDtEnd = new boolean[] {false} ;
      T01VK2_A14486ItmErr = new String[] {""} ;
      T01VK2_n14486ItmErr = new boolean[] {false} ;
      T01VK2_A14474OutFile = new String[] {""} ;
      T01VK2_n14474OutFile = new boolean[] {false} ;
      T01VK2_A14476FileNm = new String[] {""} ;
      T01VK2_n14476FileNm = new boolean[] {false} ;
      T01VK2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01VK13_A14424JobType = new String[] {""} ;
      T01VK13_n14424JobType = new boolean[] {false} ;
      T01VK14_A14468ItmId = new long[1] ;
      T01VK14_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      ZZ14471DocLbl = "" ;
      ZZ14472ItmSts = "" ;
      ZZ14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      ZZ14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      ZZ14486ItmErr = "" ;
      ZZ14474OutFile = "" ;
      ZZ14475OutUrl = "" ;
      ZZ14476FileNm = "" ;
      ZZ14424JobType = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem__default(),
         new Object[] {
             new Object[] {
            T01VK2_A14475OutUrl, T01VK2_n14475OutUrl, T01VK2_A14468ItmId, T01VK2_A14470DocId, T01VK2_n14470DocId, T01VK2_A14471DocLbl, T01VK2_n14471DocLbl, T01VK2_A14472ItmSts, T01VK2_n14472ItmSts, T01VK2_A14473RetryQt,
            T01VK2_n14473RetryQt, T01VK2_A14481ItmDtStart, T01VK2_n14481ItmDtStart, T01VK2_A14482ItmDtEnd, T01VK2_n14482ItmDtEnd, T01VK2_A14486ItmErr, T01VK2_n14486ItmErr, T01VK2_A14474OutFile, T01VK2_n14474OutFile, T01VK2_A14476FileNm,
            T01VK2_n14476FileNm, T01VK2_A14423JobId
            }
            , new Object[] {
            T01VK3_A14475OutUrl, T01VK3_n14475OutUrl, T01VK3_A14468ItmId, T01VK3_A14470DocId, T01VK3_n14470DocId, T01VK3_A14471DocLbl, T01VK3_n14471DocLbl, T01VK3_A14472ItmSts, T01VK3_n14472ItmSts, T01VK3_A14473RetryQt,
            T01VK3_n14473RetryQt, T01VK3_A14481ItmDtStart, T01VK3_n14481ItmDtStart, T01VK3_A14482ItmDtEnd, T01VK3_n14482ItmDtEnd, T01VK3_A14486ItmErr, T01VK3_n14486ItmErr, T01VK3_A14474OutFile, T01VK3_n14474OutFile, T01VK3_A14476FileNm,
            T01VK3_n14476FileNm, T01VK3_A14423JobId
            }
            , new Object[] {
            T01VK4_A14424JobType, T01VK4_n14424JobType
            }
            , new Object[] {
            T01VK5_A14475OutUrl, T01VK5_n14475OutUrl, T01VK5_A14468ItmId, T01VK5_A14424JobType, T01VK5_n14424JobType, T01VK5_A14470DocId, T01VK5_n14470DocId, T01VK5_A14471DocLbl, T01VK5_n14471DocLbl, T01VK5_A14472ItmSts,
            T01VK5_n14472ItmSts, T01VK5_A14473RetryQt, T01VK5_n14473RetryQt, T01VK5_A14481ItmDtStart, T01VK5_n14481ItmDtStart, T01VK5_A14482ItmDtEnd, T01VK5_n14482ItmDtEnd, T01VK5_A14486ItmErr, T01VK5_n14486ItmErr, T01VK5_A14474OutFile,
            T01VK5_n14474OutFile, T01VK5_A14476FileNm, T01VK5_n14476FileNm, T01VK5_A14423JobId
            }
            , new Object[] {
            T01VK6_A14424JobType, T01VK6_n14424JobType
            }
            , new Object[] {
            T01VK7_A14468ItmId, T01VK7_A14423JobId
            }
            , new Object[] {
            T01VK8_A14468ItmId, T01VK8_A14423JobId
            }
            , new Object[] {
            T01VK9_A14468ItmId, T01VK9_A14423JobId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VK13_A14424JobType, T01VK13_n14424JobType
            }
            , new Object[] {
            T01VK14_A14468ItmId, T01VK14_A14423JobId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14473RetryQt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14473RetryQt ;
   private short RcdFound1908 ;
   private short nIsDirty_1908 ;
   private short ZZ14473RetryQt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtJobId_Enabled ;
   private int edtItmId_Enabled ;
   private int edtJobType_Enabled ;
   private int edtDocId_Enabled ;
   private int edtDocLbl_Enabled ;
   private int edtItmSts_Enabled ;
   private int edtRetryQt_Enabled ;
   private int edtItmDtStart_Enabled ;
   private int edtItmDtEnd_Enabled ;
   private int edtItmErr_Enabled ;
   private int edtOutFile_Enabled ;
   private int edtOutUrl_Enabled ;
   private int edtFileNm_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14468ItmId ;
   private long Z14470DocId ;
   private long A14468ItmId ;
   private long A14470DocId ;
   private long ZZ14468ItmId ;
   private long ZZ14470DocId ;
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
   private String edtItmId_Internalname ;
   private String edtItmId_Jsonclick ;
   private String edtJobType_Internalname ;
   private String edtJobType_Jsonclick ;
   private String edtDocId_Internalname ;
   private String edtDocId_Jsonclick ;
   private String edtDocLbl_Internalname ;
   private String edtDocLbl_Jsonclick ;
   private String edtItmSts_Internalname ;
   private String edtItmSts_Jsonclick ;
   private String edtRetryQt_Internalname ;
   private String edtRetryQt_Jsonclick ;
   private String edtItmDtStart_Internalname ;
   private String edtItmDtStart_Jsonclick ;
   private String edtItmDtEnd_Internalname ;
   private String edtItmDtEnd_Jsonclick ;
   private String edtItmErr_Internalname ;
   private String edtItmErr_Jsonclick ;
   private String edtOutFile_Internalname ;
   private String edtOutFile_Jsonclick ;
   private String edtOutUrl_Internalname ;
   private String edtFileNm_Internalname ;
   private String edtFileNm_Jsonclick ;
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
   private String sMode1908 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14481ItmDtStart ;
   private java.util.Date Z14482ItmDtEnd ;
   private java.util.Date A14481ItmDtStart ;
   private java.util.Date A14482ItmDtEnd ;
   private java.util.Date ZZ14481ItmDtStart ;
   private java.util.Date ZZ14482ItmDtEnd ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14424JobType ;
   private boolean n14470DocId ;
   private boolean n14471DocLbl ;
   private boolean n14472ItmSts ;
   private boolean n14473RetryQt ;
   private boolean n14481ItmDtStart ;
   private boolean n14482ItmDtEnd ;
   private boolean n14486ItmErr ;
   private boolean n14474OutFile ;
   private boolean n14475OutUrl ;
   private boolean n14476FileNm ;
   private boolean Gx_longc ;
   private String A14475OutUrl ;
   private String Z14475OutUrl ;
   private String ZZ14475OutUrl ;
   private String Z14471DocLbl ;
   private String Z14472ItmSts ;
   private String Z14486ItmErr ;
   private String Z14474OutFile ;
   private String Z14476FileNm ;
   private String A14424JobType ;
   private String A14471DocLbl ;
   private String A14472ItmSts ;
   private String A14486ItmErr ;
   private String A14474OutFile ;
   private String A14476FileNm ;
   private String Z14424JobType ;
   private String ZZ14471DocLbl ;
   private String ZZ14472ItmSts ;
   private String ZZ14486ItmErr ;
   private String ZZ14474OutFile ;
   private String ZZ14476FileNm ;
   private String ZZ14424JobType ;
   private java.util.UUID Z14423JobId ;
   private java.util.UUID A14423JobId ;
   private java.util.UUID ZZ14423JobId ;
   private IDataStoreProvider pr_default ;
   private String[] T01VK5_A14475OutUrl ;
   private boolean[] T01VK5_n14475OutUrl ;
   private long[] T01VK5_A14468ItmId ;
   private String[] T01VK5_A14424JobType ;
   private boolean[] T01VK5_n14424JobType ;
   private long[] T01VK5_A14470DocId ;
   private boolean[] T01VK5_n14470DocId ;
   private String[] T01VK5_A14471DocLbl ;
   private boolean[] T01VK5_n14471DocLbl ;
   private String[] T01VK5_A14472ItmSts ;
   private boolean[] T01VK5_n14472ItmSts ;
   private short[] T01VK5_A14473RetryQt ;
   private boolean[] T01VK5_n14473RetryQt ;
   private java.util.Date[] T01VK5_A14481ItmDtStart ;
   private boolean[] T01VK5_n14481ItmDtStart ;
   private java.util.Date[] T01VK5_A14482ItmDtEnd ;
   private boolean[] T01VK5_n14482ItmDtEnd ;
   private String[] T01VK5_A14486ItmErr ;
   private boolean[] T01VK5_n14486ItmErr ;
   private String[] T01VK5_A14474OutFile ;
   private boolean[] T01VK5_n14474OutFile ;
   private String[] T01VK5_A14476FileNm ;
   private boolean[] T01VK5_n14476FileNm ;
   private java.util.UUID[] T01VK5_A14423JobId ;
   private String[] T01VK4_A14424JobType ;
   private boolean[] T01VK4_n14424JobType ;
   private String[] T01VK6_A14424JobType ;
   private boolean[] T01VK6_n14424JobType ;
   private long[] T01VK7_A14468ItmId ;
   private java.util.UUID[] T01VK7_A14423JobId ;
   private String[] T01VK3_A14475OutUrl ;
   private boolean[] T01VK3_n14475OutUrl ;
   private long[] T01VK3_A14468ItmId ;
   private long[] T01VK3_A14470DocId ;
   private boolean[] T01VK3_n14470DocId ;
   private String[] T01VK3_A14471DocLbl ;
   private boolean[] T01VK3_n14471DocLbl ;
   private String[] T01VK3_A14472ItmSts ;
   private boolean[] T01VK3_n14472ItmSts ;
   private short[] T01VK3_A14473RetryQt ;
   private boolean[] T01VK3_n14473RetryQt ;
   private java.util.Date[] T01VK3_A14481ItmDtStart ;
   private boolean[] T01VK3_n14481ItmDtStart ;
   private java.util.Date[] T01VK3_A14482ItmDtEnd ;
   private boolean[] T01VK3_n14482ItmDtEnd ;
   private String[] T01VK3_A14486ItmErr ;
   private boolean[] T01VK3_n14486ItmErr ;
   private String[] T01VK3_A14474OutFile ;
   private boolean[] T01VK3_n14474OutFile ;
   private String[] T01VK3_A14476FileNm ;
   private boolean[] T01VK3_n14476FileNm ;
   private java.util.UUID[] T01VK3_A14423JobId ;
   private long[] T01VK8_A14468ItmId ;
   private java.util.UUID[] T01VK8_A14423JobId ;
   private long[] T01VK9_A14468ItmId ;
   private java.util.UUID[] T01VK9_A14423JobId ;
   private String[] T01VK2_A14475OutUrl ;
   private boolean[] T01VK2_n14475OutUrl ;
   private long[] T01VK2_A14468ItmId ;
   private long[] T01VK2_A14470DocId ;
   private boolean[] T01VK2_n14470DocId ;
   private String[] T01VK2_A14471DocLbl ;
   private boolean[] T01VK2_n14471DocLbl ;
   private String[] T01VK2_A14472ItmSts ;
   private boolean[] T01VK2_n14472ItmSts ;
   private short[] T01VK2_A14473RetryQt ;
   private boolean[] T01VK2_n14473RetryQt ;
   private java.util.Date[] T01VK2_A14481ItmDtStart ;
   private boolean[] T01VK2_n14481ItmDtStart ;
   private java.util.Date[] T01VK2_A14482ItmDtEnd ;
   private boolean[] T01VK2_n14482ItmDtEnd ;
   private String[] T01VK2_A14486ItmErr ;
   private boolean[] T01VK2_n14486ItmErr ;
   private String[] T01VK2_A14474OutFile ;
   private boolean[] T01VK2_n14474OutFile ;
   private String[] T01VK2_A14476FileNm ;
   private boolean[] T01VK2_n14476FileNm ;
   private java.util.UUID[] T01VK2_A14423JobId ;
   private String[] T01VK13_A14424JobType ;
   private boolean[] T01VK13_n14424JobType ;
   private long[] T01VK14_A14468ItmId ;
   private java.util.UUID[] T01VK14_A14423JobId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class jobitem__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class jobitem__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class jobitem__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class jobitem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VK2", "SELECT OutUrl, ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, FileNm, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ?  FOR UPDATE OF DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, OutUrl, FileNm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK3", "SELECT OutUrl, ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, FileNm, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK4", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK5", "SELECT /*+ FIRST_ROWS(100) */ TM1.OutUrl, TM1.ItmId, T2.JobType, TM1.DocId, TM1.DocLbl, TM1.ItmSts, TM1.RetryQt, TM1.ItmDtStart, TM1.ItmDtEnd, TM1.ItmErr, TM1.OutFile, TM1.FileNm, TM1.JobId FROM (TXPJOBITE TM1 INNER JOIN TXPJOB T2 ON T2.JobId = TM1.JobId) WHERE TM1.ItmId = ? and TM1.JobId = ? ORDER BY TM1.ItmId, TM1.JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK6", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK7", "SELECT /*+ FIRST_ROWS(1) */ ItmId, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ItmId, JobId FROM TXPJOBITE WHERE ( ItmId > ? or ItmId = ? and JobId > ?) ORDER BY ItmId, JobId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VK9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ItmId, JobId FROM TXPJOBITE WHERE ( ItmId < ? or ItmId = ? and JobId < ?) ORDER BY ItmId DESC, JobId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VK10", "INSERT INTO TXPJOBITE(ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, OutUrl, FileNm, JobId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJOBITE")
         ,new UpdateCursor("T01VK11", "UPDATE TXPJOBITE SET DocId=?, DocLbl=?, ItmSts=?, RetryQt=?, ItmDtStart=?, ItmDtEnd=?, ItmErr=?, OutFile=?, OutUrl=?, FileNm=?  WHERE ItmId = ? AND JobId = ?", GX_NOMASK, "TXPJOBITE")
         ,new UpdateCursor("T01VK12", "DELETE FROM TXPJOBITE  WHERE ItmId = ? AND JobId = ?", GX_NOMASK, "TXPJOBITE")
         ,new ForEachCursor("T01VK13", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VK14", "SELECT /*+ FIRST_ROWS(100) */ ItmId, JobId FROM TXPJOBITE ORDER BY ItmId, JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[21])[0] = rslt.getGUID(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[21])[0] = rslt.getGUID(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[23])[0] = rslt.getGUID(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
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
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 2 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 4 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setGUID(3, (java.util.UUID)parms[2]);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setGUID(3, (java.util.UUID)parms[2]);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 100);
               }
               stmt.setGUID(12, (java.util.UUID)parms[21]);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 100);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(9, (String)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 100);
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setGUID(12, (java.util.UUID)parms[21]);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 11 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

