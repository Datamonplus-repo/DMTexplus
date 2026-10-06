package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrepc1_impl extends GXDataArea
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
         A11055MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A11055MComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A9492MRCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla MRep C1 (Compras, repuestos)", ""), (short)(0)) ;
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

   public mrepc1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrepc1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrepc1_impl.class ));
   }

   public mrepc1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla MRep C1 (Compras, repuestos)", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_MRepC1.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MRepC1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComCod_Internalname, httpContext.getMessage( "Compra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMComCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMComCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRCod_Internalname, httpContext.getMessage( "Repuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRNom_Internalname, httpContext.getMessage( "Nombre Repuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRNom_Internalname, GXutil.rtrim( A9493MRNom), GXutil.rtrim( localUtil.format( A9493MRNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRNom_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRCNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRCNom_Internalname, httpContext.getMessage( "Codigo y Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMRCNom_Internalname, A13718MRCNom, "", "", (short)(0), 1, edtMRCNom_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComSolCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComSolCnt_Internalname, httpContext.getMessage( "Cantidad Solicitada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComSolCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMComSolCnt_Enabled!=0) ? localUtil.format( A11051MComSolCnt, "ZZZZZ9.99") : localUtil.format( A11051MComSolCnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComSolCnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMComSolCnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComSolPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComSolPre_Internalname, httpContext.getMessage( "Precio Solicitado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComSolPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMComSolPre_Enabled!=0) ? localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999") : localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComSolPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMComSolPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComEntCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComEntCnt_Internalname, httpContext.getMessage( "Cantidad Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComEntCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMComEntCnt_Enabled!=0) ? localUtil.format( A11053MComEntCnt, "ZZZZZ9.99") : localUtil.format( A11053MComEntCnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComEntCnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMComEntCnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMComEntPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMComEntPre_Internalname, httpContext.getMessage( "Precio entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMComEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMComEntPre_Enabled!=0) ? localUtil.format( A11054MComEntPre, "ZZZZZZZ9.999") : localUtil.format( A11054MComEntPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMComEntPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMComEntPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRStkPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRStkPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMRStkPre_Enabled!=0) ? localUtil.format( A9499MRStkPre, "ZZZZZZ9.999") : localUtil.format( A9499MRStkPre, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRStkPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRStkPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MRepC1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MRepC1.htm");
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
         Z11055MComCod = localUtil.ctol( httpContext.cgiGet( "Z11055MComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9492MRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( "Z11051MComSolCnt")) ;
         Z11052MComSolPre = localUtil.ctond( httpContext.cgiGet( "Z11052MComSolPre")) ;
         Z11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( "Z11053MComEntCnt")) ;
         Z11054MComEntPre = localUtil.ctond( httpContext.cgiGet( "Z11054MComEntPre")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCOMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMComCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11055MComCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         }
         else
         {
            A11055MComCod = localUtil.ctol( httpContext.cgiGet( edtMComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9492MRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         }
         else
         {
            A9492MRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         }
         A9493MRNom = httpContext.cgiGet( edtMRNom_Internalname) ;
         n9493MRNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
         A13718MRCNom = httpContext.cgiGet( edtMRCNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCOMSOLCNT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMComSolCnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11051MComSolCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11051MComSolCnt", GXutil.ltrimstr( A11051MComSolCnt, 9, 2));
         }
         else
         {
            A11051MComSolCnt = localUtil.ctond( httpContext.cgiGet( edtMComSolCnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11051MComSolCnt", GXutil.ltrimstr( A11051MComSolCnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCOMSOLPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMComSolPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11052MComSolPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrimstr( A11052MComSolPre, 12, 3));
         }
         else
         {
            A11052MComSolPre = localUtil.ctond( httpContext.cgiGet( edtMComSolPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrimstr( A11052MComSolPre, 12, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCOMENTCNT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMComEntCnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11053MComEntCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11053MComEntCnt", GXutil.ltrimstr( A11053MComEntCnt, 9, 2));
         }
         else
         {
            A11053MComEntCnt = localUtil.ctond( httpContext.cgiGet( edtMComEntCnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11053MComEntCnt", GXutil.ltrimstr( A11053MComEntCnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MCOMENTPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMComEntPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11054MComEntPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11054MComEntPre", GXutil.ltrimstr( A11054MComEntPre, 12, 3));
         }
         else
         {
            A11054MComEntPre = localUtil.ctond( httpContext.cgiGet( edtMComEntPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11054MComEntPre", GXutil.ltrimstr( A11054MComEntPre, 12, 3));
         }
         A9499MRStkPre = localUtil.ctond( httpContext.cgiGet( edtMRStkPre_Internalname)) ;
         n9499MRStkPre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
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
            A11055MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            A9492MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
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
            initAll1QX1472( ) ;
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
      disableAttributes1QX1472( ) ;
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

   public void resetCaption1QX0( )
   {
   }

   public void zm1QX1472( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11051MComSolCnt = T01QX3_A11051MComSolCnt[0] ;
            Z11052MComSolPre = T01QX3_A11052MComSolPre[0] ;
            Z11053MComEntCnt = T01QX3_A11053MComEntCnt[0] ;
            Z11054MComEntPre = T01QX3_A11054MComEntPre[0] ;
         }
         else
         {
            Z11051MComSolCnt = A11051MComSolCnt ;
            Z11052MComSolPre = A11052MComSolPre ;
            Z11053MComEntCnt = A11053MComEntCnt ;
            Z11054MComEntPre = A11054MComEntPre ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z11051MComSolCnt = A11051MComSolCnt ;
         Z11052MComSolPre = A11052MComSolPre ;
         Z11053MComEntCnt = A11053MComEntCnt ;
         Z11054MComEntPre = A11054MComEntPre ;
         Z396EmprCod = A396EmprCod ;
         Z9492MRCod = A9492MRCod ;
         Z11055MComCod = A11055MComCod ;
         Z9493MRNom = A9493MRNom ;
         Z9499MRStkPre = A9499MRStkPre ;
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

   public void load1QX1472( )
   {
      /* Using cursor T01QX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A9493MRNom = T01QX6_A9493MRNom[0] ;
         n9493MRNom = T01QX6_n9493MRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
         A11051MComSolCnt = T01QX6_A11051MComSolCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11051MComSolCnt", GXutil.ltrimstr( A11051MComSolCnt, 9, 2));
         A11052MComSolPre = T01QX6_A11052MComSolPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrimstr( A11052MComSolPre, 12, 3));
         A11053MComEntCnt = T01QX6_A11053MComEntCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11053MComEntCnt", GXutil.ltrimstr( A11053MComEntCnt, 9, 2));
         A11054MComEntPre = T01QX6_A11054MComEntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11054MComEntPre", GXutil.ltrimstr( A11054MComEntPre, 12, 3));
         A9499MRStkPre = T01QX6_A9499MRStkPre[0] ;
         n9499MRStkPre = T01QX6_n9499MRStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
         zm1QX1472( -2) ;
      }
      pr_default.close(4);
      onLoadActions1QX1472( ) ;
   }

   public void onLoadActions1QX1472( )
   {
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
   }

   public void checkExtendedTable1QX1472( )
   {
      nIsDirty_1472 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Compras", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01QX4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01QX4_A9493MRNom[0] ;
      n9493MRNom = T01QX4_n9493MRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
      A9499MRStkPre = T01QX4_A9499MRStkPre[0] ;
      n9499MRStkPre = T01QX4_n9499MRStkPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
      pr_default.close(2);
      nIsDirty_1472 = (short)(1) ;
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
   }

   public void closeExtendedTableCursors1QX1472( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         long A11055MComCod )
   {
      /* Using cursor T01QX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Compras", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( String A396EmprCod ,
                         int A9492MRCod )
   {
      /* Using cursor T01QX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01QX8_A9493MRNom[0] ;
      n9493MRNom = T01QX8_n9493MRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
      A9499MRStkPre = T01QX8_A9499MRStkPre[0] ;
      n9499MRStkPre = T01QX8_n9499MRStkPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9493MRNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1QX1472( )
   {
      /* Using cursor T01QX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1472 = (short)(1) ;
      }
      else
      {
         RcdFound1472 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QX1472( 2) ;
         RcdFound1472 = (short)(1) ;
         A11051MComSolCnt = T01QX3_A11051MComSolCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11051MComSolCnt", GXutil.ltrimstr( A11051MComSolCnt, 9, 2));
         A11052MComSolPre = T01QX3_A11052MComSolPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrimstr( A11052MComSolPre, 12, 3));
         A11053MComEntCnt = T01QX3_A11053MComEntCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11053MComEntCnt", GXutil.ltrimstr( A11053MComEntCnt, 9, 2));
         A11054MComEntPre = T01QX3_A11054MComEntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11054MComEntPre", GXutil.ltrimstr( A11054MComEntPre, 12, 3));
         A396EmprCod = T01QX3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9492MRCod = T01QX3_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
         A11055MComCod = T01QX3_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z11055MComCod = A11055MComCod ;
         Z9492MRCod = A9492MRCod ;
         sMode1472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QX1472( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1472 = (short)(0) ;
            initializeNonKey1QX1472( ) ;
         }
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1472 = (short)(0) ;
         initializeNonKey1QX1472( ) ;
         sMode1472 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1472 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QX1472( ) ;
      if ( RcdFound1472 == 0 )
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
      RcdFound1472 = (short)(0) ;
      /* Using cursor T01QX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9492MRCod), A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QX10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX10_A9492MRCod[0] < A9492MRCod ) || ( T01QX10_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX10_A11055MComCod[0] < A11055MComCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QX10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX10_A9492MRCod[0] > A9492MRCod ) || ( T01QX10_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QX10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX10_A11055MComCod[0] > A11055MComCod ) ) )
         {
            A396EmprCod = T01QX10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01QX10_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A11055MComCod = T01QX10_A11055MComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            RcdFound1472 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1472 = (short)(0) ;
      /* Using cursor T01QX11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9492MRCod), A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QX11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX11_A9492MRCod[0] > A9492MRCod ) || ( T01QX11_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX11_A11055MComCod[0] > A11055MComCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QX11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX11_A9492MRCod[0] < A9492MRCod ) || ( T01QX11_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(T01QX11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QX11_A11055MComCod[0] < A11055MComCod ) ) )
         {
            A396EmprCod = T01QX11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9492MRCod = T01QX11_A9492MRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
            A11055MComCod = T01QX11_A11055MComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
            RcdFound1472 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QX1472( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QX1472( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1472 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) || ( A9492MRCod != Z9492MRCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11055MComCod = Z11055MComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
               A9492MRCod = Z9492MRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
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
               update1QX1472( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) || ( A9492MRCod != Z9492MRCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QX1472( ) ;
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
                  insert1QX1472( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11055MComCod != Z11055MComCod ) || ( A9492MRCod != Z9492MRCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = Z11055MComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         A9492MRCod = Z9492MRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
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
      if ( RcdFound1472 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMComSolCnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QX1472( ) ;
      if ( RcdFound1472 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMComSolCnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QX1472( ) ;
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
      if ( RcdFound1472 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMComSolCnt_Internalname ;
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
      if ( RcdFound1472 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMComSolCnt_Internalname ;
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
      scanStart1QX1472( ) ;
      if ( RcdFound1472 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1472 != 0 )
         {
            scanNext1QX1472( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMComSolCnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QX1472( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QX1472( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11051MComSolCnt, T01QX2_A11051MComSolCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z11052MComSolPre, T01QX2_A11052MComSolPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z11053MComEntCnt, T01QX2_A11053MComEntCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z11054MComEntPre, T01QX2_A11054MComEntPre[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11051MComSolCnt, T01QX2_A11051MComSolCnt[0]) != 0 )
            {
               GXutil.writeLogln("mrepc1:[seudo value changed for attri]"+"MComSolCnt");
               GXutil.writeLogRaw("Old: ",Z11051MComSolCnt);
               GXutil.writeLogRaw("Current: ",T01QX2_A11051MComSolCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z11052MComSolPre, T01QX2_A11052MComSolPre[0]) != 0 )
            {
               GXutil.writeLogln("mrepc1:[seudo value changed for attri]"+"MComSolPre");
               GXutil.writeLogRaw("Old: ",Z11052MComSolPre);
               GXutil.writeLogRaw("Current: ",T01QX2_A11052MComSolPre[0]);
            }
            if ( DecimalUtil.compareTo(Z11053MComEntCnt, T01QX2_A11053MComEntCnt[0]) != 0 )
            {
               GXutil.writeLogln("mrepc1:[seudo value changed for attri]"+"MComEntCnt");
               GXutil.writeLogRaw("Old: ",Z11053MComEntCnt);
               GXutil.writeLogRaw("Current: ",T01QX2_A11053MComEntCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z11054MComEntPre, T01QX2_A11054MComEntPre[0]) != 0 )
            {
               GXutil.writeLogln("mrepc1:[seudo value changed for attri]"+"MComEntPre");
               GXutil.writeLogRaw("Old: ",Z11054MComEntPre);
               GXutil.writeLogRaw("Current: ",T01QX2_A11054MComEntPre[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRepC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QX1472( )
   {
      beforeValidate1QX1472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QX1472( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QX1472( 0) ;
         checkOptimisticConcurrency1QX1472( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QX1472( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QX1472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QX12 */
                  pr_default.execute(10, new Object[] {A11051MComSolCnt, A11052MComSolPre, A11053MComEntCnt, A11054MComEntPre, A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A11055MComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
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
                        resetCaption1QX0( ) ;
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
            load1QX1472( ) ;
         }
         endLevel1QX1472( ) ;
      }
      closeExtendedTableCursors1QX1472( ) ;
   }

   public void update1QX1472( )
   {
      beforeValidate1QX1472( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QX1472( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QX1472( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QX1472( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QX1472( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QX13 */
                  pr_default.execute(11, new Object[] {A11051MComSolCnt, A11052MComSolPre, A11053MComEntCnt, A11054MComEntPre, A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRepC1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QX1472( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QX0( ) ;
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
         endLevel1QX1472( ) ;
      }
      closeExtendedTableCursors1QX1472( ) ;
   }

   public void deferredUpdate1QX1472( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QX1472( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QX1472( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QX1472( ) ;
         afterConfirm1QX1472( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QX1472( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QX14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), Integer.valueOf(A9492MRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepC1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1472 == 0 )
                     {
                        initAll1QX1472( ) ;
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
                     resetCaption1QX0( ) ;
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
      sMode1472 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QX1472( ) ;
      Gx_mode = sMode1472 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QX1472( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QX15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
         A9493MRNom = T01QX15_A9493MRNom[0] ;
         n9493MRNom = T01QX15_n9493MRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
         A9499MRStkPre = T01QX15_A9499MRStkPre[0] ;
         n9499MRStkPre = T01QX15_n9499MRStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
         pr_default.close(13);
         A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      }
   }

   public void endLevel1QX1472( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QX1472( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mrepc1");
         if ( AnyError == 0 )
         {
            confirmValues1QX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mrepc1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QX1472( )
   {
      /* Using cursor T01QX16 */
      pr_default.execute(14);
      RcdFound1472 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A396EmprCod = T01QX16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = T01QX16_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         A9492MRCod = T01QX16_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QX1472( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1472 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1472 = (short)(1) ;
         A396EmprCod = T01QX16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11055MComCod = T01QX16_A11055MComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
         A9492MRCod = T01QX16_A9492MRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      }
   }

   public void scanEnd1QX1472( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1QX1472( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QX1472( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QX1472( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QX1472( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QX1472( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QX1472( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QX1472( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComCod_Enabled), 5, 0), true);
      edtMRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCod_Enabled), 5, 0), true);
      edtMRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRNom_Enabled), 5, 0), true);
      edtMRCNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRCNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRCNom_Enabled), 5, 0), true);
      edtMComSolCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolCnt_Enabled), 5, 0), true);
      edtMComSolPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComSolPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComSolPre_Enabled), 5, 0), true);
      edtMComEntCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntCnt_Enabled), 5, 0), true);
      edtMComEntPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMComEntPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMComEntPre_Enabled), 5, 0), true);
      edtMRStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRStkPre_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QX1472( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QX0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mrepc1", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11055MComCod", GXutil.ltrim( localUtil.ntoc( Z11055MComCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9492MRCod", GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11051MComSolCnt", GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11052MComSolPre", GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11053MComEntCnt", GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11054MComEntPre", GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mrepc1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MRepC1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla MRep C1 (Compras, repuestos)", "") ;
   }

   public void initializeNonKey1QX1472( )
   {
      A13718MRCNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      A9493MRNom = "" ;
      n9493MRNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
      A11051MComSolCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11051MComSolCnt", GXutil.ltrimstr( A11051MComSolCnt, 9, 2));
      A11052MComSolPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrimstr( A11052MComSolPre, 12, 3));
      A11053MComEntCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11053MComEntCnt", GXutil.ltrimstr( A11053MComEntCnt, 9, 2));
      A11054MComEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11054MComEntPre", GXutil.ltrimstr( A11054MComEntPre, 12, 3));
      A9499MRStkPre = DecimalUtil.ZERO ;
      n9499MRStkPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
      Z11051MComSolCnt = DecimalUtil.ZERO ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      Z11053MComEntCnt = DecimalUtil.ZERO ;
      Z11054MComEntPre = DecimalUtil.ZERO ;
   }

   public void initAll1QX1472( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11055MComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11055MComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11055MComCod), 10, 0));
      A9492MRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9492MRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9492MRCod), 8, 0));
      initializeNonKey1QX1472( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016375511", true, true);
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
      httpContext.AddJavascriptSource("mrepc1.js", "?202661016375511", false, true);
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
      edtMComCod_Internalname = "MCOMCOD" ;
      edtMRCod_Internalname = "MRCOD" ;
      edtMRNom_Internalname = "MRNOM" ;
      edtMRCNom_Internalname = "MRCNOM" ;
      edtMComSolCnt_Internalname = "MCOMSOLCNT" ;
      edtMComSolPre_Internalname = "MCOMSOLPRE" ;
      edtMComEntCnt_Internalname = "MCOMENTCNT" ;
      edtMComEntPre_Internalname = "MCOMENTPRE" ;
      edtMRStkPre_Internalname = "MRSTKPRE" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla MRep C1 (Compras, repuestos)", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMRStkPre_Jsonclick = "" ;
      edtMRStkPre_Enabled = 0 ;
      edtMComEntPre_Jsonclick = "" ;
      edtMComEntPre_Enabled = 1 ;
      edtMComEntCnt_Jsonclick = "" ;
      edtMComEntCnt_Enabled = 1 ;
      edtMComSolPre_Jsonclick = "" ;
      edtMComSolPre_Enabled = 1 ;
      edtMComSolCnt_Jsonclick = "" ;
      edtMComSolCnt_Enabled = 1 ;
      edtMRCNom_Enabled = 0 ;
      edtMRNom_Jsonclick = "" ;
      edtMRNom_Enabled = 0 ;
      edtMRCod_Jsonclick = "" ;
      edtMRCod_Enabled = 1 ;
      edtMComCod_Jsonclick = "" ;
      edtMComCod_Enabled = 1 ;
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
      /* Using cursor T01QX17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Compras", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      /* Using cursor T01QX15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9493MRNom = T01QX15_A9493MRNom[0] ;
      n9493MRNom = T01QX15_n9493MRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", A9493MRNom);
      A9499MRStkPre = T01QX15_A9499MRStkPre[0] ;
      n9499MRStkPre = T01QX15_n9499MRStkPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrimstr( A9499MRStkPre, 12, 3));
      pr_default.close(13);
      GX_FocusControl = edtMComSolCnt_Internalname ;
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

   public void valid_Mcomcod( )
   {
      /* Using cursor T01QX17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Compras", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Mrcod( )
   {
      n9493MRNom = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01QX15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Repuestos de Mantenimiento - MRepuestos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9493MRNom = T01QX15_A9493MRNom[0] ;
      n9493MRNom = T01QX15_n9493MRNom[0] ;
      A9499MRStkPre = T01QX15_A9499MRStkPre[0] ;
      n9499MRStkPre = T01QX15_n9499MRStkPre[0] ;
      pr_default.close(13);
      A13718MRCNom = GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) + " - " + GXutil.trim( A9493MRNom) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11051MComSolCnt", GXutil.ltrim( localUtil.ntoc( A11051MComSolCnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11052MComSolPre", GXutil.ltrim( localUtil.ntoc( A11052MComSolPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11053MComEntCnt", GXutil.ltrim( localUtil.ntoc( A11053MComEntCnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11054MComEntPre", GXutil.ltrim( localUtil.ntoc( A11054MComEntPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9493MRNom", GXutil.rtrim( A9493MRNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9499MRStkPre", GXutil.ltrim( localUtil.ntoc( A9499MRStkPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13718MRCNom", A13718MRCNom);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11055MComCod", GXutil.ltrim( localUtil.ntoc( Z11055MComCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9492MRCod", GXutil.ltrim( localUtil.ntoc( Z9492MRCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11051MComSolCnt", GXutil.ltrim( localUtil.ntoc( Z11051MComSolCnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11052MComSolPre", GXutil.ltrim( localUtil.ntoc( Z11052MComSolPre, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11053MComEntCnt", GXutil.ltrim( localUtil.ntoc( Z11053MComEntCnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11054MComEntPre", GXutil.ltrim( localUtil.ntoc( Z11054MComEntPre, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9493MRNom", GXutil.rtrim( Z9493MRNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9499MRStkPre", GXutil.ltrim( localUtil.ntoc( Z9499MRStkPre, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13718MRCNom", Z13718MRCNom);
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
      setEventMetadata("VALID_MCOMCOD","{handler:'valid_Mcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VALID_MCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_MRCOD","{handler:'valid_Mrcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11055MComCod',fld:'MCOMCOD',pic:'ZZZZZZZZZ9'},{av:'A9492MRCod',fld:'MRCOD',pic:'ZZZZZZZ9'},{av:'A9493MRNom',fld:'MRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MRCOD",",oparms:[{av:'A11051MComSolCnt',fld:'MCOMSOLCNT',pic:'ZZZZZ9.99'},{av:'A11052MComSolPre',fld:'MCOMSOLPRE',pic:'ZZZZZZZ9.999'},{av:'A11053MComEntCnt',fld:'MCOMENTCNT',pic:'ZZZZZ9.99'},{av:'A11054MComEntPre',fld:'MCOMENTPRE',pic:'ZZZZZZZ9.999'},{av:'A9493MRNom',fld:'MRNOM',pic:''},{av:'A9499MRStkPre',fld:'MRSTKPRE',pic:'ZZZZZZ9.999'},{av:'A13718MRCNom',fld:'MRCNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11055MComCod'},{av:'Z9492MRCod'},{av:'Z11051MComSolCnt'},{av:'Z11052MComSolPre'},{av:'Z11053MComEntCnt'},{av:'Z11054MComEntPre'},{av:'Z9493MRNom'},{av:'Z9499MRStkPre'},{av:'Z13718MRCNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_MRNOM","{handler:'valid_Mrnom',iparms:[]");
      setEventMetadata("VALID_MRNOM",",oparms:[]}");
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
      Z11051MComSolCnt = DecimalUtil.ZERO ;
      Z11052MComSolPre = DecimalUtil.ZERO ;
      Z11053MComEntCnt = DecimalUtil.ZERO ;
      Z11054MComEntPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A9493MRNom = "" ;
      A13718MRCNom = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
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
      Z9493MRNom = "" ;
      Z9499MRStkPre = DecimalUtil.ZERO ;
      T01QX6_A9493MRNom = new String[] {""} ;
      T01QX6_n9493MRNom = new boolean[] {false} ;
      T01QX6_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX6_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX6_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX6_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX6_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX6_n9499MRStkPre = new boolean[] {false} ;
      T01QX6_A396EmprCod = new String[] {""} ;
      T01QX6_A9492MRCod = new int[1] ;
      T01QX6_A11055MComCod = new long[1] ;
      T01QX5_A396EmprCod = new String[] {""} ;
      T01QX4_A9493MRNom = new String[] {""} ;
      T01QX4_n9493MRNom = new boolean[] {false} ;
      T01QX4_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX4_n9499MRStkPre = new boolean[] {false} ;
      T01QX7_A396EmprCod = new String[] {""} ;
      T01QX8_A9493MRNom = new String[] {""} ;
      T01QX8_n9493MRNom = new boolean[] {false} ;
      T01QX8_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX8_n9499MRStkPre = new boolean[] {false} ;
      T01QX9_A396EmprCod = new String[] {""} ;
      T01QX9_A11055MComCod = new long[1] ;
      T01QX9_A9492MRCod = new int[1] ;
      T01QX3_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX3_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX3_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX3_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX3_A396EmprCod = new String[] {""} ;
      T01QX3_A9492MRCod = new int[1] ;
      T01QX3_A11055MComCod = new long[1] ;
      sMode1472 = "" ;
      T01QX10_A396EmprCod = new String[] {""} ;
      T01QX10_A9492MRCod = new int[1] ;
      T01QX10_A11055MComCod = new long[1] ;
      T01QX11_A396EmprCod = new String[] {""} ;
      T01QX11_A9492MRCod = new int[1] ;
      T01QX11_A11055MComCod = new long[1] ;
      T01QX2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX2_A396EmprCod = new String[] {""} ;
      T01QX2_A9492MRCod = new int[1] ;
      T01QX2_A11055MComCod = new long[1] ;
      T01QX15_A9493MRNom = new String[] {""} ;
      T01QX15_n9493MRNom = new boolean[] {false} ;
      T01QX15_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QX15_n9499MRStkPre = new boolean[] {false} ;
      T01QX16_A396EmprCod = new String[] {""} ;
      T01QX16_A11055MComCod = new long[1] ;
      T01QX16_A9492MRCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QX17_A396EmprCod = new String[] {""} ;
      Z13718MRCNom = "" ;
      ZZ396EmprCod = "" ;
      ZZ11051MComSolCnt = DecimalUtil.ZERO ;
      ZZ11052MComSolPre = DecimalUtil.ZERO ;
      ZZ11053MComEntCnt = DecimalUtil.ZERO ;
      ZZ11054MComEntPre = DecimalUtil.ZERO ;
      ZZ9493MRNom = "" ;
      ZZ9499MRStkPre = DecimalUtil.ZERO ;
      ZZ13718MRCNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mrepc1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mrepc1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mrepc1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mrepc1__default(),
         new Object[] {
             new Object[] {
            T01QX2_A11051MComSolCnt, T01QX2_A11052MComSolPre, T01QX2_A11053MComEntCnt, T01QX2_A11054MComEntPre, T01QX2_A396EmprCod, T01QX2_A9492MRCod, T01QX2_A11055MComCod
            }
            , new Object[] {
            T01QX3_A11051MComSolCnt, T01QX3_A11052MComSolPre, T01QX3_A11053MComEntCnt, T01QX3_A11054MComEntPre, T01QX3_A396EmprCod, T01QX3_A9492MRCod, T01QX3_A11055MComCod
            }
            , new Object[] {
            T01QX4_A9493MRNom, T01QX4_n9493MRNom, T01QX4_A9499MRStkPre, T01QX4_n9499MRStkPre
            }
            , new Object[] {
            T01QX5_A396EmprCod
            }
            , new Object[] {
            T01QX6_A9493MRNom, T01QX6_n9493MRNom, T01QX6_A11051MComSolCnt, T01QX6_A11052MComSolPre, T01QX6_A11053MComEntCnt, T01QX6_A11054MComEntPre, T01QX6_A9499MRStkPre, T01QX6_n9499MRStkPre, T01QX6_A396EmprCod, T01QX6_A9492MRCod,
            T01QX6_A11055MComCod
            }
            , new Object[] {
            T01QX7_A396EmprCod
            }
            , new Object[] {
            T01QX8_A9493MRNom, T01QX8_n9493MRNom, T01QX8_A9499MRStkPre, T01QX8_n9499MRStkPre
            }
            , new Object[] {
            T01QX9_A396EmprCod, T01QX9_A11055MComCod, T01QX9_A9492MRCod
            }
            , new Object[] {
            T01QX10_A396EmprCod, T01QX10_A9492MRCod, T01QX10_A11055MComCod
            }
            , new Object[] {
            T01QX11_A396EmprCod, T01QX11_A9492MRCod, T01QX11_A11055MComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QX15_A9493MRNom, T01QX15_n9493MRNom, T01QX15_A9499MRStkPre, T01QX15_n9499MRStkPre
            }
            , new Object[] {
            T01QX16_A396EmprCod, T01QX16_A11055MComCod, T01QX16_A9492MRCod
            }
            , new Object[] {
            T01QX17_A396EmprCod
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
   private short RcdFound1472 ;
   private short nIsDirty_1472 ;
   private int Z9492MRCod ;
   private int A9492MRCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMComCod_Enabled ;
   private int edtMRCod_Enabled ;
   private int edtMRNom_Enabled ;
   private int edtMRCNom_Enabled ;
   private int edtMComSolCnt_Enabled ;
   private int edtMComSolPre_Enabled ;
   private int edtMComEntCnt_Enabled ;
   private int edtMComEntPre_Enabled ;
   private int edtMRStkPre_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ9492MRCod ;
   private long Z11055MComCod ;
   private long A11055MComCod ;
   private long ZZ11055MComCod ;
   private java.math.BigDecimal Z11051MComSolCnt ;
   private java.math.BigDecimal Z11052MComSolPre ;
   private java.math.BigDecimal Z11053MComEntCnt ;
   private java.math.BigDecimal Z11054MComEntPre ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal Z9499MRStkPre ;
   private java.math.BigDecimal ZZ11051MComSolCnt ;
   private java.math.BigDecimal ZZ11052MComSolPre ;
   private java.math.BigDecimal ZZ11053MComEntCnt ;
   private java.math.BigDecimal ZZ11054MComEntPre ;
   private java.math.BigDecimal ZZ9499MRStkPre ;
   private String sPrefix ;
   private String Z396EmprCod ;
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
   private String edtMComCod_Internalname ;
   private String edtMComCod_Jsonclick ;
   private String edtMRCod_Internalname ;
   private String edtMRCod_Jsonclick ;
   private String edtMRNom_Internalname ;
   private String A9493MRNom ;
   private String edtMRNom_Jsonclick ;
   private String edtMRCNom_Internalname ;
   private String edtMComSolCnt_Internalname ;
   private String edtMComSolCnt_Jsonclick ;
   private String edtMComSolPre_Internalname ;
   private String edtMComSolPre_Jsonclick ;
   private String edtMComEntCnt_Internalname ;
   private String edtMComEntCnt_Jsonclick ;
   private String edtMComEntPre_Internalname ;
   private String edtMComEntPre_Jsonclick ;
   private String edtMRStkPre_Internalname ;
   private String edtMRStkPre_Jsonclick ;
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
   private String Z9493MRNom ;
   private String sMode1472 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9493MRNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9493MRNom ;
   private boolean n9499MRStkPre ;
   private String A13718MRCNom ;
   private String Z13718MRCNom ;
   private String ZZ13718MRCNom ;
   private IDataStoreProvider pr_default ;
   private String[] T01QX6_A9493MRNom ;
   private boolean[] T01QX6_n9493MRNom ;
   private java.math.BigDecimal[] T01QX6_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01QX6_A11052MComSolPre ;
   private java.math.BigDecimal[] T01QX6_A11053MComEntCnt ;
   private java.math.BigDecimal[] T01QX6_A11054MComEntPre ;
   private java.math.BigDecimal[] T01QX6_A9499MRStkPre ;
   private boolean[] T01QX6_n9499MRStkPre ;
   private String[] T01QX6_A396EmprCod ;
   private int[] T01QX6_A9492MRCod ;
   private long[] T01QX6_A11055MComCod ;
   private String[] T01QX5_A396EmprCod ;
   private String[] T01QX4_A9493MRNom ;
   private boolean[] T01QX4_n9493MRNom ;
   private java.math.BigDecimal[] T01QX4_A9499MRStkPre ;
   private boolean[] T01QX4_n9499MRStkPre ;
   private String[] T01QX7_A396EmprCod ;
   private String[] T01QX8_A9493MRNom ;
   private boolean[] T01QX8_n9493MRNom ;
   private java.math.BigDecimal[] T01QX8_A9499MRStkPre ;
   private boolean[] T01QX8_n9499MRStkPre ;
   private String[] T01QX9_A396EmprCod ;
   private long[] T01QX9_A11055MComCod ;
   private int[] T01QX9_A9492MRCod ;
   private java.math.BigDecimal[] T01QX3_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01QX3_A11052MComSolPre ;
   private java.math.BigDecimal[] T01QX3_A11053MComEntCnt ;
   private java.math.BigDecimal[] T01QX3_A11054MComEntPre ;
   private String[] T01QX3_A396EmprCod ;
   private int[] T01QX3_A9492MRCod ;
   private long[] T01QX3_A11055MComCod ;
   private String[] T01QX10_A396EmprCod ;
   private int[] T01QX10_A9492MRCod ;
   private long[] T01QX10_A11055MComCod ;
   private String[] T01QX11_A396EmprCod ;
   private int[] T01QX11_A9492MRCod ;
   private long[] T01QX11_A11055MComCod ;
   private java.math.BigDecimal[] T01QX2_A11051MComSolCnt ;
   private java.math.BigDecimal[] T01QX2_A11052MComSolPre ;
   private java.math.BigDecimal[] T01QX2_A11053MComEntCnt ;
   private java.math.BigDecimal[] T01QX2_A11054MComEntPre ;
   private String[] T01QX2_A396EmprCod ;
   private int[] T01QX2_A9492MRCod ;
   private long[] T01QX2_A11055MComCod ;
   private String[] T01QX15_A9493MRNom ;
   private boolean[] T01QX15_n9493MRNom ;
   private java.math.BigDecimal[] T01QX15_A9499MRStkPre ;
   private boolean[] T01QX15_n9499MRStkPre ;
   private String[] T01QX16_A396EmprCod ;
   private long[] T01QX16_A11055MComCod ;
   private int[] T01QX16_A9492MRCod ;
   private String[] T01QX17_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mrepc1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrepc1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrepc1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrepc1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QX2", "SELECT MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, EmprCod, MRCod, MComCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?  FOR UPDATE OF MComSolCnt, MComSolPre, MComEntCnt, MComEntPre NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX3", "SELECT MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, EmprCod, MRCod, MComCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX4", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX5", "SELECT EmprCod FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX6", "SELECT /*+ FIRST_ROWS(100) */ T2.MRNom, TM1.MComSolCnt, TM1.MComSolPre, TM1.MComEntCnt, TM1.MComEntPre, T2.MRStkPre, TM1.EmprCod, TM1.MRCod, TM1.MComCod FROM (TXPMRepC1 TM1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = TM1.EmprCod AND T2.MRCod = TM1.MRCod) WHERE TM1.EmprCod = ? and TM1.MRCod = ? and TM1.MComCod = ? ORDER BY TM1.EmprCod, TM1.MComCod, TM1.MRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX7", "SELECT EmprCod FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX8", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MComCod, MRCod FROM TXPMRepC1 WHERE EmprCod = ? AND MComCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MComCod FROM TXPMRepC1 WHERE ( EmprCod > ? or EmprCod = ? and MRCod > ? or MRCod = ? and EmprCod = ? and MComCod > ?) ORDER BY EmprCod, MComCod, MRCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QX11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRCod, MComCod FROM TXPMRepC1 WHERE ( EmprCod < ? or EmprCod = ? and MRCod < ? or MRCod = ? and EmprCod = ? and MComCod < ?) ORDER BY EmprCod DESC, MComCod DESC, MRCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QX12", "INSERT INTO TXPMRepC1(MComSolCnt, MComSolPre, MComEntCnt, MComEntPre, EmprCod, MRCod, MComCod, MComLote) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPMRepC1")
         ,new UpdateCursor("T01QX13", "UPDATE TXPMRepC1 SET MComSolCnt=?, MComSolPre=?, MComEntCnt=?, MComEntPre=?  WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?", GX_NOMASK, "TXPMRepC1")
         ,new UpdateCursor("T01QX14", "DELETE FROM TXPMRepC1  WHERE EmprCod = ? AND MComCod = ? AND MRCod = ?", GX_NOMASK, "TXPMRepC1")
         ,new ForEachCursor("T01QX15", "SELECT MRNom, MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MComCod, MRCod FROM TXPMRepC1 ORDER BY EmprCod, MComCod, MRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QX17", "SELECT EmprCod FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((long[]) buf[10])[0] = rslt.getLong(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

