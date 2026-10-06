package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mmostr_impl extends GXDataArea
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
         A9412MMSCod = (int)(GXutil.lval( httpContext.GetPar( "MMSCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A9412MMSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9421MMSRCod = (int)(GXutil.lval( httpContext.GetPar( "MMSRCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A9421MMSRCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla MMOSTR", ""), (short)(0)) ;
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

   public mmostr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mmostr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mmostr_impl.class ));
   }

   public mmostr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla MMOSTR", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\MMOSTR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\MMOSTR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSCod_Internalname, httpContext.getMessage( "Cod de Mov de Stock de Mantto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRCod_Internalname, httpContext.getMessage( "Cod de Rep en Mov de Stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9421MMSRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9421MMSRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRNom_Internalname, httpContext.getMessage( "Nombre del Rep en Mov de Stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRNom_Internalname, GXutil.rtrim( A9422MMSRNom), GXutil.rtrim( localUtil.format( A9422MMSRNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRNom_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRStkPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRStkPre_Internalname, httpContext.getMessage( "Precio Stock del Rep en Mov", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRStkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRStkPre_Enabled!=0) ? localUtil.format( A9423MMSRStkPre, "Z,ZZZ,ZZZ9.999") : localUtil.format( A9423MMSRStkPre, "Z,ZZZ,ZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRStkPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRStkPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRPreD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRPreD_Internalname, httpContext.getMessage( "Precio Unitario sin Descuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRPreD_Internalname, GXutil.ltrim( localUtil.ntoc( A11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRPreD_Enabled!=0) ? localUtil.format( A11510MMSRPreD, "ZZZZZZZ9.999") : localUtil.format( A11510MMSRPreD, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRPreD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRPreD_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRTot_Internalname, httpContext.getMessage( "Precio Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRTot_Internalname, GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRTot_Enabled!=0) ? localUtil.format( A11511MMSRTot, "ZZZZZZZ9.999") : localUtil.format( A11511MMSRTot, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRTot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRTot_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRDto_Internalname, httpContext.getMessage( "% Dto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRDto_Internalname, GXutil.ltrim( localUtil.ntoc( A11512MMSRDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRDto_Enabled!=0) ? localUtil.format( A11512MMSRDto, "ZZ9.99%") : localUtil.format( A11512MMSRDto, "ZZ9.99%"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRDto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRDto_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRPre_Internalname, httpContext.getMessage( "Precio del Mov de Stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRPre_Enabled!=0) ? localUtil.format( A9424MMSRPre, "ZZZZZZZ9.999") : localUtil.format( A9424MMSRPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMMSRCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMMSRCnt_Internalname, httpContext.getMessage( "Cant del Mov de Stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMMSRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMMSRCnt_Enabled!=0) ? localUtil.format( A9409MMSRCnt, "ZZZZZ9.999") : localUtil.format( A9409MMSRCnt, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMMSRCnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMMSRCnt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\MMOSTR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\MMOSTR.htm");
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
         Z9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9412MMSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9421MMSRCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9421MMSRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11510MMSRPreD = localUtil.ctond( httpContext.cgiGet( "Z11510MMSRPreD")) ;
         Z11511MMSRTot = localUtil.ctond( httpContext.cgiGet( "Z11511MMSRTot")) ;
         Z11512MMSRDto = localUtil.ctond( httpContext.cgiGet( "Z11512MMSRDto")) ;
         Z9424MMSRPre = localUtil.ctond( httpContext.cgiGet( "Z9424MMSRPre")) ;
         Z9409MMSRCnt = localUtil.ctond( httpContext.cgiGet( "Z9409MMSRCnt")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMMSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMMSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9412MMSCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         }
         else
         {
            A9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMMSRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMMSRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9421MMSRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
         }
         else
         {
            A9421MMSRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
         }
         A9422MMSRNom = httpContext.cgiGet( edtMMSRNom_Internalname) ;
         n9422MMSRNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
         A9423MMSRStkPre = localUtil.ctond( httpContext.cgiGet( edtMMSRStkPre_Internalname)) ;
         n9423MMSRStkPre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSRPreD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRPreD_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSRPRED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSRPreD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11510MMSRPreD = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11510MMSRPreD", GXutil.ltrimstr( A11510MMSRPreD, 12, 3));
         }
         else
         {
            A11510MMSRPreD = localUtil.ctond( httpContext.cgiGet( edtMMSRPreD_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11510MMSRPreD", GXutil.ltrimstr( A11510MMSRPreD, 12, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSRTot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRTot_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSRTOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSRTot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11511MMSRTot = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11511MMSRTot", GXutil.ltrimstr( A11511MMSRTot, 12, 3));
         }
         else
         {
            A11511MMSRTot = localUtil.ctond( httpContext.cgiGet( edtMMSRTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11511MMSRTot", GXutil.ltrimstr( A11511MMSRTot, 12, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMMSRDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSRDTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSRDto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11512MMSRDto = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11512MMSRDto", GXutil.ltrimstr( A11512MMSRDto, 6, 2));
         }
         else
         {
            A11512MMSRDto = localUtil.ctond( httpContext.cgiGet( edtMMSRDto_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11512MMSRDto", GXutil.ltrimstr( A11512MMSRDto, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRPre_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRPre_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSRPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSRPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9424MMSRPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrimstr( A9424MMSRPre, 12, 3));
         }
         else
         {
            A9424MMSRPre = localUtil.ctond( httpContext.cgiGet( edtMMSRPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrimstr( A9424MMSRPre, 12, 3));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRCnt_Internalname)), DecimalUtil.stringToDec("-99999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMMSRCnt_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MMSRCNT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMMSRCnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9409MMSRCnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9409MMSRCnt", GXutil.ltrimstr( A9409MMSRCnt, 10, 3));
         }
         else
         {
            A9409MMSRCnt = localUtil.ctond( httpContext.cgiGet( edtMMSRCnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9409MMSRCnt", GXutil.ltrimstr( A9409MMSRCnt, 10, 3));
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
            A9412MMSCod = (int)(GXutil.lval( httpContext.GetPar( "MMSCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
            A9421MMSRCod = (int)(GXutil.lval( httpContext.GetPar( "MMSRCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
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
            initAll1R01231( ) ;
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
      disableAttributes1R01231( ) ;
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

   public void resetCaption1R00( )
   {
   }

   public void zm1R01231( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11510MMSRPreD = T01R03_A11510MMSRPreD[0] ;
            Z11511MMSRTot = T01R03_A11511MMSRTot[0] ;
            Z11512MMSRDto = T01R03_A11512MMSRDto[0] ;
            Z9424MMSRPre = T01R03_A9424MMSRPre[0] ;
            Z9409MMSRCnt = T01R03_A9409MMSRCnt[0] ;
         }
         else
         {
            Z11510MMSRPreD = A11510MMSRPreD ;
            Z11511MMSRTot = A11511MMSRTot ;
            Z11512MMSRDto = A11512MMSRDto ;
            Z9424MMSRPre = A9424MMSRPre ;
            Z9409MMSRCnt = A9409MMSRCnt ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11510MMSRPreD = A11510MMSRPreD ;
         Z11511MMSRTot = A11511MMSRTot ;
         Z11512MMSRDto = A11512MMSRDto ;
         Z9424MMSRPre = A9424MMSRPre ;
         Z9409MMSRCnt = A9409MMSRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9412MMSCod = A9412MMSCod ;
         Z9421MMSRCod = A9421MMSRCod ;
         Z9422MMSRNom = A9422MMSRNom ;
         Z9423MMSRStkPre = A9423MMSRStkPre ;
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

   public void load1R01231( )
   {
      /* Using cursor T01R06 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1231 = (short)(1) ;
         A9422MMSRNom = T01R06_A9422MMSRNom[0] ;
         n9422MMSRNom = T01R06_n9422MMSRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
         A9423MMSRStkPre = T01R06_A9423MMSRStkPre[0] ;
         n9423MMSRStkPre = T01R06_n9423MMSRStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
         A11510MMSRPreD = T01R06_A11510MMSRPreD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11510MMSRPreD", GXutil.ltrimstr( A11510MMSRPreD, 12, 3));
         A11511MMSRTot = T01R06_A11511MMSRTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11511MMSRTot", GXutil.ltrimstr( A11511MMSRTot, 12, 3));
         A11512MMSRDto = T01R06_A11512MMSRDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11512MMSRDto", GXutil.ltrimstr( A11512MMSRDto, 6, 2));
         A9424MMSRPre = T01R06_A9424MMSRPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrimstr( A9424MMSRPre, 12, 3));
         A9409MMSRCnt = T01R06_A9409MMSRCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9409MMSRCnt", GXutil.ltrimstr( A9409MMSRCnt, 10, 3));
         zm1R01231( -1) ;
      }
      pr_default.close(4);
      onLoadActions1R01231( ) ;
   }

   public void onLoadActions1R01231( )
   {
   }

   public void checkExtendedTable1R01231( )
   {
      nIsDirty_1231 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01R04 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Mov de Stock en Mantto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01R05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9422MMSRNom = T01R05_A9422MMSRNom[0] ;
      n9422MMSRNom = T01R05_n9422MMSRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
      A9423MMSRStkPre = T01R05_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T01R05_n9423MMSRStkPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1R01231( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A9412MMSCod )
   {
      /* Using cursor T01R07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Mov de Stock en Mantto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSCOD");
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
                         int A9421MMSRCod )
   {
      /* Using cursor T01R08 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9422MMSRNom = T01R08_A9422MMSRNom[0] ;
      n9422MMSRNom = T01R08_n9422MMSRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
      A9423MMSRStkPre = T01R08_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T01R08_n9423MMSRStkPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9422MMSRNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1R01231( )
   {
      /* Using cursor T01R09 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1231 = (short)(1) ;
      }
      else
      {
         RcdFound1231 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01R03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1R01231( 1) ;
         RcdFound1231 = (short)(1) ;
         A11510MMSRPreD = T01R03_A11510MMSRPreD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11510MMSRPreD", GXutil.ltrimstr( A11510MMSRPreD, 12, 3));
         A11511MMSRTot = T01R03_A11511MMSRTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11511MMSRTot", GXutil.ltrimstr( A11511MMSRTot, 12, 3));
         A11512MMSRDto = T01R03_A11512MMSRDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11512MMSRDto", GXutil.ltrimstr( A11512MMSRDto, 6, 2));
         A9424MMSRPre = T01R03_A9424MMSRPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrimstr( A9424MMSRPre, 12, 3));
         A9409MMSRCnt = T01R03_A9409MMSRCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9409MMSRCnt", GXutil.ltrimstr( A9409MMSRCnt, 10, 3));
         A396EmprCod = T01R03_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = T01R03_A9412MMSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         A9421MMSRCod = T01R03_A9421MMSRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9412MMSCod = A9412MMSCod ;
         Z9421MMSRCod = A9421MMSRCod ;
         sMode1231 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1R01231( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1231 = (short)(0) ;
            initializeNonKey1R01231( ) ;
         }
         Gx_mode = sMode1231 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1231 = (short)(0) ;
         initializeNonKey1R01231( ) ;
         sMode1231 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1231 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1R01231( ) ;
      if ( RcdFound1231 == 0 )
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
      RcdFound1231 = (short)(0) ;
      /* Using cursor T01R010 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9412MMSCod), A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01R010_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R010_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R010_A9412MMSCod[0] < A9412MMSCod ) || ( T01R010_A9412MMSCod[0] == A9412MMSCod ) && ( GXutil.strcmp(T01R010_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R010_A9421MMSRCod[0] < A9421MMSRCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01R010_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R010_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R010_A9412MMSCod[0] > A9412MMSCod ) || ( T01R010_A9412MMSCod[0] == A9412MMSCod ) && ( GXutil.strcmp(T01R010_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R010_A9421MMSRCod[0] > A9421MMSRCod ) ) )
         {
            A396EmprCod = T01R010_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9412MMSCod = T01R010_A9412MMSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
            A9421MMSRCod = T01R010_A9421MMSRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
            RcdFound1231 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1231 = (short)(0) ;
      /* Using cursor T01R011 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9412MMSCod), A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01R011_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01R011_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R011_A9412MMSCod[0] > A9412MMSCod ) || ( T01R011_A9412MMSCod[0] == A9412MMSCod ) && ( GXutil.strcmp(T01R011_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R011_A9421MMSRCod[0] > A9421MMSRCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01R011_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01R011_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R011_A9412MMSCod[0] < A9412MMSCod ) || ( T01R011_A9412MMSCod[0] == A9412MMSCod ) && ( GXutil.strcmp(T01R011_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01R011_A9421MMSRCod[0] < A9421MMSRCod ) ) )
         {
            A396EmprCod = T01R011_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9412MMSCod = T01R011_A9412MMSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
            A9421MMSRCod = T01R011_A9421MMSRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
            RcdFound1231 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1R01231( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1R01231( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1231 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) || ( A9421MMSRCod != Z9421MMSRCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9412MMSCod = Z9412MMSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
               A9421MMSRCod = Z9421MMSRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
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
               update1R01231( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) || ( A9421MMSRCod != Z9421MMSRCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1R01231( ) ;
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
                  insert1R01231( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9412MMSCod != Z9412MMSCod ) || ( A9421MMSRCod != Z9421MMSRCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = Z9412MMSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         A9421MMSRCod = Z9421MMSRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
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
      if ( RcdFound1231 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMMSRPreD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1R01231( ) ;
      if ( RcdFound1231 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMSRPreD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R01231( ) ;
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
      if ( RcdFound1231 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMSRPreD_Internalname ;
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
      if ( RcdFound1231 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMSRPreD_Internalname ;
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
      scanStart1R01231( ) ;
      if ( RcdFound1231 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1231 != 0 )
         {
            scanNext1R01231( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMMSRPreD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R01231( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1R01231( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01R02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMMoStR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11510MMSRPreD, T01R02_A11510MMSRPreD[0]) != 0 ) || ( DecimalUtil.compareTo(Z11511MMSRTot, T01R02_A11511MMSRTot[0]) != 0 ) || ( DecimalUtil.compareTo(Z11512MMSRDto, T01R02_A11512MMSRDto[0]) != 0 ) || ( DecimalUtil.compareTo(Z9424MMSRPre, T01R02_A9424MMSRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9409MMSRCnt, T01R02_A9409MMSRCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11510MMSRPreD, T01R02_A11510MMSRPreD[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.mmostr:[seudo value changed for attri]"+"MMSRPreD");
               GXutil.writeLogRaw("Old: ",Z11510MMSRPreD);
               GXutil.writeLogRaw("Current: ",T01R02_A11510MMSRPreD[0]);
            }
            if ( DecimalUtil.compareTo(Z11511MMSRTot, T01R02_A11511MMSRTot[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.mmostr:[seudo value changed for attri]"+"MMSRTot");
               GXutil.writeLogRaw("Old: ",Z11511MMSRTot);
               GXutil.writeLogRaw("Current: ",T01R02_A11511MMSRTot[0]);
            }
            if ( DecimalUtil.compareTo(Z11512MMSRDto, T01R02_A11512MMSRDto[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.mmostr:[seudo value changed for attri]"+"MMSRDto");
               GXutil.writeLogRaw("Old: ",Z11512MMSRDto);
               GXutil.writeLogRaw("Current: ",T01R02_A11512MMSRDto[0]);
            }
            if ( DecimalUtil.compareTo(Z9424MMSRPre, T01R02_A9424MMSRPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.mmostr:[seudo value changed for attri]"+"MMSRPre");
               GXutil.writeLogRaw("Old: ",Z9424MMSRPre);
               GXutil.writeLogRaw("Current: ",T01R02_A9424MMSRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9409MMSRCnt, T01R02_A9409MMSRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.mmostr:[seudo value changed for attri]"+"MMSRCnt");
               GXutil.writeLogRaw("Old: ",Z9409MMSRCnt);
               GXutil.writeLogRaw("Current: ",T01R02_A9409MMSRCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMMoStR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1R01231( )
   {
      beforeValidate1R01231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R01231( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1R01231( 0) ;
         checkOptimisticConcurrency1R01231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R01231( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1R01231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R012 */
                  pr_default.execute(10, new Object[] {A11510MMSRPreD, A11511MMSRTot, A11512MMSRDto, A9424MMSRPre, A9409MMSRCnt, A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStR");
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
                        resetCaption1R00( ) ;
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
            load1R01231( ) ;
         }
         endLevel1R01231( ) ;
      }
      closeExtendedTableCursors1R01231( ) ;
   }

   public void update1R01231( )
   {
      beforeValidate1R01231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R01231( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R01231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R01231( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1R01231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R013 */
                  pr_default.execute(11, new Object[] {A11510MMSRPreD, A11511MMSRTot, A11512MMSRDto, A9424MMSRPre, A9409MMSRCnt, A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStR");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMMoStR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1R01231( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1R00( ) ;
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
         endLevel1R01231( ) ;
      }
      closeExtendedTableCursors1R01231( ) ;
   }

   public void deferredUpdate1R01231( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1R01231( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R01231( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1R01231( ) ;
         afterConfirm1R01231( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1R01231( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01R014 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), Integer.valueOf(A9421MMSRCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1231 == 0 )
                     {
                        initAll1R01231( ) ;
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
                     resetCaption1R00( ) ;
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
      sMode1231 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1R01231( ) ;
      Gx_mode = sMode1231 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1R01231( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01R015 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
         A9422MMSRNom = T01R015_A9422MMSRNom[0] ;
         n9422MMSRNom = T01R015_n9422MMSRNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
         A9423MMSRStkPre = T01R015_A9423MMSRStkPre[0] ;
         n9423MMSRStkPre = T01R015_n9423MMSRStkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
         pr_default.close(13);
      }
   }

   public void endLevel1R01231( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1R01231( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.mmostr");
         if ( AnyError == 0 )
         {
            confirmValues1R00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.mmostr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1R01231( )
   {
      /* Using cursor T01R016 */
      pr_default.execute(14);
      RcdFound1231 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1231 = (short)(1) ;
         A396EmprCod = T01R016_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = T01R016_A9412MMSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         A9421MMSRCod = T01R016_A9421MMSRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1R01231( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1231 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1231 = (short)(1) ;
         A396EmprCod = T01R016_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9412MMSCod = T01R016_A9412MMSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
         A9421MMSRCod = T01R016_A9421MMSRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
      }
   }

   public void scanEnd1R01231( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1R01231( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1R01231( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1R01231( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1R01231( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1R01231( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1R01231( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1R01231( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMMSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Enabled), 5, 0), true);
      edtMMSRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCod_Enabled), 5, 0), true);
      edtMMSRNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRNom_Enabled), 5, 0), true);
      edtMMSRStkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRStkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRStkPre_Enabled), 5, 0), true);
      edtMMSRPreD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRPreD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPreD_Enabled), 5, 0), true);
      edtMMSRTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRTot_Enabled), 5, 0), true);
      edtMMSRDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRDto_Enabled), 5, 0), true);
      edtMMSRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRPre_Enabled), 5, 0), true);
      edtMMSRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSRCnt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1R01231( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1R00( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.mmostr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9412MMSCod", GXutil.ltrim( localUtil.ntoc( Z9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9421MMSRCod", GXutil.ltrim( localUtil.ntoc( Z9421MMSRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11510MMSRPreD", GXutil.ltrim( localUtil.ntoc( Z11510MMSRPreD, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11511MMSRTot", GXutil.ltrim( localUtil.ntoc( Z11511MMSRTot, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11512MMSRDto", GXutil.ltrim( localUtil.ntoc( Z11512MMSRDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9424MMSRPre", GXutil.ltrim( localUtil.ntoc( Z9424MMSRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9409MMSRCnt", GXutil.ltrim( localUtil.ntoc( Z9409MMSRCnt, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.mantenimientomaquina.mmostr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.MMOSTR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla MMOSTR", "") ;
   }

   public void initializeNonKey1R01231( )
   {
      A9422MMSRNom = "" ;
      n9422MMSRNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
      A9423MMSRStkPre = DecimalUtil.ZERO ;
      n9423MMSRStkPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
      A11510MMSRPreD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11510MMSRPreD", GXutil.ltrimstr( A11510MMSRPreD, 12, 3));
      A11511MMSRTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11511MMSRTot", GXutil.ltrimstr( A11511MMSRTot, 12, 3));
      A11512MMSRDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11512MMSRDto", GXutil.ltrimstr( A11512MMSRDto, 6, 2));
      A9424MMSRPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrimstr( A9424MMSRPre, 12, 3));
      A9409MMSRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9409MMSRCnt", GXutil.ltrimstr( A9409MMSRCnt, 10, 3));
      Z11510MMSRPreD = DecimalUtil.ZERO ;
      Z11511MMSRTot = DecimalUtil.ZERO ;
      Z11512MMSRDto = DecimalUtil.ZERO ;
      Z9424MMSRPre = DecimalUtil.ZERO ;
      Z9409MMSRCnt = DecimalUtil.ZERO ;
   }

   public void initAll1R01231( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9412MMSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9412MMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0));
      A9421MMSRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9421MMSRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9421MMSRCod), 8, 0));
      initializeNonKey1R01231( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016375689", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/mmostr.js", "?202661016375689", false, true);
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
      edtMMSCod_Internalname = "MMSCOD" ;
      edtMMSRCod_Internalname = "MMSRCOD" ;
      edtMMSRNom_Internalname = "MMSRNOM" ;
      edtMMSRStkPre_Internalname = "MMSRSTKPRE" ;
      edtMMSRPreD_Internalname = "MMSRPRED" ;
      edtMMSRTot_Internalname = "MMSRTOT" ;
      edtMMSRDto_Internalname = "MMSRDTO" ;
      edtMMSRPre_Internalname = "MMSRPRE" ;
      edtMMSRCnt_Internalname = "MMSRCNT" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla MMOSTR", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMMSRCnt_Jsonclick = "" ;
      edtMMSRCnt_Enabled = 1 ;
      edtMMSRPre_Jsonclick = "" ;
      edtMMSRPre_Enabled = 1 ;
      edtMMSRDto_Jsonclick = "" ;
      edtMMSRDto_Enabled = 1 ;
      edtMMSRTot_Jsonclick = "" ;
      edtMMSRTot_Enabled = 1 ;
      edtMMSRPreD_Jsonclick = "" ;
      edtMMSRPreD_Enabled = 1 ;
      edtMMSRStkPre_Jsonclick = "" ;
      edtMMSRStkPre_Enabled = 0 ;
      edtMMSRNom_Jsonclick = "" ;
      edtMMSRNom_Enabled = 0 ;
      edtMMSRCod_Jsonclick = "" ;
      edtMMSRCod_Enabled = 1 ;
      edtMMSCod_Jsonclick = "" ;
      edtMMSCod_Enabled = 1 ;
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
      /* Using cursor T01R017 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Mov de Stock en Mantto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      /* Using cursor T01R015 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9422MMSRNom = T01R015_A9422MMSRNom[0] ;
      n9422MMSRNom = T01R015_n9422MMSRNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", A9422MMSRNom);
      A9423MMSRStkPre = T01R015_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T01R015_n9423MMSRStkPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrimstr( A9423MMSRStkPre, 12, 3));
      pr_default.close(13);
      GX_FocusControl = edtMMSRPreD_Internalname ;
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

   public void valid_Mmscod( )
   {
      /* Using cursor T01R017 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Mov de Stock en Mantto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Mmsrcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01R015 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9421MMSRCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MMSRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MMSRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9422MMSRNom = T01R015_A9422MMSRNom[0] ;
      n9422MMSRNom = T01R015_n9422MMSRNom[0] ;
      A9423MMSRStkPre = T01R015_A9423MMSRStkPre[0] ;
      n9423MMSRStkPre = T01R015_n9423MMSRStkPre[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11510MMSRPreD", GXutil.ltrim( localUtil.ntoc( A11510MMSRPreD, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11511MMSRTot", GXutil.ltrim( localUtil.ntoc( A11511MMSRTot, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11512MMSRDto", GXutil.ltrim( localUtil.ntoc( A11512MMSRDto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9424MMSRPre", GXutil.ltrim( localUtil.ntoc( A9424MMSRPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9409MMSRCnt", GXutil.ltrim( localUtil.ntoc( A9409MMSRCnt, (byte)(10), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9422MMSRNom", GXutil.rtrim( A9422MMSRNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9423MMSRStkPre", GXutil.ltrim( localUtil.ntoc( A9423MMSRStkPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9412MMSCod", GXutil.ltrim( localUtil.ntoc( Z9412MMSCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9421MMSRCod", GXutil.ltrim( localUtil.ntoc( Z9421MMSRCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11510MMSRPreD", GXutil.ltrim( localUtil.ntoc( Z11510MMSRPreD, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11511MMSRTot", GXutil.ltrim( localUtil.ntoc( Z11511MMSRTot, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11512MMSRDto", GXutil.ltrim( localUtil.ntoc( Z11512MMSRDto, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9424MMSRPre", GXutil.ltrim( localUtil.ntoc( Z9424MMSRPre, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9409MMSRCnt", GXutil.ltrim( localUtil.ntoc( Z9409MMSRCnt, (byte)(10), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9422MMSRNom", GXutil.rtrim( Z9422MMSRNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9423MMSRStkPre", GXutil.ltrim( localUtil.ntoc( Z9423MMSRStkPre, (byte)(12), (byte)(3), ".", "")));
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
      setEventMetadata("VALID_MMSCOD","{handler:'valid_Mmscod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_MMSCOD",",oparms:[]}");
      setEventMetadata("VALID_MMSRCOD","{handler:'valid_Mmsrcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'A9421MMSRCod',fld:'MMSRCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MMSRCOD",",oparms:[{av:'A11510MMSRPreD',fld:'MMSRPRED',pic:'ZZZZZZZ9.999'},{av:'A11511MMSRTot',fld:'MMSRTOT',pic:'ZZZZZZZ9.999'},{av:'A11512MMSRDto',fld:'MMSRDTO',pic:'ZZ9.99%'},{av:'A9424MMSRPre',fld:'MMSRPRE',pic:'ZZZZZZZ9.999'},{av:'A9409MMSRCnt',fld:'MMSRCNT',pic:'ZZZZZ9.999'},{av:'A9422MMSRNom',fld:'MMSRNOM',pic:''},{av:'A9423MMSRStkPre',fld:'MMSRSTKPRE',pic:'Z,ZZZ,ZZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9412MMSCod'},{av:'Z9421MMSRCod'},{av:'Z11510MMSRPreD'},{av:'Z11511MMSRTot'},{av:'Z11512MMSRDto'},{av:'Z9424MMSRPre'},{av:'Z9409MMSRCnt'},{av:'Z9422MMSRNom'},{av:'Z9423MMSRStkPre'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11510MMSRPreD = DecimalUtil.ZERO ;
      Z11511MMSRTot = DecimalUtil.ZERO ;
      Z11512MMSRDto = DecimalUtil.ZERO ;
      Z9424MMSRPre = DecimalUtil.ZERO ;
      Z9409MMSRCnt = DecimalUtil.ZERO ;
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
      A9422MMSRNom = "" ;
      A9423MMSRStkPre = DecimalUtil.ZERO ;
      A11510MMSRPreD = DecimalUtil.ZERO ;
      A11511MMSRTot = DecimalUtil.ZERO ;
      A11512MMSRDto = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
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
      Z9422MMSRNom = "" ;
      Z9423MMSRStkPre = DecimalUtil.ZERO ;
      T01R06_A9422MMSRNom = new String[] {""} ;
      T01R06_n9422MMSRNom = new boolean[] {false} ;
      T01R06_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R06_n9423MMSRStkPre = new boolean[] {false} ;
      T01R06_A11510MMSRPreD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R06_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R06_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R06_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R06_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R06_A396EmprCod = new String[] {""} ;
      T01R06_A9412MMSCod = new int[1] ;
      T01R06_A9421MMSRCod = new int[1] ;
      T01R04_A396EmprCod = new String[] {""} ;
      T01R05_A9422MMSRNom = new String[] {""} ;
      T01R05_n9422MMSRNom = new boolean[] {false} ;
      T01R05_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R05_n9423MMSRStkPre = new boolean[] {false} ;
      T01R07_A396EmprCod = new String[] {""} ;
      T01R08_A9422MMSRNom = new String[] {""} ;
      T01R08_n9422MMSRNom = new boolean[] {false} ;
      T01R08_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R08_n9423MMSRStkPre = new boolean[] {false} ;
      T01R09_A396EmprCod = new String[] {""} ;
      T01R09_A9412MMSCod = new int[1] ;
      T01R09_A9421MMSRCod = new int[1] ;
      T01R03_A11510MMSRPreD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R03_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R03_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R03_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R03_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R03_A396EmprCod = new String[] {""} ;
      T01R03_A9412MMSCod = new int[1] ;
      T01R03_A9421MMSRCod = new int[1] ;
      sMode1231 = "" ;
      T01R010_A396EmprCod = new String[] {""} ;
      T01R010_A9412MMSCod = new int[1] ;
      T01R010_A9421MMSRCod = new int[1] ;
      T01R011_A396EmprCod = new String[] {""} ;
      T01R011_A9412MMSCod = new int[1] ;
      T01R011_A9421MMSRCod = new int[1] ;
      T01R02_A11510MMSRPreD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R02_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R02_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R02_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R02_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R02_A396EmprCod = new String[] {""} ;
      T01R02_A9412MMSCod = new int[1] ;
      T01R02_A9421MMSRCod = new int[1] ;
      T01R015_A9422MMSRNom = new String[] {""} ;
      T01R015_n9422MMSRNom = new boolean[] {false} ;
      T01R015_A9423MMSRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R015_n9423MMSRStkPre = new boolean[] {false} ;
      T01R016_A396EmprCod = new String[] {""} ;
      T01R016_A9412MMSCod = new int[1] ;
      T01R016_A9421MMSRCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01R017_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ11510MMSRPreD = DecimalUtil.ZERO ;
      ZZ11511MMSRTot = DecimalUtil.ZERO ;
      ZZ11512MMSRDto = DecimalUtil.ZERO ;
      ZZ9424MMSRPre = DecimalUtil.ZERO ;
      ZZ9409MMSRCnt = DecimalUtil.ZERO ;
      ZZ9422MMSRNom = "" ;
      ZZ9423MMSRStkPre = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.mmostr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.mmostr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.mmostr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.mmostr__default(),
         new Object[] {
             new Object[] {
            T01R02_A11510MMSRPreD, T01R02_A11511MMSRTot, T01R02_A11512MMSRDto, T01R02_A9424MMSRPre, T01R02_A9409MMSRCnt, T01R02_A396EmprCod, T01R02_A9412MMSCod, T01R02_A9421MMSRCod
            }
            , new Object[] {
            T01R03_A11510MMSRPreD, T01R03_A11511MMSRTot, T01R03_A11512MMSRDto, T01R03_A9424MMSRPre, T01R03_A9409MMSRCnt, T01R03_A396EmprCod, T01R03_A9412MMSCod, T01R03_A9421MMSRCod
            }
            , new Object[] {
            T01R04_A396EmprCod
            }
            , new Object[] {
            T01R05_A9422MMSRNom, T01R05_n9422MMSRNom, T01R05_A9423MMSRStkPre, T01R05_n9423MMSRStkPre
            }
            , new Object[] {
            T01R06_A9422MMSRNom, T01R06_n9422MMSRNom, T01R06_A9423MMSRStkPre, T01R06_n9423MMSRStkPre, T01R06_A11510MMSRPreD, T01R06_A11511MMSRTot, T01R06_A11512MMSRDto, T01R06_A9424MMSRPre, T01R06_A9409MMSRCnt, T01R06_A396EmprCod,
            T01R06_A9412MMSCod, T01R06_A9421MMSRCod
            }
            , new Object[] {
            T01R07_A396EmprCod
            }
            , new Object[] {
            T01R08_A9422MMSRNom, T01R08_n9422MMSRNom, T01R08_A9423MMSRStkPre, T01R08_n9423MMSRStkPre
            }
            , new Object[] {
            T01R09_A396EmprCod, T01R09_A9412MMSCod, T01R09_A9421MMSRCod
            }
            , new Object[] {
            T01R010_A396EmprCod, T01R010_A9412MMSCod, T01R010_A9421MMSRCod
            }
            , new Object[] {
            T01R011_A396EmprCod, T01R011_A9412MMSCod, T01R011_A9421MMSRCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01R015_A9422MMSRNom, T01R015_n9422MMSRNom, T01R015_A9423MMSRStkPre, T01R015_n9423MMSRStkPre
            }
            , new Object[] {
            T01R016_A396EmprCod, T01R016_A9412MMSCod, T01R016_A9421MMSRCod
            }
            , new Object[] {
            T01R017_A396EmprCod
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
   private short RcdFound1231 ;
   private short nIsDirty_1231 ;
   private int Z9412MMSCod ;
   private int Z9421MMSRCod ;
   private int A9412MMSCod ;
   private int A9421MMSRCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMMSCod_Enabled ;
   private int edtMMSRCod_Enabled ;
   private int edtMMSRNom_Enabled ;
   private int edtMMSRStkPre_Enabled ;
   private int edtMMSRPreD_Enabled ;
   private int edtMMSRTot_Enabled ;
   private int edtMMSRDto_Enabled ;
   private int edtMMSRPre_Enabled ;
   private int edtMMSRCnt_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ9412MMSCod ;
   private int ZZ9421MMSRCod ;
   private java.math.BigDecimal Z11510MMSRPreD ;
   private java.math.BigDecimal Z11511MMSRTot ;
   private java.math.BigDecimal Z11512MMSRDto ;
   private java.math.BigDecimal Z9424MMSRPre ;
   private java.math.BigDecimal Z9409MMSRCnt ;
   private java.math.BigDecimal A9423MMSRStkPre ;
   private java.math.BigDecimal A11510MMSRPreD ;
   private java.math.BigDecimal A11511MMSRTot ;
   private java.math.BigDecimal A11512MMSRDto ;
   private java.math.BigDecimal A9424MMSRPre ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal Z9423MMSRStkPre ;
   private java.math.BigDecimal ZZ11510MMSRPreD ;
   private java.math.BigDecimal ZZ11511MMSRTot ;
   private java.math.BigDecimal ZZ11512MMSRDto ;
   private java.math.BigDecimal ZZ9424MMSRPre ;
   private java.math.BigDecimal ZZ9409MMSRCnt ;
   private java.math.BigDecimal ZZ9423MMSRStkPre ;
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
   private String edtMMSCod_Internalname ;
   private String edtMMSCod_Jsonclick ;
   private String edtMMSRCod_Internalname ;
   private String edtMMSRCod_Jsonclick ;
   private String edtMMSRNom_Internalname ;
   private String A9422MMSRNom ;
   private String edtMMSRNom_Jsonclick ;
   private String edtMMSRStkPre_Internalname ;
   private String edtMMSRStkPre_Jsonclick ;
   private String edtMMSRPreD_Internalname ;
   private String edtMMSRPreD_Jsonclick ;
   private String edtMMSRTot_Internalname ;
   private String edtMMSRTot_Jsonclick ;
   private String edtMMSRDto_Internalname ;
   private String edtMMSRDto_Jsonclick ;
   private String edtMMSRPre_Internalname ;
   private String edtMMSRPre_Jsonclick ;
   private String edtMMSRCnt_Internalname ;
   private String edtMMSRCnt_Jsonclick ;
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
   private String Z9422MMSRNom ;
   private String sMode1231 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9422MMSRNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n9422MMSRNom ;
   private boolean n9423MMSRStkPre ;
   private IDataStoreProvider pr_default ;
   private String[] T01R06_A9422MMSRNom ;
   private boolean[] T01R06_n9422MMSRNom ;
   private java.math.BigDecimal[] T01R06_A9423MMSRStkPre ;
   private boolean[] T01R06_n9423MMSRStkPre ;
   private java.math.BigDecimal[] T01R06_A11510MMSRPreD ;
   private java.math.BigDecimal[] T01R06_A11511MMSRTot ;
   private java.math.BigDecimal[] T01R06_A11512MMSRDto ;
   private java.math.BigDecimal[] T01R06_A9424MMSRPre ;
   private java.math.BigDecimal[] T01R06_A9409MMSRCnt ;
   private String[] T01R06_A396EmprCod ;
   private int[] T01R06_A9412MMSCod ;
   private int[] T01R06_A9421MMSRCod ;
   private String[] T01R04_A396EmprCod ;
   private String[] T01R05_A9422MMSRNom ;
   private boolean[] T01R05_n9422MMSRNom ;
   private java.math.BigDecimal[] T01R05_A9423MMSRStkPre ;
   private boolean[] T01R05_n9423MMSRStkPre ;
   private String[] T01R07_A396EmprCod ;
   private String[] T01R08_A9422MMSRNom ;
   private boolean[] T01R08_n9422MMSRNom ;
   private java.math.BigDecimal[] T01R08_A9423MMSRStkPre ;
   private boolean[] T01R08_n9423MMSRStkPre ;
   private String[] T01R09_A396EmprCod ;
   private int[] T01R09_A9412MMSCod ;
   private int[] T01R09_A9421MMSRCod ;
   private java.math.BigDecimal[] T01R03_A11510MMSRPreD ;
   private java.math.BigDecimal[] T01R03_A11511MMSRTot ;
   private java.math.BigDecimal[] T01R03_A11512MMSRDto ;
   private java.math.BigDecimal[] T01R03_A9424MMSRPre ;
   private java.math.BigDecimal[] T01R03_A9409MMSRCnt ;
   private String[] T01R03_A396EmprCod ;
   private int[] T01R03_A9412MMSCod ;
   private int[] T01R03_A9421MMSRCod ;
   private String[] T01R010_A396EmprCod ;
   private int[] T01R010_A9412MMSCod ;
   private int[] T01R010_A9421MMSRCod ;
   private String[] T01R011_A396EmprCod ;
   private int[] T01R011_A9412MMSCod ;
   private int[] T01R011_A9421MMSRCod ;
   private java.math.BigDecimal[] T01R02_A11510MMSRPreD ;
   private java.math.BigDecimal[] T01R02_A11511MMSRTot ;
   private java.math.BigDecimal[] T01R02_A11512MMSRDto ;
   private java.math.BigDecimal[] T01R02_A9424MMSRPre ;
   private java.math.BigDecimal[] T01R02_A9409MMSRCnt ;
   private String[] T01R02_A396EmprCod ;
   private int[] T01R02_A9412MMSCod ;
   private int[] T01R02_A9421MMSRCod ;
   private String[] T01R015_A9422MMSRNom ;
   private boolean[] T01R015_n9422MMSRNom ;
   private java.math.BigDecimal[] T01R015_A9423MMSRStkPre ;
   private boolean[] T01R015_n9423MMSRStkPre ;
   private String[] T01R016_A396EmprCod ;
   private int[] T01R016_A9412MMSCod ;
   private int[] T01R016_A9421MMSRCod ;
   private String[] T01R017_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mmostr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mmostr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mmostr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mmostr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01R02", "SELECT MMSRPreD, MMSRTot, MMSRDto, MMSRPre, MMSRCnt, EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ?  FOR UPDATE OF MMSRPreD, MMSRTot, MMSRDto, MMSRPre, MMSRCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R03", "SELECT MMSRPreD, MMSRTot, MMSRDto, MMSRPre, MMSRCnt, EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R04", "SELECT EmprCod FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R05", "SELECT MRNom AS MMSRNom, MRStkPre AS MMSRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R06", "SELECT /*+ FIRST_ROWS(100) */ T2.MRNom AS MMSRNom, T2.MRStkPre AS MMSRStkPre, TM1.MMSRPreD, TM1.MMSRTot, TM1.MMSRDto, TM1.MMSRPre, TM1.MMSRCnt, TM1.EmprCod, TM1.MMSCod, TM1.MMSRCod AS MMSRCod FROM (TXPMMoStR TM1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = TM1.EmprCod AND T2.MRCod = TM1.MMSRCod) WHERE TM1.EmprCod = ? and TM1.MMSCod = ? and TM1.MMSRCod = ? ORDER BY TM1.EmprCod, TM1.MMSCod, TM1.MMSRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R07", "SELECT EmprCod FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R08", "SELECT MRNom AS MMSRNom, MRStkPre AS MMSRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R09", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R010", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE ( EmprCod > ? or EmprCod = ? and MMSCod > ? or MMSCod = ? and EmprCod = ? and MMSRCod > ?) ORDER BY EmprCod, MMSCod, MMSRCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R011", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MMSCod, MMSRCod FROM TXPMMoStR WHERE ( EmprCod < ? or EmprCod = ? and MMSCod < ? or MMSCod = ? and EmprCod = ? and MMSRCod < ?) ORDER BY EmprCod DESC, MMSCod DESC, MMSRCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01R012", "INSERT INTO TXPMMoStR(MMSRPreD, MMSRTot, MMSRDto, MMSRPre, MMSRCnt, EmprCod, MMSCod, MMSRCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMMoStR")
         ,new UpdateCursor("T01R013", "UPDATE TXPMMoStR SET MMSRPreD=?, MMSRTot=?, MMSRDto=?, MMSRPre=?, MMSRCnt=?  WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ?", GX_NOMASK, "TXPMMoStR")
         ,new UpdateCursor("T01R014", "DELETE FROM TXPMMoStR  WHERE EmprCod = ? AND MMSCod = ? AND MMSRCod = ?", GX_NOMASK, "TXPMMoStR")
         ,new ForEachCursor("T01R015", "SELECT MRNom AS MMSRNom, MRStkPre AS MMSRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R016", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MMSCod, MMSRCod FROM TXPMMoStR ORDER BY EmprCod, MMSCod, MMSRCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R017", "SELECT EmprCod FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

