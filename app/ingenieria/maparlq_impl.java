package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class maparlq_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAParLq Codifica los PLCs", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMAParLqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public maparlq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public maparlq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( maparlq_impl.class ));
   }

   public maparlq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MAParLq Codifica los PLCs", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MAParLq.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MAParLq.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqId_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqId_Internalname, GXutil.ltrim( localUtil.ntoc( A14815MAParLqId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAParLqId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14815MAParLqId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14815MAParLqId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "AnticipacionErrores\\Id", "right", false, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqCod_Internalname, httpContext.getMessage( "parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14816MAParLqCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMAParLqCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14816MAParLqCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14816MAParLqCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqDsc_Internalname, httpContext.getMessage( "Parametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqDsc_Internalname, A14817MAParLqDsc, GXutil.rtrim( localUtil.format( A14817MAParLqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqPLC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqPLC_Internalname, httpContext.getMessage( "c/PLC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqPLC_Internalname, A14818MAParLqPLC, GXutil.rtrim( localUtil.format( A14818MAParLqPLC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqPLC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqPLC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Descripcion", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqUsu_Internalname, GXutil.rtrim( A14819MAParLqUsu), GXutil.rtrim( localUtil.format( A14819MAParLqUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqIp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqIp_Internalname, httpContext.getMessage( "Ip", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqIp_Internalname, A14820MAParLqIp, GXutil.rtrim( localUtil.format( A14820MAParLqIp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqIp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqIp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Ip", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqReg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqReg_Internalname, httpContext.getMessage( "Registro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMAParLqReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqReg_Internalname, localUtil.ttoc( A14821MAParLqReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14821MAParLqReg, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqReg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqReg_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMAParLqReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMAParLqReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MAParLq.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqTkn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqTkn_Internalname, httpContext.getMessage( "Token", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMAParLqTkn_Internalname, A14822MAParLqTkn, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), 1, edtMAParLqTkn_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqHdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqHdr_Internalname, GXutil.rtrim( A14823MAParLqHdr), GXutil.rtrim( localUtil.format( A14823MAParLqHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqMaq_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqMaq_Internalname, GXutil.rtrim( A14824MAParLqMaq), GXutil.rtrim( localUtil.format( A14824MAParLqMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\MaqCod", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMAParLqFas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMAParLqFas_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMAParLqFas_Internalname, GXutil.rtrim( A14825MAParLqFas), GXutil.rtrim( localUtil.format( A14825MAParLqFas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMAParLqFas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMAParLqFas_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\FasCod", "left", true, "", "HLP_Ingenieria\\MAParLq.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MAParLq.htm");
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
         Z14815MAParLqId = localUtil.ctol( httpContext.cgiGet( "Z14815MAParLqId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14816MAParLqCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z14816MAParLqCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14817MAParLqDsc = httpContext.cgiGet( "Z14817MAParLqDsc") ;
         Z14818MAParLqPLC = httpContext.cgiGet( "Z14818MAParLqPLC") ;
         Z14819MAParLqUsu = httpContext.cgiGet( "Z14819MAParLqUsu") ;
         Z14820MAParLqIp = httpContext.cgiGet( "Z14820MAParLqIp") ;
         Z14821MAParLqReg = localUtil.ctot( httpContext.cgiGet( "Z14821MAParLqReg"), 0) ;
         Z14822MAParLqTkn = httpContext.cgiGet( "Z14822MAParLqTkn") ;
         Z14823MAParLqHdr = httpContext.cgiGet( "Z14823MAParLqHdr") ;
         Z14824MAParLqMaq = httpContext.cgiGet( "Z14824MAParLqMaq") ;
         Z14825MAParLqFas = httpContext.cgiGet( "Z14825MAParLqFas") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAParLqId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAParLqId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAPARLQID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAParLqId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14815MAParLqId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
         }
         else
         {
            A14815MAParLqId = localUtil.ctol( httpContext.cgiGet( edtMAParLqId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMAParLqCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMAParLqCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAPARLQCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAParLqCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14816MAParLqCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14816MAParLqCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14816MAParLqCod), 4, 0));
         }
         else
         {
            A14816MAParLqCod = (short)(localUtil.ctol( httpContext.cgiGet( edtMAParLqCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14816MAParLqCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14816MAParLqCod), 4, 0));
         }
         A14817MAParLqDsc = httpContext.cgiGet( edtMAParLqDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14817MAParLqDsc", A14817MAParLqDsc);
         A14818MAParLqPLC = httpContext.cgiGet( edtMAParLqPLC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14818MAParLqPLC", A14818MAParLqPLC);
         A14819MAParLqUsu = httpContext.cgiGet( edtMAParLqUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14819MAParLqUsu", A14819MAParLqUsu);
         A14820MAParLqIp = httpContext.cgiGet( edtMAParLqIp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14820MAParLqIp", A14820MAParLqIp);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMAParLqReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MAPARLQREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMAParLqReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14821MAParLqReg", localUtil.ttoc( A14821MAParLqReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14821MAParLqReg = localUtil.ctot( httpContext.cgiGet( edtMAParLqReg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14821MAParLqReg", localUtil.ttoc( A14821MAParLqReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A14822MAParLqTkn = httpContext.cgiGet( edtMAParLqTkn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14822MAParLqTkn", A14822MAParLqTkn);
         A14823MAParLqHdr = httpContext.cgiGet( edtMAParLqHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14823MAParLqHdr", A14823MAParLqHdr);
         A14824MAParLqMaq = httpContext.cgiGet( edtMAParLqMaq_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14824MAParLqMaq", A14824MAParLqMaq);
         A14825MAParLqFas = httpContext.cgiGet( edtMAParLqFas_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14825MAParLqFas", A14825MAParLqFas);
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
            A14815MAParLqId = GXutil.lval( httpContext.GetPar( "MAParLqId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
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
            initAll1WG1928( ) ;
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
      disableAttributes1WG1928( ) ;
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

   public void resetCaption1WG0( )
   {
   }

   public void zm1WG1928( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14816MAParLqCod = T01WG3_A14816MAParLqCod[0] ;
            Z14817MAParLqDsc = T01WG3_A14817MAParLqDsc[0] ;
            Z14818MAParLqPLC = T01WG3_A14818MAParLqPLC[0] ;
            Z14819MAParLqUsu = T01WG3_A14819MAParLqUsu[0] ;
            Z14820MAParLqIp = T01WG3_A14820MAParLqIp[0] ;
            Z14821MAParLqReg = T01WG3_A14821MAParLqReg[0] ;
            Z14822MAParLqTkn = T01WG3_A14822MAParLqTkn[0] ;
            Z14823MAParLqHdr = T01WG3_A14823MAParLqHdr[0] ;
            Z14824MAParLqMaq = T01WG3_A14824MAParLqMaq[0] ;
            Z14825MAParLqFas = T01WG3_A14825MAParLqFas[0] ;
         }
         else
         {
            Z14816MAParLqCod = A14816MAParLqCod ;
            Z14817MAParLqDsc = A14817MAParLqDsc ;
            Z14818MAParLqPLC = A14818MAParLqPLC ;
            Z14819MAParLqUsu = A14819MAParLqUsu ;
            Z14820MAParLqIp = A14820MAParLqIp ;
            Z14821MAParLqReg = A14821MAParLqReg ;
            Z14822MAParLqTkn = A14822MAParLqTkn ;
            Z14823MAParLqHdr = A14823MAParLqHdr ;
            Z14824MAParLqMaq = A14824MAParLqMaq ;
            Z14825MAParLqFas = A14825MAParLqFas ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14815MAParLqId = A14815MAParLqId ;
         Z14816MAParLqCod = A14816MAParLqCod ;
         Z14817MAParLqDsc = A14817MAParLqDsc ;
         Z14818MAParLqPLC = A14818MAParLqPLC ;
         Z14819MAParLqUsu = A14819MAParLqUsu ;
         Z14820MAParLqIp = A14820MAParLqIp ;
         Z14821MAParLqReg = A14821MAParLqReg ;
         Z14822MAParLqTkn = A14822MAParLqTkn ;
         Z14823MAParLqHdr = A14823MAParLqHdr ;
         Z14824MAParLqMaq = A14824MAParLqMaq ;
         Z14825MAParLqFas = A14825MAParLqFas ;
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

   public void load1WG1928( )
   {
      /* Using cursor T01WG4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14815MAParLqId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1928 = (short)(1) ;
         A14816MAParLqCod = T01WG4_A14816MAParLqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14816MAParLqCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14816MAParLqCod), 4, 0));
         A14817MAParLqDsc = T01WG4_A14817MAParLqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14817MAParLqDsc", A14817MAParLqDsc);
         A14818MAParLqPLC = T01WG4_A14818MAParLqPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14818MAParLqPLC", A14818MAParLqPLC);
         A14819MAParLqUsu = T01WG4_A14819MAParLqUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14819MAParLqUsu", A14819MAParLqUsu);
         A14820MAParLqIp = T01WG4_A14820MAParLqIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14820MAParLqIp", A14820MAParLqIp);
         A14821MAParLqReg = T01WG4_A14821MAParLqReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14821MAParLqReg", localUtil.ttoc( A14821MAParLqReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14822MAParLqTkn = T01WG4_A14822MAParLqTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14822MAParLqTkn", A14822MAParLqTkn);
         A14823MAParLqHdr = T01WG4_A14823MAParLqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14823MAParLqHdr", A14823MAParLqHdr);
         A14824MAParLqMaq = T01WG4_A14824MAParLqMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14824MAParLqMaq", A14824MAParLqMaq);
         A14825MAParLqFas = T01WG4_A14825MAParLqFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14825MAParLqFas", A14825MAParLqFas);
         zm1WG1928( -1) ;
      }
      pr_default.close(2);
      onLoadActions1WG1928( ) ;
   }

   public void onLoadActions1WG1928( )
   {
   }

   public void checkExtendedTable1WG1928( )
   {
      nIsDirty_1928 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1WG1928( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1WG1928( )
   {
      /* Using cursor T01WG5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14815MAParLqId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1928 = (short)(1) ;
      }
      else
      {
         RcdFound1928 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01WG3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A14815MAParLqId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1WG1928( 1) ;
         RcdFound1928 = (short)(1) ;
         A14815MAParLqId = T01WG3_A14815MAParLqId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
         A14816MAParLqCod = T01WG3_A14816MAParLqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14816MAParLqCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14816MAParLqCod), 4, 0));
         A14817MAParLqDsc = T01WG3_A14817MAParLqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14817MAParLqDsc", A14817MAParLqDsc);
         A14818MAParLqPLC = T01WG3_A14818MAParLqPLC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14818MAParLqPLC", A14818MAParLqPLC);
         A14819MAParLqUsu = T01WG3_A14819MAParLqUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14819MAParLqUsu", A14819MAParLqUsu);
         A14820MAParLqIp = T01WG3_A14820MAParLqIp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14820MAParLqIp", A14820MAParLqIp);
         A14821MAParLqReg = T01WG3_A14821MAParLqReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14821MAParLqReg", localUtil.ttoc( A14821MAParLqReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14822MAParLqTkn = T01WG3_A14822MAParLqTkn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14822MAParLqTkn", A14822MAParLqTkn);
         A14823MAParLqHdr = T01WG3_A14823MAParLqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14823MAParLqHdr", A14823MAParLqHdr);
         A14824MAParLqMaq = T01WG3_A14824MAParLqMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14824MAParLqMaq", A14824MAParLqMaq);
         A14825MAParLqFas = T01WG3_A14825MAParLqFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14825MAParLqFas", A14825MAParLqFas);
         Z14815MAParLqId = A14815MAParLqId ;
         sMode1928 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1WG1928( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1928 = (short)(0) ;
            initializeNonKey1WG1928( ) ;
         }
         Gx_mode = sMode1928 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1928 = (short)(0) ;
         initializeNonKey1WG1928( ) ;
         sMode1928 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1928 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1WG1928( ) ;
      if ( RcdFound1928 == 0 )
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
      RcdFound1928 = (short)(0) ;
      /* Using cursor T01WG6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14815MAParLqId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01WG6_A14815MAParLqId[0] < A14815MAParLqId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01WG6_A14815MAParLqId[0] > A14815MAParLqId ) ) )
         {
            A14815MAParLqId = T01WG6_A14815MAParLqId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
            RcdFound1928 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1928 = (short)(0) ;
      /* Using cursor T01WG7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14815MAParLqId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01WG7_A14815MAParLqId[0] > A14815MAParLqId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01WG7_A14815MAParLqId[0] < A14815MAParLqId ) ) )
         {
            A14815MAParLqId = T01WG7_A14815MAParLqId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
            RcdFound1928 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1WG1928( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMAParLqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1WG1928( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1928 == 1 )
         {
            if ( A14815MAParLqId != Z14815MAParLqId )
            {
               A14815MAParLqId = Z14815MAParLqId ;
               httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MAPARLQID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMAParLqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMAParLqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1WG1928( ) ;
               GX_FocusControl = edtMAParLqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14815MAParLqId != Z14815MAParLqId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMAParLqId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1WG1928( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MAPARLQID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMAParLqId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMAParLqId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1WG1928( ) ;
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
      if ( A14815MAParLqId != Z14815MAParLqId )
      {
         A14815MAParLqId = Z14815MAParLqId ;
         httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MAPARLQID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAParLqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMAParLqId_Internalname ;
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
      if ( RcdFound1928 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MAPARLQID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMAParLqId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMAParLqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1WG1928( ) ;
      if ( RcdFound1928 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAParLqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WG1928( ) ;
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
      if ( RcdFound1928 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAParLqCod_Internalname ;
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
      if ( RcdFound1928 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAParLqCod_Internalname ;
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
      scanStart1WG1928( ) ;
      if ( RcdFound1928 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1928 != 0 )
         {
            scanNext1WG1928( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMAParLqCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1WG1928( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1WG1928( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01WG2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A14815MAParLqId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAParLq"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z14816MAParLqCod != T01WG2_A14816MAParLqCod[0] ) || ( GXutil.strcmp(Z14817MAParLqDsc, T01WG2_A14817MAParLqDsc[0]) != 0 ) || ( GXutil.strcmp(Z14818MAParLqPLC, T01WG2_A14818MAParLqPLC[0]) != 0 ) || ( GXutil.strcmp(Z14819MAParLqUsu, T01WG2_A14819MAParLqUsu[0]) != 0 ) || ( GXutil.strcmp(Z14820MAParLqIp, T01WG2_A14820MAParLqIp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14821MAParLqReg, T01WG2_A14821MAParLqReg[0]) ) || ( GXutil.strcmp(Z14822MAParLqTkn, T01WG2_A14822MAParLqTkn[0]) != 0 ) || ( GXutil.strcmp(Z14823MAParLqHdr, T01WG2_A14823MAParLqHdr[0]) != 0 ) || ( GXutil.strcmp(Z14824MAParLqMaq, T01WG2_A14824MAParLqMaq[0]) != 0 ) || ( GXutil.strcmp(Z14825MAParLqFas, T01WG2_A14825MAParLqFas[0]) != 0 ) )
         {
            if ( Z14816MAParLqCod != T01WG2_A14816MAParLqCod[0] )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqCod");
               GXutil.writeLogRaw("Old: ",Z14816MAParLqCod);
               GXutil.writeLogRaw("Current: ",T01WG2_A14816MAParLqCod[0]);
            }
            if ( GXutil.strcmp(Z14817MAParLqDsc, T01WG2_A14817MAParLqDsc[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqDsc");
               GXutil.writeLogRaw("Old: ",Z14817MAParLqDsc);
               GXutil.writeLogRaw("Current: ",T01WG2_A14817MAParLqDsc[0]);
            }
            if ( GXutil.strcmp(Z14818MAParLqPLC, T01WG2_A14818MAParLqPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqPLC");
               GXutil.writeLogRaw("Old: ",Z14818MAParLqPLC);
               GXutil.writeLogRaw("Current: ",T01WG2_A14818MAParLqPLC[0]);
            }
            if ( GXutil.strcmp(Z14819MAParLqUsu, T01WG2_A14819MAParLqUsu[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqUsu");
               GXutil.writeLogRaw("Old: ",Z14819MAParLqUsu);
               GXutil.writeLogRaw("Current: ",T01WG2_A14819MAParLqUsu[0]);
            }
            if ( GXutil.strcmp(Z14820MAParLqIp, T01WG2_A14820MAParLqIp[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqIp");
               GXutil.writeLogRaw("Old: ",Z14820MAParLqIp);
               GXutil.writeLogRaw("Current: ",T01WG2_A14820MAParLqIp[0]);
            }
            if ( !( GXutil.dateCompare(Z14821MAParLqReg, T01WG2_A14821MAParLqReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqReg");
               GXutil.writeLogRaw("Old: ",Z14821MAParLqReg);
               GXutil.writeLogRaw("Current: ",T01WG2_A14821MAParLqReg[0]);
            }
            if ( GXutil.strcmp(Z14822MAParLqTkn, T01WG2_A14822MAParLqTkn[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqTkn");
               GXutil.writeLogRaw("Old: ",Z14822MAParLqTkn);
               GXutil.writeLogRaw("Current: ",T01WG2_A14822MAParLqTkn[0]);
            }
            if ( GXutil.strcmp(Z14823MAParLqHdr, T01WG2_A14823MAParLqHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqHdr");
               GXutil.writeLogRaw("Old: ",Z14823MAParLqHdr);
               GXutil.writeLogRaw("Current: ",T01WG2_A14823MAParLqHdr[0]);
            }
            if ( GXutil.strcmp(Z14824MAParLqMaq, T01WG2_A14824MAParLqMaq[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqMaq");
               GXutil.writeLogRaw("Old: ",Z14824MAParLqMaq);
               GXutil.writeLogRaw("Current: ",T01WG2_A14824MAParLqMaq[0]);
            }
            if ( GXutil.strcmp(Z14825MAParLqFas, T01WG2_A14825MAParLqFas[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.maparlq:[seudo value changed for attri]"+"MAParLqFas");
               GXutil.writeLogRaw("Old: ",Z14825MAParLqFas);
               GXutil.writeLogRaw("Current: ",T01WG2_A14825MAParLqFas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"MAParLq"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1WG1928( )
   {
      beforeValidate1WG1928( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WG1928( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1WG1928( 0) ;
         checkOptimisticConcurrency1WG1928( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WG1928( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1WG1928( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WG8 */
                  pr_default.execute(6, new Object[] {Short.valueOf(A14816MAParLqCod), A14817MAParLqDsc, A14818MAParLqPLC, A14819MAParLqUsu, A14820MAParLqIp, A14821MAParLqReg, A14822MAParLqTkn, A14823MAParLqHdr, A14824MAParLqMaq, A14825MAParLqFas});
                  /* Retrieving last key number assigned */
                  /* Using cursor T01WG9 */
                  pr_default.execute(7);
                  A14815MAParLqId = T01WG9_A14815MAParLqId[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAParLq");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1WG0( ) ;
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
            load1WG1928( ) ;
         }
         endLevel1WG1928( ) ;
      }
      closeExtendedTableCursors1WG1928( ) ;
   }

   public void update1WG1928( )
   {
      beforeValidate1WG1928( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1WG1928( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WG1928( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1WG1928( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1WG1928( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01WG10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A14816MAParLqCod), A14817MAParLqDsc, A14818MAParLqPLC, A14819MAParLqUsu, A14820MAParLqIp, A14821MAParLqReg, A14822MAParLqTkn, A14823MAParLqHdr, A14824MAParLqMaq, A14825MAParLqFas, Long.valueOf(A14815MAParLqId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("MAParLq");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"MAParLq"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1WG1928( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1WG0( ) ;
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
         endLevel1WG1928( ) ;
      }
      closeExtendedTableCursors1WG1928( ) ;
   }

   public void deferredUpdate1WG1928( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1WG1928( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1WG1928( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1WG1928( ) ;
         afterConfirm1WG1928( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1WG1928( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01WG11 */
               pr_default.execute(9, new Object[] {Long.valueOf(A14815MAParLqId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("MAParLq");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1928 == 0 )
                     {
                        initAll1WG1928( ) ;
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
                     resetCaption1WG0( ) ;
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
      sMode1928 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1WG1928( ) ;
      Gx_mode = sMode1928 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1WG1928( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1WG1928( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1WG1928( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.maparlq");
         if ( AnyError == 0 )
         {
            confirmValues1WG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.maparlq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1WG1928( )
   {
      /* Using cursor T01WG12 */
      pr_default.execute(10);
      RcdFound1928 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1928 = (short)(1) ;
         A14815MAParLqId = T01WG12_A14815MAParLqId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1WG1928( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1928 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1928 = (short)(1) ;
         A14815MAParLqId = T01WG12_A14815MAParLqId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
      }
   }

   public void scanEnd1WG1928( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1WG1928( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1WG1928( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1WG1928( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1WG1928( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1WG1928( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1WG1928( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1WG1928( )
   {
      edtMAParLqId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqId_Enabled), 5, 0), true);
      edtMAParLqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqCod_Enabled), 5, 0), true);
      edtMAParLqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqDsc_Enabled), 5, 0), true);
      edtMAParLqPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqPLC_Enabled), 5, 0), true);
      edtMAParLqUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqUsu_Enabled), 5, 0), true);
      edtMAParLqIp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqIp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqIp_Enabled), 5, 0), true);
      edtMAParLqReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqReg_Enabled), 5, 0), true);
      edtMAParLqTkn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqTkn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqTkn_Enabled), 5, 0), true);
      edtMAParLqHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqHdr_Enabled), 5, 0), true);
      edtMAParLqMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqMaq_Enabled), 5, 0), true);
      edtMAParLqFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMAParLqFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMAParLqFas_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1WG1928( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1WG0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.maparlq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14815MAParLqId", GXutil.ltrim( localUtil.ntoc( Z14815MAParLqId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14816MAParLqCod", GXutil.ltrim( localUtil.ntoc( Z14816MAParLqCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14817MAParLqDsc", Z14817MAParLqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14818MAParLqPLC", Z14818MAParLqPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14819MAParLqUsu", GXutil.rtrim( Z14819MAParLqUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14820MAParLqIp", Z14820MAParLqIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14821MAParLqReg", localUtil.ttoc( Z14821MAParLqReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14822MAParLqTkn", Z14822MAParLqTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14823MAParLqHdr", GXutil.rtrim( Z14823MAParLqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14824MAParLqMaq", GXutil.rtrim( Z14824MAParLqMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14825MAParLqFas", GXutil.rtrim( Z14825MAParLqFas));
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
      return formatLink("app.ingenieria.maparlq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MAParLq" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAParLq Codifica los PLCs", "") ;
   }

   public void initializeNonKey1WG1928( )
   {
      A14816MAParLqCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14816MAParLqCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14816MAParLqCod), 4, 0));
      A14817MAParLqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14817MAParLqDsc", A14817MAParLqDsc);
      A14818MAParLqPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14818MAParLqPLC", A14818MAParLqPLC);
      A14819MAParLqUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14819MAParLqUsu", A14819MAParLqUsu);
      A14820MAParLqIp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14820MAParLqIp", A14820MAParLqIp);
      A14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14821MAParLqReg", localUtil.ttoc( A14821MAParLqReg, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14822MAParLqTkn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14822MAParLqTkn", A14822MAParLqTkn);
      A14823MAParLqHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14823MAParLqHdr", A14823MAParLqHdr);
      A14824MAParLqMaq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14824MAParLqMaq", A14824MAParLqMaq);
      A14825MAParLqFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14825MAParLqFas", A14825MAParLqFas);
      Z14816MAParLqCod = (short)(0) ;
      Z14817MAParLqDsc = "" ;
      Z14818MAParLqPLC = "" ;
      Z14819MAParLqUsu = "" ;
      Z14820MAParLqIp = "" ;
      Z14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
      Z14822MAParLqTkn = "" ;
      Z14823MAParLqHdr = "" ;
      Z14824MAParLqMaq = "" ;
      Z14825MAParLqFas = "" ;
   }

   public void initAll1WG1928( )
   {
      A14815MAParLqId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14815MAParLqId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14815MAParLqId), 10, 0));
      initializeNonKey1WG1928( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267241411386", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/maparlq.js", "?20267241411387", false, true);
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
      edtMAParLqId_Internalname = "MAPARLQID" ;
      edtMAParLqCod_Internalname = "MAPARLQCOD" ;
      edtMAParLqDsc_Internalname = "MAPARLQDSC" ;
      edtMAParLqPLC_Internalname = "MAPARLQPLC" ;
      edtMAParLqUsu_Internalname = "MAPARLQUSU" ;
      edtMAParLqIp_Internalname = "MAPARLQIP" ;
      edtMAParLqReg_Internalname = "MAPARLQREG" ;
      edtMAParLqTkn_Internalname = "MAPARLQTKN" ;
      edtMAParLqHdr_Internalname = "MAPARLQHDR" ;
      edtMAParLqMaq_Internalname = "MAPARLQMAQ" ;
      edtMAParLqFas_Internalname = "MAPARLQFAS" ;
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
      Form.setCaption( httpContext.getMessage( "MAParLq Codifica los PLCs", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMAParLqFas_Jsonclick = "" ;
      edtMAParLqFas_Enabled = 1 ;
      edtMAParLqMaq_Jsonclick = "" ;
      edtMAParLqMaq_Enabled = 1 ;
      edtMAParLqHdr_Jsonclick = "" ;
      edtMAParLqHdr_Enabled = 1 ;
      edtMAParLqTkn_Enabled = 1 ;
      edtMAParLqReg_Jsonclick = "" ;
      edtMAParLqReg_Enabled = 1 ;
      edtMAParLqIp_Jsonclick = "" ;
      edtMAParLqIp_Enabled = 1 ;
      edtMAParLqUsu_Jsonclick = "" ;
      edtMAParLqUsu_Enabled = 1 ;
      edtMAParLqPLC_Jsonclick = "" ;
      edtMAParLqPLC_Enabled = 1 ;
      edtMAParLqDsc_Jsonclick = "" ;
      edtMAParLqDsc_Enabled = 1 ;
      edtMAParLqCod_Jsonclick = "" ;
      edtMAParLqCod_Enabled = 1 ;
      edtMAParLqId_Jsonclick = "" ;
      edtMAParLqId_Enabled = 1 ;
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
      GX_FocusControl = edtMAParLqCod_Internalname ;
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

   public void valid_Maparlqid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14816MAParLqCod", GXutil.ltrim( localUtil.ntoc( A14816MAParLqCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14817MAParLqDsc", A14817MAParLqDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A14818MAParLqPLC", A14818MAParLqPLC);
      httpContext.ajax_rsp_assign_attri("", false, "A14819MAParLqUsu", GXutil.rtrim( A14819MAParLqUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A14820MAParLqIp", A14820MAParLqIp);
      httpContext.ajax_rsp_assign_attri("", false, "A14821MAParLqReg", localUtil.ttoc( A14821MAParLqReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14822MAParLqTkn", A14822MAParLqTkn);
      httpContext.ajax_rsp_assign_attri("", false, "A14823MAParLqHdr", GXutil.rtrim( A14823MAParLqHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A14824MAParLqMaq", GXutil.rtrim( A14824MAParLqMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A14825MAParLqFas", GXutil.rtrim( A14825MAParLqFas));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14815MAParLqId", GXutil.ltrim( localUtil.ntoc( Z14815MAParLqId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14816MAParLqCod", GXutil.ltrim( localUtil.ntoc( Z14816MAParLqCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14817MAParLqDsc", Z14817MAParLqDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14818MAParLqPLC", Z14818MAParLqPLC);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14819MAParLqUsu", GXutil.rtrim( Z14819MAParLqUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14820MAParLqIp", Z14820MAParLqIp);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14821MAParLqReg", localUtil.ttoc( Z14821MAParLqReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14822MAParLqTkn", Z14822MAParLqTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14823MAParLqHdr", GXutil.rtrim( Z14823MAParLqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14824MAParLqMaq", GXutil.rtrim( Z14824MAParLqMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14825MAParLqFas", GXutil.rtrim( Z14825MAParLqFas));
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
      setEventMetadata("VALID_MAPARLQID","{handler:'valid_Maparlqid',iparms:[{av:'A14815MAParLqId',fld:'MAPARLQID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAPARLQID",",oparms:[{av:'A14816MAParLqCod',fld:'MAPARLQCOD',pic:'ZZZ9'},{av:'A14817MAParLqDsc',fld:'MAPARLQDSC',pic:''},{av:'A14818MAParLqPLC',fld:'MAPARLQPLC',pic:''},{av:'A14819MAParLqUsu',fld:'MAPARLQUSU',pic:''},{av:'A14820MAParLqIp',fld:'MAPARLQIP',pic:''},{av:'A14821MAParLqReg',fld:'MAPARLQREG',pic:'99/99/99 99:99:99.999'},{av:'A14822MAParLqTkn',fld:'MAPARLQTKN',pic:''},{av:'A14823MAParLqHdr',fld:'MAPARLQHDR',pic:''},{av:'A14824MAParLqMaq',fld:'MAPARLQMAQ',pic:''},{av:'A14825MAParLqFas',fld:'MAPARLQFAS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14815MAParLqId'},{av:'Z14816MAParLqCod'},{av:'Z14817MAParLqDsc'},{av:'Z14818MAParLqPLC'},{av:'Z14819MAParLqUsu'},{av:'Z14820MAParLqIp'},{av:'Z14821MAParLqReg'},{av:'Z14822MAParLqTkn'},{av:'Z14823MAParLqHdr'},{av:'Z14824MAParLqMaq'},{av:'Z14825MAParLqFas'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z14817MAParLqDsc = "" ;
      Z14818MAParLqPLC = "" ;
      Z14819MAParLqUsu = "" ;
      Z14820MAParLqIp = "" ;
      Z14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
      Z14822MAParLqTkn = "" ;
      Z14823MAParLqHdr = "" ;
      Z14824MAParLqMaq = "" ;
      Z14825MAParLqFas = "" ;
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
      A14817MAParLqDsc = "" ;
      A14818MAParLqPLC = "" ;
      A14819MAParLqUsu = "" ;
      A14820MAParLqIp = "" ;
      A14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
      A14822MAParLqTkn = "" ;
      A14823MAParLqHdr = "" ;
      A14824MAParLqMaq = "" ;
      A14825MAParLqFas = "" ;
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
      T01WG4_A14815MAParLqId = new long[1] ;
      T01WG4_A14816MAParLqCod = new short[1] ;
      T01WG4_A14817MAParLqDsc = new String[] {""} ;
      T01WG4_A14818MAParLqPLC = new String[] {""} ;
      T01WG4_A14819MAParLqUsu = new String[] {""} ;
      T01WG4_A14820MAParLqIp = new String[] {""} ;
      T01WG4_A14821MAParLqReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WG4_A14822MAParLqTkn = new String[] {""} ;
      T01WG4_A14823MAParLqHdr = new String[] {""} ;
      T01WG4_A14824MAParLqMaq = new String[] {""} ;
      T01WG4_A14825MAParLqFas = new String[] {""} ;
      T01WG5_A14815MAParLqId = new long[1] ;
      T01WG3_A14815MAParLqId = new long[1] ;
      T01WG3_A14816MAParLqCod = new short[1] ;
      T01WG3_A14817MAParLqDsc = new String[] {""} ;
      T01WG3_A14818MAParLqPLC = new String[] {""} ;
      T01WG3_A14819MAParLqUsu = new String[] {""} ;
      T01WG3_A14820MAParLqIp = new String[] {""} ;
      T01WG3_A14821MAParLqReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WG3_A14822MAParLqTkn = new String[] {""} ;
      T01WG3_A14823MAParLqHdr = new String[] {""} ;
      T01WG3_A14824MAParLqMaq = new String[] {""} ;
      T01WG3_A14825MAParLqFas = new String[] {""} ;
      sMode1928 = "" ;
      T01WG6_A14815MAParLqId = new long[1] ;
      T01WG7_A14815MAParLqId = new long[1] ;
      T01WG2_A14815MAParLqId = new long[1] ;
      T01WG2_A14816MAParLqCod = new short[1] ;
      T01WG2_A14817MAParLqDsc = new String[] {""} ;
      T01WG2_A14818MAParLqPLC = new String[] {""} ;
      T01WG2_A14819MAParLqUsu = new String[] {""} ;
      T01WG2_A14820MAParLqIp = new String[] {""} ;
      T01WG2_A14821MAParLqReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01WG2_A14822MAParLqTkn = new String[] {""} ;
      T01WG2_A14823MAParLqHdr = new String[] {""} ;
      T01WG2_A14824MAParLqMaq = new String[] {""} ;
      T01WG2_A14825MAParLqFas = new String[] {""} ;
      T01WG9_A14815MAParLqId = new long[1] ;
      T01WG12_A14815MAParLqId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14817MAParLqDsc = "" ;
      ZZ14818MAParLqPLC = "" ;
      ZZ14819MAParLqUsu = "" ;
      ZZ14820MAParLqIp = "" ;
      ZZ14821MAParLqReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ14822MAParLqTkn = "" ;
      ZZ14823MAParLqHdr = "" ;
      ZZ14824MAParLqMaq = "" ;
      ZZ14825MAParLqFas = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.maparlq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.maparlq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.maparlq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.maparlq__default(),
         new Object[] {
             new Object[] {
            T01WG2_A14815MAParLqId, T01WG2_A14816MAParLqCod, T01WG2_A14817MAParLqDsc, T01WG2_A14818MAParLqPLC, T01WG2_A14819MAParLqUsu, T01WG2_A14820MAParLqIp, T01WG2_A14821MAParLqReg, T01WG2_A14822MAParLqTkn, T01WG2_A14823MAParLqHdr, T01WG2_A14824MAParLqMaq,
            T01WG2_A14825MAParLqFas
            }
            , new Object[] {
            T01WG3_A14815MAParLqId, T01WG3_A14816MAParLqCod, T01WG3_A14817MAParLqDsc, T01WG3_A14818MAParLqPLC, T01WG3_A14819MAParLqUsu, T01WG3_A14820MAParLqIp, T01WG3_A14821MAParLqReg, T01WG3_A14822MAParLqTkn, T01WG3_A14823MAParLqHdr, T01WG3_A14824MAParLqMaq,
            T01WG3_A14825MAParLqFas
            }
            , new Object[] {
            T01WG4_A14815MAParLqId, T01WG4_A14816MAParLqCod, T01WG4_A14817MAParLqDsc, T01WG4_A14818MAParLqPLC, T01WG4_A14819MAParLqUsu, T01WG4_A14820MAParLqIp, T01WG4_A14821MAParLqReg, T01WG4_A14822MAParLqTkn, T01WG4_A14823MAParLqHdr, T01WG4_A14824MAParLqMaq,
            T01WG4_A14825MAParLqFas
            }
            , new Object[] {
            T01WG5_A14815MAParLqId
            }
            , new Object[] {
            T01WG6_A14815MAParLqId
            }
            , new Object[] {
            T01WG7_A14815MAParLqId
            }
            , new Object[] {
            }
            , new Object[] {
            T01WG9_A14815MAParLqId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01WG12_A14815MAParLqId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14816MAParLqCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14816MAParLqCod ;
   private short RcdFound1928 ;
   private short nIsDirty_1928 ;
   private short ZZ14816MAParLqCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMAParLqId_Enabled ;
   private int edtMAParLqCod_Enabled ;
   private int edtMAParLqDsc_Enabled ;
   private int edtMAParLqPLC_Enabled ;
   private int edtMAParLqUsu_Enabled ;
   private int edtMAParLqIp_Enabled ;
   private int edtMAParLqReg_Enabled ;
   private int edtMAParLqTkn_Enabled ;
   private int edtMAParLqHdr_Enabled ;
   private int edtMAParLqMaq_Enabled ;
   private int edtMAParLqFas_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z14815MAParLqId ;
   private long A14815MAParLqId ;
   private long ZZ14815MAParLqId ;
   private String sPrefix ;
   private String Z14819MAParLqUsu ;
   private String Z14823MAParLqHdr ;
   private String Z14824MAParLqMaq ;
   private String Z14825MAParLqFas ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMAParLqId_Internalname ;
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
   private String edtMAParLqId_Jsonclick ;
   private String edtMAParLqCod_Internalname ;
   private String edtMAParLqCod_Jsonclick ;
   private String edtMAParLqDsc_Internalname ;
   private String edtMAParLqDsc_Jsonclick ;
   private String edtMAParLqPLC_Internalname ;
   private String edtMAParLqPLC_Jsonclick ;
   private String edtMAParLqUsu_Internalname ;
   private String A14819MAParLqUsu ;
   private String edtMAParLqUsu_Jsonclick ;
   private String edtMAParLqIp_Internalname ;
   private String edtMAParLqIp_Jsonclick ;
   private String edtMAParLqReg_Internalname ;
   private String edtMAParLqReg_Jsonclick ;
   private String edtMAParLqTkn_Internalname ;
   private String edtMAParLqHdr_Internalname ;
   private String A14823MAParLqHdr ;
   private String edtMAParLqHdr_Jsonclick ;
   private String edtMAParLqMaq_Internalname ;
   private String A14824MAParLqMaq ;
   private String edtMAParLqMaq_Jsonclick ;
   private String edtMAParLqFas_Internalname ;
   private String A14825MAParLqFas ;
   private String edtMAParLqFas_Jsonclick ;
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
   private String sMode1928 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ14819MAParLqUsu ;
   private String ZZ14823MAParLqHdr ;
   private String ZZ14824MAParLqMaq ;
   private String ZZ14825MAParLqFas ;
   private java.util.Date Z14821MAParLqReg ;
   private java.util.Date A14821MAParLqReg ;
   private java.util.Date ZZ14821MAParLqReg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private String Z14817MAParLqDsc ;
   private String Z14818MAParLqPLC ;
   private String Z14820MAParLqIp ;
   private String Z14822MAParLqTkn ;
   private String A14817MAParLqDsc ;
   private String A14818MAParLqPLC ;
   private String A14820MAParLqIp ;
   private String A14822MAParLqTkn ;
   private String ZZ14817MAParLqDsc ;
   private String ZZ14818MAParLqPLC ;
   private String ZZ14820MAParLqIp ;
   private String ZZ14822MAParLqTkn ;
   private IDataStoreProvider pr_default ;
   private long[] T01WG4_A14815MAParLqId ;
   private short[] T01WG4_A14816MAParLqCod ;
   private String[] T01WG4_A14817MAParLqDsc ;
   private String[] T01WG4_A14818MAParLqPLC ;
   private String[] T01WG4_A14819MAParLqUsu ;
   private String[] T01WG4_A14820MAParLqIp ;
   private java.util.Date[] T01WG4_A14821MAParLqReg ;
   private String[] T01WG4_A14822MAParLqTkn ;
   private String[] T01WG4_A14823MAParLqHdr ;
   private String[] T01WG4_A14824MAParLqMaq ;
   private String[] T01WG4_A14825MAParLqFas ;
   private long[] T01WG5_A14815MAParLqId ;
   private long[] T01WG3_A14815MAParLqId ;
   private short[] T01WG3_A14816MAParLqCod ;
   private String[] T01WG3_A14817MAParLqDsc ;
   private String[] T01WG3_A14818MAParLqPLC ;
   private String[] T01WG3_A14819MAParLqUsu ;
   private String[] T01WG3_A14820MAParLqIp ;
   private java.util.Date[] T01WG3_A14821MAParLqReg ;
   private String[] T01WG3_A14822MAParLqTkn ;
   private String[] T01WG3_A14823MAParLqHdr ;
   private String[] T01WG3_A14824MAParLqMaq ;
   private String[] T01WG3_A14825MAParLqFas ;
   private long[] T01WG6_A14815MAParLqId ;
   private long[] T01WG7_A14815MAParLqId ;
   private long[] T01WG2_A14815MAParLqId ;
   private short[] T01WG2_A14816MAParLqCod ;
   private String[] T01WG2_A14817MAParLqDsc ;
   private String[] T01WG2_A14818MAParLqPLC ;
   private String[] T01WG2_A14819MAParLqUsu ;
   private String[] T01WG2_A14820MAParLqIp ;
   private java.util.Date[] T01WG2_A14821MAParLqReg ;
   private String[] T01WG2_A14822MAParLqTkn ;
   private String[] T01WG2_A14823MAParLqHdr ;
   private String[] T01WG2_A14824MAParLqMaq ;
   private String[] T01WG2_A14825MAParLqFas ;
   private long[] T01WG9_A14815MAParLqId ;
   private long[] T01WG12_A14815MAParLqId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class maparlq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class maparlq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class maparlq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class maparlq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01WG2", "SELECT MAParLqId, MAParLqCod, MAParLqDsc, MAParLqPLC, MAParLqUsu, MAParLqIp, MAParLqReg, MAParLqTkn, MAParLqHdr, MAParLqMaq, MAParLqFas FROM MAParLq WHERE MAParLqId = ?  FOR UPDATE OF MAParLqCod, MAParLqDsc, MAParLqPLC, MAParLqUsu, MAParLqIp, MAParLqReg, MAParLqTkn, MAParLqHdr, MAParLqMaq, MAParLqFas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WG3", "SELECT MAParLqId, MAParLqCod, MAParLqDsc, MAParLqPLC, MAParLqUsu, MAParLqIp, MAParLqReg, MAParLqTkn, MAParLqHdr, MAParLqMaq, MAParLqFas FROM MAParLq WHERE MAParLqId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WG4", "SELECT /*+ FIRST_ROWS(100) */ TM1.MAParLqId, TM1.MAParLqCod, TM1.MAParLqDsc, TM1.MAParLqPLC, TM1.MAParLqUsu, TM1.MAParLqIp, TM1.MAParLqReg, TM1.MAParLqTkn, TM1.MAParLqHdr, TM1.MAParLqMaq, TM1.MAParLqFas FROM MAParLq TM1 WHERE TM1.MAParLqId = ? ORDER BY TM1.MAParLqId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WG5", "SELECT /*+ FIRST_ROWS(1) */ MAParLqId FROM MAParLq WHERE MAParLqId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01WG6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAParLqId FROM MAParLq WHERE ( MAParLqId > ?) ORDER BY MAParLqId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01WG7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MAParLqId FROM MAParLq WHERE ( MAParLqId < ?) ORDER BY MAParLqId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01WG8", "INSERT INTO MAParLq(MAParLqCod, MAParLqDsc, MAParLqPLC, MAParLqUsu, MAParLqIp, MAParLqReg, MAParLqTkn, MAParLqHdr, MAParLqMaq, MAParLqFas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "MAParLq")
         ,new ForEachCursor("T01WG9", "SELECT MAParLqId.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01WG10", "UPDATE MAParLq SET MAParLqCod=?, MAParLqDsc=?, MAParLqPLC=?, MAParLqUsu=?, MAParLqIp=?, MAParLqReg=?, MAParLqTkn=?, MAParLqHdr=?, MAParLqMaq=?, MAParLqFas=?  WHERE MAParLqId = ?", GX_NOMASK, "MAParLq")
         ,new UpdateCursor("T01WG11", "DELETE FROM MAParLq  WHERE MAParLqId = ?", GX_NOMASK, "MAParLq")
         ,new ForEachCursor("T01WG12", "SELECT /*+ FIRST_ROWS(100) */ MAParLqId FROM MAParLq ORDER BY MAParLqId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7, true);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(7, (String)parms[6], 256, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 100, false);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false, true);
               stmt.setVarchar(7, (String)parms[6], 256, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

