package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tobsrec_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtobsrec_level1item") == 0 )
      {
         gxnrgridtobsrec_level1item_newrow_invoke( ) ;
         return  ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OBSERVACIONES RECETA", ""), (short)(0)) ;
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

   public void gxnrgridtobsrec_level1item_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtobsrec_level1item_newrow( ) ;
      /* End function gxnrGridtobsrec_level1item_newrow_invoke */
   }

   public tobsrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tobsrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tobsrec_impl.class ));
   }

   public tobsrec_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "OBSERVACIONES RECETA", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TOBSREC.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TOBSREC.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLinMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLinMaq_Internalname, httpContext.getMessage( "Linea Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecUltObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecUltObs_Internalname, httpContext.getMessage( "Ultima Linea Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecUltObs_Internalname, GXutil.ltrim( localUtil.ntoc( A5256RecUltObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecUltObs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5256RecUltObs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5256RecUltObs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecUltObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecUltObs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOBSREC.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLevel1table_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtobsrec_level1item( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOBSREC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtobsrec_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount769 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_769 = (short)(1) ;
            scanStartP5769( ) ;
            while ( RcdFound769 != 0 )
            {
               init_level_properties769( ) ;
               getByPrimaryKeyP5769( ) ;
               addRowP5769( ) ;
               scanNextP5769( ) ;
            }
            scanEndP5769( ) ;
            nBlankRcdCount769 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalP5769( ) ;
         standaloneModalP5769( ) ;
         sMode769 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRowP5769( ) ;
            edtRecLinObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLINOBS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtRecTxtObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECTXTOBS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTxtObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_769 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalP5769( ) ;
            }
            sendRowP5769( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode769 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount769 = (short)(5) ;
         nRcdExists_769 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartP5769( ) ;
            while ( RcdFound769 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_73769( ) ;
               init_level_properties769( ) ;
               standaloneNotModalP5769( ) ;
               getByPrimaryKeyP5769( ) ;
               standaloneModalP5769( ) ;
               addRowP5769( ) ;
               scanNextP5769( ) ;
            }
            scanEndP5769( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode769 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_73769( ) ;
      initAllP5769( ) ;
      init_level_properties769( ) ;
      nRcdExists_769 = (short)(0) ;
      nIsMod_769 = (short)(0) ;
      nRcdDeleted_769 = (short)(0) ;
      nBlankRcdCount769 = (short)(nBlankRcdUsr769+nBlankRcdCount769) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount769 > 0 )
      {
         standaloneNotModalP5769( ) ;
         standaloneModalP5769( ) ;
         addRowP5769( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRecLinObs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount769 = (short)(nBlankRcdCount769-1) ;
      }
      Gx_mode = sMode769 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtobsrec_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtobsrec_level1item", Gridtobsrec_level1itemContainer, subGridtobsrec_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtobsrec_level1itemContainerData", Gridtobsrec_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtobsrec_level1itemContainerData"+"V", Gridtobsrec_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtobsrec_level1itemContainerData"+"V"+"\" value='"+Gridtobsrec_level1itemContainer.GridValuesHidden()+"'/>") ;
      }
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z2804RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5256RecUltObs = (short)(localUtil.ctol( httpContext.cgiGet( "Z5256RecUltObs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINMAQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLinMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2804RecLinMaq = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         }
         else
         {
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecUltObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecUltObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECULTOBS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecUltObs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5256RecUltObs = (short)(0) ;
            n5256RecUltObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5256RecUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5256RecUltObs), 4, 0));
         }
         else
         {
            A5256RecUltObs = (short)(localUtil.ctol( httpContext.cgiGet( edtRecUltObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5256RecUltObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5256RecUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5256RecUltObs), 4, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
            initAllP5408( ) ;
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
      disableAttributesP5408( ) ;
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

   public void confirm_P5769( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRowP5769( ) ;
         if ( ( nRcdExists_769 != 0 ) || ( nIsMod_769 != 0 ) )
         {
            getKeyP5769( ) ;
            if ( ( nRcdExists_769 == 0 ) && ( nRcdDeleted_769 == 0 ) )
            {
               if ( RcdFound769 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateP5769( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableP5769( ) ;
                     closeExtendedTableCursorsP5769( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RECLINOBS_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRecLinObs_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound769 != 0 )
               {
                  if ( nRcdDeleted_769 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyP5769( ) ;
                     loadP5769( ) ;
                     beforeValidateP5769( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsP5769( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_769 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateP5769( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableP5769( ) ;
                           closeExtendedTableCursorsP5769( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_769 == 0 )
                  {
                     GXCCtl = "RECLINOBS_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecLinObs_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRecLinObs_Internalname, GXutil.ltrim( localUtil.ntoc( A5257RecLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecTxtObs_Internalname, GXutil.rtrim( A5258RecTxtObs)) ;
         httpContext.changePostValue( "ZT_"+"Z5257RecLinObs_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z5257RecLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5258RecTxtObs_"+sGXsfl_73_idx, GXutil.rtrim( Z5258RecTxtObs)) ;
         httpContext.changePostValue( "nRcdDeleted_769_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_769_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_769_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_769 != 0 )
         {
            httpContext.changePostValue( "RECLINOBS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECTXTOBS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecTxtObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionP50( )
   {
   }

   public void zmP5408( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5256RecUltObs = T00P55_A5256RecUltObs[0] ;
         }
         else
         {
            Z5256RecUltObs = A5256RecUltObs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z5256RecUltObs = A5256RecUltObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
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

   public void loadP5408( )
   {
      /* Using cursor T00P58 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A5256RecUltObs = T00P58_A5256RecUltObs[0] ;
         n5256RecUltObs = T00P58_n5256RecUltObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5256RecUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5256RecUltObs), 4, 0));
         A407EmprNom = T00P58_A407EmprNom[0] ;
         n407EmprNom = T00P58_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmP5408( -1) ;
      }
      pr_default.close(6);
      onLoadActionsP5408( ) ;
   }

   public void onLoadActionsP5408( )
   {
   }

   public void checkExtendedTableP5408( )
   {
      nIsDirty_408 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00P56 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00P56_A407EmprNom[0] ;
      n407EmprNom = T00P56_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00P57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsP5408( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00P59 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00P59_A407EmprNom[0] ;
      n407EmprNom = T00P59_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T00P510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKeyP5408( )
   {
      /* Using cursor T00P511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound408 = (short)(1) ;
      }
      else
      {
         RcdFound408 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00P55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmP5408( 1) ;
         RcdFound408 = (short)(1) ;
         A2804RecLinMaq = T00P55_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A5256RecUltObs = T00P55_A5256RecUltObs[0] ;
         n5256RecUltObs = T00P55_n5256RecUltObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5256RecUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5256RecUltObs), 4, 0));
         A396EmprCod = T00P55_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00P55_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00P55_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00P55_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         sMode408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadP5408( ) ;
         if ( AnyError == 1 )
         {
            RcdFound408 = (short)(0) ;
            initializeNonKeyP5408( ) ;
         }
         Gx_mode = sMode408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound408 = (short)(0) ;
         initializeNonKeyP5408( ) ;
         sMode408 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode408 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyP5408( ) ;
      if ( RcdFound408 == 0 )
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
      RcdFound408 = (short)(0) ;
      /* Using cursor T00P512 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P512_A129BarCod[0] < A129BarCod ) || ( T00P512_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P512_A132BarCodReo[0] < A132BarCodReo ) || ( T00P512_A132BarCodReo[0] == A132BarCodReo ) && ( T00P512_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00P512_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00P512_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00P512_A132BarCodReo[0] == A132BarCodReo ) && ( T00P512_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P512_A2804RecLinMaq[0] < A2804RecLinMaq ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P512_A129BarCod[0] > A129BarCod ) || ( T00P512_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P512_A132BarCodReo[0] > A132BarCodReo ) || ( T00P512_A132BarCodReo[0] == A132BarCodReo ) && ( T00P512_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00P512_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00P512_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00P512_A132BarCodReo[0] == A132BarCodReo ) && ( T00P512_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P512_A2804RecLinMaq[0] > A2804RecLinMaq ) ) )
         {
            A396EmprCod = T00P512_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T00P512_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00P512_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00P512_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T00P512_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            RcdFound408 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound408 = (short)(0) ;
      /* Using cursor T00P513 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P513_A129BarCod[0] > A129BarCod ) || ( T00P513_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P513_A132BarCodReo[0] > A132BarCodReo ) || ( T00P513_A132BarCodReo[0] == A132BarCodReo ) && ( T00P513_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00P513_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00P513_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00P513_A132BarCodReo[0] == A132BarCodReo ) && ( T00P513_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P513_A2804RecLinMaq[0] > A2804RecLinMaq ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P513_A129BarCod[0] < A129BarCod ) || ( T00P513_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P513_A132BarCodReo[0] < A132BarCodReo ) || ( T00P513_A132BarCodReo[0] == A132BarCodReo ) && ( T00P513_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00P513_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00P513_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00P513_A132BarCodReo[0] == A132BarCodReo ) && ( T00P513_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00P513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00P513_A2804RecLinMaq[0] < A2804RecLinMaq ) ) )
         {
            A396EmprCod = T00P513_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T00P513_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T00P513_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T00P513_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T00P513_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            RcdFound408 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyP5408( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertP5408( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound408 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = Z2804RecLinMaq ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
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
               updateP5408( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertP5408( ) ;
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
                  insertP5408( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = Z2804RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRecUltObs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartP5408( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecUltObs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndP5408( ) ;
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecUltObs_Internalname ;
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
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecUltObs_Internalname ;
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
      scanStartP5408( ) ;
      if ( RcdFound408 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound408 != 0 )
         {
            scanNextP5408( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecUltObs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndP5408( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyP5408( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00P54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z5256RecUltObs != T00P54_A5256RecUltObs[0] ) )
         {
            if ( Z5256RecUltObs != T00P54_A5256RecUltObs[0] )
            {
               GXutil.writeLogln("tobsrec:[seudo value changed for attri]"+"RecUltObs");
               GXutil.writeLogRaw("Old: ",Z5256RecUltObs);
               GXutil.writeLogRaw("Current: ",T00P54_A5256RecUltObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertP5408( )
   {
      beforeValidateP5408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableP5408( ) ;
      }
      if ( AnyError == 0 )
      {
         zmP5408( 0) ;
         checkOptimisticConcurrencyP5408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmP5408( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertP5408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00P514 */
                  pr_default.execute(12, new Object[] {Short.valueOf(A2804RecLinMaq), Boolean.valueOf(n5256RecUltObs), Short.valueOf(A5256RecUltObs), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevelP5408( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionP50( ) ;
                        }
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
            loadP5408( ) ;
         }
         endLevelP5408( ) ;
      }
      closeExtendedTableCursorsP5408( ) ;
   }

   public void updateP5408( )
   {
      beforeValidateP5408( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableP5408( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyP5408( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmP5408( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateP5408( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00P515 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n5256RecUltObs), Short.valueOf(A5256RecUltObs), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECMAQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateP5408( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelP5408( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionP50( ) ;
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
         }
         endLevelP5408( ) ;
      }
      closeExtendedTableCursorsP5408( ) ;
   }

   public void deferredUpdateP5408( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateP5408( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyP5408( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsP5408( ) ;
         afterConfirmP5408( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteP5408( ) ;
            if ( AnyError == 0 )
            {
               scanStartP5769( ) ;
               while ( RcdFound769 != 0 )
               {
                  getByPrimaryKeyP5769( ) ;
                  deleteP5769( ) ;
                  scanNextP5769( ) ;
               }
               scanEndP5769( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00P516 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound408 == 0 )
                        {
                           initAllP5408( ) ;
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
                        resetCaptionP50( ) ;
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
      }
      sMode408 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelP5408( ) ;
      Gx_mode = sMode408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsP5408( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00P517 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T00P517_A407EmprNom[0] ;
         n407EmprNom = T00P517_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00P518 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00P519 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECFAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00P520 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevelP5769( )
   {
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRowP5769( ) ;
         if ( ( nRcdExists_769 != 0 ) || ( nIsMod_769 != 0 ) )
         {
            standaloneNotModalP5769( ) ;
            getKeyP5769( ) ;
            if ( ( nRcdExists_769 == 0 ) && ( nRcdDeleted_769 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertP5769( ) ;
            }
            else
            {
               if ( RcdFound769 != 0 )
               {
                  if ( ( nRcdDeleted_769 != 0 ) && ( nRcdExists_769 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteP5769( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_769 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateP5769( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_769 == 0 )
                  {
                     GXCCtl = "RECLINOBS_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecLinObs_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRecLinObs_Internalname, GXutil.ltrim( localUtil.ntoc( A5257RecLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecTxtObs_Internalname, GXutil.rtrim( A5258RecTxtObs)) ;
         httpContext.changePostValue( "ZT_"+"Z5257RecLinObs_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z5257RecLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5258RecTxtObs_"+sGXsfl_73_idx, GXutil.rtrim( Z5258RecTxtObs)) ;
         httpContext.changePostValue( "nRcdDeleted_769_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_769_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_769_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_769 != 0 )
         {
            httpContext.changePostValue( "RECLINOBS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECTXTOBS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecTxtObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllP5769( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_769 = (short)(0) ;
      nIsMod_769 = (short)(0) ;
      nRcdDeleted_769 = (short)(0) ;
   }

   public void processLevelP5408( )
   {
      /* Save parent mode. */
      sMode408 = Gx_mode ;
      processNestedLevelP5769( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode408 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelP5408( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteP5408( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tobsrec");
         if ( AnyError == 0 )
         {
            confirmValuesP50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tobsrec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartP5408( )
   {
      /* Using cursor T00P521 */
      pr_default.execute(19);
      RcdFound408 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A396EmprCod = T00P521_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00P521_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00P521_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00P521_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T00P521_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextP5408( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound408 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound408 = (short)(1) ;
         A396EmprCod = T00P521_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00P521_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00P521_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00P521_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T00P521_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
   }

   public void scanEndP5408( )
   {
      pr_default.close(19);
   }

   public void afterConfirmP5408( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertP5408( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateP5408( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteP5408( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteP5408( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateP5408( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesP5408( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtRecLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      edtRecUltObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUltObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltObs_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmP5769( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5258RecTxtObs = T00P53_A5258RecTxtObs[0] ;
         }
         else
         {
            Z5258RecTxtObs = A5258RecTxtObs ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z5257RecLinObs = A5257RecLinObs ;
         Z5258RecTxtObs = A5258RecTxtObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalP5769( )
   {
   }

   public void standaloneModalP5769( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRecLinObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtRecLinObs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void loadP5769( )
   {
      /* Using cursor T00P522 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound769 = (short)(1) ;
         A5258RecTxtObs = T00P522_A5258RecTxtObs[0] ;
         n5258RecTxtObs = T00P522_n5258RecTxtObs[0] ;
         zmP5769( -4) ;
      }
      pr_default.close(20);
      onLoadActionsP5769( ) ;
   }

   public void onLoadActionsP5769( )
   {
   }

   public void checkExtendedTableP5769( )
   {
      nIsDirty_769 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalP5769( ) ;
   }

   public void closeExtendedTableCursorsP5769( )
   {
   }

   public void enableDisableP5769( )
   {
   }

   public void getKeyP5769( )
   {
      /* Using cursor T00P523 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound769 = (short)(1) ;
      }
      else
      {
         RcdFound769 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKeyP5769( )
   {
      /* Using cursor T00P53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmP5769( 4) ;
         RcdFound769 = (short)(1) ;
         initializeNonKeyP5769( ) ;
         A5257RecLinObs = T00P53_A5257RecLinObs[0] ;
         A5258RecTxtObs = T00P53_A5258RecTxtObs[0] ;
         n5258RecTxtObs = T00P53_n5258RecTxtObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z5257RecLinObs = A5257RecLinObs ;
         sMode769 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalP5769( ) ;
         loadP5769( ) ;
         Gx_mode = sMode769 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound769 = (short)(0) ;
         initializeNonKeyP5769( ) ;
         sMode769 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalP5769( ) ;
         Gx_mode = sMode769 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesP5769( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyP5769( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00P52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5258RecTxtObs, T00P52_A5258RecTxtObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5258RecTxtObs, T00P52_A5258RecTxtObs[0]) != 0 )
            {
               GXutil.writeLogln("tobsrec:[seudo value changed for attri]"+"RecTxtObs");
               GXutil.writeLogRaw("Old: ",Z5258RecTxtObs);
               GXutil.writeLogRaw("Current: ",T00P52_A5258RecTxtObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertP5769( )
   {
      beforeValidateP5769( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableP5769( ) ;
      }
      if ( AnyError == 0 )
      {
         zmP5769( 0) ;
         checkOptimisticConcurrencyP5769( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmP5769( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertP5769( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00P524 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs), Boolean.valueOf(n5258RecTxtObs), A5258RecTxtObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
                  if ( (pr_default.getStatus(22) == 1) )
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
            loadP5769( ) ;
         }
         endLevelP5769( ) ;
      }
      closeExtendedTableCursorsP5769( ) ;
   }

   public void updateP5769( )
   {
      beforeValidateP5769( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableP5769( ) ;
      }
      if ( ( nIsMod_769 != 0 ) || ( nIsDirty_769 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyP5769( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmP5769( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateP5769( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00P525 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n5258RecTxtObs), A5258RecTxtObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSREC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateP5769( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyP5769( ) ;
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
            endLevelP5769( ) ;
         }
      }
      closeExtendedTableCursorsP5769( ) ;
   }

   public void deferredUpdateP5769( )
   {
   }

   public void deleteP5769( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateP5769( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyP5769( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsP5769( ) ;
         afterConfirmP5769( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteP5769( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00P526 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5257RecLinObs)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSREC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode769 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelP5769( ) ;
      Gx_mode = sMode769 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsP5769( )
   {
      standaloneModalP5769( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelP5769( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartP5769( )
   {
      /* Scan By routine */
      /* Using cursor T00P527 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      RcdFound769 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound769 = (short)(1) ;
         A5257RecLinObs = T00P527_A5257RecLinObs[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextP5769( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound769 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound769 = (short)(1) ;
         A5257RecLinObs = T00P527_A5257RecLinObs[0] ;
      }
   }

   public void scanEndP5769( )
   {
      pr_default.close(25);
   }

   public void afterConfirmP5769( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertP5769( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateP5769( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteP5769( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteP5769( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateP5769( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesP5769( )
   {
      edtRecLinObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtRecTxtObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTxtObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashesP5769( )
   {
   }

   public void send_integrity_lvl_hashesP5408( )
   {
   }

   public void subsflControlProps_73769( )
   {
      edtRecLinObs_Internalname = "RECLINOBS_"+sGXsfl_73_idx ;
      edtRecTxtObs_Internalname = "RECTXTOBS_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_73769( )
   {
      edtRecLinObs_Internalname = "RECLINOBS_"+sGXsfl_73_fel_idx ;
      edtRecTxtObs_Internalname = "RECTXTOBS_"+sGXsfl_73_fel_idx ;
   }

   public void addRowP5769( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_73769( ) ;
      sendRowP5769( ) ;
   }

   public void sendRowP5769( )
   {
      Gridtobsrec_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtobsrec_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtobsrec_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtobsrec_level1item_Class, "") != 0 )
         {
            subGridtobsrec_level1item_Linesclass = subGridtobsrec_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtobsrec_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtobsrec_level1item_Backstyle = (byte)(0) ;
         subGridtobsrec_level1item_Backcolor = subGridtobsrec_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtobsrec_level1item_Class, "") != 0 )
         {
            subGridtobsrec_level1item_Linesclass = subGridtobsrec_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtobsrec_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtobsrec_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtobsrec_level1item_Class, "") != 0 )
         {
            subGridtobsrec_level1item_Linesclass = subGridtobsrec_level1item_Class+"Odd" ;
         }
         subGridtobsrec_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtobsrec_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtobsrec_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridtobsrec_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtobsrec_level1item_Class, "") != 0 )
            {
               subGridtobsrec_level1item_Linesclass = subGridtobsrec_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtobsrec_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtobsrec_level1item_Class, "") != 0 )
            {
               subGridtobsrec_level1item_Linesclass = subGridtobsrec_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_769_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtobsrec_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinObs_Internalname,GXutil.ltrim( localUtil.ntoc( A5257RecLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5257RecLinObs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecLinObs_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_769_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridtobsrec_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecTxtObs_Internalname,GXutil.rtrim( A5258RecTxtObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecTxtObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecTxtObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtobsrec_level1itemRow);
      send_integrity_lvl_hashesP5769( ) ;
      GXCCtl = "Z5257RecLinObs_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5257RecLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5258RecTxtObs_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5258RecTxtObs));
      GXCCtl = "nRcdDeleted_769_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_769_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_769_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_769, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINOBS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECTXTOBS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecTxtObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtobsrec_level1itemContainer.AddRow(Gridtobsrec_level1itemRow);
   }

   public void readRowP5769( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_73769( ) ;
      edtRecLinObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLINOBS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecTxtObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECTXTOBS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "RECLINOBS_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecLinObs_Internalname ;
         wbErr = true ;
         A5257RecLinObs = (short)(0) ;
      }
      else
      {
         A5257RecLinObs = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5258RecTxtObs = httpContext.cgiGet( edtRecTxtObs_Internalname) ;
      n5258RecTxtObs = false ;
      GXCCtl = "Z5257RecLinObs_" + sGXsfl_73_idx ;
      Z5257RecLinObs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5258RecTxtObs_" + sGXsfl_73_idx ;
      Z5258RecTxtObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_769_" + sGXsfl_73_idx ;
      nRcdDeleted_769 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_769_" + sGXsfl_73_idx ;
      nRcdExists_769 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_769_" + sGXsfl_73_idx ;
      nIsMod_769 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRecLinObs_Enabled = edtRecLinObs_Enabled ;
   }

   public void confirmValuesP50( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_73769( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_73769( ) ;
         httpContext.changePostValue( "Z5257RecLinObs_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5257RecLinObs_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5257RecLinObs_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( "Z5258RecTxtObs_"+sGXsfl_73_idx, httpContext.cgiGet( "ZT_"+"Z5258RecTxtObs_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5258RecTxtObs_"+sGXsfl_73_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tobsrec", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5256RecUltObs", GXutil.ltrim( localUtil.ntoc( Z5256RecUltObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tobsrec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TOBSREC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OBSERVACIONES RECETA", "") ;
   }

   public void initializeNonKeyP5408( )
   {
      A5256RecUltObs = (short)(0) ;
      n5256RecUltObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5256RecUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5256RecUltObs), 4, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      Z5256RecUltObs = (short)(0) ;
   }

   public void initAllP5408( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2804RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      initializeNonKeyP5408( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyP5769( )
   {
      A5258RecTxtObs = "" ;
      n5258RecTxtObs = false ;
      Z5258RecTxtObs = "" ;
   }

   public void initAllP5769( )
   {
      A5257RecLinObs = (short)(0) ;
      initializeNonKeyP5769( ) ;
   }

   public void standaloneModalInsertP5769( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241523297", true, true);
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
      httpContext.AddJavascriptSource("tobsrec.js", "?20268241523297", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties769( )
   {
      edtRecLinObs_Enabled = defedtRecLinObs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinObs_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridtobsrec_level1itemContainer.AddObjectProperty("GridName", "Gridtobsrec_level1item");
      Gridtobsrec_level1itemContainer.AddObjectProperty("Header", subGridtobsrec_level1item_Header);
      Gridtobsrec_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtobsrec_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtobsrec_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtobsrec_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtobsrec_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5257RecLinObs, (byte)(4), (byte)(0), ".", "")));
      Gridtobsrec_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddColumnProperties(Gridtobsrec_level1itemColumn);
      Gridtobsrec_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtobsrec_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A5258RecTxtObs));
      Gridtobsrec_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecTxtObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddColumnProperties(Gridtobsrec_level1itemColumn);
      Gridtobsrec_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtobsrec_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtobsrec_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecUltObs_Internalname = "RECULTOBS" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtRecLinObs_Internalname = "RECLINOBS" ;
      edtRecTxtObs_Internalname = "RECTXTOBS" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtobsrec_level1item_Internalname = "GRIDTOBSREC_LEVEL1ITEM" ;
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
      subGridtobsrec_level1item_Allowcollapsing = (byte)(0) ;
      subGridtobsrec_level1item_Allowselection = (byte)(0) ;
      subGridtobsrec_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "OBSERVACIONES RECETA", "") );
      edtRecTxtObs_Jsonclick = "" ;
      edtRecLinObs_Jsonclick = "" ;
      subGridtobsrec_level1item_Class = "Grid" ;
      subGridtobsrec_level1item_Backcolorstyle = (byte)(0) ;
      edtRecTxtObs_Enabled = 1 ;
      edtRecLinObs_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtRecUltObs_Jsonclick = "" ;
      edtRecUltObs_Enabled = 1 ;
      edtRecLinMaq_Jsonclick = "" ;
      edtRecLinMaq_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
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

   public void gxnrgridtobsrec_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_73769( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalP5769( ) ;
         standaloneModalP5769( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowP5769( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_73769( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtobsrec_level1itemContainer)) ;
      /* End function gxnrGridtobsrec_level1item_newrow */
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
      /* Using cursor T00P517 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00P517_A407EmprNom[0] ;
      n407EmprNom = T00P517_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(15);
      /* Using cursor T00P528 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(26);
      GX_FocusControl = edtRecUltObs_Internalname ;
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
      /* Using cursor T00P517 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00P517_A407EmprNom[0] ;
      n407EmprNom = T00P517_n407EmprNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Barcodpar( )
   {
      /* Using cursor T00P528 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Reclinmaq( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5256RecUltObs", GXutil.ltrim( localUtil.ntoc( A5256RecUltObs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5256RecUltObs", GXutil.ltrim( localUtil.ntoc( Z5256RecUltObs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[{av:'A5256RecUltObs',fld:'RECULTOBS',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2804RecLinMaq'},{av:'Z5256RecUltObs'},{av:'Z407EmprNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECLINOBS","{handler:'valid_Reclinobs',iparms:[]");
      setEventMetadata("VALID_RECLINOBS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Rectxtobs',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z5258RecTxtObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
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
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtobsrec_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode769 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A5258RecTxtObs = "" ;
      Z407EmprNom = "" ;
      T00P58_A2804RecLinMaq = new short[1] ;
      T00P58_A5256RecUltObs = new short[1] ;
      T00P58_n5256RecUltObs = new boolean[] {false} ;
      T00P58_A407EmprNom = new String[] {""} ;
      T00P58_n407EmprNom = new boolean[] {false} ;
      T00P58_A396EmprCod = new String[] {""} ;
      T00P58_A129BarCod = new int[1] ;
      T00P58_A132BarCodReo = new byte[1] ;
      T00P58_A130BarCodPar = new String[] {""} ;
      T00P56_A407EmprNom = new String[] {""} ;
      T00P56_n407EmprNom = new boolean[] {false} ;
      T00P57_A396EmprCod = new String[] {""} ;
      T00P59_A407EmprNom = new String[] {""} ;
      T00P59_n407EmprNom = new boolean[] {false} ;
      T00P510_A396EmprCod = new String[] {""} ;
      T00P511_A396EmprCod = new String[] {""} ;
      T00P511_A129BarCod = new int[1] ;
      T00P511_A132BarCodReo = new byte[1] ;
      T00P511_A130BarCodPar = new String[] {""} ;
      T00P511_A2804RecLinMaq = new short[1] ;
      T00P55_A2804RecLinMaq = new short[1] ;
      T00P55_A5256RecUltObs = new short[1] ;
      T00P55_n5256RecUltObs = new boolean[] {false} ;
      T00P55_A396EmprCod = new String[] {""} ;
      T00P55_A129BarCod = new int[1] ;
      T00P55_A132BarCodReo = new byte[1] ;
      T00P55_A130BarCodPar = new String[] {""} ;
      sMode408 = "" ;
      T00P512_A396EmprCod = new String[] {""} ;
      T00P512_A129BarCod = new int[1] ;
      T00P512_A132BarCodReo = new byte[1] ;
      T00P512_A130BarCodPar = new String[] {""} ;
      T00P512_A2804RecLinMaq = new short[1] ;
      T00P513_A396EmprCod = new String[] {""} ;
      T00P513_A129BarCod = new int[1] ;
      T00P513_A132BarCodReo = new byte[1] ;
      T00P513_A130BarCodPar = new String[] {""} ;
      T00P513_A2804RecLinMaq = new short[1] ;
      T00P54_A2804RecLinMaq = new short[1] ;
      T00P54_A5256RecUltObs = new short[1] ;
      T00P54_n5256RecUltObs = new boolean[] {false} ;
      T00P54_A396EmprCod = new String[] {""} ;
      T00P54_A129BarCod = new int[1] ;
      T00P54_A132BarCodReo = new byte[1] ;
      T00P54_A130BarCodPar = new String[] {""} ;
      T00P517_A407EmprNom = new String[] {""} ;
      T00P517_n407EmprNom = new boolean[] {false} ;
      T00P518_A396EmprCod = new String[] {""} ;
      T00P518_A129BarCod = new int[1] ;
      T00P518_A132BarCodReo = new byte[1] ;
      T00P518_A130BarCodPar = new String[] {""} ;
      T00P518_A2804RecLinMaq = new short[1] ;
      T00P518_A5408RecLinCol = new short[1] ;
      T00P519_A396EmprCod = new String[] {""} ;
      T00P519_A129BarCod = new int[1] ;
      T00P519_A132BarCodReo = new byte[1] ;
      T00P519_A130BarCodPar = new String[] {""} ;
      T00P519_A2804RecLinMaq = new short[1] ;
      T00P519_A4274RecBarCAg = new int[1] ;
      T00P519_A4275RecBarRAg = new byte[1] ;
      T00P519_A4276RecBarPAg = new String[] {""} ;
      T00P519_A4698RecBarNPd = new int[1] ;
      T00P519_A4699RecBarOrd = new short[1] ;
      T00P520_A396EmprCod = new String[] {""} ;
      T00P520_A129BarCod = new int[1] ;
      T00P520_A132BarCodReo = new byte[1] ;
      T00P520_A130BarCodPar = new String[] {""} ;
      T00P520_A2804RecLinMaq = new short[1] ;
      T00P520_A1273RecLinPro = new byte[1] ;
      T00P521_A396EmprCod = new String[] {""} ;
      T00P521_A129BarCod = new int[1] ;
      T00P521_A132BarCodReo = new byte[1] ;
      T00P521_A130BarCodPar = new String[] {""} ;
      T00P521_A2804RecLinMaq = new short[1] ;
      T00P522_A129BarCod = new int[1] ;
      T00P522_A132BarCodReo = new byte[1] ;
      T00P522_A130BarCodPar = new String[] {""} ;
      T00P522_A2804RecLinMaq = new short[1] ;
      T00P522_A5257RecLinObs = new short[1] ;
      T00P522_A5258RecTxtObs = new String[] {""} ;
      T00P522_n5258RecTxtObs = new boolean[] {false} ;
      T00P522_A396EmprCod = new String[] {""} ;
      T00P523_A396EmprCod = new String[] {""} ;
      T00P523_A129BarCod = new int[1] ;
      T00P523_A132BarCodReo = new byte[1] ;
      T00P523_A130BarCodPar = new String[] {""} ;
      T00P523_A2804RecLinMaq = new short[1] ;
      T00P523_A5257RecLinObs = new short[1] ;
      T00P53_A129BarCod = new int[1] ;
      T00P53_A132BarCodReo = new byte[1] ;
      T00P53_A130BarCodPar = new String[] {""} ;
      T00P53_A2804RecLinMaq = new short[1] ;
      T00P53_A5257RecLinObs = new short[1] ;
      T00P53_A5258RecTxtObs = new String[] {""} ;
      T00P53_n5258RecTxtObs = new boolean[] {false} ;
      T00P53_A396EmprCod = new String[] {""} ;
      T00P52_A129BarCod = new int[1] ;
      T00P52_A132BarCodReo = new byte[1] ;
      T00P52_A130BarCodPar = new String[] {""} ;
      T00P52_A2804RecLinMaq = new short[1] ;
      T00P52_A5257RecLinObs = new short[1] ;
      T00P52_A5258RecTxtObs = new String[] {""} ;
      T00P52_n5258RecTxtObs = new boolean[] {false} ;
      T00P52_A396EmprCod = new String[] {""} ;
      T00P527_A396EmprCod = new String[] {""} ;
      T00P527_A129BarCod = new int[1] ;
      T00P527_A132BarCodReo = new byte[1] ;
      T00P527_A130BarCodPar = new String[] {""} ;
      T00P527_A2804RecLinMaq = new short[1] ;
      T00P527_A5257RecLinObs = new short[1] ;
      Gridtobsrec_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtobsrec_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtobsrec_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T00P528_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tobsrec__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tobsrec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tobsrec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tobsrec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tobsrec__default(),
         new Object[] {
             new Object[] {
            T00P52_A129BarCod, T00P52_A132BarCodReo, T00P52_A130BarCodPar, T00P52_A2804RecLinMaq, T00P52_A5257RecLinObs, T00P52_A5258RecTxtObs, T00P52_n5258RecTxtObs, T00P52_A396EmprCod
            }
            , new Object[] {
            T00P53_A129BarCod, T00P53_A132BarCodReo, T00P53_A130BarCodPar, T00P53_A2804RecLinMaq, T00P53_A5257RecLinObs, T00P53_A5258RecTxtObs, T00P53_n5258RecTxtObs, T00P53_A396EmprCod
            }
            , new Object[] {
            T00P54_A2804RecLinMaq, T00P54_A5256RecUltObs, T00P54_n5256RecUltObs, T00P54_A396EmprCod, T00P54_A129BarCod, T00P54_A132BarCodReo, T00P54_A130BarCodPar
            }
            , new Object[] {
            T00P55_A2804RecLinMaq, T00P55_A5256RecUltObs, T00P55_n5256RecUltObs, T00P55_A396EmprCod, T00P55_A129BarCod, T00P55_A132BarCodReo, T00P55_A130BarCodPar
            }
            , new Object[] {
            T00P56_A407EmprNom, T00P56_n407EmprNom
            }
            , new Object[] {
            T00P57_A396EmprCod
            }
            , new Object[] {
            T00P58_A2804RecLinMaq, T00P58_A5256RecUltObs, T00P58_n5256RecUltObs, T00P58_A407EmprNom, T00P58_n407EmprNom, T00P58_A396EmprCod, T00P58_A129BarCod, T00P58_A132BarCodReo, T00P58_A130BarCodPar
            }
            , new Object[] {
            T00P59_A407EmprNom, T00P59_n407EmprNom
            }
            , new Object[] {
            T00P510_A396EmprCod
            }
            , new Object[] {
            T00P511_A396EmprCod, T00P511_A129BarCod, T00P511_A132BarCodReo, T00P511_A130BarCodPar, T00P511_A2804RecLinMaq
            }
            , new Object[] {
            T00P512_A396EmprCod, T00P512_A129BarCod, T00P512_A132BarCodReo, T00P512_A130BarCodPar, T00P512_A2804RecLinMaq
            }
            , new Object[] {
            T00P513_A396EmprCod, T00P513_A129BarCod, T00P513_A132BarCodReo, T00P513_A130BarCodPar, T00P513_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00P517_A407EmprNom, T00P517_n407EmprNom
            }
            , new Object[] {
            T00P518_A396EmprCod, T00P518_A129BarCod, T00P518_A132BarCodReo, T00P518_A130BarCodPar, T00P518_A2804RecLinMaq, T00P518_A5408RecLinCol
            }
            , new Object[] {
            T00P519_A396EmprCod, T00P519_A129BarCod, T00P519_A132BarCodReo, T00P519_A130BarCodPar, T00P519_A2804RecLinMaq, T00P519_A4274RecBarCAg, T00P519_A4275RecBarRAg, T00P519_A4276RecBarPAg, T00P519_A4698RecBarNPd, T00P519_A4699RecBarOrd
            }
            , new Object[] {
            T00P520_A396EmprCod, T00P520_A129BarCod, T00P520_A132BarCodReo, T00P520_A130BarCodPar, T00P520_A2804RecLinMaq, T00P520_A1273RecLinPro
            }
            , new Object[] {
            T00P521_A396EmprCod, T00P521_A129BarCod, T00P521_A132BarCodReo, T00P521_A130BarCodPar, T00P521_A2804RecLinMaq
            }
            , new Object[] {
            T00P522_A129BarCod, T00P522_A132BarCodReo, T00P522_A130BarCodPar, T00P522_A2804RecLinMaq, T00P522_A5257RecLinObs, T00P522_A5258RecTxtObs, T00P522_n5258RecTxtObs, T00P522_A396EmprCod
            }
            , new Object[] {
            T00P523_A396EmprCod, T00P523_A129BarCod, T00P523_A132BarCodReo, T00P523_A130BarCodPar, T00P523_A2804RecLinMaq, T00P523_A5257RecLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00P527_A396EmprCod, T00P527_A129BarCod, T00P527_A132BarCodReo, T00P527_A130BarCodPar, T00P527_A2804RecLinMaq, T00P527_A5257RecLinObs
            }
            , new Object[] {
            T00P528_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtobsrec_level1item_Backcolorstyle ;
   private byte subGridtobsrec_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtobsrec_level1item_Allowselection ;
   private byte subGridtobsrec_level1item_Allowhovering ;
   private byte subGridtobsrec_level1item_Allowcollapsing ;
   private byte subGridtobsrec_level1item_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z2804RecLinMaq ;
   private short Z5256RecUltObs ;
   private short Z5257RecLinObs ;
   private short nRcdDeleted_769 ;
   private short nRcdExists_769 ;
   private short nIsMod_769 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2804RecLinMaq ;
   private short A5256RecUltObs ;
   private short nBlankRcdCount769 ;
   private short RcdFound769 ;
   private short nBlankRcdUsr769 ;
   private short A5257RecLinObs ;
   private short RcdFound408 ;
   private short nIsDirty_408 ;
   private short nIsDirty_769 ;
   private short ZZ2804RecLinMaq ;
   private short ZZ5256RecUltObs ;
   private int Z129BarCod ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtRecLinMaq_Enabled ;
   private int edtRecUltObs_Enabled ;
   private int edtEmprNom_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtRecLinObs_Enabled ;
   private int edtRecTxtObs_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtobsrec_level1item_Backcolor ;
   private int subGridtobsrec_level1item_Allbackcolor ;
   private int defedtRecLinObs_Enabled ;
   private int idxLst ;
   private int subGridtobsrec_level1item_Selectedindex ;
   private int subGridtobsrec_level1item_Selectioncolor ;
   private int subGridtobsrec_level1item_Hoveringcolor ;
   private int ZZ129BarCod ;
   private long GRIDTOBSREC_LEVEL1ITEM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z5258RecTxtObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_73_idx="0001" ;
   private String Gx_mode ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecUltObs_Internalname ;
   private String edtRecUltObs_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode769 ;
   private String edtRecLinObs_Internalname ;
   private String edtRecTxtObs_Internalname ;
   private String sStyleString ;
   private String subGridtobsrec_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A5258RecTxtObs ;
   private String Z407EmprNom ;
   private String sMode408 ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridtobsrec_level1item_Class ;
   private String subGridtobsrec_level1item_Linesclass ;
   private String ROClassString ;
   private String edtRecLinObs_Jsonclick ;
   private String edtRecTxtObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtobsrec_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n5256RecUltObs ;
   private boolean n407EmprNom ;
   private boolean n5258RecTxtObs ;
   private com.genexus.webpanels.GXWebGrid Gridtobsrec_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtobsrec_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtobsrec_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private short[] T00P58_A2804RecLinMaq ;
   private short[] T00P58_A5256RecUltObs ;
   private boolean[] T00P58_n5256RecUltObs ;
   private String[] T00P58_A407EmprNom ;
   private boolean[] T00P58_n407EmprNom ;
   private String[] T00P58_A396EmprCod ;
   private int[] T00P58_A129BarCod ;
   private byte[] T00P58_A132BarCodReo ;
   private String[] T00P58_A130BarCodPar ;
   private String[] T00P56_A407EmprNom ;
   private boolean[] T00P56_n407EmprNom ;
   private String[] T00P57_A396EmprCod ;
   private String[] T00P59_A407EmprNom ;
   private boolean[] T00P59_n407EmprNom ;
   private String[] T00P510_A396EmprCod ;
   private String[] T00P511_A396EmprCod ;
   private int[] T00P511_A129BarCod ;
   private byte[] T00P511_A132BarCodReo ;
   private String[] T00P511_A130BarCodPar ;
   private short[] T00P511_A2804RecLinMaq ;
   private short[] T00P55_A2804RecLinMaq ;
   private short[] T00P55_A5256RecUltObs ;
   private boolean[] T00P55_n5256RecUltObs ;
   private String[] T00P55_A396EmprCod ;
   private int[] T00P55_A129BarCod ;
   private byte[] T00P55_A132BarCodReo ;
   private String[] T00P55_A130BarCodPar ;
   private String[] T00P512_A396EmprCod ;
   private int[] T00P512_A129BarCod ;
   private byte[] T00P512_A132BarCodReo ;
   private String[] T00P512_A130BarCodPar ;
   private short[] T00P512_A2804RecLinMaq ;
   private String[] T00P513_A396EmprCod ;
   private int[] T00P513_A129BarCod ;
   private byte[] T00P513_A132BarCodReo ;
   private String[] T00P513_A130BarCodPar ;
   private short[] T00P513_A2804RecLinMaq ;
   private short[] T00P54_A2804RecLinMaq ;
   private short[] T00P54_A5256RecUltObs ;
   private boolean[] T00P54_n5256RecUltObs ;
   private String[] T00P54_A396EmprCod ;
   private int[] T00P54_A129BarCod ;
   private byte[] T00P54_A132BarCodReo ;
   private String[] T00P54_A130BarCodPar ;
   private String[] T00P517_A407EmprNom ;
   private boolean[] T00P517_n407EmprNom ;
   private String[] T00P518_A396EmprCod ;
   private int[] T00P518_A129BarCod ;
   private byte[] T00P518_A132BarCodReo ;
   private String[] T00P518_A130BarCodPar ;
   private short[] T00P518_A2804RecLinMaq ;
   private short[] T00P518_A5408RecLinCol ;
   private String[] T00P519_A396EmprCod ;
   private int[] T00P519_A129BarCod ;
   private byte[] T00P519_A132BarCodReo ;
   private String[] T00P519_A130BarCodPar ;
   private short[] T00P519_A2804RecLinMaq ;
   private int[] T00P519_A4274RecBarCAg ;
   private byte[] T00P519_A4275RecBarRAg ;
   private String[] T00P519_A4276RecBarPAg ;
   private int[] T00P519_A4698RecBarNPd ;
   private short[] T00P519_A4699RecBarOrd ;
   private String[] T00P520_A396EmprCod ;
   private int[] T00P520_A129BarCod ;
   private byte[] T00P520_A132BarCodReo ;
   private String[] T00P520_A130BarCodPar ;
   private short[] T00P520_A2804RecLinMaq ;
   private byte[] T00P520_A1273RecLinPro ;
   private String[] T00P521_A396EmprCod ;
   private int[] T00P521_A129BarCod ;
   private byte[] T00P521_A132BarCodReo ;
   private String[] T00P521_A130BarCodPar ;
   private short[] T00P521_A2804RecLinMaq ;
   private int[] T00P522_A129BarCod ;
   private byte[] T00P522_A132BarCodReo ;
   private String[] T00P522_A130BarCodPar ;
   private short[] T00P522_A2804RecLinMaq ;
   private short[] T00P522_A5257RecLinObs ;
   private String[] T00P522_A5258RecTxtObs ;
   private boolean[] T00P522_n5258RecTxtObs ;
   private String[] T00P522_A396EmprCod ;
   private String[] T00P523_A396EmprCod ;
   private int[] T00P523_A129BarCod ;
   private byte[] T00P523_A132BarCodReo ;
   private String[] T00P523_A130BarCodPar ;
   private short[] T00P523_A2804RecLinMaq ;
   private short[] T00P523_A5257RecLinObs ;
   private int[] T00P53_A129BarCod ;
   private byte[] T00P53_A132BarCodReo ;
   private String[] T00P53_A130BarCodPar ;
   private short[] T00P53_A2804RecLinMaq ;
   private short[] T00P53_A5257RecLinObs ;
   private String[] T00P53_A5258RecTxtObs ;
   private boolean[] T00P53_n5258RecTxtObs ;
   private String[] T00P53_A396EmprCod ;
   private int[] T00P52_A129BarCod ;
   private byte[] T00P52_A132BarCodReo ;
   private String[] T00P52_A130BarCodPar ;
   private short[] T00P52_A2804RecLinMaq ;
   private short[] T00P52_A5257RecLinObs ;
   private String[] T00P52_A5258RecTxtObs ;
   private boolean[] T00P52_n5258RecTxtObs ;
   private String[] T00P52_A396EmprCod ;
   private String[] T00P527_A396EmprCod ;
   private int[] T00P527_A129BarCod ;
   private byte[] T00P527_A132BarCodReo ;
   private String[] T00P527_A130BarCodPar ;
   private short[] T00P527_A2804RecLinMaq ;
   private short[] T00P527_A5257RecLinObs ;
   private String[] T00P528_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tobsrec__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsrec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsrec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsrec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00P52", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs, RecTxtObs, EmprCod FROM TXPOBSREC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinObs = ?  FOR UPDATE OF RecTxtObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P53", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs, RecTxtObs, EmprCod FROM TXPOBSREC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinObs = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P54", "SELECT RecLinMaq, RecUltObs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?  FOR UPDATE OF RecUltObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P55", "SELECT RecLinMaq, RecUltObs, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P56", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P57", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P58", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecLinMaq, TM1.RecUltObs, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPRECMAQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P59", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P510", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P511", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00P513", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00P514", "INSERT INTO TXPRECMAQ(RecLinMaq, RecUltObs, EmprCod, BarCod, BarCodReo, BarCodPar, MaqCod, RecVolPrd, RecFA, UltLinPro, RecMaqFas, RecTotKgs, RecTotMts, RecTotPrd, RecBarCod, RecBarReo, RecBarPar, RecOrdLin, RecAgrEst, RecRecLan, RecUsrCod, RecFecPes, RecMaqPes, RecNroPar, RecEnvio, RecRecep, RecFecAlt, RecFecMod, RecUsrMod, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecUltLCo, RecIntCol, RecMatCol, RecFecPla, RecPriPla, RecAcab, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecPriAca, RecLtsSR, RecLtsDf, RecAbs2, RecHdrLts, RecObsq, Recgrm, RecAnc, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, RecAva, RecAs, RecAi, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPRECMAQ")
         ,new UpdateCursor("T00P515", "UPDATE TXPRECMAQ SET RecUltObs=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK, "TXPRECMAQ")
         ,new UpdateCursor("T00P516", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK, "TXPRECMAQ")
         ,new ForEachCursor("T00P517", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P518", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00P519", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecBarCAg, RecBarRAg, RecBarPAg, RecBarNPd, RecBarOrd FROM TXPRECFAG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00P520", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00P521", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P522", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs, RecTxtObs, EmprCod FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinObs = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P523", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinObs = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00P524", "INSERT INTO TXPOBSREC(BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs, RecTxtObs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOBSREC")
         ,new UpdateCursor("T00P525", "UPDATE TXPOBSREC SET RecTxtObs=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinObs = ?", GX_NOMASK, "TXPOBSREC")
         ,new UpdateCursor("T00P526", "DELETE FROM TXPOBSREC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinObs = ?", GX_NOMASK, "TXPOBSREC")
         ,new ForEachCursor("T00P527", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00P528", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 26 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 12 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 60);
               }
               stmt.setString(7, (String)parms[7], 3);
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

